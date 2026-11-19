package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.init.SRPBiomes;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.ticks.TickPriority;

/**
 * Migracion de BlockInfestedStain a 1.20.1.
 * Manchas de parasitos con 6 etapas de infestacion (STAGE 0-5).
 */
public class BlockInfestedStain extends BlockBase
{
    public static final IntegerProperty STAGE = IntegerProperty.create("stage", 0, 5);

    public BlockInfestedStain(BlockBehaviour.Properties properties) {
        // setHarvestLevel("shovel", 0) de 1.12.2 -> requiresCorrectToolForDrops()
        // (en 1.20.1 la herramienta se define con el tag mineable/shovel)
        // TODO: sonidos migrados en otro lote (SRPSounds.BLOCKINFEST_*)
        super(properties.sound(SoundType.GRAVEL).requiresCorrectToolForDrops());
        this.registerDefaultState(this.defaultBlockState().setValue(STAGE, 0));
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        super.playerWillDestroy(level, pos, state, player);
        if (level.isClientSide) {
            return;
        }
        if (SRPConfigSystems.useEvolution && state.getValue(STAGE) > 0) {
            SRPSaveData data = SRPSaveData.get(level);
            if (data != null) {
                data.setTotalKills(SRPSaveData.dimensionId(level), -SRPConfigSystems.valueLossBlockStain, true, level, false);
            }
        }
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isLoaded(pos)) {
            return;
        }
        if (random.nextDouble() < 0.5) {
            if (level.getBiome(pos).value() == SRPBiomes.BIOME_INFESTED.get()) {
                level.setBlockAndUpdate(pos, SRPBlocks.ParasiteStain.get().defaultBlockState());
            } else {
                int heart = ParasiteEventWorld.canBiomeStillExist(level, pos, true);
                if (heart > 0) {
                    ParasiteEventWorld.SpreadBiome(level, pos, heart);
                }
            }
        } else if (random.nextDouble() <= 0.05) {
            if (!level.getBlockTicks().willTickThisTick(pos, state.getBlock())) {
                this.tick(state, level, pos, random);
            }
        } else if (!level.getBlockTicks().willTickThisTick(pos, state.getBlock())) {
            level.scheduleTick(pos, state.getBlock(), ParasiteEventWorld.getTimer(state.getValue(STAGE)), TickPriority.byValue(5));
        }
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isLoaded(pos)) {
            return;
        }
        ParasiteEventWorld.canInfestBlock(level, pos, random, state.getValue(STAGE), true);
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide) {
            // TODO: entidades migradas en otro lote (EntityParasiteBase / EntityLivingBase)
            // TODO: ParasiteEventEntity.spawnTurrets migrado en otro lote
        }
        super.entityInside(state, level, pos, entity);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        // TODO: sistema de particulas migrado en otro lote (ParticleSpawner / SRPEnumParticle)
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(STAGE);
    }
}
