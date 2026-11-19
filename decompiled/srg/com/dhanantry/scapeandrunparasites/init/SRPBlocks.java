/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockSlab
 *  net.minecraft.block.material.MapColor
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.material.MaterialLiquid
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemSlab
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.event.RegistryEvent$Register
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.IForgeRegistryEntry
 */
package com.dhanantry.scapeandrunparasites.init;

import com.dhanantry.scapeandrunparasites.block.BlockBiomeCore;
import com.dhanantry.scapeandrunparasites.block.BlockBiomePurifier;
import com.dhanantry.scapeandrunparasites.block.BlockBloodyIce;
import com.dhanantry.scapeandrunparasites.block.BlockBuglin;
import com.dhanantry.scapeandrunparasites.block.BlockColonyCore;
import com.dhanantry.scapeandrunparasites.block.BlockColonyStructure;
import com.dhanantry.scapeandrunparasites.block.BlockDod;
import com.dhanantry.scapeandrunparasites.block.BlockEvolutionLure;
import com.dhanantry.scapeandrunparasites.block.BlockFluid;
import com.dhanantry.scapeandrunparasites.block.BlockGore;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedBush;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedOre;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedRemain;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedRubble;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedStain;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedTrunk;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteBush;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteCanister;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteCanisterC;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteFog;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteMouth;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteRubbleDense;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteSapling;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteStain;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteThin;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteTrunk;
import com.dhanantry.scapeandrunparasites.block.BlockSlabDouble;
import com.dhanantry.scapeandrunparasites.block.BlockSlabHalf;
import com.dhanantry.scapeandrunparasites.block.BlockStairBase;
import com.dhanantry.scapeandrunparasites.block.BlockVineBase;
import com.dhanantry.scapeandrunparasites.block.BlockWebBase;
import com.dhanantry.scapeandrunparasites.block.IMetaName;
import com.dhanantry.scapeandrunparasites.init.SRPFluids;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class SRPBlocks {
    public static List<Block> SRP_BLOCKS = new ArrayList<Block>();
    public static Block InfestedStain = new BlockInfestedStain(Material.field_151578_c, "infestedstain", 0.7f, true, true);
    public static Block InfestRemain = new BlockInfestedRemain("infestremain");
    public static Block InfestedTrunk = new BlockInfestedTrunk(Material.field_151575_d, "infestedtrunk", 2.1f, true, true);
    public static Block InfestedRubble = new BlockInfestedRubble(Material.field_151576_e, "infestedrubble", 2.2f, true, true, 11.0f);
    public static BlockInfestedBush InfestedBush = new BlockInfestedBush("infestedbush", 0.4f);
    public static Block BiomeHeart;
    public static Block ColonyHeart;
    public static Block ColonyOutpost;
    public static Block BiomePurifier;
    public static Block optionalDirt;
    public static Block optionalRub;
    public static Block SRPWeb;
    public static Block evolutionLure;
    public static Block buglin;
    public static BlockParasiteBush ParasiteBush;
    public static Block ParasiteCanister;
    public static Block ParasiteTrunk;
    public static Block ParasiteStain;
    public static Block ParasiteRubble;
    public static Block ParasiteStructure;
    public static Block ParasiteThin;
    public static Block ParasiteSapling;
    public static Block ParasiteMouth;
    public static Block ParasiteRubbleDense;
    public static Block ParasiteRubbleBoneStair;
    public static Block ParasiteStainFleshStair;
    public static BlockSlab ParasiteRubbleSlabHalf;
    public static BlockSlab ParasiteRubbleSlabDouble;
    public static Block ParasiteVine;
    public static Block ParasiteFog;
    public static Block DeadBlood;
    public static BlockGore Gore;
    public static BlockParasiteCanisterC ParasiteCanisterActive;
    public static Block dodN;
    public static Block InfestedOre;
    public static Block BloodyIce;
    public static Material PARASITEBLOOD;

    public static void init() {
        optionalDirt = Block.func_149684_b((String)SRPConfigSystems.optionalBlock);
        optionalRub = Block.func_149684_b((String)SRPConfigSystems.optionalBlockRub);
    }

    static {
        BloodyIce = new BlockBloodyIce(Material.field_151588_w, "bloodyice", 0.7f, true, true);
        PARASITEBLOOD = new MaterialLiquid(MapColor.field_151662_n);
    }

    @Mod.EventBusSubscriber(modid="srparasites")
    public static class RegistrationHandler {
        private static IForgeRegistry<Item> itemRegistry;

        @SubscribeEvent
        public static void onEvent(RegistryEvent.Register<Block> event) {
            BiomeHeart = new BlockBiomeCore(Material.field_151576_e, "biomeheart", 60.0f, true, true, 2500.0f);
            ColonyHeart = new BlockColonyCore(Material.field_151576_e, "colonyheart", 60.0f, true, true, 2500.0f);
            ColonyOutpost = new BlockColonyCore(Material.field_151576_e, "colonyoutpost", 30.0f, true, true, 1200.0f);
            BiomePurifier = new BlockBiomePurifier("biomepurifier", 2.0f, true, true, 5.0f);
            ParasiteBush = new BlockParasiteBush("parasitebush", 0.5f);
            ParasiteCanister = new BlockParasiteCanister(Material.field_151570_A, "parasitecanister", 0.7f, true, true);
            ParasiteTrunk = new BlockParasiteTrunk(Material.field_151575_d, "parasitetrunk", 2.2f, true, true);
            ParasiteStain = new BlockParasiteStain(Material.field_151578_c, "parasitestain", 0.8f, true, true);
            ParasiteRubble = new BlockParasiteRubble(Material.field_151576_e, "parasiterubble", 2.3f, true, true);
            ParasiteStructure = new BlockColonyStructure(Material.field_151576_e, "parasitestructure", 5.0f, true, true, 20.0f);
            ParasiteThin = new BlockParasiteThin("parasitethin", 2.2f);
            ParasiteSapling = new BlockParasiteSapling("parasitesapling");
            ParasiteMouth = new BlockParasiteMouth(Material.field_151570_A, "parasitemouth", 1.4f, true, true);
            ParasiteRubbleDense = new BlockParasiteRubbleDense(Material.field_151576_e, "parasiterubbledense", 3.3f, true, true);
            ParasiteRubbleBoneStair = new BlockStairBase("parasiterubble_bonestairs", true, ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BONE)));
            ParasiteStainFleshStair = new BlockStairBase("parasitestain_fleshstairs", true, ParasiteStain.func_176223_P().func_177226_a(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.FLESH)));
            ParasiteRubbleSlabHalf = new BlockSlabHalf(Material.field_151576_e, "parasiterubble_slabhalf", 3.3f, true, false, ParasiteRubbleSlabHalf, ParasiteRubbleSlabDouble);
            ParasiteRubbleSlabDouble = new BlockSlabDouble(Material.field_151576_e, "parasiterubble_slabdouble", 3.3f, false, false, ParasiteRubbleSlabHalf);
            ParasiteVine = new BlockVineBase("parasitetendril", 0.5f, true, true);
            ParasiteFog = new BlockParasiteFog("parasitefog");
            DeadBlood = new BlockFluid("deadblood", SRPFluids.DEADBLOOD_FLUID, PARASITEBLOOD, true);
            SRPWeb = new BlockWebBase("srpweb");
            evolutionLure = new BlockEvolutionLure(Material.field_151576_e, "evolutionlure", 1.0f, true, true);
            buglin = new BlockBuglin("tunnel", 0.1f, true, true, 0.1f);
            Gore = new BlockGore("gore");
            ParasiteCanisterActive = new BlockParasiteCanisterC(Material.field_151576_e, "canisteractive", 1.5f, true, true);
            dodN = new BlockDod("dispatchern", 0.1f, true, true, 0.1f);
            InfestedOre = new BlockInfestedOre(Material.field_151578_c, "infestedore", 3.5f, true, false);
            event.getRegistry().registerAll((IForgeRegistryEntry[])SRP_BLOCKS.toArray(new Block[0]));
        }

        @SubscribeEvent
        public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
            itemRegistry = event.getRegistry();
            RegistrationHandler.registerItemBlock((Block)ParasiteRubbleSlabHalf);
        }

        private static void registerItemBlock(Block block) {
            Object itemBlock = block instanceof IMetaName ? ((IMetaName)block).getItemBlock() : (block instanceof BlockSlab ? new ItemSlab(block, ParasiteRubbleSlabHalf, ParasiteRubbleSlabDouble) : new ItemBlock(block));
            ResourceLocation registryName = block.getRegistryName();
            itemRegistry.register(itemBlock.setRegistryName(registryName));
        }
    }
}

