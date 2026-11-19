/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBreakable
 *  net.minecraft.block.BlockBush
 *  net.minecraft.block.BlockContainer
 *  net.minecraft.block.BlockHorizontal
 *  net.minecraft.block.BlockOre
 *  net.minecraft.block.BlockTNT
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Biomes
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.EnumDifficulty
 *  net.minecraft.world.EnumSkyBlock
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraft.world.biome.Biome
 *  net.minecraftforge.common.IPlantable
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.dhanantry.scapeandrunparasites.util;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.block.BlockBase;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedBush;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedRubble;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedStain;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteBush;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteSapling;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteStain;
import com.dhanantry.scapeandrunparasites.block.IMetaName;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrol;
import com.dhanantry.scapeandrunparasites.init.SRPBiomes;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.network.SRPPacketBiomeChange;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import com.dhanantry.scapeandrunparasites.world.SRPWorldData;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteBall;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteBigBall;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteBush;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteColonyCore;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteGenAbstract;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteMouth;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteNodeCore;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteSpine;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteTallFlower;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteTenFlower;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteTree;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteTreeThin;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockOre;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class ParasiteEventWorld {
    public static int blockInfestedCount;
    public static int blockParasiteCount;

    public static int getTimer(int meta) {
        int timer = 40;
        if (meta == 1) {
            timer = 20 * SRPConfigMobs.venkrolBlockTime;
        } else if (meta == 2) {
            timer = 20 * SRPConfigMobs.venkrolsiiBlockTime;
        } else if (meta == 3) {
            timer = 20 * SRPConfigMobs.venkrolsiiiBlockTime;
        }
        return timer;
    }

    private static boolean blockException(World worldIn, BlockPos pos, Block block, IBlockState state, String[] list, boolean invert, float maxHardness) {
        float bHard = state.func_185887_b(worldIn, pos);
        if (block instanceof BlockBreakable && state.func_185904_a() == Material.field_151588_w) {
            return false;
        }
        if (bHard > maxHardness || bHard < 0.0f) {
            return true;
        }
        if (ParasiteEventEntity.checkName(block.getRegistryName().toString(), list, invert)) {
            return true;
        }
        return block instanceof BlockBreakable || block instanceof BlockContainer || block instanceof BlockOre || block instanceof BlockHorizontal || block instanceof BlockTNT || block.func_176205_b((IBlockAccess)worldIn, pos) || block instanceof IPlantable || !state.func_185917_h();
    }

    public static int canBiomeStillExist(World worldIn, BlockPos pos, boolean spread) {
        if (!SRPConfigWorld.nodesActivated || !SRPConfigWorld.biomeRegster) {
            return -1;
        }
        return SRPWorldData.get(worldIn).nearestHeartAge(pos, spread, 0);
    }

    public static void SpreadBiome(World worldIn, BlockPos pos, int age) {
        if (!SRPConfigWorld.nodesActivated || !SRPConfigWorld.biomeRegster) {
            return;
        }
        SRPWorldData data = SRPWorldData.get(worldIn);
        int distance = data.getDistanceSpreadByAge(age, false);
        for (int x = pos.func_177958_n() - 4; x <= pos.func_177958_n() + 4; ++x) {
            for (int z = pos.func_177952_p() - 4; z <= pos.func_177952_p() + 4; ++z) {
                BlockPos convert = new BlockPos(x, pos.func_177956_o(), z);
                if (data.isInRangeOfHeart(convert, distance) == -1 || ParasiteEventEntity.checkName(worldIn.func_180494_b(convert).getRegistryName().toString(), SRPConfigWorld.biomeBlackList, SRPConfigWorld.biomeBlackListInverted)) continue;
                ParasiteEventWorld.positionToParasiteBiome(worldIn, convert);
                SRPMain.network.sendToDimension((IMessage)new SRPPacketBiomeChange(convert, true), worldIn.field_73011_w.getDimension());
            }
        }
    }

    public static void positionToParasiteBiome(World worldIn, BlockPos pos) {
        int inChunkX = pos.func_177958_n() & 0xF;
        int inChunkZ = pos.func_177952_p() & 0xF;
        worldIn.func_175726_f((BlockPos)pos).func_76605_m()[inChunkZ << 4 | inChunkX] = (byte)Biome.func_185362_a((Biome)SRPBiomes.biomeInfested);
    }

    public static void killBiome(World worldIn, BlockPos pos, int range) {
        SRPWorldData data = SRPWorldData.get(worldIn);
        int worldTime = 0;
        for (int x = pos.func_177958_n() - range; x <= pos.func_177958_n() + range; ++x) {
            for (int z = pos.func_177952_p() - range; z <= pos.func_177952_p() + range; ++z) {
                int age = data.nearestHeartAge(pos, true, worldTime);
                int distance = data.getDistanceSpreadByAge(age, false);
                BlockPos convert = new BlockPos(x, pos.func_177956_o(), z);
                if (!(worldIn.func_180494_b(convert) instanceof BiomeParasite)) continue;
                ParasiteEventWorld.positionToBiome(worldIn, convert);
                SRPMain.network.sendToDimension((IMessage)new SRPPacketBiomeChange(convert, false), worldIn.field_73011_w.getDimension());
            }
        }
    }

    public static void positionToBiome(World worldIn, BlockPos pos) {
        int inChunkX = pos.func_177958_n() & 0xF;
        int inChunkZ = pos.func_177952_p() & 0xF;
        worldIn.func_175726_f((BlockPos)pos).func_76605_m()[inChunkZ << 4 | inChunkX] = (byte)Biome.func_185362_a((Biome)Biomes.field_76772_c);
    }

    public static int placeHeartInWorld(World worldIn, BlockPos pos) {
        if (!SRPConfigWorld.nodesActivated) {
            return 3;
        }
        if (!SRPConfigWorld.biomeRegster) {
            return 4;
        }
        if (!ParasiteEventWorld.chechBlackListNodes(worldIn)) {
            return 2;
        }
        BlockPos origin = worldIn.func_175694_M();
        if (ParasiteEventWorld.getDistanceSQ(origin.func_177958_n(), origin.func_177956_o(), origin.func_177952_p(), pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p()) < (double)(SRPConfigWorld.minimumDistanceFromSpawnPoint * SRPConfigWorld.minimumDistanceFromSpawnPoint)) {
            return 5;
        }
        SRPWorldData data = SRPWorldData.get(worldIn);
        if (SRPConfigSystems.useEvolution) {
            if (SRPSaveData.get(worldIn).getEvolutionPhase(worldIn.field_73011_w.getDimension()) < SRPConfigSystems.evolutionNodeUnlock) {
                return 6;
            }
        } else if (!SRPConfigWorld.venkrolNode) {
            return 10;
        }
        if ((pos = ParasiteEventEntity.getFloor(worldIn, pos, 100)) == null) {
            return 7;
        }
        int key = data.setNode(pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
        if (key == 1) {
            WorldGenParasiteNodeCore gen = new WorldGenParasiteNodeCore(false, 1);
            gen.func_180709_b(worldIn, new Random(), pos);
            ParasiteEventWorld.SpreadBiome(worldIn, pos, 1);
            ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigWorld.nodeWarning, 100);
            return 1;
        }
        return key;
    }

    public static double getDistanceSQ(double rootx, double rooty, double rootz, double standingx, double standingy, double standingz) {
        double d0 = rootx - standingx;
        double d1 = rooty - standingy;
        double d2 = rootz - standingz;
        return d0 * d0 + d1 * d1 + d2 * d2;
    }

    private static boolean chechBlackListNodes(World worldIn) {
        for (int i : SRPConfigWorld.blackListedDimensionsNodes) {
            if (i != worldIn.field_73011_w.getDimension()) continue;
            return true;
        }
        return false;
    }

    public static boolean removeHeartInWorld(World worldIn, BlockPos pos) {
        if (!SRPConfigWorld.nodesActivated || !SRPConfigWorld.biomeRegster) {
            return false;
        }
        SRPWorldData data = SRPWorldData.get(worldIn);
        return data.removeNode(pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
    }

    public static int getHeartAgePostion(World worldIn, BlockPos pos) {
        SRPWorldData data = SRPWorldData.get(worldIn);
        return data.getHeartPocition(pos, 0);
    }

    public static int nodesPoints(World worldIn) {
        SRPWorldData data = SRPWorldData.get(worldIn);
        return data.totalNodePoints(0);
    }

    public static void canInfestBlock(World worldIn, BlockPos pos, Random rand, int stage, boolean fromVenkrol) {
        if (blockInfestedCount > SRPConfig.BlockInfestedLimit) {
            return;
        }
        if (worldIn.func_175659_aa() == EnumDifficulty.PEACEFUL) {
            return;
        }
        BlockPos helper = pos;
        int covertedBlocks = 0;
        int pivot = 0;
        int range = SRPConfigMobs.venkrolsiiiRange - 1;
        int rangeY = SRPConfigMobs.venkrolsiiiRangeY;
        AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)pos.func_177958_n(), (double)pos.func_177956_o(), (double)pos.func_177952_p(), (double)(pos.func_177958_n() + 1), (double)(pos.func_177956_o() + 1), (double)(pos.func_177952_p() + 1)).func_72314_b((double)range, (double)rangeY, (double)range);
        List moblist = worldIn.func_72872_a(EntityPStationaryArchitect.class, axisalignedbb);
        if (fromVenkrol) {
            if (moblist.isEmpty() && stage < 4) {
                if (worldIn.field_73012_v.nextDouble() < SRPConfigSystems.rsVenkrolEmpty && stage != 1 && (worldIn.func_180495_p(pos.func_177984_a()).func_177230_c() == Blocks.field_150350_a || worldIn.func_180495_p(pos.func_177984_a()).func_177230_c() instanceof BlockBush)) {
                    if (worldIn.func_175724_o(pos.func_177984_a()) > 0.46666667f && stage < 4) {
                        return;
                    }
                    if (worldIn.func_175642_b(EnumSkyBlock.BLOCK, pos.func_177984_a()) > 7 && stage < 4) {
                        return;
                    }
                    EntityVenkrol out = new EntityVenkrol(worldIn);
                    out.func_70012_b(pos.func_177958_n(), pos.func_177956_o() + 1, pos.func_177952_p(), 0.0f, 0.0f);
                    worldIn.func_72838_d((Entity)out);
                    out.cannotDespawn(true);
                }
                return;
            }
            if (!moblist.isEmpty() && stage < 4) {
                int flagV = 0;
                for (EntityPStationaryArchitect mob : moblist) {
                    if (mob.func_70644_a(SRPPotions.PIVOT_E)) {
                        pivot = Math.max(mob.func_70660_b(SRPPotions.PIVOT_E).func_76458_c() + 1, pivot);
                    }
                    if (mob.getStageV() < stage || flagV == 2) continue;
                    flagV = 0;
                    BlockPos venPos = mob.func_180425_c();
                    if (worldIn.func_175724_o(venPos.func_177984_a()) < (float)SRPConfigSystems.rsBlockLight / 15.0f && stage < 4) {
                        ++flagV;
                    }
                    if (worldIn.func_175642_b(EnumSkyBlock.BLOCK, venPos.func_177984_a()) >= SRPConfigSystems.rsBlockLight || stage >= 4) continue;
                    ++flagV;
                }
                if (flagV < 2) {
                    return;
                }
            }
        }
        for (int dir = 0; dir <= 5; ++dir) {
            helper = ParasiteEventWorld.directionToSpread(pos, dir);
            IBlockState lookingState = worldIn.func_180495_p(helper);
            Material mat = lookingState.func_185904_a();
            Block lookingBlock = lookingState.func_177230_c();
            if (lookingBlock instanceof IMetaName) continue;
            if (lookingBlock.isWood((IBlockAccess)worldIn, helper) && stage <= 3) {
                ++covertedBlocks;
                worldIn.func_175656_a(helper, SRPBlocks.InfestedTrunk.func_176223_P());
            }
            if (ParasiteEventWorld.blockException(worldIn, helper, lookingBlock, lookingState, SRPConfigSystems.blockBList, SRPConfigSystems.blockBListWhite, SRPConfigSystems.rsBlockIMaxH) && stage <= 3) continue;
            if (lookingBlock instanceof BlockBase) {
                if (lookingBlock == SRPBlocks.BiomeHeart || lookingBlock == SRPBlocks.ColonyHeart) continue;
                if (mat == Material.field_151578_c) {
                    int lookM = lookingBlock.func_176201_c(lookingState);
                    if (stage >= 4 && (lookM <= 1 || stage == 5)) {
                        worldIn.func_175656_a(helper, SRPBlocks.InfestedStain.func_176223_P().func_177226_a((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(stage)));
                        worldIn.func_175654_a(helper, SRPBlocks.InfestedStain.func_176223_P().func_177226_a((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(stage)).func_177230_c(), 40, 5);
                        continue;
                    }
                    if (lookM >= stage || stage >= 4) continue;
                    worldIn.func_175656_a(helper, SRPBlocks.InfestedStain.func_176223_P().func_177226_a((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(stage)));
                    continue;
                }
                if (mat != Material.field_151576_e) continue;
                int lookM = lookingBlock.func_176201_c(lookingState);
                if (stage >= 4 && (lookM <= 1 || stage == 5)) {
                    worldIn.func_175656_a(helper, SRPBlocks.InfestedRubble.func_176223_P().func_177226_a((IProperty)BlockInfestedRubble.STAGE, (Comparable)Integer.valueOf(stage)));
                    worldIn.func_175654_a(helper, SRPBlocks.InfestedRubble.func_176223_P().func_177226_a((IProperty)BlockInfestedRubble.STAGE, (Comparable)Integer.valueOf(stage)).func_177230_c(), 40, 5);
                    continue;
                }
                if (lookM >= stage || stage >= 4 || stage < 2) continue;
                worldIn.func_175656_a(helper, SRPBlocks.InfestedRubble.func_176223_P().func_177226_a((IProperty)BlockInfestedRubble.STAGE, (Comparable)Integer.valueOf(stage)));
                continue;
            }
            if (stage >= 4) continue;
            if (mat == Material.field_151578_c || mat == Material.field_151577_b) {
                worldIn.func_175656_a(helper, SRPBlocks.InfestedStain.func_176223_P().func_177226_a((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(stage)));
                ++covertedBlocks;
                ParasiteEventWorld.spawnGenFeatureInfested(worldIn, helper.func_177984_a(), rand);
                ParasiteEventWorld.spawnGenRoofInfested(worldIn, helper.func_177977_b(), rand);
                continue;
            }
            if (mat == Material.field_151595_p) {
                worldIn.func_175656_a(helper, SRPBlocks.InfestedStain.func_176223_P().func_177226_a((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(stage)));
                ++covertedBlocks;
                ParasiteEventWorld.spawnGenFeatureInfested(worldIn, helper.func_177984_a(), rand);
                ParasiteEventWorld.spawnGenRoofInfested(worldIn, helper.func_177977_b(), rand);
                continue;
            }
            if (mat == Material.field_151576_e) {
                if (stage < 2) continue;
                worldIn.func_175656_a(helper, SRPBlocks.InfestedRubble.func_176223_P().func_177226_a((IProperty)BlockInfestedRubble.STAGE, (Comparable)Integer.valueOf(stage)));
                ++covertedBlocks;
                ParasiteEventWorld.spawnGenFeatureInfested(worldIn, helper.func_177984_a(), rand);
                ParasiteEventWorld.spawnGenRoofInfested(worldIn, helper.func_177977_b(), rand);
                continue;
            }
            if (mat != Material.field_151585_k) continue;
        }
        if (stage >= 4) {
            if (worldIn.func_180495_p(pos).func_177230_c() == SRPBlocks.InfestedStain) {
                worldIn.func_175656_a(pos, SRPBlocks.optionalDirt.func_176223_P());
            } else if (worldIn.func_180495_p(pos).func_177230_c() == SRPBlocks.InfestedRubble) {
                worldIn.func_175656_a(pos, SRPBlocks.optionalRub.func_176223_P());
            }
            if (worldIn.func_180495_p(pos.func_177984_a()).func_177230_c() == Blocks.field_150350_a || worldIn.func_180495_p(pos.func_177984_a()).func_177230_c() == SRPBlocks.ParasiteBush) {
                worldIn.func_175656_a(pos.func_177984_a(), SRPBlocks.InfestRemain.func_176223_P());
            }
        } else if (covertedBlocks != 0) {
            blockInfestedCount += covertedBlocks;
            if (SRPConfigSystems.useEvolution) {
                if (pivot != 0) {
                    SRPSaveData.get(worldIn).setTotalKills(worldIn.field_73011_w.getDimension(), SRPConfigSystems.valueBlock * covertedBlocks * (SRPConfigSystems.pivotPointMultiplier * pivot), true, worldIn, true);
                } else {
                    SRPSaveData.get(worldIn).setTotalKills(worldIn.field_73011_w.getDimension(), SRPConfigSystems.valueBlock * covertedBlocks, true, worldIn, true);
                }
            }
        }
    }

    public static void spreadBiomeBlockStain(World worldIn, BlockPos pos, Random rand) {
        BlockPos helper = pos;
        int covertedBlocks = 0;
        for (int dir = 0; dir <= 5; ++dir) {
            helper = ParasiteEventWorld.directionToSpread(pos, dir);
            IBlockState lookingState = worldIn.func_180495_p(helper);
            Material mat = lookingState.func_185904_a();
            Block lookingBlock = lookingState.func_177230_c();
            if (lookingBlock instanceof IMetaName) continue;
            if (lookingBlock.isWood((IBlockAccess)worldIn, helper) || lookingBlock == SRPBlocks.InfestedTrunk) {
                ++covertedBlocks;
                worldIn.func_175656_a(helper, SRPBlocks.ParasiteTrunk.func_176223_P());
            }
            if (ParasiteEventWorld.blockException(worldIn, helper, lookingBlock, lookingState, SRPConfigWorld.blockBBiomeList, SRPConfigWorld.blockBBiomeListWhite, SRPConfigWorld.biomeBlockIMaxH)) continue;
            if (lookingBlock == SRPBlocks.InfestedStain) {
                worldIn.func_175656_a(helper, SRPBlocks.ParasiteStain.func_176223_P());
                ParasiteEventWorld.spawnGenFeatureParasite(worldIn, helper.func_177984_a(), rand);
                ParasiteEventWorld.spawnGenRoofParasite(worldIn, helper.func_177977_b(), rand);
                continue;
            }
            if (mat == Material.field_151578_c || mat == Material.field_151577_b) {
                worldIn.func_175656_a(helper, SRPBlocks.ParasiteStain.func_176223_P());
                ++covertedBlocks;
                ParasiteEventWorld.spawnGenFeatureParasite(worldIn, helper.func_177984_a(), rand);
                ParasiteEventWorld.spawnGenRoofParasite(worldIn, helper.func_177977_b(), rand);
                continue;
            }
            if (mat == Material.field_151595_p) {
                worldIn.func_175656_a(helper, SRPBlocks.ParasiteStain.func_176223_P().func_177226_a(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.MUD)));
                ++covertedBlocks;
                ParasiteEventWorld.spawnGenFeatureParasite(worldIn, helper.func_177984_a(), rand);
                ParasiteEventWorld.spawnGenRoofParasite(worldIn, helper.func_177977_b(), rand);
                continue;
            }
            if (mat == Material.field_151576_e) {
                if (lookingBlock == SRPBlocks.BiomeHeart || lookingBlock == SRPBlocks.ColonyHeart) continue;
                if (lookingBlock == Blocks.field_150343_Z) {
                    worldIn.func_175656_a(helper, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.OBSIDIAN)));
                } else if (lookingBlock.getRegistryName().toString().contains("brick")) {
                    worldIn.func_175656_a(helper, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BRICKS)));
                } else {
                    worldIn.func_175656_a(helper, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.STONE)));
                }
                ++covertedBlocks;
                ParasiteEventWorld.spawnGenFeatureParasite(worldIn, helper.func_177984_a(), rand);
                ParasiteEventWorld.spawnGenRoofParasite(worldIn, helper.func_177977_b(), rand);
                continue;
            }
            if (mat == Material.field_151585_k) {
                worldIn.func_175656_a(helper, SRPBlocks.ParasiteStain.func_176223_P().func_177226_a(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.FLESH)));
                ++covertedBlocks;
                continue;
            }
            if (mat == Material.field_151588_w || mat == Material.field_151598_x) {
                worldIn.func_175656_a(helper, SRPBlocks.BloodyIce.func_176223_P());
                ++covertedBlocks;
                continue;
            }
            if (mat == Material.field_151573_f) {
                worldIn.func_175656_a(helper, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.METAL)));
                ++covertedBlocks;
                continue;
            }
            if (mat != Material.field_151575_d || lookingBlock.isWood((IBlockAccess)worldIn, helper) || lookingBlock == SRPBlocks.InfestedTrunk) continue;
            if (lookingBlock.getRegistryName().toString().contains("mushroom")) {
                worldIn.func_175656_a(helper, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.FUNGUS)));
            } else {
                worldIn.func_175656_a(helper, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.WOOD)));
            }
            ++covertedBlocks;
        }
        if (covertedBlocks != 0) {
            blockParasiteCount += covertedBlocks;
            if (SRPConfigSystems.useEvolution) {
                SRPSaveData.get(worldIn).setTotalKills(worldIn.field_73011_w.getDimension(), SRPConfigSystems.valueBlock * covertedBlocks, true, worldIn, true);
            }
        }
    }

    public static void spreadBiomeBlockTrunk(World worldIn, BlockPos pos, Random rand) {
        BlockPos helper = pos;
        int posx = pos.func_177958_n();
        int posz = pos.func_177952_p();
        int posy = pos.func_177956_o();
        for (int x = -1; x <= 1; ++x) {
            for (int z = -1; z <= 1; ++z) {
                for (int y = -1; y <= 1; ++y) {
                    helper = new BlockPos(posx + x, posy + y, posz + z);
                    IBlockState lookingState = worldIn.func_180495_p(helper);
                    Block lookingBlock = lookingState.func_177230_c();
                    if (!lookingBlock.isWood((IBlockAccess)worldIn, helper) || lookingBlock == SRPBlocks.ParasiteTrunk) continue;
                    worldIn.func_175656_a(helper, SRPBlocks.ParasiteTrunk.func_176223_P());
                    if (!SRPConfigSystems.useEvolution) continue;
                    SRPSaveData.get(worldIn).setTotalKills(worldIn.field_73011_w.getDimension(), SRPConfigSystems.valueBlock, true, worldIn, true);
                }
            }
        }
    }

    public static BlockPos directionToSpread(BlockPos atm, int choice) {
        switch (choice) {
            case 0: {
                atm = atm.func_177978_c();
                break;
            }
            case 1: {
                atm = atm.func_177974_f();
                break;
            }
            case 2: {
                atm = atm.func_177976_e();
                break;
            }
            case 3: {
                atm = atm.func_177968_d();
                break;
            }
            case 4: {
                atm = atm.func_177984_a();
                break;
            }
            default: {
                atm = atm.func_177977_b();
            }
        }
        return atm;
    }

    public static void spawnGenFeatureParasite(World worldIn, BlockPos pos, Random rand) {
        WorldGenParasiteGenAbstract gen;
        double bonus = 0.0;
        if (worldIn.func_180495_p(pos).func_177230_c() != Blocks.field_150350_a && worldIn.func_180495_p(pos).func_185904_a() == Material.field_151586_h) {
            pos = ParasiteEventEntity.getFloor(worldIn, pos, 10);
            bonus = 3.0E-5;
            if (pos == null) {
                return;
            }
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeTree) {
            if (rand.nextDouble() < 0.2) {
                WorldGenParasiteTreeThin gen2 = new WorldGenParasiteTreeThin(false);
                if (!gen2.func_180709_b(worldIn, rand, pos) && worldIn.func_180495_p(pos).func_177230_c() == Blocks.field_150350_a) {
                    worldIn.func_175656_a(pos, SRPBlocks.ParasiteSapling.func_176223_P().func_177226_a(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.TREE)));
                }
                return;
            }
            WorldGenParasiteTree gen3 = new WorldGenParasiteTree(false);
            if (!gen3.func_180709_b(worldIn, rand, pos) && worldIn.func_180495_p(pos).func_177230_c() == Blocks.field_150350_a) {
                worldIn.func_175656_a(pos, SRPBlocks.ParasiteSapling.func_176223_P().func_177226_a(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.TREETHIN)));
            }
            return;
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeFlower) {
            WorldGenParasiteTallFlower gen4 = new WorldGenParasiteTallFlower(false);
            if (!gen4.func_180709_b(worldIn, rand, pos) && worldIn.func_180495_p(pos).func_177230_c() == Blocks.field_150350_a) {
                worldIn.func_175656_a(pos, SRPBlocks.ParasiteSapling.func_176223_P().func_177226_a(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.FLOWERTALL)));
            }
            return;
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeSpine) {
            WorldGenParasiteSpine gen5 = new WorldGenParasiteSpine(false);
            if (!gen5.func_180709_b(worldIn, rand, pos)) {
                // empty if block
            }
            return;
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeTenflower) {
            WorldGenParasiteTenFlower gen6 = new WorldGenParasiteTenFlower(false);
            if (!gen6.func_180709_b(worldIn, rand, pos)) {
                // empty if block
            }
            return;
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeBall + bonus) {
            WorldGenParasiteBall gen7 = new WorldGenParasiteBall(false);
            if (!gen7.func_180709_b(worldIn, rand, pos)) {
                // empty if block
            }
            return;
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeBigBall + bonus) {
            WorldGenParasiteBigBall gen8 = new WorldGenParasiteBigBall(false);
            if (!gen8.func_180709_b(worldIn, rand, pos)) {
                // empty if block
            }
            return;
        }
        if (rand.nextInt(500) == 0) {
            gen = new WorldGenParasiteBush(false, BlockParasiteBush.EnumType.TENDRIL, 4);
            ((WorldGenParasiteBush)gen).func_180709_b(worldIn, rand, pos);
        }
        if (rand.nextInt(250) == 0) {
            switch (rand.nextInt(3)) {
                case 0: {
                    WorldGenParasiteBush gen1 = new WorldGenParasiteBush(false, BlockParasiteBush.EnumType.POP, 1);
                    gen1.func_180709_b(worldIn, rand, pos);
                    break;
                }
                case 1: {
                    WorldGenParasiteBush gen2 = new WorldGenParasiteBush(false, BlockParasiteBush.EnumType.EYE, 2);
                    gen2.func_180709_b(worldIn, rand, pos);
                    break;
                }
                case 2: {
                    WorldGenParasiteBush gen3 = new WorldGenParasiteBush(false, BlockParasiteBush.EnumType.TOOH, 3);
                    gen3.func_180709_b(worldIn, rand, pos);
                }
            }
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeMouth && ((WorldGenParasiteMouth)(gen = new WorldGenParasiteMouth(false))).func_180709_b(worldIn, rand, pos)) {
            return;
        }
    }

    public static void spawnGenRoofParasite(World worldIn, BlockPos pos, Random rand) {
        if (worldIn.func_180495_p(pos).func_177230_c() != Blocks.field_150350_a) {
            return;
        }
        worldIn.func_175656_a(pos, SRPBlocks.ParasiteBush.func_176223_P().func_177226_a(BlockParasiteBush.VARIANT, (Comparable)((Object)BlockParasiteBush.EnumType.BINE)));
        pos = pos.func_177977_b();
        if (worldIn.func_180495_p(pos).func_177230_c() != Blocks.field_150350_a) {
            return;
        }
        worldIn.func_175656_a(pos, SRPBlocks.ParasiteBush.func_176223_P().func_177226_a(BlockParasiteBush.VARIANT, (Comparable)((Object)BlockParasiteBush.EnumType.BINE)));
        pos = pos.func_177977_b();
        if (rand.nextInt(2) == 0) {
            if (worldIn.func_180495_p(pos).func_177230_c() != Blocks.field_150350_a) {
                return;
            }
            worldIn.func_175656_a(pos, SRPBlocks.ParasiteBush.func_176223_P().func_177226_a(BlockParasiteBush.VARIANT, (Comparable)((Object)BlockParasiteBush.EnumType.BINE)));
            pos = pos.func_177977_b();
            if (rand.nextInt(2) == 0) {
                if (worldIn.func_180495_p(pos).func_177230_c() != Blocks.field_150350_a) {
                    return;
                }
                worldIn.func_175656_a(pos, SRPBlocks.ParasiteBush.func_176223_P().func_177226_a(BlockParasiteBush.VARIANT, (Comparable)((Object)BlockParasiteBush.EnumType.BINE)));
                pos = pos.func_177977_b();
                if (rand.nextInt(2) == 0) {
                    if (worldIn.func_180495_p(pos).func_177230_c() != Blocks.field_150350_a) {
                        return;
                    }
                    worldIn.func_175656_a(pos, SRPBlocks.ParasiteBush.func_176223_P().func_177226_a(BlockParasiteBush.VARIANT, (Comparable)((Object)BlockParasiteBush.EnumType.BINE)));
                }
            }
        }
    }

    public static void spawnGenFeatureInfested(World worldIn, BlockPos pos, Random rand) {
        WorldGenParasiteBush gen;
        double bonus = 0.0;
        if (worldIn.func_180495_p(pos).func_177230_c() != Blocks.field_150350_a && worldIn.func_180495_p(pos).func_185904_a() == Material.field_151586_h) {
            pos = ParasiteEventEntity.getFloor(worldIn, pos, 10);
            bonus = 3.0E-5;
            if (pos == null) {
                return;
            }
        }
        if (rand.nextInt(20) == 0) {
            gen = new WorldGenParasiteBush(false, BlockInfestedBush.EnumType.SPINE, 4);
            gen.func_180709_b(worldIn, rand, pos);
        }
        if (rand.nextInt(20) == 0) {
            if (rand.nextInt(2) == 0) {
                gen = new WorldGenParasiteBush(false, BlockInfestedBush.EnumType.ARC, 2);
                gen.func_180709_b(worldIn, rand, pos);
            } else {
                gen = new WorldGenParasiteBush(false, BlockInfestedBush.EnumType.GRASS1, 1);
                gen.func_180709_b(worldIn, rand, pos);
            }
        }
    }

    public static void spawnGenRoofInfested(World worldIn, BlockPos pos, Random rand) {
        if (worldIn.func_180495_p(pos).func_177230_c() != Blocks.field_150350_a) {
            return;
        }
        if (rand.nextInt(5) == 0) {
            worldIn.func_175656_a(pos, SRPBlocks.InfestedBush.func_176223_P().func_177226_a(BlockInfestedBush.VARIANT, (Comparable)((Object)BlockInfestedBush.EnumType.VINE)));
            pos = pos.func_177977_b();
            if (rand.nextInt(4) == 0) {
                if (worldIn.func_180495_p(pos).func_177230_c() != Blocks.field_150350_a) {
                    return;
                }
                worldIn.func_175656_a(pos, SRPBlocks.InfestedBush.func_176223_P().func_177226_a(BlockInfestedBush.VARIANT, (Comparable)((Object)BlockInfestedBush.EnumType.VINE)));
                pos = pos.func_177977_b();
                if (rand.nextInt(3) == 0) {
                    if (worldIn.func_180495_p(pos).func_177230_c() != Blocks.field_150350_a) {
                        return;
                    }
                    worldIn.func_175656_a(pos, SRPBlocks.InfestedBush.func_176223_P().func_177226_a(BlockInfestedBush.VARIANT, (Comparable)((Object)BlockInfestedBush.EnumType.VINE)));
                }
            }
        }
    }

    public static void checkNodeStatus(World worldIn) {
        SRPWorldData data = SRPWorldData.get(worldIn);
        data.checkHeartExistance(worldIn);
    }

    public static int placeColonyInWorld(World worldIn, BlockPos pos) {
        if (!SRPConfigWorld.coloniesActivated) {
            return 3;
        }
        if (!ParasiteEventWorld.chechBlackListColonies(worldIn)) {
            return 2;
        }
        SRPWorldData data = SRPWorldData.get(worldIn);
        if (SRPConfigSystems.useEvolution) {
            if (SRPSaveData.get(worldIn).getEvolutionPhase(worldIn.field_73011_w.getDimension()) < SRPConfigSystems.evolutionColonyUnlock) {
                return 4;
            }
        } else if (!SRPConfigWorld.dodColony) {
            return 6;
        }
        int newX = ParasiteEventWorld.findNumberMultipleOf(pos.func_177958_n(), 26);
        int newZ = ParasiteEventWorld.findNumberMultipleOf(pos.func_177952_p(), 26);
        BlockPos newPos = new BlockPos(newX, pos.func_177956_o(), newZ);
        if ((newPos = ParasiteEventEntity.getFloor(worldIn, newPos, 100)) == null) {
            return 5;
        }
        int key = data.setColony(newPos.func_177958_n(), newPos.func_177956_o(), newPos.func_177952_p());
        if (key == 1) {
            WorldGenParasiteColonyCore gen = new WorldGenParasiteColonyCore(false);
            gen.func_180709_b(worldIn, new Random(), newPos);
            ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigWorld.colonyWarning, 101);
            return 1;
        }
        return key;
    }

    private static boolean chechBlackListColonies(World worldIn) {
        for (int i : SRPConfigWorld.blackListedDimensionsColonies) {
            if (i != worldIn.field_73011_w.getDimension()) continue;
            return true;
        }
        return false;
    }

    private static int findNumberMultipleOf(int n, int x) {
        if (x > n) {
            // empty if block
        }
        boolean neg = false;
        if (n < 0) {
            n *= -1;
            neg = true;
        }
        n += x / 2;
        n -= n % x;
        if (neg) {
            n *= -1;
        }
        return n;
    }

    public static boolean removeColonyInWorld(World worldIn, BlockPos pos) {
        if (!SRPConfigWorld.coloniesActivated) {
            return false;
        }
        SRPWorldData data = SRPWorldData.get(worldIn);
        if (data.removeColony(pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p())) {
            data.resetGlobalAdaptation();
            return true;
        }
        return false;
    }

    public static BlockPos rangeOfColony(World worldIn, BlockPos pos, boolean effect) {
        return SRPWorldData.get(worldIn).nearestColonyPosition(pos, effect);
    }

    public static int numberofColonies(World worldIn) {
        return SRPWorldData.get(worldIn).colonunumber();
    }

    public static int spreadOfColony(World worldIn, BlockPos pos) {
        return SRPWorldData.get(worldIn).getColonyDistanceSpreadByPosition(pos, false);
    }

    public static void checkColonyStatus(World worldIn) {
        SRPWorldData data = SRPWorldData.get(worldIn);
        data.checkColonyExistance(worldIn);
    }
}

