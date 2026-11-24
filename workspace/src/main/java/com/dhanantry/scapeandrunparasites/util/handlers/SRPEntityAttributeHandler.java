package com.dhanantry.scapeandrunparasites.util.handlers;

import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityAta;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "srparasites", bus = Mod.EventBusSubscriber.Bus.MOD)
public class SRPEntityAttributeHandler {
    @SubscribeEvent
    public static void register(EntityAttributeCreationEvent event) {
        // Solo EntityAta migrado con atributos reales por ahora; el resto usa defaults.
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYATA.get(), EntityAta.createAttributes().build());
    }
}