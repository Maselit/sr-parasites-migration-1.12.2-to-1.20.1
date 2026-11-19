/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockSlab
 *  net.minecraft.block.BlockSlab$EnumBlockHalf
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyEnum
 *  net.minecraft.block.state.BlockStateContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.IStringSerializable
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.SRPMain;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class BlockSlabBase
extends BlockSlab {
    public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.func_177709_a((String)"variant", EnumType.class);

    public BlockSlabBase(Material materialIn, String name, float hardness, boolean creative, boolean tickRandom, BlockSlab half) {
        super(materialIn);
        this.setRegistryName(name);
        this.func_149663_c("srparasites." + name);
        this.func_149711_c(hardness);
        if (creative) {
            this.func_149647_a(SRPMain.SRP_CREATIVETAB);
        }
        this.field_149783_u = !this.func_176552_j();
        IBlockState state = this.field_176227_L.func_177621_b().func_177226_a(VARIANT, (Comparable)((Object)EnumType.DEFAULT));
        if (!this.func_176552_j()) {
            state = state.func_177226_a((IProperty)field_176554_a, (Comparable)BlockSlab.EnumBlockHalf.BOTTOM);
        }
    }

    public Item func_180660_a(IBlockState state, Random rand, int fortune) {
        return Item.func_150898_a((Block)this);
    }

    public ItemStack func_185473_a(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack((Block)this, 1, ((EnumType)((Object)state.func_177229_b(VARIANT))).ordinal());
    }

    public String func_150002_b(int meta) {
        return super.func_149739_a();
    }

    public IProperty<?> func_176551_l() {
        return VARIANT;
    }

    public Comparable<?> func_185674_a(ItemStack stack) {
        return EnumType.DEFAULT;
    }

    public void func_149666_a(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        for (EnumType variant : EnumType.values()) {
            items.add((Object)new ItemStack((Block)this, 1, variant.ordinal()));
        }
    }

    public IBlockState func_176203_a(int meta) {
        IBlockState state = this.field_176227_L.func_177621_b().func_177226_a(VARIANT, (Comparable)((Object)EnumType.DEFAULT));
        if (!this.func_176552_j()) {
            state = state.func_177226_a((IProperty)field_176554_a, (Comparable)((meta & 8) != 0 ? BlockSlab.EnumBlockHalf.TOP : BlockSlab.EnumBlockHalf.BOTTOM));
        }
        return state;
    }

    public int func_176201_c(IBlockState state) {
        int meta = 0;
        if (!this.func_176552_j() && state.func_177229_b((IProperty)field_176554_a) == BlockSlab.EnumBlockHalf.TOP) {
            meta |= 8;
        }
        return meta;
    }

    protected BlockStateContainer func_180661_e() {
        return new BlockStateContainer((Block)this, new IProperty[]{field_176554_a, VARIANT});
    }

    public int func_180651_a(IBlockState state) {
        return this.func_176201_c(state);
    }

    public static enum EnumType implements IStringSerializable
    {
        DEFAULT;


        public String func_176610_l() {
            return this.name().toLowerCase();
        }

        public String toString() {
            return this.func_176610_l();
        }
    }
}

