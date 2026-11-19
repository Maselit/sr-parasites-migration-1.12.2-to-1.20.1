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
        if (fog > 0.0f && !Minecraft.func_71410_x().field_71439_g.func_70644_a(MobEffects.field_76440_q)) {
            GlStateManager.func_187430_a((GlStateManager.FogMode)GlStateManager.FogMode.EXP);
            event.setDensity(fog);
            event.setCanceled(true);
        }
    }

    @SideOnly(value=Side.CLIENT)
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(EntityViewRenderEvent.FogColors event) {
        if ((double)fog > (double)SRPConfigWorld.biomeFogDensity * 0.2 && !Minecraft.func_71410_x().field_71439_g.func_70644_a(MobEffects.field_76440_q)) {
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
                    if (!(event.getWorld().field_73012_v.nextDouble() < (double)SRPConfigWorld.nodeCropStopNodeOne)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 2: {
                    if (!(event.getWorld().field_73012_v.nextDouble() < (double)SRPConfigWorld.nodeCropStopNodeTwo)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 3: {
                    if (!(event.getWorld().field_73012_v.nextDouble() < (double)SRPConfigWorld.nodeCropStopNodeThree)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
            }
            switch (SRPSaveData.get(event.getWorld()).getEvolutionPhase(event.getWorld().field_73011_w.getDimension())) {
                case 1: {
                    if (!(event.getWorld().field_73012_v.nextDouble() < SRPConfigSystems.cropGrowStunnedOne)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 2: {
                    if (!(event.getWorld().field_73012_v.nextDouble() < SRPConfigSystems.cropGrowStunnedTwo)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 3: {
                    if (!(event.getWorld().field_73012_v.nextDouble() < SRPConfigSystems.cropGrowStunnedThree)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 4: {
                    if (!(event.getWorld().field_73012_v.nextDouble() < SRPConfigSystems.cropGrowStunnedFour)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 5: {
                    if (!(event.getWorld().field_73012_v.nextDouble() < SRPConfigSystems.cropGrowStunnedFive)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 6: {
                    if (!(event.getWorld().field_73012_v.nextDouble() < SRPConfigSystems.cropGrowStunnedSix)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 7: {
                    if (!(event.getWorld().field_73012_v.nextDouble() < SRPConfigSystems.cropGrowStunnedSeven)) break;
                    event.setResult(Event.Result.DENY);
                    return;
                }
                case 8: {
                    if (!(event.getWorld().field_73012_v.nextDouble() < SRPConfigSystems.cropGrowStunnedEight)) break;
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
        if (entity == null || entity.field_70170_p.field_72995_K) {
            return;
        }
        if (entity.field_70170_p.func_180494_b(entity.func_180425_c()) instanceof BiomeParasite) {
            if (entity instanceof EntityParasiteBase) {
                return;
            }
            if (entity instanceof EntityPlayer) {
                event.setAmount(event.getAmount() * SRPConfigWorld.biomeHealPenalty);
            } else {
                boolean flag = ParasiteEventEntity.checkName(EntityList.func_191301_a((Entity)entity).toString(), SRPConfigWorld.biomeHealPenaltyBlackList, SRPConfigWorld.biomeHealPenaltyBlackListWhite);
                if (flag) {
                    return;
                }
                event.setAmount(event.getAmount() * SRPConfigWorld.biomeHealPenalty);
            }
        }
        if (SRPConfigSystems.useEvolution && SRPSaveData.get(entity.field_70170_p).getEvolutionPhase(entity.field_70170_p.field_73011_w.getDimension()) >= SRPConfigSystems.evolutionNoParasiteHealing) {
            event.setAmount(event.getAmount() * SRPConfigSystems.evolutionNoParasiteHealingValue);
        }
    }

    @SubscribeEvent
    public void entityHurt(LivingHurtEvent event) {
        EntityLivingBase entity = event.getEntityLiving();
        if (entity == null || entity.field_70170_p.field_72995_K) {
            return;
        }
        if (entity.func_70644_a(SRPPotions.VIRA_E) && SRPConfigSystems.viralEnable) {
            float amp = entity.func_70660_b(SRPPotions.VIRA_E).func_76458_c() + 1;
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
            for (ItemStack itemstack : player.field_71071_by.field_70460_b) {
                int i;
                NBTTagList allResI;
                NBTTagList allResS;
                if (!(itemstack.func_77973_b() instanceof WeaponToolArmorBase)) continue;
                paraA = true;
                if (needCheckP && event.getSource().func_76364_f() != null) {
                    if (event.getSource() == DamageSource.field_76372_a || event.getSource() == DamageSource.field_76370_b || player.func_70027_ad()) {
                        event.setAmount(damageV * SRPConfig.firemultyplier);
                        return;
                    }
                    if (event.getSource().func_76364_f() instanceof EntityPlayer) {
                        damage = event.getSource().func_76364_f().func_70005_c_();
                    } else if (event.getSource().func_76364_f() instanceof EntityLivingBase) {
                        damage = EntityList.func_191301_a((Entity)event.getSource().func_76364_f()).toString();
                    } else {
                        damage = event.getSource().field_76373_n;
                        type = 2;
                    }
                    needCheckP = false;
                }
                ArrayList<String> resistanceS = new ArrayList<String>();
                ArrayList<Integer> resistanceI = new ArrayList<Integer>();
                NBTTagCompound compound = itemstack.func_77978_p();
                boolean lag = ((WeaponToolArmorBase)itemstack.func_77973_b()).canCall();
                if (compound == null) {
                    compound = new NBTTagCompound();
                }
                if (compound.func_150297_b("sprresistanceb", 99)) {
                    lag = compound.func_74767_n("sprresistanceb");
                }
                if (compound.func_74764_b("sprresistances")) {
                    allResS = compound.func_150295_c("sprresistances", 10);
                    allResI = compound.func_150295_c("sprresistancei", 10);
                    if (allResS.func_74745_c() != allResI.func_74745_c()) {
                        return;
                    }
                    for (i = 0; i < allResS.func_74745_c(); ++i) {
                        NBTTagCompound resT = allResS.func_150305_b(i);
                        String res = resT.func_74779_i("resistance" + i);
                        resistanceS.add(i, res);
                        NBTTagCompound resU = allResI.func_150305_b(i);
                        int resi = resU.func_74762_e("resistance" + i);
                        resistanceI.add(i, resi);
                    }
                }
                realRed = lag ? (float)red * SRPConfig.sentientPointReduction : (float)(red += this.hasResistance(damage, resistanceS, resistanceI, lag, player.field_70170_p.field_73012_v, type)) * SRPConfig.livingPointReduction;
                if (resistanceS.size() != resistanceI.size()) {
                    return;
                }
                allResS = new NBTTagList();
                allResI = new NBTTagList();
                for (i = 0; i < resistanceS.size(); ++i) {
                    String res = resistanceS.get(i);
                    NBTTagCompound resT = new NBTTagCompound();
                    resT.func_74778_a("resistance" + i, res);
                    allResS.func_74742_a((NBTBase)resT);
                    int resi = resistanceI.get(i);
                    NBTTagCompound resU = new NBTTagCompound();
                    resU.func_74768_a("resistance" + i, resi);
                    allResI.func_74742_a((NBTBase)resU);
                }
                compound.func_74782_a("sprresistances", (NBTBase)allResS);
                compound.func_74782_a("sprresistancei", (NBTBase)allResI);
                compound.func_74757_a("sprresistanceb", lag);
                itemstack.func_77982_d(compound);
            }
            realRed *= damageV;
            damageV = Math.max(damageV - realRed, 0.0f);
            event.setAmount(damageV);
            if (event.getSource().func_76364_f() instanceof EntityLivingBase && paraA && SRPConfig.armorCoth) {
                SRPPotions.applyStackPotion(SRPPotions.COTH_E, (EntityLivingBase)event.getSource().func_76364_f(), 400, 2);
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
        event.getMap().func_174942_a(ParticleSpore.PARTICLES_TEXTURE);
        event.getMap().func_174942_a(ParticleFog.PARTICLES_TEXTURE);
        event.getMap().func_174942_a(ParticleMultipleGore.PARTICLES_TEXTUREINFECTED);
        event.getMap().func_174942_a(ParticleMultipleGore.PARTICLES_TEXTURESPIDER);
        event.getMap().func_174942_a(ParticleMultipleGore.PARTICLES_TEXTUREPRIMITIVE);
        event.getMap().func_174942_a(ParticleMultipleGore.PARTICLES_TEXTUREADAPTED);
        event.getMap().func_174942_a(ParticleMultipleGore.PARTICLES_TEXTUREVOMIT);
        event.getMap().func_174942_a(ParticleRHappy.PARTICLES_TEXTURE);
        event.getMap().func_174942_a(ParticleBiomass.PARTICLES_TEXTURE);
    }

    @SubscribeEvent
    public void playerFishing(ItemFishedEvent event) {
        if (!event.getEntity().field_70170_p.field_72995_K && SRPConfigSystems.useEvolution) {
            SRPWorldData data = SRPWorldData.get(event.getEntity().field_70170_p);
            if (SRPSaveData.get(event.getEntity().field_70170_p).getEvolutionPhase(event.getEntity().field_70170_p.field_73011_w.getDimension()) >= SRPConfigSystems.evolutionStopFishing) {
                event.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public void itemEntity(PlayerInteractEvent.EntityInteract event) {
        if (event.getTarget() instanceof EntityLivingBase && !event.getWorld().field_72995_K) {
            ItemStack stack = event.getItemStack();
            String item = stack.func_77973_b().getRegistryName().toString();
            String[] atm = new String[3];
            for (int i = 0; i < SRPConfigSystems.COTHItemPrevent.length; ++i) {
                atm = SRPConfigSystems.COTHItemPrevent[i].split(";");
                if (!atm[0].equals(item)) continue;
                int dur = Integer.parseInt(atm[2]);
                if (!event.getEntityPlayer().field_71075_bZ.field_75098_d) {
                    stack.func_190918_g(1);
                    double chance = Double.parseDouble(atm[1]);
                    if (!(event.getWorld().field_73012_v.nextDouble() < chance)) continue;
                    ((EntityLivingBase)event.getTarget()).func_70690_d(new PotionEffect(SRPPotions.EPEL_E, dur * 20, 0));
                    SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(event.getTarget().field_70165_t, event.getTarget().field_70163_u, event.getTarget().field_70161_v, event.getTarget().field_70130_N, event.getTarget().field_70131_O, 3));
                    continue;
                }
                ((EntityLivingBase)event.getTarget()).func_70690_d(new PotionEffect(SRPPotions.EPEL_E, dur * 20, 0));
                SRPMain.network.sendToAll((IMessage)new SRPPacketParticle(event.getTarget().field_70165_t, event.getTarget().field_70163_u, event.getTarget().field_70161_v, event.getTarget().field_70130_N, event.getTarget().field_70131_O, 3));
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
        if (player.func_70644_a(SRPPotions.FEAR_E) && SRPConfigSystems.fearActive) {
            if (player.func_70660_b(SRPPotions.FEAR_E).func_76458_c() >= 1 && player.field_70170_p.field_73012_v.nextDouble() < (double)SRPConfigSystems.fearItemChance && !ParasiteEventEntity.checkName(player.func_184582_a(EntityEquipmentSlot.MAINHAND).func_77973_b().getRegistryName().toString(), SRPConfigSystems.fearItemBlackList, SRPConfigSystems.fearItemBlackListWhite)) {
                player.func_146105_b(new TextComponentTranslation("message.srparasites.fearitem", new Object[0]).func_150255_a(new Style().func_150238_a(TextFormatting.RED)), true);
                event.setDuration(-1);
                event.setCanceled(true);
                return;
            }
            if (event.getItem().func_77973_b() instanceof ItemBlock) {
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
        if (player.func_70644_a(SRPPotions.FEAR_E) && SRPConfigSystems.fearActive) {
            if (player.func_70660_b(SRPPotions.FEAR_E).func_76458_c() >= 2 && player.field_70170_p.field_73012_v.nextDouble() < (double)SRPConfigSystems.fearBlockChance) {
                player.func_146105_b(new TextComponentTranslation("message.srparasites.fearblock", new Object[0]).func_150255_a(new Style().func_150238_a(TextFormatting.RED)), true);
                event.setUseBlock(Event.Result.DENY);
            } else if (player.func_70660_b(SRPPotions.FEAR_E).func_76458_c() >= 1 && player.field_70170_p.field_73012_v.nextDouble() < (double)SRPConfigSystems.fearItemChance) {
                player.func_146105_b(new TextComponentTranslation("message.srparasites.fearitem", new Object[0]).func_150255_a(new Style().func_150238_a(TextFormatting.RED)), true);
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
        Minecraft mc = Minecraft.func_71410_x();
        EntityPlayerSP player = mc.field_71439_g;
        if (player == null || event.getGui() == null) {
            return;
        }
        if (player.func_184812_l_() || event.getGui().func_73868_f()) {
            return;
        }
        if (player.func_70644_a(SRPPotions.FEAR_E) && SRPConfigSystems.fearActive && !player.field_71075_bZ.field_75102_a && player.func_70660_b(SRPPotions.FEAR_E).func_76458_c() >= 3 && player.field_70170_p.field_73012_v.nextDouble() < (double)SRPConfigSystems.fearInvChance) {
            player.func_146105_b((ITextComponent)new TextComponentTranslation("message.srparasites.feargui", new Object[0]), true);
            this.closeG = true;
        }
    }

    @SubscribeEvent
    public void mobFear(LivingDamageEvent event) {
        EntityLivingBase in = event.getEntityLiving();
        if (in == null) {
            return;
        }
        if (in.func_70644_a(SRPPotions.FEAR_E) && SRPConfigSystems.fearActive) {
            if (event.getSource() == DamageSource.field_76379_h && SRPConfigSystems.fearFallDamage != 0.0f) {
                event.setAmount(event.getAmount() * (SRPConfigSystems.fearFallDamage * (float)(in.func_70660_b(SRPPotions.FEAR_E).func_76458_c() + 1)));
            }
            if (SRPConfigSystems.fearAirDamage == 0.0f) {
                return;
            }
            if (event.getEntity() instanceof EntityPlayer) {
                if (((EntityPlayer)event.getEntity()).field_71075_bZ.field_75100_b) {
                    event.setAmount(event.getAmount() * (SRPConfigSystems.fearAirDamage * (float)(in.func_70660_b(SRPPotions.FEAR_E).func_76458_c() + 1)));
                } else if (!event.getEntity().field_70122_E) {
                    event.setAmount(event.getAmount() * (SRPConfigSystems.fearAirDamage * (float)(in.func_70660_b(SRPPotions.FEAR_E).func_76458_c() + 1)));
                }
            }
        }
    }

    @SubscribeEvent
    public void onEntitySpawn(EntityJoinWorldEvent event) {
        if (event.getEntity() == null) {
            return;
        }
        if (event.getEntity() instanceof EntityLivingBase && !event.getEntity().field_70170_p.field_72995_K) {
            String mobname;
            if (event.getEntity() instanceof EntityPlayer) {
                return;
            }
            try {
                mobname = EntityList.func_191301_a((Entity)event.getEntity()).toString();
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
            if (SRPConfigWorld.nodesActivated && SRPConfigSystems.cothActive && data.nearestHeartAge(event.getEntity().func_180425_c(), false, 0) != -1) {
                ((EntityLivingBase)event.getEntity()).func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
            }
            if (!tags.func_74764_b("srpcothimmunity") && SRPConfigSystems.cothActive && !parasite) {
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
            tags.func_74768_a("srpcothimmunity", 0);
        } else if (ParasiteEventEntity.checkName(mobname, SRPConfigSystems.COTHImmuneList, SRPConfigSystems.COTHImmuneListWhite)) {
            tags.func_74768_a("srpcothimmunity", 0);
        } else {
            tags.func_74768_a("srpcothimmunity", 1);
        }
        this.setCOTH(in, SRPSaveData.get(in.field_70170_p).getEvolutionPhase(in.field_70170_p.field_73011_w.getDimension()));
    }

    private void setNewParasiteTask(EntityParasiteBase entity, String mobname, boolean flagNC, SRPWorldData data) {
        if (flagNC) {
            entity.applyBonuses(data.totalColonyPoints(0), data.totalNodePoints(0), SRPSaveData.get(entity.field_70170_p).getEvolutionPhase(entity.field_70170_p.field_73011_w.getDimension()));
        }
        if (SRPConfig.parasiteGriefing.length != 0) {
            String[] task = new String[4];
            for (int i = 0; i < SRPConfig.parasiteGriefing.length; ++i) {
                if (SRPConfig.parasiteGriefing[i] == null || !(task = SRPConfig.parasiteGriefing[i].split(";"))[0].equals(mobname)) continue;
                if (entity instanceof EntityPStationary) {
                    entity.setSkillBreakBlocksValues(Float.parseFloat(task[1]), MathHelper.func_76123_f((float)entity.field_70131_O), Integer.parseInt(task[3]));
                    break;
                }
                entity.setSkillBreakBlocksValues(Float.parseFloat(task[1]), MathHelper.func_76123_f((float)entity.field_70131_O), Integer.parseInt(task[3]));
                entity.field_70714_bg.func_75776_a(9, (EntityAIBase)new EntityAISkill(entity, Integer.parseInt(task[2]), 64, false, 13));
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
            entity.field_70715_bh.func_75776_a(5, (EntityAIBase)new EntityAINearestAttackableTarget(entity, EntityParasiteBase.class, true));
            return;
        }
        if (ParasiteEventEntity.checkName(mobname, SRPConfig.entitiesWillAvoid, SRPConfig.entitiesWillAvoidWhite)) {
            entity.field_70714_bg.func_75776_a(5, (EntityAIBase)new EntityAIAvoidEntity(entity, EntityParasiteBase.class, 12.0f, 0.8, 0.8));
        }
    }

    private void setCOTH(EntityLivingBase target, byte evo) {
        if (target.func_70631_g_()) {
            return;
        }
        Random rand = new Random();
        switch (evo) {
            case 1: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceOne)) break;
                target.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 2: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceTwo)) break;
                target.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 3: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceThree)) break;
                target.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 4: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceFour)) break;
                target.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 5: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceFive)) break;
                target.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 6: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceSix)) break;
                target.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 7: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceSeven)) break;
                target.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                break;
            }
            case 8: {
                if (!(rand.nextDouble() < SRPConfigSystems.mobSpawningCOTHChanceEight)) break;
                target.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
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
            if (!event.getEntityLiving().field_70170_p.func_82736_K().func_82766_b("doMobLoot")) {
                return;
            }
            if (event.getEntityLiving().func_70644_a(SRPPotions.DEBAR_E)) {
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
            if (event.getSource().func_76346_g() instanceof EntityParasiteBase && SRPConfig.mobsKilledDropLoot) {
                event.setCanceled(true);
                return;
            }
            if (((EntityLivingBase)event.getEntity()).func_70644_a(SRPPotions.COTH_E)) {
                int key;
                NBTTagCompound tags;
                if (SRPConfigSystems.useEvolution) {
                    int key2;
                    NBTTagCompound tags2;
                    if (SRPSaveData.get(event.getEntity().field_70170_p).getEvolutionPhase(event.getEntity().field_70170_p.field_73011_w.getDimension()) >= SRPConfigSystems.evolutionCothStopLoot && (tags2 = event.getEntity().getEntityData()).func_74764_b("srpcothimmunity") && (key2 = tags2.func_74762_e("srpcothimmunity")) != 0) {
                        event.setCanceled(true);
                    }
                } else if (SRPConfigSystems.cothLootDisable && (tags = event.getEntity().getEntityData()).func_74764_b("srpcothimmunity") && (key = tags.func_74762_e("srpcothimmunity")) != 0) {
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
                        Item item = Item.func_111206_d((String)dropping[0]);
                        realquantity = rand.nextInt(quantity);
                        for (int j = 0; j <= realquantity && item != null; ++j) {
                            BlockPos pos = event.getEntity().func_180425_c();
                            event.getDrops().add(new EntityItem(event.getEntity().func_130014_f_(), (double)pos.func_177958_n(), (double)pos.func_177956_o(), (double)pos.func_177952_p(), new ItemStack(item)));
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
                        Item item = Item.func_111206_d((String)stringItem[0]);
                        realquantity = rand.nextInt(quantity);
                        for (int j = 0; j <= realquantity && item != null; ++j) {
                            BlockPos pos = event.getEntity().func_180425_c();
                            event.getDrops().add(new EntityItem(event.getEntity().func_130014_f_(), (double)pos.func_177958_n(), (double)pos.func_177956_o(), (double)pos.func_177952_p(), new ItemStack(item)));
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
            if (thePlayer.field_70170_p.field_72995_K) {
                if (this.closeG) {
                    if (thePlayer.field_71070_bA != null) {
                        thePlayer.func_71053_j();
                    }
                    this.closeG = false;
                }
            } else {
                SRPWorldData data;
                int age;
                boolean dlag = thePlayer.field_70170_p.func_180494_b(thePlayer.func_180425_c()) instanceof BiomeParasite;
                if (ParasiteEventWorld.canBiomeStillExist(thePlayer.field_70170_p, thePlayer.func_180425_c(), false) >= 1 || dlag) {
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
                if (dlag && (age = (data = SRPWorldData.get(thePlayer.field_70170_p)).nearestHeartAge(thePlayer.func_180425_c(), true, 0)) > 0) {
                    int totalS = data.getDistanceSpreadByAge(age, true);
                    float vol = ((float)data.isInRangeOfHeart(thePlayer.func_180425_c(), totalS) / (float)totalS - 1.0f) * -1.0f;
                    SRPMain.network.sendTo((IMessage)new SRPPacketMovingSound(-1, vol), (EntityPlayerMP)thePlayer);
                }
            }
        }
    }

    @SubscribeEvent
    public void playerDeath(LivingDeathEvent event) {
        if (event.getEntity() instanceof EntityPlayer && SRPConfigSystems.cothActive && SRPConfigMobs.infadventurerEnabled && SRPConfigMobs.infadventurerSpawnBy && event.getSource().func_76346_g() instanceof EntityParasiteBase) {
            EntityPlayer player = (EntityPlayer)event.getEntity();
            if (!player.func_70644_a(SRPPotions.COTH_E)) {
                return;
            }
            World world = player.field_70170_p;
            EntityInfPlayer out = new EntityInfPlayer(world);
            ItemStack head = new ItemStack(player.func_184582_a(EntityEquipmentSlot.HEAD).func_77973_b());
            ItemStack legs = new ItemStack(player.func_184582_a(EntityEquipmentSlot.LEGS).func_77973_b());
            ItemStack feet = new ItemStack(player.func_184582_a(EntityEquipmentSlot.FEET).func_77973_b());
            if (head.func_77973_b() != Items.field_190931_a) {
                out.func_184201_a(EntityEquipmentSlot.HEAD, head);
                out.setHelmetSlot(true);
            }
            out.func_184201_a(EntityEquipmentSlot.LEGS, legs);
            out.func_184201_a(EntityEquipmentSlot.FEET, feet);
            out.func_82149_j((Entity)player);
            out.func_180482_a(world.func_175649_E(new BlockPos((Entity)out)), null);
            world.func_72838_d((Entity)out);
            world.func_180498_a((EntityPlayer)null, 1026, new BlockPos((Entity)out), 0);
            out.func_96094_a(player.func_70005_c_());
            out.func_174805_g(true);
            out.particleStatus((byte)7);
            out.cannotDespawn(false);
            return;
        }
    }

    @SubscribeEvent
    public void playerUp(PlayerWakeUpEvent event) {
        if (!SRPConfigSystems.useEvolution || event.getEntity().field_70170_p.field_72995_K) {
            return;
        }
        SRPSaveData data = SRPSaveData.get(event.getEntityPlayer().field_70170_p);
        World world = event.getEntityPlayer().field_70170_p;
        if (event.getEntity().field_70170_p.func_72820_D() % (long)SRPConfig.dayTickValue < 13000L) {
            int bonus = 1;
            if (data.getEvolutionPhase(world.field_73011_w.getDimension()) >= SRPConfigSystems.evolutionSleepDenied) {
                bonus = 5;
            }
            data.setTotalKills(world.field_73011_w.getDimension(), this.getSleepPointP(data.getEvolutionPhase(world.field_73011_w.getDimension())) * bonus, true, world, true);
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
        if (!event.world.field_72995_K && SRPConfigSystems.useEvolution && SRPConfigSystems.phaseCustomSpawner) {
            if (event.world.func_73046_m() == null) {
                return;
            }
            this.tickSpawn(event.world.func_73046_m().func_71218_a(event.world.field_73011_w.getDimension()));
        }
    }

    private void tickSpawn(WorldServer server) {
        if (server.func_82736_K().func_82766_b("doMobSpawning") && server.func_72912_H().func_76067_t() != WorldType.field_180272_g) {
            SRPWorldEntitySpawner.findChunksForSpawning(server, true, false, server.func_72912_H().func_82573_f() % 400L == 0L);
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
            Minecraft mc = Minecraft.func_71410_x();
            EntityPlayerSP thePlayer = mc.field_71439_g;
            if (thePlayer != null && (itemstack = thePlayer.func_184614_ca()) != null && (ieri = itemstack.func_77973_b() instanceof IHaveReach ? (IHaveReach)itemstack.func_77973_b() : null) != null && (mov = this.getMouseOverExtended(reach = ieri.getReach())) != null && mov.field_72308_g != null && mov.field_72308_g.field_70172_ad == 0 && mov.field_72308_g != thePlayer) {
                SRPMain.network.sendToServer((IMessage)new SRPPacketMeleeRange(mov.field_72308_g.func_145782_y()));
            }
        }
    }

    private RayTraceResult getMouseOverExtended(float dist) {
        Minecraft mc = FMLClientHandler.instance().getClient();
        Entity theRenderViewEntity = mc.func_175606_aa();
        assert (theRenderViewEntity != null);
        AxisAlignedBB theViewBoundingBox = new AxisAlignedBB(theRenderViewEntity.field_70165_t - 0.5, theRenderViewEntity.field_70163_u - 0.0, theRenderViewEntity.field_70161_v - 0.5, theRenderViewEntity.field_70165_t + 0.5, theRenderViewEntity.field_70163_u + 1.5, theRenderViewEntity.field_70161_v + 0.5);
        RayTraceResult returnMOP = null;
        if (mc.field_71441_e != null) {
            double var2 = dist;
            returnMOP = theRenderViewEntity.func_174822_a(var2, 0.0f);
            double calcdist = var2;
            Vec3d pos = theRenderViewEntity.func_174824_e(0.0f);
            var2 = calcdist;
            if (returnMOP != null) {
                calcdist = returnMOP.field_72307_f.func_72438_d(pos);
            }
            Vec3d lookvec = theRenderViewEntity.func_70676_i(0.0f);
            Vec3d var8 = pos.func_72441_c(lookvec.field_72450_a * var2, lookvec.field_72448_b * var2, lookvec.field_72449_c * var2);
            Entity pointedEntity = null;
            float var9 = 1.0f;
            List list = mc.field_71441_e.func_72839_b(theRenderViewEntity, theViewBoundingBox.func_72321_a(lookvec.field_72450_a * var2, lookvec.field_72448_b * var2, lookvec.field_72449_c * var2).func_72314_b((double)var9, (double)var9, (double)var9));
            double d = calcdist;
            for (Entity entity : list) {
                double d1;
                if (!entity.func_70067_L()) continue;
                float bordersize = entity.func_70111_Y();
                AxisAlignedBB aabb = new AxisAlignedBB(entity.field_70165_t - (double)(entity.field_70130_N / 2.0f), entity.field_70163_u, entity.field_70161_v - (double)(entity.field_70130_N / 2.0f), entity.field_70165_t + (double)(entity.field_70130_N / 2.0f), entity.field_70163_u + (double)entity.field_70131_O, entity.field_70161_v + (double)(entity.field_70130_N / 2.0f));
                aabb.func_72321_a((double)bordersize, (double)bordersize, (double)bordersize);
                RayTraceResult mop0 = aabb.func_72327_a(pos, var8);
                if (aabb.func_72318_a(pos)) {
                    if (!(0.0 < d) && d != 0.0) continue;
                    pointedEntity = entity;
                    d = 0.0;
                    continue;
                }
                if (mop0 == null || !((d1 = pos.func_72438_d(mop0.field_72307_f)) < d) && d != 0.0) continue;
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

