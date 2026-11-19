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
    public void func_77622_d(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        super.func_77622_d(stack, worldIn, playerIn);
    }

    @Override
    public Item getNext() {
        if (this == SRPItems.weapon_maul) {
            return SRPItems.weapon_maulSentient;
        }
        return null;
    }

    @Override
    public boolean func_77644_a(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        boolean flag = super.func_77644_a(stack, target, attacker);
        if (flag && attacker instanceof EntityPlayer && target.func_110143_aJ() <= 0.0f) {
            target.field_70737_aN = 0;
            int aoe = 6;
            int times = 2;
            EntityPlayer player = (EntityPlayer)attacker;
            if (this.calling) {
                aoe = 13;
                times = 5;
            }
            AxisAlignedBB axisalignedbb = new AxisAlignedBB(target.field_70165_t, target.field_70163_u, target.field_70161_v, target.field_70165_t + 1.0, target.field_70163_u + 1.0, target.field_70161_v + 1.0).func_186662_g((double)aoe);
            List moblist = target.field_70170_p.func_72872_a(EntityLivingBase.class, axisalignedbb);
            NBTTagCompound compound = stack.func_77978_p();
            if (compound == null) {
                compound = new NBTTagCompound();
            }
            for (EntityLivingBase mob : moblist) {
                if (mob == target || mob == player) continue;
                for (int i = 0; i <= times; ++i) {
                    this.hitTarget(stack, mob, player);
                    if (!(mob.func_110143_aJ() <= 0.0f)) continue;
                    if (compound.func_74764_b("srpkills")) {
                        int key = (int)((float)compound.func_74762_e("srpkills") + target.func_110138_aP());
                        compound.func_74768_a("srpkills", key);
                        continue;
                    }
                    compound.func_74768_a("srpkills", (int)target.func_110138_aP());
                }
            }
        }
        return flag;
    }

    private void hitTarget(ItemStack stack, EntityLivingBase targetEntity, EntityPlayer attacker) {
        if (!ForgeHooks.onPlayerAttackTarget((EntityPlayer)attacker, (Entity)targetEntity)) {
            return;
        }
        if (targetEntity.func_70075_an() && !targetEntity.func_85031_j((Entity)attacker)) {
            float f = (float)attacker.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111126_e();
            float f1 = EnchantmentHelper.func_152377_a((ItemStack)attacker.func_184614_ca(), (EnumCreatureAttribute)targetEntity.func_70668_bt());
            float f2 = attacker.func_184825_o(0.5f);
            f1 *= f2;
            attacker.func_184821_cY();
            if ((f *= 0.2f + f2 * f2 * 0.8f) > 0.0f || f1 > 0.0f) {
                ItemStack itemstack;
                boolean flag = f2 > 0.9f;
                boolean flag1 = false;
                int i = 0;
                i += EnchantmentHelper.func_77501_a((EntityLivingBase)attacker);
                if (attacker.func_70051_ag() && flag) {
                    attacker.field_70170_p.func_184148_a((EntityPlayer)null, attacker.field_70165_t, attacker.field_70163_u, attacker.field_70161_v, SoundEvents.field_187721_dT, attacker.func_184176_by(), 1.0f, 1.0f);
                    ++i;
                    flag1 = true;
                }
                boolean flag2 = flag && attacker.field_70143_R > 0.0f && !attacker.field_70122_E && !attacker.func_70617_f_() && !attacker.func_70090_H() && !attacker.func_70644_a(MobEffects.field_76440_q) && !attacker.func_184218_aH() && targetEntity instanceof EntityLivingBase;
                flag2 = flag2 && !attacker.func_70051_ag();
                CriticalHitEvent hitResult = ForgeHooks.getCriticalHit((EntityPlayer)attacker, (Entity)targetEntity, (boolean)flag2, (float)(flag2 ? 1.5f : 1.0f));
                boolean bl = flag2 = hitResult != null;
                if (flag2) {
                    f *= hitResult.getDamageModifier();
                }
                f += f1;
                boolean flag3 = false;
                double d0 = attacker.field_70140_Q - attacker.field_70141_P;
                if (flag && !flag2 && !flag1 && attacker.field_70122_E && d0 < (double)attacker.func_70689_ay() && (itemstack = attacker.func_184586_b(EnumHand.MAIN_HAND)).func_77973_b() instanceof ItemSword) {
                    flag3 = true;
                }
                float f4 = 0.0f;
                boolean flag4 = false;
                int j = EnchantmentHelper.func_90036_a((EntityLivingBase)attacker);
                f4 = targetEntity.func_110143_aJ();
                if (j > 0 && !targetEntity.func_70027_ad()) {
                    flag4 = true;
                    targetEntity.func_70015_d(1);
                }
                targetEntity.func_70606_j(targetEntity.func_110143_aJ() - f);
                targetEntity.func_70097_a(DamageSource.func_76365_a((EntityPlayer)attacker), 0.0f);
                boolean flag5 = true;
                if (flag5) {
                    if (flag3) {
                        attacker.field_70170_p.func_184148_a((EntityPlayer)null, attacker.field_70165_t, attacker.field_70163_u, attacker.field_70161_v, SoundEvents.field_187730_dW, attacker.func_184176_by(), 1.0f, 1.0f);
                        attacker.func_184810_cG();
                    }
                    if (flag2) {
                        attacker.field_70170_p.func_184148_a((EntityPlayer)null, attacker.field_70165_t, attacker.field_70163_u, attacker.field_70161_v, SoundEvents.field_187718_dS, attacker.func_184176_by(), 1.0f, 1.0f);
                        attacker.func_71009_b((Entity)targetEntity);
                    }
                    if (!flag2 && !flag3) {
                        if (flag) {
                            attacker.field_70170_p.func_184148_a((EntityPlayer)null, attacker.field_70165_t, attacker.field_70163_u, attacker.field_70161_v, SoundEvents.field_187727_dV, attacker.func_184176_by(), 1.0f, 1.0f);
                        } else {
                            attacker.field_70170_p.func_184148_a((EntityPlayer)null, attacker.field_70165_t, attacker.field_70163_u, attacker.field_70161_v, SoundEvents.field_187733_dX, attacker.func_184176_by(), 1.0f, 1.0f);
                        }
                    }
                    if (f1 > 0.0f) {
                        attacker.func_71047_c((Entity)targetEntity);
                    }
                    attacker.func_130011_c((Entity)targetEntity);
                    EnchantmentHelper.func_151384_a((EntityLivingBase)targetEntity, (Entity)attacker);
                    EnchantmentHelper.func_151385_b((EntityLivingBase)attacker, (Entity)targetEntity);
                    ItemStack itemstack1 = attacker.func_184614_ca();
                    EntityLivingBase entity = targetEntity;
                    if (!itemstack1.func_190926_b()) {
                        ItemStack beforeHitCopy = itemstack1.func_77946_l();
                        stack.func_77972_a(1, (EntityLivingBase)attacker);
                        if (itemstack1.func_190926_b()) {
                            ForgeEventFactory.onPlayerDestroyItem((EntityPlayer)attacker, (ItemStack)beforeHitCopy, (EnumHand)EnumHand.MAIN_HAND);
                            attacker.func_184611_a(EnumHand.MAIN_HAND, ItemStack.field_190927_a);
                        }
                    }
                    float f5 = f4 - targetEntity.func_110143_aJ();
                    attacker.func_71064_a(StatList.field_188111_y, Math.round(f5 * 10.0f));
                    if (j > 0) {
                        targetEntity.func_70015_d(j * 4);
                    }
                    if (attacker.field_70170_p instanceof WorldServer && f5 > 2.0f) {
                        int k = (int)((double)f5 * 0.5);
                        ((WorldServer)attacker.field_70170_p).func_175739_a(EnumParticleTypes.DAMAGE_INDICATOR, targetEntity.field_70165_t, targetEntity.field_70163_u + (double)(targetEntity.field_70131_O * 0.5f), targetEntity.field_70161_v, k, 0.1, 0.0, 0.1, 0.2, new int[0]);
                    }
                    attacker.func_71020_j(0.1f);
                } else {
                    attacker.field_70170_p.func_184148_a((EntityPlayer)null, attacker.field_70165_t, attacker.field_70163_u, attacker.field_70161_v, SoundEvents.field_187724_dU, attacker.func_184176_by(), 1.0f, 1.0f);
                    if (flag4) {
                        targetEntity.func_70066_B();
                    }
                }
            }
        }
    }

    @Override
    public EnumRarity func_77613_e(ItemStack stack) {
        return super.func_77613_e(stack);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void func_77624_a(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.func_77624_a(stack, worldIn, tooltip, flagIn);
        tooltip.add(TextFormatting.YELLOW + I18n.func_135052_a((String)("tootip.srparasites.weaponm." + this.idTool), (Object[])new Object[0]));
        tooltip.add(TextFormatting.RED + I18n.func_135052_a((String)("tootip.srparasites.weaponm." + this.idTool * 10), (Object[])new Object[0]));
        if (this.calling && SRPConfigSystems.useScent) {
            tooltip.add(TextFormatting.BLACK + I18n.func_135052_a((String)("tootip.srparasites.weaponm." + this.idTool * 100), (Object[])new Object[0]));
        }
    }
}

