package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockParasiteTrunk;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.world.gen.WorldGenCustomStructures;
import com.dhanantry.scapeandrunparasites.world.gen.structure.WorldGenStructure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Migracion de WorldGenParasiteBall a 1.20.1 (Feature).
 */
public class WorldGenParasiteBall extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteBall() {
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
        int height = level.getHeight();
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
            int extra = rand.nextInt(4);
            BlockPos current = position.above(2 + extra);
            // WorldGenCustomStructures.generateInPosition (TODO: migrar NBT structure placement)
            BlockPos center = new BlockPos(position.getX(), position.getY(), position.getZ());
            boolean skip = true;
            for (int z = 1; z <= 4; ++z) {
                if (rand.nextDouble() <= 0.5 && skip) {
                    skip = false;
                    continue;
                }
                BlockPos root = center.above(3 + extra);
                root = this.getDirectionRoot(root, z, 3);
                this.placeThin(level, root);
                root = root.below();
                this.placeThin(level, root);
                root = this.getDirectionRoot(root, z, 1);
                this.placeThin(level, root);
                while (!level.getBlockState(root.below()).isCollisionShapeFullBlock(level, root.below())) {
                    root = root.below();
                    this.placeThin(level, root);
                }
                for (int j = 1; j <= 4; ++j) {
                    BlockPos roots = this.getDirectionRoot(root, j, 1);
                    if (level.getBlockState(roots).isCollisionShapeFullBlock(level, roots)) continue;
                    this.placeThin(level, roots);
                }
            }
        } else {
            return false;
        }
        return true;
    }

    private void placeThin(WorldGenLevel level, BlockPos pos) {
        if (level.getBlockState(pos).getBlock() == Blocks.AIR) {
            level.setBlock(pos, SRPBlocks.ParasiteThin.get().defaultBlockState(), 3);
        } else {
            level.setBlock(pos, SRPBlocks.ParasiteTrunk.get().defaultBlockState().setValue(BlockParasiteTrunk.VARIANT, BlockParasiteTrunk.EnumType.TREE), 3);
        }
    }

    private boolean isReplaceable(WorldGenLevel level, BlockPos pos) {
        net.minecraft.world.level.block.state.BlockState state = level.getBlockState(pos);
        return state.isAir() || state.canBeReplaced();
    }

    private BlockPos getDirectionRoot(BlockPos center, int direction, int times) {
        switch (direction) {
            case 1: return center.north(times);
            case 2: return center.east(times);
            case 3: return center.south(times);
            default: return center.west(times);
        }
    }
}