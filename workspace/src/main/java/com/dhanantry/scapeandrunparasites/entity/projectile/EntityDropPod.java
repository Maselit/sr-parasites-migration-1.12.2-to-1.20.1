package com.dhanantry.scapeandrunparasites.entity.projectile;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

/**
 * STUB migrado (Fase C en curso): clase esqueleto para compilar.
 * La logica real (IA, NBT, atributos, sync) se migrara en lotes posteriores.
 */
public class EntityDropPod extends net.minecraft.world.entity.projectile.ThrowableProjectile {
    public byte getParasiteStatus() { return 0; }

    public EntityDropPod(net.minecraft.world.entity.EntityType<? extends EntityDropPod> type, net.minecraft.world.level.Level level) {
        super(type, level);
    }

    @Override
    protected void defineSynchedData() { }

}


