package com.dhanantry.scapeandrunparasites.util.handlers;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Migracion de registro de comandos (antes en CommonProxy.serverInit) a 1.20.1 (Brigadier).
 * STUB: registra el literal raiz; los subcomandos se anadiran en lotes.
 */
@Mod.EventBusSubscriber(modid = "srparasites", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SRPCommandHandler {
    @SubscribeEvent
    public static void register(RegisterCommandsEvent event) {
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();
        dispatcher.register(Commands.literal("srparasites"));
    }
}