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
    public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.create((String)"variant", EnumType.class);

    public BlockSlabBase(Material materialIn, String name, float hardness, boolean creative, boolean tickRandom, BlockSlab half) {
        super(materialIn);
        this.setRegistryName(name);
        this.setTranslationKey("srparasites." + name);
        this.setHardness(hardness);
        if (creative) {
            this.setCreativeTab(SRPMain.SRP_CREATIVETAB);
        }
        this.useNeighborBrightness = !this.isDouble();
        IBlockState state = this.blockState.getBaseState().withProperty(VARIANT, (Comparable)((Object)EnumType.DEFAULT));
        if (!this.isDouble()) {
            state = state.withProperty((IProperty)HALF, (Comparable)BlockSlab.EnumBlockHalf.BOTTOM);
        }
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock((Block)this);
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack((Block)this, 1, ((EnumType)((Object)state.getValue(VARIANT))).ordinal());
    }

    public String getTranslationKey(int meta) {
        return super.getTranslationKey();
    }

    public IProperty<?> getVariantProperty() {
        return VARIANT;
    }

    public Comparable<?> getTypeForItem(ItemStack stack) {
        return EnumType.DEFAULT;
    }

    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        for (EnumType variant : EnumType.values()) {
            items.add((Object)new ItemStack((Block)this, 1, variant.ordinal()));
        }
    }

    public IBlockState getStateFromMeta(int meta) {
        IBlockState state = this.blockState.getBaseState().withProperty(VARIANT, (Comparable)((Object)EnumType.DEFAULT));
        if (!this.isDouble()) {
            state = state.withProperty((IProperty)HALF, (Comparable)((meta & 8) != 0 ? BlockSlab.EnumBlockHalf.TOP : BlockSlab.EnumBlockHalf.BOTTOM));
        }
        return state;
    }

    public int getMetaFromState(IBlockState state) {
        int meta = 0;
        if (!this.isDouble() && state.getValue((IProperty)HALF) == BlockSlab.EnumBlockHalf.TOP) {
            meta |= 8;
        }
        return meta;
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer((Block)this, new IProperty[]{HALF, VARIANT});
    }

    public int damageDropped(IBlockState state) {
        return this.getMetaFromState(state);
    }

    public static enum EnumType implements IStringSerializable
    {
        DEFAULT;


        public String getName() {
            return this.name().toLowerCase();
        }

        public String toString() {
            return this.getName();
        }
    }
}

