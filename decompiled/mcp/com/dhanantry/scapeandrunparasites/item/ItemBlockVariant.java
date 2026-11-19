/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 */
package com.dhanantry.scapeandrunparasites.item;

import com.dhanantry.scapeandrunparasites.block.IMetaName;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockVariant
extends ItemBlock {
    private Enum[] variants;

    public ItemBlockVariant(Block block) {
        super(block);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.variants = ((IMetaName)block).getVariants();
    }

    public String getTranslationKey(ItemStack stack) {
        if (stack.getMetadata() > this.variants.length - 1) {
            return super.getTranslationKey() + "_" + this.variants[stack.getMetadata() & this.variants.length - 1];
        }
        return super.getTranslationKey() + "_" + this.variants[stack.getMetadata()];
    }

    public int getMetadata(int damage) {
        return damage;
    }
}

