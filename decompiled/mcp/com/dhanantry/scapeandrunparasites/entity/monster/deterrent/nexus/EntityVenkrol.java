/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.EnumDifficulty
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus;

import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIBlockInfest;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAINexusGrow;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIVenkrolSummon;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityVenkrol
extends EntityPStationaryArchitect {
    public EntityAIVenkrolSummon summonV = new EntityAIVenkrolSummon(this, SRPConfigMobs.venkrollimit, 20 * SRPConfigMobs.venkrolCooldown, 1, SRPConfigMobs.venkrolCAMinimumV, SRPConfigMobs.venkrolCAExtraM);

    public EntityVenkrol(World worldIn) {
        super(worldIn);
        this.setSize(0.5f, 1.5f);
        this.buriedT = 2.6;
        this.totalP = SRPConfigMobs.venkrolTotalActiveMobs;
        this.mobID = new int[this.totalP + SRPConfigMobs.venkrollimit];
        this.mobPT = new int[this.totalP + SRPConfigMobs.venkrollimit];
        this.stage = 1;
        this.experienceValue = SRPAttributes.XP_INFECTED * 2;
        if (SRPAttributes.rsBlockI) {
            this.tasks.addTask(3, (EntityAIBase)new EntityAIBlockInfest(this, 1));
        }
        for (int i = 0; i < this.mobID.length; ++i) {
            this.mobID[i] = -777;
        }
        this.setBODY(1.0f);
        this.tasks.addTask(2, (EntityAIBase)this.summonV);
        this.damageCap = SRPConfig.nexussiCap;
        this.pointCap = SRPConfig.nexussiPointCap;
        this.pointReduction = SRPConfig.nexussiPointRed;
        this.chanceLearn = SRPConfig.nexussiChanceLe;
        this.chanceLearnFire = SRPConfig.nexussiChanceLeFire;
        this.DamageTypeCap = SRPConfig.nexussiPointDamCap;
        this.neededTime = this.setGT(SRPConfig.nexusMinGrowTime, SRPConfig.nexusMaxGrowTime);
        this.valueEvDeath = SRPConfig.nexussiLoosingEPValue;
    }

    @Override
    public int getParasiteIDRegister() {
        return 16;
    }

    protected void initEntityAI() {
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(4, (EntityAIBase)new EntityAINexusGrow(this, 1));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.VENKROL_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.VENKROL_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.VENKROL_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.nexussiFollow);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.world.isRemote && this.topParticles > 0 && this.ticksExisted % 10 == 0) {
            for (int i = 0; i <= 1; ++i) {
                this.spawnParticlesTop(SRPEnumParticle.BIOMASS, 0, 0, 0);
            }
        }
        if (this.getParasiteStatus() == 0) {
            this.setBODY(0.04f);
        } else {
            this.setBODY(-0.04f);
        }
    }

    public float getEyeHeight() {
        return 1.4f;
    }

    public void setBODY(float in) {
        if ((in += this.getBODY()) > 0.6f) {
            in = 0.6f;
        }
        if (in < 0.0f) {
            in = 0.0f;
        }
        this.body = in;
    }

    @Override
    public boolean getCanSpawnHere() {
        IBlockState iblockstate = this.world.getBlockState(new BlockPos((Entity)this).down());
        return this.getBlockPathWeight(new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ)) >= 0.0f && iblockstate.canEntitySpawn((Entity)this) && this.world.getDifficulty() != EnumDifficulty.PEACEFUL;
    }

    protected SoundEvent getAmbientSound() {
        return SRPSounds.VENKROLSI_GROWL;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        if (this.rand.nextBoolean() && this.getHitStatus() > 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.VENKROLSI_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SRPSounds.VENKROLSI_DEATH;
    }

    @Override
    public float getBombDamage() {
        return (float)SRPAttributes.VENKROL_ATTACK_DAMAGE;
    }
}

