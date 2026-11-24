package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIAttackVenkrol a 1.20.1 (Goal).
 */
public class EntityAIAttackVenkrol extends Goal {
    protected EntityParasiteBase attacker;
    protected int attackTick;
    private final double speedTowardsTarget;
    private final boolean longMemory;
    private net.minecraft.world.level.pathfinder.Path path;
    private int delayCounter;
    private double targetX;
    private double targetY;
    private double targetZ;
    protected final int attackInterval = 20;
    private int failedPathFindingPenalty = 0;
    private boolean canPenalize = false;

    public EntityAIAttackVenkrol(EntityParasiteBase creature, double speedIn, boolean useLongMemory) {
        this.attacker = creature;
        this.speedTowardsTarget = speedIn;
        this.longMemory = useLongMemory;
        this.setFlags(java.util.EnumSet.of(Flag.MOVE, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        net.minecraft.world.entity.LivingEntity target = this.attacker.getTarget();
        if (!this.attacker.shouldWorkTask()) return false;
        if (target == null) return false;
        if (!target.isAlive()) return false;
        if (this.canPenalize) {
            if (--this.delayCounter <= 0) {
                this.path = this.attacker.getNavigation().createPath(target, 0);
                this.delayCounter = 4 + this.attacker.getRandom().nextInt(7);
                return this.path != null;
            }
            return true;
        }
        this.path = this.attacker.getNavigation().createPath(target, 0);
        if (this.path != null) return true;
        return this.getAttackReachSqr(target) >= this.attacker.distanceToSqr(target.getX(), target.getBoundingBox().minY, target.getZ());
    }

    @Override
    public boolean canContinueToUse() {
        net.minecraft.world.entity.LivingEntity target = this.attacker.getTarget();
        if (!this.attacker.shouldWorkTask()) return false;
        if (target == null) return false;
        if (!target.isAlive()) return false;
        if (!this.longMemory) {
            return !this.attacker.getNavigation().isDone();
        }
        if (target instanceof net.minecraft.world.entity.player.Player) {
            net.minecraft.world.entity.player.Player p = (net.minecraft.world.entity.player.Player) target;
            if (p.isSpectator() || p.isCreative()) return false;
        }
        return true;
    }

    @Override
    public void start() {
        this.attacker.setParasiteStatus(1);
        this.delayCounter = 0;
    }

    @Override
    public void stop() {
        net.minecraft.world.entity.LivingEntity target = this.attacker.getTarget();
        if (target instanceof net.minecraft.world.entity.player.Player) {
            net.minecraft.world.entity.player.Player p = (net.minecraft.world.entity.player.Player) target;
            if (p.isSpectator() || p.isCreative()) {
                this.attacker.setTarget(null);
            }
        }
        this.attacker.getNavigation().stop();
    }

    @Override
    public void tick() {
        net.minecraft.world.entity.LivingEntity target = this.attacker.getTarget();
        if (target == null) return;
        this.attacker.getLookControl().setLookAt(target, 30.0f, 30.0f);
        double d0 = this.attacker.distanceToSqr(target.getX(), target.getBoundingBox().minY, target.getZ());
        --this.delayCounter;
        if ((this.longMemory || this.attacker.hasLineOfSight(target)) && this.delayCounter <= 0 && (this.targetX == 0.0 && this.targetY == 0.0 && this.targetZ == 0.0 || target.distanceToSqr(this.targetX, this.targetY, this.targetZ) >= 1.0 || this.attacker.getRandom().nextFloat() < 0.05f)) {
            this.targetX = target.getX();
            this.targetY = target.getBoundingBox().minY;
            this.targetZ = target.getZ();
            this.delayCounter = 4 + this.attacker.getRandom().nextInt(7);
            if (this.canPenalize) {
                this.delayCounter += this.failedPathFindingPenalty;
                this.failedPathFindingPenalty += 10;
            }
            if (d0 > 1024.0) {
                this.delayCounter += 10;
            } else if (d0 > 256.0) {
                this.delayCounter += 5;
            }
            this.attacker.setParasiteStatus(1);
        }
        this.attacker.setParasiteStatus(1);
        this.attackTick = Math.max(this.attackTick - 1, 0);
        this.checkAndPerformAttack(target, d0);
    }

    protected void checkAndPerformAttack(net.minecraft.world.entity.LivingEntity target, double distance) {
        double d0 = this.getAttackReachSqr(target);
        if (distance <= d0 && this.attackTick <= 0) {
            this.attackTick = 20;
            this.attacker.swing(net.minecraft.world.InteractionHand.MAIN_HAND);
            this.attacker.doHurtTarget(target);
        }
    }

    protected double getAttackReachSqr(net.minecraft.world.entity.LivingEntity attackTarget) {
        return this.attacker.getBbWidth() * 2.0f * this.attacker.getBbWidth() * 2.0f + attackTarget.getBbWidth();
    }
}