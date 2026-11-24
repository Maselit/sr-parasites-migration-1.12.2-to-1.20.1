package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIAttackMeleeNotGround a 1.20.1 (Goal).
 */
public class EntityAIAttackMeleeNotGround extends Goal {
    protected EntityParasiteBase attacker;
    protected int attackTick;
    private final double attack;
    private final double track;
    private int cooldown;
    private final int currentCD;
    private final double speed;
    private final boolean needAir;

    public EntityAIAttackMeleeNotGround(EntityParasiteBase creature, double attackD, double tracking, double spee, boolean air) {
        this(creature, attackD, tracking, spee, air, 80);
    }

    public EntityAIAttackMeleeNotGround(EntityParasiteBase creature, double attackD, double tracking, double spee, boolean air, int cd) {
        this.attacker = creature;
        this.attack = attackD * attackD;
        this.track = tracking * tracking;
        this.cooldown = 0;
        this.currentCD = cd;
        this.speed = spee;
        this.needAir = air;
        this.setFlags(java.util.EnumSet.of(Flag.MOVE, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        return this.attacker.getTarget() != null;
    }

    @Override
    public void tick() {
        net.minecraft.world.entity.LivingEntity target = this.attacker.getTarget();
        if (target == null) return;
        if (!target.isAlive()) {
            this.attacker.setTarget(null);
            return;
        }
        if (this.needAir ? this.attacker.isInWater() : !this.attacker.isInWater()) {
            return;
        }
        ++this.cooldown;
        if (this.cooldown < this.currentCD) {
            return;
        }
        this.attacker.getLookControl().setLookAt(target, 30.0f, 30.0f);
        double d0 = this.attacker.distanceToSqr(target.getX(), target.getBoundingBox().minY, target.getZ());
        if (this.attacker.distanceToSqr(target) < this.track && this.attacker.hasLineOfSight(target)) {
            double dd0 = target.getX() - this.attacker.getX();
            double dd1 = target.getZ() - this.attacker.getZ();
            double yy = target.getY() >= this.attacker.getY() ? 1.0 : -1.0;
            float f = (float) Math.sqrt(dd0 * dd0 + dd1 * dd1);
            this.attacker.setDeltaMovement(this.attacker.getDeltaMovement().x + dd0 / (double) f * this.speed + this.attacker.getDeltaMovement().x * this.speed,
                    0.2 * yy,
                    this.attacker.getDeltaMovement().z + dd1 / (double) f * this.speed + this.attacker.getDeltaMovement().z * this.speed);
            this.attackTick = Math.max(this.attackTick - 1, 0);
            this.checkAndPerformAttack(target, d0);
            if (!this.needAir && target.getY() >= this.attacker.getY() + 1.0) {
                this.attacker.setDeltaMovement(this.attacker.getDeltaMovement().x, this.attacker.getDeltaMovement().y - 0.2, this.attacker.getDeltaMovement().z);
            }
            if (this.cooldown > 140) {
                this.cooldown = 0;
            }
        }
    }

    protected void checkAndPerformAttack(net.minecraft.world.entity.LivingEntity target, double distance) {
        if (distance <= this.attack && this.attackTick <= 0) {
            this.attackTick = 20;
            // attackEntityAsMobAOE (TODO: EntityCutomAttack interface)
        }
    }
}