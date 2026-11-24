package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockParasiteTrunk;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Migracion de WorldGenParasiteBigBall a 1.20.1 (Feature).
 */
public class WorldGenParasiteBigBall extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteBigBall() {
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
            int extra = rand.nextInt(6) + 2;
            // WorldGenCustomStructures.generateInPosition (TODO: migrar NBT structure placement)
            BlockPos center = new BlockPos(position.getX(), position.getY(), position.getZ());
            boolean skip = true;
            for (int z = 0; z <= 3; ++z) {
                if (rand.nextDouble() <= 0.15 && skip) {
                    skip = false;
                    continue;
                }
                BlockPos root = center.above(12 + extra);
                root = this.getDirectionRoot(root, z, 4);
                root = this.placeColumn(level, root, 3, rand);
                int direction = rand.nextInt(4);
                boolean glag = true;
                boolean side = false;
                while (glag) {
                    int grow = rand.nextInt(4) + 2;
                    root = this.directionToGrow(root.below(), direction, side);
                    if (rand.nextDouble() <= 0.2) {
                        BlockPos atm = this.directionToGrow(root, direction, !side);
                        this.placeColumn(level, this.directionToGrow(atm, direction, !side), grow, rand);
                    }
                    root = this.placeColumn(level, root, grow, rand);
                    root = this.directionToGrow(root.below(), direction, !side);
                    root = this.placeColumn(level, root, rand.nextInt(2) + 2, rand);
                    side = !side;
                    glag = level.getBlockState(root).isCollisionShapeFullBlock(level, root);
                    direction = rand.nextInt(4);
                }
            }
        } else {
            return false;
        }
        return true;
    }

    private void placeTrunk(WorldGenLevel level, BlockPos pos) {
        level.setBlock(pos, SRPBlocks.ParasiteTrunk.get().defaultBlockState().setValue(BlockParasiteTrunk.VARIANT, BlockParasiteTrunk.EnumType.TREE), 3);
    }

    private BlockPos getDirectionRoot(BlockPos center, int direction, int times) {
        switch (direction) {
            case 0: return center.north(times);
            case 1: return center.east(times);
            case 3: return center.west(times);
            default: return center.south(times);
        }
    }

    private BlockPos placeColumn(WorldGenLevel level, BlockPos pos, int in, net.minecraft.util.RandomSource rand) {
        --in;
        int current = pos.getY();
        int atm = current;
        BlockPos newPos = pos;
        int times = 0;
        while (current > atm - in) {
            this.placeTrunk(level, newPos);
            newPos = newPos.below();
            --current;
            ++times;
        }
        this.placeTrunk(level, newPos);
        return newPos;
    }

    private BlockPos directionToGrow(BlockPos atm, int choice, boolean reverse) {
        if (reverse) {
            switch (choice) {
                case 0: atm = atm.south(); break;
                case 1: atm = atm.west(); break;
                case 3: atm = atm.east(); break;
                default: atm = atm.north(); break;
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