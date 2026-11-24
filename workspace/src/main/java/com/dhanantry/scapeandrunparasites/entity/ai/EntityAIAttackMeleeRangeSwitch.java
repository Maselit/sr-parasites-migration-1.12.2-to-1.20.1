package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIAttackMeleeRangeSwitch a 1.20.1 (Goal).
 */
public class EntityAIAttackMeleeRangeSwitch extends Goal {
    private final EntityParasiteBase parent;
    private final float distance;

    public EntityAIAttackMeleeRangeSwitch(EntityParasiteBase in, float meleeDistance) {
        this.parent = in;
        this.distance = meleeDistance;
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    @Override
    public boolean canUse() {
        return this.parent.getTarget() != null;
    }

    @Override
    public void tick() {
        net.minecraft.world.entity.LivingEntity target = this.parent.getTarget();
        if (target != null) {
            if (target.distanceTo(this.parent) < this.distance && this.parent.hasLineOfSight(target)) {
                this.parent.setWorkTask(true);
            } else {
                this.parent.setWorkTask(false);
            }
        }
    }
}