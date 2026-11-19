package com.dhanantry.scapeandrunparasites.network;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;
import com.dhanantry.scapeandrunparasites.SRPMain;
import net.minecraft.server.level.ServerLevel;

/**
 * Migracion de SRPPacketHandler (SimpleNetworkWrapper -&gt; SimpleChannel).
 */
public class SRPNetwork
{
    private static final String PROTOCOL = "1";

    public static final SimpleChannel CHANNEL = NetworkRegistry.ChannelBuilder
        .named(new ResourceLocation(SRPMain.MODID, "main"))
        .networkProtocolVersion(() -> PROTOCOL)
        .clientAcceptedVersions(PROTOCOL::equals)
        .serverAcceptedVersions(PROTOCOL::equals)
        .simpleChannel();

    private static int id = 0;

    public static void register() {
        CHANNEL.registerMessage(id++, SRPPacketBiomeChange.class,
            SRPPacketBiomeChange::encode,
            SRPPacketBiomeChange::decode,
            SRPPacketBiomeChange::handle);
    }

    public static void toDimension(ServerLevel level, SRPPacketBiomeChange msg) {
        CHANNEL.send(PacketDistributor.DIMENSION.with(() -> level.dimension()), msg);
    }
}
