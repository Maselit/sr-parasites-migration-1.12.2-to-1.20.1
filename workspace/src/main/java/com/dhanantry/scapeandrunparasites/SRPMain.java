package com.dhanantry.scapeandrunparasites;

import com.dhanantry.scapeandrunparasites.init.SRPBiomes;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPEntities;
import com.dhanantry.scapeandrunparasites.init.SRPFluids;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.network.SRPNetwork;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

/**
 * Entry point del mod "Scape and Run: Parasites" (port a 1.20.1).
 * Fase C: DeferredRegisters + config + buses.
 */
@Mod(SRPMain.MODID)
public class SRPMain
{
    public static final String MODID = "srparasites";
    public static final Logger LOGGER = LogUtils.getLogger();

    // Deferred Registers (namespaces "srparasites")
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<net.minecraft.world.entity.EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);
    public static final DeferredRegister<net.minecraft.sounds.SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MODID);
    public static final DeferredRegister<net.minecraft.world.level.biome.Biome> BIOMES = DeferredRegister.create(Registries.BIOME, MODID);
    public static final DeferredRegister<net.minecraft.world.effect.MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public SRPMain()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        ENTITIES.register(modEventBus);
        SOUNDS.register(modEventBus);
        BIOMES.register(modEventBus);
        MOB_EFFECTS.register(modEventBus);
        BLOCK_ENTITY_TYPES.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        // Fluidos (deadblood): registros propios
        SRPFluids.FLUIDS.register(modEventBus);
        SRPFluids.FLUID_TYPES.register(modEventBus);

        // Forzar la inicializacion de las clases que registran entradas en los DeferredRegister.
        // Si se inicializan mas tarde (p. ej. en commonSetup) el registro falla con
        // "Cannot register new entries to DeferredRegister after RegisterEvent has been fired".
        SRPBlocks.init();
        SRPBiomes.clearMobSpawnList();
        SRPFluids.init();
        SRPSounds.init();
        SRPEntities.init();
        SRPItems.init();
        SRPPotions.init();

        // Eventos de juego (Forge bus)
        MinecraftForge.EVENT_BUS.register(this);

        // Configuracion
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SRPConfig.SPEC);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SRPConfigSystems.SPEC);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SRPConfigWorld.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        SRPConfig.load();
        SRPConfigSystems.load();
        SRPConfigWorld.load();
        SRPNetwork.register();
        LOGGER.info("HELLO FROM COMMON SETUP (Scape and Run: Parasites)");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting (Scape and Run: Parasites)");
    }

    /** Hook de cliente: aplica el cambio de bioma en el cliente. */
    public static void spreadBiome(net.minecraft.core.BlockPos pos, boolean convert) {
        LOGGER.debug("spreadBiome {} {}", pos, convert);
    }
}
