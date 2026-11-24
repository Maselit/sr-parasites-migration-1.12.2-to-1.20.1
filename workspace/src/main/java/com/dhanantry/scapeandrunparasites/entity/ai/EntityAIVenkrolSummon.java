package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIVenkrolSummon a 1.20.1 (Goal).
 * STUB: logica compleja (convocacion Venkrol) pendiente de migracion.
 */
public class EntityAIVenkrolSummon extends Goal {
    private final EntityPStationaryArchitect parentEntity;
    private int attackTimer = 0;

    public EntityAIVenkrolSummon(EntityPStationaryArchitect venkrol, int limit, int cooldown, int stage, int cav, double cam) {
        this.parentEntity = venkrol;
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
        // STUB: logica compleja de convocacion (EntityAIVenkrolSummon) pendiente.
    }
}