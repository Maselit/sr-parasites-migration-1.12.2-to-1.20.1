package com.dhanantry.scapeandrunparasites.world.gen.structure;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * STUB migrado (Fase C): esqueleto. La logica real se migrara en lotes.
 */
public class WorldGenStructure extends Feature<NoneFeatureConfiguration> {
    public WorldGenStructure() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        return false;
    }
}
