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
 * Migracion de WorldGenParasiteColonyB1 a 1.20.1 (Feature).
 */
public class WorldGenParasiteColonyB1 extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteColonyB1() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        net.minecraft.util.RandomSource rand = context.random();
        BlockPos position = context.origin();
        this.placeWallsTopOut(level, position.below(3), 3, rand, 1, SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.addFloor(level, position.below(1), 10, true);
        int hei = 12;
        BlockPos helper = this.placeWallsBottom(level, position, hei, rand, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), position.getY());
        int l1 = 3;
        helper = this.placeWallsTopIn(level, helper, l1, true, rand, 12, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        int l2 = 4;
        helper = this.placeWallsTopOut(level, helper, l2, rand, 15, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        int l3 = 3;
        helper = this.placeWallsTopIn(level, helper, l3, false, rand, 19, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
        if (rand.nextInt(3) == 0) {
            int l4 = 4;
            helper = this.placeWallsTopOut(level, helper, l4, rand, 22, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
            this.replaceLayer(level, position.above(hei + l1 + l2 + l3), 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
            this.addFloor(level, position.above(hei + l1 + l2 + l3), 10, false);
            helper = this.placeWallsTopIn(level, helper, 3, false, rand, 26, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState());
            this.replaceLayer(level, position.above(hei + l1 + l2 + l3 + l4 - 1), 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        }
        this.placeBlock(level, helper, SRPBlocks.ParasiteStain.get().defaultBlockState());
        this.replaceLayer(level, position, 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.replaceLayer(level, position.above(hei - 1), 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.replaceLayer(level, position.above(hei), 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.addFloor(level, position.above(hei), 10, false);
        this.replaceLayer(level, position.above(hei + l1), 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        this.replaceLayer(level, position.above(hei + l1 + l2 - 1), 10, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), SRPBlocks.ParasiteRubble.get().defaultBlockState());
        return true;
    }

    private BlockPos placeWallsBottom(WorldGenLevel level, BlockPos position, int loop, net.minecraft.util.RandomSource rand, net.minecraft.world.level.block.state.BlockState state, int oY) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            BlockPos helpRoot = currentP;
            BlockPos helper = currentP;
            for (int i = 0; i <= 3; ++i) {
                BlockPos rootH = helper = this.getDirectionRoot(helpRoot, i, 4);
                for (int o = 0; o < 2; ++o) {
                    for (int times = 1; times <= 2; ++times) {
                        helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 2) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 2);
                        if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                            this.placeBlock(level, helper.below(), state);
                        }
                        this.placeBlock(level, helper, state);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (int o = 0; o < 2; ++o) {
                    for (int times = 1; times <= 2; ++times) {
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
                helper = this.getDirectionRoot(rootH, i, 1);
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
                BlockPos rootH = helper = this.getDirectionRoot(helpRoot, i, 5);
                for (int o = 0; o < 2; ++o) {
                    for (int times = 1; times <= 1; ++times) {
                        helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 4) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 4);
                        this.placeBlock(level, helper, state);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (int o = 0; o < 2; ++o) {
                    for (int times = 1; times <= 2; ++times) {
                        helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 2) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 2);
                        this.placeBlock(level, helper, state);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (int o = 0; o < 2; ++o) {
                    for (int times = 1; times <= 2; ++times) {
                        helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                        this.placeBlock(level, helper, state);
                    }
                }
                helper = this.getDirectionRoot(rootH, i, 1);
                this.placeBlock(level, helper, state);
            }
            ++current;
            currentP = currentP.above();
        }
        return currentP;
    }

    private BlockPos placeWallsTopOut(WorldGenLevel level, BlockPos position, int loop, net.minecraft.util.RandomSource rand, int longer, net.minecraft.world.level.block.state.BlockState state) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            BlockPos helpRoot = currentP;
            BlockPos helper = currentP;
            for (int i = 0; i <= 3; ++i) {
                BlockPos rootH = helper = this.getDirectionRoot(helpRoot, i, 6);
                for (int o = 0; o < 2; ++o) {
                    for (int times = 1; times <= 1; ++times) {
                        helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 4) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 4);
                        this.placeBlock(level, helper, state);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (int o = 0; o < 2; ++o) {
                    for (int times = 1; times <= 2; ++times) {
                        helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 2) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 2);
                        this.placeBlock(level, helper, state);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (int o = 0; o < 2; ++o) {
                    for (int times = 1; times <= 2; ++times) {
                        helper = (o == 0) ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                        this.placeBlock(level, helper, state);
                    }
                }
                helper = this.getDirectionRoot(rootH, i, 1);
                this.placeBlock(level, helper, state);
            }
            ++current;
            currentP = currentP.above();
        }
        return currentP;
    }

    protected void placeBlock(WorldGenLevel worldIn, BlockPos pos, net.minecraft.world.level.block.state.BlockState state) {
        worldIn.setBlock(pos, state, 3);
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