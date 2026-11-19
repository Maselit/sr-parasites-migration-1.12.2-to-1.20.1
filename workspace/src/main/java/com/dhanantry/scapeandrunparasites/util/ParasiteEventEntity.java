package com.dhanantry.scapeandrunparasites.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Migracion de ParasiteEventEntity (1.12.2) a 1.20.1.
 * TODA: logica de conversion/hijack/merge/COTH pendiente de migrar (capa de entidades).
 */
public class ParasiteEventEntity
{
    public static void alertAllPlayerDim(Level level, String msg, int type) {
        // TODO: notificacion a los jugadores migrada en otro lote
    }

    public static void alertAllPlayerSer(String msg, Level level) {
        // TODO: notificacion a los jugadores migrada en otro lote
    }

    /**
     * Comprueba si un nombre esta en una lista (black/white list).
     * Semantica exacta de 1.12.2: coincidencia por subcadena (name.contains(entry)).
     * invertido = true devuelve true cuando NO coincide (lista blanca).
     */
    public static boolean checkName(String name, String[] list, boolean inverted) {
        boolean inv = false;
        if (list != null && list.length != 0) {
            if (inverted) {
                inv = true;
            }
            for (String i : list) {
                if (i == null) continue;
                if (inverted) {
                    if (!name.contains(i)) continue;
                    return false;
                }
                if (!name.contains(i)) continue;
                return true;
            }
        }
        return inv;
    }

    /**
     * Busca la posicion del suelo (igual que 1.12.2: si el bloque es aire y el de abajo no,
     * devuelve pos; si no es aire, sube).
     */
    public static BlockPos getFloor(Level level, BlockPos pos, int loop) {
        if (loop <= 0) {
            return null;
        }
        loop--;
        if (level.getBlockState(pos).getBlock() == net.minecraft.world.level.block.Blocks.AIR) {
            if (level.getBlockState(pos.below()).getBlock() != net.minecraft.world.level.block.Blocks.AIR) {
                return pos;
            }
            return getFloor(level, pos.below(), loop);
        }
        return getFloor(level, pos.above(), loop);
    }
}
