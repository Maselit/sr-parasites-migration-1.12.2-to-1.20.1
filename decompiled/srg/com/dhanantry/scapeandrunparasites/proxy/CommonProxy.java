/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.command.ICommand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$PooledMutableBlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.common.config.Configuration
 *  net.minecraftforge.fml.common.event.FMLInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLPostInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLPreInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLServerStartingEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package com.dhanantry.scapeandrunparasites.proxy;

import com.dhanantry.scapeandrunparasites.compatibility.ModCompatibility;
import com.dhanantry.scapeandrunparasites.init.SRPBiomes;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPEntities;
import com.dhanantry.scapeandrunparasites.init.SRPFluids;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.init.SRPSpawning;
import com.dhanantry.scapeandrunparasites.network.SRPCommandColony;
import com.dhanantry.scapeandrunparasites.network.SRPCommandEvolution;
import com.dhanantry.scapeandrunparasites.network.SRPCommandNode;
import com.dhanantry.scapeandrunparasites.network.SRPCommandRoot;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.util.handlers.SRPPacketHandler;
import com.dhanantry.scapeandrunparasites.util.handlers.SRPRegistryHandlers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CommonProxy {
    public static Configuration config;
    public static Configuration configMobs;
    public static Configuration configSistems;
    public static Configuration configWorld;

    public void preInit(FMLPreInitializationEvent e) {
        SRPFluids.init();
        SRPRegistryHandlers.initEvents();
        SRPConfig.initConfig(e);
        SRPConfigSystems.initConfig(e);
        SRPConfigMobs.initConfig(e);
        SRPConfigWorld.initConfig(e);
        SRPAttributes.reset();
        SRPAttributes.init();
        SRPSounds.init();
        SRPPacketHandler.init();
        SRPEntities.registerTileEntities();
        ModCompatibility.preInit();
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
        config.save();
        configMobs.save();
        configSistems.save();
        configWorld.save();
        SRPSpawning.init();
        SRPBlocks.init();
        SRPBiomes.clearMobSpawnList();
        SRPSpawning.initBiome();
        ModCompatibility.postInit();
    }

    public void serverInit(FMLServerStartingEvent e) {
        e.registerServerCommand((ICommand)new SRPCommandEvolution());
        e.registerServerCommand((ICommand)new SRPCommandNode());
        e.registerServerCommand((ICommand)new SRPCommandColony());
        e.registerServerCommand((ICommand)new SRPCommandRoot());
    }

    public EntityPlayerMP getPlayerEntityFromContext(MessageContext ctx) {
        return ctx.getServerHandler().field_147369_b;
    }

    public void spreadBiome(BlockPos pos, boolean convert) {
    }

    public void playMovingSound(int sound, float v) {
    }

    public boolean handleMaterialAcceleration(Entity entityIn, Material materialIn) {
        World parWorld = entityIn.field_70170_p;
        AxisAlignedBB bb = entityIn.func_174813_aQ().func_72314_b(0.0, (double)-0.4f, 0.0).func_186664_h(0.001);
        int j2 = MathHelper.func_76128_c((double)bb.field_72340_a);
        int k2 = MathHelper.func_76143_f((double)bb.field_72336_d);
        int l2 = MathHelper.func_76128_c((double)bb.field_72338_b);
        int i3 = MathHelper.func_76143_f((double)bb.field_72337_e);
        int j3 = MathHelper.func_76128_c((double)bb.field_72339_c);
        int k3 = MathHelper.func_76143_f((double)bb.field_72334_f);
        boolean flag = false;
        Vec3d vec3d = Vec3d.field_186680_a;
        BlockPos.PooledMutableBlockPos blockpos$pooledmutableblockpos = BlockPos.PooledMutableBlockPos.func_185346_s();
        for (int l3 = j2; l3 < k2; ++l3) {
            for (int i4 = l2; i4 < i3; ++i4) {
                for (int j4 = j3; j4 < k3; ++j4) {
                    double d0;
                    blockpos$pooledmutableblockpos.func_181079_c(l3, i4, j4);
                    IBlockState iblockstate1 = parWorld.func_180495_p((BlockPos)blockpos$pooledmutableblockpos);
                    Block block = iblockstate1.func_177230_c();
                    Boolean result = block.isEntityInsideMaterial((IBlockAccess)parWorld, (BlockPos)blockpos$pooledmutableblockpos, iblockstate1, entityIn, (double)i3, materialIn, false);
                    if (result != null && result.booleanValue()) {
                        flag = true;
                        vec3d = block.func_176197_a(parWorld, (BlockPos)blockpos$pooledmutableblockpos, entityIn, vec3d);
                        continue;
                    }
                    if (result != null && !result.booleanValue() || iblockstate1.func_185904_a() != materialIn || !((double)i3 >= (d0 = (double)((float)(i4 + 1) - BlockLiquid.func_149801_b((int)((Integer)iblockstate1.func_177229_b((IProperty)BlockLiquid.field_176367_b))))))) continue;
                    flag = true;
                    vec3d = block.func_176197_a(parWorld, (BlockPos)blockpos$pooledmutableblockpos, entityIn, vec3d);
                }
            }
        }
        blockpos$pooledmutableblockpos.func_185344_t();
        if (vec3d.func_72433_c() > 0.0 && entityIn.func_96092_aw()) {
            vec3d = vec3d.func_72432_b();
            double d1 = 0.014;
            entityIn.field_70159_w += vec3d.field_72450_a * d1;
            entityIn.field_70181_x += vec3d.field_72448_b * d1;
            entityIn.field_70179_y += vec3d.field_72449_c * d1;
        }
        entityIn.field_70143_R = 0.0f;
        return flag;
    }
}

