package com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

/**
 * STUB migrado (Fase C en curso): clase esqueleto para compilar.
 * La logica real (IA, NBT, atributos, sync) se migrara en lotes posteriores.
 */
public class EntityVenkrolSIII extends net.minecraft.world.entity.monster.Monster {
    public EntityVenkrolSIII(net.minecraft.world.entity.EntityType<? extends EntityVenkrolSIII> type, net.minecraft.world.level.Level level) {
        super(type, level);
    }

    public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes();
    }

}
