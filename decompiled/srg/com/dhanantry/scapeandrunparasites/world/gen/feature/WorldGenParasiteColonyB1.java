/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.world.gen.feature;

import com.dhanantry.scapeandrunparasites.block.BlockParasiteRubble;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteRubbleDense;
import com.dhanantry.scapeandrunparasites.block.BlockParasiteStain;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.world.gen.feature.WorldGenParasiteColonyBase;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WorldGenParasiteColonyB1
extends WorldGenParasiteColonyBase {
    public WorldGenParasiteColonyB1(boolean notify, int stage) {
        super(notify, stage);
        this.wall = SRPBlocks.ParasiteRubbleDense.func_176223_P().func_177226_a(BlockParasiteRubbleDense.VARIANT, (Comparable)((Object)BlockParasiteRubbleDense.EnumType.WALL));
        this.tacle = SRPBlocks.ParasiteStain.func_176223_P().func_177226_a(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.FEELER));
        this.floor = SRPBlocks.ParasiteStain.func_176223_P().func_177226_a(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.DIRT));
    }

    public boolean func_180709_b(World worldIn, Random rand, BlockPos position) {
        BlockPos helper = position;
        this.placeWallsTopOut(worldIn, position.func_177979_c(3), 3, rand, 1, this.floorColony);
        this.addFloor(worldIn, position.func_177979_c(1), 10, true);
        int hei = 12;
        helper = this.placeWallsBottom(worldIn, helper, hei, rand, this.wall, position.func_177956_o());
        this.addEntrance(worldIn, position, rand, this.wall);
        int l1 = 3;
        helper = this.placeWallsTopIn(worldIn, helper, l1, true, rand, 12, this.wall);
        int l2 = 4;
        helper = this.placeWallsTopOut(worldIn, helper, l2, rand, 15, this.wall);
        int l3 = 3;
        helper = this.placeWallsTopIn(worldIn, helper, l3, false, rand, 19, this.wall);
        if (rand.nextInt(3) == 0) {
            int l4 = 4;
            helper = this.placeWallsTopOut(worldIn, helper, l4, rand, 22, this.wall);
            this.replaceLayer(worldIn, position.func_177981_b(hei + l1 + l2 + l3), 10, this.wall, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BONE)));
            this.addFloor(worldIn, position.func_177981_b(hei + l1 + l2 + l3), 10, false);
            helper = this.placeWallsTopIn(worldIn, helper, 3, false, rand, 26, this.wall);
            this.replaceLayer(worldIn, position.func_177981_b(hei + l1 + l2 + l3 + l4 - 1), 10, this.wall, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BONE)));
        }
        this.placeBlock(worldIn, helper, this.floor);
        switch (this.type) {
            case 1: {
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
        }
        this.replaceLayer(worldIn, position.func_177981_b(0), 10, this.wall, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BONE)));
        this.replaceLayer(worldIn, position.func_177981_b(hei - 1), 10, this.wall, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BONE)));
        this.replaceLayer(worldIn, position.func_177981_b(hei), 10, this.wall, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BONE)));
        this.addFloor(worldIn, position.func_177981_b(hei), 10, false);
        this.replaceLayer(worldIn, position.func_177981_b(hei + l1), 10, this.wall, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BONE)));
        this.replaceLayer(worldIn, position.func_177981_b(hei + l1 + l2 - 1), 10, this.wall, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BONE)));
        return true;
    }

    private BlockPos placeWallsBottom(World worldIn, BlockPos position, int loop, Random rand, IBlockState state, int oY) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            BlockPos helpRoot = currentP;
            BlockPos helper = currentP;
            for (int i = 0; i <= 3; ++i) {
                int times;
                int o;
                BlockPos rootH = helper = this.getDirectionRoot(helpRoot, i, 4);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 2; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 2) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 2);
                        if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                            this.placeBlock(worldIn, helper.func_177977_b(), state);
                        }
                        this.placeBlock(worldIn, helper, state);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 2; ++times) {
                        int llimitO;
                        int llimit;
                        BlockPos trunk;
                        int llimitO2;
                        BlockPos atm;
                        if (o == 0) {
                            helper = this.getDirectionRoot(rootH, (i + 1) % 4, times);
                            if (current == 5 && times != 1 && rand.nextInt(2) == 0) {
                                atm = helper;
                                atm = this.directionToGrow(atm, i, false);
                                this.placeBlock(worldIn, atm, this.tacle);
                                while (!worldIn.func_180495_p(atm.func_177977_b()).func_185913_b() && atm.func_177977_b().func_177956_o() >= 1) {
                                    atm = rand.nextInt(1) == 0 ? this.directionToGrow(atm, i * 10, true) : this.directionToGrow(atm, i, false);
                                    int llimit2 = atm.func_177956_o() < oY ? 5 : 2;
                                    llimitO2 = atm.func_177956_o() < oY ? 4 : 0;
                                    atm = this.placeColumn(worldIn, atm, rand.nextInt(llimit2) + (2 + llimitO2), rand, 0.0, this.tacle);
                                }
                                this.placeBlock(worldIn, atm.func_177977_b(), this.tacle);
                            }
                            if (current == loop - 2 && times != 1) {
                                trunk = helper;
                                if (worldIn.func_180495_p((trunk = this.directionToGrow(trunk, i, false)).func_177979_c(5)).func_177230_c() == Blocks.field_150350_a) {
                                    BlockPos atm2 = helper;
                                    atm2 = this.directionToGrow(atm2, i, false);
                                    this.placeBlock(worldIn, atm2, this.tacle);
                                    while (!worldIn.func_180495_p(atm2.func_177977_b()).func_185913_b() && atm2.func_177977_b().func_177956_o() >= 1) {
                                        atm2 = rand.nextInt(1) == 0 ? this.directionToGrow(atm2, i * 10, true) : this.directionToGrow(atm2, i, false);
                                        llimit = atm2.func_177956_o() < oY ? 5 : 2;
                                        llimitO = atm2.func_177956_o() < oY ? 4 : 0;
                                        atm2 = this.placeColumn(worldIn, atm2, rand.nextInt(llimit) + (2 + llimitO), rand, 0.0, this.tacle);
                                    }
                                    this.placeBlock(worldIn, atm2.func_177977_b(), this.tacle);
                                }
                            }
                        } else {
                            helper = this.getDirectionRoot(rootH, (i + 3) % 4, times);
                            if (current == 5 && times != 1 && rand.nextInt(2) == 0) {
                                atm = helper;
                                atm = this.directionToGrow(atm, i, false);
                                this.placeBlock(worldIn, atm, this.tacle);
                                while (!worldIn.func_180495_p(atm.func_177977_b()).func_185913_b() && atm.func_177977_b().func_177956_o() >= 1) {
                                    atm = rand.nextInt(1) == 0 ? this.directionToGrow(atm, i * 10 + 1, true) : this.directionToGrow(atm, i, false);
                                    int llimit3 = atm.func_177956_o() < oY ? 5 : 2;
                                    llimitO2 = atm.func_177956_o() < oY ? 4 : 0;
                                    atm = this.placeColumn(worldIn, atm, rand.nextInt(llimit3) + (2 + llimitO2), rand, 0.0, this.tacle);
                                }
                                this.placeBlock(worldIn, atm.func_177977_b(), this.tacle);
                            }
                            if (current == loop - 2 && times != 1) {
                                trunk = helper;
                                if (worldIn.func_180495_p((trunk = this.directionToGrow(trunk, i, false)).func_177979_c(5)).func_177230_c() == Blocks.field_150350_a) {
                                    BlockPos atm3 = helper;
                                    atm3 = this.directionToGrow(atm3, i, false);
                                    this.placeBlock(worldIn, atm3, this.tacle);
                                    while (!worldIn.func_180495_p(atm3.func_177977_b()).func_185913_b() && atm3.func_177977_b().func_177956_o() >= 1) {
                                        atm3 = rand.nextInt(1) == 0 ? this.directionToGrow(atm3, i * 10 + 1, true) : this.directionToGrow(atm3, i, false);
                                        llimit = atm3.func_177956_o() < oY ? 5 : 2;
                                        llimitO = atm3.func_177956_o() < oY ? 4 : 0;
                                        atm3 = this.placeColumn(worldIn, atm3, rand.nextInt(llimit) + (2 + llimitO), rand, 0.0, this.tacle);
                                    }
                                    this.placeBlock(worldIn, atm3.func_177977_b(), this.tacle);
                                }
                            }
                        }
                        if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                            this.placeBlock(worldIn, helper.func_177977_b(), state);
                        }
                        this.placeBlock(worldIn, helper, state);
                    }
                }
                helper = this.getDirectionRoot(rootH, i, 1);
                if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                    this.placeBlock(worldIn, helper.func_177977_b(), state);
                }
                this.placeBlock(worldIn, helper, state);
            }
            ++current;
            currentP = currentP.func_177984_a();
        }
        return currentP;
    }

    private BlockPos placeWallsTopIn(World worldIn, BlockPos position, int loop, boolean vine, Random rand, int longer, IBlockState state) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            BlockPos helpRoot = currentP;
            BlockPos helper = currentP;
            for (int i = 0; i <= 3; ++i) {
                int times;
                int o;
                BlockPos rootH = helper = this.getDirectionRoot(helpRoot, i, 5);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 1; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 4) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 4);
                        this.placeBlock(worldIn, helper, state);
                        if (!vine || current != 0 || !rand.nextBoolean()) continue;
                        this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 2; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 2) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 2);
                        this.placeBlock(worldIn, helper, state);
                        if (!vine || current != 0 || !rand.nextBoolean()) continue;
                        this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 2; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                        this.placeBlock(worldIn, helper, state);
                        if (!vine || current != 0 || !rand.nextBoolean()) continue;
                        this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                    }
                }
                helper = this.getDirectionRoot(rootH, i, 1);
                this.placeBlock(worldIn, helper, state);
                if (!vine || current != 0 || !rand.nextBoolean()) continue;
                this.addVines(worldIn, helper.func_177977_b(), rand, longer);
            }
            ++current;
            currentP = currentP.func_177984_a();
        }
        return currentP;
    }

    private BlockPos placeWallsTopOut(World worldIn, BlockPos position, int loop, Random rand, int longer, IBlockState state) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            BlockPos helpRoot = currentP;
            BlockPos helper = currentP;
            for (int i = 0; i <= 3; ++i) {
                int times;
                int o;
                BlockPos rootH = helper = this.getDirectionRoot(helpRoot, i, 6);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 1; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 4) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 4);
                        this.placeBlock(worldIn, helper, state);
                        if (current != 0 || !rand.nextBoolean()) continue;
                        this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 2; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 2) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 2);
                        this.placeBlock(worldIn, helper, state);
                        if (current != 0 || !rand.nextBoolean()) continue;
                        this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 2; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                        this.placeBlock(worldIn, helper, state);
                        if (current != 0 || !rand.nextBoolean()) continue;
                        this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                    }
                }
                helper = this.getDirectionRoot(rootH, i, 1);
                this.placeBlock(worldIn, helper, state);
                if (current != 0 || !rand.nextBoolean()) continue;
                this.addVines(worldIn, helper.func_177977_b(), rand, longer);
            }
            ++current;
            currentP = currentP.func_177984_a();
        }
        return currentP;
    }

    private void addEntrance(World worldIn, BlockPos position, Random rand, IBlockState state) {
        BlockPos helper2 = position;
        int chance = 1;
        for (int i = 0; i <= 3; ++i) {
            if (rand.nextInt(chance) != 0) continue;
            BlockPos root = helper2 = this.getDirectionRoot(position, i, 5);
            for (int door = 0; door < 5; ++door) {
                worldIn.func_175656_a(this.getDirectionRoot(helper2.func_177981_b(door), i, 1), Blocks.field_150350_a.func_176223_P());
                if (door == 4) {
                    this.addVines(worldIn, this.getDirectionRoot(helper2.func_177981_b(door), i, 1), rand, rand.nextInt(4) + 2);
                }
                if (door != 4) continue;
                BlockPos atmd = this.getDirectionRoot(helper2.func_177981_b(door), i, 1);
                for (int o = 0; o < 2; ++o) {
                    helper2 = o == 0 ? this.getDirectionRoot(atmd, (i + 1) % 4, 1) : this.getDirectionRoot(atmd, (i + 3) % 4, 1);
                    this.placeBlock(worldIn, helper2, state);
                    this.addVines(worldIn, helper2.func_177977_b(), rand, rand.nextInt(4) + 2);
                }
            }
            for (int o = 0; o < 2; ++o) {
                for (int times = 1; times <= 2; ++times) {
                    int door;
                    helper2 = o == 0 ? this.getDirectionRoot(root, (i + 1) % 4, times) : this.getDirectionRoot(root, (i + 3) % 4, times);
                    if (times == 2) {
                        helper2 = this.getDirectionRoot(helper2, i, 1);
                        this.placeColumn(worldIn, helper2.func_177981_b(3), 3, rand, 0.0, this.wall);
                        helper2 = this.getDirectionRoot(helper2, i, 1);
                        this.placeBlock(worldIn, helper2, state);
                        for (door = 0; door < 1; ++door) {
                            helper2 = o == 0 ? this.getDirectionRoot(root, (i + 1) % 4, 3) : this.getDirectionRoot(root, (i + 3) % 4, 3);
                            this.placeBlock(worldIn, helper2, state);
                            helper2 = this.getDirectionRoot(helper2, i, 1);
                            this.placeBlock(worldIn, helper2, state);
                        }
                        continue;
                    }
                    for (door = 0; door < 4; ++door) {
                        worldIn.func_175656_a(helper2.func_177981_b(door), Blocks.field_150350_a.func_176223_P());
                    }
                }
            }
            chance += 2 + i;
        }
    }
}

