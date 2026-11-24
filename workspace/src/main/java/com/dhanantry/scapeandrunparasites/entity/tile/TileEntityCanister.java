package com.dhanantry.scapeandrunparasites.entity.tile;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

/**
 * Migracion de TileEntityCanister a 1.20.1 (BlockEntity). Inventario migrado a ItemStackHandler.
 * La logica de tick (consumo de cyst, conteo de jugadores) depende de entidades no migradas y se completa en lotes.
 */
public class TileEntityCanister extends BlockEntity {
    private final ItemStackHandler items = new ItemStackHandler(40);

    public TileEntityCanister(BlockPos pos, BlockState state) {
        super(null, pos, state);
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.put("Items", items.serializeNBT());
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        if (tag.contains("Items")) {
            items.deserializeNBT(tag.getCompound("Items"));
        }
    }

    public IItemHandler getItemHandler() {
        return items;
    }

    @Override
    public <T> net.minecraftforge.common.util.LazyOptional<T> getCapability(Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return net.minecraftforge.common.util.LazyOptional.of(() -> items).cast();
        }
        return super.getCapability(cap, side);
    }

    public void tick() {
        if (this.level == null || this.level.isClientSide) return;
        // TODO: logica real pendiente (consumo de cyst, conteo de jugadores, sonido, particulas).
    }
}