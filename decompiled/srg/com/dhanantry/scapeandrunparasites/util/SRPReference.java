/*
 * Decompiled with CFR 0.152.
 */
package com.dhanantry.scapeandrunparasites.util;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import java.util.Random;

public class SRPReference {
    public static final String MOD_ID = "srparasites";
    public static final String NAME = "Scape and Run Parasites";
    public static final String VERSION = "1.9.21";
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASS = "com.dhanantry.scapeandrunparasites.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.dhanantry.scapeandrunparasites.proxy.CommonProxy";
    public static final int SHYCO_ID = 1;
    public static final int DORPA_ID = 2;
    public static final int RATHOL_ID = 3;
    public static final int EMANA_ID = 4;
    public static final int LODO_ID = 5;
    public static final int INFHUMAN_ID = 6;
    public static final int HULL_ID = 7;
    public static final int CARNA_ID = 8;
    public static final int ALAFHA_ID = 9;
    public static final int NOGLA_ID = 10;
    public static final int BUTHOL_ID = 11;
    public static final int MUDO_ID = 12;
    public static final int INFCOW_ID = 13;
    public static final int INFSHEEP_ID = 14;
    public static final int INFWOLF_ID = 15;
    public static final int VENKROL_ID = 16;
    public static final int BANO_ID = 17;
    public static final int VENKROLSII_ID = 18;
    public static final int VENKROLSIII_ID = 19;
    public static final int TERLA_ID = 20;
    public static final int INFWOLFHEAD_ID = 21;
    public static final int INFSHEEPHEAD_ID = 22;
    public static final int LESH_ID = 23;
    public static final int ORONCO_ID = 24;
    public static final int ANGED_ID = 25;
    public static final int INFPIG_ID = 26;
    public static final int INFVILLAGER_ID = 27;
    public static final int INFCOWHEAD_ID = 28;
    public static final int TONRO_ID = 29;
    public static final int UNVO_ID = 30;
    public static final int INFPIGHEAD_ID = 31;
    public static final int INFVILLAGERHEAD_ID = 32;
    public static final int GANRO_ID = 33;
    public static final int ANCIENTPOD_ID = 34;
    public static final int ORONCOTEN_ID = 35;
    public static final int KOL_ID = 36;
    public static final int WYMO_ID = 37;
    public static final int RANRAC_ID = 38;
    public static final int INHOOS_ID = 39;
    public static final int INFPLAYER_ID = 40;
    public static final int VENKROLSIV_ID = 41;
    public static final int VENKROLSV_ID = 42;
    public static final int INHOOM_ID = 43;
    public static final int INFHORSE_ID = 44;
    public static final int INFHORSEHEAD_ID = 45;
    public static final int INFHUMANHEAD_ID = 46;
    public static final int OMBOO_ID = 47;
    public static final int HOST_ID = 48;
    public static final int INFBEAR_ID = 49;
    public static final int ESOR_ID = 50;
    public static final int SHYCO_ADAPTED_ID = 51;
    public static final int HULL_ADAPTED_ID = 52;
    public static final int CANRA_ADAPTED_ID = 53;
    public static final int NOGLA_ADAPTED_ID = 54;
    public static final int EMANA_ADAPTED_ID = 55;
    public static final int BANO_ADAPTED_ID = 56;
    public static final int WYMO_ADAPTED_ID = 57;
    public static final int RANRAC_ADAPTED_ID = 58;
    public static final int INFENDERMAN_ID = 59;
    public static final int FLOG_ID = 60;
    public static final int JIN_ID = 61;
    public static final int CRUX_ID = 62;
    public static final int HEED_ID = 63;
    public static final int INFDRAGONE_ID = 64;
    public static final int JINJO_ID = 65;
    public static final int LUM_ID = 66;
    public static final int KIRIN_ID = 67;
    public static final int ORONCO_AWA_ID = 68;
    public static final int INFENDERMANHEAD_ID = 69;
    public static final int INFDRAGONEHEAD_ID = 70;
    public static final int INFPLAYERHEAD_ID = 71;
    public static final int NAK_ID = 72;
    public static final int DOD_ID = 73;
    public static final int DODT_ID = 74;
    public static final int HOSTII_ID = 75;
    public static final int NUUH_ID = 76;
    public static final int DODSII_ID = 77;
    public static final int DODSIII_ID = 78;
    public static final int DODSIV_ID = 79;
    public static final int MES_ID = 80;
    public static final int LUM_ADAPTED_ID = 81;
    public static final int SOO_ID = 82;
    public static final int SHYCO_FOCUSED_ID = 83;
    public static final int ORCH_ID = 84;
    public static final int ELVIA_ID = 85;
    public static final int LENCIA_ID = 86;
    public static final int PHEON_ID = 87;
    public static final int VESTA_ID = 88;
    public static final int FLAM_ID = 89;
    public static final int TENN_ID = 90;
    public static final int ATA_ID = 91;
    public static final int IKI_ID = 92;
    public static final int FERCOW_ID = 93;
    public static final int FERENDERMAN_ID = 94;
    public static final int FERHORSE_ID = 95;
    public static final int FERHUMAN_ID = 96;
    public static final int FERPIG_ID = 97;
    public static final int FERSHEEP_ID = 98;
    public static final int FERVILLAGER_ID = 99;
    public static final int FERWOLF_ID = 300;
    public static final int HIGOLEM_ID = 301;
    public static final int HIBLAZE_ID = 302;
    public static final int HISKELETON_ID = 303;
    public static final int GOTHOL_ID = 304;
    public static final int MOR_ID = 305;
    public static final int FERBEAR_ID = 306;
    public static final int INFSQUID_ID = 307;
    public static final int ROF_ID = 308;
    public static final int HEBLU_ID = 309;
    public static final int LEEM_ID = 310;
    public static final int LEEMSII_ID = 311;
    public static final int LEEMSIII_ID = 312;
    public static final int LEEMSIV_ID = 313;
    public static final int LEEMB_ID = 314;
    public static final int WEBBALL_ID = 101;
    public static final int SPINEBALL_ID = 102;
    public static final int SALIVABALL_ID = 103;
    public static final int BALLBALL_ID = 104;
    public static final int ANCIENTBALL_ID = 105;
    public static final int HOMMING_ID = 106;
    public static final int ANTIINFESTED_ID = 107;
    public static final int BIOMASSPROJ_ID = 108;
    public static final int MISS_ID = 109;
    public static final int NADEBALL_ID = 110;
    public static final int PULLINGBALL_ID = 111;
    public static final int ELVIAP_ID = 112;
    public static final int LENCIAP_ID = 113;
    public static final int DAMAGE_ID = 200;
    public static final int PART_ID = 201;
    public static final int TENDRIL_ID = 202;
    public static final int BOMB_ID = 203;
    public static final int GORE_ID = 204;
    public static final int BIOMASS_ID = 205;
    public static final int SCENT_ID = 206;
    public static final int TCLOUD_ID = 207;
    public static final int SOURCE_ID = 208;
    public static final int REMAIN_ID = 209;
    public static final int ORB_ID = 210;
    public static final int WAVE_ID = 211;
    public static final int NADE_ID = 212;
    public static final int WAVESHOCK_ID = 213;

    public static void setSimPlayerName(EntityParasiteBase in) {
        if (SRPConfig.parasiteNameTagChance <= in.field_70170_p.field_73012_v.nextDouble()) {
            return;
        }
        if (!SRPConfig.easterEggs) {
            return;
        }
        Random rand = new Random();
        String[] mans = new String[]{"KirbyKawaii", "LukeUCraft", "Starmitzy", "Evan Wingerter", "HiroNexus", "Nicedragonking", "koxu_malinowy", "MaysiKitti", "Zak", "Jaktt", "Rynhex", "Ancient Overlord", "Alstraire", "SpiderTato", "XIAOLONGZHANG", "Airsmoke", "Tarzan", "Lava_Bucket", "plush", "Ik\ufffd", "The FacelessLord", "Tabcaps", "Crimson Gaming", "Elsa", "yodxxx1", "HMShrub", "Dutchevz", "I_eat_beans_bruh", "bruhsec", "Icehead", "Ahmed08", "Fifermon", "JanaR\ufffdhr", "Golden Breeze", "ppie00201221", "NymbalaSergal", "BlueFFlame", "Hasuki Raven", "hybridbattery", "Sexual Grapefruit", "Guest21730qe2#8094", "ronald", "Azkadrony", "DeltaVire", "Wartin", "Spooky", "Nanja!", "RainingLamppost", "Zecabone", "Lifecraft", "Grape Juice", "LxnaAbxss", "The_Harbinger69", "bugengxinshiba", "Doomsday", "Dero", "odxico", "Salamand0r", "tishaak", "Thismightbekevin", "sdbinkley", "cloudybogdan", "kazware", "Weissair", "Paul", "fomy2176", "genericvarient", "CylexicDragonheart", "ZETA", "BigPumpkin", "Vinnelli", "AnderHorlo", "Hurricane Lord", "Bliketod", "Fishman", "Worawut Pitakbood", "Blue Storm", "Josh Leonard", "TreeVirus", "drevorubec", "UtkarshX99", "SaintedYapper", "Jonny", "E G", "Vessel ", "Luka ", "Naomi Watkins", "Lava_Bucket_", "Blixer [WR]", "Vector Zlezdekof", "Icehead", "Ragnar MK10", "jumbledsnan 67", "Birduim", "Chester Fernandez", "Kirby_Kawaii", "Michael", "Samuru", "Brecker Breckao", "HotDogHero", "Ancient Overlord", "VectorAce", "Klime65536", "Dovah", "Null", "Goozmaguze", "JA-CHINA", "XuYue", "Sylvia", "fierin plays", "Fierylion", "raptorfen", "Selene", "pacochill", "Triang_L", "Jaktt1337", "coRReLL", "Katy", "Iustin Nica", "Moony", "Creeper Carts", "Purple Snake Snak", "Astolfo Mutsuki", "Dr kortman", "Daniel Hatfield", "Moxium", "shhaha", "Trayn_Shadow", "Zipzop zewm", "ChoJoe", "ZLL2", "God", "Skunk Stripes", "Hoshea", "Jeriel Santiago", "christian talese", "Bruno Roccasalva", "camkat1212", "El par\ufffdsito", "Nitsu", "peprika", "Timo Tikun", "DJAiroldi", "Ahm3d08", "Jeka Potato", "None_Arcadia", "MoostachioCat", "Joshua Guerrero", "Volkov 0203", "Leo Bodin", "Razor Edge", "Bullfighter", "Steve ", "Sylrack", "cboss999", "Perfect Storm", "Liam Whittier", "KaijuCreeper", "Fearthetater", "xyw00", "LoGosh J'R", "LilithEECS", "Henry Clade", "Nymbala", "The Hornstein Family", "odxico co", "Blue", "Nill", "JSwizzle", "Ruin", "shar0makai"};
        if (in.field_70170_p.field_73012_v.nextInt(3) == 0) {
            mans = new String[]{"JohnIsNotImpressed", "Cephelo", "Sansrriorar", "a cats", "LoneGuy", "Robert 25", "ZETA", "Zanity", "LazyKitch", "DanieloXXelo", "ABucketOfFriedChicken", "Sweebow"};
        }
        in.func_96094_a(mans[rand.nextInt(mans.length)]);
        in.func_174805_g(true);
    }

    public static void setSimPlayerNameSub1(EntityParasiteBase in) {
        if (SRPConfig.parasiteNameTagChance <= in.field_70170_p.field_73012_v.nextDouble()) {
            return;
        }
        if (!SRPConfig.easterEggs) {
            return;
        }
        Random rand = new Random();
        String[] mans = new String[]{"KirbyKawaii", "LukeUCraft", "Starmitzy", "HiroNexus", "Nicedragonking", "koxu_malinowy", "MaysiKitti", "Jaktt", "Rynhex", "Alstraire", "SpiderTato", "XIAOLONGZHANG", "Airsmoke", "Tarzan", "Lava_Bucket", "plush", "Ik\ufffd", "The FacelessLord", "Tabcaps", "Crimson Gaming", "Elsa", "yodxxx1", "HMShrub", "Dutchevz", "I_eat_beans_bruh", "bruhsec", "Icehead", "Ahmed08", "Fifermon", "Golden Breeze", "ppie00201221", "NymbalaSergal", "BlueFFlame", "Hasuki Raven", "hybridbattery", "Guest21730qe2#8094", "DeltaVire", "Spooky", "Nanja!", "Zecabone", "Lifecraft", "Grape Juice", "bugengxinshiba", "tishaak", "Weissair", "Hurricane Lord", "Bliketod"};
        if (in.field_70170_p.field_73012_v.nextInt(3) == 0) {
            mans = new String[]{"JohnIsNotImpressed", "Cephelo", "Sansrriorar", "a cats", "LoneGuy", "Robert 25", "ZETA", "Zanity", "LazyKitch", "DanieloXXelo", "ABucketOfFriedChicken", "Sweebow", "Evan Wingerter"};
        }
        in.func_96094_a(mans[rand.nextInt(mans.length)]);
        in.func_174805_g(true);
    }
}

