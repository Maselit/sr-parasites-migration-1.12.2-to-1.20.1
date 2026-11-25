package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.SlabType;

/**
 * Migracion de BlockSlabHalf a 1.20.1.
 * Losa simple: la propiedad TYPE queda fijada en SlabType.BOTTOM.
 */
public class BlockSlabHalf extends BlockSlabBase
{
    public BlockSlabHalf(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
            .setValue(TYPE, SlabType.BOTTOM)
            .setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public boolean isDouble() {
        return false;
    }
}
