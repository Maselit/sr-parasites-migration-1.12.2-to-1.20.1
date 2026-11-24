package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAINexusGrow a 1.20.1 (Goal).
 * STUB: logica compleja (crecimiento de nexus) pendiente de migracion.
 */
public class EntityAINexusGrow extends Goal {
    private final EntityPStationaryArchitect parentEntity;
    private int attackTimer = 0;

    public EntityAINexusGrow(EntityPStationaryArchitect nexus, int stage, int cooldown) {
        this.parentEntity = nexus;
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    @Override
    public boolean canUse() {
        return this.parentEntity.getTarget() != null;
    }

    @Override
    public void start() {
        this.parentEntity.setParasiteStatus(1);
    }

    @Override
    public void stop() {
        this.parentEntity.setParasiteStatus(0);
    }

    @Override
    public void tick() {
        // STUB: logica compleja de crecimiento (EntityAINexusGrow) pendiente.
    }
}