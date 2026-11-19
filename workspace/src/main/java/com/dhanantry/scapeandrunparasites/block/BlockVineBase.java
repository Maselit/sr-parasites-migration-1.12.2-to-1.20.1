package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

/**
 * Migracion de BlockVineBase a 1.20.1.
 * BlockVine -> VineBlock.
 */
public class BlockVineBase extends VineBlock
{
    public BlockVineBase(BlockBehaviour.Properties properties) {
        super(properties);
    }
}
