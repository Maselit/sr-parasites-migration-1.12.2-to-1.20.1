/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBush
 *  net.minecraft.block.SoundType
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyEnum
 *  net.minecraft.block.state.BlockStateContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.IStringSerializable
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.block.IMetaName;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.item.ItemBlockVariant;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import java.util.Objects;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGore
extends BlockBush
implements IMetaName {
    protected static final AxisAlignedBB TALL_GRASS_AABB = new AxisAlignedBB(0.09999999403953552, 0.0, 0.09999999403953552, (double)0.9f, (double)0.8f, (double)0.9f);
    public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.create((String)"variant", EnumType.class);

    public BlockGore(String name) {
        super(Material.VINE);
        this.setRegistryName(name);
        this.setTranslationKey("srparasites." + name);
        this.setSoundType(SoundType.PLANT);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, (Comparable)((Object)EnumType.SIM_SMALL)));
        this.setCreativeTab(SRPMain.SRP_CREATIVETAB);
        this.setTickRandomly(true);
        SRPBlocks.SRP_BLOCKS.add((Block)this);
        ItemBlock itemBlock = this.getItemBlock();
        SRPItems.SRP_ITEMS.add((Item)itemBlock.setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        EnumType variant = (EnumType)((Object)state.getValue(VARIANT));
        return TALL_GRASS_AABB;
    }

    public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state) {
        return this.checkBush(worldIn.getBlockState(pos.down()));
    }

    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return this.checkBush(worldIn.getBlockState(pos.down()));
    }

    protected boolean checkBush(IBlockState state) {
        return state.isFullCube();
    }

    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
        if (!this.canBlockStay(worldIn, fromPos, state)) {
            worldIn.setBlockToAir(pos);
        }
    }

    public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        if (!worldIn.isRemote) {
            EntityLivingBase target;
            if (worldIn.rand.nextDouble() < 0.5 && entityIn.ticksExisted % 20 != 0) {
                return;
            }
            if (!(entityIn instanceof EntityParasiteBase) && entityIn instanceof EntityLivingBase && !(target = (EntityLivingBase)entityIn).isPotionActive(SRPPotions.COTH_E)) {
                if (target.isPotionActive(SRPPotions.EPEL_E)) {
                    if (worldIn.rand.nextDouble() >= SRPConfigSystems.epelChanceCOTH) {
                        target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                    }
                } else {
                    target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                }
            }
        }
        super.onEntityCollision(worldIn, pos, state, entityIn);
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isRemote) {
            int air = 10;
            EnumType c = (EnumType)((Object)state.getValue(VARIANT));
            if (c == EnumType.ADA_BIG || c == EnumType.PRI_BIG || c == EnumType.PURE_BIG || c == EnumType.SIM_BIG) {
                air = 45;
            }
            if (worldIn.rand.nextInt(air) == 0) {
                worldIn.setBlockToAir(pos);
            }
        }
    }

    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        super.onEntityWalk(worldIn, pos, entityIn);
    }

    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
        return false;
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return null;
    }

    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
        super.harvestBlock(worldIn, player, pos, state, te, stack);
    }

    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return false;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return false;
    }

    public int damageDropped(IBlockState state) {
        return this.getMetaFromState(state);
    }

    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        for (EnumType variant : EnumType.values()) {
            items.add((Object)new ItemStack((Block)this, 1, variant.ordinal()));
        }
    }

    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, (Comparable)((Object)EnumType.values()[meta]));
    }

    public int getMetaFromState(IBlockState state) {
        return ((EnumType)((Object)state.getValue(VARIANT))).ordinal();
    }

    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(Item.getItemFromBlock((Block)this), 1, this.getMetaFromState(world.getBlockState(pos)));
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer((Block)this, new IProperty[]{VARIANT});
    }

    @Override
    public Enum[] getVariants() {
        return EnumType.values();
    }

    @Override
    public ItemBlock getItemBlock() {
        return new ItemBlockVariant((Block)this);
    }

    public static enum EnumType implements IStringSerializable
    {
        SIM_SMALL,
        SIM_BIG,
        PRI_SMALL,
        PRI_BIG,
        ADA_SMALL,
        ADA_BIG,
        PURE_SMALL,
        PURE_BIG,
        SIM_FLAT,
        PRI_FLAT,
        ADA_FLAT,
        PURE_FLAT;


        public String getName() {
            return this.name().toLowerCase();
        }

        public String toString() {
            return this.getName();
        }
    }
}

