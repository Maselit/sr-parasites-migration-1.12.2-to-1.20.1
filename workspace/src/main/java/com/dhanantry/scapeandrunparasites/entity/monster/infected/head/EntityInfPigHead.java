package com.dhanantry.scapeandrunparasites.entity.monster.infected.head;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class EntityInfPigHead extends EntityParasiteBase {
    public EntityInfPigHead(EntityType<? extends EntityInfPigHead> type, Level level) { super(type, level); }
    @Override public int getParasiteIDRegister() { return 31; }
    @Override protected void registerGoals() { this.targetSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal(this)); }
    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, SRPAttributes.INFPIG_HEADHEALTH)
            .add(Attributes.ATTACK_DAMAGE, SRPAttributes.INFPIG_HEADDAMAGE);
    }
    @Override protected net.minecraft.sounds.SoundEvent getAmbientSound() { return SRPSounds.MOBSILENCE.get(); }
    @Override protected net.minecraft.sounds.SoundEvent getHurtSound(net.minecraft.world.damagesource.DamageSource d) { return SRPSounds.INFECTEDHEAD_HURT.get(); }
    @Override protected net.minecraft.sounds.SoundEvent getDeathSound() { return SRPSounds.INFECTEDHEAD_DEATH.get(); }
    public float getEyeHeight(net.minecraft.world.entity.Pose p) { return 0.5f; }
}
