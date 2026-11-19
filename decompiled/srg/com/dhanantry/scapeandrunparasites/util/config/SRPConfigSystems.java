/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.config.Configuration
 *  net.minecraftforge.fml.common.event.FMLPreInitializationEvent
 *  org.apache.logging.log4j.Level
 */
package com.dhanantry.scapeandrunparasites.util.config;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.proxy.CommonProxy;
import java.io.File;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;

public class SRPConfigSystems {
    private static final String CATEGORY_GENERAL_SISTEMS = "configuration_systems";
    private static final String REINFORCEMENT_CATEGORY = "reinforcement_system";
    public static boolean rsEnabled = true;
    public static boolean rsSounds = true;
    public static float rschance = 0.045f;
    public static boolean rsBlockI = true;
    public static float rsBlockIMaxH = 4.5f;
    public static boolean rsPlayer = false;
    public static int rsBlockLight = 16;
    public static int rsMaxVenkrols = 100;
    public static int rsCooldown = 5;
    public static int rsVenkrolChance = 20000;
    public static boolean rsIgnoreCooldownAtSpawn = true;
    public static String optionalBlock = "minecraft:gravel";
    public static String optionalBlockRub = "minecraft:mossy_cobblestone";
    public static String[] blockBList = new String[0];
    public static boolean blockBListWhite = false;
    public static float rsBlockParticleS = 0.05f;
    public static float rsBlockParticleF = 0.05f;
    public static String[] maximumStageList = new String[]{"1;3"};
    public static boolean rsSky = false;
    public static boolean rsSkyResidue = false;
    public static int rsResidueY = 0;
    public static double rsVenkrolEmpty = 0.05;
    public static int rsMaxVenkrolChunk = 2;
    public static int rsBlockRevertStage = 1;
    private static final String MERGE_CATEGORY = "merge_System";
    public static boolean mergeRandom = true;
    public static double mergeHealth = 0.5;
    public static String[] mergeMobTable = new String[]{"srparasites:pri_summoner;0", "srparasites:pri_longarms;0", "srparasites:pri_reeker;0", "srparasites:pri_manducater;0", "srparasites:pri_bolster;0", "srparasites:pri_yelloweye;0", "srparasites:pri_arachnida;0", "srparasites:pri_vermin;0", "srparasites:pri_tozoon;0"};
    public static String[] mergeInfValues = new String[]{"srparasites:sim_human;1", "srparasites:sim_cow;1", "srparasites:sim_sheep;1", "srparasites:sim_wolf;1", "srparasites:sim_pig;1", "srparasites:sim_villager;1", "srparasites:sim_enderman;1", "srparasites:sim_bear;2", "srparasites:sim_horse;1", "srparasites:sim_squid:1"};
    private static final String STATUSEFFECTS_CATEGORY = "status_effects";
    public static boolean fearActive = true;
    public static float fearBlockChance = 0.0f;
    public static float fearItemChance = 0.0f;
    public static float fearInvChance = 0.0f;
    public static String[] fearItemBlackList = new String[0];
    public static boolean fearItemBlackListWhite = false;
    public static float fearFallDamage = 1.5f;
    public static float fearAirDamage = 1.5f;
    public static boolean cothActive = true;
    public static boolean cothLootDisable = true;
    public static int cothAura = 3;
    public static float cothConvert = 0.3f;
    public static float cothInfected = 0.7f;
    public static float cothPrimitive = 0.6f;
    public static float cothAdapted = 0.5f;
    public static float cothPure = 0.4f;
    public static float cothUnhide = 0.3f;
    public static String[] COTHVictimParasite = new String[]{"minecraft:pig;srparasites:sim_pig", "minecraft:sheep;srparasites:sim_sheep", "minecraft:cow;srparasites:sim_cow", "minecraft:wolf;srparasites:sim_wolf", "minecraft:horse;srparasites:sim_horse", "minecraft:zombie;srparasites:sim_human", "minecraft:husk;srparasites:sim_human", "minecraft:zombie_villager;srparasites:sim_villager", "minecraft:villager;srparasites:sim_villager", "minecraft:polar_bear;srparasites:sim_bear", "minecraft:enderman;srparasites:sim_enderman", "minecraft:squid;srparasites:sim_squid", "wyrmsofnyrus:creepedhumanoid;srparasites:sim_human", "wyrmsofnyrus:creepedbiter;srparasites:sim_cow", "wyrmsofnyrus:crawler;srparasites:sim_bigspider", "wyrmsofnyrus:minos;srparasites:sim_cow", "wyrmsofnyrus:prime;srparasites:crux"};
    public static float hijackHealth = 0.5f;
    public static String[] HIJACKVictimParasite = new String[]{"minecraft:villager_golem;srparasites:hi_golem"};
    public static String[] COTHItemPrevent = new String[]{"minecraft:golden_apple;0.1;300", "minecraft:golden_carrot;0.03;150"};
    public static String[] COTHImmuneList = new String[]{"minecraft:villager_golem", "minecraft:vex", "minecraft:creeper", "minecraft:slime", "minecraft:blaze", "minecraft:guardian", "minecraft:elder_guardian", "minecraft:stray", "minecraft:skeleton", "minecraft:skeleton_horse", "minecraft:wither_skeleton", "minecraft:magma_cube", "minecraft:ghast", "minecraft:shulker", "minecraft:snowman", "wyrmsofnyrus", "srrevenants"};
    public static boolean COTHImmuneListWhite = false;
    public static float bleedingDamage = 0.02f;
    public static float bleedingDamageCap = 100.0f;
    public static int corroValue = 3;
    public static double corrNot = 0.1;
    public static boolean viralEnable = true;
    public static float viralAmount = 0.5f;
    public static boolean rageEnable = true;
    public static double rageDamage = 0.1;
    public static double rageSpeed = 0.1;
    public static double epelChanceCOTH = 0.7;
    public static float needlerDamage = 0.4f;
    public static int needlerTerminal = 7;
    public static float needlerMaxDamPlayer = 1.0E9f;
    public static float needlerMaxDamMonster = 1.0E9f;
    public static String[] needlerImmuneList = new String[0];
    public static boolean needlerImmuneListWhite = false;
    public static float pivotDamageRHost = 0.2375f;
    public static float pivotDamageRNotHost = 0.05f;
    public static int pivotPointMultiplier = 2;
    public static double adapsChance = 0.2;
    private static final String EVOLUTION_CATEGORY = "parasite_evolution_phases";
    public static boolean useEvolution = true;
    public static boolean damageStationaryRS = true;
    public static byte evolutionNodeUnlock = (byte)7;
    public static byte evolutionColonyUnlock = (byte)5;
    public static boolean evolutionNoPlayerMultipler = false;
    public static byte evolutionCothStopLoot = (byte)3;
    public static byte evolutionSleepDenied = (byte)6;
    public static byte evolutionAssimilatedDehiding = (byte)5;
    public static byte evolutionMudoAttack = (byte)2;
    public static byte evolutionBeckonIgnoreCooldown = (byte)7;
    public static byte evolutionSpawningIgnoreSunlight = (byte)8;
    public static byte evolutionStopFishing = (byte)4;
    public static byte evolutionOneMind = (byte)5;
    public static byte evolutionTotalKill = (byte)8;
    public static byte evolutionFeralNoSim = (byte)6;
    public static byte evolutionNests = (byte)4;
    public static byte evolutionDislodgment = (byte)6;
    public static byte evolutionParasiteAlwaysVariant = (byte)8;
    public static byte evolutionHives = (byte)9;
    public static byte evolutionNoParasiteHealing = (byte)9;
    public static float evolutionNoParasiteHealingValue = 0.5f;
    public static byte evolutionPArasitesWithoutXP = (byte)9;
    public static byte evolutionNoParasiteSpawnDenied = (byte)10;
    public static byte evolutionParasiteStatIncrease = (byte)10;
    public static float evolutionParasiteStatIncreaseValue = 0.07f;
    public static int valueKill = 1;
    public static int valueCOTH = 6;
    public static int valueBlock = 50;
    public static int valueMerge = 10;
    public static int valueEvolutionDespawn = 100;
    public static int valueLossBlockStain = 5;
    public static int valueLossBlockTrunk = 5;
    public static int valueLossBlockRubble = 5;
    public static String[] evolutionDimStart = new String[]{"-1;-1;50", "0;0;0", "1;-1;100", "270;-1;300"};
    public static boolean evolutionDimGainInverted = false;
    public static int[] evolutionDimGain = new int[0];
    public static boolean evolutionDimLossInverted = false;
    public static int[] evolutionDimLoss = new int[0];
    public static String[] evolutionParasiteLock = new String[]{"1;3;64", "-1;7;309", "0;4;92"};
    public static String evolutionParasiteLockMessage = "...";
    public static int[] blackListedDimensionsEPP = new int[]{0, 1, -1};
    public static String phaseWarningZero = "ZERO";
    public static int sleepPenaltyZero = 3;
    public static byte phaseMaxParasiteIDZero = (byte)5;
    public static byte phaseCancelParasiteIDZero = 0;
    public static int phaseScentBonusZero = -200;
    public static byte phaseScentReactionZero = (byte)11;
    public static String[] phaseSpawnEntryZero = new String[]{"srparasites:buglin;2;6;30"};
    public static int oneLevelDeploy = 1;
    public static int phaseKillsOne = 400;
    public static byte phaseMaxParasiteIDOne = (byte)11;
    public static byte phaseCancelParasiteIDOne = 0;
    public static double phaseKillCountPlusOne = 0.0;
    public static double reinforcementSystemChanceOne = 0.0;
    public static double beckonStageIGrowPenaltyOne = 1.0;
    public static double beckonStageIIGrowPenaltyOne = 1.0;
    public static double beckonStageIIIGrowPenaltyOne = 1.0;
    public static double mobSpawningCOTHChanceOne = 0.0;
    public static double cropGrowStunnedOne = 0.0;
    public static int luredValueOne = 10;
    public static int luredValueOneCool = 10;
    public static String phaseWarningOne = "One";
    public static int sleepPenaltyOne = 40;
    public static int phaseScentBonusOne = 5;
    public static byte phaseScentReactionOne = (byte)10;
    public static int phaseDelayTicksOne = 1200;
    public static int phaseResidueOne = 0;
    public static String[] phaseSpawnEntryOne = new String[]{"srparasites:buglin;2;6;30", "srparasites:rupter;3;6;30"};
    public static int twoLevelDeploy = 1;
    public static int phaseKillsTwo = 800;
    public static byte phaseMaxParasiteIDTwo = (byte)31;
    public static byte phaseCancelParasiteIDTwo = 0;
    public static double phaseKillCountPlusTwo = 0.0;
    public static double reinforcementSystemChanceTwo = 0.0;
    public static double beckonStageIGrowPenaltyTwo = 1.0;
    public static double beckonStageIIGrowPenaltyTwo = 1.0;
    public static double beckonStageIIIGrowPenaltyTwo = 1.0;
    public static double mobSpawningCOTHChanceTwo = 0.0;
    public static double cropGrowStunnedTwo = 0.0;
    public static int luredValueTwo = 20;
    public static int luredValueTwoCool = 20;
    public static String phaseWarningTwo = "Two";
    public static int sleepPenaltyTwo = 50;
    public static int phaseScentBonusTwo = 20;
    public static byte phaseScentReactionTwo = (byte)9;
    public static int phaseDelayTicksTwo = 1200;
    public static int phaseResidueTwo = 0;
    public static String[] phaseSpawnEntryTwo = new String[]{"srparasites:buglin;2;6;30", "srparasites:rupter;3;6;30", "srparasites:sim_bigspider;3;5;25", "srparasites:sim_human;3;5;25", "srparasites:sim_cow;3;5;25", "srparasites:sim_sheep;3;5;25", "srparasites:sim_wolf;3;5;25", "srparasites:sim_pig;3;5;25", "srparasites:sim_villager;3;5;25", "srparasites:sim_adventurer;3;5;25", "srparasites:sim_horse;3;5;25", "srparasites:sim_bear;3;5;25", "srparasites:sim_enderman;1;1;1", "srparasites:sim_dragone;1;1;1"};
    public static int threeLevelDeploy = 1;
    public static int phaseKillsThree = 1800;
    public static byte phaseMaxParasiteIDThree = (byte)31;
    public static byte phaseCancelParasiteIDThree = 0;
    public static double phaseKillCountPlusThree = 0.05;
    public static double reinforcementSystemChanceThree = 0.02;
    public static double beckonStageIGrowPenaltyThree = 0.95;
    public static double beckonStageIIGrowPenaltyThree = 0.95;
    public static double beckonStageIIIGrowPenaltyThree = 0.95;
    public static double mobSpawningCOTHChanceThree = 0.0;
    public static double cropGrowStunnedThree = 0.0;
    public static int luredValueThree = 50;
    public static int luredValueThreeCool = 50;
    public static String phaseWarningThree = "Three";
    public static int sleepPenaltyThree = 1000;
    public static int phaseScentBonusThree = 50;
    public static byte phaseScentReactionThree = (byte)9;
    public static int phaseDelayTicksThree = 1200;
    public static int phaseResidueThree = 5500;
    public static String[] phaseSpawnEntryThree = new String[]{"srparasites:rupter;3;6;30", "srparasites:sim_bigspider;3;5;25", "srparasites:sim_human;3;5;25", "srparasites:sim_cow;3;5;25", "srparasites:sim_sheep;3;5;25", "srparasites:sim_wolf;3;5;25", "srparasites:sim_pig;3;5;25", "srparasites:sim_villager;3;5;25", "srparasites:sim_adventurer;3;5;25", "srparasites:sim_horse;3;5;25", "srparasites:sim_bear;3;5;25", "srparasites:sim_enderman;1;1;1", "srparasites:sim_dragone;1;1;1", "srparasites:architect;1;1;20", "srparasites:bomber_heavy;1;1;1", "srparasites:wraith;1;1;1", "srparasites:bogle;1;1;1", "srparasites:haunter;1;1;1", "srparasites:carrier_colony;1;1;1"};
    public static int fourLevelDeploy = 2;
    public static int phaseKillsFour = 20000;
    public static byte phaseMaxParasiteIDFour = (byte)41;
    public static byte phaseCancelParasiteIDFour = (byte)4;
    public static double phaseKillCountPlusFour = 0.075;
    public static double reinforcementSystemChanceFour = 0.03;
    public static double beckonStageIGrowPenaltyFour = 0.0;
    public static double beckonStageIIGrowPenaltyFour = 0.95;
    public static double beckonStageIIIGrowPenaltyFour = 0.95;
    public static double mobSpawningCOTHChanceFour = 0.0;
    public static double cropGrowStunnedFour = 0.0;
    public static int luredValueFour = 250;
    public static int luredValueFourCool = 500;
    public static String phaseWarningFour = "Four";
    public static int sleepPenaltyFour = 10000;
    public static int phaseScentBonusFour = 90;
    public static byte phaseScentReactionFour = (byte)8;
    public static int phaseDelayTicksFour = 1200;
    public static int phaseResidueFour = 4000;
    public static String[] phaseSpawnEntryFour = new String[]{"srparasites:rupter;3;6;30", "srparasites:sim_bigspider;3;5;25", "srparasites:sim_human;3;5;25", "srparasites:sim_cow;3;5;25", "srparasites:sim_sheep;3;5;25", "srparasites:sim_wolf;3;5;25", "srparasites:sim_pig;3;5;25", "srparasites:sim_villager;3;5;25", "srparasites:sim_adventurer;3;5;25", "srparasites:sim_horse;3;5;25", "srparasites:sim_bear;3;5;25", "srparasites:sim_enderman;1;1;1", "srparasites:sim_dragone;1;1;1", "srparasites:pri_longarms;2;3;15", "srparasites:pri_manducater;2;3;15", "srparasites:pri_reeker;2;3;15", "srparasites:pri_yelloweye;2;3;15", "srparasites:pri_summoner;2;3;15", "srparasites:pri_bolster;2;3;15", "srparasites:pri_arachnida;2;3;15", "srparasites:thrall;3;5;25", "srparasites:architect;1;1;20", "srparasites:bomber_heavy;1;1;1", "srparasites:wraith;1;1;1", "srparasites:bogle;1;1;1", "srparasites:haunter;1;1;1", "srparasites:carrier_colony;1;1;1"};
    public static int fiveLevelDeploy = 3;
    public static int phaseKillsFive = 200000;
    public static byte phaseMaxParasiteIDFive = (byte)41;
    public static byte phaseCancelParasiteIDFive = (byte)4;
    public static double phaseKillCountPlusFive = 0.1;
    public static double reinforcementSystemChanceFive = 0.04;
    public static double beckonStageIGrowPenaltyFive = 0.0;
    public static double beckonStageIIGrowPenaltyFive = 0.0;
    public static double beckonStageIIIGrowPenaltyFive = 0.95;
    public static double mobSpawningCOTHChanceFive = 0.0;
    public static double cropGrowStunnedFive = 0.0;
    public static int luredValueFive = 300;
    public static int luredValueFiveCool = 4000;
    public static String phaseWarningFive = "Five";
    public static int sleepPenaltyFive = 250000;
    public static int phaseScentBonusFive = 150;
    public static byte phaseScentReactionFive = (byte)6;
    public static int phaseDelayTicksFive = 1200;
    public static int phaseResidueFive = 1000;
    public static String[] phaseSpawnEntryFive = new String[]{"srparasites:rupter;3;6;30", "srparasites:fer_human;4;5;25", "srparasites:fer_cow;3;6;25", "srparasites:fer_sheep;4;5;25", "srparasites:fer_wolf;3;6;25", "srparasites:fer_pig;3;5;25", "srparasites:fer_villager;3;5;25", "srparasites:fer_horse;3;5;25", "srparasites:fer_enderman;3;5;25", "srparasites:sim_dragone;3;5;25", "srparasites:pri_longarms;2;3;15", "srparasites:pri_manducater;2;3;15", "srparasites:pri_reeker;2;3;15", "srparasites:pri_yelloweye;2;3;15", "srparasites:pri_summoner;2;3;15", "srparasites:pri_bolster;2;3;15", "srparasites:pri_arachnida;2;3;15", "srparasites:thrall;3;5;25", "srparasites:architect;1;1;20", "srparasites:bomber_heavy;1;1;1", "srparasites:wraith;1;1;1", "srparasites:bogle;1;1;1", "srparasites:haunter;1;1;1", "srparasites:carrier_colony;1;1;1"};
    public static int sixLevelDeploy = 4;
    public static int phaseKillsSix = 5000000;
    public static byte phaseMaxParasiteIDSix = (byte)51;
    public static byte phaseCancelParasiteIDSix = (byte)30;
    public static double phaseKillCountPlusSix = 0.15;
    public static double reinforcementSystemChanceSix = 0.05;
    public static double beckonStageIGrowPenaltySix = 0.0;
    public static double beckonStageIIGrowPenaltySix = 0.0;
    public static double beckonStageIIIGrowPenaltySix = 0.0;
    public static double mobSpawningCOTHChanceSix = 0.2;
    public static double cropGrowStunnedSix = 0.1;
    public static int luredValueSix = 600;
    public static int luredValueSixCool = 80000;
    public static String phaseWarningSix = "Six";
    public static int sleepPenaltySix = 1250000;
    public static int phaseScentBonusSix = 240;
    public static byte phaseScentReactionSix = (byte)5;
    public static int phaseDelayTicksSix = 1200;
    public static int phaseResidueSix = 500;
    public static String[] phaseSpawnEntrySix = new String[]{"srparasites:fer_human;4;5;25", "srparasites:fer_cow;3;6;25", "srparasites:fer_sheep;4;5;25", "srparasites:fer_wolf;3;6;25", "srparasites:fer_pig;3;5;25", "srparasites:fer_villager;3;5;25", "srparasites:fer_horse;3;5;25", "srparasites:fer_enderman;3;5;25", "srparasites:mangler;3;6;30", "srparasites:pri_longarms;2;3;15", "srparasites:pri_manducater;2;3;15", "srparasites:pri_reeker;2;3;15", "srparasites:pri_yelloweye;2;3;15", "srparasites:pri_summoner;2;3;15", "srparasites:pri_bolster;2;3;15", "srparasites:pri_arachnida;2;3;15", "srparasites:thrall;3;5;25", "srparasites:ada_longarms;2;3;15", "srparasites:ada_manducater;2;3;15", "srparasites:ada_reeker;2;3;15", "srparasites:ada_yelloweye;2;3;15", "srparasites:ada_summoner;2;3;15", "srparasites:ada_bolster;2;3;15", "srparasites:ada_arachnida;2;3;15", "srparasites:architect;1;1;20", "srparasites:bomber_heavy;1;1;1", "srparasites:wraith;1;1;1", "srparasites:bogle;1;1;1", "srparasites:haunter;1;1;1", "srparasites:carrier_colony;1;1;1"};
    public static int sevenLevelDeploy = 5;
    public static int phaseKillsSeven = 25000000;
    public static byte phaseMaxParasiteIDSeven = (byte)61;
    public static byte phaseCancelParasiteIDSeven = (byte)40;
    public static double phaseKillCountPlusSeven = 0.25;
    public static double reinforcementSystemChanceSeven = 0.07;
    public static double beckonStageIGrowPenaltySeven = 0.0;
    public static double beckonStageIIGrowPenaltySeven = 0.0;
    public static double beckonStageIIIGrowPenaltySeven = 0.0;
    public static double mobSpawningCOTHChanceSeven = 0.4;
    public static double cropGrowStunnedSeven = 0.3;
    public static int luredValueSeven = 600;
    public static int luredValueSevenCool = 350000;
    public static String phaseWarningSeven = "Seven";
    public static int sleepPenaltySeven = 25000000;
    public static int phaseScentBonusSeven = 360;
    public static byte phaseScentReactionSeven = (byte)4;
    public static int phaseDelayTicksSeven = 1200;
    public static int phaseResidueSeven = 400;
    public static String[] phaseSpawnEntrySeven = new String[]{"srparasites:fer_human;4;5;25", "srparasites:fer_cow;3;6;25", "srparasites:fer_sheep;4;5;25", "srparasites:fer_wolf;3;6;25", "srparasites:fer_pig;3;5;25", "srparasites:fer_villager;3;5;25", "srparasites:fer_horse;3;5;25", "srparasites:fer_enderman;3;5;25", "srparasites:mangler;3;6;30", "srparasites:ada_longarms;2;3;15", "srparasites:ada_manducater;2;3;15", "srparasites:ada_reeker;2;3;15", "srparasites:ada_yelloweye;2;3;15", "srparasites:ada_summoner;2;3;15", "srparasites:ada_bolster;2;3;15", "srparasites:ada_arachnida;2;3;15", "srparasites:grunt;2;3;20", "srparasites:monarch;1;2;15", "srparasites:architect;1;1;20", "srparasites:bomber_heavy;1;1;1", "srparasites:wraith;1;1;1", "srparasites:bogle;1;1;1", "srparasites:haunter;1;1;1", "srparasites:carrier_colony;1;1;1"};
    public static int eightLevelDeploy = 6;
    public static int phaseKillsEight = 500000000;
    public static byte phaseMaxParasiteIDEight = (byte)64;
    public static byte phaseCancelParasiteIDEight = (byte)40;
    public static double phaseKillCountPlusEight = 0.35;
    public static double reinforcementSystemChanceEight = 0.09;
    public static double beckonStageIGrowPenaltyEight = 0.0;
    public static double beckonStageIIGrowPenaltyEight = 0.0;
    public static double beckonStageIIIGrowPenaltyEight = 0.0;
    public static double mobSpawningCOTHChanceEight = 0.8;
    public static double cropGrowStunnedEight = 0.6;
    public static int luredValueEight = 1200;
    public static int luredValueEightCool = 6250000;
    public static String phaseWarningEight = "Eight";
    public static int sleepPenaltyEight = 100000000;
    public static int phaseScentBonusEight = 500;
    public static byte phaseScentReactionEight = (byte)2;
    public static int phaseDelayTicksEight = 1200;
    public static int phaseResidueEight = 300;
    public static String[] phaseSpawnEntryEight = new String[]{"srparasites:fer_human;4;5;25", "srparasites:fer_cow;3;6;25", "srparasites:fer_sheep;4;5;25", "srparasites:fer_wolf;3;6;25", "srparasites:fer_pig;3;5;25", "srparasites:fer_villager;3;5;25", "srparasites:fer_horse;3;5;25", "srparasites:fer_enderman;3;5;25", "srparasites:mangler;3;6;30", "srparasites:ada_longarms;2;3;15", "srparasites:ada_manducater;2;3;15", "srparasites:ada_reeker;2;3;15", "srparasites:ada_yelloweye;2;3;15", "srparasites:ada_summoner;2;3;15", "srparasites:ada_bolster;2;3;15", "srparasites:ada_arachnida;2;3;15", "srparasites:grunt;2;3;20", "srparasites:monarch;1;2;15", "srparasites:architect;1;1;20", "srparasites:bomber_heavy;1;1;1", "srparasites:wraith;1;1;1", "srparasites:bogle;1;1;1", "srparasites:haunter;1;1;1", "srparasites:carrier_colony;1;1;1"};
    public static int nineLevelDeploy = 7;
    public static int phaseKillsNine = 1000000000;
    public static byte phaseMaxParasiteIDNine = (byte)68;
    public static byte phaseCancelParasiteIDNine = (byte)40;
    public static double phaseKillCountPlusNine = 0.45;
    public static double reinforcementSystemChanceNine = 0.2;
    public static double beckonStageIGrowPenaltyNine = 0.0;
    public static double beckonStageIIGrowPenaltyNine = 0.0;
    public static double beckonStageIIIGrowPenaltyNine = 0.0;
    public static double mobSpawningCOTHChanceNine = 0.9;
    public static double cropGrowStunnedNine = 1.0;
    public static int luredValueNine = 1200;
    public static int luredValueNineCool = 50000000;
    public static String phaseWarningNine = "Nine";
    public static int sleepPenaltyNine = 180000000;
    public static int phaseScentBonusNine = 600;
    public static byte phaseScentReactionNine = (byte)2;
    public static int phaseDelayTicksNine = 1200;
    public static int phaseResidueNine = 250;
    public static String[] phaseSpawnEntryNine = new String[]{"srparasites:fer_human;4;5;25", "srparasites:fer_cow;3;6;25", "srparasites:fer_sheep;4;5;25", "srparasites:fer_wolf;3;6;25", "srparasites:fer_pig;3;5;25", "srparasites:fer_villager;3;5;25", "srparasites:fer_horse;3;5;25", "srparasites:fer_enderman;3;5;25", "srparasites:mangler;3;6;30", "srparasites:ada_longarms;2;3;20", "srparasites:ada_manducater;2;3;20", "srparasites:ada_reeker;2;3;20", "srparasites:ada_yelloweye;2;3;20", "srparasites:ada_summoner;2;3;20", "srparasites:ada_bolster;2;3;20", "srparasites:ada_arachnida;2;3;20", "srparasites:grunt;3;6;30", "srparasites:monarch;1;2;10", "srparasites:warden;1;2;10", "srparasites:overseer;1;2;10", "srparasites:vigilante;1;2;10", "srparasites:marauder;1;2;10", "srparasites:grunt;6;10;40", "srparasites:architect;1;1;20", "srparasites:bomber_heavy;1;2;5", "srparasites:wraith;1;2;5", "srparasites:bogle;1;2;5", "srparasites:haunter;1;2;5", "srparasites:carrier_colony;1;2;5"};
    public static int tenLevelDeploy = 8;
    public static int phaseKillsTen = 1800000000;
    public static byte phaseMaxParasiteIDTen = (byte)72;
    public static byte phaseCancelParasiteIDTen = (byte)40;
    public static double phaseKillCountPlusTen = 0.55;
    public static double reinforcementSystemChanceTen = 0.2;
    public static double beckonStageIGrowPenaltyTen = 0.0;
    public static double beckonStageIIGrowPenaltyTen = 0.0;
    public static double beckonStageIIIGrowPenaltyTen = 0.0;
    public static double mobSpawningCOTHChanceTen = 1.0;
    public static double cropGrowStunnedTen = 1.0;
    public static int luredValueTen = 1200;
    public static int luredValueTenCool = 72000000;
    public static String phaseWarningTen = "Ten";
    public static int sleepPenaltyTen = 1;
    public static int phaseScentBonusTen = 800;
    public static byte phaseScentReactionTen = (byte)2;
    public static int phaseDelayTicksTen = 1200;
    public static int phaseResidueTen = 150;
    public static int phaseTenTotalPoints = 2100000000;
    public static String[] phaseSpawnEntryTen = new String[]{"srparasites:fer_human;4;5;25", "srparasites:fer_cow;3;6;25", "srparasites:fer_sheep;4;5;25", "srparasites:fer_wolf;3;6;25", "srparasites:fer_pig;3;5;25", "srparasites:fer_villager;3;5;25", "srparasites:fer_horse;3;5;25", "srparasites:fer_enderman;3;5;25", "srparasites:mangler;3;6;30", "srparasites:ada_longarms;2;3;15", "srparasites:ada_manducater;2;3;15", "srparasites:ada_reeker;2;3;15", "srparasites:ada_yelloweye;2;3;15", "srparasites:ada_summoner;2;3;15", "srparasites:ada_bolster;2;3;15", "srparasites:ada_arachnida;2;3;15", "srparasites:grunt;2;3;20", "srparasites:monarch;1;2;15", "srparasites:architect;1;1;20", "srparasites:bomber_heavy;1;1;1", "srparasites:wraith;1;1;1", "srparasites:bogle;1;1;1", "srparasites:haunter;1;1;1", "srparasites:carrier_colony;1;1;1"};
    public static byte defaultEvoPhase = (byte)-1;
    public static int defaultEvoPoints = -100;
    public static boolean phaseCustomSpawner = true;
    private static final String EVOLUTION_CATEGORY0 = "parasite_evolution_phases_0";
    private static final String EVOLUTION_CATEGORY1 = "parasite_evolution_phases_1";
    private static final String EVOLUTION_CATEGORY2 = "parasite_evolution_phases_2";
    private static final String EVOLUTION_CATEGORY3 = "parasite_evolution_phases_3";
    private static final String EVOLUTION_CATEGORY4 = "parasite_evolution_phases_4";
    private static final String EVOLUTION_CATEGORY5 = "parasite_evolution_phases_5";
    private static final String EVOLUTION_CATEGORY6 = "parasite_evolution_phases_6";
    private static final String EVOLUTION_CATEGORY7 = "parasite_evolution_phases_7";
    private static final String EVOLUTION_CATEGORY8 = "parasite_evolution_phases_8";
    private static final String EVOLUTION_CATEGORY9 = "parasite_evolution_phases_9";
    private static final String EVOLUTION_CATEGORY10 = "parasite_evolution_phases_10";
    private static final String HIVEMIND_CATEGORY = "parasite_collective_consciousness";
    public static boolean useOneMind = false;
    public static int oneMinRangeCap = 64;
    public static boolean oneMindPlayer = false;
    public static boolean oneMindDebug = false;
    public static boolean useScent = true;
    public static boolean deleteifnoCC = true;
    public static boolean scentPlayer = false;
    public static int scentCap = 3;
    public static int scentSpacing = 40;
    public static double scentDeathSpawning = 0.07;
    public static double minAttriHealth = 20.0;
    public static double minAttriArmor = 0.0;
    public static double minAttriDamage = 4.0;
    public static int minAttriFailCount = 2;
    public static byte scentGoActive = (byte)5;
    public static int scentSpawnWaves = 12;
    public static int scentMiniDis = 7;
    public static int scentMaxDis = 40;
    public static int scentLifeDeath = 5;
    public static int scentLifeObserver = 60;
    public static int scentLifeTactical = 300;
    public static String[] scentLevelZero = new String[]{"srparasites:rupter"};
    public static int scentWaveMinMobWaveZero = 3;
    public static int scentWaveMaxMobWaveZero = 4;
    public static int scentWaveMinimumZero = 1;
    public static int scentWaveMaximumZero = 2;
    public static String[] scentLevelOne = new String[]{"srparasites:rupter"};
    public static int scentLevelPointsOne = 10;
    public static int scentWaveMinMobWaveOne = 4;
    public static int scentWaveMaxMobWaveOne = 6;
    public static int scentWaveMinimumOne = 1;
    public static int scentWaveMaximumOne = 3;
    public static String[] scentLevelTwo = new String[]{"srparasites:rupter", "sim_adventurerhead", "sim_endermanhead", "sim_humanhead", "sim_horsehead", "sim_villagerhead", "sim_pighead", "sim_cowhead", "sim_wolfhead", "sim_sheephead", "srparasites:heed"};
    public static int scentLevelPointsTwo = 25;
    public static int scentWaveMinMobWaveTwo = 4;
    public static int scentWaveMaxMobWaveTwo = 6;
    public static int scentWaveMinimumTwo = 2;
    public static int scentWaveMaximumTwo = 4;
    public static String[] scentLevelThree = new String[]{"srparasites:rupter", "srparasites:sim_adventurerhead", "srparasites:sim_endermanhead", "srparasites:sim_humanhead", "srparasites:sim_horsehead", "srparasites:sim_villagerhead", "srparasites:sim_pighead", "srparasites:sim_cowhead", "srparasites:sim_wolfhead", "srparasites:sim_sheephead", "srparasites:sim_adventurer", "srparasites:sim_enderman", "srparasites:sim_human", "srparasites:sim_horse", "srparasites:sim_villager", "srparasites:sim_pig", "srparasites:sim_cow", "srparasites:sim_wolf", "srparasites:sim_sheep", "srparasites:heed"};
    public static int scentLevelPointsThree = 75;
    public static int scentWaveMinMobWaveThree = 3;
    public static int scentWaveMaxMobWaveThree = 4;
    public static int scentWaveMinimumThree = 3;
    public static int scentWaveMaximumThree = 6;
    public static String[] scentLevelFour = new String[]{"srparasites:sim_adventurer", "srparasites:sim_enderman", "srparasites:sim_human", "srparasites:sim_horse", "srparasites:sim_villager", "srparasites:sim_pig", "srparasites:sim_cow", "srparasites:sim_wolf", "srparasites:sim_sheep", "srparasites:pri_longarms", "srparasites:pri_manducater", "srparasites:pri_reeker", "srparasites:pri_yelloweye", "srparasites:pri_summoner", "srparasites:pri_bolster", "srparasites:pri_arachnida", "srparasites:pri_vermin", "srparasites:heed", "srparasites:crux"};
    public static int scentLevelPointsFour = 150;
    public static int scentWaveMinMobWaveFour = 3;
    public static int scentWaveMaxMobWaveFour = 6;
    public static int scentWaveMinimumFour = 3;
    public static int scentWaveMaximumFour = 4;
    public static String[] scentLevelFive = new String[]{"srparasites:sim_adventurer", "srparasites:sim_enderman", "srparasites:sim_human", "srparasites:sim_horse", "srparasites:sim_villager", "srparasites:sim_pig", "srparasites:sim_cow", "srparasites:sim_wolf", "srparasites:sim_sheep", "srparasites:pri_longarms", "srparasites:pri_manducater", "srparasites:pri_reeker", "srparasites:pri_yelloweye", "srparasites:pri_summoner", "srparasites:pri_bolster", "srparasites:pri_arachnida", "srparasites:pri_vermin", "srparasites:heed", "srparasites:crux"};
    public static int scentLevelPointsFive = 150;
    public static int scentWaveMinMobWaveFive = 4;
    public static int scentWaveMaxMobWaveFive = 6;
    public static int scentWaveMinimumFive = 3;
    public static int scentWaveMaximumFive = 4;
    public static String[] scentLevelSix = new String[]{"srparasites:sim_adventurer", "srparasites:sim_enderman", "srparasites:sim_human", "srparasites:sim_horse", "srparasites:sim_villager", "srparasites:sim_pig", "srparasites:sim_cow", "srparasites:sim_wolf", "srparasites:sim_sheep", "srparasites:pri_longarms", "srparasites:pri_manducater", "srparasites:pri_reeker", "srparasites:pri_yelloweye", "srparasites:pri_summoner", "srparasites:pri_bolster", "srparasites:pri_arachnida", "srparasites:pri_vermin", "srparasites:heed", "srparasites:crux"};
    public static int scentLevelPointsSix = 240;
    public static int scentWaveMinMobWaveSix = 2;
    public static int scentWaveMaxMobWaveSix = 5;
    public static int scentWaveMinimumSix = 2;
    public static int scentWaveMaximumSix = 5;
    public static String[] scentLevelSeven = new String[]{"srparasites:sim_adventurer", "srparasites:sim_enderman", "srparasites:sim_human", "srparasites:sim_horse", "srparasites:sim_villager", "srparasites:sim_pig", "srparasites:sim_cow", "srparasites:sim_wolf", "srparasites:sim_sheep", "srparasites:pri_longarms", "srparasites:pri_manducater", "srparasites:pri_reeker", "srparasites:pri_yelloweye", "srparasites:pri_summoner", "srparasites:pri_bolster", "srparasites:pri_arachnida", "srparasites:pri_vermin", "srparasites:heed", "srparasites:crux"};
    public static int scentLevelPointsSeven = 360;
    public static int scentWaveMinMobWaveSeven = 2;
    public static int scentWaveMaxMobWaveSeven = 5;
    public static int scentWaveMinimumSeven = 2;
    public static int scentWaveMaximumSeven = 5;
    public static String[] scentLevelEight = new String[]{"srparasites:sim_adventurer", "srparasites:sim_enderman", "srparasites:sim_human", "srparasites:sim_horse", "srparasites:sim_villager", "srparasites:sim_pig", "srparasites:sim_cow", "srparasites:sim_wolf", "srparasites:sim_sheep", "srparasites:pri_longarms", "srparasites:pri_manducater", "srparasites:pri_reeker", "srparasites:pri_yelloweye", "srparasites:pri_summoner", "srparasites:pri_bolster", "srparasites:pri_arachnida", "srparasites:pri_vermin", "srparasites:heed", "srparasites:crux"};
    public static int scentLevelPointsEight = 500;
    public static int scentWaveMinMobWaveEight = 2;
    public static int scentWaveMaxMobWaveEight = 5;
    public static int scentWaveMinimumEight = 2;
    public static int scentWaveMaximumEight = 5;
    private static final String HIVEMIND_CATEGORY0 = "parasite_collective_consciousness_scent_lvl_0";
    private static final String HIVEMIND_CATEGORY1 = "parasite_collective_consciousness_scent_lvl_1";
    private static final String HIVEMIND_CATEGORY2 = "parasite_collective_consciousness_scent_lvl_2";
    private static final String HIVEMIND_CATEGORY3 = "parasite_collective_consciousness_scent_lvl_3";
    private static final String HIVEMIND_CATEGORY4 = "parasite_collective_consciousness_scent_lvl_4";
    private static final String HIVEMIND_CATEGORY5 = "parasite_collective_consciousness_scent_lvl_5";
    private static final String HIVEMIND_CATEGORY6 = "parasite_collective_consciousness_scent_lvl_6";
    private static final String HIVEMIND_CATEGORY7 = "parasite_collective_consciousness_scent_lvl_7";
    private static final String HIVEMIND_CATEGORY8 = "parasite_collective_consciousness_scent_lvl_8";
    private static final String TOTALDEVELOPMENT_CATEGORY = "parasite_ubiquitous_development";

    private static void initGeneralSistemsConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL_SISTEMS, "System configuration \nVersion:1.9.21\n \nPotions IDs \nsrparasites:coth \nsrparasites:fear \nsrparasites:antimall \nsrparasites:bleed \nsrparasites:corrosive \nsrparasites:viral \nsrparasites:rage \nsrparasites:repel \nsrparasites:senses \nsrparasites:prey \nsrparasites:debar \nsrparasites:needler \nsrparasites:foster \nsrparasites:link \n ");
    }

    private static void initreinforcementSystemConfig(Configuration cfg) {
        String RSdescription = " \n When a parasite is killed, there is a chance for it to call reinforcements, this means that\n a Beckon will spawn nearby and will help in the fight.\n \n The Beckon has different stages and that will tell how many and which parasites it will spawn.";
        String equipS = " Ex. \"head;minecraft:iron_helmet;0.1\"  Where: \n \"head\" is for the slot (head, chest, legs, feet), \n \"minecraft:iron_helmet\" is for the item, \n \"0.1\" is for the chance to ignore block damage (1 = 100%). \n";
        String growingBeckon = " Ex. \"1;3\"  Where: \n \"1\" is for the dimension, \n \"3\" is for the stage it cannot grow up. \n";
        cfg.addCustomCategoryComment(REINFORCEMENT_CATEGORY, "Reinforcement System" + RSdescription);
        rsEnabled = cfg.getBoolean("Reinforcement System Enabled", REINFORCEMENT_CATEGORY, rsEnabled, "Set to false if you want to disable the Reinforcement System.");
        rschance = cfg.getFloat("Reinforcement System Chance", REINFORCEMENT_CATEGORY, rschance, 0.0f, 1.0f, "Chance (1 = 100%) to spawn a Beckon (This is ignored if Evolution Phases are enabled, it has its own option).");
        rsSounds = cfg.getBoolean("Reinforcement System Sounds", REINFORCEMENT_CATEGORY, rsSounds, "Set to false if you want to disable the Reinforcement System Sounds \n (A bell sound is played when a Beckon is summoned or when it grew up to the next stage).");
        rsBlockI = cfg.getBoolean("Reinforcement System Infestation", REINFORCEMENT_CATEGORY, rsBlockI, "Set to false if you want to disable the Reinforcement System Block Infestation.");
        rsBlockIMaxH = cfg.getFloat("Reinforcement System Hardness", REINFORCEMENT_CATEGORY, rsBlockIMaxH, 0.01f, 100.0f, "Max Hardness of the block it can infest.");
        rsPlayer = cfg.getBoolean("Reinforcement System Player Only", REINFORCEMENT_CATEGORY, rsPlayer, "Set to true if you want the Reinforcement System to only be activated by the Players.");
        blockBList = cfg.getStringList("Reinforcement System Blocks BlackList", REINFORCEMENT_CATEGORY, blockBList, "List of block that can't be infested, Ex: \"minecraft:stonebrick\" or just \"minecraft\" for a whole mod");
        blockBListWhite = cfg.getBoolean("Reinforcement System Blocks BlackList Inverted", REINFORCEMENT_CATEGORY, blockBListWhite, "Set to true if you want to use the list as a WhiteList.");
        optionalBlock = cfg.getString("Reinforcement System Revert Block", REINFORCEMENT_CATEGORY, optionalBlock, "What the infested block turns into when the Beckons die");
        optionalBlockRub = cfg.getString("Reinforcement System Revert Block 2", REINFORCEMENT_CATEGORY, optionalBlockRub, "What the infested block 2 turns into when the Beckons die");
        rsBlockLight = cfg.getInt("Reinforcement System Block Light Level", REINFORCEMENT_CATEGORY, rsBlockLight, 0, 16, "If the light level is higher than this, the block will not spread.");
        rsVenkrolChance = cfg.getInt("Reinforcement System Block Residue Chance", REINFORCEMENT_CATEGORY, rsVenkrolChance, 0, 0x7FFFFFF8, "One in X to spawn a Beckon on the Infested Block Residue (random tick) (This value is ignored if Evolution Phases are enabled, it has its own option).");
        rsBlockParticleS = cfg.getFloat("Reinforcement System Particle Spore Chance", REINFORCEMENT_CATEGORY, rsBlockParticleS, 0.0f, 1.0f, "Chance (1 = 100%) to spawn spore particle in an infested block (if available, every tick).");
        rsBlockParticleF = cfg.getFloat("Reinforcement System Particle Fog Chance", REINFORCEMENT_CATEGORY, rsBlockParticleF, 0.0f, 1.0f, "Chance (1 = 100%) to spawn fog particle in an infested block ((if available, every tick).");
        rsMaxVenkrols = cfg.getInt("Reinforcement System Maximum Beckons", REINFORCEMENT_CATEGORY, rsMaxVenkrols, 1, 0x7FFFFFF8, "Maximum number of Beckons that can spawn from the RS (per dimension).");
        rsCooldown = cfg.getInt("Reinforcement System Cooldown", REINFORCEMENT_CATEGORY, rsCooldown, 1, 0x7FFFFFF8, "Cooldown (in seconds) for the Reinforcement System spawning Beckons.");
        maximumStageList = cfg.getStringList("Reinforcement System Maximum Stage", REINFORCEMENT_CATEGORY, maximumStageList, "Maximum Stage a Beckon can grow up in a Dimension." + growingBeckon);
        rsIgnoreCooldownAtSpawn = cfg.getBoolean("Reinforcement System Ignore Cooldown", REINFORCEMENT_CATEGORY, rsIgnoreCooldownAtSpawn, "Set to false if you don't want the Beckons to ignore their summoning cooldown.when spawning.");
        rsSky = cfg.getBoolean("Reinforcement System Sky", REINFORCEMENT_CATEGORY, rsSky, "Set to true if you want Beckons to only spawn if the position can see the sky (only those who are called by the death of a parasite).");
        rsSkyResidue = cfg.getBoolean("Reinforcement System Sky Residue", REINFORCEMENT_CATEGORY, rsSkyResidue, "Set to true if you want Beckons to only spawn if the position can see the sky (from residue blocks).");
        rsResidueY = cfg.getInt("Reinforcement System Block Residue Y", REINFORCEMENT_CATEGORY, rsResidueY, 0, 300, "If the y value of the block is below this, Beckons will not spawn from it.");
        rsVenkrolEmpty = cfg.getFloat("Reinforcement System Infestation Spawning Beckons", REINFORCEMENT_CATEGORY, (float)rsVenkrolEmpty, 0.0f, 1.0f, "Chance (1 = 100%) to spawn a Beckon in Infested Blocks (S!=1) if no Beckon is around, to further infest the land.");
        rsMaxVenkrolChunk = cfg.getInt("Reinforcement System Maximum Beckon Chunk", REINFORCEMENT_CATEGORY, rsMaxVenkrolChunk, 0, 50, "If the number of Beckons in a chunk is equal of greater than this then a Beckon will not spawn form the RS/Residue Block.");
        rsBlockRevertStage = cfg.getInt("Reinforcement System Block Revert Stage", REINFORCEMENT_CATEGORY, rsBlockRevertStage, 1, 3, "If a Beckon is killed on an Infested block, the block will start a chain reaction and revert back all connected blocks if the meta of the block is less than or equal to this value AND the stage of the Beckon is greater than or equal to the meta value .");
    }

    private static void initmergeConfig(Configuration cfg) {
        String MergeDescription = " \n The Assimilated have the ability to learn from their battles and if the conditions are met, they will \n start to melt until they're some Moving Flesh \n If 2 of these things meet, they will fuse together and grow, if they get big enough they will spawn \n a mob from the Mob List.\n \n Conditions for the Assimilated to turn into Moving Flesh: \n \n -The first condition: the Assimilated needs to reach the primitive killcount. \n -The second condition: it needs to be next to 3 more Assimilated, regardless of their killcount/specie \n OR it needs to be next to a Moving Flesh. \n If the Assimilated with the killcount is next to atleast 3 more Assimilated, the four of them will start \n to melt BUT if it is next to a Moving flesh, only it will start to melt.";
        String mergeS = " Ex. \"minecraft:zombie;11\"  Where: \n \"minecraft:zombie\" is for the entity, \n \"11\" is for the value the entity has (value must be an integer). \n Each Assimilated has a value, the value then passes to the Moving Flesh and when 2 Moving Flesh merge together both values will add up\n If the value matches one in the list, the corresponding entity will spawn, else it will be a random one. \n";
        String mergeI = " Ex. \"srparasites:infhuman;22\"  Where: \n \"srparasites:infhuman\" is for the entity (only works for Assimilated versions minus Big Spider, Enderdragon), \n \"22\" is for the value the Moving Flesh will have (value must be an integer). \n";
        cfg.addCustomCategoryComment(MERGE_CATEGORY, "Merge System" + MergeDescription);
        mergeRandom = cfg.getBoolean("Merge System Random", MERGE_CATEGORY, mergeRandom, "Set to false if you don't want to spawn random mobs from the Mob List (values will be used).");
        mergeHealth = cfg.getFloat("Merge System Mob Health", MERGE_CATEGORY, (float)mergeHealth, 0.0f, 1.0f, "Amount of health (1 = 100%) the mob spawns with.");
        mergeMobTable = cfg.getStringList("Merge System Mob List", MERGE_CATEGORY, mergeMobTable, "Mob list used in the merge system to spawn mobs." + mergeS);
        mergeInfValues = cfg.getStringList("Merge System Assimilated Values", MERGE_CATEGORY, mergeInfValues, "Assimilated mob list with their values used in the merge system to spawn mobs." + mergeI);
    }

    private static void initstatuseffectsConfig(Configuration cfg) {
        String helper = " Where: \n \"minecraft:stone\" is the item, \n \"0.1\" is the chance to apply the effect (1=100%), \n \"200\" is the duration of the effect in seconds. \n Right click an entity to give it Camouflage. \n";
        String description = " \n Fear.\n \n COTH.\n \n Needler.\n \n Bleeding.\n \n Camouflage";
        cfg.addCustomCategoryComment(STATUSEFFECTS_CATEGORY, "Status effects of the mod" + description);
        fearActive = cfg.getBoolean("Fear Acivated", STATUSEFFECTS_CATEGORY, fearActive, "Set to false if you dont want the Fear effect to work");
        fearFallDamage = cfg.getFloat("Fear Fall Damage Multiplier", STATUSEFFECTS_CATEGORY, fearFallDamage, 0.0f, 100.0f, "Fear fall damage multiplier, multiplied by the amp.");
        fearAirDamage = cfg.getFloat("Fear Air Damage Multiplier", STATUSEFFECTS_CATEGORY, fearAirDamage, 0.0f, 100.0f, "Fear air damage multiplier, multiplied by the amp.");
        fearBlockChance = cfg.getFloat("Fear Block Fail Chance", STATUSEFFECTS_CATEGORY, fearBlockChance, 0.0f, 1.0f, "Chance (1 = 100%) to fail using a block under the Fear status effect (with an amplifier of 2 and up) - WARNING - EXPERIMENTAL.");
        fearItemChance = cfg.getFloat("Fear Item Fail Chance", STATUSEFFECTS_CATEGORY, fearItemChance, 0.0f, 1.0f, "Chance (1 = 100%) to to fail using an item under the Fear status effect (with an amplifier of 3 and up) - WARNING - EXPERIMENTAL.");
        fearInvChance = cfg.getFloat("Fear Inventory Fail Chance", STATUSEFFECTS_CATEGORY, fearInvChance, 0.0f, 1.0f, "Chance (1 = 100%) to to fail to open the inventory under the Fear status effect (with an amplifier of 4 and up) - WARNING - EXPERIMENTAL.");
        fearItemBlackList = cfg.getStringList("Fear Item BlackList", STATUSEFFECTS_CATEGORY, fearItemBlackList, "Items that wont be affected by this effect, Ex: \"minecraft:flint_and_steel\" or just \"minecraft\" for a whole mod");
        fearItemBlackListWhite = cfg.getBoolean("Fear Item BlackList Inverted", STATUSEFFECTS_CATEGORY, fearItemBlackListWhite, "Set to true if you want to use the list as a WhiteList.");
        cothActive = cfg.getBoolean("COTH Acivated", STATUSEFFECTS_CATEGORY, cothActive, "Set to false if you dont want the COTH effect to work");
        COTHVictimParasite = cfg.getStringList("COTH Assimilated Transformation", STATUSEFFECTS_CATEGORY, COTHVictimParasite, "Table that will be used for converting mobs, the Rupter will also be using this");
        COTHImmuneList = cfg.getStringList("COTH Mob Immune Mob List", STATUSEFFECTS_CATEGORY, COTHImmuneList, "Mobs that are immune to the COTH effect, Ex: \"minecraft:zombie\" or just \"minecraft\" for a whole mod");
        COTHImmuneListWhite = cfg.getBoolean("COTH Mob Immune Mob List Inverted", STATUSEFFECTS_CATEGORY, COTHImmuneListWhite, "Set to true if you want to use the list as a WhiteList.");
        cothAura = cfg.getInt("COTH Aura", STATUSEFFECTS_CATEGORY, cothAura, 0, 10, "Set to false if you dont want the effect to spread from mob to mob");
        cothConvert = cfg.getFloat("COTH Convert At Kill", STATUSEFFECTS_CATEGORY, cothConvert, 0.0f, 1.0f, "Chance (1 = 100%) for any parasite to convert its victim when killed (only if the victim is under COTH effect).");
        cothInfected = cfg.getFloat("Version Assimilated COTH", STATUSEFFECTS_CATEGORY, cothInfected, 0.0f, 1.0f, "Chance (1 = 100%) to infect with COTH per hit.");
        cothPrimitive = cfg.getFloat("Version Primitive COTH", STATUSEFFECTS_CATEGORY, cothPrimitive, 0.0f, 1.0f, "Chance (1 = 100%) to infect with COTH per hit.");
        cothAdapted = cfg.getFloat("Version Adapted COTH", STATUSEFFECTS_CATEGORY, cothAdapted, 0.0f, 1.0f, "Chance (1 = 100%) to infect with COTH per hit.");
        cothPure = cfg.getFloat("Version Pure COTH", STATUSEFFECTS_CATEGORY, cothPure, 0.0f, 1.0f, "Chance (1 = 100%) to infect with COTH per hit.");
        cothUnhide = cfg.getFloat("COTH Health Threshold", STATUSEFFECTS_CATEGORY, cothUnhide, 0.0f, 1.0f, "Below this health threshold, the victim will attempt to unhide (if available).");
        cothLootDisable = cfg.getBoolean("COTH Looting", STATUSEFFECTS_CATEGORY, cothLootDisable, "Set to false if you want mobs with COTH to drop loot (This is ignored if Evolution Phases are enabled, it has its own option)");
        bleedingDamage = cfg.getFloat("Bleeding Damage", STATUSEFFECTS_CATEGORY, bleedingDamage, 0.0f, 1.0f, "Damage (1 = 100%) this effect will deal (victims total health).");
        bleedingDamageCap = cfg.getFloat("Bleeding Damage Limit", STATUSEFFECTS_CATEGORY, bleedingDamageCap, 0.0f, 1000.0f, "Maximum damage that this effect will inflict.");
        corroValue = cfg.getInt("Corrosive Damage Value", STATUSEFFECTS_CATEGORY, corroValue, 0, 100000, "Amount of damage your armor will receive under this effect.");
        corrNot = cfg.getFloat("Corrosive Percentage To Work", STATUSEFFECTS_CATEGORY, (float)corrNot, 0.0f, 1.0f, "If the durability of the armor is below this threshold, the effect will not work.");
        viralEnable = cfg.getBoolean("Viral Acivated", STATUSEFFECTS_CATEGORY, viralEnable, "Set to false if you dont want the viral effect");
        viralAmount = cfg.getFloat("Viral Multiplier", STATUSEFFECTS_CATEGORY, viralAmount, 0.0f, 100.0f, "This value will be multiplied by the amplifier and then multiplied by the damage which will be added to the total damage.");
        rageEnable = cfg.getBoolean("Rage Acivated", STATUSEFFECTS_CATEGORY, rageEnable, "Set to false if you dont want parasites to spawn/give the rage effect");
        rageDamage = cfg.getFloat("Enraged Damage", STATUSEFFECTS_CATEGORY, (float)rageDamage, 0.0f, 100.0f, "(1 = 100%) How much this effect will increase damage.");
        rageSpeed = cfg.getFloat("Enraged Speed", STATUSEFFECTS_CATEGORY, (float)rageSpeed, 0.0f, 100.0f, "(1 = 100%) How much this effect will increase speed.");
        COTHItemPrevent = cfg.getStringList("Camouflage Item List", STATUSEFFECTS_CATEGORY, COTHItemPrevent, "List of items that can prevent an entity form getting COTH. Ex. \"minecraft:stone;0.1;200\" " + helper);
        epelChanceCOTH = cfg.getFloat("Camouflage Chance", STATUSEFFECTS_CATEGORY, (float)epelChanceCOTH, 0.0f, 1.0f, "(1 = 100%) Chance to avoid getting infected by COTH.");
        needlerDamage = cfg.getFloat("Needler Damage", STATUSEFFECTS_CATEGORY, needlerDamage, 0.0f, 1.0f, "Damage (1 = 100%) this effect will deal (victims total health) by reaching high amplifier.");
        needlerTerminal = cfg.getInt("Needler Terminal Amplifier", STATUSEFFECTS_CATEGORY, needlerTerminal, 0, 100, "Mobs reaching this amplfifier will explode.");
        needlerImmuneList = cfg.getStringList("Needler Immune Mob List", STATUSEFFECTS_CATEGORY, needlerImmuneList, "Mobs that are immune to the Needler effect, Ex: \"minecraft:zombie\" or just \"minecraft\" for a whole mod");
        needlerImmuneListWhite = cfg.getBoolean("Needler Immune Mob List Inverted", STATUSEFFECTS_CATEGORY, needlerImmuneListWhite, "Set to true if you want to use the list as a WhiteList.");
        needlerMaxDamPlayer = cfg.getFloat("Needler Maximum Damage Player", STATUSEFFECTS_CATEGORY, needlerMaxDamPlayer, 0.0f, 2.0E9f, "Maximum damage this effect will inflict to the player.");
        needlerMaxDamMonster = cfg.getFloat("Needler Maximum Damage Monster", STATUSEFFECTS_CATEGORY, needlerMaxDamMonster, 0.0f, 2.0E9f, "Maximum damage this effect will inflict to the Monster.");
        adapsChance = cfg.getFloat("Link Chance", STATUSEFFECTS_CATEGORY, (float)adapsChance, 0.0f, 1.0f, "(1 = 100%) Chance to send their adaptation on death (multiplied by the amp + 1).");
        hijackHealth = cfg.getFloat("Hijacked Health Required", STATUSEFFECTS_CATEGORY, hijackHealth, 0.0f, 1.0f, "Mobs with equal or lower percentage of health may be converted to hijacked versions.");
        HIJACKVictimParasite = cfg.getStringList("Hijacked Transformation", STATUSEFFECTS_CATEGORY, HIJACKVictimParasite, "Table that will be used for hijacking mobs.");
        pivotDamageRHost = cfg.getFloat("Pivot Damage Sent", STATUSEFFECTS_CATEGORY, pivotDamageRHost, 0.0f, 1.0f, "Amount of damage % it will be sent to the Rooter, affected by amplifier.");
        pivotDamageRNotHost = cfg.getFloat("Pivot Damage Left", STATUSEFFECTS_CATEGORY, pivotDamageRNotHost, 0.0f, 1.0f, "Amount of damage % that will not be removed by the Rooter.");
        pivotPointMultiplier = cfg.getInt("Pivot Point Gained Multiplier", STATUSEFFECTS_CATEGORY, pivotPointMultiplier, 1, 100, "Point multiplier, used in Evolution Phases, affected by amplifier.");
    }

    private static void initevolutionConfig(Configuration cfg) {
        String evolutionDescription = " \n If Evolution Phases is true, the current phase will dictate if a parasite can spawn naturally \n in the world and by reaching some phases, they will unlock some bonuses\n *Spawnrates are not affected by the Phases\n  \n -> Phase 0:\n    -Buglins spawn naturally\n  \n -> Phase 1:\n    -Rupters spawn naturally, with a hit and run behavior\n    -Animals and mobs infected with COTH will not mutate unless forced to low health\n    \n -> Phase 2:\n    -Assimilated versions spawn naturally\n    -Rupters will now attack as normal\n    \n -> Phase 3:\n    -Reinforcement system is unlocked\n    -Beckons will slowly grow to Stage II and beyond\n    -The passive point gaining is now active\n \t -Mobs with COTH will stop dropping loot\n    \n -> Phase 4:\n    -Primitive versions spawn naturally\n    -Normal growth to Beckons Stage II, but will slowly grow to Stage III\n    -Passive point gaining recieves a buff to the number gaining\n    -Reinforcement system chance increased\n    -Colonies now unlocked\n \t -Buglins will stop spawning naturally\n\t -No more fishing\n    \n -> Phase 5:\n    -Passive point gaining recieves a buff to the number gaining\n    -Players sleep penalty points increased\n    -Normal growth to Beckons Stage III but will slowly grow  to Stage IV\n    -Feral versions spawn naturally\n    -Nodes now unlocked\n    -COTH hidden mobs are now dropping their disguise\n    -Beckons will ignore summoning cooldown when spawning\n    -Reinforcement system chance increased\n    \n -> Phase 6:\n    -Normal growth to Beckons Stage IV\n    -Passive point gaining recieves a buff to the number gaining\n    -Assimilated versions and lower tier parasites will stop spawning naturally\n    -Adapted versions spawn naturally\n    -Mobs have a chance to spawn with COTH now\n    -Crop growth is now partially stunted\n    -Reinforcement system chance increased\n    \n -> Phase 7:\n    -Primitive versions and lower tier parasites will stop spawning naturally\n    -Pure versions spawn naturally\n    -Chance for a mob to spawn with COTH increased\n    -Passive point gaining recieves a buff to the number gaining\n    -Crop growth is now partially stunted\n    -Reinforcement system chance increased\n    -Parasites will ignore sunlight when spawning naturally\n    \n -> Phase 8:\n    -Passive point gaining recieves a buff to the number gaining\n    -Chance for a mob to spawn with COTH increased\n    -Crop growth is now partially stunted\n    -Reinforcement system chance increased\n    \n    \n \n To reduce their evolution phase you need to craft Lure Blocks";
        cfg.addCustomCategoryComment(EVOLUTION_CATEGORY, "Evolution Phases" + evolutionDescription);
        String exa = " Where: \n \"1\" is the dimension, \n \"8\" is the evolution phase,\n \"10\" is the number of points parasites will have, if the phase is -1 these points will be negative (Set the points above 0 if the phase is -1 or -2)\n Parasites will not spawn and can't earn points if the phase is -2";
        String exa22 = " Where: \n \"1\" is the dimension, \n \"8\" is the evolution phase,\n \"10\" is the parasite ID \n\n List of IDs:\n 1 Primitive Longarms\n 2 Assimilated Big Spider\n 3 Heavy Carrier\n 4 Primitive Yelloweye\n 5 Buglin\n 6 Assimilated Human\n 7 Primitive Manducator\n 8 Primitive Summoner\n 9 Overseer\n 10 Primitive Reeker\n 11 Flying Carrier\n 12 Rupter\n 13 Assimilated Cow\n 14 Assimilated Sheep\n 15 Assimilated Wolf\n 16 Beckon Stage I\n 17 Primitive Bolster\n 18 Beckon Stage II\n 19 Beckon Stage III\n 20 Ancient Overlord\n 21 Assimilated Wolf Head\n 22 Assimilated Sheep Head\n 23 Moving Flesh\n 24 Ancient Dreadnaut\n 25 Vigilante\n 26 Assimilated Pig\n 27 Assimilated Villager\n 28 Assimilated Cow Head\n 29 Kyphosis\n 30 Sentry\n 31 Assimilated Pig Head\n 32 Assimilated Villager Head\n 33 Warden\n 34 Ancient Drop Pod\n 35 Ancient Dreadnaut Tentacle\n 36 Worker\n 37 Primitive Tozoon\n 38 Primitive Arachnida\n 39 Incomplete Form Small\n 40 Assimilated Adventurer\n 41 Beckon Stage IV\n 42 Beckon Stage V\n 43 Incomplete Form Medium\n 44 Assimilated Horse\n 45 Assimilated Horse Head\n 46 Assimilated Human Head\n 47 Light Bomber\n 48 Host\n 49 Assimilated Bear\n 50 Marauder\n 51 Adapted Longarms\n 52 Adapted Manducator\n 53 Adapted Summoner\n 54 Adapted Reeker\n 55 Adapted Yelloweye\n 56 Adapted Bolster\n 57 Adapted Tozoon\n 58 Adapted Arachnida\n 59 Assimilated Enderman\n 60 Grunt\n 61 \n 62 Crux\n 63 Heed\n 64 Assimilated Enderdragon\n 65 Heavy Bomber\n 66 Primitive Devourer\n 67 VoidWalker\n 68 Awakaned Dreadnaut\n 69 Assimilated Enderman Head\n 70 Assimilated Enderdragon Head\n 71 Assimilated Adventurer Head\n 72 Seizer\n 73 Dispatcher Stage I\n 74 Dispatcher Tentacle\n 75 Herd\n 76 Mangler\n 77 Dispatcher Stage II\n 78 Dispatcher Stage III\n 79 Dispatcher Stage IV\n 80 Thrall\n 81 Adapted Devourer\n 82 Seeker\n 83 Focused Longarms\n 84 Monarch\n 85 Bogle\n 86 Wraith\n 87 Haunter\n 88 Colony Carrier\n 89 Succor\n 90 Architect\n 91 Gnat\n 92 Primitive Vermin\n 93 Feral Cow\n 94 Feral Enderman\n 95 Feral Horse\n 96 Feral Human\n 97 Feral Pig\n 98 Feral Sheep\n 99 Feral Villager\n 300 Feral Wolf\n 301 Hijacked Golem\n 302 Hijacked Blaze\n 303 Hijacked Skeleton\n 304 Light Carrier\n 305 \n 306 Feral Bear\n 307 Assimilated Squid\n 308 Worm\n 309 Draconite";
        useEvolution = cfg.getBoolean("Evolution Phases", EVOLUTION_CATEGORY, useEvolution, "Set to false if you dont want to use evolution phases.");
        damageStationaryRS = cfg.getBoolean("Damage Deterrent RS", EVOLUTION_CATEGORY, damageStationaryRS, "Set to false if you don't want Deterrents to die if the RS chance is 0.");
        phaseCustomSpawner = cfg.getBoolean("Evolution Custom Spawner", EVOLUTION_CATEGORY, phaseCustomSpawner, "Set to false if you want to use Vanilla Spawner (parasite mob cap will not work if set to false).");
        evolutionNodeUnlock = (byte)cfg.getInt("Phase Node Unlock", EVOLUTION_CATEGORY, (int)evolutionNodeUnlock, 0, 11, "From this phase on, Nodes are unlocked.");
        evolutionColonyUnlock = (byte)cfg.getInt("Phase Colony Unlock", EVOLUTION_CATEGORY, (int)evolutionColonyUnlock, 0, 11, "From this phase on, Colonies are unlocked.");
        evolutionSleepDenied = (byte)cfg.getInt("Phase Sleep Point Multiplier", EVOLUTION_CATEGORY, (int)evolutionSleepDenied, 0, 11, "From this phase on, each time you sleep, the points obtained by sleeping will be multiplied by 5.");
        evolutionAssimilatedDehiding = (byte)cfg.getInt("Phase Assimilation Stop Hiding", EVOLUTION_CATEGORY, (int)evolutionAssimilatedDehiding, 0, 9, "From this phase on, Assimilated versions will stop hiding.");
        evolutionMudoAttack = (byte)cfg.getInt("Phase Rupter Stop Hiding", EVOLUTION_CATEGORY, (int)evolutionMudoAttack, 0, 11, "From this phase on, Rupters will stop running away from other mobs and they will directly covert.");
        evolutionBeckonIgnoreCooldown = (byte)cfg.getInt("Phase Beckon Summoning Cooldown", EVOLUTION_CATEGORY, (int)evolutionBeckonIgnoreCooldown, 0, 11, "From this phase on, Beckons will ignore their summoning cooldown when spawning.");
        evolutionSpawningIgnoreSunlight = (byte)cfg.getInt("Phase Parasites Ignore Sunlight", EVOLUTION_CATEGORY, (int)evolutionSpawningIgnoreSunlight, 0, 11, "From this phase on, Parasites will ignore sunlight when  spawning naturally.");
        evolutionDimStart = cfg.getStringList("Evolution Phases Dimension Starting Phase List", EVOLUTION_CATEGORY, evolutionDimStart, "List of dimensions that will start at a specific Evolution phase. Ex. \"1;8;10\"" + exa);
        evolutionDimGain = cfg.get(EVOLUTION_CATEGORY, "Evolution Phases Point Gain Blacklist", evolutionDimGain, "Parasites cannot earn points in these dimensions").getIntList();
        evolutionDimGainInverted = cfg.getBoolean("Evolution Phases Point Gain Blacklist Inverted", EVOLUTION_CATEGORY, evolutionDimGainInverted, "Set to true if you want to use the list as a WhiteList.");
        evolutionDimLoss = cfg.get(EVOLUTION_CATEGORY, "Evolution Phases Point Loss Blacklist", evolutionDimLoss, "Parasites cannot lose points in these dimensions").getIntList();
        evolutionDimLossInverted = cfg.getBoolean("Evolution Phases Point Loss Blacklist Inverted", EVOLUTION_CATEGORY, evolutionDimLossInverted, "Set to true if you want to use the list as a WhiteList.");
        evolutionCothStopLoot = (byte)cfg.getInt("Phase Loot Denied", EVOLUTION_CATEGORY, (int)evolutionCothStopLoot, 0, 11, "From this phase on, mobs with COTH will not drop loot anymore.");
        evolutionStopFishing = (byte)cfg.getInt("Phase Fishing Denied", EVOLUTION_CATEGORY, (int)evolutionStopFishing, 0, 11, "From this phase on, fishing will not give you loot anymore.");
        evolutionParasiteLock = cfg.getStringList("Evolution Parasite Lock List", EVOLUTION_CATEGORY, evolutionParasiteLock, "List of parasites that are unlocked when an evolution phase is reached. If a parasite is locked it cannot spawn naturallyEx. \"1;8;10\"" + exa22);
        evolutionParasiteLockMessage = cfg.getString("Evolution Parasite Lock Message", EVOLUTION_CATEGORY, evolutionParasiteLockMessage, "Message sent to all players when a parasite is unlocked");
        defaultEvoPhase = (byte)cfg.getInt("Default Phase Start", EVOLUTION_CATEGORY, (int)defaultEvoPhase, -2, 10, "Default initial phase value for dimensions.");
        defaultEvoPoints = cfg.getInt("Default Points Start", EVOLUTION_CATEGORY, defaultEvoPoints, -2147483640, 0x7FFFFFF8, "Default initial points for dimensions.");
        evolutionOneMind = (byte)cfg.getInt("Phase Collective Consciousness", EVOLUTION_CATEGORY, (int)evolutionOneMind, -1, 11, "From this phase on, One Mind will be active.");
        blackListedDimensionsEPP = cfg.get(EVOLUTION_CATEGORY, "Points Overtime WhiteList Dimensions", blackListedDimensionsEPP, "Parasites can only gain points overtime in these dimensions").getIntList();
        evolutionTotalKill = (byte)cfg.getInt("Phase Total Slaughter", EVOLUTION_CATEGORY, (int)evolutionTotalKill, -1, 11, "From this phase on, parasites will kill everything (not ignoring config options).");
        evolutionFeralNoSim = (byte)cfg.getInt("Phase Feral COTH", EVOLUTION_CATEGORY, (int)evolutionFeralNoSim, -1, 11, "From this phase on, COTH will spawn Feral versions instead of assimilated ones, if available.");
        evolutionNests = (byte)cfg.getInt("Phase Nest Unlock", EVOLUTION_CATEGORY, (int)evolutionNests, -1, 11, "From this phase on, Nests are unlocked.");
        evolutionDislodgment = (byte)cfg.getInt("Phase Dislodgment System", EVOLUTION_CATEGORY, (int)evolutionDislodgment, -1, 11, "From this phase on, Dislodgment System will be active.");
        evolutionParasiteAlwaysVariant = (byte)cfg.getInt("Phase Parasites Always Variant", EVOLUTION_CATEGORY, (int)evolutionParasiteAlwaysVariant, -1, 11, "From this phase on, Parasites will always spawn as a variant if available.");
        evolutionHives = (byte)cfg.getInt("Phase Hive Unlocked", EVOLUTION_CATEGORY, (int)evolutionHives, -1, 11, "From this phase on, Hives are unlocked.");
        evolutionNoParasiteHealing = (byte)cfg.getInt("Phase Healing Affected", EVOLUTION_CATEGORY, (int)evolutionNoParasiteHealing, -1, 11, "From this phase on, Healing is affected to non-parasites mobs.");
        evolutionNoParasiteHealingValue = cfg.getFloat("Phase Healing Affected Value", EVOLUTION_CATEGORY, evolutionNoParasiteHealingValue, 0.0f, 1.0f, "Value of the healing .");
        evolutionPArasitesWithoutXP = (byte)cfg.getInt("Phase Parasites Without XP", EVOLUTION_CATEGORY, (int)evolutionPArasitesWithoutXP, -1, 11, "From this phase on, Parasites will no longer drop xp.");
        evolutionParasiteStatIncrease = (byte)cfg.getInt("Phase Parasites Stats Increase", EVOLUTION_CATEGORY, (int)evolutionParasiteStatIncrease, -1, 11, "From this phase on, Parasites will spawn with an increase of stats.");
        evolutionParasiteStatIncreaseValue = cfg.getFloat("Phase Parasites Stats Increase Value", EVOLUTION_CATEGORY, evolutionParasiteStatIncreaseValue, 0.0f, 1.0f, "Parasite stats multiplier.");
        evolutionNoParasiteSpawnDenied = (byte)cfg.getInt("Phase Spawning Denied", EVOLUTION_CATEGORY, (int)evolutionNoParasiteSpawnDenied, -1, 11, "From this phase on, all non-parasites mobs will stop spawning naturally.");
        evolutionNoPlayerMultipler = cfg.getBoolean("Evolution No Players Gaining", EVOLUTION_CATEGORY, evolutionNoPlayerMultipler, "True if parasites can gain points when there are no players in the server.");
        valueLossBlockStain = cfg.getInt("Value Loss Block Stain", EVOLUTION_CATEGORY, valueLossBlockStain, 0, 1000000, "How many points parasites will lose when Infested Blocks type stain are mined.");
        valueLossBlockTrunk = cfg.getInt("Value Loss Block Trunk", EVOLUTION_CATEGORY, valueLossBlockTrunk, 0, 1000000, "How many points parasites will lose when Infested Blocks type trunk are mined.");
        valueLossBlockRubble = cfg.getInt("Value Loss Block Rubble", EVOLUTION_CATEGORY, valueLossBlockRubble, 0, 1000000, "How many points parasites will lose when Infested Blocks type rubble are mined.");
        valueKill = cfg.getInt("Value for kills", EVOLUTION_CATEGORY, valueKill, 0, 1000000, "Number of Points gained each kill.");
        valueCOTH = cfg.getInt("Value for COTH", EVOLUTION_CATEGORY, valueCOTH, 0, 1000000, "Number of Points gained when a mob with COTH reaches amp +2.");
        valueBlock = cfg.getInt("Value for blocks", EVOLUTION_CATEGORY, valueBlock, 0, 1000000, "Number of Points gained when converting a block.");
        valueMerge = cfg.getInt("Value for Merging", EVOLUTION_CATEGORY, valueMerge, 0, 1000000, "Number of Points gained when using the merge system to spawn Primitive Parasites.");
        valueEvolutionDespawn = cfg.getInt("Value for Despawning", EVOLUTION_CATEGORY, valueEvolutionDespawn, 0, 1000000, "Number of Points gained when Adapted versions spawned from moving flesh despawn, set this value to 0 in you dont want adapted to despawn.");
    }

    private static void initevolution0Config(Configuration cfg) {
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is the entity, \n \"1\" is the minimum group count. \n \"3\" is the maximum group count. \n \"90\" is spawn weight. \n";
        phaseWarningZero = cfg.getString("Phase 0 Warning Message", EVOLUTION_CATEGORY0, phaseWarningZero, "Message sent to all players in the current world when parasites reach this Phase");
        sleepPenaltyZero = cfg.getInt("Phase 0 Sleep Penalty", EVOLUTION_CATEGORY0, sleepPenaltyZero, 0, 0x7FFFFFF8, "Number of Points gained when skipping the night.");
        phaseMaxParasiteIDZero = (byte)cfg.getInt("Phase 0 Maximum Parasite ID", EVOLUTION_CATEGORY0, (int)phaseMaxParasiteIDZero, 0, 100, "If a parasite ID is equal to or greater than this number, the parasite will not spawn.");
        phaseCancelParasiteIDZero = (byte)cfg.getInt("Phase 0 Minimum Parasite ID", EVOLUTION_CATEGORY0, (int)phaseCancelParasiteIDZero, 0, 100, "If a parasite ID is equal to or less than this number, the parasite will not spawn.");
        phaseScentBonusZero = cfg.getInt("Phase 0 Scent Death Bonus", EVOLUTION_CATEGORY0, phaseScentBonusZero, -100000, 1000, "Death bonus value used if parasite_collective_consciousness is enabled.");
        phaseScentReactionZero = (byte)cfg.getInt("Phase 0 Scent Reaction Bonus", EVOLUTION_CATEGORY0, (int)phaseScentReactionZero, 0, 100, "Reaction bonus value used for a scent to go active.");
        phaseSpawnEntryZero = cfg.getStringList("Phase 0 Spawn Entity List", EVOLUTION_CATEGORY0, phaseSpawnEntryZero, "Entity List that will spawn at phase 0." + entry);
    }

    private static void initevolution1Config(Configuration cfg) {
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is the entity, \n \"1\" is the minimum group count. \n \"3\" is the maximum group count. \n \"90\" is spawn weight. \n";
        phaseKillsOne = cfg.getInt("Phase 1 Points", EVOLUTION_CATEGORY1, phaseKillsOne, 0, 0x7FFFFFF8, "Number of Points required to reach Phase 1.");
        phaseKillCountPlusOne = cfg.getFloat("Phase 1 Killcount Plus", EVOLUTION_CATEGORY1, (float)phaseKillCountPlusOne, 0.0f, 100.0f, "Each second the killcount will go up by this amount.");
        phaseMaxParasiteIDOne = (byte)cfg.getInt("Phase 1 Maximum Parasite ID", EVOLUTION_CATEGORY1, (int)phaseMaxParasiteIDOne, 0, 100, "If a parasite ID is equal to or greater than this number, the parasite will not spawn.");
        phaseCancelParasiteIDOne = (byte)cfg.getInt("Phase 1 Minimum Parasite ID", EVOLUTION_CATEGORY1, (int)phaseCancelParasiteIDOne, 0, 100, "If a parasite ID is equal to or less than this number, the parasite will not spawn.");
        reinforcementSystemChanceOne = cfg.getFloat("Phase 1 Reinforcement System Chance", EVOLUTION_CATEGORY1, (float)reinforcementSystemChanceOne, 0.0f, 1.0f, "Chance to spawn a Beckon when a parasite is killed.");
        beckonStageIGrowPenaltyOne = cfg.getFloat("Phase 1 Nexus Stage I Grow Stunned", EVOLUTION_CATEGORY1, (float)beckonStageIGrowPenaltyOne, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SI.");
        beckonStageIIGrowPenaltyOne = cfg.getFloat("Phase 1 Nexus Stage II Grow Stunned", EVOLUTION_CATEGORY1, (float)beckonStageIIGrowPenaltyOne, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SII.");
        beckonStageIIIGrowPenaltyOne = cfg.getFloat("Phase 1 Nexus Stage III Grow Stunned", EVOLUTION_CATEGORY1, (float)beckonStageIIIGrowPenaltyOne, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SIII.");
        mobSpawningCOTHChanceOne = cfg.getFloat("Phase 1 Mob Spawn With COTH", EVOLUTION_CATEGORY1, (float)mobSpawningCOTHChanceOne, 0.0f, 1.0f, "Chance (1=100%) for an entity to spawn with COTH (amp 0).");
        cropGrowStunnedOne = cfg.getFloat("Phase 1 Crop Grow Stunned", EVOLUTION_CATEGORY1, (float)cropGrowStunnedOne, 0.0f, 1.0f, "Chance (1=100%) for crop grow to be stunned.");
        luredValueOne = cfg.getInt("Phase 1 Lure Block Cooldown Value", EVOLUTION_CATEGORY1, luredValueOne, 0, 0x7FFFFFF8, "Cooldown added ot the parasites when using a Lure Block.");
        luredValueOneCool = cfg.getInt("Phase 1 Carcass Value", EVOLUTION_CATEGORY1, luredValueOneCool, 0, 0x7FFFFFF8, "Number of Points the parasites will lose when using a Carcass");
        phaseWarningOne = cfg.getString("Phase 1 Warning Message", EVOLUTION_CATEGORY1, phaseWarningOne, "Message sent to all players in the current world when parasites reach this Phase");
        sleepPenaltyOne = cfg.getInt("Phase 1 Sleep Penalty", EVOLUTION_CATEGORY1, sleepPenaltyOne, 0, 0x7FFFFFF8, "Number of Points gained when skipping the night.");
        phaseScentBonusOne = cfg.getInt("Phase 1 Scent Death Bonus", EVOLUTION_CATEGORY1, phaseScentBonusOne, 0, 1000, "Death bonus value used if parasite_collective_consciousness is enabled.");
        phaseScentReactionOne = (byte)cfg.getInt("Phase 1 Scent Reaction Bonus", EVOLUTION_CATEGORY1, (int)phaseScentReactionOne, 0, 100, "Reaction bonus value used for a scent to go active.");
        phaseDelayTicksOne = cfg.getInt("Phase 1 Delay", EVOLUTION_CATEGORY1, phaseDelayTicksOne, 0, 0x7FFFFFF8, "Parasites will not be able to earn points until this time (seconds) has passed.");
        phaseResidueOne = cfg.getInt("Phase 1 Residue", EVOLUTION_CATEGORY1, phaseResidueOne, 0, 0x7FFFFFF8, "One in X to spawn a Beckon on the Infested Block Residue (random tick).");
        phaseSpawnEntryOne = cfg.getStringList("Phase 1 Spawn Entity List", EVOLUTION_CATEGORY1, phaseSpawnEntryOne, "Entity List that will spawn at phase 1." + entry);
        oneLevelDeploy = cfg.getInt("Phase 1 Lure Scent Level Desploy", EVOLUTION_CATEGORY1, oneLevelDeploy, 1, 8, "Level that the Scent will have when it spawns from a Lure Block of this phase.");
    }

    private static void initevolution2Config(Configuration cfg) {
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is the entity, \n \"1\" is the minimum group count. \n \"3\" is the maximum group count. \n \"90\" is spawn weight. \n";
        phaseKillsTwo = cfg.getInt("Phase 2 Points", EVOLUTION_CATEGORY2, phaseKillsTwo, 0, 0x7FFFFFF8, "Number of Points required to reach Phase 2.");
        phaseKillCountPlusTwo = cfg.getFloat("Phase 2 Killcount Plus", EVOLUTION_CATEGORY2, (float)phaseKillCountPlusTwo, 0.0f, 100.0f, "Each second the killcount will go up by this amount.");
        phaseMaxParasiteIDTwo = (byte)cfg.getInt("Phase 2 Maximum Parasite ID", EVOLUTION_CATEGORY2, (int)phaseMaxParasiteIDTwo, 0, 100, "If a parasite ID is equal to or greater than this number, the parasite will not spawn.");
        phaseCancelParasiteIDTwo = (byte)cfg.getInt("Phase 2 Minimum Parasite ID", EVOLUTION_CATEGORY2, (int)phaseCancelParasiteIDTwo, 0, 100, "If a parasite ID is equal to or less than this number, the parasite will not spawn.");
        reinforcementSystemChanceTwo = cfg.getFloat("Phase 2 Reinforcement System Chance", EVOLUTION_CATEGORY2, (float)reinforcementSystemChanceTwo, 0.0f, 1.0f, "Chance to spawn a Beckon when a parasite is killed.");
        beckonStageIGrowPenaltyTwo = cfg.getFloat("Phase 2 Nexus Stage I Grow Stunned", EVOLUTION_CATEGORY2, (float)beckonStageIGrowPenaltyTwo, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SI.");
        beckonStageIIGrowPenaltyTwo = cfg.getFloat("Phase 2 Nexus Stage II Grow Stunned", EVOLUTION_CATEGORY2, (float)beckonStageIIGrowPenaltyTwo, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SII.");
        beckonStageIIIGrowPenaltyTwo = cfg.getFloat("Phase 2 Nexus Stage III Grow Stunned", EVOLUTION_CATEGORY2, (float)beckonStageIIIGrowPenaltyTwo, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SIII.");
        mobSpawningCOTHChanceTwo = cfg.getFloat("Phase 2 Mob Spawn With COTH", EVOLUTION_CATEGORY2, (float)mobSpawningCOTHChanceTwo, 0.0f, 1.0f, "Chance (1=100%) for an entity to spawn with COTH (amp 0).");
        cropGrowStunnedTwo = cfg.getFloat("Phase 2 Crop Grow Stunned", EVOLUTION_CATEGORY2, (float)cropGrowStunnedTwo, 0.0f, 1.0f, "Chance (1=100%) for crop grow to be stunned.");
        luredValueTwo = cfg.getInt("Phase 2 Lure Block Cooldown Value", EVOLUTION_CATEGORY2, luredValueTwo, 0, 0x7FFFFFF8, "Cooldown added ot the parasites when using a Lure Block.");
        luredValueTwoCool = cfg.getInt("Phase 2 Carcass Value", EVOLUTION_CATEGORY2, luredValueTwoCool, 0, 0x7FFFFFF8, "Number of Points the parasites will lose when using a Carcass");
        phaseWarningTwo = cfg.getString("Phase 2 Warning Message", EVOLUTION_CATEGORY2, phaseWarningTwo, "Message sent to all players in the current world when parasites reach this Phase");
        sleepPenaltyTwo = cfg.getInt("Phase 2 Sleep Penalty", EVOLUTION_CATEGORY2, sleepPenaltyTwo, 0, 0x7FFFFFF8, "Number of Points gained when skipping the night.");
        phaseScentBonusTwo = cfg.getInt("Phase 2 Scent Death Bonus", EVOLUTION_CATEGORY2, phaseScentBonusTwo, 0, 1000, "Death bonus value used if parasite_collective_consciousness is enabled.");
        phaseScentReactionTwo = (byte)cfg.getInt("Phase 2 Scent Reaction Bonus", EVOLUTION_CATEGORY2, (int)phaseScentReactionTwo, 0, 100, "Reaction bonus value used for a scent to go active.");
        phaseDelayTicksTwo = cfg.getInt("Phase 2 Delay", EVOLUTION_CATEGORY2, phaseDelayTicksTwo, 0, 0x7FFFFFF8, "Parasites will not be able to earn points until this time (seconds) has passed.");
        phaseResidueTwo = cfg.getInt("Phase 2 Residue", EVOLUTION_CATEGORY2, phaseResidueTwo, 0, 0x7FFFFFF8, "One in X to spawn a Beckon on the Infested Block Residue (random tick).");
        phaseSpawnEntryTwo = cfg.getStringList("Phase 2 Spawn Entity List", EVOLUTION_CATEGORY2, phaseSpawnEntryTwo, "Entity List that will spawn at phase 2." + entry);
        twoLevelDeploy = cfg.getInt("Phase 2 Lure Scent Level Desploy", EVOLUTION_CATEGORY2, twoLevelDeploy, 1, 8, "Level that the Scent will have when it spawns from a Lure Block of this phase.");
    }

    private static void initevolution3Config(Configuration cfg) {
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is the entity, \n \"1\" is the minimum group count. \n \"3\" is the maximum group count. \n \"90\" is spawn weight. \n";
        phaseKillsThree = cfg.getInt("Phase 3 Points", EVOLUTION_CATEGORY3, phaseKillsThree, 0, 0x7FFFFFF8, "Number of Points required to reach Phase 3.");
        phaseKillCountPlusThree = cfg.getFloat("Phase 3 Killcount Plus", EVOLUTION_CATEGORY3, (float)phaseKillCountPlusThree, 0.0f, 100.0f, "Each second the killcount will go up by this amount.");
        phaseMaxParasiteIDThree = (byte)cfg.getInt("Phase 3 Maximum Parasite ID", EVOLUTION_CATEGORY3, (int)phaseMaxParasiteIDThree, 0, 100, "If a parasite ID is equal to or greater than this number, the parasite will not spawn.");
        phaseCancelParasiteIDThree = (byte)cfg.getInt("Phase 3 Minimum Parasite ID", EVOLUTION_CATEGORY3, (int)phaseCancelParasiteIDThree, 0, 100, "If a parasite ID is equal to or less than this number, the parasite will not spawn.");
        reinforcementSystemChanceThree = cfg.getFloat("Phase 3 Reinforcement System Chance", EVOLUTION_CATEGORY3, (float)reinforcementSystemChanceThree, 0.0f, 1.0f, "Chance to spawn a Beckon when a parasite is killed.");
        beckonStageIGrowPenaltyThree = cfg.getFloat("Phase 3 Nexus Stage I Grow Stunned", EVOLUTION_CATEGORY3, (float)beckonStageIGrowPenaltyThree, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SI.");
        beckonStageIIGrowPenaltyThree = cfg.getFloat("Phase 3 Nexus Stage II Grow Stunned", EVOLUTION_CATEGORY3, (float)beckonStageIIGrowPenaltyThree, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SII.");
        beckonStageIIIGrowPenaltyThree = cfg.getFloat("Phase 3 Nexus Stage III Grow Stunned", EVOLUTION_CATEGORY3, (float)beckonStageIIIGrowPenaltyThree, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SIII.");
        mobSpawningCOTHChanceThree = cfg.getFloat("Phase 3 Mob Spawn With COTH", EVOLUTION_CATEGORY3, (float)mobSpawningCOTHChanceThree, 0.0f, 1.0f, "Chance (1=100%) for an entity to spawn with COTH (amp 0).");
        cropGrowStunnedThree = cfg.getFloat("Phase 3 Crop Grow Stunned", EVOLUTION_CATEGORY3, (float)cropGrowStunnedThree, 0.0f, 1.0f, "Chance (1=100%) for crop grow to be stunned.");
        luredValueThree = cfg.getInt("Phase 3 Lure Block Cooldown Value", EVOLUTION_CATEGORY3, luredValueThree, 0, 0x7FFFFFF8, "Cooldown added ot the parasites when using a Lure Block.");
        luredValueThreeCool = cfg.getInt("Phase 3 Carcass Value", EVOLUTION_CATEGORY3, luredValueThreeCool, 0, 0x7FFFFFF8, "Number of Points the parasites will lose when using a Carcass");
        phaseWarningThree = cfg.getString("Phase 3 Warning Message", EVOLUTION_CATEGORY3, phaseWarningThree, "Message sent to all players in the current world when parasites reach this Phase");
        sleepPenaltyThree = cfg.getInt("Phase 3 Sleep Penalty", EVOLUTION_CATEGORY3, sleepPenaltyThree, 0, 0x7FFFFFF8, "Number of Points gained when skipping the night.");
        phaseScentBonusThree = cfg.getInt("Phase 3 Scent Death Bonus", EVOLUTION_CATEGORY3, phaseScentBonusThree, 0, 1000, "Death bonus value used if parasite_collective_consciousness is enabled.");
        phaseScentReactionThree = (byte)cfg.getInt("Phase 3 Scent Reaction Bonus", EVOLUTION_CATEGORY3, (int)phaseScentReactionThree, 0, 100, "Reaction bonus value used for a scent to go active.");
        phaseDelayTicksThree = cfg.getInt("Phase 3 Delay", EVOLUTION_CATEGORY3, phaseDelayTicksThree, 0, 0x7FFFFFF8, "Parasites will not be able to earn points until this time (seconds) has passed.");
        phaseResidueThree = cfg.getInt("Phase 3 Residue", EVOLUTION_CATEGORY3, phaseResidueThree, 0, 0x7FFFFFF8, "One in X to spawn a Beckon on the Infested Block Residue (random tick).");
        phaseSpawnEntryThree = cfg.getStringList("Phase 3 Spawn Entity List", EVOLUTION_CATEGORY3, phaseSpawnEntryThree, "Entity List that will spawn at phase 3." + entry);
        threeLevelDeploy = cfg.getInt("Phase 3 Lure Scent Level Desploy", EVOLUTION_CATEGORY3, threeLevelDeploy, 1, 8, "Level that the Scent will have when it spawns from a Lure Block of this phase.");
    }

    private static void initevolution4Config(Configuration cfg) {
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is the entity, \n \"1\" is the minimum group count. \n \"3\" is the maximum group count. \n \"90\" is spawn weight. \n";
        phaseKillsFour = cfg.getInt("Phase 4 Points", EVOLUTION_CATEGORY4, phaseKillsFour, 0, 0x7FFFFFF8, "Number of Points required to reach Phase 4.");
        phaseKillCountPlusFour = cfg.getFloat("Phase 4 Killcount Plus", EVOLUTION_CATEGORY4, (float)phaseKillCountPlusFour, 0.0f, 100.0f, "Each second the killcount will go up by this amount.");
        phaseMaxParasiteIDFour = (byte)cfg.getInt("Phase 4 Maximum Parasite ID", EVOLUTION_CATEGORY4, (int)phaseMaxParasiteIDFour, 0, 100, "If a parasite ID is equal to or greater than this number, the parasite will not spawn.");
        phaseCancelParasiteIDFour = (byte)cfg.getInt("Phase 4 Minimum Parasite ID", EVOLUTION_CATEGORY4, (int)phaseCancelParasiteIDFour, 0, 100, "If a parasite ID is equal to or less than this number, the parasite will not spawn.");
        reinforcementSystemChanceFour = cfg.getFloat("Phase 4 Reinforcement System Chance", EVOLUTION_CATEGORY4, (float)reinforcementSystemChanceFour, 0.0f, 1.0f, "Chance to spawn a Beckon when a parasite is killed.");
        beckonStageIGrowPenaltyFour = cfg.getFloat("Phase 4 Nexus Stage I Grow Stunned", EVOLUTION_CATEGORY4, (float)beckonStageIGrowPenaltyFour, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SI.");
        beckonStageIIGrowPenaltyFour = cfg.getFloat("Phase 4 Nexus Stage II Grow Stunned", EVOLUTION_CATEGORY4, (float)beckonStageIIGrowPenaltyFour, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SII.");
        beckonStageIIIGrowPenaltyFour = cfg.getFloat("Phase 4 Nexus Stage III Grow Stunned", EVOLUTION_CATEGORY4, (float)beckonStageIIIGrowPenaltyFour, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SIII.");
        mobSpawningCOTHChanceFour = cfg.getFloat("Phase 4 Mob Spawn With COTH", EVOLUTION_CATEGORY4, (float)mobSpawningCOTHChanceFour, 0.0f, 1.0f, "Chance (1=100%) for an entity to spawn with COTH (amp 0).");
        cropGrowStunnedFour = cfg.getFloat("Phase 4 Crop Grow Stunned", EVOLUTION_CATEGORY4, (float)cropGrowStunnedFour, 0.0f, 1.0f, "Chance (1=100%) for crop grow to be stunned.");
        luredValueFour = cfg.getInt("Phase 4 Lure Block Cooldown Value", EVOLUTION_CATEGORY4, luredValueFour, 0, 0x7FFFFFF8, "Cooldown added ot the parasites when using a Lure Block.");
        luredValueFourCool = cfg.getInt("Phase 4 Carcass Value", EVOLUTION_CATEGORY4, luredValueFourCool, 0, 0x7FFFFFF8, "Number of Points the parasites will lose when using a Carcass");
        phaseWarningFour = cfg.getString("Phase 4 Warning Message", EVOLUTION_CATEGORY4, phaseWarningFour, "Message sent to all players in the current world when parasites reach this Phase");
        sleepPenaltyFour = cfg.getInt("Phase 4 Sleep Penalty", EVOLUTION_CATEGORY4, sleepPenaltyFour, 0, 0x7FFFFFF8, "Number of Points gained when skipping the night.");
        phaseScentBonusFour = cfg.getInt("Phase 4 Scent Death Bonus", EVOLUTION_CATEGORY4, phaseScentBonusFour, 0, 1000, "Death bonus value used if parasite_collective_consciousness is enabled.");
        phaseScentReactionFour = (byte)cfg.getInt("Phase 4 Scent Reaction Bonus", EVOLUTION_CATEGORY4, (int)phaseScentReactionFour, 0, 100, "Reaction bonus value used for a scent to go active.");
        phaseDelayTicksFour = cfg.getInt("Phase 4 Delay", EVOLUTION_CATEGORY4, phaseDelayTicksFour, 0, 0x7FFFFFF8, "Parasites will not be able to earn points until this time (seconds) has passed.");
        phaseResidueFour = cfg.getInt("Phase 4 Residue", EVOLUTION_CATEGORY4, phaseResidueFour, 0, 0x7FFFFFF8, "One in X to spawn a Beckon on the Infested Block Residue (random tick).");
        phaseSpawnEntryFour = cfg.getStringList("Phase 4 Spawn Entity List", EVOLUTION_CATEGORY4, phaseSpawnEntryFour, "Entity List that will spawn at phase 4." + entry);
        fourLevelDeploy = cfg.getInt("Phase 4 Lure Scent Level Desploy", EVOLUTION_CATEGORY4, fourLevelDeploy, 1, 8, "Level that the Scent will have when it spawns from a Lure Block of this phase.");
    }

    private static void initevolution5Config(Configuration cfg) {
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is the entity, \n \"1\" is the minimum group count. \n \"3\" is the maximum group count. \n \"90\" is spawn weight. \n";
        phaseKillsFive = cfg.getInt("Phase 5 Points", EVOLUTION_CATEGORY5, phaseKillsFive, 0, 0x7FFFFFF8, "Number of Points required to reach Phase 5.");
        phaseKillCountPlusFive = cfg.getFloat("Phase 5 Killcount Plus", EVOLUTION_CATEGORY5, (float)phaseKillCountPlusFive, 0.0f, 100.0f, "Each second the killcount will go up by this amount.");
        phaseMaxParasiteIDFive = (byte)cfg.getInt("Phase 5 Maximum Parasite ID", EVOLUTION_CATEGORY5, (int)phaseMaxParasiteIDFive, 0, 100, "If a parasite ID is equal to or greater than this number, the parasite will not spawn.");
        phaseCancelParasiteIDFive = (byte)cfg.getInt("Phase 5 Minimum Parasite ID", EVOLUTION_CATEGORY5, (int)phaseCancelParasiteIDFive, 0, 100, "If a parasite ID is equal to or less than this number, the parasite will not spawn.");
        reinforcementSystemChanceFive = cfg.getFloat("Phase 5 Reinforcement System Chance", EVOLUTION_CATEGORY5, (float)reinforcementSystemChanceFive, 0.0f, 1.0f, "Chance to spawn a Beckon when a parasite is killed.");
        beckonStageIGrowPenaltyFive = cfg.getFloat("Phase 5 Nexus Stage I Grow Stunned", EVOLUTION_CATEGORY5, (float)beckonStageIGrowPenaltyFive, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SI.");
        beckonStageIIGrowPenaltyFive = cfg.getFloat("Phase 5 Nexus Stage II Grow Stunned", EVOLUTION_CATEGORY5, (float)beckonStageIIGrowPenaltyFive, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SII.");
        beckonStageIIIGrowPenaltyFive = cfg.getFloat("Phase 5 Nexus Stage III Grow Stunned", EVOLUTION_CATEGORY5, (float)beckonStageIIIGrowPenaltyFive, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SIII.");
        mobSpawningCOTHChanceFive = cfg.getFloat("Phase 5 Mob Spawn With COTH", EVOLUTION_CATEGORY5, (float)mobSpawningCOTHChanceFive, 0.0f, 1.0f, "Chance (1=100%) for an entity to spawn with COTH (amp 0).");
        cropGrowStunnedFive = cfg.getFloat("Phase 5 Crop Grow Stunned", EVOLUTION_CATEGORY5, (float)cropGrowStunnedFive, 0.0f, 1.0f, "Chance (1=100%) for crop grow to be stunned.");
        luredValueFive = cfg.getInt("Phase 5 Lure Block Cooldown Value", EVOLUTION_CATEGORY5, luredValueFive, 0, 0x7FFFFFF8, "Cooldown added ot the parasites when using a Lure Block.");
        luredValueFiveCool = cfg.getInt("Phase 5 Carcass Value", EVOLUTION_CATEGORY5, luredValueFiveCool, 0, 0x7FFFFFF8, "Number of Points the parasites will lose when using a Carcass");
        phaseWarningFive = cfg.getString("Phase 5 Warning Message", EVOLUTION_CATEGORY5, phaseWarningFive, "Message sent to all players in the current world when parasites reach this Phase");
        sleepPenaltyFive = cfg.getInt("Phase 5 Sleep Penalty", EVOLUTION_CATEGORY5, sleepPenaltyFive, 0, 0x7FFFFFF8, "Number of Points gained when skipping the night.");
        phaseScentBonusFive = cfg.getInt("Phase 5 Scent Death Bonus", EVOLUTION_CATEGORY5, phaseScentBonusFive, 0, 1000, "Death bonus value used if parasite_collective_consciousness is enabled.");
        phaseScentReactionFive = (byte)cfg.getInt("Phase 5 Scent Reaction Bonus", EVOLUTION_CATEGORY5, (int)phaseScentReactionFive, 0, 100, "Reaction bonus value used for a scent to go active.");
        phaseDelayTicksFive = cfg.getInt("Phase 5 Delay", EVOLUTION_CATEGORY5, phaseDelayTicksFive, 0, 0x7FFFFFF8, "Parasites will not be able to earn points until this time (seconds) has passed.");
        phaseResidueFive = cfg.getInt("Phase 5 Residue", EVOLUTION_CATEGORY5, phaseResidueFive, 0, 0x7FFFFFF8, "One in X to spawn a Beckon on the Infested Block Residue (random tick).");
        phaseSpawnEntryFive = cfg.getStringList("Phase 5 Spawn Entity List", EVOLUTION_CATEGORY5, phaseSpawnEntryFive, "Entity List that will spawn at phase 5." + entry);
        fiveLevelDeploy = cfg.getInt("Phase 5 Lure Scent Level Desploy", EVOLUTION_CATEGORY5, fiveLevelDeploy, 1, 8, "Level that the Scent will have when it spawns from a Lure Block of this phase.");
    }

    private static void initevolution6Config(Configuration cfg) {
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is the entity, \n \"1\" is the minimum group count. \n \"3\" is the maximum group count. \n \"90\" is spawn weight. \n";
        phaseKillsSix = cfg.getInt("Phase 6 Points", EVOLUTION_CATEGORY6, phaseKillsSix, 0, 0x7FFFFFF8, "Number of Points required to reach Phase 6.");
        phaseKillCountPlusSix = cfg.getFloat("Phase 6 Killcount Plus", EVOLUTION_CATEGORY6, (float)phaseKillCountPlusSix, 0.0f, 100.0f, "Each second the killcount will go up by this amount.");
        phaseMaxParasiteIDSix = (byte)cfg.getInt("Phase 6 Maximum Parasite ID", EVOLUTION_CATEGORY6, (int)phaseMaxParasiteIDSix, 0, 100, "If a parasite ID is equal to or greater than this number, the parasite will not spawn.");
        phaseCancelParasiteIDSix = (byte)cfg.getInt("Phase 6 Minimum Parasite ID", EVOLUTION_CATEGORY6, (int)phaseCancelParasiteIDSix, 0, 100, "If a parasite ID is equal to or less than this number, the parasite will not spawn.");
        reinforcementSystemChanceSix = cfg.getFloat("Phase 6 Reinforcement System Chance", EVOLUTION_CATEGORY6, (float)reinforcementSystemChanceSix, 0.0f, 1.0f, "Chance to spawn a Beckon when a parasite is killed.");
        beckonStageIGrowPenaltySix = cfg.getFloat("Phase 6 Nexus Stage I Grow Stunned", EVOLUTION_CATEGORY6, (float)beckonStageIGrowPenaltySix, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SI.");
        beckonStageIIGrowPenaltySix = cfg.getFloat("Phase 6 Nexus Stage II Grow Stunned", EVOLUTION_CATEGORY6, (float)beckonStageIIGrowPenaltySix, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SII.");
        beckonStageIIIGrowPenaltySix = cfg.getFloat("Phase 6 Nexus Stage III Grow Stunned", EVOLUTION_CATEGORY6, (float)beckonStageIIIGrowPenaltySix, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SIII.");
        mobSpawningCOTHChanceSix = cfg.getFloat("Phase 6 Mob Spawn With COTH", EVOLUTION_CATEGORY6, (float)mobSpawningCOTHChanceSix, 0.0f, 1.0f, "Chance (1=100%) for an entity to spawn with COTH (amp 0).");
        cropGrowStunnedSix = cfg.getFloat("Phase 6 Crop Grow Stunned", EVOLUTION_CATEGORY6, (float)cropGrowStunnedSix, 0.0f, 1.0f, "Chance (1=100%) for crop grow to be stunned.");
        luredValueSix = cfg.getInt("Phase 6 Lure Block Cooldown Value", EVOLUTION_CATEGORY6, luredValueSix, 0, 0x7FFFFFF8, "Cooldown added ot the parasites when using a Lure Block.");
        luredValueSixCool = cfg.getInt("Phase 6 Carcass Value", EVOLUTION_CATEGORY6, luredValueSixCool, 0, 0x7FFFFFF8, "Number of Points the parasites will lose when using a Carcass");
        phaseWarningSix = cfg.getString("Phase 6 Warning Message", EVOLUTION_CATEGORY6, phaseWarningSix, "Message sent to all players in the current world when parasites reach this Phase");
        sleepPenaltySix = cfg.getInt("Phase 6 Sleep Penalty", EVOLUTION_CATEGORY6, sleepPenaltySix, 0, 0x7FFFFFF8, "Number of Points gained when skipping the night.");
        phaseScentBonusSix = cfg.getInt("Phase 6 Scent Death Bonus", EVOLUTION_CATEGORY6, phaseScentBonusSix, 0, 1000, "Death bonus value used if parasite_collective_consciousness is enabled.");
        phaseScentReactionSix = (byte)cfg.getInt("Phase 6 Scent Reaction Bonus", EVOLUTION_CATEGORY6, (int)phaseScentReactionSix, 0, 100, "Reaction bonus value used for a scent to go active.");
        phaseDelayTicksSix = cfg.getInt("Phase 6 Delay", EVOLUTION_CATEGORY6, phaseDelayTicksSix, 0, 0x7FFFFFF8, "Parasites will not be able to earn points until this time (seconds) has passed.");
        phaseResidueSix = cfg.getInt("Phase 6 Residue", EVOLUTION_CATEGORY6, phaseResidueSix, 0, 0x7FFFFFF8, "One in X to spawn a Beckon on the Infested Block Residue (random tick).");
        phaseSpawnEntrySix = cfg.getStringList("Phase 6 Spawn Entity List", EVOLUTION_CATEGORY6, phaseSpawnEntrySix, "Entity List that will spawn at phase 6." + entry);
        sixLevelDeploy = cfg.getInt("Phase 6 Lure Scent Level Desploy", EVOLUTION_CATEGORY6, sixLevelDeploy, 1, 8, "Level that the Scent will have when it spawns from a Lure Block of this phase.");
    }

    private static void initevolution7Config(Configuration cfg) {
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is the entity, \n \"1\" is the minimum group count. \n \"3\" is the maximum group count. \n \"90\" is spawn weight. \n";
        phaseKillsSeven = cfg.getInt("Phase 7 Points", EVOLUTION_CATEGORY7, phaseKillsSeven, 0, 0x7FFFFFF8, "Number of Points required to reach Phase 7.");
        phaseKillCountPlusSeven = cfg.getFloat("Phase 7 Killcount Plus", EVOLUTION_CATEGORY7, (float)phaseKillCountPlusSeven, 0.0f, 100.0f, "Each second the killcount will go up by this amount.");
        phaseMaxParasiteIDSeven = (byte)cfg.getInt("Phase 7 Maximum Parasite ID", EVOLUTION_CATEGORY7, (int)phaseMaxParasiteIDSeven, 0, 100, "If a parasite ID is equal to or greater than this number, the parasite will not spawn.");
        phaseCancelParasiteIDSeven = (byte)cfg.getInt("Phase 7 Minimum Parasite ID", EVOLUTION_CATEGORY7, (int)phaseCancelParasiteIDSeven, 0, 100, "If a parasite ID is equal to or less than this number, the parasite will not spawn.");
        reinforcementSystemChanceSeven = cfg.getFloat("Phase 7 Reinforcement System Chance", EVOLUTION_CATEGORY7, (float)reinforcementSystemChanceSeven, 0.0f, 1.0f, "Chance to spawn a Beckon when a parasite is killed.");
        beckonStageIGrowPenaltySeven = cfg.getFloat("Phase 7 Nexus Stage I Grow Stunned", EVOLUTION_CATEGORY7, (float)beckonStageIGrowPenaltySeven, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SI.");
        beckonStageIIGrowPenaltySeven = cfg.getFloat("Phase 7 Nexus Stage II Grow Stunned", EVOLUTION_CATEGORY7, (float)beckonStageIIGrowPenaltySeven, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SII.");
        beckonStageIIIGrowPenaltySeven = cfg.getFloat("Phase 7 Nexus Stage III Grow Stunned", EVOLUTION_CATEGORY7, (float)beckonStageIIIGrowPenaltySeven, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SIII.");
        mobSpawningCOTHChanceSeven = cfg.getFloat("Phase 7 Mob Spawn With COTH", EVOLUTION_CATEGORY7, (float)mobSpawningCOTHChanceSeven, 0.0f, 1.0f, "Chance (1=100%) for an entity to spawn with COTH (amp 0).");
        cropGrowStunnedSeven = cfg.getFloat("Phase 7 Crop Grow Stunned", EVOLUTION_CATEGORY7, (float)cropGrowStunnedSeven, 0.0f, 1.0f, "Chance (1=100%) for crop grow to be stunned.");
        luredValueSeven = cfg.getInt("Phase 7 Lure Block Cooldown Value", EVOLUTION_CATEGORY7, luredValueSeven, 0, 0x7FFFFFF8, "Cooldown added ot the parasites when using a Lure Block.");
        luredValueSevenCool = cfg.getInt("Phase 7 Carcass Value", EVOLUTION_CATEGORY7, luredValueSevenCool, 0, 0x7FFFFFF8, "Number of Points the parasites will lose when using a Carcass");
        phaseWarningSeven = cfg.getString("Phase 7 Warning Message", EVOLUTION_CATEGORY7, phaseWarningSeven, "Message sent to all players in the current world when parasites reach this Phase");
        sleepPenaltySeven = cfg.getInt("Phase 7 Sleep Penalty", EVOLUTION_CATEGORY7, sleepPenaltySeven, 0, 0x7FFFFFF8, "Number of Points gained when skipping the night.");
        phaseScentBonusSeven = cfg.getInt("Phase 7 Scent Death Bonus", EVOLUTION_CATEGORY7, phaseScentBonusSeven, 0, 1000, "Death bonus value used if parasite_collective_consciousness is enabled.");
        phaseScentReactionSeven = (byte)cfg.getInt("Phase 7 Scent Reaction Bonus", EVOLUTION_CATEGORY7, (int)phaseScentReactionSeven, 0, 100, "Reaction bonus value used for a scent to go active.");
        phaseDelayTicksSeven = cfg.getInt("Phase 7 Delay", EVOLUTION_CATEGORY7, phaseDelayTicksSeven, 0, 0x7FFFFFF8, "Parasites will not be able to earn points until this time (seconds) has passed.");
        phaseResidueSeven = cfg.getInt("Phase 7 Residue", EVOLUTION_CATEGORY7, phaseResidueSeven, 0, 0x7FFFFFF8, "One in X to spawn a Beckon on the Infested Block Residue (random tick).");
        phaseSpawnEntrySeven = cfg.getStringList("Phase 7 Spawn Entity List", EVOLUTION_CATEGORY7, phaseSpawnEntrySeven, "Entity List that will spawn at phase 7." + entry);
        sevenLevelDeploy = cfg.getInt("Phase 7 Lure Scent Level Desploy", EVOLUTION_CATEGORY7, sevenLevelDeploy, 1, 8, "Level that the Scent will have when it spawns from a Lure Block of this phase.");
    }

    private static void initevolution8Config(Configuration cfg) {
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is the entity, \n \"1\" is the minimum group count. \n \"3\" is the maximum group count. \n \"90\" is spawn weight. \n";
        phaseKillsEight = cfg.getInt("Phase 8 Points", EVOLUTION_CATEGORY8, phaseKillsEight, 0, 0x7FFFFFF8, "Number of Points required to reach Phase 8.");
        phaseKillCountPlusEight = cfg.getFloat("Phase 8 Killcount Plus", EVOLUTION_CATEGORY8, (float)phaseKillCountPlusEight, 0.0f, 100.0f, "Each second the killcount will go up by this amount.");
        phaseMaxParasiteIDEight = (byte)cfg.getInt("Phase 8 Maximum Parasite ID", EVOLUTION_CATEGORY8, (int)phaseMaxParasiteIDEight, 0, 100, "If a parasite ID is equal to or greater than this number, the parasite will not spawn.");
        phaseCancelParasiteIDEight = (byte)cfg.getInt("Phase 8 Minimum Parasite ID", EVOLUTION_CATEGORY8, (int)phaseCancelParasiteIDEight, 0, 100, "If a parasite ID is equal to or less than this number, the parasite will not spawn.");
        reinforcementSystemChanceEight = cfg.getFloat("Phase 8 Reinforcement System Chance", EVOLUTION_CATEGORY8, (float)reinforcementSystemChanceEight, 0.0f, 1.0f, "Chance to spawn a Beckon when a parasite is killed.");
        beckonStageIGrowPenaltyEight = cfg.getFloat("Phase 8 Nexus Stage I Grow Stunned", EVOLUTION_CATEGORY8, (float)beckonStageIGrowPenaltyEight, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SI.");
        beckonStageIIGrowPenaltyEight = cfg.getFloat("Phase 8 Nexus Stage II Grow Stunned", EVOLUTION_CATEGORY8, (float)beckonStageIIGrowPenaltyEight, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SII.");
        beckonStageIIIGrowPenaltyEight = cfg.getFloat("Phase 8 Nexus Stage III Grow Stunned", EVOLUTION_CATEGORY8, (float)beckonStageIIIGrowPenaltyEight, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SIII.");
        mobSpawningCOTHChanceEight = cfg.getFloat("Phase 8 Mob Spawn With COTH", EVOLUTION_CATEGORY8, (float)mobSpawningCOTHChanceEight, 0.0f, 1.0f, "Chance (1=100%) for an entity to spawn with COTH (amp 0).");
        cropGrowStunnedEight = cfg.getFloat("Phase 8 Crop Grow Stunned", EVOLUTION_CATEGORY8, (float)cropGrowStunnedEight, 0.0f, 1.0f, "Chance (1=100%) for crop grow to be stunned.");
        luredValueEight = cfg.getInt("Phase 8 Lure Block Cooldown Value", EVOLUTION_CATEGORY8, luredValueEight, 0, 0x7FFFFFF8, "Cooldown added ot the parasites when using a Lure Block.");
        luredValueEightCool = cfg.getInt("Phase 8 Carcass Value", EVOLUTION_CATEGORY8, luredValueEightCool, 0, 0x7FFFFFF8, "Number of Points the parasites will lose when using a Carcass");
        phaseWarningEight = cfg.getString("Phase 8 Warning Message", EVOLUTION_CATEGORY8, phaseWarningEight, "Message sent to all players in the current world when parasites reach this Phase");
        sleepPenaltyEight = cfg.getInt("Phase 8 Sleep Penalty", EVOLUTION_CATEGORY8, sleepPenaltyEight, 0, 0x7FFFFFF8, "Number of Points gained when skipping the night.");
        phaseScentBonusEight = cfg.getInt("Phase 8 Scent Death Bonus", EVOLUTION_CATEGORY8, phaseScentBonusEight, 0, 1000, "Death bonus value used if parasite_collective_consciousness is enabled.");
        phaseScentReactionEight = (byte)cfg.getInt("Phase 8 Scent Reaction Bonus", EVOLUTION_CATEGORY8, (int)phaseScentReactionEight, 0, 100, "Reaction bonus value used for a scent to go active.");
        phaseDelayTicksEight = cfg.getInt("Phase 8 Delay", EVOLUTION_CATEGORY8, phaseDelayTicksEight, 0, 0x7FFFFFF8, "Parasites will not be able to earn points until this time (seconds) has passed.");
        phaseResidueEight = cfg.getInt("Phase 8 Residue", EVOLUTION_CATEGORY8, phaseResidueEight, 0, 0x7FFFFFF8, "One in X to spawn a Beckon on the Infested Block Residue (random tick).");
        phaseSpawnEntryEight = cfg.getStringList("Phase 8 Spawn Entity List", EVOLUTION_CATEGORY8, phaseSpawnEntryEight, "Entity List that will spawn at phase 8." + entry);
        eightLevelDeploy = cfg.getInt("Phase 8 Lure Scent Level Desploy", EVOLUTION_CATEGORY8, eightLevelDeploy, 1, 8, "Level that the Scent will have when it spawns from a Lure Block of this phase.");
    }

    private static void initevolution9Config(Configuration cfg) {
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is the entity, \n \"1\" is the minimum group count. \n \"3\" is the maximum group count. \n \"90\" is spawn wnine. \n";
        phaseKillsNine = cfg.getInt("Phase 9 Points", EVOLUTION_CATEGORY9, phaseKillsNine, 0, 0x7FFFFFF8, "Number of Points required to reach Phase 9.");
        phaseKillCountPlusNine = cfg.getFloat("Phase 9 Killcount Plus", EVOLUTION_CATEGORY9, (float)phaseKillCountPlusNine, 0.0f, 100.0f, "Each second the killcount will go up by this amount.");
        phaseMaxParasiteIDNine = (byte)cfg.getInt("Phase 9 Maximum Parasite ID", EVOLUTION_CATEGORY9, (int)phaseMaxParasiteIDNine, 0, 100, "If a parasite ID is equal to or greater than this number, the parasite will not spawn.");
        phaseCancelParasiteIDNine = (byte)cfg.getInt("Phase 9 Minimum Parasite ID", EVOLUTION_CATEGORY9, (int)phaseCancelParasiteIDNine, 0, 100, "If a parasite ID is equal to or less than this number, the parasite will not spawn.");
        reinforcementSystemChanceNine = cfg.getFloat("Phase 9 Reinforcement System Chance", EVOLUTION_CATEGORY9, (float)reinforcementSystemChanceNine, 0.0f, 1.0f, "Chance to spawn a Beckon when a parasite is killed.");
        beckonStageIGrowPenaltyNine = cfg.getFloat("Phase 9 Nexus Stage I Grow Stunned", EVOLUTION_CATEGORY9, (float)beckonStageIGrowPenaltyNine, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SI.");
        beckonStageIIGrowPenaltyNine = cfg.getFloat("Phase 9 Nexus Stage II Grow Stunned", EVOLUTION_CATEGORY9, (float)beckonStageIIGrowPenaltyNine, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SII.");
        beckonStageIIIGrowPenaltyNine = cfg.getFloat("Phase 9 Nexus Stage III Grow Stunned", EVOLUTION_CATEGORY9, (float)beckonStageIIIGrowPenaltyNine, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SIII.");
        mobSpawningCOTHChanceNine = cfg.getFloat("Phase 9 Mob Spawn With COTH", EVOLUTION_CATEGORY9, (float)mobSpawningCOTHChanceNine, 0.0f, 1.0f, "Chance (1=100%) for an entity to spawn with COTH (amp 0).");
        cropGrowStunnedNine = cfg.getFloat("Phase 9 Crop Grow Stunned", EVOLUTION_CATEGORY9, (float)cropGrowStunnedNine, 0.0f, 1.0f, "Chance (1=100%) for crop grow to be stunned.");
        luredValueNine = cfg.getInt("Phase 9 Lure Block Cooldown Value", EVOLUTION_CATEGORY9, luredValueNine, 0, 0x7FFFFFF8, "Cooldown added ot the parasites when using a Lure Block.");
        luredValueNineCool = cfg.getInt("Phase 9 Carcass Value", EVOLUTION_CATEGORY9, luredValueNineCool, 0, 0x7FFFFFF8, "Number of Points the parasites will lose when using a Carcass");
        phaseWarningNine = cfg.getString("Phase 9 Warning Message", EVOLUTION_CATEGORY9, phaseWarningNine, "Message sent to all players in the current world when parasites reach this Phase");
        sleepPenaltyNine = cfg.getInt("Phase 9 Sleep Penalty", EVOLUTION_CATEGORY9, sleepPenaltyNine, 0, 0x7FFFFFF8, "Number of Points gained when skipping the night.");
        phaseScentBonusNine = cfg.getInt("Phase 9 Scent Death Bonus", EVOLUTION_CATEGORY9, phaseScentBonusNine, 0, 1000, "Death bonus value used if parasite_collective_consciousness is enabled.");
        phaseScentReactionNine = (byte)cfg.getInt("Phase 9 Scent Reaction Bonus", EVOLUTION_CATEGORY9, (int)phaseScentReactionNine, 0, 100, "Reaction bonus value used for a scent to go active.");
        phaseDelayTicksNine = cfg.getInt("Phase 9 Delay", EVOLUTION_CATEGORY9, phaseDelayTicksNine, 0, 0x7FFFFFF8, "Parasites will not be able to earn points until this time (seconds) has passed.");
        phaseResidueNine = cfg.getInt("Phase 9 Residue", EVOLUTION_CATEGORY9, phaseResidueNine, 0, 0x7FFFFFF8, "One in X to spawn a Beckon on the Infested Block Residue (random tick).");
        phaseSpawnEntryNine = cfg.getStringList("Phase 9 Spawn Entity List", EVOLUTION_CATEGORY9, phaseSpawnEntryNine, "Entity List that will spawn at phase 8." + entry);
        nineLevelDeploy = cfg.getInt("Phase 9 Lure Scent Level Desploy", EVOLUTION_CATEGORY9, nineLevelDeploy, 1, 8, "Level that the Scent will have when it spawns from a Lure Block of this phase.");
    }

    private static void initevolution10Config(Configuration cfg) {
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is the entity, \n \"1\" is the minimum group count. \n \"3\" is the maximum group count. \n \"90\" is spawn wten. \n";
        phaseKillsTen = cfg.getInt("Phase 10 Points", EVOLUTION_CATEGORY10, phaseKillsTen, 0, 0x7FFFFFF8, "Number of Points required to reach Phase 10.");
        phaseKillCountPlusTen = cfg.getFloat("Phase 10 Killcount Plus", EVOLUTION_CATEGORY10, (float)phaseKillCountPlusTen, 0.0f, 100.0f, "Each second the killcount will go up by this amount.");
        phaseMaxParasiteIDTen = (byte)cfg.getInt("Phase 10 Maximum Parasite ID", EVOLUTION_CATEGORY10, (int)phaseMaxParasiteIDTen, 0, 100, "If a parasite ID is equal to or greater than this number, the parasite will not spawn.");
        phaseCancelParasiteIDTen = (byte)cfg.getInt("Phase 10 Minimum Parasite ID", EVOLUTION_CATEGORY10, (int)phaseCancelParasiteIDTen, 0, 100, "If a parasite ID is equal to or less than this number, the parasite will not spawn.");
        reinforcementSystemChanceTen = cfg.getFloat("Phase 10 Reinforcement System Chance", EVOLUTION_CATEGORY10, (float)reinforcementSystemChanceTen, 0.0f, 1.0f, "Chance to spawn a Beckon when a parasite is killed.");
        beckonStageIGrowPenaltyTen = cfg.getFloat("Phase 10 Nexus Stage I Grow Stunned", EVOLUTION_CATEGORY10, (float)beckonStageIGrowPenaltyTen, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SI.");
        beckonStageIIGrowPenaltyTen = cfg.getFloat("Phase 10 Nexus Stage II Grow Stunned", EVOLUTION_CATEGORY10, (float)beckonStageIIGrowPenaltyTen, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SII.");
        beckonStageIIIGrowPenaltyTen = cfg.getFloat("Phase 10 Nexus Stage III Grow Stunned", EVOLUTION_CATEGORY10, (float)beckonStageIIIGrowPenaltyTen, 0.0f, 1.0f, "Chance (1=100%) to failed to grow for Nexus SIII.");
        mobSpawningCOTHChanceTen = cfg.getFloat("Phase 10 Mob Spawn With COTH", EVOLUTION_CATEGORY10, (float)mobSpawningCOTHChanceTen, 0.0f, 1.0f, "Chance (1=100%) for an entity to spawn with COTH (amp 0).");
        cropGrowStunnedTen = cfg.getFloat("Phase 10 Crop Grow Stunned", EVOLUTION_CATEGORY10, (float)cropGrowStunnedTen, 0.0f, 1.0f, "Chance (1=100%) for crop grow to be stunned.");
        luredValueTen = cfg.getInt("Phase 10 Lure Block Cooldown Value", EVOLUTION_CATEGORY10, luredValueTen, 0, 0x7FFFFFF8, "Cooldown added ot the parasites when using a Lure Block.");
        luredValueTenCool = cfg.getInt("Phase 10 Carcass Value", EVOLUTION_CATEGORY10, luredValueTenCool, 0, 0x7FFFFFF8, "Number of Points the parasites will lose when using a Carcass");
        phaseWarningTen = cfg.getString("Phase 10 Warning Message", EVOLUTION_CATEGORY10, phaseWarningTen, "Message sent to all players in the current world when parasites reach this Phase");
        sleepPenaltyTen = cfg.getInt("Phase 10 Sleep Penalty", EVOLUTION_CATEGORY10, sleepPenaltyTen, 0, 0x7FFFFFF8, "Number of Points gained when skipping the night.");
        phaseScentBonusTen = cfg.getInt("Phase 10 Scent Death Bonus", EVOLUTION_CATEGORY10, phaseScentBonusTen, 0, 1000, "Death bonus value used if parasite_collective_consciousness is enabled.");
        phaseScentReactionTen = (byte)cfg.getInt("Phase 10 Scent Reaction Bonus", EVOLUTION_CATEGORY10, (int)phaseScentReactionTen, 0, 100, "Reaction bonus value used for a scent to go active.");
        phaseDelayTicksTen = cfg.getInt("Phase 10 Delay", EVOLUTION_CATEGORY10, phaseDelayTicksTen, 0, 0x7FFFFFF8, "Parasites will not be able to earn points until this time (seconds) has passed.");
        phaseResidueTen = cfg.getInt("Phase 10 Residue", EVOLUTION_CATEGORY10, phaseResidueTen, 0, 0x7FFFFFF8, "One in X to spawn a Beckon on the Infested Block Residue (random tick).");
        phaseSpawnEntryTen = cfg.getStringList("Phase 10 Spawn Entity List", EVOLUTION_CATEGORY10, phaseSpawnEntryTen, "Entity List that will spawn at phase 8." + entry);
        tenLevelDeploy = cfg.getInt("Phase 10 Lure Scent Level Desploy", EVOLUTION_CATEGORY10, tenLevelDeploy, 1, 8, "Level that the Scent will have when it spawns from a Lure Block of this phase.");
        phaseTenTotalPoints = cfg.getInt("Phase 10 Total Points", EVOLUTION_CATEGORY10, phaseTenTotalPoints, 0, 0x7FFFFFF8, "Parasites can't earn more points than this.");
    }

    private static void inithivemindConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(HIVEMIND_CATEGORY, "Uwu");
        useOneMind = cfg.getBoolean("Collective Consciousness", HIVEMIND_CATEGORY, useOneMind, "Set to false if you want to disable CC");
        oneMinRangeCap = cfg.getInt("Follow Range Cap", HIVEMIND_CATEGORY, oneMinRangeCap, 0, 100, ".");
        oneMindPlayer = cfg.getBoolean("CC Player Only", HIVEMIND_CATEGORY, oneMindPlayer, "Set to true for CC to only work for players.");
        deleteifnoCC = cfg.getBoolean("CC Phase Locked", HIVEMIND_CATEGORY, deleteifnoCC, "Set to true for scents to be deleted if the phase is below CC required phase.");
        oneMindDebug = cfg.getBoolean("Scent Debug", HIVEMIND_CATEGORY, oneMindDebug, "Set to true if you want to see Scent entities");
        useScent = cfg.getBoolean("Scent", HIVEMIND_CATEGORY, useScent, "Set to false if you dont want Scent to spawn in your world");
        scentPlayer = cfg.getBoolean("Scent Player", HIVEMIND_CATEGORY, scentPlayer, "Set to true if you want Scent to be activated only by Players");
        scentDeathSpawning = cfg.getFloat("Scent Spawn Death Parasite Chance", HIVEMIND_CATEGORY, (float)scentDeathSpawning, 0.0f, 1.0f, "Chance to spawn a Scent when a parasite is killed.");
        scentCap = cfg.getInt("Scent Cap", HIVEMIND_CATEGORY, scentCap, 1, 100, "Maximum number that can spawn in the world.");
        scentGoActive = (byte)cfg.getInt("Scent Death Point", HIVEMIND_CATEGORY, (int)scentGoActive, 0, 10000000, "(This list is ignored if Evolution Phases are enabled, it has its own option).");
        scentSpawnWaves = cfg.getInt("Scent Wave Point", HIVEMIND_CATEGORY, scentSpawnWaves, 0, 10000000, ".");
        scentMiniDis = cfg.getInt("Scent Wave Minimum Distance", HIVEMIND_CATEGORY, scentMiniDis, 0, 10000000, ".");
        scentMaxDis = cfg.getInt("Scent Wave Maximum Distance", HIVEMIND_CATEGORY, scentMaxDis, 0, 10000000, ".");
        scentLifeDeath = cfg.getInt("Scent Added Lifespan With Death", HIVEMIND_CATEGORY, scentLifeDeath, 0, 10000000, "seconds.");
        scentLifeObserver = cfg.getInt("Scent Observer Mode LifeSpan", HIVEMIND_CATEGORY, scentLifeObserver, 0, 10000000, "seconds.");
        scentLifeTactical = cfg.getInt("Scent Tactical Mode Lifespan", HIVEMIND_CATEGORY, scentLifeTactical, 0, 10000000, "seconds.");
        scentSpacing = cfg.getInt("Minimum Space Between Scents", HIVEMIND_CATEGORY, scentSpacing, 0, 10000000, "Minimum distance the scent has to be from other scents. If a scent is within this distance from another scent, the newly-created (or loaded) scent will be deleted.");
        minAttriHealth = cfg.getFloat("Scent Condition Minimum Health", HIVEMIND_CATEGORY, (float)minAttriHealth, 0.0f, 1000000.0f, "Minimum heatlh value that a mob must have for the scent to attack it.");
        minAttriArmor = cfg.getFloat("Scent Condition Minimum Armor", HIVEMIND_CATEGORY, (float)minAttriArmor, 0.0f, 1000000.0f, "Minimum armor value that a mob must have for the scent to attack it.");
        minAttriDamage = cfg.getFloat("Scent Condition Minimum Damage", HIVEMIND_CATEGORY, (float)minAttriDamage, 0.0f, 1000000.0f, "Minimum damage value that a mob must have for the scent to attack it.");
        minAttriFailCount = cfg.getInt("Scent Condition Number", HIVEMIND_CATEGORY, minAttriFailCount, 0, 3, "Number of conditions to be met for the Scent to attack a mob, set it to 0 to ignore them.");
    }

    private static void inithivemindscentlvl0Config(Configuration cfg) {
        scentLevelZero = cfg.getStringList("Scent Level 0 Mob Table", HIVEMIND_CATEGORY0, scentLevelZero, "Mobs the Scent will spawn at level 0");
        scentWaveMinimumZero = cfg.getInt("Scent Level 0 Minimum Wave Number", HIVEMIND_CATEGORY0, scentWaveMinimumZero, 0, 100, ".");
        scentWaveMaximumZero = cfg.getInt("Scent Level 0 Maximum Wave Number", HIVEMIND_CATEGORY0, scentWaveMaximumZero, 0, 100, ".");
        scentWaveMinMobWaveZero = cfg.getInt("Scent Level 0 Minimum Mob Wave Number", HIVEMIND_CATEGORY0, scentWaveMinMobWaveZero, 0, 100, ".");
        scentWaveMaxMobWaveZero = cfg.getInt("Scent Level 0 Maximum Mob Wave Number", HIVEMIND_CATEGORY0, scentWaveMaxMobWaveZero, 0, 100, ".");
    }

    private static void inithivemindscentlvl1Config(Configuration cfg) {
        scentLevelOne = cfg.getStringList("Scent Level 1 Mob Table", HIVEMIND_CATEGORY1, scentLevelOne, "Mobs the Scent will spawn at level 0");
        scentWaveMinimumOne = cfg.getInt("Scent Level 1 Minimum Wave Number", HIVEMIND_CATEGORY1, scentWaveMinimumOne, 0, 100, ".");
        scentWaveMaximumOne = cfg.getInt("Scent Level 1 Maximum Wave Number", HIVEMIND_CATEGORY1, scentWaveMaximumOne, 0, 100, ".");
        scentWaveMinMobWaveOne = cfg.getInt("Scent Level 1 Minimum Mob Wave Number", HIVEMIND_CATEGORY1, scentWaveMinMobWaveOne, 0, 100, ".");
        scentWaveMaxMobWaveOne = cfg.getInt("Scent Level 1 Maximum Mob Wave Number", HIVEMIND_CATEGORY1, scentWaveMaxMobWaveOne, 0, 100, ".");
        scentLevelPointsOne = cfg.getInt("Scent Level 1 Points Required", HIVEMIND_CATEGORY1, scentLevelPointsOne, 0, 1000000, ".");
    }

    private static void inithivemindscentlvl2Config(Configuration cfg) {
        scentLevelTwo = cfg.getStringList("Scent Level 2 Mob Table", HIVEMIND_CATEGORY2, scentLevelTwo, "Mobs the Scent will spawn at level 0");
        scentWaveMinimumTwo = cfg.getInt("Scent Level 2 Minimum Wave Number", HIVEMIND_CATEGORY2, scentWaveMinimumTwo, 0, 100, ".");
        scentWaveMaximumTwo = cfg.getInt("Scent Level 2 Maximum Wave Number", HIVEMIND_CATEGORY2, scentWaveMaximumTwo, 0, 100, ".");
        scentWaveMinMobWaveTwo = cfg.getInt("Scent Level 2 Minimum Mob Wave Number", HIVEMIND_CATEGORY2, scentWaveMinMobWaveTwo, 0, 100, ".");
        scentWaveMaxMobWaveTwo = cfg.getInt("Scent Level 2 Maximum Mob Wave Number", HIVEMIND_CATEGORY2, scentWaveMaxMobWaveTwo, 0, 100, ".");
        scentLevelPointsTwo = cfg.getInt("Scent Level 2 Points Required", HIVEMIND_CATEGORY2, scentLevelPointsTwo, 0, 1000000, ".");
    }

    private static void inithivemindscentlvl3Config(Configuration cfg) {
        scentLevelThree = cfg.getStringList("Scent Level 3 Mob Table", HIVEMIND_CATEGORY3, scentLevelThree, "Mobs the Scent will spawn at level 0");
        scentWaveMinimumThree = cfg.getInt("Scent Level 3 Minimum Wave Number", HIVEMIND_CATEGORY3, scentWaveMinimumThree, 0, 100, ".");
        scentWaveMaximumThree = cfg.getInt("Scent Level 3 Maximum Wave Number", HIVEMIND_CATEGORY3, scentWaveMaximumThree, 0, 100, ".");
        scentWaveMinMobWaveThree = cfg.getInt("Scent Level 3 Minimum Mob Wave Number", HIVEMIND_CATEGORY3, scentWaveMinMobWaveThree, 0, 100, ".");
        scentWaveMaxMobWaveThree = cfg.getInt("Scent Level 3 Maximum Mob Wave Number", HIVEMIND_CATEGORY3, scentWaveMaxMobWaveThree, 0, 100, ".");
        scentLevelPointsThree = cfg.getInt("Scent Level 3 Points Required", HIVEMIND_CATEGORY3, scentLevelPointsThree, 0, 1000000, ".");
    }

    private static void inithivemindscentlvl4Config(Configuration cfg) {
        scentLevelFour = cfg.getStringList("Scent Level 4 Mob Table", HIVEMIND_CATEGORY4, scentLevelFour, "Mobs the Scent will spawn at level 0");
        scentWaveMinimumFour = cfg.getInt("Scent Level 4 Minimum Wave Number", HIVEMIND_CATEGORY4, scentWaveMinimumFour, 0, 100, ".");
        scentWaveMaximumFour = cfg.getInt("Scent Level 4 Maximum Wave Number", HIVEMIND_CATEGORY4, scentWaveMaximumFour, 0, 100, ".");
        scentWaveMinMobWaveFour = cfg.getInt("Scent Level 4 Minimum Mob Wave Number", HIVEMIND_CATEGORY4, scentWaveMinMobWaveFour, 0, 100, ".");
        scentWaveMaxMobWaveFour = cfg.getInt("Scent Level 4 Maximum Mob Wave Number", HIVEMIND_CATEGORY4, scentWaveMaxMobWaveFour, 0, 100, ".");
        scentLevelPointsFour = cfg.getInt("Scent Level 4 Points Required", HIVEMIND_CATEGORY4, scentLevelPointsFour, 0, 1000000, ".");
    }

    private static void inithivemindscentlvl5Config(Configuration cfg) {
        scentLevelFive = cfg.getStringList("Scent Level 5 Mob Table", HIVEMIND_CATEGORY5, scentLevelFive, "Mobs the Scent will spawn at level 0");
        scentWaveMinimumFive = cfg.getInt("Scent Level 5 Minimum Wave Number", HIVEMIND_CATEGORY5, scentWaveMinimumFive, 0, 100, ".");
        scentWaveMaximumFive = cfg.getInt("Scent Level 5 Maximum Wave Number", HIVEMIND_CATEGORY5, scentWaveMaximumFive, 0, 100, ".");
        scentWaveMinMobWaveFive = cfg.getInt("Scent Level 5 Minimum Mob Wave Number", HIVEMIND_CATEGORY5, scentWaveMinMobWaveFive, 0, 100, ".");
        scentWaveMaxMobWaveFive = cfg.getInt("Scent Level 5 Maximum Mob Wave Number", HIVEMIND_CATEGORY5, scentWaveMaxMobWaveFive, 0, 100, ".");
        scentLevelPointsFive = cfg.getInt("Scent Level 5 Points Required", HIVEMIND_CATEGORY5, scentLevelPointsFive, 0, 1000000, ".");
    }

    private static void inithivemindscentlvl6Config(Configuration cfg) {
        scentLevelSix = cfg.getStringList("Scent Level 6 Mob Table", HIVEMIND_CATEGORY6, scentLevelSix, "Mobs the Scent will spawn at level 0");
        scentWaveMinimumSix = cfg.getInt("Scent Level 6 Minimum Wave Number", HIVEMIND_CATEGORY6, scentWaveMinimumSix, 0, 100, ".");
        scentWaveMaximumSix = cfg.getInt("Scent Level 6 Maximum Wave Number", HIVEMIND_CATEGORY6, scentWaveMaximumSix, 0, 100, ".");
        scentWaveMinMobWaveSix = cfg.getInt("Scent Level 6 Minimum Mob Wave Number", HIVEMIND_CATEGORY6, scentWaveMinMobWaveSix, 0, 100, ".");
        scentWaveMaxMobWaveSix = cfg.getInt("Scent Level 6 Maximum Mob Wave Number", HIVEMIND_CATEGORY6, scentWaveMaxMobWaveSix, 0, 100, ".");
        scentLevelPointsSix = cfg.getInt("Scent Level 6 Points Required", HIVEMIND_CATEGORY6, scentLevelPointsSix, 0, 1000000, ".");
    }

    private static void inithivemindscentlvl7Config(Configuration cfg) {
        scentLevelSeven = cfg.getStringList("Scent Level 7 Mob Table", HIVEMIND_CATEGORY7, scentLevelSeven, "Mobs the Scent will spawn at level 0");
        scentWaveMinimumSeven = cfg.getInt("Scent Level 7 Minimum Wave Number", HIVEMIND_CATEGORY7, scentWaveMinimumSeven, 0, 100, ".");
        scentWaveMaximumSeven = cfg.getInt("Scent Level 7 Maximum Wave Number", HIVEMIND_CATEGORY7, scentWaveMaximumSeven, 0, 100, ".");
        scentWaveMinMobWaveSeven = cfg.getInt("Scent Level 7 Minimum Mob Wave Number", HIVEMIND_CATEGORY7, scentWaveMinMobWaveSeven, 0, 100, ".");
        scentWaveMaxMobWaveSeven = cfg.getInt("Scent Level 7 Maximum Mob Wave Number", HIVEMIND_CATEGORY7, scentWaveMaxMobWaveSeven, 0, 100, ".");
        scentLevelPointsSeven = cfg.getInt("Scent Level 7 Points Required", HIVEMIND_CATEGORY7, scentLevelPointsSeven, 0, 1000000, ".");
    }

    private static void inithivemindscentlvl8Config(Configuration cfg) {
        scentLevelEight = cfg.getStringList("Scent Level 8 Mob Table", HIVEMIND_CATEGORY8, scentLevelEight, "Mobs the Scent will spawn at level 0");
        scentWaveMinimumEight = cfg.getInt("Scent Level 8 Minimum Wave Number", HIVEMIND_CATEGORY8, scentWaveMinimumEight, 0, 100, ".");
        scentWaveMaximumEight = cfg.getInt("Scent Level 8 Maximum Wave Number", HIVEMIND_CATEGORY8, scentWaveMaximumEight, 0, 100, ".");
        scentWaveMinMobWaveEight = cfg.getInt("Scent Level 8 Minimum Mob Wave Number", HIVEMIND_CATEGORY8, scentWaveMinMobWaveEight, 0, 100, ".");
        scentWaveMaxMobWaveEight = cfg.getInt("Scent Level 8 Maximum Mob Wave Number", HIVEMIND_CATEGORY8, scentWaveMaxMobWaveEight, 0, 100, ".");
        scentLevelPointsEight = cfg.getInt("Scent Level 8 Points Required", HIVEMIND_CATEGORY8, scentLevelPointsEight, 0, 1000000, ".");
    }

    private static void inittotaldevelopmentConfig(Configuration cfg) {
    }

    public static void initConfig(FMLPreInitializationEvent e) {
        File directory = e.getModConfigurationDirectory();
        CommonProxy.configSistems = new Configuration(new File(directory.getPath(), "srparasites/SRParasitesSystems.cfg"));
        SRPConfigSystems.readConfig();
    }

    public static boolean readConfig() {
        Configuration cfgS = CommonProxy.configSistems;
        try {
            cfgS.load();
            SRPConfigSystems.initstatuseffectsConfig(cfgS);
            SRPConfigSystems.initGeneralSistemsConfig(cfgS);
            SRPConfigSystems.initmergeConfig(cfgS);
            SRPConfigSystems.initevolutionConfig(cfgS);
            SRPConfigSystems.initevolution0Config(cfgS);
            SRPConfigSystems.initevolution1Config(cfgS);
            SRPConfigSystems.initevolution2Config(cfgS);
            SRPConfigSystems.initevolution3Config(cfgS);
            SRPConfigSystems.initevolution4Config(cfgS);
            SRPConfigSystems.initevolution5Config(cfgS);
            SRPConfigSystems.initevolution6Config(cfgS);
            SRPConfigSystems.initevolution7Config(cfgS);
            SRPConfigSystems.initevolution8Config(cfgS);
            SRPConfigSystems.initevolution9Config(cfgS);
            SRPConfigSystems.initevolution10Config(cfgS);
            SRPConfigSystems.initreinforcementSystemConfig(cfgS);
            SRPConfigSystems.inithivemindConfig(cfgS);
            SRPConfigSystems.inithivemindscentlvl0Config(cfgS);
            SRPConfigSystems.inithivemindscentlvl1Config(cfgS);
            SRPConfigSystems.inithivemindscentlvl2Config(cfgS);
            SRPConfigSystems.inithivemindscentlvl3Config(cfgS);
            SRPConfigSystems.inithivemindscentlvl4Config(cfgS);
            SRPConfigSystems.inithivemindscentlvl5Config(cfgS);
            SRPConfigSystems.inithivemindscentlvl6Config(cfgS);
            SRPConfigSystems.inithivemindscentlvl7Config(cfgS);
            SRPConfigSystems.inithivemindscentlvl8Config(cfgS);
            boolean bl = true;
            return bl;
        }
        catch (Exception e) {
            SRPMain.logger.log(Level.ERROR, "Problem loading configuration file", (Throwable)e);
        }
        finally {
            if (cfgS.hasChanged()) {
                cfgS.save();
            }
        }
        return false;
    }
}

