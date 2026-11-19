/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockBush
 *  net.minecraft.block.BlockLeaves
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockBase;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteBush;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteRubbleDense;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteStain;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteGenAbstract;
import java.util.Random;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class WorldGenParasiteColonyBase
extends WorldGenParasiteGenAbstract {
    protected int type;
    protected IBlockState floor = SRPBlocks.ParasiteStain.func_176223_P().func_177226_a(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.DIRT));
    protected IBlockState tacle = SRPBlocks.ParasiteStain.func_176223_P().func_177226_a(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.FEELER));
    protected IBlockState wall = SRPBlocks.ParasiteRubbleDense.func_176223_P().func_177226_a(BlockParasiteRubbleDense.VARIANT, (Comparable)((Object)BlockParasiteRubbleDense.EnumType.WALL));
    protected IBlockState floorColony = SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.FLESH));

    public WorldGenParasiteColonyBase(boolean notify, int stage) {
        super(notify);
        this.type = stage;
    }

    protected void placeBlock(World worldIn, BlockPos pos, IBlockState state) {
        this.func_175903_a(worldIn, pos, state);
    }

    protected void placeVine(World worldIn, BlockPos pos) {
        this.func_175903_a(worldIn, pos, SRPBlocks.ParasiteBush.func_176223_P().func_177226_a(BlockParasiteBush.VARIANT, (Comparable)((Object)BlockParasiteBush.EnumType.BINE)));
    }

    protected void placeReplacement(World worldIn, BlockPos pos, IBlockState in) {
        this.func_175903_a(worldIn, pos, in);
    }

    protected BlockPos getDirectionRoot(BlockPos center, int direction, int times) {
        switch (direction) {
            case 0: {
                return center.func_177964_d(times);
            }
            case 1: {
                return center.func_177965_g(times);
            }
            case 2: {
                return center.func_177970_e(times);
            }
        }
        return center.func_177985_f(times);
    }

    protected BlockPos placeColumn(World worldIn, BlockPos pos, int in, Random rand, double extraChance, IBlockState state) {
        int current;
        int atm = current = pos.func_177956_o();
        int times = 0;
        BlockPos newPos = pos;
        while (current < atm + in) {
            this.placeBlock(worldIn, newPos, state);
            newPos = newPos.func_177977_b();
            ++current;
            ++times;
        }
        this.placeBlock(worldIn, newPos, state);
        return newPos;
    }

    protected BlockPos directionToGrow(BlockPos atm, int choice, boolean sideCurse) {
        if (sideCurse) {
            switch (choice) {
                case 0: {
                    atm = atm.func_177978_c();
                    atm = atm.func_177974_f();
                    break;
                }
                case 1: {
                    atm = atm.func_177978_c();
                    atm = atm.func_177976_e();
                    break;
                }
                case 10: {
                    atm = atm.func_177974_f();
                    atm = atm.func_177968_d();
                    break;
                }
                case 11: {
                    atm = atm.func_177974_f();
                    atm = atm.func_177978_c();
                    break;
                }
                case 20: {
                    atm = atm.func_177968_d();
                    atm = atm.func_177976_e();
                    break;
                }
                case 21: {
                    atm = atm.func_177968_d();
                    atm = atm.func_177974_f();
                    break;
                }
                case 30: {
                    atm = atm.func_177976_e();
                    atm = atm.func_177978_c();
                    break;
                }
                default: {
                    atm = atm.func_177976_e();
                    atm = atm.func_177968_d();
                }
            }
            return atm;
        }
        switch (choice) {
            case 0: {
                atm = atm.func_177978_c();
                break;
            }
            case 1: {
                atm = atm.func_177974_f();
                break;
            }
            case 3: {
                atm = atm.func_177976_e();
                break;
            }
            default: {
                atm = atm.func_177968_d();
            }
        }
        return atm;
    }

    protected void addVines(World worldIn, BlockPos position, Random rand, int longer) {
        if (worldIn.func_180495_p(position).func_177230_c() != Blocks.field_150350_a) {
            return;
        }
        this.placeVine(worldIn, position);
        int chance = longer;
        while (worldIn.func_180495_p(position.func_177977_b()).func_177230_c() == Blocks.field_150350_a && worldIn.func_180495_p(position.func_177979_c(2)).func_177230_c() == Blocks.field_150350_a) {
            if (rand.nextInt(chance) == 0) {
                return;
            }
            position = position.func_177977_b();
            this.placeVine(worldIn, position);
            --chance;
        }
    }

    protected void replaceLayer(World worldIn, BlockPos position, int range, IBlockState toReplace, IBlockState in) {
        int xx = position.func_177958_n();
        int zz = position.func_177952_p();
        int yy = position.func_177956_o();
        for (int x = xx - range; x <= xx + range; ++x) {
            for (int z = zz - range; z <= zz + range; ++z) {
                BlockPos neww = new BlockPos(x, yy, z);
                if (worldIn.func_180495_p(neww) != toReplace) continue;
                this.placeReplacement(worldIn, neww, in);
            }
        }
    }

    protected void addFloor(World worldIn, BlockPos position, int range, boolean fill) {
        BlockPos atm;
        if (fill) {
            this.placeReplacement(worldIn, position, this.floorColony);
        }
        int offsetN = 2;
        BlockPos atm2 = position.func_177978_c();
        while (!(worldIn.func_180495_p(atm2).func_177230_c() instanceof BlockBase)) {
            this.placeReplacement(worldIn, atm2, this.floorColony);
            this.genFloorFloor(worldIn, atm2.func_177977_b(), 15, fill);
            this.placeReplacement(worldIn, atm2.func_177970_e(offsetN), this.floorColony);
            this.genFloorFloor(worldIn, atm2.func_177970_e(offsetN).func_177977_b(), 15, fill);
            atm2 = atm2.func_177978_c();
            offsetN += 2;
        }
        BlockPos here = position.func_177965_g(1);
        while (!(worldIn.func_180495_p(here).func_177230_c() instanceof BlockBase)) {
            int offsetN2 = 2;
            atm = here.func_177978_c();
            while (!(worldIn.func_180495_p(atm).func_177230_c() instanceof BlockBase)) {
                this.placeReplacement(worldIn, atm, this.floorColony);
                this.genFloorFloor(worldIn, atm.func_177977_b(), 15, fill);
                this.placeReplacement(worldIn, atm.func_177970_e(offsetN2), this.floorColony);
                this.genFloorFloor(worldIn, atm.func_177970_e(offsetN2).func_177977_b(), 15, fill);
                atm = atm.func_177978_c();
                offsetN2 += 2;
            }
            this.placeReplacement(worldIn, here, this.floorColony);
            this.genFloorFloor(worldIn, here.func_177977_b(), 15, fill);
            here = here.func_177974_f();
        }
        here = position.func_177985_f(1);
        while (!(worldIn.func_180495_p(here).func_177230_c() instanceof BlockBase)) {
            int offsetN3 = 2;
            atm = here.func_177978_c();
            while (!(worldIn.func_180495_p(atm).func_177230_c() instanceof BlockBase)) {
                this.placeReplacement(worldIn, atm, this.floorColony);
                this.genFloorFloor(worldIn, atm.func_177977_b(), 15, fill);
                this.placeReplacement(worldIn, atm.func_177970_e(offsetN3), this.floorColony);
                this.genFloorFloor(worldIn, atm.func_177970_e(offsetN3).func_177977_b(), 15, fill);
                atm = atm.func_177978_c();
                offsetN3 += 2;
            }
            this.placeReplacement(worldIn, here, this.floorColony);
            this.genFloorFloor(worldIn, here.func_177977_b(), 15, fill);
            here = here.func_177976_e();
        }
        if (!fill) {
            this.addFloorSpace(worldIn, position);
        }
    }

    private void genFloorFloor(World worldIn, BlockPos position, int range, boolean fill) {
        if (fill) {
            BlockPos filler = position;
            while ((worldIn.func_180495_p(filler).func_177230_c() == Blocks.field_150350_a || worldIn.func_180495_p(filler).func_177230_c() == SRPBlocks.ParasiteBush || worldIn.func_180495_p(filler).func_177230_c() instanceof BlockLeaves || worldIn.func_180495_p(filler).func_177230_c() instanceof BlockBush) && range > 0) {
                this.placeReplacement(worldIn, filler, this.floor);
                filler = filler.func_177977_b();
                --range;
            }
        }
    }

    private void addFloorSpace(World worldIn, BlockPos position) {
        int xx = position.func_177958_n();
        int zz = position.func_177952_p();
        int yy = position.func_177956_o();
        int range = 1;
        for (int x = xx - range; x <= xx + range; ++x) {
            for (int z = zz - range; z <= zz + range; ++z) {
                BlockPos neww = new BlockPos(x, yy, z);
                if (worldIn.func_180495_p(neww) != this.floorColony) continue;
                this.placeReplacement(worldIn, neww, Blocks.field_150350_a.func_176223_P());
            }
        }
    }

    protected void addMobSpawner(World worldIn, BlockPos position, int type, double chance) {
    }
}

