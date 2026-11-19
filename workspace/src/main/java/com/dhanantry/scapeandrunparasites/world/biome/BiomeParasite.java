package com.dhanantry.scapeandrunparasites.world.biome;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;

/**
 * Migracion de BiomeParasite (1.12.2) a 1.20.1.
 * En 1.20.1 Biome es inmutable (record-like), por lo que se construye via Biome.BiomeBuilder.
 * Esta clase expone un factory para el bioma parasitario.
 */
public class BiomeParasite
{
    public static Biome create() {
        return new Biome.BiomeBuilder()
            .hasPrecipitation(false)
            .temperature(0.8F)
            .downfall(0.0F)
            .specialEffects(new BiomeSpecialEffects.Builder()
                .waterColor(0xA60000)
                .waterFogColor(0xA60000)
                .grassColorOverride(0xA60000)
                .foliageColorOverride(0xA60000)
                .skyColor(0x2F0000)
                .fogColor(0x2F0000)
                .build())
            .mobSpawnSettings(MobSpawnSettings.EMPTY)
            .generationSettings(BiomeGenerationSettings.EMPTY)
            .build();
    }
}
