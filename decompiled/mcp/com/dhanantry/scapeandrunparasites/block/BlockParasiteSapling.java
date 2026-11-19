/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBush
 *  net.minecraft.block.IGrowable
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyEnum
 *  net.minecraft.block.properties.PropertyInteger
 *  net.minecraft.block.state.BlockStateContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.IStringSerializable
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraft.world.gen.feature.WorldGenBigTree
 *  net.minecraft.world.gen.feature.WorldGenTrees
 *  net.minecraftforge.event.terraingen.TerrainGen
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.block.IMetaName;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.item.ItemBlockVariant;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteTallFlower;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteTree;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteTreeThin;
import java.util.Objects;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BlockParasiteSapling
extends BlockBush
implements IGrowable,
IMetaName {
    public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.create((String)"variant", EnumType.class);
    public static final PropertyInteger STAGE = PropertyInteger.create((String)"stage", (int)0, (int)1);
    protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552, 0.0, 0.09999999403953552, (double)0.9f, (double)0.8f, (double)0.9f);

    public BlockParasiteSapling(String name) {
        this.setRegistryName(name);
        this.setTranslationKey("srparasites." + name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, (Comparable)((Object)EnumType.TREE)).withProperty((IProperty)STAGE, (Comparable)Integer.valueOf(0)));
        this.setCreativeTab(SRPMain.SRP_CREATIVETAB);
        SRPBlocks.SRP_BLOCKS.add((Block)this);
        ItemBlock itemBlock = this.getItemBlock();
        SRPItems.SRP_ITEMS.add((Item)itemBlock.setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return SAPLING_AABB;
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isRemote) {
            super.updateTick(worldIn, pos, state, rand);
            if (!worldIn.isAreaLoaded(pos, 1)) {
                return;
            }
            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0) {
                this.grow(worldIn, pos, state, rand);
            }
        }
    }

    public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if ((Integer)state.getValue((IProperty)STAGE) == 0) {
            worldIn.setBlockState(pos, state.cycleProperty((IProperty)STAGE), 4);
        } else {
            this.generateTree(worldIn, pos, state, rand);
        }
    }

    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!TerrainGen.saplingGrowTree((World)worldIn, (Random)rand, (BlockPos)pos)) {
            return;
        }
        Object worldgenerator = rand.nextInt(10) == 0 ? new WorldGenBigTree(true) : new WorldGenTrees(true);
        int i = 0;
        int j = 0;
        boolean flag = false;
        switch ((EnumType)((Object)state.getValue(VARIANT))) {
            case TREE: {
                worldgenerator = new WorldGenParasiteTree(true);
                break;
            }
            case TREETHIN: {
                worldgenerator = new WorldGenParasiteTreeThin(true);
                break;
            }
            case FLOWERTALL: {
                worldgenerator = new WorldGenParasiteTallFlower(true);
                break;
            }
        }
        worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 4);
        if (!worldgenerator.generate(worldIn, rand, pos.add(i, 0, j))) {
            worldIn.setBlockState(pos, state, 4);
        }
    }

    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return this.checkBush(worldIn.getBlockState(pos.down()));
    }

    public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state) {
        return this.checkBush(worldIn.getBlockState(pos.down()));
    }

    protected boolean checkBush(IBlockState state) {
        return state.isFullCube();
    }

    public boolean isTypeAt(World worldIn, BlockPos pos, EnumType type) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        return iblockstate.getBlock() == this && iblockstate.getValue(VARIANT) == type;
    }

    public int damageDropped(IBlockState state) {
        return ((EnumType)((Object)state.getValue(VARIANT))).ordinal();
    }

    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        for (EnumType blockplanks$enumtype : EnumType.values()) {
            items.add((Object)new ItemStack((Block)this, 1, blockplanks$enumtype.ordinal()));
        }
    }

    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return true;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return (double)worldIn.rand.nextFloat() < 0.45;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        this.grow(worldIn, pos, state, rand);
    }

    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, (Comparable)((Object)EnumType.values()[meta & 7])).withProperty((IProperty)STAGE, (Comparable)Integer.valueOf((meta & 8) >> 3));
    }

    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i |= ((EnumType)((Object)state.getValue(VARIANT))).ordinal();
        return i |= (Integer)state.getValue((IProperty)STAGE) << 3;
    }

    @Override
    public Enum[] getVariants() {
        return EnumType.values();
    }

    @Override
    public ItemBlock getItemBlock() {
        return new ItemBlockVariant((Block)this);
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer((Block)this, new IProperty[]{VARIANT, STAGE});
    }

    public static enum EnumType implements IStringSerializable
    {
        TREE,
        TREETHIN,
        FLOWERTALL;


        public String getName() {
            return this.name().toLowerCase();
        }

        public String toString() {
            return this.getName();
        }
    }
}

