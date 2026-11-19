/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItemFrame
 *  net.minecraft.item.IItemPropertyGetter
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.item;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.network.SRPPacketCompass;
import com.dhanantry.scapeandrunparasites.world.SRPWorldData;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemNodeColonyCompass
extends Item {
    private String name;
    private byte cType;
    public static BlockPos orig;

    public ItemNodeColonyCompass(String name, int type) {
        this.setRegistryName(name);
        this.setTranslationKey("srparasites." + name);
        this.setCreativeTab(SRPMain.SRP_CREATIVETAB);
        this.name = name;
        this.cType = (byte)type;
        this.addPropertyOverride(new ResourceLocation("angle"), new IItemPropertyGetter(){
            @SideOnly(value=Side.CLIENT)
            double rotation;
            @SideOnly(value=Side.CLIENT)
            double rota;
            @SideOnly(value=Side.CLIENT)
            long lastUpdateTick;

            @SideOnly(value=Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
                double d0;
                EntityLivingBase entity;
                if (entityIn == null && !stack.isOnItemFrame()) {
                    return 0.0f;
                }
                boolean flag = entityIn != null;
                Object object = entity = flag ? entityIn : stack.getItemFrame();
                if (worldIn == null) {
                    worldIn = entity.world;
                }
                if (worldIn.provider.isSurfaceWorld()) {
                    double d1 = flag ? (double)entity.rotationYaw : this.getFrameRotation((EntityItemFrame)entity);
                    d1 = MathHelper.positiveModulo((double)(d1 / 360.0), (double)1.0);
                    double d2 = this.getSpawnToAngle(worldIn, (Entity)entity) / (Math.PI * 2);
                    d0 = 0.5 - (d1 - 0.25 - d2);
                } else {
                    d0 = Math.random();
                }
                if (flag) {
                    d0 = this.wobble(worldIn, d0);
                }
                return MathHelper.positiveModulo((float)((float)d0), (float)1.0f);
            }

            @SideOnly(value=Side.CLIENT)
            private double wobble(World worldIn, double ddd) {
                if (worldIn.getTotalWorldTime() != this.lastUpdateTick) {
                    this.lastUpdateTick = worldIn.getTotalWorldTime();
                    double d0 = ddd - this.rotation;
                    d0 = MathHelper.positiveModulo((double)(d0 + 0.5), (double)1.0) - 0.5;
                    this.rota += d0 * 0.1;
                    this.rota *= 0.8;
                    this.rotation = MathHelper.positiveModulo((double)(this.rotation + this.rota), (double)1.0);
                }
                return this.rotation;
            }

            @SideOnly(value=Side.CLIENT)
            private double getFrameRotation(EntityItemFrame en) {
                return MathHelper.wrapDegrees((int)(180 + en.facingDirection.getHorizontalIndex() * 90));
            }

            @SideOnly(value=Side.CLIENT)
            private double getSpawnToAngle(World world, Entity en) {
                if (orig == null) {
                    return world.rand.nextDouble();
                }
                return Math.atan2((double)orig.getZ() - en.posZ, (double)orig.getX() - en.posX);
            }
        });
    }

    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (!worldIn.isRemote && entityIn.ticksExisted % 20 == 0) {
            SRPWorldData aaa = SRPWorldData.get(worldIn);
            if (aaa.getHeartPocition(entityIn.getPosition(), 0) != 1) {
                BlockPos posss = aaa.nearestHeartAgePosition(entityIn.getPosition(), 0);
                if (posss != null) {
                    SRPMain.network.sendToAll((IMessage)new SRPPacketCompass(posss.getX(), posss.getY(), posss.getZ()));
                } else {
                    SRPMain.network.sendToAll((IMessage)new SRPPacketCompass(worldIn.rand.nextInt(), worldIn.rand.nextInt(), worldIn.rand.nextInt()));
                }
            } else {
                SRPMain.network.sendToAll((IMessage)new SRPPacketCompass(worldIn.rand.nextInt(), worldIn.rand.nextInt(), worldIn.rand.nextInt()));
            }
        }
    }
}

