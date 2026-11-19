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
        this.func_149663_c("srparasites." + name);
        pushesEntity = pushEntities;
        SRPBlocks.SRP_BLOCKS.add((Block)this);
    }

    public EnumBlockRenderType func_149645_b(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    public static boolean getPushesEntity() {
        return pushesEntity;
    }

    public static void setPushesEntity(boolean parPushesEntity) {
        pushesEntity = parPushesEntity;
    }

    public Vec3d func_176197_a(World worldIn, BlockPos pos, Entity entityIn, Vec3d motion) {
        if (BlockFluid.getPushesEntity()) {
            Vec3d flowAdder = this.getFlow((IBlockAccess)worldIn, pos, worldIn.func_180495_p(pos));
            return motion.func_178787_e(flowAdder);
        }
        return motion;
    }

    protected Vec3d getFlow(IBlockAccess worldIn, BlockPos pos, IBlockState state) {
        double d0 = 0.0;
        double d1 = 0.0;
        double d2 = 0.0;
        int i = this.getRenderedDepth(state);
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.func_185346_s();
        for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL) {
            blockpos$pooledmutableblockpos.func_189533_g((Vec3i)pos).func_189536_c(enumfacing);
            int j = this.getRenderedDepth(worldIn.func_180495_p((BlockPos)blockpos$pooledmutableblockpos));
            if (j < 0) {
                if (worldIn.func_180495_p((BlockPos)blockpos$pooledmutableblockpos).func_185904_a().func_76230_c() || (j = this.getRenderedDepth(worldIn.func_180495_p(blockpos$pooledmutableblockpos.func_177977_b()))) < 0) continue;
                int k = j - (i - 8);
                d0 += (double)(enumfacing.func_82601_c() * k);
                d1 += (double)(enumfacing.func_96559_d() * k);
                d2 += (double)(enumfacing.func_82599_e() * k);
                continue;
            }
            if (j < 0) continue;
            int l = j - i;
            d0 += (double)(enumfacing.func_82601_c() * l);
            d1 += (double)(enumfacing.func_96559_d() * l);
            d2 += (double)(enumfacing.func_82599_e() * l);
        }
        Vec3d vec3d = new Vec3d(d0, d1, d2);
        if ((Integer)state.func_177229_b((IProperty)LEVEL) >= 8) {
            for (EnumFacing enumfacing1 : EnumFacing.Plane.HORIZONTAL) {
                blockpos$pooledmutableblockpos.func_189533_g((Vec3i)pos).func_189536_c(enumfacing1);
                if (!this.causesDownwardCurrent(worldIn, (BlockPos)blockpos$pooledmutableblockpos, enumfacing1) && !this.causesDownwardCurrent(worldIn, blockpos$pooledmutableblockpos.func_177984_a(), enumfacing1)) continue;
                vec3d = vec3d.func_72432_b().func_72441_c(0.0, -6.0, 0.0);
                break;
            }
        }
        blockpos$pooledmutableblockpos.func_185344_t();
        return vec3d.func_72432_b();
    }

    protected int getDepth(IBlockState state) {
        return state.func_185904_a() == this.field_149764_J ? (Integer)state.func_177229_b((IProperty)LEVEL) : -1;
    }

    protected int getRenderedDepth(IBlockState state) {
        int i = this.getDepth(state);
        return i >= 8 ? 0 : i;
    }

    public boolean causesDownwardCurrent(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        IBlockState iblockstate = worldIn.func_180495_p(pos);
        Block block = iblockstate.func_177230_c();
        Material material = iblockstate.func_185904_a();
        if (material == this.field_149764_J) {
            return false;
        }
        if (side == EnumFacing.UP) {
            return true;
        }
        if (material == Material.field_151588_w) {
            return false;
        }
        boolean flag = BlockFluid.func_193382_c((Block)block) || block instanceof BlockStairs;
        return !flag && iblockstate.func_193401_d(worldIn, pos, side) == BlockFaceShape.SOLID;
    }
}

