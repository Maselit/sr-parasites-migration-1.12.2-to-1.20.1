package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

/**
 * STUB migrado (Fase C): esqueleto. La logica real se migrara en lotes.
 */
public abstract class EntityParasiteBase extends Monster {
    public EntityParasiteBase(Level level) {
        super(net.minecraft.world.entity.EntityType.ZOMBIE, level);
    }
}