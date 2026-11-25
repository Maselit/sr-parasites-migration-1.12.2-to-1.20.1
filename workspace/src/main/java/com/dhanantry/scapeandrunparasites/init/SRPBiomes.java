package com.dhanantry.scapeandrunparasites.init;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.registries.RegistryObject;

/**
 * Migracion de SRPBiomes. El bioma se registra via DeferredRegister (SRPMain.BIOMES).
 * BiomeManager/BiomeDictionary ya no existen en 1.20.1 (usar tags de bioma + BiomeModifier/datapack).
 */
public class SRPBiomes
{
    public static final RegistryObject<Biome> BIOME_INFESTED =
        RegistryObject.create(new net.minecraft.resources.ResourceLocation(com.dhanantry.scapeandrunparasites.SRPMain.MODID, "biome_parasite"),
            net.minecraft.core.registries.Registries.BIOME, com.dhanantry.scapeandrunparasites.SRPMain.MODID);

    /** True si la posicion esta en el bioma parasitario. */
    public static boolean isParasiteBiome(Level level, BlockPos pos) {
        return level.getBiome(pos).is(BIOME_INFESTED.getKey());
    }

    public static void clearMobSpawnList() { /* TODO: lista de mobs del bioma migrada en otro lote */ }
}
