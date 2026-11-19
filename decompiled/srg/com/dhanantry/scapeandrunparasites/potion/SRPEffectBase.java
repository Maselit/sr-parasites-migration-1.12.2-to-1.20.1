/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.advancements.CriteriaTriggers
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Items
 *  net.minecraft.init.MobEffects
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.stats.StatList
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.logging.log4j.Level
 */
package com.dhanantry.scapeandrunparasites.potion;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.client.particle.ParticleSpawner;
import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.EntityParasiticScent;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPMalleable;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.network.SRPPacketParticle;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;

public class SRPEffectBase
extends Potion {
    private ResourceLocation icon;

    public SRPEffectBase(String name, boolean isBadEffectIn, int liquidColorIn, int IconIndexX, int IconIndexY) {
        super(isBadEffectIn, liquidColorIn);
        this.setRegistryName("srparasites:" + name);
        this.func_76390_b("mob_effect." + this.getRegistryName());
        this.func_76399_b(IconIndexX, IconIndexY);
        this.icon = new ResourceLocation("srparasites:textures/gui/potion_" + name + ".png");
    }

    public boolean func_76400_d() {
        return false;
    }

    public List<ItemStack> getCurativeItems() {
        return new ArrayList<ItemStack>();
    }

    public boolean func_76397_a(int duration, int amplifier) {
        if (this == SRPPotions.BLEED_E || this == SRPPotions.EPEL_E || this == SRPPotions.DLER_E || this == SRPPotions.CORRO_E || this == SRPPotions.FOSTER_E) {
            int j = 25 >> amplifier;
            if (j > 0) {
                return duration % j == 0;
            }
            return true;
        }
        return true;
    }

    public void func_76394_a(EntityLivingBase entity, int amplifier) {
        if (this == SRPPotions.BLEED_E) {
            if (entity.field_70170_p.field_72995_K) {
                return;
            }
            float damage = entity.func_110138_aP() * SRPConfigSystems.bleedingDamage;
            if (entity.field_70165_t != entity.field_70169_q || entity.field_70161_v != entity.field_70166_s) {
                damage *= (float)(amplifier + 1);
            }
            damage = Math.min(damage, SRPConfigSystems.bleedingDamageCap);
            entity.func_70097_a(DamageSource.field_76376_m, damage);
        } else if (this == SRPPotions.CORRO_E) {
            if (entity.field_70170_p.field_72995_K) {
                return;
            }
            this.effectCORRO(entity, amplifier);
        } else if (this == SRPPotions.COTH_E) {
            if (entity.field_70170_p.field_72995_K) {
                return;
            }
            this.effectCOTH(entity, amplifier);
        } else if (this == SRPPotions.RAGE_E) {
            if (entity.field_70170_p.field_72995_K) {
                for (int i = 0; i <= 3; ++i) {
                    this.spawnParticles(SRPEnumParticle.GCLOUD, new Random(), entity);
                }
            }
        } else if (this == SRPPotions.PREY_E) {
            if (entity.field_70170_p.field_72995_K) {
                return;
            }
            this.effectPrey(entity, amplifier);
        } else if (this == SRPPotions.DLER_E) {
            if (entity.field_70170_p.field_72995_K) {
                return;
            }
            this.effectNeedler(entity, amplifier);
        } else if (this == SRPPotions.FOSTER_E) {
            if (entity.field_70170_p.field_72995_K) {
                return;
            }
            this.effectFoster(entity, amplifier);
        }
    }

    private void spawnParticles(SRPEnumParticle particleType, Random rand, EntityLivingBase entity) {
        double d0 = rand.nextGaussian() * 0.02;
        double d1 = rand.nextGaussian() * 0.02;
        double d2 = rand.nextGaussian() * 0.02;
        ParticleSpawner.spawnParticle(particleType, entity.field_70165_t + (double)(rand.nextFloat() * entity.field_70130_N * 2.0f) - (double)entity.field_70130_N, entity.field_70163_u + 0.5 + (double)(rand.nextFloat() * entity.field_70131_O), entity.field_70161_v + (double)(rand.nextFloat() * entity.field_70130_N * 2.0f) - (double)entity.field_70130_N, d0, d1, d2, 0, 0, 0);
    }

    private void InfectNearby(EntityLivingBase entity, int range) {
        if (SRPConfigSystems.cothAura == 0) {
            return;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, entity.field_70165_t + 1.0, entity.field_70163_u + 1.0, entity.field_70161_v + 1.0).func_186662_g((double)range);
        List moblist = entity.field_70170_p.func_72872_a(EntityLivingBase.class, axisalignedbb);
        for (EntityLivingBase mob : moblist) {
            if (mob == entity || mob.func_70644_a(SRPPotions.COTH_E)) continue;
            if (mob.func_70644_a(SRPPotions.EPEL_E)) {
                if (!(mob.field_70170_p.field_73012_v.nextDouble() >= SRPConfigSystems.epelChanceCOTH)) continue;
                mob.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 4800, 0, false, false));
                continue;
            }
            if (!entity.func_70685_l((Entity)mob)) continue;
            mob.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 4800, 0, false, false));
        }
    }

    private void effectCOTH(EntityLivingBase entity, int amplifier) {
        if (entity instanceof EntityPlayer) {
            return;
        }
        boolean flag = !entity.field_70170_p.field_72995_K;
        boolean particle = false;
        int dur = entity.func_70660_b(SRPPotions.COTH_E).func_76459_b();
        switch (entity.func_70660_b(SRPPotions.COTH_E).func_76458_c()) {
            case 0: {
                NBTTagCompound tags;
                if (dur >= 200 || !flag || !(tags = entity.getEntityData()).func_74764_b("srpcothimmunity")) break;
                if (tags.func_74762_e("srpcothimmunity") != 0) {
                    entity.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 1, false, false));
                    break;
                }
                entity.func_184596_c(SRPPotions.COTH_E);
                break;
            }
            case 1: {
                NBTTagCompound tags;
                boolean tickFlag;
                if (!flag) break;
                boolean bl = tickFlag = entity.field_70173_aa % 20 == 0;
                if (tickFlag) {
                    this.InfectNearby(entity, SRPConfigSystems.cothAura);
                }
                if (entity.func_110138_aP() * SRPConfigSystems.cothUnhide > entity.func_110143_aJ() && entity.func_110143_aJ() > 0.0f) {
                    tags = entity.getEntityData();
                    if (tags.func_74764_b("srpcothimmunity")) {
                        if (tags.func_74762_e("srpcothimmunity") != 0 && tickFlag) {
                            ParasiteEventEntity.spawnInsider(entity, entity.field_70170_p, tags);
                        }
                        if (tags.func_74762_e("srpcothimmunity") > 1) {
                            particle = true;
                        }
                    } else {
                        entity.func_184596_c(SRPPotions.COTH_E);
                    }
                }
                if (dur >= 200 || !(tags = entity.getEntityData()).func_74764_b("srpcothimmunity")) break;
                if (tags.func_74762_e("srpcothimmunity") != 0) {
                    entity.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 2, false, false));
                    if (entity.field_70170_p.field_72995_K || !SRPConfigSystems.useEvolution) break;
                    SRPSaveData data = SRPSaveData.get(entity.field_70170_p);
                    data.setTotalKills(entity.field_70170_p.field_73011_w.getDimension(), SRPConfigSystems.valueCOTH, true, entity.field_70170_p, true);
                    if (data.getEvolutionPhase(entity.field_70170_p.field_73011_w.getDimension()) < SRPConfigSystems.evolutionAssimilatedDehiding) break;
                    int key = tags.func_74762_e("srpcothimmunity");
                    tags.func_74768_a("srpcothimmunity", ++key);
                    break;
                }
                entity.func_184596_c(SRPPotions.COTH_E);
                break;
            }
            default: {
                if (!flag) break;
                boolean tickFlag = entity.field_70173_aa % 20 == 0;
                NBTTagCompound tags = entity.getEntityData();
                if (tags.func_74764_b("srpcothimmunity")) {
                    if (tags.func_74762_e("srpcothimmunity") > 1) {
                        if (tickFlag) {
                            ParasiteEventEntity.convertEntity(entity, tags, false, SRPConfigSystems.COTHVictimParasite);
                        }
                        particle = true;
                        break;
                    }
                    if (tickFlag) {
                        this.InfectNearby(entity, SRPConfigSystems.cothAura);
                    }
                    if (entity.func_110138_aP() * SRPConfigSystems.cothUnhide > entity.func_110143_aJ() && entity.func_110143_aJ() > 0.0f && tickFlag) {
                        if (tags.func_74762_e("srpcothimmunity") != 0) {
                            ParasiteEventEntity.convertEntity(entity, tags, false, SRPConfigSystems.COTHVictimParasite);
                        }
                        if (tags.func_74762_e("srpcothimmunity") > 1) {
                            particle = true;
                        }
                    }
                    if (dur >= 200) break;
                    entity.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 2, false, false));
                    if (!SRPConfigSystems.useEvolution || SRPSaveData.get(entity.field_70170_p).getEvolutionPhase(entity.field_70170_p.field_73011_w.getDimension()) < SRPConfigSystems.evolutionAssimilatedDehiding) break;
                    int key = tags.func_74762_e("srpcothimmunity");
                    tags.func_74768_a("srpcothimmunity", ++key);
                    break;
                }
                entity.func_184596_c(SRPPotions.COTH_E);
            }
        }
        if (particle) {
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, entity.field_70130_N, entity.field_70131_O, 1));
        }
    }

    private void effectPrey(EntityLivingBase entity, int amplifier) {
        EntityPlayer pa;
        if (entity instanceof EntityPlayer && ((pa = (EntityPlayer)entity).func_175149_v() || pa.func_184812_l_())) {
            return;
        }
        if (entity.field_70173_aa % 40 == 0) {
            List serverList = entity.field_70170_p.field_72996_f;
            int count = 0;
            for (int x = 0; x < serverList.size(); ++x) {
                if (!(serverList.get(x) instanceof EntityParasiticScent)) continue;
                ++count;
            }
            if (count > SRPConfigSystems.scentCap) {
                return;
            }
            AxisAlignedBB axisalignedbb = new AxisAlignedBB(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, entity.field_70165_t + 1.0, entity.field_70163_u + 1.0, entity.field_70161_v + 1.0).func_186662_g(64.0);
            List moblist = entity.field_70170_p.func_72872_a(EntityParasiticScent.class, axisalignedbb);
            for (EntityParasiticScent mob : moblist) {
                if (mob.getTargetToKill() != entity || !mob.getCanFollow()) continue;
                return;
            }
            byte phase = SRPSaveData.get(entity.field_70170_p).getEvolutionPhase(entity.field_70170_p.field_73011_w.getDimension());
            EntityParasiticScent nut = new EntityParasiticScent(entity.field_70170_p, 1, entity);
            nut.func_82149_j((Entity)entity);
            nut.setScentLife(SRPConfigSystems.scentLifeObserver * 20);
            nut.increaseDanger(ParasiteEventEntity.getScentBonus(phase), true);
            nut.setScentReaction(ParasiteEventEntity.getScentReactionBonus(phase), false);
            nut.setCanFollow(true);
            entity.field_70170_p.func_72838_d((Entity)nut);
        }
    }

    private void effectCORRO(EntityLivingBase entity, int amplifier) {
        ArrayList<ItemStack> off = new ArrayList<ItemStack>();
        Iterable gear = entity.func_184193_aE();
        if (gear != null && !gear.equals(Collections.emptyList())) {
            for (ItemStack part : gear) {
                if (part.func_190926_b() || !part.func_77984_f()) continue;
                off.add(part);
            }
            if (!off.isEmpty()) {
                for (ItemStack part : off) {
                    if (!((double)part.func_77958_k() * SRPConfigSystems.corrNot <= (double)(part.func_77958_k() - part.func_77952_i()))) continue;
                    part.func_77972_a(SRPConfigSystems.corroValue, entity);
                }
            }
        }
    }

    private void effectNeedler(EntityLivingBase entity, int amplifier) {
        if (amplifier >= SRPConfigSystems.needlerTerminal) {
            amplifier -= SRPConfigSystems.needlerTerminal;
            entity.func_184596_c(SRPPotions.DLER_E);
            String mobname = null;
            try {
                mobname = EntityList.func_191301_a((Entity)entity).toString();
            }
            catch (Exception e) {
                SRPMain.logger.log(Level.ERROR, "Problem with needler and an entity", (Throwable)e);
                return;
            }
            if (ParasiteEventEntity.checkName(mobname, SRPConfigSystems.needlerImmuneList, SRPConfigSystems.needlerImmuneListWhite)) {
                return;
            }
            entity.func_70690_d(new PotionEffect(SRPPotions.DLER_E, 400, amplifier, false, false));
            float f1 = entity.func_110143_aJ();
            if (f1 <= 0.0f) {
                return;
            }
            float damagee = entity.func_110138_aP() * SRPConfigSystems.needlerDamage;
            damagee = entity instanceof EntityPlayer ? Math.max(damagee, SRPConfigSystems.needlerMaxDamPlayer) : Math.max(damagee, SRPConfigSystems.needlerMaxDamMonster);
            entity.func_70606_j(f1 - damagee);
            entity.field_70170_p.func_72960_a((Entity)entity, (byte)2);
            entity.field_70170_p.func_72876_a((Entity)entity, entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 4.0f, false);
            if (entity.func_110143_aJ() <= 0.0f) {
                ItemStack itemstack = null;
                for (EnumHand enumhand : EnumHand.values()) {
                    ItemStack itemstack1 = entity.func_184586_b(enumhand);
                    if (itemstack1.func_77973_b() != Items.field_190929_cY) continue;
                    itemstack = itemstack1.func_77946_l();
                    itemstack1.func_190918_g(1);
                    break;
                }
                if (itemstack != null) {
                    if (entity instanceof EntityPlayerMP) {
                        EntityPlayerMP entityplayermp = (EntityPlayerMP)entity;
                        entityplayermp.func_71029_a(StatList.func_188057_b((Item)Items.field_190929_cY));
                        CriteriaTriggers.field_193130_A.func_193187_a(entityplayermp, itemstack);
                    }
                    entity.func_70606_j(1.0f);
                    entity.func_70674_bp();
                    entity.func_70690_d(new PotionEffect(MobEffects.field_76428_l, 900, 1));
                    entity.func_70690_d(new PotionEffect(MobEffects.field_76444_x, 100, 1));
                    entity.field_70170_p.func_72960_a((Entity)entity, (byte)35);
                } else {
                    entity.func_70645_a(DamageSource.field_76376_m);
                }
            }
        }
    }

    private void effectFoster(EntityLivingBase entity, int amplifier) {
        if (entity instanceof EntityPMalleable) {
            ((EntityPMalleable)entity).increaseAllResistances();
        }
    }

    @SideOnly(value=Side.CLIENT)
    public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc) {
        if (mc.field_71462_r != null) {
            mc.func_110434_K().func_110577_a(this.icon);
            Gui.func_146110_a((int)(x + 6), (int)(y + 7), (float)0.0f, (float)0.0f, (int)18, (int)18, (float)18.0f, (float)18.0f);
        }
    }

    public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha) {
        mc.func_110434_K().func_110577_a(this.icon);
        Gui.func_146110_a((int)(x + 3), (int)(y + 3), (float)0.0f, (float)0.0f, (int)18, (int)18, (float)18.0f, (float)18.0f);
    }
}

