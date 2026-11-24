package com.dhanantry.scapeandrunparasites.entity.monster.pure.preeminent;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

/**
 * STUB migrado (Fase C en curso): clase esqueleto para compilar.
 * La logica real (IA, NBT, atributos, sync) se migrara en lotes posteriores.
 */
public class EntityJinjo extends net.minecraft.world.entity.monster.Monster {
    public EntityJinjo(net.minecraft.world.entity.EntityType<? extends EntityJinjo> type, net.minecraft.world.level.Level level) {
        super(type, level);
    }

    public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes();
    }

}
