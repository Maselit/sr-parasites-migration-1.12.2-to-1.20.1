package com.dhanantry.scapeandrunparasites.potion;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.client.particle.ParticleSpawner;
import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.network.SRPPacketParticle;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

/**
 * Migracion de SRPEffectBase a 1.20.1 (MobEffect). Logica de performEffect migrada (adaptada).
 */
public class SRPEffectBase extends MobEffect {
    private net.minecraft.resources.ResourceLocation icon;

    public SRPEffectBase(String name, boolean isBadEffectIn, int liquidColorIn, int iconIndexX, int iconIndexY) {
        super(isBadEffectIn ? MobEffectCategory.HARMFUL : MobEffectCategory.BENEFICIAL, liquidColorIn);
        this.icon = new net.minecraft.resources.ResourceLocation("srparasites", "textures/gui/potion_" + name + ".png");
    }

    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        if (this == SRPPotions.BLEED_E.get() || this == SRPPotions.EPEL_E.get() || this == SRPPotions.DLER_E.get() || this == SRPPotions.CORRO_E.get() || this == SRPPotions.FOSTER_E.get()) {
            int j = 25 >> amplifier;
            if (j > 0) {
                return duration % j == 0;
            }
            return true;
        }
        return true;
    }

    @Override
    public void applyEffectTick(net.minecraft.world.entity.LivingEntity entity, int amplifier) {
        if (this == SRPPotions.BLEED_E.get()) {
            if (entity.level().isClientSide()) return;
            float damage = entity.getMaxHealth() * SRPConfigSystems.bleedingDamage;
            if (entity.getX() != entity.xOld || entity.getZ() != entity.zOld) {
                damage *= (float) (amplifier + 1);
            }
            damage = Math.min(damage, SRPConfigSystems.bleedingDamageCap);
            entity.hurt(entity.damageSources().magic(), damage);
        } else if (this == SRPPotions.CORRO_E.get()) {
            if (!entity.level().isClientSide()) {
                this.effectCORRO(entity, amplifier);
            }
        } else if (this == SRPPotions.COTH_E.get()) {
            if (!entity.level().isClientSide()) {
                this.effectCOTH(entity, amplifier);
            }
        } else if (this == SRPPotions.PREY_E.get()) {
            if (!entity.level().isClientSide()) {
                this.effectPrey(entity, amplifier);
            }
        } else if (this == SRPPotions.DLER_E.get()) {
            if (!entity.level().isClientSide()) {
                this.effectNeedler(entity, amplifier);
            }
        } else if (this == SRPPotions.FOSTER_E.get()) {
            if (!entity.level().isClientSide()) {
                this.effectFoster(entity, amplifier);
            }
        }
    }

    // stubs for complex helpers (depend on un-migrated classes)
    private void effectCORRO(net.minecraft.world.entity.LivingEntity entity, int amplifier) { /* TODO */ }
    private void effectCOTH(net.minecraft.world.entity.LivingEntity entity, int amplifier) { /* TODO */ }
    private void effectPrey(net.minecraft.world.entity.LivingEntity entity, int amplifier) { /* TODO */ }
    private void effectNeedler(net.minecraft.world.entity.LivingEntity entity, int amplifier) { /* TODO */ }
    private void effectFoster(net.minecraft.world.entity.LivingEntity entity, int amplifier) { /* TODO */ }
}