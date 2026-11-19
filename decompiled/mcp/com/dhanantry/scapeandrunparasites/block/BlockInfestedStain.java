/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
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
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.block.BlockBase;
import com.dhanantry.scapeandrunparasites.client.particle.ParticleSpawner;
import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import java.util.Random;
import net.minecraft.block.Block;
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
import net.minecraft.init.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockInfestedStain
extends BlockBase {
    public static final PropertyInteger STAGE = PropertyInteger.create((String)"stage", (int)0, (int)5);

    public BlockInfestedStain(Material material, String name, float hardness, boolean creative, boolean tickRandom) {
        super(material, name, hardness, creative, tickRandom);
        this.setHarvestLevel("shovel", 0);
        this.setSoundType(new SoundType(1.0f, 0.5f, SRPSounds.BLOCKINFEST_BREAK, SRPSounds.BLOCKINFEST_STEP, SRPSounds.BLOCKINFEST_PLACE, SRPSounds.BLOCKINFEST_HIT, SoundEvents.BLOCK_SLIME_FALL));
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty)STAGE, (Comparable)Integer.valueOf(0)));
    }

    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        boolean flag = super.removedByPlayer(state, world, pos, player, willHarvest);
        if (world.isRemote) {
            return flag;
        }
        if (SRPConfigSystems.useEvolution && this.getMetaFromState(state) > 0) {
            SRPSaveData data = SRPSaveData.get(world);
            data.setTotalKills(world.provider.getDimension(), -SRPConfigSystems.valueLossBlockStain, true, world, false);
        }
        return flag;
    }

    public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isAreaLoaded(pos, 3)) {
            return;
        }
        if (rand.nextDouble() < 0.5) {
            if (worldIn.getBiome(pos) instanceof BiomeParasite) {
                worldIn.setBlockState(pos, SRPBlocks.ParasiteStain.getDefaultState());
            } else {
                int heart = ParasiteEventWorld.canBiomeStillExist(worldIn, pos, true);
                if (heart > 0) {
                    ParasiteEventWorld.SpreadBiome(worldIn, pos, heart);
                }
            }
        } else if (rand.nextDouble() <= 0.05) {
            if (!worldIn.isUpdateScheduled(pos, state.getBlock())) {
                this.updateTick(worldIn, pos, state, rand);
            }
        } else if (!worldIn.isUpdateScheduled(pos, state.getBlock())) {
            worldIn.updateBlockTick(pos, state.getBlock(), ParasiteEventWorld.getTimer(this.getMetaFromState(state)), 5);
        }
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isAreaLoaded(pos, 3)) {
            return;
        }
        if (!worldIn.isRemote) {
            ParasiteEventWorld.canInfestBlock(worldIn, pos, rand, this.getMetaFromState(state), true);
        }
    }

    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if (!worldIn.isRemote) {
            if (entityIn.ticksExisted % 20 != 0) {
                return;
            }
            if (!(entityIn instanceof EntityParasiteBase) && entityIn instanceof EntityLivingBase) {
                int meta = this.getMetaFromState(worldIn.getBlockState(pos));
                if (entityIn.ticksExisted % 400 == 0) {
                    Random rand;
                    if (entityIn instanceof EntityPlayer) {
                        EntityPlayer in = (EntityPlayer)entityIn;
                        if (in.capabilities.disableDamage) {
                            return;
                        }
                    }
                    if ((rand = new Random()).nextInt(4) == 0) {
                        ParasiteEventEntity.spawnTurrets((EntityLivingBase)entityIn, 4, (byte)2, meta);
                    } else {
                        ParasiteEventEntity.spawnTurrets((EntityLivingBase)entityIn, 10, (byte)1, meta);
                    }
                }
            }
        }
        super.onEntityWalk(worldIn, pos, entityIn);
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer((Block)this, new IProperty[]{STAGE});
    }

    public int getMetaFromState(IBlockState state) {
        return (Integer)state.getValue((IProperty)STAGE);
    }

    public IBlockState getStateFromMeta(int meta) {
        if (meta >= 5) {
            meta = 5;
        }
        return this.getDefaultState().withProperty((IProperty)STAGE, (Comparable)Integer.valueOf(meta & 7));
    }

    @SideOnly(value=Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        if (worldIn.getBlockState(pos.up()).getBlock() != Blocks.AIR && worldIn.getBlockState(pos.up()).getBlock() != SRPBlocks.ParasiteBush) {
            return;
        }
        int stage = this.getMetaFromState(stateIn);
        if (stage == 2) {
            if (rand.nextDouble() <= (double)SRPConfigSystems.rsBlockParticleS) {
                double d0 = (double)pos.getX() + rand.nextDouble();
                double d1 = (double)pos.getY() + 2.5;
                double d2 = (double)pos.getZ() + rand.nextDouble();
                ParticleSpawner.spawnParticle(SRPEnumParticle.SPORE, d0, d1, d2, 0.0, 0.0, 0.0, 0, 0, 0);
                return;
            }
        } else if (stage == 3) {
            double d2;
            double d1;
            double d0;
            if (rand.nextDouble() <= (double)SRPConfigSystems.rsBlockParticleF) {
                d0 = (double)pos.getX() + rand.nextDouble();
                d1 = (double)pos.getY() + 1.5;
                d2 = (double)pos.getZ() + rand.nextDouble();
                int g = 200;
                if (rand.nextInt(3) == 0) {
                    g += 50;
                }
                ParticleSpawner.spawnParticle(SRPEnumParticle.FOG, d0, d1, d2, 0.0, 1.0E-4, 0.0, 0, g, 0);
            }
            if (rand.nextDouble() <= (double)SRPConfigSystems.rsBlockParticleS) {
                d0 = (double)pos.getX() + rand.nextDouble();
                d1 = (double)pos.getY() + 2.5;
                d2 = (double)pos.getZ() + rand.nextDouble();
                ParticleSpawner.spawnParticle(SRPEnumParticle.SPORE, d0, d1, d2, 0.0, 0.0, 0.0, 0, 0, 0);
            }
        }
    }
}

