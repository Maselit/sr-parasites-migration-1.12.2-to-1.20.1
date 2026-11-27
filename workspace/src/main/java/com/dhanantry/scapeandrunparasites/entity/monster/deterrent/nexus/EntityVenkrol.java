package com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIBlockInfest;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAINexusGrow;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIVenkrolSummon;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class EntityVenkrol extends EntityPStationaryArchitect {
    public EntityAIVenkrolSummon summonV;
    public double buriedT = 2.6;
    public float body = 0.0f;
    public int topParticles = 0;

    public EntityVenkrol(EntityType<? extends EntityVenkrol> type, Level level) {
        super(type, level);
        this.totalP = SRPConfigMobs.venkrolTotalActiveMobs;
        this.mobID = new int[this.totalP + SRPConfigMobs.venkrollimit];
        this.mobPT = new int[this.totalP + SRPConfigMobs.venkrollimit];
        this.stage = 1;
        this.xpReward = (int)(SRPAttributes.XP_INFECTED * 2);
        if (SRPAttributes.rsBlockI) {
            this.goalSelector.addGoal(3, new EntityAIBlockInfest(this, 1));
        }
        for (int i = 0; i < this.mobID.length; ++i) {
            this.mobID[i] = -777;
        }
        this.setBODY(1.0f);
        this.summonV = new EntityAIVenkrolSummon(this, SRPConfigMobs.venkrollimit, 20 * SRPConfigMobs.venkrolCooldown, 1, SRPConfigMobs.venkrolCAMinimumV, SRPConfigMobs.venkrolCAExtraM);
        this.goalSelector.addGoal(2, this.summonV);
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

    @Override
    protected void registerGoals() {
        this.targetSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal(this));
        this.goalSelector.addGoal(4, new EntityAINexusGrow(this, 1));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, SRPAttributes.VENKROL_HEALTH)
            .add(Attributes.ARMOR, SRPAttributes.VENKROL_ARMOR)
            .add(Attributes.MOVEMENT_SPEED, 0.0)
            .add(Attributes.ATTACK_DAMAGE, SRPAttributes.VENKROL_ATTACK_DAMAGE)
            .add(Attributes.KNOCKBACK_RESISTANCE, 1.0)
            .add(Attributes.FOLLOW_RANGE, SRPConfig.nexussiFollow);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide && this.topParticles > 0 && this.tickCount % 10 == 0) {
            // spawn particles (stubbed)
        }
        if (this.getParasiteStatus() == 0) {
            this.setBODY(0.04f);
        } else {
            this.setBODY(-0.04f);
        }
    }

    public void setBODY(float in) {
        in += this.body;
        if (in > 0.6f) in = 0.6f;
        if (in < 0.0f) in = 0.0f;
        this.body = in;
    }

    public float getBODY() {
        return this.body;
    }

    public int getHitStatus() {
        return 0;
    }

    @Override
    public boolean getCanSpawnHere() {
        return true;
    }

    public float getBombDamage() {
        return (float) SRPAttributes.VENKROL_ATTACK_DAMAGE;
    }
}