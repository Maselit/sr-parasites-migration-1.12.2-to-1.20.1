# DEPENDENCIES — Scape and Run: Parasites

**Mod:** `srparasites` 1.9.21 · Minecraft 1.12.2 · Forge 14.23.x.
**Destino:** Minecraft 1.20.1 · Forge 47.x · Java 17.

---

## 1. Plataforma y toolchain (origen)

| Componente | Versión (origen) | Versión (destino) |
|---|---|---|
| Minecraft | 1.12.2 | 1.20.1 |
| Forge | 14.23.x (1.12.2) | 47.x |
| Java | 8 | 17 |
| Gradle/wrapper | (no especificado en el JAR) | por fijar (registrar en `BUILD_ENVIRONMENT.md`) |
| Mappings | SRG/MCP `stable_39` | oficiales / Parchment (por decidir) |

## 2. Dependencias declaradas en `mcmod.info`

El `mcmod.info` declara **`"dependencies": []`** (sin dependencias obligatorias). El mod es autocontenido.

## 3. Integraciones opcionales (detectadas en código)

| Mod | Detección | Comportamiento | Estado migración |
|---|---|---|---|
| `reachfix` | `ModCompatibility.preInit()` (`Loader.isModLoaded("reachfix")`) | parche de alcance de arma (`IHaveReach`) | Revisar equivalente en 1.20.1 (atributo de alcance) |
| `JustEnoughIDs` / `Roughly Enough IDs` | `ModCompatibility` (`Loader.isModLoaded("JustEnoughIDs")`) | **incompatible** con nodos/bioma (warning en postInit) | Revisar si sigue aplicando |

## 4. APIs de Minecraft/Forge usadas (1.12.2) que deben migrarse

Listado de paquetes/APIs críticas consumidas (no son dependencias externas, pero son el contrato con la plataforma):

- `net.minecraftforge.common.config.Configuration` (4 archivos `.cfg`) → `ForgeConfigSpec` (TOML).
- `net.minecraftforge.fml.common.*` (`@Mod`, `@SidedProxy`, `@Mod.EventHandler`, `FMLPre/Init/Post/ServerStartingEvent`, `Loader`) → nueva API de carga de mods.
- `net.minecraftforge.fml.common.registry.*` (`EntityEntry`, `EntityEntryBuilder`, `GameRegistry`) → `DeferredRegister`.
- `net.minecraftforge.common.BiomeDictionary` / `BiomeManager` → tags de bioma + datapack.
- `net.minecraftforge.common.ForgeRegistries` (SOUND_EVENTS) → `DeferredRegister`.
- `net.minecraftforge.fluids.FluidRegistry` + `enableUniversalBucket()` → `DeferredRegister<Fluid>` (sin universal bucket).
- `net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper` → `SimpleChannel`.
- `net.minecraftforge.common.capabilities` (solo `IItemHandler` del tile) → `ForgeCapabilities.ITEM_HANDLER`.
- `net.minecraft.world.gen.IWorldGenerator` / `GameRegistry.registerWorldGenerator` → `Feature`/`PlacedFeature`/`BiomeModifier`.
- `net.minecraft.world.WorldSavedData` / `MapStorage` → `SavedData`/`DataStorage`.

## 5. Recursos externos

- Sonidos: obtenidos de https://www.zapsplat.com (créditos en `mcmod.info`).
- Logo: `assets/srparasites/logo2.png`.
- Plantillas `.nbt`: `ball.nbt`, `ballbig.nbt`, `box.nbt` (assets del mod, no externos).

## 6. Assets y formatos a migrar

- `pack.mcmeta` `pack_format`: 3 → 15.
- `mcmod.info` → `mods.toml`.
- `sounds.json` (207 entradas) → mismo formato (ajustar rutas si cambian).
- Recetas JSON (20, formato 1.12.2) → formato 1.20.1.
- Loot tables (1) → formato 1.20.1.
- Blockstates/modelos (34/398) → JSON con `variants`/`multipart` modernos.
- Idiomas (27 `.lang`) → `.json`.

## 7. Dependencias de desarrollo (toolbelt local)

- CFR 0.152 (`C:\Users\Kevin Aguilar\cfr.jar`) — descompilación (no es dependencia del mod).
- MCP mappings `stable_39` — remapeo SRG→MCP (no es dependencia del mod).
- REA/MCP packs (pdf, filesystem, markitdown) — análisis (no es dependencia del mod).

## 8. Notas

- No hay dependencias obligatorias en `mcmod.info`. El mod es autocontenido; la migración no requiere portar dependencias de terceros, solo la plataforma (Forge 47.x + Java 17).
- `ModCompatibility` chequea 2 mods opcionales; revisar si existen equivalentes en 1.20.1 antes de portar esa lógica.
- El fluido `deadblood` usa `FluidRegistry.enableUniversalBucket()` (eliminado); en 1.20.1 no hay universal bucket por defecto → decidir si se registra un bucket propio.
