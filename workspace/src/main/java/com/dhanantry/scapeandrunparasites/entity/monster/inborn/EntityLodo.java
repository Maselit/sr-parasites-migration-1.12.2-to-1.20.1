package com.dhanantry.scapeandrunparasites.entity.monster.inborn;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class EntityLodo extends EntityParasiteBase {
    private int totalGrowtime = 10;
    private int actualGrowtime = 0;
    protected double buried = -1.0;

    public EntityLodo(EntityType<? extends EntityLodo> type, Level level) {
        super(type, level);
        this.xpReward = (int) SRPAttributes.XP_LiTTLE;
        this.totalGrowtime = this.getRandom().nextInt(60) + 60;
        this.killcount = -10.0;
        this.type = (byte) 1;
        this.buried = -1.0;
    }

    @Override
    public int getParasiteIDRegister() {
        return 5;
    }

    @Override
    protected void registerGoals() {
        this.targetSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal(this));
        // EntityAISwimming, EntityAIAvoidEntity (stubs) - TODO
    }

    @Override
    public void tick() {
        super.tick();
        this.growTimer();
        this.growStage();
        this.buried();
    }

    public boolean buried() {
        if (this.buried >= 0.0) {
            this.getNavigation().stop();
            this.setPos(this.xOld, this.getY(), this.zOld);
            int id = 0;
            this.buried -= 0.02;
            return true;
        }
        if (this.getParasiteStatus() == 3) {
            this.setParasiteStatus(0);
        }
        return false;
    }

    @Override
    public boolean doHurtTarget(net.minecraft.world.entity.Entity target) {
        if (target instanceof net.minecraft.world.entity.LivingEntity) {
            com.dhanantry.scapeandrunparasites.init.SRPPotions.applyStackPotion(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get(), (net.minecraft.world.entity.LivingEntity) target, 100, 0);
        }
        return super.doHurtTarget(target);
    }

    protected void growStage() {
        if (!this.level().isClientSide && (this.actualGrowtime > this.totalGrowtime && ParasiteEventEntity.canSpawnNext || this.killcount > 1000.0)) {
            this.playSound(com.dhanantry.scapeandrunparasites.init.SRPSounds.LODO_MUDO.get(), 1.0f, 1.0f);
            // spawnNext (TODO: migrar EntityMudo + ParasiteEventEntity.spawnNext)
        }
    }

    protected void growTimer() {
        if (!this.level().isClientSide && this.tickCount % 20 == 0) {
            ++this.actualGrowtime;
        }
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, SRPAttributes.LODO_HEALTH)
                .add(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR, SRPAttributes.LODO_ARMOR)
                .add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.2)
                .add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, SRPAttributes.LODO_ATTACK_DAMAGE)
                .add(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE, SRPAttributes.LODO_KD_RESISTANCE);
    }

    @Override
    public void addAdditionalSaveData(net.minecraft.nbt.CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("ruptergrow", this.actualGrowtime);
    }

    @Override
    public void readAdditionalSaveData(net.minecraft.nbt.CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        if (tag.contains("ruptergrow")) {
            this.actualGrowtime = tag.getInt("ruptergrow");
        }
    }

    public void setFloorTimer() { this.buried = 1.0; }
    public double getFloorTimer() { return this.buried; }

    @Override
    protected net.minecraft.sounds.SoundEvent getAmbientSound() {
        return com.dhanantry.scapeandrunparasites.init.SRPSounds.LODO_GROWL.get();
    }

    @Override
    protected net.minecraft.sounds.SoundEvent getHurtSound(net.minecraft.world.damagesource.DamageSource damageSourceIn) {
        return com.dhanantry.scapeandrunparasites.init.SRPSounds.LODO_HURT.get();
    }

    @Override
    protected net.minecraft.sounds.SoundEvent getDeathSound() {
        return com.dhanantry.scapeandrunparasites.init.SRPSounds.LODO_DEATH.get();
    }

    public float getEyeHeight(net.minecraft.world.entity.Pose pose) { return 0.3f; }
}