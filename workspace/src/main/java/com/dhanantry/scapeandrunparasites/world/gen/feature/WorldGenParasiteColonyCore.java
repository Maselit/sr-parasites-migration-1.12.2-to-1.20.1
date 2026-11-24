package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockBiomeCore;
import com.dhanantry.scapeandrunparasites.block.BlockColonyCore;
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
 * Migracion de WorldGenParasiteColonyCore a 1.20.1 (Feature).
 */
public class WorldGenParasiteColonyCore extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteColonyCore() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        net.minecraft.util.RandomSource rand = context.random();
        BlockPos position = context.origin();
        int core = 1;
        this.placeDirt(level, position.below());
        this.placeCore(level, position, core);
        BlockPos helper = position;
        for (int i = 0; i <= 3; ++i) {
            helper = this.directionToGrow(position, i, false);
            if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                this.placeTrunk(level, helper.below());
            }
            this.placeTrunk(level, helper);
            BlockPos rootH = helper;
            for (int o = 0; o < 2; ++o) {
                helper = (o == 0) ? this.directionToGrow(rootH, (i + 1) % 4, false) : this.directionToGrow(rootH, (i + 3) % 4, false);
                if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                    this.placeTrunk(level, helper.below());
                }
                this.placeTrunk(level, helper);
            }
            helper = this.directionToGrow(rootH, i, false);
            if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                this.placeTrunk(level, helper.below());
            }
            this.placeTrunk(level, helper);
            rootH = helper;
            for (int o = 0; o < 2; ++o) {
                helper = (o == 0) ? this.directionToGrow(rootH, (i + 1) % 4, false) : this.directionToGrow(rootH, (i + 3) % 4, false);
                if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                    this.placeTrunk(level, helper.below());
                }
                this.placeTrunk(level, helper);
            }
            helper = this.directionToGrow(rootH, i, false);
            if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                this.placeTrunk(level, helper.below());
            }
            this.placeTrunk(level, helper);
        }
        position = position.above();
        this.placeTrunk(level, position);
        this.placePeri(level, position);
        position = position.above();
        this.placeTrunk(level, position);
        return true;
    }

    private void placeTen(WorldGenLevel level, BlockPos pos) {
        level.setBlock(pos, SRPBlocks.ParasiteStain.get().defaultBlockState(), 3);
    }

    private void placeTrunk(WorldGenLevel level, BlockPos pos) {
        level.setBlock(pos, SRPBlocks.ParasiteRubbleDense.get().defaultBlockState(), 3);
    }

    private void placeCore(WorldGenLevel level, BlockPos pos, int stage) {
        level.setBlock(pos, SRPBlocks.BiomeHeart.get().defaultBlockState().setValue(BlockBiomeCore.ACTIVE, stage), 3);
    }

    private void placeDirt(WorldGenLevel level, BlockPos pos) {
        level.setBlock(pos, SRPBlocks.ParasiteStain.get().defaultBlockState(), 3);
    }

    private void placePeri(WorldGenLevel level, BlockPos position) {
        BlockPos helper = position;
        for (int i = 0; i <= 3; ++i) {
            helper = this.directionToGrow(position, i, false);
            if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                this.placeTrunk(level, helper.below());
            }
            this.placeTrunk(level, helper);
            BlockPos rootH = helper;
            for (int o = 0; o < 2; ++o) {
                helper = (o == 0) ? this.directionToGrow(rootH, (i + 1) % 4, false) : this.directionToGrow(rootH, (i + 3) % 4, false);
                if (!level.getBlockState(helper.below()).isCollisionShapeFullBlock(level, helper.below())) {
                    this.placeTrunk(level, helper.below());
                }
                this.placeTrunk(level, helper);
            }
        }
    }

    private BlockPos getDirectionRoot(BlockPos center, int direction, int times) {
        switch (direction) {
            case 0: return center.north(times);
            case 1: return center.east(times);
            case 2: return center.south(times);
            default: return center.west(times);
        }
    }

    private BlockPos directionToGrow(BlockPos atm, int choice, boolean sideCurse) {
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

    private BlockPos placeColumn(WorldGenLevel level, BlockPos pos, int in, net.minecraft.util.RandomSource rand, double extraChance) {
        int current;
        int atm = current = pos.getY();
        int times = 0;
        BlockPos newPos = pos;
        while (current < atm + in) {
            this.placeTen(level, newPos);
            newPos = newPos.below();
            ++current;
            ++times;
        }
        this.placeTen(level, newPos);
        return newPos;
    }

    private boolean isReplaceable(WorldGenLevel level, BlockPos pos) {
        net.minecraft.world.level.block.state.BlockState state = level.getBlockState(pos);
        return state.isAir() || state.canBeReplaced();
    }
}