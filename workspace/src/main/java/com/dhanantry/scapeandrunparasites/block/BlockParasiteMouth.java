package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Migracion de BlockParasiteMouth a 1.20.1.
 * Boca del parasito: bloque translucido y sin colision.
 * En 1.20.1 el render type translucido se declara en el modelo
 * (render_type: translucent).
 */
public class BlockParasiteMouth extends BlockBase
{
    public BlockParasiteMouth(BlockBehaviour.Properties properties) {
        // isOpaqueCube / isFullCube == false en 1.12.2
        super(properties.noOcclusion());
    }

    @Override
    public boolean isCollisionShapeFullBlock(BlockState state, net.minecraft.world.level.BlockGetter level, net.minecraft.core.BlockPos pos) {
        return false;
    }
}
