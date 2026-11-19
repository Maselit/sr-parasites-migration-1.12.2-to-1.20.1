package com.dhanantry.scapeandrunparasites.init;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.RegistryObject;

/**
 * Migracion de SRPBlocks (1.12.2, registro dinamico en el constructor) a 1.20.1 (DeferredRegister).
 * Los nombres de registro se conservan para no romper los assets (blockstates/modelos/lang).
 */
public class SRPBlocks
{
    private static BlockBehaviour.Properties p(MapColor color, SoundType sound, float hardness, float resistance) {
        return BlockBehaviour.Properties.of().mapColor(color).sound(sound).strength(hardness, resistance);
    }

    // ---- Infestados ----
    public static final RegistryObject<Block> InfestedStain =
        SRPMain.BLOCKS.register("infestedstain", () -> new BlockInfestedStain(
            p(MapColor.DIRT, SoundType.GRAVEL, 0.7f, 0.7f).randomTicks()));

    public static final RegistryObject<Block> InfestRemain =
        SRPMain.BLOCKS.register("infestremain", () -> new BlockInfestedRemain(
            p(MapColor.PLANT, SoundType.GRASS, 0.4f, 0.4f).noCollission().randomTicks()));

    public static final RegistryObject<Block> InfestedTrunk =
        SRPMain.BLOCKS.register("infestedtrunk", () -> new BlockInfestedTrunk(
            p(MapColor.WOOD, SoundType.WOOD, 2.1f, 2.1f).randomTicks()));

    public static final RegistryObject<Block> InfestedRubble =
        SRPMain.BLOCKS.register("infestedrubble", () -> new BlockInfestedRubble(
            p(MapColor.STONE, SoundType.STONE, 2.2f, 11.0f).randomTicks()));

    public static final RegistryObject<Block> InfestedBush =
        SRPMain.BLOCKS.register("infestedbush", () -> new BlockInfestedBush(
            p(MapColor.PLANT, SoundType.GRASS, 0.4f, 0.4f).noCollission().randomTicks()));

    public static final RegistryObject<Block> InfestedOre =
        SRPMain.BLOCKS.register("infestedore", () -> new BlockInfestedOre(
            p(MapColor.DIRT, SoundType.STONE, 3.5f, 3.5f)));

    // ---- Nucleos ----
    public static final RegistryObject<Block> BiomeHeart =
        SRPMain.BLOCKS.register("biomeheart", () -> new BlockBiomeCore(
            p(MapColor.STONE, SoundType.STONE, 60.0f, 2500.0f)));

    public static final RegistryObject<Block> ColonyHeart =
        SRPMain.BLOCKS.register("colonyheart", () -> new BlockColonyCore(
            p(MapColor.STONE, SoundType.STONE, 60.0f, 2500.0f)));

    public static final RegistryObject<Block> ColonyOutpost =
        SRPMain.BLOCKS.register("colonyoutpost", () -> new BlockColonyOutpost(
            p(MapColor.STONE, SoundType.STONE, 30.0f, 1200.0f)));

    public static final RegistryObject<Block> BiomePurifier =
        SRPMain.BLOCKS.register("biomepurifier", () -> new BlockBiomePurifier(
            p(MapColor.PLANT, SoundType.GRASS, 2.0f, 5.0f)));

    public static final RegistryObject<Block> Colonystructure =
        SRPMain.BLOCKS.register("parasitestructure", () -> new BlockColonyStructure(
            p(MapColor.STONE, SoundType.STONE, 5.0f, 20.0f)));

    // ---- Parasito ----
    public static final RegistryObject<Block> ParasiteBush =
        SRPMain.BLOCKS.register("parasitebush", () -> new BlockParasiteBush(
            p(MapColor.PLANT, SoundType.GRASS, 0.5f, 0.5f).noCollission().randomTicks()));

    public static final RegistryObject<Block> ParasiteCanister =
        SRPMain.BLOCKS.register("parasitecanister", () -> new BlockParasiteCanister(
            p(MapColor.PLANT, SoundType.WOOL, 0.7f, 0.7f).randomTicks()));

    public static final RegistryObject<Block> ParasiteCanisterActive =
        SRPMain.BLOCKS.register("canisteractive", () -> new BlockParasiteCanisterC(
            p(MapColor.STONE, SoundType.STONE, 1.5f, 1.5f).randomTicks()));

    public static final RegistryObject<Block> ParasiteTrunk =
        SRPMain.BLOCKS.register("parasitetrunk", () -> new BlockParasiteTrunk(
            p(MapColor.WOOD, SoundType.WOOD, 2.2f, 2.2f).randomTicks()));

    public static final RegistryObject<Block> ParasiteStain =
        SRPMain.BLOCKS.register("parasitestain", () -> new BlockParasiteStain(
            p(MapColor.DIRT, SoundType.GRAVEL, 0.8f, 0.8f).randomTicks()));

    public static final RegistryObject<Block> ParasiteRubble =
        SRPMain.BLOCKS.register("parasiterubble", () -> new BlockParasiteRubble(
            p(MapColor.STONE, SoundType.STONE, 2.3f, 2.3f).randomTicks()));

    public static final RegistryObject<Block> ParasiteRubbleDense =
        SRPMain.BLOCKS.register("parasiterubbledense", () -> new BlockParasiteRubbleDense(
            p(MapColor.STONE, SoundType.STONE, 3.3f, 3.3f).randomTicks()));

    public static final RegistryObject<Block> ParasiteThin =
        SRPMain.BLOCKS.register("parasitethin", () -> new BlockParasiteThin(
            p(MapColor.WOOD, SoundType.WOOD, 2.2f, 2.2f).noCollission().randomTicks()));

    public static final RegistryObject<Block> ParasiteSapling =
        SRPMain.BLOCKS.register("parasitesapling", () -> new BlockParasiteSapling(
            p(MapColor.PLANT, SoundType.GRASS, 0.0f, 0.0f).noCollission().randomTicks()));

    public static final RegistryObject<Block> ParasiteMouth =
        SRPMain.BLOCKS.register("parasitemouth", () -> new BlockParasiteMouth(
            p(MapColor.PLANT, SoundType.WOOL, 1.4f, 1.4f).randomTicks()));

    public static final RegistryObject<Block> ParasiteFog =
        SRPMain.BLOCKS.register("parasitefog", () -> new BlockParasiteFog(
            BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().noOcclusion().replaceable()));

    public static final RegistryObject<Block> ParasiteVine =
        SRPMain.BLOCKS.register("parasitetendril", () -> new BlockVineBase(
            p(MapColor.PLANT, SoundType.GRASS, 0.5f, 0.5f).noCollission().randomTicks()));

    public static final RegistryObject<Block> SRPWeb =
        SRPMain.BLOCKS.register("srpweb", () -> new BlockWebBase(
            p(MapColor.SNOW, SoundType.WOOL, 0.0f, 0.0f).noCollission().randomTicks()));

    public static final RegistryObject<Block> evolutionLure =
        SRPMain.BLOCKS.register("evolutionlure", () -> new BlockEvolutionLure(
            p(MapColor.STONE, SoundType.STONE, 1.0f, 1.0f).randomTicks()));

    public static final RegistryObject<Block> buglin =
        SRPMain.BLOCKS.register("tunnel", () -> new BlockBuglin(
            p(MapColor.PLANT, SoundType.GRASS, 0.1f, 0.1f).randomTicks()));

    public static final RegistryObject<Block> Gore =
        SRPMain.BLOCKS.register("gore", () -> new BlockGore(
            p(MapColor.COLOR_RED, SoundType.GRASS, 0.0f, 0.0f).noCollission().randomTicks()));

    public static final RegistryObject<Block> dodN =
        SRPMain.BLOCKS.register("dispatchern", () -> new BlockDod(
            p(MapColor.PLANT, SoundType.GRASS, 0.1f, 0.1f).randomTicks()));

    public static final RegistryObject<Block> BloodyIce =
        SRPMain.BLOCKS.register("bloodyice", () -> new BlockBloodyIce(
            p(MapColor.ICE, SoundType.GLASS, 0.7f, 0.7f).randomTicks().friction(0.98f)));

    // ---- Escalones y losas ----
    public static final RegistryObject<Block> ParasiteRubbleBoneStair =
        SRPMain.BLOCKS.register("parasiterubble_bonestairs", () -> new BlockStairBase(
            () -> ParasiteRubble.get().defaultBlockState().setValue(BlockParasiteRubble.VARIANT, BlockParasiteRubble.EnumType.BONE),
            p(MapColor.STONE, SoundType.STONE, 2.3f, 2.3f)));

    public static final RegistryObject<Block> ParasiteStainFleshStair =
        SRPMain.BLOCKS.register("parasitestain_fleshstairs", () -> new BlockStairBase(
            () -> ParasiteStain.get().defaultBlockState().setValue(BlockParasiteStain.VARIANT, BlockParasiteStain.EnumType.FLESH),
            p(MapColor.DIRT, SoundType.GRAVEL, 0.8f, 0.8f)));

    public static final RegistryObject<Block> ParasiteRubbleSlabHalf =
        SRPMain.BLOCKS.register("parasiterubble_slabhalf", () -> new BlockSlabHalf(
            p(MapColor.STONE, SoundType.STONE, 3.3f, 3.3f)));

    public static final RegistryObject<Block> ParasiteRubbleSlabDouble =
        SRPMain.BLOCKS.register("parasiterubble_slabdouble", () -> new BlockSlabDouble(
            p(MapColor.STONE, SoundType.STONE, 3.3f, 3.3f)));

    // ---- Fluido ----
    public static final RegistryObject<Block> DeadBlood =
        SRPMain.BLOCKS.register("deadblood", () -> new BlockFluid(
            SRPFluids.DEADBLOOD_FLUID,
            BlockBehaviour.Properties.of().mapColor(MapColor.WATER).noCollission().strength(100.0f).noLootTable().replaceable(),
            true));

    // ---- Bloques vanilla opcionales (se resolvian por nombre en 1.12.2) ----
    // En 1.12.2 optionalDirt/optionalRub se obtenian con Block.getBlockFromName(config).
    // Aqui se resuelven en tiempo de ejecucion contra el registro de Minecraft.
    public static Block optionalDirt() {
        return net.minecraftforge.registries.ForgeRegistries.BLOCKS.getValue(
            new net.minecraft.resources.ResourceLocation(com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems.optionalBlock));
    }

    public static Block optionalRub() {
        return net.minecraftforge.registries.ForgeRegistries.BLOCKS.getValue(
            new net.minecraft.resources.ResourceLocation(com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems.optionalBlockRub));
    }

    public static void init() {
        // En 1.12.2 init() resolvia optionalDirt/optionalRub; en 1.20.1 son lookups dinamicos.
    }
}
