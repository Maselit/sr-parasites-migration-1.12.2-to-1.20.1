package com.dhanantry.scapeandrunparasites.init;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.potion.SRPEffectBase;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.RegistryObject;

/**
 * Migracion de SRPPotions a 1.20.1 (DeferredRegister<MobEffect>).
 * STUB: los efectos son esqueletos; la logica real (performEffect) se migrara en lotes.
 * Nota: PotionType no existe en 1.20.1; las pociones de cerveza son data-driven (JSON).
 */
public class SRPPotions {
    public static final RegistryObject<MobEffect> COTH_E =
        SRPMain.MOB_EFFECTS.register("coth", () -> new SRPEffectBase("coth", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> FEAR_E =
        SRPMain.MOB_EFFECTS.register("fear", () -> new SRPEffectBase("fear", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> RES_E =
        SRPMain.MOB_EFFECTS.register("antimall", () -> new SRPEffectBase("antimall", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> BLEED_E =
        SRPMain.MOB_EFFECTS.register("bleed", () -> new SRPEffectBase("bleed", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> CORRO_E =
        SRPMain.MOB_EFFECTS.register("corrosive", () -> new SRPEffectBase("corrosive", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> VIRA_E =
        SRPMain.MOB_EFFECTS.register("viral", () -> new SRPEffectBase("viral", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> RAGE_E =
        SRPMain.MOB_EFFECTS.register("rage", () -> new SRPEffectBase("rage", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> EPEL_E =
        SRPMain.MOB_EFFECTS.register("repel", () -> new SRPEffectBase("repel", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> SENS_E =
        SRPMain.MOB_EFFECTS.register("senses", () -> new SRPEffectBase("senses", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> PREY_E =
        SRPMain.MOB_EFFECTS.register("prey", () -> new SRPEffectBase("prey", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> DEBAR_E =
        SRPMain.MOB_EFFECTS.register("debar", () -> new SRPEffectBase("debar", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> DLER_E =
        SRPMain.MOB_EFFECTS.register("needler", () -> new SRPEffectBase("needler", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> FOSTER_E =
        SRPMain.MOB_EFFECTS.register("foster", () -> new SRPEffectBase("foster", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> LINK_E =
        SRPMain.MOB_EFFECTS.register("link", () -> new SRPEffectBase("link", true, 894258, 0, 0));
    public static final RegistryObject<MobEffect> PIVOT_E =
        SRPMain.MOB_EFFECTS.register("pivot", () -> new SRPEffectBase("pivot", true, 894258, 0, 0));

    public static void applyStackPotion(MobEffect effect, net.minecraft.world.entity.LivingEntity in, int duration, int amp) {
        if (amp >= 0 ? amp + 1 >= 256 : amp - 1 <= -256) {
            return;
        }
        net.minecraft.world.effect.MobEffectInstance flag = in.getEffect(effect);
        if (flag != null) {
            String name = net.minecraft.core.registries.BuiltInRegistries.MOB_EFFECT.getKey(effect).toString();
            int lockAmp = 0;
            String[] here = new String[2];
            for (int i = 0; i < com.dhanantry.scapeandrunparasites.util.config.SRPConfig.stackablePotionsLimit.length; ++i) {
                here = com.dhanantry.scapeandrunparasites.util.config.SRPConfig.stackablePotionsLimit[i].split(";");
                if (here.length < 2 || !here[0].equals(name)) continue;
                lockAmp = Integer.parseInt(here[1]);
                if (amp <= lockAmp && flag.getAmplifier() + 1 <= lockAmp) break;
                in.addEffect(new net.minecraft.world.effect.MobEffectInstance(effect, duration, lockAmp, false, false));
                return;
            }
            if (flag.getAmplifier() < amp) {
                in.addEffect(new net.minecraft.world.effect.MobEffectInstance(effect, duration, amp, false, false));
                return;
            }
            int newAmp = flag.getAmplifier();
            newAmp = newAmp < 0 ? --newAmp : ++newAmp;
            int newDur = flag.getDuration();
            newDur = newDur + 40 <= duration ? duration : (newDur += 10);
            in.addEffect(new net.minecraft.world.effect.MobEffectInstance(effect, newDur, newAmp, false, false));
        } else {
            in.addEffect(new net.minecraft.world.effect.MobEffectInstance(effect, duration, amp, false, false));
        }
    }

    public static boolean applySense(net.minecraft.world.entity.LivingEntity in, int duration, double rangeToCover, int withLimit) {
        // STUB: logica pendiente de migracion.
        return false;
    }

    public static void init() {
        // Fuerza la carga de la clase para registrar los MobEffect.
    }
}
