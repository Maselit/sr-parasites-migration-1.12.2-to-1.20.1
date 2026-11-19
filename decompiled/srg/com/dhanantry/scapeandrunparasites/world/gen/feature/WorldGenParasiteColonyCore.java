/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockColonyCore;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteRubbleDense;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteStain;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteGenAbstract;
import java.util.Random;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WorldGenParasiteColonyCore
extends WorldGenParasiteGenAbstract {
    public WorldGenParasiteColonyCore(boolean notify) {
        super(notify);
    }

    public boolean func_180709_b(World worldIn, Random rand, BlockPos position) {
        int core = 1;
        switch (core) {
            case 1: {
                this.placeDirt(worldIn, position.func_177977_b());
                this.placeCore(worldIn, position, core);
                BlockPos helper = position;
                for (int i = 0; i <= 3; ++i) {
                    int o;
                    helper = this.directionToGrow(position, i, false);
                    if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                        this.placeTrunk(worldIn, helper.func_177977_b());
                    }
                    this.placeTrunk(worldIn, helper);
                    BlockPos rootH = helper;
                    for (o = 0; o < 2; ++o) {
                        helper = o == 0 ? this.directionToGrow(rootH, (i + 1) % 4, false) : this.directionToGrow(rootH, (i + 3) % 4, false);
                        if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                            this.placeTrunk(worldIn, helper.func_177977_b());
                        }
                        this.placeTrunk(worldIn, helper);
                    }
                    helper = this.directionToGrow(rootH, i, false);
                    if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                        this.placeTrunk(worldIn, helper.func_177977_b());
                    }
                    this.placeTrunk(worldIn, helper);
                    rootH = helper;
                    for (o = 0; o < 2; ++o) {
                        helper = o == 0 ? this.directionToGrow(rootH, (i + 1) % 4, false) : this.directionToGrow(rootH, (i + 3) % 4, false);
                        if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                            this.placeTrunk(worldIn, helper.func_177977_b());
                        }
                        this.placeTrunk(worldIn, helper);
                    }
                    helper = this.directionToGrow(rootH, i, false);
                    if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                        this.placeTrunk(worldIn, helper.func_177977_b());
                    }
                    this.placeTrunk(worldIn, helper);
                }
                position = position.func_177984_a();
                this.placeTrunk(worldIn, position);
                this.placePeri(worldIn, position);
                position = position.func_177984_a();
                this.placeTrunk(worldIn, position);
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
        }
        return true;
    }

    private void placeTen(World worldIn, BlockPos pos) {
        this.func_175903_a(worldIn, pos, SRPBlocks.ParasiteStain.func_176223_P().func_177226_a(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.FEELER)));
    }

    private void placeTrunk(World worldIn, BlockPos pos) {
        this.func_175903_a(worldIn, pos, SRPBlocks.ParasiteRubbleDense.func_176223_P().func_177226_a(BlockParasiteRubbleDense.VARIANT, (Comparable)((Object)BlockParasiteRubbleDense.EnumType.COLONY)));
    }

    private void placeCore(World worldIn, BlockPos pos, int stage) {
        this.func_175903_a(worldIn, pos, SRPBlocks.ColonyHeart.func_176223_P().func_177226_a((IProperty)BlockColonyCore.ACTIVE, (Comparable)Integer.valueOf(stage)));
    }

    private void placeDirt(World worldIn, BlockPos pos) {
        this.func_175903_a(worldIn, pos, SRPBlocks.ParasiteStain.func_176223_P());
    }

    private void placeLiquid(World worldIn, BlockPos pos) {
        this.func_175903_a(worldIn, pos, SRPBlocks.DeadBlood.func_176223_P());
    }

    private BlockPos getDirectionRoot(BlockPos center, int direction, int times) {
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

    private BlockPos placeColumn(World worldIn, BlockPos pos, int in, Random rand, double extraChance) {
        int current;
        int atm = current = pos.func_177956_o();
        int times = 0;
        BlockPos newPos = pos;
        while (current < atm + in) {
            this.placeTen(worldIn, newPos);
            newPos = newPos.func_177977_b();
            ++current;
            ++times;
        }
        this.placeTen(worldIn, newPos);
        return newPos;
    }

    private void placePeri(World worldIn, BlockPos position) {
        BlockPos helper = position;
        for (int i = 0; i <= 3; ++i) {
            helper = this.directionToGrow(position, i, false);
            if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                this.placeTrunk(worldIn, helper.func_177977_b());
            }
            this.placeTrunk(worldIn, helper);
            BlockPos rootH = helper;
            for (int o = 0; o < 2; ++o) {
                helper = o == 0 ? this.directionToGrow(rootH, (i + 1) % 4, false) : this.directionToGrow(rootH, (i + 3) % 4, false);
                if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                    this.placeTrunk(worldIn, helper.func_177977_b());
                }
                this.placeTrunk(worldIn, helper);
            }
        }
    }

    private BlockPos directionToGrow(BlockPos atm, int choice, boolean sideCurse) {
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

    private void positionSides(int choice) {
    }
}

