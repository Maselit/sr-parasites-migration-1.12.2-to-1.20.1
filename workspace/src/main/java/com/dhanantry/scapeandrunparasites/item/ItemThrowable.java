package com.dhanantry.scapeandrunparasites.item;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityThrowableAntiInfestedBlock;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

/**
 * Migracion de ItemThrowable a 1.20.1.
 */
public class ItemThrowable extends Item {
    public ItemThrowable(String name, int maxStack) {
        super(new Properties().stacksTo(maxStack));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
        ItemStack itemstack = playerIn.getItemInHand(handIn);
        if (!playerIn.getAbilities().instabuild) {
            itemstack.shrink(1);
        }
        worldIn.playSound(null, playerIn.getX(), playerIn.getY(), playerIn.getZ(), SoundEvents.EGG_THROW, SoundSource.PLAYERS, 0.5f, 0.4f / (worldIn.random.nextFloat() * 0.4f + 0.8f));
        if (!worldIn.isClientSide) {
            EntityThrowableAntiInfestedBlock entityegg = new EntityThrowableAntiInfestedBlock(com.dhanantry.scapeandrunparasites.init.SRPEntities.ENTITYTHROWABLEANTIINFESTEDBLOCK.get(), worldIn);
            entityegg.setPos(playerIn.getX(), playerIn.getEyeY() - 0.1, playerIn.getZ());
            entityegg.setOwner(playerIn);
            entityegg.shootFromRotation(playerIn, playerIn.getXRot(), playerIn.getYRot(), 0.0f, 0.5f, 5.0f);
            playerIn.getCooldowns().addCooldown(this, 20);
            worldIn.addFreshEntity(entityegg);
        }
        playerIn.awardStat(Stats.ITEM_USED.get(this));
        return InteractionResultHolder.success(itemstack);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, java.util.List<net.minecraft.network.chat.Component> tooltip, net.minecraft.world.item.TooltipFlag flagIn) {
        tooltip.add(net.minecraft.network.chat.Component.translatable("tootip.srparasites.quench"));
    }
}