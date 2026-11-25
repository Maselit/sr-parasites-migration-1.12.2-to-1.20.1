package com.dhanantry.scapeandrunparasites.item.tool;

import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class WeaponMeleeCleaver extends WeaponToolMeleeBase {
    public WeaponMeleeCleaver(net.minecraft.world.item.Tier material, String name, double attackspeed, float range, float attackD, boolean fear, int id) {
        super(material, name, attackspeed, range, attackD, fear, id);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean flag = super.hurtEnemy(stack, target, attacker);
        if (flag) {
            double chance = 0.25;
            int amp = 0;
            if (this.calling) {
                chance = 0.5;
                amp = 1;
            }
            if (attacker.level().random.nextDouble() < chance) {
                SRPPotions.applyStackPotion(SRPPotions.VIRA_E.get(), target, 100, amp);
            }
        }
        return flag;
    }

    @Override
    public net.minecraft.world.item.Item getNext() {
        if (this == com.dhanantry.scapeandrunparasites.init.SRPItems.weapon_cleaver.get()) {
            return com.dhanantry.scapeandrunparasites.init.SRPItems.weapon_cleaverSentient.get();
        }
        return null;
    }

    @Override
    public void appendHoverText(ItemStack stack, net.minecraft.world.level.Level level, java.util.List<net.minecraft.network.chat.Component> tooltip, net.minecraft.world.item.TooltipFlag flagIn) {
        super.appendHoverText(stack, level, tooltip, flagIn);
        tooltip.add(net.minecraft.network.chat.Component.translatable("tootip.srparasites.weaponm." + this.idTool).withStyle(net.minecraft.ChatFormatting.YELLOW));
        tooltip.add(net.minecraft.network.chat.Component.translatable("tootip.srparasites.weaponm." + (this.idTool * 10)).withStyle(net.minecraft.ChatFormatting.RED));
        if (this.calling && SRPConfigSystems.useScent) {
            tooltip.add(net.minecraft.network.chat.Component.translatable("tootip.srparasites.weaponm." + (this.idTool * 100)).withStyle(net.minecraft.ChatFormatting.BLACK));
        }
    }
}