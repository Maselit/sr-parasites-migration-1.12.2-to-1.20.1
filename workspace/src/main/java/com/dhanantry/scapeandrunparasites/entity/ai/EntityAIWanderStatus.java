package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.util.RandomPos;
import net.minecraft.world.phys.Vec3;

/**
 * Migracion de EntityAIWanderStatus a 1.20.1 (Goal).
 */
public class EntityAIWanderStatus extends Goal {
    protected final EntityParasiteBase entity;
    protected double x;
    protected double y;
    protected double z;
    protected final double speed;
    protected int executionChance;
    protected boolean mustUpdate;
    protected final float probability;
    protected final boolean avoidW;

    public EntityAIWanderStatus(EntityParasiteBase creatureIn, double speedIn, float prob, boolean avoidWater) {
        this(creatureIn, speedIn, 120, prob, avoidWater);
    }

    public EntityAIWanderStatus(EntityParasiteBase creatureIn, double speedIn, int chance, float prob, boolean aW) {
        this.entity = creatureIn;
        this.speed = speedIn;
        this.executionChance = chance;
        this.probability = prob;
        this.avoidW = aW;
        this.setFlags(java.util.EnumSet.of(Flag.MOVE));
    }

    @Override
    public boolean canUse() {
        if (this.entity.getParasiteStatus() != 0) {
            return false;
        }
        if (!this.mustUpdate) {
            if (this.entity.getIdleTime() >= 100) {
                return false;
            }
            if (this.entity.getRandom().nextInt(this.executionChance) != 0) {
                return false;
            }
        }
        Vec3 vec3d = this.getPosition();
        if (vec3d == null) {
            return false;
        }
        this.x = vec3d.x;
        this.y = vec3d.y;
        this.z = vec3d.z;
        this.mustUpdate = false;
        return this.entity.getNavigation().getPath() == null;
    }

    protected Vec3 getPosition() {
        if (this.avoidW) {
            if (this.entity.isInWater()) {
                Vec3 vec3d = net.minecraft.world.entity.ai.util.LandRandomPos.getPos(this.entity, 15, 7);
                return vec3d == null ? net.minecraft.world.entity.ai.util.LandRandomPos.getPos(this.entity, 10, 7) : vec3d;
            }
            if (this.entity.getParasiteFollowing() == null) {
                return this.entity.getRandom().nextFloat() >= this.probability ? net.minecraft.world.entity.ai.util.LandRandomPos.getPos(this.entity, 10, 7) : net.minecraft.world.entity.ai.util.LandRandomPos.getPos(this.entity, 10, 7);
            }
            if (this.entity.getRandom().nextInt(3) == 0) {
                return this.entity.getRandom().nextFloat() >= this.probability ? net.minecraft.world.entity.ai.util.LandRandomPos.getPos(this.entity, 3, 2) : net.minecraft.world.entity.ai.util.LandRandomPos.getPos(this.entity, 3, 2);
            }
            return null;
        }
        if (this.entity.getParasiteFollowing() == null) {
            return net.minecraft.world.entity.ai.util.LandRandomPos.getPos(this.entity, 10, 7);
        }
        if (this.entity.getRandom().nextInt(3) == 0) {
            return net.minecraft.world.entity.ai.util.LandRandomPos.getPos(this.entity, 1, 1);
        }
        return null;
    }

    @Override
    public boolean canContinueToUse() {
        return !this.entity.getNavigation().isDone() && this.entity.getParasiteStatus() == 0;
    }

    @Override
    public void start() {
        this.entity.getNavigation().moveTo(this.x, this.y, this.z, this.speed);
    }

    public void makeUpdate() {
        this.mustUpdate = true;
    }

    public void setExecutionChance(int newchance) {
        this.executionChance = newchance;
    }
}