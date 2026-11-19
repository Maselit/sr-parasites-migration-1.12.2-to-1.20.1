package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Migracion de BlockParasiteSapling a 1.20.1.
 * IGrowable -> BonemealableBlock (isValidBonemealTarget / isBonemealSuccess /
 * performBonemeal). El estado STAGE sustituye al bit de metadata de 1.12.2.
 */
public class BlockParasiteSapling extends BushBlock implements BonemealableBlock, IMetaName
{
    public static final EnumProperty<EnumType> VARIANT = EnumProperty.create("variant", EnumType.class);
    public static final IntegerProperty STAGE = IntegerProperty.create("stage", 0, 1);
    protected static final VoxelShape SAPLING_AABB = Block.box(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.9D, 0.8D, 0.9D);

    public BlockParasiteSapling(BlockBehaviour.Properties properties) {
        super(properties.noOcclusion());
        this.registerDefaultState(this.defaultBlockState().setValue(VARIANT, EnumType.TREE).setValue(STAGE, 0));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SAPLING_AABB;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.growTick(state, level, pos, random);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.growTick(state, level, pos, random);
    }

    private void growTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isLoaded(pos)) {
            return;
        }
        // getLightFromNeighbors de 1.12.2 -> getRawBrightness en 1.20.1
        if (level.getRawBrightness(pos.above(), 0) >= 9 && random.nextInt(7) == 0) {
            this.grow(level, pos, state, random);
        }
    }

    public void grow(ServerLevel level, BlockPos pos, BlockState state, RandomSource random) {
        if (state.getValue(STAGE) == 0) {
            level.setBlock(pos, state.setValue(STAGE, 1), 4);
        } else {
            this.generateTree(level, pos, state, random);
        }
    }

    public void generateTree(ServerLevel level, BlockPos pos, BlockState state, RandomSource random) {
        // TODO: generacion de arbol migrada en otro lote
        // (WorldGenParasiteTree / WorldGenParasiteTreeThin / WorldGenParasiteTallFlower)
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos below = pos.below();
        return this.checkBush(level.getBlockState(below), level, below);
    }

    protected boolean checkBush(BlockState state, BlockGetter level, BlockPos pos) {
        return state.isCollisionShapeFullBlock(level, pos);
    }

    public boolean isTypeAt(Level level, BlockPos pos, EnumType type) {
        BlockState iblockstate = level.getBlockState(pos);
        return iblockstate.getBlock() == this && iblockstate.getValue(VARIANT) == type;
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state, boolean isClient) {
        // canGrow == true en 1.12.2
        return true;
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        // canUseBonemeal de 1.12.2 (45%)
        return level.random.nextFloat() < 0.45F;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        this.grow(level, pos, state, random);
    }

    @Override
    public Enum<?>[] getVariants() {
        return EnumType.values();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(VARIANT, STAGE);
    }

    public static enum EnumType implements StringRepresentable
    {
        TREE,
        TREETHIN,
        FLOWERTALL;

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
