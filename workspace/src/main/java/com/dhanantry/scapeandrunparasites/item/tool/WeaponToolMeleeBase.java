package com.dhanantry.scapeandrunparasites.item.tool;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.google.common.collect.Multimap;
import com.google.common.collect.HashMultimap;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.UUID;

/**
 * Migracion de WeaponToolMeleeBase a 1.20.1.
 */
public class WeaponToolMeleeBase extends Item implements IHaveReach {
    protected float addReach;
    protected float attackDamage;
    private byte effectHit;
    protected double attackSpeed;
    protected boolean calling;
    protected int idTool;
    protected final UUID ATTACK_RANGE_MODIFIER = UUID.randomUUID();

    public WeaponToolMeleeBase(net.minecraft.world.item.Tier material, String name, double attackspeed, float range, float attackD, boolean fear, int id) {
        super(new Properties());
        this.attackSpeed = attackspeed;
        this.addReach = range;
        this.attackDamage = attackD;
        this.calling = fear;
        this.idTool = id;
    }

    @Override
    public float getReach() {
        return this.addReach;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> multimap = HashMultimap.create();
        if (slot == EquipmentSlot.MAINHAND) {
            multimap.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(Item.BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", (double) this.attackDamage, AttributeModifier.Operation.ADDITION));
            multimap.put(Attributes.ATTACK_SPEED, new AttributeModifier(Item.BASE_ATTACK_SPEED_UUID, "Weapon modifier", this.attackSpeed, AttributeModifier.Operation.ADDITION));
        }
        return multimap;
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean flag = super.hurtEnemy(stack, target, attacker);
        if (flag && target.getHealth() <= 0.0f) {
            CompoundTag compound = stack.getOrCreateTag();
            if (compound.contains("srpkills")) {
                int key = (int) ((float) compound.getInt("srpkills") + target.getMaxHealth());
                compound.putInt("srpkills", key);
            } else {
                compound.putInt("srpkills", (int) target.getMaxHealth());
            }
            stack.setTag(compound);
        }
        return flag;
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        super.inventoryTick(stack, level, entity, slotId, isSelected);
        if (!level.isClientSide && entity instanceof LivingEntity) {
            LivingEntity living = (LivingEntity) entity;
            if (this.calling && SRPConfigSystems.useScent && level.random.nextInt(100) == 0 && entity.tickCount % 40 == 0) {
                living.addEffect(new net.minecraft.world.effect.MobEffectInstance(SRPPotions.PREY_E.get(), 1200, 0, false, false));
            }
            if (entity.tickCount % 80 == 0) {
                int key = 0;
                CompoundTag compound = stack.getTag();
                if (compound != null && this.getNext() != null) {
                    if (compound.contains("srpkills")) {
                        key = compound.getInt("srpkills");
                    }
                    if (key > SRPConfig.weapon_livingSentient_HP_needed) {
                        compound.putInt("srpkills", 0);
                        stack.shrink(1);
                        ItemStack stackW = new ItemStack(this.getNext(), 1);
                        ItemEntity entityitem = new ItemEntity(level, entity.getX(), entity.getY(), entity.getZ(), stackW);
                        level.addFreshEntity(entityitem);
                        if (SRPConfig.thunderEnable) {
                            // lightning
                        }
                    }
                }
            }
        }
    }

    public Item getNext() {
        return null;
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return super.getRarity(stack);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, java.util.List<net.minecraft.network.chat.Component> tooltip, net.minecraft.world.item.TooltipFlag flag) {
        CompoundTag compound = stack.getTag();
        if (compound != null) {
            tooltip.add(net.minecraft.network.chat.Component.literal("---> " + compound.getInt("srpkills")).withStyle(net.minecraft.ChatFormatting.BLUE));
        }
    }
}