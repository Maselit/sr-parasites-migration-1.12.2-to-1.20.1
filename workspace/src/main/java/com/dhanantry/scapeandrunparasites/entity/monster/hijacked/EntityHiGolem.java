package com.dhanantry.scapeandrunparasites.entity.monster.hijacked;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class EntityHiGolem extends EntityParasiteBase {
    public EntityHiGolem(EntityType<? extends EntityHiGolem> type, Level level) { super(type, level); this.type = (byte) 3; }
    @Override public int getParasiteIDRegister() { return 301; }
    @Override protected void registerGoals() { this.targetSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal(this)); }
    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, SRPAttributes.HIGOLEM_HEALTH)
            .add(Attributes.ARMOR, SRPAttributes.HIGOLEM_ARMOR)
            .add(Attributes.MOVEMENT_SPEED, 0.25)
            .add(Attributes.ATTACK_DAMAGE, SRPAttributes.HIGOLEM_ATTACK_DAMAGE)
            .add(Attributes.KNOCKBACK_RESISTANCE, SRPAttributes.HIGOLEM_KD_RESISTANCE);
    }
    @Override protected net.minecraft.sounds.SoundEvent getAmbientSound() { return SRPSounds.HIGOLEM_GROWL.get(); }
    @Override protected net.minecraft.sounds.SoundEvent getHurtSound(net.minecraft.world.damagesource.DamageSource d) { return SRPSounds.HIGOLEM_HURT.get(); }
    @Override protected net.minecraft.sounds.SoundEvent getDeathSound() { return SRPSounds.HIGOLEM_DEATH.get(); }
    public float getEyeHeight(net.minecraft.world.entity.Pose p) { return 1.5f; }
}