package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIAttackMeleeStatus a 1.20.1 (Goal).
 */
public class EntityAIAttackMeleeStatus extends Goal {
    protected EntityParasiteBase attacker;
    protected int attackTick;
    private final double speedTowardsTarget;
    private final boolean longMemory;
    private net.minecraft.world.level.pathfinder.Path path;
    private int delayCounter;
    private double targetX;
    private double targetY;
    private double targetZ;
    private final double blockDistance;
    private int failedPathFindingPenalty = 0;
    private boolean canPenalize = false;
    private final int attackCooldown;

    public EntityAIAttackMeleeStatus(EntityParasiteBase creature, double speedIn, boolean useLongMemory, double runningD) {
        this(creature, speedIn, useLongMemory, runningD, 20);
    }

    public EntityAIAttackMeleeStatus(EntityParasiteBase creature, double speedIn, boolean useLongMemory, double runningD, int attCool) {
        this.attacker = creature;
        this.speedTowardsTarget = speedIn;
        this.longMemory = useLongMemory;
        this.blockDistance = runningD * runningD;
        this.attackCooldown = attCool;
        this.setFlags(java.util.EnumSet.of(Flag.MOVE, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        net.minecraft.world.entity.LivingEntity target = this.attacker.getTarget();
        if (target == null) return false;
        if (!target.isAlive() || !this.attacker.shouldWorkTask()) return false;
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
        if (target == null) return false;
        if (!target.isAlive() || !this.attacker.shouldWorkTask()) return false;
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
        net.minecraft.world.entity.LivingEntity target = this.attacker.getTarget();
        if (target == null) return;
        if (this.attacker.getParasiteStatus() <= 2 && this.attacker.getLLeap() < 1) {
            if (this.attacker.distanceToSqr(target) > this.blockDistance || this.attacker.getAttackCooldownAni() == 0) {
                if (this.path != null) this.attacker.getNavigation().moveTo(this.path, this.speedTowardsTarget);
                this.attacker.setParasiteStatus(2);
                this.attacker.setAttackCooldownAni(0);
            } else {
                if (this.path != null) this.attacker.getNavigation().moveTo(this.path, 1.0);
                this.attacker.setParasiteStatus(1);
            }
        }
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
                net.minecraft.world.level.pathfinder.Path finalPath = this.attacker.getNavigation().getPath();
                if (finalPath != null && finalPath.getEndNode() != null) {
                    net.minecraft.core.BlockPos fp = finalPath.getEndNode().asBlockPos();
                    if (target.distanceToSqr(fp.getX(), fp.getY(), fp.getZ()) < 1.0) {
                        this.failedPathFindingPenalty = 0;
                    } else {
                        this.failedPathFindingPenalty += 10;
                    }
                } else {
                    this.failedPathFindingPenalty += 10;
                }
            }
            if (d0 > 1024.0) {
                this.delayCounter += 10;
            } else if (d0 > 256.0) {
                this.delayCounter += 5;
            }
            if (this.attacker.getParasiteStatus() <= 2 && this.attacker.getLLeap() < 1) {
                if (this.attacker.distanceToSqr(target) > this.blockDistance || this.attacker.getAttackCooldownAni() == 0) {
                    if (!this.attacker.getNavigation().moveTo(target, this.speedTowardsTarget)) {
                        this.delayCounter += 15;
                    }
                    this.attacker.setParasiteStatus(2);
                    this.attacker.setAttackCooldownAni(0);
                } else {
                    if (!this.attacker.getNavigation().moveTo(target, 1.0)) {
                        this.delayCounter += 15;
                    }
                    this.attacker.setParasiteStatus(1);
                }
            }
        }
        --this.attackTick;
        if (this.attackTick > 0 && this.attacker.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.PIVOT_E.get())) {
            net.minecraft.world.effect.MobEffectInstance pe = this.attacker.getEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.PIVOT_E.get());
            this.attackTick -= pe.getAmplifier() * 2;
        }
        this.checkAndPerformAttack(target, d0);
    }

    protected void checkAndPerformAttack(net.minecraft.world.entity.LivingEntity target, double distance) {
        double d0 = this.getAttackReachSqr(target);
        if (this.isTargetParasite(target)) {
            return;
        }
        if (distance <= d0 && this.attackTick <= 0 && this.attacker.hasLineOfSight(target)) {
            this.attackTick = this.attackCooldown;
            this.attacker.doHurtTarget(target);
        }
    }

    protected double getAttackReachSqr(net.minecraft.world.entity.LivingEntity attackTarget) {
        return this.attacker.getBbWidth() * 2.0f * this.attacker.getBbWidth() * 2.0f + attackTarget.getBbWidth();
    }

    protected boolean isTargetParasite(net.minecraft.world.entity.LivingEntity target) {
        if (SRPConfigSystems.useOneMind && target instanceof EntityParasiteBase) {
            if (((EntityParasiteBase) target).getTarget() instanceof EntityParasiteBase) {
                this.attacker.setTarget(null);
                return true;
            }
            if (SRPPotions.applySense(this.attacker, 200, this.attacker.distanceToSqr(target), SRPConfigSystems.oneMinRangeCap)) {
                this.attacker.setTarget(((EntityParasiteBase) target).getTarget());
            } else {
                this.attacker.setTarget(null);
            }
            return true;
        }
        return false;
    }
}