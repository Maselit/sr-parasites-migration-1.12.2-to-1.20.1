package com.dhanantry.scapeandrunparasites.init;

import com.dhanantry.scapeandrunparasites.SRPMain;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

/**
 * Migracion de SRPFluids (Forge 1.12 Fluid + FluidRegistry) a 1.20.1
 * (DeferredRegister&lt;Fluid&gt; + FluidType + ForgeFlowingFluid).
 * El fluido "deadblood" conserva su viscosidad (3000).
 */
public class SRPFluids
{
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, SRPMain.MODID);
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SRPMain.MODID);

    public static final RegistryObject<FluidType> DEADBLOOD_TYPE = FLUID_TYPES.register("deadblood",
        () -> new FluidType(FluidType.Properties.create()
            .viscosity(3000)
            .density(1200)
            .temperature(300)
            .canSwim(false)
            .canDrown(false)
            .canPushEntity(true)));

    public static final RegistryObject<Fluid> DEADBLOOD_SOURCE = FLUIDS.register("deadblood",
        () -> new ForgeFlowingFluid.Source(new ForgeFlowingFluid.Properties(
            () -> SRPFluids.DEADBLOOD_TYPE.get(),
            () -> SRPFluids.DEADBLOOD_SOURCE.get(),
            () -> SRPFluids.DEADBLOOD_FLOWING.get())));

    public static final RegistryObject<Fluid> DEADBLOOD_FLOWING = FLUIDS.register("flowing_deadblood",
        () -> new ForgeFlowingFluid.Flowing(new ForgeFlowingFluid.Properties(
            () -> SRPFluids.DEADBLOOD_TYPE.get(),
            () -> SRPFluids.DEADBLOOD_SOURCE.get(),
            () -> SRPFluids.DEADBLOOD_FLOWING.get())));

    /** Supplier que consume el bloque de fluido (1.20.1 exige Supplier&lt;? extends FlowingFluid&gt;). */
    public static Supplier<? extends FlowingFluid> DEADBLOOD_FLUID =
        () -> (FlowingFluid) SRPFluids.DEADBLOOD_SOURCE.get();

    public static void init() {
        // En 1.12.2 se registraba el fluido y su bucket universal.
        // En 1.20.1 no existe el bucket universal: el cubo propio se registrara en otro lote.
        // TODO: registrar el item de cubo de deadblood (loot table del bloque).
    }
}
