package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.HitResult;

/**
 * Migracion de BlockParasiteRubbleDense a 1.20.1.
 */
public class BlockParasiteRubbleDense extends BlockBase implements IMetaName
{
    public static final EnumProperty<EnumType> VARIANT = EnumProperty.create("variant", EnumType.class);

    public BlockParasiteRubbleDense(BlockBehaviour.Properties properties) {
        // setHarvestLevel("pickaxe", 3) de 1.12.2 -> requiresCorrectToolForDrops()
        // (en 1.20.1 la herramienta se define con el tag mineable/pickaxe)
        super(properties.requiresCorrectToolForDrops());
        this.registerDefaultState(this.defaultBlockState().setValue(VARIANT, EnumType.WALL));
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter level, BlockPos pos, net.minecraft.world.entity.player.Player player) {
        // La variante ya no se guarda en el ItemStack (en 1.20.1 no hay metadata):
        // vive en el BlockState y la consume la capa de items.
        return new ItemStack(this);
    }

    @Override
    public Enum<?>[] getVariants() {
        return EnumType.values();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(VARIANT);
    }

    public static enum EnumType implements StringRepresentable
    {
        WALL,
        BIOME,
        COLONY;

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
