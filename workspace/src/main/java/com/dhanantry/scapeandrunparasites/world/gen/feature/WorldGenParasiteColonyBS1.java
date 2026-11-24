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
 * Migracion de WorldGenParasiteColonyBS1 a 1.20.1 (Feature).
 */
public class WorldGenParasiteColonyBS1 extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteColonyBS1() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        net.minecraft.util.RandomSource rand = context.random();
        BlockPos position = context.origin();
        this.placeWallsTopIn(level, position.below(3), 3, false, rand, 1, SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.addFloor(level, position.below(1), 10, true);
        int l1 = 9;
        BlockPos helper = this.placeWallsBottom(level, position, l1, rand, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), position.getY());
        int l2 = 5;
        helper = this.placeWallsTopIn(level, helper, l2, true, rand, 12, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        this.addFloor(level, helper.below(l2), 10, false);
        this.replaceLayer(level, position, 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        return true;
    }

    private BlockPos placeWallsBottom(WorldGenLevel level, BlockPos position, int loop, net.minecraft.util.RandomSource rand, net.minecraft.world.level.block.state.BlockState state, int oY) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            BlockPos helpRoot = currentP;
            BlockPos helper = currentP;
            for (int i = 0; i <= 3; ++i) {
                BlockPos rootH = helper = this.getDirectionRoot(helpRoot, i, 2);
                for (int o = 0; o < 1; ++o) {
                    for (int times = 1; times <= 1; ++times) {
                        helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 1) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 1);
                        if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                            this.placeBlock(level, helper.below(), state);
                        }
                        this.placeBlock(level, helper, state);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (int o = 0; o < 2; ++o) {
                    for (int times = 1; times <= 1; ++times) {
                        if (o == 0) {
                            helper = this.getDirectionRoot(rootH, (i + 1) % 4, times);
                        } else {
                            helper = this.getDirectionRoot(rootH, (i + 3) % 4, times);
                        }
                        if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                            this.placeBlock(level, helper.below(), state);
                        }
                        this.placeBlock(level, helper, state);
                    }
                }
                helper = this.getDirectionRoot(rootH, i, 0);
                if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                    this.placeBlock(level, helper.below(), state);
                }
                this.placeBlock(level, helper, state);
            }
            ++current;
            currentP = currentP.above();
        }
        return currentP;
    }

    private BlockPos placeWallsTopIn(WorldGenLevel level, BlockPos position, int loop, boolean vine, net.minecraft.util.RandomSource rand, int longer, net.minecraft.world.level.block.state.BlockState state) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            BlockPos helpRoot = currentP;
            BlockPos helper = currentP;
            for (int i = 0; i <= 3; ++i) {
                BlockPos rootH = helper = this.getDirectionRoot(helpRoot, i, 3);
                for (int o = 0; o < 2; ++o) {
                    for (int times = 1; times <= 1; ++times) {
                        helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 1) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 1);
                        this.placeBlock(level, helper, state);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (int o = 0; o < 2; ++o) {
                    for (int times = 1; times <= 1; ++times) {
                        helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                        this.placeBlock(level, helper, state);
                    }
                }
                helper = this.getDirectionRoot(rootH, i, 0);
                this.placeBlock(level, helper, state);
            }
            ++current;
            currentP = currentP.above();
        }
        return currentP;
    }

    private void addFloor(WorldGenLevel level, BlockPos position, int range, boolean fill) {
        if (fill) {
            level.setBlock(position, SRPBlocks.ParasiteRubble.get().defaultBlockState(), 3);
        }
    }

    private void replaceLayer(WorldGenLevel level, BlockPos position, int range, net.minecraft.world.level.block.state.BlockState toReplace, net.minecraft.world.level.block.state.BlockState in) {
        int xx = position.getX();
        int zz = position.getZ();
        int yy = position.getY();
        for (int x = xx - range; x <= xx + range; ++x) {
            for (int z = zz - range; z <= zz + range; ++z) {
                BlockPos neww = new BlockPos(x, yy, z);
                if (!level.getBlockState(neww).equals(toReplace)) continue;
                level.setBlock(neww, in, 3);
            }
        }
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

    protected BlockPos directionToGrow(BlockPos atm, int choice, boolean sideCurse) {
        if (sideCurse) {
            switch (choice) {
                case 0: return atm.north().east();
                case 1: return atm.north().west();
                case 10: return atm.east().south();
                case 11: return atm.east().north();
                case 20: return atm.south().west();
                case 21: return atm.south().east();
                case 30: return atm.west().north();
                default: return atm.west().south();
            }
        }
        switch (choice) {
            case 0: return atm.north();
            case 1: return atm.east();
            case 3: return atm.west();
            default: return atm.south();
        }
    }

    protected BlockPos placeColumn(WorldGenLevel worldIn, BlockPos pos, int in, net.minecraft.util.RandomSource rand, double extraChance, net.minecraft.world.level.block.state.BlockState state) {
        int current;
        int atm = current = pos.getY();
        int times = 0;
        BlockPos newPos = pos;
        while (current < atm + in) {
            this.placeBlock(worldIn, newPos, state);
            newPos = newPos.below();
            ++current;
            ++times;
        }
        this.placeBlock(worldIn, newPos, state);
        return newPos;
    }

    private boolean isReplaceable(WorldGenLevel level, BlockPos pos) {
        net.minecraft.world.level.block.state.BlockState state = level.getBlockState(pos);
        return state.isAir() || state.canBeReplaced();
    }
}