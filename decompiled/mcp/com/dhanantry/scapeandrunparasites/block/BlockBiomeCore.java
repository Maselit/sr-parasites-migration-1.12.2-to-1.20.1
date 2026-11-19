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
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.Explosion
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.block.BlockBase;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteNodeCore;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BlockBiomeCore
extends BlockBase {
    public static final PropertyInteger ACTIVE = PropertyInteger.create((String)"active", (int)0, (int)3);

    public BlockBiomeCore(Material material, String name, float hardness, boolean creative, boolean tickRandom, float resistance) {
        super(material, name, hardness, creative, tickRandom, resistance);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty)ACTIVE, (Comparable)Integer.valueOf(0)));
    }

    public EnumPushReaction getPushReaction(IBlockState state) {
        return EnumPushReaction.BLOCK;
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        boolean flag = super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
        if (worldIn.isRemote) {
            return flag;
        }
        int meta = this.getMetaFromState(state);
        return flag;
    }

    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        boolean flag = super.removedByPlayer(state, world, pos, player, willHarvest);
        if (world.isRemote) {
            return flag;
        }
        if (this.getMetaFromState(state) > 0) {
            ParasiteEventWorld.removeHeartInWorld(world, pos);
        }
        return flag;
    }

    public void onBlockExploded(World worldIn, BlockPos pos, Explosion explosionIn) {
        if (worldIn.isRemote) {
            return;
        }
        ParasiteEventWorld.removeHeartInWorld(worldIn, pos);
        super.onBlockExploded(worldIn, pos, explosionIn);
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        int age;
        if (worldIn.isRemote) {
            return;
        }
        if (!worldIn.isAreaLoaded(pos, 3)) {
            return;
        }
        int meta = this.getMetaFromState(state);
        if (meta > 0 && (age = ParasiteEventWorld.getHeartAgePostion(worldIn, pos)) > meta) {
            worldIn.setBlockState(pos, this.getStateFromMeta(age));
            switch (age) {
                case 2: {
                    WorldGenParasiteNodeCore tree2 = new WorldGenParasiteNodeCore(false, 2);
                    tree2.generate(worldIn, new Random(), pos.up());
                    break;
                }
                case 3: {
                    WorldGenParasiteNodeCore tree3 = new WorldGenParasiteNodeCore(false, 3);
                    tree3.generate(worldIn, new Random(), pos.up());
                }
            }
        }
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer((Block)this, new IProperty[]{ACTIVE});
    }

    public int getMetaFromState(IBlockState state) {
        return (Integer)state.getValue((IProperty)ACTIVE);
    }

    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty((IProperty)ACTIVE, (Comparable)Integer.valueOf(meta & 3));
    }
}

