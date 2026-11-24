# QA_AUDIT — Migración Scape and Run: Parasites (1.12.2 → 1.20.1)

**Rol:** QA / revisión de código migrado por IAs anteriores.
**Fecha:** 2026-11-19.
**Alcance:** código en `workspace/src/main/java` migrado hasta la fecha (SRPMain, SRPBlocks, SRPConfig, SRPConfigSystems, SRPSaveData, BlockInfestedRemain, SRPNetwork, SRPBiomes, SRPFluids, SRPBiomeUtil, ParasiteEventWorld, SRPWorldData, SRPPacketBiomeChange) + configuración.

## 1. Veredicto global

- **Compila:** `gradlew clean compileJava` → BUILD SUCCESSFUL (solo 5 warnings de deprecación).
- **Estado:** migración parcial (Fase C en curso). Los archivos migrados son coherentes con la arquitectura DeferredRegister/ForgeConfigSpec, pero hay **bugs latentes** que romperían en runtime o ignorarían la configuración del usuario.
- **Acción QA:** se corrigieron los bugs que crashean al cargar config; se documentan el resto para que la IA que sigue migrando no los repita.

## 2. Bugs encontrados y corregidos (P0 — crashean al cargar config)

| # | Archivo | Problema | Corrección aplicada |
|---|---|---|---|
| 1 | `SRPConfig.java` (línea ~426) | `BLOCK_PARASITE_LIMIT` default `2000` con rango `[0,1024]` → default fuera de rango → `IllegalArgumentException` al construir SPEC. | max ampliado a `4096`. |
| 2 | `SRPConfig.java` (línea ~444) | `TENDRIL_HEALTH` default `0.4` con rango `[0.5,100.0]` → default fuera de rango → crash. | min bajado a `0.0`. |
| 3 | `SRPConfig.java` (líneas ~397-398) | Clave duplicada `"Global Damage Multiplier"` para `GLOBAL_DAMAGE_MULTIPLIER` y `GLOBAL_KD_RESISTANCE_MULTIPLIER` → dos entradas con el mismo path en la misma sección (conflicto/sobrescritura). | segunda renombrada a `"Global KD Resistance Multiplier"`. |

## 3. Bugs / deuda técnica encontrados (P1 — no crashean pero afectan comportamiento)

| # | Archivo | Problema | Recomendación |
|---|---|---|---|
| 4 | `SRPConfig.java` | `load()` NO sincroniza muchos campos estáticos: `blackListedDimensions`, `entitiesWillAttack`, `entitiesWillAvoid`, `mobattackingBlackList`, `parasiteGriefing`, `parasiteWeakTo*`, `adaptationDimStrong`, `parasiteGriefingBlackList`, `stackablePotionsLimit`, `cystItemBlackList`, `damageTypeBlackList*`, `armorDamageTypeBlackList*`, `damageCapBlackList*`. Los valores del TOML se ignoran y quedan los defaults hardcodeados. | Añadir las líneas `.get()` correspondientes en `load()`. |
| 5 | `SRPConfigSystems.java` | `SPEC` se construye vacío (`new ForgeConfigSpec.Builder().build()`) y no hay método `load()`. Todos los campos (rsResidueY, useEvolution, phaseResidue*, etc.) son constantes no configurables; el TOML no los expone. | Definir todas las entradas en SPEC y añadir `load()`; registrar SPEC en `SRPMain` (actualmente solo se registra `SRPConfig.SPEC`). |
| 6 | `SRPConfigSystems.java` | Importa `ForgeConfigSpec` pero no se usa para nada real (SPEC vacío). | Eliminar o completar. |
| 7 | `SRPMain.java` | Usa APIs marcadas para eliminación: `FMLJavaModLoadingContext.get()` y `ModLoadingContext.get()`. | Migrar a `FMLJavaModLoadingContext` instance inyectada o `ModLoadingContext.get()` vía `@Mod` constructor; seguir la guía de Forge 47.x. |
| 8 | `SRPMain.java` | `SRPBiomes.clearMobSpawnList()` con nombre engañoso (no queda claro qué hace). | Renombrar o documentar. |
| 9 | `BlockInfestedRemain.java` | Comparación de bioma por referencia: `level.getBiome(pos).value() == SRPBiomes.BIOME_INFESTED.get()`. Frágil: depende de que sea la misma instancia. | Comparar por `ResourceKey`/registry name. |
| 10 | `SRPSaveData.java` | Campo estático `instance` compartido entre niveles/mundos → no es thread-safe y puede causar corrupción de datos en servidores con varios niveles. | Usar `SavedData` por nivel sin singleton estático, o sincronizar. |
| 11 | `SRPSaveData.get()` | Si `computeIfAbsent` devuelve null, crea un `new SRPSaveData()` y luego lo reemplaza con `createData(...)` sin guardar el primero → fuga de instancia. | Revisar flujo de inicialización. |
| 12 | `SRPBlocks.java` | `optionalDirt()`/`optionalRub()` hacen `ForgeRegistries.BLOCKS.getValue(new ResourceLocation(...))` con el constructor deprecated `ResourceLocation(String)`. | Usar `ResourceLocation.parse(...)` o `ResourceLocation.fromNamespaceAndPath`. |
| 13 | `SRPBlocks.java` | `ParasiteVine` se registra con el nombre `"parasitetendril"` y `buglin` con `"tunnel"` → nombres de registro no coinciden con el id lógico. Puede romper assets (blockstates/modelos/lang) que esperan `parasitevine`/`buglin`. | Verificar contra `extracted/assets` y `mcmod.info`; alinear nombres. |
| 14 | `SRPBlocks.java` | `ParasiteRubbleBoneStair` llama a `BlockParasiteRubble.VARIANT`/`EnumType.BONE` en el constructor del `RegistryObject` (lambda diferido) → puede disparar inicialización temprana. | Verificar que no cause `Cannot register new entries...`. (Compila, pero revisar en runtime.) |
| 15 | `BlockInfestedRemain.residue()` | Lógica de spawn de entidades está comentada con TODO (EntityVenkrol/PStationaryArchitect, sonidos). Funcionalidad pendiente. | No es bug, pero debe completarse en Fase C. |

## 4. Warnings de compilación (no bloquean)

- 5 warnings de deprecación (ResourceLocation(String), ResourceLocation(String,String), FMLJavaModLoadingContext.get(), ModLoadingContext.get()). Ver items 7 y 12.
- `BlockInfestedRemain` importa `SRPConfigSystems` y usa campos que no son configurables (item 5).

## 5. Reglas para la IA que sigue migrando (anti-regresión)

1. **Siempre validar `defineInRange`**: el default DEBE estar dentro de `[min, max]`. Comprobar con script antes de compilar.
2. **No duplicar claves de config** en el mismo builder/push. Cada `define*` debe tener un nombre único dentro de su sección.
3. **Cablear `load()`**: cada campo estático expuesto en SPEC debe tener su línea `campo = SPEC.get()` en `load()`. Si SPEC está vacío, no registrar el mod config.
4. **No usar constructores deprecated de `ResourceLocation`**: usar `ResourceLocation.parse` / `fromNamespaceAndPath`.
5. **No comparar registros por referencia** (`==` sobre `.get()`); comparar por `ResourceKey` o id.
6. **No usar singletons estáticos para `SavedData`**; obtener por nivel.
7. **Verificar nombres de registro** contra `extracted/assets/srparasites` antes de finalizar un bloque/ítem.
8. **Registrar SPEC en `SRPMain`** por cada config migrada (SRPConfig y, cuando se complete, SRPConfigSystems/World/Mobs).
9. **Compilar con `clean compileJava`** tras cada lote y revisar warnings.
10. **No dejar TODOs de entidades/sonidos** sin ticket en `MIGRATION_INVENTORY.md`.

## 6. Acciones QA pendientes (no bloquean el push)

- Ejecutar `runServer` headless para confirmar que el mod carga sin crash de config (pendiente de entorno con display para cliente).
- Revisar `SRPConfigMobs`, `SRPConfigWorld` (aún no migrados) cuando se toquen.
- Añadir tests mínimos (smoke test de carga del mod) si el MDK lo permite.

## 8. Cambios aplicados en este ciclo (continuación migración)

- Migrado `SRPSounds` (207 → 204 registrados; 3 `FLOG_*` no existían en el original ni en sounds.json, se omiten) a `DeferredRegister<SoundEvent>` con `RegistryObject`, manteniendo nombres de registro para no romper `sounds.json`.
- `SRPMain`: añadido `SRPSounds.init()` para forzar carga de la clase y registro.
- Build: `clean compileJava` → BUILD SUCCESSFUL (100 warnings de deprecación de `SoundEvent.createVariableRangeEvent`/`ResourceLocation`; no bloquean).

### Regla adicional (anti-regresión)
11. **Registrar DeferredRegister entries en una clase estática con campos `static final RegistryObject`** y forzar su carga (`init()` no-op) desde `SRPMain` antes del `RegisterEvent`. De lo contrario los entries no se registran.

- Corregidos items 1, 2, 3 en `SRPConfig.java`.
- Añadido `.gitattributes` (raíz del repo y en `workspace/`) para normalizar line endings (LF) y evitar las advertencias CRLF.
- Documentado este archivo `QA_AUDIT.md`.
EOF