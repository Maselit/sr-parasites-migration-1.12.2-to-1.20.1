package com.dhanantry.scapeandrunparasites.world.gen.structure;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

/**
 * Migracion de WorldGenStructure a 1.20.1 (NBT structure templates).
 */
public class WorldGenStructure extends Feature<NoneFeatureConfiguration> {
    public static String structureName;

    public WorldGenStructure() {
        super(NoneFeatureConfiguration.CODEC);
    }

    public WorldGenStructure(String name) {
        super(NoneFeatureConfiguration.CODEC);
        structureName = name;
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        generate(level, context.origin());
        return true;
    }

    public boolean generate(WorldGenLevel worldIn, net.minecraft.util.RandomSource rand, BlockPos position) {
        generate(worldIn, position);
        return true;
    }

    public static void generate(WorldGenLevel world, BlockPos pos) {
        if (structureName == null) return;
        if (world.getServer() == null) return;
        StructureTemplateManager manager = world.getServer().getStructureManager();
        ResourceLocation location = new ResourceLocation("srparasites", structureName);
        java.util.Optional<StructureTemplate> templateOpt = manager.get(location);
        if (templateOpt.isEmpty()) return;
        StructureTemplate template = templateOpt.get();
        StructurePlaceSettings setting = new StructurePlaceSettings()
            .setMirror(Mirror.NONE)
            .setRotation(Rotation.NONE)
            .setIgnoreEntities(false);
        template.placeInWorld(world, pos, pos, setting, world.getRandom(), 2);
    }
}