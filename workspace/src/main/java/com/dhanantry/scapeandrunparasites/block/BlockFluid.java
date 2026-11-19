package com.dhanantry.scapeandrunparasites.block;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.function.Supplier;

/**
 * Migracion de BlockFluid a 1.20.1.
 *
 * En 1.12.2 extendia de net.minecraftforge.fluids.BlockFluidClassic (Forge 1.12)
 * y el flujo de la sangre se calculaba dentro del bloque. En 1.20.1 el bloque de
 * fluido es net.minecraft.world.level.block.LiquidBlock y tanto el flujo como el
 * empuje de las entidades los calcula la propia clase del fluido (FlowingFluid),
 * por lo que el bloque solo mantiene el bloque de comportamiento y la opcion
 * de empujar entidades.
 */
public class BlockFluid extends LiquidBlock
{
    private static boolean pushesEntity;

    public BlockFluid(Supplier<? extends FlowingFluid> fluid, BlockBehaviour.Properties properties, boolean pushEntities) {
        super(fluid, properties);
        pushesEntity = pushEntities;
    }

    public static boolean getPushesEntity() {
        return pushesEntity;
    }

    public static void setPushesEntity(boolean parPushesEntity) {
        pushesEntity = parPushesEntity;
    }
}
