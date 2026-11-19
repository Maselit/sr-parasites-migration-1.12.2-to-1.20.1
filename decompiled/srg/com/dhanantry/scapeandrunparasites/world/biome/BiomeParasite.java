/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.biome.Biome
 *  net.minecraft.world.biome.Biome$BiomeProperties
 *  net.minecraft.world.gen.feature.WorldGenAbstractTree
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.world.biome;

import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasiteDecorator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class BiomeParasite
extends Biome {
    protected WorldGenAbstractTree tree;

    public BiomeParasite(Biome.BiomeProperties properties) {
        super(properties.func_185396_a());
        this.field_76752_A = SRPBlocks.ParasiteStain.func_176223_P();
        this.field_76753_B = SRPBlocks.ParasiteStain.func_176223_P();
        this.field_76760_I = new BiomeParasiteDecorator();
    }

    public void mobListClear() {
        this.field_76762_K.clear();
        this.field_76761_J.clear();
        this.field_76755_L.clear();
        this.field_82914_M.clear();
    }

    @SideOnly(value=Side.CLIENT)
    public int func_76731_a(float currentTemperature) {
        return SRPConfigWorld.biomeSkyColor;
    }

    @SideOnly(value=Side.CLIENT)
    public int func_180627_b(BlockPos blockPos) {
        return SRPConfigWorld.biomeGrassColor;
    }

    @SideOnly(value=Side.CLIENT)
    public int func_180625_c(BlockPos blockPos) {
        return SRPConfigWorld.biomeFoliageColor;
    }

    public int getWaterColorMultiplier() {
        return SRPConfigWorld.biomeWaterColor;
    }
}

