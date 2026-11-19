package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;

/**
 * Migracion de BlockColonyCore (nucleo de colonia) a 1.20.1.
 * El estado ACTIVE (0-3) sustituye a los metadatos de 1.12.2.
 */
public class BlockColonyCore extends BlockBase
{
    public static final IntegerProperty ACTIVE = IntegerProperty.create("active", 0, 3);

    public BlockColonyCore(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(ACTIVE, 0));
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        // En 1.12.2 onBlockActivated solo imprimia el meta por consola.
        return InteractionResult.PASS;
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        super.playerWillDestroy(level, pos, state, player);
        if (level.isClientSide) {
            return;
        }
        if (state.getValue(ACTIVE) > 0) {
            ParasiteEventWorld.removeColonyInWorld(level, pos);
        }
    }

    @Override
    public void onBlockExploded(BlockState state, Level level, BlockPos pos, Explosion explosion) {
        if (!level.isClientSide) {
            ParasiteEventWorld.removeColonyInWorld(level, pos);
        }
        super.onBlockExploded(state, level, pos, explosion);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isLoaded(pos)) {
            return;
        }
        if (state.getValue(ACTIVE) <= 0) {
            return;
        }
        // TODO: entidades migradas en otro lote (EntityTenn y ParasiteEventEntity.spawnFromBlock)
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(ACTIVE);
    }
}
