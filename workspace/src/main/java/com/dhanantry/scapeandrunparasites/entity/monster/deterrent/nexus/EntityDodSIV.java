package com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class EntityDodSIV extends EntityParasiteBase {
    public EntityDodSIV(EntityType<? extends EntityDodSIV> type, Level level) { super(type, level); }
    @Override public int getParasiteIDRegister() { return 79; }
    @Override protected void registerGoals() { this.targetSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal(this)); }
    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, SRPAttributes.DOD_HEALTH)
            .add(Attributes.ARMOR, SRPAttributes.DOD_ARMOR)
            .add(Attributes.MOVEMENT_SPEED, 0.25)
            .add(Attributes.ATTACK_DAMAGE, SRPAttributes.DOD_ATTACK_DAMAGE);
    }
    @Override protected net.minecraft.sounds.SoundEvent getAmbientSound() { return SRPSounds.MOBSILENCE.get(); }
    @Override protected net.minecraft.sounds.SoundEvent getHurtSound(net.minecraft.world.damagesource.DamageSource d) { return SRPSounds.MOBSILENCE.get(); }
    @Override protected net.minecraft.sounds.SoundEvent getDeathSound() { return SRPSounds.MOBSILENCE.get(); }
    public float getEyeHeight(net.minecraft.world.entity.Pose p) { return 0.8f; }
}
