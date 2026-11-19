# Análisis del subsistema CLIENTE — Scape and Run: Parasites (Forge 1.12.2)

> Fuente: código Java descompilado (CFR 0.152, nombres MCP) en
> `srparasites/decompiled/mcp/com/dhanantry/scapeandrunparasites/`
> (paquete raíz `client`, más `util/handlers/SRPRenderHandler.java`,
> `util/handlers/SRPRegisterModels.java` y `proxy/ClientProxy.java`).
> Todos los nombres de clase citados son exactos.

---

## 0. Punto de entrada del cliente

- `proxy.ClientProxy` extiende `proxy.CommonProxy`. En `preInit(FMLPreInitializationEvent)` llama a
  `SRPRegistryHandlers.initRenders()`.
- `util.handlers.SRPRegistryHandlers.initRenders()` → `SRPRenderHandler.registryEntityRenders()`.
  `initEvents()` registra `SRPEventHandlerBus` (bus Forge) y `SRPEventHandlerTerrainGen` (bus terrain gen).
- `SRPEventHandlerBus` (anotado `@SideOnly(Side.CLIENT)` en el método de partículas) contiene
  `stitchEventPre(TextureStitchEvent.Pre)`, que es donde se registran las texturas de partículas.
- `ClientProxy` también implementa sonido posicional (`PositionedSoundRecord`) y `spreadBiome`
  (llamadas a `ParasiteEventWorld`); no contienen lógica de render.

---

## 1. Renderers de entidades (`client/renderer/**`)

Se contabilizan **127** archivos `.java` bajo `client/renderer/` más `client/SRPProjectile.java`
(128 clases de render en total). **No** existen renderers de TileEntity (`TileEntitySpecialRenderer`)
en el mod: `init/SRPEntities` registra `TileEntityCanister` y `TileEntityDod` con `GameRegistry.registerTileEntity`,
pero sin render propio.

### 1.1 Jerarquía base (clases propias)

| Clase | Extiende | Rol |
|---|---|---|
| `renderer.RenderMalleable<T extends EntityPMalleable>` | `RenderLiving<T>` | Base de la mayoría de mobs. Reimplementa `setBrightness(...)` (combina textura de luz con color de daño usando `DynamicTexture TEXTURE_BRIGHTNESS`, `GlStateManager.glTexEnv`). Añade `getGlowTexture(ResourceLocation)` (sufijo `_glow`) y `getBaseTexture(T)`. |
| `renderer.RenderCosmical<T extends EntityPCosmical>` | `RenderMalleable<T>` | Base de los "cosmic/preeminent" (`RenderKirin`, `RenderHeblu`). Reimplementa todo `doRender` a mano (`doRenderCosmical`), con render translúcido (`GlStateManager.color(...,0.35f)`, blend) usando `ModelSRP.renderC(...)` y `setRotationAnglesCosmical(...)`. |
| `renderer.SRPLayerBipedArmor` | `LayerArmorBase<ModelBiped>` | Capa de armadura que usa `SRPModelBiped` (no vanilla). `initArmor()` crea `new SRPModelBiped(0.5f)` / `(1.0f)`. Usada por `RenderInfPlayer`. |
| `client.SRPProjectile` | `Render` (raw) | Render plano (quad con `Tessellator`/`BufferBuilder`, `DefaultVertexFormats.POSITION_TEX_NORMAL`) para proyectiles. Ver §6. |

### 1.2 Patrones de render

- **`RenderLivingBase` / `RenderLiving<T>`**: la mayoría de mobs (`RenderBano`, `RenderAlafha`, etc.)
  pasan por `RenderMalleable`/`RenderCosmical`, que a su vez derivan de `RenderLiving`. Implementan
  `getEntityTexture(T)`, `preRenderCallback(T, partialTicks)` (escala por `getSelfeFlashIntensity`) y
  `applyRotations(...)`.
- **`Render<T>` genérico (sin modelo)**: proyectiles y efectos "invisibles" — `RenderDamage`,
  `RenderScent`, `RenderSource`, `RenderTCloud`, `RenderProjectileHomming`, `RenderGore`, `RenderNade`,
  `RenderBomb`, `RenderScaryOrb`, `RenderRemain`, `RenderEntityBody`, `RenderEntityBodyModel`.
- **`RenderLiving<T>` directo** (sin la base Malleable): `RenderHost`, `RenderHeed`, `RenderHostII`
  (usa Malleable), `RenderCrux`, `RenderInhooM`, `RenderInhooS`, `RenderHiGolem`, `RenderAta`,
  `RenderLeemB`, `RenderButhol`, `RenderInf*` (los infectados), `RenderFer*` (ferales), `RenderMudo`,
  `RenderMor`, `RenderLodo`, `RenderKol`, `RenderLesh`, `RenderGothol`, `RenderRathol`, `RenderNuuh`,
  `RenderAncientPod`, `RenderOroncoTen`, `RenderBiomass`, `RenderWave`, `RenderWaveShock`, `RenderTendril`.
- **Capas (`addLayer`)**: solo 4 sitios reales
  - `RenderMes` → `LayerSnow(this, ".../messnow.png", 1,1,1)`.
  - `RenderVesta` → `LayerSnow(this, ".../vestasnow.png", 1.01,1.001,1.01)`.
  - `RenderVenkrol` / `RenderVenkrolSII` / `RenderVenkrolSIII` / `RenderVenkrolSIV` → `LayerGlowing<T>(this)`.
  - `RenderInfPlayer` → `SRPLayerBipedArmor`.
- **Capas propias**: `renderer.entity.layer.LayerGlowing<T extends EntityPMalleable>` (implementa
  `LayerRenderer<T>`, blend ONE/ONE, `setupFogColor`, usa `RenderMalleable.getGlowTexture`),
  `renderer.entity.layer.LayerSnow<T extends EntityParasiteBase>` (blend + `depthMask`, textura externa),
  `renderer.entity.awakened.LayerOroncoAW` (stub vacío, `doRenderLayer` sin cuerpo).

### 1.3 Mapa Renderer → Entidad (según `SRPRenderHandler.registryEntityRenders`)

Registro con `RenderingRegistry.registerEntityRenderingHandler(EntityX.class, IRenderFactory<EntityX>(){ createRenderFor(RenderManager){ return new RenderX(manager); } })`,
muchos condicionados por flags de `SRPConfigMobs` (p.ej. `hebluEnabled`, `ratholEnabled`, `hostEnabled`,
`infplayerEnabled`…). Mapa completo:

| Renderer | Entidad |
|---|---|
| `RenderKirin` | `EntityKirin` |
| `RenderHeblu` | `EntityHeblu` |
| `RenderOroncoAW` | `EntityOroncoAW` |
| `RenderRathol` / `RenderGothol` / `RenderLodo` / `RenderButhol` / `RenderMudo` / `RenderAta` / `RenderNuuh` / `RenderKol` | `EntityRathol` / `EntityGothol` / `EntityLodo` / `EntityButhol` / `EntityMudo` / `EntityAta` / `EntityNuuh` / `EntityKol` |
| `RenderVenkrol` / `RenderVenkrolSII` / `RenderVenkrolSIII` / `RenderVenkrolSIV` | `EntityVenkrol` / `EntityVenkrolSII` / `EntityVenkrolSIII` / `EntityVenkrolSIV` |
| `RenderDodT` / `RenderLeemB` / `RenderRof` / `RenderNak` / `RenderTonro` / `RenderUnvo` | `EntityDodT` / `EntityLeemB` / `EntityRof` / `EntityNak` / `EntityTonro` / `EntityUnvo` |
| `RenderDod` / `RenderDodSII` / `RenderDodSIII` / `RenderDodSIV` | `EntityDod` / `EntityDodSII` / `EntityDodSIII` / `EntityDodSIV` |
| `RenderLeem` / `RenderLeemSII` / `RenderLeemSIII` / `RenderLeemSIV` | `EntityLeem` / `EntityLeemSII` / `EntityLeemSIII` / `EntityLeemSIV` |
| `RenderLesh` | `EntityLesh` |
| `RenderTerla` / `RenderOronco` / `RenderOroncoTen` | `EntityTerla` / `EntityOronco` / `EntityOroncoTen` |
| `RenderAncientPod` | `EntityDropPod` (proyectil "drop pod") |
| `RenderHost` / `RenderHostII` / `RenderMes` | `EntityHost` / `EntityHostII` / `EntityMes` |
| `RenderInhooS` / `RenderInhooM` | `EntityInhooS` / `EntityInhooM` |
| `RenderDorpa` | `EntityDorpa` |
| `RenderInfEnderman` / `RenderInfHuman` / `RenderInfCow` / `RenderInfSquid` / `RenderInfSheep` / `RenderInfWolf` / `RenderInfPig` / `RenderInfVillager` / `RenderInfHorse` / `RenderInfPlayer` / `RenderInfBear` / `RenderInfDragonE` | `EntityInf*` correspondientes |
| `RenderInfCowHead` / `RenderInfDragonEHead` / `RenderInfEndermanHead` / `RenderInfHorseHead` / `RenderInfHumanHead` / `RenderInfPigHead` / `RenderInfPlayerHead` / `RenderInfSheepHead` / `RenderInfVillagerHead` / `RenderInfWolfHead` | `EntityInf*Head` correspondientes |
| `RenderFerBear` / `RenderFerCow` / `RenderFerEnderman` / `RenderFerHorse` / `RenderFerVillager` / `RenderFerHuman` / `RenderFerSheep` / `RenderFerPig` | `EntityFer*` correspondientes |
| `RenderHiGolem` | `EntityHiGolem` |
| `RenderEmana` / `RenderEmanaAdapted` | `EntityEmana` / `EntityEmanaAdapted` |
| `RenderLum` / `RenderHull` / `RenderHullAdapted` | `EntityLum` / `EntityHull` / `EntityHullAdapted` |
| `RenderCanra` / `RenderCanraAdapted` | `EntityCanra` / `EntityCanraAdapted` |
| `RenderNogla` / `RenderNoglaAdapted` | `EntityNogla` / `EntityNoglaAdapted` |
| `RenderBano` / `RenderBanoAdapted` | `EntityBano` / `EntityBanoAdapted` |
| `RenderShyco` / `RenderShycoAdapted` | `EntityShyco` / `EntityShycoAdapted` |
| `RenderWymo` / `RenderIki` | `EntityWymo` / `EntityIki` |
| `RenderRanrac` / `RenderRanracAdapted` | `EntityRanrac` / `EntityRanracAdapted` |
| `RenderAlafha` / `RenderGanro` / `RenderAnged` / `RenderOmboo` | `EntityAlafha` / `EntityGanro` / `EntityAnged` / `EntityOmboo` |
| `RenderJinjo` / `RenderFlam` / `RenderPheon` / `RenderElvia` / `RenderLencia` / `RenderVesta` / `RenderEsor` / `RenderOrch` / `RenderFlog` | `EntityJinjo` / `EntityFlam` / `EntityPheon` / `EntityElvia` / `EntityLencia` / `EntityVesta` / `EntityEsor` / `EntityOrch` / `EntityFlog` |
| `RenderHeed` / `RenderCrux` | `EntityHeed` / `EntityCrux` |
| `RenderTendril` | `EntityTendril` |
| `RenderDamage` | `EntityDamage` |
| `RenderBomb` | `EntityBomb` |
| `RenderBiomass` | `EntityBiomass` |
| `RenderGore` | `EntityGore` (proyectil) |
| `RenderProjectileHomming` | `EntityProjectileHomming` |
| `RenderEntityBody` / `RenderEntityBodyModel` | `EntityBody` / `EntityBodyModel` |
| `RenderTCloud` | `EntityToxicCloud` |
| `RenderScent` | `EntityParasiticScent` (solo si `!SRPConfigSystems.oneMindDebug`) |
| `RenderSource` / `RenderScaryOrb` / `RenderNade` / `RenderWave` / `RenderWaveShock` / `RenderRemain` | `EntitySource` / `EntityScaryOrb` / `EntityNade` / `EntityWave` / `EntityWaveShock` / `EntityRemain` |

Detalle de algunos renderers "especiales":
- `RenderEntityBodyModel` reimplementa a mano casi todo `RenderLivingBase` (`setBrightness`, `unsetBrightness`,
  `renderModel`, `prepareScale`, `interpolateRotation`), con `GLAllocation.createDirectFloatBuffer` y
  `DynamicTexture TEXTURE_BRIGHTNESS`. Usa `ModelDodSIVH`.
- `RenderTendril` mantiene 8 modelos estáticos (`ModelTendrilShyco/Nogla/Bano/Canra/Esor/Anged/DragonELW/DragonERW`)
  y selecciona modelo y textura por `entity.getSkin()` dentro de `renderModel(...)`.
- `RenderProjectileHomming` dibuja el `ModelProjectileHomming` dos veces (una semitransparente, `color(...,0.5f)` + `scale(1.5)`).

---

## 2. Modelos (`client/model/**`)

**129** archivos `.java` de modelo. Organización por carpetas (recuento):

| Carpeta | Nº | Contenido |
|---|---|---|
| (raíz `client/model`) | 3 | `ModelSRP`, `ModelEffect`, `SRPModelArmorBase` |
| `model/entity` (raíz) | 2 | `ModelProjectileHomming`, `SRPModelBiped` |
| `entity/adapted` | 7 | `ModelBanoAdapted`, `ModelCanraAdapted`, `ModelEmanaAdapted`, `ModelHullAdapted`, `ModelNoglaAdapted`, `ModelRanracAdapted`, `ModelShycoAdapted` |
| `entity/ancient` | 3 | `ModelOronco`, `ModelOroncoTen`, `ModelTerla` |
| `entity/awakened` | 2 | `ModelOroncoAW`, `ModelOroncoAWFL` |
| `entity/crude` | 7 | `ModelCruxA`, `ModelHeed`, `ModelHost`, `ModelHostII`, `ModelInhooM`, `ModelInhooS`, `ModelMes` |
| `entity/derived` | 2 | `ModelHeblu`, `ModelKirin` |
| `entity/deterrent` | 6 | `ModelDodT`, `ModelLeemB`, `ModelNak`, `ModelRof`, `ModelTonro`, `ModelUnvo` |
| `entity/deterrent/nexus` | 14 | `ModelDod`, `ModelDodSII/SIII/SIV/SIVH`, `ModelLeem`, `ModelLeemSII/SIII/SIV`, `ModelVenkrol`, `ModelVenkrolSII/SIII/SIV/SV` |
| `entity/feral` | 8 | `ModelFerBear`, `ModelFerCow`, `ModelFerEnderman`, `ModelFerHorse`, `ModelFerHuman`, `ModelFerPig`, `ModelFerSheep`, `ModelFerVillager` |
| `entity/hijacked` | 1 | `ModelHiGolem` |
| `entity/inborn` | 10 | `ModelAta`, `ModelButhol`, `ModelGothol`, `ModelKol`, `ModelLesh`, `ModelLodo`, `ModelMor`, `ModelMudo`, `ModelNuuh`, `ModelRathol` |
| `entity/infected` | 13 | `ModelDorpa`, `ModelInfBear/Cow/DragonE/Enderman/Horse/Human/Pig/Player/Sheep/Squid/Villager/Wolf` |
| `entity/infected/head` | 10 | `ModelInfCow/DragonE/Enderman/Horse/Human/Pig/Player/Sheep/Villager/Wolf` + `Head` |
| `entity/misc` | 17 | `ModelBiomassPod`, `ModelBiomassVenkrol`, `ModelBombHost`, `ModelBombJinjo`, `ModelBombOmboo`, `ModelGore`, `ModelNade`, `ModelNULL`, `ModelScaryOrb`, `ModelTendrilAnged/Bano/Canra/DragonELW/DragonERW/Esor/Nogla/Shyco` |
| `entity/primitive` | 10 | `ModelBano`, `ModelCanra`, `ModelEmana`, `ModelHull`, `ModelIki`, `ModelLum`, `ModelNogla`, `ModelRanrac`, `ModelShyco`, `ModelWymo` |
| `entity/projectile` | 1 | `ModelDropPod` |
| `entity/pure` | 7 | `ModelAlafha`, `ModelAnged`, `ModelEsor`, `ModelFlog`, `ModelGanro`, `ModelOmboo`, `ModelOrch` |
| `entity/pure/preeminent` | 6 | `ModelElvia`, `ModelFlam`, `ModelJinjo`, `ModelLencia`, `ModelPheon`, `ModelVesta` |

### 2.1 Estilo de construcción (box-based)

- **Clase base `client.model.ModelSRP extends ModelBase`**: utilidades de animación procedimental
  (`setRotateAngle`, `swingX/Y/Z`, `moveY`, `underground`, y hooks vacíos `setRotationAnglesCosmical`
  y `renderC`). Prácticamente **todos** los modelos de mob extienden `ModelSRP` (p. ej. `ModelBanoAdapted`,
  `ModelAlafha`, `ModelInfPlayer` —este último vía `SRPModelArmorBase`—).
- **Construcción 100 % box-based**: cada parte es un `net.minecraft.client.model.ModelRenderer` creado con
  `new ModelRenderer(this, texU, texV)` y `addBox(x,y,z, w,h,d, expand)` + `setRotationPoint(...)`
  (ver p. ej. `ModelProjectileHomming`, `SRPModelBiped`). No hay geometría externa ni JSON de modelo de entidad.
  Muchos campos son `public ModelRenderer` (docenas por modelo; `ModelBanoAdapted` declara >100).
- **Variantes de base**:
  - `ModelSRP` → mobs normales (mayoría).
  - `client.model.ModelEffect extends ModelSRP` → efectos animados por escala (`renderTwo(...)` con
    `GlStateManager.pushMatrix/scale`): `ModelBombHost`, `ModelBombJinjo`, `ModelBombOmboo`, `ModelBiomassPod`,
    `ModelBiomassVenkrol`, `ModelMor`.
  - `client.model.SRPModelArmorBase extends ModelSRP` (solo `jointH`, `jointLL`) → `ModelMes` y `ModelInfPlayer`.
  - `client.model.entity.SRPModelBiped extends ModelBiped` → esqueleto bípedo para armaduras; expone
    `ArmPose` propio, `setParent(byte)`, `setVisible`, `postRenderArm`, `getArmModel`.
  - `client.model.entity.ModelProjectileHomming extends ModelBase` (directo, no ModelSRP).
- **Los más grandes** (por líneas): `ModelOronco` (~3609), `ModelHeed` (~2529), `ModelHeblu` (~2445),
  `ModelDodSIV` (~2376), `ModelDodSIII` (~2182), `ModelLeemSIV` (~2173), `ModelLencia` (~1995),
  `ModelInfDragonE` (~1933), `ModelElvia` (~1800), `ModelHostII` (~1719), `ModelNuuh` (~1685),
  `ModelCruxA` (~1672). Es decir, los "jefes" (ancient, deterrent/nexus, pure/preeminent, crude) concentran
  la mayor complejidad geométrica.

---

## 3. Sistema de partículas (`client/particle/*`)

9 archivos: 7 clases `Particle*` + `ParticleSpawner` + `SRPEnumParticle`.

### 3.1 Clases

| Clase | Extiende | Propósito / textura |
|---|---|---|
| `ParticleFog` | `Particle` | Niebla expansiva (escala sube a 8 y baja; `particleMaxAge=200`). Textura `srparasites:particle/fog`. Tiene `Factory implements IParticleFactory`. |
| `ParticleSpore` | `Particle` | Esporas (escala a 1.0). Textura `srparasites:particle/spore`. Tiene `Factory`. |
| `ParticleRGBSmoke` | `Particle` | Humo coloreado RGB con tamaño variable; se "pega" al jugador cercano (`getClosestPlayer`). Sin textura propia (usa índice vanilla). |
| `ParticleMultipleGore` | `Particle` | Salpicaduras de sangre; 5 texturas: `splashi` (infectado), `splashd` (arácnido), `splashp` (primitivo), `splasha` (adaptado), `splashv` (vómito), seleccionadas por parámetro `int texture`. |
| `ParticleRHappy` | `Particle` | "corazón rojo feliz"; `particleScale=2`, `maxAge=40`. Textura `srparasites:particle/rhappy`. |
| `ParticleBiomass` | `Particle` | Biomasa ascendente (`motionY += 0.005`, encoge tras tick 20). Textura `srparasites:particle/biomass`. |
| `ParticleEen` | `Particle` | Estela/relámpago con brillo calculado (`getBrightnessForRender`); reutiliza textura `particle/spore`. Tiene `Factory`. |

### 3.2 Registro y spawn

- `SRPEnumParticle` es un **enum propio** con valores: `FOG(0)`, `SPORE(1)`, `GCLOUD(2)`, `GSPLASH(3)`,
  `RHAPPY(4)`, `BIOMASS(5)`, `EEN(6)`; campos `particleName`, `particleID`, `shouldIgnoreRange`,
  `argumentCount`; mantiene mapas `PARTICLES`/`BY_NAME` y métodos `getParticleFromId`, `getByName`,
  `getParticleNames`.
- `ParticleSpawner.spawnParticle(SRPEnumParticle type, x,y,z, xs,ys,zs, r,g,b)` **instancia directamente**
  la clase concreta según el enum y llama a `mc.effectRenderer.addEffect(part)`. Comprueba
  `gameSettings.particleSetting` (si `>= 1`, no spawnea). No hay `IParticleFactory` registrado en el
  `ParticleManager` de vanilla: los `Factory` internos de `ParticleFog`/`ParticleSpore`/`ParticleEen`
  existen pero **no se usan** (no hay llamadas a `registerParticle`).
- **Texturas**: se registran vía `SRPEventHandlerBus.stitchEventPre(TextureStitchEvent.Pre)` con
  `event.getMap().registerSprite(...)` para `ParticleSpore.PARTICLES_TEXTURE`, `ParticleFog.PARTICLES_TEXTURE`,
  las 5 de `ParticleMultipleGore` (`TEXTUREINFECTED/SPIDER/PRIMITIVE/ADAPTED/VOMIT`), `ParticleRHappy.PARTICLES_TEXTURE`
  y `ParticleBiomass.PARTICLES_TEXTURE`. Se resuelven en runtime con
  `Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(nombre)` (`setParticleTexture`).
  `ParticleRGBSmoke` y `ParticleFog` no fijan atlas sprite (usan `particleTextureIndex`/índice vanilla).

---

## 4. `SRPRenderHandler` (util/handlers)

`public class SRPRenderHandler` con un único método estático `registryEntityRenders()`.

- **Sin `RenderingRegistry` de tile entities ni `ModelRegistry`**: solo
  `RenderingRegistry.registerEntityRenderingHandler(Class<T>, IRenderFactory<T>)`.
- **Guardas de configuración**: retorna temprano si `!SRPConfig.allowMobs`; cada mob se registra condicionado
  a flags de `SRPConfigMobs` (`hebluEnabled`, `hostEnabled`, `thrallEnabled`, `infendermanEnabled`,
  `infhumanEnabled`, …, `zetmoEnabled`, etc.). Algunos son incondicionales (`EntityKirin`, `EntityOroncoAW`,
  `EntityVenkrol*`, `EntityDod*`, `EntityLeem*`, `EntityLesh`, `EntityNak`, proyectiles, efectos).
- **Patrón**: clase anónima `new IRenderFactory<EntityX>(){ public Render<? super EntityX> createRenderFor(RenderManager manager){ return new RenderX(manager); } }`.
- **Proyectiles** (§6): registra `EntityProjectileWebball/Spineball/Nade/AlafhaBall/Angedball/Pullball/Ancientball/Biomass/DragonE/LenciaBall/ElviaBall` y `EntityThrowableAntiInfestedBlock`
  todos con `new SRPProjectile(manager, 0.5f, ResourceLocation("srparasites","textures/entity/projectile/*.png"))`;
  `EntityProjectileHomming` usa `RenderProjectileHomming`; `EntityGore` usa `RenderGore`; `EntityDropPod` usa `RenderAncientPod`.
- **Efectos/entidades sin modelo**: `EntityDamage`, `EntitySource`, `EntityToxicCloud`, `EntityParasiticScent`
  (salvo `oneMindDebug`), `EntityScaryOrb`, `EntityNade`, `EntityWave`, `EntityWaveShock`, `EntityRemain`,
  `EntityBody`, `EntityBodyModel`, `EntityBiomass`, `EntityBomb`, `EntityTendril`.
- No usa `RenderRegistry`/`ModelRegistry` (esos no existen en 1.12.2; el equivalente es `RenderingRegistry`).

---

## 5. `SRPRegisterModels` (util/handlers)

`@Mod.EventBusSubscriber(Side.CLIENT)`, método `@SubscribeEvent registerModels(ModelRegistryEvent)` →
`registerItemModels()`.

- **Ítems**: `registerItemModel(Item)` → `ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"))`.
  Cubre ~130 ítems de `SRPItems` (drops, `itembase`, herramientas evolutivas `itemEvolve/Assimilate/Devolve/Variant`,
  armas `weapon_scythe/axe/sword/cleaver/bow/maul/lance` (+ `Sentient`), armaduras `armor_helmet/chest/pants/boots`
  (+ `Sentient`), y ~90 spawn eggs `itemmobspawner_*`).
- **Bloques**: `registerItemModel(Block)` → `ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, ... "inventory")`.
  Cubre bloques de `SRPBlocks` (`InfestedStain/Rubble/Trunk`, `BiomeHeart`, `ColonyHeart/Outpost`,
  `BiomePurifier`, `SRPWeb`, `ParasiteStructure`, `ParasiteThin`, stairs/slabs, `ParasiteVine/Fog/Mouth`,
  `ParasiteCanisterActive`, `dodN`, `BloodyIce`, …).
- **Metadata**: `registerItemModel(Block, int meta, String fileName)` → `ModelResourceLocation(new ResourceLocation("srparasites", fileName), "inventory")`.
  `registerBlockVariants()` itera los `EnumType.values()` de:
  `BlockWebBase`, `BlockGore`, `BlockEvolutionLure`, `BlockInfestedBush`, `BlockParasiteCanister`,
  `BlockParasiteRubble`, `BlockParasiteStain`, `BlockParasiteTrunk`, `BlockParasiteBush`,
  `BlockParasiteSapling`, `BlockParasiteRubbleDense`, `BlockInfestedOre` (prefijos `web_`, `gore_`, `lure_`,
  `infestedbush_`, `canister_`, `rubble_`, `stain_`, `trunk_`, `parasitebush_`, `sapling_`, `rubbledense_`,
  `infestedore_`), más `BloodyIce` meta 0.
- **Mesh/StateMapper personalizado** (`RegisterCustomMashesAndStates`): para `SRPBlocks.DeadBlood`,
  `ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(DeadBlood), ItemMeshDefinition{ getModelLocation → "srparasites:deadblood#fluid" })`
  y `ModelLoader.setCustomStateMapper(DeadBlood, StateMapperBase{ getModelResourceLocation → "srparasites:deadblood#fluid" })`.
  **No** se usa `ItemMeshDefinition`/`IStateMapper` en ningún otro sitio.
- **No** se registran modelos de entidad por JSON ni `ModelRegistry` (los modelos de mob son Java puros, §2).

---

## 6. `SRPProjectile` y otros renders de proyectiles

- `client.SRPProjectile extends Render` (raw, **no** `Render<T>`): campos `float scale` y `ResourceLocation texture`.
  Constructores `(RenderManager, float)` y `(RenderManager, float, ResourceLocation)`; `setTexture(...)`.
  `doRender(...)`:
  - `GlStateManager.pushMatrix/translate/enableRescaleNormal/scale(scale,scale,scale)`,
  - orienta al `renderManager.playerViewY/playerViewX` (billboard),
  - dibuja un quad con `Tessellator.getInstance().getBuffer()`, `bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL)`
    (4 `pos().tex().normal().endVertex()`), `tessellator.draw()`,
  - soporta `renderOutlines` (`enableColorMaterial`/`enableOutlineMode`).
  - `getEntityTexture` devuelve `this.texture`.
- Usado por 12 proyectiles (ver §4). Escala fija `0.5f`; texturas en `textures/entity/projectile/`
  (`webball`, `spineball`, `nade`, `alafha`, `anged`, `pullingweb`, `ancient`, `cleaner`, `biomass`, `dragone`, `lencia`, `elvia`).
- `RenderProjectileHomming extends Render<EntityProjectileHomming>`: modelo `ModelProjectileHomming`,
  textura `textures/entity/projectile/projectileh.png`, doble pasada (normal + translúcida).
- `RenderGore extends Render<EntityGore>`: modelo `ModelGore`, textura `monster/gore.png`, `translate(x, y+1.5, z)`,
  rotación 180° en Z y `model.render(...)`.
- `RenderAncientPod extends RenderLiving<EntityDropPod>`: modelo `ModelDropPod`, textura `monster/ancientpod.png`.
- `RenderBomb`, `RenderNade`, `RenderScaryOrb`, `RenderRemain`, `RenderWave`, `RenderWaveShock`, `RenderEntityBody(Model)`
  completan los renders "sin entidad viva".

---

## 7. Hallazgos para migrar a 1.20.1

Resumen de las API de 1.12.2 usadas y su equivalente en 1.20.1:

1. **Renderers de entidad**
   - `Render<T>` / `RenderLiving<T>` / `RenderLivingBase<T>` → `EntityRenderer<T>` / `LivingEntityRenderer<T, M extends EntityModel<T>>`,
     con `EntityRendererProvider.Context` en lugar de `RenderManager`.
   - `IRenderFactory` + `RenderingRegistry.registerEntityRenderingHandler` → `EntityRenderersEvent.RegisterRenderers`
     (`event.registerEntityRenderer(EntityType<T>, ctx -> new RenderX(ctx))`).
   - Firma `doRender(entity, x,y,z, yaw, partialTicks)` → `render(T, float entityYaw, float partialTicks, PoseStack, MultiBufferSource, int packedLight)`.
   - `getEntityTexture` → `getTextureLocation(T)`.
   - `preRenderCallback` → transformaciones sobre `PoseStack` (`poseStack.scale/translate`).
2. **GlStateManager / dibujo inmediato**
   - `GlStateManager.pushMatrix/popMatrix/translate/rotate/scale/enableRescaleNormal` → `PoseStack.pushPose()/popPose()/translate()/mulPose(Axis.XP.rotationDegrees(...))/scale()`
     (`com.mojang.math.Axis`).
   - `GlStateManager.color/blendFunc/depthMask/alphaFunc` → `RenderType` + `VertexConsumer.color()`;
     `bindTexture` → `RenderType.entityCutoutNoCull(...)` o `RenderType.entityTranslucent(...)`.
   - `Tessellator`/`BufferBuilder` + `DefaultVertexFormats.POSITION_TEX_NORMAL` (clave en `SRPProjectile`,
     `RenderGore`, `RenderEntityBody(Model)`) → `Tesselator`/`BufferBuilder` con `VertexFormat`/`VertexFormatElement`,
     o preferiblemente `MultiBufferSource.getBuffer(...)` + `VertexConsumer.vertex(...).uv(...).normal(...).endVertex()`.
     El quad manual de `SRPProjectile` debe reescribirse como `VertexConsumer`/`RenderType`.
   - `GlStateManager.glTexEnv`/`glTexEnvi`/`OpenGlHelper` usados por `RenderMalleable`, `RenderCosmical` y
     `RenderEntityBodyModel` para "brightness/hurt flash" → sustituir por `OverlayTexture`/`packedOverlay`
     y shaders/`RenderType`; `DynamicTexture`/`GLAllocation.createDirectFloatBuffer` y
     `enableBlendProfile(TRANSPARENT_MODEL)` ya no existen.
   - `Minecraft.getMinecraft().entityRenderer.setupFogColor(...)` (usado en `LayerGlowing`/`LayerSnow`) → sin equivalente directo.
3. **Modelos**
   - `ModelBase` → `EntityModel<T>`; `ModelRenderer` → `ModelPart`; `addBox` → `PartDefinition.addOrReplaceChild(... CubeListBuilder.create().texOffs(u,v).addBox(...))`.
   - `textureWidth/textureHeight` + `ModelRenderer(this, u, v)` → `LayerDefinition` (texWidth/texHeight + `createRootDefinition`),
     registrado con `ModelLayerLocation` y `context.bakeLayer(...)` (`EntityRenderersEvent.RegisterLayerDefinitions`).
   - `ModelBiped` → `HumanoidModel<LivingEntity>` (`HumanoidModel.ArmPose`, `postRenderArm`); `SRPModelBiped`
     debe migrarse a `HumanoidModel` + `LayerDefinition`.
   - `render(Entity, limbSwing, ..., scale)` → `setupAnim(...)` + `renderToBuffer(PoseStack, VertexConsumer, packedLight, packedOverlay, r,g,b,a)`.
   - `ModelSRP` (utilidades de swing) se puede conservar como clase base, adaptando tipos de `ModelRenderer`→`ModelPart`.
4. **Capas**
   - `LayerRenderer<T>` → `RenderLayer<T, M>`; `addLayer(...)` igual pero con genéricos de modelo.
   - `LayerArmorBase<ModelBiped>` + `initArmor`/`getArmorModelHook`/`setModelSlotVisible` → `HumanoidArmorLayer<M, A, S>`
     (con `ArmorModelSet`); `SRPLayerBipedArmor` debe reescribirse sobre `HumanoidArmorLayer`.
   - `LayerGlowing`/`LayerSnow` → `RenderLayer` con `MultiBufferSource`/`VertexConsumer`.
5. **Partículas**
   - `Particle` (con `setParticleTexture`/`setParticleTextureIndex`/`getFXLayer`) → `TextureSheetParticle` con `SpriteSet`.
   - `IParticleFactory`/`ParticleManager` → `ParticleProvider<T>` + `ParticleType<T>` registrado en
     `RegisterParticleProvidersEvent` (`event.registerSpriteSet(PARTICLE_TYPE, Provider::new)`).
   - Texturas por `TextureStitchEvent.Pre` + `getTextureMapBlocks().getAtlasSprite` → atlas de partículas
     (`textures/particle/*.json`) + `SpriteSet`; `srparasites:particle/...` se convierten en JSON de atlas.
   - `mc.effectRenderer.addEffect` → `level.addParticle(ParticleType, ...)` o `ParticleEngine.createParticle`.
   - `EnumParticleTypes` (usado en `EntityToxicCloud`, `EntityScaryOrb`, proyectiles) → `ParticleTypes`.
   - `SRPEnumParticle`/`ParticleSpawner` pueden mantenerse como capa propia, pero deben delegar en `ParticleType`/`ParticleProvider`.
6. **Registro de modelos de ítem/bloque**
   - `ModelRegistryEvent` → `ModelEvent.RegisterAdditional` / `RegisterClientReloadListeners` (los modelos ya no se "setean" por código).
   - `ModelLoader.setCustomModelResourceLocation` / `ItemMeshDefinition` → modelos JSON por ítem/`ItemProperties.register`
     + `ModelResourceLocation` en `models/item/*.json`.
   - `StateMapperBase`/`IStateMapper` (usado solo para `DeadBlood` fluido) → `blockstates` JSON + `BlockStateModelLoader`/`ModelResourceLocation` con variante `fluid`.
   - `Item.getItemFromBlock` → `Item.BY_BLOCK.get(block)`.
7. **Tile entities / BlockEntityRenderer**
   - El mod registra `TileEntityCanister` y `TileEntityDod` pero **no** tiene `TileEntitySpecialRenderer`.
     Si en 1.20.1 se desea render propio, el patrón es `BlockEntityRenderer<T>` +
     `BlockEntityRenderersEvent.RegisterRenderers` (`event.registerBlockEntityRenderer(...)`).
8. **Otros**
   - `@SideOnly(Side.CLIENT)` / `@Mod.EventBusSubscriber(Side.CLIENT)` → `Dist.CLIENT` /
     `@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)`.
   - `ResourceLocation(String, String)` → `ResourceLocation.fromNamespaceAndPath(...)` (o `parse`).
   - `EnumHandSide`/`EnumHand` (usado en `SRPModelBiped`) → `HumanoidArm`/`InteractionHand`.
   - `EntityPMalleable`/`EntityPCosmical` (lógica de "hurt flash" y glow) siguen existiendo como entidades,
     pero el pipeline de brillo por `GlStateManager` debe migrarse a `RenderType.entityCutoutNoCull(...)` + `OverlayTexture`.

---

## Resumen ejecutivo

El cliente del mod es un sistema **puramente Java/procedimental**, sin JSON de modelos de entidad ni
TileEntityRenderers. `SRPRenderHandler.registryEntityRenders()` (invocado desde `ClientProxy.preInit` →
`SRPRegistryHandlers.initRenders`) registra ~130 renderers vía `RenderingRegistry` + `IRenderFactory`,
apoyados en dos bases propias (`RenderMalleable` y `RenderCosmical`, ambas sobre `RenderLiving`) y en capas
`LayerGlowing`/`LayerSnow`/`SRPLayerBipedArmor`. Los **129 modelos** son todos box-based con
`ModelRenderer`/`addBox`, mayoritariamente extendiendo `ModelSRP`, y los más pesados son los jefes
(`ModelOronco`, `ModelHeed`, `ModelHeblu`, `ModelDodSIV`). Las **7 partículas** (`ParticleFog`, `ParticleSpore`,
`ParticleRGBSmoke`, `ParticleMultipleGore`, `ParticleRHappy`, `ParticleBiomass`, `ParticleEen`) se eligen con
`SRPEnumParticle` e instancian directamente en `ParticleSpawner`, con sprites cosidos en
`SRPEventHandlerBus.stitchEventPre`. `SRPProjectile` dibuja proyectiles como quad billboard con
`Tessellator`/`GlStateManager`. `SRPRegisterModels` registra ítems/bloques con
`ModelLoader.setCustomModelResourceLocation` (metadatos por `EnumType`) y mesh/state mapper para `DeadBlood`.
Para 1.20.1 hay que migrar a `EntityRenderer`/`LivingEntityRenderer` + `PoseStack`/`MultiBufferSource`/`VertexConsumer`,
`EntityModel`/`ModelPart`/`LayerDefinition`, `RenderLayer`/`HumanoidArmorLayer`, `ParticleType`/`ParticleProvider` +
`SpriteSet`, `EntityRenderersEvent.RegisterRenderers`/`RegisterLayerDefinitions` y `ItemProperties`/JSON de modelos.

**Archivo del informe:** `C:\Users\Kevin Aguilar\Documents\Proyecto predeterminado\srparasites\reports\analysis_client.md`
