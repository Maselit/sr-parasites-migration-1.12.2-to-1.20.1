package com.dhanantry.scapeandrunparasites.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

/**
 * Migracion (stub compilable) de ItemNodeColonyCompass a 1.20.1.
 * La logica real (brujula, paquetes) se migrara en lotes posteriores.
 */
public class ItemNodeColonyCompass extends Item {
    private String name;
    private byte cType;
    public static net.minecraft.core.BlockPos orig;

    public ItemNodeColonyCompass(String name, int type) {
        super(new Properties().stacksTo(1));
        this.name = name;
        this.cType = (byte) type;
    }
}