/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.audio.ISound
 *  net.minecraft.client.audio.PositionedSoundRecord
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$PooledMutableBlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.event.FMLPreInitializationEvent
 */
package com.dhanantry.scapeandrunparasites.proxy;

import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.proxy.CommonProxy;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.util.handlers.SRPRegistryHandlers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.entity.Entity;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy
extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        SRPRegistryHandlers.initRenders();
    }

    @Override
    public void spreadBiome(BlockPos pos, boolean convert) {
        if (convert) {
            ParasiteEventWorld.positionToParasiteBiome((World)Minecraft.getMinecraft().world, pos);
        } else {
            ParasiteEventWorld.positionToBiome((World)Minecraft.getMinecraft().world, pos);
        }
    }

    @Override
    public void playMovingSound(int sound, float v) {
        switch (sound) {
            case -1: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.BHEART, (float)1.0f, (float)(v * SRPConfigWorld.biomeHeartVol)));
                break;
            }
            case 1: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.EVPHASE_1, (float)1.0f, (float)1.0f));
                break;
            }
            case 2: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.EVPHASE_2, (float)1.0f, (float)1.0f));
                break;
            }
            case 3: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.EVPHASE_3, (float)1.0f, (float)1.0f));
                break;
            }
            case 4: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.EVPHASE_4, (float)1.0f, (float)1.0f));
                break;
            }
            case 5: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.EVPHASE_5, (float)1.0f, (float)1.0f));
                break;
            }
            case 6: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.EVPHASE_6, (float)1.0f, (float)1.0f));
                break;
            }
            case 7: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.EVPHASE_7, (float)1.0f, (float)1.0f));
                break;
            }
            case 8: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.EVPHASE_8, (float)1.0f, (float)1.0f));
                break;
            }
            case 9: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.EVPHASE_9, (float)1.0f, (float)1.0f));
                break;
            }
            case 10: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.EVPHASE_10, (float)1.0f, (float)1.0f));
                break;
            }
            case 100: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.NODE_1, (float)1.0f, (float)1.0f));
                break;
            }
            case 101: {
                Minecraft.getMinecraft().getSoundHandler().playSound((ISound)PositionedSoundRecord.getRecord((SoundEvent)SRPSounds.COLONY_1, (float)1.0f, (float)1.0f));
            }
        }
    }

    @Override
    public boolean handleMaterialAcceleration(Entity entityIn, Material materialIn) {
        World parWorld = entityIn.world;
        AxisAlignedBB bb = entityIn.getEntityBoundingBox().grow(0.0, (double)-0.4f, 0.0).shrink(0.001);
        int j2 = MathHelper.floor((double)bb.minX);
        int k2 = MathHelper.ceil((double)bb.maxX);
        int l2 = MathHelper.floor((double)bb.minY);
        int i3 = MathHelper.ceil((double)bb.maxY);
        int j3 = MathHelper.floor((double)bb.minZ);
        int k3 = MathHelper.ceil((double)bb.maxZ);
        boolean flag = false;
        Vec3d vec3d = Vec3d.ZERO;
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.retain();
        for (int l3 = j2; l3 < k2; ++l3) {
            for (int i4 = l2; i4 < i3; ++i4) {
                for (int j4 = j3; j4 < k3; ++j4) {
                    double d0;
                    blockpos$pooledmutableblockpos.setPos(l3, i4, j4);
                    IBlockState iblockstate1 = parWorld.getBlockState((BlockPos)blockpos$pooledmutableblockpos);
                    Block block = iblockstate1.getBlock();
                    Boolean result = block.isEntityInsideMaterial((IBlockAccess)parWorld, (BlockPos)blockpos$pooledmutableblockpos, iblockstate1, entityIn, (double)i3, materialIn, false);
                    if (result != null && result.booleanValue()) {
                        flag = true;
                        vec3d = block.modifyAcceleration(parWorld, (BlockPos)blockpos$pooledmutableblockpos, entityIn, vec3d);
                        continue;
                    }
                    if (result != null && !result.booleanValue() || iblockstate1.getMaterial() != materialIn || !((double)i3 >= (d0 = (double)((float)(i4 + 1) - BlockLiquid.getLiquidHeightPercent((int)((Integer)iblockstate1.getValue((IProperty)BlockLiquid.LEVEL))))))) continue;
                    flag = true;
                    vec3d = block.modifyAcceleration(parWorld, (BlockPos)blockpos$pooledmutableblockpos, entityIn, vec3d);
                }
            }
        }
        blockpos$pooledmutableblockpos.release();
        if (vec3d.length() > 0.0 && entityIn.isPushedByWater()) {
            vec3d = vec3d.normalize();
            double d1 = 0.014;
            entityIn.motionX += vec3d.x * d1;
            entityIn.motionY += vec3d.y * d1;
            entityIn.motionZ += vec3d.z * d1;
        }
        entityIn.fallDistance = 0.0f;
        return flag;
    }
}

