# Análisis del subsistema ENTIDADES — Jerarquía, IA, Persistencia y Migración

**Mod:** Scape and Run: Parasites (Forge 1.12.2)
**Fuente analizada:** código descompilado con CFR 0.152 (solo lectura; no se ejecutó nada).
**Raíz analizada:**
`C:\Users\Kevin Aguilar\Documents\Proyecto predeterminado\srparasites\decompiled\mcp\com\dhanantry\scapeandrunparasites\entity`
**Paquete base:** `com.dhanantry.scapeandrunparasites.entity`

Todos los nombres de clase/método citados provienen del descompilado. Cuando un detalle no se pudo confirmar con certeza se indica explícitamente. Los renderizadores (`client/render`) están **fuera** de esta raíz; aquí solo se describen los ganchos de animación/skin que exponen las propias entidades.

**Inventario (ficheros `.java` por zona):**

| Zona | Nº clases |
|---|---|
| `entity/*` (raíz) | 8 |
| `entity/ai/*` | 31 |
| `entity/ai/misc/*` | 26 (18 clases base + 8 interfaces) |
| `entity/monster/*` (todas las categorías) | 105 |
| `entity/projectile/*` | 18 |
| `entity/tile/*` | 2 |

---

## 1. Jerarquía base

### 1.1 Árbol de herencia (confirmado con las declaraciones)

```
net.minecraft.entity.mob.EntityMob
└── EntityParasiteBase                      (abstract)  ai/misc
    ├── EntityPMalleable                    (abstract)  ai/misc
    │   ├── EntityPAdapted                  (abstract)
    │   ├── EntityPPrimitive                (abstract)
    │   ├── EntityPPure                     (abstract, implements EntityCanSummon)
    │   ├── EntityPPreeminent               (abstract, implements EntityCanSummon)
    │   ├── EntityPAncient                  (abstract)
    │   ├── EntityPCosmical                 (abstract)
    │   └── EntityPStationary               (abstract)
    │       └── EntityPStationaryArchitect  (abstract, implements EntityCanSummon)
    │           ├── EntityPDispatcher       (abstract)
    │           └── EntityPRooster          (abstract)
    ├── EntityPInfected                     (abstract, implements EntityCanSpawn)
    ├── EntityPFeral                        (abstract, implements EntityCanSpawn)
    ├── EntityPHijacked                     (abstract, implements EntityCanSpawn)
    └── EntityPCrude                        (abstract)
```

- `EntityParasiteBase extends EntityMob` es la raíz de **toda** criatura parásita.
- `EntityPMalleable` introduce el sistema de **adaptación por daño** (ver §4).
- Las interfaces de capacidades viven en `entity/ai/misc/` y se implementan por composición (no hay herencia múltiple): `EntityBodyParts`, `EntityCanClimb`, `EntityCanFly`, `EntityCanMelt`, `EntityCanShoot`, `EntityCanSpawn`, `EntityCanSummon`, `EntityCutomAttack`.

### 1.2 `EntityParasiteBase` (abstract, 1400+ líneas)

**Rol:** base común de comportamiento, evolución, desove, muerte, sonidos y persistencia.

**Campos clave:**
- `protected byte type = 0` — "tier"/categoría; se usa para reglas (`type < 11` bloquea nódulos, `type >= 31` habilita romper escudos, etc.).
- `protected int damageCap = 1`, `MiniDamage`, `miniCap` — tope de daño por golpe y "daño mínimo" adicional.
- `protected double killcount` — contador de asesinatos para evolución.
- `protected byte phaseCreated` — fase de evolución del mundo en el momento del spawn.
- `protected EntityAIJumping jumpT`, `EntityAIWait wait`, `EntityAIParasiteFollow folow`, `EntityAIWanderStatus aiWander` — tareas base registradas en el constructor (`tasks.addTask(0/5/6, …)`).

**`DataParameter` propios:**
- `SPECIAL` (`Byte`) — estado/parasite status.
- `SELFE` (`Integer`) — estado "selfe" (animación/explosión).
- `SKIN` (`Byte`) — textura/variante.
- `COLD_L` (`Boolean`) — flag de bioma frío.

Registrados en `entityInit()` con valores por defecto `0, -1, 0, false`.

**Métodos destacados:**
- `getParasiteIDRegister()` (abstracto) — ID numérico de registro de cada especie.
- `applyBonuses(int colony, int node, byte phase)` → `setColonyBonus(...)` / `setNodeBonus(...)`: aplica bonus multiplicativos a `MAX_HEALTH`, `ARMOR`, `ATTACK_DAMAGE`, `KNOCKBACK_RESISTANCE` y `damageCap` en función de puntos de colonia/nodo; añade efectos de poción por nodo (`SRPConfigWorld.potionEffectForNodes`).
- `attackEntityFrom(DamageSource, float)`: aplica debilidades (`parasiteWeakToItems/Mobs/Else`) y el **tope de daño** (`damageCap`); si el daño supera el tope, marca `source.setDamageBypassesArmor()` y aplica `SRPPotions.RAGE_E`.
- `attackEntityAsMob(Entity)` / `attackEntityAsMobMinimum(EntityLivingBase)`: ataque cuerpo a cuerpo + daño mínimo que atraviesa armadura y maneja escudo/`TOTEM_OF_UNDYING` manualmente.
- `onKillEntity`, `onDeath`, `onDeathUpdate`, `dyingBurst`, `selfExplode`, `spawnGore`, `OnDeathHelper`.
- `handleStatusUpdate(byte id)`, `particleStatus(byte id)`, `spawnParticles(...)` — efectos de red.
- `doSpecialSkill(byte id)`, `getFinished/setFinished`, `skillBreakBlocks()`, `skillLeap()` — sistema de "habilidades" rompe-bloques y salto.
- `writeEntityToNBT` / `readEntityFromNBT` (ver §4).
- `placeNidus()` — creación de nidos (respeta `type < 11` y `killcount`).
- `onInitialSpawn(DifficultyInstance, IEntityLivingData)` — inicialización en spawn.
- Clases internas: `EntityAIJumping` y `EntityAIWait`.

### 1.3 Clases base de categoría (todas en `ai/misc/`)

| Clase | `type` asignado | Rasgos propios |
|---|---|---|
| `EntityPInfected` | (base, sin asignar) | `implements EntityCanSpawn`; `setHost/getHost` (NBT `parasitehost`), `transform()`, `InfectNearby(...)`, `getFeral()`; `processInteract` |
| `EntityPFeral` | (base) | `implements EntityCanSpawn`; `apply`, `fearPlayer`, `onKillEntity`, `spawnGore`, NBT propio |
| `EntityPHijacked` | (base) | `implements EntityCanSpawn`; `getIDSpawn()` = `getParasiteIDRegister()` |
| `EntityPCrude` | (base) | `onLivingUpdate`, `fall` |
| `EntityPAdapted` | `41` | `apply`, `despawnEntity`, `attackEntityAsMob`, `scaryOrbEffect` |
| `EntityPPrimitive` | `31` | `apply`, `fall`, `scaryOrbEffect` |
| `EntityPPure` | `51` | `implements EntityCanSummon`; `summonTentacles`, `spawnT`, `getRSChance`; lista de ID/puntos |
| `EntityPPreeminent` | `61` | `implements EntityCanSummon`; `summonFlam`, `setTeleFlam/getTeleFlam`; lista de ID/puntos |
| `EntityPAncient` | (base) | `apply`, `fearPlayer`, `fall`, `scaryOrbEffect` |
| `EntityPCosmical` | `71` | `onLivingUpdate`, `attackEntityFrom`, `shakingC`, `showC`, `handleStatusUpdate` |
| `EntityPStationary` | (base) | torreta/enterrado: `setPeek`, `buried/setBuried`, `retreat`, `getBuriedSpeed`, `getFloorTimer`, `knockBack`, `canBeCollidedWith` |
| `EntityPStationaryArchitect` | (base) | `implements EntityCanSummon`; crecimiento por etapas: `neededTime`, `setGT`, `getActualT`, `setCanGrowTo`, `setConvert`, `getStageV`, `getBODY`, `getBombDamage()` (abstracto), `getRSSpawned` |
| `EntityPDispatcher` | (base) | almacena parásitos en NBT (`dodcrude/dodinf/dodflesh/dodmobs`), `storeParasite`, `storeAll`, `addParaBack` |
| `EntityPRooster` | (base) | `spawnLeemB(int)`, NBT propio |

> **Nota de tier (`type`):** los bytes observados son `5/7` (crude menores), `11..15` (infected/feral/hijacked), `31` (primitive), `41` (adapted), `51` (pure), `61` (preeminent), `71` (cosmical), `100` (Biomass/Lesh), `40` (deterrent estacionarios), `14` (Heblu, Dorpa, InfDragonE, InfEnderman), `62` (Oronco/OroncoAW/OroncoTen), `63` (Dharma/Terla/Pheon). El byte **no** es un índice de categoría estrictamente monótono: varía por clase concreta. Las clases **nexus** (`EntityDod/Leem/Venkrol` y sus variantes SII–SV) **no** asignan `this.type` en su constructor según el descompilado (heredan `0`); no se pudo confirmar si lo fijan en otro punto.

### 1.4 Interfaces de capacidad (`ai/misc/`)

- `EntityCanSpawn`: `canSpawnByIDData()`, `getIDSpawn()`.
- `EntityCanSummon`: `addID(int,int)`, `IDable()`, `checkID()`, `getIDList()`, `getPointList()`, `getTotalParasites()`, `getActualParasites()`, `setActualParasites(int)`.
- `EntityCanShoot`: `getProj(double,double,double)`, `playProjSound()`.
- `EntityCanMelt`: `melt()`, `isMelting()`, `melting()`, `getTHeigh/setTHeigh`, `getaSize/setaSize`, `getSelfeFlashIntensity2()`.
- `EntityCanClimb`: `climbStatus()`.
- `EntityCutomAttack`: `attackEntityAsMobAOE(Entity)`.
- `EntityBodyParts`: `attackEntityBodyFrom(DamageSource, float, int, boolean)`, `setBodyPartDead(int)`.
- `EntityCanFly`: interfaz marcadora sin métodos declarados visibles en el descompilado.

### 1.5 Entidades auxiliares en la raíz `entity/`

| Clase | Extiende | Propósito |
|---|---|---|
| `EntityBody` | `Entity` | Parte de cuerpo multihitbox hija, sincronizada al padre (`getFather()`, `getId()`, `attackEntityFrom`, NBT). |
| `EntityBodyModel` | `EntityBody` | `EntityBody` con `DataParameter<Byte> SKIN` propio. |
| `EntityDamage` | `Entity` | Zona/onda de daño temporal con caster (`setCaster`, `setFollower`, `onUpdate`). |
| `EntityParasiticScent` | `Entity` | "Rastro" de infestación que guía a los parásitos; `setTargetToKill`, `getDanger`, `placeWaves`, `warnPlayers`, `setScentLevel`. |
| `EntityRemain` | `Entity` | Restos/remanentes de un parásito (`setParasite`, `setGoal`, `setSkin`, `setHealth`). |
| `EntityScaryOrb` | `Entity` | Orbe de la habilidad "scary orb" (`SELFE`, `FUSE`, `WAITSTART`; `selfExplode`, `dyingBurst`). |
| `EntitySource` | `Entity` | Marcador invisible con nombre personalizado para efectos/rastreo. |
| `EntityToxicCloud` | `Entity` | Nube de área tipo `EntityAreaEffectCloud` (`RADIUS`, `HEIG`, `PART`, `IGNORE_RADIUS`, `PARTICLE`, `PARTICLE_PARAM_1/2`). |

---

## 2. Clases de IA (`entity/ai/*`, 31 clases)

Todas extienden `EntityAIBase` salvo las indicadas. Casi todas operan sobre `EntityParasiteBase` (acoplamiento fuerte a la base).

**Ataque cuerpo a cuerpo / distancia**
- `EntityAIAttackMeleeStatus` (+`EntityAIAttackMeleeStatusAOE`) — melee con cooldown/estado; AOE extiende y añade daño en área.
- `EntityAIAttackMeleeNotGround` — melee para entidades no ancladas al suelo (aire/agua).
- `EntityAIAttackMeleeRanged` — melee con "pull" y preparación a distancia.
- `EntityAIAttackMeleeRangeSwitch` — conmuta entre rango corto/largo.
- `EntityAIAttackRangedStatus` — ataque a distancia vía `IRangedAttackMob`.
- `EntityAIAttackProjectile` — disparo de proyectil con cooldown/intervalo y opción `homming`.
- `EntityAIAttackVenkrol` — melee específico de los nexos Venkrol.
- `EntityAIDodAttack` — lógica de asedio del Dispatcher/Dod (invoca tentáculos, almacena parásitos, `spawnDet`, `checkNak`).
- `EntityAIFlightAttack` — ataque volador con `attackSurr()` y filtros de objetivo.
- `EntityAIAttackSwell` — "hinchazón" previa a explosión.

**Movimiento / navegación / evasión**
- `EntityAIParasiteFollow` — seguimiento de un líder (`EntityParasiteBase`).
- `EntityAIWanderStatus` — deambular con probabilidad y estado.
- `EntityAISwimmingDiving` — natación/buceo (extiende `EntityAIBase`, sobre `EntityLiving`).
- `EntityAIWaterLeapAtTargetStatus` — salto desde el agua hacia el objetivo.
- `EntityAIEvade`, `EntityAIEvadeDash` — evasión (con "dash" en la segunda).
- `EntityAIFlightLimits` — límites de altitud de vuelo.
- `EntityAIAvoidEntityStatus<T extends Entity>` — evitación genérica con `Predicate`.
- `EntityAIAvoidOrAttack` — evita o ataca según luz.

**Objetivos / percepción**
- `EntityAINearestAttackableTargetStatus<T extends EntityLivingBase> extends EntityAITarget` — versión del target selector con penalizaciones de sigilo/invisibilidad y `Sorter` interno.
- `EntityAIInfectedSearch` — búsqueda de infectados para "melt"/contagio.
- `EntityAIGetFollowers` — reclutamiento de seguidores.

**Soporte / utilidad / habilidad**
- `EntityAISkill` — dispara una "habilidad" por `attackID` con cooldown/distancia/visión.
- `EntityAIGiveEffectsArea` — reparte efectos de poción en área a parásitos (`BuffParasites`).
- `EntityAIBlockInfest` — infesta/transforma bloques en etapa.
- `EntityAIBlockLight` — busca y trata fuentes de luz (`findSource`).
- `EntityAIBlockResidue` — deja residuo sobre bloques.
- `EntityAIAncientSummon` — invocación de ancianos con cooldown/límite y `String[] mobList`.
- `EntityAIVenkrolSummon` — invocación del Venkrol con coordinación entre vecinos (`setNerabyLocked/Free`, `countNeraby`, `setlocker/getLocker`, `setCounted/getCounted`).
- `EntityAINexusGrow` — crecimiento por etapas del nexo (tipos 1=Venkrol, 2=Dod, 3=Leem; `upgradeV/upgradeD/upgradeL`, `checkPhase`).

---

## 3. Entidades por categoría

### 3.1 `entity/monster/` — raíz de monstruos (4)
- `EntityBiomass` (`EntityParasiteBase`, `type=100`), `EntityTendril`, `EntityWave`, `EntityWaveShock` (ondas/efectos).

### 3.2 `infected/` (13) + `infected/head/` (10)
- Infectados "normales": `EntityDorpa` (impl. `EntityCanShoot`, `type=14`), `EntityInfBear/Cow/Horse/Human/Pig/Player/Sheep/Villager/Wolf` (la mayoría impl. `EntityCanMelt`; `type` 11–15), `EntityInfDragonE` (impl. `EntityCutomAttack`, `EntityBodyParts`), `EntityInfEnderman` (`type=14`), `EntityInfSquid` (impl. `EntityCanFly`, `EntityCutomAttack`).
- Cabezas separadas (`infected/head/`): `EntityInf{Cow,DragonE,Enderman,Horse,Human,Pig,Player,Sheep,Villager,Wolf}Head`, todas `extends EntityPInfected`.

### 3.3 `feral/` (9)
`EntityFerBear/Cow/Enderman/Horse/Human/Pig/Sheep/Villager/Wolf` — todos `extends EntityPFeral`, `type=11`.

### 3.4 `hijacked/` (3)
`EntityHiBlaze`, `EntityHiGolem`, `EntityHiSkeleton` — `extends EntityPHijacked`, `type=11`.

### 3.5 `crude/` (8)
`EntityCrux` (`EntityCutomAttack`, `type=41`), `EntityHeed` (`EntityBodyParts`, `type=31`), `EntityHost`/`EntityHostII` (`IRangedAttackMob`, `EntityCutomAttack`), `EntityInhooM`/`EntityInhooS` (`type=11`), `EntityLesh` (`type=100`), `EntityMes` (`type=11/31`). **Nota:** `EntityHost`/`EntityHostII` extienden `EntityPMalleable` directamente (no `EntityPCrude`), aunque viven en `crude/`.

### 3.6 `inborn/` (9)
`EntityAta` (`type=5`), `EntityButhol` (`31`), `EntityGothol` (`41`), `EntityKol` (`7`), `EntityLodo` (`1`), `EntityMor` (`7`), `EntityMudo` (`5`), `EntityNuuh` (`EntityPMalleable`, `51`), `EntityRathol` (`41`). Todos `extends EntityParasiteBase` salvo `EntityNuuh` (`EntityPMalleable`).

### 3.7 `primitive/` (10)
`EntityBano`, `EntityCanra` (`EntityCanSummon`), `EntityEmana` (`EntityCanShoot`), `EntityHull`, `EntityIki` (`EntityCanShoot`), `EntityLum` (`EntityCanFly`, `EntityCutomAttack`), `EntityNogla`, `EntityRanrac`, `EntityShyco` (`EntityCutomAttack`), `EntityWymo` (`EntityCutomAttack`). Todos `extends EntityPPrimitive` (`type=31`).

### 3.8 `adapted/` (7)
`EntityBanoAdapted` (`EntityCutomAttack`, `EntityBodyParts`), `EntityCanraAdapted` (`EntityCanSummon`, `EntityBodyParts`), `EntityEmanaAdapted` (`EntityCutomAttack`, `EntityCanShoot`), `EntityHullAdapted`, `EntityNoglaAdapted` (`EntityBodyParts`), `EntityRanracAdapted` (`EntityBodyParts`), `EntityShycoAdapted` (`EntityCutomAttack`, `EntityBodyParts`, `EntityCanClimb`). Todos `extends EntityPAdapted` (`type=41`).

### 3.9 `focused/` (1)
`EntityShycoFocused extends EntityPAdapted` (`EntityCutomAttack`, `EntityBodyParts`, `EntityCanClimb`) — variante "focused" del Shyco.

### 3.10 `pure/` (7) + `pure/preeminent/` (8)
- Pure (`type=51`): `EntityAlafha` (`EntityBodyParts`, `EntityCutomAttack`, `EntityCanShoot`), `EntityAnged` (`IRangedAttackMob`, `EntityBodyParts`), `EntityEsor`, `EntityFlog`, `EntityGanro`, `EntityOmboo`, `EntityOrch` (`EntityCutomAttack`, `EntityCanShoot`).
- Preeminent (`type=61`): `EntityElvia` (`EntityCanShoot`), `EntityFlam`, `EntityJinjo`, `EntityLencia` (`EntityCanShoot`), `EntityPheon` (`EntityBodyParts`, `IRangedAttackMob`, `EntityCutomAttack`, `EntityCanShoot`, `type=63`), `EntityVesta` (`EntityBodyParts`, `type=31`).
  **Excepción:** `EntitySoo` y `EntityTenn` (ubicados en `pure/preeminent/`) **extienden `EntityPPure`**, no `EntityPPreeminent`.

### 3.11 `ancient/` (4) + `awakened/` (1)
`EntityDharma` (`EntityPAncient`; `EntityBodyParts`, `IRangedAttackMob`, `EntityCutomAttack`, `type=63`), `EntityOronco` (`EntityCanShoot`, `type=62`), `EntityOroncoTen` (`EntityParasiteBase`, `type=62`), `EntityTerla` (`EntityPAncient`; `EntityBodyParts`, `IRangedAttackMob`, `EntityCutomAttack`, `type=63`). `EntityOroncoAW extends EntityPAncient` (`type=62`).

### 3.12 `derived/` (2)
`EntityHeblu` (`EntityPCosmical`; `EntityCutomAttack`, `EntityBodyParts`, `type=14`), `EntityKirin` (`EntityPCosmical`).

### 3.13 `deterrent/` (6) + `deterrent/nexus/` (13)
- Estacionarios (`extends EntityPStationary`, `type=40`): `EntityDodT`, `EntityLeemB`, `EntityNak`, `EntityRof`, `EntityTonro` (`EntityCutomAttack`), `EntityUnvo` (`EntityCanShoot`).
- Nexus: `EntityDod`/`DodSII/SIII/SIV` (`EntityPDispatcher`), `EntityLeem`/`LeemSII/SIII/SIV` (`EntityPRooster`), `EntityVenkrol`/`VenkrolSII..SV` (`EntityPStationaryArchitect`).
  - IDs registrados observados: `EntityDod` → 73, `EntityVenkrol` → 16, `EntityLeem` → 310.

### 3.14 `projectile/` (18)
- Base: `EntitySRPProjectile extends EntityFireball` (abstracto; `isBurning`, `canBeCollidedWith`, `attackEntityAsMobMinimum(Entity, EntityParasiteBase)`).
- Derivados de `EntitySRPProjectile`: `EntityProjectileAlafhaBall`, `Ancientball`, `Angedball`, `DragonE`, `ElviaBall`, `LenciaBall`, `Nade`, `Pullball`, `Spineball`, `Webball`.
- Otros: `EntityProjectileBiomass extends EntityFireball`, `EntityProjectileHomming extends EntityLiving` (con `AIMoveControl extends EntityMoveHelper`), `EntityBomb`, `EntityGore`, `EntityNade` (extienden `Entity`), `EntityDropPod extends EntityParasiteBase` (`getParasiteIDRegister`, `selfExplode`), `EntityThrowableAntiInfestedBlock extends EntityThrowable`.

### 3.15 `tile/` (2)
- `TileEntityCanister extends TileEntityLockableLoot implements ITickable` — inventario de botín con capacidad `IItemHandler` (`getSingleChestHandler`, `addStack`, `createContainer`, `getGuiID`).
- `TileEntityDod extends TileEntity implements ITickable` — lógica de nodo/reforzador (`getRSChance(byte)`), spawn de nidus.

---

## 4. Datos sincronizados y persistencia NBT

### 4.1 `DataParameter` (sincronización cliente-servidor)

| Clase | Parámetro | Tipo | Uso |
|---|---|---|---|
| `EntityParasiteBase` | `SPECIAL` | `Byte` | Estado parásito |
| `EntityParasiteBase` | `SELFE` | `Integer` | Estado "selfe"/animación |
| `EntityParasiteBase` | `SKIN` | `Byte` | Variante/textura |
| `EntityParasiteBase` | `COLD_L` | `Boolean` | Bioma frío |
| `EntityPMalleable` | `HIT` | `Byte` | Estado de impacto/adaptación |
| `EntityBodyModel` | `SKIN` | `Byte` | Textura de la parte |
| `EntityScaryOrb` | `SELFE`, `FUSE`, `WAITSTART` | `Integer` | Ciclo del orbe |
| `EntityNade` | `SELFE`, `FUSE`, `WAITSTART` | `Integer` | Ciclo de la nade |
| `EntityBomb` | `FUSE`, `SKIN` | `Integer`/`Byte` | Mecha/textura |
| `EntityGore` | `SKIN` | `Integer` | Tipo de gore |
| `EntityToxicCloud` | `RADIUS`, `HEIG`, `PART`, `IGNORE_RADIUS`, `PARTICLE`, `PARTICLE_PARAM_1`, `PARTICLE_PARAM_2` | `Float`/`Byte`/`Boolean`/`Integer` | Nube de área |

Registro vía `EntityDataManager.createKey(Clase.class, DataSerializers.*)` + `dataManager.register(...)` en `entityInit()`. Actualización vía `setEntityState` / `handleStatusUpdate`.

### 4.2 Claves NBT

**`EntityParasiteBase.writeEntityToNBT` / `readEntityFromNBT`:**
`parasitetype` (int; skin), `parasitedespawn` (bool), `parasitekills` (float; `killcount`), `parasitecolob` (bool; colonia), `parasitecoldl` (bool), `phasecreat` (byte), y listas `srpinvblocksname` (`blocks<i>`) / `srpinvblocksnumber` (`blocki<i>`) para el inventario de bloques internos.

**`EntityPMalleable`:**
`resistance`, `sprresistances` (lista de nombres de daño), `sprresistancei` (lista de contadores), `damagetypecap`, `paracolony` (puntos de colonia).

**`EntityPInfected`:**
`parasitehost` (String; mob hospedador para `transform()`).

**`EntityPStationary`:**
`parasitedepeek` (bool), `parasiteuppp` (bool) — estado de "asomarse"/enterrado.

**`EntityPStationaryArchitect`:**
`tickse`, `neededtime`, `cangrowto` (bool), `belongtors` — temporizador y destino de crecimiento.

**`EntityPDispatcher`:**
`dodcrude`, `dodinf`, `dodflesh`, `dodmobs` + `mobs` — inventario de parásitos almacenados.

**`EntityPRooster`:** NBT propio (referenciado en `writeEntityToNBT`/`readEntityFromNBT`; **detalle no extraído en esta pasada**).

### 4.3 Otros mecanismos de persistencia/red
- `EntityBody`/`EntityBodyModel` persisten su vínculo con el padre y se sincronizan por posición/rotación directa (`setPositionAndRotationDirect`).
- Daño a partes de cuerpo en multibosses se canaliza por paquetes `SRPPacketEntityBodyHit` / `SRPPacketEntityBodyDead` (fuera de esta raíz, referenciados desde las clases con `EntityBodyParts`).
- `EntityParasiticScent` gestiona su propio estado (estado de rastro, nivel, peligro, actividad) y persiste en NBT.

---

## 5. Patrones de render / animación (ganchos expuestos por las entidades)

Los renderizadores viven en `client/render` (fuera de la raíz analizada), pero las entidades exponen los siguientes ganchos que el render consume:

- **Skin/variante:** `getSkin()` / `setSkin(int)` sobre el `DataParameter SKIN`; `EntityBodyModel` repite el patrón.
- **Intensidad de destello "selfe":** `getSelfeFlashIntensity(float)` en `EntityParasiteBase` y `EntityScaryOrb`; `EntityCanMelt` añade `getSelfeFlashIntensity2()`.
- **Escala y "ani tick":** `getscale(float)`, `getAniTick()`, `getStillAni()` — animación de reposo cuando la entidad lleva `stillTicks > 25` sin moverse (parámetro `aniticks`).
- **Brazos/ataque:** `isSwingingArms()`, `setAttackCooldownAni(int)`/`getAttackCooldownAni()`.
- **Modelo multiparte:** `EntityBody`/`EntityBodyModel` como hitboxes hijas para jefes (`EntityBanoAdapted`, `EntityShycoFocused`, `EntityHeblu`, `EntityDharma`, `EntityAlafha`, `EntityPheon`, etc.) — ver `EntityBodyParts`.
- **Partículas:** `spawnParticles(...)` y `spawnParticlesGore(...)` con `EnumParticleTypes` y un enum propio `SRPEnumParticle` (variantes gore/mouth/box).
- **Sonido:** cada entidad expone `getAmbientSound/getHurtSound/getDeathSound` (referenciados a `SRPSounds`), p. ej. `SRPSounds.MOBSILENCE`.

> **Marcado como no verificable aquí:** los nombres/estructura exactos de los renderizadores, modelos y capas (`LayerRenderer`) no forman parte de la raíz `entity/` y no se inspeccionaron en esta pasada.

---

## 6. Hallazgos para migración a Forge 1.20.1

### 6.1 Registro y jerarquía de entidades
1. **`EntityMob`/`EntityLiving` renombrados y reubicados.** En 1.20.1 son `net.minecraft.world.entity.monster.Monster` / `net.minecraft.world.entity.LivingEntity`; `EntityCreature`→`PathfinderMob`. Toda la jerarquía `EntityParasiteBase` debe re-apuntar a `Monster`.
2. **Registro de tipos.** `EntityList.getKey/createEntityByIDFromName` y el `getParasiteIDRegister()` numérico casero deben migrarse a `DeferredRegister<EntityType<?>>` (`ForgeRegistries.ENTITY_TYPES`) + `EntityType.Builder`. Los IDs enteros por clase (p. ej. 73, 16, 310) deben convertirse en claves `ResourceLocation`.
3. **`EntityCanSpawn`** (`getIDSpawn()`/`canSpawnByIDData()`) no tiene equivalente directo; el spawn por datos debe reimplementarse sobre `SpawnPlacements`/`SpawnGroupData`.
4. **`EntityEntryBuilder`** (si se usa en el registro, fuera de esta raíz) desaparece en 1.20.1.

### 6.2 Sincronización de datos
5. **`EntityDataManager.createKey(...)` + `dataManager.register(...)`** se reemplaza por `SynchedEntityData.defineId(Clase.class, EntityDataSerializers.*)` y `entityData.define(...)`. Los `DataSerializers.BYTE/VARINT/BOOLEAN/FLOAT` cambian de paquete y API. Afecta a `SPECIAL`, `SELFE`, `SKIN`, `COLD_L`, `HIT` y a todos los de proyectiles/orbes.
6. **`entityInit()`** ya no existe: la inicialización pasa a `defineSynchedData()`.
7. **`handleStatusUpdate(byte)`** y `setEntityState`/`world.setEntityState` se mantienen conceptualmente (`ClientboundEntityEventPacket`), pero hay que revisar firmas y el uso de `byte`.

### 6.3 Persistencia
8. **`NBTTagCompound`→`CompoundTag`**, `NBTTagList`→`ListTag`, `setInteger/setByte/setFloat/setBoolean`→`putInt/putByte/putFloat/putBoolean`, `hasKey(clave, 99)`→`contains(clave, Tag.TAG_*)`. Todas las claves listadas en §4.2 requieren este reemplazo.
9. **`writeEntityToNBT`/`readEntityFromNBT`→`addAdditionalSaveData`/`readAdditionalSaveData`**.
10. **`IEntityLivingData onInitialSpawn(DifficultyInstance, ...)`→`SpawnGroupData finalizeSpawn(ServerLevelAccessor, DifficultyInstance, MobSpawnType, SpawnGroupData)`** (cambia el orden de parámetros y el tipo de retorno).
11. **`ITickable`→`Tickable`/`BlockEntityTicker`** en `TileEntityCanister`/`TileEntityDod`; `TileEntityLockableLoot`→`BaseContainerBlockEntity` + `RandomizableContainerBlockEntity`; `getCapability` de `IItemHandler`→`ForgeCapabilities.ITEM_HANDLER`.

### 6.4 IA
12. **`EntityAIBase`→`Goal`**, `EntityAITarget`→`TargetGoal`. Los constructores de `tasks.addTask(prioridad, goal)` pasan a `goalSelector.addGoal(...)` y `targetSelector.addGoal(...)`. Los 31 goals requieren reescritura de firmas (`shouldExecute`→`canUse`, `updateTask`→`tick`, `startExecuting`→`start`, `resetTask`→`stop`).
13. **`EntityAINearestAttackableTarget`/`Sorter`**: la lógica de `Sorter` y `Predicate` se sustituye por `targetSelector` con `targetConditions`/`Sensing`.
14. **`EntityMoveHelper`** (usado en `EntityProjectileHomming.AIMoveControl`) cambia de firma; `onUpdateMoveHelper`→`tick`.
15. **`EnumCreatureType`/`isCreatureType(...)`**: eliminado; el conteo de spawn por categoría ya no aplica. `canSpawn()`/`getCanSpawnHere()` deben revisarse contra `SpawnPlacements`.

### 6.5 Atributos, daño y efectos
16. **`SharedMonsterAttributes`**→`Attributes` con `AttributeSupplier`; `getEntityAttribute(...).setBaseValue(...)`→`getAttribute(...).setBaseValue(...)` (y la creación de atributos pasa por `createAttributes()`). Afecta a `setColonyBonus` (MAX_HEALTH/ARMOR/ATTACK_DAMAGE/KNOCKBACK_RESISTANCE).
17. **`DamageSource.damageType`/`getImmediateSource`→`getDirectEntity`/`getEntity`**; `source.setDamageBypassesArmor()`→`source.bypassesArmor()` (inmutable; hay que construir el `DamageSource` con el flag).
18. **`MobEffects`→`MobEffects`** (se mantiene) pero `Potion`/`PotionEffect`/`Potion.getPotionFromResourceLocation`→`MobEffect`/`MobEffectInstance`/`ForgeRegistries.MOB_EFFECTS`. `SRPPotions` y `SRPConfigWorld.potionEffectForNodes` requieren adaptación.
19. **`EntityPlayer`/`EntityPlayerMP`→`Player`/`ServerPlayer`**; `processInteract`→`mobInteract`; `StatList`/`CriteriaTriggers` cambian de paquete y firmas.
20. **`ItemShield`/`isActiveItemStackBlocking`/`CooldownTracker`** en `attackEntityAsMobMinimum` deben migrarse (`ShieldItem`, `isBlocking()`, `getCooldowns()`), y `ItemStack.EMPTY`→`ItemStack.EMPTY` (se mantiene).

### 6.6 Proyectiles y entidades auxiliares
21. **`EntityFireball`** (base de `EntitySRPProjectile`/`EntityProjectileBiomass`) cambia constructor/atributos; `EnumParticleTypes`→`ParticleTypes` con `ServerLevel.sendParticles(...)` y `getParticleType()` reescrito.
22. **`EntityThrowable`** (base de `EntityThrowableAntiInfestedBlock`) cambia de API (`Projectile`).
23. **`Entity` plano** (usado por `EntityBody`, `EntityDamage`, `EntityParasiticScent`, `EntityRemain`, `EntityScaryOrb`, `EntitySource`, `EntityToxicCloud`, `EntityBomb`, `EntityGore`, `EntityNade`) requiere revisar `onUpdate`, `entityInit`, NBT y registro de tipos.
24. **`EntityAreaEffectCloud`** es el equivalente moderno de `EntityToxicCloud` (revisar si conviene heredar en lugar de reimplementar).

### 6.7 Cliente/solo-cliente
25. **`@SideOnly(Side.CLIENT)`/`Side.CLIENT`** se mantiene en Forge 1.20.1, pero `net.minecraftforge.fml.relauncher` cambia a `net.minecraftforge.api.distmarker`.
26. **`SRPEnumParticle`/`spawnParticles`** propias: deben re-implementarse sobre el sistema de partículas registrado (`ParticleType` + `SimpleParticleType`).

### 6.8 Riesgos concretos detectados en el código
- **IDs enteros dispersos** (`getParasiteIDRegister()` con valores como 5, 12, 23, 36, 39, 43, 73, 76, 77, 78, 79, 310, 314) usados como comparaciones de lógica (`EntityPDispatcher`, `EntityPRooster`, `placeNidus`). Al migrar a `ResourceLocation`, **hay que sustituir todas esas comparaciones mágicas** o quedan ramas muertas.
- **Tope de daño (`damageCap`) y daño mínimo** manipulan `setHealth`/`setAbsorptionAmount`/`onDeath` a mano (incluido el manejo del `TOTEM_OF_UNDYING`). En 1.20.1 esto interfiere con `LivingEntity.hurt`/`die` y con la invulnerabilidad; requiere revisión cuidadosa.
- **`type` no monótono** (ver §1.3): cualquier lógica basada en rangos de `type` (p. ej. `type < 11`, `type >= 31`) debe re-verificarse tras el port, ya que los valores están codificados por clase y algunos (`Heblu=14`, `Dorpa=14`) caen en rangos "infectados".
- **Multiparte con paquetes propios** (`SRPPacketEntityBodyHit/Dead`) y `EntityBody`/`EntityBodyModel`: no existe un sistema nativo equivalente; hay que mantener la sincronización manual o adaptar a `PartEntity` de Forge (1.20.1 ya incluye `PartEntity`/`EntityPart`).
- **`EntitySoo`/`EntityTenn` en `pure/preeminent/` extienden `EntityPPure`** y `EntityVesta` asigna `type=31` siendo preeminent: posibles inconsistencias a revisar, no necesariamente bugs.

---

## 7. Resumen de cifras

- Jerarquía base: **18 clases** en `ai/misc/` (10 abstractas de categoría + 8 interfaces) sobre `EntityMob`.
- IA: **31 goals** en `ai/` + 2 clases internas (`EntityParasiteBase.EntityAIJumping`, `EntityAIWait`).
- Entidades de criatura: **105** repartidas en 13 subpaquetes + 4 en la raíz de `monster/`.
- Proyectiles: **18**. TileEntities: **2**.
- Claves NBT específicas del mod: **~30** (ver §4.2) más las de proyectiles/tile.
