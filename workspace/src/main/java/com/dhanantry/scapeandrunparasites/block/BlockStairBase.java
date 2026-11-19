package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

/**
 * Migracion de BlockStairBase a 1.20.1.
 * BlockStairs -> StairBlock. El estado por defecto (FACING=NORTH, HALF=BOTTOM,
 * SHAPE=STRAIGHT) ya lo registra StairBlock, y la opacidad total de 1.12.2
 * (setLightOpacity(255)) es el comportamiento por defecto de 1.20.1.
 */
public class BlockStairBase extends StairBlock
{
    public BlockStairBase(Supplier<BlockState> modelState, BlockBehaviour.Properties properties) {
        super(modelState, properties);
    }
}
