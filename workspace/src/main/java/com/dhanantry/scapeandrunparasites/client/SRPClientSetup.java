package com.dhanantry.scapeandrunparasites.client;

import com.dhanantry.scapeandrunparasites.client.model.entity.misc.ModelScaryOrb;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "srparasites", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SRPClientSetup {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        // STUB: los renderers reales (127) se registraran aqui en lotes.
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelScaryOrb.LAYER_LOCATION, ModelScaryOrb::createBodyLayer);
    }
}