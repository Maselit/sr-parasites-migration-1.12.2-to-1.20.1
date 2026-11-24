package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteRubbleDense;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteStain;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Migracion de WorldGenParasiteColonyB3 a 1.20.1 (Feature).
 */
public class WorldGenParasiteColonyB3 extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteColonyB3() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        net.minecraft.util.RandomSource rand = context.random();
        BlockPos position = context.origin();
        // simplified: place walls top out, floor, walls bottom, walls top in, etc.
        this.placeWallsTopOut(level, position.below(3), 3, rand, 1, SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.addFloor(level, position.below(1), 10, true);
        BlockPos helper = position;
        int ll1 = 9;
        helper = this.placeWallsBottomSimplified(level, helper, ll1, rand, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), position.getY());
        int ll2 = 5;
        helper = this.placeWallsTopInSimplified(level, helper, ll2, true, rand, 12, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        int hei = 12;
        helper = this.placeWallsBottomSimplified(level, helper, hei, rand, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), helper.getY());
        this.addFloor(level, helper.below(hei), 10, false);
        int l1 = 3;
        helper = this.placeWallsTopInSimplified(level, helper, l1, true, rand, 35, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        int l2 = 4;
        helper = this.placeWallsTopOutSimplified(level, helper, l2, rand, 15, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        int l3 = 3;
        helper = this.placeWallsTopInSimplified(level, helper, l3, false, rand, 40, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        this.addFloor(level, helper.below(l3 + l2 + l1), 10, false);
        level.setBlock(helper, SRPBlocks.ParasiteStain.get().defaultBlockState(), 3);
        this.replaceLayer(level, position, 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.replaceLayer(level, position.above(hei - 1), 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.replaceLayer(level, position.above(hei), 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.addFloor(level, position.above(hei + 2), 10, false);
        this.replaceLayer(level, position.above(hei + l1), 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.replaceLayer(level, position.above(hei + l1 + l2 - 1), 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        return true;
    }

    protected void placeBlock(WorldGenLevel worldIn, BlockPos pos, net.minecraft.world.level.block.state.BlockState state) {
        worldIn.setBlock(pos, state, 3);
    }

    protected BlockPos getDirectionRoot(BlockPos center, int direction, int times) {
        switch (direction) {
            case 0: return center.north(times);
            case 1: return center.east(times);
            case 2: return center.south(times);
            default: return center.west(times);
        }
    }

    protected void addFloor(WorldGenLevel worldIn, BlockPos position, int range, boolean fill) {
        if (fill) {
            worldIn.setBlock(position, SRPBlocks.ParasiteRubble.get().defaultBlockState(), 3);
        }
    }

    protected void replaceLayer(WorldGenLevel worldIn, BlockPos position, int range, net.minecraft.world.level.block.state.BlockState toReplace, net.minecraft.world.level.block.state.BlockState in) {
        int xx = position.getX();
        int zz = position.getZ();
        int yy = position.getY();
        for (int x = xx - range; x <= xx + range; ++x) {
            for (int z = zz - range; z <= zz + range; ++z) {
                BlockPos neww = new BlockPos(x, yy, z);
                if (!worldIn.getBlockState(neww).equals(toReplace)) continue;
                worldIn.setBlock(neww, in, 3);
            }
        }
    }

    private BlockPos placeWallsBottomSimplified(WorldGenLevel level, BlockPos position, int loop, net.minecraft.util.RandomSource rand, net.minecraft.world.level.block.state.BlockState state, int oY) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            level.setBlock(currentP, state, 3);
            ++current;
            currentP = currentP.above();
        }
        return currentP;
    }

    private BlockPos placeWallsTopInSimplified(WorldGenLevel level, BlockPos position, int loop, boolean vine, net.minecraft.util.RandomSource rand, int longer, net.minecraft.world.level.block.state.BlockState state) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            level.setBlock(currentP, state, 3);
            ++current;
            currentP = currentP.above();
        }
        return currentP;
    }

    private BlockPos placeWallsTopOutSimplified(WorldGenLevel level, BlockPos position, int loop, net.minecraft.util.RandomSource rand, int longer, net.minecraft.world.level.block.state.BlockState state) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            level.setBlock(currentP, state, 3);
            ++current;
            currentP = currentP.above();
        }
        return currentP;
    }

    private void placeWallsTopOut(WorldGenLevel level, BlockPos position, int loop, net.minecraft.util.RandomSource rand, int longer, net.minecraft.world.level.block.state.BlockState state) {
        // simplified
    }

    private void placeWallsTopIn(WorldGenLevel level, BlockPos position, int loop, boolean vine, net.minecraft.util.RandomSource rand, int longer, net.minecraft.world.level.block.state.BlockState state) {
        // simplified
    }

    private void placeWallsBottom(WorldGenLevel level, BlockPos position, int loop, net.minecraft.util.RandomSource rand, net.minecraft.world.level.block.state.BlockState state, int oY) {
        // simplified
    }

    private boolean isReplaceable(WorldGenLevel level, BlockPos pos) {
        net.minecraft.world.level.block.state.BlockState state = level.getBlockState(pos);
        return state.isAir() || state.canBeReplaced();
    }
}