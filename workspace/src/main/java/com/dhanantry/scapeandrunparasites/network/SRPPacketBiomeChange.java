package com.dhanantry.scapeandrunparasites.network;

import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

/**
 * Migracion de SRPPacketBiomeChange (1.12.2 SimpleNetworkWrapper -> 1.20.1 SimpleChannel).
 */
public class SRPPacketBiomeChange
{
    private final BlockPos pos;
    private final boolean convert;

    public SRPPacketBiomeChange(BlockPos pos, boolean convert) {
        this.pos = pos;
        this.convert = convert;
    }

    public BlockPos getPos() { return pos; }
    public boolean isConvert() { return convert; }

    public static void encode(SRPPacketBiomeChange msg, FriendlyByteBuf buf) {
        buf.writeBlockPos(msg.pos);
        buf.writeBoolean(msg.convert);
    }

    public static SRPPacketBiomeChange decode(FriendlyByteBuf buf) {
        return new SRPPacketBiomeChange(buf.readBlockPos(), buf.readBoolean());
    }

    public static void handle(SRPPacketBiomeChange msg, Supplier<NetworkEvent.Context> ctx) {
        NetworkEvent.Context context = ctx.get();
        context.enqueueWork(() -> com.dhanantry.scapeandrunparasites.SRPMain.spreadBiome(msg.pos, msg.isConvert()));
        context.setPacketHandled(true);
    }
    // Nota: en 1.20.1 SimpleChannel exige BiConsumer<MSG, FriendlyByteBuf> para codificar
    // y Function<FriendlyByteBuf, MSG> para decodificar; el orden de los argumentos es
    // (id, clase, encode, decode, handler).
}
