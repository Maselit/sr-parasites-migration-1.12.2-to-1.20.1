# Análisis del subsistema MUNDO — Persistencia, Biomas, Worldgen, Spawn y Explosiones

**Mod:** Scape and Run: Parasites (Forge 1.12.2)
**Fuente analizada:** código descompilado con CFR 0.152 (solo lectura, no se ejecutó nada).
**Raíz de paquetes:**
`C:\Users\Kevin Aguilar\Documents\Proyecto predeterminado\srparasites\decompiled\mcp\com\dhanantry\scapeandrunparasites`
**Paquete base:** `com.dhanantry.scapeandrunparasites`

Todos los nombres de clase/método citados provienen del descompilado. Cuando un detalle no se pudo confirmar con certeza se indica explícitamente.

---

## 1. Persistencia

### 1.1 `world/SRPSaveData` — datos globales de evolución

- **Nombre de datos (`DATA_NAME`):** `"srparasites_global_data"`.
- **Almacenamiento:** `world.getMapStorage()` (MapStorage **global**, compartido por todas las dimensiones del servidor). Es un `WorldSavedData` clásico.
- **Propósito:** guardar el estado global de la evolución parasitaria: fase actual, puntos acumulados, cooldown, ganancia/pérdida de evolución, dimensión asociada, bloqueos (locks) de fases y contadores de asimilación.

**Claves NBT principales (una sola vez):**

| Clave | Significado |
|---|---|
| `srpparasitepoints` | Puntos totales de evolución globales |
| `srpparasitetimeevoworld` | Tiempo/cooldown de evolución del mundo |
| `srpparasiteevolution` | Fase de evolución actual |
| `srpevolutiongaining` | Flag/estado de ganancia de evolución |
| `srpevolutionloss` | Flag/estado de pérdida de evolución |
| `srpevolutiondimid` | Dimensión asociada a la evolución |
| `srplockedparasites` | Fases bloqueadas |
| `srpassimilatedtotal` | Total asimilados |
| `srpassimilatedtotaltimes` | Veces totales de asimilación |

**Claves NBT por índice (arrays, una por entrada `i`):**
`kills"+i`, `time"+i`, `ev"+i`, `gain"+i`, `loss"+i`, `dimid"+i`, `parasiteid"+i`.

**Fases:** rango `-2 / -1 / 0..10` (valores negativos usados como estados especiales de evolución).

**Métodos relevantes:**
- `setTotalKills(...)`, `setEvolutionPhase(...)`, `checkKills(...)`
- `getDelay(...)`, `setCooldown(...)`, `getCooldown(...)`
- `checkForUnlock(...)`
- `getNumberIDDataSpawn(...)`, `addNumberIDDataSpawn(...)`

### 1.2 `world/SRPWorldData` — datos por mundo (nodos y colonias)

- **Nombre de datos (`DATA_NAME`):** `"srparasites_data"`.
- **Almacenamiento:** `world.getPerWorldStorage()` (MapStorage **por mundo/dimensión**, a diferencia de `SRPSaveData`).
- **Propósito:** guardar coordenadas y edades de los "nodos" (`BiomeHeart`) y "colonias" (`ColonyHeart`), más la resistencia de las colonias.

**Claves NBT:**

| Clave | Significado |
|---|---|
| `srpcurrentbeckons` | Contador actual de "beckons"/nodos-colonias activos |
| `srpnodescoordsx/y/z` | Coordenadas X/Y/Z de nodos |
| `srpnodesages` | Edades de nodos |
| `srpcoloniescoordsx/y/z` | Coordenadas X/Y/Z de colonias |
| `srpcoloniesages` | Edades de colonias |
| `srpcolonyresistancei` | Resistencia (índice) de colonia |
| `srpcolonyresistances` | Resistencias de colonias |

**Comportamiento:**
- Las edades de nodos/colonias se incrementan en `checkHeartExistance(...)` y `checkColonyExistance(...)`.
- Los bloques corazón son `SRPBlocks.BiomeHeart` (nodos) y `SRPBlocks.ColonyHeart` (colonias).

### 1.3 Sincronización con el cliente (bioma)

- `network/SRPPacketBiomeChange`: paquete `(BlockPos pos, boolean convert)` que sincroniza el byte de bioma en el cliente.
  - Handler: llama a `SRPMain.proxy.spreadBiome(pos, convert)`.
- Emisión: `ParasiteEventWorld.SpreadBiome(...)` y `ParasiteEventWorld.killBiome(...)` envían el paquete con `SRPMain.network.sendToDimension(...)`.
- Registro del paquete en `util/handlers/SRPPacketHandler`.
- Evolución por comando: `network/SRPCommandEvolution.getNeededPoints(...)`.

---

## 2. Biomas

Clases en `world/biome/`: `BiomeParasite`, `BiomeInfestedPlain`, `BiomeParasiteDecorator`.

- **Registro:** `init/SRPBiomes` define `SRPBiomes.biomeInfested = new BiomeInfestedPlain()`.
  - Nombre de registro: `srparasites:biome_parasite`.
  - Tipo BiomeDictionary: `BiomeDictionary.Type.SPOOKY`.
  - `BiomeManager.BiomeType.COOL`.
  - Peso: `SRPConfigWorld.biomeweight` (registro condicionado por `biomeRegster`).
- **Colores:** provenientes de `SRPConfigWorld.biomeSkyColor`, `biomeGrassColor`, `biomeFoliageColor`, `biomeWaterColor`.
- **`BiomeParasite`:** clase base con el comportamiento de bioma parasitario (mobs, decoración y propagación).
- **`BiomeInfestedPlain`:** bioma concreto "infested plain".
- **`BiomeParasiteDecorator`:** decorador encargado de la decoración del bioma (colocación de rasgos durante la generación).

**Propagación / conversión de bioma:** gestionada fuera del bioma, en `util/ParasiteEventWorld`:
- `positionToParasiteBiome(...)` / `positionToBiome(...)`: escriben directamente el `biomeArray` del chunk.
- `SpreadBiome(...)`: propaga el bioma parasitario y notifica al cliente.
- `killBiome(...)`: revierte el bioma.
- La sincronización al cliente va por `SRPPacketBiomeChange`.

**Lista de mobs del bioma:** la lista de entidades spawneables se registra en `init/SRPSpawning` (ver sección 4), no dentro de la clase de bioma.

---

## 3. Worldgen

### 3.1 Registro global

- `util/handlers/SRPRegistryHandlers`: `GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0)`.
  - Es decir, se registra un `IWorldGenerator` (API 1.12.2) con peso `0`.

### 3.2 `world/gen/WorldGenCustomStructures`

- `generate(...)` (método de `IWorldGenerator`): **vacío** en la práctica (no coloca estructuras directamente).
- `calculateHeight(world, x, z, topBlock)`: calcula la altura válida de terreno para una posición.
- `generateInPosition(WorldGenStructure generator, Random random, World world, BlockPos pos, int offset)`: **ruta real de colocación** de estructuras. Es invocado por las features.
- Existe un `generateStructure(...)` privado (efectivamente no usado en el flujo normal; un flag `debug=true` forzaría su ejecución).

### 3.3 `world/gen/structure/WorldGenStructure`

- Envuelve la carga/colocación de una plantilla `.nbt` por nombre y un offset vertical.
- Instanciado como `new WorldGenStructure("ball")` y `new WorldGenStructure("ballbig")`.

### 3.4 `world/gen/feature/*`

Features que colocan estructuras/rasgos parasitarios:

| Feature | Uso de estructura |
|---|---|
| `WorldGenParasiteBall` | `WorldGenCustomStructures.generateInPosition(new WorldGenStructure("ball"), new Random(), world, pos, 3)` |
| `WorldGenParasiteBigBall` | `WorldGenCustomStructures.generateInPosition(new WorldGenStructure("ballbig"), new Random(), world, pos, 6)` |

Otras features de generación parasitarias (raíces, troncos, techo, infestación) se invocan desde `ParasiteEventWorld` mediante `spawnGenFeatureParasite`, `spawnGenRoofParasite`, `spawnGenFeatureInfested`, `spawnGenRoofInfested`.

### 3.5 Assets `.nbt`

Existen **3** archivos de plantilla en
`srparasites\extracted\assets\srparasites\structures\`:

- `ball.nbt`
- `ballbig.nbt`
- `box.nbt`

**Nota de verificación:** `ball.nbt` y `ballbig.nbt` están referenciados explícitamente por las features (`WorldGenParasiteBall`, `WorldGenParasiteBigBall`). Para `box.nbt` **no se encontró referencia** en `world/gen`; se declara su existencia pero **no se afirma** que esté cableado a una feature (posible asset huérfano o usado por otro subsistema).

---

## 4. Spawn

### 4.1 `init/SRPSpawning`

- Define listas de spawn por fase: `PHASEZERO` … `PHASETEN` (fases 0 a 10).
- `addSpawn(...)`: añade entradas a `MONSTER` (tipo `0`) o `CREATURE` (tipo `1`).
- `getSpawns(byte phase)`: devuelve la lista correspondiente a la fase.
- `initBiome()`: lee `SRPConfigWorld.biomeSpawnEntry` para poblar la lista de spawns del bioma.

### 4.2 Handler `LivingSpawnEvent.CheckSpawn`

- Implementado en `DimensionHandler.onSpawn` (registrado por `SRPEventHandlerBus`).
- Aplica:
  - **Mob cap:** `SRPConfig.worldMobCap`, `SRPConfig.worldMobCapPlusPlayer`; cap específico para `EntityAta` vía `SRPConfig.worldGnatCap`.
  - **Bloqueos de evolución:** respeta fases bloqueadas de `SRPSaveData`.
  - **Bloqueos de colonia:** no spawnear en colonias bloqueadas.
  - **`canSpawninPhase(...)`:** valida que la entidad pueda aparecer en la fase actual.

### 4.3 `world/SRPWorldEntitySpawner` — spawner personalizado

- Método principal: `findChunksForSpawning(WorldServer server, boolean spawnHostile, boolean spawnPeaceful, boolean forced)`.
- **Cableado exacto (confirmado en `SRPEventHandlerBus`):**
  - `@SubscribeEvent public void worldTick(TickEvent.WorldTickEvent event)` (línea 1300).
    - Solo actúa en servidor (`!event.world.isRemote`) y si `SRPConfigSystems.useEvolution && SRPConfigSystems.phaseCustomSpawner`.
    - Llama a `tickSpawn(...)`.
  - `private void tickSpawn(WorldServer server)` (línea 1312):
    - Si `doMobSpawning` y el tipo de terreno **no** es `DEBUG_ALL_BLOCK_STATES`:
      - `SRPWorldEntitySpawner.findChunksForSpawning(server, true, false, server.getWorldInfo().getWorldTotalTime() % 400L == 0L)`
    - El último argumento (`forced`) se activa cada **400 ticks** (cada ~20 s).

### 4.4 Tick global de nodos/colonias (`serverTick`)

`@SubscribeEvent public void serverTick(TickEvent.ServerTickEvent event)` (línea 729) acumula `counerW`; cuando supera `SRPConfig.dayTickValue` y está activo cualquiera de `SRPConfigWorld.nodesActivated` / `coloniesActivated` / `SRPConfigSystems.useEvolution`:

- Si `SRPConfigWorld.coloniesActivated`: recorre las dimensiones configuradas y, para cada `WorldServer` no nulo, llama a `ParasiteEventWorld.checkColonyStatus(worldX)` (línea 754).
- Si `SRPConfigWorld.nodesActivated`: ídem con `ParasiteEventWorld.checkNodeStatus(worldX)` (línea 761).
- Las dimensiones se obtienen vía `DimensionManager.getWorld(i)` sobre las listas de configuración de nodos/colonias.

---

## 5. Explosiones

Clases en `world/`: `SRPExplosion` y `SRPExplotion`.

- Ambas extienden `net.minecraft.world.Explosion`.
- **`SRPExplotion`** está marcada **`@Deprecated`** (variante antigua; conserva la ortografía original).
- Capturan un inventario/"inventario de bloques" afectados por la explosión (lista de bloques destruidos para su posterior procesamiento).
- **`ParasiteEventEntity.createExplosion(...)`** usa `SRPExplosion` (la variante vigente). `createExplotion(...)` (deprecada) es el camino heredado.

---

## 6. `ParasiteEventWorld` y `ParasiteEventEntity` — flujos principales

### 6.1 `util/ParasiteEventWorld` (≈756 líneas)

Responsable de la lógica a nivel de mundo:

- **Bioma:**
  - `SpreadBiome(...)`, `killBiome(...)`
  - `positionToParasiteBiome(...)`, `positionToBiome(...)` (escriben `biomeArray` del chunk)
- **Nodos:**
  - `placeHeartInWorld(...)` (coloca `BiomeHeart`)
  - `checkNodeStatus(World)` (invocado por `serverTick`)
- **Colonias:**
  - `placeColonyInWorld(...)` (coloca `ColonyHeart`)
  - `checkColonyStatus(World)` (invocado por `serverTick`)
- **Infestación de bloques:**
  - `canInfestBlock(...)`
  - `spreadBiomeBlockStain(...)`, `spreadBiomeBlockTrunk(...)`
- **Generación parasitarias:**
  - `spawnGenFeatureParasite(...)`, `spawnGenRoofParasite(...)`
  - `spawnGenFeatureInfested(...)`, `spawnGenRoofInfested(...)`
- Contadores globales: `blockInfestedCount`, `blockParasiteCount` (con cooldowns `BlockInfestedLimitCD`, `BlockParasiteLimitCD`, `BlockParasiteLimit` en `SRPConfig`, gestionados desde `SRPEventHandlerBus`).

### 6.2 `util/ParasiteEventEntity` (≈1659 líneas)

Responsable de la lógica a nivel de entidad:

- **Infección/conversión:** `convertEntity(...)`, `convertEntityFeral(...)`
- **Infiltración:** `spawnInsider(...)`, `hijackEntity(...)`
- **Fusión:** `merge(...)`
- **Terreno/estructuras:** `getFloor(...)`, `getFloorBuilding(...)`, `spawnTurrets(...)`
- **Colonias:** `checkColony(...)`
- **Explosiones:** `createExplosion(...)` (usa `SRPExplosion`)
- **Inmunidad COTH:** clave `"srpcothimmunity"`; potenciadores/estados `SRPPotions.COTH_E`, `SRPPotions.EPEL_E`, `SRPPotions.LINK_E`.

---

## 7. Migración a 1.20.1 — hallazgos

| Elemento (1.12.2) | Equivalente (1.20.1) | Notas |
|---|---|---|
| `WorldSavedData` (`SRPSaveData`, `SRPWorldData`) | `SavedData` + `SavedData.Factory` | Cambia la firma de `load`/`save`; guardado por `ServerLevel`/`Level`. |
| `MapStorage` (`getMapStorage`, `getPerWorldStorage`) | `ServerLevel.getDataStorage()` / `getChunkSource().getDataStorage()` | En 1.20.1 el almacén es por nivel; el "global" debe migrarse a `Overworld` o a un `SavedData` propio. |
| `IWorldGenerator` (`GameRegistry.registerWorldGenerator`) | `BiomeModifier` / `Feature` + `PlacedFeature` (datapack JSON) | `WorldGenCustomStructures` como `IWorldGenerator` ya no existe. |
| Colocación de `.nbt` (`WorldGenStructure`, plantillas) | `StructureTemplate` + `StructurePlacement`/`Structure` (o `Feature` con plantilla) | El registro de estructuras pasa a datapack. |
| `BiomeDictionary` (`Type.SPOOKY`) | **Tags de bioma** (`TagKey<Biome>`) + `BiomeModifier` | BiomeDictionary se elimina. |
| `BiomeManager.addBiome(BiomeType, weight)` | `BiomeModifier` / registro de bioma en datapack | El bioma se define por JSON + codecs. |
| `net.minecraft.world.Explosion` (constructor antiguo) | `Explosion` con `Explosion.BlockInteraction` y `Level.explode(...)` | Cambian constructor y API de destrucción; el inventario capturado debe rehacerse con `BlockGetter`/`Level`. |
| `DimensionManager.getWorld(i)` | `MinecraftServer.getLevel(ResourceKey<Level>)` | Dimensiones por `ResourceKey`; no por int. |
| `LivingSpawnEvent.CheckSpawn` | `FinalizeSpawnEvent` (Forge) / `MobSpawnEvent` | Cambia el evento de control de spawn; los mob caps personalizados deben reimplementarse. |
| `EntityRegistry`/spawn egg | `Registry` de `EntityType` + `SpawnPlacements` | Nuevo registro y validación de spawn. |
| `SRPPacketBiomeChange` con `sendToDimension` | `PacketDistributor.DIMENSION` | SimpleNetworking/SimpleChannel en 1.20.1. |
| `GameRegistry.registerWorldGenerator` | Eliminado | Sustituido por datapack worldgen. |

**Riesgos específicos detectados:**
1. `SRPSaveData` "global" dependía de `getMapStorage()` compartido; en 1.20.1 hay que anclar ese `SavedData` a un nivel concreto (p. ej. Overworld) y exponerlo al resto.
2. El spawner personalizado (`SRPWorldEntitySpawner.findChunksForSpawning`) replica internamente parte de `WorldEntitySpawner`; en 1.20.1 hay que reescribir la iteración de chunks/categorías de spawn.
3. La escritura directa del `biomeArray` del chunk (`positionToParasiteBiome`) ya no existe; debe usarse `Level.setBiome(...)`/`ChunkAccess` + `ChunkMap` y resincronización por paquete.
4. Los contadores globales estáticos (`blockInfestedCount`, etc.) y los `SRPConfig*` deben revisarse porque el modelo de tick/dimensión cambia.

---

## Resumen (5–10 líneas)

- La persistencia se reparte en dos `WorldSavedData`: `SRPSaveData` (global, vía `getMapStorage`, evolución/fases/puntos) y `SRPWorldData` (por mundo, vía `getPerWorldStorage`, nodos/colonias y sus edades).
- Los biomas (`BiomeInfestedPlain`, `BiomeParasite`, `BiomeParasiteDecorator`) se registran en `SRPBiomes` (`srparasites:biome_parasite`, `Type.SPOOKY`, tipo `COOL`) y su propagación real la hace `ParasiteEventWorld` escribiendo el `biomeArray` y sincronizando con `SRPPacketBiomeChange`.
- El worldgen usa un `IWorldGenerator` (`WorldGenCustomStructures`) con `generate()` vacío; la colocación efectiva ocurre en `generateInPosition(...)` llamado por las features (`ball`, `ballbig`). Existen 3 `.nbt` (`ball.nbt`, `ballbig.nbt`, `box.nbt`); `box.nbt` no tiene referencia confirmada en `world/gen`.
- El spawn combina listas por fase (`SRPSpawning.PHASEZERO..PHASETEN`), el handler `CheckSpawn` con mob caps (`worldMobCap`, `worldMobCapPlusPlayer`, `worldGnatCap`) y el spawner propio `SRPWorldEntitySpawner.findChunksForSpawning`, invocado desde `SRPEventHandlerBus.worldTick`→`tickSpawn` (forzado cada 400 ticks).
- Los ticks de nodos/colonias se ejecutan en `SRPEventHandlerBus.serverTick` (`checkColonyStatus`/`checkNodeStatus`) sobre las dimensiones configuradas.
- Las explosiones usan `SRPExplosion` (vigente) mientras `SRPExplotion` queda `@Deprecated`; `ParasiteEventEntity.createExplosion(...)` es el punto de entrada.
- La migración a 1.20.1 exige `SavedData`+`DataStorage`, features/BiomeModifiers en datapack, tags de bioma, `ResourceKey<Level>` en vez de `DimensionManager`, y reescritura del spawner y de la escritura de biomas.

**Archivo generado:** `C:\Users\Kevin Aguilar\Documents\Proyecto predeterminado\srparasites\reports\analysis_world.md`
