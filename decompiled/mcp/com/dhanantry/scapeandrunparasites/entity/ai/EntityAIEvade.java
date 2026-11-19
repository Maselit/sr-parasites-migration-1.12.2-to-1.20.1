/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.init.MobEffects
 *  net.minecraft.util.math.MathHelper
 */
package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.init.MobEffects;
import net.minecraft.util.math.MathHelper;

public class EntityAIEvade
extends EntityAIBase {
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
    }

    public boolean shouldExecute() {
        return (this.parent.getAttackTarget() != null || this.inC) && this.parent.getParasiteStatus() > 0 && this.parent.getParasiteStatus() < 3 && this.parent.onGround;
    }

    public void resetTask() {
        this.cooldown = 0;
        this.tracker = 0;
        this.inC = false;
        this.parent.moveStrafing = 0.0f;
    }

    public void updateTask() {
        EntityLivingBase target = this.parent.getAttackTarget();
        if ((target != null || this.inC) && !this.parent.isPotionActive(MobEffects.SLOWNESS)) {
            if (this.inC) {
                ++this.tracker;
                if (this.tracker >= this.eDuration) {
                    this.parent.moveStrafing = 0.0f;
                    this.tracker = 0;
                    this.cooldown = 0;
                    this.inC = false;
                }
            } else {
                if (this.parent.getDistanceSq((Entity)target) > (double)this.blockDistance && this.parent.canEntityBeSeen((Entity)target) && this.parent.getDistanceSq((Entity)target) < 225.0) {
                    ++this.cooldown;
                }
                if (this.cooldown >= this.eCooldown && this.parent.moveStrafing == 0.0f) {
                    int i = this.parent.getRNG().nextInt(2) == 0 ? 1 : -1;
                    this.parent.moveStrafing = i;
                    this.inC = true;
                    double dd0 = target.posX - this.parent.posX;
                    double dd1 = target.posZ - this.parent.posZ;
                    float f = MathHelper.sqrt((double)(dd0 * dd0 + dd1 * dd1));
                    this.parent.motionX += dd0 / (double)f * 1.77 * (double)0.8f + this.parent.motionX * (double)0.2f;
                    this.parent.motionZ += dd1 / (double)f * 1.77 * (double)0.8f + this.parent.motionZ * (double)0.2f;
                    this.parent.motionY = 0.2 + (double)this.parent.height * 0.1;
                    this.parent.getNavigator().clearPath();
                }
            }
        }
    }
}

