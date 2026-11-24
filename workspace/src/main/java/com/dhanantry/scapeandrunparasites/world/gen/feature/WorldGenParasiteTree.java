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
 * Migracion de WorldGenParasiteTree a 1.20.1 (Feature).
 */
public class WorldGenParasiteTree extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteTree() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        net.minecraft.util.RandomSource rand = context.random();
        BlockPos position = context.origin();
        int i = 20;
        boolean flag = true;
        if (level.getBlockState(position.below()).getBlock() == Blocks.AIR) {
            return false;
        }
        int height = level.getMaxBuildHeight();
        BlockPos current = position;
        if (position.getY() >= 1 && position.getY() + i + 1 <= height) {
            for (int j = position.getY(); j <= position.getY() + 1 + i; ++j) {
                int k = 1;
                if (j == position.getY()) k = 0;
                if (j >= position.getY() + 1 + i - 2) k = 2;
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
            int first = rand.nextInt(4);
            current = this.directionToGrow(current, first, false);
            this.placeTrunk(level, current);
            while (current.getY() >= 1 && !level.getBlockState(current.below()).isCollisionShapeFullBlock(level, current.below())) {
                current = current.below();
                this.placeTrunk(level, current);
            }
            current = position;
            current = this.directionToGrow(current, ++first % 4, false);
            this.placeTrunk(level, current);
            while (current.getY() >= 1 && !level.getBlockState(current.below()).isCollisionShapeFullBlock(level, current.below())) {
                current = current.below();
                this.placeTrunk(level, current);
            }
            current = position;
            while (current.getY() >= 1 && !level.getBlockState(current.below()).isCollisionShapeFullBlock(level, current.below())) {
                current = current.below();
                this.placeTrunk(level, current);
            }
            current = position;
            current = this.placeColumn(level, current, rand.nextInt(3) + 5, rand, -1.0);
            first = rand.nextInt(4);
            current = this.directionToGrow(current, first, false);
            current = this.placeColumn(level, current, rand.nextInt(3) + 5, rand, 0.3);
            if (rand.nextDouble() <= 0.3) return true;
            current = this.directionToGrow(current, rand.nextInt(4), false);
            current = this.placeColumn(level, current, rand.nextInt(3) + 5, rand, 0.3);
            if (rand.nextDouble() <= 0.3) return true;
        } else {
            return false;
        }
        current = this.directionToGrow(current, rand.nextInt(4), false);
        current = this.placeColumn(level, current, rand.nextInt(3) + 5, rand, 0.3);
        return true;
    }

    private void placeTrunk(WorldGenLevel level, BlockPos pos) {
        level.setBlock(pos, SRPBlocks.ParasiteTrunk.get().defaultBlockState().setValue(BlockParasiteTrunk.VARIANT, BlockParasiteTrunk.EnumType.TREE), 3);
    }

    private void placeTrunk(WorldGenLevel level, BlockPos pos, int direction) {
        level.setBlock(pos, SRPBlocks.ParasiteTrunk.get().defaultBlockState().setValue(BlockParasiteTrunk.VARIANT, BlockParasiteTrunk.EnumType.TREE), 3);
    }

    private void placeCanister(WorldGenLevel level, BlockPos pos) {
        level.setBlock(pos, SRPBlocks.ParasiteCanister.get().defaultBlockState(), 3);
    }

    private BlockPos placeColumn(WorldGenLevel level, BlockPos pos, int in, net.minecraft.util.RandomSource rand, double extraChance) {
        int current;
        int atm = current = pos.getY();
        int times = 0;
        BlockPos newPos = pos;
        if (level.getBlockState(pos.below()).getBlock() == net.minecraft.world.level.block.Blocks.AIR && rand.nextDouble() <= 0.3 + extraChance) {
            this.placeCanister(level, pos.below());
        }
        while (current < atm + in) {
            if (times == 2 && extraChance != -1.0) {
                int bone = rand.nextInt(4);
                int btwo = rand.nextInt(4);
                if (bone == btwo) ++bone;
                this.addBranchs(level, newPos, rand, rand.nextInt(3) + 1, bone);
                this.addBranchs(level, newPos, rand, rand.nextInt(3) + 1, btwo);
            }
            this.placeTrunk(level, newPos);
            newPos = newPos.above();
            ++current;
            ++times;
        }
        this.placeTrunk(level, newPos);
        return newPos;
    }

    private void addBranchs(WorldGenLevel level, BlockPos pos, net.minecraft.util.RandomSource rand, int size, int direction) {
        pos = this.directionToGrow(pos, direction, false);
        this.placeTrunk(level, pos);
        pos = pos.above();
        pos = this.directionToGrow(pos, direction, false);
        int curve = direction * 10 + rand.nextInt(2);
        for (int current = 0; current < size; ++current) {
            this.placeTrunk(level, pos);
            if (rand.nextDouble() <= 0.25) {
                this.placeCanister(level, pos.below());
            }
            pos = rand.nextDouble() <= 0.5 ? this.directionToGrow(pos, direction, false) : this.directionToGrow(pos, curve, true);
        }
        pos = pos.below();
        this.placeTrunk(level, pos);
        if (rand.nextDouble() <= 0.25) {
            this.placeCanister(level, pos.below());
        }
        if (rand.nextDouble() <= 0.5) {
            pos = rand.nextDouble() <= 0.5 ? this.directionToGrow(pos.below(), direction, false) : this.directionToGrow(pos.below(), curve, true);
            this.placeTrunk(level, pos);
            if (rand.nextDouble() <= 0.25) {
                this.placeCanister(level, pos.below());
            }
        }
    }

    private BlockPos directionToGrow(BlockPos atm, int choice, boolean sideCurse) {
        if (sideCurse) {
            switch (choice) {
                case 0: return atm.north().east();
                case 1: return atm.north().west();
                case 10: return atm.east().north();
                case 11: return atm.east().south();
                case 30: return atm.south().east();
                case 31: return atm.south().west();
                case 20: return atm.west().north();
                default: return atm.west().south();
            }
        }
        switch (choice) {
            case 0: return atm.north();
            case 1: return atm.east();
            case 2: return atm.west();
            default: return atm.south();
        }
    }

    private boolean isReplaceable(WorldGenLevel level, BlockPos pos) {
        net.minecraft.world.level.block.state.BlockState state = level.getBlockState(pos);
        return state.isAir() || state.canBeReplaced();
    }
}