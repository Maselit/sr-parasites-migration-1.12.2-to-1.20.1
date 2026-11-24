package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockInfestedBush;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteBush;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Migracion de WorldGenParasiteBush a 1.20.1 (Feature).
 */
public class WorldGenParasiteBush extends Feature<NoneFeatureConfiguration> {
    private final net.minecraft.world.level.block.state.BlockState tallGrassState;
    private final int type;
    private final boolean parasite;

    public WorldGenParasiteBush(BlockParasiteBush.EnumType variant, int type) {
        super(NoneFeatureConfiguration.CODEC);
        this.tallGrassState = SRPBlocks.ParasiteBush.get().defaultBlockState(); // variant handling simplified
        this.type = type;
        this.parasite = true;
    }

    public WorldGenParasiteBush(BlockInfestedBush.EnumType variant, int type) {
        super(NoneFeatureConfiguration.CODEC);
        this.tallGrassState = SRPBlocks.InfestedBush.get().defaultBlockState();
        this.type = type;
        this.parasite = false;
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        net.minecraft.util.RandomSource rand = context.random();
        BlockPos position = context.origin();
        if (this.type == 3) {
            return this.flowerGen(level, rand, position);
        }
        if (this.type == 4) {
            for (int i = 0; i < 128; ++i) {
                BlockPos blockpos = position.offset(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
                if (this.parasite) {
                    if (!level.getBlockState(blockpos).isAir() || !this.checkFloor(level, blockpos)) continue;
                    this.vinGen(level, rand, blockpos);
                } else {
                    if (!level.getBlockState(blockpos).isAir() || !this.checkFloor(level, blockpos)) continue;
                    this.vinGen(level, rand, blockpos);
                }
            }
            this.vinGen(level, rand, position);
            return true;
        }
        BlockPos pos = position;
        net.minecraft.world.level.block.state.BlockState iblockstate = level.getBlockState(pos);
        while ((iblockstate.isAir() || iblockstate.getBlock() instanceof net.minecraft.world.level.block.LeavesBlock) && pos.getY() > 0) {
            pos = pos.below();
            iblockstate = level.getBlockState(pos);
        }
        switch (this.type) {
            case 1:
                for (int i = 0; i < 128; ++i) {
                    BlockPos blockpos = pos.offset(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
                    if (!level.getBlockState(blockpos).isAir() || !this.checkFloor(level, blockpos)) continue;
                    level.setBlock(blockpos, this.tallGrassState, 2);
                }
                break;
            case 2:
                for (int i = 0; i < 4; ++i) {
                    BlockPos blockpos = pos.offset(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
                    if (!level.getBlockState(blockpos).isAir() || !this.checkFloor(level, blockpos)) continue;
                    level.setBlock(blockpos, this.tallGrassState, 2);
                }
                break;
        }
        return true;
    }

    public boolean flowerGen(WorldGenLevel level, net.minecraft.util.RandomSource rand, BlockPos position) {
        for (int i = 0; i < 64; ++i) {
            BlockPos blockpos = position.offset(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
            if (!level.getBlockState(blockpos).isAir() || blockpos.getY() >= level.getMaxBuildHeight() || !this.checkFloor(level, blockpos)) continue;
            level.setBlock(blockpos, this.tallGrassState, 2);
        }
        return true;
    }

    public boolean vinGen(WorldGenLevel level, net.minecraft.util.RandomSource rand, BlockPos position) {
        for (int i = 0; i < 10; ++i) {
            BlockPos blockpos = position.offset(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
            if (!level.getBlockState(blockpos).isAir()) continue;
            int j = 1 + rand.nextInt(rand.nextInt(3) + 3);
            for (int k = 0; k < j; ++k) {
                if (!level.getBlockState(blockpos.above(k)).isAir()) continue;
                level.setBlock(blockpos.above(k), this.tallGrassState, 2);
            }
        }
        return true;
    }

    private boolean checkFloor(WorldGenLevel level, BlockPos position) {
        return level.getBlockState(position.below()).isCollisionShapeFullBlock(level, position.below());
    }
}