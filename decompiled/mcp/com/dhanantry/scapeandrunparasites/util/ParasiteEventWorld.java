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
        float bHard = state.getBlockHardness(worldIn, pos);
        if (block instanceof BlockBreakable && state.getMaterial() == Material.ICE) {
            return false;
        }
        if (bHard > maxHardness || bHard < 0.0f) {
            return true;
        }
        if (ParasiteEventEntity.checkName(block.getRegistryName().toString(), list, invert)) {
            return true;
        }
        return block instanceof BlockBreakable || block instanceof BlockContainer || block instanceof BlockOre || block instanceof BlockHorizontal || block instanceof BlockTNT || block.isPassable((IBlockAccess)worldIn, pos) || block instanceof IPlantable || !state.isFullCube();
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
        for (int x = pos.getX() - 4; x <= pos.getX() + 4; ++x) {
            for (int z = pos.getZ() - 4; z <= pos.getZ() + 4; ++z) {
                BlockPos convert = new BlockPos(x, pos.getY(), z);
                if (data.isInRangeOfHeart(convert, distance) == -1 || ParasiteEventEntity.checkName(worldIn.getBiome(convert).getRegistryName().toString(), SRPConfigWorld.biomeBlackList, SRPConfigWorld.biomeBlackListInverted)) continue;
                ParasiteEventWorld.positionToParasiteBiome(worldIn, convert);
                SRPMain.network.sendToDimension((IMessage)new SRPPacketBiomeChange(convert, true), worldIn.provider.getDimension());
            }
        }
    }

    public static void positionToParasiteBiome(World worldIn, BlockPos pos) {
        int inChunkX = pos.getX() & 0xF;
        int inChunkZ = pos.getZ() & 0xF;
        worldIn.getChunk((BlockPos)pos).getBiomeArray()[inChunkZ << 4 | inChunkX] = (byte)Biome.getIdForBiome((Biome)SRPBiomes.biomeInfested);
    }

    public static void killBiome(World worldIn, BlockPos pos, int range) {
        SRPWorldData data = SRPWorldData.get(worldIn);
        int worldTime = 0;
        for (int x = pos.getX() - range; x <= pos.getX() + range; ++x) {
            for (int z = pos.getZ() - range; z <= pos.getZ() + range; ++z) {
                int age = data.nearestHeartAge(pos, true, worldTime);
                int distance = data.getDistanceSpreadByAge(age, false);
                BlockPos convert = new BlockPos(x, pos.getY(), z);
                if (!(worldIn.getBiome(convert) instanceof BiomeParasite)) continue;
                ParasiteEventWorld.positionToBiome(worldIn, convert);
                SRPMain.network.sendToDimension((IMessage)new SRPPacketBiomeChange(convert, false), worldIn.provider.getDimension());
            }
        }
    }

    public static void positionToBiome(World worldIn, BlockPos pos) {
        int inChunkX = pos.getX() & 0xF;
        int inChunkZ = pos.getZ() & 0xF;
        worldIn.getChunk((BlockPos)pos).getBiomeArray()[inChunkZ << 4 | inChunkX] = (byte)Biome.getIdForBiome((Biome)Biomes.PLAINS);
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
        BlockPos origin = worldIn.getSpawnPoint();
        if (ParasiteEventWorld.getDistanceSQ(origin.getX(), origin.getY(), origin.getZ(), pos.getX(), pos.getY(), pos.getZ()) < (double)(SRPConfigWorld.minimumDistanceFromSpawnPoint * SRPConfigWorld.minimumDistanceFromSpawnPoint)) {
            return 5;
        }
        SRPWorldData data = SRPWorldData.get(worldIn);
        if (SRPConfigSystems.useEvolution) {
            if (SRPSaveData.get(worldIn).getEvolutionPhase(worldIn.provider.getDimension()) < SRPConfigSystems.evolutionNodeUnlock) {
                return 6;
            }
        } else if (!SRPConfigWorld.venkrolNode) {
            return 10;
        }
        if ((pos = ParasiteEventEntity.getFloor(worldIn, pos, 100)) == null) {
            return 7;
        }
        int key = data.setNode(pos.getX(), pos.getY(), pos.getZ());
        if (key == 1) {
            WorldGenParasiteNodeCore gen = new WorldGenParasiteNodeCore(false, 1);
            gen.generate(worldIn, new Random(), pos);
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
            if (i != worldIn.provider.getDimension()) continue;
            return true;
        }
        return false;
    }

    public static boolean removeHeartInWorld(World worldIn, BlockPos pos) {
        if (!SRPConfigWorld.nodesActivated || !SRPConfigWorld.biomeRegster) {
            return false;
        }
        SRPWorldData data = SRPWorldData.get(worldIn);
        return data.removeNode(pos.getX(), pos.getY(), pos.getZ());
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
        if (worldIn.getDifficulty() == EnumDifficulty.PEACEFUL) {
            return;
        }
        BlockPos helper = pos;
        int covertedBlocks = 0;
        int pivot = 0;
        int range = SRPConfigMobs.venkrolsiiiRange - 1;
        int rangeY = SRPConfigMobs.venkrolsiiiRangeY;
        AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)(pos.getY() + 1), (double)(pos.getZ() + 1)).grow((double)range, (double)rangeY, (double)range);
        List moblist = worldIn.getEntitiesWithinAABB(EntityPStationaryArchitect.class, axisalignedbb);
        if (fromVenkrol) {
            if (moblist.isEmpty() && stage < 4) {
                if (worldIn.rand.nextDouble() < SRPConfigSystems.rsVenkrolEmpty && stage != 1 && (worldIn.getBlockState(pos.up()).getBlock() == Blocks.AIR || worldIn.getBlockState(pos.up()).getBlock() instanceof BlockBush)) {
                    if (worldIn.getLightBrightness(pos.up()) > 0.46666667f && stage < 4) {
                        return;
                    }
                    if (worldIn.getLightFor(EnumSkyBlock.BLOCK, pos.up()) > 7 && stage < 4) {
                        return;
                    }
                    EntityVenkrol out = new EntityVenkrol(worldIn);
                    out.setLocationAndAngles(pos.getX(), pos.getY() + 1, pos.getZ(), 0.0f, 0.0f);
                    worldIn.spawnEntity((Entity)out);
                    out.cannotDespawn(true);
                }
                return;
            }
            if (!moblist.isEmpty() && stage < 4) {
                int flagV = 0;
                for (EntityPStationaryArchitect mob : moblist) {
                    if (mob.isPotionActive(SRPPotions.PIVOT_E)) {
                        pivot = Math.max(mob.getActivePotionEffect(SRPPotions.PIVOT_E).getAmplifier() + 1, pivot);
                    }
                    if (mob.getStageV() < stage || flagV == 2) continue;
                    flagV = 0;
                    BlockPos venPos = mob.getPosition();
                    if (worldIn.getLightBrightness(venPos.up()) < (float)SRPConfigSystems.rsBlockLight / 15.0f && stage < 4) {
                        ++flagV;
                    }
                    if (worldIn.getLightFor(EnumSkyBlock.BLOCK, venPos.up()) >= SRPConfigSystems.rsBlockLight || stage >= 4) continue;
                    ++flagV;
                }
                if (flagV < 2) {
                    return;
                }
            }
        }
        for (int dir = 0; dir <= 5; ++dir) {
            helper = ParasiteEventWorld.directionToSpread(pos, dir);
            IBlockState lookingState = worldIn.getBlockState(helper);
            Material mat = lookingState.getMaterial();
            Block lookingBlock = lookingState.getBlock();
            if (lookingBlock instanceof IMetaName) continue;
            if (lookingBlock.isWood((IBlockAccess)worldIn, helper) && stage <= 3) {
                ++covertedBlocks;
                worldIn.setBlockState(helper, SRPBlocks.InfestedTrunk.getDefaultState());
            }
            if (ParasiteEventWorld.blockException(worldIn, helper, lookingBlock, lookingState, SRPConfigSystems.blockBList, SRPConfigSystems.blockBListWhite, SRPConfigSystems.rsBlockIMaxH) && stage <= 3) continue;
            if (lookingBlock instanceof BlockBase) {
                if (lookingBlock == SRPBlocks.BiomeHeart || lookingBlock == SRPBlocks.ColonyHeart) continue;
                if (mat == Material.GROUND) {
                    int lookM = lookingBlock.getMetaFromState(lookingState);
                    if (stage >= 4 && (lookM <= 1 || stage == 5)) {
                        worldIn.setBlockState(helper, SRPBlocks.InfestedStain.getDefaultState().withProperty((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(stage)));
                        worldIn.updateBlockTick(helper, SRPBlocks.InfestedStain.getDefaultState().withProperty((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(stage)).getBlock(), 40, 5);
                        continue;
                    }
                    if (lookM >= stage || stage >= 4) continue;
                    worldIn.setBlockState(helper, SRPBlocks.InfestedStain.getDefaultState().withProperty((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(stage)));
                    continue;
                }
                if (mat != Material.ROCK) continue;
                int lookM = lookingBlock.getMetaFromState(lookingState);
                if (stage >= 4 && (lookM <= 1 || stage == 5)) {
                    worldIn.setBlockState(helper, SRPBlocks.InfestedRubble.getDefaultState().withProperty((IProperty)BlockInfestedRubble.STAGE, (Comparable)Integer.valueOf(stage)));
                    worldIn.updateBlockTick(helper, SRPBlocks.InfestedRubble.getDefaultState().withProperty((IProperty)BlockInfestedRubble.STAGE, (Comparable)Integer.valueOf(stage)).getBlock(), 40, 5);
                    continue;
                }
                if (lookM >= stage || stage >= 4 || stage < 2) continue;
                worldIn.setBlockState(helper, SRPBlocks.InfestedRubble.getDefaultState().withProperty((IProperty)BlockInfestedRubble.STAGE, (Comparable)Integer.valueOf(stage)));
                continue;
            }
            if (stage >= 4) continue;
            if (mat == Material.GROUND || mat == Material.GRASS) {
                worldIn.setBlockState(helper, SRPBlocks.InfestedStain.getDefaultState().withProperty((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(stage)));
                ++covertedBlocks;
                ParasiteEventWorld.spawnGenFeatureInfested(worldIn, helper.up(), rand);
                ParasiteEventWorld.spawnGenRoofInfested(worldIn, helper.down(), rand);
                continue;
            }
            if (mat == Material.SAND) {
                worldIn.setBlockState(helper, SRPBlocks.InfestedStain.getDefaultState().withProperty((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(stage)));
                ++covertedBlocks;
                ParasiteEventWorld.spawnGenFeatureInfested(worldIn, helper.up(), rand);
                ParasiteEventWorld.spawnGenRoofInfested(worldIn, helper.down(), rand);
                continue;
            }
            if (mat == Material.ROCK) {
                if (stage < 2) continue;
                worldIn.setBlockState(helper, SRPBlocks.InfestedRubble.getDefaultState().withProperty((IProperty)BlockInfestedRubble.STAGE, (Comparable)Integer.valueOf(stage)));
                ++covertedBlocks;
                ParasiteEventWorld.spawnGenFeatureInfested(worldIn, helper.up(), rand);
                ParasiteEventWorld.spawnGenRoofInfested(worldIn, helper.down(), rand);
                continue;
            }
            if (mat != Material.PLANTS) continue;
        }
        if (stage >= 4) {
            if (worldIn.getBlockState(pos).getBlock() == SRPBlocks.InfestedStain) {
                worldIn.setBlockState(pos, SRPBlocks.optionalDirt.getDefaultState());
            } else if (worldIn.getBlockState(pos).getBlock() == SRPBlocks.InfestedRubble) {
                worldIn.setBlockState(pos, SRPBlocks.optionalRub.getDefaultState());
            }
            if (worldIn.getBlockState(pos.up()).getBlock() == Blocks.AIR || worldIn.getBlockState(pos.up()).getBlock() == SRPBlocks.ParasiteBush) {
                worldIn.setBlockState(pos.up(), SRPBlocks.InfestRemain.getDefaultState());
            }
        } else if (covertedBlocks != 0) {
            blockInfestedCount += covertedBlocks;
            if (SRPConfigSystems.useEvolution) {
                if (pivot != 0) {
                    SRPSaveData.get(worldIn).setTotalKills(worldIn.provider.getDimension(), SRPConfigSystems.valueBlock * covertedBlocks * (SRPConfigSystems.pivotPointMultiplier * pivot), true, worldIn, true);
                } else {
                    SRPSaveData.get(worldIn).setTotalKills(worldIn.provider.getDimension(), SRPConfigSystems.valueBlock * covertedBlocks, true, worldIn, true);
                }
            }
        }
    }

    public static void spreadBiomeBlockStain(World worldIn, BlockPos pos, Random rand) {
        BlockPos helper = pos;
        int covertedBlocks = 0;
        for (int dir = 0; dir <= 5; ++dir) {
            helper = ParasiteEventWorld.directionToSpread(pos, dir);
            IBlockState lookingState = worldIn.getBlockState(helper);
            Material mat = lookingState.getMaterial();
            Block lookingBlock = lookingState.getBlock();
            if (lookingBlock instanceof IMetaName) continue;
            if (lookingBlock.isWood((IBlockAccess)worldIn, helper) || lookingBlock == SRPBlocks.InfestedTrunk) {
                ++covertedBlocks;
                worldIn.setBlockState(helper, SRPBlocks.ParasiteTrunk.getDefaultState());
            }
            if (ParasiteEventWorld.blockException(worldIn, helper, lookingBlock, lookingState, SRPConfigWorld.blockBBiomeList, SRPConfigWorld.blockBBiomeListWhite, SRPConfigWorld.biomeBlockIMaxH)) continue;
            if (lookingBlock == SRPBlocks.InfestedStain) {
                worldIn.setBlockState(helper, SRPBlocks.ParasiteStain.getDefaultState());
                ParasiteEventWorld.spawnGenFeatureParasite(worldIn, helper.up(), rand);
                ParasiteEventWorld.spawnGenRoofParasite(worldIn, helper.down(), rand);
                continue;
            }
            if (mat == Material.GROUND || mat == Material.GRASS) {
                worldIn.setBlockState(helper, SRPBlocks.ParasiteStain.getDefaultState());
                ++covertedBlocks;
                ParasiteEventWorld.spawnGenFeatureParasite(worldIn, helper.up(), rand);
                ParasiteEventWorld.spawnGenRoofParasite(worldIn, helper.down(), rand);
                continue;
            }
            if (mat == Material.SAND) {
                worldIn.setBlockState(helper, SRPBlocks.ParasiteStain.getDefaultState().withProperty(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.MUD)));
                ++covertedBlocks;
                ParasiteEventWorld.spawnGenFeatureParasite(worldIn, helper.up(), rand);
                ParasiteEventWorld.spawnGenRoofParasite(worldIn, helper.down(), rand);
                continue;
            }
            if (mat == Material.ROCK) {
                if (lookingBlock == SRPBlocks.BiomeHeart || lookingBlock == SRPBlocks.ColonyHeart) continue;
                if (lookingBlock == Blocks.OBSIDIAN) {
                    worldIn.setBlockState(helper, SRPBlocks.ParasiteRubble.getDefaultState().withProperty(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.OBSIDIAN)));
                } else if (lookingBlock.getRegistryName().toString().contains("brick")) {
                    worldIn.setBlockState(helper, SRPBlocks.ParasiteRubble.getDefaultState().withProperty(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BRICKS)));
                } else {
                    worldIn.setBlockState(helper, SRPBlocks.ParasiteRubble.getDefaultState().withProperty(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.STONE)));
                }
                ++covertedBlocks;
                ParasiteEventWorld.spawnGenFeatureParasite(worldIn, helper.up(), rand);
                ParasiteEventWorld.spawnGenRoofParasite(worldIn, helper.down(), rand);
                continue;
            }
            if (mat == Material.PLANTS) {
                worldIn.setBlockState(helper, SRPBlocks.ParasiteStain.getDefaultState().withProperty(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.FLESH)));
                ++covertedBlocks;
                continue;
            }
            if (mat == Material.ICE || mat == Material.PACKED_ICE) {
                worldIn.setBlockState(helper, SRPBlocks.BloodyIce.getDefaultState());
                ++covertedBlocks;
                continue;
            }
            if (mat == Material.IRON) {
                worldIn.setBlockState(helper, SRPBlocks.ParasiteRubble.getDefaultState().withProperty(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.METAL)));
                ++covertedBlocks;
                continue;
            }
            if (mat != Material.WOOD || lookingBlock.isWood((IBlockAccess)worldIn, helper) || lookingBlock == SRPBlocks.InfestedTrunk) continue;
            if (lookingBlock.getRegistryName().toString().contains("mushroom")) {
                worldIn.setBlockState(helper, SRPBlocks.ParasiteRubble.getDefaultState().withProperty(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.FUNGUS)));
            } else {
                worldIn.setBlockState(helper, SRPBlocks.ParasiteRubble.getDefaultState().withProperty(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.WOOD)));
            }
            ++covertedBlocks;
        }
        if (covertedBlocks != 0) {
            blockParasiteCount += covertedBlocks;
            if (SRPConfigSystems.useEvolution) {
                SRPSaveData.get(worldIn).setTotalKills(worldIn.provider.getDimension(), SRPConfigSystems.valueBlock * covertedBlocks, true, worldIn, true);
            }
        }
    }

    public static void spreadBiomeBlockTrunk(World worldIn, BlockPos pos, Random rand) {
        BlockPos helper = pos;
        int posx = pos.getX();
        int posz = pos.getZ();
        int posy = pos.getY();
        for (int x = -1; x <= 1; ++x) {
            for (int z = -1; z <= 1; ++z) {
                for (int y = -1; y <= 1; ++y) {
                    helper = new BlockPos(posx + x, posy + y, posz + z);
                    IBlockState lookingState = worldIn.getBlockState(helper);
                    Block lookingBlock = lookingState.getBlock();
                    if (!lookingBlock.isWood((IBlockAccess)worldIn, helper) || lookingBlock == SRPBlocks.ParasiteTrunk) continue;
                    worldIn.setBlockState(helper, SRPBlocks.ParasiteTrunk.getDefaultState());
                    if (!SRPConfigSystems.useEvolution) continue;
                    SRPSaveData.get(worldIn).setTotalKills(worldIn.provider.getDimension(), SRPConfigSystems.valueBlock, true, worldIn, true);
                }
            }
        }
    }

    public static BlockPos directionToSpread(BlockPos atm, int choice) {
        switch (choice) {
            case 0: {
                atm = atm.north();
                break;
            }
            case 1: {
                atm = atm.east();
                break;
            }
            case 2: {
                atm = atm.west();
                break;
            }
            case 3: {
                atm = atm.south();
                break;
            }
            case 4: {
                atm = atm.up();
                break;
            }
            default: {
                atm = atm.down();
            }
        }
        return atm;
    }

    public static void spawnGenFeatureParasite(World worldIn, BlockPos pos, Random rand) {
        WorldGenParasiteGenAbstract gen;
        double bonus = 0.0;
        if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR && worldIn.getBlockState(pos).getMaterial() == Material.WATER) {
            pos = ParasiteEventEntity.getFloor(worldIn, pos, 10);
            bonus = 3.0E-5;
            if (pos == null) {
                return;
            }
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeTree) {
            if (rand.nextDouble() < 0.2) {
                WorldGenParasiteTreeThin gen2 = new WorldGenParasiteTreeThin(false);
                if (!gen2.generate(worldIn, rand, pos) && worldIn.getBlockState(pos).getBlock() == Blocks.AIR) {
                    worldIn.setBlockState(pos, SRPBlocks.ParasiteSapling.getDefaultState().withProperty(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.TREE)));
                }
                return;
            }
            WorldGenParasiteTree gen3 = new WorldGenParasiteTree(false);
            if (!gen3.generate(worldIn, rand, pos) && worldIn.getBlockState(pos).getBlock() == Blocks.AIR) {
                worldIn.setBlockState(pos, SRPBlocks.ParasiteSapling.getDefaultState().withProperty(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.TREETHIN)));
            }
            return;
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeFlower) {
            WorldGenParasiteTallFlower gen4 = new WorldGenParasiteTallFlower(false);
            if (!gen4.generate(worldIn, rand, pos) && worldIn.getBlockState(pos).getBlock() == Blocks.AIR) {
                worldIn.setBlockState(pos, SRPBlocks.ParasiteSapling.getDefaultState().withProperty(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.FLOWERTALL)));
            }
            return;
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeSpine) {
            WorldGenParasiteSpine gen5 = new WorldGenParasiteSpine(false);
            if (!gen5.generate(worldIn, rand, pos)) {
                // empty if block
            }
            return;
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeTenflower) {
            WorldGenParasiteTenFlower gen6 = new WorldGenParasiteTenFlower(false);
            if (!gen6.generate(worldIn, rand, pos)) {
                // empty if block
            }
            return;
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeBall + bonus) {
            WorldGenParasiteBall gen7 = new WorldGenParasiteBall(false);
            if (!gen7.generate(worldIn, rand, pos)) {
                // empty if block
            }
            return;
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeBigBall + bonus) {
            WorldGenParasiteBigBall gen8 = new WorldGenParasiteBigBall(false);
            if (!gen8.generate(worldIn, rand, pos)) {
                // empty if block
            }
            return;
        }
        if (rand.nextInt(500) == 0) {
            gen = new WorldGenParasiteBush(false, BlockParasiteBush.EnumType.TENDRIL, 4);
            ((WorldGenParasiteBush)gen).generate(worldIn, rand, pos);
        }
        if (rand.nextInt(250) == 0) {
            switch (rand.nextInt(3)) {
                case 0: {
                    WorldGenParasiteBush gen1 = new WorldGenParasiteBush(false, BlockParasiteBush.EnumType.POP, 1);
                    gen1.generate(worldIn, rand, pos);
                    break;
                }
                case 1: {
                    WorldGenParasiteBush gen2 = new WorldGenParasiteBush(false, BlockParasiteBush.EnumType.EYE, 2);
                    gen2.generate(worldIn, rand, pos);
                    break;
                }
                case 2: {
                    WorldGenParasiteBush gen3 = new WorldGenParasiteBush(false, BlockParasiteBush.EnumType.TOOH, 3);
                    gen3.generate(worldIn, rand, pos);
                }
            }
        }
        if (rand.nextDouble() < SRPConfigWorld.biomeMouth && ((WorldGenParasiteMouth)(gen = new WorldGenParasiteMouth(false))).generate(worldIn, rand, pos)) {
            return;
        }
    }

    public static void spawnGenRoofParasite(World worldIn, BlockPos pos, Random rand) {
        if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR) {
            return;
        }
        worldIn.setBlockState(pos, SRPBlocks.ParasiteBush.getDefaultState().withProperty(BlockParasiteBush.VARIANT, (Comparable)((Object)BlockParasiteBush.EnumType.BINE)));
        pos = pos.down();
        if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR) {
            return;
        }
        worldIn.setBlockState(pos, SRPBlocks.ParasiteBush.getDefaultState().withProperty(BlockParasiteBush.VARIANT, (Comparable)((Object)BlockParasiteBush.EnumType.BINE)));
        pos = pos.down();
        if (rand.nextInt(2) == 0) {
            if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR) {
                return;
            }
            worldIn.setBlockState(pos, SRPBlocks.ParasiteBush.getDefaultState().withProperty(BlockParasiteBush.VARIANT, (Comparable)((Object)BlockParasiteBush.EnumType.BINE)));
            pos = pos.down();
            if (rand.nextInt(2) == 0) {
                if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR) {
                    return;
                }
                worldIn.setBlockState(pos, SRPBlocks.ParasiteBush.getDefaultState().withProperty(BlockParasiteBush.VARIANT, (Comparable)((Object)BlockParasiteBush.EnumType.BINE)));
                pos = pos.down();
                if (rand.nextInt(2) == 0) {
                    if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR) {
                        return;
                    }
                    worldIn.setBlockState(pos, SRPBlocks.ParasiteBush.getDefaultState().withProperty(BlockParasiteBush.VARIANT, (Comparable)((Object)BlockParasiteBush.EnumType.BINE)));
                }
            }
        }
    }

    public static void spawnGenFeatureInfested(World worldIn, BlockPos pos, Random rand) {
        WorldGenParasiteBush gen;
        double bonus = 0.0;
        if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR && worldIn.getBlockState(pos).getMaterial() == Material.WATER) {
            pos = ParasiteEventEntity.getFloor(worldIn, pos, 10);
            bonus = 3.0E-5;
            if (pos == null) {
                return;
            }
        }
        if (rand.nextInt(20) == 0) {
            gen = new WorldGenParasiteBush(false, BlockInfestedBush.EnumType.SPINE, 4);
            gen.generate(worldIn, rand, pos);
        }
        if (rand.nextInt(20) == 0) {
            if (rand.nextInt(2) == 0) {
                gen = new WorldGenParasiteBush(false, BlockInfestedBush.EnumType.ARC, 2);
                gen.generate(worldIn, rand, pos);
            } else {
                gen = new WorldGenParasiteBush(false, BlockInfestedBush.EnumType.GRASS1, 1);
                gen.generate(worldIn, rand, pos);
            }
        }
    }

    public static void spawnGenRoofInfested(World worldIn, BlockPos pos, Random rand) {
        if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR) {
            return;
        }
        if (rand.nextInt(5) == 0) {
            worldIn.setBlockState(pos, SRPBlocks.InfestedBush.getDefaultState().withProperty(BlockInfestedBush.VARIANT, (Comparable)((Object)BlockInfestedBush.EnumType.VINE)));
            pos = pos.down();
            if (rand.nextInt(4) == 0) {
                if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR) {
                    return;
                }
                worldIn.setBlockState(pos, SRPBlocks.InfestedBush.getDefaultState().withProperty(BlockInfestedBush.VARIANT, (Comparable)((Object)BlockInfestedBush.EnumType.VINE)));
                pos = pos.down();
                if (rand.nextInt(3) == 0) {
                    if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR) {
                        return;
                    }
                    worldIn.setBlockState(pos, SRPBlocks.InfestedBush.getDefaultState().withProperty(BlockInfestedBush.VARIANT, (Comparable)((Object)BlockInfestedBush.EnumType.VINE)));
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
            if (SRPSaveData.get(worldIn).getEvolutionPhase(worldIn.provider.getDimension()) < SRPConfigSystems.evolutionColonyUnlock) {
                return 4;
            }
        } else if (!SRPConfigWorld.dodColony) {
            return 6;
        }
        int newX = ParasiteEventWorld.findNumberMultipleOf(pos.getX(), 26);
        int newZ = ParasiteEventWorld.findNumberMultipleOf(pos.getZ(), 26);
        BlockPos newPos = new BlockPos(newX, pos.getY(), newZ);
        if ((newPos = ParasiteEventEntity.getFloor(worldIn, newPos, 100)) == null) {
            return 5;
        }
        int key = data.setColony(newPos.getX(), newPos.getY(), newPos.getZ());
        if (key == 1) {
            WorldGenParasiteColonyCore gen = new WorldGenParasiteColonyCore(false);
            gen.generate(worldIn, new Random(), newPos);
            ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigWorld.colonyWarning, 101);
            return 1;
        }
        return key;
    }

    private static boolean chechBlackListColonies(World worldIn) {
        for (int i : SRPConfigWorld.blackListedDimensionsColonies) {
            if (i != worldIn.provider.getDimension()) continue;
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
        if (data.removeColony(pos.getX(), pos.getY(), pos.getZ())) {
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

