package com.dhanantry.scapeandrunparasites.item;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * Migracion de ItemBase a 1.20.1.
 */
public class ItemBase extends Item {
    protected byte version;

    public ItemBase(String name, int maxStack, int id) {
        super(new Properties().stacksTo(maxStack));
        this.version = (byte) id;
    }

    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, java.util.List<Component> tooltip, TooltipFlag flagIn) {
        tooltip.add(Component.translatable("tootip.srparasites.item." + this.version));
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (this == SRPItems.itemAssimilate.get()) {
            // ParasiteEventEntity.convertEntity(target, target.getPersistentData(), true, SRPConfigSystems.COTHVictimParasite);
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}