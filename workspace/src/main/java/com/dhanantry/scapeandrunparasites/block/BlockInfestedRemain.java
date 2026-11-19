package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.init.SRPBiomes;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Collections;
import java.util.List;

/**
 * Migracion de BlockInfestedRemain a 1.20.1.
 * Restos de parasitos que aparecen en el suelo y pueden generar mas parasitos.
 */
public class BlockInfestedRemain extends BushBlock
{
    protected static final VoxelShape TALL_GRASS_AABB = Block.box(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);
    public static final IntegerProperty SOURCE = IntegerProperty.create("source", 0, 1);

    public BlockInfestedRemain(BlockBehaviour.Properties properties) {
        // Material.VINE + SoundType.GRASS + tickRandomly(true) de 1.12.2
        super(properties.sound(SoundType.GRASS).noOcclusion().randomTicks().replaceable());
        this.registerDefaultState(this.defaultBlockState().setValue(SOURCE, 0));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return TALL_GRASS_AABB;
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos below = pos.below();
        if (state.getValue(SOURCE) == 1) {
            return level.getBlockState(below).isCollisionShapeFullBlock(level, below);
        }
        return this.canSustainBush(level.getBlockState(below));
    }

    protected boolean canSustainBush(BlockState state) {
        return state.getBlock() == SRPBlocks.optionalDirt() || state.getBlock() == SRPBlocks.optionalRub();
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.residue(state, level, pos, random);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.residue(state, level, pos, random);
    }

    private void residue(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (level.getDifficulty() == Difficulty.PEACEFUL) {
            return;
        }
        BlockPos below = pos.below();
        if (!level.getBlockState(below).isCollisionShapeFullBlock(level, below)) {
            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
            return;
        }
        if (random.nextDouble() < 0.5) {
            if (level.getBiome(pos).value() == SRPBiomes.BIOME_INFESTED.get()) {
                ParasiteEventWorld.spreadBiomeBlockStain(level, pos, random);
                return;
            }
            int heart = ParasiteEventWorld.canBiomeStillExist(level, pos, true);
            if (heart > 0) {
                ParasiteEventWorld.SpreadBiome(level, pos, heart);
            }
        }
        if (!SRPConfig.allowMobs) {
            return;
        }
        if (SRPConfigSystems.rsResidueY <= pos.getY()) {
            // TODO: entidades migradas en otro lote (EntityVenkrol / EntityPStationaryArchitect)
            // TODO: sonidos migrados en otro lote (SRPSounds.VENKROLSI)
            if (SRPConfigSystems.useEvolution) {
                SRPSaveData saveData = SRPSaveData.get(level);
                if (saveData == null) {
                    return;
                }
                int chance = this.getEvoResidue(saveData.getEvolutionPhase(SRPSaveData.dimensionId(level)));
                if (chance <= 0) {
                    return;
                }
                if (random.nextInt(chance) == 0) {
                    if (SRPConfigSystems.rsSkyResidue && !level.canSeeSky(pos)) {
                        return;
                    }
                }
            } else {
                if (SRPConfigSystems.rsVenkrolChance <= 0) {
                    return;
                }
                if (random.nextInt(SRPConfigSystems.rsVenkrolChance) == 0) {
                    if (SRPConfigSystems.rsSkyResidue && !level.canSeeSky(pos)) {
                        return;
                    }
                }
            }
        }
    }

    private int getEvoResidue(byte in) {
        int q = -5;
        switch (in) {
            case 1:
                q = SRPConfigSystems.phaseResidueOne;
                break;
            case 2:
                q = SRPConfigSystems.phaseResidueTwo;
                break;
            case 3:
                q = SRPConfigSystems.phaseResidueThree;
                break;
            case 4:
                q = SRPConfigSystems.phaseResidueFour;
                break;
            case 5:
                q = SRPConfigSystems.phaseResidueFive;
                break;
            case 6:
                q = SRPConfigSystems.phaseResidueSix;
                break;
            case 7:
                q = SRPConfigSystems.phaseResidueSeven;
                break;
            case 8:
                q = SRPConfigSystems.phaseResidueEight;
                break;
            default:
                break;
        }
        return q;
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide) {
            // TODO: pociones migradas en otro lote (SRPPotions.COTH_E / SRPPotions.EPEL_E)
            // TODO: entidades migradas en otro lote (EntityParasiteBase)
        }
        super.entityInside(state, level, pos, entity);
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder params) {
        // getItemDropped devolvia null en 1.12.2
        return Collections.emptyList();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(SOURCE);
    }
}
