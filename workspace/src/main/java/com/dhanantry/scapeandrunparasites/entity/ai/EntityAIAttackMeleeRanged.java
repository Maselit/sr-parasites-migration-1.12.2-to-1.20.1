package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIAttackMeleeRanged a 1.20.1 (Goal).
 */
public class EntityAIAttackMeleeRanged extends Goal {
    private final EntityParasiteBase parentEntity;
    private final double minDistance;
    private final double maxDistance;
    private final double prepDistance;
    private final boolean pulling;
    private final float str;

    public EntityAIAttackMeleeRanged(EntityParasiteBase in, double minD, double maxD, double prepD, boolean pull, float str) {
        this.parentEntity = in;
        this.minDistance = minD;
        this.maxDistance = maxD;
        this.prepDistance = prepD;
        this.pulling = pull;
        this.str = str;
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    @Override
    public boolean canUse() {
        return this.parentEntity.getTarget() != null;
    }

    @Override
    public void stop() {
        this.parentEntity.setParasiteStatus(0);
    }

    @Override
    public void tick() {
        net.minecraft.world.entity.LivingEntity target = this.parentEntity.getTarget();
        if (target == null) {
            this.stop();
            return;
        }
        if (target.distanceToSqr(this.parentEntity) < this.prepDistance * this.prepDistance && this.parentEntity.hasLineOfSight(target)) {
            this.parentEntity.setParasiteStatus(15);
            if (target.distanceToSqr(this.parentEntity) < this.maxDistance * this.maxDistance && target.distanceToSqr(this.parentEntity) > this.minDistance * this.minDistance && this.parentEntity.tickCount % 20 == 0) {
                // EntityDamage spawn (TODO: migrar EntityDamage)
            }
        } else {
            this.parentEntity.setParasiteStatus(0);
        }
    }
}