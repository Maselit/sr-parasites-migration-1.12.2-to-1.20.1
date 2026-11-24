package com.dhanantry.scapeandrunparasites.world.gen.feature;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * STUB migrado (Fase C): esqueleto. La logica real se migrara en lotes.
 */
public class WorldGenParasiteBush extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteBush() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        return false;
    }
}
