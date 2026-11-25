package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.SlabType;

/**
 * Migracion de BlockSlabDouble a 1.20.1.
 * Losa doble: la propiedad TYPE queda fijada en SlabType.DOUBLE.
 */
public class BlockSlabDouble extends BlockSlabBase
{
    public BlockSlabDouble(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
            .setValue(TYPE, SlabType.DOUBLE)
            .setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public boolean isDouble() {
        return true;
    }
}
