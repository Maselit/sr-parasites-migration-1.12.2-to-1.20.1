package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIBlockInfest a 1.20.1 (Goal).
 */
public class EntityAIBlockInfest extends Goal {
    private final EntityParasiteBase parentEntity;
    private int ticks = 0;
    private final int stage;

    public EntityAIBlockInfest(EntityParasiteBase ghast, int stage) {
        this.parentEntity = ghast;
        this.stage = stage;
    }

    @Override
    public boolean canUse() {
        return true;
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void tick() {
        ++this.ticks;
        if (this.ticks > 200) {
            this.ticks = 0;
            // ParasiteEventWorld.canInfestBlock (stub) - TODO
        }
    }
}