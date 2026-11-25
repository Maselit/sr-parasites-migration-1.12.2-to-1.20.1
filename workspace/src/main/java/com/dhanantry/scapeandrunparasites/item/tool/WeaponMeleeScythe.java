package com.dhanantry.scapeandrunparasites.item.tool;

import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.AABB;

public class WeaponMeleeScythe extends WeaponToolMeleeBase {
    public WeaponMeleeScythe(net.minecraft.world.item.Tier material, String name, double attackspeed, float range, float attackD, boolean fear, int id) {
        super(material, name, attackspeed, range, attackD, fear, id);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean flag = super.hurtEnemy(stack, target, attacker);
        if (flag && attacker instanceof net.minecraft.world.entity.player.Player) {
            net.minecraft.world.entity.player.Player player = (net.minecraft.world.entity.player.Player) attacker;
            int aoe = 4;
            if (this.calling) aoe = 8;
            net.minecraft.world.level.Level level = attacker.level();
            AABB box = new AABB(target.getX(), target.getY(), target.getZ(), target.getX() + 1.0, target.getY() + 1.0, target.getZ() + 1.0).inflate(aoe);
            java.util.List<LivingEntity> moblist = level.getEntitiesOfClass(LivingEntity.class, box);
            net.minecraft.nbt.CompoundTag compound = stack.getOrCreateTag();
            for (LivingEntity mob : moblist) {
                if (mob == target || mob == player) continue;
                if (mob.isAlive()) {
                    mob.hurt(level.damageSources().playerAttack(player), this.attackDamage);
                }
                if (mob.getHealth() <= 0.0f) {
                    if (compound.contains("srpkills")) {
                        compound.putInt("srpkills", (int) ((float) compound.getInt("srpkills") + target.getMaxHealth()));
                    } else {
                        compound.putInt("srpkills", (int) target.getMaxHealth());
                    }
                }
            }
            stack.setTag(compound);
        }
        return flag;
    }

    @Override
    public net.minecraft.world.item.Item getNext() {
        if (this == com.dhanantry.scapeandrunparasites.init.SRPItems.weapon_scythe.get()) {
            return com.dhanantry.scapeandrunparasites.init.SRPItems.weapon_scytheSentient.get();
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