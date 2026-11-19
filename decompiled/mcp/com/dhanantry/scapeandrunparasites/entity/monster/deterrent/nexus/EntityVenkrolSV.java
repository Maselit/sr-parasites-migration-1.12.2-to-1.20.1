/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIBlockInfest;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.world.World;

public class EntityVenkrolSV
extends EntityPStationaryArchitect {
    private EntityAIBlockInfest infestation = new EntityAIBlockInfest(this, 2);

    public EntityVenkrolSV(World worldIn) {
        super(worldIn);
        this.setSize(1.0f, 8.8f);
        this.ignoreFrustumCheck = true;
        this.totalP = SRPConfigMobs.venkrolTotalActiveMobs;
        this.mobID = new int[this.totalP + SRPConfigMobs.venkrollimit];
        this.mobPT = new int[this.totalP + SRPConfigMobs.venkrollimit];
        this.stage = (byte)3;
        this.experienceValue = SRPAttributes.XP_ADAPTED * 2;
        if (SRPAttributes.rsBlockI) {
            this.tasks.addTask(3, (EntityAIBase)this.infestation);
        }
        for (int i = 0; i < this.mobID.length; ++i) {
            this.mobID[i] = -777;
        }
        this.setBODY(1.0f);
    }

    @Override
    public int getParasiteIDRegister() {
        return 42;
    }

    protected void initEntityAI() {
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.VENKROLSII_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.VENKROLSII_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.VENKROLSII_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(24.0);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.freeDead();
        if (this.getParasiteStatus() == 0) {
            this.setBODY(0.04f);
        } else {
            this.setBODY(-0.04f);
        }
    }

    public float getEyeHeight() {
        return 8.5f;
    }

    public void setBODY(float in) {
        if ((in += this.getBODY()) > 0.5f) {
            in = 0.5f;
        }
        if (in < 0.0f) {
            in = 0.0f;
        }
        this.body = in;
    }

    @Override
    public float getBombDamage() {
        return (float)SRPAttributes.VENKROLSIV_ATTACK_DAMAGE;
    }
}

