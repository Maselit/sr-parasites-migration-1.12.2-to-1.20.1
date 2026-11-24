package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockBase;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteBush;
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
 * Migracion de WorldGenParasiteColonyBase a 1.20.1 (abstract Feature).
 */
public abstract class WorldGenParasiteColonyBase extends Feature<NoneFeatureConfiguration> {
    protected int type;
    protected net.minecraft.world.level.block.state.BlockState floor = SRPBlocks.ParasiteStain.get().defaultBlockState();
    protected net.minecraft.world.level.block.state.BlockState tacle = SRPBlocks.ParasiteStain.get().defaultBlockState();
    protected net.minecraft.world.level.block.state.BlockState wall = SRPBlocks.ParasiteRubbleDense.get().defaultBlockState();
    protected net.minecraft.world.level.block.state.BlockState floorColony = SRPBlocks.ParasiteRubble.get().defaultBlockState();

    public WorldGenParasiteColonyBase() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        return false; // abstract base; subclasses implement
    }

    protected void placeBlock(WorldGenLevel worldIn, BlockPos pos, net.minecraft.world.level.block.state.BlockState state) {
        worldIn.setBlock(pos, state, 3);
    }

    protected void placeVine(WorldGenLevel worldIn, BlockPos pos) {
        worldIn.setBlock(pos, SRPBlocks.ParasiteBush.get().defaultBlockState(), 3);
    }

    protected void placeReplacement(WorldGenLevel worldIn, BlockPos pos, net.minecraft.world.level.block.state.BlockState in) {
        worldIn.setBlock(pos, in, 3);
    }

    protected BlockPos getDirectionRoot(BlockPos center, int direction, int times) {
        switch (direction) {
            case 0: return center.north(times);
            case 1: return center.east(times);
            case 2: return center.south(times);
            default: return center.west(times);
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

    protected void addVines(WorldGenLevel worldIn, BlockPos position, net.minecraft.util.RandomSource rand, int longer) {
        if (!worldIn.getBlockState(position).isAir()) {
            return;
        }
        this.placeVine(worldIn, position);
        int chance = longer;
        while (worldIn.getBlockState(position.below()).isAir() && worldIn.getBlockState(position.below(2)).isAir()) {
            if (rand.nextInt(chance) == 0) {
                return;
            }
            position = position.below();
            this.placeVine(worldIn, position);
            --chance;
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
                this.placeReplacement(worldIn, neww, in);
            }
        }
    }

    protected void addFloor(WorldGenLevel worldIn, BlockPos position, int range, boolean fill) {
        if (fill) {
            this.placeReplacement(worldIn, position, this.floorColony);
        }
        // simplified: skip complex floor spreading
    }

    private void genFloorFloor(WorldGenLevel worldIn, BlockPos position, int range, boolean fill) {
        if (fill) {
            BlockPos filler = position;
            while ((worldIn.getBlockState(filler).isAir() || worldIn.getBlockState(filler).getBlock() == SRPBlocks.ParasiteBush.get() || worldIn.getBlockState(filler).getBlock() instanceof net.minecraft.world.level.block.LeavesBlock) && range > 0) {
                this.placeReplacement(worldIn, filler, this.floor);
                filler = filler.below();
                --range;
            }
        }
    }

    private void addFloorSpace(WorldGenLevel worldIn, BlockPos position) {
        // simplified
    }

    protected void addMobSpawner(WorldGenLevel worldIn, BlockPos position, int type, double chance) {
    }
}