package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.Entity;
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
 * Migracion de BlockGore a 1.20.1.
 * Sangre coagulada (carne, hueso, etc.) que se desintegra con el tiempo y
 * contagia a los vivos que la pisan.
 */
public class BlockGore extends BushBlock implements IMetaName
{
    protected static final VoxelShape TALL_GRASS_AABB = Block.box(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.9D, 0.8D, 0.9D);
    public static final EnumProperty<EnumType> VARIANT = EnumProperty.create("variant", EnumType.class);

    public BlockGore(BlockBehaviour.Properties properties) {
        // Material.VINE + SoundType.GRASS + tickRandomly(true) de 1.12.2
        super(properties.sound(SoundType.GRASS).noOcclusion().randomTicks());
        this.registerDefaultState(this.defaultBlockState().setValue(VARIANT, EnumType.SIM_SMALL));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return TALL_GRASS_AABB;
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos below = pos.below();
        return this.checkBush(level.getBlockState(below), level, below);
    }

    protected boolean checkBush(BlockState state, BlockGetter level, BlockPos pos) {
        // isFullCube de 1.12.2
        return state.isCollisionShapeFullBlock(level, pos);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        super.neighborChanged(state, level, pos, block, fromPos, isMoving);
        if (!this.canSurvive(state, level, fromPos)) {
            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        }
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide) {
            // TODO: pociones migradas en otro lote (SRPPotions.COTH_E / SRPPotions.EPEL_E)
            // TODO: entidades migradas en otro lote (EntityParasiteBase)
        }
        super.entityInside(state, level, pos, entity);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.decay(state, level, pos, random);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.decay(state, level, pos, random);
    }

    private void decay(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        int air = 10;
        EnumType c = state.getValue(VARIANT);
        if (c == EnumType.ADA_BIG || c == EnumType.PRI_BIG || c == EnumType.PURE_BIG || c == EnumType.SIM_BIG) {
            air = 45;
        }
        if (random.nextInt(air) == 0) {
            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
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
        SIM_SMALL,
        SIM_BIG,
        PRI_SMALL,
        PRI_BIG,
        ADA_SMALL,
        ADA_BIG,
        PURE_SMALL,
        PURE_BIG,
        SIM_FLAT,
        PRI_FLAT,
        ADA_FLAT,
        PURE_FLAT;

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
