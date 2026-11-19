package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Collections;
import java.util.List;

/**
 * Migracion de BlockParasiteBush a 1.20.1.
 */
public class BlockParasiteBush extends BushBlock implements IMetaName
{
    protected static final VoxelShape TALL_GRASS_AABB = Block.box(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.9D, 0.8D, 0.9D);
    protected static final VoxelShape REED_AABB = Block.box(0.125D, 0.0D, 0.125D, 0.875D, 1.0D, 0.875D);
    public static final EnumProperty<EnumType> VARIANT = EnumProperty.create("variant", EnumType.class);

    public BlockParasiteBush(BlockBehaviour.Properties properties) {
        // Material.VINE + SoundType.GRASS de 1.12.2
        super(properties.sound(SoundType.GRASS).noOcclusion());
        this.registerDefaultState(this.defaultBlockState().setValue(VARIANT, EnumType.TENDRIL));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        EnumType variant = state.getValue(VARIANT);
        if (variant == EnumType.TENDRIL || variant == EnumType.BINE) {
            return REED_AABB;
        }
        return TALL_GRASS_AABB;
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        if (state.getValue(VARIANT) == EnumType.TENDRIL) {
            BlockPos below = pos.below();
            return this.checkBushV(level.getBlockState(below), level, below);
        }
        if (state.getValue(VARIANT) == EnumType.BINE) {
            BlockPos above = pos.above();
            return this.checkBushV(level.getBlockState(above), level, above);
        }
        BlockPos below = pos.below();
        return this.checkBush(level.getBlockState(below), level, below);
    }

    protected boolean checkBush(BlockState state, BlockGetter level, BlockPos pos) {
        if (!(state.getBlock() instanceof BlockBase)) {
            return false;
        }
        return state.isCollisionShapeFullBlock(level, pos);
    }

    protected boolean checkBushV(BlockState state, BlockGetter level, BlockPos pos) {
        if (state.isCollisionShapeFullBlock(level, pos) && state.getBlock() instanceof BlockBase) {
            return true;
        }
        if (state.getBlock() == this && state.getValue(VARIANT) == EnumType.TENDRIL) {
            return true;
        }
        return state.getBlock() == this && state.getValue(VARIANT) == EnumType.BINE;
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        super.neighborChanged(state, level, pos, block, fromPos, isMoving);
        if (!this.canSurvive(state, level, fromPos)) {
            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        }
    }

    protected void checkAndDropBlock(Level level, BlockPos pos, BlockState state) {
        if (!this.canSurvive(state, level, pos)) {
            Block.popResource(level, pos, new ItemStack(this));
            level.setBlock(pos, Blocks.AIR.defaultBlockState(), 3);
        }
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder params) {
        // getItemDropped devolvia null en 1.12.2
        return Collections.emptyList();
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
        TENDRIL,
        BINE,
        POP,
        EYE,
        TOOH;

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
