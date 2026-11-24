package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIEvade a 1.20.1 (Goal).
 */
public class EntityAIEvade extends Goal {
    private final EntityParasiteBase parent;
    private int eCooldown;
    private int cooldown;
    private int eDuration;
    private int tracker;
    private boolean inC;
    private int blockDistance;

    public EntityAIEvade(EntityParasiteBase in, int cooldown, int duration, int distance) {
        this.parent = in;
        this.tracker = 0;
        this.eCooldown = cooldown;
        this.cooldown = cooldown + 1;
        this.eDuration = duration;
        this.blockDistance = distance * distance;
        this.inC = false;
        this.setFlags(java.util.EnumSet.of(Flag.MOVE, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        net.minecraft.world.entity.LivingEntity target = this.parent.getTarget();
        return (target != null || this.inC) && this.parent.getParasiteStatus() > 0 && this.parent.getParasiteStatus() < 3 && this.parent.onGround();
    }

    @Override
    public void stop() {
        this.cooldown = 0;
        this.tracker = 0;
        this.inC = false;
        // moveStrafing removed in 1.20.1
    }

    @Override
    public void tick() {
        net.minecraft.world.entity.LivingEntity target = this.parent.getTarget();
        if ((target != null || this.inC) && !this.parent.hasEffect(net.minecraft.world.effect.MobEffects.MOVEMENT_SLOWDOWN)) {
            if (this.inC) {
                ++this.tracker;
                if (this.tracker >= this.eDuration) {
                    // moveStrafing removed in 1.20.1
                    this.tracker = 0;
                    this.cooldown = 0;
                    this.inC = false;
                }
            } else {
                if (target != null && this.parent.distanceTo(target) > (double) this.blockDistance && this.parent.hasLineOfSight(target) && this.parent.distanceTo(target) < 15.0) {
                    ++this.cooldown;
                }
                if (this.cooldown >= this.eCooldown && true) {
                    int i = this.parent.getRandom().nextInt(2) == 0 ? 1 : -1;
                    // moveStrafing removed in 1.20.1
                    this.inC = true;
                    if (target != null) {
                        double dd0 = target.getX() - this.parent.getX();
                        double dd1 = target.getZ() - this.parent.getZ();
                        float f = (float) Math.sqrt(dd0 * dd0 + dd1 * dd1);
                        this.parent.setDeltaMovement(this.parent.getDeltaMovement().x + dd0 / (double) f * 1.77 * 0.8 + this.parent.getDeltaMovement().x * 0.2,
                                0.2 + (double) this.parent.getBbHeight() * 0.1,
                                this.parent.getDeltaMovement().z + dd1 / (double) f * 1.77 * 0.8 + this.parent.getDeltaMovement().z * 0.2);
                        this.parent.getNavigation().stop();
                    }
                }
            }
        }
    }
}