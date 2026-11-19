/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockStairs
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.state.BlockFaceShape
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.EnumBlockRenderType
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumFacing$Plane
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$PooledMutableBlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.fluids.BlockFluidClassic
 *  net.minecraftforge.fluids.Fluid
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluid
extends BlockFluidClassic {
    private static boolean pushesEntity;

    public BlockFluid(String name, Fluid fluid, Material material, boolean pushEntities) {
        super(fluid, material);
        this.setRegistryName(name);
        this.setTranslationKey("srparasites." + name);
        pushesEntity = pushEntities;
        SRPBlocks.SRP_BLOCKS.add((Block)this);
    }

    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    public static boolean getPushesEntity() {
        return pushesEntity;
    }

    public static void setPushesEntity(boolean parPushesEntity) {
        pushesEntity = parPushesEntity;
    }

    public Vec3d modifyAcceleration(World worldIn, BlockPos pos, Entity entityIn, Vec3d motion) {
        if (BlockFluid.getPushesEntity()) {
            Vec3d flowAdder = this.getFlow((IBlockAccess)worldIn, pos, worldIn.getBlockState(pos));
            return motion.add(flowAdder);
        }
        return motion;
    }

    protected Vec3d getFlow(IBlockAccess worldIn, BlockPos pos, IBlockState state) {
        double d0 = 0.0;
        double d1 = 0.0;
        double d2 = 0.0;
        int i = this.getRenderedDepth(state);
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain();
        for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL) {
            blockpos$pooledmutableblockpos.setPos((Vec3i)pos).move(enumfacing);
            int j = this.getRenderedDepth(worldIn.getBlockState((BlockPos)blockpos$pooledmutableblockpos));
            if (j < 0) {
                if (worldIn.getBlockState((BlockPos)blockpos$pooledmutableblockpos).getMaterial().blocksMovement() || (j = this.getRenderedDepth(worldIn.getBlockState(blockpos$pooledmutableblockpos.down()))) < 0) continue;
                int k = j - (i - 8);
                d0 += (double)(enumfacing.getXOffset() * k);
                d1 += (double)(enumfacing.getYOffset() * k);
                d2 += (double)(enumfacing.getZOffset() * k);
                continue;
            }
            if (j < 0) continue;
            int l = j - i;
            d0 += (double)(enumfacing.getXOffset() * l);
            d1 += (double)(enumfacing.getYOffset() * l);
            d2 += (double)(enumfacing.getZOffset() * l);
        }
        Vec3d vec3d = new Vec3d(d0, d1, d2);
        if ((Integer)state.getValue((IProperty)LEVEL) >= 8) {
            for (EnumFacing enumfacing1 : EnumFacing.Plane.HORIZONTAL) {
                blockpos$pooledmutableblockpos.setPos((Vec3i)pos).move(enumfacing1);
                if (!this.causesDownwardCurrent(worldIn, (BlockPos)blockpos$pooledmutableblockpos, enumfacing1) && !this.causesDownwardCurrent(worldIn, blockpos$pooledmutableblockpos.up(), enumfacing1)) continue;
                vec3d = vec3d.normalize().add(0.0, -6.0, 0.0);
                break;
            }
        }
        blockpos$pooledmutableblockpos.release();
        return vec3d.normalize();
    }

    protected int getDepth(IBlockState state) {
        return state.getMaterial() == this.material ? (Integer)state.getValue((IProperty)LEVEL) : -1;
    }

    protected int getRenderedDepth(IBlockState state) {
        int i = this.getDepth(state);
        return i >= 8 ? 0 : i;
    }

    public boolean causesDownwardCurrent(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();
        Material material = iblockstate.getMaterial();
        if (material == this.material) {
            return false;
        }
        if (side == EnumFacing.UP) {
            return true;
        }
        if (material == Material.ICE) {
            return false;
        }
        boolean flag = BlockFluid.isExceptBlockForAttachWithPiston((Block)block) || block instanceof BlockStairs;
        return !flag && iblockstate.getBlockFaceShape(worldIn, pos, side) == BlockFaceShape.SOLID;
    }
}

