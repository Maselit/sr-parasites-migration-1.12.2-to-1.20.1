package com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

/**
 * Migracion de EntityDod a 1.20.1 (extiende EntityParasiteBase).
 * STUB parcial: estructura + atributos. La logica real (storeParasite, initEntityAI) pendiente.
 */
public class EntityDod extends EntityParasiteBase {
    public int pointCap;
    public float pointReduction;
    public float chanceLearn;
    public float chanceLearnFire;
    public int DamageTypeCap;
    public int totalP;
    public int[] mobID;
    public int[] mobPT;
    public int stage;
    public int neededTime;
    public int valueEvDeath;
    public double buried;
    public int attackCooldown;

    public EntityDod(EntityType<? extends EntityDod> type, Level level) {
        super(type, level);
        this.xpReward = (int) (SRPAttributes.XP_INFECTED * 2);
        this.buried = 0.1;
        this.setParasiteStatus(3);
        this.damageCap = SRPConfig.nexussiCap;
        this.pointCap = SRPConfig.nexussiPointCap;
        this.pointReduction = SRPConfig.nexussiPointRed;
        this.chanceLearn = (float) SRPConfig.nexussiChanceLe;
        this.chanceLearnFire = (float) SRPConfig.nexussiChanceLeFire;
        this.DamageTypeCap = SRPConfig.nexussiPointDamCap;
        this.totalP = SRPConfigMobs.dodsiTotalActiveMobs;
        this.mobID = new int[3];
        this.mobPT = new int[3];
        this.stage = 1;
        for (int i = 0; i < this.mobID.length; ++i) {
            this.mobID[i] = -777;
        }
        this.neededTime = 100;
        this.valueEvDeath = SRPConfig.nexussiLoosingEPValue;
        this.type = (byte) 11;
    }

    @Override
    public int getParasiteIDRegister() {
        return 73;
    }

    @Override
    protected void registerGoals() {
        this.targetSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal(this));
        // EntityAINexusGrow, EntityAIDodAttack (stubs) - TODO
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, SRPAttributes.DOD_HEALTH)
            .add(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR, SRPAttributes.DOD_ARMOR)
            .add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.0)
            .add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, SRPAttributes.DOD_ATTACK_DAMAGE)
            .add(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE, 1.0)
            .add(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE, SRPConfig.nexussiFollow * (double) SRPConfigMobs.dodsiFollowRangeMult);
    }

    public float getBombDamage() {
        return (float) SRPAttributes.DOD_ATTACK_DAMAGE;
    }

    public float getEyeHeight(net.minecraft.world.entity.Pose p) { return 2.3f; }

    @Override
    protected net.minecraft.sounds.SoundEvent getAmbientSound() { return SRPSounds.MOBSILENCE.get(); }
    @Override
    protected net.minecraft.sounds.SoundEvent getHurtSound(net.minecraft.world.damagesource.DamageSource d) { return SRPSounds.MOBSILENCE.get(); }
    @Override
    protected net.minecraft.sounds.SoundEvent getDeathSound() { return SRPSounds.MOBSILENCE.get(); }
}