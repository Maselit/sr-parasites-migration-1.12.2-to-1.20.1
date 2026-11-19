/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.init.MobEffects
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.ItemStack
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.block.BlockBase;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedRubble;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedStain;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.network.SRPPacketParticle;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class BlockBiomePurifier
extends BlockBase {
    public BlockBiomePurifier(String name, float hardness, boolean creative, boolean tickRandom, float resistance) {
        super(Material.field_151583_m, name, hardness, creative, tickRandom, resistance);
        this.func_180632_j(this.field_176227_L.func_177621_b());
    }

    public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        boolean flag = super.func_180639_a(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
        if (worldIn.field_72995_K) {
            return flag;
        }
        ItemStack head = new ItemStack(playerIn.func_184582_a(EntityEquipmentSlot.MAINHAND).func_77973_b());
        if (head.func_77973_b() != Items.field_190931_a) {
            return flag;
        }
        ParasiteEventWorld.killBiome(worldIn, pos, 16);
        worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());
        for (int i = 0; i <= 3; ++i) {
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle((double)pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, (double)pos.func_177952_p() + 0.5, 0.5f, 0.5f, 2));
        }
        return flag;
    }

    public void func_180650_b(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (worldIn.field_72995_K) {
            return;
        }
        if (!worldIn.func_175697_a(pos, 3)) {
            return;
        }
        int raan = 32;
        AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)pos.func_177958_n(), (double)pos.func_177956_o(), (double)pos.func_177952_p(), (double)(pos.func_177958_n() + 1), (double)(pos.func_177956_o() + 1), (double)(pos.func_177952_p() + 1)).func_186662_g((double)raan);
        List moblist = worldIn.func_72872_a(EntityParasiteBase.class, axisalignedbb);
        boolean oneTime = true;
        if (!moblist.isEmpty()) {
            for (EntityParasiteBase mob : moblist) {
                if (oneTime && mob instanceof EntityPStationaryArchitect) {
                    mob.func_70690_d(new PotionEffect(MobEffects.field_188423_x, 200, 0, false, false));
                    oneTime = false;
                }
                mob.func_70690_d(new PotionEffect(SRPPotions.RAGE_E, 600, 1, false, false));
            }
        }
        int i1 = pos.func_177956_o();
        double l1 = pos.func_177958_n();
        double i2 = pos.func_177952_p();
        boolean flag = false;
        int BGrange = raan = 5;
        int BGheight = raan;
        for (int k2 = -1 * BGrange; k2 <= 1 * BGrange; ++k2) {
            for (int l2 = -1 * BGrange; l2 <= 1 * BGrange; ++l2) {
                for (int j = -1 * BGheight; j <= 1 * BGheight; ++j) {
                    double i3 = l1 + (double)k2;
                    double k = i1 + j;
                    double l = i2 + (double)l2;
                    BlockPos blockpos = new BlockPos(i3, k, l);
                    IBlockState iblockstate = worldIn.func_180495_p(blockpos);
                    Block block = iblockstate.func_177230_c();
                    if (block == SRPBlocks.InfestedStain) {
                        worldIn.func_175656_a(blockpos, SRPBlocks.InfestedStain.func_176223_P().func_177226_a((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(5)));
                        worldIn.func_175654_a(blockpos, SRPBlocks.InfestedStain.func_176223_P().func_177226_a((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(5)).func_177230_c(), 40, 5);
                    }
                    if (block != SRPBlocks.InfestedRubble) continue;
                    worldIn.func_175656_a(blockpos, SRPBlocks.InfestedRubble.func_176223_P().func_177226_a((IProperty)BlockInfestedRubble.STAGE, (Comparable)Integer.valueOf(5)));
                    worldIn.func_175654_a(blockpos, SRPBlocks.InfestedRubble.func_176223_P().func_177226_a((IProperty)BlockInfestedRubble.STAGE, (Comparable)Integer.valueOf(5)).func_177230_c(), 40, 5);
                }
            }
        }
    }
}

