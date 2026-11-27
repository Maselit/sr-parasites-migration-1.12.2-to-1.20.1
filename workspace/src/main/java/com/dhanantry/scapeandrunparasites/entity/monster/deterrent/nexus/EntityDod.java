package com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIDodAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAINexusGrow;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPDispatcher;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class EntityDod extends EntityPDispatcher {
    public int totalP;
    public int[] mobID;
    public int[] mobPT;
    public byte stage;
    public int pointCap;
    public double pointReduction;
    public double chanceLearn;
    public double chanceLearnFire;
    public int DamageTypeCap;
    public double buried = 0.1;

    public EntityDod(EntityType<? extends EntityDod> type, Level level) {
        super(type, level);
        this.xpReward = (int)(SRPAttributes.XP_INFECTED * 2);
        this.buried = 0.1;
        this.setParasiteStatus(3);
        this.damageCap = SRPConfig.nexussiCap;
        this.pointCap = SRPConfig.nexussiPointCap;
        this.pointReduction = SRPConfig.nexussiPointRed;
        this.chanceLearn = SRPConfig.nexussiChanceLe;
        this.chanceLearnFire = SRPConfig.nexussiChanceLeFire;
        this.DamageTypeCap = SRPConfig.nexussiPointDamCap;
        this.totalP = SRPConfigMobs.dodsiTotalActiveMobs;
        this.mobID = new int[3];
        this.mobPT = new int[3];
        this.stage = 1;
        this.xpReward = (int)(SRPAttributes.XP_INFECTED * 2);
        for (int i = 0; i < this.mobID.length; ++i) {
            this.mobID[i] = -777;
        }
        this.neededTime = this.setGT(SRPConfig.nexusMinGrowTime, SRPConfig.nexusMaxGrowTime);
        this.valueEvDeath = SRPConfig.nexussiLoosingEPValue;
    }

    @Override
    public int getParasiteIDRegister() {
        return 73;
    }

    @Override
    protected void registerGoals() {
        this.targetSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal(this));
        this.goalSelector.addGoal(4, new EntityAINexusGrow(this, 1, (byte) 2));
        this.goalSelector.addGoal(2, new EntityAIDodAttack(this, 1, (byte) 16, 10.0f));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, SRPAttributes.DOD_HEALTH)
            .add(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR, SRPAttributes.DOD_ARMOR)
            .add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.0)
            .add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, SRPAttributes.DOD_ATTACK_DAMAGE)
            .add(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE, 1.0)
            .add(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE, SRPConfig.nexussiFollow * SRPConfigMobs.dodsiFollowRangeMult);
    }

    @Override
    public boolean storeParasite(EntityParasiteBase in) {
        if (super.storeParasite(in)) {
            return true;
        }
        if (this.storeLodo(in, true)) {
            return true;
        }
        if (this.storeInf(in, false)) {
            return true;
        }
        if (this.storeCrude(in, false)) {
            return true;
        }
        if (this.storeMudo(in, false)) {
            return true;
        }
        if (this.storeMangler(in, false)) {
            return true;
        }
        this.storeAll(in);
        return false;
    }
}