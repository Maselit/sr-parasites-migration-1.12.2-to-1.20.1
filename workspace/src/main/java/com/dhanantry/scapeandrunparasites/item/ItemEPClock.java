package com.dhanantry.scapeandrunparasites.item;

import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

/**
 * Migracion de ItemEPClock a 1.20.1.
 */
public class ItemEPClock extends ItemBase {
    public ItemEPClock(String name, int maxStack, int v) {
        super(name, maxStack, v);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
        if (!worldIn.isClientSide && SRPConfigSystems.useEvolution) {
            SRPSaveData data = SRPSaveData.get(worldIn);
            playerIn.displayClientMessage(net.minecraft.network.chat.Component.literal("" + data.getEvolutionPhase(SRPSaveData.dimensionId(worldIn))), true);
        }
        return super.use(worldIn, playerIn, handIn);
    }
}