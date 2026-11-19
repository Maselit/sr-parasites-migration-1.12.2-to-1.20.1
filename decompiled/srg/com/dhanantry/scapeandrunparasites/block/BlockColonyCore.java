/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.EnumPushReaction
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyInteger
 *  net.minecraft.block.state.BlockStateContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.Explosion
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.block.BlockBase;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.preeminent.EntityTenn;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BlockColonyCore
extends BlockBase {
    public static final PropertyInteger ACTIVE = PropertyInteger.func_177719_a((String)"active", (int)0, (int)3);

    public BlockColonyCore(Material material, String name, float hardness, boolean creative, boolean tickRandom, float resistance) {
        super(material, name, hardness, creative, tickRandom, resistance);
        this.func_180632_j(this.field_176227_L.func_177621_b().func_177226_a((IProperty)ACTIVE, (Comparable)Integer.valueOf(0)));
    }

    public EnumPushReaction func_149656_h(IBlockState state) {
        return EnumPushReaction.BLOCK;
    }

    public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        boolean flag = super.func_180639_a(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
        if (worldIn.field_72995_K) {
            return flag;
        }
        int meta = this.func_176201_c(state);
        System.out.println("meta " + meta);
        System.out.println(" ");
        return flag;
    }

    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        boolean flag = super.removedByPlayer(state, world, pos, player, willHarvest);
        if (world.field_72995_K) {
            return flag;
        }
        if (this.func_176201_c(state) > 0) {
            ParasiteEventWorld.removeColonyInWorld(world, pos);
        }
        return flag;
    }

    public void onBlockExploded(World worldIn, BlockPos pos, Explosion explosionIn) {
        if (worldIn.field_72995_K) {
            return;
        }
        ParasiteEventWorld.removeColonyInWorld(worldIn, pos);
        super.onBlockExploded(worldIn, pos, explosionIn);
    }

    public void func_180650_b(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        AxisAlignedBB axisalignedbb;
        List moblist;
        if (worldIn.field_72995_K) {
            return;
        }
        if (!worldIn.func_175697_a(pos, 3)) {
            return;
        }
        int meta = this.func_176201_c(state);
        if (meta > 0 && (moblist = worldIn.func_72872_a(EntityTenn.class, axisalignedbb = new AxisAlignedBB((double)pos.func_177958_n(), (double)pos.func_177956_o(), (double)pos.func_177952_p(), (double)(pos.func_177958_n() + 1), (double)(pos.func_177956_o() + 1), (double)(pos.func_177952_p() + 1)).func_72314_b(20.0, 5.0, 20.0))).isEmpty()) {
            ParasiteEventEntity.spawnFromBlock(worldIn, new String[]{"srparasites:architect;1"}, 5, pos.func_177984_a());
            ParasiteEventEntity.spawnFromBlock(worldIn, new String[]{"srparasites:architect;1"}, 5, pos.func_177984_a());
        }
    }

    protected BlockStateContainer func_180661_e() {
        return new BlockStateContainer((Block)this, new IProperty[]{ACTIVE});
    }

    public int func_176201_c(IBlockState state) {
        return (Integer)state.func_177229_b((IProperty)ACTIVE);
    }

    public IBlockState func_176203_a(int meta) {
        return this.func_176223_P().func_177226_a((IProperty)ACTIVE, (Comparable)Integer.valueOf(meta & 3));
    }
}

