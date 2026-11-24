package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanShoot;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIAttackProjectile a 1.20.1 (Goal).
 */
public class EntityAIAttackProjectile extends Goal {
    private final EntityParasiteBase parentEntity;
    private int attackTimer;
    private final int cooldown;
    private int shootingTimes;
    private int shootingUpdate;
    private final int tickInterval;
    private int heighA;
    private final boolean canShootH;

    public EntityAIAttackProjectile(EntityParasiteBase parent, int cooldown, int tickInter, int shootingTim) {
        this(parent, cooldown, tickInter, shootingTim, false);
    }

    public EntityAIAttackProjectile(EntityParasiteBase parent, int cooldown, int tickInter, int shootingTim, boolean homming) {
        this.parentEntity = parent;
        this.attackTimer = 0;
        this.cooldown = cooldown;
        this.shootingTimes = shootingTim;
        this.shootingUpdate = 0;
        this.tickInterval = tickInter;
        this.canShootH = homming;
        this.heighA = 0;
        this.setFlags(java.util.EnumSet.of(Flag.TARGET, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        return this.parentEntity.getTarget() != null;
    }

    @Override
    public void stop() {
        this.shootingUpdate = 0;
        this.attackTimer = 0;
    }

    @Override
    public void tick() {
        net.minecraft.world.entity.LivingEntity target = this.parentEntity.getTarget();
        if (target == null || this.parentEntity.getParasiteStatus() >= 3) {
            this.attackTimer = 0;
            return;
        }
        if (!target.isAlive()) {
            this.attackTimer = 0;
            return;
        }
        if (this.parentEntity.getParasiteStatus() == 0) {
            this.parentEntity.setParasiteStatus(1);
        }
        if (target.distanceToSqr(this.parentEntity) < 4225.0 && this.parentEntity.hasLineOfSight(target)) {
            ++this.attackTimer;
            if (this.parentEntity.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.RAGE_E.get())) {
                ++this.attackTimer;
            }
            if (this.attackTimer == this.cooldown - 10 && this.parentEntity instanceof EntityCanShoot) {
                ((EntityCanShoot) this.parentEntity).playProjSound();
            }
            if (this.attackTimer > this.cooldown) {
                if (this.shootingTimes > this.shootingUpdate) {
                    if (this.attackTimer % this.tickInterval == 0 && this.parentEntity instanceof EntityCanShoot) {
                        this.shoot(target);
                        ++this.shootingUpdate;
                    }
                } else {
                    this.attackTimer = 0;
                    this.shootingUpdate = 0;
                }
            }
        } else if (this.attackTimer > 0) {
            --this.attackTimer;
        }
    }

    private void shoot(net.minecraft.world.entity.LivingEntity target) {
        this.heighA = (!target.onGround() && this.canShootH) ? ++this.heighA : 0;
        if (this.heighA <= 5 && this.parentEntity instanceof EntityCanShoot) {
            double d2 = target.getX() - this.parentEntity.getX();
            double d3 = target.getBoundingBox().minY + (double) (target.getBbHeight() / 2.0f) - (0.5 + this.parentEntity.getY() + (double) (this.parentEntity.getBbHeight() / 2.0f));
            double d4 = target.getZ() - this.parentEntity.getZ();
            net.minecraft.world.entity.Entity proj = ((EntityCanShoot) this.parentEntity).getProj(d2, d3, d4);
            if (proj != null) {
                proj.setPos(this.parentEntity.getX(), this.parentEntity.getY() + (double) this.parentEntity.getEyeHeight() - 0.2, this.parentEntity.getZ());
                this.parentEntity.level().addFreshEntity(proj);
            }
        }
    }
}