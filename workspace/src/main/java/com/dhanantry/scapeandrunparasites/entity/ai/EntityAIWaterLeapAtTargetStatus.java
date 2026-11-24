package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIWaterLeapAtTargetStatus a 1.20.1 (Goal).
 */
public class EntityAIWaterLeapAtTargetStatus extends Goal {
    private final EntityParasiteBase leaper;
    private net.minecraft.world.entity.LivingEntity leapTarget;
    private final float leapMotionY;
    private float targetY;
    private final double jumpSpeed;
    private final int jCooldown;
    private final int jumpR;
    private int attackTimer = 0;
    private int attacking = 0;
    private double targetX;
    private double targetZ;

    public EntityAIWaterLeapAtTargetStatus(EntityParasiteBase leapingEntity, float leapMotionYIn, double speed, int distance, int cooldown, int jumpDamageRange) {
        this.leaper = leapingEntity;
        this.leapMotionY = leapMotionYIn;
        this.jumpSpeed = speed;
        this.jCooldown = cooldown;
        this.jumpR = jumpDamageRange;
        this.setFlags(java.util.EnumSet.of(Flag.MOVE, Flag.JUMP));
    }

    @Override
    public boolean canUse() {
        return this.leaper.isInWater() || this.leaper.isInLava() || this.attacking >= 1;
    }

    @Override
    public void tick() {
        net.minecraft.world.entity.LivingEntity target = this.leaper.getTarget();
        if (target == null || !this.leaper.shouldWorkTask()) {
            if (this.attackTimer > 0) --this.attackTimer;
        } else if (!target.isAlive() || this.leaper.getParasiteStatus() > 2) {
            if (this.attackTimer > 0) --this.attackTimer;
        } else {
            ++this.attackTimer;
            if (this.attackTimer >= this.jCooldown && this.attacking == 0) {
                ++this.attacking;
                this.targetX = target.getX();
                this.targetZ = target.getZ();
                this.targetY = (float) (target.getY() - this.leaper.getY()) * 0.07f;
                if (this.targetY <= 0.0f) this.targetY = 0.0f;
            }
        }
        if (this.attacking >= 1) {
            ++this.attacking;
            if (this.attacking == 2 && this.leaper.onGround()) {
                this.leaper.setParasiteStatus(10);
                this.leaper.getNavigation().stop();
                double d0 = this.targetX - this.leaper.getX();
                double d1 = this.targetZ - this.leaper.getZ();
                double f = Math.sqrt(d0 * d0 + d1 * d1);
                this.leaper.setDeltaMovement(this.leaper.getDeltaMovement().x + d0 / f * this.jumpSpeed * 0.9 + this.leaper.getDeltaMovement().x * 0.3,
                        (double) this.leapMotionY + (double) this.targetY,
                        this.leaper.getDeltaMovement().z + d1 / f * this.jumpSpeed * 0.9 + this.leaper.getDeltaMovement().z * 0.3);
            }
            if (this.attacking >= 3 && this.leaper.onGround()) {
                if (this.jumpR != 0) {
                    float damage = (float) this.leaper.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getBaseValue();
                    net.minecraft.world.phys.AABB axisalignedbb = this.leaper.getBoundingBox().inflate(this.jumpR, 2.0, this.jumpR);
                    java.util.List<net.minecraft.world.entity.LivingEntity> moblist = this.leaper.level().getEntitiesOfClass(net.minecraft.world.entity.LivingEntity.class, axisalignedbb);
                    for (net.minecraft.world.entity.LivingEntity mob : moblist) {
                        if (mob == this.leaper || mob instanceof EntityParasiteBase) continue;
                        mob.knockback(2.5f, this.leaper.getX() - mob.getX(), this.leaper.getZ() - mob.getZ());
                        this.leaper.doHurtTarget(mob);
                    }
                }
                this.attacking = 0;
                this.attackTimer = 0;
                this.leaper.setParasiteStatus(2);
            }
        }
    }
}