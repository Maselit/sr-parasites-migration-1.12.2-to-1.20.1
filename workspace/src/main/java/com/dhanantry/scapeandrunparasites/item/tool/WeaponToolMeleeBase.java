package com.dhanantry.scapeandrunparasites.item.tool;

import net.minecraft.world.item.Item;

public class WeaponToolMeleeBase extends Item implements IHaveReach {
    public WeaponToolMeleeBase(net.minecraft.world.item.Tier material, String name, double attackspeed, float range, float attackD, boolean fear, int id) {
        super(new Properties());
    }

    @Override
    public float getReach() { return 0f; }

    public Item getNext() { return null; }
}