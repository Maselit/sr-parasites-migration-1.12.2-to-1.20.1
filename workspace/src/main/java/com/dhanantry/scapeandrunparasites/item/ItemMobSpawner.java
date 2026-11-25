package com.dhanantry.scapeandrunparasites.item;

import net.minecraft.world.item.Item;

/**
 * Migracion (stub compilable) de ItemMobSpawner a 1.20.1.
 * La logica real (spawn de mobs) se migrara en lotes posteriores.
 */
public class ItemMobSpawner extends Item {
    public ItemMobSpawner(String name) {
        super(new Properties().stacksTo(16));
    }
}