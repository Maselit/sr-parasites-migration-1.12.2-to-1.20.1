/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.EnumCreatureType
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.biome.Biome
 *  net.minecraft.world.biome.Biome$SpawnListEntry
 *  net.minecraftforge.event.entity.living.LivingSpawnEvent$CheckSpawn
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.eventhandler.Event$Result
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package com.dhanantry.scapeandrunparasites.init;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanSpawn;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityBanoAdapted;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityCanraAdapted;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityEmanaAdapted;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityHullAdapted;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityNoglaAdapted;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityRanracAdapted;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityShycoAdapted;
import com.dhanantry.scapeandrunparasites.entity.monster.ancient.EntityOronco;
import com.dhanantry.scapeandrunparasites.entity.monster.ancient.EntityTerla;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityCrux;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityHeed;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityHost;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityHostII;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityInhooM;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityInhooS;
import com.dhanantry.scapeandrunparasites.entity.monster.derived.EntityHeblu;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrol;
import com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerCow;
import com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerEnderman;
import com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerHorse;
import com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerHuman;
import com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerPig;
import com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerSheep;
import com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerVillager;
import com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerWolf;
import com.dhanantry.scapeandrunparasites.entity.monster.hijacked.EntityHiGolem;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityAta;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityButhol;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityKol;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityLodo;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityMudo;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityNuuh;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityRathol;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityDorpa;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfBear;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfCow;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfDragonE;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfEnderman;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfHorse;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfHuman;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfPig;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfPlayer;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfSheep;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfVillager;
import com.dhanantry.scapeandrunparasites.entity.monster.infected.EntityInfWolf;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityBano;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityCanra;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityEmana;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityHull;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityIki;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityNogla;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityRanrac;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityShyco;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityWymo;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.EntityAlafha;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.EntityAnged;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.EntityEsor;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.EntityFlog;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.EntityGanro;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.EntityOmboo;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.preeminent.EntityElvia;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.preeminent.EntityJinjo;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.preeminent.EntityLencia;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.preeminent.EntityPheon;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.preeminent.EntityTenn;
import com.dhanantry.scapeandrunparasites.entity.monster.pure.preeminent.EntityVesta;
import com.dhanantry.scapeandrunparasites.init.SRPBiomes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import com.dhanantry.scapeandrunparasites.world.SRPWorldData;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SRPSpawning {
    private static List<Biome.SpawnListEntry> PHASEZERO;
    private static List<Biome.SpawnListEntry> PHASEONE;
    private static List<Biome.SpawnListEntry> PHASETWO;
    private static List<Biome.SpawnListEntry> PHASETHREE;
    private static List<Biome.SpawnListEntry> PHASEFOUR;
    private static List<Biome.SpawnListEntry> PHASEFIVE;
    private static List<Biome.SpawnListEntry> PHASESIX;
    private static List<Biome.SpawnListEntry> PHASESEVEN;
    private static List<Biome.SpawnListEntry> PHASEEIGHT;
    private static List<Biome.SpawnListEntry> PHASENINE;
    private static List<Biome.SpawnListEntry> PHASETEN;

    public static void init() {
        if (!SRPConfig.allowMobs) {
            return;
        }
        if (!SRPConfigSystems.useEvolution || SRPConfigSystems.useEvolution && !SRPConfigSystems.phaseCustomSpawner) {
            for (Biome biome : Biome.field_185377_q) {
                SRPSpawning.addSpawn(0, EntityShyco.class, 1, 1, biome, SRPConfigMobs.shycoSpawnRate, SRPConfigMobs.shycoEnabled);
                SRPSpawning.addSpawn(0, EntityShycoAdapted.class, 1, 1, biome, SRPConfigMobs.shycoASpawnRate, SRPConfigMobs.shycoEnabled);
                SRPSpawning.addSpawn(0, EntityEmana.class, 2, 3, biome, SRPConfigMobs.emanaSpawnRate, SRPConfigMobs.emanaEnabled);
                SRPSpawning.addSpawn(0, EntityEmanaAdapted.class, 2, 3, biome, SRPConfigMobs.emanaASpawnRate, SRPConfigMobs.emanaEnabled);
                SRPSpawning.addSpawn(0, EntityHull.class, 4, 6, biome, SRPConfigMobs.hullSpawnRate, SRPConfigMobs.hullEnabled);
                SRPSpawning.addSpawn(0, EntityHullAdapted.class, 4, 6, biome, SRPConfigMobs.hullASpawnRate, SRPConfigMobs.hullEnabled);
                SRPSpawning.addSpawn(0, EntityCanra.class, 1, 1, biome, SRPConfigMobs.canraSpawnRate, SRPConfigMobs.canraEnabled);
                SRPSpawning.addSpawn(0, EntityCanraAdapted.class, 1, 1, biome, SRPConfigMobs.canraASpawnRate, SRPConfigMobs.canraEnabled);
                SRPSpawning.addSpawn(0, EntityNogla.class, 1, 2, biome, SRPConfigMobs.noglaSpawnRate, SRPConfigMobs.noglaEnabled);
                SRPSpawning.addSpawn(0, EntityNoglaAdapted.class, 1, 2, biome, SRPConfigMobs.noglaASpawnRate, SRPConfigMobs.noglaEnabled);
                SRPSpawning.addSpawn(0, EntityBano.class, 1, 1, biome, SRPConfigMobs.zetmoSpawnRate, SRPConfigMobs.zetmoEnabled);
                SRPSpawning.addSpawn(0, EntityBanoAdapted.class, 1, 1, biome, SRPConfigMobs.zetmoASpawnRate, SRPConfigMobs.zetmoEnabled);
                SRPSpawning.addSpawn(0, EntityRanrac.class, 1, 1, biome, SRPConfigMobs.arachnidaSpawnRate, SRPConfigMobs.arachnidaEnabled);
                SRPSpawning.addSpawn(0, EntityRanracAdapted.class, 1, 1, biome, SRPConfigMobs.arachnidaASpawnRate, SRPConfigMobs.arachnidaEnabled);
                SRPSpawning.addSpawn(0, EntityWymo.class, 1, 1, biome, SRPConfigMobs.wymoSpawnRate, SRPConfigMobs.wymoEnabled);
                SRPSpawning.addSpawn(0, EntityIki.class, 1, 1, biome, SRPConfigMobs.ikiSpawnRate, SRPConfigMobs.ikiEnabled);
                SRPSpawning.addSpawn(0, EntityRathol.class, 2, 2, biome, SRPConfigMobs.ratholSpawnRate, SRPConfigMobs.ratholEnabled);
                SRPSpawning.addSpawn(0, EntityButhol.class, 1, 2, biome, SRPConfigMobs.butholSpawnRate, SRPConfigMobs.butholEnabled);
                SRPSpawning.addSpawn(0, EntityMudo.class, 3, 6, biome, SRPConfigMobs.mudoSpawnRate, SRPConfigMobs.mudoEnabled);
                SRPSpawning.addSpawn(0, EntityLodo.class, 2, 5, biome, SRPConfigMobs.lodoSpawnRate, SRPConfigMobs.lodoEnabled);
                SRPSpawning.addSpawn(0, EntityKol.class, 1, 1, biome, SRPConfigMobs.kolSpawnRate, SRPConfigMobs.kolEnabled);
                SRPSpawning.addSpawn(0, EntityNuuh.class, 1, 1, biome, SRPConfigMobs.nuuhSpawnRate, SRPConfigMobs.nuuhEnabled);
                SRPSpawning.addSpawn(0, EntityAta.class, 1, 1, biome, SRPConfigMobs.ataSpawnRate, SRPConfigMobs.ataEnabled);
                SRPSpawning.addSpawn(0, EntityInfBear.class, 1, 1, biome, SRPConfigMobs.infbearSpawnRate, SRPConfigMobs.infbearEnabled);
                SRPSpawning.addSpawn(0, EntityDorpa.class, 1, 1, biome, SRPConfigMobs.dorpaSpawnRate, SRPConfigMobs.dorpaEnabled);
                SRPSpawning.addSpawn(0, EntityInfEnderman.class, 1, 1, biome, SRPConfigMobs.infendermanSpawnRate, SRPConfigMobs.infendermanEnabled);
                SRPSpawning.addSpawn(0, EntityInfHuman.class, 3, 5, biome, SRPConfigMobs.infhumanSpawnRate, SRPConfigMobs.infhumanEnabled);
                SRPSpawning.addSpawn(0, EntityInfCow.class, 1, 3, biome, SRPConfigMobs.infcowSpawnRate, SRPConfigMobs.infcowEnabled);
                SRPSpawning.addSpawn(0, EntityInfSheep.class, 1, 3, biome, SRPConfigMobs.infsheepSpawnRate, SRPConfigMobs.infsheepEnabled);
                SRPSpawning.addSpawn(0, EntityInfWolf.class, 3, 6, biome, SRPConfigMobs.infwolfSpawnRate, SRPConfigMobs.infwolfEnabled);
                SRPSpawning.addSpawn(0, EntityInfPig.class, 3, 6, biome, SRPConfigMobs.infpigSpawnRate, SRPConfigMobs.infpigEnabled);
                SRPSpawning.addSpawn(0, EntityInfVillager.class, 3, 6, biome, SRPConfigMobs.infvillagerSpawnRate, SRPConfigMobs.infvillagerEnabled);
                SRPSpawning.addSpawn(0, EntityInfHorse.class, 3, 6, biome, SRPConfigMobs.infhorseSpawnRate, SRPConfigMobs.infhorseEnabled);
                SRPSpawning.addSpawn(0, EntityInfPlayer.class, 3, 6, biome, SRPConfigMobs.infadventurerSpawnRate, SRPConfigMobs.infadventurerEnabled);
                SRPSpawning.addSpawn(0, EntityInfDragonE.class, 3, 6, biome, SRPConfigMobs.infdragoneSpawnRate, SRPConfigMobs.infdragoneEnabled);
                SRPSpawning.addSpawn(0, EntityFerEnderman.class, 1, 1, biome, SRPConfigMobs.ferendermanSpawnRate, SRPConfigMobs.ferendermanEnabled);
                SRPSpawning.addSpawn(0, EntityFerHuman.class, 3, 5, biome, SRPConfigMobs.ferhumanSpawnRate, SRPConfigMobs.ferhumanEnabled);
                SRPSpawning.addSpawn(0, EntityFerCow.class, 1, 3, biome, SRPConfigMobs.fercowSpawnRate, SRPConfigMobs.fercowEnabled);
                SRPSpawning.addSpawn(0, EntityFerSheep.class, 1, 3, biome, SRPConfigMobs.fersheepSpawnRate, SRPConfigMobs.fersheepEnabled);
                SRPSpawning.addSpawn(0, EntityFerWolf.class, 3, 6, biome, SRPConfigMobs.ferwolfSpawnRate, SRPConfigMobs.ferwolfEnabled);
                SRPSpawning.addSpawn(0, EntityFerPig.class, 3, 6, biome, SRPConfigMobs.ferpigSpawnRate, SRPConfigMobs.ferpigEnabled);
                SRPSpawning.addSpawn(0, EntityFerVillager.class, 3, 6, biome, SRPConfigMobs.fervillagerSpawnRate, SRPConfigMobs.fervillagerEnabled);
                SRPSpawning.addSpawn(0, EntityFerHorse.class, 3, 6, biome, SRPConfigMobs.ferhorseSpawnRate, SRPConfigMobs.ferhorseEnabled);
                SRPSpawning.addSpawn(0, EntityHiGolem.class, 1, 1, biome, SRPConfigMobs.higolemSpawnRate, SRPConfigMobs.higolemEnabled);
                SRPSpawning.addSpawn(0, EntityHost.class, 1, 1, biome, SRPConfigMobs.hostSpawnRate, SRPConfigMobs.hostEnabled);
                SRPSpawning.addSpawn(0, EntityHostII.class, 1, 1, biome, SRPConfigMobs.herdSpawnRate, SRPConfigMobs.herdEnabled);
                SRPSpawning.addSpawn(0, EntityHeed.class, 1, 1, biome, SRPConfigMobs.heedSpawnRate, SRPConfigMobs.heedEnabled);
                SRPSpawning.addSpawn(0, EntityCrux.class, 1, 1, biome, SRPConfigMobs.cruxaSpawnRate, SRPConfigMobs.cruxaEnabled);
                SRPSpawning.addSpawn(0, EntityInhooS.class, 2, 5, biome, SRPConfigMobs.inhooSSpawnRate, SRPConfigMobs.inhooSEnabled);
                SRPSpawning.addSpawn(0, EntityInhooM.class, 2, 5, biome, SRPConfigMobs.inhooMSpawnRate, SRPConfigMobs.inhooMEnabled);
                SRPSpawning.addSpawn(0, EntityAlafha.class, 1, 1, biome, SRPConfigMobs.alafhaSpawnRate, SRPConfigMobs.alafhaEnabled);
                SRPSpawning.addSpawn(0, EntityGanro.class, 1, 1, biome, SRPConfigMobs.ganroSpawnRate, SRPConfigMobs.ganroEnabled);
                SRPSpawning.addSpawn(0, EntityAnged.class, 2, 2, biome, SRPConfigMobs.angedSpawnRate, SRPConfigMobs.angedEnabled);
                SRPSpawning.addSpawn(0, EntityEsor.class, 1, 1, biome, SRPConfigMobs.esorSpawnRate, SRPConfigMobs.esorEnabled);
                SRPSpawning.addSpawn(0, EntityOmboo.class, 2, 2, biome, SRPConfigMobs.ombooSpawnRate, SRPConfigMobs.ombooEnabled);
                SRPSpawning.addSpawn(0, EntityFlog.class, 3, 6, biome, SRPConfigMobs.flogSpawnRate, SRPConfigMobs.flogEnabled);
                SRPSpawning.addSpawn(0, EntityJinjo.class, 3, 6, biome, SRPConfigMobs.jinjoSpawnRate, SRPConfigMobs.jinjoEnabled);
                SRPSpawning.addSpawn(0, EntityElvia.class, 3, 6, biome, SRPConfigMobs.elviaSpawnRate, SRPConfigMobs.elviaEnabled);
                SRPSpawning.addSpawn(0, EntityLencia.class, 3, 6, biome, SRPConfigMobs.lenciaSpawnRate, SRPConfigMobs.lenciaEnabled);
                SRPSpawning.addSpawn(0, EntityPheon.class, 3, 6, biome, SRPConfigMobs.pheonSpawnRate, SRPConfigMobs.pheonEnabled);
                SRPSpawning.addSpawn(0, EntityVesta.class, 3, 6, biome, SRPConfigMobs.vestaSpawnRate, SRPConfigMobs.vestaEnabled);
                SRPSpawning.addSpawn(0, EntityHeblu.class, 1, 1, biome, SRPConfigMobs.hebluSpawnRate, SRPConfigMobs.hebluEnabled);
                SRPSpawning.addSpawn(0, EntityOronco.class, 1, 1, biome, SRPConfigMobs.oroncoSpawnRate, SRPConfigMobs.oroncoEnabled);
                SRPSpawning.addSpawn(0, EntityTerla.class, 1, 1, biome, SRPConfigMobs.terlaSpawnRate, SRPConfigMobs.terlaEnabled);
                SRPSpawning.addSpawn(1, EntityVenkrol.class, 1, 1, biome, SRPConfigMobs.venkrolSpawnrate, SRPConfigSystems.rsEnabled);
            }
        } else {
            int weight;
            int max;
            int min;
            int i;
            String[] here = new String[4];
            PHASEZERO = new ArrayList<Biome.SpawnListEntry>();
            PHASEONE = new ArrayList<Biome.SpawnListEntry>();
            PHASETWO = new ArrayList<Biome.SpawnListEntry>();
            PHASETHREE = new ArrayList<Biome.SpawnListEntry>();
            PHASEFOUR = new ArrayList<Biome.SpawnListEntry>();
            PHASEFIVE = new ArrayList<Biome.SpawnListEntry>();
            PHASESIX = new ArrayList<Biome.SpawnListEntry>();
            PHASESEVEN = new ArrayList<Biome.SpawnListEntry>();
            PHASEEIGHT = new ArrayList<Biome.SpawnListEntry>();
            PHASENINE = new ArrayList<Biome.SpawnListEntry>();
            PHASETEN = new ArrayList<Biome.SpawnListEntry>();
            String[] entry = SRPConfigSystems.phaseSpawnEntryZero;
            for (i = 0; i < entry.length; ++i) {
                if (entry[i] == null) continue;
                here = entry[i].split(";");
                min = Integer.parseInt(here[1]);
                max = Integer.parseInt(here[2]);
                weight = Integer.parseInt(here[3]);
                PHASEZERO.add(new Biome.SpawnListEntry(EntityList.getClass((ResourceLocation)new ResourceLocation(here[0])), weight, min, max));
            }
            entry = SRPConfigSystems.phaseSpawnEntryOne;
            for (i = 0; i < entry.length; ++i) {
                if (entry[i] == null) continue;
                here = entry[i].split(";");
                min = Integer.parseInt(here[1]);
                max = Integer.parseInt(here[2]);
                weight = Integer.parseInt(here[3]);
                PHASEONE.add(new Biome.SpawnListEntry(EntityList.getClass((ResourceLocation)new ResourceLocation(here[0])), weight, min, max));
            }
            entry = SRPConfigSystems.phaseSpawnEntryTwo;
            for (i = 0; i < entry.length; ++i) {
                if (entry[i] == null) continue;
                here = entry[i].split(";");
                min = Integer.parseInt(here[1]);
                max = Integer.parseInt(here[2]);
                weight = Integer.parseInt(here[3]);
                PHASETWO.add(new Biome.SpawnListEntry(EntityList.getClass((ResourceLocation)new ResourceLocation(here[0])), weight, min, max));
            }
            entry = SRPConfigSystems.phaseSpawnEntryThree;
            for (i = 0; i < entry.length; ++i) {
                if (entry[i] == null) continue;
                here = entry[i].split(";");
                min = Integer.parseInt(here[1]);
                max = Integer.parseInt(here[2]);
                weight = Integer.parseInt(here[3]);
                PHASETHREE.add(new Biome.SpawnListEntry(EntityList.getClass((ResourceLocation)new ResourceLocation(here[0])), weight, min, max));
            }
            entry = SRPConfigSystems.phaseSpawnEntryFour;
            for (i = 0; i < entry.length; ++i) {
                if (entry[i] == null) continue;
                here = entry[i].split(";");
                min = Integer.parseInt(here[1]);
                max = Integer.parseInt(here[2]);
                weight = Integer.parseInt(here[3]);
                PHASEFOUR.add(new Biome.SpawnListEntry(EntityList.getClass((ResourceLocation)new ResourceLocation(here[0])), weight, min, max));
            }
            entry = SRPConfigSystems.phaseSpawnEntryFive;
            for (i = 0; i < entry.length; ++i) {
                if (entry[i] == null) continue;
                here = entry[i].split(";");
                min = Integer.parseInt(here[1]);
                max = Integer.parseInt(here[2]);
                weight = Integer.parseInt(here[3]);
                PHASEFIVE.add(new Biome.SpawnListEntry(EntityList.getClass((ResourceLocation)new ResourceLocation(here[0])), weight, min, max));
            }
            entry = SRPConfigSystems.phaseSpawnEntrySix;
            for (i = 0; i < entry.length; ++i) {
                if (entry[i] == null) continue;
                here = entry[i].split(";");
                min = Integer.parseInt(here[1]);
                max = Integer.parseInt(here[2]);
                weight = Integer.parseInt(here[3]);
                PHASESIX.add(new Biome.SpawnListEntry(EntityList.getClass((ResourceLocation)new ResourceLocation(here[0])), weight, min, max));
            }
            entry = SRPConfigSystems.phaseSpawnEntrySeven;
            for (i = 0; i < entry.length; ++i) {
                if (entry[i] == null) continue;
                here = entry[i].split(";");
                min = Integer.parseInt(here[1]);
                max = Integer.parseInt(here[2]);
                weight = Integer.parseInt(here[3]);
                PHASESEVEN.add(new Biome.SpawnListEntry(EntityList.getClass((ResourceLocation)new ResourceLocation(here[0])), weight, min, max));
            }
            entry = SRPConfigSystems.phaseSpawnEntryEight;
            for (i = 0; i < entry.length; ++i) {
                if (entry[i] == null) continue;
                here = entry[i].split(";");
                min = Integer.parseInt(here[1]);
                max = Integer.parseInt(here[2]);
                weight = Integer.parseInt(here[3]);
                PHASEEIGHT.add(new Biome.SpawnListEntry(EntityList.getClass((ResourceLocation)new ResourceLocation(here[0])), weight, min, max));
            }
            entry = SRPConfigSystems.phaseSpawnEntryNine;
            for (i = 0; i < entry.length; ++i) {
                if (entry[i] == null) continue;
                here = entry[i].split(";");
                min = Integer.parseInt(here[1]);
                max = Integer.parseInt(here[2]);
                weight = Integer.parseInt(here[3]);
                PHASENINE.add(new Biome.SpawnListEntry(EntityList.getClass((ResourceLocation)new ResourceLocation(here[0])), weight, min, max));
            }
            entry = SRPConfigSystems.phaseSpawnEntryTen;
            for (i = 0; i < entry.length; ++i) {
                if (entry[i] == null) continue;
                here = entry[i].split(";");
                min = Integer.parseInt(here[1]);
                max = Integer.parseInt(here[2]);
                weight = Integer.parseInt(here[3]);
                PHASETEN.add(new Biome.SpawnListEntry(EntityList.getClass((ResourceLocation)new ResourceLocation(here[0])), weight, min, max));
            }
        }
    }

    public static void removeInit() {
        if (SRPConfigSystems.useEvolution) {
            return;
        }
        for (Biome biome : Biome.field_185377_q) {
            boolean rem = true;
            boolean gg = true;
            while (gg) {
                String eee;
                int i;
                for (i = 0; i < biome.func_76747_a(EnumCreatureType.MONSTER).size(); ++i) {
                    eee = ((Biome.SpawnListEntry)biome.func_76747_a((EnumCreatureType)EnumCreatureType.MONSTER).get((int)i)).field_76300_b.toString();
                    if (eee.contains("scapeandrunparasites") && rem) {
                        gg = true;
                        biome.func_76747_a(EnumCreatureType.MONSTER).remove(i);
                        continue;
                    }
                    gg = false;
                }
                for (i = 0; i < biome.func_76747_a(EnumCreatureType.MONSTER).size(); ++i) {
                    eee = ((Biome.SpawnListEntry)biome.func_76747_a((EnumCreatureType)EnumCreatureType.MONSTER).get((int)i)).field_76300_b.toString();
                    if (!eee.contains("scapeandrunparasites") || !rem) continue;
                    gg = true;
                    biome.func_76747_a(EnumCreatureType.MONSTER).remove(i);
                }
            }
        }
    }

    public static List<Biome.SpawnListEntry> getSpawns(byte phase) {
        switch (phase) {
            case 0: {
                return PHASEZERO;
            }
            case 1: {
                return PHASEONE;
            }
            case 2: {
                return PHASETWO;
            }
            case 3: {
                return PHASETHREE;
            }
            case 4: {
                return PHASEFOUR;
            }
            case 5: {
                return PHASEFIVE;
            }
            case 6: {
                return PHASESIX;
            }
            case 7: {
                return PHASESEVEN;
            }
            case 8: {
                return PHASEEIGHT;
            }
            case 9: {
                return PHASENINE;
            }
            case 10: {
                return PHASETEN;
            }
        }
        return null;
    }

    public static void initBiome() {
        BiomeParasite biome = SRPBiomes.biomeInfested;
        String[] here = new String[5];
        for (int i = 0; i < SRPConfigWorld.biomeSpawnEntry.length; ++i) {
            if (SRPConfigWorld.biomeSpawnEntry[i] == null) continue;
            here = SRPConfigWorld.biomeSpawnEntry[i].split(";");
            int min = Integer.parseInt(here[1]);
            int max = Integer.parseInt(here[2]);
            int weight = Integer.parseInt(here[3]);
            int type = Integer.parseInt(here[4]);
            SRPSpawning.addSpawn(type, EntityList.getClass((ResourceLocation)new ResourceLocation(here[0])), min, max, biome, weight, true);
        }
    }

    public static void addSpawn(int type, Class<? extends EntityLiving> entity, int groupMin, int groupMax, Biome biome, int weight, boolean addSpawn) {
        if (weight > 0 && addSpawn && type == 0) {
            biome.func_76747_a(EnumCreatureType.MONSTER).add(new Biome.SpawnListEntry(entity, weight, groupMin, groupMax));
        } else if (weight > 0 && addSpawn && type == 1) {
            biome.func_76747_a(EnumCreatureType.CREATURE).add(new Biome.SpawnListEntry(entity, weight, groupMin, groupMax));
        }
    }

    @Mod.EventBusSubscriber(modid="srparasites")
    public static class DimensionHandler {
        @SubscribeEvent
        public static void onSpawn(LivingSpawnEvent.CheckSpawn event) {
            if (event.getEntity() instanceof EntityParasiteBase) {
                List serverList = event.getEntity().field_70170_p.field_72996_f;
                int count = 0;
                int gnatCount = 0;
                for (int x = 0; x < serverList.size(); ++x) {
                    if (serverList.get(x) instanceof EntityParasiteBase) {
                        ++count;
                    }
                    if (!(serverList.get(x) instanceof EntityAta)) continue;
                    ++gnatCount;
                }
                int players = event.getEntity().field_70170_p.field_73010_i.size();
                players *= SRPConfig.worldMobCapPlusPlayer;
                if (event.getEntity() instanceof EntityAta && gnatCount > SRPConfig.worldGnatCap) {
                    event.setResult(Event.Result.DENY);
                    return;
                }
                if (count > SRPConfig.worldMobCap + players) {
                    event.setResult(Event.Result.DENY);
                    return;
                }
                if (!SRPConfigSystems.useEvolution) {
                    boolean inv = false;
                    boolean flagI = false;
                    if (SRPConfig.blackListedDimensionsWhite) {
                        inv = true;
                    }
                    for (int i : SRPConfig.blackListedDimensions) {
                        if (SRPConfig.blackListedDimensionsWhite) {
                            if (i != event.getWorld().field_73011_w.getDimension()) continue;
                            flagI = true;
                            break;
                        }
                        if (i != event.getWorld().field_73011_w.getDimension()) continue;
                        event.setResult(Event.Result.DENY);
                        return;
                    }
                    if (inv && !flagI) {
                        event.setResult(Event.Result.DENY);
                        return;
                    }
                }
                if (SRPConfigSystems.useEvolution || SRPConfigWorld.coloniesActivated) {
                    EntityParasiteBase parasite = (EntityParasiteBase)event.getEntity();
                    if (!parasite.canSpawnSpawn) {
                        event.setResult(Event.Result.DENY);
                        return;
                    }
                    SRPWorldData data = SRPWorldData.get(parasite.field_70170_p);
                    parasite.setCreatedPhase(SRPSaveData.get(parasite.field_70170_p).getEvolutionPhase(parasite.field_70170_p.field_73011_w.getDimension()));
                    if (SRPSaveData.get(parasite.field_70170_p).getEvolutionPhase(parasite.field_70170_p.field_73011_w.getDimension()) <= -1) {
                        event.setResult(Event.Result.DENY);
                        return;
                    }
                    if (parasite.getParasiteIDRegister() == 90) {
                        BlockPos origin;
                        if (!SRPConfigWorld.coloniesActivated) {
                            event.setResult(Event.Result.DENY);
                        }
                        if ((origin = data.nearestColonyPosition(parasite.func_180425_c(), false)) != null) {
                            EntityTenn kol = (EntityTenn)parasite;
                            return;
                        }
                        event.setResult(Event.Result.DENY);
                        return;
                    }
                    if (SRPConfigSystems.useEvolution && !SRPConfigSystems.phaseCustomSpawner && !DimensionHandler.canSpawninPhase(SRPSaveData.get(parasite.field_70170_p).getEvolutionPhase(parasite.field_70170_p.field_73011_w.getDimension()), parasite)) {
                        event.setResult(Event.Result.DENY);
                        return;
                    }
                    if (DimensionHandler.checkEvoLock(parasite.getParasiteIDRegister(), SRPSaveData.get(parasite.field_70170_p)) || DimensionHandler.checkColoLock(parasite.getParasiteIDRegister(), data, parasite)) {
                        event.setResult(Event.Result.DENY);
                        return;
                    }
                    if (parasite instanceof EntityCanSpawn) {
                        EntityCanSpawn parasiteSus = (EntityCanSpawn)((Object)parasite);
                        if (SRPSaveData.get(parasite.field_70170_p).getNumberIDDataSpawn(parasiteSus.getIDSpawn()) < parasiteSus.canSpawnByIDData()) {
                            event.setResult(Event.Result.DENY);
                            return;
                        }
                    }
                }
            } else if (event.getEntity() instanceof EntityLivingBase && SRPConfigSystems.useEvolution && SRPSaveData.get(event.getWorld()).getEvolutionPhase(event.getWorld().field_73011_w.getDimension()) >= SRPConfigSystems.evolutionNoParasiteSpawnDenied) {
                event.setResult(Event.Result.DENY);
                return;
            }
        }

        private static boolean canSpawninPhase(byte evPhase, EntityParasiteBase parasite) {
            byte type = parasite.getParasiteType();
            switch (evPhase) {
                case -1: {
                    return false;
                }
                case 0: {
                    if (type < SRPConfigSystems.phaseMaxParasiteIDZero && type > SRPConfigSystems.phaseCancelParasiteIDZero) break;
                    return false;
                }
                case 1: {
                    if (type < SRPConfigSystems.phaseMaxParasiteIDOne && type > SRPConfigSystems.phaseCancelParasiteIDOne) break;
                    return false;
                }
                case 2: {
                    if (type < SRPConfigSystems.phaseMaxParasiteIDTwo && type > SRPConfigSystems.phaseCancelParasiteIDTwo) break;
                    return false;
                }
                case 3: {
                    if (type < SRPConfigSystems.phaseMaxParasiteIDThree && type > SRPConfigSystems.phaseCancelParasiteIDThree) break;
                    return false;
                }
                case 4: {
                    if (type < SRPConfigSystems.phaseMaxParasiteIDFour && type > SRPConfigSystems.phaseCancelParasiteIDFour) break;
                    return false;
                }
                case 5: {
                    if (type < SRPConfigSystems.phaseMaxParasiteIDFive && type > SRPConfigSystems.phaseCancelParasiteIDFive) break;
                    return false;
                }
                case 6: {
                    if (type < SRPConfigSystems.phaseMaxParasiteIDSix && type > SRPConfigSystems.phaseCancelParasiteIDSix) break;
                    return false;
                }
                case 7: {
                    if (type < SRPConfigSystems.phaseMaxParasiteIDSeven && type > SRPConfigSystems.phaseCancelParasiteIDSeven) break;
                    return false;
                }
                case 8: {
                    if (type < SRPConfigSystems.phaseMaxParasiteIDEight && type > SRPConfigSystems.phaseCancelParasiteIDEight) break;
                    return false;
                }
                case 9: {
                    if (type < SRPConfigSystems.phaseMaxParasiteIDNine && type > SRPConfigSystems.phaseCancelParasiteIDNine) break;
                    return false;
                }
                case 10: {
                    if (type < SRPConfigSystems.phaseMaxParasiteIDTen && type > SRPConfigSystems.phaseCancelParasiteIDTen) break;
                    return false;
                }
            }
            parasite.setCreatedPhase(evPhase);
            return true;
        }

        private static boolean checkEvoLock(int in, SRPSaveData data) {
            return data.checkParasiteID(in);
        }

        private static boolean checkColoLock(int in, SRPWorldData data, EntityParasiteBase para) {
            int points = data.totalColonyPoints(0);
            String[] here = new String[2];
            int id = 0;
            int req = 0;
            for (int i = 0; i < SRPConfigWorld.preeValues.length; ++i) {
                here = SRPConfigWorld.preeValues[i].split(";");
                id = Integer.parseInt(here[0]);
                if (id != in) continue;
                if (para.field_70170_p.func_180494_b(para.func_180425_c()) instanceof BiomeParasite) {
                    return SRPConfigWorld.preeValuesBiome;
                }
                req = Integer.parseInt(here[1]);
                return points < req;
            }
            return false;
        }
    }
}

