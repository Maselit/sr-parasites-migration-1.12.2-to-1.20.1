/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockStairs
 *  net.minecraft.block.BlockStairs$EnumHalf
 *  net.minecraft.block.BlockStairs$EnumShape
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.util.EnumFacing
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;

public class BlockStairBase
extends BlockStairs {
    public BlockStairBase(String name, boolean creative, IBlockState modelState) {
        super(modelState);
        this.setRegistryName(name);
        this.func_149663_c("srparasites." + name);
        this.func_180632_j(this.field_176227_L.func_177621_b().func_177226_a((IProperty)field_176309_a, (Comparable)EnumFacing.NORTH).func_177226_a((IProperty)field_176308_b, (Comparable)BlockStairs.EnumHalf.BOTTOM).func_177226_a((IProperty)field_176310_M, (Comparable)BlockStairs.EnumShape.STRAIGHT));
        this.func_149713_g(255);
        if (creative) {
            this.func_149647_a(SRPMain.SRP_CREATIVETAB);
        }
        SRPBlocks.SRP_BLOCKS.add((Block)this);
        SRPItems.SRP_ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }
}

