package com.dhanantry.scapeandrunparasites.entity.monster.inborn;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class EntityRathol extends EntityParasiteBase {
    public EntityRathol(EntityType<? extends EntityRathol> type, Level level) {
        super(type, level);
        this.xpReward = (int) com.dhanantry.scapeandrunparasites.util.SRPAttributes.XP_PRIMITIVE;
        this.type = (byte) 41;
    }
    @Override public int getParasiteIDRegister() { return 3; }
    @Override protected void registerGoals() {
        this.targetSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal(this));
    }
    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, SRPAttributes.RATHOL_HEALTH)
            .add(Attributes.ARMOR, SRPAttributes.RATHOL_ARMOR)
            .add(Attributes.MOVEMENT_SPEED, 0.25)
            .add(Attributes.KNOCKBACK_RESISTANCE, SRPAttributes.RATHOL_KD_RESISTANCE);
    }
    @Override protected net.minecraft.sounds.SoundEvent getAmbientSound() { return SRPSounds.CARRIER_GROWL.get(); }
    @Override protected net.minecraft.sounds.SoundEvent getHurtSound(net.minecraft.world.damagesource.DamageSource d) { return SRPSounds.CARRIER_HURT.get(); }
    @Override protected net.minecraft.sounds.SoundEvent getDeathSound() { return SRPSounds.CARRIER_DEATH.get(); }
    public float getEyeHeight(net.minecraft.world.entity.Pose p) { return 0.8f; }
}