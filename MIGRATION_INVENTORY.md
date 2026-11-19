# MIGRATION_INVENTORY — Scape and Run: Parasites

**Fase A del manual:** *INVENTARIO SIN MODIFICAR* (no se ha reescrito ni ejecutado el mod).
**Origen:** `A:\Descargas\SRParasites-1.12.2v1.9.21.jar` (Minecraft 1.12.2 · Forge 14.23.x).
**Destino acordado:** Minecraft 1.20.1 · Forge 47.x · Java 17.
**Fecha del inventario:** 2026-11-13.

| Dato | Valor |
|---|---|
| modid | `srparasites` |
| Nombre | Scape and Run Parasites |
| Versión | 1.9.21 |
| Autor | Dhanantry |
| mcversion | 1.12.2 |
| URL | https://www.curseforge.com/minecraft/mc-mods/scape-and-run-parasites |
| Clase `@Mod` | `com.dhanantry.scapeandrunparasites.SRPMain` |
| SHA-256 JAR | `F803AB3882BC8047858A23E2376AAA8FB87D7E54A324B9183B4A033EE076DDEA` |
| SHA-256 manual PDF | `5C9D692F26EFF3B8AE4E539B5D0902E70B2278ACF185C085CCAD1F5A625F5A7E` |
| Decompilador | CFR 0.152 (`C:\Users\Kevin Aguilar\cfr.jar`) |
| Mappings | MCP `stable_39` (fields.csv/methods.csv) — SRG→MCP |
| Clases top-level | **590** `.java` (0 fallos de descompilación) |
| Líneas de código | **184 157** |

**Estado global:** todos los elementos están en estado **PENDIENTE** (fase de inventario; la reescritura a 1.20.1 no ha comenzado). Las incertidumbres se marcan como **[NO VERIFICADO]**.

> Cómo leer este documento: cada fila de las matrices lleva un **ID único** (`SYS-`, `BLK-`, `ITM-`, `ENT-`, `SND-`, `POT-`, `PKT-`, `CMD-`, `GEN-`, `CFG-`, `REN-`, `MOD-`, `PRT-`, `RES-`). Los análisis de detalle por subsistema están en `reports/analysis_entities.md`, `analysis_client.md`, `analysis_config.md` y `analysis_world.md`.

---

## 0. Cobertura del inventario (denominadores)

Regla del manual (§13.3): se informa cobertura **por categoría con su denominador**, no un único porcentaje.

| Categoría | Inventariado / Total | Cobertura | Fuente |
|---|---|---|---|
| Clases Java (top-level) | 590 / 590 | 100 % | `decompiled/mcp` |
| Registro de entidades | 125 / 125 (100 mobs + 25 proyectiles/efectos) | 100 % | `init/SRPEntities.java` |
| Registro de bloques | 30 / 30 | 100 % | `init/SRPBlocks.java` |
| Registro de ítems | 146 / 146 | 100 % | `init/SRPItems.java` |
| SoundEvents | 207 / 207 | 100 % | `init/SRPSounds.java` |
| Pociones / PotionTypes | 15 / 15 · 12 / 12 | 100 % | `init/SRPPotions.java` |
| Biomas / Fluidos | 1 / 1 · 1 / 1 | 100 % | `init/SRPBiomes.java`, `init/SRPFluids.java` |
| TileEntities | 2 / 2 | 100 % | `init/SRPEntities.java` |
| Paquetes de red | 8 / 8 | 100 % | `util/handlers/SRPPacketHandler.java` |
| Comandos | 4 / 4 | 100 % | `proxy/CommonProxy.java` |
| Features de worldgen | 18 / 18 | 100 % | `world/gen/feature` |
| Estructuras `.nbt` | 3 / 3 | 100 % | `assets/srparasites/structures` |
| Goals de IA | 31 / 31 | 100 % | `entity/ai` |
| Renderers | 127 / 127 (+1 `SRPProjectile`) | 100 % | `client/renderer` |
| Modelos | 129 / 129 | 100 % | `client/model` |
| Partículas | 7 / 7 | 100 % | `client/particle` |
| Categorías de config (por mob) | 82 / 82 (~73 tipos) | 100 % | `util/config/SRPConfigMobs.java` |
| Assets de recursos | blockstates 34 · models 398 · textures 624 · sonidos .ogg 373 · lang 27 · recipes 20 · loot_tables 1 | 100 % | `extracted/assets` |
| **Features/flujos observables** | 0 / N (por redactar en `FEATURE_SPEC.md`) | **0 %** | pendiente |

**Estado por categoría de migración:** todo `PENDIENTE`. No hay elementos `MIGRADO` ni `VALIDADO`.

---

## 1. Punto de entrada y arquitectura (SYS)

| ID | Elemento | Evidencia (1.12.2) | Equivalente 1.20.1 | Estado |
|---|---|---|---|---|
| SYS-001 | Clase `@Mod` | `SRPMain` (`@Mod(modid,name,version)`, `@Mod.Instance`, `@SidedProxy`) | `@Mod("srparasites")` + `FMLJavaModLoadingContext`; sin `@Instance`/`@SidedProxy` (usar `DistExecutor`) | PENDIENTE |
| SYS-002 | Ciclo de vida | `PreInit/Init/Postinit/Serverinit` (`FMLPreInitializationEvent`…) | Constructor del mod + `FMLCommonSetupEvent`/`FMLClientSetupEvent`/`FMLDedicatedServerSetupEvent` | PENDIENTE |
| SYS-003 | Proxies | `proxy/CommonProxy`, `proxy/ClientProxy` (`@SidedProxy`) | `DistExecutor.unsafeRunWhenOn(Dist.CLIENT, …)` o clases separadas por `@Mod.EventBusSubscriber(Dist.CLIENT)` | PENDIENTE |
| SYS-004 | Bus de eventos | `SRPEventHandlerBus`, `SRPEventHandlerTerrainGen` (bus clásico `MinecraftForge.EVENT_BUS`) | `@Mod.EventBusSubscriber(bus = Bus.FORGE)` / `Bus.MOD` | PENDIENTE |
| SYS-005 | Registro de handlers | `SRPRegistryHandlers.initEvents()`/`initRenders()` | init en `FMLCommonSetupEvent`/`FMLClientSetupEvent` | PENDIENTE |
| SYS-006 | Registro de entidades | `RegistryEvent.Register<EntityEntry>` + `EntityEntryBuilder` | `DeferredRegister<EntityType<?>>` (`ForgeRegistries.ENTITY_TYPES`) + `EntityType.Builder` | PENDIENTE |
| SYS-007 | Registro de bloques/ítems | `RegistryEvent.Register<Block/Item>` (en `SRPBlocks`/`SRPItems`) | `DeferredRegister<Block>` / `<Item>` | PENDIENTE |
| SYS-008 | Registro de sonidos | `ForgeRegistries.SOUND_EVENTS` en `SRPSounds.init()` | `DeferredRegister<SoundEvent>` | PENDIENTE |
| SYS-009 | Registro de pociones | `SRPPotions` (`RegistryEvent.Register<Potion>/<PotionType>`) | `MobEffect` + `DeferredRegister` (Forge 1.20.1) | PENDIENTE |
| SYS-010 | Registro de bioma | `SRPBiomes` + `BiomeManager.addBiome` + `BiomeDictionary.Type.SPOOKY` | Bioma por datapack JSON + `BiomeModifier` + tags de bioma | PENDIENTE |
| SYS-011 | Fluido | `SRPFluids` + `FluidRegistry.enableUniversalBucket()` | `DeferredRegister<Fluid>` + `ForgeMod` fluid types (sin universal bucket) | PENDIENTE |
| SYS-012 | TileEntities | `GameRegistry.registerTileEntity(...)` | `DeferredRegister<BlockEntityType<?>>` | PENDIENTE |
| SYS-013 | Red | `SimpleNetworkWrapper` canal `"SRParasites"` | `SimpleChannel` (`ChannelBuilder`) | PENDIENTE |
| SYS-014 | Configuración | `net.minecraftforge.common.config.Configuration` (4 `.cfg`) | `ForgeConfigSpec` (TOML) | PENDIENTE |
| SYS-015 | WorldSavedData | `SRPSaveData` (global), `SRPWorldData` (por mundo) | `SavedData` + `ServerLevel.getDataStorage()` | PENDIENTE |
| SYS-016 | Worldgen | `IWorldGenerator` (`GameRegistry.registerWorldGenerator`) | `Feature`/`PlacedFeature`/`BiomeModifier` (datapack) | PENDIENTE |
| SYS-017 | Spawner propio | `SRPWorldEntitySpawner.findChunksForSpawning` | Reescritura sobre `NaturalSpawner`/`SpawnPlacements` | PENDIENTE |
| SYS-018 | Comandos | `e.registerServerCommand(...)` (`FMLServerStartingEvent`) | `RegisterCommandsEvent` | PENDIENTE |
| SYS-019 | Creative tab | `SRPCreativeTabs` | `CreativeModeTab` (registry) | PENDIENTE |
| SYS-020 | Atributos | `SRPSharedMonsterAttributes`, `SRPAttributes` (`SharedMonsterAttributes`) | `AttributeSupplier` + `Attributes` | PENDIENTE |
| SYS-021 | Coremods/ASM/Mixin | **Ninguno detectado** | No aplica | N/A |
| SYS-022 | Capabilities | **Ninguna detectada** (`getCapability` solo vía `IItemHandler` del tile) | `ForgeCapabilities.ITEM_HANDLER` si se conserva el inventario | PENDIENTE |
| SYS-023 | GUIs/Containers | **Ninguna detectada** (0 `GuiScreen`/`Container` propios) | No aplica | N/A |
| SYS-024 | Keybindings | **Ninguno detectado** | No aplica | N/A |
| SYS-025 | Compatibilidad externa | `ModCompatibility` (chequea `reachfix`, `JustEnoughIDs`) | Revisar equivalentes; `Loader.isModLoaded` sigue existiendo | PENDIENTE |

---

## 2. Registro de BLOQUES — 30 (BLK)

Fuente: `init/SRPBlocks.java`. Todos registrados vía `RegistryEvent.Register<Block>` + `ItemBlock`/`ItemBlockVariant`.

| ID | Nombre de campo | Clase | Notas |
|---|---|---|---|
| BLK-001 | `InfestedStain` | `BlockInfestedStain` | variantes `EnumType` |
| BLK-002 | `InfestRemain` | `BlockInfestedRemain` | |
| BLK-003 | `InfestedTrunk` | `BlockInfestedTrunk` | variantes |
| BLK-004 | `InfestedRubble` | `BlockInfestedRubble` | variantes |
| BLK-005 | `BiomeHeart` | `BlockBiomeCore` | núcleo de nodo |
| BLK-006 | `ColonyHeart` | `BlockColonyCore` | núcleo de colonia |
| BLK-007 | `ColonyOutpost` | `BlockColonyOutpost` | |
| BLK-008 | `BiomePurifier` | `BlockBiomePurifier` | |
| BLK-009 | `optionalDirt` | `BlockBase` | reemplazo opcional |
| BLK-010 | `optionalRub` | `BlockBase` | reemplazo opcional |
| BLK-011 | `SRPWeb` | `BlockWebBase` | variantes |
| BLK-012 | `evolutionLure` | `BlockEvolutionLure` | variantes |
| BLK-013 | `buglin` | `BlockBuglin` | |
| BLK-014 | `ParasiteCanister` | `BlockParasiteCanister` | variantes |
| BLK-015 | `ParasiteTrunk` | `BlockParasiteTrunk` | variantes |
| BLK-016 | `ParasiteStain` | `BlockParasiteStain` | variantes |
| BLK-017 | `ParasiteRubble` | `BlockParasiteRubble` | variantes |
| BLK-018 | `ParasiteStructure` | `BlockColonyStructure` | |
| BLK-019 | `ParasiteThin` | `BlockParasiteThin` | |
| BLK-020 | `ParasiteSapling` | `BlockParasiteSapling` | variantes |
| BLK-021 | `ParasiteMouth` | `BlockParasiteMouth` | |
| BLK-022 | `ParasiteRubbleDense` | `BlockParasiteRubbleDense` | variantes |
| BLK-023 | `ParasiteRubbleBoneStair` | `BlockStairBase` | |
| BLK-024 | `ParasiteStainFleshStair` | `BlockStairBase` | |
| BLK-025 | `ParasiteVine` | `BlockVineBase` | |
| BLK-026 | `ParasiteFog` | `BlockParasiteFog` | |
| BLK-027 | `DeadBlood` | `BlockFluid` | fluido `deadblood` |
| BLK-028 | `dodN` | `BlockDod` | |
| BLK-029 | `InfestedOre` | `BlockInfestedOre` | variantes |
| BLK-030 | `BloodyIce` | `BlockBloodyIce` | |

Clases auxiliares de bloque (no registradas directamente): `BlockBase`, `BlockSlabBase`, `BlockSlabDouble`, `BlockSlabHalf`, `BlockStairBase`, `BlockVineBase`, `BlockWebBase`, `IMetaName`, `BlockGore`, `BlockInfestedBush`, `BlockParasiteBush`, `BlockInfestedRubbleDense`, `BlockParasiteCanisterC`.
**Riesgo:** todos usan `PropertyEnum`/metadatos y `getMetaFromState`/`getStateFromMeta`; en 1.20.1 el estado se deriva de `BlockState` y los `EnumType` deben migrarse a `EnumProperty`. Los `ItemBlockVariant` con subtipos requieren `Item` con `BlockState` por variante.

---

## 3. Registro de ÍTEMS — 146 (ITM)

Fuente: `init/SRPItems.java`. Registro vía `RegistryEvent.Register<Item>`.

| ID | Grupo | Nº | Contenido |
|---|---|---|---|
| ITM-001 | Drops de mob | 11 | `acanra_drop`, `aemana_drop`, `ahull_drop`, `anogla_drop`, `ashyco_drop`, `abano_drop`, `aranrac_drop`, `alum_drop`, `infected_drop`, `venkrol_drop`, `dod_drop` |
| ITM-002 | Objetos de evolución | 4 | `itemAssimilate`, `itemEvolve`, `itemDevolve`, `itemVariant` |
| ITM-003 | Objetos varios | 8 | `itembase`, `itemthrow`, `itemEVClock`, `biomeCompass`, `tendrons`, `hardbone`, `infblade`, `livingcore` |
| ITM-004 | Materiales | 3 | `vileshell`, `bone` |
| ITM-005 | Componentes de cebo (lure) | 6 | `itemlurecomponent1` … `itemlurecomponent6` |
| ITM-006 | Spawn eggs | 93 | `itemmobspawner_*` (uno por entidad registrable) |
| ITM-007 | Armas | 14 | `weapon_scythe/axe/sword/cleaver/bow/maul/lance` (+ `Sentient`) |
| ITM-008 | Armaduras | 8 | `armor_helmet/chest/pants/boots` (+ `Sentient`) |

Clases de ítem: `item/ItemBase`, `ItemBlockVariant`, `ItemEPClock`, `ItemLure`, `ItemMobSpawner`, `ItemNodeColonyCompass`, `ItemThrowable`; `item/tool/` → `WeaponMeleeAxe`, `WeaponMeleeCleaver`, `WeaponMeleeLance`, `WeaponMeleeMaul`, `WeaponMeleeScythe`, `WeaponMeleeSword`, `WeaponToolArmorBase`, `WeaponToolMeleeBase`, `WeaponToolRangeBase`, `IHaveReach`.
**Riesgo:** `IHaveReach` es parche de compatibilidad con `reachfix` (alcance de arma). En 1.20.1 el alcance se controla con `ForgeMod.ENTITY_REACH`/atributos; revisar.

---

## 4. Registro de ENTIDADES — 125 (ENT)

Fuente: `init/SRPEntities.java`. **100 mobs** (`CreateEntityMob`, con id numérico + spawn egg) y **25 proyectiles/efectos** (`CreateEntityProjectile`). El id numérico desaparece en 1.20.1 (sustituir por `ResourceLocation`).

### 4.1 Mobs (ENT-001 … ENT-100)

| ID | id | Registry name | Clase | Flag de config |
|---|---|---|---|---|
| ENT-001 | 2 | `sim_bigspider` | EntityDorpa | `dorpaEnabled` |
| ENT-002 | 307 | `sim_squid` | EntityInfSquid | `infsquidEnabled` |
| ENT-003 | 6 | `sim_human` | EntityInfHuman | `infhumanEnabled` |
| ENT-004 | 13 | `sim_cow` | EntityInfCow | `infcowEnabled` |
| ENT-005 | 14 | `sim_sheep` | EntityInfSheep | `infsheepEnabled` |
| ENT-006 | 15 | `sim_wolf` | EntityInfWolf | `infwolfEnabled` |
| ENT-007 | 26 | `sim_pig` | EntityInfPig | `infpigEnabled` |
| ENT-008 | 27 | `sim_villager` | EntityInfVillager | `infvillagerEnabled` |
| ENT-009 | 40 | `sim_adventurer` | EntityInfPlayer | `infadventurerEnabled` |
| ENT-010 | 44 | `sim_horse` | EntityInfHorse | `infhorseEnabled` |
| ENT-011 | 49 | `sim_bear` | EntityInfBear | `infbearEnabled` |
| ENT-012 | 59 | `sim_enderman` | EntityInfEnderman | `infendermanEnabled` |
| ENT-013 | 64 | `sim_dragone` | EntityInfDragonE | `infdragoneEnabled` |
| ENT-014 | 22 | `sim_sheephead` | EntityInfSheepHead | `infsheepEnabled` |
| ENT-015 | 21 | `sim_wolfhead` | EntityInfWolfHead | `infwolfEnabled` |
| ENT-016 | 28 | `sim_cowhead` | EntityInfCowHead | `infcowEnabled` |
| ENT-017 | 31 | `sim_pighead` | EntityInfPigHead | `infpigEnabled` |
| ENT-018 | 32 | `sim_villagerhead` | EntityInfVillagerHead | `infvillagerEnabled` |
| ENT-019 | 45 | `sim_horsehead` | EntityInfHorseHead | `infhorseEnabled` |
| ENT-020 | 46 | `sim_humanhead` | EntityInfHumanHead | `infhumanEnabled` |
| ENT-021 | 69 | `sim_endermanhead` | EntityInfEndermanHead | `infendermanEnabled` |
| ENT-022 | 70 | `sim_dragonehead` | EntityInfDragonEHead | `infdragoneEnabled` |
| ENT-023 | 71 | `sim_adventurerhead` | EntityInfPlayerHead | `infadventurerEnabled` |
| ENT-024 | 306 | `fer_bear` | EntityFerBear | `ferbearEnabled` |
| ENT-025 | 93 | `fer_cow` | EntityFerCow | `fercowEnabled` |
| ENT-026 | 94 | `fer_enderman` | EntityFerEnderman | `ferendermanEnabled` |
| ENT-027 | 95 | `fer_horse` | EntityFerHorse | `ferhorseEnabled` |
| ENT-028 | 96 | `fer_human` | EntityFerHuman | `ferhumanEnabled` |
| ENT-029 | 97 | `fer_pig` | EntityFerPig | `ferpigEnabled` |
| ENT-030 | 98 | `fer_sheep` | EntityFerSheep | `fersheepEnabled` |
| ENT-031 | 99 | `fer_villager` | EntityFerVillager | `fervillagerEnabled` |
| ENT-032 | 300 | `fer_wolf` | EntityFerWolf | `ferwolfEnabled` |
| ENT-033 | 302 | `hi_blaze` | EntityHiBlaze | `hiblazeEnabled` |
| ENT-034 | 301 | `hi_golem` | EntityHiGolem | `higolemEnabled` |
| ENT-035 | 303 | `hi_skeleton` | EntityHiSkeleton | `hiskeletonEnabled` |
| ENT-036 | 3 | `carrier_heavy` | EntityRathol | `ratholEnabled` |
| ENT-037 | 304 | `carrier_light` | EntityGothol | `gotholEnabled` |
| ENT-038 | 5 | `buglin` | EntityLodo | `lodoEnabled` |
| ENT-039 | 11 | `carrier_flying` | EntityButhol | `butholEnabled` |
| ENT-040 | 12 | `rupter` | EntityMudo | `mudoEnabled` |
| ENT-041 | 23 | `movingflesh` | EntityLesh | `true` (siempre) |
| ENT-042 | 36 | `worker` | EntityKol | `kolEnabled` |
| ENT-043 | 76 | `mangler` | EntityNuuh | `nuuhEnabled` |
| ENT-044 | 91 | `gnat` | EntityAta | `true` |
| ENT-045 | 16 | `beckon_si` | EntityVenkrol | `true` |
| ENT-046 | 18 | `beckon_sii` | EntityVenkrolSII | `true` |
| ENT-047 | 19 | `beckon_siii` | EntityVenkrolSIII | `true` |
| ENT-048 | 41 | `beckon_siv` | EntityVenkrolSIV | `true` |
| ENT-049 | 74 | `dispatcherten` | EntityDodT | `true` |
| ENT-050 | 73 | `dispatcher_si` | EntityDod | `true` |
| ENT-051 | 77 | `dispatcher_sii` | EntityDodSII | `true` |
| ENT-052 | 78 | `dispatcher_siii` | EntityDodSIII | `true` |
| ENT-053 | 79 | `dispatcher_siv` | EntityDodSIV | `true` |
| ENT-054 | 29 | `kyphosis` | EntityTonro | `tonroEnabled` |
| ENT-055 | 30 | `sentry` | EntityUnvo | `unvoEnabled` |
| ENT-056 | 72 | `seizer` | EntityNak | `true` |
| ENT-057 | 308 | `worm` | EntityRof | `true` |
| ENT-058 | 39 | `incompleteform_small` | EntityInhooS | `inhooSEnabled` |
| ENT-059 | 43 | `incompleteform_medium` | EntityInhooM | `inhooMEnabled` |
| ENT-060 | 48 | `host` | EntityHost | `hostEnabled` |
| ENT-061 | 75 | `hostii` | EntityHostII | `herdEnabled` |
| ENT-062 | 62 | `crux` | EntityCrux | `cruxaEnabled` |
| ENT-063 | 80 | `thrall` | EntityMes | `thrallEnabled` |
| ENT-064 | 51 | `ada_longarms` | EntityShycoAdapted | `shycoEnabled` |
| ENT-065 | 52 | `ada_manducater` | EntityHullAdapted | `hullEnabled` |
| ENT-066 | 54 | `ada_reeker` | EntityNoglaAdapted | `noglaEnabled` |
| ENT-067 | 55 | `ada_yelloweye` | EntityEmanaAdapted | `emanaEnabled` |
| ENT-068 | 53 | `ada_summoner` | EntityCanraAdapted | `canraEnabled` |
| ENT-069 | 56 | `ada_bolster` | EntityBanoAdapted | `zetmoEnabled` |
| ENT-070 | 58 | `ada_arachnida` | EntityRanracAdapted | `arachnidaEnabled` |
| ENT-071 | 9 | `overseer` | EntityAlafha | `alafhaEnabled` |
| ENT-072 | 25 | `vigilante` | EntityAnged | `angedEnabled` |
| ENT-073 | 33 | `warden` | EntityGanro | `ganroEnabled` |
| ENT-074 | 47 | `bomber_light` | EntityOmboo | `ombooEnabled` |
| ENT-075 | 50 | `marauder` | EntityEsor | `esorEnabled` |
| ENT-076 | 84 | `monarch` | EntityOrch | `orchEnabled` |
| ENT-077 | 60 | `grunt` | EntityFlog | `flogEnabled` |
| ENT-078 | 65 | `bomber_heavy` | EntityJinjo | `jinjoEnabled` |
| ENT-079 | 85 | `wraith` | EntityElvia | `elviaEnabled` |
| ENT-080 | 86 | `bogle` | EntityLencia | `lenciaEnabled` |
| ENT-081 | 87 | `haunter` | EntityPheon | `pheonEnabled` |
| ENT-082 | 88 | `carrier_colony` | EntityVesta | `vestaEnabled` |
| ENT-083 | 89 | `succor` | EntityFlam | `true` |
| ENT-084 | 82 | `seeker` | EntitySoo | `true` |
| ENT-085 | 90 | `architect` | EntityTenn | `true` |
| ENT-086 | 24 | `anc_dreadnaut` | EntityOronco | `oroncoEnabled` |
| ENT-087 | 20 | `anc_overlord` | EntityTerla | `terlaEnabled` |
| ENT-088 | 34 | `anc_pod` | EntityDropPod | `true` |
| ENT-089 | 35 | `anc_dreadnaut_ten` | EntityOroncoTen | `oroncoEnabled` |
| ENT-090 | 63 | `heed` | EntityHeed | `heedEnabled` |
| ENT-091 | 1 | `pri_longarms` | EntityShyco | `shycoEnabled` |
| ENT-092 | 7 | `pri_manducater` | EntityHull | `hullEnabled` |
| ENT-093 | 10 | `pri_reeker` | EntityNogla | `noglaEnabled` |
| ENT-094 | 4 | `pri_yelloweye` | EntityEmana | `emanaEnabled` |
| ENT-095 | 8 | `pri_summoner` | EntityCanra | `canraEnabled` |
| ENT-096 | 17 | `pri_bolster` | EntityBano | `zetmoEnabled` |
| ENT-097 | 37 | `pri_tozoon` | EntityWymo | `true` |
| ENT-098 | 38 | `pri_arachnida` | EntityRanrac | `arachnidaEnabled` |
| ENT-099 | 66 | `pri_devourer` | EntityLum | `lumEnabled` |
| ENT-100 | 92 | `pri_vermin` | EntityIki | `true` |

> **Nota de conteo:** las 11 entidades primitivas (ENT-090…ENT-100: `heed` + `pri_*`) se registran con color hex `0x404040` y aparecen en una segunda pasada de `CreateEntityMob`. Total de mobs = 78 + 11 = **100**.

### 4.2 Proyectiles y entidades de efecto (ENT-101 … ENT-125)

| ID | id | Registry name | Clase |
|---|---|---|---|
| ENT-101 | 111 | `pullingball` | EntityProjectilePullball |
| ENT-102 | 101 | `webball` | EntityProjectileWebball |
| ENT-103 | 102 | `spineball` | EntityProjectileSpineball |
| ENT-104 | 110 | `nadeball` | EntityProjectileNade |
| ENT-105 | 103 | `salivaball` | EntityProjectileAlafhaBall |
| ENT-106 | 104 | `ballball` | EntityProjectileAngedball |
| ENT-107 | 105 | `ancientball` | EntityProjectileAncientball |
| ENT-108 | 106 | `homming` | EntityProjectileHomming |
| ENT-109 | 107 | `antiinfestedblock` | EntityThrowableAntiInfestedBlock |
| ENT-110 | 108 | `biomassball` | EntityProjectileBiomass |
| ENT-111 | 109 | `missile` | EntityProjectileDragonE |
| ENT-112 | 112 | `balltall` | EntityProjectileElviaBall |
| ENT-113 | 113 | `ballmall` | EntityProjectileLenciaBall |
| ENT-114 | 210 | `orb` | EntityScaryOrb |
| ENT-115 | 208 | `source` | EntitySource |
| ENT-116 | 209 | `remain` | EntityRemain |
| ENT-117 | 203 | `bomb` | EntityBomb |
| ENT-118 | 207 | `cloudtoxic` | EntityToxicCloud |
| ENT-119 | 205 | `biomass` | EntityBiomass |
| ENT-120 | 204 | `gore` | EntityGore |
| ENT-121 | 202 | `tendril` | EntityTendril |
| ENT-122 | 206 | `scent` | EntityParasiticScent |
| ENT-123 | 211 | `wave` | EntityWave |
| ENT-124 | 213 | `waveshock` | EntityWaveShock |
| ENT-125 | 212 | `nade` | EntityNade |

**TileEntities:** `TileEntityCanister` (`srparasites:tileentitycanister`, `TileEntityLockableLoot`+`ITickable`, inventario `IItemHandler`), `TileEntityDod` (`srparasites:tileentitydod`, `ITickable`, lógica de nodo/reforzador). → `ENT-TE-001`, `ENT-TE-002`.

Detalle de jerarquía, IA, NBT y sync en `reports/analysis_entities.md`.

---

## 5. Sonidos, pociones, biomas y fluidos

### 5.1 SoundEvents — 207 (SND-001 … SND-207)
Fuente `init/SRPSounds.java` (declaración `public static SoundEvent NAME;`). Agrupados por prefijo (los 207 nombres completos están en el archivo):

| ID | Grupo | Nº | Ejemplos |
|---|---|---|---|
| SND-001 | `EVPHASE*` | 10 | fases de evolución |
| SND-002 | `INFECTED*` | ~20 | `INFECTEDHUMAN_DEATH/GROWL/HURT`, `INFECTEDHORSE_SA1/SA2` |
| SND-003 | `*_DEATH/_GROWL/_HURT` por mob | ~110 | `HIGOLEM_*`, `HULL_*`, `IKI_*`, `CANRA_*`, `LUM_*`, `ARANRAC_*`, `SHYCO_*` |
| SND-004 | adaptados (`A*`/`AEMANA`…) | ~25 | `ACANRA_*`, `AEMANA_*`, `AHULL_*`, `ANOGLA_*`, `ASHYCO_*`, `AZETMO_*` |
| SND-005 | nexos (`VENKROLSI..SIV`, `DODSI..SIV`) | ~15 | refuerzo/nodo |
| SND-006 | bloques/entorno | ~15 | `BLOCKINFEST_*`, `NODE`, `COLONY`, `BHEART`, `CYST`, `TENDRIL`, `SCENTWAVE`, `MOBEXPLOTION`, `HITGROUND`, `SWIPE`, `ADAPTATION_*`, `ORB_*` |
| SND-007 | otros | ~12 | `MOBSILENCE`, `MONSTER`, `SMALL`, `RATHOL`, `BUTHOL`, `DORPA`, `ADAPTED`, `NADE`, `FLESH_*` |

`sounds.json` contiene 207 entradas; 373 archivos `.ogg` en `assets/srparasites/sounds/`.

### 5.2 Pociones y PotionTypes (POT)
Fuente `init/SRPPotions.java`.

| ID | Efecto (`Potion`) | PotionType |
|---|---|---|
| POT-001 | `COTH_E` | `COTH_P` |
| POT-002 | `FEAR_E` | `FEAR_P` |
| POT-003 | `RES_E` | `RES_P` |
| POT-004 | `BLEED_E` | — |
| POT-005 | `CORRO_E` | `CORRO_P` |
| POT-006 | `VIRA_E` | `VIRA_P` |
| POT-007 | `RAGE_E` | `RAGE_P` |
| POT-008 | `EPEL_E` | `EPEL_P` |
| POT-009 | `SENS_E` | `SENS_P` |
| POT-010 | `PREY_E` | — |
| POT-011 | `DEBAR_E` | `DEBAR_P` |
| POT-012 | `DLER_E` | — |
| POT-013 | `FOSTER_E` | `FOSTER_P` |
| POT-014 | `LINK_E` | `LINK_P` |
| POT-015 | `PIVOT_E` | `PIVOT_P` |

Clase base `potion/SRPEffectBase`. → 15 efectos, 12 tipos. Migrar a `MobEffect` + `MobEffectInstance` (Forge 1.20.1); `Potion.getPotionFromResourceLocation` → `ForgeRegistries.MOB_EFFECTS`.

### 5.3 Bioma (BIO-001) y Fluido (FLU-001)

| ID | Elemento | Evidencia | Estado |
|---|---|---|---|
| BIO-001 | `srparasites:biome_parasite` (`BiomeInfestedPlain`, `Type.SPOOKY`, `BiomeType.COOL`, peso `SRPConfigWorld.biomeweight`) | `init/SRPBiomes.java`, `world/biome/BiomeParasite.java`, `BiomeParasiteDecorator.java` | PENDIENTE |
| FLU-001 | `deadblood` (`DeadBloodFluid`, bloque `DeadBlood`, universal bucket) | `init/SRPFluids.java`, `fluid/DeadBloodFluid.java` | PENDIENTE |

---

## 6. Red y comandos

### 6.1 Paquetes — 8 (PKT)
Fuente `util/handlers/SRPPacketHandler.java`; canal `"SRParasites"`.

| ID | Clase | Lado | Propósito |
|---|---|---|---|
| PKT-001 | `SRPPacketMeleeRange` | SERVER | rango de ataque melee |
| PKT-002 | `SRPPacketEntityBodyHit` | SERVER | golpe a parte de cuerpo (multipart) |
| PKT-003 | `SRPPacketBiomeChange` | CLIENT | cambio de bioma en chunk |
| PKT-004 | `SRPPacketMovingSound` | CLIENT | sonido posicional en movimiento |
| PKT-005 | `SRPPacketParticle` | CLIENT | partículas de estado |
| PKT-006 | `SRPPacketEntityBodyDead` | CLIENT | muerte de parte de cuerpo |
| PKT-007 | `SRPPacketFog` | CLIENT | niebla del bioma |
| PKT-008 | `SRPPacketCompass` | CLIENT | brújula de nodo/colonia |

### 6.2 Comandos — 4 (CMD)
Fuente `proxy/CommonProxy.serverInit`.

| ID | Clase | Raíz |
|---|---|---|
| CMD-001 | `SRPCommandEvolution` | evolución (ver/forzar fase/puntos) |
| CMD-002 | `SRPCommandNode` | nodos |
| CMD-003 | `SRPCommandColony` | colonias |
| CMD-004 | `SRPCommandRoot` | comando raíz/ayuda |

---

## 7. Configuración (CFG)

Fuente `util/config/`. 4 archivos `.cfg`, **1629 campos públicos** en total.

| ID | Archivo | Campos | Categorías clave |
|---|---|---|---|
| CFG-001 | `SRPConfig.java` (899 líneas) | 310 | `configuration_general`, `parasite_properties`, `parasite_properties_{assimilated,feral,primitive,adapted,pure,preeminent,ancient,nexus,deterrent}`, `tools` |
| CFG-002 | `SRPConfigMobs.java` (2280 líneas) | 837 | 82 categorías (una por id de entidad) + `reinforcement_system` de refuerzo |
| CFG-003 | `SRPConfigSystems.java` (1000 líneas) | 399 | `reinforcement_system`, `merge_System`, `status_effects`, `parasite_evolution_phases_0..10`, `parasite_collective_consciousness_scent_lvl_0..8`, `parasite_ubiquitous_development` (vacía) |
| CFG-004 | `SRPConfigWorld.java` (231 líneas) | 83 | `world_biome`, `world_colony` |

**Bugs/particularidades a preservar o corregir con cuidado:** clave duplicada `"Global Damage Multiplier"` (`globalDamageMultiplier` y `globalKDResistanceMultiplier`); `worldGnatCap` con default de `worldMobCap`; `TOTALDEVELOPMENT_CATEGORY` sin opciones; cabeceras de categoría sin valores (`configuration_mobs/systems/world`). Detalle en `reports/analysis_config.md`.

---

## 8. Persistencia, worldgen y spawn

### 8.1 Persistencia

| ID | Elemento | Evidencia | Equivalente 1.20.1 | Estado |
|---|---|---|---|---|
| CFG-DATA-001 | `SRPSaveData` (`srparasites_global_data`, `getMapStorage`) | `world/SRPSaveData.java` | `SavedData` anclado a Overworld + `DataStorage` | PENDIENTE |
| CFG-DATA-002 | `SRPWorldData` (`srparasites_data`, `getPerWorldStorage`) | `world/SRPWorldData.java` | `SavedData` por `ServerLevel` | PENDIENTE |

### 8.2 Worldgen — 18 features (GEN)

| ID | Clase | Estructura `.nbt` |
|---|---|---|
| GEN-001 | `WorldGenParasiteBall` | `ball` |
| GEN-002 | `WorldGenParasiteBigBall` | `ballbig` |
| GEN-003 | `WorldGenParasiteBush` | — |
| GEN-004 | `WorldGenParasiteColonyB1` | — |
| GEN-005 | `WorldGenParasiteColonyB2` | — |
| GEN-006 | `WorldGenParasiteColonyB3` | — |
| GEN-007 | `WorldGenParasiteColonyBase` | — |
| GEN-008 | `WorldGenParasiteColonyBS1` | — |
| GEN-009 | `WorldGenParasiteColonyCore` | — |
| GEN-010 | `WorldGenParasiteGenAbstract` (abstracta) | — |
| GEN-011 | `WorldGenParasiteMouth` | — |
| GEN-012 | `WorldGenParasiteNodeCore` | — |
| GEN-013 | `WorldGenParasiteSpine` | — |
| GEN-014 | `WorldGenParasiteTallFlower` | — |
| GEN-015 | `WorldGenParasiteTenFlower` | — |
| GEN-016 | `WorldGenParasiteTree` | — |
| GEN-017 | `WorldGenParasiteTreeAbstract` (abstracta) | — |
| GEN-018 | `WorldGenParasiteTreeThin` | — |

Registro: `WorldGenCustomStructures implements IWorldGenerator` (peso 0, `generate()` vacío; colocación real en `generateInPosition(...)`). Plantillas `.nbt`: `ball.nbt`, `ballbig.nbt`, `box.nbt` (**`box.nbt` sin referencia confirmada** → RES-003, posible huérfano).

### 8.3 Spawn

- `init/SRPSpawning.java` (574 líneas): listas `PHASEZERO..PHASETEN`, `addSpawn`, `getSpawns(byte)`, `initBiome()`.
- `SRPEventHandlerBus.onSpawn` (`LivingSpawnEvent.CheckSpawn`): mob caps (`worldMobCap`, `worldMobCapPlusPlayer`, `worldGnatCap`), bloqueos de evolución/colonia, `canSpawninPhase`.
- `world/SRPWorldEntitySpawner.findChunksForSpawning(...)` invocado desde `SRPEventHandlerBus.worldTick` → `tickSpawn` (forzado cada 400 ticks).
- Tick global `serverTick` → `ParasiteEventWorld.checkNodeStatus`/`checkColonyStatus` por dimensión configurada.

### 8.4 Explosiones

`world/SRPExplosion` (vigente) y `world/SRPExplotion` (`@Deprecated`); ambas extienden `net.minecraft.world.Explosion` y capturan inventario de bloques. Punto de entrada `ParasiteEventEntity.createExplosion(...)`.

---

## 9. Cliente (REN / MOD / PRT)

| ID | Grupo | Nº | Detalle |
|---|---|---|---|
| REN-001 | Renderers de entidad | 127 (+`client/SRPProjectile`) | bases `RenderMalleable`, `RenderCosmical`; registro en `SRPRenderHandler.registryEntityRenders()` |
| REN-002 | Capas | 3 | `LayerGlowing`, `LayerSnow`, `SRPLayerBipedArmor` |
| MOD-001 | Modelos | 129 | todos box-based (`ModelRenderer`/`addBox`), base `ModelSRP`; mayores: `ModelOronco` (~3609 líneas), `ModelHeed`, `ModelHeblu`, `ModelDodSIV` |
| PRT-001 | Partículas | 7 | `ParticleFog`, `ParticleSpore`, `ParticleRGBSmoke`, `ParticleMultipleGore`, `ParticleRHappy`, `ParticleBiomass`, `ParticleEen` + `ParticleSpawner` + `SRPEnumParticle` |
| REN-003 | Registro de modelos ítem/bloque | — | `SRPRegisterModels` (`ModelRegistryEvent`, `ModelLoader.setCustomModelResourceLocation`, `ItemMeshDefinition`/`StateMapperBase` para `DeadBlood`) |
| REN-004 | TileEntityRenderers | 0 | no existen |

Detalle en `reports/analysis_client.md`.

---

## 10. Recursos / assets (RES)

| ID | Grupo | Nº | Ruta |
|---|---|---|---|
| RES-001 | blockstates | 34 | `assets/srparasites/blockstates` |
| RES-002 | modelos | 398 | `assets/srparasites/models` |
| RES-003 | texturas | 624 (621 `.png`) | `assets/srparasites/textures` |
| RES-004 | sonidos `.ogg` | 373 | `assets/srparasites/sounds` |
| RES-005 | `sounds.json` | 207 entradas | `assets/srparasites/sounds.json` |
| RES-006 | idioma | 27 | `assets/srparasites/lang` |
| RES-007 | recetas | 20 (formato 1.12.2) | `assets/srparasites/recipes` |
| RES-008 | loot tables | 1 | `assets/srparasites/loot_tables` |
| RES-009 | estructuras `.nbt` | 3 | `assets/srparasites/structures` |
| RES-010 | metadatos | `mcmod.info`, `pack.mcmeta` (format 3) | raíz del JAR |
| RES-011 | partículas JSON | 0 | no hay `particles/` (atlas propio por código) |

Migración de assets: `pack_format` 3 → 15; `mcmod.info` → `mods.toml`; recetas/loot a datapack; blockstates/modelos JSON con `ModelResourceLocation`; atlas de partículas (`textures/particle/*.json`).

---

## 11. Matriz de mapeo de API 1.12.2 → 1.20.1

| 1.12.2 | 1.20.1 | Afecta a |
|---|---|---|
| `net.minecraft.entity.mob.EntityMob` / `EntityLiving` | `Monster` / `LivingEntity` (paquete `world.entity.*`) | toda la jerarquía de entidades |
| `EntityCreature` | `PathfinderMob` | navegación |
| `EntityAIBase` / `EntityAITarget` | `Goal` / `TargetGoal` (`goalSelector`/`targetSelector`) | 31 goals |
| `EntityDataManager.createKey` + `entityInit` | `SynchedEntityData.defineId` + `defineSynchedData` | todos los `DataParameter` |
| `NBTTagCompound`/`NBTTagList` | `CompoundTag`/`ListTag` | NBT |
| `writeEntityToNBT`/`readEntityFromNBT` | `addAdditionalSaveData`/`readAdditionalSaveData` | entidades/tiles |
| `IEntityLivingData onInitialSpawn(...)` | `SpawnGroupData finalizeSpawn(...)` | spawn |
| `SharedMonsterAttributes` | `Attributes` + `AttributeSupplier` | atributos |
| `DamageSource.setDamageBypassesArmor` | `DamageSource` con flag (inmutable) | combate |
| `Potion`/`PotionEffect` | `MobEffect`/`MobEffectInstance` | 15 efectos |
| `EntityPlayer`/`EntityPlayerMP` | `Player`/`ServerPlayer` | comandos/interacción |
| `EntityFireball`/`EntityThrowable` | `Projectile` modernos | proyectiles |
| `EnumParticleTypes` | `ParticleTypes` + `ParticleProvider` | partículas |
| `Render<T>`/`RenderLiving<T>` | `EntityRenderer<T>`/`LivingEntityRenderer<T,M>` | 127 renderers |
| `IRenderFactory`+`RenderingRegistry` | `EntityRenderersEvent.RegisterRenderers` | registro render |
| `ModelBase`/`ModelRenderer` | `EntityModel<T>`/`ModelPart`+`LayerDefinition` | 129 modelos |
| `GlStateManager`/`Tessellator` | `PoseStack`/`MultiBufferSource`/`VertexConsumer` | render |
| `LayerRenderer` | `RenderLayer` | 3 capas |
| `net.minecraftforge.common.config.Configuration` | `ForgeConfigSpec` (TOML) | 4 configs |
| `WorldSavedData` + `MapStorage` | `SavedData` + `DataStorage` | 2 datos |
| `IWorldGenerator` | `Feature`/`PlacedFeature`/`BiomeModifier` | 18 features |
| `BiomeDictionary`/`BiomeManager` | tags de bioma + datapack | bioma |
| `DimensionManager.getWorld(i)` | `MinecraftServer.getLevel(ResourceKey<Level>)` | nodos/colonias |
| `ITickable` | `Tickable`/`BlockEntityTicker` | 2 tiles |
| `GameRegistry.registerTileEntity` | `DeferredRegister<BlockEntityType<?>>` | 2 tiles |
| `SimpleNetworkWrapper` | `SimpleChannel` | 8 paquetes |
| `net.minecraftforge.fml.relauncher.Side` | `net.minecraftforge.api.distmarker.Dist` | cliente |
| `ResourceLocation(String,String)` | `ResourceLocation.fromNamespaceAndPath` | registro |

---

## 12. Pendientes, bloqueados y no aplica

### 12.1 PENDIENTE (totalidad de la migración)
Todo el mod: SYS-001…025, BLK-001…030, ITM-001…008 (146 ítems), ENT-001…125 + 2 tiles, SND-001…207, POT-001…015, PKT-001…008, CMD-001…004, BIO-001, FLU-001, GEN-001…018, CFG-001…004, REN-001…004, MOD-001, PRT-001, RES-001…011.

### 12.2 BLOQUEADO
Ninguno por ahora. Dependencias externas a decidir antes de Fase B: versión exacta de Forge 47.x, mappings oficiales (Parchment/`official`) y herramienta de datagen.

### 12.3 NO APLICA
| Elemento | Razón |
|---|---|
| Coremods/ASM/Mixin/AT | no existen en el mod |
| GUIs/Containers propios | 0 detectados |
| Keybindings | 0 detectados |
| Capabilities propias | 0 detectadas (solo `IItemHandler` del tile) |
| `box.nbt` | sin referencia confirmada (**[NO VERIFICADO]**) |
| Universal bucket (`FluidRegistry.enableUniversalBucket`) | API eliminada |

### 12.4 Incertidumbres a resolver en Fase A/B
- `EntitySoo`/`EntityTenn` (en `pure/preeminent/`) extienden `EntityPPure`, y `EntityVesta` usa `type=31` siendo preeminent: posibles inconsistencias, no confirmadas como bugs.
- El byte `type` no es monótono (p. ej. `Heblu=14`, `Dorpa=14`): la lógica por rangos (`type<11`, `type>=31`) debe re-verificarse.
- NBT propio de `EntityPRooster` no extraído en esta pasada.
- `SRPEnumParticle`/`ParticleSpawner` instancian partículas directamente; los `IParticleFactory` internos no se registran.

---

## 13. Próximos pasos

1. **Confirmar alcance con el usuario** antes de la Fase B: ¿solo descompilar + inventariar, o iniciar la migración real?
2. Si se migra: crear workspace Forge 1.20.1 desde el MDK 47.x (Java 17), fijar versión y registrar hashes en `BUILD_ENVIRONMENT.md`.
3. Redactar los entregables restantes de Fase A: `FEATURE_SPEC.md` (flujos trigger→validación→mutación→efectos→sync→persistencia) y `DEPENDENCIES.md`.
4. Opcional (autorizado por el usuario): desplegar un Minecraft headless para pruebas (`runClient`/`runServer`).

### Entregables del manual (estado)
| Entregable | Estado |
|---|---|
| `MIGRATION_INVENTORY.md` | **ESTE DOCUMENTO** (Fase A, cobertura razonable) |
| `FEATURE_SPEC.md` | **REDACATADO** — `reports/FEATURE_SPEC.md` (54 features con flujos) |
| `DEPENDENCIES.md` | **REDACATADO** — `DEPENDENCIES.md` (plataforma, integraciones, assets) |
| `BUILD_ENVIRONMENT.md` | **REDACATADO** — `BUILD_ENVIRONMENT.md` (Fase B: Java 17, Forge 47.4.10, Gradle 8.8, validado) |
| `MIGRATION_DECISIONS.md` | PENDIENTE (plantilla en manual §13.1) |
| `TEST_REPORT.md` | PENDIENTE (plantilla en manual §13.2) |
| `COMPATIBILITY.md` | PENDIENTE |

---

## Anexo A. Artefactos y rutas de trabajo

| Ruta | Contenido |
|---|---|
| `srparasites/extracted/` | JAR extraído (assets, clases, metadatos) |
| `srparasites/decompiled/srg/` | Descompilación cruda CFR con nombres SRG (preservada) |
| `srparasites/decompiled/mcp/` | Código legible SRG→MCP (fuente primaria) |
| `srparasites/manual/manual_migracion.md` | Manual de migración en texto |
| `srparasites/reports/analysis_entities.md` | Jerarquía, IA, NBT, sync de entidades |
| `srparasites/reports/analysis_client.md` | Renderers, modelos, partículas, registro de modelos |
| `srparasites/reports/analysis_config.md` | 4 configs, 82 categorías, bugs detectados |
| `srparasites/reports/analysis_world.md` | Persistencia, bioma, worldgen, spawn, explosiones |
| `srparasites/reports/remap_srg_to_mcp.ps1` | Script de remapeo reutilizable |
| `srparasites/MIGRATION_INVENTORY.md` | Este inventario maestro |

**Originales (no modificar):** `A:\Descargas\SRParasites-1.12.2v1.9.21.jar`, `A:\Descargas\Manual_Migracion_Minecraft_Forge_1.12.2_a_1.20.1.pdf`.
