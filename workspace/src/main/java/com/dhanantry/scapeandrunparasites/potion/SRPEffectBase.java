package com.dhanantry.scapeandrunparasites.potion;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.client.particle.ParticleSpawner;
import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.network.SRPPacketParticle;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

/**
 * Migracion de SRPEffectBase a 1.20.1 (MobEffect). Logica de performEffect migrada (adaptada).
 */
public class SRPEffectBase extends MobEffect {
    private net.minecraft.resources.ResourceLocation icon;

    public SRPEffectBase(String name, boolean isBadEffectIn, int liquidColorIn, int iconIndexX, int iconIndexY) {
        super(isBadEffectIn ? MobEffectCategory.HARMFUL : MobEffectCategory.BENEFICIAL, liquidColorIn);
        this.icon = new net.minecraft.resources.ResourceLocation("srparasites", "textures/gui/potion_" + name + ".png");
    }

    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        if (this == SRPPotions.BLEED_E.get() || this == SRPPotions.EPEL_E.get() || this == SRPPotions.DLER_E.get() || this == SRPPotions.CORRO_E.get() || this == SRPPotions.FOSTER_E.get()) {
            int j = 25 >> amplifier;
            if (j > 0) {
                return duration % j == 0;
            }
            return true;
        }
        return true;
    }

    @Override
    public void applyEffectTick(net.minecraft.world.entity.LivingEntity entity, int amplifier) {
        if (this == SRPPotions.BLEED_E.get()) {
            if (entity.level().isClientSide()) return;
            float damage = entity.getMaxHealth() * SRPConfigSystems.bleedingDamage;
            if (entity.getX() != entity.xOld || entity.getZ() != entity.zOld) {
                damage *= (float) (amplifier + 1);
            }
            damage = Math.min(damage, SRPConfigSystems.bleedingDamageCap);
            entity.hurt(entity.damageSources().magic(), damage);
        } else if (this == SRPPotions.CORRO_E.get()) {
            if (!entity.level().isClientSide()) {
                this.effectCORRO(entity, amplifier);
            }
        } else if (this == SRPPotions.COTH_E.get()) {
            if (!entity.level().isClientSide()) {
                this.effectCOTH(entity, amplifier);
            }
        } else if (this == SRPPotions.PREY_E.get()) {
            if (!entity.level().isClientSide()) {
                this.effectPrey(entity, amplifier);
            }
        } else if (this == SRPPotions.DLER_E.get()) {
            if (!entity.level().isClientSide()) {
                this.effectNeedler(entity, amplifier);
            }
        } else if (this == SRPPotions.FOSTER_E.get()) {
            if (!entity.level().isClientSide()) {
                this.effectFoster(entity, amplifier);
            }
        }
    }

    // stubs for complex helpers (depend on un-migrated classes)
    private void effectCORRO(net.minecraft.world.entity.LivingEntity entity, int amplifier) {
        java.util.List<net.minecraft.world.item.ItemStack> off = new java.util.ArrayList<>();
        for (net.minecraft.world.item.ItemStack part : entity.getArmorSlots()) {
            if (part.isEmpty() || !part.isDamageableItem()) continue;
            off.add(part);
        }
        if (!off.isEmpty()) {
            for (net.minecraft.world.item.ItemStack part : off) {
                if (!((double) part.getMaxDamage() * SRPConfigSystems.corrNot <= (double) (part.getMaxDamage() - part.getDamageValue()))) continue;
                part.hurt(SRPConfigSystems.corroValue, entity.level().random, null);
            }
        }
    }
    private void InfectNearby(net.minecraft.world.entity.LivingEntity entity, int range) {
        if (SRPConfigSystems.cothAura == 0) return;
        net.minecraft.world.phys.AABB axisalignedbb = new net.minecraft.world.phys.AABB(entity.getX(), entity.getY(), entity.getZ(), entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0).inflate(range);
        java.util.List<net.minecraft.world.entity.LivingEntity> moblist = entity.level().getEntitiesOfClass(net.minecraft.world.entity.LivingEntity.class, axisalignedbb);
        for (net.minecraft.world.entity.LivingEntity mob : moblist) {
            if (mob == entity || mob.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get())) continue;
            if (mob.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.EPEL_E.get())) {
                if (entity.level().random.nextDouble() < SRPConfigSystems.epelChanceCOTH) continue;
                mob.addEffect(new net.minecraft.world.effect.MobEffectInstance(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get(), 4800, 0));
                continue;
            }
            if (!entity.hasLineOfSight(mob)) continue;
            mob.addEffect(new net.minecraft.world.effect.MobEffectInstance(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get(), 4800, 0));
        }
    }

    private void effectCOTH(net.minecraft.world.entity.LivingEntity entity, int amplifier) {
        if (entity instanceof net.minecraft.world.entity.player.Player) {
            return;
        }
        boolean flag = !entity.level().isClientSide();
        boolean particle = false;
        net.minecraft.world.effect.MobEffectInstance eff = entity.getEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get());
        if (eff == null) return;
        int dur = eff.getDuration();
        int amp = eff.getAmplifier();
        switch (amp) {
            case 0: {
                net.minecraft.nbt.CompoundTag tags;
                if (dur >= 200 || !flag || (tags = entity.getPersistentData()) == null || !tags.contains("srpcothimmunity")) break;
                if (tags.getInt("srpcothimmunity") != 0) {
                    entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get(), 3600, 1));
                } else {
                    entity.removeEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get());
                }
                break;
            }
            case 1: {
                net.minecraft.nbt.CompoundTag tags;
                if (!flag) break;
                boolean tickFlag = entity.tickCount % 20 == 0;
                if (tickFlag) {
                    InfectNearby(entity, SRPConfigSystems.cothAura);
                }
                if (entity.getMaxHealth() * SRPConfigSystems.cothUnhide > entity.getHealth() && entity.getHealth() > 0.0f) {
                    tags = entity.getPersistentData();
                    if (tags.contains("srpcothimmunity")) {
                        if (tags.getInt("srpcothimmunity") != 0 && tickFlag) {
                            ParasiteEventEntity.spawnInsider(entity, entity.level(), tags);
                        }
                        if (tags.getInt("srpcothimmunity") > 1) {
                            particle = true;
                        }
                    } else {
                        entity.removeEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get());
                    }
                }
                if (dur >= 200 || (tags = entity.getPersistentData()) == null || !tags.contains("srpcothimmunity")) break;
                if (tags.getInt("srpcothimmunity") != 0) {
                    entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get(), 3600, 2));
                    if (!entity.level().isClientSide() && SRPConfigSystems.useEvolution) {
                        SRPSaveData data = SRPSaveData.get(entity.level());
                        data.setTotalKills(SRPSaveData.dimensionId(entity.level()), SRPConfigSystems.valueCOTH, true, entity.level(), true);
                        if (data.getEvolutionPhase(SRPSaveData.dimensionId(entity.level())) >= SRPConfigSystems.evolutionAssimilatedDehiding) {
                            int key = tags.getInt("srpcothimmunity");
                            tags.putInt("srpcothimmunity", ++key);
                        }
                    }
                } else {
                    entity.removeEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get());
                }
                break;
            }
            default: {
                if (!flag) break;
                boolean tickFlag = entity.tickCount % 20 == 0;
                net.minecraft.nbt.CompoundTag tags = entity.getPersistentData();
                if (tags.contains("srpcothimmunity")) {
                    if (tags.getInt("srpcothimmunity") > 1) {
                        if (tickFlag) {
                            ParasiteEventEntity.convertEntity(entity, tags, false, SRPConfigSystems.COTHVictimParasite);
                        }
                        particle = true;
                        break;
                    }
                    if (tickFlag) {
                        InfectNearby(entity, SRPConfigSystems.cothAura);
                    }
                    if (entity.getMaxHealth() * SRPConfigSystems.cothUnhide > entity.getHealth() && entity.getHealth() > 0.0f && tickFlag) {
                        if (tags.getInt("srpcothimmunity") != 0) {
                            ParasiteEventEntity.convertEntity(entity, tags, false, SRPConfigSystems.COTHVictimParasite);
                        }
                        if (tags.getInt("srpcothimmunity") > 1) {
                            particle = true;
                        }
                    }
                    if (dur >= 200) break;
                    entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get(), 3600, 2));
                    if (SRPConfigSystems.useEvolution && SRPSaveData.get(entity.level()).getEvolutionPhase(SRPSaveData.dimensionId(entity.level())) >= SRPConfigSystems.evolutionAssimilatedDehiding) {
                        int key = tags.getInt("srpcothimmunity");
                        tags.putInt("srpcothimmunity", ++key);
                    }
                } else {
                    entity.removeEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get());
                }
                break;
            }
        }
        if (particle) {
            // SRPMain.network.sendToAll(new SRPPacketParticle(...)) - stub
        }
    }
    private void effectPrey(net.minecraft.world.entity.LivingEntity entity, int amplifier) {
        if (entity instanceof net.minecraft.world.entity.player.Player && (((net.minecraft.world.entity.player.Player) entity).isSpectator() || ((net.minecraft.world.entity.player.Player) entity).isCreative())) {
            return;
        }
        if (entity.tickCount % 40 == 0) {
            // scent cap check (simplified)
            net.minecraft.world.phys.AABB axisalignedbb = new net.minecraft.world.phys.AABB(entity.getX(), entity.getY(), entity.getZ(), entity.getX() + 1.0, entity.getY() + 1.0, entity.getZ() + 1.0).inflate(64.0);
            java.util.List<com.dhanantry.scapeandrunparasites.entity.EntityParasiticScent> moblist = entity.level().getEntitiesOfClass(com.dhanantry.scapeandrunparasites.entity.EntityParasiticScent.class, axisalignedbb);
            for (com.dhanantry.scapeandrunparasites.entity.EntityParasiticScent mob : moblist) {
                if (mob.getTargetToKill() == entity && mob.getCanFollow()) {
                    return;
                }
            }
            byte phase = SRPSaveData.get(entity.level()).getEvolutionPhase(SRPSaveData.dimensionId(entity.level()));
            // EntityParasiticScent nut = new EntityParasiticScent(entity.level(), 1, entity); // stub, skip spawn
            // TODO: spawn scent entity when EntityParasiticScent is migrated
        }
    }
    private void effectNeedler(net.minecraft.world.entity.LivingEntity entity, int amplifier) {
        if (amplifier >= SRPConfigSystems.needlerTerminal) {
            amplifier -= SRPConfigSystems.needlerTerminal;
            entity.removeEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.DLER_E.get());
            String mobname = null;
            try {
                mobname = net.minecraft.world.entity.EntityType.getKey(entity.getType()).toString();
            } catch (Exception e) {
                SRPMain.LOGGER.error("Problem with needler and an entity", e);
                return;
            }
            if (ParasiteEventEntity.checkName(mobname, SRPConfigSystems.needlerImmuneList, SRPConfigSystems.needlerImmuneListWhite)) {
                return;
            }
            entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(com.dhanantry.scapeandrunparasites.init.SRPPotions.DLER_E.get(), 400, amplifier));
            float f1 = entity.getHealth();
            if (f1 <= 0.0f) {
                return;
            }
            float damagee = entity.getMaxHealth() * SRPConfigSystems.needlerDamage;
            damagee = entity instanceof net.minecraft.world.entity.player.Player ? Math.max(damagee, SRPConfigSystems.needlerMaxDamPlayer) : Math.max(damagee, SRPConfigSystems.needlerMaxDamMonster);
            entity.setHealth(f1 - damagee);
            entity.level().broadcastEntityEvent(entity, (byte) 2);
            if (entity.getHealth() <= 0.0f) {
                net.minecraft.world.item.ItemStack itemstack = null;
                for (net.minecraft.world.InteractionHand enumhand : net.minecraft.world.InteractionHand.values()) {
                    net.minecraft.world.item.ItemStack itemstack1 = entity.getItemInHand(enumhand);
                    if (itemstack1.getItem() != net.minecraft.world.item.Items.TOTEM_OF_UNDYING) continue;
                    itemstack = itemstack1.copy();
                    itemstack1.shrink(1);
                    break;
                }
                if (itemstack != null) {
                    entity.setHealth(1.0f);
                    entity.removeAllEffects();
                    entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(net.minecraft.world.effect.MobEffects.REGENERATION, 900, 1));
                    entity.addEffect(new net.minecraft.world.effect.MobEffectInstance(net.minecraft.world.effect.MobEffects.ABSORPTION, 100, 1));
                    entity.level().broadcastEntityEvent(entity, (byte) 35);
                } else {
                    entity.die(entity.damageSources().magic());
                }
            }
        }
    }
    private void effectFoster(net.minecraft.world.entity.LivingEntity entity, int amplifier) {
        if (entity instanceof com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPMalleable) {
            ((com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPMalleable) entity).increaseAllResistances();
        }
    }
}