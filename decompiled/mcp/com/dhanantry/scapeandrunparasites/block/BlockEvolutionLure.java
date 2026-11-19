/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyEnum
 *  net.minecraft.block.state.BlockStateContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.client.util.ITooltipFlag
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.effect.EntityLightningBolt
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.IStringSerializable
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.block.BlockBase;
import com.dhanantry.scapeandrunparasites.block.IMetaName;
import com.dhanantry.scapeandrunparasites.entity.EntityParasiticScent;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.item.ItemBlockVariant;
import com.dhanantry.scapeandrunparasites.network.SRPPacketParticle;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class BlockEvolutionLure
extends BlockBase
implements IMetaName {
    public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.create((String)"variant", EnumType.class);

    public BlockEvolutionLure(Material material, String name, float hardness, boolean creative, boolean tickRandom) {
        super(material, name, hardness, creative, tickRandom);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, (Comparable)((Object)EnumType.ONE)));
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote && SRPConfigSystems.useEvolution) {
            SRPSaveData data;
            ItemStack head = new ItemStack(playerIn.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem());
            if (head.getItem() != Items.AIR) {
                return false;
            }
            if (this.checkBlocks(worldIn, pos, (EnumType)((Object)state.getValue(VARIANT)))) {
                worldIn.setBlockState(pos.north(3).east(3), Blocks.AIR.getDefaultState());
                worldIn.setBlockState(pos.north(3).west(3), Blocks.AIR.getDefaultState());
                worldIn.setBlockState(pos.south(3).east(3), Blocks.AIR.getDefaultState());
                worldIn.setBlockState(pos.south(3).west(3), Blocks.AIR.getDefaultState());
                SRPMain.network.sendToAll((IMessage)new SRPPacketParticle((double)pos.north(3).east(3).getX() + 0.5, pos.getY(), (double)pos.north(3).east(3).getZ() + 0.5, 0.5f, 0.5f, 2));
                SRPMain.network.sendToAll((IMessage)new SRPPacketParticle((double)pos.north(3).west(3).getX() + 0.5, pos.getY(), (double)pos.north(3).west(3).getZ() + 0.5, 0.5f, 0.5f, 2));
                SRPMain.network.sendToAll((IMessage)new SRPPacketParticle((double)pos.south(3).east(3).getX() + 0.5, pos.getY(), (double)pos.south(3).east(3).getZ() + 0.5, 0.5f, 0.5f, 2));
                SRPMain.network.sendToAll((IMessage)new SRPPacketParticle((double)pos.south(3).west(3).getX() + 0.5, pos.getY(), (double)pos.south(3).west(3).getZ() + 0.5, 0.5f, 0.5f, 2));
                playerIn.sendStatusMessage((ITextComponent)new TextComponentTranslation("message.srparasites.lurec", new Object[0]), true);
                data = SRPSaveData.get(worldIn);
                switch ((EnumType)((Object)state.getValue(VARIANT))) {
                    case EIGHT: {
                        data.setTotalKills(worldIn.provider.getDimension(), -SRPConfigSystems.luredValueEightCool, true, worldIn, true);
                        break;
                    }
                    case FIVE: {
                        data.setTotalKills(worldIn.provider.getDimension(), -SRPConfigSystems.luredValueFiveCool, true, worldIn, true);
                        break;
                    }
                    case FOUR: {
                        data.setTotalKills(worldIn.provider.getDimension(), -SRPConfigSystems.luredValueFourCool, true, worldIn, true);
                        break;
                    }
                    case ONE: {
                        data.setTotalKills(worldIn.provider.getDimension(), -SRPConfigSystems.luredValueOneCool, true, worldIn, true);
                        break;
                    }
                    case SEVEN: {
                        data.setTotalKills(worldIn.provider.getDimension(), -SRPConfigSystems.luredValueSevenCool, true, worldIn, true);
                        break;
                    }
                    case SIX: {
                        data.setTotalKills(worldIn.provider.getDimension(), -SRPConfigSystems.luredValueSixCool, true, worldIn, true);
                        break;
                    }
                    case THREE: {
                        data.setTotalKills(worldIn.provider.getDimension(), -SRPConfigSystems.luredValueThreeCool, true, worldIn, true);
                        break;
                    }
                    case TWO: {
                        data.setTotalKills(worldIn.provider.getDimension(), -SRPConfigSystems.luredValueTwoCool, true, worldIn, true);
                        break;
                    }
                    case NINE: {
                        data.setTotalKills(worldIn.provider.getDimension(), -SRPConfigSystems.luredValueNineCool, true, worldIn, true);
                        break;
                    }
                    case TEN: {
                        data.setTotalKills(worldIn.provider.getDimension(), -SRPConfigSystems.luredValueTenCool, true, worldIn, true);
                        break;
                    }
                }
                if (!playerIn.capabilities.disableDamage && SRPConfigSystems.useScent) {
                    EntityParasiticScent sss = new EntityParasiticScent(worldIn);
                    sss.setScentLevel(this.getLevelByPhase(state));
                    sss.copyLocationAndAnglesFrom((Entity)playerIn);
                    sss.setTargetToKill((EntityLivingBase)playerIn, false);
                    sss.setDieToE(true);
                    sss.setCanFollow(true);
                    worldIn.spawnEntity((Entity)sss);
                }
                worldIn.addWeatherEffect((Entity)new EntityLightningBolt(worldIn, (double)pos.getX() + 0.5, (double)pos.getY(), (double)pos.getZ() + 0.5, true));
            } else {
                data = SRPSaveData.get(worldIn);
                if (data.getEvolutionPhase(worldIn.provider.getDimension()) <= -1) {
                    return false;
                }
                switch ((EnumType)((Object)state.getValue(VARIANT))) {
                    case EIGHT: {
                        data.setCooldown(SRPConfigSystems.luredValueEight, worldIn, worldIn.provider.getDimension());
                        playerIn.sendStatusMessage((ITextComponent)new TextComponentTranslation("message.srparasites.lureb", new Object[0]), true);
                        break;
                    }
                    case FIVE: {
                        data.setCooldown(SRPConfigSystems.luredValueFive, worldIn, worldIn.provider.getDimension());
                        playerIn.sendStatusMessage((ITextComponent)new TextComponentTranslation("message.srparasites.lureb", new Object[0]), true);
                        break;
                    }
                    case FOUR: {
                        data.setCooldown(SRPConfigSystems.luredValueFour, worldIn, worldIn.provider.getDimension());
                        playerIn.sendStatusMessage((ITextComponent)new TextComponentTranslation("message.srparasites.lureb", new Object[0]), true);
                        break;
                    }
                    case ONE: {
                        data.setCooldown(SRPConfigSystems.luredValueOne, worldIn, worldIn.provider.getDimension());
                        playerIn.sendStatusMessage((ITextComponent)new TextComponentTranslation("message.srparasites.lureb", new Object[0]), true);
                        break;
                    }
                    case SEVEN: {
                        data.setCooldown(SRPConfigSystems.luredValueSeven, worldIn, worldIn.provider.getDimension());
                        playerIn.sendStatusMessage((ITextComponent)new TextComponentTranslation("message.srparasites.lureb", new Object[0]), true);
                        break;
                    }
                    case SIX: {
                        data.setCooldown(SRPConfigSystems.luredValueSix, worldIn, worldIn.provider.getDimension());
                        playerIn.sendStatusMessage((ITextComponent)new TextComponentTranslation("message.srparasites.lureb", new Object[0]), true);
                        break;
                    }
                    case THREE: {
                        data.setCooldown(SRPConfigSystems.luredValueThree, worldIn, worldIn.provider.getDimension());
                        playerIn.sendStatusMessage((ITextComponent)new TextComponentTranslation("message.srparasites.lureb", new Object[0]), true);
                        break;
                    }
                    case TWO: {
                        data.setCooldown(SRPConfigSystems.luredValueTwo, worldIn, worldIn.provider.getDimension());
                        playerIn.sendStatusMessage((ITextComponent)new TextComponentTranslation("message.srparasites.lureb", new Object[0]), true);
                    }
                    case NINE: {
                        data.setCooldown(SRPConfigSystems.luredValueNine, worldIn, worldIn.provider.getDimension());
                        playerIn.sendStatusMessage((ITextComponent)new TextComponentTranslation("message.srparasites.lureb", new Object[0]), true);
                    }
                    case TEN: {
                        data.setCooldown(SRPConfigSystems.luredValueTen, worldIn, worldIn.provider.getDimension());
                        playerIn.sendStatusMessage((ITextComponent)new TextComponentTranslation("message.srparasites.lureb", new Object[0]), true);
                        break;
                    }
                }
            }
            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
            for (int i = 0; i <= 3; ++i) {
                SRPMain.network.sendToAll((IMessage)new SRPPacketParticle((double)pos.getX() + 0.5, pos.getY(), (double)pos.getZ() + 0.5, 0.5f, 0.5f, 2));
            }
        }
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
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
        return new ItemBlockVariant(this);
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
    }

    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        IBlockState data = this.getStateFromMeta(stack.getMetadata());
        int i = 0;
        switch ((EnumType)((Object)data.getValue(VARIANT))) {
            case ONE: {
                i = SRPConfigSystems.luredValueOne;
                break;
            }
            case TWO: {
                i = SRPConfigSystems.luredValueTwo;
                break;
            }
            case THREE: {
                i = SRPConfigSystems.luredValueThree;
                break;
            }
            case FOUR: {
                i = SRPConfigSystems.luredValueFour;
                break;
            }
            case FIVE: {
                i = SRPConfigSystems.luredValueFive;
                break;
            }
            case SIX: {
                i = SRPConfigSystems.luredValueSix;
                break;
            }
            case SEVEN: {
                i = SRPConfigSystems.luredValueSeven;
                break;
            }
            case EIGHT: {
                i = SRPConfigSystems.luredValueEight;
                break;
            }
            case NINE: {
                i = SRPConfigSystems.luredValueEight;
                break;
            }
            case TEN: {
                i = SRPConfigSystems.luredValueEight;
            }
        }
        tooltip.add(I18n.format((String)("tooltip." + this.getTranslationKey()), (Object[])new Object[]{i}));
    }

    private int getLevelByPhase(IBlockState state) {
        switch ((EnumType)((Object)state.getValue(VARIANT))) {
            case EIGHT: {
                return SRPConfigSystems.eightLevelDeploy;
            }
            case FIVE: {
                return SRPConfigSystems.fiveLevelDeploy;
            }
            case FOUR: {
                return SRPConfigSystems.fourLevelDeploy;
            }
            case ONE: {
                return SRPConfigSystems.oneLevelDeploy;
            }
            case SEVEN: {
                return SRPConfigSystems.sevenLevelDeploy;
            }
            case SIX: {
                return SRPConfigSystems.sixLevelDeploy;
            }
            case THREE: {
                return SRPConfigSystems.threeLevelDeploy;
            }
            case TWO: {
                return SRPConfigSystems.twoLevelDeploy;
            }
            case NINE: {
                return SRPConfigSystems.nineLevelDeploy;
            }
            case TEN: {
                return SRPConfigSystems.tenLevelDeploy;
            }
        }
        return 0;
    }

    private boolean checkBlocks(World worldIn, BlockPos pos, EnumType t) {
        BlockPos base = pos;
        return worldIn.getBlockState(base.north(3).east(3)).getBlock() == SRPBlocks.evolutionLure && worldIn.getBlockState(base.north(3).west(3)).getBlock() == SRPBlocks.evolutionLure && worldIn.getBlockState(base.south(3).east(3)).getBlock() == SRPBlocks.evolutionLure && worldIn.getBlockState(base.south(3).west(3)).getBlock() == SRPBlocks.evolutionLure;
    }

    public static enum EnumType implements IStringSerializable
    {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN;


        public String getName() {
            return this.name().toLowerCase();
        }

        public String toString() {
            return this.getName();
        }
    }
}

