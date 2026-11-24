package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Migracion de WorldGenParasiteTreeAbstract a 1.20.1 (abstract Feature).
 */
public abstract class WorldGenParasiteTreeAbstract extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteTreeAbstract() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        return false; // abstract base; subclasses implement
    }

    protected boolean canGrowInto(Block blockType) {
        return blockType == Blocks.AIR || blockType == Blocks.GRASS_BLOCK || blockType == Blocks.DIRT || blockType == Blocks.OAK_LOG || blockType == Blocks.OAK_SAPLING || blockType == Blocks.VINE || blockType == SRPBlocks.ParasiteBush.get();
    }

    protected void setDirtAt(WorldGenLevel worldIn, BlockPos pos) {
        if (worldIn.getBlockState(pos).getBlock() != Blocks.DIRT) {
            worldIn.setBlock(pos, SRPBlocks.ParasiteStain.get().defaultBlockState(), 3);
        }
    }

    public boolean isReplaceable(WorldGenLevel world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Block b = state.getBlock();
        return state.isAir() || b instanceof net.minecraft.world.level.block.LeavesBlock || b instanceof net.minecraft.world.level.block.RotatedPillarBlock || this.canGrowInto(b) || b == SRPBlocks.ParasiteBush.get();
    }
}