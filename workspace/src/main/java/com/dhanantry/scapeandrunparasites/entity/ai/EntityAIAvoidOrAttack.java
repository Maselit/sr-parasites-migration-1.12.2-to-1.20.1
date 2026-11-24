package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIAvoidOrAttack a 1.20.1 (Goal).
 */
public class EntityAIAvoidOrAttack extends Goal {
    private final EntityParasiteBase parent;
    private int tickss = 20;
    private final float light;

    public EntityAIAvoidOrAttack(EntityParasiteBase in, float lightR) {
        this.parent = in;
        this.tickss = 20;
        this.light = lightR;
        this.parent.setWorkTask(false);
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    @Override
    public boolean canUse() {
        --this.tickss;
        if (this.tickss < 0) {
            this.tickss = 20;
            return this.parent.getParasiteFollowing() == null;
        }
        return false;
    }

    @Override
    public void tick() {
        float f = this.parent.level().getBrightness(net.minecraft.world.level.LightLayer.BLOCK, this.parent.blockPosition()) / 15.0f;
        if (this.parent.hasEffect(net.minecraft.world.effect.MobEffects.NIGHT_VISION) && this.parent.getParasiteType() < 16) {
            this.parent.setWorkTask(true);
            return;
        }
        if (f >= this.light) {
            boolean flag = true;
            net.minecraft.world.phys.AABB axisalignedbb = this.parent.getBoundingBox().inflate(10.0, 2.0, 10.0);
            java.util.List<EntityParasiteBase> moblist = this.parent.level().getEntitiesOfClass(EntityParasiteBase.class, axisalignedbb);
            for (EntityParasiteBase mob : moblist) {
                if (mob == this.parent || !this.parent.hasLineOfSight(mob) || !mob.isAlive()) continue;
                if (flag) {
                    flag = false;
                    this.parent.setWorkTask(true);
                }
                if (this.parent.getParasiteFollowing() == null) {
                    if (mob.getParasiteFollowing() == null) {
                        this.parent.setParasiteToFollow(mob);
                    } else if (mob.getParasiteFollowing().getParasiteType() >= 11) {
                        this.parent.setParasiteToFollow(mob.getParasiteFollowing());
                    }
                }
                mob.setWorkTask(true);
            }
            if (flag) {
                this.parent.setWorkTask(false);
            }
        } else {
            this.parent.setWorkTask(true);
        }
    }
}