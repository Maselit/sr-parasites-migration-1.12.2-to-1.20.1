/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.renderer.ItemMeshDefinition
 *  net.minecraft.client.renderer.block.model.ModelResourceLocation
 *  net.minecraft.client.renderer.block.statemap.IStateMapper
 *  net.minecraft.client.renderer.block.statemap.StateMapperBase
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.event.ModelRegistryEvent
 *  net.minecraftforge.client.model.ModelLoader
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 */
package com.dhanantry.scapeandrunparasites.util.handlers;

import com.dhanantry.scapeandrunparasites.block.BlockEvolutionLure;
import com.dhanantry.scapeandrunparasites.block.BlockGore;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedBush;
import com.dhanantry.scapeandrunparasites.block.BlockInfestedOre;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteBush;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteCanister;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteRubbleDense;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteSapling;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteStain;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteTrunk;
import com.dhanantry.scapeandrunparasites.block.BlockWebBase;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value={Side.CLIENT})
public class SRPRegisterModels {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        SRPRegisterModels.registerItemModels();
    }

    private static void registerItemModels() {
        SRPRegisterModels.registerItemModel(SRPItems.acanra_drop);
        SRPRegisterModels.registerItemModel(SRPItems.aemana_drop);
        SRPRegisterModels.registerItemModel(SRPItems.ahull_drop);
        SRPRegisterModels.registerItemModel(SRPItems.anogla_drop);
        SRPRegisterModels.registerItemModel(SRPItems.ashyco_drop);
        SRPRegisterModels.registerItemModel(SRPItems.abano_drop);
        SRPRegisterModels.registerItemModel(SRPItems.aranrac_drop);
        SRPRegisterModels.registerItemModel(SRPItems.alum_drop);
        SRPRegisterModels.registerItemModel(SRPItems.infected_drop);
        SRPRegisterModels.registerItemModel(SRPItems.venkrol_drop);
        SRPRegisterModels.registerItemModel(SRPItems.dod_drop);
        SRPRegisterModels.registerItemModel(SRPItems.itembase);
        SRPRegisterModels.registerItemModel(SRPItems.itemEvolve);
        SRPRegisterModels.registerItemModel(SRPItems.itemAssimilate);
        SRPRegisterModels.registerItemModel(SRPItems.itemDevolve);
        SRPRegisterModels.registerItemModel(SRPItems.itemVariant);
        SRPRegisterModels.registerItemModel(SRPItems.itemthrow);
        SRPRegisterModels.registerItemModel(SRPItems.itemEVClock);
        SRPRegisterModels.registerItemModel(SRPItems.biomeCompass);
        SRPRegisterModels.registerItemModel(SRPItems.tendrons);
        SRPRegisterModels.registerItemModel(SRPItems.hardbone);
        SRPRegisterModels.registerItemModel(SRPItems.infblade);
        SRPRegisterModels.registerItemModel(SRPItems.livingcore);
        SRPRegisterModels.registerItemModel(SRPItems.vileshell);
        SRPRegisterModels.registerItemModel(SRPItems.bone);
        SRPRegisterModels.registerItemModel(SRPItems.itemlurecomponent1);
        SRPRegisterModels.registerItemModel(SRPItems.itemlurecomponent2);
        SRPRegisterModels.registerItemModel(SRPItems.itemlurecomponent3);
        SRPRegisterModels.registerItemModel(SRPItems.itemlurecomponent4);
        SRPRegisterModels.registerItemModel(SRPItems.itemlurecomponent5);
        SRPRegisterModels.registerItemModel(SRPItems.itemlurecomponent6);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_rathol);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_gothol);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_lodo);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_mudo);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_nuuh);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_ata);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_buthol);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_anged);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_lesh);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_venkrol);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_venkrolsii);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_venkrolsiii);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_venkrolsiv);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_tonro);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_unvo);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_nak);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_dod);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_dodsii);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_dodsiii);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_dodsiv);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_alafha);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_ganro);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_omboo);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_esor);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_orch);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_flog);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_jinjo);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_vesta);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_pheon);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_lencia);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_elvia);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_dorpa);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infsquid);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infbear);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infhuman);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infhumanhead);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infenderman);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infendermanhead);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infcow);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infcowhead);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infsheep);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infsheephead);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infwolf);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infwolfhead);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infpig);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infpighead);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infvillager);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infvillagerhead);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_inhooS);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_inhooM);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infhorse);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infhorsehead);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infplayer);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infplayerhead);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infdragone);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_infdragonehead);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_ferbear);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_fercow);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_ferhuman);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_ferenderman);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_fersheep);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_ferpig);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_ferhorse);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_ferwolf);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_fervillager);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_hiblaze);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_higolem);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_hiskeleton);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_host);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_hostii);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_heed);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_cruxa);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_mes);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_shyco);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_hull);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_canra);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_emana);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_nogla);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_bano);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_wymo);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_iki);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_ranrac);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_lum);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_shycoadapted);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_canraadapted);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_noglaadapted);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_hulladapted);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_emanaadapted);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_banoadapted);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_ranracadapted);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_oronco);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_terla);
        SRPRegisterModels.registerItemModel(SRPItems.itemmobspawner_pod);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_scythe);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_scytheSentient);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_axe);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_axeSentient);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_sword);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_swordSentient);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_cleaver);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_cleaverSentient);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_bow);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_bow_sentient);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_maul);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_maulSentient);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_lance);
        SRPRegisterModels.registerItemModel(SRPItems.weapon_lanceSentient);
        SRPRegisterModels.registerItemModel(SRPItems.armor_helmet);
        SRPRegisterModels.registerItemModel(SRPItems.armor_chest);
        SRPRegisterModels.registerItemModel(SRPItems.armor_pants);
        SRPRegisterModels.registerItemModel(SRPItems.armor_boots);
        SRPRegisterModels.registerItemModel(SRPItems.armor_helmetSentient);
        SRPRegisterModels.registerItemModel(SRPItems.armor_chestSentient);
        SRPRegisterModels.registerItemModel(SRPItems.armor_pantsSentient);
        SRPRegisterModels.registerItemModel(SRPItems.armor_bootsSentient);
        SRPRegisterModels.registerItemModel(SRPBlocks.InfestedStain);
        SRPRegisterModels.registerItemModel(SRPBlocks.InfestedRubble);
        SRPRegisterModels.registerItemModel(SRPBlocks.InfestedTrunk);
        SRPRegisterModels.registerItemModel(SRPBlocks.InfestRemain);
        SRPRegisterModels.registerItemModel(SRPBlocks.BiomeHeart);
        SRPRegisterModels.registerItemModel(SRPBlocks.ColonyHeart);
        SRPRegisterModels.registerItemModel(SRPBlocks.ColonyOutpost);
        SRPRegisterModels.registerItemModel(SRPBlocks.BiomePurifier);
        SRPRegisterModels.registerItemModel(SRPBlocks.SRPWeb);
        SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteStructure);
        SRPRegisterModels.registerItemModel(SRPBlocks.buglin);
        SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteThin);
        SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteRubbleBoneStair);
        SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteStainFleshStair);
        SRPRegisterModels.registerItemModel((Block)SRPBlocks.ParasiteRubbleSlabHalf);
        SRPRegisterModels.registerItemModel((Block)SRPBlocks.ParasiteRubbleSlabDouble);
        SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteVine);
        SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteFog);
        SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteMouth);
        SRPRegisterModels.registerItemModel((Block)SRPBlocks.ParasiteCanisterActive);
        SRPRegisterModels.registerItemModel(SRPBlocks.dodN);
        SRPRegisterModels.registerItemModel(SRPBlocks.BloodyIce);
        SRPRegisterModels.registerBlockVariants();
        SRPRegisterModels.RegisterCustomMashesAndStates();
    }

    private static void registerItemModel(Item item) {
        ModelResourceLocation location = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation((Item)item, (int)0, (ModelResourceLocation)location);
    }

    private static void registerItemModel(Block block) {
        Item item = Item.func_150898_a((Block)block);
        ModelResourceLocation location = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
        ModelLoader.setCustomModelResourceLocation((Item)item, (int)0, (ModelResourceLocation)location);
    }

    private static void registerItemModel(Block block, int meta, String fileName) {
        ModelResourceLocation location = new ModelResourceLocation(new ResourceLocation("srparasites", fileName), "inventory");
        ModelLoader.setCustomModelResourceLocation((Item)Item.func_150898_a((Block)block), (int)meta, (ModelResourceLocation)location);
    }

    private static void registerBlockVariants() {
        int i;
        for (i = 0; i < BlockWebBase.EnumType.values().length; ++i) {
            SRPRegisterModels.registerItemModel(SRPBlocks.SRPWeb, i, "web_" + BlockWebBase.EnumType.values()[i].func_176610_l());
        }
        for (i = 0; i < BlockGore.EnumType.values().length; ++i) {
            SRPRegisterModels.registerItemModel((Block)SRPBlocks.Gore, i, "gore_" + BlockGore.EnumType.values()[i].func_176610_l());
        }
        for (i = 0; i < BlockEvolutionLure.EnumType.values().length; ++i) {
            SRPRegisterModels.registerItemModel(SRPBlocks.evolutionLure, i, "lure_" + BlockEvolutionLure.EnumType.values()[i].func_176610_l());
        }
        for (i = 0; i < BlockInfestedBush.EnumType.values().length; ++i) {
            SRPRegisterModels.registerItemModel((Block)SRPBlocks.InfestedBush, i, "infestedbush_" + BlockInfestedBush.EnumType.values()[i].func_176610_l());
        }
        for (i = 0; i < BlockParasiteCanister.EnumType.values().length; ++i) {
            SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteCanister, i, "canister_" + BlockParasiteCanister.EnumType.values()[i].func_176610_l());
        }
        for (i = 0; i < BlockParasiteRubble.EnumType.values().length; ++i) {
            SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteRubble, i, "rubble_" + BlockParasiteRubble.EnumType.values()[i].func_176610_l());
        }
        for (i = 0; i < BlockParasiteStain.EnumType.values().length; ++i) {
            SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteStain, i, "stain_" + BlockParasiteStain.EnumType.values()[i].func_176610_l());
        }
        for (i = 0; i < BlockParasiteTrunk.EnumType.values().length; ++i) {
            SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteTrunk, i, "trunk_" + BlockParasiteTrunk.EnumType.values()[i].func_176610_l());
        }
        for (i = 0; i < BlockParasiteBush.EnumType.values().length; ++i) {
            SRPRegisterModels.registerItemModel((Block)SRPBlocks.ParasiteBush, i, "parasitebush_" + BlockParasiteBush.EnumType.values()[i].func_176610_l());
        }
        for (i = 0; i < BlockParasiteSapling.EnumType.values().length; ++i) {
            SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteSapling, i, "sapling_" + BlockParasiteSapling.EnumType.values()[i].func_176610_l());
        }
        for (i = 0; i < BlockParasiteRubbleDense.EnumType.values().length; ++i) {
            SRPRegisterModels.registerItemModel(SRPBlocks.ParasiteRubbleDense, i, "rubbledense_" + BlockParasiteRubbleDense.EnumType.values()[i].func_176610_l());
        }
        for (i = 0; i < BlockInfestedOre.EnumType.values().length; ++i) {
            SRPRegisterModels.registerItemModel(SRPBlocks.InfestedOre, i, "infestedore_" + BlockInfestedOre.EnumType.values()[i].func_176610_l());
        }
        SRPRegisterModels.registerItemModel(SRPBlocks.BloodyIce, 0, "bloodyice");
    }

    public static void RegisterCustomMashesAndStates() {
        ModelLoader.setCustomMeshDefinition((Item)Item.func_150898_a((Block)SRPBlocks.DeadBlood), (ItemMeshDefinition)new ItemMeshDefinition(){

            public ModelResourceLocation func_178113_a(ItemStack stack) {
                return new ModelResourceLocation("srparasites:deadblood", "fluid");
            }
        });
        ModelLoader.setCustomStateMapper((Block)SRPBlocks.DeadBlood, (IStateMapper)new StateMapperBase(){

            protected ModelResourceLocation func_178132_a(IBlockState state) {
                return new ModelResourceLocation("srparasites:deadblood", "fluid");
            }
        });
    }
}

