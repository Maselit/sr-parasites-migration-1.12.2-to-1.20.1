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
 *  net.minecraft.block.properties.PropertyInteger
 *  net.minecraft.block.state.BlockStateContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.ClassInheritanceMultiMap
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.EnumDifficulty
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrol;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ClassInheritanceMultiMap;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockInfestedRemain
extends BlockBush {
    protected static final AxisAlignedBB TALL_GRASS_AABB = new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
    public static final PropertyInteger SOURCE = PropertyInteger.create((String)"source", (int)0, (int)1);

    public BlockInfestedRemain(String name) {
        super(Material.VINE);
        this.setRegistryName(name);
        this.setTranslationKey("srparasites." + name);
        this.setSoundType(SoundType.PLANT);
        this.setTickRandomly(true);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty)SOURCE, (Comparable)Integer.valueOf(0)));
        SRPBlocks.SRP_BLOCKS.add((Block)this);
        SRPItems.SRP_ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return TALL_GRASS_AABB;
    }

    public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state) {
        if (this.getMetaFromState(state) == 1) {
            return worldIn.getBlockState(pos.down()).isFullBlock();
        }
        return this.canSustainBush(worldIn.getBlockState(pos.down()));
    }

    protected boolean canSustainBush(IBlockState state) {
        return state.getBlock() == SRPBlocks.optionalDirt || state.getBlock() == SRPBlocks.optionalRub;
    }

    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
        return true;
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isRemote) {
            if (worldIn.getDifficulty() == EnumDifficulty.PEACEFUL) {
                return;
            }
            if (!worldIn.getBlockState(pos.down()).isFullCube()) {
                worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
                return;
            }
            if (rand.nextDouble() < 0.5) {
                if (worldIn.getBiome(pos) instanceof BiomeParasite) {
                    ParasiteEventWorld.spreadBiomeBlockStain(worldIn, pos, rand);
                    return;
                }
                int heart = ParasiteEventWorld.canBiomeStillExist(worldIn, pos, true);
                if (heart > 0) {
                    ParasiteEventWorld.SpreadBiome(worldIn, pos, heart);
                }
            }
            if (!SRPConfig.allowMobs) {
                return;
            }
            if (SRPConfigSystems.rsResidueY <= pos.getY()) {
                if (SRPConfigSystems.useEvolution) {
                    int chance = this.getEvoResidue(SRPSaveData.get(worldIn).getEvolutionPhase(worldIn.provider.getDimension()));
                    if (chance <= 0) {
                        return;
                    }
                    if (rand.nextInt(chance) == 0) {
                        if (SRPConfigSystems.rsSkyResidue && !worldIn.canSeeSky(new BlockPos((double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5))) {
                            return;
                        }
                        if (ParasiteEventEntity.entityChunkCount(worldIn, pos, EntityPStationaryArchitect.class) >= SRPConfigSystems.rsMaxVenkrolChunk) {
                            return;
                        }
                        AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)(pos.getY() + 1), (double)(pos.getZ() + 1)).grow((double)(SRPConfigMobs.venkrolsiiiRange - 1), (double)SRPConfigMobs.venkrolsiiiRangeY, (double)(SRPConfigMobs.venkrolsiiiRange - 1));
                        List moblist = worldIn.getEntitiesWithinAABB(EntityPStationaryArchitect.class, axisalignedbb);
                        if (moblist.isEmpty() && ParasiteEventEntity.getRSchance(worldIn) > 0.0) {
                            EntityVenkrol entityOut = new EntityVenkrol(worldIn);
                            entityOut.setPosition((double)pos.getX() + 0.5, pos.getY() + 1, (double)pos.getZ() + 0.5);
                            if (!entityOut.world.getCollisionBoxes((Entity)entityOut, entityOut.getEntityBoundingBox()).isEmpty()) {
                                entityOut.setDead();
                                return;
                            }
                            worldIn.spawnEntity((Entity)entityOut);
                            if (SRPConfigSystems.rsSounds) {
                                entityOut.playSound(SRPSounds.VENKROLSI, 4.0f, 1.0f);
                            }
                        }
                    }
                } else {
                    if (SRPConfigSystems.rsVenkrolChance <= 0) {
                        return;
                    }
                    if (rand.nextInt(SRPConfigSystems.rsVenkrolChance) == 0) {
                        if (SRPConfigSystems.rsSkyResidue && !worldIn.canSeeSky(new BlockPos((double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5))) {
                            return;
                        }
                        ClassInheritanceMultiMap[] a = worldIn.getChunk(pos).getEntityLists();
                        int v = 0;
                        for (int i = 0; i < a.length; ++i) {
                            if (a[i] == null) continue;
                            Object[] b = a[i].toArray();
                            for (int x = 0; x < b.length; ++x) {
                                if (b[x] == null) continue;
                                if (b[x] instanceof EntityPStationaryArchitect) {
                                    ++v;
                                }
                                if (v < SRPConfigSystems.rsMaxVenkrolChunk) continue;
                                return;
                            }
                        }
                        AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)(pos.getY() + 1), (double)(pos.getZ() + 1)).grow((double)(SRPConfigMobs.venkrolsiiiRange - 1), (double)SRPConfigMobs.venkrolsiiiRangeY, (double)(SRPConfigMobs.venkrolsiiiRange - 1));
                        List moblist = worldIn.getEntitiesWithinAABB(EntityPStationaryArchitect.class, axisalignedbb);
                        if (moblist.isEmpty()) {
                            EntityVenkrol entityOut = new EntityVenkrol(worldIn);
                            entityOut.setPosition((double)pos.getX() + 0.5, pos.getY() + 1, (double)pos.getZ() + 0.5);
                            if (!entityOut.world.getCollisionBoxes((Entity)entityOut, entityOut.getEntityBoundingBox()).isEmpty()) {
                                entityOut.setDead();
                                return;
                            }
                            worldIn.spawnEntity((Entity)entityOut);
                            if (SRPConfigSystems.rsSounds) {
                                entityOut.playSound(SRPSounds.VENKROLSI, 4.0f, 1.0f);
                            }
                        }
                    }
                }
            }
        }
    }

    private int getEvoResidue(byte in) {
        int q = -5;
        switch (in) {
            case 1: {
                q = SRPConfigSystems.phaseResidueOne;
                break;
            }
            case 2: {
                q = SRPConfigSystems.phaseResidueTwo;
                break;
            }
            case 3: {
                q = SRPConfigSystems.phaseResidueThree;
                break;
            }
            case 4: {
                q = SRPConfigSystems.phaseResidueFour;
                break;
            }
            case 5: {
                q = SRPConfigSystems.phaseResidueFive;
                break;
            }
            case 6: {
                q = SRPConfigSystems.phaseResidueSix;
                break;
            }
            case 7: {
                q = SRPConfigSystems.phaseResidueSeven;
                break;
            }
            case 8: {
                q = SRPConfigSystems.phaseResidueEight;
            }
        }
        return q;
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

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer((Block)this, new IProperty[]{SOURCE});
    }

    public int getMetaFromState(IBlockState state) {
        return (Integer)state.getValue((IProperty)SOURCE);
    }

    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty((IProperty)SOURCE, (Comparable)Integer.valueOf(meta & 1));
    }
}

