package com.dhanantry.scapeandrunparasites.util.handlers;

import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityAta;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "srparasites", bus = Mod.EventBusSubscriber.Bus.MOD)
public class SRPEntityAttributeHandler {
    @SubscribeEvent
    public static void register(EntityAttributeCreationEvent event) {
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYATA.get(), EntityAta.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYLODO.get(), com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityLodo.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYKOL.get(), com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityKol.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYNUUH.get(), com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityNuuh.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYRATHOL.get(), com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityRathol.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYBUTHOL.get(), com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityButhol.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYMUDO.get(), com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityMudo.createAttributes().build());
        // feral
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYFERBEAR.get(), com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerBear.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYFERCOW.get(), com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerCow.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYFERENDERMAN.get(), com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerEnderman.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYFERHORSE.get(), com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerHorse.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYFERHUMAN.get(), com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerHuman.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYFERPIG.get(), com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerPig.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYFERSHEEP.get(), com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerSheep.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYFERVILLAGER.get(), com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerVillager.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYFERWOLF.get(), com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerWolf.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYSHYCO.get(), com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityShyco.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYHULL.get(), com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityHull.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYNOGLA.get(), com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityNogla.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYCANRA.get(), com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityCanra.createAttributes().build());
        event.put(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYEMANA.get(), com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityEmana.createAttributes().build());
    }
}