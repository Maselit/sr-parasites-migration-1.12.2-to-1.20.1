package com.dhanantry.scapeandrunparasites.item.tool;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public class WeaponToolArmorBase extends ArmorItem {
    protected boolean calling;
    protected int idTool;

    public WeaponToolArmorBase(ArmorMaterial material, String name, int renderI, boolean fear, int id, EquipmentSlot eq) {
        super(material, slotToType(eq), new Properties().durability(material.getDurabilityForType(slotToType(eq))));
        this.calling = fear;
        this.idTool = id;
    }

    private static ArmorItem.Type slotToType(EquipmentSlot slot) {
        switch (slot) {
            case HEAD: return ArmorItem.Type.HELMET;
            case CHEST: return ArmorItem.Type.CHESTPLATE;
            case LEGS: return ArmorItem.Type.LEGGINGS;
            default: return ArmorItem.Type.BOOTS;
        }
    }
}