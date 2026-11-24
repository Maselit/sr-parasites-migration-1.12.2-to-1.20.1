package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockParasiteCanister;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteTrunk;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Migracion de WorldGenParasiteTreeThin a 1.20.1 (Feature).
 */
public class WorldGenParasiteTreeThin extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteTreeThin() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        net.minecraft.util.RandomSource rand = context.random();
        BlockPos position = context.origin();
        int i = 16;
        boolean flag = true;
        if (level.getBlockState(position.below()).getBlock() == Blocks.AIR) {
            return false;
        }
        int height = level.getMaxBuildHeight();
        if (position.getY() >= 1 && position.getY() + i + 1 <= height) {
            for (int j = position.getY(); j <= position.getY() + 1 + i; ++j) {
                int k = 1;
                if (j == position.getY()) k = 0;
                if (j >= position.getY() + 1 + i - 2) k = 2;
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
            BlockPos current = position;
            while (current.getY() >= 1 && !level.getBlockState(current.below()).isCollisionShapeFullBlock(level, current.below())) {
                current = current.below();
                this.placeTrunk(level, current);
            }
            current = position;
            current = this.placeColumn(level, current, 3, rand, 0.0, 4);
            this.grow(level, current.north(), rand, 1);
            this.grow(level, current.east(), rand, 2);
            this.grow(level, current.south(), rand, 3);
            this.grow(level, current.west(), rand, 4);
        } else {
            return false;
        }
        return true;
    }

    private void placeThin(WorldGenLevel level, BlockPos pos) {
        if (level.getBlockState(pos).getBlock() == Blocks.AIR) {
            level.setBlock(pos, SRPBlocks.ParasiteThin.get().defaultBlockState(), 3);
        }
    }

    private void placeCanister(WorldGenLevel level, BlockPos pos) {
        level.setBlock(pos, SRPBlocks.ParasiteCanister.get().defaultBlockState(), 3);
    }

    private void placeTrunk(WorldGenLevel level, BlockPos pos) {
        level.setBlock(pos, SRPBlocks.ParasiteTrunk.get().defaultBlockState().setValue(BlockParasiteTrunk.VARIANT, BlockParasiteTrunk.EnumType.TREE), 3);
    }

    private BlockPos placeColumn(WorldGenLevel level, BlockPos pos, int times, net.minecraft.util.RandomSource rand, double extraChance, int minimum) {
        int current;
        int atm = current = pos.getY();
        BlockPos newPos = pos;
        times = rand.nextInt(times) + minimum;
        if (level.getBlockState(pos.below()).getBlock() == Blocks.AIR && rand.nextDouble() <= extraChance) {
            this.placeCanister(level, pos.below());
        }
        while (current < atm + times && minimum != 1) {
            this.placeThin(level, newPos);
            newPos = newPos.above();
            ++current;
        }
        this.placeThin(level, newPos);
        return newPos;
    }

    private void grow(WorldGenLevel level, BlockPos pos, net.minecraft.util.RandomSource rand, int direction) {
        pos = this.placeColumn(level, pos, 2, rand, 0.3, 2);
        if (rand.nextInt(3) == 0) {
            pos = this.directionToGrow(pos, direction);
            pos = this.placeColumn(level, pos, 3, rand, 0.5, 2);
            if (rand.nextInt(5) == 0) {
                pos = this.directionToGrow(pos, direction);
                pos = this.placeColumn(level, pos, 3, rand, 0.7, 2);
            } else {
                pos = this.directionToGrow(pos, direction);
                pos = this.placeColumn(level, pos, 1, rand, 0.7, 1);
            }
        } else {
            pos = this.directionToGrow(pos, direction);
            pos = this.placeColumn(level, pos, 1, rand, 0.5, 1);
        }
    }

    private BlockPos directionToGrow(BlockPos pos, int choice) {
        switch (choice) {
            case 1: return pos.north();
            case 2: return pos.east();
            case 3: return pos.south();
            default: return pos.west();
        }
    }

    private boolean isReplaceable(WorldGenLevel level, BlockPos pos) {
        net.minecraft.world.level.block.state.BlockState state = level.getBlockState(pos);
        return state.isAir() || state.canBeReplaced();
    }
}