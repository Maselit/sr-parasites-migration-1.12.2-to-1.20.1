package com.dhanantry.scapeandrunparasites.init;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.item.*;
import com.dhanantry.scapeandrunparasites.item.tool.*;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

/**
 * Migracion de SRPItems a 1.20.1 (DeferredRegister<Item>).
 * STUB: las clases de item son esqueletos; la logica real se migrara en lotes.
 */
public class SRPItems {
    public static final net.minecraft.world.item.Tier MATERIAL_LIVING = net.minecraft.world.item.Tiers.DIAMOND;
    public static final net.minecraft.world.item.ArmorMaterial ARMOR_LIVING = net.minecraft.world.item.ArmorMaterials.DIAMOND;
    public static final net.minecraft.world.item.ArmorMaterial ARMOR_SENTIENT = net.minecraft.world.item.ArmorMaterials.DIAMOND;

    public static final RegistryObject<Item> acanra_drop =
        SRPMain.ITEMS.register("acanra_drop", () -> new ItemBase("ada_summoner_drop", 16, 1));
    public static final RegistryObject<Item> aemana_drop =
        SRPMain.ITEMS.register("aemana_drop", () -> new ItemBase("ada_yelloweye_drop", 16, 2));
    public static final RegistryObject<Item> ahull_drop =
        SRPMain.ITEMS.register("ahull_drop", () -> new ItemBase("ada_manducater_drop", 16, 3));
    public static final RegistryObject<Item> anogla_drop =
        SRPMain.ITEMS.register("anogla_drop", () -> new ItemBase("ada_reeker_drop", 16, 4));
    public static final RegistryObject<Item> ashyco_drop =
        SRPMain.ITEMS.register("ashyco_drop", () -> new ItemBase("ada_longarms_drop", 16, 5));
    public static final RegistryObject<Item> abano_drop =
        SRPMain.ITEMS.register("abano_drop", () -> new ItemBase("ada_bolster_drop", 16, 20));
    public static final RegistryObject<Item> aranrac_drop =
        SRPMain.ITEMS.register("aranrac_drop", () -> new ItemBase("ada_arachnida_drop", 16, 21));
    public static final RegistryObject<Item> alum_drop =
        SRPMain.ITEMS.register("alum_drop", () -> new ItemBase("ada_devourer_drop", 16, 22));
    public static final RegistryObject<Item> infected_drop =
        SRPMain.ITEMS.register("infected_drop", () -> new ItemBase("assimilated_flesh", 16, 6));
    public static final RegistryObject<Item> venkrol_drop =
        SRPMain.ITEMS.register("venkrol_drop", () -> new ItemBase("beckon_drop", 16, 23));
    public static final RegistryObject<Item> dod_drop =
        SRPMain.ITEMS.register("dod_drop", () -> new ItemBase("dispatcher_drop", 16, 24));
    public static final RegistryObject<Item> itembase =
        SRPMain.ITEMS.register("itembase", () -> new ItemBase("itemtab", 1, 7));
    public static final RegistryObject<Item> itemAssimilate =
        SRPMain.ITEMS.register("itemassimilate", () -> new ItemBase("itemassimilate", 1, 28));
    public static final RegistryObject<Item> itemEvolve =
        SRPMain.ITEMS.register("itemevolve", () -> new ItemBase("itemevolve", 1, 25));
    public static final RegistryObject<Item> itemDevolve =
        SRPMain.ITEMS.register("itemdevolve", () -> new ItemBase("itemdevolve", 1, 26));
    public static final RegistryObject<Item> itemVariant =
        SRPMain.ITEMS.register("itemvariant", () -> new ItemBase("itemvariant", 1, 27));
    public static final RegistryObject<Item> itemthrow =
        SRPMain.ITEMS.register("itemthrow", () -> new ItemThrowable("itemthrow", 16));
    public static final RegistryObject<Item> itemEVClock =
        SRPMain.ITEMS.register("itemevclock", () -> new ItemEPClock("evclock", 1, 18));
    public static final RegistryObject<Item> biomeCompass =
        SRPMain.ITEMS.register("biomecompass", () -> new ItemNodeColonyCompass("nodecompass", 1));
    public static final RegistryObject<Item> tendrons =
        SRPMain.ITEMS.register("tendrons", () -> new ItemBase("dried_tendons", 1, 8));
    public static final RegistryObject<Item> infblade =
        SRPMain.ITEMS.register("infblade", () -> new ItemBase("infectious_blade_fragment", 1, 9));
    public static final RegistryObject<Item> livingcore =
        SRPMain.ITEMS.register("livingcore", () -> new ItemBase("living_core", 1, 10));
    public static final RegistryObject<Item> vileshell =
        SRPMain.ITEMS.register("vileshell", () -> new ItemBase("vile_shell", 1, 11));
    public static final RegistryObject<Item> hardbone =
        SRPMain.ITEMS.register("hardbone", () -> new ItemBase("hardened_bone_handle", 1, 12));
    public static final RegistryObject<Item> bone =
        SRPMain.ITEMS.register("bone", () -> new ItemBase("bone", 1, 13));
    public static final RegistryObject<Item> itemlurecomponent1 =
        SRPMain.ITEMS.register("itemlurecomponent1", () -> new ItemLure("lurecomponent1", 16, 1));
    public static final RegistryObject<Item> itemlurecomponent2 =
        SRPMain.ITEMS.register("itemlurecomponent2", () -> new ItemLure("lurecomponent2", 16, 2));
    public static final RegistryObject<Item> itemlurecomponent3 =
        SRPMain.ITEMS.register("itemlurecomponent3", () -> new ItemLure("lurecomponent3", 16, 3));
    public static final RegistryObject<Item> itemlurecomponent4 =
        SRPMain.ITEMS.register("itemlurecomponent4", () -> new ItemLure("lurecomponent4", 16, 4));
    public static final RegistryObject<Item> itemlurecomponent5 =
        SRPMain.ITEMS.register("itemlurecomponent5", () -> new ItemLure("lurecomponent5", 16, 5));
    public static final RegistryObject<Item> itemlurecomponent6 =
        SRPMain.ITEMS.register("itemlurecomponent6", () -> new ItemLure("lurecomponent6", 16, 6));
    public static final RegistryObject<Item> itemmobspawner_dorpa =
        SRPMain.ITEMS.register("itemmobspawner_dorpa", () -> new ItemMobSpawner("dorpa"));
    public static final RegistryObject<Item> itemmobspawner_infsquid =
        SRPMain.ITEMS.register("itemmobspawner_infsquid", () -> new ItemMobSpawner("infsquid"));
    public static final RegistryObject<Item> itemmobspawner_infbear =
        SRPMain.ITEMS.register("itemmobspawner_infbear", () -> new ItemMobSpawner("infbear"));
    public static final RegistryObject<Item> itemmobspawner_infhuman =
        SRPMain.ITEMS.register("itemmobspawner_infhuman", () -> new ItemMobSpawner("infhuman"));
    public static final RegistryObject<Item> itemmobspawner_infhumanhead =
        SRPMain.ITEMS.register("itemmobspawner_infhumanhead", () -> new ItemMobSpawner("infhumanhead"));
    public static final RegistryObject<Item> itemmobspawner_infenderman =
        SRPMain.ITEMS.register("itemmobspawner_infenderman", () -> new ItemMobSpawner("infenderman"));
    public static final RegistryObject<Item> itemmobspawner_infendermanhead =
        SRPMain.ITEMS.register("itemmobspawner_infendermanhead", () -> new ItemMobSpawner("infendermanhead"));
    public static final RegistryObject<Item> itemmobspawner_infcow =
        SRPMain.ITEMS.register("itemmobspawner_infcow", () -> new ItemMobSpawner("infcow"));
    public static final RegistryObject<Item> itemmobspawner_infcowhead =
        SRPMain.ITEMS.register("itemmobspawner_infcowhead", () -> new ItemMobSpawner("infcowhead"));
    public static final RegistryObject<Item> itemmobspawner_infsheep =
        SRPMain.ITEMS.register("itemmobspawner_infsheep", () -> new ItemMobSpawner("infsheep"));
    public static final RegistryObject<Item> itemmobspawner_infsheephead =
        SRPMain.ITEMS.register("itemmobspawner_infsheephead", () -> new ItemMobSpawner("infsheephead"));
    public static final RegistryObject<Item> itemmobspawner_infwolf =
        SRPMain.ITEMS.register("itemmobspawner_infwolf", () -> new ItemMobSpawner("infwolf"));
    public static final RegistryObject<Item> itemmobspawner_infwolfhead =
        SRPMain.ITEMS.register("itemmobspawner_infwolfhead", () -> new ItemMobSpawner("infwolfhead"));
    public static final RegistryObject<Item> itemmobspawner_infpig =
        SRPMain.ITEMS.register("itemmobspawner_infpig", () -> new ItemMobSpawner("infpig"));
    public static final RegistryObject<Item> itemmobspawner_infpighead =
        SRPMain.ITEMS.register("itemmobspawner_infpighead", () -> new ItemMobSpawner("infpighead"));
    public static final RegistryObject<Item> itemmobspawner_infvillager =
        SRPMain.ITEMS.register("itemmobspawner_infvillager", () -> new ItemMobSpawner("infvillager"));
    public static final RegistryObject<Item> itemmobspawner_infvillagerhead =
        SRPMain.ITEMS.register("itemmobspawner_infvillagerhead", () -> new ItemMobSpawner("infvillagerhead"));
    public static final RegistryObject<Item> itemmobspawner_inhooS =
        SRPMain.ITEMS.register("itemmobspawner_inhoos", () -> new ItemMobSpawner("inhoos"));
    public static final RegistryObject<Item> itemmobspawner_inhooM =
        SRPMain.ITEMS.register("itemmobspawner_inhoom", () -> new ItemMobSpawner("inhoom"));
    public static final RegistryObject<Item> itemmobspawner_infhorse =
        SRPMain.ITEMS.register("itemmobspawner_infhorse", () -> new ItemMobSpawner("infhorse"));
    public static final RegistryObject<Item> itemmobspawner_infhorsehead =
        SRPMain.ITEMS.register("itemmobspawner_infhorsehead", () -> new ItemMobSpawner("infhorsehead"));
    public static final RegistryObject<Item> itemmobspawner_infplayer =
        SRPMain.ITEMS.register("itemmobspawner_infplayer", () -> new ItemMobSpawner("infplayer"));
    public static final RegistryObject<Item> itemmobspawner_infplayerhead =
        SRPMain.ITEMS.register("itemmobspawner_infplayerhead", () -> new ItemMobSpawner("infplayerhead"));
    public static final RegistryObject<Item> itemmobspawner_infdragone =
        SRPMain.ITEMS.register("itemmobspawner_infdragone", () -> new ItemMobSpawner("infdragone"));
    public static final RegistryObject<Item> itemmobspawner_infdragonehead =
        SRPMain.ITEMS.register("itemmobspawner_infdragonehead", () -> new ItemMobSpawner("infdragonehead"));
    public static final RegistryObject<Item> itemmobspawner_ferbear =
        SRPMain.ITEMS.register("itemmobspawner_ferbear", () -> new ItemMobSpawner("ferbear"));
    public static final RegistryObject<Item> itemmobspawner_ferhuman =
        SRPMain.ITEMS.register("itemmobspawner_ferhuman", () -> new ItemMobSpawner("ferhuman"));
    public static final RegistryObject<Item> itemmobspawner_fercow =
        SRPMain.ITEMS.register("itemmobspawner_fercow", () -> new ItemMobSpawner("fercow"));
    public static final RegistryObject<Item> itemmobspawner_ferenderman =
        SRPMain.ITEMS.register("itemmobspawner_ferenderman", () -> new ItemMobSpawner("ferenderman"));
    public static final RegistryObject<Item> itemmobspawner_ferhorse =
        SRPMain.ITEMS.register("itemmobspawner_ferhorse", () -> new ItemMobSpawner("ferhorse"));
    public static final RegistryObject<Item> itemmobspawner_ferpig =
        SRPMain.ITEMS.register("itemmobspawner_ferpig", () -> new ItemMobSpawner("ferpig"));
    public static final RegistryObject<Item> itemmobspawner_fersheep =
        SRPMain.ITEMS.register("itemmobspawner_fersheep", () -> new ItemMobSpawner("fersheep"));
    public static final RegistryObject<Item> itemmobspawner_fervillager =
        SRPMain.ITEMS.register("itemmobspawner_fervillager", () -> new ItemMobSpawner("fervillager"));
    public static final RegistryObject<Item> itemmobspawner_ferwolf =
        SRPMain.ITEMS.register("itemmobspawner_ferwolf", () -> new ItemMobSpawner("ferwolf"));
    public static final RegistryObject<Item> itemmobspawner_higolem =
        SRPMain.ITEMS.register("itemmobspawner_higolem", () -> new ItemMobSpawner("higolem"));
    public static final RegistryObject<Item> itemmobspawner_hiblaze =
        SRPMain.ITEMS.register("itemmobspawner_hiblaze", () -> new ItemMobSpawner("hiblaze"));
    public static final RegistryObject<Item> itemmobspawner_hiskeleton =
        SRPMain.ITEMS.register("itemmobspawner_hiskeleton", () -> new ItemMobSpawner("hiskeleton"));
    public static final RegistryObject<Item> itemmobspawner_host =
        SRPMain.ITEMS.register("itemmobspawner_host", () -> new ItemMobSpawner("host"));
    public static final RegistryObject<Item> itemmobspawner_hostii =
        SRPMain.ITEMS.register("itemmobspawner_hostii", () -> new ItemMobSpawner("hostii"));
    public static final RegistryObject<Item> itemmobspawner_heed =
        SRPMain.ITEMS.register("itemmobspawner_heed", () -> new ItemMobSpawner("heed"));
    public static final RegistryObject<Item> itemmobspawner_cruxa =
        SRPMain.ITEMS.register("itemmobspawner_cruxa", () -> new ItemMobSpawner("cruxa"));
    public static final RegistryObject<Item> itemmobspawner_mes =
        SRPMain.ITEMS.register("itemmobspawner_mes", () -> new ItemMobSpawner("mes"));
    public static final RegistryObject<Item> itemmobspawner_lesh =
        SRPMain.ITEMS.register("itemmobspawner_lesh", () -> new ItemMobSpawner("lesh"));
    public static final RegistryObject<Item> itemmobspawner_shyco =
        SRPMain.ITEMS.register("itemmobspawner_shyco", () -> new ItemMobSpawner("shyco"));
    public static final RegistryObject<Item> itemmobspawner_canra =
        SRPMain.ITEMS.register("itemmobspawner_canra", () -> new ItemMobSpawner("canra"));
    public static final RegistryObject<Item> itemmobspawner_nogla =
        SRPMain.ITEMS.register("itemmobspawner_nogla", () -> new ItemMobSpawner("nogla"));
    public static final RegistryObject<Item> itemmobspawner_hull =
        SRPMain.ITEMS.register("itemmobspawner_hull", () -> new ItemMobSpawner("hull"));
    public static final RegistryObject<Item> itemmobspawner_emana =
        SRPMain.ITEMS.register("itemmobspawner_emana", () -> new ItemMobSpawner("emana"));
    public static final RegistryObject<Item> itemmobspawner_bano =
        SRPMain.ITEMS.register("itemmobspawner_bano", () -> new ItemMobSpawner("bano"));
    public static final RegistryObject<Item> itemmobspawner_wymo =
        SRPMain.ITEMS.register("itemmobspawner_wymo", () -> new ItemMobSpawner("wymo"));
    public static final RegistryObject<Item> itemmobspawner_iki =
        SRPMain.ITEMS.register("itemmobspawner_iki", () -> new ItemMobSpawner("iki"));
    public static final RegistryObject<Item> itemmobspawner_ranrac =
        SRPMain.ITEMS.register("itemmobspawner_ranrac", () -> new ItemMobSpawner("ranrac"));
    public static final RegistryObject<Item> itemmobspawner_lum =
        SRPMain.ITEMS.register("itemmobspawner_lum", () -> new ItemMobSpawner("lum"));
    public static final RegistryObject<Item> itemmobspawner_shycoadapted =
        SRPMain.ITEMS.register("itemmobspawner_shycoadapted", () -> new ItemMobSpawner("shycoadapted"));
    public static final RegistryObject<Item> itemmobspawner_canraadapted =
        SRPMain.ITEMS.register("itemmobspawner_canraadapted", () -> new ItemMobSpawner("canraadapted"));
    public static final RegistryObject<Item> itemmobspawner_noglaadapted =
        SRPMain.ITEMS.register("itemmobspawner_noglaadapted", () -> new ItemMobSpawner("noglaadapted"));
    public static final RegistryObject<Item> itemmobspawner_hulladapted =
        SRPMain.ITEMS.register("itemmobspawner_hulladapted", () -> new ItemMobSpawner("hulladapted"));
    public static final RegistryObject<Item> itemmobspawner_emanaadapted =
        SRPMain.ITEMS.register("itemmobspawner_emanaadapted", () -> new ItemMobSpawner("emanaadapted"));
    public static final RegistryObject<Item> itemmobspawner_banoadapted =
        SRPMain.ITEMS.register("itemmobspawner_banoadapted", () -> new ItemMobSpawner("banoadapted"));
    public static final RegistryObject<Item> itemmobspawner_ranracadapted =
        SRPMain.ITEMS.register("itemmobspawner_ranracadapted", () -> new ItemMobSpawner("ranracadapted"));
    public static final RegistryObject<Item> itemmobspawner_lodo =
        SRPMain.ITEMS.register("itemmobspawner_lodo", () -> new ItemMobSpawner("lodo"));
    public static final RegistryObject<Item> itemmobspawner_mudo =
        SRPMain.ITEMS.register("itemmobspawner_mudo", () -> new ItemMobSpawner("mudo"));
    public static final RegistryObject<Item> itemmobspawner_nuuh =
        SRPMain.ITEMS.register("itemmobspawner_nuuh", () -> new ItemMobSpawner("nuuh"));
    public static final RegistryObject<Item> itemmobspawner_ata =
        SRPMain.ITEMS.register("itemmobspawner_ata", () -> new ItemMobSpawner("ata"));
    public static final RegistryObject<Item> itemmobspawner_rathol =
        SRPMain.ITEMS.register("itemmobspawner_rathol", () -> new ItemMobSpawner("rathol"));
    public static final RegistryObject<Item> itemmobspawner_gothol =
        SRPMain.ITEMS.register("itemmobspawner_gothol", () -> new ItemMobSpawner("gothol"));
    public static final RegistryObject<Item> itemmobspawner_buthol =
        SRPMain.ITEMS.register("itemmobspawner_buthol", () -> new ItemMobSpawner("buthol"));
    public static final RegistryObject<Item> itemmobspawner_venkrol =
        SRPMain.ITEMS.register("itemmobspawner_venkrol", () -> new ItemMobSpawner("venkrol"));
    public static final RegistryObject<Item> itemmobspawner_venkrolsii =
        SRPMain.ITEMS.register("itemmobspawner_venkrolsii", () -> new ItemMobSpawner("venkrolsii"));
    public static final RegistryObject<Item> itemmobspawner_venkrolsiii =
        SRPMain.ITEMS.register("itemmobspawner_venkrolsiii", () -> new ItemMobSpawner("venkrolsiii"));
    public static final RegistryObject<Item> itemmobspawner_venkrolsiv =
        SRPMain.ITEMS.register("itemmobspawner_venkrolsiv", () -> new ItemMobSpawner("venkrolsiv"));
    public static final RegistryObject<Item> itemmobspawner_tonro =
        SRPMain.ITEMS.register("itemmobspawner_tonro", () -> new ItemMobSpawner("tonro"));
    public static final RegistryObject<Item> itemmobspawner_unvo =
        SRPMain.ITEMS.register("itemmobspawner_unvo", () -> new ItemMobSpawner("unvo"));
    public static final RegistryObject<Item> itemmobspawner_nak =
        SRPMain.ITEMS.register("itemmobspawner_nak", () -> new ItemMobSpawner("nak"));
    public static final RegistryObject<Item> itemmobspawner_dod =
        SRPMain.ITEMS.register("itemmobspawner_dod", () -> new ItemMobSpawner("dod"));
    public static final RegistryObject<Item> itemmobspawner_dodsii =
        SRPMain.ITEMS.register("itemmobspawner_dodsii", () -> new ItemMobSpawner("dodsii"));
    public static final RegistryObject<Item> itemmobspawner_dodsiii =
        SRPMain.ITEMS.register("itemmobspawner_dodsiii", () -> new ItemMobSpawner("dodsiii"));
    public static final RegistryObject<Item> itemmobspawner_dodsiv =
        SRPMain.ITEMS.register("itemmobspawner_dodsiv", () -> new ItemMobSpawner("dodsiv"));
    public static final RegistryObject<Item> itemmobspawner_alafha =
        SRPMain.ITEMS.register("itemmobspawner_alafha", () -> new ItemMobSpawner("alafha"));
    public static final RegistryObject<Item> itemmobspawner_ganro =
        SRPMain.ITEMS.register("itemmobspawner_ganro", () -> new ItemMobSpawner("ganro"));
    public static final RegistryObject<Item> itemmobspawner_omboo =
        SRPMain.ITEMS.register("itemmobspawner_omboo", () -> new ItemMobSpawner("omboo"));
    public static final RegistryObject<Item> itemmobspawner_esor =
        SRPMain.ITEMS.register("itemmobspawner_esor", () -> new ItemMobSpawner("esor"));
    public static final RegistryObject<Item> itemmobspawner_orch =
        SRPMain.ITEMS.register("itemmobspawner_orch", () -> new ItemMobSpawner("orch"));
    public static final RegistryObject<Item> itemmobspawner_flog =
        SRPMain.ITEMS.register("itemmobspawner_flog", () -> new ItemMobSpawner("flog"));
    public static final RegistryObject<Item> itemmobspawner_anged =
        SRPMain.ITEMS.register("itemmobspawner_anged", () -> new ItemMobSpawner("anged"));
    public static final RegistryObject<Item> itemmobspawner_jinjo =
        SRPMain.ITEMS.register("itemmobspawner_jinjo", () -> new ItemMobSpawner("jinjo"));
    public static final RegistryObject<Item> itemmobspawner_vesta =
        SRPMain.ITEMS.register("itemmobspawner_vesta", () -> new ItemMobSpawner("vesta"));
    public static final RegistryObject<Item> itemmobspawner_pheon =
        SRPMain.ITEMS.register("itemmobspawner_pheon", () -> new ItemMobSpawner("pheon"));
    public static final RegistryObject<Item> itemmobspawner_lencia =
        SRPMain.ITEMS.register("itemmobspawner_lencia", () -> new ItemMobSpawner("lencia"));
    public static final RegistryObject<Item> itemmobspawner_elvia =
        SRPMain.ITEMS.register("itemmobspawner_elvia", () -> new ItemMobSpawner("elvia"));
    public static final RegistryObject<Item> itemmobspawner_oronco =
        SRPMain.ITEMS.register("itemmobspawner_oronco", () -> new ItemMobSpawner("oronco"));
    public static final RegistryObject<Item> itemmobspawner_terla =
        SRPMain.ITEMS.register("itemmobspawner_terla", () -> new ItemMobSpawner("terla"));
    public static final RegistryObject<Item> itemmobspawner_pod =
        SRPMain.ITEMS.register("itemmobspawner_pod", () -> new ItemMobSpawner("pod"));
    public static final RegistryObject<Item> weapon_scythe =
        SRPMain.ITEMS.register("weapon_scythe", () -> new WeaponMeleeScythe(MATERIAL_LIVING, "scythe", -3.1, SRPConfig.weapon_scythe_range, SRPConfig.weapon_scythe_damage - 1, false, 1));
    public static final RegistryObject<Item> weapon_scytheSentient =
        SRPMain.ITEMS.register("weapon_scythesentient", () -> new WeaponMeleeScythe(MATERIAL_LIVING, "scythe_sentient", -3.3, SRPConfig.weapon_scythe_S_range, SRPConfig.weapon_scythe_S_damage - 1, true, 2));
    public static final RegistryObject<Item> weapon_axe =
        SRPMain.ITEMS.register("weapon_axe", () -> new WeaponMeleeAxe(MATERIAL_LIVING, "axe", -3.1, SRPConfig.weapon_axe_range, SRPConfig.weapon_axe_damage - 1, false, 3));
    public static final RegistryObject<Item> weapon_axeSentient =
        SRPMain.ITEMS.register("weapon_axesentient", () -> new WeaponMeleeAxe(MATERIAL_LIVING, "axe_sentient", -3.3, SRPConfig.weapon_axe_S_range, SRPConfig.weapon_axe_S_damage - 1, true, 4));
    public static final RegistryObject<Item> weapon_sword =
        SRPMain.ITEMS.register("weapon_sword", () -> new WeaponMeleeSword(MATERIAL_LIVING, "sword", -3.1, SRPConfig.weapon_sword_range, SRPConfig.weapon_sword_damage - 1, false, 5));
    public static final RegistryObject<Item> weapon_swordSentient =
        SRPMain.ITEMS.register("weapon_swordsentient", () -> new WeaponMeleeSword(MATERIAL_LIVING, "sword_sentient", -3.3, SRPConfig.weapon_sword_S_range, SRPConfig.weapon_sword_S_damage - 1, true, 6));
    public static final RegistryObject<Item> weapon_cleaver =
        SRPMain.ITEMS.register("weapon_cleaver", () -> new WeaponMeleeCleaver(MATERIAL_LIVING, "cleaver", -3.1, SRPConfig.weapon_cleaver_range, SRPConfig.weapon_cleaver_damage - 1, false, 7));
    public static final RegistryObject<Item> weapon_cleaverSentient =
        SRPMain.ITEMS.register("weapon_cleaversentient", () -> new WeaponMeleeCleaver(MATERIAL_LIVING, "cleaver_sentient", -3.3, SRPConfig.weapon_cleaver_S_range, SRPConfig.weapon_cleaver_S_damage - 1, true, 8));
    public static final RegistryObject<Item> weapon_maul =
        SRPMain.ITEMS.register("weapon_maul", () -> new WeaponMeleeMaul(MATERIAL_LIVING, "maul", -3.1, SRPConfig.weapon_maul_range, SRPConfig.weapon_maul_damage - 1, false, 9));
    public static final RegistryObject<Item> weapon_maulSentient =
        SRPMain.ITEMS.register("weapon_maulsentient", () -> new WeaponMeleeMaul(MATERIAL_LIVING, "maul_sentient", -3.3, SRPConfig.weapon_maul_S_range, SRPConfig.weapon_maul_S_damage - 1, true, 10));
    public static final RegistryObject<Item> weapon_lance =
        SRPMain.ITEMS.register("weapon_lance", () -> new WeaponMeleeLance(MATERIAL_LIVING, "lance", -3.1, SRPConfig.weapon_lance_range, SRPConfig.weapon_lance_damage - 1, false, 11));
    public static final RegistryObject<Item> weapon_lanceSentient =
        SRPMain.ITEMS.register("weapon_lancesentient", () -> new WeaponMeleeLance(MATERIAL_LIVING, "lance_sentient", -3.3, SRPConfig.weapon_lance_S_range, SRPConfig.weapon_lance_S_damage - 1, true, 12));
    public static final RegistryObject<Item> weapon_bow =
        SRPMain.ITEMS.register("weapon_bow", () -> new WeaponToolRangeBase("bow", SRPConfig.weapon_living_durability, SRPConfig.weapon_bow_bonus, SRPConfig.weapon_bow_damageCap, SRPConfig.weapon_bow_damage, false, 1));
    public static final RegistryObject<Item> weapon_bow_sentient =
        SRPMain.ITEMS.register("weapon_bow_sentient", () -> new WeaponToolRangeBase("bow_sentient", SRPConfig.weapon_living_durability, SRPConfig.weapon_bow_sentient_bonus, SRPConfig.weapon_bow_sentient_damageCap, SRPConfig.weapon_bow_sentient_damage, true, 2));
    public static final RegistryObject<Item> armor_helmet =
        SRPMain.ITEMS.register("armor_helmet", () -> new WeaponToolArmorBase(ARMOR_LIVING, "helm", 1, false, 1, net.minecraft.world.entity.EquipmentSlot.HEAD));
    public static final RegistryObject<Item> armor_chest =
        SRPMain.ITEMS.register("armor_chest", () -> new WeaponToolArmorBase(ARMOR_LIVING, "chest", 1, false, 2, net.minecraft.world.entity.EquipmentSlot.CHEST));
    public static final RegistryObject<Item> armor_pants =
        SRPMain.ITEMS.register("armor_pants", () -> new WeaponToolArmorBase(ARMOR_LIVING, "pants", 1, false, 3, net.minecraft.world.entity.EquipmentSlot.LEGS));
    public static final RegistryObject<Item> armor_boots =
        SRPMain.ITEMS.register("armor_boots", () -> new WeaponToolArmorBase(ARMOR_LIVING, "boots", 1, false, 4, net.minecraft.world.entity.EquipmentSlot.FEET));
    public static final RegistryObject<Item> armor_helmetSentient =
        SRPMain.ITEMS.register("armor_helmetsentient", () -> new WeaponToolArmorBase(ARMOR_SENTIENT, "helm_sentient", 1, true, 5, net.minecraft.world.entity.EquipmentSlot.HEAD));
    public static final RegistryObject<Item> armor_chestSentient =
        SRPMain.ITEMS.register("armor_chestsentient", () -> new WeaponToolArmorBase(ARMOR_SENTIENT, "chest_sentient", 1, true, 6, net.minecraft.world.entity.EquipmentSlot.CHEST));
    public static final RegistryObject<Item> armor_pantsSentient =
        SRPMain.ITEMS.register("armor_pantssentient", () -> new WeaponToolArmorBase(ARMOR_SENTIENT, "pants_sentient", 1, true, 7, net.minecraft.world.entity.EquipmentSlot.LEGS));
    public static final RegistryObject<Item> armor_bootsSentient =
        SRPMain.ITEMS.register("armor_bootssentient", () -> new WeaponToolArmorBase(ARMOR_SENTIENT, "boots_sentient", 1, true, 8, net.minecraft.world.entity.EquipmentSlot.FEET));

    public static void init() {
        // Fuerza la carga de la clase para registrar los items.
    }
}
