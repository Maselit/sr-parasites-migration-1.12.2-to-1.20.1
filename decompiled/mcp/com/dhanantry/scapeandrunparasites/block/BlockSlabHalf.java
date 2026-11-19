/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockSlab
 *  net.minecraft.block.material.Material
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.block.BlockSlabBase;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

public class BlockSlabHalf
extends BlockSlabBase {
    public BlockSlabHalf(Material materialIn, String name, float hardness, boolean creative, boolean tickRandom, BlockSlab half, BlockSlab doubleSlab) {
        super(materialIn, name, hardness, creative, tickRandom, half);
        SRPBlocks.SRP_BLOCKS.add((Block)this);
    }

    public boolean isDouble() {
        return false;
    }
}

