package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Migracion de WorldGenParasiteGenAbstract a 1.20.1 (abstract Feature).
 */
public abstract class WorldGenParasiteGenAbstract extends Feature<NoneFeatureConfiguration> {
    public WorldGenParasiteGenAbstract() {
        super(NoneFeatureConfiguration.CODEC);
    }

    public boolean canGrowInto(Block blockType) {
        return blockType == Blocks.AIR || blockType == Blocks.GRASS_BLOCK || blockType == Blocks.DIRT || blockType == Blocks.OAK_LOG || blockType == Blocks.OAK_SAPLING || blockType == Blocks.VINE || blockType == SRPBlocks.ParasiteBush.get();
    }

    public boolean isReplaceable(net.minecraft.world.level.WorldGenLevel world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Block b = state.getBlock();
        return state.isAir() || b instanceof net.minecraft.world.level.block.LeavesBlock || b instanceof net.minecraft.world.level.block.RotatedPillarBlock || this.canGrowInto(b) || b == SRPBlocks.ParasiteBush.get();
    }
}