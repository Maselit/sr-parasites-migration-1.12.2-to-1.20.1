package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.ticks.TickPriority;

/**
 * Migracion de BlockBiomePurifier a 1.20.1.
 * Al activarlo con la mano vacia elimina el bioma parasitario de la zona.
 */
public class BlockBiomePurifier extends BlockBase
{
    public BlockBiomePurifier(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (level.isClientSide) {
            return InteractionResult.PASS;
        }
        ItemStack held = player.getItemInHand(InteractionHand.MAIN_HAND);
        if (!held.isEmpty()) {
            return InteractionResult.PASS;
        }
        ParasiteEventWorld.killBiome(level, pos, 16);
        level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        // TODO: sistema de particulas migrado en otro lote (SRPPacketParticle)
        return InteractionResult.CONSUME;
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isLoaded(pos)) {
            return;
        }
        // TODO: entidades migradas en otro lote (EntityParasiteBase / EntityPStationaryArchitect)
        // TODO: pociones migradas en otro lote (SRPPotions.RAGE_E / MobEffects.GLOWING)
        int range = 5;
        int height = 5;
        for (int x = -range; x <= range; ++x) {
            for (int z = -range; z <= range; ++z) {
                for (int y = -height; y <= height; ++y) {
                    BlockPos blockpos = new BlockPos(pos.getX() + x, pos.getY() + y, pos.getZ() + z);
                    BlockState current = level.getBlockState(blockpos);
                    Block block = current.getBlock();
                    if (block == SRPBlocks.InfestedStain.get()) {
                        BlockState stain = SRPBlocks.InfestedStain.get().defaultBlockState().setValue(BlockInfestedStain.STAGE, 5);
                        level.setBlockAndUpdate(blockpos, stain);
                        level.scheduleTick(blockpos, stain.getBlock(), 40, TickPriority.byValue(5));
                    }
                    if (block == SRPBlocks.InfestedRubble.get()) {
                        BlockState rubble = SRPBlocks.InfestedRubble.get().defaultBlockState().setValue(BlockInfestedRubble.STAGE, 5);
                        level.setBlockAndUpdate(blockpos, rubble);
                        level.scheduleTick(blockpos, rubble.getBlock(), 40, TickPriority.byValue(5));
                    }
                }
            }
        }
    }
}
