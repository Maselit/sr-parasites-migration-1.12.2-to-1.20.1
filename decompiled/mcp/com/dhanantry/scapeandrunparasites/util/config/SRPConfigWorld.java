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

public class SRPConfigWorld {
    private static final String CATEGORY_GENERAL_WORLD = "configuration_world";
    private static final String WORLDBIOME_CATEGORY = "world_biome";
    public static int biomeweight = 0;
    public static boolean biomeRegster = true;
    public static boolean nodesActivated = true;
    public static int maximumNumberNodes = 20;
    public static int minimumDistanceBetweenNodes = 10000;
    public static int minimumDistanceFromSpawnPoint = 1;
    public static int[] blackListedDimensionsNodes = new int[]{0, 1, -1};
    public static String[] blockBBiomeList = new String[0];
    public static boolean blockBBiomeListWhite = false;
    public static float biomeBlockIMaxH = 60.0f;
    public static String nodeWarning = "Node";
    public static boolean venkrolNode = true;
    public static int biomeSkyColor = 0x2F0000;
    public static int biomeGrassColor = 0xA60000;
    public static int biomeFoliageColor = 0xA60000;
    public static int biomeWaterColor = 0xA60000;
    public static float biomeFogDensity = 0.06f;
    public static float biomeFogRed = 38.0f;
    public static float biomeFogBlue = 36.0f;
    public static float biomeFogGreen = 36.0f;
    public static float biomeHealPenalty = 0.5f;
    public static String[] biomeHealPenaltyBlackList = new String[]{"minecraft:villager_golem"};
    public static boolean biomeHealPenaltyBlackListWhite = false;
    public static double biomeTree = 0.0015;
    public static double biomeFlower = 0.001;
    public static double biomeSpine = 5.0E-4;
    public static double biomeTenflower = 1.0E-4;
    public static double biomeBall = 7.0E-5;
    public static double biomeBigBall = 2.0E-5;
    public static double biomeMouth = 3.0E-4;
    public static int biomeHeartFreq = 30;
    public static float biomeHeartVol = 0.4f;
    public static String[] biomeSpawnEntry = new String[]{"srparasites:ada_summoner;1;1;10;0", "srparasites:ada_longarms;1;1;10;0", "srparasites:ada_reeker;1;1;10;0", "srparasites:ada_manducater;1;1;10;0", "srparasites:ada_bolster;1;1;10;0", "srparasites:ada_yelloweye;1;1;10;0", "srparasites:ada_arachnida;1;1;10;0", "srparasites:overseer;2;4;5;0", "srparasites:vigilante;1;3;5;0", "srparasites:warden;1;1;5;0", "srparasites:marauder;2;3;5;0", "srparasites:bomber_light;2;5;5;0", "srparasites:monarch;2;5;5;0", "srparasites:grunt;1;1;20;0", "srparasites:bomber_heavy;1;1;5;0", "srparasites:wraith;2;2;5;0", "srparasites:bogle;1;1;5;0", "srparasites:haunter;1;1;5;0", "srparasites:carrier_colony;1;1;5;0", "srparasites:worker;1;1;10;0"};
    public static String[] biomeBlackList = new String[0];
    public static boolean biomeBlackListInverted = false;
    public static String[] potionEffectForNodes = new String[]{"3;minecraft:speed;2", "4;minecraft:fire_resistance;1", "7;minecraft:invisibility;1"};
    public static int nodeRangeSpreadOne = 200;
    public static int nodeRangeSpreadTwo = 800;
    public static int nodeRangeSpreadThree = 4000;
    public static int nodeRangeEffectsOne = 400;
    public static int nodeRangeEffectsTwo = 1600;
    public static int nodeRangeEffectsThree = 8000;
    public static float nodeCropStopNodeOne = 0.3f;
    public static float nodeCropStopNodeTwo = 0.6f;
    public static float nodeCropStopNodeThree = 1.0f;
    public static int timeNeedeToNodeOne = 8;
    public static int timeNeedeToNodeTwo = 10;
    public static int timeNeedeToNodeThree = 40;
    private static final String WORLDCOLONY_CATEGORY = "world_colony";
    public static boolean coloniesActivated = false;
    public static int maximumNumberColonies = 20;
    public static int minimumDistanceBetweenColonies = 2000;
    public static int[] blackListedDimensionsColonies = new int[]{0, 1, -1};
    public static int colonySpreadPoint = 2;
    public static int colonySpreadValue = 20;
    public static int colonyBaseRadiusValue = 60;
    public static int colonySpreadEffectPoint = 1;
    public static int colonySpreadEffectValue = 40;
    public static int colonyBaseEffectRadiusValue = 120;
    public static int colonyPointCap = 100;
    public static int colonyTotalPointCap = 100;
    public static String colonyWarning = "Colony";
    public static int colonyOutpostDistance = 2000;
    public static float colonyExtraHealthPoint = 20.0f;
    public static float colonyExtraHealthValue = 0.1f;
    public static float colonyExtraArmorPoint = 20.0f;
    public static float colonyExtraArmorValue = 0.1f;
    public static float colonyExtraKDResPoint = 20.0f;
    public static float colonyExtraKDResValue = 0.1f;
    public static float colonyExtraDamagePoint = 20.0f;
    public static float colonyExtraDamageValue = 0.1f;
    public static float colonyDamageCapPoint = 15.0f;
    public static float colonyDamageCapValue = 0.5f;
    public static float colonyPointReductionPoint = 10.0f;
    public static float colonyPointReductionValue = 0.05f;
    public static float colonyPointBoostPoint = 10.0f;
    public static float colonyPointBoostValue = 0.05f;
    public static float colonyExtraRSChancePoint = 20.0f;
    public static float colonyExtraRSChanceValue = 1.0f;
    public static boolean dodColony = true;
    public static String[] preeValues = new String[]{"65;1", "85;1", "86;1", "87;1", "88;1", "89;1"};
    public static boolean preeValuesBiome = false;

    private static void initGeneralWorldConfig(Configuration cfg) {
        String u = "";
        cfg.addCustomCategoryComment(CATEGORY_GENERAL_WORLD, "World configuration \nVersion:1.9.21\n \nBlocks IDs \n \n \n \n \n \n \n \n \n ");
    }

    private static void initworldbiomeConfig(Configuration cfg) {
        String description = " \n A Node is created when an infested area has been laying around for some time, a node\n will change the biome and will have bonuses to the parasites.";
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is for the entity, \n \"1\" is the minimum group count. \n \"3\" is the maximum group count. \n \"90\" is spawn weight. \n \"0\" is the type (0 for entityType.MONSTER, 1 for entityType.CREATURE). \n";
        String entry2 = " Ex. \"2;minecraft:speed;3\"  Where: \n \"2\" is the required total of node levels, \n \"minecraft:speed\" is the potion itself (the potion will apply regardless of whether the parasite is near a node or not), \n \"3\" is the amplifier of the effect ";
        cfg.addCustomCategoryComment(WORLDBIOME_CATEGORY, "World Biome" + description);
        biomeRegster = cfg.getBoolean("Biome Acivated", WORLDBIOME_CATEGORY, biomeRegster, "Set to false if you dont want to register the biome into your game (Needed for this category to work).");
        nodesActivated = cfg.getBoolean("Creation of Nodes", WORLDBIOME_CATEGORY, nodesActivated, "Set to false if you dont want Nodes to be created in your world.");
        maximumNumberNodes = cfg.getInt("Maximum Node Number", WORLDBIOME_CATEGORY, maximumNumberNodes, 1, 100, "Maximum number of nodes in a world.");
        minimumDistanceBetweenNodes = cfg.getInt("Minimum Distance Between Nodes", WORLDBIOME_CATEGORY, minimumDistanceBetweenNodes, 0, 100000000, "Minimum distance that one node needs to be away from the other to appear.");
        minimumDistanceFromSpawnPoint = cfg.getInt("Minimum Distance From SpawnPoint", WORLDBIOME_CATEGORY, minimumDistanceFromSpawnPoint, 0, 100000000, "Minimum distance one node needs to be away from SpawnPoint to appear.");
        blackListedDimensionsNodes = cfg.get(WORLDBIOME_CATEGORY, "WhiteList Dimensions", blackListedDimensionsNodes, "Nodes can only be made in these dimensions").getIntList();
        blockBBiomeList = cfg.getStringList("Biome Blocks BlackList", WORLDBIOME_CATEGORY, blockBBiomeList, "List of block that can't be infested, Ex: \"minecraft:stonebrick\" or just \"minecraft\" for a whole mod");
        blockBBiomeListWhite = cfg.getBoolean("Biome Blocks BlackList Inverted", WORLDBIOME_CATEGORY, blockBBiomeListWhite, "Set to true if you want to use the list as a WhiteList.");
        biomeBlockIMaxH = cfg.getFloat("Biome Hardness", WORLDBIOME_CATEGORY, biomeBlockIMaxH, 0.01f, 100.0f, "Max Hardness of the block it can spread into.");
        nodeWarning = cfg.getString("Node Warning Message", WORLDBIOME_CATEGORY, nodeWarning, "Message sent to all players in the current world when a Node is placed");
        biomeSkyColor = cfg.getInt("Biome Color Sky", WORLDBIOME_CATEGORY, biomeSkyColor, 0, 0x7FFFFFF8, "Decimal color code for the Sky of the Biome.");
        biomeGrassColor = cfg.getInt("Biome Color Grass", WORLDBIOME_CATEGORY, biomeGrassColor, 0, 0x7FFFFFF8, "Decimal color code for the Grass of the Biome.");
        biomeFoliageColor = cfg.getInt("Biome Color Foliage", WORLDBIOME_CATEGORY, biomeFoliageColor, 0, 0x7FFFFFF8, "Decimal color code for the Foliage of the Biome.");
        biomeWaterColor = cfg.getInt("Biome Color Water", WORLDBIOME_CATEGORY, biomeWaterColor, 0, 0x7FFFFFF8, "Decimal color code for the Water of the Biome.");
        biomeFogDensity = cfg.getFloat("Biome Fog Density", WORLDBIOME_CATEGORY, biomeFogDensity, 0.0f, 1.0f, "Amount of fog the biome will have.");
        biomeFogRed = cfg.getFloat("Biome Fog Color Red Value", WORLDBIOME_CATEGORY, biomeFogRed, 0.0f, 255.0f, "Red color value for the fog of the Biome.");
        biomeFogGreen = cfg.getFloat("Biome Fog Color Green Value", WORLDBIOME_CATEGORY, biomeFogGreen, 0.0f, 255.0f, "Green color value for the fog of the Biome.");
        biomeFogBlue = cfg.getFloat("Biome Fog Color Blue Value", WORLDBIOME_CATEGORY, biomeFogBlue, 0.0f, 255.0f, "Blue color value for the fog of the Biome.");
        biomeSpawnEntry = cfg.getStringList("Biome Spawn Entity List", WORLDBIOME_CATEGORY, biomeSpawnEntry, "Entity List that will spawn at the Biome." + entry);
        biomeHealPenalty = cfg.getFloat("Biome Heal Penalty", WORLDBIOME_CATEGORY, biomeHealPenalty, 0.0f, 1.0f, "Amount of health reduced (1=100%) for mobs and player healing in the biome.");
        biomeHealPenaltyBlackList = cfg.getStringList("Biome Heal Penalty BlackList", WORLDBIOME_CATEGORY, biomeHealPenaltyBlackList, "Mobs that are immune to this penalty. Ex: \"minecraft:zombie\" or just \"minecraft\" for a whole mod.");
        biomeHealPenaltyBlackListWhite = cfg.getBoolean("Biome Heal Penalty BlackList Inverted", WORLDBIOME_CATEGORY, biomeHealPenaltyBlackListWhite, "Set to true if you want to use the list as a WhiteList.");
        potionEffectForNodes = cfg.getStringList("Node Potion Effect List", WORLDBIOME_CATEGORY, potionEffectForNodes, "List of potion effects that the parasites will spawn with." + entry2);
        biomeweight = cfg.getInt("Biome Weight", WORLDBIOME_CATEGORY, biomeweight, 0, 10000, "Biome weight, registered as a SPOOKY type biome");
        biomeBlackList = cfg.getStringList("Biome Spread BlackList", WORLDBIOME_CATEGORY, biomeBlackList, "List of biomes that cannot be converted. Ex: minecraft:plains or just minecraft");
        biomeBlackListInverted = cfg.getBoolean("Biome Spread BlackList Inverted", WORLDBIOME_CATEGORY, biomeBlackListInverted, "\"Set to true if you want to use the list as a WhiteList.");
        biomeTree = cfg.getFloat("Biome Tree chance", WORLDBIOME_CATEGORY, (float)biomeTree, 0.0f, 1.0f, "(1 = 100%) Generation chance for tree feature.");
        biomeFlower = cfg.getFloat("Biome Flower chance", WORLDBIOME_CATEGORY, (float)biomeFlower, 0.0f, 1.0f, "(1 = 100%) Generation chance for flower feature.");
        biomeSpine = cfg.getFloat("Biome Spine chance", WORLDBIOME_CATEGORY, (float)biomeSpine, 0.0f, 1.0f, "(1 = 100%) Generation chance for spine feature.");
        biomeTenflower = cfg.getFloat("Biome Tenflower chance", WORLDBIOME_CATEGORY, (float)biomeTenflower, 0.0f, 1.0f, "(1 = 100%) Generation chance for tenflower feature.");
        biomeBall = cfg.getFloat("Biome Ball chance", WORLDBIOME_CATEGORY, (float)biomeBall, 0.0f, 1.0f, "(1 = 100%) Generation chance for ball feature.");
        biomeBigBall = cfg.getFloat("Biome Bigball chance", WORLDBIOME_CATEGORY, (float)biomeBigBall, 0.0f, 1.0f, "(1 = 100%) Generation chance for bigball feature.");
        biomeMouth = cfg.getFloat("Biome Mouth chance", WORLDBIOME_CATEGORY, (float)biomeMouth, 0.0f, 1.0f, "(1 = 100%) Generation chance for mouth feature.");
        biomeHeartVol = cfg.getFloat("Biome Node Heart Volume", WORLDBIOME_CATEGORY, biomeHeartVol, 0.0f, 1000.0f, "Volume of the Core Block Node Sound.");
        biomeHeartFreq = cfg.getInt("Biome Node Heart Frequency", WORLDBIOME_CATEGORY, biomeHeartFreq, 0, 100, "Frequency of the Core Block Node Sound.");
        venkrolNode = cfg.getBoolean("Nodes Beckons", WORLDBIOME_CATEGORY, venkrolNode, "Set to false if you dont want Colonies to be created by a Beckon SIV. (This option is ignored if Evolution Phases are enabled, it has its own option)");
        nodeRangeSpreadOne = cfg.getInt("Node 1 Spread Range", WORLDBIOME_CATEGORY, nodeRangeSpreadOne, 0, 0x7FFFFFF8, "Spread range of a Node 1.");
        nodeRangeEffectsOne = cfg.getInt("Node 1 Effect Range", WORLDBIOME_CATEGORY, nodeRangeEffectsOne, 0, 0x7FFFFFF8, "Effect range of a Node 1.");
        timeNeedeToNodeOne = cfg.getInt("Node 1 Time Needed", WORLDBIOME_CATEGORY, timeNeedeToNodeOne, 0, 0x7FFFFFF8, "Days needed from a sss to a Node 1.");
        nodeRangeSpreadTwo = cfg.getInt("Node 2 Spread Range", WORLDBIOME_CATEGORY, nodeRangeSpreadTwo, 0, 0x7FFFFFF8, "Spread range of a Node 2.");
        nodeRangeEffectsTwo = cfg.getInt("Node 2 Effect Range", WORLDBIOME_CATEGORY, nodeRangeEffectsTwo, 0, 0x7FFFFFF8, "Effect range of a Node 2.");
        timeNeedeToNodeTwo = cfg.getInt("Node 2 Time Needed", WORLDBIOME_CATEGORY, timeNeedeToNodeTwo, 0, 0x7FFFFFF8, "Days needed from a Node 1 to a Node 2.");
        nodeRangeSpreadThree = cfg.getInt("Node 3 Spread Range", WORLDBIOME_CATEGORY, nodeRangeSpreadThree, 0, 0x7FFFFFF8, "Spread range of a Node 3.");
        nodeRangeEffectsThree = cfg.getInt("Node 3 Effect Range", WORLDBIOME_CATEGORY, nodeRangeEffectsThree, 0, 0x7FFFFFF8, "Effect range of a Node 3.");
        timeNeedeToNodeThree = cfg.getInt("Node 3 Time Needed", WORLDBIOME_CATEGORY, timeNeedeToNodeThree, 0, 0x7FFFFFF8, "Days needed from a Node 2 to a Node 3.");
        nodeCropStopNodeOne = cfg.getFloat("Node 1 Crop Stop", WORLDBIOME_CATEGORY, nodeCropStopNodeOne, 0.0f, 100.0f, "Chance (1 = 100%) to stop crops/trees from growing naturally.(for a tick) for a Node 1");
        nodeCropStopNodeTwo = cfg.getFloat("Node 2 Crop Stop", WORLDBIOME_CATEGORY, nodeCropStopNodeTwo, 0.0f, 100.0f, "Chance (1 = 100%) to stop crops/trees from growing naturally.(for a tick) for a Node 2");
        nodeCropStopNodeThree = cfg.getFloat("Node 3 Crop Stop", WORLDBIOME_CATEGORY, nodeCropStopNodeThree, 0.0f, 100.0f, "Chance (1 = 100%) to stop crops/trees from growing naturally.(for a tick) for a Node 3");
    }

    private static void initworldcolonyConfig(Configuration cfg) {
        String description = " \n A Node is created when an infested area has been laying around for some time, a node\n will change the biome and will have bonuses to the parasites.";
        String entry = " Ex. \"minecraft:zombie;1;3;90;0\"  Where: \n \"minecraft:zombie\" is for the entity, \n \"1\" is for the minimum group count. \n \"3\" is for the maximum group count. \n \"90\" is for spawn weight. \n \"0\" is for the type (0 for entityType.MONSTER, 1 for entityType.CREATURE). \n";
        String valll = " Ex. \"50:1\"  Where: \n \"50\" is the parasite second id, \n \"1\" are the points required (from colonies) to spawn. \n";
        cfg.addCustomCategoryComment(WORLDCOLONY_CATEGORY, "World Colony" + description);
        coloniesActivated = cfg.getBoolean("Colonies Activated", WORLDCOLONY_CATEGORY, coloniesActivated, "Set to false if you dont want Colonies to be created in your world.");
        maximumNumberColonies = cfg.getInt("Maximum Colony Number", WORLDCOLONY_CATEGORY, maximumNumberColonies, 1, 100, "Maximum number of Colonies in a world.");
        minimumDistanceBetweenColonies = cfg.getInt("Minimum Distance Between Colonies", WORLDCOLONY_CATEGORY, minimumDistanceBetweenColonies, 0, 100000000, "Minimum distance that one Colony needs to be away from the other to appear.");
        blackListedDimensionsColonies = cfg.get(WORLDCOLONY_CATEGORY, "WhiteList Dimensions", blackListedDimensionsColonies, "Colonies can only be made in these dimensions").getIntList();
        colonyPointCap = cfg.getInt("Colonies Points Cap", WORLDCOLONY_CATEGORY, colonyPointCap, 1, 10000, "Cap of points for a single Colony.");
        colonyTotalPointCap = cfg.getInt("Colonies Total Points Cap", WORLDCOLONY_CATEGORY, colonyTotalPointCap, 1, 10000, "Total cap of points for all Colonies.");
        colonySpreadPoint = cfg.getInt("Colonies Spread Point", WORLDCOLONY_CATEGORY, colonySpreadPoint, 1, 10000, "Every x points, the colony radius will get bigger.");
        colonySpreadValue = cfg.getInt("Colonies Spread Value", WORLDCOLONY_CATEGORY, colonySpreadValue, 1, 10000, "How much the radius will grow.");
        colonyBaseRadiusValue = cfg.getInt("Colonies Base Radius Value", WORLDCOLONY_CATEGORY, colonyBaseRadiusValue, 1, 10000, "Value of the base radius of a Colony.");
        colonySpreadEffectPoint = cfg.getInt("Colonies Spread Effect Point", WORLDCOLONY_CATEGORY, colonySpreadEffectPoint, 1, 10000, "Every x points, the colony effect radius will get bigger.");
        colonySpreadEffectValue = cfg.getInt("Colonies Spread Effect Value", WORLDCOLONY_CATEGORY, colonySpreadEffectValue, 1, 10000, "How much the effect radius will grow.");
        colonyBaseEffectRadiusValue = cfg.getInt("Colonies Base Effect Radius Value", WORLDCOLONY_CATEGORY, colonyBaseEffectRadiusValue, 1, 10000, "Value of the base effect radius of a Colony.");
        colonyWarning = cfg.getString("Colonies Warning Message", WORLDCOLONY_CATEGORY, colonyWarning, "Message sent to all players in the current world when a Colony is placed");
        dodColony = cfg.getBoolean("Colonies Dispatcher", WORLDCOLONY_CATEGORY, dodColony, "Set to false if you dont want Colonies to be created by a Dispatcher SIV. (This option is ignored if Evolution Phases are enabled, it has its own option)");
        colonyOutpostDistance = cfg.getInt("Colonies Outpost Distance", WORLDCOLONY_CATEGORY, colonyOutpostDistance, 1, 10000000, "Distance from the colony to which they are going to start setting up Outposts.");
        colonyExtraHealthPoint = cfg.getFloat("Colony Bonus Health Point", WORLDCOLONY_CATEGORY, colonyExtraHealthPoint, 1.0f, 10000.0f, "Every x points, the colony will grant a bonus of health.");
        colonyExtraHealthValue = cfg.getFloat("Colony Bonus Health Value", WORLDCOLONY_CATEGORY, colonyExtraHealthValue, 0.0f, 10000.0f, "Value of the bonus.");
        colonyExtraArmorPoint = cfg.getFloat("Colony Bonus Armor Point", WORLDCOLONY_CATEGORY, colonyExtraArmorPoint, 1.0f, 10000.0f, "Every x points, the colony will grant a bonus of armor.");
        colonyExtraArmorValue = cfg.getFloat("Colony Bonus Armor Value", WORLDCOLONY_CATEGORY, colonyExtraArmorValue, 0.0f, 10000.0f, "Value of the bonus.");
        colonyExtraDamagePoint = cfg.getFloat("Colony Bonus Damage Point", WORLDCOLONY_CATEGORY, colonyExtraDamagePoint, 1.0f, 10000.0f, "Every x points, the colony will grant a bonus of damage.");
        colonyExtraDamageValue = cfg.getFloat("Colony Bonus Damage Value", WORLDCOLONY_CATEGORY, colonyExtraDamageValue, 0.0f, 10000.0f, "Value of the bonus.");
        colonyExtraKDResPoint = cfg.getFloat("Colony Bonus KDR Point", WORLDCOLONY_CATEGORY, colonyExtraKDResPoint, 1.0f, 10000.0f, "Every x points, the colony will grant a bonus of KDR.");
        colonyExtraKDResValue = cfg.getFloat("Colony Bonus KDR Value", WORLDCOLONY_CATEGORY, colonyExtraKDResValue, 0.0f, 10000.0f, "Value of the bonus.");
        colonyDamageCapPoint = cfg.getFloat("Colony Damage Cap Point", WORLDCOLONY_CATEGORY, colonyDamageCapPoint, 1.0f, 10000.0f, "Every x points, the colony will increase their damage cap.");
        colonyDamageCapValue = cfg.getFloat("Colony Damage Cap Value", WORLDCOLONY_CATEGORY, colonyDamageCapValue, 0.0f, 10000.0f, "Value (in %) of the bonus.");
        colonyPointReductionPoint = cfg.getFloat("Colony EV Reduction Point", WORLDCOLONY_CATEGORY, colonyPointReductionPoint, 1.0f, 10000.0f, "Every x points, the colony will reduce the number of points lost in the evolution phases");
        colonyPointReductionValue = cfg.getFloat("Colony EV Reduction Value", WORLDCOLONY_CATEGORY, colonyPointReductionValue, 0.0f, 1.0f, "Value (in %) of the bonus.");
        colonyPointBoostPoint = cfg.getFloat("Colony EV Boost Point", WORLDCOLONY_CATEGORY, colonyPointBoostPoint, 1.0f, 10000.0f, "Every x points, the colony will boost the number of points earned in the evolution phases");
        colonyPointBoostValue = cfg.getFloat("Colony EV Boost Value", WORLDCOLONY_CATEGORY, colonyPointBoostValue, 0.0f, 1.0f, "Value (in %) of the bonus.");
        colonyExtraRSChancePoint = cfg.getFloat("Colony RS Extra Chance Point", WORLDCOLONY_CATEGORY, colonyExtraRSChancePoint, 1.0f, 10000.0f, "Every x points, the colony will increase the RS chance to send Beckons Stage II or Stage III");
        colonyExtraRSChanceValue = cfg.getFloat("Colony RS Extra Chance Value", WORLDCOLONY_CATEGORY, colonyExtraRSChanceValue, 0.0f, 1.0f, "Value (in %) of the bonus.");
        preeValues = cfg.getStringList("Colony Parasite Values", WORLDCOLONY_CATEGORY, preeValues, "List of parasites that require Colony points to appear, parasites that are not in the list will not be affected." + valll);
        preeValuesBiome = cfg.getBoolean("Colony Parasite Values Biome", WORLDCOLONY_CATEGORY, preeValuesBiome, "Set to false if you want parasites from the list to spawn in Parasite Biomes ignoring points required");
    }

    public static void initConfig(FMLPreInitializationEvent e) {
        File directory = e.getModConfigurationDirectory();
        CommonProxy.configWorld = new Configuration(new File(directory.getPath(), "srparasites/SRParasitesWorld.cfg"));
        SRPConfigWorld.readConfig();
    }

    public static boolean readConfig() {
        Configuration cfgW = CommonProxy.configWorld;
        try {
            cfgW.load();
            SRPConfigWorld.initGeneralWorldConfig(cfgW);
            SRPConfigWorld.initworldbiomeConfig(cfgW);
            SRPConfigWorld.initworldcolonyConfig(cfgW);
            boolean bl = true;
            return bl;
        }
        catch (Exception e) {
            SRPMain.logger.log(Level.ERROR, "Problem loading configuration file", (Throwable)e);
        }
        finally {
            if (cfgW.hasChanged()) {
                cfgW.save();
            }
        }
        return false;
    }
}

