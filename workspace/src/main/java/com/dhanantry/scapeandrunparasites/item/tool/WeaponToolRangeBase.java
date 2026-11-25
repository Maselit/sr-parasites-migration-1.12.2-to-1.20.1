package com.dhanantry.scapeandrunparasites.item.tool;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class WeaponToolRangeBase extends Item {
    protected int bonus;
    protected int damageCap;
    protected int damage;
    protected boolean calling;
    protected int idTool;

    public WeaponToolRangeBase(String name, int durability, int bonus, int damageC, int damage, boolean fear, int id) {
        super(new Properties().durability(durability).stacksTo(1));
        this.bonus = bonus;
        this.damageCap = damageC;
        this.damage = damage;
        this.calling = fear;
        this.idTool = id;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 72000;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(stack);
    }
}