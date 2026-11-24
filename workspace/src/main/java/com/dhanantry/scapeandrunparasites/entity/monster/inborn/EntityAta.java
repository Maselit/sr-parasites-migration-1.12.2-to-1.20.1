package com.dhanantry.scapeandrunparasites.entity.monster.inborn;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAINearestAttackableTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISkill;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISwimmingDiving;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

/**
 * Migracion de EntityAta (gnat) a 1.20.1, extendiendo EntityParasiteBase.
 */
public class EntityAta extends EntityParasiteBase {
    private static final EntityDataAccessor<Byte> CLIMBING = SynchedEntityData.defineId(EntityAta.class, EntityDataSerializers.BYTE);
    private int lifespan = 0;

    public EntityAta(EntityType<? extends EntityAta> type, Level level) {
        super(type, level);
        this.type = (byte) 5;
        this.lifespan = 0;
        // remove follow task (stub no-op; goalSelector handles removal by instance)
    }

    @Override
    public int getParasiteIDRegister() {
        return 91;
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new net.minecraft.world.entity.ai.goal.LookAtPlayerGoal(this, net.minecraft.world.entity.player.Player.class, 8.0f));
        this.targetSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal(this));
        // TODO: migrar EntityAISkill, EntityAISwimmingDiving, EntityAIAttackMeleeStatus, EntityAILeapAtTarget (AI package)
    }

    // setters for skill leap (stub inherited from base? base has fields but no setters; add minimal)
    public void setSkillLeapValues(float a, double b, int c) {
        this.leapMotionY = a;
        this.jumpSpeed = b;
        this.jumpR = c;
    }

    @Override
    public void tick() {
        super.tick();
        ++this.lifespan;
        if (this.lifespan > 1200) {
            this.discard();
        }
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, SRPAttributes.ATA_HEALTH)
                .add(Attributes.ARMOR, SRPAttributes.ATA_ARMOR)
                .add(Attributes.MOVEMENT_SPEED, 0.34559)
                .add(Attributes.ATTACK_DAMAGE, SRPAttributes.ATA_ATTACK_DAMAGE)
                .add(Attributes.KNOCKBACK_RESISTANCE, SRPAttributes.ATA_KD_RESISTANCE)
                .add(Attributes.FOLLOW_RANGE, 32.0);
    }

    @Override
    public boolean doHurtTarget(net.minecraft.world.entity.Entity target) {
        return false;
    }

    public boolean isOnLadder() {
        return this.isBesideClimbableBlock();
    }

    public boolean isBesideClimbableBlock() {
        return (this.entityData.get(CLIMBING) & 1) != 0;
    }

    public void setBesideClimbableBlock(boolean climbing) {
        byte b0 = this.entityData.get(CLIMBING);
        net.minecraft.world.entity.LivingEntity tgt = this.getTarget();
        if (tgt != null) {
            if (!this.hasLineOfSight(tgt)) {
                if (this.distanceTo(tgt) < 100.0) {
                    b0 = (byte) (b0 & 0xFFFFFFFE);
                    this.entityData.set(CLIMBING, b0);
                    return;
                }
            } else if (tgt.getY() + 1.0 < this.getY()) {
                b0 = (byte) (b0 & 0xFFFFFFFE);
                this.entityData.set(CLIMBING, b0);
                return;
            }
        }
        b0 = climbing ? (byte) (b0 | 1) : (byte) (b0 & 0xFFFFFFFE);
        this.entityData.set(CLIMBING, b0);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(CLIMBING, (byte) 0);
    }

    public float getEyeHeight(net.minecraft.world.entity.Pose pose) {
        return 0.8f;
    }

    @Override
    protected net.minecraft.sounds.SoundEvent getAmbientSound() {
        if (this.getParasiteStatus() != 0) {
            return com.dhanantry.scapeandrunparasites.init.SRPSounds.MOBSILENCE.get();
        }
        return com.dhanantry.scapeandrunparasites.init.SRPSounds.MOBSILENCE.get();
    }

    @Override
    protected net.minecraft.sounds.SoundEvent getHurtSound(net.minecraft.world.damagesource.DamageSource damageSourceIn) {
        return com.dhanantry.scapeandrunparasites.init.SRPSounds.MOBSILENCE.get();
    }

    @Override
    protected net.minecraft.sounds.SoundEvent getDeathSound() {
        return com.dhanantry.scapeandrunparasites.init.SRPSounds.MOBSILENCE.get();
    }
}