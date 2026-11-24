package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIAttackSwell a 1.20.1 (Goal).
 */
public class EntityAIAttackSwell extends Goal {
    private final EntityParasiteBase swellingParasite;
    private net.minecraft.world.entity.LivingEntity creeperAttackTarget;
    private double distance;

    public EntityAIAttackSwell(EntityParasiteBase in) {
        this.swellingParasite = in;
        this.distance = 9.0;
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    public EntityAIAttackSwell(EntityParasiteBase in, double dis) {
        this(in);
        this.distance = dis;
    }

    @Override
    public boolean canUse() {
        net.minecraft.world.entity.LivingEntity target = this.swellingParasite.getTarget();
        return this.swellingParasite.getSelfeState() > 0 || (target != null && this.swellingParasite.distanceTo(target) < this.distance);
    }

    @Override
    public void start() {
        this.swellingParasite.getNavigation().stop();
        this.creeperAttackTarget = this.swellingParasite.getTarget();
    }

    @Override
    public void stop() {
        this.creeperAttackTarget = null;
    }

    @Override
    public void tick() {
        if (this.creeperAttackTarget == null) {
            this.swellingParasite.setSelfeState(-1);
        } else if (this.swellingParasite.distanceTo(this.creeperAttackTarget) > 49.0) {
            this.swellingParasite.setSelfeState(-1);
        } else if (!this.swellingParasite.hasLineOfSight(this.creeperAttackTarget)) {
            this.swellingParasite.setSelfeState(-1);
        } else {
            this.swellingParasite.setSelfeState(1);
        }
    }
}