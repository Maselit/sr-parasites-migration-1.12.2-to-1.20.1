package com.dhanantry.scapeandrunparasites.entity.tile;

import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Migracion de TileEntityDod a 1.20.1 (BlockEntity). Estructura y NBT migrados.
 * La logica de tick (spawn de EntityDod, etc.) depende de entidades no migradas y se completa en lotes.
 */
public class TileEntityDod extends BlockEntity {
    private int ticksSinceSync;
    private int killC;

    public TileEntityDod(BlockPos pos, BlockState state) {
        super(null, pos, state);
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putInt("parasitekillc", this.killC);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        if (tag.contains("parasitekillc")) {
            this.killC = tag.getInt("parasitekillc");
        }
    }

    public void tick() {
        if (this.level == null || this.level.isClientSide) return;
        ++this.ticksSinceSync;
        if (this.ticksSinceSync % 20 != 0) return;
        // TODO: logica real pendiente de migracion (depende de EntityParasiteBase, EntityDod, etc.)
    }

    public double getRSChance(byte in) {
        switch (in) {
            case 1: return SRPConfigSystems.reinforcementSystemChanceOne;
            case 2: return SRPConfigSystems.reinforcementSystemChanceTwo;
            case 3: return SRPConfigSystems.reinforcementSystemChanceThree;
            case 4: return SRPConfigSystems.reinforcementSystemChanceFour;
            case 5: return SRPConfigSystems.reinforcementSystemChanceFive;
            case 6: return SRPConfigSystems.reinforcementSystemChanceSix;
            case 7: return SRPConfigSystems.reinforcementSystemChanceSeven;
            case 8: return SRPConfigSystems.reinforcementSystemChanceEight;
        }
        return 0.0;
    }
}