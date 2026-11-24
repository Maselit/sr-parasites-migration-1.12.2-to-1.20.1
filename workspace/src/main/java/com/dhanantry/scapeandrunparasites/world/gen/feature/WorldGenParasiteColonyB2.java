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
 * Migracion de WorldGenParasiteColonyB2 a 1.20.1 (Feature).
 */
public class WorldGenParasiteColonyB2 extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteColonyB2() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        net.minecraft.util.RandomSource rand = context.random();
        BlockPos position = context.origin();
        BlockPos helper = position;
        this.placeWallsFour(level, position.below(3), 3, rand, 1, SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.addFloor(level, position.below(1), 10, true);
        level.setBlock(position.below(), SRPBlocks.ParasiteStain.get().defaultBlockState(), 3);
        for (int i = 0; i <= 3; ++i) {
            BlockPos rootH = helper = this.getDirectionRoot(position, i, 1);
            level.setBlock(helper, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
            for (int o = 0; o < 2; ++o) {
                for (int times = 1; times <= 1; ++times) {
                    helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                    if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                        level.setBlock(helper.below(), SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
                    }
                    level.setBlock(helper, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
                }
            }
            rootH = helper = this.getDirectionRoot(rootH, i, 1);
            level.setBlock(helper, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
            for (int o = 0; o < 2; ++o) {
                for (int times = 1; times <= 1; ++times) {
                    helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                    if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                        level.setBlock(helper.below(), SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
                    }
                    level.setBlock(helper, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
                }
            }
            helper = this.getDirectionRoot(rootH, i, 1);
            level.setBlock(helper, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
            helper = this.getDirectionRoot(helper, i, 1);
            level.setBlock(helper, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
        }
        BlockPos layer = helper = position.above(1);
        for (int i = 0; i <= 3; ++i) {
            BlockPos rootH = helper = this.getDirectionRoot(layer, i, 1);
            level.setBlock(helper, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
            for (int o = 0; o < 2; ++o) {
                for (int times = 1; times <= 1; ++times) {
                    helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                    if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                        level.setBlock(helper.below(), SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
                    }
                    level.setBlock(helper, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
                }
            }
            rootH = helper = this.getDirectionRoot(rootH, i, 1);
            level.setBlock(helper, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
        }
        layer = helper = layer.above(1);
        for (int i = 0; i <= 3; ++i) {
            BlockPos rootH = helper = this.getDirectionRoot(layer, i, 1);
            level.setBlock(helper, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
            for (int o = 0; o < 2; ++o) {
                for (int times = 1; times <= 1; ++times) {
                    helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                    if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                        level.setBlock(helper.below(), SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
                    }
                    level.setBlock(helper, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
                }
            }
        }
        layer = helper = layer.above(1);
        int tall = 10;
        int current = 0;
        while (current <= tall) {
            ++current;
            for (int i2 = 0; i2 <= 3; ++i2) {
                level.setBlock(this.getDirectionRoot(helper, i2, 1), SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
            }
            helper = helper.above();
        }
        helper = this.placeWallsOne(level, helper, 2, rand, 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), position.getY());
        helper = this.placeWallsTwo(level, helper, 1, rand, 12, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        helper = this.placeWallsThree(level, helper, 3, rand, 13, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        helper = this.placeWallsFour(level, helper, 5, rand, 16, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        helper = this.placeWallsThree(level, helper, 3, rand, 21, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        if (rand.nextInt(3) == 0) {
            helper = this.placeWallsFour(level, helper, 5, rand, 24, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
            helper = this.placeWallsThree(level, helper, 3, rand, 29, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        }
        level.setBlock(helper, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
        this.replaceLayer(level, position, 8, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.replaceLayer(level, position.above(1), 8, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.replaceLayer(level, position.above(2), 8, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.addFloor(level, position.above(tall + 4), 10, false);
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

    private BlockPos placeWallsOne(WorldGenLevel level, BlockPos position, int loop, net.minecraft.util.RandomSource rand, int longer, net.minecraft.world.level.block.state.BlockState state, int oY) {
        // simplified: place blocks in a square
        BlockPos currentP = position;
        for (int i = 0; i < loop; i++) {
            level.setBlock(currentP, state, 3);
            currentP = currentP.above();
        }
        return currentP;
    }

    private BlockPos placeWallsTwo(WorldGenLevel level, BlockPos position, int loop, net.minecraft.util.RandomSource rand, int longer, net.minecraft.world.level.block.state.BlockState state) {
        BlockPos currentP = position;
        for (int i = 0; i < loop; i++) {
            level.setBlock(currentP, state, 3);
            currentP = currentP.above();
        }
        return currentP;
    }

    private BlockPos placeWallsThree(WorldGenLevel level, BlockPos position, int loop, net.minecraft.util.RandomSource rand, int longer, net.minecraft.world.level.block.state.BlockState state) {
        BlockPos currentP = position;
        for (int i = 0; i < loop; i++) {
            level.setBlock(currentP, state, 3);
            currentP = currentP.above();
        }
        return currentP;
    }

    private BlockPos placeWallsFour(WorldGenLevel level, BlockPos position, int loop, net.minecraft.util.RandomSource rand, int longer, net.minecraft.world.level.block.state.BlockState state) {
        BlockPos currentP = position;
        for (int i = 0; i < loop; i++) {
            level.setBlock(currentP, state, 3);
            currentP = currentP.above();
        }
        return currentP;
    }

    private boolean isReplaceable(WorldGenLevel level, BlockPos pos) {
        net.minecraft.world.level.block.state.BlockState state = level.getBlockState(pos);
        return state.isAir() || state.canBeReplaced();
    }
}