package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIEvadeDash a 1.20.1 (Goal).
 */
public class EntityAIEvadeDash extends Goal {
    private final EntityParasiteBase parent;
    private int eCooldown;
    private int cooldown;
    private int eDuration;
    private int tracker;
    private boolean inC;
    private int blockDistance;
    private double dash;
    private int maxDis;

    public EntityAIEvadeDash(EntityParasiteBase in, int cooldown, int duration, int distance) {
        this.parent = in;
        this.tracker = 0;
        this.eCooldown = cooldown;
        this.cooldown = cooldown + 1;
        this.eDuration = duration;
        this.blockDistance = distance * distance;
        this.inC = false;
        this.dash = 3.0;
        this.maxDis = 225;
        this.setFlags(java.util.EnumSet.of(Flag.MOVE));
    }

    public EntityAIEvadeDash(EntityParasiteBase in, int cooldown, int duration, int distance, double dash, int maxD) {
        this(in, cooldown, duration, distance);
        this.dash = dash;
        this.maxDis = maxD * maxD;
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
    }

    @Override
    public void tick() {
        net.minecraft.world.entity.LivingEntity target = this.parent.getTarget();
        if (target != null || this.inC) {
            if (this.inC) {
                ++this.tracker;
                if (this.tracker >= this.eDuration) {
                    this.tracker = 0;
                    this.cooldown = 0;
                    this.inC = false;
                }
            } else {
                if (target != null && this.parent.distanceTo(target) > (double) this.blockDistance && this.parent.hasLineOfSight(target) && this.parent.distanceTo(target) < (double) this.maxDis) {
                    ++this.cooldown;
                }
                if (this.cooldown >= this.eCooldown) {
                    double dd0 = target.getX() - this.parent.getX();
                    double dd1 = target.getZ() - this.parent.getZ();
                    float f = (float) Math.sqrt(dd0 * dd0 + dd1 * dd1);
                    double i = 0.0;
                    double j = 0.0;
                    if (this.parent.getRandom().nextBoolean()) {
                        i = this.dash;
                    } else {
                        j = this.dash;
                    }
                    this.parent.setDeltaMovement(this.parent.getDeltaMovement().x + dd0 / (double) f * this.dash * 0.8 + this.parent.getDeltaMovement().x * 0.2 + i,
                            this.parent.getDeltaMovement().y,
                            this.parent.getDeltaMovement().z + dd1 / (double) f * this.dash * 0.8 + this.parent.getDeltaMovement().z * 0.2 + j);
                    this.parent.getNavigation().stop();
                    this.cooldown = 0;
                }
            }
        }
    }
}