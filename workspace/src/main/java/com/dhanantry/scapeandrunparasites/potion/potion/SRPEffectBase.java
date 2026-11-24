package com.dhanantry.scapeandrunparasites.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

/**
 * STUB migrado (Fase C): esqueleto de SRPEffectBase. La logica real (performEffect, etc.)
 * se migrara en lotes posteriores.
 */
public class SRPEffectBase extends MobEffect {
    public SRPEffectBase(String name, boolean isBadEffectIn, int liquidColorIn, int iconIndexX, int iconIndexY) {
        super(isBadEffectIn ? MobEffectCategory.HARMFUL : MobEffectCategory.BENEFICIAL, liquidColorIn);
    }
}
