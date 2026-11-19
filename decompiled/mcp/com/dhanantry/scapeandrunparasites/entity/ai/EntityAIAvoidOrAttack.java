/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.init.MobEffects
 *  net.minecraft.util.math.AxisAlignedBB
 */
package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.init.MobEffects;
import net.minecraft.util.math.AxisAlignedBB;

public class EntityAIAvoidOrAttack
extends EntityAIBase {
    private final EntityParasiteBase parent;
    private int tickss;
    private float light;

    public EntityAIAvoidOrAttack(EntityParasiteBase in, float lightR) {
        this.parent = in;
        this.tickss = 20;
        this.light = lightR;
        this.parent.setWorkTask(false);
    }

    public boolean shouldExecute() {
        --this.tickss;
        if (this.tickss < 0) {
            this.tickss = 20;
            return this.parent.getParasiteFollowing() == null;
        }
        return false;
    }

    public void updateTask() {
        float f = this.parent.getBrightness();
        if (this.parent.isPotionActive(MobEffects.NIGHT_VISION) && this.parent.getParasiteType() < 16) {
            this.parent.setWorkTask(true);
            return;
        }
        if (f >= this.light) {
            boolean flag = true;
            AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.parent.posX, this.parent.posY, this.parent.posZ, this.parent.posX + 1.0, this.parent.posY + 1.0, this.parent.posZ + 1.0).grow(10.0, 2.0, 10.0);
            List moblist = this.parent.world.getEntitiesWithinAABB(EntityParasiteBase.class, axisalignedbb);
            for (EntityParasiteBase mob : moblist) {
                if (mob == this.parent || !this.parent.canEntityBeSeen((Entity)mob) || !mob.isEntityAlive()) continue;
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

