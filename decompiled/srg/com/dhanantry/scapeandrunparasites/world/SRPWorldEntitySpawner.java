/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLiving$SpawnPlacementType
 *  net.minecraft.entity.EntitySpawnPlacementRegistry
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.server.management.PlayerChunkMapEntry
 *  net.minecraft.util.WeightedRandom
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$MutableBlockPos
 *  net.minecraft.util.math.ChunkPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraft.world.biome.Biome$SpawnListEntry
 *  net.minecraft.world.chunk.Chunk
 *  net.minecraftforge.event.ForgeEventFactory
 *  net.minecraftforge.fml.common.eventhandler.Event$Result
 */
package com.dhanantry.scapeandrunparasites.world;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPSpawning;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.management.PlayerChunkMapEntry;
import net.minecraft.util.WeightedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.common.eventhandler.Event;

public class SRPWorldEntitySpawner {
    private static final Set<ChunkPos> eligibleChunksForSpawning = Sets.newHashSet();

    public static int findChunksForSpawning(WorldServer worldServerIn, boolean spawnHostileMobs, boolean spawnPeacefulMobs, boolean spawnOnSetTickRate) {
        if (!spawnHostileMobs && !spawnPeacefulMobs) {
            return 0;
        }
        eligibleChunksForSpawning.clear();
        int i = 0;
        for (EntityPlayer entityplayer : worldServerIn.field_73010_i) {
            if (entityplayer.func_175149_v()) continue;
            int j = MathHelper.func_76128_c((double)(entityplayer.field_70165_t / 16.0));
            int k = MathHelper.func_76128_c((double)(entityplayer.field_70161_v / 16.0));
            int l = 8;
            for (int i1 = -8; i1 <= 8; ++i1) {
                for (int j1 = -8; j1 <= 8; ++j1) {
                    PlayerChunkMapEntry playerchunkmapentry;
                    boolean flag = i1 == -8 || i1 == 8 || j1 == -8 || j1 == 8;
                    ChunkPos chunkpos = new ChunkPos(i1 + j, j1 + k);
                    if (eligibleChunksForSpawning.contains(chunkpos)) continue;
                    ++i;
                    if (flag || !worldServerIn.func_175723_af().func_177730_a(chunkpos) || (playerchunkmapentry = worldServerIn.func_184164_w().func_187301_b(chunkpos.field_77276_a, chunkpos.field_77275_b)) == null || !playerchunkmapentry.func_187274_e()) continue;
                    eligibleChunksForSpawning.add(chunkpos);
                }
            }
        }
        int j4 = 0;
        BlockPos blockpos1 = worldServerIn.func_175694_M();
        ArrayList shuffled = Lists.newArrayList(eligibleChunksForSpawning);
        Collections.shuffle(shuffled);
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
        block5: for (ChunkPos chunkpos1 : shuffled) {
            BlockPos blockpos = SRPWorldEntitySpawner.getRandomChunkPosition((World)worldServerIn, chunkpos1.field_77276_a, chunkpos1.field_77275_b);
            int k1 = blockpos.func_177958_n();
            int l1 = blockpos.func_177956_o();
            int i2 = blockpos.func_177952_p();
            IBlockState iblockstate = worldServerIn.func_180495_p(blockpos);
            if (iblockstate.func_185915_l()) continue;
            int j2 = 0;
            block6: for (int k2 = 0; k2 < 3; ++k2) {
                int l2 = k1;
                int i3 = l1;
                int j3 = i2;
                int k3 = 6;
                Biome.SpawnListEntry biome$spawnlistentry = null;
                IEntityLivingData ientitylivingdata = null;
                int l3 = MathHelper.func_76143_f((double)(Math.random() * 4.0));
                for (int i4 = 0; i4 < l3; ++i4) {
                    EntityParasiteBase entityliving;
                    blockpos$mutableblockpos.func_181079_c(l2 += worldServerIn.field_73012_v.nextInt(6) - worldServerIn.field_73012_v.nextInt(6), i3 += worldServerIn.field_73012_v.nextInt(1) - worldServerIn.field_73012_v.nextInt(1), j3 += worldServerIn.field_73012_v.nextInt(6) - worldServerIn.field_73012_v.nextInt(6));
                    float f = (float)l2 + 0.5f;
                    float f1 = (float)j3 + 0.5f;
                    if (worldServerIn.func_175636_b((double)f, (double)i3, (double)f1, 24.0) || !(blockpos1.func_177954_c((double)f, (double)i3, (double)f1) >= 576.0)) continue;
                    if (biome$spawnlistentry == null && (biome$spawnlistentry = SRPWorldEntitySpawner.getSpawnListEntryForTypeAt(worldServerIn, (BlockPos)blockpos$mutableblockpos)) == null) continue block6;
                    if (!SRPWorldEntitySpawner.canCreatureTypeSpawnAtLocation(EntitySpawnPlacementRegistry.func_180109_a((Class)biome$spawnlistentry.field_76300_b), (World)worldServerIn, (BlockPos)blockpos$mutableblockpos)) continue;
                    try {
                        entityliving = (EntityParasiteBase)biome$spawnlistentry.newInstance((World)worldServerIn);
                        entityliving.canSpawnSpawn = true;
                    }
                    catch (Exception exception) {
                        return j4;
                    }
                    entityliving.func_70012_b(f, i3, f1, worldServerIn.field_73012_v.nextFloat() * 360.0f, 0.0f);
                    Event.Result canSpawn = ForgeEventFactory.canEntitySpawn((EntityLiving)entityliving, (World)worldServerIn, (float)f, (float)i3, (float)f1, (boolean)false);
                    if (canSpawn == Event.Result.ALLOW || canSpawn == Event.Result.DEFAULT && entityliving.func_70601_bi() && entityliving.func_70058_J()) {
                        if (!ForgeEventFactory.doSpecialSpawn((EntityLiving)entityliving, (World)worldServerIn, (float)f, (float)i3, (float)f1)) {
                            ientitylivingdata = entityliving.func_180482_a(worldServerIn.func_175649_E(new BlockPos((Entity)entityliving)), ientitylivingdata);
                        }
                        if (entityliving.func_70058_J()) {
                            ++j2;
                            worldServerIn.func_72838_d((Entity)entityliving);
                        } else {
                            entityliving.func_70106_y();
                        }
                        if (j2 >= ForgeEventFactory.getMaxSpawnPackSize((EntityLiving)entityliving)) continue block5;
                    }
                    j4 += j2;
                }
            }
        }
        return j4;
    }

    private static BlockPos getRandomChunkPosition(World worldIn, int x, int z) {
        Chunk chunk = worldIn.func_72964_e(x, z);
        int i = x * 16 + worldIn.field_73012_v.nextInt(16);
        int j = z * 16 + worldIn.field_73012_v.nextInt(16);
        int k = MathHelper.func_154354_b((int)(chunk.func_177433_f(new BlockPos(i, 0, j)) + 1), (int)16);
        int l = worldIn.field_73012_v.nextInt(Math.max(1, k > 0 ? k : chunk.func_76625_h() + 16 - 1));
        return new BlockPos(i, l, j);
    }

    @Nullable
    public static Biome.SpawnListEntry getSpawnListEntryForTypeAt(WorldServer worldServerIn, BlockPos pos) {
        List<Biome.SpawnListEntry> list = SRPSpawning.getSpawns(SRPSaveData.get((World)worldServerIn).getEvolutionPhase(worldServerIn.field_73011_w.getDimension()));
        return list != null && !list.isEmpty() ? (Biome.SpawnListEntry)WeightedRandom.func_76271_a((Random)new Random(), list) : null;
    }

    public static boolean canCreatureTypeSpawnAtLocation(EntityLiving.SpawnPlacementType spawnPlacementTypeIn, World worldIn, BlockPos pos) {
        if (!worldIn.func_175723_af().func_177746_a(pos)) {
            return false;
        }
        return spawnPlacementTypeIn.canSpawnAt(worldIn, pos);
    }
}

