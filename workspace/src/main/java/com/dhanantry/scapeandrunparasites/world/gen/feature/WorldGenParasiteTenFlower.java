package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockParasiteStain;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Migracion de WorldGenParasiteTenFlower a 1.20.1 (Feature).
 */
public class WorldGenParasiteTenFlower extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteTenFlower() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        net.minecraft.util.RandomSource rand = context.random();
        BlockPos position = context.origin();
        int i = 12;
        boolean flag = true;
        if (level.getBlockState(position.below()).getBlock() == Blocks.AIR) {
            return false;
        }
        int height = level.getMaxBuildHeight();
        if (position.getY() >= 1 && position.getY() + i + 1 <= height) {
            for (int j = position.getY(); j <= position.getY() + 1 + i; ++j) {
                int k = 4;
                BlockPos.MutableBlockPos mbp = new BlockPos.MutableBlockPos();
                for (int l = position.getX() - k; l <= position.getX() + k && flag; ++l) {
                    for (int i1 = position.getZ() - k; i1 <= position.getZ() + k && flag; ++i1) {
                        if (j >= 0 && j < height) {
                            net.minecraft.world.level.block.state.BlockState st = level.getBlockState(mbp.set(l, j, i1));
                            if (st.isAir() || st.canBeReplaced()) continue;
                            flag = false;
                        } else {
                            flag = false;
                        }
                    }
                }
            }
            if (!flag) {
                return false;
            }
            int lag = 0;
            BlockPos current = position;
            while (current.getY() >= 1 && !level.getBlockState(current.below()).isCollisionShapeFullBlock(level, current.below())) {
                current = current.below();
                for (int yyy = 0; yyy <= lag; ++yyy) {
                    for (int xs = -1; xs <= 1; ++xs) {
                        for (int zs = -1; zs <= 1; ++zs) {
                            this.placeTrunk(level, new BlockPos(current.getX() + xs, current.getY(), current.getZ() + zs));
                        }
                    }
                }
            }
            current = position;
            lag = rand.nextInt(2) + 1;
            for (int yyy = 0; yyy <= lag; ++yyy) {
                for (int xs = -1; xs <= 1; ++xs) {
                    for (int zs = -1; zs <= 1; ++zs) {
                        this.placeTrunk(level, new BlockPos(current.getX() + xs, current.getY(), current.getZ() + zs));
                    }
                }
                current = current.above();
            }
            BlockPos helper = current = current.below();
            int times = 0;
            int dirHelper = 0;
            current = current.above();
            for (int dir = 0; dir <= 3; ++dir) {
                helper = current;
                helper = this.getDirectionRoot(helper, dir, 2);
                this.placeTrunk(level, helper);
            }
            current = this.placeColumn(level, current, rand.nextInt(4) + 4, rand);
            for (int dir = 0; dir <= 3; ++dir) {
                helper = this.placeColumn(level, this.getDirectionRoot(current, dir, 1), rand.nextInt(3) + 2, rand);
                int glob = 3;
                helper = helper.below(2);
                for (int kkk = 0; kkk <= glob; ++kkk) {
                    if (kkk == 0) {
                        this.placeColumn(level, this.getDirectionRoot(helper, dir, 1), 1, rand);
                        helper = helper.above();
                    }
                    helper = this.getDirectionRoot(helper, dir, kkk == 0 ? 2 : 1);
                    helper = this.placeColumn(level, helper, rand.nextInt(4) + 1, rand);
                }
            }
        } else {
            return false;
        }
        return true;
    }

    private void placeTrunk(WorldGenLevel level, BlockPos pos) {
        level.setBlock(pos, SRPBlocks.ParasiteStain.get().defaultBlockState(), 3);
    }

    private BlockPos getDirectionRoot(BlockPos center, int direction, int times) {
        switch (direction) {
            case 0: return center.north(times);
            case 1: return center.east(times);
            case 2: return center.south(times);
            default: return center.west(times);
        }
    }

    private BlockPos placeColumn(WorldGenLevel level, BlockPos pos, int in, net.minecraft.util.RandomSource rand) {
        int current;
        int atm = current = pos.getY();
        int times = 0;
        BlockPos newPos = pos;
        while (current < atm + in) {
            this.placeTrunk(level, newPos);
            newPos = newPos.above();
            ++current;
            ++times;
        }
        return newPos;
    }

    private BlockPos directionToGrow(BlockPos atm, int choice, boolean sideCurse) {
        atm = atm.above();
        if (sideCurse) {
            switch (choice) {
                case 0: return atm.north().east();
                case 1: return atm.north().west();
                case 10: return atm.east().north();
                case 11: return atm.east().south();
                case 20: return atm.south().east();
                case 21: return atm.south().west();
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

    private boolean isReplaceable(WorldGenLevel level, BlockPos pos) {
        net.minecraft.world.level.block.state.BlockState state = level.getBlockState(pos);
        return state.isAir() || state.canBeReplaced();
    }
}