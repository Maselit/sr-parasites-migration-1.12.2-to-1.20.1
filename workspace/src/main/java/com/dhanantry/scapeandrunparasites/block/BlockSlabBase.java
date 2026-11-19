package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.HitResult;

/**
 * Migracion de BlockSlabBase a 1.20.1.
 * En 1.20.1 la mitad y el doble se distinguen con la propiedad TYPE
 * (SlabType.BOTTOM / TOP / DOUBLE) en lugar de con dos bloques distintos.
 */
public abstract class BlockSlabBase extends SlabBlock
{
    public static final EnumProperty<EnumType> VARIANT = EnumProperty.create("variant", EnumType.class);

    public BlockSlabBase(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
            .setValue(VARIANT, EnumType.DEFAULT)
            .setValue(TYPE, SlabType.BOTTOM)
            .setValue(WATERLOGGED, Boolean.FALSE));
    }

    public abstract boolean isDouble();

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(VARIANT);
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter level, BlockPos pos, net.minecraft.world.entity.player.Player player) {
        // La variante ya no se guarda en el ItemStack (en 1.20.1 no hay metadata):
        // vive en el BlockState y la consume la capa de items.
        return new ItemStack(this);
    }

    public static enum EnumType implements StringRepresentable
    {
        DEFAULT;

        @Override
        public String getSerializedName() {
            return this.name().toLowerCase();
        }

        public String getName() {
            return this.getSerializedName();
        }

        @Override
        public String toString() {
            return this.getSerializedName();
        }
    }
}
