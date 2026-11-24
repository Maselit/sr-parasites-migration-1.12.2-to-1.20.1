package com.dhanantry.scapeandrunparasites.init;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.entity.*;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.*;
import com.dhanantry.scapeandrunparasites.entity.monster.*;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.*;
import com.dhanantry.scapeandrunparasites.entity.monster.ancient.*;
import com.dhanantry.scapeandrunparasites.entity.monster.awakened.*;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.*;
import com.dhanantry.scapeandrunparasites.entity.monster.derived.*;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.*;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.*;
import com.dhanantry.scapeandrunparasites.entity.monster.feral.*;
import com.dhanantry.scapeandrunparasites.entity.monster.focused.*;
import com.dhanantry.scapeandrunparasites.entity.monster.hijacked.*;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.*;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.*;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.head.*;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.*;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.*;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.preeminent.*;
import com.dhanantry.scapeandrunparasites.entity.projectile.*;
import com.dhanantry.scapeandrunparasites.entity.tile.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.monster.Monster;
import net.minecraftforge.registries.RegistryObject;

/**
 * Migracion de SRPEntities a 1.20.1 (DeferredRegister<EntityType<?>>).
 * STUB: las clases de entidad son esqueletos; la logica real (IA/NBT/sync) se migrara en lotes posteriores.
 */
public class SRPEntities {
    public static void init() {
        // Fuerza la carga de la clase para registrar los EntityType.
    }

    public static final RegistryObject<EntityType<EntityDorpa>> ENTITYDORPA =
        SRPMain.ENTITIES.register("sim_bigspider", () -> EntityType.Builder.of(EntityDorpa::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_bigspider"));
    public static final RegistryObject<EntityType<EntityInfSquid>> ENTITYINFSQUID =
        SRPMain.ENTITIES.register("sim_squid", () -> EntityType.Builder.of(EntityInfSquid::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_squid"));
    public static final RegistryObject<EntityType<EntityInfHuman>> ENTITYINFHUMAN =
        SRPMain.ENTITIES.register("sim_human", () -> EntityType.Builder.of(EntityInfHuman::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_human"));
    public static final RegistryObject<EntityType<EntityInfCow>> ENTITYINFCOW =
        SRPMain.ENTITIES.register("sim_cow", () -> EntityType.Builder.of(EntityInfCow::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_cow"));
    public static final RegistryObject<EntityType<EntityInfSheep>> ENTITYINFSHEEP =
        SRPMain.ENTITIES.register("sim_sheep", () -> EntityType.Builder.of(EntityInfSheep::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_sheep"));
    public static final RegistryObject<EntityType<EntityInfWolf>> ENTITYINFWOLF =
        SRPMain.ENTITIES.register("sim_wolf", () -> EntityType.Builder.of(EntityInfWolf::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_wolf"));
    public static final RegistryObject<EntityType<EntityInfPig>> ENTITYINFPIG =
        SRPMain.ENTITIES.register("sim_pig", () -> EntityType.Builder.of(EntityInfPig::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_pig"));
    public static final RegistryObject<EntityType<EntityInfVillager>> ENTITYINFVILLAGER =
        SRPMain.ENTITIES.register("sim_villager", () -> EntityType.Builder.of(EntityInfVillager::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_villager"));
    public static final RegistryObject<EntityType<EntityInfPlayer>> ENTITYINFPLAYER =
        SRPMain.ENTITIES.register("sim_adventurer", () -> EntityType.Builder.of(EntityInfPlayer::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_adventurer"));
    public static final RegistryObject<EntityType<EntityInfHorse>> ENTITYINFHORSE =
        SRPMain.ENTITIES.register("sim_horse", () -> EntityType.Builder.of(EntityInfHorse::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_horse"));
    public static final RegistryObject<EntityType<EntityInfBear>> ENTITYINFBEAR =
        SRPMain.ENTITIES.register("sim_bear", () -> EntityType.Builder.of(EntityInfBear::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_bear"));
    public static final RegistryObject<EntityType<EntityInfEnderman>> ENTITYINFENDERMAN =
        SRPMain.ENTITIES.register("sim_enderman", () -> EntityType.Builder.of(EntityInfEnderman::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_enderman"));
    public static final RegistryObject<EntityType<EntityInfDragonE>> ENTITYINFDRAGONE =
        SRPMain.ENTITIES.register("sim_dragone", () -> EntityType.Builder.of(EntityInfDragonE::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_dragone"));
    public static final RegistryObject<EntityType<EntityInfSheepHead>> ENTITYINFSHEEPHEAD =
        SRPMain.ENTITIES.register("sim_sheephead", () -> EntityType.Builder.of(EntityInfSheepHead::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_sheephead"));
    public static final RegistryObject<EntityType<EntityInfWolfHead>> ENTITYINFWOLFHEAD =
        SRPMain.ENTITIES.register("sim_wolfhead", () -> EntityType.Builder.of(EntityInfWolfHead::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_wolfhead"));
    public static final RegistryObject<EntityType<EntityInfCowHead>> ENTITYINFCOWHEAD =
        SRPMain.ENTITIES.register("sim_cowhead", () -> EntityType.Builder.of(EntityInfCowHead::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_cowhead"));
    public static final RegistryObject<EntityType<EntityInfPigHead>> ENTITYINFPIGHEAD =
        SRPMain.ENTITIES.register("sim_pighead", () -> EntityType.Builder.of(EntityInfPigHead::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_pighead"));
    public static final RegistryObject<EntityType<EntityInfVillagerHead>> ENTITYINFVILLAGERHEAD =
        SRPMain.ENTITIES.register("sim_villagerhead", () -> EntityType.Builder.of(EntityInfVillagerHead::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_villagerhead"));
    public static final RegistryObject<EntityType<EntityInfHorseHead>> ENTITYINFHORSEHEAD =
        SRPMain.ENTITIES.register("sim_horsehead", () -> EntityType.Builder.of(EntityInfHorseHead::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_horsehead"));
    public static final RegistryObject<EntityType<EntityInfHumanHead>> ENTITYINFHUMANHEAD =
        SRPMain.ENTITIES.register("sim_humanhead", () -> EntityType.Builder.of(EntityInfHumanHead::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_humanhead"));
    public static final RegistryObject<EntityType<EntityInfEndermanHead>> ENTITYINFENDERMANHEAD =
        SRPMain.ENTITIES.register("sim_endermanhead", () -> EntityType.Builder.of(EntityInfEndermanHead::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_endermanhead"));
    public static final RegistryObject<EntityType<EntityInfDragonEHead>> ENTITYINFDRAGONEHEAD =
        SRPMain.ENTITIES.register("sim_dragonehead", () -> EntityType.Builder.of(EntityInfDragonEHead::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_dragonehead"));
    public static final RegistryObject<EntityType<EntityInfPlayerHead>> ENTITYINFPLAYERHEAD =
        SRPMain.ENTITIES.register("sim_adventurerhead", () -> EntityType.Builder.of(EntityInfPlayerHead::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sim_adventurerhead"));
    public static final RegistryObject<EntityType<EntityFerBear>> ENTITYFERBEAR =
        SRPMain.ENTITIES.register("fer_bear", () -> EntityType.Builder.of(EntityFerBear::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("fer_bear"));
    public static final RegistryObject<EntityType<EntityFerCow>> ENTITYFERCOW =
        SRPMain.ENTITIES.register("fer_cow", () -> EntityType.Builder.of(EntityFerCow::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("fer_cow"));
    public static final RegistryObject<EntityType<EntityFerEnderman>> ENTITYFERENDERMAN =
        SRPMain.ENTITIES.register("fer_enderman", () -> EntityType.Builder.of(EntityFerEnderman::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("fer_enderman"));
    public static final RegistryObject<EntityType<EntityFerHorse>> ENTITYFERHORSE =
        SRPMain.ENTITIES.register("fer_horse", () -> EntityType.Builder.of(EntityFerHorse::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("fer_horse"));
    public static final RegistryObject<EntityType<EntityFerHuman>> ENTITYFERHUMAN =
        SRPMain.ENTITIES.register("fer_human", () -> EntityType.Builder.of(EntityFerHuman::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("fer_human"));
    public static final RegistryObject<EntityType<EntityFerPig>> ENTITYFERPIG =
        SRPMain.ENTITIES.register("fer_pig", () -> EntityType.Builder.of(EntityFerPig::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("fer_pig"));
    public static final RegistryObject<EntityType<EntityFerSheep>> ENTITYFERSHEEP =
        SRPMain.ENTITIES.register("fer_sheep", () -> EntityType.Builder.of(EntityFerSheep::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("fer_sheep"));
    public static final RegistryObject<EntityType<EntityFerVillager>> ENTITYFERVILLAGER =
        SRPMain.ENTITIES.register("fer_villager", () -> EntityType.Builder.of(EntityFerVillager::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("fer_villager"));
    public static final RegistryObject<EntityType<EntityFerWolf>> ENTITYFERWOLF =
        SRPMain.ENTITIES.register("fer_wolf", () -> EntityType.Builder.of(EntityFerWolf::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("fer_wolf"));
    public static final RegistryObject<EntityType<EntityHiBlaze>> ENTITYHIBLAZE =
        SRPMain.ENTITIES.register("hi_blaze", () -> EntityType.Builder.of(EntityHiBlaze::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("hi_blaze"));
    public static final RegistryObject<EntityType<EntityHiGolem>> ENTITYHIGOLEM =
        SRPMain.ENTITIES.register("hi_golem", () -> EntityType.Builder.of(EntityHiGolem::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("hi_golem"));
    public static final RegistryObject<EntityType<EntityHiSkeleton>> ENTITYHISKELETON =
        SRPMain.ENTITIES.register("hi_skeleton", () -> EntityType.Builder.of(EntityHiSkeleton::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("hi_skeleton"));
    public static final RegistryObject<EntityType<EntityRathol>> ENTITYRATHOL =
        SRPMain.ENTITIES.register("carrier_heavy", () -> EntityType.Builder.of(EntityRathol::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("carrier_heavy"));
    public static final RegistryObject<EntityType<EntityGothol>> ENTITYGOTHOL =
        SRPMain.ENTITIES.register("carrier_light", () -> EntityType.Builder.of(EntityGothol::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("carrier_light"));
    public static final RegistryObject<EntityType<EntityLodo>> ENTITYLODO =
        SRPMain.ENTITIES.register("buglin", () -> EntityType.Builder.of(EntityLodo::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("buglin"));
    public static final RegistryObject<EntityType<EntityButhol>> ENTITYBUTHOL =
        SRPMain.ENTITIES.register("carrier_flying", () -> EntityType.Builder.of(EntityButhol::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("carrier_flying"));
    public static final RegistryObject<EntityType<EntityMudo>> ENTITYMUDO =
        SRPMain.ENTITIES.register("rupter", () -> EntityType.Builder.of(EntityMudo::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("rupter"));
    public static final RegistryObject<EntityType<EntityLesh>> ENTITYLESH =
        SRPMain.ENTITIES.register("movingflesh", () -> EntityType.Builder.of(EntityLesh::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("movingflesh"));
    public static final RegistryObject<EntityType<EntityKol>> ENTITYKOL =
        SRPMain.ENTITIES.register("worker", () -> EntityType.Builder.of(EntityKol::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("worker"));
    public static final RegistryObject<EntityType<EntityNuuh>> ENTITYNUUH =
        SRPMain.ENTITIES.register("mangler", () -> EntityType.Builder.of(EntityNuuh::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("mangler"));
    public static final RegistryObject<EntityType<EntityAta>> ENTITYATA =
        SRPMain.ENTITIES.register("gnat", () -> EntityType.Builder.of(EntityAta::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("gnat"));
    public static final RegistryObject<EntityType<EntityVenkrol>> ENTITYVENKROL =
        SRPMain.ENTITIES.register("beckon_si", () -> EntityType.Builder.of(EntityVenkrol::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("beckon_si"));
    public static final RegistryObject<EntityType<EntityVenkrolSII>> ENTITYVENKROLSII =
        SRPMain.ENTITIES.register("beckon_sii", () -> EntityType.Builder.of(EntityVenkrolSII::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("beckon_sii"));
    public static final RegistryObject<EntityType<EntityVenkrolSIII>> ENTITYVENKROLSIII =
        SRPMain.ENTITIES.register("beckon_siii", () -> EntityType.Builder.of(EntityVenkrolSIII::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("beckon_siii"));
    public static final RegistryObject<EntityType<EntityVenkrolSIV>> ENTITYVENKROLSIV =
        SRPMain.ENTITIES.register("beckon_siv", () -> EntityType.Builder.of(EntityVenkrolSIV::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("beckon_siv"));
    public static final RegistryObject<EntityType<EntityDodT>> ENTITYDODT =
        SRPMain.ENTITIES.register("dispatcherten", () -> EntityType.Builder.of(EntityDodT::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("dispatcherten"));
    public static final RegistryObject<EntityType<EntityDod>> ENTITYDOD =
        SRPMain.ENTITIES.register("dispatcher_si", () -> EntityType.Builder.of(EntityDod::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("dispatcher_si"));
    public static final RegistryObject<EntityType<EntityDodSII>> ENTITYDODSII =
        SRPMain.ENTITIES.register("dispatcher_sii", () -> EntityType.Builder.of(EntityDodSII::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("dispatcher_sii"));
    public static final RegistryObject<EntityType<EntityDodSIII>> ENTITYDODSIII =
        SRPMain.ENTITIES.register("dispatcher_siii", () -> EntityType.Builder.of(EntityDodSIII::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("dispatcher_siii"));
    public static final RegistryObject<EntityType<EntityDodSIV>> ENTITYDODSIV =
        SRPMain.ENTITIES.register("dispatcher_siv", () -> EntityType.Builder.of(EntityDodSIV::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("dispatcher_siv"));
    public static final RegistryObject<EntityType<EntityTonro>> ENTITYTONRO =
        SRPMain.ENTITIES.register("kyphosis", () -> EntityType.Builder.of(EntityTonro::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("kyphosis"));
    public static final RegistryObject<EntityType<EntityUnvo>> ENTITYUNVO =
        SRPMain.ENTITIES.register("sentry", () -> EntityType.Builder.of(EntityUnvo::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("sentry"));
    public static final RegistryObject<EntityType<EntityNak>> ENTITYNAK =
        SRPMain.ENTITIES.register("seizer", () -> EntityType.Builder.of(EntityNak::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("seizer"));
    public static final RegistryObject<EntityType<EntityRof>> ENTITYROF =
        SRPMain.ENTITIES.register("worm", () -> EntityType.Builder.of(EntityRof::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("worm"));
    public static final RegistryObject<EntityType<EntityInhooS>> ENTITYINHOOS =
        SRPMain.ENTITIES.register("incompleteform_small", () -> EntityType.Builder.of(EntityInhooS::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("incompleteform_small"));
    public static final RegistryObject<EntityType<EntityInhooM>> ENTITYINHOOM =
        SRPMain.ENTITIES.register("incompleteform_medium", () -> EntityType.Builder.of(EntityInhooM::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("incompleteform_medium"));
    public static final RegistryObject<EntityType<EntityHost>> ENTITYHOST =
        SRPMain.ENTITIES.register("host", () -> EntityType.Builder.of(EntityHost::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("host"));
    public static final RegistryObject<EntityType<EntityHostII>> ENTITYHOSTII =
        SRPMain.ENTITIES.register("hostii", () -> EntityType.Builder.of(EntityHostII::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("hostii"));
    public static final RegistryObject<EntityType<EntityHeed>> ENTITYHEED =
        SRPMain.ENTITIES.register("heed", () -> EntityType.Builder.of(EntityHeed::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("heed"));
    public static final RegistryObject<EntityType<EntityCrux>> ENTITYCRUX =
        SRPMain.ENTITIES.register("crux", () -> EntityType.Builder.of(EntityCrux::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("crux"));
    public static final RegistryObject<EntityType<EntityMes>> ENTITYMES =
        SRPMain.ENTITIES.register("thrall", () -> EntityType.Builder.of(EntityMes::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("thrall"));
    public static final RegistryObject<EntityType<EntityShyco>> ENTITYSHYCO =
        SRPMain.ENTITIES.register("pri_longarms", () -> EntityType.Builder.of(EntityShyco::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("pri_longarms"));
    public static final RegistryObject<EntityType<EntityHull>> ENTITYHULL =
        SRPMain.ENTITIES.register("pri_manducater", () -> EntityType.Builder.of(EntityHull::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("pri_manducater"));
    public static final RegistryObject<EntityType<EntityNogla>> ENTITYNOGLA =
        SRPMain.ENTITIES.register("pri_reeker", () -> EntityType.Builder.of(EntityNogla::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("pri_reeker"));
    public static final RegistryObject<EntityType<EntityEmana>> ENTITYEMANA =
        SRPMain.ENTITIES.register("pri_yelloweye", () -> EntityType.Builder.of(EntityEmana::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("pri_yelloweye"));
    public static final RegistryObject<EntityType<EntityCanra>> ENTITYCANRA =
        SRPMain.ENTITIES.register("pri_summoner", () -> EntityType.Builder.of(EntityCanra::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("pri_summoner"));
    public static final RegistryObject<EntityType<EntityBano>> ENTITYBANO =
        SRPMain.ENTITIES.register("pri_bolster", () -> EntityType.Builder.of(EntityBano::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("pri_bolster"));
    public static final RegistryObject<EntityType<EntityWymo>> ENTITYWYMO =
        SRPMain.ENTITIES.register("pri_tozoon", () -> EntityType.Builder.of(EntityWymo::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("pri_tozoon"));
    public static final RegistryObject<EntityType<EntityRanrac>> ENTITYRANRAC =
        SRPMain.ENTITIES.register("pri_arachnida", () -> EntityType.Builder.of(EntityRanrac::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("pri_arachnida"));
    public static final RegistryObject<EntityType<EntityLum>> ENTITYLUM =
        SRPMain.ENTITIES.register("pri_devourer", () -> EntityType.Builder.of(EntityLum::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("pri_devourer"));
    public static final RegistryObject<EntityType<EntityIki>> ENTITYIKI =
        SRPMain.ENTITIES.register("pri_vermin", () -> EntityType.Builder.of(EntityIki::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("pri_vermin"));
    public static final RegistryObject<EntityType<EntityShycoAdapted>> ENTITYSHYCOADAPTED =
        SRPMain.ENTITIES.register("ada_longarms", () -> EntityType.Builder.of(EntityShycoAdapted::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("ada_longarms"));
    public static final RegistryObject<EntityType<EntityHullAdapted>> ENTITYHULLADAPTED =
        SRPMain.ENTITIES.register("ada_manducater", () -> EntityType.Builder.of(EntityHullAdapted::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("ada_manducater"));
    public static final RegistryObject<EntityType<EntityNoglaAdapted>> ENTITYNOGLAADAPTED =
        SRPMain.ENTITIES.register("ada_reeker", () -> EntityType.Builder.of(EntityNoglaAdapted::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("ada_reeker"));
    public static final RegistryObject<EntityType<EntityEmanaAdapted>> ENTITYEMANAADAPTED =
        SRPMain.ENTITIES.register("ada_yelloweye", () -> EntityType.Builder.of(EntityEmanaAdapted::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("ada_yelloweye"));
    public static final RegistryObject<EntityType<EntityCanraAdapted>> ENTITYCANRAADAPTED =
        SRPMain.ENTITIES.register("ada_summoner", () -> EntityType.Builder.of(EntityCanraAdapted::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("ada_summoner"));
    public static final RegistryObject<EntityType<EntityBanoAdapted>> ENTITYBANOADAPTED =
        SRPMain.ENTITIES.register("ada_bolster", () -> EntityType.Builder.of(EntityBanoAdapted::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("ada_bolster"));
    public static final RegistryObject<EntityType<EntityRanracAdapted>> ENTITYRANRACADAPTED =
        SRPMain.ENTITIES.register("ada_arachnida", () -> EntityType.Builder.of(EntityRanracAdapted::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("ada_arachnida"));
    public static final RegistryObject<EntityType<EntityAlafha>> ENTITYALAFHA =
        SRPMain.ENTITIES.register("overseer", () -> EntityType.Builder.of(EntityAlafha::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("overseer"));
    public static final RegistryObject<EntityType<EntityAnged>> ENTITYANGED =
        SRPMain.ENTITIES.register("vigilante", () -> EntityType.Builder.of(EntityAnged::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("vigilante"));
    public static final RegistryObject<EntityType<EntityGanro>> ENTITYGANRO =
        SRPMain.ENTITIES.register("warden", () -> EntityType.Builder.of(EntityGanro::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("warden"));
    public static final RegistryObject<EntityType<EntityOmboo>> ENTITYOMBOO =
        SRPMain.ENTITIES.register("bomber_light", () -> EntityType.Builder.of(EntityOmboo::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("bomber_light"));
    public static final RegistryObject<EntityType<EntityEsor>> ENTITYESOR =
        SRPMain.ENTITIES.register("marauder", () -> EntityType.Builder.of(EntityEsor::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("marauder"));
    public static final RegistryObject<EntityType<EntityOrch>> ENTITYORCH =
        SRPMain.ENTITIES.register("monarch", () -> EntityType.Builder.of(EntityOrch::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("monarch"));
    public static final RegistryObject<EntityType<EntityFlog>> ENTITYFLOG =
        SRPMain.ENTITIES.register("grunt", () -> EntityType.Builder.of(EntityFlog::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("grunt"));
    public static final RegistryObject<EntityType<EntityJinjo>> ENTITYJINJO =
        SRPMain.ENTITIES.register("bomber_heavy", () -> EntityType.Builder.of(EntityJinjo::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("bomber_heavy"));
    public static final RegistryObject<EntityType<EntityElvia>> ENTITYELVIA =
        SRPMain.ENTITIES.register("wraith", () -> EntityType.Builder.of(EntityElvia::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("wraith"));
    public static final RegistryObject<EntityType<EntityLencia>> ENTITYLENCIA =
        SRPMain.ENTITIES.register("bogle", () -> EntityType.Builder.of(EntityLencia::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("bogle"));
    public static final RegistryObject<EntityType<EntityPheon>> ENTITYPHEON =
        SRPMain.ENTITIES.register("haunter", () -> EntityType.Builder.of(EntityPheon::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("haunter"));
    public static final RegistryObject<EntityType<EntityVesta>> ENTITYVESTA =
        SRPMain.ENTITIES.register("carrier_colony", () -> EntityType.Builder.of(EntityVesta::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("carrier_colony"));
    public static final RegistryObject<EntityType<EntityFlam>> ENTITYFLAM =
        SRPMain.ENTITIES.register("succor", () -> EntityType.Builder.of(EntityFlam::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("succor"));
    public static final RegistryObject<EntityType<EntitySoo>> ENTITYSOO =
        SRPMain.ENTITIES.register("seeker", () -> EntityType.Builder.of(EntitySoo::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("seeker"));
    public static final RegistryObject<EntityType<EntityTenn>> ENTITYTENN =
        SRPMain.ENTITIES.register("architect", () -> EntityType.Builder.of(EntityTenn::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("architect"));
    public static final RegistryObject<EntityType<EntityOronco>> ENTITYORONCO =
        SRPMain.ENTITIES.register("anc_dreadnaut", () -> EntityType.Builder.of(EntityOronco::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("anc_dreadnaut"));
    public static final RegistryObject<EntityType<EntityTerla>> ENTITYTERLA =
        SRPMain.ENTITIES.register("anc_overlord", () -> EntityType.Builder.of(EntityTerla::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("anc_overlord"));
    public static final RegistryObject<EntityType<EntityDropPod>> ENTITYDROPPOD =
        SRPMain.ENTITIES.register("anc_pod", () -> EntityType.Builder.of(EntityDropPod::new, MobCategory.MISC).sized(0.5F, 0.5F).build("anc_pod"));
    public static final RegistryObject<EntityType<EntityOroncoTen>> ENTITYORONCOTEN =
        SRPMain.ENTITIES.register("anc_dreadnaut_ten", () -> EntityType.Builder.of(EntityOroncoTen::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("anc_dreadnaut_ten"));
    public static final RegistryObject<EntityType<EntityProjectilePullball>> ENTITYPROJECTILEPULLBALL =
        SRPMain.ENTITIES.register("pullingball", () -> EntityType.Builder.of(EntityProjectilePullball::new, MobCategory.MISC).sized(0.5F, 0.5F).build("pullingball"));
    public static final RegistryObject<EntityType<EntityProjectileWebball>> ENTITYPROJECTILEWEBBALL =
        SRPMain.ENTITIES.register("webball", () -> EntityType.Builder.of(EntityProjectileWebball::new, MobCategory.MISC).sized(0.5F, 0.5F).build("webball"));
    public static final RegistryObject<EntityType<EntityProjectileSpineball>> ENTITYPROJECTILESPINEBALL =
        SRPMain.ENTITIES.register("spineball", () -> EntityType.Builder.of(EntityProjectileSpineball::new, MobCategory.MISC).sized(0.5F, 0.5F).build("spineball"));
    public static final RegistryObject<EntityType<EntityProjectileNade>> ENTITYPROJECTILENADE =
        SRPMain.ENTITIES.register("nadeball", () -> EntityType.Builder.of(EntityProjectileNade::new, MobCategory.MISC).sized(0.5F, 0.5F).build("nadeball"));
    public static final RegistryObject<EntityType<EntityProjectileAlafhaBall>> ENTITYPROJECTILEALAFHABALL =
        SRPMain.ENTITIES.register("salivaball", () -> EntityType.Builder.of(EntityProjectileAlafhaBall::new, MobCategory.MISC).sized(0.5F, 0.5F).build("salivaball"));
    public static final RegistryObject<EntityType<EntityProjectileAngedball>> ENTITYPROJECTILEANGEDBALL =
        SRPMain.ENTITIES.register("ballball", () -> EntityType.Builder.of(EntityProjectileAngedball::new, MobCategory.MISC).sized(0.5F, 0.5F).build("ballball"));
    public static final RegistryObject<EntityType<EntityProjectileAncientball>> ENTITYPROJECTILEANCIENTBALL =
        SRPMain.ENTITIES.register("ancientball", () -> EntityType.Builder.of(EntityProjectileAncientball::new, MobCategory.MISC).sized(0.5F, 0.5F).build("ancientball"));
    public static final RegistryObject<EntityType<EntityProjectileHomming>> ENTITYPROJECTILEHOMMING =
        SRPMain.ENTITIES.register("homming", () -> EntityType.Builder.of(EntityProjectileHomming::new, MobCategory.MISC).sized(0.5F, 0.5F).build("homming"));
    public static final RegistryObject<EntityType<EntityThrowableAntiInfestedBlock>> ENTITYTHROWABLEANTIINFESTEDBLOCK =
        SRPMain.ENTITIES.register("antiinfestedblock", () -> EntityType.Builder.of(EntityThrowableAntiInfestedBlock::new, MobCategory.MISC).sized(0.5F, 0.5F).build("antiinfestedblock"));
    public static final RegistryObject<EntityType<EntityProjectileBiomass>> ENTITYPROJECTILEBIOMASS =
        SRPMain.ENTITIES.register("biomassball", () -> EntityType.Builder.of(EntityProjectileBiomass::new, MobCategory.MISC).sized(0.5F, 0.5F).build("biomassball"));
    public static final RegistryObject<EntityType<EntityProjectileDragonE>> ENTITYPROJECTILEDRAGONE =
        SRPMain.ENTITIES.register("missile", () -> EntityType.Builder.of(EntityProjectileDragonE::new, MobCategory.MISC).sized(0.5F, 0.5F).build("missile"));
    public static final RegistryObject<EntityType<EntityProjectileElviaBall>> ENTITYPROJECTILEELVIABALL =
        SRPMain.ENTITIES.register("balltall", () -> EntityType.Builder.of(EntityProjectileElviaBall::new, MobCategory.MISC).sized(0.5F, 0.5F).build("balltall"));
    public static final RegistryObject<EntityType<EntityProjectileLenciaBall>> ENTITYPROJECTILELENCIABALL =
        SRPMain.ENTITIES.register("ballmall", () -> EntityType.Builder.of(EntityProjectileLenciaBall::new, MobCategory.MISC).sized(0.5F, 0.5F).build("ballmall"));
    public static final RegistryObject<EntityType<EntityScaryOrb>> ENTITYSCARYORB =
        SRPMain.ENTITIES.register("orb", () -> EntityType.Builder.of(EntityScaryOrb::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("orb"));
    public static final RegistryObject<EntityType<EntitySource>> ENTITYSOURCE =
        SRPMain.ENTITIES.register("source", () -> EntityType.Builder.of(EntitySource::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("source"));
    public static final RegistryObject<EntityType<EntityRemain>> ENTITYREMAIN =
        SRPMain.ENTITIES.register("remain", () -> EntityType.Builder.of(EntityRemain::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("remain"));
    public static final RegistryObject<EntityType<EntityBomb>> ENTITYBOMB =
        SRPMain.ENTITIES.register("bomb", () -> EntityType.Builder.of(EntityBomb::new, MobCategory.MISC).sized(0.5F, 0.5F).build("bomb"));
    public static final RegistryObject<EntityType<EntityToxicCloud>> ENTITYTOXICCLOUD =
        SRPMain.ENTITIES.register("cloudtoxic", () -> EntityType.Builder.of(EntityToxicCloud::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("cloudtoxic"));
    public static final RegistryObject<EntityType<EntityBiomass>> ENTITYBIOMASS =
        SRPMain.ENTITIES.register("biomass", () -> EntityType.Builder.of(EntityBiomass::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("biomass"));
    public static final RegistryObject<EntityType<EntityGore>> ENTITYGORE =
        SRPMain.ENTITIES.register("gore", () -> EntityType.Builder.of(EntityGore::new, MobCategory.MISC).sized(0.5F, 0.5F).build("gore"));
    public static final RegistryObject<EntityType<EntityTendril>> ENTITYTENDRIL =
        SRPMain.ENTITIES.register("tendril", () -> EntityType.Builder.of(EntityTendril::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("tendril"));
    public static final RegistryObject<EntityType<EntityParasiticScent>> ENTITYPARASITICSCENT =
        SRPMain.ENTITIES.register("scent", () -> EntityType.Builder.of(EntityParasiticScent::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("scent"));
    public static final RegistryObject<EntityType<EntityWave>> ENTITYWAVE =
        SRPMain.ENTITIES.register("wave", () -> EntityType.Builder.of(EntityWave::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("wave"));
    public static final RegistryObject<EntityType<EntityWaveShock>> ENTITYWAVESHOCK =
        SRPMain.ENTITIES.register("waveshock", () -> EntityType.Builder.of(EntityWaveShock::new, MobCategory.MONSTER).sized(0.9F, 1.9F).build("waveshock"));
    public static final RegistryObject<EntityType<EntityNade>> ENTITYNADE =
        SRPMain.ENTITIES.register("nade", () -> EntityType.Builder.of(EntityNade::new, MobCategory.MISC).sized(0.5F, 0.5F).build("nade"));
}
