package com.dhanantry.scapeandrunparasites.entity.monster.feral;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

/**
 * STUB migrado (Fase C): esqueleto para compilar.
 */
public class EntityFerPig extends net.minecraft.world.entity.monster.Monster {
    public EntityFerPig(net.minecraft.world.entity.EntityType<? extends EntityFerPig> type, net.minecraft.world.level.Level level) {
        super(type, level);
    }

    public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes();
    }

}
