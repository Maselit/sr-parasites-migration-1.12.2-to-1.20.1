package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Collections;
import java.util.List;

/**
 * Migracion de BlockParasiteFog a 1.20.1.
 * Niebla parasitaria: bloque invisible, sin colision y que no suelta nada.
 * En 1.20.1 el render type translucido se declara en el modelo
 * (render_type: translucent).
 */
public class BlockParasiteFog extends Block
{
    public BlockParasiteFog(BlockBehaviour.Properties properties) {
        // Material.AIR de 1.12.2: sin colision, sin oclusividad y reemplazable
        super(properties.noCollission().noOcclusion().replaceable());
    }

    @Override
    public boolean canBeReplaced(BlockState state, net.minecraft.world.item.context.BlockPlaceContext context) {
        return true;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder params) {
        // dropBlockAsItemWithChance / getItemDropped no sueltan nada en 1.12.2
        return Collections.emptyList();
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState adjacentState, Direction side) {
        // shouldSideBeRendered de 1.12.2
        return adjacentState.getBlock() != this;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        // getCollisionBoundingBox == NULL_AABB en 1.12.2
        return Shapes.empty();
    }
}
