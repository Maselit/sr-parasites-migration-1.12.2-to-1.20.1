package com.dhanantry.scapeandrunparasites.network;

import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class SRPPacketCompass {
    private final int x, y, z;

    public SRPPacketCompass(int x, int y, int z) {
        this.x = x; this.y = y; this.z = z;
    }

    public static void encode(SRPPacketCompass msg, FriendlyByteBuf buf) {
        buf.writeInt(msg.x); buf.writeInt(msg.y); buf.writeInt(msg.z);
    }

    public static SRPPacketCompass decode(FriendlyByteBuf buf) {
        return new SRPPacketCompass(buf.readInt(), buf.readInt(), buf.readInt());
    }

    public static void handle(SRPPacketCompass msg, Supplier<NetworkEvent.Context> ctx) {
        NetworkEvent.Context context = ctx.get();
        context.enqueueWork(() -> com.dhanantry.scapeandrunparasites.item.ItemNodeColonyCompass.orig = new BlockPos(msg.x, msg.y, msg.z));
        context.setPacketHandled(true);
    }
}