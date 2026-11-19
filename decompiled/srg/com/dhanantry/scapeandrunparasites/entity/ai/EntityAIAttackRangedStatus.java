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
        this.func_75248_a(3);
    }

    public boolean func_75250_a() {
        EntityLivingBase entitylivingbase = this.entityHost.func_70638_az();
        if (entitylivingbase == null || this.entityHost.shouldWorkTask()) {
            return false;
        }
        this.attackTarget = entitylivingbase;
        return true;
    }

    public boolean func_75253_b() {
        return (this.func_75250_a() || !this.entityHost.func_70661_as().func_75500_f()) && !this.entityHost.shouldWorkTask();
    }

    public void func_75251_c() {
        this.attackTarget = null;
        this.seeTime = 0;
        this.rangedAttackTime = -1;
    }

    public void func_75246_d() {
        this.entityHost.setParasiteStatus(2);
        if (this.attackTarget == null) {
            this.func_75251_c();
        } else if (!this.attackTarget.func_70089_S()) {
            this.func_75251_c();
        } else {
            double d0 = this.entityHost.func_70092_e(this.attackTarget.field_70165_t, this.attackTarget.func_174813_aQ().field_72338_b, this.attackTarget.field_70161_v);
            boolean flag = this.entityHost.func_70635_at().func_75522_a((Entity)this.attackTarget);
            this.seeTime = flag ? ++this.seeTime : 0;
            if (d0 <= (double)this.maxAttackDistance && this.seeTime >= 20) {
                this.entityHost.func_70661_as().func_75499_g();
            } else {
                this.entityHost.func_70661_as().func_75497_a((Entity)this.attackTarget, this.entityMoveSpeed);
            }
            if (this.entityHost.func_70644_a(SRPPotions.RAGE_E)) {
                --this.rangedAttackTime;
            }
            if (--this.rangedAttackTime == 0) {
                if (!flag) {
                    return;
                }
                float f = MathHelper.func_76133_a((double)d0) / this.attackRadius;
                float lvt_5_1_ = MathHelper.func_76131_a((float)f, (float)0.1f, (float)1.0f);
                this.rangedAttackEntityHost.func_82196_d(this.attackTarget, lvt_5_1_);
                this.entityHost.resetIdleTime();
                this.rangedAttackTime = MathHelper.func_76141_d((float)(f * (float)(this.maxRangedAttackTime - this.attackIntervalMin) + (float)this.attackIntervalMin));
            } else if (this.rangedAttackTime < 0) {
                float f2 = MathHelper.func_76133_a((double)d0) / this.attackRadius;
                this.rangedAttackTime = MathHelper.func_76141_d((float)(f2 * (float)(this.maxRangedAttackTime - this.attackIntervalMin) + (float)this.attackIntervalMin));
            }
        }
    }
}

