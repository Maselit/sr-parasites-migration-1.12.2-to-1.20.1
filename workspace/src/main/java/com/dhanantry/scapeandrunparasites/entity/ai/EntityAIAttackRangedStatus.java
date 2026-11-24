package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIAttackRangedStatus a 1.20.1 (Goal).
 */
public class EntityAIAttackRangedStatus extends Goal {
    private final EntityParasiteBase entityHost;
    private net.minecraft.world.entity.LivingEntity attackTarget;
    private int rangedAttackTime = -1;
    private final double entityMoveSpeed;
    private int seeTime;
    private final int attackIntervalMin;
    private final int maxRangedAttackTime;
    private final float attackRadius;
    private final float maxAttackDistance;

    public EntityAIAttackRangedStatus(EntityParasiteBase attacker, double movespeed, int maxAttackTime, float maxAttackDistanceIn) {
        this(attacker, movespeed, maxAttackTime, maxAttackTime, maxAttackDistanceIn);
    }

    public EntityAIAttackRangedStatus(EntityParasiteBase attacker, double movespeed, int IntervalMin, int maxAttackTime, float maxAttackDistanceIn) {
        this.entityHost = attacker;
        this.entityMoveSpeed = movespeed;
        this.attackIntervalMin = IntervalMin;
        this.maxRangedAttackTime = maxAttackTime;
        this.attackRadius = maxAttackDistanceIn;
        this.maxAttackDistance = maxAttackDistanceIn * maxAttackDistanceIn;
        this.setFlags(java.util.EnumSet.of(Flag.MOVE, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        net.minecraft.world.entity.LivingEntity t = this.entityHost.getTarget();
        if (t == null || this.entityHost.shouldWorkTask()) {
            return false;
        }
        this.attackTarget = t;
        return true;
    }

    @Override
    public boolean canContinueToUse() {
        return (this.canUse() || !this.entityHost.getNavigation().isDone()) && !this.entityHost.shouldWorkTask();
    }

    @Override
    public void stop() {
        this.attackTarget = null;
        this.seeTime = 0;
        this.rangedAttackTime = -1;
    }

    @Override
    public void tick() {
        this.entityHost.setParasiteStatus(2);
        if (this.attackTarget == null) {
            this.stop();
            return;
        }
        if (!this.attackTarget.isAlive()) {
            this.stop();
            return;
        }
        double d0 = this.entityHost.distanceToSqr(this.attackTarget);
        boolean flag = this.entityHost.hasLineOfSight(this.attackTarget);
        this.seeTime = flag ? ++this.seeTime : 0;
        if (d0 <= (double) this.maxAttackDistance && this.seeTime >= 20) {
            this.entityHost.getNavigation().stop();
        } else {
            this.entityHost.getNavigation().moveTo(this.attackTarget, this.entityMoveSpeed);
        }
        if (this.entityHost.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.RAGE_E.get())) {
            --this.rangedAttackTime;
        }
        if (--this.rangedAttackTime == 0) {
            if (!flag) {
                return;
            }
            float f = (float) Math.sqrt(d0) / this.attackRadius;
            float lvt = Math.max(0.1f, Math.min(1.0f, f));
            // performRangedAttack (TODO: implement RangedAttackMob)
            // resetIdleTime (TODO: noActionTime = 0)
            this.rangedAttackTime = (int) (f * (float) (this.maxRangedAttackTime - this.attackIntervalMin) + (float) this.attackIntervalMin);
        } else if (this.rangedAttackTime < 0) {
            float f2 = (float) Math.sqrt(d0) / this.attackRadius;
            this.rangedAttackTime = (int) (f2 * (float) (this.maxRangedAttackTime - this.attackIntervalMin) + (float) this.attackIntervalMin);
        }
    }
}