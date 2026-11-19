/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.block.IMetaName;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase
extends Block {
    public BlockBase(Material material, String name, float hardness, boolean creative, boolean tickRandom) {
        super(material);
        this.setRegistryName(name);
        this.func_149663_c("srparasites." + name);
        this.func_149711_c(hardness);
        this.func_149675_a(tickRandom);
        if (creative) {
            this.func_149647_a(SRPMain.SRP_CREATIVETAB);
        }
        SRPBlocks.SRP_BLOCKS.add(this);
        ItemBlock itemBlock = this instanceof IMetaName ? ((IMetaName)((Object)this)).getItemBlock() : new ItemBlock((Block)this);
        SRPItems.SRP_ITEMS.add((Item)itemBlock.setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    public BlockBase(Material material, String name, float hardness, boolean creative, boolean tickRandom, float resistance) {
        this(material, name, hardness, creative, tickRandom);
        this.func_149752_b(resistance);
    }
}

