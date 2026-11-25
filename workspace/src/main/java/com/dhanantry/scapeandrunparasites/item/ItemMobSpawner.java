package com.dhanantry.scapeandrunparasites.item;

/**
 * Migracion (stub compilable) de ItemMobSpawner a 1.20.1.
 * La logica real (spawn de mobs por nombre) se migrara en lotes posteriores.
 * Extiende ItemBase para conservar tooltip/stack size.
 */
public class ItemMobSpawner extends ItemBase {
    private String name;

    public ItemMobSpawner(String name) {
        super("itemmobspawner_" + name, 64, 0);
        this.name = name;
    }
}