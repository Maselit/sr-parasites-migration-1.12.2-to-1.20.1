package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIAncientSummon a 1.20.1 (Goal).
 */
public class EntityAIAncientSummon extends Goal {
    private final EntityParasiteBase parentEntity;
    private int limit = 0;
    private final int sCooldown;
    private final int sLimit;
    private final String[] sMobs;
    private int attackTimer = 0;
    private int attacking = 0;
    private double targetX;
    private double targetY;
    private double targetZ;

    public EntityAIAncientSummon(EntityParasiteBase ancient, int cooldown, int limit, String[] mobList) {
        this.parentEntity = ancient;
        this.sCooldown = cooldown;
        this.sLimit = limit;
        this.sMobs = mobList;
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    @Override
    public boolean canUse() {
        return this.parentEntity.getTarget() != null || this.attacking >= 1;
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
        this.attackTimer = 0;
        this.limit = 0;
    }

    @Override
    public void tick() {
        if (this.attacking >= 1) {
            ++this.attacking;
            if (this.attacking == 2) {
                this.parentEntity.playSound(SRPSounds.ANCIENT_POD.get(), 5.0f, 1.0f);
            }
            if (this.attacking % 20 == 0 && this.attacking >= 40 && ParasiteEventEntity.SummonM(this.parentEntity, this.sMobs, 10, this.targetX, this.targetY, this.targetZ, this.parentEntity.getTarget(), true)) {
                ++this.limit;
            }
            if (this.limit >= this.sLimit) {
                this.attacking = 0;
                this.attackTimer = 0;
                this.limit = 0;
            }
        } else {
            net.minecraft.world.entity.LivingEntity target = this.parentEntity.getTarget();
            if (target == null) {
                this.attackTimer = 0;
            } else if (!target.isAlive()) {
                this.attackTimer = 0;
            } else {
                if (this.parentEntity.hasLineOfSight(target) && this.parentEntity.distanceTo(target) < 50.0) {
                    if (target.onGround() || this.parentEntity.getRandom().nextBoolean()) {
                        ++this.attackTimer;
                    }
                    if (this.attackTimer >= this.sCooldown && this.attacking == 0) {
                        ++this.attacking;
                        this.targetX = target.getX();
                        this.targetY = this.parentEntity.getY() + 25.0;
                        this.targetZ = target.getZ();
                    }
                } else {
                    this.attackTimer = 0;
                }
            }
        }
    }
}