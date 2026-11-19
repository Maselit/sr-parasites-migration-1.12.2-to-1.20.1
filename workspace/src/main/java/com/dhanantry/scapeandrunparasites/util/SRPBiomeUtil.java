package com.dhanantry.scapeandrunparasites.util;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.chunk.PalettedContainer;

/**
 * Utilidad para reemplazar el bioma de una posicion en tiempo de ejecucion (1.20.1).
 *
 * En 1.12.2 el mod escribia directamente en el array de biomas del chunk
 * (world.getChunk(pos).getBiomeArray()[...] = id). En 1.20.1 cada chunk guarda
 * los biomas en un PalettedContainer por seccion, asi que el cambio se hace
 * sobre ese contenedor y se marca el chunk como sucio para que se guarde.
 */
public class SRPBiomeUtil
{
    /** Sustituye el bioma de una posicion dentro del chunk. Devuelve true si se aplico. */
    public static boolean setBiome(Level level, BlockPos pos, ResourceKey<Biome> biomeKey) {
        try {
            Holder<Biome> holder = level.registryAccess().registryOrThrow(Registries.BIOME).getHolderOrThrow(biomeKey);
            return setBiome(level, pos, holder);
        } catch (Exception e) {
            return false;
        }
    }

    /** Sustituye el bioma de una posicion usando un Holder ya resuelto. */
    public static boolean setBiome(Level level, BlockPos pos, Holder<Biome> holder) {
        try {
            ChunkAccess chunk = level.getChunk(pos);
            int sectionIndex = chunk.getSectionIndex(pos.getY());
            LevelChunkSection section = chunk.getSections()[sectionIndex];
            Object container = section.getBiomes();
            if (!(container instanceof PalettedContainer<?> raw)) {
                return false;
            }
            @SuppressWarnings("unchecked")
            PalettedContainer<Holder<Biome>> biomes = (PalettedContainer<Holder<Biome>>) raw;
            biomes.set(pos.getX() & 15, pos.getY() & 15, pos.getZ() & 15, holder);
            chunk.setUnsaved(true);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
