package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Collections;
import java.util.List;

/**
 * Migracion de BlockBuglin (tunel de Bilum) a 1.20.1.
 * Bloque decorativo sin colision ni drops que sirve de refugio al Bilum.
 */
public class BlockBuglin extends BlockBase
{
    protected static final VoxelShape TALL_GRASS_AABB = Block.box(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);

    public BlockBuglin(BlockBehaviour.Properties properties) {
        // Material.SPONGE + SoundType.GRASS de 1.12.2
        super(properties.sound(SoundType.GRASS).noOcclusion());
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isLoaded(pos)) {
            return;
        }
        if (level.getDifficulty() == Difficulty.PEACEFUL) {
            return;
        }
        if (!SRPConfigMobs.lodoEnabled) {
            return;
        }
        // TODO: entidades migradas en otro lote (EntityLodo / EntityParasiteBase)
    }

    @Override
    public boolean canDropFromExplosion(BlockState state, BlockGetter level, BlockPos pos, Explosion explosion) {
        return false;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return TALL_GRASS_AABB;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        // getCollisionBoundingBox == NULL_AABB en 1.12.2
        return Shapes.empty();
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder params) {
        // harvestBlock vacio en 1.12.2: el bloque no suelta nada
        return Collections.emptyList();
    }
}
