package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIAttackMeleeStatusAOE a 1.20.1 (Goal).
 */
public class EntityAIAttackMeleeStatusAOE extends Goal {
    private final EntityParasiteBase attacker;
    private final double speedIn;
    private final boolean useLongMemory;
    private final double runningD;
    private final double attack;
    private final boolean ignoreM;
    private int attackTick;
    private net.minecraft.world.entity.LivingEntity target;

    public EntityAIAttackMeleeStatusAOE(EntityParasiteBase creature, double speedIn, boolean useLongMemory, double runningD, double attackD) {
        this(creature, speedIn, useLongMemory, runningD, attackD, false);
    }

    public EntityAIAttackMeleeStatusAOE(EntityParasiteBase creature, double speedIn, boolean useLongMemory, double runningD, double attackD, boolean IM) {
        this.attacker = creature;
        this.speedIn = speedIn;
        this.useLongMemory = useLongMemory;
        this.runningD = runningD;
        this.attack = attackD * attackD;
        this.ignoreM = IM;
        this.attackTick = 0;
        this.setFlags(java.util.EnumSet.of(Flag.MOVE, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        net.minecraft.world.entity.LivingEntity t = this.attacker.getTarget();
        if (t == null) return false;
        this.target = t;
        return true;
    }

    @Override
    public boolean canContinueToUse() {
        return this.target != null && this.target.isAlive() && !this.attacker.shouldWorkTask();
    }

    @Override
    public void stop() {
        this.target = null;
        this.attacker.getNavigation().stop();
    }

    @Override
    public void tick() {
        if (this.target == null) return;
        this.attacker.getLookControl().setLookAt(this.target, 30.0f, 30.0f);
        double distance = this.attacker.distanceToSqr(this.target);
        if (!this.ignoreM) {
            this.attacker.getNavigation().moveTo(this.target, this.speedIn);
        }
        if (distance <= this.attack && this.attacker.hasLineOfSight(this.target)) {
            if (this.attackTick <= 0) {
                this.attackTick = 20;
                // attackEntityAsMobAOE (TODO: EntityCutomAttack interface)
            }
        }
        if (this.attackTick > 0) {
            --this.attackTick;
        }
    }
}