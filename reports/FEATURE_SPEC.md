# FEATURE_SPEC — Scape and Run: Parasites

**Fase A del manual:** *INVENTARIO SIN MODIFICAR* — equivalencia funcional por feature.
**Mod origen:** Minecraft 1.12.2 · Forge 14.23.x · `srparasites` 1.9.21.
**Destino:** Minecraft 1.20.1 · Forge 47.x · Java 17.
**Formato por feature:** trigger → validación → mutación → efectos → sincronización → persistencia (§13 del manual; Fase A).

Cada feature lleva un ID único (`FEA-<grupo>-<n>`) que aparece en el inventario (`MIGRATION_INVENTORY.md`). El estado de migración es **PENDIENTE** para todas.

Grupos: `EVO` evolución/hivemind/scents, `WORLD` mundo/nodos/colonias/infestación/RS/worldgen/spawn, `ENT` ciclo de vida de entidades, `ITEM` ítems/equipo/efectos/loot, `CLIENT` cliente/render/modelos/partículas, `NET` red/comandos/config, `PERSIST` persistencia.

---

## Grupo EVO — Evolución parasitaria, One Mind y scents (8 features)

### FEA-EVO-01 — Acumulación de puntos de evolución
- **Propósito observable:** avanzar la fase de evolución global del mundo según la actividad parasitaria.
- **Trigger:** muerte de entidades (`onKillEntity`/`onDeath`), COTH (valueCOTH=6), infestación de bloques (valueBlock=50), fusión (valueMerge=10), desove (valueEvolutionDespawn=100), pérdida de bloques (valueLossBlockStain/Trunk/Rubble=5).
- **Validación:** `SRPConfigSystems.useEvolution`; fase no bloqueada; `SRPSaveData` por dimensión.
- **Mutación:** incrementa `srpparasitepoints` y `kills"+i` en `SRPSaveData` (global, `getMapStorage`); recalcula fase con `checkKills`/`checkForUnlock`.
- **Efectos:** desbloquea fases → spawn entries, penalties, nodos/colonias, One Mind.
- **Sincronización:** no hay paquete específico; el cliente no lee la fase salvo por efectos visuales (fog/particles).
- **Persistencia:** `SRPSaveData` NBT (claves `srpparasitepoints`, `srpparasitetimeevoworld`, `srpparasiteevolution`, `srpevolutiongaining/loss`, `srpevolutiondimid`, `srplockedparasites`, `srpassimilatedtotal/times`, arrays `kills/time/ev/gain/loss/dimid/parasiteid`).
- **Evidencia:** `world/SRPSaveData.java`, `util/ParasiteEventEntity.java`, `util/ParasiteEventWorld.java`, `util/config/SRPConfigSystems.java` (EVOLUTION_CATEGORY, EVOLUTION_CATEGORY0..10).
- **Riesgos 1.20.1:** `getMapStorage()` global → anclar `SavedData` al Overworld; claves NBT → `CompoundTag`.

### FEA-EVO-02 — Fases de evolución 0..10 y umbrales
- **Propósito observable:** 11 fases (0..10) con puntos crecientes (400, 800, 1800, 20000, 200000, 5000000, 25000000, 500000000, 1000000000, 1800000000) que activan efectos.
- **Trigger:** `srpparasitepoints` cruza `phaseKillsN`.
- **Validación:** fase actual < N; `evolutionParasiteLock` no bloquea.
- **Mutación:** `srpparasiteevolution` = N; `srplockedparasites` se actualiza; `phaseMaxParasiteIDN`/`phaseCancelParasiteIDN` cambian la lista de spawns.
- **Efectos:** umbrales `evolutionNodeUnlock=7`, `evolutionColonyUnlock=5`, `evolutionSleepDenied=6`, `evolutionAssimilatedDehiding=5`, `evolutionMudoAttack=2`, `evolutionBeckonIgnoreCooldown=7`, `evolutionSpawningIgnoreSunlight=8`, `evolutionCothStopLoot=3`, `evolutionStopFishing=4`, `evolutionOneMind=5`, `evolutionTotalKill=8`, `evolutionFeralNoSim=6`, `evolutionNests=4`, `evolutionDislodgment=6`, `evolutionParasiteAlwaysVariant=8`, `evolutionHives=9`, `evolutionNoParasiteHealing=9`, `evolutionPArasitesWithoutXP=9`, `evolutionNoParasiteSpawnDenied=10`, `evolutionParasiteStatIncrease=10` (+0.07).
- **Sincronización:** `phaseWarningN` puede notificar; sin paquete dedicado.
- **Persistencia:** `SRPSaveData` (`srpparasiteevolution`, `srplockedparasites`).
- **Evidencia:** `util/config/SRPConfigSystems.java` (EVOLUTION_CATEGORY0..10, phaseKills0..10), `world/SRPSaveData.java`.
- **Riesgos 1.20.1:** los arrays de claves por índice (`kills"+i`) deben migrarse a `ListTag`; los byte de fase a `IntValue`.

### FEA-EVO-03 — Bloqueo de fases y dimensiones
- **Propósito observable:** limitar qué parásitos pueden aparecer en qué dimensión/fase.
- **Trigger:** `evolutionParasiteLock` (`"dim;fase;puntos|id"`), `evolutionDimStart` (`"dim;phase;puntos"`), `evolutionDimGain/Loss` (+inverted), `blackListedDimensionsEPP`.
- **Validación:** dimensión actual, fase actual, puntos.
- **Mutación:** `srplockedparasites` y `srpevolutiondimid`.
- **Efectos:** spawn entries filtradas por fase/dimensión.
- **Persistencia:** `SRPSaveData` (`srpevolutiondimid`, `srplockedparasites`).
- **Evidencia:** `util/config/SRPConfigSystems.java` (EVOLUTION_CATEGORY), `world/SRPSaveData.java`.
- **Riesgos 1.20.1:** `DimensionManager.getWorld(i)` → `MinecraftServer.getLevel(ResourceKey<Level>)`.

### FEA-EVO-04 — Ganancia/pérdida de evolución por dimensión
- **Propósito observable:** la evolución puede ganar o perder puntos según dimensión y tiempo.
- **Trigger:** `serverTick` (cada `dayTickValue` ticks) cuando `useEvolution`.
- **Validación:** `evolutionNoPlayerMultipler`, `evolutionDimGain/Loss`.
- **Mutación:** `srpevolutiongaining`/`srpevolutionloss`; `srpparasitetimeevoworld` (cooldown).
- **Efectos:** desbloqueo o retroceso de fase; `valueEvolutionDespawn`.
- **Sincronización:** ninguna directa.
- **Persistencia:** `SRPSaveData`.
- **Evidencia:** `util/handlers/SRPEventHandlerBus.java` (serverTick ~l.729), `world/SRPSaveData.java`.
- **Riesgos 1.20.1:** tick global por dimensión cambia; contadores estáticos revisar.

### FEA-EVO-05 — One Mind (conciencia colectiva)
- **Propósito observable:** coordinar parásitos cercanos para compartir percepción/objetivo cuando está activo.
- **Trigger:** `useOneMind=true`, `evolutionOneMind=5` (fase), `oneMindPlayer`.
- **Validación:** fase ≥ 5; rango `oneMinRangeCap=64`; `oneMindDebug`.
- **Mutación:** estado de "mente" por grupo; `deleteifnoCC` elimina CC huérfanas.
- **Efectos:** percepción compartida, targeting; debug visual si `oneMindDebug`.
- **Sincronización:** ninguna paquete dedicado (estado en entidades).
- **Persistencia:** no persiste entre reinicios (estado en memoria).
- **Evidencia:** `util/config/SRPConfigSystems.java` (HIVEMIND_CATEGORY, HIVEMIND_CATEGORY0..8), `util/handlers/SRPEventHandlerBus.java`.
- **Riesgos 1.20.1:** estado en memoria no persiste; re-evaluar con `SavedData` si se quiere.

### FEA-EVO-06 — Scents (rastros) y oleadas
- **Propósito observable:** los parásitos dejan rastros (EntityParasiticScent) que guían spawn/ataque; las oleadas se disparan por nivel de scent.
- **Trigger:** muerte de parásito (`scentDeathSpawning=0.07`), `useScent=true`, niveles 0..8 (`scentLevelZero..Eight`), puntos de nivel (`scentLevelPointsOne..Eight`).
- **Validación:** `scentCap=3`, `scentSpacing=40`, `scentPlayer`, `scentGoActive=5`, `minAttriHealth/Armor/Damage`.
- **Mutación:** crea `EntityParasiticScent` con nivel, peligro, vida (`scentLifeDeath=5`, `scentLifeObserver=60`, `scentLifeTactical=300`); `scentWaveMinimum/Maximum`, `scentWaveMinMobWave/MaxMobWave`.
- **Efectos:** oleadas de mobs (`scentSpawnWaves=12`), propagación (`scentMiniDis=7`, `scentMaxDis=40`), alerta a jugadores.
- **Sincronización:** `SRPPacketParticle`/`SRPPacketFog` (posible).
- **Persistencia:** scent no persiste (entidad efímera).
- **Evidencia:** `entity/EntityParasiticScent.java`, `util/config/SRPConfigSystems.java` (HIVEMIND_CATEGORY0..8).
- **Riesgos 1.20.1:** `Entity` plano → revisar `onUpdate`/NBT; partículas por `ParticleTypes`.

### FEA-EVO-07 — Desbloqueo de nodos y colonias por fase
- **Propósito observable:** nodos requieren fase ≥ `evolutionNodeUnlock=7`; colonias fase ≥ `evolutionColonyUnlock=5` (si `useEvolution`).
- **Trigger:** `placeHeartInWorld`/`placeColonyInWorld` (jugador/parásito).
- **Validación:** fase actual, `nodesActivated`/`coloniesActivated`, blacklist de dimensiones, distancia al spawn.
- **Mutación:** crea `BiomeHeart`/`ColonyHeart`; `SRPWorldData` registra coords/edad.
- **Efectos:** bioma parasitario se propaga; alerta a jugadores (`nodeWarning`/`colonyWarning`).
- **Persistencia:** `SRPWorldData` (coords/edades).
- **Evidencia:** `util/ParasiteEventWorld.java` (`placeHeartInWorld`, `placeColonyInWorld`), `world/SRPWorldData.java`.
- **Riesgos 1.20.1:** `DimensionManager` → `ResourceKey<Level>`.

### FEA-EVO-08 — Comando de evolución
- **Propósito observable:** ver/forzar fase y puntos.
- **Trigger:** `/srpevolution` (jugador con permisos).
- **Validación:** permisos, sintaxis (`SRPCommandEvolution.getNeededPoints`).
- **Mutación:** `SRPSaveData` (fase/puntos).
- **Efectos:** respuesta en chat.
- **Sincronización:** servidor→cliente (chat).
- **Persistencia:** `SRPSaveData`.
- **Evidencia:** `network/SRPCommandEvolution.java`, `proxy/CommonProxy.serverInit`.
- **Riesgos 1.20.1:** `ICommand` → `Command` (Brigadier).

---

## Grupo WORLD — Mundo, nodos, colonias, infestación, RS, worldgen, spawn (12 features)

### FEA-WORLD-01 — Propagación y conversión de bioma parasitario
- **Propósito observable:** convertir biomas normales en bioma parasitario alrededor de un nodo y revertir al morir el nodo.
- **Trigger:** `SpreadBiome` (al colocar nodo, edad), `killBiome` (al remover nodo).
- **Validación:** `nodesActivated && biomeRegster`; blacklist de biomas (`biomeBlackList`/`biomeBlackListInverted`); rango por edad (`getDistanceSpreadByAge`).
- **Mutación:** escribe `biomeArray` del chunk (`positionToParasiteBiome`/`positionToBiome`).
- **Efectos:** cambio visual (fog/colores), spawn parasitario.
- **Sincronización:** `SRPPacketBiomeChange` (`sendToDimension`).
- **Persistencia:** el bioma queda en el chunk (persiste en el mundo).
- **Evidencia:** `util/ParasiteEventWorld.java` (`SpreadBiome`, `killBiome`, `positionToParasiteBiome`, `positionToBiome`), `network/SRPPacketBiomeChange.java`.
- **Riesgos 1.20.1:** escritura directa de `biomeArray` ya no existe → `Level.setBiome`/`ChunkAccess`.

### FEA-WORLD-02 — Nodos (BiomeHeart) ciclo de vida
- **Propósito observable:** núcleo que propaga el bioma y otorga bonus por edad/nivel.
- **Trigger:** colocación por jugador/parásito; ticks de `serverTick` (`checkNodeStatus`).
- **Validación:** fase, blacklist de dimensiones, distancia al spawn, suelo válido (`getFloor`).
- **Mutación:** `SRPWorldData` registra coords/edad; edad incrementa en `checkHeartExistance`.
- **Efectos:** propagación de bioma, efectos por nivel (`nodeRangeEffectsOne/Two/Three`=400/1600/8000), crop stop (`nodeCropStopNodeOne/Two/Three`=0.3/0.6/1.0), rango de spread (`nodeRangeSpreadOne/Two/Three`=200/800/4000), tiempo de crecimiento (`timeNeedeToNodeOne/Two/Three`=8/10/40).
- **Sincronización:** `SRPPacketBiomeChange`.
- **Persistencia:** `SRPWorldData` (`srpnodescoordsx/y/z`, `srpnodesages`).
- **Evidencia:** `util/ParasiteEventWorld.java` (`placeHeartInWorld`, `checkNodeStatus`), `world/SRPWorldData.java`, `util/config/SRPConfigWorld.java` (WORLDBIOME_CATEGORY).
- **Riesgos 1.20.1:** `SavedData` por nivel; `BlockPos` coords en `ListTag`.

### FEA-WORLD-03 — Colonias (ColonyHeart) ciclo de vida
- **Propósito observable:** núcleo de colonia que otorga bonus a parásitos cercanos y puede expandirse.
- **Trigger:** colocación; `checkColonyStatus` en `serverTick`.
- **Validación:** `coloniesActivated`, blacklist, distancia entre colonias (`minimumDistanceBetweenColonies=2000`), `maximumNumberColonies=20`.
- **Mutación:** `SRPWorldData` registra coords/edad/resistencia; puntos (`colonyPointCap=100`, `colonyTotalPointCap=100`).
- **Efectos:** bonus a parásitos (vida/daño/armadura/KD-resistencia/damage cap/point reduction), radio base (`colonyBaseRadiusValue=60`, efecto `colonyBaseEffectRadiusValue=120`), outpost a 2000 bloques (`colonyOutpostDistance`).
- **Sincronización:** `SRPPacketBiomeChange` (posible).
- **Persistencia:** `SRPWorldData` (`srpcoloniescoordsx/y/z`, `srpcoloniesages`, `srpcolonyresistancei`, `srpcolonyresistances`).
- **Evidencia:** `util/ParasiteEventWorld.java` (`placeColonyInWorld`, `checkColonyStatus`, `rangeOfColony`, `spreadOfColony`), `world/SRPWorldData.java`, `util/config/SRPConfigWorld.java` (WORLDCOLONY_CATEGORY).
- **Riesgos 1.20.1:** igual que nodos.

### FEA-WORLD-04 — Infestación de bloques (stain/trunk/rubble)
- **Propósito observable:** propagar bloques parasitarios sobre el terreno, con contadores globales y cooldowns.
- **Trigger:** `spawnGenFeatureInfested`/`spawnGenRoofInfested`, `spreadBiomeBlockStain`/`spreadBiomeBlockTrunk`, venkrol (`canInfestBlock`).
- **Validación:** `blockInfestedCount` ≤ `BlockInfestedLimit=1000` (CD 300); `blockParasiteCount` ≤ `BlockParasiteLimit=2000` (CD 300); dificultad ≠ PEACEFUL.
- **Mutación:** coloca `ParasiteStain`/`ParasiteTrunk`/`ParasiteRubble`; incrementa contadores; `parasiteGriefing` lista.
- **Efectos:** terreno infestado, spawn de parásitos, sonidos/partículas (`blockParticleChance=0.05`).
- **Sincronización:** cambios de bloque se sincronizan por vanilla.
- **Persistencia:** los bloques quedan en el mundo.
- **Evidencia:** `util/ParasiteEventWorld.java` (`canInfestBlock`, `spreadBiomeBlockStain`, `spreadBiomeBlockTrunk`), `util/handlers/SRPEventHandlerBus.java` (contadores).
- **Riesgos 1.20.1:** contadores estáticos globales revisar con modelo de chunks moderno.

### FEA-WORLD-05 — Sistema de refuerzo (RS / reinforcement)
- **Propósito observable:** invocar Venkrol/nexos para reforzar la presencia parasitaria en un área.
- **Trigger:** `rsEnabled=true`, chance `rschance=0.045`, `rsVenkrolChance=20000`, por bloque/entidad.
- **Validación:** cooldown `rsCooldown=5`, `rsMaxVenkrols=100`, `rsMaxVenkrolChunk=2`, `rsVenkrolEmpty=0.05`, `rsIgnoreCooldownAtSpawn`.
- **Mutación:** crea Beckon (Venkrol) en etapas SI..SIV; `rsBlockI`, `rsBlockIMaxH=4.5`, `rsBlockLight=16`, `rsBlockRevertStage=1`.
- **Efectos:** crecimiento por etapas (`EntityAINexusGrow` con tipos 1=Venkrol, 2=Dod, 3=Leem), `maximumStageList` (`"dim;stage"`), partículas (`rsBlockParticleS/F=0.05`).
- **Sincronización:** vanilla block sync.
- **Persistencia:** el bloque corazón persiste.
- **Evidencia:** `util/config/SRPConfigSystems.java` (REINFORCEMENT_CATEGORY), `entity/ai/EntityAINexusGrow.java`, `entity/ai/EntityAIVenkrolSummon.java`.
- **Riesgos 1.20.1:** `rsBlockLight` etc. migran a config TOML.

### FEA-WORLD-06 — Worldgen de features parasitarias
- **Propósito observable:** generar estructuras/rasgos parasitarios en el mundo (ball, bigball, bush, tree, spine, flowers, mouth, colony, node core).
- **Trigger:** `WorldGenCustomStructures.generateInPosition(...)` invocado por features; `spawnGenFeatureParasite`, `spawnGenRoofParasite`, `spawnGenFeatureInfested`, `spawnGenRoofInfested`.
- **Validación:** `calculateHeight`, topBlock.
- **Mutación:** coloca bloques mediante `WorldGenStructure` (carga `.nbt`: `ball`, `ballbig`; `box` sin referencia confirmada).
- **Efectos:** terreno alterado.
- **Sincronización:** vanilla.
- **Persistencia:** mundo.
- **Evidencia:** `world/gen/WorldGenCustomStructures.java`, `world/gen/feature/*.java` (18), `world/gen/structure/WorldGenStructure.java`, `assets/srparasites/structures`.
- **Riesgos 1.20.1:** `IWorldGenerator` → `Feature`/`PlacedFeature`/`BiomeModifier` (datapack).

### FEA-WORLD-07 — Spawn por fases
- **Propósito observable:** la lista de mobs spawneables cambia con la fase de evolución.
- **Trigger:** `LivingSpawnEvent.CheckSpawn` (`DimensionHandler.onSpawn`), `SRPWorldEntitySpawner` cada 400 ticks.
- **Validación:** mob caps (`worldMobCap=40`, `worldMobCapPlusPlayer=5`, `worldGnatCap=20` para `EntityAta`), bloqueos de evolución/colonia, `canSpawninPhase`, `phaseCustomSpawner`.
- **Mutación:** permite/deniega el spawn; `SRPSpawning.PHASEZERO..PHASETEN`.
- **Efectos:** aparición de parásitos en el mundo.
- **Sincronización:** servidor.
- **Persistencia:** no (spawn runtime).
- **Evidencia:** `init/SRPSpawning.java`, `util/handlers/SRPEventHandlerBus.java` (onSpawn, worldTick, tickSpawn), `world/SRPWorldEntitySpawner.java`.
- **Riesgos 1.20.1:** `LivingSpawnEvent.CheckSpawn` → `MobSpawnEvent`/`FinalizeSpawnEvent`; `EntityRegistry` → `SpawnPlacements`.

### FEA-WORLD-08 — Griefing (rotura de bloques por parásitos)
- **Propósito observable:** los parásitos rompen bloques según `parasiteGriefing` (`"id;hardness;cooldown;range"`), con blacklist/whitelist.
- **Trigger:** `skillBreakBlocks()`, `EntityAIBlockInfest`, `EntityAIBlockLight`.
- **Validación:** `parasiteGriefingBlackList/White`, `parasiteGriefing` lista, hardness, cooldown, range; `parasiteGriefing` activo.
- **Mutación:** destruye bloques, coloca residuo/infestación.
- **Efectos:** terreno modificado, sonidos/partículas.
- **Sincronización:** vanilla.
- **Persistencia:** mundo.
- **Evidencia:** `entity/ai/misc/EntityParasiteBase.java` (`skillBreakBlocks`), `entity/ai/EntityAIBlockInfest.java`, `entity/ai/EntityAIBlockLight.java`, `util/config/SRPConfig.java` (parasiteGriefing).
- **Riesgos 1.20.1:** `World.destroyBlock`/`setBlock` firmas; `BlockState` inmutable.

### FEA-WORLD-09 — Infestación de bloques por venkrol (RS block infest)
- **Propósito observable:** los venkrol infestan bloques en un área, creando stain/trunk.
- **Trigger:** `canInfestBlock(pos, rand, stage, fromVenkrol)`.
- **Validación:** contadores globales, dificultad, luz (`getLightBrightness`, `getLightFor BLOCK`), `rsVenkrolEmpty`, stage < 4, bloque superior air/bush.
- **Mutación:** coloca bloques infestados; incrementa contadores.
- **Efectos:** propagación de infestación.
- **Sincronización:** vanilla.
- **Persistencia:** mundo.
- **Evidencia:** `util/ParasiteEventWorld.java` (`canInfestBlock`), `util/config/SRPConfigSystems.java` (rsBlockI, rsBlockIMaxH, rsBlockLight).
- **Riesgos 1.20.1:** `world.getEntitiesWithinAABB` → `getEntitiesOfClass`.

### FEA-WORLD-10 — Bioma visual (fog/colores/sky)
- **Propósito observable:** el bioma parasitario tiene fog rojo, sky rojo, grass/foliage/water rojos.
- **Trigger:** entrada al bioma.
- **Validación:** `biomeRegster`.
- **Mutación:** ninguna (render).
- **Efectos:** `biomeFogDensity=0.06`, `biomeFogRed/Green/Blue=38/36/36`, `biomeSkyColor=0x2F0000`, `biomeGrassColor=0xA60000`, `biomeFoliageColor=0xA60000`, `biomeWaterColor=0xA60000`, `biomeHeartFreq=30`, `biomeHeartVol=0.4`.
- **Sincronización:** `SRPPacketFog` (posible).
- **Persistencia:** config.
- **Evidencia:** `util/config/SRPConfigWorld.java` (biomeFog*, biomeSkyColor, etc.), `world/biome/BiomeInfestedPlain.java`, `network/SRPPacketFog.java`.
- **Riesgos 1.20.1:** `Biome.FogParameters`/`BiomeSpecialEffects` en datapack.

### FEA-WORLD-11 — Generación de terreno parasitario (gen features)
- **Propósito observable:** generar rasgos (árboles, espinas, flores, bocas) en el bioma/chunks.
- **Trigger:** `spawnGenFeatureParasite`, `spawnGenRoofParasite`, `spawnGenFeatureInfested`, `spawnGenRoofInfested`.
- **Validación:** probabilidades (`biomeTree=0.0015`, `biomeFlower=0.001`, `biomeSpine=5E-4`, `biomeTenflower=1E-4`, `biomeBall=7E-5`, `biomeBigBall=2E-5`, `biomeMouth=3E-4`).
- **Mutación:** coloca bloques/estructuras.
- **Efectos:** terreno parasitario.
- **Sincronización:** vanilla.
- **Persistencia:** mundo.
- **Evidencia:** `util/ParasiteEventWorld.java` (spawnGen*), `util/config/SRPConfigWorld.java` (biome* chances).
- **Riesgos 1.20.1:** `Feature`/`PlacedFeature` JSON.

### FEA-WORLD-12 — Comandos de nodo y colonia
- **Propósito observable:** administrar nodos/colonias por comando.
- **Trigger:** `/srpnode`, `/srpcolony` (permisos).
- **Validación:** sintaxis, permisos.
- **Mutación:** `SRPWorldData` (colocar/remover).
- **Efectos:** respuesta en chat, cambios en mundo.
- **Sincronización:** servidor.
- **Persistencia:** `SRPWorldData`.
- **Evidencia:** `network/SRPCommandNode.java`, `network/SRPCommandColony.java`, `proxy/CommonProxy.serverInit`.
- **Riesgos 1.20.1:** Brigadier.

---

## Grupo ENT — Ciclo de vida de entidades (13 features)

### FEA-ENT-01 — Infección/asimilación de mobs vanilla
- **Propósito observable:** un mob vanilla se convierte en parásito infectado (EntityPInfected) y transforma.
- **Trigger:** `convertEntity`/`convertEntityFeral` en `ParasiteEventEntity`; `EntityPInfected.transform()`; `setHost`/`getHost` (NBT `parasitehost`).
- **Validación:** `mobattacking`, listas negras/blancas (`entitiesWillAttack`, `entitiesWillAvoid`), chance.
- **Mutación:** reemplaza entidad por parásito infectado; `parasitehost` guarda el mob original.
- **Efectos:** cambio de modelo/textura, sonidos, loot.
- **Sincronización:** spawn de entidad (vanilla).
- **Persistencia:** NBT `parasitehost`.
- **Evidencia:** `util/ParasiteEventEntity.java` (`convertEntity`, `convertEntityFeral`, `hijackEntity`), `entity/ai/misc/EntityPInfected.java`.
- **Riesgos 1.20.1:** `EntityList.createEntityByID` → `EntityType`; spawn por `ServerLevel.addFreshEntity`.

### FEA-ENT-02 — Feralización y evolución interna
- **Propósito observable:** los infectados evolucionan a ferales tras acumular kills (`feralKills=60`).
- **Trigger:** `onKillEntity` en `EntityPFeral`/`EntityPInfected`.
- **Validación:** killcount ≥ umbral; fase.
- **Mutación:** cambia clase/variante a feral (`EntityPFeral`); `killcount`.
- **Efectos:** mayor fuerza, nuevo modelo, sonidos.
- **Sincronización:** vanilla.
- **Persistencia:** NBT (`parasitekills`).
- **Evidencia:** `entity/ai/misc/EntityPInfected.java`, `entity/ai/misc/EntityPFeral.java`, `entity/ai/misc/EntityParasiteBase.java` (`killcount`, `onKillEntity`).
- **Riesgos 1.20.1:** conversión de tipo en runtime (entity replacement).

### FEA-ENT-03 — Hijack (secuestro de mobs hostiles)
- **Propósito observable:** un mob hostile es "secuestrado" y convertido en parásito hijacked (EntityPHijacked).
- **Trigger:** `hijackEntity` en `ParasiteEventEntity`; `HIJACKVictimParasite`.
- **Validación:** `hijackHealth=0.5`, lista de víctimas, chance.
- **Mutación:** reemplaza por hijacked; `pivotDamageRHost=0.2375`, `pivotDamageRNotHost=0.05`, `pivotPointMultiplier=2`.
- **Efectos:** comportamiento hijacked, COTH.
- **Sincronización:** vanilla.
- **Persistencia:** NBT.
- **Evidencia:** `util/ParasiteEventEntity.java` (`hijackEntity`), `entity/ai/misc/EntityPHijacked.java`, `util/config/SRPConfigSystems.java` (hijackHealth, HIJACKVictimParasite, pivot*).
- **Riesgos 1.20.1:** entity replacement.

### FEA-ENT-04 — Fusión (merge) de parásitos
- **Propósito observable:** dos parásitos se fusionan en uno mayor.
- **Trigger:** `merge(...)` en `ParasiteEventEntity`; `mergeRandom`, `mergeHealth=0.5`, `mergeMobTable`, `mergeInfValues`, `valueMerge=10`.
- **Validación:** tabla de fusión, salud.
- **Mutación:** entidad resultante; puntos de evolución += valueMerge.
- **Efectos:** desaparición de las dos, aparición de la fusionada, sonido.
- **Sincronización:** vanilla.
- **Persistencia:** NBT.
- **Evidencia:** `util/ParasiteEventEntity.java` (`merge`), `util/config/SRPConfigSystems.java` (MERGE_CATEGORY).
- **Riesgos 1.20.1:** `Entity` removal/addition en 1.20.1.

### FEA-ENT-05 — Adaptación por daño (EntityPMalleable)
- **Propósito observable:** los parásitos se adaptan al tipo de daño recibido, ganando resistencia.
- **Trigger:** `attackEntityFrom` con un `DamageSource` nuevo.
- **Validación:** `adaptationNewDamageCooldon=20`, `damageTypeBlackList*`, `adaptationDimStrong`.
- **Mutación:** `resistance`, `sprresistances` (lista de nombres de daño), `sprresistancei` (contadores), `damagetypecap`, `paracolony` (puntos de colonia); `HIT` DataParameter.
- **Efectos:** reducción de daño futuro del mismo tipo; animación de hit.
- **Sincronización:** `HIT` (Byte) DataParameter.
- **Persistencia:** NBT `resistance`, `sprresistances`, `sprresistancei`, `damagetypecap`, `paracolony`.
- **Evidencia:** `entity/ai/misc/EntityPMalleable.java`, `util/config/SRPConfig.java` (adaptation*), `util/config/SRPConfigSystems.java` (adapsChance=0.2).
- **Riesgos 1.20.1:** `DamageSource` inmutable en 1.20.1 (construir con flags); `DataParameter` → `SynchedEntityData`.

### FEA-ENT-06 — Tope de daño y daño mínimo
- **Propósito observable:** limitar el daño por golpe (`damageCap`) y aplicar daño mínimo que atraviesa armadura.
- **Trigger:** `attackEntityFrom(DamageSource, float)`, `attackEntityAsMob`, `attackEntityAsMobMinimum`.
- **Validación:** `damageCapBlackList*`, `miniminiCap=5.0`, caps por versión (infectedCap=1, feralCap=3, …).
- **Mutación:** si el daño supera el tope, `source.setDamageBypassesArmor()` y aplica `SRPPotions.RAGE_E`; `damageCap` se compara.
- **Efectos:** daño limitado; rage; manejo manual de escudo (`ItemShield`/`isActiveItemStackBlocking`) y tótem (`TOTEM_OF_UNDYING`).
- **Sincronización:** vanilla (entidad).
- **Persistencia:** `damageCap`/`MiniDamage` por entidad.
- **Evidencia:** `entity/ai/misc/EntityParasiteBase.java` (`attackEntityFrom`, `attackEntityAsMob`, `attackEntityAsMobMinimum`, `damageCap`, `MiniDamage`), `util/config/SRPConfig.java` (caps).
- **Riesgos 1.20.1:** `setDamageBypassesArmor` → `DamageSource.bypassesArmor()` (inmutable); escudo/tótem APIs cambian; `LivingEntity.hurt`/`die` interfiere.

### FEA-ENT-07 — Nidos (nidus) y placement
- **Propósito observable:** los parásitos colocan nidos (`placeNidus`) que generan más parásitos.
- **Trigger:** `placeNidus()` en `EntityParasiteBase`.
- **Validación:** `type < 11` bloquea; `killcount`; fase.
- **Mutación:** crea nido (bloque/entidad).
- **Efectos:** spawn de parásitos, infestación.
- **Sincronización:** vanilla.
- **Persistencia:** mundo/NBT.
- **Evidencia:** `entity/ai/misc/EntityParasiteBase.java` (`placeNidus`), `util/config/SRPConfig.java` (`evolutionNests=4`).
- **Riesgos 1.20.1:** `BlockPos`/`Level` firmas.

### FEA-ENT-08 — Dispatcher (almacenamiento de parásitos)
- **Propósito observable:** el Dispatcher almacena parásitos en NBT y los libera (`addParaBack`).
- **Trigger:** `EntityAIDodAttack`, `storeParasite`, `storeAll`.
- **Validación:** `dodcrude/dodinf/dodflesh/dodmobs` + `mobs`.
- **Mutación:** inventario de parásitos en NBT; `addParaBack` los libera.
- **Efectos:** spawn de parásitos almacenados.
- **Sincronización:** vanilla.
- **Persistencia:** NBT `dodcrude`, `dodinf`, `dodflesh`, `dodmobs`, `mobs`.
- **Evidencia:** `entity/ai/misc/EntityPDispatcher.java`, `entity/ai/EntityAIDodAttack.java`.
- **Riesgos 1.20.1:** `NBTTagList` → `ListTag`; `CompoundTag`.

### FEA-ENT-09 — Rooster (spawn de LeemB)
- **Propósito observable:** el Rooster (nexo) invoca LeemB (`spawnLeemB(int)`).
- **Trigger:** `EntityPRooster.spawnLeemB`.
- **Validación:** cooldown, límites.
- **Mutación:** spawn de LeemB.
- **Efectos:** aparición de LeemB.
- **Sincronización:** vanilla.
- **Persistencia:** NBT propio (no extraído en esta pasada → [NO VERIFICADO]).
- **Evidencia:** `entity/ai/misc/EntityPRooster.java`.
- **Riesgos 1.20.1:** NBT no documentado; revisar antes de migrar.

### FEA-ENT-10 — Entidades multipart (EntityBody/EntityBodyModel)
- **Propósito observable:** jefes con partes de cuerpo independientes (multihitbox) sincronizadas al padre.
- **Trigger:** daño a una parte (`EntityBodyParts.attackEntityBodyFrom`, `setBodyPartDead`).
- **Validación:** `EntityBodyParts` interface.
- **Mutación:** marca parte muerta; sincroniza posición/rotación del padre (`setPositionAndRotationDirect`).
- **Efectos:** daño localizado, animación, muerte parcial.
- **Sincronización:** `SRPPacketEntityBodyHit`, `SRPPacketEntityBodyDead`.
- **Persistencia:** vínculo padre-hijo en NBT.
- **Evidencia:** `entity/EntityBody.java`, `entity/EntityBodyModel.java`, `network/SRPPacketEntityBodyHit.java`, `network/SRPPacketEntityBodyDead.java`, `entity/ai/misc` interfaces (`EntityBodyParts`).
- **Riesgos 1.20.1:** no existe equivalente nativo directo; adaptar a `PartEntity` de Forge o mantener sync manual.

### FEA-ENT-11 — Entidades de efecto (Damage, Remain, ScaryOrb, ToxicCloud, Scent)
- **Propósito observable:** zonas/efectos temporales: onda de daño, restos, orbe explosivo, nube tóxica, rastro.
- **Trigger:** habilidades de parásitos (`selfExplode`, `dyingBurst`, `spawnGore`, etc.).
- **Validación:** `SELFE`/`FUSE`/`WAITSTART` (orbe/nade), `RADIUS`/`HEIG` (nube).
- **Mutación:** estado temporal; `EntityDamage` con caster/follower.
- **Efectos:** daño en área, partículas, sonidos.
- **Sincronización:** `DataParameter` (`SELFE`, `FUSE`, `WAITSTART`, `RADIUS`, `HEIG`, `PART`, etc.).
- **Persistencia:** no (efímeras) salvo scent.
- **Evidencia:** `entity/EntityDamage.java`, `entity/EntityRemain.java`, `entity/EntityScaryOrb.java`, `entity/EntityToxicCloud.java`, `entity/EntityParasiticScent.java`.
- **Riesgos 1.20.1:** `EntityAreaEffectCloud` puede sustituir a `EntityToxicCloud`.

### FEA-ENT-12 — Proyectiles
- **Propósito observable:** disparos de los parásitos (bolas, espinas, nades, homming, drop pod, bomb, gore, web).
- **Trigger:** `EntityCanShoot.getProj`, `EntityAIAttackProjectile`, `EntityAIAttackRangedStatus`.
- **Validación:** cooldown/intervalo, `homming`.
- **Mutación:** crea proyectil con velocidad/daño.
- **Efectos:** daño al impacto (`attackEntityAsMobMinimum`), partículas.
- **Sincronización:** vanilla.
- **Persistencia:** no.
- **Evidencia:** `entity/ai/misc` interfaces (`EntityCanShoot`), `entity/projectile/*` (18), `entity/ai/EntityAIAttackProjectile.java`, `entity/ai/EntityAIAttackRangedStatus.java`.
- **Riesgos 1.20.1:** `EntityFireball`/`EntityThrowable` → `Projectile`; `EnumParticleTypes` → `ParticleTypes`.

### FEA-ENT-13 — Bonus por colonia/nodo (atributos)
- **Propósito observable:** los parásitos ganan bonus de vida/daño/armadura/KD-resistencia/damage cap según colonia y nodo.
- **Trigger:** `applyBonuses(colony, node, phase)` en spawn (`onInitialSpawn`).
- **Validación:** puntos de colonia/nodo, fase.
- **Mutación:** `setColonyBonus`/`setNodeBonus` modifica `MAX_HEALTH`, `ARMOR`, `ATTACK_DAMAGE`, `KNOCKBACK_RESISTANCE`, `damageCap`; añade efectos de poción (`SRPConfigWorld.potionEffectForNodes`).
- **Efectos:** parásitos más fuertes cerca de nodos/colonias.
- **Sincronización:** vanilla (atributos).
- **Persistencia:** atributos base (no persisten como NBT aparte).
- **Evidencia:** `entity/ai/misc/EntityParasiteBase.java` (`applyBonuses`, `setColonyBonus`, `setNodeBonus`), `util/config/SRPConfigWorld.java` (`potionEffectForNodes`, `colonyExtra*`).
- **Riesgos 1.20.1:** `SharedMonsterAttributes` → `Attributes` + `AttributeSupplier`.

---

## Grupo ITEM — Ítems, equipo, efectos, loot (10 features)

### FEA-ITEM-01 — Armas y armaduras vivientes/sintientes
- **Propósito observable:** equipo que evoluciona de living a sentient al acumular HP (`weapon_livingSentient_HP_needed=50000`).
- **Trigger:** uso en combate; acumulación de HP.
- **Validación:** durabilidad (`weapon_living_durability=1000`, `sentienDura=1500`), punto cap (`livingPointCap=18`, `sentientPointCap=13`).
- **Mutación:** cambio de tier (living→sentient): daño (scythe 17→34, axe 21→42, …), rango, armadura (helm 4→5, chest 10→12, …), toughness (3→4).
- **Efectos:** mayor daño/rango, tope de daño (`livingDamageCap=4`, `sentientDamageCap=7`), point reduction (`livingPointReduction=0.0125`, `sentientPointReduction=0.018`).
- **Sincronización:** vanilla (ítem en inventario).
- **Persistencia:** NBT del ItemStack (daño, HP acumulado).
- **Evidencia:** `item/tool/WeaponToolMeleeBase.java`, `WeaponToolArmorBase.java`, `util/config/SRPConfig.java` (GEAR_CATEGORY, weapon_*, living*, sentient*).
- **Riesgos 1.20.1:** `ItemStack` damage/NBT → `ItemStack` + `DataComponents`; `IHaveReach` → atributo de alcance.

### FEA-ITEM-02 — Armadura COTH y blacklist de daño
- **Propósito observable:** la armadura living/sentient puede bloquear tipos de daño (blacklist) y tiene COTH.
- **Trigger:** golpe recibido con armadura equipada.
- **Validación:** `armorDamageTypeBlackListMob/Else`, `armorDamageTypeBlackListWhite`, `armorCoth`.
- **Mutación:** reduce/cancela daño según tipo.
- **Efectos:** protección adicional.
- **Sincronización:** cliente (render de armadura).
- **Persistencia:** NBT del ItemStack.
- **Evidencia:** `item/tool/WeaponToolArmorBase.java`, `util/config/SRPConfig.java` (armor*).
- **Riesgos 1.20.1:** `DamageSource` inmutable; `ArmorItem` moderno.

### FEA-ITEM-03 — Ítems de evolución (Evolve/Assimilate/Devolve/Variant)
- **Propósito observable:** ítems que fuerzan la evolución/asimilación/des-evolución/variante de un parásito.
- **Trigger:** uso sobre una entidad.
- **Validación:** tipo de entidad, fase.
- **Mutación:** cambia estado del parásito.
- **Efectos:** transformación visible.
- **Sincronización:** vanilla.
- **Persistencia:** NBT de la entidad.
- **Evidencia:** `init/SRPItems.java` (`itemEvolve`, `itemAssimilate`, `itemDevolve`, `itemVariant`), `item/ItemBase.java`.
- **Riesgos 1.20.1:** `Item.useOn`/`interactLivingEntity`.

### FEA-ITEM-04 — Cebo (lure) y cyst
- **Propósito observable:** cebo que atrae parásitos; cyst que genera recursos.
- **Trigger:** colocación de `evolutionLure`/`itemLure`; `cystActive=true`, `cystDelay=25`, `cystConsumePoint=2`.
- **Validación:** `cystItemBlackList`.
- **Mutación:** genera componentes de cebo (`itemlurecomponent1..6`); consume puntos.
- **Efectos:** atracción de parásitos, sonido.
- **Sincronización:** vanilla.
- **Persistencia:** bloques en mundo.
- **Evidencia:** `block/BlockEvolutionLure.java`, `item/ItemLure.java`, `util/config/SRPConfig.java` (cyst*, itemlurecomponent).
- **Riesgos 1.20.1:** `Block`/`Item` registro.

### FEA-ITEM-05 — Brújula de nodo/colonia
- **Propósito observable:** apunta al nodo/colonia más cercano.
- **Trigger:** uso del ítem (`biomeCompass`/`ItemNodeColonyCompass`).
- **Validación:** existencia de nodo/colonia en la dimensión.
- **Mutación:** ninguna.
- **Efectos:** dirección en HUD; paquete `SRPPacketCompass`.
- **Sincronización:** `SRPPacketCompass`.
- **Persistencia:** no.
- **Evidencia:** `item/ItemNodeColonyCompass.java`, `network/SRPPacketCompass.java`.
- **Riesgos 1.20.1:** `SimpleChannel`.

### FEA-ITEM-06 — Reloj de evolución (itemEVClock)
- **Propósito observable:** muestra la fase/puntos de evolución.
- **Trigger:** uso/mantenimiento del ítem.
- **Validación:** `useEvolution`.
- **Mutación:** ninguna.
- **Efectos:** HUD/texto.
- **Sincronización:** servidor→cliente.
- **Persistencia:** no.
- **Evidencia:** `item/ItemEPClock.java`.
- **Riesgos 1.20.1:** `Item` moderno.

### FEA-ITEM-07 — Loot de mobs
- **Propósito observable:** drops configurables por mob en formato `"item;chance;max;roll"`.
- **Trigger:** muerte del mob.
- **Validación:** `mobsKilledDropLoot`, loot table por mob, chance.
- **Mutación:** genera drops.
- **Efectos:** ítems en el mundo.
- **Sincronización:** vanilla.
- **Persistencia:** no.
- **Evidencia:** `util/config/SRPConfigMobs.java` (XLoot), `init/SRPItems.java` (drops), `assets/srparasites/loot_tables` (1 tabla).
- **Riesgos 1.20.1:** loot tables JSON (datagen).

### FEA-ITEM-08 — Efectos de estado (pociones) SRP
- **Propósito observable:** 15 efectos propios (FEAR, COTH, RES, BLEED, CORRO, VIRA, RAGE, EPEL, SENS, PREY, DEBAR, DLER, FOSTER, LINK, PIVOT) con triggers y persistencia.
- **Trigger:** aplicación por parásitos/config (`potionEffectForNodes`, `cothConvert`, etc.).
- **Validación:** listas de inmunidad (`COTHImmuneList`, `needlerImmuneList`), `stackablePotionsLimit`.
- **Mutación:** añade `PotionEffect`/`MobEffectInstance` a la entidad.
- **Efectos:** FEAR (daño por caída/aire `fearFallDamage=1.5`, `fearAirDamage=1.5`, bloquea), COTH (conversión `cothConvert=0.3`, aura `cothAura=3`, desactiva loot `cothLootDisable`), BLEED (daño `bleedingDamage=0.02`, cap 100), CORRO (`corroValue=3`, `corrNot=0.1`), VIRA (`viralAmount=0.5`), RAGE (`rageDamage=0.1`, `rageSpeed=0.1`), EPEL (epelChanceCOTH=0.7), SENS, PREY, DEBAR, DLER, FOSTER, LINK, PIVOT (`pivotDamageRHost=0.2375`, etc.).
- **Sincronización:** vanilla (efectos).
- **Persistencia:** efectos temporales (no persisten entre sesiones salvo NBT de entidad).
- **Evidencia:** `init/SRPPotions.java`, `potion/SRPEffectBase.java`, `util/config/SRPConfigSystems.java` (STATUSEFFECTS_CATEGORY).
- **Riesgos 1.20.1:** `Potion`→`MobEffect`, `PotionEffect`→`MobEffectInstance`, `ForgeRegistries.MOB_EFFECTS`.

### FEA-ITEM-09 — Orbes de comida/XP (food steal, XP steal)
- **Propósito observable:** los parásitos roban comida/XP al jugador (`orbFoodMult=5`, `pureFoodSteal=2.0`, `pureExpSteal=180`, `preeminentExpSteal=340`).
- **Trigger:** ataque exitoso de parásito puro/preeminent.
- **Validación:** chance (`pureFoodChance=0.3`, `pureFoodAmount=8`).
- **Mutación:** reduce XP/comida del jugador; cura al parásito.
- **Efectos:** partículas, sonido.
- **Sincronización:** vanilla.
- **Persistencia:** no.
- **Evidencia:** `util/config/SRPConfig.java` (orbFoodMult, *FoodSteal, *ExpSteal, *FoodChance, *FoodAmount), `entity/ai/misc/EntityParasiteBase.java`.
- **Riesgos 1.20.1:** `Player.giveExperiencePoints`/`addExhaustion`.

### FEA-ITEM-10 — Needler (arco parasitario)
- **Propósito observable:** arco con daño cap (`weapon_bow_damageCap=2`) y damage type blacklist.
- **Trigger:** disparo (`EntityAIAttackRangedStatus`).
- **Validación:** `needlerImmuneList`, `needlerMaxDamPlayer/Monster=1E9`, `needlerTerminal=7`, `needlerDamage=0.4`.
- **Mutación:** daño al objetivo.
- **Efectos:** proyectil, partículas.
- **Sincronización:** vanilla.
- **Persistencia:** no.
- **Evidencia:** `item/tool/WeaponToolRangeBase.java`, `util/config/SRPConfig.java` (weapon_bow_*), `util/config/SRPConfigSystems.java` (needler*).
- **Riesgos 1.20.1:** `BowItem` moderno, `Projectile`.

---

## Grupo CLIENT — Cliente, render, modelos, partículas (5 features)

### FEA-CLIENT-01 — Renderers de entidades
- **Propósito observable:** renderizado de ~127 entidades con bases `RenderMalleable`/`RenderCosmical`, capas glow/snow, armadura bípeda.
- **Trigger:** `EntityRenderersEvent` (1.20.1) / `RenderingRegistry` (1.12.2) en `ClientProxy.preInit`.
- **Validación:** flags de config (`hebluEnabled`, etc.).
- **Mutación:** ninguna (render).
- **Efectos:** modelo, textura, escala por `getSelfeFlashIntensity`, glow.
- **Sincronización:** `DataParameter` (SKIN, SELFE, COLD_L, HIT).
- **Persistencia:** no.
- **Evidencia:** `util/handlers/SRPRenderHandler.java`, `client/renderer/**`, `reports/analysis_client.md`.
- **Riesgos 1.20.1:** `RenderManager`→`EntityRendererProvider.Context`; `PoseStack`/`MultiBufferSource`; `GlStateManager`→`PoseStack`.

### FEA-CLIENT-02 — Modelos box-based
- **Propósito observable:** 129 modelos procedimentales (`ModelRenderer`/`addBox`) mayoritariamente extendiendo `ModelSRP`.
- **Trigger:** registro de renderer.
- **Validación:** ninguna.
- **Mutación:** ninguna.
- **Efectos:** geometría animada (`setRotationAngles`, swing).
- **Sincronización:** no.
- **Persistencia:** no.
- **Evidencia:** `client/model/**`, `client/model/ModelSRP.java`.
- **Riesgos 1.20.1:** `ModelBase`→`EntityModel`, `ModelRenderer`→`ModelPart`, `LayerDefinition`, `ModelLayerLocation`.

### FEA-CLIENT-03 — Partículas
- **Propósito observable:** 7 partículas propias (fog, spore, smoke RGB, gore, rhappy, biomass, een) elegidas por `SRPEnumParticle` e instanciadas en `ParticleSpawner`.
- **Trigger:** `ParticleSpawner.spawnParticle(...)`, `spawnParticles` de entidades.
- **Validación:** `particleSetting` (si ≥1 no spawnea), `shouldIgnoreRange`.
- **Mutación:** ninguna.
- **Efectos:** visuales (texturas cosidas en `stitchEventPre`).
- **Sincronización:** `SRPPacketParticle`.
- **Persistencia:** no.
- **Evidencia:** `client/particle/*`, `client/particle/SRPEnumParticle.java`, `client/particle/ParticleSpawner.java`, `util/handlers/SRPEventHandlerBus.java` (`stitchEventPre`).
- **Riesgos 1.20.1:** `Particle`→`TextureSheetParticle` + `SpriteSet`; `ParticleType` registrado; atlas JSON.

### FEA-CLIENT-04 — Registro de modelos de ítem/bloque
- **Propósito observable:** modelos de ítem/bloque por `ModelLoader.setCustomModelResourceLocation`, metadatos por `EnumType`, mesh/state mapper para `DeadBlood`.
- **Trigger:** `ModelRegistryEvent` en `SRPRegisterModels`.
- **Validación:** ninguna.
- **Mutación:** ninguna.
- **Efectos:** render de ítems/bloques.
- **Sincronización:** no.
- **Persistencia:** no.
- **Evidencia:** `util/handlers/SRPRegisterModels.java`.
- **Riesgos 1.20.1:** modelos JSON por ítem + `ItemProperties`; `StateMapperBase`→blockstates JSON + `BlockStateModelLoader`.

### FEA-CLIENT-05 — Proyectiles render (billboard quad)
- **Propósito observable:** proyectiles se dibujan como quad billboard con `Tessellator`/`GlStateManager` (`SRPProjectile`).
- **Trigger:** render del proyectil.
- **Validación:** ninguna.
- **Mutación:** ninguna.
- **Efectos:** visual.
- **Sincronización:** no.
- **Persistencia:** no.
- **Evidencia:** `client/SRPProjectile.java`, `util/handlers/SRPRenderHandler.java` (proyectiles).
- **Riesgos 1.20.1:** `Tessellator`/`BufferBuilder` con `VertexFormat` o `MultiBufferSource`/`VertexConsumer`.

---

## Grupo NET — Red, comandos, config (4 features)

### FEA-NET-01 — Canal de red (8 paquetes)
- **Propósito observable:** sincronizar melee range, body hit/dead, biome change, moving sound, particles, fog, compass.
- **Trigger:** eventos de juego.
- **Validación:** lado (Side.SERVER/CLIENT).
- **Mutación:** estado en cliente.
- **Efectos:** UI/visual/sonido.
- **Sincronización:** `SimpleNetworkWrapper` canal `"SRParasites"`.
- **Persistencia:** no.
- **Evidencia:** `util/handlers/SRPPacketHandler.java`, `network/SRPPacket*.java`.
- **Riesgos 1.20.1:** `SimpleChannel` (`ChannelBuilder`), `PacketDistributor`.

### FEA-NET-02 — Comandos (4)
- **Propósito observable:** administrar evolución, nodos, colonias y raíz.
- **Trigger:** jugador con permisos.
- **Validación:** sintaxis, permisos.
- **Mutación:** `SRPSaveData`/`SRPWorldData`.
- **Efectos:** chat, cambios en mundo.
- **Sincronización:** servidor.
- **Persistencia:** save data.
- **Evidencia:** `network/SRPCommand*.java`, `proxy/CommonProxy.serverInit`.
- **Riesgos 1.20.1:** `ICommand`→Brigadier `Command`.

### FEA-NET-03 — Configuración (4 archivos .cfg)
- **Propósito observable:** parametrizar todo el mod (general, mobs, systems, world).
- **Trigger:** `preInit` (`initConfig`), `postInit` (`save`).
- **Validación:** rangos min/max en `getBoolean/getInt/getFloat`.
- **Mutación:** campos `public static` mutables.
- **Efectos:** comportamiento del mod.
- **Sincronización:** servidor (gameplay); cliente (render).
- **Persistencia:** `.cfg` en `config/srparasites/`.
- **Evidencia:** `util/config/SRPConfig*.java`, `proxy/CommonProxy.preInit/postInit`.
- **Riesgos 1.20.1:** `Configuration` eliminado → `ForgeConfigSpec` (TOML); separar CLIENT/COMMON/SERVER.

### FEA-NET-04 — Compatibilidad externa (ReachFix, JustEnoughIDs)
- **Propósito observable:** detectar mods externos y ajustar comportamiento (REID incompatible con nodos).
- **Trigger:** `ModCompatibility.preInit/postInit`.
- **Validación:** `Loader.isModLoaded`.
- **Mutación:** `modCompatModules`.
- **Efectos:** warning si REID + nodos activos.
- **Sincronización:** no.
- **Persistencia:** no.
- **Evidencia:** `compatibility/ModCompatibility.java`.
- **Riesgos 1.20.1:** `Loader.isModLoaded` sigue; revisar mods equivalentes.

---

## Grupo PERSIST — Persistencia (2 features)

### FEA-PERSIST-01 — SRPSaveData (global)
- **Propósito observable:** guardar estado global de evolución (fase, puntos, cooldown, bloqueos, asimilados).
- **Trigger:** cambios de fase/puntos.
- **Validación:** `useEvolution`.
- **Mutación:** NBT (claves en §FEA-EVO-01).
- **Efectos:** persistencia entre sesiones.
- **Sincronización:** no.
- **Persistencia:** `world.getMapStorage()` (global, compartido por dimensiones).
- **Evidencia:** `world/SRPSaveData.java`.
- **Riesgos 1.20.1:** `getMapStorage` → `ServerLevel.getDataStorage()` (anclar a Overworld).

### FEA-PERSIST-02 — SRPWorldData (por mundo)
- **Propósito observable:** guardar coords/edades de nodos y colonias + resistencia.
- **Trigger:** colocación/remoción de corazón.
- **Validación:** `nodesActivated`/`coloniesActivated`.
- **Mutación:** NBT (claves en §FEA-WORLD-02/03).
- **Efectos:** persistencia.
- **Sincronización:** no.
- **Persistencia:** `world.getPerWorldStorage()` (por dimensión).
- **Evidencia:** `world/SRPWorldData.java`.
- **Riesgos 1.20.1:** `getPerWorldStorage` → `ServerLevel.getDataStorage()`.

---

## Resumen de cobertura (Fase A)

| Grupo | Features | Estado |
|---|---|---|
| EVO | 8 | PENDIENTE |
| WORLD | 12 | PENDIENTE |
| ENT | 13 | PENDIENTE |
| ITEM | 10 | PENDIENTE |
| CLIENT | 5 | PENDIENTE |
| NET | 4 | PENDIENTE |
| PERSIST | 2 | PENDIENTE |
| **Total** | **54 features** | PENDIENTE |

**Entregable:** `reports/FEATURE_SPEC.md`. Complementa a `MIGRATION_INVENTORY.md` (inventario con IDs) y `DEPENDENCIES.md`.
