package com.dhanantry.scapeandrunparasites.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "srparasites", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SRPClientSetup {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        // STUB: los renderers reales (127) se registraran aqui en lotes.
        // Por ahora las entidades usan el renderer por defecto (caja).
    }
}
