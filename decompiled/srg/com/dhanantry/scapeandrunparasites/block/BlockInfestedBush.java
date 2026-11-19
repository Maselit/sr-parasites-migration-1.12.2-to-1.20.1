/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBush
 *  net.minecraft.block.SoundType
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyEnum
 *  net.minecraft.block.state.BlockStateContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.IStringSerializable
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.block.BlockBase;
import com.dhanantry.scapeandrunparasites.block.IMetaName;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.item.ItemBlockVariant;
import java.util.Objects;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockInfestedBush
extends BlockBush
implements IMetaName {
    protected static final AxisAlignedBB TALL_GRASS_AABB = new AxisAlignedBB(0.09999999403953552, 0.0, 0.09999999403953552, (double)0.9f, (double)0.8f, (double)0.9f);
    protected static final AxisAlignedBB REED_AABB = new AxisAlignedBB(0.125, 0.0, 0.125, 0.875, 1.0, 0.875);
    public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.func_177709_a((String)"variant", EnumType.class);

    public BlockInfestedBush(String name, float hardness) {
        super(Material.field_151582_l);
        this.setRegistryName(name);
        this.func_149663_c("srparasites." + name);
        this.func_149672_a(SoundType.field_185850_c);
        this.func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(VARIANT, (Comparable)((Object)EnumType.INFECTED)));
        this.func_149647_a(SRPMain.SRP_CREATIVETAB);
        this.func_149711_c(hardness);
        SRPBlocks.SRP_BLOCKS.add((Block)this);
        ItemBlock itemBlock = this.getItemBlock();
        SRPItems.SRP_ITEMS.add((Item)itemBlock.setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    public AxisAlignedBB func_185496_a(IBlockState state, IBlockAccess source, BlockPos pos) {
        EnumType variant = (EnumType)((Object)state.func_177229_b(VARIANT));
        if (variant == EnumType.SPINE || variant == EnumType.VINE) {
            return REED_AABB;
        }
        return TALL_GRASS_AABB;
    }

    public boolean func_180671_f(World worldIn, BlockPos pos, IBlockState state) {
        if ((EnumType)((Object)state.func_177229_b(VARIANT)) == EnumType.SPINE) {
            return this.checkBushV(worldIn.func_180495_p(pos.func_177977_b()));
        }
        if ((EnumType)((Object)state.func_177229_b(VARIANT)) == EnumType.VINE) {
            return this.checkBushV(worldIn.func_180495_p(pos.func_177984_a()));
        }
        return this.checkBush(worldIn.func_180495_p(pos.func_177977_b()));
    }

    public boolean func_176196_c(World worldIn, BlockPos pos) {
        return true;
    }

    protected boolean checkBush(IBlockState state) {
        if (!(state.func_177230_c() instanceof BlockBase)) {
            return false;
        }
        return state.func_185917_h();
    }

    protected boolean checkBushV(IBlockState state) {
        if (state.func_185917_h() && state.func_177230_c() instanceof BlockBase) {
            return true;
        }
        if (state.func_177230_c() == this && (EnumType)((Object)state.func_177229_b(VARIANT)) == EnumType.SPINE) {
            return true;
        }
        return state.func_177230_c() == this && (EnumType)((Object)state.func_177229_b(VARIANT)) == EnumType.VINE;
    }

    public void func_189540_a(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        super.func_189540_a(state, worldIn, pos, blockIn, fromPos);
        if (!this.func_180671_f(worldIn, fromPos, state)) {
            worldIn.func_175698_g(pos);
        }
    }

    protected void func_176475_e(World worldIn, BlockPos pos, IBlockState state) {
        if (!this.func_180671_f(worldIn, pos, state)) {
            this.func_176226_b(worldIn, pos, state, 0);
            worldIn.func_180501_a(pos, Blocks.field_150350_a.func_176223_P(), 3);
        }
    }

    public void func_180634_a(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        super.func_180634_a(worldIn, pos, state, entityIn);
    }

    public void func_176199_a(World worldIn, BlockPos pos, Entity entityIn) {
        super.func_176199_a(worldIn, pos, entityIn);
    }

    public boolean func_176200_f(IBlockAccess worldIn, BlockPos pos) {
        return false;
    }

    public Item func_180660_a(IBlockState state, Random rand, int fortune) {
        return null;
    }

    public void func_180657_a(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
        super.func_180657_a(worldIn, player, pos, state, te, stack);
    }

    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return false;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return false;
    }

    public int func_180651_a(IBlockState state) {
        return this.func_176201_c(state);
    }

    public void func_149666_a(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        for (EnumType variant : EnumType.values()) {
            items.add((Object)new ItemStack((Block)this, 1, variant.ordinal()));
        }
    }

    public IBlockState func_176203_a(int meta) {
        return this.func_176223_P().func_177226_a(VARIANT, (Comparable)((Object)EnumType.values()[meta]));
    }

    public int func_176201_c(IBlockState state) {
        return ((EnumType)((Object)state.func_177229_b(VARIANT))).ordinal();
    }

    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(Item.func_150898_a((Block)this), 1, this.func_176201_c(world.func_180495_p(pos)));
    }

    protected BlockStateContainer func_180661_e() {
        return new BlockStateContainer((Block)this, new IProperty[]{VARIANT});
    }

    @Override
    public Enum[] getVariants() {
        return EnumType.values();
    }

    @Override
    public ItemBlock getItemBlock() {
        return new ItemBlockVariant((Block)this);
    }

    public static enum EnumType implements IStringSerializable
    {
        INFECTED,
        GRASS1,
        FLOWER1,
        SPINE,
        VINE,
        ARC;


        public String func_176610_l() {
            return this.name().toLowerCase();
        }

        public String toString() {
            return this.func_176610_l();
        }
    }
}

