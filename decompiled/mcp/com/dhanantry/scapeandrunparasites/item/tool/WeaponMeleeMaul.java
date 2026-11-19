/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.client.util.ITooltipFlag
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.EnumCreatureAttribute
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.MobEffects
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.item.EnumRarity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.stats.StatList
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraftforge.common.ForgeHooks
 *  net.minecraftforge.event.ForgeEventFactory
 *  net.minecraftforge.event.entity.player.CriticalHitEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.item.tool;

import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.item.tool.WeaponToolMeleeBase;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import java.util.List;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.player.CriticalHitEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WeaponMeleeMaul
extends WeaponToolMeleeBase {
    public WeaponMeleeMaul(Item.ToolMaterial material, String name, double attackspeed, float range, float attackD, boolean fear, byte id) {
        super(material, name, attackspeed, range, attackD, fear, id);
    }

    @Override
    public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        super.onCreated(stack, worldIn, playerIn);
    }

    @Override
    public Item getNext() {
        if (this == SRPItems.weapon_maul) {
            return SRPItems.weapon_maulSentient;
        }
        return null;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        boolean flag = super.hitEntity(stack, target, attacker);
        if (flag && attacker instanceof EntityPlayer && target.getHealth() <= 0.0f) {
            target.hurtTime = 0;
            int aoe = 6;
            int times = 2;
            EntityPlayer player = (EntityPlayer)attacker;
            if (this.calling) {
                aoe = 13;
                times = 5;
            }
            AxisAlignedBB axisalignedbb = new AxisAlignedBB(target.posX, target.posY, target.posZ, target.posX + 1.0, target.posY + 1.0, target.posZ + 1.0).grow((double)aoe);
            List moblist = target.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
            NBTTagCompound compound = stack.getTagCompound();
            if (compound == null) {
                compound = new NBTTagCompound();
            }
            for (EntityLivingBase mob : moblist) {
                if (mob == target || mob == player) continue;
                for (int i = 0; i <= times; ++i) {
                    this.hitTarget(stack, mob, player);
                    if (!(mob.getHealth() <= 0.0f)) continue;
                    if (compound.hasKey("srpkills")) {
                        int key = (int)((float)compound.getInteger("srpkills") + target.getMaxHealth());
                        compound.setInteger("srpkills", key);
                        continue;
                    }
                    compound.setInteger("srpkills", (int)target.getMaxHealth());
                }
            }
        }
        return flag;
    }

    private void hitTarget(ItemStack stack, EntityLivingBase targetEntity, EntityPlayer attacker) {
        if (!ForgeHooks.onPlayerAttackTarget((EntityPlayer)attacker, (Entity)targetEntity)) {
            return;
        }
        if (targetEntity.canBeAttackedWithItem() && !targetEntity.hitByEntity((Entity)attacker)) {
            float f = (float)attacker.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue();
            float f1 = EnchantmentHelper.getModifierForCreature((ItemStack)attacker.getHeldItemMainhand(), (EnumCreatureAttribute)targetEntity.getCreatureAttribute());
            float f2 = attacker.getCooledAttackStrength(0.5f);
            f1 *= f2;
            attacker.resetCooldown();
            if ((f *= 0.2f + f2 * f2 * 0.8f) > 0.0f || f1 > 0.0f) {
                ItemStack itemstack;
                boolean flag = f2 > 0.9f;
                boolean flag1 = false;
                int i = 0;
                i += EnchantmentHelper.getKnockbackModifier((EntityLivingBase)attacker);
                if (attacker.isSprinting() && flag) {
                    attacker.world.playSound((EntityPlayer)null, attacker.posX, attacker.posY, attacker.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_KNOCKBACK, attacker.getSoundCategory(), 1.0f, 1.0f);
                    ++i;
                    flag1 = true;
                }
                boolean flag2 = flag && attacker.fallDistance > 0.0f && !attacker.onGround && !attacker.isOnLadder() && !attacker.isInWater() && !attacker.isPotionActive(MobEffects.BLINDNESS) && !attacker.isRiding() && targetEntity instanceof EntityLivingBase;
                flag2 = flag2 && !attacker.isSprinting();
                CriticalHitEvent hitResult = ForgeHooks.getCriticalHit((EntityPlayer)attacker, (Entity)targetEntity, (boolean)flag2, (float)(flag2 ? 1.5f : 1.0f));
                boolean bl = flag2 = hitResult != null;
                if (flag2) {
                    f *= hitResult.getDamageModifier();
                }
                f += f1;
                boolean flag3 = false;
                double d0 = attacker.distanceWalkedModified - attacker.prevDistanceWalkedModified;
                if (flag && !flag2 && !flag1 && attacker.onGround && d0 < (double)attacker.getAIMoveSpeed() && (itemstack = attacker.getHeldItem(EnumHand.MAIN_HAND)).getItem() instanceof ItemSword) {
                    flag3 = true;
                }
                float f4 = 0.0f;
                boolean flag4 = false;
                int j = EnchantmentHelper.getFireAspectModifier((EntityLivingBase)attacker);
                f4 = targetEntity.getHealth();
                if (j > 0 && !targetEntity.isBurning()) {
                    flag4 = true;
                    targetEntity.setFire(1);
                }
                targetEntity.setHealth(targetEntity.getHealth() - f);
                targetEntity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)attacker), 0.0f);
                boolean flag5 = true;
                if (flag5) {
                    if (flag3) {
                        attacker.world.playSound((EntityPlayer)null, attacker.posX, attacker.posY, attacker.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, attacker.getSoundCategory(), 1.0f, 1.0f);
                        attacker.spawnSweepParticles();
                    }
                    if (flag2) {
                        attacker.world.playSound((EntityPlayer)null, attacker.posX, attacker.posY, attacker.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_CRIT, attacker.getSoundCategory(), 1.0f, 1.0f);
                        attacker.onCriticalHit((Entity)targetEntity);
                    }
                    if (!flag2 && !flag3) {
                        if (flag) {
                            attacker.world.playSound((EntityPlayer)null, attacker.posX, attacker.posY, attacker.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_STRONG, attacker.getSoundCategory(), 1.0f, 1.0f);
                        } else {
                            attacker.world.playSound((EntityPlayer)null, attacker.posX, attacker.posY, attacker.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_WEAK, attacker.getSoundCategory(), 1.0f, 1.0f);
                        }
                    }
                    if (f1 > 0.0f) {
                        attacker.onEnchantmentCritical((Entity)targetEntity);
                    }
                    attacker.setLastAttackedEntity((Entity)targetEntity);
                    EnchantmentHelper.applyThornEnchantments((EntityLivingBase)targetEntity, (Entity)attacker);
                    EnchantmentHelper.applyArthropodEnchantments((EntityLivingBase)attacker, (Entity)targetEntity);
                    ItemStack itemstack1 = attacker.getHeldItemMainhand();
                    EntityLivingBase entity = targetEntity;
                    if (!itemstack1.isEmpty()) {
                        ItemStack beforeHitCopy = itemstack1.copy();
                        stack.damageItem(1, (EntityLivingBase)attacker);
                        if (itemstack1.isEmpty()) {
                            ForgeEventFactory.onPlayerDestroyItem((EntityPlayer)attacker, (ItemStack)beforeHitCopy, (EnumHand)EnumHand.MAIN_HAND);
                            attacker.setHeldItem(EnumHand.MAIN_HAND, ItemStack.EMPTY);
                        }
                    }
                    float f5 = f4 - targetEntity.getHealth();
                    attacker.addStat(StatList.DAMAGE_DEALT, Math.round(f5 * 10.0f));
                    if (j > 0) {
                        targetEntity.setFire(j * 4);
                    }
                    if (attacker.world instanceof WorldServer && f5 > 2.0f) {
                        int k = (int)((double)f5 * 0.5);
                        ((WorldServer)attacker.world).spawnParticle(EnumParticleTypes.DAMAGE_INDICATOR, targetEntity.posX, targetEntity.posY + (double)(targetEntity.height * 0.5f), targetEntity.posZ, k, 0.1, 0.0, 0.1, 0.2, new int[0]);
                    }
                    attacker.addExhaustion(0.1f);
                } else {
                    attacker.world.playSound((EntityPlayer)null, attacker.posX, attacker.posY, attacker.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_NODAMAGE, attacker.getSoundCategory(), 1.0f, 1.0f);
                    if (flag4) {
                        targetEntity.extinguish();
                    }
                }
            }
        }
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return super.getRarity(stack);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(TextFormatting.YELLOW + I18n.format((String)("tootip.srparasites.weaponm." + this.idTool), (Object[])new Object[0]));
        tooltip.add(TextFormatting.RED + I18n.format((String)("tootip.srparasites.weaponm." + this.idTool * 10), (Object[])new Object[0]));
        if (this.calling && SRPConfigSystems.useScent) {
            tooltip.add(TextFormatting.BLACK + I18n.format((String)("tootip.srparasites.weaponm." + this.idTool * 100), (Object[])new Object[0]));
        }
    }
}

