/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.potion.PotionType
 *  net.minecraftforge.event.RegistryEvent$Register
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.IForgeRegistryEntry
 */
package com.dhanantry.scapeandrunparasites.init;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationary;
import com.dhanantry.scapeandrunparasites.potion.SRPEffectBase;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import java.util.UUID;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class SRPPotions {
    public static final Potion COTH_E = new SRPEffectBase("coth", true, 894258, 0, 0);
    public static final Potion FEAR_E = new SRPEffectBase("fear", true, 894257, 0, 0);
    public static final Potion RES_E = new SRPEffectBase("antimall", true, 894257, 0, 0);
    public static final Potion BLEED_E = new SRPEffectBase("bleed", true, 894257, 0, 0);
    public static final Potion CORRO_E = new SRPEffectBase("corrosive", true, 894257, 0, 0);
    public static final Potion VIRA_E = new SRPEffectBase("viral", true, 894257, 0, 0);
    public static final Potion RAGE_E = new SRPEffectBase("rage", true, 894257, 0, 0).func_111184_a(SharedMonsterAttributes.field_111263_d, UUID.randomUUID().toString(), SRPConfigSystems.rageSpeed, 2).func_111184_a(SharedMonsterAttributes.field_111264_e, UUID.randomUUID().toString(), SRPConfigSystems.rageDamage, 2);
    public static final Potion EPEL_E = new SRPEffectBase("repel", true, 894257, 0, 0);
    public static final Potion SENS_E = new SRPEffectBase("senses", true, 894257, 0, 0).func_111184_a(SharedMonsterAttributes.field_111265_b, UUID.randomUUID().toString(), 0.1, 2);
    public static final Potion PREY_E = new SRPEffectBase("prey", true, 894257, 0, 0);
    public static final Potion DEBAR_E = new SRPEffectBase("debar", true, 894258, 0, 0);
    public static final Potion DLER_E = new SRPEffectBase("needler", true, 894258, 0, 0);
    public static final Potion FOSTER_E = new SRPEffectBase("foster", true, 894258, 0, 0);
    public static final Potion LINK_E = new SRPEffectBase("link", true, 894258, 0, 0);
    public static final Potion PIVOT_E = new SRPEffectBase("pivot", true, 894258, 0, 0);
    public static final PotionType COTH_P = (PotionType)new PotionType("srparasites:coth", new PotionEffect[]{new PotionEffect(COTH_E, 2400)}).setRegistryName("srparasites:coth");
    public static final PotionType FEAR_P = (PotionType)new PotionType("srparasites:fear", new PotionEffect[]{new PotionEffect(FEAR_E, 2400)}).setRegistryName("srparasites:fear");
    public static final PotionType RES_P = (PotionType)new PotionType("srparasites:antimall", new PotionEffect[]{new PotionEffect(RES_E, 2400)}).setRegistryName("srparasites:res");
    public static final PotionType CORRO_P = (PotionType)new PotionType("srparasites:corrosive", new PotionEffect[]{new PotionEffect(CORRO_E, 2400)}).setRegistryName("srparasites:corro");
    public static final PotionType VIRA_P = (PotionType)new PotionType("srparasites:viral", new PotionEffect[]{new PotionEffect(VIRA_E, 2400)}).setRegistryName("srparasites:vira");
    public static final PotionType RAGE_P = (PotionType)new PotionType("srparasites:rage", new PotionEffect[]{new PotionEffect(RAGE_E, 2400)}).setRegistryName("srparasites:rage");
    public static final PotionType EPEL_P = (PotionType)new PotionType("srparasites:repel", new PotionEffect[]{new PotionEffect(EPEL_E, 2400)}).setRegistryName("srparasites:repel");
    public static final PotionType SENS_P = (PotionType)new PotionType("srparasites:senses", new PotionEffect[]{new PotionEffect(SENS_E, 2400)}).setRegistryName("srparasites:senses");
    public static final PotionType DEBAR_P = (PotionType)new PotionType("srparasites:debar", new PotionEffect[]{new PotionEffect(DEBAR_E, 2400)}).setRegistryName("srparasites:debar");
    public static final PotionType FOSTER_P = (PotionType)new PotionType("srparasites:foster", new PotionEffect[]{new PotionEffect(FOSTER_E, 2400)}).setRegistryName("srparasites:foster");
    public static final PotionType LINK_P = (PotionType)new PotionType("srparasites:link", new PotionEffect[]{new PotionEffect(LINK_E, 2400)}).setRegistryName("srparasites:link");
    public static final PotionType PIVOT_P = (PotionType)new PotionType("srparasites:pivot", new PotionEffect[]{new PotionEffect(PIVOT_E, 2400)}).setRegistryName("srparasites:pivot");

    public static void applyStackPotion(Potion effect, EntityLivingBase in, int duration, int amp) {
        if (amp >= 0 ? amp + 1 >= 256 : amp - 1 <= -256) {
            return;
        }
        PotionEffect flag = in.func_70660_b(effect);
        if (flag != null) {
            String name = effect.getRegistryName().toString();
            int lockAmp = 0;
            String[] here = new String[2];
            for (int i = 0; i < SRPConfig.stackablePotionsLimit.length; ++i) {
                here = SRPConfig.stackablePotionsLimit[i].split(";");
                if (!here[0].equals(name)) continue;
                lockAmp = Integer.parseInt(here[1]);
                System.out.println("p " + name + " a " + lockAmp + " f " + flag.func_76458_c());
                if (amp <= lockAmp && flag.func_76458_c() + 1 <= lockAmp) break;
                in.func_70690_d(new PotionEffect(effect, duration, lockAmp, false, false));
                return;
            }
            if (flag.func_76458_c() < amp) {
                in.func_70690_d(new PotionEffect(effect, duration, amp, false, false));
                return;
            }
            int newAmp = flag.func_76458_c();
            newAmp = newAmp < 0 ? --newAmp : ++newAmp;
            int newDur = flag.func_76459_b();
            newDur = newDur + 40 <= duration ? duration : (newDur += 10);
            in.func_70690_d(new PotionEffect(effect, newDur, newAmp, false, false));
        } else {
            in.func_70690_d(new PotionEffect(effect, duration, amp, false, false));
        }
    }

    public static boolean applySense(EntityLivingBase in, int duration, double rangeToCover, int withLimit) {
        if (in instanceof EntityPStationary) {
            return false;
        }
        if (rangeToCover >= (double)(withLimit * withLimit)) {
            return false;
        }
        double rangeB = in.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111125_b();
        if (rangeB * rangeB > rangeToCover) {
            return true;
        }
        int amp = 0;
        double bonus = rangeB * 0.1;
        int count = 0;
        boolean flag = true;
        while (flag) {
            if ((rangeB + bonus) * (rangeB + bonus) >= rangeToCover) {
                in.func_70690_d(new PotionEffect(SENS_E, duration, amp, false, false));
                flag = false;
                return true;
            }
            bonus = rangeB * (0.1 * (double)(++amp));
            if (++count <= 10) continue;
            flag = false;
            return false;
        }
        return false;
    }

    @Mod.EventBusSubscriber(modid="srparasites")
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void onEventE(RegistryEvent.Register<Potion> event) {
            IForgeRegistry registry = event.getRegistry();
            registry.register((IForgeRegistryEntry)COTH_E);
            registry.register((IForgeRegistryEntry)FEAR_E);
            registry.register((IForgeRegistryEntry)RES_E);
            registry.register((IForgeRegistryEntry)BLEED_E);
            registry.register((IForgeRegistryEntry)CORRO_E);
            registry.register((IForgeRegistryEntry)VIRA_E);
            registry.register((IForgeRegistryEntry)RAGE_E);
            registry.register((IForgeRegistryEntry)EPEL_E);
            registry.register((IForgeRegistryEntry)SENS_E);
            registry.register((IForgeRegistryEntry)PREY_E);
            registry.register((IForgeRegistryEntry)DEBAR_E);
            registry.register((IForgeRegistryEntry)DLER_E);
            registry.register((IForgeRegistryEntry)FOSTER_E);
            registry.register((IForgeRegistryEntry)LINK_E);
            registry.register((IForgeRegistryEntry)PIVOT_E);
        }

        @SubscribeEvent
        public static void onEventP(RegistryEvent.Register<PotionType> event) {
            IForgeRegistry registry = event.getRegistry();
            registry.register((IForgeRegistryEntry)COTH_P);
            registry.register((IForgeRegistryEntry)FEAR_P);
            registry.register((IForgeRegistryEntry)RES_P);
            registry.register((IForgeRegistryEntry)CORRO_P);
            registry.register((IForgeRegistryEntry)VIRA_P);
            registry.register((IForgeRegistryEntry)RAGE_P);
            registry.register((IForgeRegistryEntry)EPEL_P);
            registry.register((IForgeRegistryEntry)SENS_P);
            registry.register((IForgeRegistryEntry)DEBAR_P);
            registry.register((IForgeRegistryEntry)FOSTER_P);
            registry.register((IForgeRegistryEntry)LINK_P);
            registry.register((IForgeRegistryEntry)PIVOT_P);
        }
    }
}

