package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

/**
 * Migracion de BlockBase a 1.20.1.
 * En 1.12.2 el bloque se registraba a si mismo en el constructor (SRPBlocks/SRPItems).
 * En 1.20.1 el registro se hace via DeferredRegister; el constructor solo define propiedades.
 */
public class BlockBase extends Block
{
    public BlockBase(BlockBehaviour.Properties properties) {
        super(properties);
    }
}
