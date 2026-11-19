/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.ITileEntityProvider
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.block.BlockBase;
import com.dhanantry.scapeandrunparasites.entity.tile.TileEntityDod;
import java.util.Random;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockDod
extends BlockBase
implements ITileEntityProvider {
    public BlockDod(String name, float hardness, boolean creative, boolean tickRandom, float resistance) {
        super(Material.field_151583_m, name, hardness, creative, tickRandom, resistance);
        this.func_180632_j(this.field_176227_L.func_177621_b());
    }

    public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        boolean flag = super.func_180639_a(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
        return flag;
    }

    public void func_180650_b(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (worldIn.field_72995_K) {
            return;
        }
        if (!worldIn.func_175697_a(pos, 3)) {
            return;
        }
    }

    public TileEntity func_149915_a(World worldIn, int meta) {
        return new TileEntityDod();
    }

    public void func_180663_b(World worldIn, BlockPos pos, IBlockState state) {
        worldIn.func_175713_t(pos);
        super.func_180663_b(worldIn, pos, state);
    }
}

