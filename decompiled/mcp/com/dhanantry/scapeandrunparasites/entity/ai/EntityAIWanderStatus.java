/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.RandomPositionGenerator
 *  net.minecraft.util.math.Vec3d
 */
package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.math.Vec3d;

public class EntityAIWanderStatus
extends EntityAIBase {
    protected final EntityParasiteBase entity;
    protected double x;
    protected double y;
    protected double z;
    protected final double speed;
    protected int executionChance;
    protected boolean mustUpdate;
    protected final float probability;
    protected boolean avoidW;

    public EntityAIWanderStatus(EntityParasiteBase creatureIn, double speedIn, float prob, boolean avoidWater) {
        this(creatureIn, speedIn, 120, prob, avoidWater);
    }

    public EntityAIWanderStatus(EntityParasiteBase creatureIn, double speedIn, int chance, float prob, boolean aW) {
        this.entity = creatureIn;
        this.speed = speedIn;
        this.executionChance = chance;
        this.probability = prob;
        this.avoidW = aW;
        this.setMutexBits(1);
    }

    public boolean shouldExecute() {
        Vec3d vec3d;
        if (this.entity.getParasiteStatus() != 0) {
            return false;
        }
        if (!this.mustUpdate) {
            if (this.entity.getIdleTime() >= 100) {
                return false;
            }
            if (this.entity.getRNG().nextInt(this.executionChance) != 0) {
                return false;
            }
        }
        if ((vec3d = this.getPosition()) == null) {
            return false;
        }
        this.x = vec3d.x;
        this.y = vec3d.y;
        this.z = vec3d.z;
        this.mustUpdate = false;
        return this.entity.getNavigator().getPath() == null;
    }

    @Nullable
    protected Vec3d getPosition() {
        if (this.avoidW) {
            if (this.entity.isInWater()) {
                Vec3d vec3d = RandomPositionGenerator.getLandPos((EntityCreature)this.entity, (int)15, (int)7);
                return vec3d == null ? RandomPositionGenerator.findRandomTarget((EntityCreature)this.entity, (int)10, (int)7) : vec3d;
            }
            if (this.entity.getParasiteFollowing() == null) {
                return this.entity.getRNG().nextFloat() >= this.probability ? RandomPositionGenerator.getLandPos((EntityCreature)this.entity, (int)10, (int)7) : RandomPositionGenerator.findRandomTarget((EntityCreature)this.entity, (int)10, (int)7);
            }
            Random ran = new Random();
            if (ran.nextInt(3) == 0) {
                return this.entity.getRNG().nextFloat() >= this.probability ? RandomPositionGenerator.getLandPos((EntityCreature)this.entity, (int)3, (int)2) : RandomPositionGenerator.findRandomTarget((EntityCreature)this.entity, (int)3, (int)2);
            }
            return null;
        }
        if (this.entity.getParasiteFollowing() == null) {
            return RandomPositionGenerator.findRandomTarget((EntityCreature)this.entity, (int)10, (int)7);
        }
        Random ran = new Random();
        if (ran.nextInt(3) == 0) {
            return RandomPositionGenerator.findRandomTarget((EntityCreature)this.entity, (int)0, (int)0);
        }
        return null;
    }

    public boolean shouldContinueExecuting() {
        return !this.entity.getNavigator().noPath() && this.entity.getParasiteStatus() == 0;
    }

    public void startExecuting() {
        this.entity.getNavigator().tryMoveToXYZ(this.x, this.y, this.z, this.speed);
    }

    public void makeUpdate() {
        this.mustUpdate = true;
    }

    public void setExecutionChance(int newchance) {
        this.executionChance = newchance;
    }
}

