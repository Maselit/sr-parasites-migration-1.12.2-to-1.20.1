package com.dhanantry.scapeandrunparasites.init;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedBush;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteBush;
import com.dhanantry.scapeandrunparasites.world.gen.feature.*;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.registries.RegistryObject;

/**
 * Registro de las features de worldgen de SRP en el DeferredRegister SRPMain.FEATURES.
 */
public class SRPFeatures
{
    public static final RegistryObject<Feature<?>> PARASITE_BALL =
        SRPMain.FEATURES.register("parasite_ball", () -> new WorldGenParasiteBall());

    public static final RegistryObject<Feature<?>> PARASITE_BIG_BALL =
        SRPMain.FEATURES.register("parasite_big_ball", () -> new WorldGenParasiteBigBall());

    public static final RegistryObject<Feature<?>> PARASITE_BUSH =
        SRPMain.FEATURES.register("parasite_bush", () -> new WorldGenParasiteBush(BlockParasiteBush.EnumType.TENDRIL, 1));

    public static final RegistryObject<Feature<?>> INFESTED_BUSH =
        SRPMain.FEATURES.register("infested_bush", () -> new WorldGenParasiteBush(BlockInfestedBush.EnumType.INFECTED, 1));

    public static final RegistryObject<Feature<?>> PARASITE_COLONY_B1 =
        SRPMain.FEATURES.register("parasite_colony_b1", () -> new WorldGenParasiteColonyB1());

    public static final RegistryObject<Feature<?>> PARASITE_COLONY_B2 =
        SRPMain.FEATURES.register("parasite_colony_b2", () -> new WorldGenParasiteColonyB2());

    public static final RegistryObject<Feature<?>> PARASITE_COLONY_B3 =
        SRPMain.FEATURES.register("parasite_colony_b3", () -> new WorldGenParasiteColonyB3());

    public static final RegistryObject<Feature<?>> PARASITE_COLONY_BS1 =
        SRPMain.FEATURES.register("parasite_colony_bs1", () -> new WorldGenParasiteColonyBS1());

    public static final RegistryObject<Feature<?>> PARASITE_COLONY_CORE =
        SRPMain.FEATURES.register("parasite_colony_core", () -> new WorldGenParasiteColonyCore());

    public static final RegistryObject<Feature<?>> PARASITE_MOUTH =
        SRPMain.FEATURES.register("parasite_mouth", () -> new WorldGenParasiteMouth());

    public static final RegistryObject<Feature<?>> PARASITE_NODE_CORE =
        SRPMain.FEATURES.register("parasite_node_core", () -> new WorldGenParasiteNodeCore(1));

    public static final RegistryObject<Feature<?>> PARASITE_SPINE =
        SRPMain.FEATURES.register("parasite_spine", () -> new WorldGenParasiteSpine());

    public static final RegistryObject<Feature<?>> PARASITE_TALL_FLOWER =
        SRPMain.FEATURES.register("parasite_tall_flower", () -> new WorldGenParasiteTallFlower());

    public static final RegistryObject<Feature<?>> PARASITE_TEN_FLOWER =
        SRPMain.FEATURES.register("parasite_ten_flower", () -> new WorldGenParasiteTenFlower());

    public static final RegistryObject<Feature<?>> PARASITE_TREE =
        SRPMain.FEATURES.register("parasite_tree", () -> new WorldGenParasiteTree());

    public static final RegistryObject<Feature<?>> PARASITE_TREE_THIN =
        SRPMain.FEATURES.register("parasite_tree_thin", () -> new WorldGenParasiteTreeThin());

    public static void init() {
        // Fuerza la inicializacion de los campos estaticos.
    }
}