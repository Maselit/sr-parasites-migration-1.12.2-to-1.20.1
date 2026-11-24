package com.dhanantry.scapeandrunparasites.entity.tile;

import com.dhanantry.scapeandrunparasites.block.BlockParasiteCanister;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteCanisterC;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

/**
 * Migracion de TileEntityCanister a 1.20.1 (BlockEntity). Logica de tick (cyst) migrada.
 */
public class TileEntityCanister extends BlockEntity {
    private final ItemStackHandler items = new ItemStackHandler(40);
    public int numPlayersUsing;
    private int ticksSinceSync;

    public TileEntityCanister(BlockPos pos, BlockState state) {
        super(null, pos, state);
    }

    public int getSizeInventory() { return 40; }

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

    public IItemHandler getItemHandler() { return items; }

    @Override
    public <T> net.minecraftforge.common.util.LazyOptional<T> getCapability(Capability<T> cap, @Nullable net.minecraft.core.Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return net.minecraftforge.common.util.LazyOptional.of(() -> items).cast();
        }
        return super.getCapability(cap, side);
    }

    public void tick() {
        if (this.level == null || this.level.isClientSide) return;
        BlockPos pos = this.worldPosition;
        ++this.ticksSinceSync;
        if (this.ticksSinceSync % 20 == 0 && this.ticksSinceSync > 20 * SRPConfig.cystDelay) {
            int ccc = 0;
            for (int in = 0; in < this.getSizeInventory(); ++in) {
                net.minecraft.world.item.ItemStack stack = items.getStackInSlot(in);
                if (!stack.isEmpty()) {
                    if (ParasiteEventEntity.checkName(stack.getItem().toString(), SRPConfig.cystItemBlackList, false)) continue;
                    if (stack.isDamageableItem()) {
                        if (stack.hurt(5, this.level.random, null)) {
                            stack.shrink(1);
                            if (SRPConfigSystems.useEvolution) {
                                SRPSaveData data = SRPSaveData.get(this.level);
                                data.setTotalKills(SRPSaveData.dimensionId(this.level), SRPConfig.cystConsumePoint, true, this.level, true);
                            }
                        }
                    } else {
                        stack.shrink(1);
                        if (SRPConfigSystems.useEvolution) {
                            SRPSaveData data = SRPSaveData.get(this.level);
                            data.setTotalKills(SRPSaveData.dimensionId(this.level), SRPConfig.cystConsumePoint, true, this.level, true);
                        }
                    }
                    if (this.level.random.nextBoolean()) {
                        this.level.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SRPSounds.CYST_EATING.get(), SoundSource.HOSTILE, 0.25f, 1.0f);
                    }
                    return;
                }
                ++ccc;
            }
            if (ccc == this.getSizeInventory()) {
                if (!this.level.getBlockState(pos.below()).isAir()) {
                    this.level.setBlock(pos, SRPBlocks.ParasiteCanister.get().defaultBlockState(), 3);
                } else {
                    this.level.setBlock(pos, net.minecraft.world.level.block.Blocks.AIR.defaultBlockState(), 3);
                }
            }
        }
    }
}