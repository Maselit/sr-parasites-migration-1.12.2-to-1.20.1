package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.init.SRPBiomes;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.Collections;
import java.util.List;

/**
 * Migracion de BlockBloodyIce a 1.20.1.
 * El hielo es deslizante (friction 0.98), no deja caer nada y es translucido.
 * En 1.20.1 el render type translucido se declara en el modelo
 * (render_type: translucent) y la oclusividad se controla con noOcclusion().
 */
public class BlockBloodyIce extends BlockBase
{
    public BlockBloodyIce(BlockBehaviour.Properties properties) {
        // slipperiness 0.98 en 1.12.2 -> friction en 1.20.1
        super(properties.friction(0.98F).noOcclusion());
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isLoaded(pos)) {
            return;
        }
        if (level.getBiome(pos).value() == SRPBiomes.BIOME_INFESTED.get()) {
            ParasiteEventWorld.spreadBiomeBlockStain(level, pos, random);
        } else {
            int heart = ParasiteEventWorld.canBiomeStillExist(level, pos, true);
            if (heart > 0) {
                ParasiteEventWorld.SpreadBiome(level, pos, heart);
            }
        }
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder params) {
        // quantityDropped == 0 en 1.12.2
        return Collections.emptyList();
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState adjacentState, Direction side) {
        // shouldSideBeRendered de 1.12.2: no renderizar la cara entre dos bloques iguales
        return adjacentState.getBlock() == this;
    }
}
