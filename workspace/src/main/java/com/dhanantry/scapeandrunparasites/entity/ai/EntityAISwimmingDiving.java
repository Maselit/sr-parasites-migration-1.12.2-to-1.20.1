package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.Mob;

/**
 * Migracion de EntityAISwimmingDiving a 1.20.1 (Goal).
 */
public class EntityAISwimmingDiving extends Goal {
    private final Mob parent;
    private final double yMotion;

    public EntityAISwimmingDiving(Mob parentIn, double y) {
        this.parent = parentIn;
        this.yMotion = y;
        this.setFlags(java.util.EnumSet.of(Flag.MOVE));
        if (parentIn.getNavigation() instanceof net.minecraft.world.entity.ai.navigation.GroundPathNavigation) {
            ((net.minecraft.world.entity.ai.navigation.GroundPathNavigation) parentIn.getNavigation()).setCanFloat(true);
        }
    }

    @Override
    public boolean canUse() {
        if (this.parent.isInWaterOrBubble() || this.parent.isInLava()) {
            net.minecraft.world.entity.LivingEntity target = this.parent.getTarget();
            if (target != null && (target.isInWaterOrBubble() || target.isInLava()) && target.distanceToSqr(this.parent) < 25.0 && target.getY() - this.parent.getY() < -1.0) {
                this.parent.setDeltaMovement(this.parent.getDeltaMovement().x, this.parent.getDeltaMovement().y - this.yMotion, this.parent.getDeltaMovement().z);
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void tick() {
        if (this.parent.getRandom().nextFloat() < 0.8f) {
            this.parent.getJumpControl().jump();
        }
    }
}