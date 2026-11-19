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
        for (EntityPlayer entityplayer : worldServerIn.playerEntities) {
            if (entityplayer.isSpectator()) continue;
            int j = MathHelper.floor((double)(entityplayer.posX / 16.0));
            int k = MathHelper.floor((double)(entityplayer.posZ / 16.0));
            int l = 8;
            for (int i1 = -8; i1 <= 8; ++i1) {
                for (int j1 = -8; j1 <= 8; ++j1) {
                    PlayerChunkMapEntry playerchunkmapentry;
                    boolean flag = i1 == -8 || i1 == 8 || j1 == -8 || j1 == 8;
                    ChunkPos chunkpos = new ChunkPos(i1 + j, j1 + k);
                    if (eligibleChunksForSpawning.contains(chunkpos)) continue;
                    ++i;
                    if (flag || !worldServerIn.getWorldBorder().contains(chunkpos) || (playerchunkmapentry = worldServerIn.getPlayerChunkMap().getEntry(chunkpos.x, chunkpos.z)) == null || !playerchunkmapentry.isSentToPlayers()) continue;
                    eligibleChunksForSpawning.add(chunkpos);
                }
            }
        }
        int j4 = 0;
        BlockPos blockpos1 = worldServerIn.getSpawnPoint();
        ArrayList shuffled = Lists.newArrayList(eligibleChunksForSpawning);
        Collections.shuffle(shuffled);
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
        block5: for (ChunkPos chunkpos1 : shuffled) {
            BlockPos blockpos = SRPWorldEntitySpawner.getRandomChunkPosition((World)worldServerIn, chunkpos1.x, chunkpos1.z);
            int k1 = blockpos.getX();
            int l1 = blockpos.getY();
            int i2 = blockpos.getZ();
            IBlockState iblockstate = worldServerIn.getBlockState(blockpos);
            if (iblockstate.isNormalCube()) continue;
            int j2 = 0;
            block6: for (int k2 = 0; k2 < 3; ++k2) {
                int l2 = k1;
                int i3 = l1;
                int j3 = i2;
                int k3 = 6;
                Biome.SpawnListEntry biome$spawnlistentry = null;
                IEntityLivingData ientitylivingdata = null;
                int l3 = MathHelper.ceil((double)(Math.random() * 4.0));
                for (int i4 = 0; i4 < l3; ++i4) {
                    EntityParasiteBase entityliving;
                    blockpos$mutableblockpos.setPos(l2 += worldServerIn.rand.nextInt(6) - worldServerIn.rand.nextInt(6), i3 += worldServerIn.rand.nextInt(1) - worldServerIn.rand.nextInt(1), j3 += worldServerIn.rand.nextInt(6) - worldServerIn.rand.nextInt(6));
                    float f = (float)l2 + 0.5f;
                    float f1 = (float)j3 + 0.5f;
                    if (worldServerIn.isAnyPlayerWithinRangeAt((double)f, (double)i3, (double)f1, 24.0) || !(blockpos1.distanceSq((double)f, (double)i3, (double)f1) >= 576.0)) continue;
                    if (biome$spawnlistentry == null && (biome$spawnlistentry = SRPWorldEntitySpawner.getSpawnListEntryForTypeAt(worldServerIn, (BlockPos)blockpos$mutableblockpos)) == null) continue block6;
                    if (!SRPWorldEntitySpawner.canCreatureTypeSpawnAtLocation(EntitySpawnPlacementRegistry.getPlacementForEntity((Class)biome$spawnlistentry.entityClass), (World)worldServerIn, (BlockPos)blockpos$mutableblockpos)) continue;
                    try {
                        entityliving = (EntityParasiteBase)biome$spawnlistentry.newInstance((World)worldServerIn);
                        entityliving.canSpawnSpawn = true;
                    }
                    catch (Exception exception) {
                        return j4;
                    }
                    entityliving.setLocationAndAngles(f, i3, f1, worldServerIn.rand.nextFloat() * 360.0f, 0.0f);
                    Event.Result canSpawn = ForgeEventFactory.canEntitySpawn((EntityLiving)entityliving, (World)worldServerIn, (float)f, (float)i3, (float)f1, (boolean)false);
                    if (canSpawn == Event.Result.ALLOW || canSpawn == Event.Result.DEFAULT && entityliving.getCanSpawnHere() && entityliving.isNotColliding()) {
                        if (!ForgeEventFactory.doSpecialSpawn((EntityLiving)entityliving, (World)worldServerIn, (float)f, (float)i3, (float)f1)) {
                            ientitylivingdata = entityliving.onInitialSpawn(worldServerIn.getDifficultyForLocation(new BlockPos((Entity)entityliving)), ientitylivingdata);
                        }
                        if (entityliving.isNotColliding()) {
                            ++j2;
                            worldServerIn.spawnEntity((Entity)entityliving);
                        } else {
                            entityliving.setDead();
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
        Chunk chunk = worldIn.getChunk(x, z);
        int i = x * 16 + worldIn.rand.nextInt(16);
        int j = z * 16 + worldIn.rand.nextInt(16);
        int k = MathHelper.roundUp((int)(chunk.getHeight(new BlockPos(i, 0, j)) + 1), (int)16);
        int l = worldIn.rand.nextInt(Math.max(1, k > 0 ? k : chunk.getTopFilledSegment() + 16 - 1));
        return new BlockPos(i, l, j);
    }

    @Nullable
    public static Biome.SpawnListEntry getSpawnListEntryForTypeAt(WorldServer worldServerIn, BlockPos pos) {
        List<Biome.SpawnListEntry> list = SRPSpawning.getSpawns(SRPSaveData.get((World)worldServerIn).getEvolutionPhase(worldServerIn.provider.getDimension()));
        return list != null && !list.isEmpty() ? (Biome.SpawnListEntry)WeightedRandom.getRandomItem((Random)new Random(), list) : null;
    }

    public static boolean canCreatureTypeSpawnAtLocation(EntityLiving.SpawnPlacementType spawnPlacementTypeIn, World worldIn, BlockPos pos) {
        if (!worldIn.getWorldBorder().contains(pos)) {
            return false;
        }
        return spawnPlacementTypeIn.canSpawnAt(worldIn, pos);
    }
}

