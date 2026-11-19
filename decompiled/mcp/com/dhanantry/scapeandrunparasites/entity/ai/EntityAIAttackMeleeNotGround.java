/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.util.math.MathHelper
 */
package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCutomAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.math.MathHelper;

public class EntityAIAttackMeleeNotGround
extends EntityAIBase {
    protected EntityParasiteBase attacker;
    protected int attackTick;
    private double attack;
    private double track;
    private int cooldown;
    private int currentCD;
    private double speed;
    private boolean needAir;

    public EntityAIAttackMeleeNotGround(EntityParasiteBase creature, double attackD, double tracking, double spee, boolean air) {
        this.attacker = creature;
        this.attack = attackD * attackD;
        this.track = tracking * tracking;
        this.cooldown = 0;
        this.currentCD = 80;
        this.speed = spee;
        this.needAir = air;
    }

    public EntityAIAttackMeleeNotGround(EntityParasiteBase creature, double attackD, double tracking, double spee, boolean air, int cd) {
        this(creature, attackD, tracking, spee, air);
        this.currentCD = cd;
    }

    public boolean shouldExecute() {
        return this.attacker.getAttackTarget() != null;
    }

    public void updateTask() {
        EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();
        if (entitylivingbase == null) {
            return;
        }
        if (!entitylivingbase.isEntityAlive()) {
            this.attacker.setAttackTarget(null);
            return;
        }
        if (this.needAir ? this.attacker.isInWater() : !this.attacker.isInWater()) {
            return;
        }
        ++this.cooldown;
        if (this.cooldown < this.currentCD) {
            return;
        }
        this.attacker.getLookHelper().setLookPositionWithEntity((Entity)entitylivingbase, 30.0f, 30.0f);
        double d0 = this.attacker.getDistanceSq(entitylivingbase.posX, entitylivingbase.getEntityBoundingBox().minY, entitylivingbase.posZ);
        if (this.attacker.getDistanceSq((Entity)entitylivingbase) < this.track && this.attacker.canEntityBeSeen((Entity)entitylivingbase)) {
            double dd0 = entitylivingbase.posX - this.attacker.posX;
            double dd1 = entitylivingbase.posZ - this.attacker.posZ;
            double yy = entitylivingbase.posY >= this.attacker.posY ? 1.0 : -1.0;
            float f = MathHelper.sqrt((double)(dd0 * dd0 + dd1 * dd1));
            this.attacker.motionX += dd0 / (double)f * this.speed + this.attacker.motionX * this.speed;
            this.attacker.motionZ += dd1 / (double)f * this.speed + this.attacker.motionZ * this.speed;
            this.attacker.motionY = 0.2 * yy;
            this.attackTick = Math.max(this.attackTick - 1, 0);
            this.checkAndPerformAttack(entitylivingbase, d0);
            if (!this.needAir && entitylivingbase.posY >= this.attacker.posY + 1.0) {
                this.attacker.motionY -= 0.2;
            }
            if (this.cooldown > 140) {
                this.cooldown = 0;
            }
        }
    }

    protected void checkAndPerformAttack(EntityLivingBase target, double distance) {
        if (distance <= this.attack && this.attackTick <= 0) {
            this.attackTick = 20;
            EntityCutomAttack thisA = (EntityCutomAttack)((Object)this.attacker);
            thisA.attackEntityAsMobAOE((Entity)target);
        }
    }
}

