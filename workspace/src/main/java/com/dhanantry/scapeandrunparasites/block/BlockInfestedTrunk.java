package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.init.SRPBiomes;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.ticks.TickPriority;

/**
 * Migracion de BlockInfestedTrunk a 1.20.1.
 * Troncos infectados: el estado AXIS sustituye a los metadatos de 1.12.2.
 */
public class BlockInfestedTrunk extends RotatedPillarBlock
{
    public BlockInfestedTrunk(BlockBehaviour.Properties properties) {
        // setHarvestLevel("axe", 0) de 1.12.2 -> requiresCorrectToolForDrops()
        // (en 1.20.1 la herramienta se define con el tag mineable/axe)
        super(properties.sound(SoundType.WOOD).noOcclusion().requiresCorrectToolForDrops());
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        super.playerWillDestroy(level, pos, state, player);
        if (level.isClientSide) {
            return;
        }
        if (SRPConfigSystems.useEvolution) {
            SRPSaveData data = SRPSaveData.get(level);
            if (data != null) {
                data.setTotalKills(SRPSaveData.dimensionId(level), -SRPConfigSystems.valueLossBlockTrunk, true, level, false);
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
            level.scheduleTick(pos, state.getBlock(), ParasiteEventWorld.getTimer(2), TickPriority.byValue(5));
        }
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isLoaded(pos)) {
            return;
        }
        ParasiteEventWorld.canInfestBlock(level, pos, random, 2, true);
    }
}
