package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockParasiteStain;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Migracion de WorldGenParasiteMouth a 1.20.1 (Feature).
 */
public class WorldGenParasiteMouth extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteMouth() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        net.minecraft.util.RandomSource rand = context.random();
        BlockPos position = context.origin();
        this.genMouth(level, rand, position);
        int rana = rand.nextInt(7) + 1;
        if (rand.nextBoolean()) rana *= -1;
        int x = rana + position.getX();
        int z = position.getZ();
        if (x == 7) {
            rana = rand.nextInt(7) + 1;
            if (rand.nextBoolean()) rana *= -1;
            z += rana;
        } else {
            rana = 7;
            if (rand.nextBoolean()) rana *= -1;
            z += rana;
        }
        BlockPos newp = new BlockPos(x, position.getY(), z);
        newp = ParasiteEventEntity.getFloor(level, newp, 5);
        if (newp != null) {
            this.genMouth(level, rand, newp);
        }
        return true;
    }

    private void genMouth(WorldGenLevel level, net.minecraft.util.RandomSource rand, BlockPos position) {
        for (int yyy = 0; yyy <= 2; ++yyy) {
            for (int xs = -2; xs <= 2; ++xs) {
                for (int zs = -2; zs <= 2; ++zs) {
                    if (level.getBlockState(new BlockPos(position.getX() + xs, position.getY() + yyy, position.getZ() + zs)).getBlock() == Blocks.AIR) continue;
                    return;
                }
            }
        }
        BlockPos current = position;
        this.placePeri(level, position, 1, 2);
        this.placePeri(level, position, 2, 1);
        current = position;
        int i = 7;
        while (!(level.getBlockState(current.below()).isCollisionShapeFullBlock(level, current.below()) && i < 0) && current.below().getY() >= 2) {
            --i;
            level.setBlock(current, Blocks.AIR.defaultBlockState(), 3);
            current = current.below();
            this.placePeri(level, current, 5, 1);
        }
        this.placeFlesh(level, current);
    }

    private void placeMouth(WorldGenLevel level, BlockPos pos) {
        level.setBlock(pos, SRPBlocks.ParasiteMouth.get().defaultBlockState(), 3);
    }

    private void placeFlesh(WorldGenLevel level, BlockPos pos) {
        level.setBlock(pos, SRPBlocks.ParasiteStain.get().defaultBlockState(), 3);
    }

    private void placeColumn(WorldGenLevel level, BlockPos pos, int in, net.minecraft.util.RandomSource rand, double extraChance) {
        int current = pos.getY();
        int atm = current;
        int times = 0;
        BlockPos newPos = pos;
        while (current < atm + in && current > 2) {
            this.placeFlesh(level, newPos);
            newPos = newPos.below();
            ++current;
            ++times;
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

    private void placePeri(WorldGenLevel level, BlockPos position, int type, int area) {
        BlockPos helper = position;
        for (int i = 0; i <= 3; ++i) {
            helper = this.getDirectionRoot(position, i, area);
            this.placeColumn(level, helper.below(), 2, null, 0.0);
            if (type == 5) {
                this.placeFlesh(level, helper);
            } else if (type == 1) {
                this.placeFlesh(level, helper); // stair simplified
            } else {
                this.placeMouth(level, helper);
            }
            BlockPos rootH = helper;
            for (int o = 0; o < 2; ++o) {
                helper = (o == 0) ? this.directionToGrow(rootH, (i + 1) % 4, false) : this.directionToGrow(rootH, (i + 3) % 4, false);
                this.placeColumn(level, helper.below(), 2, null, 0.0);
                if (type == 5) {
                    this.placeFlesh(level, helper);
                } else if (type == 1) {
                    this.placeFlesh(level, helper);
                } else {
                    this.placeMouth(level, helper);
                }
            }
        }
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