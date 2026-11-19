/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockRotatedPillar
 *  net.minecraft.block.SoundType
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyEnum
 *  net.minecraft.block.state.BlockStateContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumFacing$Axis
 *  net.minecraft.util.IStringSerializable
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.block.IMetaName;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.item.ItemBlockVariant;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import java.util.Objects;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockParasiteTrunk
extends BlockRotatedPillar
implements IMetaName {
    public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.create((String)"variant", EnumType.class);

    public BlockParasiteTrunk(Material material, String name, float hardness, boolean creative, boolean tickRandom) {
        super(material);
        this.setHarvestLevel("axe", 0);
        this.setRegistryName(name);
        this.setTranslationKey("srparasites." + name);
        this.setHardness(hardness);
        this.setTickRandomly(tickRandom);
        this.setSoundType(SoundType.WOOD);
        if (creative) {
            this.setCreativeTab(SRPMain.SRP_CREATIVETAB);
        }
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, (Comparable)((Object)EnumType.TREE)).withProperty((IProperty)AXIS, (Comparable)EnumFacing.Axis.Y));
        SRPBlocks.SRP_BLOCKS.add((Block)this);
        ItemBlock itemBlock = this.getItemBlock();
        SRPItems.SRP_ITEMS.add((Item)itemBlock.setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    public int damageDropped(IBlockState state) {
        return ((EnumType)((Object)state.getValue(VARIANT))).ordinal();
    }

    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        for (EnumType variant : EnumType.values()) {
            items.add((Object)new ItemStack((Block)this, 1, variant.ordinal()));
        }
    }

    public IBlockState getStateFromMeta(int meta) {
        IBlockState state = this.getDefaultState().withProperty(VARIANT, (Comparable)((Object)EnumType.values()[(meta & 3) % EnumType.values().length]));
        int i = meta & 0xC;
        EnumFacing.Axis enumfacing$axis = EnumFacing.Axis.Y;
        if (i == 4) {
            enumfacing$axis = EnumFacing.Axis.X;
        } else if (i == 8) {
            enumfacing$axis = EnumFacing.Axis.Z;
        }
        return state.withProperty((IProperty)AXIS, (Comparable)enumfacing$axis);
    }

    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i |= ((EnumType)((Object)state.getValue(VARIANT))).ordinal();
        EnumFacing.Axis enumfacing$axis = (EnumFacing.Axis)state.getValue((IProperty)AXIS);
        if (enumfacing$axis == EnumFacing.Axis.X) {
            i |= 4;
        } else if (enumfacing$axis == EnumFacing.Axis.Z) {
            i |= 8;
        }
        return i;
    }

    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(Item.getItemFromBlock((Block)this), 1, this.getMetaFromState(world.getBlockState(pos)));
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer((Block)this, new IProperty[]{VARIANT, AXIS});
    }

    protected ItemStack getSilkTouchDrop(IBlockState state) {
        return super.getSilkTouchDrop(state);
    }

    @Override
    public Enum[] getVariants() {
        return EnumType.values();
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isAreaLoaded(pos, 3)) {
            return;
        }
        if (worldIn.getBiome(pos) instanceof BiomeParasite) {
            ParasiteEventWorld.spreadBiomeBlockTrunk(worldIn, pos, rand);
        }
    }

    @Override
    public ItemBlock getItemBlock() {
        return new ItemBlockVariant((Block)this);
    }

    public static enum EnumType implements IStringSerializable
    {
        BALL,
        TREE,
        PLANT;


        public String getName() {
            return this.name().toLowerCase();
        }

        public String toString() {
            return this.getName();
        }
    }
}

