package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.HitResult;

/**
 * Migracion de BlockSlabBase a 1.20.1.
 * En 1.20.1 la mitad y el doble se distinguen con la propiedad TYPE
 * (SlabType.BOTTOM / TOP / DOUBLE) en lugar de con dos bloques distintos.
 */
public abstract class BlockSlabBase extends SlabBlock
{
    public BlockSlabBase(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
            .setValue(TYPE, SlabType.BOTTOM)
            .setValue(WATERLOGGED, Boolean.FALSE));
    }

    public abstract boolean isDouble();

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter level, BlockPos pos, net.minecraft.world.entity.player.Player player) {
        return new ItemStack(this);
    }
}