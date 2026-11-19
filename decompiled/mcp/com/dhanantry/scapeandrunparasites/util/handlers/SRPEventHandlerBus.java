/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$FogMode
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIAvoidEntity
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAINearestAttackableTarget
 *  net.minecraft.entity.item.EntityArmorStand
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Items
 *  net.minecraft.init.MobEffects
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.Style
 *  net.minecraft.util.text.TextComponentTranslation
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraft.world.WorldType
 *  net.minecraftforge.client.event.EntityViewRenderEvent$FogColors
 *  net.minecraftforge.client.event.EntityViewRenderEvent$FogDensity
 *  net.minecraftforge.client.event.GuiOpenEvent
 *  net.minecraftforge.client.event.MouseEvent
 *  net.minecraftforge.client.event.TextureStitchEvent$Pre
 *  net.minecraftforge.common.DimensionManager
 *  net.minecraftforge.event.entity.EntityJoinWorldEvent
 *  net.minecraftforge.event.entity.EntityStruckByLightningEvent
 *  net.minecraftforge.event.entity.living.LivingDamageEvent
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.event.entity.living.LivingDropsEvent
 *  net.minecraftforge.event.entity.living.LivingEntityUseItemEvent$Start
 *  net.minecraftforge.event.entity.living.LivingHealEvent
 *  net.minecraftforge.event.entity.living.LivingHurtEvent
 *  net.minecraftforge.event.entity.player.ItemFishedEvent
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteract
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteractSpecific
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock
 *  net.minecraftforge.event.entity.player.PlayerWakeUpEvent
 *  net.minecraftforge.event.world.BlockEvent$CropGrowEvent$Pre
 *  net.minecraftforge.event.world.WorldEvent$Load
 *  net.minecraftforge.fml.client.FMLClientHandler
 *  net.minecraftforge.fml.common.eventhandler.Event$Result
 *  net.minecraftforge.fml.common.eventhandler.EventPriority
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ServerTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$WorldTickEvent
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.apache.logging.log4j.Level
 */
package com.dhanantry.scapeandrunparasites.util.handlers;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.client.particle.ParticleBiomass;
import com.dhanantry.scapeandrunparasites.client.particle.ParticleFog;
import com.dhanantry.scapeandrunparasites.client.particle.ParticleMultipleGore;
import com.dhanantry.scapeandrunparasites.client.particle.ParticleRHappy;
import com.dhanantry.scapeandrunparasites.client.particle.ParticleSpore;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISkill;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPMalleable;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationary;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfPlayer;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.item.tool.IHaveReach;
import com.dhanantry.scapeandrunparasites.item.tool.WeaponToolArmorBase;
import com.dhanantry.scapeandrunparasites.network.SRPPacketFog;
import com.dhanantry.scapeandrunparasites.network.SRPPacketMeleeRange;
import com.dhanantry.scapeandrunparasites.network.SRPPacketMovingSound;
import com.dhanantry.scapeandrunparasites.network.SRPPacketParticle;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import com.dhanantry.scapeandrunparasites.world.SRPWorldData;
import com.dhanantry.scapeandrunparasites.world.SRPWorldEntitySpawner;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.ItemFishedEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;

public class SRPEventHandlerBus {
    public static float fog = 0.0f;
    private boolean closeG = false;
    private int counerW = 0;
    private int blockInfestedCountCooldown;
    private int blockParasiteCountCooldown;
    private int heart;

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void onWorldLoad(WorldEvent.Load event) {
        fog = 0.0f;
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(EntityViewRenderEvent.FogDensity event) {
        if (fog > 0.0f && !Minecraft.getMinecraft().player.isPotionActive(MobEffects.BLINDNESS)) {
            GlStateManager.setFog((GlStateManager.FogMode)GlStateManager.FogMode.EXP);
            event.setDensity(fog);
            event.setCanceled(true);
        }
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(EntityViewRenderEvent.FogColors event) {
        if ((double)fog > (double)SRPConfigWorld.biomeFogDensity * 0.2 && !Minecraft.getMinecraft().player.isPotionActive(MobEffects.BLINDNESS)) {
            event.setRed(SRPConfigWorld.biomeFogRed / 255.0f);
            event.setGreen(SRPConfigWorld.biomeFogGreen / 255.0f);
            event.setBlue(SRPConfigWorld.biomeFogBlue / 255.0f);
        }
    }

    @SubscribeEvent
    public void cropGrow(BlockEvent.CropGrowEvent.Pre event) {
        if (event.getResult() == Event.Result.DENY) {
            return;
        }
        if (SRPConfigWorld.nodesActivated || SRPConfigSystems.useEvolution) {
            SRPWorldData data = SRPWorldData.get(event.getWorld());
            switch (data.nearestHeartAge(event.getPos(), false, 0)) {
                case 1: {
                    if (!(event.getWorld().rand.nextDouble() < (double)SRPConfigWorld.nodeCropStopNodeOne)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 2: {
                    if (!(event.getWorld().rand.nextDouble() < (double)SRPConfigWorld.nodeCropStopNodeTwo)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 3: {
                    if (!(event.getWorld().rand.nextDouble() < (double)SRPConfigWorld.nodeCropStopNodeThree)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
            }
            switch (SRPSaveData.get(event.getWorld()).getEvolutionPhase(event.getWorld().provider.getDimension())) {
                case 1: {
                    if (!(event.getWorld().rand.nextDouble() < SRPConfigSystems.cropGrowStunnedOne)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 2: {
                    if (!(event.getWorld().rand.nextDouble() < SRPConfigSystems.cropGrowStunnedTwo)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 3: {
                    if (!(event.getWorld().rand.nextDouble() < SRPConfigSystems.cropGrowStunnedThree)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 4: {
                    if (!(event.getWorld().rand.nextDouble() < SRPConfigSystems.cropGrowStunnedFour)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 5: {
                    if (!(event.getWorld().rand.nextDouble() < SRPConfigSystems.cropGrowStunnedFive)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 6: {
                    if (!(event.getWorld().rand.nextDouble() < SRPConfigSystems.cropGrowStunnedSix)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 7: {
                    if (!(event.getWorld().rand.nextDouble() < SRPConfigSystems.cropGrowStunnedSeven)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 8: {
                    if (!(event.getWorld().rand.nextDouble() < SRPConfigSystems.cropGrowStunnedEight)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
            }
        }
    }

    @SubscribeEvent
    public void entityHeal(LivingHealEvent event) {
        if (event.isCanceled()) {
            return;
        }
        EntityLivingBase entity = event.getEntityLiving();
        if (entity == null || entity.world.isRemote) {
            return;
        }
        if (entity.world.getBiome(entity.getPosition()) instanceof BiomeParasite) {
            if (entity instanceof EntityParasiteBase) {
                return;
            }
            if (entity instanceof EntityPlayer) {
                event.setAmount(event.getAmount() * SRPConfigWorld.biomeHealPenalty);
            } else {
                boolean flag = ParasiteEventEntity.checkName(EntityList.getKey((Entity)entity).toString(), SRPConfigWorld.biomeHealPenaltyBlackList, SRPConfigWorld.biomeHealPenaltyBlackListWhite);
                if (flag) {
                    return;
                }
                event.setAmount(event.getAmount() * SRPConfigWorld.biomeHealPenalty);
            }
        }
        if (SRPConfigSystems.useEvolution && SRPSaveData.get(entity.world).getEvolutionPhase(entity.world.provider.getDimension()) >= SRPConfigSystems.evolutionNoParasiteHealing) {
            event.setAmount(event.getAmount() * SRPConfigSystems.evolutionNoParasiteHealingValue);
        }
    }

    @SubscribeEvent
    public void entityHurt(LivingHurtEvent event) {
        EntityLivingBase entity = event.getEntityLiving();
        if (entity == null || entity.world.isRemote) {
            return;
        }
        if (entity.isPotionActive(SRPPotions.VIRA_E) && SRPConfigSystems.viralEnable) {
            float amp = entity.getActivePotionEffect(SRPPotions.VIRA_E).getAmplifier() + 1;
            float damage = event.getAmount();
            event.setAmount(damage + damage * (amp * SRPConfigSystems.viralAmount));
        }
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)entity;
            int red = 0;
            float damageV = event.getAmount();
            float realRed = 0.0f;
            String damage = "";
            byte type = 0;
            boolean needCheckP = true;
            boolean paraA = false;
            for (ItemStack itemstack : player.inventory.armorInventory) {
                int i;
                NBTTagList allResI;
                NBTTagList allResS;
                if (!(itemstack.getItem() instanceof WeaponToolArmorBase)) continue;
                paraA = true;
                if (needCheckP && event.getSource().getImmediateSource() != null) {
                    if (event.getSource() == DamageSource.IN_FIRE || event.getSource() == DamageSource.ON_FIRE || player.isBurning()) {
                        event.setAmount(damageV * SRPConfig.firemultyplier);
                        return;
                    }
                    if (event.getSource().getImmediateSource() instanceof EntityPlayer) {
                        damage = event.getSource().getImmediateSource().getName();
                    } else if (event.getSource().getImmediateSource() instanceof EntityLivingBase) {
                        damage = EntityList.getKey((Entity)event.getSource().getImmediateSource()).toString();
                    } else {
                        damage = event.getSource().damageType;
                        type = 2;
                    }
                    needCheckP = false;
                }
                ArrayList<String> resistanceS = new ArrayList<String>();
                ArrayList<Integer> resistanceI = new ArrayList<Integer>();
                NBTTagCompound compound = itemstack.getTagCompound();
                boolean lag = ((WeaponToolArmorBase)itemstack.getItem()).canCall();
                if (compound == null) {
                    compound = new NBTTagCompound();
                }
                if (compound.hasKey("sprresistanceb", 99)) {
                    lag = compound.getBoolean("sprresistanceb");
                }
                if (compound.hasKey("sprresistances")) {
                    allResS = compound.getTagList("sprresistances", 10);
                    allResI = compound.getTagList("sprresistancei", 10);
                    if (allResS.tagCount() != allResI.tagCount()) {
                        return;
                    }
                    for (i = 0; i < allResS.tagCount(); ++i) {
                        NBTTagCompound resT = allResS.getCompoundTagAt(i);
                        String res = resT.getString("resistance" + i);
                        resistanceS.add(i, res);
                        NBTTagCompound resU = allResI.getCompoundTagAt(i);
                        int resi = resU.getInteger("resistance" + i);
                        resistanceI.add(i, resi);
                    }
                }
                realRed = lag ? (float)red * SRPConfig.sentientPointReduction : (float)(red += this.hasResistance(damage, resistanceS, resistanceI, lag, player.world.rand, type)) * SRPConfig.livingPointReduction;
                if (resistanceS.size() != resistanceI.size()) {
                    return;
                }
                allResS = new NBTTagList();
                allResI = new NBTTagList();
                for (i = 0; i < resistanceS.size(); ++i) {
                    String res = resistanceS.get(i);
                    NBTTagCompound resT = new NBTTagCompound();
                    resT.setString("resistance" + i, res);
                    allResS.appendTag((NBTBase)resT);
                    int resi = resistanceI.get(i);
                    NBTTagCompound resU = new NBTTagCompound();
                    resU.setInteger("resistance" + i, resi);
                    allResI.appendTag((NBTBase)resU);
                }
                compound.setTag("sprresistances", (NBTBase)allResS);
                compound.setTag("sprresistancei", (NBTBase)allResI);
                compound.setBoolean("sprresistanceb", lag);
                itemstack.setTagCompound(compound);
            }
            realRed *= damageV;
            damageV = Math.max(damageV - realRed, 0.0f);
            event.setAmount(damageV);
            if (event.getSource().getImmediateSource() instanceof EntityLivingBase && paraA && SRPConfig.armorCoth) {
                SRPPotions.applyStackPotion(SRPPotions.COTH_E, (EntityLivingBase)event.getSource().getImmediateSource(), 400, 2);
            }
        }
    }

    private int hasResistance(String damage, ArrayList<String> resistanceS, ArrayList<Integer> resistanceI, boolean stage, Random rand, byte type) {
        double getChanceLearn;
        if (this.checkList(damage, type)) {
            return 0;
        }
        double d = getChanceLearn = stage ? SRPConfig.sentientChanceLe : SRPConfig.livingChanceLe;
        if (rand.nextDouble() < getChanceLearn) {
            this.addResistance(damage, resistanceS, resistanceI, stage);
        }
        for (int i = 0; i < resistanceS.size(); ++i) {
            if (!resistanceS.get(i).equals(damage)) continue;
            int tage = SRPConfig.livingPointCap;
            if (stage) {
                tage = SRPConfig.sentientPointCap;
            }
            return Math.min(resistanceI.get(i), tage);
        }
        return 0;
    }

    private void addResistance(String damage, ArrayList<String> resistanceS, ArrayList<Integer> resistanceI, boolean stage) {
        boolean flag = true;
        for (int i = 0; i < resistanceS.size(); ++i) {
            if (!resistanceS.get(i).equals(damage)) continue;
            int iiii = resistanceI.get(i) + 1;
            resistanceI.set(i, iiii);
            flag = false;
            break;
        }
        if (flag) {
            int lim = SRPConfig.livingDamageCap;
            if (stage) {
                lim = SRPConfig.sentientDamageCap;
            }
            if (resistanceS.size() >= lim) {
                return;
            }
            resistanceS.add(damage);
            resistanceI.add(1);
        }
    }

    private boolean checkList(String damage, byte type) {
        switch (type) {
            case 0: {
                if (ParasiteEventEntity.checkName(damage, SRPConfig.armorDamageTypeBlackListMob, SRPConfig.armorDamageTypeBlackListWhite)) {
                    return true;
                }
            }
            case 2: {
                if (!ParasiteEventEntity.checkName(damage, SRPConfig.armorDamageTypeBlackListElse, SRPConfig.armorDamageTypeBlackListWhite)) break;
                return true;
            }
        }
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent
    public void stitchEventPre(TextureStitchEvent.Pre event) {
        event.getMap().registerSprite(ParticleSpore.PARTICLES_TEXTURE);
        event.getMap().registerSprite(ParticleFog.PARTICLES_TEXTURE);
        event.getMap().registerSprite(ParticleMultipleGore.PARTICLES_TEXTUREINFECTED);
        event.getMap().registerSprite(ParticleMultipleGore.PARTICLES_TEXTURESPIDER);
        event.getMap().registerSprite(ParticleMultipleGore.PARTICLES_TEXTUREPRIMITIVE);
        event.getMap().registerSprite(ParticleMultipleGore.PARTICLES_TEXTUREADAPTED);
        event.getMap().registerSprite(ParticleMultipleGore.PARTICLES_TEXTUREVOMIT);
        event.getMap().registerSprite(ParticleRHappy.PARTICLES_TEXTURE);
        event.getMap().registerSprite(ParticleBiomass.PARTICLES_TEXTURE);
    }

    @SubscribeEvent
    public void playerFishing(ItemFishedEvent event) {
        if (!event.getEntity().world.isRemote && SRPConfigSystems.useEvolution) {
            SRPWorldData data = SRPWorldData.get(event.getEntity().world);
            if (SRPSaveData.get(event.getEntity().world).getEvolutionPhase(event.getEntity().world.provider.getDimension()) >= SRPConfigSystems.evolutionStopFishing) {
                event.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public void itemEntity(PlayerInteractEvent.EntityInteract event) {
        if (event.getTarget() instanceof EntityLivingBase && !event.getWorld().isRemote) {
            ItemStack stack = event.getItemStack();
            String item = stack.getItem().getRegistryName().toString();
            String[] atm = new String[3];
            for (int i = 0; i < SRPConfigSystems.COTHItemPrevent.length; ++i) {
                atm = SRPConfigSystems.COTHItemPrevent[i].split(";");
                if (!atm[0].equals(item)) continue;
                int dur = Integer.parseInt(atm[2]);
                if (!event.getEntityPlayer().capabilities.isCreativeMode) {
                    stack.shrink(1);
                    double chance = Double.parseDouble(atm[1]);
                    if (!(event.getWorld().rand.nextDouble() < chance)) continue;
                    ((EntityLivingBase)event.getTarget()).addPotionEffect(new PotionEffect(SRPPotions.EPEL_E, dur * 20, 0));
                    SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(event.getTarget().posX, event.getTarget().posY, event.getTarget().posZ, event.getTarget().width, event.getTarget().height, 3));
                    continue;
                }
                ((EntityLivingBase)event.getTarget()).addPotionEffect(new PotionEffect(SRPPotions.EPEL_E, dur * 20, 0));
                SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(event.getTarget().posX, event.getTarget().posY, event.getTarget().posZ, event.getTarget().width, event.getTarget().height, 3));
            }
        }
    }

    @SubscribeEvent
    public void itemPlayer(LivingEntityUseItemEvent.Start event) {
        if (!(event.getEntityLiving() instanceof EntityPlayer)) {
            return;
        }
        EntityPlayer player = (EntityPlayer)event.getEntityLiving();
        if (player == null) {
            return;
        }
        if (player.isPotionActive(SRPPotions.FEAR_E) && SRPConfigSystems.fearActive) {
            if (player.getActivePotionEffect(SRPPotions.FEAR_E).getAmplifier() >= 1 && player.world.rand.nextDouble() < (double)SRPConfigSystems.fearItemChance && !ParasiteEventEntity.checkName(player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem().getRegistryName().toString(), SRPConfigSystems.fearItemBlackList, SRPConfigSystems.fearItemBlackListWhite)) {
                player.sendStatusMessage(new TextComponentTranslation("message.srparasites.fearitem", new Object[0]).setStyle(new Style().setColor(TextFormatting.RED)), true);
                event.setDuration(-1);
                event.setCanceled(true);
                return;
            }
            if (event.getItem().getItem() instanceof ItemBlock) {
                // empty if block
            }
        }
    }

    @SubscribeEvent
    public void blockPlayer(PlayerInteractEvent.RightClickBlock event) {
        EntityPlayer player = event.getEntityPlayer();
        if (player == null) {
            return;
        }
        if (player.isPotionActive(SRPPotions.FEAR_E) && SRPConfigSystems.fearActive) {
            if (player.getActivePotionEffect(SRPPotions.FEAR_E).getAmplifier() >= 2 && player.world.rand.nextDouble() < (double)SRPConfigSystems.fearBlockChance) {
                player.sendStatusMessage(new TextComponentTranslation("message.srparasites.fearblock", new Object[0]).setStyle(new Style().setColor(TextFormatting.RED)), true);
                event.setUseBlock(Event.Result.DENY);
            } else if (player.getActivePotionEffect(SRPPotions.FEAR_E).getAmplifier() >= 1 && player.world.rand.nextDouble() < (double)SRPConfigSystems.fearItemChance) {
                player.sendStatusMessage(new TextComponentTranslation("message.srparasites.fearitem", new Object[0]).setStyle(new Style().setColor(TextFormatting.RED)), true);
                event.setUseItem(Event.Result.DENY);
            }
        }
    }

    @SubscribeEvent
    public void entityPlayer(PlayerInteractEvent.EntityInteractSpecific event) {
        int heart = ParasiteEventWorld.canBiomeStillExist(event.getWorld(), event.getPos(), false);
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void guiPlayer(GuiOpenEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        EntityPlayerSP player = mc.player;
        if (player == null || event.getGui() == null) {
            return;
        }
        if (player.isCreative() || event.getGui().doesGuiPauseGame()) {
            return;
        }
        if (player.isPotionActive(SRPPotions.FEAR_E) && SRPConfigSystems.fearActive && !player.capabilities.disableDamage && player.getActivePotionEffect(SRPPotions.FEAR_E).getAmplifier() >= 3 && player.world.rand.nextDouble() < (double)SRPConfigSystems.fearInvChance) {
            player.sendStatusMessage((ITextComponent)new TextComponentTranslation("message.srparasites.feargui", new Object[0]), true);
            this.closeG = true;
        }
    }

    @SubscribeEvent
    public void mobFear(LivingDamageEvent event) {
        EntityLivingBase in = event.getEntityLiving();
        if (in == null) {
            return;
        }
        if (in.isPotionActive(SRPPotions.FEAR_E) && SRPConfigSystems.fearActive) {
            if (event.getSource() == DamageSource.FALL && SRPConfigSystems.fearFallDamage != 0.0f) {
                event.setAmount(event.getAmount() * (SRPConfigSystems.fearFallDamage * (float)(in.getActivePotionEffect(SRPPotions.FEAR_E).getAmplifier() + 1)));
            }
            if (SRPConfigSystems.fearAirDamage == 0.0f) {
                return;
            }
            if (event.getEntity() instanceof EntityPlayer) {
                if (((EntityPlayer)event.getEntity()).capabilities.isFlying) {
                    event.setAmount(event.getAmount() * (SRPConfigSystems.fearAirDamage * (float)(in.getActivePotionEffect(SRPPotions.FEAR_E).getAmplifier() + 1)));
                } else if (!event.getEntity().onGround) {
                    event.setAmount(event.getAmount() * (SRPConfigSystems.fearAirDamage * (float)(in.getActivePotionEffect(SRPPotions.FEAR_E).getAmplifier() + 1)));
                }
            }
        }
    }

    @SubscribeEvent
    public void onEntitySpawn(EntityJoinWorldEvent event) {
        if (event.getEntity() == null) {
            return;
        }
        if (event.getEntity() instanceof EntityLivingBase && !event.getEntity().world.isRemote) {
            String mobname;
            if (event.getEntity() instanceof EntityPlayer) {
                return;
            }
            try {
                mobname = EntityList.getKey((Entity)event.getEntity()).toString();
            }
            catch (Exception e) {
                SRPMain.logger.log(Level.ERROR, "Problem while spawning entity");
                return;
            }
            NBTTagCompound tags = event.getEntity().getEntityData();
            boolean parasite = event.getEntity() instanceof EntityParasiteBase;
            boolean flagNC = SRPConfigWorld.nodesActivated || SRPConfigWorld.coloniesActivated || SRPConfigSystems.useEvolution;
            SRPWorldData data = null;
            if (flagNC) {
                data = SRPWorldData.get(event.getWorld());
            }
            if (SRPConfigWorld.nodesActivated && SRPConfigSystems.cothActive && data.nearestHeartAge(event.getEntity().getPosition(), false, 0) != -1) {
                ((EntityLivingBase)event.getEntity()).addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
            }
            if (!tags.hasKey("srpcothimmunity") && SRPConfigSystems.cothActive && !parasite) {
                this.writeCOTHTag((EntityLivingBase)event.getEntity(), mobname, tags);
            }
            if (parasite) {
                this.setNewParasiteTask((EntityParasiteBase)event.getEntity(), mobname, flagNC, data);
            } else if (event.getEntity() instanceof EntityCreature) {
                this.setNewCreatureTask((EntityCreature)event.getEntity(), mobname);
            }
        }
    }

    private void writeCOTHTag(EntityLivingBase in, String mobname, NBTTagCompound tags) {
        if (in instanceof EntityArmorStand) {
            tags.setInteger("srpcothimmunity", 0);
        } else if (ParasiteEventEntity.checkName(mobname, SRPConfigSystems.COTHImmuneList, SRPConfigSystems.COTHImmuneListWhite)) {
            tags.setInteger("srpcothimmunity", 0);
        } else {
            tags.setInteger("srpcothimmunity", 1);
        }
        this.setCOTH(in, SRPSaveData.get(in.world).getEvolutionPhase(in.world.provider.getDimension()));
    }

    private void setNewParasiteTask(EntityParasiteBase entity, String mobname, boolean flagNC, SRPWorldData data) {
        if (flagNC) {
            entity.applyBonuses(data.totalColonyPoints(0), data.totalNodePoints(0), SRPSaveData.get(entity.world).getEvolutionPhase(entity.world.provider.getDimension()));
        }
        if (SRPConfig.parasiteGriefing.length != 0) {
            String[] task = new String[4];
            for (int i = 0; i < SRPConfig.parasiteGriefing.length; ++i) {
                if (SRPConfig.parasiteGriefing[i] == null || !(task = SRPConfig.parasiteGriefing[i].split(";"))[0].equals(mobname)) continue;
                if (entity instanceof EntityPStationary) {
                    entity.setSkillBreakBlocksValues(Float.parseFloat(task[1]), MathHelper.ceil((float)entity.height), Integer.parseInt(task[3]));
                    break;
                }
                entity.setSkillBreakBlocksValues(Float.parseFloat(task[1]), MathHelper.ceil((float)entity.height), Integer.parseInt(task[3]));
                entity.tasks.addTask(9, (EntityAIBase)new EntityAISkill(entity, Integer.parseInt(task[2]), 64, false, 13));
                break;
            }
        }
        if (entity instanceof EntityPMalleable) {
            EntityPMalleable uwu = (EntityPMalleable)entity;
            String damage = data.getMostCommonDamageS();
            if (damage != null) {
                for (int times = data.getMostCommonDamageI(); times > 0; --times) {
                    uwu.addResistance(damage);
                }
                uwu.increaseDamageCap(1);
                uwu.colonySpawned = true;
            }
        }
    }

    private void setNewCreatureTask(EntityCreature entity, String mobname) {
        if (ParasiteEventEntity.checkName(mobname, SRPConfig.entitiesWillAttack, SRPConfig.entitiesWillAttackWhite)) {
            entity.targetTasks.addTask(5, (EntityAIBase)new EntityAINearestAttackableTarget(entity, EntityParasiteBase.class, true));
            return;
        }
        if (ParasiteEventEntity.checkName(mobname, SRPConfig.entitiesWillAvoid, SRPConfig.entitiesWillAvoidWhite)) {
            entity.tasks.addTask(5, (EntityAIBase)new EntityAIAvoidEntity(entity, EntityParasiteBase.class, 12.0f, 0.8, 0.8));
        }
    }

    private void setCOTH(EntityLivingBase target, byte evo) {
        if (target.isChild()) {
            return;
        }
        Random rand = new Random();
        switch (evo) {
            case 1: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceOne)) break;
                target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 2: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceTwo)) break;
                target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 3: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceThree)) break;
                target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 4: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceFour)) break;
                target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 5: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceFive)) break;
                target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 6: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceSix)) break;
                target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 7: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceSeven)) break;
                target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 8: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceEight)) break;
                target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
            }
        }
    }

    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void serverTick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            return;
        }
        if (ParasiteEventWorld.blockInfestedCount > SRPConfig.BlockInfestedLimit) {
            ++this.blockInfestedCountCooldown;
            if (this.blockInfestedCountCooldown > SRPConfig.BlockInfestedLimitCD) {
                this.blockInfestedCountCooldown = 0;
                ParasiteEventWorld.blockInfestedCount = 0;
            }
        }
        if (ParasiteEventWorld.blockParasiteCount > SRPConfig.BlockParasiteLimit) {
            ++this.blockParasiteCountCooldown;
            if (this.blockParasiteCountCooldown > SRPConfig.BlockParasiteLimitCD) {
                this.blockParasiteCountCooldown = 0;
                ParasiteEventWorld.blockParasiteCount = 0;
            }
        }
        ++this.counerW;
        if (this.counerW >= SRPConfig.dayTickValue && (SRPConfigWorld.nodesActivated || SRPConfigWorld.coloniesActivated || SRPConfigSystems.useEvolution)) {
            WorldServer worldX;
            if (SRPConfigWorld.coloniesActivated) {
                for (int i : SRPConfigWorld.blackListedDimensionsColonies) {
                    worldX = DimensionManager.getWorld((int)i);
                    if (worldX == null) continue;
                    ParasiteEventWorld.checkColonyStatus((World)worldX);
                }
            }
            if (SRPConfigWorld.nodesActivated) {
                for (int i : SRPConfigWorld.blackListedDimensionsNodes) {
                    worldX = DimensionManager.getWorld((int)i);
                    if (worldX == null) continue;
                    ParasiteEventWorld.checkNodeStatus((World)worldX);
                }
            }
            this.counerW -= SRPConfig.dayTickValue;
        }
    }

    @SubscribeEvent
    public void setLoot(LivingDropsEvent event) {
        if (event.getEntityLiving() instanceof EntityParasiteBase) {
            if (!event.getEntityLiving().world.getGameRules().getBoolean("doMobLoot")) {
                return;
            }
            if (event.getEntityLiving().isPotionActive(SRPPotions.DEBAR_E)) {
                return;
            }
            EntityParasiteBase mob = (EntityParasiteBase)event.getEntityLiving();
            switch (mob.getParasiteIDRegister()) {
                case 1: {
                    this.loot(event, SRPConfigMobs.shycoLoot);
                    return;
                }
                case 51: {
                    this.loot(event, SRPConfigMobs.shycoadaptedloot);
                    return;
                }
                case 10: {
                    this.loot(event, SRPConfigMobs.noglaLoot);
                    return;
                }
                case 54: {
                    this.loot(event, SRPConfigMobs.noglaadaptedloot);
                    return;
                }
                case 4: {
                    this.loot(event, SRPConfigMobs.emanaLoot);
                    return;
                }
                case 55: {
                    this.loot(event, SRPConfigMobs.emanaadaptedloot);
                    return;
                }
                case 7: {
                    this.loot(event, SRPConfigMobs.hullLoot);
                    return;
                }
                case 52: {
                    this.loot(event, SRPConfigMobs.hulladaptedloot);
                    return;
                }
                case 8: {
                    this.loot(event, SRPConfigMobs.canraLoot);
                    return;
                }
                case 53: {
                    this.loot(event, SRPConfigMobs.canraadaptedloot);
                    return;
                }
                case 38: {
                    this.loot(event, SRPConfigMobs.arachnidaLoot);
                    return;
                }
                case 58: {
                    this.loot(event, SRPConfigMobs.arachnidaadaptedloot);
                    return;
                }
                case 37: {
                    this.loot(event, SRPConfigMobs.shycoLoot);
                    return;
                }
                case 57: {
                    this.loot(event, SRPConfigMobs.shycoLoot);
                    return;
                }
                case 66: {
                    this.loot(event, SRPConfigMobs.lumLoot);
                    return;
                }
                case 81: {
                    this.loot(event, SRPConfigMobs.lumadaptedloot);
                    return;
                }
                case 17: {
                    this.loot(event, SRPConfigMobs.zetmoLoot);
                    return;
                }
                case 56: {
                    this.loot(event, SRPConfigMobs.zetmoadaptedloot);
                    return;
                }
                case 2: {
                    this.loot(event, SRPConfigMobs.dorpaLoot);
                    return;
                }
                case 49: {
                    this.loot(event, SRPConfigMobs.infbearLoot);
                    return;
                }
                case 13: {
                    this.loot(event, SRPConfigMobs.infcowLoot);
                    return;
                }
                case 28: {
                    this.loot(event, SRPConfigMobs.infcowheadLoot);
                    return;
                }
                case 64: {
                    this.loot(event, SRPConfigMobs.infdragoneLoot);
                    return;
                }
                case 70: {
                    this.loot(event, SRPConfigMobs.infdragoneheadLoot);
                    return;
                }
                case 59: {
                    this.loot(event, SRPConfigMobs.infendermanLoot);
                    return;
                }
                case 69: {
                    this.loot(event, SRPConfigMobs.infendermanheadLoot);
                    return;
                }
                case 44: {
                    this.loot(event, SRPConfigMobs.infhorseLoot);
                    return;
                }
                case 45: {
                    this.loot(event, SRPConfigMobs.infhorseheadLoot);
                    return;
                }
                case 6: {
                    this.loot(event, SRPConfigMobs.infhumanLoot);
                    return;
                }
                case 46: {
                    this.loot(event, SRPConfigMobs.infhumanheadLoot);
                    return;
                }
                case 26: {
                    this.loot(event, SRPConfigMobs.infpigLoot);
                    return;
                }
                case 31: {
                    this.loot(event, SRPConfigMobs.infpigheadLoot);
                    return;
                }
                case 40: {
                    this.loot(event, SRPConfigMobs.infadventurerLoot);
                    return;
                }
                case 71: {
                    this.loot(event, SRPConfigMobs.infadventurerheadLoot);
                    return;
                }
                case 14: {
                    this.loot(event, SRPConfigMobs.infsheepLoot);
                    return;
                }
                case 22: {
                    this.loot(event, SRPConfigMobs.infsheepheadLoot);
                    return;
                }
                case 27: {
                    this.loot(event, SRPConfigMobs.infvillagerLoot);
                    return;
                }
                case 32: {
                    this.loot(event, SRPConfigMobs.infvillagerheadLoot);
                    return;
                }
                case 15: {
                    this.loot(event, SRPConfigMobs.infwolfLoot);
                    return;
                }
                case 21: {
                    this.loot(event, SRPConfigMobs.infwolfheadLoot);
                    return;
                }
                case 9: {
                    this.loot(event, SRPConfigMobs.alafhaLoot);
                    return;
                }
                case 25: {
                    this.loot(event, SRPConfigMobs.angedLoot);
                    return;
                }
                case 50: {
                    this.loot(event, SRPConfigMobs.esorLoot);
                    return;
                }
                case 60: {
                    this.loot(event, SRPConfigMobs.flogLoot);
                    return;
                }
                case 33: {
                    this.loot(event, SRPConfigMobs.ganroLoot);
                    return;
                }
                case 47: {
                    this.loot(event, SRPConfigMobs.ombooLoot);
                    return;
                }
                case 82: {
                    this.loot(event, SRPConfigMobs.ombooLoot);
                    return;
                }
                case 65: {
                    this.loot(event, SRPConfigMobs.jinjoLoot);
                    return;
                }
                case 85: {
                    this.loot(event, SRPConfigMobs.elviaLoot);
                    return;
                }
                case 86: {
                    this.loot(event, SRPConfigMobs.lenciaLoot);
                    return;
                }
                case 88: {
                    this.loot(event, SRPConfigMobs.vestaLoot);
                    return;
                }
                case 87: {
                    this.loot(event, SRPConfigMobs.pheonLoot);
                    return;
                }
                case 11: {
                    this.loot(event, SRPConfigMobs.butholLoot);
                    return;
                }
                case 36: {
                    this.loot(event, SRPConfigMobs.kolLoot);
                    return;
                }
                case 23: {
                    this.loot(event, SRPConfigMobs.kolLoot);
                    return;
                }
                case 5: {
                    this.loot(event, SRPConfigMobs.LodoLoot);
                    return;
                }
                case 12: {
                    this.loot(event, SRPConfigMobs.mudoLoot);
                    return;
                }
                case 76: {
                    this.loot(event, SRPConfigMobs.nuuhLoot);
                    return;
                }
                case 3: {
                    this.loot(event, SRPConfigMobs.ratholLoot);
                    return;
                }
                case 74: {
                    this.loot(event, SRPConfigMobs.ratholLoot);
                    return;
                }
                case 72: {
                    this.loot(event, SRPConfigMobs.nakLoot);
                    return;
                }
                case 29: {
                    this.loot(event, SRPConfigMobs.tonroLoot);
                    return;
                }
                case 30: {
                    this.loot(event, SRPConfigMobs.unvoLoot);
                    return;
                }
                case 16: {
                    this.loot(event, SRPConfigMobs.venkrolLoot);
                    return;
                }
                case 18: {
                    this.loot(event, SRPConfigMobs.venkrolsiiLoot);
                    return;
                }
                case 19: {
                    this.loot(event, SRPConfigMobs.venkrolsiiiLoot);
                    return;
                }
                case 41: {
                    this.loot(event, SRPConfigMobs.venkrolsivLoot);
                    return;
                }
                case 73: {
                    this.loot(event, SRPConfigMobs.dodsiLoot);
                    return;
                }
                case 77: {
                    this.loot(event, SRPConfigMobs.dodsiiLoot);
                    return;
                }
                case 78: {
                    this.loot(event, SRPConfigMobs.dodsiiiLoot);
                    return;
                }
                case 79: {
                    this.loot(event, SRPConfigMobs.dodsivLoot);
                    return;
                }
                case 62: {
                    this.loot(event, SRPConfigMobs.cruxaLoot);
                    return;
                }
                case 63: {
                    this.loot(event, SRPConfigMobs.heedLoot);
                    return;
                }
                case 48: {
                    this.loot(event, SRPConfigMobs.hostLoot);
                    return;
                }
                case 75: {
                    this.loot(event, SRPConfigMobs.herdLoot);
                    return;
                }
                case 39: {
                    this.loot(event, SRPConfigMobs.inhooSLoot);
                    return;
                }
                case 43: {
                    this.loot(event, SRPConfigMobs.inhooMLoot);
                    return;
                }
                case 80: {
                    this.loot(event, SRPConfigMobs.thrallLoot);
                    return;
                }
                case 24: {
                    this.loot(event, SRPConfigMobs.oroncoLoot);
                    return;
                }
                case 20: {
                    this.loot(event, SRPConfigMobs.terlaLoot);
                    return;
                }
                case 34: {
                    this.loot(event, SRPConfigMobs.pod1Loot);
                }
            }
        } else if (event.getEntity() instanceof EntityLivingBase && !(event.getEntity() instanceof EntityPlayer) && SRPConfigSystems.cothActive) {
            if (event.getSource().getTrueSource() instanceof EntityParasiteBase && SRPConfig.mobsKilledDropLoot) {
                event.setCanceled(true);
                return;
            }
            if (((EntityLivingBase)event.getEntity()).isPotionActive(SRPPotions.COTH_E)) {
                int key;
                NBTTagCompound tags;
                if (SRPConfigSystems.useEvolution) {
                    int key2;
                    NBTTagCompound tags2;
                    if (SRPSaveData.get(event.getEntity().world).getEvolutionPhase(event.getEntity().world.provider.getDimension()) >= SRPConfigSystems.evolutionCothStopLoot && (tags2 = event.getEntity().getEntityData()).hasKey("srpcothimmunity") && (key2 = tags2.getInteger("srpcothimmunity")) != 0) {
                        event.setCanceled(true);
                    }
                } else if (SRPConfigSystems.cothLootDisable && (tags = event.getEntity().getEntityData()).hasKey("srpcothimmunity") && (key = tags.getInteger("srpcothimmunity")) != 0) {
                    event.setCanceled(true);
                }
            }
        }
    }

    private void loot(LivingDropsEvent event, String[] drop) {
        block8: {
            try {
                int realquantity;
                int rng;
                int chance;
                int quantity;
                if (drop.length == 0) break block8;
                String[] dropping = new String[4];
                String[] dropped = new String[drop.length];
                Random rand = new Random();
                int totalFalse = 0;
                for (String s : drop) {
                    dropping = s.split(";");
                    boolean always = Boolean.parseBoolean(dropping[3]);
                    quantity = Integer.parseInt(dropping[2]);
                    chance = Integer.parseInt(dropping[1]);
                    if (always) {
                        rng = rand.nextInt(100);
                        if (rng > chance - 1) continue;
                        Item item = Item.getByNameOrId((String)dropping[0]);
                        realquantity = rand.nextInt(quantity);
                        for (int j = 0; j <= realquantity && item != null; ++j) {
                            BlockPos pos = event.getEntity().getPosition();
                            event.getDrops().add(new EntityItem(event.getEntity().getEntityWorld(), (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), new ItemStack(item)));
                        }
                        continue;
                    }
                    dropped[totalFalse] = s;
                    ++totalFalse;
                }
                if (totalFalse != 0) {
                    int n = rand.nextInt(totalFalse);
                    String[] stringItem = dropped[n].split(";");
                    quantity = Integer.parseInt(stringItem[2]);
                    chance = Integer.parseInt(stringItem[1]);
                    rng = rand.nextInt(100);
                    if (rng <= chance - 1) {
                        Item item = Item.getByNameOrId((String)stringItem[0]);
                        realquantity = rand.nextInt(quantity);
                        for (int j = 0; j <= realquantity && item != null; ++j) {
                            BlockPos pos = event.getEntity().getPosition();
                            event.getDrops().add(new EntityItem(event.getEntity().getEntityWorld(), (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), new ItemStack(item)));
                        }
                    }
                }
            }
            catch (Exception e) {
                SRPMain.logger.log(Level.ERROR, "Problem with loot event", (Throwable)e);
            }
        }
    }

    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void playerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            EntityPlayer thePlayer = event.player;
            if (thePlayer.world.isRemote) {
                if (this.closeG) {
                    if (thePlayer.openContainer != null) {
                        thePlayer.closeScreen();
                    }
                    this.closeG = false;
                }
            } else {
                SRPWorldData data;
                int age;
                boolean dlag = thePlayer.world.getBiome(thePlayer.getPosition()) instanceof BiomeParasite;
                if (ParasiteEventWorld.canBiomeStillExist(thePlayer.world, thePlayer.getPosition(), false) >= 1 || dlag) {
                    if ((fog = Math.min(fog + 4.5E-4f, SRPConfigWorld.biomeFogDensity)) < SRPConfigWorld.biomeFogDensity) {
                        SRPMain.network.sendTo((IMessage)new SRPPacketFog(fog), (EntityPlayerMP)thePlayer);
                    }
                } else if (fog > 0.0f) {
                    fog = Math.max(fog - 8.0E-4f, 0.0f);
                    SRPMain.network.sendTo((IMessage)new SRPPacketFog(fog), (EntityPlayerMP)thePlayer);
                }
                ++this.heart;
                if (this.heart < SRPConfigWorld.biomeHeartFreq) {
                    return;
                }
                this.heart = 0;
                if (dlag && (age = (data = SRPWorldData.get(thePlayer.world)).nearestHeartAge(thePlayer.getPosition(), true, 0)) > 0) {
                    int totalS = data.getDistanceSpreadByAge(age, true);
                    float vol = ((float)data.isInRangeOfHeart(thePlayer.getPosition(), totalS) / (float)totalS - 1.0f) * -1.0f;
                    SRPMain.network.sendTo((IMessage)new SRPPacketMovingSound(-1, vol), (EntityPlayerMP)thePlayer);
                }
            }
        }
    }

    @SubscribeEvent
    public void playerDeath(LivingDeathEvent event) {
        if (event.getEntity() instanceof EntityPlayer && SRPConfigSystems.cothActive && SRPConfigMobs.infadventurerEnabled && SRPConfigMobs.infadventurerSpawnBy && event.getSource().getTrueSource() instanceof EntityParasiteBase) {
            EntityPlayer player = (EntityPlayer)event.getEntity();
            if (!player.isPotionActive(SRPPotions.COTH_E)) {
                return;
            }
            World world = player.world;
            EntityInfPlayer out = new EntityInfPlayer(world);
            ItemStack head = new ItemStack(player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem());
            ItemStack legs = new ItemStack(player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem());
            ItemStack feet = new ItemStack(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());
            if (head.getItem() != Items.AIR) {
                out.setItemStackToSlot(EntityEquipmentSlot.HEAD, head);
                out.setHelmetSlot(true);
            }
            out.setItemStackToSlot(EntityEquipmentSlot.LEGS, legs);
            out.setItemStackToSlot(EntityEquipmentSlot.FEET, feet);
            out.copyLocationAndAnglesFrom((Entity)player);
            out.onInitialSpawn(world.getDifficultyForLocation(new BlockPos((Entity)out)), null);
            world.spawnEntity((Entity)out);
            world.playEvent((EntityPlayer)null, 1026, new BlockPos((Entity)out), 0);
            out.setCustomNameTag(player.getName());
            out.setAlwaysRenderNameTag(true);
            out.particleStatus((byte)7);
            out.cannotDespawn(false);
            return;
        }
    }

    @SubscribeEvent
    public void playerUp(PlayerWakeUpEvent event) {
        if (!SRPConfigSystems.useEvolution || event.getEntity().world.isRemote) {
            return;
        }
        SRPSaveData data = SRPSaveData.get(event.getEntityPlayer().world);
        World world = event.getEntityPlayer().world;
        if (event.getEntity().world.getWorldTime() % (long)SRPConfig.dayTickValue < 13000L) {
            int bonus = 1;
            if (data.getEvolutionPhase(world.provider.getDimension()) >= SRPConfigSystems.evolutionSleepDenied) {
                bonus = 5;
            }
            data.setTotalKills(world.provider.getDimension(), this.getSleepPointP(data.getEvolutionPhase(world.provider.getDimension())) * bonus, true, world, true);
        }
    }

    private int getSleepPointP(byte phase) {
        switch (phase) {
            case 0: {
                return SRPConfigSystems.sleepPenaltyZero;
            }
            case 1: {
                return SRPConfigSystems.sleepPenaltyOne;
            }
            case 2: {
                return SRPConfigSystems.sleepPenaltyTwo;
            }
            case 3: {
                return SRPConfigSystems.sleepPenaltyThree;
            }
            case 4: {
                return SRPConfigSystems.sleepPenaltyFour;
            }
            case 5: {
                return SRPConfigSystems.sleepPenaltyFive;
            }
            case 6: {
                return SRPConfigSystems.sleepPenaltySix;
            }
            case 7: {
                return SRPConfigSystems.sleepPenaltySeven;
            }
            case 8: {
                return SRPConfigSystems.sleepPenaltyEight;
            }
            case 9: {
                return SRPConfigSystems.sleepPenaltyNine;
            }
            case 10: {
                return SRPConfigSystems.sleepPenaltyTen;
            }
        }
        return 0;
    }

    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void worldTick(TickEvent.WorldTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            return;
        }
        if (!event.world.isRemote && SRPConfigSystems.useEvolution && SRPConfigSystems.phaseCustomSpawner) {
            if (event.world.getMinecraftServer() == null) {
                return;
            }
            this.tickSpawn(event.world.getMinecraftServer().getWorld(event.world.provider.getDimension()));
        }
    }

    private void tickSpawn(WorldServer server) {
        if (server.getGameRules().getBoolean("doMobSpawning") && server.getWorldInfo().getTerrainType() != WorldType.DEBUG_ALL_BLOCK_STATES) {
            SRPWorldEntitySpawner.findChunksForSpawning(server, true, false, server.getWorldInfo().getWorldTotalTime() % 400L == 0L);
        }
    }

    @SubscribeEvent
    public void light(EntityStruckByLightningEvent event) {
        if (event.getEntity() instanceof EntityParasiteBase) {
            ((EntityParasiteBase)event.getEntity()).setKillC(1000000.0);
        }
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(MouseEvent event) {
        if (SRPConfig.weaponCancelPacket) {
            return;
        }
        if (event.getButton() == 0 && event.isButtonstate()) {
            float reach;
            RayTraceResult mov;
            IHaveReach ieri;
            ItemStack itemstack;
            Minecraft mc = Minecraft.getMinecraft();
            EntityPlayerSP thePlayer = mc.player;
            if (thePlayer != null && (itemstack = thePlayer.getHeldItemMainhand()) != null && (ieri = itemstack.getItem() instanceof IHaveReach ? (IHaveReach)itemstack.getItem() : null) != null && (mov = this.getMouseOverExtended(reach = ieri.getReach())) != null && mov.entityHit != null && mov.entityHit.hurtResistantTime == 0 && mov.entityHit != thePlayer) {
                SRPMain.network.sendToServer((IMessage)new SRPPacketMeleeRange(mov.entityHit.getEntityId()));
            }
        }
    }

    private RayTraceResult getMouseOverExtended(float dist) {
        Minecraft mc = FMLClientHandler.instance().getClient();
        Entity theRenderViewEntity = mc.getRenderViewEntity();
        assert (theRenderViewEntity != null);
        AxisAlignedBB theViewBoundingBox = new AxisAlignedBB(theRenderViewEntity.posX - 0.5, theRenderViewEntity.posY - 0.0, theRenderViewEntity.posZ - 0.5, theRenderViewEntity.posX + 0.5, theRenderViewEntity.posY + 1.5, theRenderViewEntity.posZ + 0.5);
        RayTraceResult returnMOP = null;
        if (mc.world != null) {
            double var2 = dist;
            returnMOP = theRenderViewEntity.rayTrace(var2, 0.0f);
            double calcdist = var2;
            Vec3d pos = theRenderViewEntity.getPositionEyes(0.0f);
            var2 = calcdist;
            if (returnMOP != null) {
                calcdist = returnMOP.hitVec.distanceTo(pos);
            }
            Vec3d lookvec = theRenderViewEntity.getLook(0.0f);
            Vec3d var8 = pos.add(lookvec.x * var2, lookvec.y * var2, lookvec.z * var2);
            Entity pointedEntity = null;
            float var9 = 1.0f;
            List list = mc.world.getEntitiesWithinAABBExcludingEntity(theRenderViewEntity, theViewBoundingBox.expand(lookvec.x * var2, lookvec.y * var2, lookvec.z * var2).grow((double)var9, (double)var9, (double)var9));
            double d = calcdist;
            for (Entity entity : list) {
                double d1;
                if (!entity.canBeCollidedWith()) continue;
                float bordersize = entity.getCollisionBorderSize();
                AxisAlignedBB aabb = new AxisAlignedBB(entity.posX - (double)(entity.width / 2.0f), entity.posY, entity.posZ - (double)(entity.width / 2.0f), entity.posX + (double)(entity.width / 2.0f), entity.posY + (double)entity.height, entity.posZ + (double)(entity.width / 2.0f));
                aabb.expand((double)bordersize, (double)bordersize, (double)bordersize);
                RayTraceResult mop0 = aabb.calculateIntercept(pos, var8);
                if (aabb.contains(pos)) {
                    if (!(0.0 < d) && d != 0.0) continue;
                    pointedEntity = entity;
                    d = 0.0;
                    continue;
                }
                if (mop0 == null || !((d1 = pos.distanceTo(mop0.hitVec)) < d) && d != 0.0) continue;
                pointedEntity = entity;
                d = d1;
            }
            if (pointedEntity != null && (d < calcdist || returnMOP == null)) {
                returnMOP = new RayTraceResult(pointedEntity);
            }
        }
        return returnMOP;
    }
}

