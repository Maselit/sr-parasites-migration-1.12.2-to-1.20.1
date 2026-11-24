package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockParasiteStain;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteTrunk;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Migracion de WorldGenParasiteTallFlower a 1.20.1 (Feature).
 */
public class WorldGenParasiteTallFlower extends Feature<NoneFeatureConfiguration> {
    private final BlockState plant = SRPBlocks.ParasiteTrunk.get().defaultBlockState();
    private final BlockState petal = SRPBlocks.ParasiteStain.get().defaultBlockState();
    private final BlockState base = SRPBlocks.ParasiteStain.get().defaultBlockState();

    public WorldGenParasiteTallFlower() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        net.minecraft.util.RandomSource rand = context.random();
        BlockPos position = context.origin();
        int i = 25;
        boolean flag = true;
        if (level.getBlockState(position.below()).getBlock() == Blocks.AIR) {
            return false;
        }
        int height = level.getMaxBuildHeight();
        if (position.getY() >= 1 && position.getY() + i + 1 <= height) {
            for (int j = position.getY(); j <= position.getY() + 1 + i; ++j) {
                int k = 2;
                BlockPos.MutableBlockPos mbp = new BlockPos.MutableBlockPos();
                for (int l = position.getX() - k; l <= position.getX() + k && flag; ++l) {
                    for (int i1 = position.getZ() - k; i1 <= position.getZ() + k && flag; ++i1) {
                        if (j >= 0 && j < height) {
                            if (this.isReplaceable(level, mbp.set(l, j, i1))) continue;
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
                            this.placeBlock(level, new BlockPos(current.getX() + xs, current.getY(), current.getZ() + zs), this.base);
                        }
                    }
                }
            }
            current = position;
            lag = rand.nextInt(2) + 1;
            for (int yyy = 0; yyy < lag; ++yyy) {
                for (int xs = -1; xs <= 1; ++xs) {
                    for (int zs = -1; zs <= 1; ++zs) {
                        this.placeBlock(level, new BlockPos(current.getX() + xs, current.getY(), current.getZ() + zs), this.base);
                    }
                }
                current = current.above();
            }
            BlockPos helper = current = current.below();
            current = current.above();
            this.placeBlock(level, current, this.base);
            for (int dir = 0; dir <= 3; ++dir) {
                helper = current;
                helper = this.getDirectionRoot(helper, dir, 1);
                this.placeColumn(level, helper, 2, rand, 0.0, this.base);
            }
            current = this.placeColumn(level, current, 5, rand, 0.0, this.plant);
            if (rand.nextInt(8) != 0) {
                current = this.getDirectionRoot(current, rand.nextInt(4), 1);
            }
            current = this.placeColumn(level, current, 5, rand, 0.0, this.plant);
            if (rand.nextInt(8) != 0) {
                current = this.getDirectionRoot(current, rand.nextInt(4), 1);
            }
            current = this.placeColumn(level, current, 5, rand, 0.0, this.plant);
            if (rand.nextInt(5) != 0) {
                if (rand.nextInt(8) != 0) {
                    current = this.getDirectionRoot(current, rand.nextInt(4), 1);
                }
                current = this.placeColumn(level, current, 5, rand, 0.0, this.plant);
            }
            for (int dir = 0; dir <= 3; ++dir) {
                helper = current;
                helper = this.getDirectionRoot(helper, dir, 1);
                this.placeBlock(level, helper, this.petal);
            }
            current = this.placeColumn(level, current, 1, rand, 0.0, this.petal);
            int lag2 = 2;
            for (int yyy = 0; yyy < lag2; ++yyy) {
                for (int xs2 = -1; xs2 <= 1; ++xs2) {
                    for (int zs2 = -1; zs2 <= 1; ++zs2) {
                        this.placeBlock(level, new BlockPos(current.getX() + xs2, current.getY(), current.getZ() + zs2), this.petal);
                    }
                }
                current = current.above();
            }
            this.placeBlock(level, current, this.petal);
            for (int dir = 0; dir <= 3; ++dir) {
                helper = current;
                helper = this.getDirectionRoot(helper.below(2), dir, 2);
                helper = this.placeColumn(level, helper, 4, rand, 0.0, this.petal);
                helper = this.getDirectionRoot(helper, dir, 1);
                helper = this.placeColumn(level, helper, 2, rand, 0.0, this.petal);
                helper = this.getDirectionRoot(helper, dir, 1);
                helper = this.placeColumn(level, helper, 1, rand, 0.0, this.petal);
            }
            for (int dir = 0; dir <= 3; ++dir) {
                helper = current;
                helper = this.getDirectionRoot(helper.below(2), dir, 2);
                helper = this.directionToGrow(helper, (dir + 1) % 4, false);
                helper = this.directionToGrow(helper, (dir + 1) % 4, false);
                this.placeColumn(level, helper, 3, rand, 0.0, this.petal);
            }
        } else {
            return false;
        }
        return true;
    }

    private void placeBlock(WorldGenLevel level, BlockPos pos, BlockState state) {
        level.setBlock(pos, state, 3);
    }

    private BlockPos getDirectionRoot(BlockPos center, int direction, int times) {
        switch (direction) {
            case 0: return center.north(times);
            case 1: return center.east(times);
            case 2: return center.south(times);
            default: return center.west(times);
        }
    }

    private BlockPos placeColumn(WorldGenLevel level, BlockPos pos, int in, net.minecraft.util.RandomSource rand, double extraChance, BlockState state) {
        int current;
        int atm = current = pos.getY();
        int times = 0;
        BlockPos newPos = pos;
        while (current < atm + in) {
            this.placeBlock(level, newPos, state);
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
                case 0: atm = atm.north().east(); break;
                case 1: atm = atm.north().west(); break;
                case 10: atm = atm.east().north(); break;
                case 11: atm = atm.east().south(); break;
                case 20: atm = atm.south().east(); break;
                case 21: atm = atm.south().west(); break;
                case 30: atm = atm.west().north(); break;
                default: atm = atm.west().south(); break;
            }
            return atm;
        }
        switch (choice) {
            case 0: atm = atm.north(); break;
            case 1: atm = atm.east(); break;
            case 3: atm = atm.west(); break;
            default: atm = atm.south(); break;
        }
        return atm;
    }

    private boolean isReplaceable(WorldGenLevel level, BlockPos pos) {
        net.minecraft.world.level.block.state.BlockState state = level.getBlockState(pos);
        return state.isAir() || state.canBeReplaced();
    }
}