/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.SoundType
 *  net.minecraft.block.material.EnumPushReaction
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.util.BlockRenderLayer
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.block.BlockBase;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBloodyIce
extends BlockBase {
    private final boolean ignoreSimilarity;

    public BlockBloodyIce(Material material, String name, float hardness, boolean creative, boolean tickRandom) {
        super(material, name, hardness, creative, tickRandom);
        this.slipperiness = 0.98f;
        this.setSoundType(SoundType.GLASS);
        this.ignoreSimilarity = false;
    }

    public BlockBloodyIce(Material material, String name, float hardness, boolean creative, boolean tickRandom, float resistance) {
        this(material, name, hardness, creative, tickRandom);
        this.setResistance(resistance);
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isAreaLoaded(pos, 3)) {
            return;
        }
        if (worldIn.getBiome(pos) instanceof BiomeParasite) {
            ParasiteEventWorld.spreadBiomeBlockStain(worldIn, pos, rand);
        } else {
            int heart = ParasiteEventWorld.canBiomeStillExist(worldIn, pos, true);
            if (heart > 0) {
                ParasiteEventWorld.SpreadBiome(worldIn, pos, heart);
            }
        }
    }

    @SideOnly(value=Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    public int quantityDropped(Random random) {
        return 0;
    }

    public EnumPushReaction getPushReaction(IBlockState state) {
        return EnumPushReaction.NORMAL;
    }

    protected boolean canSilkHarvest() {
        return true;
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();
        if (block == this) {
            return false;
        }
        return !this.ignoreSimilarity && block == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    }
}

