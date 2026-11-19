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
    public static final PropertyInteger SOURCE = PropertyInteger.func_177719_a((String)"source", (int)0, (int)1);

    public BlockInfestedRemain(String name) {
        super(Material.field_151582_l);
        this.setRegistryName(name);
        this.func_149663_c("srparasites." + name);
        this.func_149672_a(SoundType.field_185850_c);
        this.func_149675_a(true);
        this.func_180632_j(this.field_176227_L.func_177621_b().func_177226_a((IProperty)SOURCE, (Comparable)Integer.valueOf(0)));
        SRPBlocks.SRP_BLOCKS.add((Block)this);
        SRPItems.SRP_ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    public AxisAlignedBB func_185496_a(IBlockState state, IBlockAccess source, BlockPos pos) {
        return TALL_GRASS_AABB;
    }

    public boolean func_180671_f(World worldIn, BlockPos pos, IBlockState state) {
        if (this.func_176201_c(state) == 1) {
            return worldIn.func_180495_p(pos.func_177977_b()).func_185913_b();
        }
        return this.func_185514_i(worldIn.func_180495_p(pos.func_177977_b()));
    }

    protected boolean func_185514_i(IBlockState state) {
        return state.func_177230_c() == SRPBlocks.optionalDirt || state.func_177230_c() == SRPBlocks.optionalRub;
    }

    public boolean func_176200_f(IBlockAccess worldIn, BlockPos pos) {
        return true;
    }

    public void func_180650_b(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.field_72995_K) {
            if (worldIn.func_175659_aa() == EnumDifficulty.PEACEFUL) {
                return;
            }
            if (!worldIn.func_180495_p(pos.func_177977_b()).func_185917_h()) {
                worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());
                return;
            }
            if (rand.nextDouble() < 0.5) {
                if (worldIn.func_180494_b(pos) instanceof BiomeParasite) {
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
            if (SRPConfigSystems.rsResidueY <= pos.func_177956_o()) {
                if (SRPConfigSystems.useEvolution) {
                    int chance = this.getEvoResidue(SRPSaveData.get(worldIn).getEvolutionPhase(worldIn.field_73011_w.getDimension()));
                    if (chance <= 0) {
                        return;
                    }
                    if (rand.nextInt(chance) == 0) {
                        if (SRPConfigSystems.rsSkyResidue && !worldIn.func_175678_i(new BlockPos((double)pos.func_177958_n() + 0.5, (double)pos.func_177956_o() + 0.5, (double)pos.func_177952_p() + 0.5))) {
                            return;
                        }
                        if (ParasiteEventEntity.entityChunkCount(worldIn, pos, EntityPStationaryArchitect.class) >= SRPConfigSystems.rsMaxVenkrolChunk) {
                            return;
                        }
                        AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)pos.func_177958_n(), (double)pos.func_177956_o(), (double)pos.func_177952_p(), (double)(pos.func_177958_n() + 1), (double)(pos.func_177956_o() + 1), (double)(pos.func_177952_p() + 1)).func_72314_b((double)(SRPConfigMobs.venkrolsiiiRange - 1), (double)SRPConfigMobs.venkrolsiiiRangeY, (double)(SRPConfigMobs.venkrolsiiiRange - 1));
                        List moblist = worldIn.func_72872_a(EntityPStationaryArchitect.class, axisalignedbb);
                        if (moblist.isEmpty() && ParasiteEventEntity.getRSchance(worldIn) > 0.0) {
                            EntityVenkrol entityOut = new EntityVenkrol(worldIn);
                            entityOut.func_70107_b((double)pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, (double)pos.func_177952_p() + 0.5);
                            if (!entityOut.field_70170_p.func_184144_a((Entity)entityOut, entityOut.func_174813_aQ()).isEmpty()) {
                                entityOut.func_70106_y();
                                return;
                            }
                            worldIn.func_72838_d((Entity)entityOut);
                            if (SRPConfigSystems.rsSounds) {
                                entityOut.func_184185_a(SRPSounds.VENKROLSI, 4.0f, 1.0f);
                            }
                        }
                    }
                } else {
                    if (SRPConfigSystems.rsVenkrolChance <= 0) {
                        return;
                    }
                    if (rand.nextInt(SRPConfigSystems.rsVenkrolChance) == 0) {
                        if (SRPConfigSystems.rsSkyResidue && !worldIn.func_175678_i(new BlockPos((double)pos.func_177958_n() + 0.5, (double)pos.func_177956_o() + 0.5, (double)pos.func_177952_p() + 0.5))) {
                            return;
                        }
                        ClassInheritanceMultiMap[] a = worldIn.func_175726_f(pos).func_177429_s();
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
                        AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)pos.func_177958_n(), (double)pos.func_177956_o(), (double)pos.func_177952_p(), (double)(pos.func_177958_n() + 1), (double)(pos.func_177956_o() + 1), (double)(pos.func_177952_p() + 1)).func_72314_b((double)(SRPConfigMobs.venkrolsiiiRange - 1), (double)SRPConfigMobs.venkrolsiiiRangeY, (double)(SRPConfigMobs.venkrolsiiiRange - 1));
                        List moblist = worldIn.func_72872_a(EntityPStationaryArchitect.class, axisalignedbb);
                        if (moblist.isEmpty()) {
                            EntityVenkrol entityOut = new EntityVenkrol(worldIn);
                            entityOut.func_70107_b((double)pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, (double)pos.func_177952_p() + 0.5);
                            if (!entityOut.field_70170_p.func_184144_a((Entity)entityOut, entityOut.func_174813_aQ()).isEmpty()) {
                                entityOut.func_70106_y();
                                return;
                            }
                            worldIn.func_72838_d((Entity)entityOut);
                            if (SRPConfigSystems.rsSounds) {
                                entityOut.func_184185_a(SRPSounds.VENKROLSI, 4.0f, 1.0f);
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

    public void func_180634_a(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        if (!worldIn.field_72995_K) {
            EntityLivingBase target;
            if (worldIn.field_73012_v.nextDouble() < 0.5 && entityIn.field_70173_aa % 20 != 0) {
                return;
            }
            if (!(entityIn instanceof EntityParasiteBase) && entityIn instanceof EntityLivingBase && !(target = (EntityLivingBase)entityIn).func_70644_a(SRPPotions.COTH_E)) {
                if (target.func_70644_a(SRPPotions.EPEL_E)) {
                    if (worldIn.field_73012_v.nextDouble() >= SRPConfigSystems.epelChanceCOTH) {
                        target.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                    }
                } else {
                    target.func_70690_d(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                }
            }
        }
        super.func_180634_a(worldIn, pos, state, entityIn);
    }

    public Item func_180660_a(IBlockState state, Random rand, int fortune) {
        return null;
    }

    public void func_180657_a(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
        super.func_180657_a(worldIn, player, pos, state, te, stack);
    }

    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return false;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return false;
    }

    protected BlockStateContainer func_180661_e() {
        return new BlockStateContainer((Block)this, new IProperty[]{SOURCE});
    }

    public int func_176201_c(IBlockState state) {
        return (Integer)state.func_177229_b((IProperty)SOURCE);
    }

    public IBlockState func_176203_a(int meta) {
        return this.func_176223_P().func_177226_a((IProperty)SOURCE, (Comparable)Integer.valueOf(meta & 1));
    }
}

