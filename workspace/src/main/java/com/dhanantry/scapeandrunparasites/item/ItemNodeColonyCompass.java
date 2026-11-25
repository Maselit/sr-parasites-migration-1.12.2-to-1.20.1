package com.dhanantry.scapeandrunparasites.item;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.network.SRPPacketCompass;
import com.dhanantry.scapeandrunparasites.network.SRPNetwork;
import com.dhanantry.scapeandrunparasites.world.SRPWorldData;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundSetEntityDataPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PacketDistributor;

public class ItemNodeColonyCompass extends Item {
    private String name;
    private byte cType;
    public static BlockPos orig;

    public ItemNodeColonyCompass(String name, int type) {
        super(new Properties().stacksTo(1));
        this.name = name;
        this.cType = (byte) type;
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        super.inventoryTick(stack, level, entity, slotId, isSelected);
        if (!level.isClientSide && entity.tickCount % 20 == 0) {
            SRPWorldData aaa = SRPWorldData.get(level);
            if (aaa.getHeartPocition(entity.blockPosition(), 0) != 1) {
                BlockPos posss = aaa.nearestHeartAgePosition(entity.blockPosition(), 0);
                if (posss != null) {
                    SRPNetwork.CHANNEL.send(PacketDistributor.ALL.noArg(), new SRPPacketCompass(posss.getX(), posss.getY(), posss.getZ()));
                } else {
                    SRPNetwork.CHANNEL.send(PacketDistributor.ALL.noArg(), new SRPPacketCompass(level.random.nextInt(), level.random.nextInt(), level.random.nextInt()));
                }
            } else {
                SRPNetwork.CHANNEL.send(PacketDistributor.ALL.noArg(), new SRPPacketCompass(level.random.nextInt(), level.random.nextInt(), level.random.nextInt()));
            }
        }
    }
}