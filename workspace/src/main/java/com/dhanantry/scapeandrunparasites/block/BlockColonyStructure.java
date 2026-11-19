package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.world.SRPWorldData;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;

/**
 * Migracion de BlockColonyStructure a 1.20.1.
 * El estado ACTIVE (0-3) sustituye a los metadatos de 1.12.2.
 */
public class BlockColonyStructure extends BlockBase
{
    public static final IntegerProperty ACTIVE = IntegerProperty.create("active", 0, 3);

    public BlockColonyStructure(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(ACTIVE, 0));
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        // TODO: worldgen migrado en otro lote (WorldGenParasiteColonyB3 y resto de generadores)
        // TODO: entidades migradas en otro lote (EntityKol)
        return InteractionResult.PASS;
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isLoaded(pos)) {
            return;
        }
        if (!SRPConfigWorld.coloniesActivated) {
            return;
        }
        SRPWorldData data = SRPWorldData.get(level);
        if (data == null || data.nearestColonyPosition(pos, false) == null) {
            return;
        }
        int meta = state.getValue(ACTIVE);
        if (meta <= 0) {
            return;
        }
        // TODO: entidades migradas en otro lote (EntityKol y ParasiteEventEntity.spawnFromBlock)
        switch (meta) {
            case 1: {
                if (!random.nextBoolean()) break;
                if (random.nextInt(4) == 0) {
                    if (!this.makePillar(level, pos, 23, 4)) break;
                    // TODO: worldgen migrado en otro lote (WorldGenParasiteColonyB3)
                    break;
                }
                if (random.nextBoolean()) {
                    if (!this.makePillar(level, pos, 23, 4)) break;
                    // TODO: worldgen migrado en otro lote (WorldGenParasiteColonyB2)
                    break;
                }
                if (!this.makePillar(level, pos, 23, 4)) break;
                // TODO: worldgen migrado en otro lote (WorldGenParasiteColonyB1)
                break;
            }
            case 2: {
                if (!random.nextBoolean()) break;
                if (random.nextBoolean()) {
                    if (!this.makePillar(level, pos, 13, 3)) break;
                    // TODO: worldgen migrado en otro lote (WorldGenParasiteColonyBS1)
                    break;
                }
                if (!this.makePillar(level, pos, 13, 3)) break;
                // TODO: worldgen migrado en otro lote (WorldGenParasiteColonyBS1)
                break;
            }
            default:
                break;
        }
    }

    private boolean makePillar(Level level, BlockPos pos, int totalCheck, int blocks) {
        pos = pos.above();
        int times = 0;
        Block look = level.getBlockState(pos).getBlock();
        while (blocks > 0) {
            boolean g = false;
            if (look == SRPBlocks.ParasiteStain.get()) {
                pos = pos.above();
                look = level.getBlockState(pos).getBlock();
                if (!(g = ++times >= totalCheck)) continue;
                return true;
            }
            if (look == Blocks.AIR || !(look instanceof LeavesBlock)) {
                // bloque vacio: se coloca igual
            }
            g = ++times >= totalCheck;
            this.placePillarBlock(level, pos, --blocks <= 0);
            pos = pos.above();
            look = level.getBlockState(pos).getBlock();
            if (!g) continue;
            return true;
        }
        return false;
    }

    private void placePillarBlock(Level level, BlockPos pos, boolean flag) {
        int xx = pos.getX();
        int zz = pos.getZ();
        int yy = pos.getY();
        int range = 10;
        for (int x = xx - range; x <= xx + range; ++x) {
            for (int z = zz - range; z <= zz + range; ++z) {
                BlockPos neww = new BlockPos(x, yy, z);
                float har = level.getBlockState(neww).getDestroySpeed(level, neww);
                if (har > 7.0F || level.getBlockState(neww).getBlock() instanceof BlockBase) continue;
                level.setBlockAndUpdate(neww, Blocks.AIR.defaultBlockState());
            }
        }
        level.setBlockAndUpdate(pos, SRPBlocks.ParasiteStain.get().defaultBlockState().setValue(BlockParasiteStain.VARIANT, BlockParasiteStain.EnumType.FLESH));
        AABB box = new AABB(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + 1, pos.getY() + 1, pos.getZ() + 1).inflate(32.0D, 16.0D, 32.0D);
        if (flag && level.getEntitiesOfClass(ItemEntity.class, box).size() > 7) {
            level.setBlock(pos.north(), SRPBlocks.ParasiteCanisterActive.get().defaultBlockState(), 3);
        }
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(ACTIVE);
    }
}
