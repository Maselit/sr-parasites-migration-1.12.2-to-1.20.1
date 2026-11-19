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
        this.setPotionName("mob_effect." + this.getRegistryName());
        this.setIconIndex(IconIndexX, IconIndexY);
        this.icon = new ResourceLocation("srparasites:textures/gui/potion_" + name + ".png");
    }

    public boolean hasStatusIcon() {
        return false;
    }

    public List<ItemStack> getCurativeItems() {
        return new ArrayList<ItemStack>();
    }

    public boolean isReady(int duration, int amplifier) {
        if (this == SRPPotions.BLEED_E || this == SRPPotions.EPEL_E || this == SRPPotions.DLER_E || this == SRPPotions.CORRO_E || this == SRPPotions.FOSTER_E) {
            int j = 25 >> amplifier;
            if (j > 0) {
                return duration % j == 0;
            }
            return true;
        }
        return true;
    }

    public void performEffect(EntityLivingBase entity, int amplifier) {
        if (this == SRPPotions.BLEED_E) {
            if (entity.world.isRemote) {
                return;
            }
            float damage = entity.getMaxHealth() * SRPConfigSystems.bleedingDamage;
            if (entity.posX != entity.prevPosX || entity.posZ != entity.prevPosZ) {
                damage *= (float)(amplifier + 1);
            }
            damage = Math.min(damage, SRPConfigSystems.bleedingDamageCap);
            entity.attackEntityFrom(DamageSource.MAGIC, damage);
        } else if (this == SRPPotions.CORRO_E) {
            if (entity.world.isRemote) {
                return;
            }
            this.effectCORRO(entity, amplifier);
        } else if (this == SRPPotions.COTH_E) {
            if (entity.world.isRemote) {
                return;
            }
            this.effectCOTH(entity, amplifier);
        } else if (this == SRPPotions.RAGE_E) {
            if (entity.world.isRemote) {
                for (int i = 0; i <= 3; ++i) {
                    this.spawnParticles(SRPEnumParticle.GCLOUD, new Random(), entity);
                }
            }
        } else if (this == SRPPotions.PREY_E) {
            if (entity.world.isRemote) {
                return;
            }
            this.effectPrey(entity, amplifier);
        } else if (this == SRPPotions.DLER_E) {
            if (entity.world.isRemote) {
                return;
            }
            this.effectNeedler(entity, amplifier);
        } else if (this == SRPPotions.FOSTER_E) {
            if (entity.world.isRemote) {
                return;
            }
            this.effectFoster(entity, amplifier);
        }
    }

    private void spawnParticles(SRPEnumParticle particleType, Random rand, EntityLivingBase entity) {
        double d0 = rand.nextGaussian() * 0.02;
        double d1 = rand.nextGaussian() * 0.02;
        double d2 = rand.nextGaussian() * 0.02;
        ParticleSpawner.spawnParticle(particleType, entity.posX + (double)(rand.nextFloat() * entity.width * 2.0f) - (double)entity.width, entity.posY + 0.5 + (double)(rand.nextFloat() * entity.height), entity.posZ + (double)(rand.nextFloat() * entity.width * 2.0f) - (double)entity.width, d0, d1, d2, 0, 0, 0);
    }

    private void InfectNearby(EntityLivingBase entity, int range) {
        if (SRPConfigSystems.cothAura == 0) {
            return;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(entity.posX, entity.posY, entity.posZ, entity.posX + 1.0, entity.posY + 1.0, entity.posZ + 1.0).grow((double)range);
        List moblist = entity.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
        for (EntityLivingBase mob : moblist) {
            if (mob == entity || mob.isPotionActive(SRPPotions.COTH_E)) continue;
            if (mob.isPotionActive(SRPPotions.EPEL_E)) {
                if (!(mob.world.rand.nextDouble() >= SRPConfigSystems.epelChanceCOTH)) continue;
                mob.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 4800, 0, false, false));
                continue;
            }
            if (!entity.canEntityBeSeen((Entity)mob)) continue;
            mob.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 4800, 0, false, false));
        }
    }

    private void effectCOTH(EntityLivingBase entity, int amplifier) {
        if (entity instanceof EntityPlayer) {
            return;
        }
        boolean flag = !entity.world.isRemote;
        boolean particle = false;
        int dur = entity.getActivePotionEffect(SRPPotions.COTH_E).getDuration();
        switch (entity.getActivePotionEffect(SRPPotions.COTH_E).getAmplifier()) {
            case 0: {
                NBTTagCompound tags;
                if (dur >= 200 || !flag || !(tags = entity.getEntityData()).hasKey("srpcothimmunity")) break;
                if (tags.getInteger("srpcothimmunity") != 0) {
                    entity.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 1, false, false));
                    break;
                }
                entity.removeActivePotionEffect(SRPPotions.COTH_E);
                break;
            }
            case 1: {
                NBTTagCompound tags;
                boolean tickFlag;
                if (!flag) break;
                boolean bl = tickFlag = entity.ticksExisted % 20 == 0;
                if (tickFlag) {
                    this.InfectNearby(entity, SRPConfigSystems.cothAura);
                }
                if (entity.getMaxHealth() * SRPConfigSystems.cothUnhide > entity.getHealth() && entity.getHealth() > 0.0f) {
                    tags = entity.getEntityData();
                    if (tags.hasKey("srpcothimmunity")) {
                        if (tags.getInteger("srpcothimmunity") != 0 && tickFlag) {
                            ParasiteEventEntity.spawnInsider(entity, entity.world, tags);
                        }
                        if (tags.getInteger("srpcothimmunity") > 1) {
                            particle = true;
                        }
                    } else {
                        entity.removeActivePotionEffect(SRPPotions.COTH_E);
                    }
                }
                if (dur >= 200 || !(tags = entity.getEntityData()).hasKey("srpcothimmunity")) break;
                if (tags.getInteger("srpcothimmunity") != 0) {
                    entity.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 2, false, false));
                    if (entity.world.isRemote || !SRPConfigSystems.useEvolution) break;
                    SRPSaveData data = SRPSaveData.get(entity.world);
                    data.setTotalKills(entity.world.provider.getDimension(), SRPConfigSystems.valueCOTH, true, entity.world, true);
                    if (data.getEvolutionPhase(entity.world.provider.getDimension()) < SRPConfigSystems.evolutionAssimilatedDehiding) break;
                    int key = tags.getInteger("srpcothimmunity");
                    tags.setInteger("srpcothimmunity", ++key);
                    break;
                }
                entity.removeActivePotionEffect(SRPPotions.COTH_E);
                break;
            }
            default: {
                if (!flag) break;
                boolean tickFlag = entity.ticksExisted % 20 == 0;
                NBTTagCompound tags = entity.getEntityData();
                if (tags.hasKey("srpcothimmunity")) {
                    if (tags.getInteger("srpcothimmunity") > 1) {
                        if (tickFlag) {
                            ParasiteEventEntity.convertEntity(entity, tags, false, SRPConfigSystems.COTHVictimParasite);
                        }
                        particle = true;
                        break;
                    }
                    if (tickFlag) {
                        this.InfectNearby(entity, SRPConfigSystems.cothAura);
                    }
                    if (entity.getMaxHealth() * SRPConfigSystems.cothUnhide > entity.getHealth() && entity.getHealth() > 0.0f && tickFlag) {
                        if (tags.getInteger("srpcothimmunity") != 0) {
                            ParasiteEventEntity.convertEntity(entity, tags, false, SRPConfigSystems.COTHVictimParasite);
                        }
                        if (tags.getInteger("srpcothimmunity") > 1) {
                            particle = true;
                        }
                    }
                    if (dur >= 200) break;
                    entity.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 2, false, false));
                    if (!SRPConfigSystems.useEvolution || SRPSaveData.get(entity.world).getEvolutionPhase(entity.world.provider.getDimension()) < SRPConfigSystems.evolutionAssimilatedDehiding) break;
                    int key = tags.getInteger("srpcothimmunity");
                    tags.setInteger("srpcothimmunity", ++key);
                    break;
                }
                entity.removeActivePotionEffect(SRPPotions.COTH_E);
            }
        }
        if (particle) {
            SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(entity.posX, entity.posY, entity.posZ, entity.width, entity.height, 1));
        }
    }

    private void effectPrey(EntityLivingBase entity, int amplifier) {
        EntityPlayer pa;
        if (entity instanceof EntityPlayer && ((pa = (EntityPlayer)entity).isSpectator() || pa.isCreative())) {
            return;
        }
        if (entity.ticksExisted % 40 == 0) {
            List serverList = entity.world.loadedEntityList;
            int count = 0;
            for (int x = 0; x < serverList.size(); ++x) {
                if (!(serverList.get(x) instanceof EntityParasiticScent)) continue;
                ++count;
            }
            if (count > SRPConfigSystems.scentCap) {
                return;
            }
            AxisAlignedBB axisalignedbb = new AxisAlignedBB(entity.posX, entity.posY, entity.posZ, entity.posX + 1.0, entity.posY + 1.0, entity.posZ + 1.0).grow(64.0);
            List moblist = entity.world.getEntitiesWithinAABB(EntityParasiticScent.class, axisalignedbb);
            for (EntityParasiticScent mob : moblist) {
                if (mob.getTargetToKill() != entity || !mob.getCanFollow()) continue;
                return;
            }
            byte phase = SRPSaveData.get(entity.world).getEvolutionPhase(entity.world.provider.getDimension());
            EntityParasiticScent nut = new EntityParasiticScent(entity.world, 1, entity);
            nut.copyLocationAndAnglesFrom((Entity)entity);
            nut.setScentLife(SRPConfigSystems.scentLifeObserver * 20);
            nut.increaseDanger(ParasiteEventEntity.getScentBonus(phase), true);
            nut.setScentReaction(ParasiteEventEntity.getScentReactionBonus(phase), false);
            nut.setCanFollow(true);
            entity.world.spawnEntity((Entity)nut);
        }
    }

    private void effectCORRO(EntityLivingBase entity, int amplifier) {
        ArrayList<ItemStack> off = new ArrayList<ItemStack>();
        Iterable gear = entity.getArmorInventoryList();
        if (gear != null && !gear.equals(Collections.emptyList())) {
            for (ItemStack part : gear) {
                if (part.isEmpty() || !part.isItemStackDamageable()) continue;
                off.add(part);
            }
            if (!off.isEmpty()) {
                for (ItemStack part : off) {
                    if (!((double)part.getMaxDamage() * SRPConfigSystems.corrNot <= (double)(part.getMaxDamage() - part.getItemDamage()))) continue;
                    part.damageItem(SRPConfigSystems.corroValue, entity);
                }
            }
        }
    }

    private void effectNeedler(EntityLivingBase entity, int amplifier) {
        if (amplifier >= SRPConfigSystems.needlerTerminal) {
            amplifier -= SRPConfigSystems.needlerTerminal;
            entity.removeActivePotionEffect(SRPPotions.DLER_E);
            String mobname = null;
            try {
                mobname = EntityList.getKey((Entity)entity).toString();
            }
            catch (Exception e) {
                SRPMain.logger.log(Level.ERROR, "Problem with needler and an entity", (Throwable)e);
                return;
            }
            if (ParasiteEventEntity.checkName(mobname, SRPConfigSystems.needlerImmuneList, SRPConfigSystems.needlerImmuneListWhite)) {
                return;
            }
            entity.addPotionEffect(new PotionEffect(SRPPotions.DLER_E, 400, amplifier, false, false));
            float f1 = entity.getHealth();
            if (f1 <= 0.0f) {
                return;
            }
            float damagee = entity.getMaxHealth() * SRPConfigSystems.needlerDamage;
            damagee = entity instanceof EntityPlayer ? Math.max(damagee, SRPConfigSystems.needlerMaxDamPlayer) : Math.max(damagee, SRPConfigSystems.needlerMaxDamMonster);
            entity.setHealth(f1 - damagee);
            entity.world.setEntityState((Entity)entity, (byte)2);
            entity.world.createExplosion((Entity)entity, entity.posX, entity.posY, entity.posZ, 4.0f, false);
            if (entity.getHealth() <= 0.0f) {
                ItemStack itemstack = null;
                for (EnumHand enumhand : EnumHand.values()) {
                    ItemStack itemstack1 = entity.getHeldItem(enumhand);
                    if (itemstack1.getItem() != Items.TOTEM_OF_UNDYING) continue;
                    itemstack = itemstack1.copy();
                    itemstack1.shrink(1);
                    break;
                }
                if (itemstack != null) {
                    if (entity instanceof EntityPlayerMP) {
                        EntityPlayerMP entityplayermp = (EntityPlayerMP)entity;
                        entityplayermp.addStat(StatList.getObjectUseStats((Item)Items.TOTEM_OF_UNDYING));
                        CriteriaTriggers.USED_TOTEM.trigger(entityplayermp, itemstack);
                    }
                    entity.setHealth(1.0f);
                    entity.clearActivePotions();
                    entity.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 900, 1));
                    entity.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 100, 1));
                    entity.world.setEntityState((Entity)entity, (byte)35);
                } else {
                    entity.onDeath(DamageSource.MAGIC);
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
        if (mc.currentScreen != null) {
            mc.getTextureManager().bindTexture(this.icon);
            Gui.drawModalRectWithCustomSizedTexture((int)(x + 6), (int)(y + 7), (float)0.0f, (float)0.0f, (int)18, (int)18, (float)18.0f, (float)18.0f);
        }
    }

    public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha) {
        mc.getTextureManager().bindTexture(this.icon);
        Gui.drawModalRectWithCustomSizedTexture((int)(x + 3), (int)(y + 3), (float)0.0f, (float)0.0f, (int)18, (int)18, (float)18.0f, (float)18.0f);
    }
}

