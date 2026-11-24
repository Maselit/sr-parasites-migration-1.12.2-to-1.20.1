package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Migracion de WorldGenParasiteSpine a 1.20.1 (Feature).
 * STUB parcial: estructura adaptada; colocacion de escaleras/losas (BlockStairs/BlockSlab) pendiente de migracion de propiedades.
 */
public class WorldGenParasiteSpine extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteSpine() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        net.minecraft.util.RandomSource rand = context.random();
        BlockPos position = context.origin();
        int i = 28;
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
            BlockPos current = position;
            int partner = rand.nextInt(4);
            BlockPos twoCurrent = this.directionToGrow(current, partner, false);
            int atmm = (partner + 1) % 4;
            while (current.getY() >= 1 && !level.getBlockState(current.below()).isCollisionShapeFullBlock(level, current.below())) {
                current = current.below();
                twoCurrent = twoCurrent.below();
                this.placeTrunk(level, current);
                this.placeTrunk(level, twoCurrent);
            }
            // TODO: migrar colocacion de escaleras/losas (BlockStairs/BlockSlab properties) - pendiente
        } else {
            return false;
        }
        return true;
    }

    private void placeTrunk(WorldGenLevel level, BlockPos pos) {
        level.setBlock(pos, SRPBlocks.ParasiteRubble.get().defaultBlockState(), 3);
    }

    private BlockPos directionToGrow(BlockPos atm, int choice, boolean reverse) {
        if (reverse) {
            switch (choice) {
                case 0: return atm.south();
                case 1: return atm.west();
                case 3: return atm.east();
                default: return atm.north();
            }
        }
        switch (choice) {
            case 0: return atm.north();
            case 1: return atm.east();
            case 3: return atm.west();
            default: return atm.south();
        }
    }
}