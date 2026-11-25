package com.dhanantry.scapeandrunparasites.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

/**
 * Migracion de ItemLure a 1.20.1.
 */
public class ItemLure extends ItemBase {
    int sound = 0;

    public ItemLure(String name, int maxStack, int version) {
        super(name, maxStack, version);
        this.version = (byte) version;
    }

    @Override
    public net.minecraft.world.InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, net.minecraft.world.InteractionHand handIn) {
        if (!worldIn.isClientSide) {
            AABB axisalignedbb = new AABB(playerIn.getX(), playerIn.getY(), playerIn.getZ(), playerIn.getX() + 1.0, playerIn.getY() + 1.0, playerIn.getZ() + 1.0).inflate(14.0);
            java.util.List<LivingEntity> moblist = worldIn.getEntitiesOfClass(LivingEntity.class, axisalignedbb);
            for (LivingEntity entityLivingBase : moblist) {
                // original loop was empty
            }
        }
        return super.use(worldIn, playerIn, handIn);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, java.util.List<net.minecraft.network.chat.Component> tooltip, net.minecraft.world.item.TooltipFlag flagIn) {
        tooltip.add(net.minecraft.network.chat.Component.translatable("tootip.srparasites.lurecomp." + this.version));
    }
}