/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IRangedAttackMob
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.util.math.MathHelper
 */
package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.math.MathHelper;

public class EntityAIAttackRangedStatus
extends EntityAIBase {
    private final EntityParasiteBase entityHost;
    private final IRangedAttackMob rangedAttackEntityHost;
    private EntityLivingBase attackTarget;
    private int rangedAttackTime = -1;
    private final double entityMoveSpeed;
    private int seeTime;
    private final int attackIntervalMin;
    private final int maxRangedAttackTime;
    private final float attackRadius;
    private final float maxAttackDistance;

    public EntityAIAttackRangedStatus(IRangedAttackMob attacker, double movespeed, int maxAttackTime, float maxAttackDistanceIn) {
        this(attacker, movespeed, maxAttackTime, maxAttackTime, maxAttackDistanceIn);
    }

    public EntityAIAttackRangedStatus(IRangedAttackMob attacker, double movespeed, int IntervalMin, int maxAttackTime, float maxAttackDistanceIn) {
        if (!(attacker instanceof EntityLivingBase)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.rangedAttackEntityHost = attacker;
        this.entityHost = (EntityParasiteBase)attacker;
        this.entityMoveSpeed = movespeed;
        this.attackIntervalMin = IntervalMin;
        this.maxRangedAttackTime = maxAttackTime;
        this.attackRadius = maxAttackDistanceIn;
        this.maxAttackDistance = maxAttackDistanceIn * maxAttackDistanceIn;
        this.setMutexBits(3);
    }

    public boolean shouldExecute() {
        EntityLivingBase entitylivingbase = this.entityHost.getAttackTarget();
        if (entitylivingbase == null || this.entityHost.shouldWorkTask()) {
            return false;
        }
        this.attackTarget = entitylivingbase;
        return true;
    }

    public boolean shouldContinueExecuting() {
        return (this.shouldExecute() || !this.entityHost.getNavigator().noPath()) && !this.entityHost.shouldWorkTask();
    }

    public void resetTask() {
        this.attackTarget = null;
        this.seeTime = 0;
        this.rangedAttackTime = -1;
    }

    public void updateTask() {
        this.entityHost.setParasiteStatus(2);
        if (this.attackTarget == null) {
            this.resetTask();
        } else if (!this.attackTarget.isEntityAlive()) {
            this.resetTask();
        } else {
            double d0 = this.entityHost.getDistanceSq(this.attackTarget.posX, this.attackTarget.getEntityBoundingBox().minY, this.attackTarget.posZ);
            boolean flag = this.entityHost.getEntitySenses().canSee((Entity)this.attackTarget);
            this.seeTime = flag ? ++this.seeTime : 0;
            if (d0 <= (double)this.maxAttackDistance && this.seeTime >= 20) {
                this.entityHost.getNavigator().clearPath();
            } else {
                this.entityHost.getNavigator().tryMoveToEntityLiving((Entity)this.attackTarget, this.entityMoveSpeed);
            }
            if (this.entityHost.isPotionActive(SRPPotions.RAGE_E)) {
                --this.rangedAttackTime;
            }
            if (--this.rangedAttackTime == 0) {
                if (!flag) {
                    return;
                }
                float f = MathHelper.sqrt((double)d0) / this.attackRadius;
                float lvt_5_1_ = MathHelper.clamp((float)f, (float)0.1f, (float)1.0f);
                this.rangedAttackEntityHost.attackEntityWithRangedAttack(this.attackTarget, lvt_5_1_);
                this.entityHost.resetIdleTime();
                this.rangedAttackTime = MathHelper.floor((float)(f * (float)(this.maxRangedAttackTime - this.attackIntervalMin) + (float)this.attackIntervalMin));
            } else if (this.rangedAttackTime < 0) {
                float f2 = MathHelper.sqrt((double)d0) / this.attackRadius;
                this.rangedAttackTime = MathHelper.floor((float)(f2 * (float)(this.maxRangedAttackTime - this.attackIntervalMin) + (float)this.attackIntervalMin));
            }
        }
    }
}

