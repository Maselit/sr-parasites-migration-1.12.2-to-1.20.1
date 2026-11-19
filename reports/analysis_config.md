# Análisis del sistema de configuración — Scape and Run: Parasites (Forge 1.12.2)

Mod: `com.dhanantry.scapeandrunparasites` — versión de config declarada en los comentarios: **1.9.21**.
Archivos analizados (solo lectura):

- `util/config/SRPConfig.java` (899 líneas)
- `util/config/SRPConfigMobs.java` (2280 líneas)
- `util/config/SRPConfigSystems.java` (1000 líneas)
- `util/config/SRPConfigWorld.java` (231 líneas)

---

## 1. Mecanismo general

- Usa `net.minecraftforge.common.config.Configuration` (API de Forge 1.12.2, hoy eliminada).
- Se instancian **cuatro** objetos `Configuration` en `CommonProxy` (`proxy/CommonProxy.java`):
  - `CommonProxy.config` → `srparasites/SRParasites.cfg`
  - `CommonProxy.configSistems` → `srparasites/SRParasitesSystems.cfg`
  - `CommonProxy.configMobs` → `srparasites/SRParasitesMobs.cfg`
  - `CommonProxy.configWorld` → `srparasites/SRParasitesWorld.cfg`
- Ruta: `new File(e.getModConfigurationDirectory().getPath(), "srparasites/<archivo>.cfg")`.
- Ciclo de vida (en `CommonProxy.preInit`): `SRPConfig.initConfig(e)` → `SRPConfigSystems.initConfig(e)` → `SRPConfigMobs.initConfig(e)` → `SRPConfigWorld.initConfig(e)`. En `postInit` se llama `config.save()` para los cuatro.
- Patrón por archivo: `initConfig(FMLPreInitializationEvent)` crea el `Configuration`, y `readConfig()` hace `cfg.load()` → ejecuta los `initXxxConfig(cfg)` → en `finally` guarda si `cfg.hasChanged()`. Errores se registran con `SRPMain.logger.log(Level.ERROR, "Problem loading configuration file", e)`.
- Tipos de valor usados: `getBoolean`, `getInt`, `getFloat` (con min/max), `getString`, `getStringList` (→ `String[]`), y `cfg.get(cat, key, int[], comment).getIntList()` (→ `int[]`). Comentarios de categoría con `addCustomCategoryComment`.
- **Categorías top-level** declaradas como constantes: `configuration_general`, `configuration_mobs`, `configuration_systems`, `configuration_world`. Salvo `configuration_general` (que sí contiene las opciones generales), las otras tres **solo contienen el comentario de cabecera** (`initGeneralMobsConfig`, `initGeneralSistemsConfig`, `initGeneralWorldConfig` no definen valores): las opciones reales se reparten en subcategorías.

---

## 2. `SRPConfig.java`

Contiene la configuración general, las "propiedades" de cada versión/etapa parasitaria, el sistema nexus/deterrent y las armas/armaduras.

### 2.1 Categorías reales (constantes privadas)

| Constante | Valor de categoría |
|---|---|
| `CATEGORY_GENERAL` | `configuration_general` |
| `PROPERTIES_GENERAL` | `parasite_properties` |
| `PROPERTIES_GENERALSIM` | `parasite_properties_assimilated` |
| `PROPERTIES_GENERALFERAL` | `parasite_properties_feral` |
| `PROPERTIES_GENERALPRI` | `parasite_properties_primitive` |
| `PROPERTIES_GENERALADA` | `parasite_properties_adapted` |
| `PROPERTIES_GENERALPUR` | `parasite_properties_pure` |
| `PROPERTIES_GENERALPRE` | `parasite_properties_preeminent` |
| `PROPERTIES_GENERALANC` | `parasite_properties_ancient` |
| `PROPERTIES_GENERALNEX` | `parasite_properties_nexus` |
| `PROPERTIES_GENERALTURR` | `parasite_properties_deterrent` |
| `GEAR_CATEGORY` | `tools` |

### 2.2 Opciones generales (`configuration_general`) — variables y defaults

- `allowMobs` = `true` — activar/desactivar todos los mobs.
- `globalHealthMultiplier` = `1.0f`, `globalArmorMultiplier` = `1.0f`, `globalDamageMultiplier` = `1.0f`, `globalKDResistanceMultiplier` = `1.0f` — multiplicadores globales (rango 0.01–100).
- `blackListedDimensions` = `{-1, 1}` + `blackListedDimensionsWhite` = `false`.
- `entitiesWillAttack` = `{"minecraft:villager_golem"}` / `entitiesWillAttackWhite` = `false`.
- `entitiesWillAvoid` = `{"minecraft:villager"}` / `entitiesWillAvoidWhite` = `false`.
- `vanillaEggs` = `false`, `ignoreL` = `false`, `spawnDays` = `0`, `dayTickValue` = `24000`.
- `thunderEnable` = `true`, `easterEggs` = `true`, `useVinniT` = `false`.
- `blockParticleChance` = `0.05`, `blockDropChance` = `0.05`, `blockSoundChance` = `0.05`, `parasiteNameTagChance` = `1.0`.
- `mobsKilledDropLoot` = `true`.

### 2.3 Propiedades (`parasite_properties`) — lo más relevante

- Loot/residuo: `parasiteGenResidue` = `true`, `doTileDrops` = `true`, `paraGore` = `true`, `mobsKilledDropLoot` (general), `cystActive` = `true`, `cystDelay` = `25`, `cystConsumePoint` = `2`, `cystItemBlackList` = `{}`.
- Listas negras/blancas: `mobattacking` = `true`, `mobattackingBlackList` = `{"srmonstress","minecraft:creeper"}`, `mobattackingBlackListWhite` = `false`, `mobAttackingFull` = `false`, `parasiteGriefing` (lista larga de `"id;hardness;cooldown;range"`), `parasiteGriefingBlackList` = `{}`, `parasiteGriefingWhite` = `false`, `parasiteWeakToMobs/Items/Else` = `{}`, `adaptationDimStrong` = `{}`, `damageTypeBlackListMob/Item/Else` + `damageTypeBlackListWhite`, `damageCapBlackListMob/Item/Else` + `damageCapBlackListWhite`, `stackablePotionsLimit` = `{}`.
- Caps globales: `worldMobCap` = `40`, `worldGnatCap` = `20`, `worldMobCapPlusPlayer` = `5`, `incompleteCap` = `10`, `miniminiCap` = `5.0f`, `BlockInfestedLimit` = `1000`, `BlockParasiteLimit` = `2000`, `BlockInfestedLimitCD` = `300`, `BlockParasiteLimitCD` = `300`.
- Combate/adaptación: `canOrbAttack` = `true`, `canTargetBlock` = `true`, `firemultyplier` = `4.0f`, `tendrilHealth` = `0.4`, `fireTickWindow` = `10`, `adaptationNewDamageCooldon` = `20`, `regenTimer` = `80`, `orbFoodMult` = `5`, `variantChance` = `0.33`, `killcountplus` = `0.0`, `convertedDespawn` = `false`, `rsDespawn` = `false`, `explotionDamPara` = `true`.
- Nexus/Deterrent: `reinforcerNidusValue` = `40`, `reinforcerNidusMult` = `3`, `reinforcerNidusStart` = `15`.

### 2.4 Propiedades por versión (subcategorías `parasite_properties_*`)

Cada etapa define un bloque homogéneo de variables. Etapas y algunos defaults:
`infected*` (assimilated), `feral*`, `primitive*`, `adapted*`, `pure*`, `preeminent*`, `ancient*`, `nexus*`, `turret*` (deterrent).

Campos por etapa (patrón): `XPointRed`, `XPointCap`, `XPointDamCap`, `XChanceLe`, `XChanceLeFire`, `XCap` (damage cap = nº mín. de golpes), `Xdespawn`, `XFollow`, `XMinDamage`, `XRegen`, `XOneMindDeathV`, `XXPValue`, `XRemainValue`, `XLoosingEPValue`, `XFoodSteal`, `XItemOrbCooldown`, `XFoodChance`, `XFoodAmount`, `XSneakPen`, `XInviPen`, `XWalls`, y en pure/preeminent `XExpSteal`, `XSeiZ`/`XFlamTotal`.

Ejemplos de defaults (inicializadores de campo y bloque `static`):
- Assimilated: `infectedCap` = `1`, `infectedFollow` = `16.0`, `infectedXPValue` = `8`, `infectedRemainValue` = `10`, `infectedLoosingEPValue` = `1`, `infectedBleedingChance` = `0.2f`, `infectedMinDamage` = `0.5f`, `infectedSneakPen` = `0.8`, `infectedInviPen` = `0.7f`; `feralKills` = `60.0`.
- Feral: `feralCap` = `3`, `feralFollow` = `20.0`, `feralMinDamage` = `0.75f`, `feralXPValue` = `16`.
- Primitive: `primitivePointRed` = `0.05f`, `primitivePointCap` = `12`, `primitivePointDamCap` = `5`, `primitiveChanceLe` = `0.7`, `primitiveCap` = `3`, `primitiveFollow` = `24.0`, `primitiveKills` = `5.0`, `primitiveMinDamage` = `1.0f`, `primitiveRegen` = `0.05f`, `primitiveXPValue` = `30`.
- Adapted: `adaptedPointRed` = `0.1f`, `adaptedPointCap` = `10`, `adaptedChanceLe` = `0.8`, `adaptedChanceLeFire` = `0.5`, `adaptedCap` = `5`, `adaptedFollow` = `32.0`, `adaptedKills` = `10.0`, `adaptedMinDamage` = `1.5f`, `adaptedLoosingEPValue` = `200`.
- Pure (bloque `static`): `purePointRed` = `0.125f`, `purePointCap` = `8`, `purePointDamCap` = `12`, `pureChanceLe` = `0.95`, `pureChanceLeFire` = `0.3`, `pureFollow` = `32.0`, `pureCap` = `7`, `pureMinDamage` = `2.0f`, `pureRegen` = `0.3f`, `pureOneMindDeathV` = `130`, `pureXPValue` = `75`, `pureLoosingEPValue` = `1000`, `pureExpSteal` = `180`, `pureFoodSteal` = `2.0f`, `pureFoodChance` = `0.3`, `pureFoodAmount` = `8`, `pureSeiZ` = `3`.
- Preeminent: `preeminentPointRed` = `0.2f`, `preeminentPointCap` = `5`, `preeminentChanceLe` = `1.0`, `preeminentCap` = `15`, `preeminentFollow` = `80.0`, `preeminentMinDamage` = `4.0f`, `preeminentXPValue` = `200`, `preeminentLoosingEPValue` = `30000`, `preeminentExpSteal` = `340`, `preeminentItemOrbCooldown` = `30`, `preeminentFlamTotal` = `3`.
- Ancient: `ancientPointRed` = `0.1f`, `ancientPointCap` = `10`, `ancientChanceLe` = `0.9`, `ancientChanceLeFire` = `0.1`, `ancientCap` = `5`, `ancientFollow` = `64.0`, `ancientMinDamage` = `2.5f`, `ancientRegen` = `0.3f`, `ancientXPValue` = `5000`, `ancientLoosingEPValue` = `1`.
- Nexus (4 stages I–IV): `nexussiPointRed` = `0.07f`, `nexussiCap` = `4`, `nexussiFollow` = `16.0`, `nexusMinGrowTime` = `240`, `nexusMaxGrowTime` = `300`; `nexussiiCap` = `7`; `nexussiiiCap` = `10`; `nexussivCap` = `15`, `nexussivCapUpgrade` = `30`, `nexussivLoosingEPValue` = `20000`.
- Deterrent (`turret*`): `turretPointRed` = `0.16f`, `turretPointCap` = `6`, `turretPointDamCap` = `10`, `turretCap` = `6`, `turretMinDamage` = `2.0f`, `turretRegen` = `0.3f`, `turretXPValue` = `75`.

### 2.5 Armas y armaduras (categoría `tools`, `GEAR_CATEGORY`)

- Living: `weapon_living_durability` = `1000`, `weapon_livingSentient_HP_needed` = `50000`, `livingDura` = `1000`, `livingHelm` = `4`, `livingChest` = `10`, `livingLegs` = `8`, `livingBoots` = `4`, `livingToughness` = `3.0f`, `livingPointReduction` = `0.0125f`, `livingDamageCap` = `4`, `livingPointCap` = `18`, `livingChanceLe` = `0.2`.
- Sentient: `sentienDura` = `1500`, `sentientHelm` = `5`, `sentientChest` = `12`, `sentientLegs` = `10`, `sentientBoots` = `5`, `sentientToughness` = `4.0f`, `sentientPointReduction` = `0.018f`, `sentientDamageCap` = `7`, `sentientPointCap` = `13`, `sentientChanceLe` = `0.5`.
- Armadura extra: `armorCoth` = `true`, `armorDamageTypeBlackListMob/Else` = `{}`, `armorDamageTypeBlackListWhite` = `false`, `weaponCancelPacket` = `false`.
- Armas (Living / Sentient): `weapon_scythe_damage` = `17` / `weapon_scythe_S_damage` = `34` (range `4.0f`/`5.0f`), `weapon_axe_*` = `21`/`42`, `weapon_sword_*` = `19`/`38` (rango `4.5f`/`6.0f`), `weapon_cleaver_*` = `19`/`38`, `weapon_maul_*` = `21`/`42`, `weapon_lance_*` = `17`/`34`. Greatbow: `weapon_bow_damage` = `1`, `weapon_bow_bonus` = `1`, `weapon_bow_damageCap` = `2`, `weapon_bow_sentient_damage` = `1`, `weapon_bow_sentient_bonus` = `1`, `weapon_bow_sentient_damageCap` = `2`.

---

## 3. `SRPConfigMobs.java`

- Constante de cabecera: `CATEGORY_GENERAL_MOBS = "configuration_mobs"` (solo comentario con la lista de IDs de entidades).
- **Una categoría por mob/etapa**, cuyo nombre es el **id de entidad** (p. ej. `srparasites:longarms`, `srparasites:sim_bigspider`, `srparasites:carrier_heavy`, `srparasites:draconite`). Se declaran como `private static final String XXX_CATEGORY`.
- **Cobertura: 82 constantes de categoría** (una por id/etapa). Agrupando las variantes de etapa en un solo tipo (Beckon I–IV = 1, Dispatcher SI–SIV = 1, Rooter SI–SIV = 1), cubre **~73 tipos de entidad distintos**.
- Cadenas auxiliares para construir claves: `health = " Health Multiplier"`, `damage = " Damage Multiplier"`, `armor = " Armor Multiplier"`, `kd = " Knockback Resistance Multiplier"`, `lootXp` (texto de ayuda del formato de loot).

### 3.1 Patrón de nombres por mob

Cada `initXxxConfig(cfg)` define (según el mob) campos con prefijo corto `X`:

- `XEnabled` (bool) — activar mob.
- `XHealthMultiplier`, `XDamageMultiplier`, `XArmorMultiplier`, `XKDResistanceMultiplier` (float, 0.01–100).
- `XSpawnRate` (int 0–100) y, si tiene etapa adaptada, `XASpawnRate`.
- `XLoot` (`String[]`) con formato `"item;chance;max;roll"`.
- Campos específicos: `XMinDamage`, `XAnimalAttacking`, `XGriefing`, `XMaxY`/`XMinY` (vuelo), `XOrbEffects`, `XEffects`, `XMobList`/`XMobs`, `XSummoningCooldown`, `XTotalActiveMobs`, `XLimit`.
- Campos de etapa adaptada con sufijo `adapted`: `Xadaptedhealth`, `Xadapteddamage`, `Xadaptedarmor`, `Xadaptedkdresistance`, `Xadaptedloot`, `XadaptedOrbEffects`, etc. (p. ej. `shycoadaptedhealth`, `canraadaptedmoblist`).
- Algunos usan nombres fuera de patrón: `LodoLoot` (Buglin, con mayúscula), `inhooS*`/`inhooM*` (Inhoos/Inhoom), `ButholGriefing`.

### 3.2 Ejemplos concretos

1. **Primitive Longarms** — categoría `srparasites:longarms` (`SHYCO_CATEGORY`):
   `shycoEnabled` = `true`, `shycoHealthMultiplier` = `1.0f`, `shycoDamageMultiplier` = `1.0f`, `shycoArmorMultiplier` = `1.0f`, `shycoKDResistanceMultiplier` = `1.0f`, `shycoSpawnRate` = `15`, `shycoASpawnRate` = `15`,
   `shycoLoot` = `{"srparasites:lurecomponent3;60;2;false","srparasites:ada_longarms_drop;40;2;true","srparasites:bone;10;1;true"}`,
   `shycoadaptedhealth` = `50.0f`, `shycoadapteddamage` = `12.0f`, `shycoadaptedarmor` = `7.0f`, `shycoadaptedkdresistance` = `0.3f`.
2. **Buglin** — categoría `srparasites:buglin` (`LODO_CATEGORY`):
   `lodoEnabled` = `true`, `lodoHealthMultiplier` = `1.0f`, `lodoSpawnRate` = `30`, `LodoLoot` = `{}` (sin loot por defecto).
3. **Draconite** — categoría `srparasites:draconite` (`HEBLU_CATEGORY`):
   `hebluEnabled` = `true`, `hebluHealthMultiplier` = `1.0f`, `hebluSpawnRate` = `1`, `hebluLoot` = `{}`.
4. **Heavy Carrier** — categoría `srparasites:carrier_heavy`:
   `ratholEnabled` = `true`, `ratholSpawnRate` = `20`, `ratholGriefing` = `false`, `ratholMobs` = `{"srparasites:rupter;5;4","srparasites:gnat;7;5","srparasites:pri_yelloweye;3;3"}`.

### 3.3 Grupos de refuerzo (dentro del mismo archivo)

Categorías adicionales para estructuras del sistema de refuerzo: `srparasites:beckon_i..iv` (`REINFORCEMENT_CATEGORY_BSI..BSIV`), `srparasites:dispatcher_si..siv` (`REINFORCEMENT_CATEGORY_RSI..RSIV`) y `srparasites:rooter_si..siv` (`REINFORCEMENT_CATEGORY_RTSI..RTSIV`). Campos: `venkrol*`/`venkrolsii*`/`venkrolsiii*`/`venkrolsiv*` (Beckon), `dodsi*`..`dodsiv*` (Dispatcher), `leem*`/`leemsii*`..`leemsiv*` (Rooter); incluyen `*moblist` (`"ground|air;entity;chance;cost"`), `*Loot`, `*Cooldown`, `*TotalActiveMobs`, `*Range`/`*RangeY`, `*Effects`.

- `readConfig()` llama explícitamente a **todas** las funciones `initXxxConfig` (orden fijo, líneas 2183–2264). `initConfig` crea `SRParasitesMobs.cfg`.

---

## 4. `SRPConfigSystems.java`

Constantes de categoría:

| Constante | Categoría |
|---|---|
| `CATEGORY_GENERAL_SISTEMS` | `configuration_systems` (solo comentario: lista de IDs de pociones) |
| `REINFORCEMENT_CATEGORY` | `reinforcement_system` |
| `MERGE_CATEGORY` | `merge_System` |
| `STATUSEFFECTS_CATEGORY` | `status_effects` |
| `EVOLUTION_CATEGORY` | `parasite_evolution_phases` |
| `EVOLUTION_CATEGORY0..10` | `parasite_evolution_phases_0` … `_10` |
| `HIVEMIND_CATEGORY` | `parasite_collective_consciousness` |
| `HIVEMIND_CATEGORY0..8` | `parasite_collective_consciousness_scent_lvl_0` … `_8` |
| `TOTALDEVELOPMENT_CATEGORY` | `parasite_ubiquitous_development` (**sin opciones**, `inittotaldevelopmentConfig` vacío) |

### 4.1 Sistema de refuerzo (RS) — `reinforcement_system`

- `rsEnabled` = `true`, `rsSounds` = `true`, `rschance` = `0.045f` (0–1).
- `rsBlockI` = `true`, `rsBlockIMaxH` = `4.5f`, `rsBlockLight` = `16`, `rsMaxVenkrols` = `100`, `rsCooldown` = `5`, `rsVenkrolChance` = `20000`, `rsIgnoreCooldownAtSpawn` = `true`.
- `rsPlayer` = `false`, `rsSky` = `false`, `rsSkyResidue` = `false`, `rsResidueY` = `0`, `rsVenkrolEmpty` = `0.05`, `rsMaxVenkrolChunk` = `2`, `rsBlockRevertStage` = `1`.
- `optionalBlock` = `"minecraft:gravel"`, `optionalBlockRub` = `"minecraft:mossy_cobblestone"`, `blockBList` = `{}` + `blockBListWhite` = `false`.
- `rsBlockParticleS` = `0.05f`, `rsBlockParticleF` = `0.05f`, `maximumStageList` = `{"1;3"}` (`"dim;stage"`).

### 4.2 Sistema de fusión (merge) — `merge_System`

- `mergeRandom` = `true`, `mergeHealth` = `0.5`, `mergeMobTable` (lista de `"mob;valor"`), `mergeInfValues` (valores de asimilados).

### 4.3 Efectos de estado / pociones — `status_effects`

- Miedo: `fearActive` = `true`, `fearBlockChance` = `0.0f`, `fearItemChance` = `0.0f`, `fearInvChance` = `0.0f`, `fearItemBlackList` = `{}` + `fearItemBlackListWhite`, `fearFallDamage` = `1.5f`, `fearAirDamage` = `1.5f`.
- COTH: `cothActive` = `true`, `cothAura` = `3`, `cothConvert` = `0.3f`, `cothInfected` = `0.7f`, `cothPrimitive` = `0.6f`, `cothAdapted` = `0.5f`, `cothPure` = `0.4f`, `cothUnhide` = `0.3f`, `cothLootDisable` = `true`, `COTHVictimParasite` (tabla víctima→parásito), `COTHImmuneList` (lista larga), `COTHImmuneListWhite` = `false`, `COTHItemPrevent` = `{"minecraft:golden_apple;0.1;300",...}`, `epelChanceCOTH` = `0.7`.
- Hijack/pivot: `hijackHealth` = `0.5f`, `HIJACKVictimParasite`, `pivotDamageRHost` = `0.2375f`, `pivotDamageRNotHost` = `0.05f`, `pivotPointMultiplier` = `2`.
- Otros: `bleedingDamage` = `0.02f`, `bleedingDamageCap` = `100.0f`, `corroValue` = `3`, `corrNot` = `0.1`, `viralEnable` = `true`, `viralAmount` = `0.5f`, `rageEnable` = `true`, `rageDamage` = `0.1`, `rageSpeed` = `0.1`, `needlerDamage` = `0.4f`, `needlerTerminal` = `7`, `needlerMaxDamPlayer`/`needlerMaxDamMonster` = `1.0E9f`, `needlerImmuneList` = `{}` + `needlerImmuneListWhite`, `adapsChance` = `0.2`.

### 4.4 Evolución / fases — `parasite_evolution_phases` y `_0`..`_10`

- `useEvolution` = `true`, `damageStationaryRS` = `true`, `phaseCustomSpawner` = `true`, `evolutionNoPlayerMultipler` = `false`.
- Umbrales de fase (byte, 0–11 salvo indicado): `evolutionNodeUnlock` = `7`, `evolutionColonyUnlock` = `5`, `evolutionSleepDenied` = `6`, `evolutionAssimilatedDehiding` = `5`, `evolutionMudoAttack` = `2`, `evolutionBeckonIgnoreCooldown` = `7`, `evolutionSpawningIgnoreSunlight` = `8`, `evolutionCothStopLoot` = `3`, `evolutionStopFishing` = `4`, `evolutionOneMind` = `5`, `evolutionTotalKill` = `8`, `evolutionFeralNoSim` = `6`, `evolutionNests` = `4`, `evolutionDislodgment` = `6`, `evolutionParasiteAlwaysVariant` = `8`, `evolutionHives` = `9`, `evolutionNoParasiteHealing` = `9` (+`evolutionNoParasiteHealingValue` = `0.5f`), `evolutionPArasitesWithoutXP` = `9`, `evolutionNoParasiteSpawnDenied` = `10`, `evolutionParasiteStatIncrease` = `10` (+`evolutionParasiteStatIncreaseValue` = `0.07f`).
- Puntos/valores: `valueKill` = `1`, `valueCOTH` = `6`, `valueBlock` = `50`, `valueMerge` = `10`, `valueEvolutionDespawn` = `100`, `valueLossBlockStain` = `5`, `valueLossBlockTrunk` = `5`, `valueLossBlockRubble` = `5`.
- Listas: `evolutionDimStart` = `{"-1;-1;50","0;0;0","1;-1;100","270;-1;300"}`, `evolutionDimGain` = `{}` + `evolutionDimGainInverted`, `evolutionDimLoss` = `{}` + `evolutionDimLossInverted`, `evolutionParasiteLock` = `{"1;3;64","-1;7;309","0;4;92"}` + `evolutionParasiteLockMessage` = `"..."`, `blackListedDimensionsEPP` = `{0,1,-1}`.
- Inicio: `defaultEvoPhase` = `-1`, `defaultEvoPoints` = `-100`.
- Por fase 0..10 (`parasite_evolution_phases_N`): `phaseKillsN` (puntos para alcanzar la fase; 400, 800, 1800, 20000, 200000, 5000000, 25000000, 500000000, 1000000000, 1800000000), `phaseKillCountPlusN`, `phaseMaxParasiteIDN`/`phaseCancelParasiteIDN`, `reinforcementSystemChanceN`, `beckonStageI/II/IIIGrowPenaltyN`, `mobSpawningCOTHChanceN`, `cropGrowStunnedN`, `luredValueN`/`luredValueNCool`, `phaseWarningN`, `sleepPenaltyN`, `phaseScentBonusN`, `phaseScentReactionN`, `phaseDelayTicksN` = `1200`, `phaseResidueN`, `phaseSpawnEntryN` (`"entity;min;max;weight;type"`), `NLevelDeploy`. Fase 10 añade `phaseTenTotalPoints` = `2100000000`.

### 4.5 Conciencia colectiva (hivemind) y scents — `parasite_collective_consciousness` (+ `_scent_lvl_0`..`_8`)

- `useOneMind` = `false`, `oneMinRangeCap` = `64`, `oneMindPlayer` = `false`, `oneMindDebug` = `false`, `deleteifnoCC` = `true`, `useScent` = `true`, `scentPlayer` = `false`.
- `scentCap` = `3`, `scentSpacing` = `40`, `scentDeathSpawning` = `0.07`, `minAttriHealth` = `20.0`, `minAttriArmor` = `0.0`, `minAttriDamage` = `4.0`, `minAttriFailCount` = `2`.
- `scentGoActive` = `5`, `scentSpawnWaves` = `12`, `scentMiniDis` = `7`, `scentMaxDis` = `40`, `scentLifeDeath` = `5`, `scentLifeObserver` = `60`, `scentLifeTactical` = `300`.
- Niveles de scent 0..8: `scentLevelZero`..`scentLevelEight` (tablas de mobs), `scentLevelPointsOne..Eight` (10, 25, 75, 150, 150, 240, 360, 500), y `scentWaveMinimumN`/`scentWaveMaximumN`/`scentWaveMinMobWaveN`/`scentWaveMaxMobWaveN`.

---

## 5. `SRPConfigWorld.java`

Constantes: `CATEGORY_GENERAL_WORLD` = `configuration_world` (solo comentario), `WORLDBIOME_CATEGORY` = `world_biome`, `WORLDCOLONY_CATEGORY` = `world_colony`.

### 5.1 Bioma y nodos (`world_biome`)

- Registro/spawn: `biomeRegster` = `true`, `nodesActivated` = `true`, `biomeweight` = `0` (tipo SPOOKY), `biomeBlackList` = `{}` + `biomeBlackListInverted` = `false`.
- Nodos: `maximumNumberNodes` = `20`, `minimumDistanceBetweenNodes` = `10000`, `minimumDistanceFromSpawnPoint` = `1`, `blackListedDimensionsNodes` = `{0,1,-1}`, `nodeWarning` = `"Node"`, `venkrolNode` = `true`.
- Infestación: `blockBBiomeList` = `{}` + `blockBBiomeListWhite` = `false`, `biomeBlockIMaxH` = `60.0f`.
- **Fog y colores**: `biomeFogDensity` = `0.06f`, `biomeFogRed` = `38.0f`, `biomeFogGreen` = `36.0f`, `biomeFogBlue` = `36.0f`; `biomeSkyColor` = `0x2F0000`, `biomeGrassColor` = `0xA60000`, `biomeFoliageColor` = `0xA60000`, `biomeWaterColor` = `0xA60000`.
- Curación/daño: `biomeHealPenalty` = `0.5f`, `biomeHealPenaltyBlackList` = `{"minecraft:villager_golem"}` + `biomeHealPenaltyBlackListWhite` = `false`.
- Generación (chances): `biomeTree` = `0.0015`, `biomeFlower` = `0.001`, `biomeSpine` = `5.0E-4`, `biomeTenflower` = `1.0E-4`, `biomeBall` = `7.0E-5`, `biomeBigBall` = `2.0E-5`, `biomeMouth` = `3.0E-4`, `biomeHeartFreq` = `30`, `biomeHeartVol` = `0.4f`.
- Spawn del bioma: `biomeSpawnEntry` (lista larga `"entity;min;max;weight;type"`), `potionEffectForNodes` = `{"3;minecraft:speed;2","4;minecraft:fire_resistance;1","7;minecraft:invisibility;1"}`.
- Niveles de nodo (1/2/3): `nodeRangeSpreadOne/Two/Three` = `200`/`800`/`4000`, `nodeRangeEffectsOne/Two/Three` = `400`/`1600`/`8000`, `nodeCropStopNodeOne/Two/Three` = `0.3f`/`0.6f`/`1.0f`, `timeNeedeToNodeOne/Two/Three` = `8`/`10`/`40`.

### 5.2 Colonias (`world_colony`)

- `coloniesActivated` = `false`, `maximumNumberColonies` = `20`, `minimumDistanceBetweenColonies` = `2000`, `blackListedDimensionsColonies` = `{0,1,-1}`, `colonyWarning` = `"Colony"`, `dodColony` = `true`, `colonyOutpostDistance` = `2000`.
- Puntos/radio: `colonyPointCap` = `100`, `colonyTotalPointCap` = `100`, `colonySpreadPoint` = `2`, `colonySpreadValue` = `20`, `colonyBaseRadiusValue` = `60`, `colonySpreadEffectPoint` = `1`, `colonySpreadEffectValue` = `40`, `colonyBaseEffectRadiusValue` = `120`.
- Bonos (pares punto/valor): `colonyExtraHealthPoint` = `20.0f`/`colonyExtraHealthValue` = `0.1f`, `colonyExtraArmorPoint`/`Value` = `20.0f`/`0.1f`, `colonyExtraKDResPoint`/`Value` = `20.0f`/`0.1f`, `colonyExtraDamagePoint`/`Value` = `20.0f`/`0.1f`, `colonyDamageCapPoint`/`Value` = `15.0f`/`0.5f`, `colonyPointReductionPoint`/`Value` = `10.0f`/`0.05f`, `colonyPointBoostPoint`/`Value` = `10.0f`/`0.05f`, `colonyExtraRSChancePoint`/`Value` = `20.0f`/`1.0f`.
- Lista: `preeValues` = `{"65;1","85;1","86;1","87;1","88;1","89;1"}` (`"id;points"`), `preeValuesBiome` = `false`.

---

## 6. Hallazgos para migrar a 1.20.1

1. **API obsoleta**: `net.minecraftforge.common.config.Configuration` se eliminó tras 1.12.2. En 1.13+ (y 1.20.1) se reemplaza por `net.minecraftforge.common.ForgeConfigSpec` + builders (`Builder`, `BooleanValue`, `IntValue`, `LongValue`, `DoubleValue`, `ConfigValue<List<? extends String>>`, `EnumValue`).
2. **Formato**: `.cfg` → **TOML**. Cada opción se declara con `define`, `defineInRange` (int/float/double con min/max), `defineList`/`defineListAllowEmpty` (listas de strings/ints), `defineEnum`. Los comentarios pasan de `addCustomCategoryComment` a `.comment("...")` por opción.
3. **Jerarquía**: las categorías (tablas) se construyen con `builder.push("categoria")` / `builder.pop()`, o con claves separadas por `.`; equivalen 1:1 a las categorías actuales (`configuration_general`, `parasite_properties`, `parasite_properties_*`, `tools`, y por mob el id de entidad, etc.).
4. **Tipos a mapear**: `getFloat(...,min,max)` → `defineInRange(...)` (mantener min/max exactos); `getInt` igual; `getStringList` → `defineList` (`List<String>`); `cfg.get(...,int[]).getIntList()` → `defineList`/`ConfigValue<List<? extends Integer>>`; los campos `byte` de umbral de fase (`evolution*`, `phase*`) se declaran como `IntValue` con rango 0–11 y se castean al leer; `getString` → `define`.
5. **Sin ciclo load/save**: desaparecen `cfg.load()`, `cfg.save()` y `cfg.hasChanged()`. La spec se construye una vez, se registra con `ModLoadingContext.get().registerConfig(ModConfig.Type.XXX, spec)` y se llama a `spec.setConfig(...)`; `ConfigValue.get()` sustituye a los campos `public static` mutables.
6. **Separación CLIENT/COMMON/SERVER** (obligatoria): 
   - `SERVER`/`COMMON`: todo lo de `SRPConfig` (propiedades de mobs, multiplicadores), `SRPConfigSystems` (evolución, RS, merge, hivemind) y `SRPConfigWorld` (bioma, nodos, colonias) — afectan lógica de juego y deben sincronizarse.
   - `CLIENT`: opciones puramente de render (p. ej. colores/fog del bioma) si se quieren exponer al cliente; sin embargo, como los valores se envían por red o se leen en ambos lados, en la práctica gran parte deberá quedar en `COMMON`.
   - `SERVER` impide que el cliente cambie valores de gameplay; hay que decidir qué es realmente solo-cliente.
7. **Compatibilidad de claves**: los nombres de categoría y de clave (incluyendo espacios como `" Health Multiplier"` o `"Mobs Enabled"`) deben preservarse si se quiere ofrecer migración; el TOML no lee automáticamente los `.cfg` antiguos. Recomendado: mantener los mismos nombres, defaults y rangos, y opcionalmente un lector legacy que lea los `.cfg` y vuelque a la nueva spec.
8. **Bugs/particularidades detectados (a preservar o corregir con cuidado)**:
   - En `SRPConfig.initGeneralConfig`, `globalDamageMultiplier` y `globalKDResistanceMultiplier` comparten la **misma clave** `"Global Damage Multiplier"` (colisión de clave; el segundo reutiliza el valor del primero).
   - En `initPropertiesConfig`, `worldGnatCap` se define con default `worldMobCap` (no `worldGnatCap`).
   - Campos declarados pero sin uso visible en la lectura (`pureSeiZ`, `preeminentFlamTotal`, `nexusMinGrowTime`/`MaxGrowTime`, etc.): conservarlos para no romper configs existentes.
   - `TOTALDEVELOPMENT_CATEGORY` (`parasite_ubiquitous_development`) no define ninguna opción.
   - `CATEGORY_GENERAL_MOBS`, `CATEGORY_GENERAL_SISTEMS`, `CATEGORY_GENERAL_WORLD` son solo cabeceras de comentario.
9. **Listas con semántica propia** (deben migrarse como `List<String>` y parsearse igual): loot `"item;chance;max;roll"`, `parasiteGriefing` `"id;hardness;cooldown;range"`, `adaptationDimStrong` `"dim;bonus"`, `maximumStageList` `"dim;stage"`, `evolutionDimStart`/`evolutionParasiteLock` `"dim;fase;puntos|id"`, `phaseSpawnEntry*`/`biomeSpawnEntry` `"entity;min;max;weight;type"`, `preeValues` `"id;puntos"`, orb effects `"mode;duration;amp;potion;div1;div2"`, `mergeMobTable`/`mergeInfValues` `"entity;valor"`.
10. **Registro**: hoy las cuatro configs se crean en `CommonProxy.preInit`. En 1.20.1 el registro debe ocurrir en el constructor del mod (o `FMLCommonSetupEvent`) mediante `ModLoadingContext`, antes de que se lean los valores; además `SRPAttributes.reset()/init()` se llama tras cargar la config y deberá reordenarse.

---

## Resumen

El mod configura todo con la API antigua `net.minecraftforge.common.config.Configuration` repartida en **cuatro archivos `.cfg`** (`SRParasites.cfg`, `SRParasitesMobs.cfg`, `SRParasitesSystems.cfg`, `SRParasitesWorld.cfg`), cada uno con su `initConfig`/`readConfig` y guardado en `postInit`. `SRPConfig` agrupa general/`parasite_properties`/etapas/nexus/`tools` con multiplicadores globales, listas negras-blancas, caps de mobs y valores por versión (assimilated, feral, primitive, adapted, pure, preeminent, ancient, nexus, deterrent) y armas/armaduras. `SRPConfigMobs` genera opciones por mob con el patrón `<prefijo>Enabled/HealthMultiplier/DamageMultiplier/ArmorMultiplier/KDResistanceMultiplier/SpawnRate/Loot` (más sufijo `adapted`), cubriendo **82 categorías por id de entidad (~73 tipos)**. `SRPConfigSystems` cubre refuerzo (RS), merge, efectos de estado/COTH, fases de evolución 0–10 y conciencia colectiva/scents. `SRPConfigWorld` cubre bioma/nodos (incl. fog y colores), colonias y spawn. Para migrar a 1.20.1 hay que reescribir todo con `ForgeConfigSpec`/TOML, separando CLIENT/COMMON/SERVER y preservando nombres de categoría/clave, defaults y rangos; se detectaron colisiones de clave (`Global Damage Multiplier`) y un default erróneo (`Gnat Cap`) que conviene corregir durante la migración.

Archivo generado: `C:\Users\Kevin Aguilar\Documents\Proyecto predeterminado\srparasites\reports\analysis_config.md`
