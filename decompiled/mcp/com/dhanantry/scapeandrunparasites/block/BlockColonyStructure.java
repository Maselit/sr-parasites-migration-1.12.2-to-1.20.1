/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockLeaves
 *  net.minecraft.block.material.EnumPushReaction
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyInteger
 *  net.minecraft.block.state.BlockStateContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 */
package com.dhanantry.scapeandrunparasites.block;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.block.BlockBase;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteSapling;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteStain;
import com.dhanantry.scapeandrunparasites.entity.monster.inborn.EntityKol;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.network.SRPPacketBiomeChange;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.world.SRPWorldData;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteBigBall;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteColonyB1;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteColonyB2;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteColonyB3;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteColonyBS1;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteColonyBase;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteGenAbstract;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteMouth;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteNodeCore;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteSpine;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteTallFlower;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteTenFlower;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteTree;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteTreeThin;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class BlockColonyStructure
extends BlockBase {
    public static final PropertyInteger ACTIVE = PropertyInteger.create((String)"active", (int)0, (int)3);

    public BlockColonyStructure(Material material, String name, float hardness, boolean creative, boolean tick, float resistance) {
        super(material, name, hardness, creative, tick, resistance);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty)ACTIVE, (Comparable)Integer.valueOf(0)));
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        Object gen;
        WorldGenParasiteGenAbstract tree;
        int i = 2;
        Random rand = new Random();
        if (!worldIn.isRemote && i == -2) {
            this.updateTick(worldIn, pos, state, rand);
        }
        if (!worldIn.isRemote && i == 1) {
            EntityKol out = new EntityKol(worldIn);
            out.setPositionAndRotation(pos.getX(), pos.getY() + 1, pos.getZ(), 0.0f, 0.0f);
            worldIn.spawnEntity((Entity)out);
            out.setOrigin(pos);
        }
        if (!worldIn.isRemote && i == 2) {
            tree = new WorldGenParasiteColonyB3(false, 1);
            tree.generate(worldIn, new Random(), pos.up());
        }
        if (!worldIn.isRemote && i == 3) {
            worldIn.setBlockState(pos, Blocks.WATER.getDefaultState(), 1);
        }
        if (!worldIn.isRemote && i == 4) {
            System.out.println("ssa");
            SRPMain.network.sendToAll((IMessage)new SRPPacketBiomeChange(pos, true));
        }
        if (!worldIn.isRemote && i == 5) {
            ParasiteEventEntity.spawnFromBlock(worldIn, new String[]{"srparasites:worker;1"}, 5, pos.up());
        }
        if (!worldIn.isRemote && i == 6) {
            System.out.println("ssa666666");
            ParasiteEventWorld.spawnGenFeatureParasite(worldIn, pos.up(), RANDOM);
        }
        if (!worldIn.isRemote && i == 7 && !(gen = new WorldGenParasiteTreeThin(false)).generate(worldIn, rand, pos.up(3)) && worldIn.getBlockState(pos.up(3)).getBlock() == Blocks.AIR) {
            worldIn.setBlockState(pos.up(3), SRPBlocks.ParasiteSapling.getDefaultState().withProperty(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.TREE)));
        }
        if (!worldIn.isRemote && i == 8 && !(gen = new WorldGenParasiteTree(false)).generate(worldIn, rand, pos.up(3)) && worldIn.getBlockState(pos.up(3)).getBlock() == Blocks.AIR) {
            worldIn.setBlockState(pos.up(3), SRPBlocks.ParasiteSapling.getDefaultState().withProperty(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.TREE)));
        }
        if (!worldIn.isRemote && i == 9 && !((WorldGenParasiteTenFlower)((Object)(gen = new WorldGenParasiteTenFlower(false)))).generate(worldIn, rand, pos.up(3)) && worldIn.getBlockState(pos.up(3)).getBlock() == Blocks.AIR) {
            worldIn.setBlockState(pos.up(3), SRPBlocks.ParasiteSapling.getDefaultState().withProperty(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.TREE)));
        }
        if (!worldIn.isRemote && i == 10 && !((WorldGenParasiteTallFlower)((Object)(gen = new WorldGenParasiteTallFlower(false)))).generate(worldIn, rand, pos.up(3)) && worldIn.getBlockState(pos.up(3)).getBlock() == Blocks.AIR) {
            worldIn.setBlockState(pos.up(3), SRPBlocks.ParasiteSapling.getDefaultState().withProperty(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.TREE)));
        }
        if (!worldIn.isRemote && i == 11 && !((WorldGenParasiteSpine)((Object)(gen = new WorldGenParasiteSpine(false)))).generate(worldIn, rand, pos.up(3)) && worldIn.getBlockState(pos.up(3)).getBlock() == Blocks.AIR) {
            worldIn.setBlockState(pos.up(3), SRPBlocks.ParasiteSapling.getDefaultState().withProperty(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.TREE)));
        }
        if (!worldIn.isRemote && i == 12 && !((WorldGenParasiteMouth)((Object)(gen = new WorldGenParasiteMouth(false)))).generate(worldIn, rand, pos.up(3)) && worldIn.getBlockState(pos.up(3)).getBlock() == Blocks.AIR) {
            worldIn.setBlockState(pos.up(3), SRPBlocks.ParasiteSapling.getDefaultState().withProperty(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.TREE)));
        }
        if (!worldIn.isRemote && i == 13 && !((WorldGenParasiteNodeCore)((Object)(gen = new WorldGenParasiteNodeCore(false, 1)))).generate(worldIn, rand, pos.up(6)) && worldIn.getBlockState(pos.up(6)).getBlock() == Blocks.AIR) {
            worldIn.setBlockState(pos.up(6), SRPBlocks.ParasiteSapling.getDefaultState().withProperty(BlockParasiteSapling.VARIANT, (Comparable)((Object)BlockParasiteSapling.EnumType.TREE)));
        }
        if (!worldIn.isRemote && i == 14) {
            ParasiteEventWorld.spawnGenRoofInfested(worldIn, pos.down(1), rand);
        }
        if (!worldIn.isRemote && i == 15) {
            tree = new WorldGenParasiteBigBall(false);
            ((WorldGenParasiteBigBall)tree).generate(worldIn, new Random(), pos.up());
        }
        return false;
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        AxisAlignedBB axisalignedbb;
        List moblist;
        if (!worldIn.isAreaLoaded(pos, 3) || worldIn.isRemote) {
            return;
        }
        if (!SRPConfigWorld.coloniesActivated) {
            return;
        }
        SRPWorldData data = SRPWorldData.get(worldIn);
        if (data.nearestColonyPosition(pos, false) == null) {
            return;
        }
        int meta = this.getMetaFromState(state);
        if (meta > 0 && (moblist = worldIn.getEntitiesWithinAABB(EntityKol.class, axisalignedbb = new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)(pos.getY() + 1), (double)(pos.getZ() + 1)).grow(20.0, 5.0, 20.0))).isEmpty()) {
            ParasiteEventEntity.spawnFromBlock(worldIn, new String[]{"srparasites:architect;1"}, 5, pos.up());
        }
        switch (meta) {
            case 1: {
                WorldGenParasiteColonyBase tree;
                if (!rand.nextBoolean()) break;
                if (rand.nextInt(4) == 0) {
                    if (!this.makePillar(worldIn, pos, 23, 4)) break;
                    tree = new WorldGenParasiteColonyB3(false, 2);
                    tree.generate(worldIn, new Random(), pos.up());
                    break;
                }
                if (rand.nextBoolean()) {
                    if (!this.makePillar(worldIn, pos, 23, 4)) break;
                    tree = new WorldGenParasiteColonyB2(false, 2);
                    tree.generate(worldIn, new Random(), pos.up());
                    break;
                }
                if (!this.makePillar(worldIn, pos, 23, 4)) break;
                tree = new WorldGenParasiteColonyB1(false, 2);
                tree.generate(worldIn, new Random(), pos.up());
                break;
            }
            case 2: {
                WorldGenParasiteColonyBase tree;
                if (!rand.nextBoolean()) break;
                if (rand.nextBoolean()) {
                    if (!this.makePillar(worldIn, pos, 13, 3)) break;
                    tree = new WorldGenParasiteColonyBS1(false, 2);
                    tree.generate(worldIn, new Random(), pos.up());
                    break;
                }
                if (!this.makePillar(worldIn, pos, 13, 3)) break;
                tree = new WorldGenParasiteColonyBS1(false, 2);
                tree.generate(worldIn, new Random(), pos.up());
            }
        }
    }

    private boolean makePillar(World worldIn, BlockPos pos, int totalCheck, int blocks) {
        pos = pos.up();
        int times = 0;
        Block look = worldIn.getBlockState(pos).getBlock();
        while (blocks > 0) {
            boolean g = false;
            if (look == SRPBlocks.ParasiteStain) {
                pos = pos.up();
                look = worldIn.getBlockState(pos).getBlock();
                if (!(g = ++times >= totalCheck)) continue;
                return true;
            }
            if (look == Blocks.AIR || !(look instanceof BlockLeaves)) {
                // empty if block
            }
            g = ++times >= totalCheck;
            this.placePillarBlock(worldIn, pos, --blocks <= 0);
            pos = pos.up();
            look = worldIn.getBlockState(pos).getBlock();
            if (!g) continue;
            return true;
        }
        return false;
    }

    private void placePillarBlock(World worldIn, BlockPos pos, boolean flag) {
        AxisAlignedBB axisalignedbb2;
        List moblist2;
        int xx = pos.getX();
        int zz = pos.getZ();
        int yy = pos.getY();
        int range = 10;
        for (int x = xx - range; x <= xx + range; ++x) {
            for (int z = zz - range; z <= zz + range; ++z) {
                BlockPos neww = new BlockPos(x, yy, z);
                float har = worldIn.getBlockState(neww).getBlockHardness(worldIn, neww);
                if (har > 7.0f || worldIn.getBlockState(neww).getBlock() instanceof BlockBase) continue;
                worldIn.setBlockState(neww, Blocks.AIR.getDefaultState());
            }
        }
        worldIn.setBlockState(pos, SRPBlocks.ParasiteStain.getDefaultState().withProperty(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.FLESH)));
        if (flag && (moblist2 = worldIn.getEntitiesWithinAABB(EntityItem.class, axisalignedbb2 = new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)(pos.getY() + 1), (double)(pos.getZ() + 1)).grow(32.0, 16.0, 32.0))).size() > 7) {
            worldIn.setBlockState(pos.north(), SRPBlocks.ParasiteCanisterActive.getDefaultState(), 3);
        }
    }

    public EnumPushReaction getPushReaction(IBlockState state) {
        return EnumPushReaction.BLOCK;
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer((Block)this, new IProperty[]{ACTIVE});
    }

    public int getMetaFromState(IBlockState state) {
        return (Integer)state.getValue((IProperty)ACTIVE);
    }

    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty((IProperty)ACTIVE, (Comparable)Integer.valueOf(meta & 3));
    }
}

