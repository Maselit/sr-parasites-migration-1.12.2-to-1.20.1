package com.dhanantry.scapeandrunparasites.util;

import com.dhanantry.scapeandrunparasites.init.SRPBiomes;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.network.SRPPacketBiomeChange;
import com.dhanantry.scapeandrunparasites.network.SRPNetwork;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import com.dhanantry.scapeandrunparasites.world.SRPWorldData;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

/**
 * Migracion de ParasiteEventWorld (1.12.2) a 1.20.1.
 * Logica de mundo: propagacion del bioma parasitario, colocacion de nodos y colonias,
 * infestacion de bloques y generacion de rasgos.
 *
 * Nota: las equivalencias de Material de 1.12.2 se resuelven en 1.20.1 con tags
 * (BlockTags.DIRT / SAND / BASE_STONE_OVERWORLD / LOGS / LEAVES / ICE / METAL...).
 */
public class ParasiteEventWorld
{
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

    /** Excepcion de propagacion: terreno demasiado duro, en la lista negra o no propagable. */
    private static boolean blockException(Level worldIn, BlockPos pos, Block block, BlockState state, String[] list, boolean invert, float maxHardness) {
        float bHard = state.getDestroySpeed(worldIn, pos);
        if (bHard > maxHardness || bHard < 0.0f) {
            return true;
        }
        String regName = ForgeRegistries.BLOCKS.getKey(block) == null ? "" : ForgeRegistries.BLOCKS.getKey(block).toString();
        if (ParasiteEventEntity.checkName(regName, list, invert)) {
            return true;
        }
        // 1.12.2: BlockBreakable | BlockContainer | BlockOre | BlockHorizontal | BlockTNT | isPassable | IPlantable | !isFullCube
        boolean nonFull = !state.isCollisionShapeFullBlock(worldIn, pos);
        boolean plant = state.is(BlockTags.FLOWERS) || state.is(BlockTags.SAPLINGS)
            || state.getBlock() instanceof VineBlock || state.getBlock() instanceof BushBlock;
        return state.is(BlockTags.LOGS) || state.is(BlockTags.LEAVES) || nonFull || plant;
    }

    public static int canBiomeStillExist(Level worldIn, BlockPos pos, boolean spread) {
        if (!SRPConfigWorld.nodesActivated || !SRPConfigWorld.biomeRegster) {
            return -1;
        }
        return SRPWorldData.get(worldIn).nearestHeartAge(pos, spread, 0);
    }

    /** Convierte el bioma alrededor de un nodo en bioma parasitario. */
    public static void SpreadBiome(Level worldIn, BlockPos pos, int age) {
        if (!SRPConfigWorld.nodesActivated || !SRPConfigWorld.biomeRegster) {
            return;
        }
        SRPWorldData data = SRPWorldData.get(worldIn);
        int distance = data.getDistanceSpreadByAge(age, false);
        for (int x = pos.getX() - 4; x <= pos.getX() + 4; ++x) {
            for (int z = pos.getZ() - 4; z <= pos.getZ() + 4; ++z) {
                BlockPos convert = new BlockPos(x, pos.getY(), z);
                if (data.isInRangeOfHeart(convert, distance) == -1) continue;
                String biomeName = worldIn.getBiome(convert).unwrapKey()
                    .map(k -> k.location().toString()).orElse("");
                if (ParasiteEventEntity.checkName(biomeName, SRPConfigWorld.biomeBlackList, SRPConfigWorld.biomeBlackListInverted)) continue;
                positionToParasiteBiome(worldIn, convert);
                if (worldIn instanceof ServerLevel sl) {
                    SRPNetwork.toDimension(sl, new SRPPacketBiomeChange(convert, true));
                }
            }
        }
    }

    /** Escribe el bioma parasitario en el chunk (equivalente de 1.12.2 getBiomeArray()). */
    public static void positionToParasiteBiome(Level worldIn, BlockPos pos) {
        SRPBiomeUtil.setBiome(worldIn, pos, SRPBiomes.BIOME_INFESTED.getKey());
    }

    /** Revierte el bioma parasitorio a las llanuras. */
    public static void killBiome(Level worldIn, BlockPos pos, int range) {
        SRPWorldData data = SRPWorldData.get(worldIn);
        for (int x = pos.getX() - range; x <= pos.getX() + range; ++x) {
            for (int z = pos.getZ() - range; z <= pos.getZ() + range; ++z) {
                int age = data.nearestHeartAge(pos, true, 0);
                int distance = data.getDistanceSpreadByAge(age, false);
                BlockPos convert = new BlockPos(x, pos.getY(), z);
                if (!isParasiteBiome(worldIn, convert)) continue;
                positionToBiome(worldIn, convert);
                if (worldIn instanceof ServerLevel sl) {
                    SRPNetwork.toDimension(sl, new SRPPacketBiomeChange(convert, false));
                }
            }
        }
    }

    private static boolean isParasiteBiome(Level level, BlockPos pos) {
        // BiomeParasite ya no es una subclase de Biome (1.20.1), asi que se compara por clave de registro.
        return level.getBiome(pos).is(SRPBiomes.BIOME_INFESTED.getKey());
    }

    public static void positionToBiome(Level worldIn, BlockPos pos) {
        SRPBiomeUtil.setBiome(worldIn, pos, net.minecraft.world.level.biome.Biomes.PLAINS);
    }

    /** Coloca un nodo (BiomeHeart) en el mundo. */
    public static int placeHeartInWorld(Level worldIn, BlockPos pos) {
        if (!SRPConfigWorld.nodesActivated) {
            return 3;
        }
        if (!SRPConfigWorld.biomeRegster) {
            return 4;
        }
        if (!chechBlackListNodes(worldIn)) {
            return 2;
        }
        BlockPos origin = worldIn.getSharedSpawnPos();
        if (getDistanceSQ(origin.getX(), origin.getY(), origin.getZ(), pos.getX(), pos.getY(), pos.getZ()) < (double) (SRPConfigWorld.minimumDistanceFromSpawnPoint * SRPConfigWorld.minimumDistanceFromSpawnPoint)) {
            return 5;
        }
        SRPWorldData data = SRPWorldData.get(worldIn);
        if (SRPConfigSystems.useEvolution) {
            if (SRPSaveData.get(worldIn).getEvolutionPhase(SRPSaveData.dimensionId(worldIn)) < SRPConfigSystems.evolutionNodeUnlock) {
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
            // TODO: generacion de la estructura del nodo migrada en otro lote (worldgen)
            SpreadBiome(worldIn, pos, 1);
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

    private static boolean chechBlackListNodes(Level worldIn) {
        for (int i : SRPConfigWorld.blackListedDimensionsNodes) {
            if (i != SRPSaveData.dimensionId(worldIn)) continue;
            return true;
        }
        return false;
    }

    public static boolean removeHeartInWorld(Level worldIn, BlockPos pos) {
        if (!SRPConfigWorld.nodesActivated || !SRPConfigWorld.biomeRegster) {
            return false;
        }
        SRPWorldData data = SRPWorldData.get(worldIn);
        return data.removeNode(pos.getX(), pos.getY(), pos.getZ());
    }

    public static int getHeartAgePostion(Level worldIn, BlockPos pos) {
        return SRPWorldData.get(worldIn).getHeartPocition(pos, 0);
    }

    public static int nodesPoints(Level worldIn) {
        return SRPWorldData.get(worldIn).totalNodePoints(0);
    }

    /**
     * Infesta bloques alrededor de una posicion (usado por los bloques infestados y los venkrol).
     */
    public static void canInfestBlock(Level worldIn, BlockPos pos, RandomSource rand, int stage, boolean fromVenkrol) {
        if (blockInfestedCount > SRPConfig.BlockInfestedLimit) {
            return;
        }
        if (worldIn.getCurrentDifficultyAt(pos).getDifficulty() == Difficulty.PEACEFUL) {
            return;
        }
        BlockPos helper = pos;
        int covertedBlocks = 0;
        int pivot = 0;
        for (int dir = 0; dir <= 5; ++dir) {
            helper = directionToSpread(pos, dir);
            BlockState lookingState = worldIn.getBlockState(helper);
            Block lookingBlock = lookingState.getBlock();
            if (lookingBlock instanceof com.dhanantry.scapeandrunparasites.block.IMetaName) continue;
            if (lookingState.is(BlockTags.LOGS) && stage <= 3) {
                ++covertedBlocks;
                worldIn.setBlockAndUpdate(helper, SRPBlocks.InfestedTrunk.get().defaultBlockState());
            }
            if (blockException(worldIn, helper, lookingBlock, lookingState, SRPConfigSystems.blockBList, SRPConfigSystems.blockBListWhite, SRPConfigSystems.rsBlockIMaxH) && stage <= 3) continue;
            if (lookingBlock instanceof com.dhanantry.scapeandrunparasites.block.BlockBase) {
                if (lookingBlock == SRPBlocks.BiomeHeart.get() || lookingBlock == SRPBlocks.ColonyHeart.get()) continue;
                if (lookingState.is(BlockTags.DIRT)) {
                    int lookM = lookingState.getValue(com.dhanantry.scapeandrunparasites.block.BlockInfestedStain.STAGE);
                    if (stage >= 4 && (lookM <= 1 || stage == 5)) {
                        worldIn.setBlockAndUpdate(helper, SRPBlocks.InfestedStain.get().defaultBlockState()
                            .setValue(com.dhanantry.scapeandrunparasites.block.BlockInfestedStain.STAGE, stage));
                        worldIn.scheduleTick(helper, SRPBlocks.InfestedStain.get(), 40, net.minecraft.world.ticks.TickPriority.NORMAL);
                        continue;
                    }
                    if (lookM >= stage || stage >= 4) continue;
                    worldIn.setBlockAndUpdate(helper, SRPBlocks.InfestedStain.get().defaultBlockState()
                        .setValue(com.dhanantry.scapeandrunparasites.block.BlockInfestedStain.STAGE, stage));
                    continue;
                }
                if (!lookingState.is(BlockTags.BASE_STONE_OVERWORLD)) continue;
                int lookM = lookingState.getValue(com.dhanantry.scapeandrunparasites.block.BlockInfestedRubble.STAGE);
                if (stage >= 4 && (lookM <= 1 || stage == 5)) {
                    worldIn.setBlockAndUpdate(helper, SRPBlocks.InfestedRubble.get().defaultBlockState()
                        .setValue(com.dhanantry.scapeandrunparasites.block.BlockInfestedRubble.STAGE, stage));
                    worldIn.scheduleTick(helper, SRPBlocks.InfestedRubble.get(), 40, net.minecraft.world.ticks.TickPriority.NORMAL);
                    continue;
                }
                if (lookM >= stage || stage >= 4 || stage < 2) continue;
                worldIn.setBlockAndUpdate(helper, SRPBlocks.InfestedRubble.get().defaultBlockState()
                    .setValue(com.dhanantry.scapeandrunparasites.block.BlockInfestedRubble.STAGE, stage));
                continue;
            }
            if (stage >= 4) continue;
            if (lookingState.is(BlockTags.DIRT) || lookingState.is(BlockTags.SAND)) {
                worldIn.setBlockAndUpdate(helper, SRPBlocks.InfestedStain.get().defaultBlockState()
                    .setValue(com.dhanantry.scapeandrunparasites.block.BlockInfestedStain.STAGE, stage));
                ++covertedBlocks;
                spawnGenFeatureInfested(worldIn, helper.above(), rand);
                spawnGenRoofInfested(worldIn, helper.below(), rand);
                continue;
            }
            if (lookingState.is(BlockTags.BASE_STONE_OVERWORLD)) {
                if (stage < 2) continue;
                worldIn.setBlockAndUpdate(helper, SRPBlocks.InfestedRubble.get().defaultBlockState()
                    .setValue(com.dhanantry.scapeandrunparasites.block.BlockInfestedRubble.STAGE, stage));
                ++covertedBlocks;
                spawnGenFeatureInfested(worldIn, helper.above(), rand);
                spawnGenRoofInfested(worldIn, helper.below(), rand);
                continue;
            }
        }
        if (stage >= 4) {
            if (worldIn.getBlockState(pos).getBlock() == SRPBlocks.InfestedStain.get()) {
                worldIn.setBlockAndUpdate(pos, SRPBlocks.optionalDirt().defaultBlockState());
            } else if (worldIn.getBlockState(pos).getBlock() == SRPBlocks.InfestedRubble.get()) {
                worldIn.setBlockAndUpdate(pos, SRPBlocks.optionalRub().defaultBlockState());
            }
            if (worldIn.getBlockState(pos.above()).getBlock() == Blocks.AIR
                || worldIn.getBlockState(pos.above()).getBlock() == SRPBlocks.ParasiteBush.get()) {
                worldIn.setBlockAndUpdate(pos.above(), SRPBlocks.InfestRemain.get().defaultBlockState());
            }
        } else if (covertedBlocks != 0) {
            blockInfestedCount += covertedBlocks;
            if (SRPConfigSystems.useEvolution) {
                int dim = SRPSaveData.dimensionId(worldIn);
                if (pivot != 0) {
                    SRPSaveData.get(worldIn).setTotalKills(dim, SRPConfigSystems.valueBlock * covertedBlocks * (SRPConfigSystems.pivotPointMultiplier * pivot), true, worldIn, true);
                } else {
                    SRPSaveData.get(worldIn).setTotalKills(dim, SRPConfigSystems.valueBlock * covertedBlocks, true, worldIn, true);
                }
            }
        }
    }

    /** Convierte bloques normales en manchas/TRUNCOS de parasito. */
    public static void spreadBiomeBlockStain(Level worldIn, BlockPos pos, RandomSource rand) {
        BlockPos helper = pos;
        int covertedBlocks = 0;
        for (int dir = 0; dir <= 5; ++dir) {
            helper = directionToSpread(pos, dir);
            BlockState lookingState = worldIn.getBlockState(helper);
            Block lookingBlock = lookingState.getBlock();
            if (lookingBlock instanceof com.dhanantry.scapeandrunparasites.block.IMetaName) continue;
            if (lookingState.is(BlockTags.LOGS) || lookingBlock == SRPBlocks.InfestedTrunk.get()) {
                ++covertedBlocks;
                worldIn.setBlockAndUpdate(helper, SRPBlocks.ParasiteTrunk.get().defaultBlockState());
            }
            if (blockException(worldIn, helper, lookingBlock, lookingState, SRPConfigWorld.blockBBiomeList, SRPConfigWorld.blockBBiomeListWhite, SRPConfigWorld.biomeBlockIMaxH)) continue;
            if (lookingBlock == SRPBlocks.InfestedStain.get()) {
                worldIn.setBlockAndUpdate(helper, SRPBlocks.ParasiteStain.get().defaultBlockState());
                spawnGenFeatureParasite(worldIn, helper.above(), rand);
                spawnGenRoofParasite(worldIn, helper.below(), rand);
                continue;
            }
            if (lookingState.is(BlockTags.DIRT)) {
                worldIn.setBlockAndUpdate(helper, SRPBlocks.ParasiteStain.get().defaultBlockState());
                ++covertedBlocks;
                spawnGenFeatureParasite(worldIn, helper.above(), rand);
                spawnGenRoofParasite(worldIn, helper.below(), rand);
                continue;
            }
            if (lookingState.is(BlockTags.SAND)) {
                worldIn.setBlockAndUpdate(helper, SRPBlocks.ParasiteStain.get().defaultBlockState()
                    .setValue(com.dhanantry.scapeandrunparasites.block.BlockParasiteStain.VARIANT,
                        com.dhanantry.scapeandrunparasites.block.BlockParasiteStain.EnumType.MUD));
                ++covertedBlocks;
                spawnGenFeatureParasite(worldIn, helper.above(), rand);
                spawnGenRoofParasite(worldIn, helper.below(), rand);
                continue;
            }
            if (lookingState.is(BlockTags.BASE_STONE_OVERWORLD)) {
                if (lookingBlock == SRPBlocks.BiomeHeart.get() || lookingBlock == SRPBlocks.ColonyHeart.get()) continue;
                String regName = ForgeRegistries.BLOCKS.getKey(lookingBlock) == null ? "" : ForgeRegistries.BLOCKS.getKey(lookingBlock).toString();
                if (lookingBlock == Blocks.OBSIDIAN) {
                    worldIn.setBlockAndUpdate(helper, SRPBlocks.ParasiteRubble.get().defaultBlockState()
                        .setValue(com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble.VARIANT,
                            com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble.EnumType.OBSIDIAN));
                } else if (regName.contains("brick")) {
                    worldIn.setBlockAndUpdate(helper, SRPBlocks.ParasiteRubble.get().defaultBlockState()
                        .setValue(com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble.VARIANT,
                            com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble.EnumType.BRICKS));
                } else {
                    worldIn.setBlockAndUpdate(helper, SRPBlocks.ParasiteRubble.get().defaultBlockState()
                        .setValue(com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble.VARIANT,
                            com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble.EnumType.STONE));
                }
                ++covertedBlocks;
                spawnGenFeatureParasite(worldIn, helper.above(), rand);
                spawnGenRoofParasite(worldIn, helper.below(), rand);
                continue;
            }
            if (lookingState.is(BlockTags.FLOWERS) || lookingState.is(BlockTags.SAPLINGS)
                || lookingBlock instanceof VineBlock || lookingBlock instanceof BushBlock) {
                worldIn.setBlockAndUpdate(helper, SRPBlocks.ParasiteStain.get().defaultBlockState()
                    .setValue(com.dhanantry.scapeandrunparasites.block.BlockParasiteStain.VARIANT,
                        com.dhanantry.scapeandrunparasites.block.BlockParasiteStain.EnumType.FLESH));
                ++covertedBlocks;
                continue;
            }
            if (lookingState.is(BlockTags.ICE)) {
                worldIn.setBlockAndUpdate(helper, SRPBlocks.BloodyIce.get().defaultBlockState());
                ++covertedBlocks;
                continue;
            }
            if (lookingState.is(BlockTags.IRON_ORES) || lookingState.is(BlockTags.GOLD_ORES)
                || lookingState.is(BlockTags.DIAMOND_ORES) || lookingState.is(BlockTags.COPPER_ORES)) {
                worldIn.setBlockAndUpdate(helper, SRPBlocks.ParasiteRubble.get().defaultBlockState()
                    .setValue(com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble.VARIANT,
                        com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble.EnumType.METAL));
                ++covertedBlocks;
                continue;
            }
            if (lookingState.is(BlockTags.LOGS)) {
                String regName = ForgeRegistries.BLOCKS.getKey(lookingBlock) == null ? "" : ForgeRegistries.BLOCKS.getKey(lookingBlock).toString();
                if (regName.contains("mushroom")) {
                    worldIn.setBlockAndUpdate(helper, SRPBlocks.ParasiteRubble.get().defaultBlockState()
                        .setValue(com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble.VARIANT,
                            com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble.EnumType.FUNGUS));
                } else {
                    worldIn.setBlockAndUpdate(helper, SRPBlocks.ParasiteRubble.get().defaultBlockState()
                        .setValue(com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble.VARIANT,
                            com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble.EnumType.WOOD));
                }
                ++covertedBlocks;
            }
        }
        if (covertedBlocks != 0) {
            blockParasiteCount += covertedBlocks;
            if (SRPConfigSystems.useEvolution) {
                SRPSaveData.get(worldIn).setTotalKills(SRPSaveData.dimensionId(worldIn),
                    SRPConfigSystems.valueBlock * covertedBlocks, true, worldIn, true);
            }
        }
    }

    /** Convierte madera en troncos de parasito en el entorno 3x3x3. */
    public static void spreadBiomeBlockTrunk(Level worldIn, BlockPos pos, RandomSource rand) {
        int posx = pos.getX();
        int posz = pos.getZ();
        int posy = pos.getY();
        for (int x = -1; x <= 1; ++x) {
            for (int z = -1; z <= 1; ++z) {
                for (int y = -1; y <= 1; ++y) {
                    BlockPos helper = new BlockPos(posx + x, posy + y, posz + z);
                    BlockState lookingState = worldIn.getBlockState(helper);
                    if (!lookingState.is(BlockTags.LOGS) || lookingState.getBlock() == SRPBlocks.ParasiteTrunk.get()) continue;
                    worldIn.setBlockAndUpdate(helper, SRPBlocks.ParasiteTrunk.get().defaultBlockState());
                    if (!SRPConfigSystems.useEvolution) continue;
                    SRPSaveData.get(worldIn).setTotalKills(SRPSaveData.dimensionId(worldIn),
                        SRPConfigSystems.valueBlock, true, worldIn, true);
                }
            }
        }
    }

    public static BlockPos directionToSpread(BlockPos atm, int choice) {
        switch (choice) {
            case 0: return atm.north();
            case 1: return atm.east();
            case 2: return atm.west();
            case 3: return atm.south();
            case 4: return atm.above();
            default: return atm.below();
        }
    }

    /** Genera rasgos de parasito en el bioma. TODO: worldgen migrado en otro lote. */
    public static void spawnGenFeatureParasite(Level worldIn, BlockPos pos, RandomSource rand) {
        // TODO: features de worldgen migradas en otro lote (WorldGenParasiteTree, Bush, etc.)
    }

    public static void spawnGenRoofParasite(Level worldIn, BlockPos pos, RandomSource rand) {
        if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR) {
            return;
        }
        worldIn.setBlockAndUpdate(pos, SRPBlocks.ParasiteBush.get().defaultBlockState()
            .setValue(com.dhanantry.scapeandrunparasites.block.BlockParasiteBush.VARIANT,
                com.dhanantry.scapeandrunparasites.block.BlockParasiteBush.EnumType.BINE));
        pos = pos.below();
        if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR) {
            return;
        }
        worldIn.setBlockAndUpdate(pos, SRPBlocks.ParasiteBush.get().defaultBlockState()
            .setValue(com.dhanantry.scapeandrunparasites.block.BlockParasiteBush.VARIANT,
                com.dhanantry.scapeandrunparasites.block.BlockParasiteBush.EnumType.BINE));
    }

    /** Genera rasgos de infestacion. TODO: worldgen migrado en otro lote. */
    public static void spawnGenFeatureInfested(Level worldIn, BlockPos pos, RandomSource rand) {
        // TODO: features de worldgen migradas en otro lote (WorldGenParasiteBush)
    }

    public static void spawnGenRoofInfested(Level worldIn, BlockPos pos, RandomSource rand) {
        if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR) {
            return;
        }
        if (rand.nextInt(5) == 0) {
            worldIn.setBlockAndUpdate(pos, SRPBlocks.InfestedBush.get().defaultBlockState()
                .setValue(com.dhanantry.scapeandrunparasites.block.BlockInfestedBush.VARIANT,
                    com.dhanantry.scapeandrunparasites.block.BlockInfestedBush.EnumType.VINE));
            pos = pos.below();
            if (rand.nextInt(4) == 0) {
                if (worldIn.getBlockState(pos).getBlock() != Blocks.AIR) {
                    return;
                }
                worldIn.setBlockAndUpdate(pos, SRPBlocks.InfestedBush.get().defaultBlockState()
                    .setValue(com.dhanantry.scapeandrunparasites.block.BlockInfestedBush.VARIANT,
                        com.dhanantry.scapeandrunparasites.block.BlockInfestedBush.EnumType.VINE));
            }
        }
    }

    public static void checkNodeStatus(Level worldIn) {
        SRPWorldData data = SRPWorldData.get(worldIn);
        data.checkHeartExistance(worldIn);
    }

    /** Coloca una colonia (ColonyHeart) en el mundo. */
    public static int placeColonyInWorld(Level worldIn, BlockPos pos) {
        if (!SRPConfigWorld.coloniesActivated) {
            return 3;
        }
        if (!chechBlackListColonies(worldIn)) {
            return 2;
        }
        SRPWorldData data = SRPWorldData.get(worldIn);
        if (SRPConfigSystems.useEvolution) {
            if (SRPSaveData.get(worldIn).getEvolutionPhase(SRPSaveData.dimensionId(worldIn)) < SRPConfigSystems.evolutionColonyUnlock) {
                return 4;
            }
        } else if (!SRPConfigWorld.dodColony) {
            return 6;
        }
        int newX = findNumberMultipleOf(pos.getX(), 26);
        int newZ = findNumberMultipleOf(pos.getZ(), 26);
        BlockPos newPos = new BlockPos(newX, pos.getY(), newZ);
        if ((newPos = ParasiteEventEntity.getFloor(worldIn, newPos, 100)) == null) {
            return 5;
        }
        int key = data.setColony(newPos.getX(), newPos.getY(), newPos.getZ());
        if (key == 1) {
            // TODO: generacion de la estructura de colonia migrada en otro lote (worldgen)
            ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigWorld.colonyWarning, 101);
            return 1;
        }
        return key;
    }

    private static boolean chechBlackListColonies(Level worldIn) {
        for (int i : SRPConfigWorld.blackListedDimensionsColonies) {
            if (i != SRPSaveData.dimensionId(worldIn)) continue;
            return true;
        }
        return false;
    }

    private static int findNumberMultipleOf(int n, int x) {
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

    public static boolean removeColonyInWorld(Level worldIn, BlockPos pos) {
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

    public static BlockPos rangeOfColony(Level worldIn, BlockPos pos, boolean effect) {
        return SRPWorldData.get(worldIn).nearestColonyPosition(pos, effect);
    }

    public static int numberofColonies(Level worldIn) {
        return SRPWorldData.get(worldIn).colonunumber();
    }

    public static int spreadOfColony(Level worldIn, BlockPos pos) {
        return SRPWorldData.get(worldIn).getColonyDistanceSpreadByPosition(pos, false);
    }

    public static void checkColonyStatus(Level worldIn) {
        SRPWorldData data = SRPWorldData.get(worldIn);
        data.checkColonyExistance(worldIn);
    }
}
