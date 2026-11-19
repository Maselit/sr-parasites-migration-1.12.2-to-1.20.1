/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WorldGenParasiteColonyB2
extends WorldGenParasiteColonyBase {
    public WorldGenParasiteColonyB2(boolean notify, int stage) {
        super(notify, stage);
        this.wall = SRPBlocks.ParasiteRubbleDense.func_176223_P().func_177226_a(BlockParasiteRubbleDense.VARIANT, (Comparable)((Object)BlockParasiteRubbleDense.EnumType.WALL));
        this.tacle = SRPBlocks.ParasiteStain.func_176223_P().func_177226_a(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.FEELER));
        this.floor = SRPBlocks.ParasiteStain.func_176223_P().func_177226_a(BlockParasiteStain.VARIANT, (Comparable)((Object)BlockParasiteStain.EnumType.DIRT));
    }

    public boolean func_180709_b(World worldIn, Random rand, BlockPos position) {
        int times;
        int o;
        BlockPos rootH;
        int i;
        BlockPos layer = position;
        BlockPos helper = position;
        this.placeWallsFour(worldIn, position.func_177979_c(3), 3, rand, 1, this.floorColony);
        this.addFloor(worldIn, position.func_177979_c(1), 10, true);
        this.placeBlock(worldIn, helper.func_177977_b(), this.floor);
        for (i = 0; i <= 3; ++i) {
            rootH = helper = this.getDirectionRoot(position, i, 1);
            this.placeBlock(worldIn, helper, this.wall);
            for (o = 0; o < 2; ++o) {
                for (times = 1; times <= 1; ++times) {
                    helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                    if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                        this.placeBlock(worldIn, helper.func_177977_b(), this.wall);
                    }
                    this.placeBlock(worldIn, helper, this.wall);
                }
            }
            rootH = helper = this.getDirectionRoot(rootH, i, 1);
            this.placeBlock(worldIn, helper, this.wall);
            for (o = 0; o < 2; ++o) {
                for (times = 1; times <= 1; ++times) {
                    helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                    if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                        this.placeBlock(worldIn, helper.func_177977_b(), this.wall);
                    }
                    this.placeBlock(worldIn, helper, this.wall);
                }
            }
            helper = this.getDirectionRoot(rootH, i, 1);
            this.placeBlock(worldIn, helper, this.wall);
            helper = this.getDirectionRoot(helper, i, 1);
            this.placeBlock(worldIn, helper, this.wall);
        }
        layer = helper = position.func_177981_b(1);
        for (i = 0; i <= 3; ++i) {
            rootH = helper = this.getDirectionRoot(layer, i, 1);
            this.placeBlock(worldIn, helper, this.wall);
            for (o = 0; o < 2; ++o) {
                for (times = 1; times <= 1; ++times) {
                    helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                    if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                        this.placeBlock(worldIn, helper.func_177977_b(), this.wall);
                    }
                    this.placeBlock(worldIn, helper, this.wall);
                }
            }
            rootH = helper = this.getDirectionRoot(rootH, i, 1);
            this.placeBlock(worldIn, helper, this.wall);
        }
        layer = helper = layer.func_177981_b(1);
        for (i = 0; i <= 3; ++i) {
            rootH = helper = this.getDirectionRoot(layer, i, 1);
            this.placeBlock(worldIn, helper, this.wall);
            for (o = 0; o < 2; ++o) {
                for (times = 1; times <= 1; ++times) {
                    helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                    if (!worldIn.func_180495_p(helper.func_177977_b()).func_185913_b()) {
                        this.placeBlock(worldIn, helper.func_177977_b(), this.wall);
                    }
                    this.placeBlock(worldIn, helper, this.wall);
                }
            }
        }
        layer = helper = layer.func_177981_b(1);
        int tall = 10;
        int current = 0;
        while (current <= tall) {
            ++current;
            for (int i2 = 0; i2 <= 3; ++i2) {
                this.placeBlock(worldIn, this.getDirectionRoot(helper, i2, 1), this.wall);
            }
            helper = helper.func_177984_a();
        }
        helper = this.placeWallsOne(worldIn, helper, 2, rand, 10, this.wall, position.func_177956_o());
        helper = this.placeWallsTwo(worldIn, helper, 1, rand, 12, this.wall);
        helper = this.placeWallsThree(worldIn, helper, 3, rand, 13, this.wall);
        helper = this.placeWallsFour(worldIn, helper, 5, rand, 16, this.wall);
        helper = this.placeWallsThree(worldIn, helper, 3, rand, 21, this.wall);
        if (rand.nextInt(3) == 0) {
            helper = this.placeWallsFour(worldIn, helper, 5, rand, 24, this.wall);
            helper = this.placeWallsThree(worldIn, helper, 3, rand, 29, this.wall);
        }
        this.placeBlock(worldIn, helper, this.wall);
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
        this.replaceLayer(worldIn, position.func_177981_b(0), 8, this.wall, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BONE)));
        this.replaceLayer(worldIn, position.func_177981_b(1), 8, this.wall, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BONE)));
        this.replaceLayer(worldIn, position.func_177981_b(2), 8, this.wall, SRPBlocks.ParasiteRubble.func_176223_P().func_177226_a(BlockParasiteRubble.VARIANT, (Comparable)((Object)BlockParasiteRubble.EnumType.BONE)));
        this.addFloor(worldIn, position.func_177981_b(tall + 4), 10, false);
        return true;
    }

    private BlockPos placeWallsOne(World worldIn, BlockPos position, int loop, Random rand, int longer, IBlockState state, int oY) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            BlockPos helpRoot = currentP;
            BlockPos helper = currentP;
            for (int i = 0; i <= 3; ++i) {
                int times;
                int o;
                BlockPos rootH = helper = this.getDirectionRoot(helpRoot, i, 1);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 2; ++times) {
                        int llimitO;
                        int llimit;
                        BlockPos atm;
                        if (o == 0) {
                            helper = this.getDirectionRoot(rootH, (i + 1) % 4, times + 1);
                            if (times == 2 && current == 0) {
                                atm = helper.func_177977_b();
                                this.placeBlock(worldIn, atm, state);
                                while (!worldIn.func_180495_p(atm.func_177977_b()).func_185913_b() && atm.func_177977_b().func_177956_o() >= 1) {
                                    atm = this.getDirectionRoot(atm, (i + 4) % 4, 1);
                                    llimit = (atm = this.getDirectionRoot(atm, (i + 3) % 4, 1)).func_177956_o() < oY ? 5 : 2;
                                    llimitO = atm.func_177956_o() < oY ? 4 : 0;
                                    atm = this.placeColumn(worldIn, atm, rand.nextInt(llimit) + (2 + llimitO), rand, 0.0, this.tacle);
                                }
                            }
                        } else {
                            helper = this.getDirectionRoot(rootH, (i + 3) % 4, times + 1);
                            if (times == 2 && current == 0) {
                                atm = helper.func_177977_b();
                                this.placeBlock(worldIn, atm, state);
                                while (!worldIn.func_180495_p(atm.func_177977_b()).func_185913_b() && atm.func_177977_b().func_177956_o() >= 1) {
                                    atm = this.getDirectionRoot(atm, (i + 4) % 4, 1);
                                    llimit = (atm = this.getDirectionRoot(atm, (i + 1) % 4, 1)).func_177956_o() < oY ? 5 : 2;
                                    llimitO = atm.func_177956_o() < oY ? 4 : 0;
                                    atm = this.placeColumn(worldIn, atm, rand.nextInt(llimit) + (2 + llimitO), rand, 0.0, this.tacle);
                                }
                            }
                        }
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
                if (current == 0 && rand.nextBoolean()) {
                    this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                }
                this.placeBlock(worldIn, this.getDirectionRoot(helper, i, 1), state);
                if (current != 0 || !rand.nextBoolean()) continue;
                this.addVines(worldIn, this.getDirectionRoot(helper, i, 1).func_177977_b(), rand, longer);
            }
            ++current;
            currentP = currentP.func_177984_a();
        }
        return currentP;
    }

    private BlockPos placeWallsTwo(World worldIn, BlockPos position, int loop, Random rand, int longer, IBlockState state) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            BlockPos helpRoot = currentP;
            BlockPos helper = currentP;
            for (int i = 0; i <= 3; ++i) {
                int times;
                int o;
                BlockPos rootH = helper = this.getDirectionRoot(helpRoot, i, 2);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 2; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 1) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 1);
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
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 1; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                        this.placeBlock(worldIn, helper, state);
                        if (current != 0 || !rand.nextBoolean()) continue;
                        this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                    }
                }
                helper = this.getDirectionRoot(rootH, i, 1);
                this.placeBlock(worldIn, helper, state);
                if (current == 0 && rand.nextBoolean()) {
                    this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                }
                this.placeBlock(worldIn, this.getDirectionRoot(helper, (i + 2) % 4, 1), state);
                if (current != 0 || !rand.nextBoolean()) continue;
                this.addVines(worldIn, this.getDirectionRoot(helper, (i + 2) % 4, 1).func_177977_b(), rand, longer);
            }
            ++current;
            currentP = currentP.func_177984_a();
        }
        return currentP;
    }

    private BlockPos placeWallsThree(World worldIn, BlockPos position, int loop, Random rand, int longer, IBlockState state) {
        BlockPos currentP = position;
        int current = 0;
        while (current < loop) {
            BlockPos helpRoot = currentP;
            BlockPos helper = currentP;
            for (int i = 0; i <= 3; ++i) {
                int times;
                int o;
                BlockPos rootH = helper = this.getDirectionRoot(helpRoot, i, 2);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 2; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times + 1) : this.getDirectionRoot(rootH, (i + 3) % 4, times + 1);
                        this.placeBlock(worldIn, helper, state);
                        if (current != 0 || !rand.nextBoolean()) continue;
                        this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 3; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                        this.placeBlock(worldIn, helper, state);
                        if (current != 0 || !rand.nextBoolean()) continue;
                        this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 1; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                        this.placeBlock(worldIn, helper, state);
                        if (current != 0 || !rand.nextBoolean()) continue;
                        this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                    }
                }
                helper = this.getDirectionRoot(rootH, i, 1);
                this.placeBlock(worldIn, helper, state);
                if (current == 0 && rand.nextBoolean()) {
                    this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                }
                this.placeBlock(worldIn, this.getDirectionRoot(helper, (i + 2) % 4, 1), state);
                if (current != 0 || !rand.nextBoolean()) continue;
                this.addVines(worldIn, this.getDirectionRoot(helper, (i + 2) % 4, 1).func_177977_b(), rand, longer);
            }
            ++current;
            currentP = currentP.func_177984_a();
        }
        return currentP;
    }

    private BlockPos placeWallsFour(World worldIn, BlockPos position, int loop, Random rand, int longer, IBlockState state) {
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
                    for (times = 1; times <= 3; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                        this.placeBlock(worldIn, helper, state);
                        if (current != 0 || !rand.nextBoolean()) continue;
                        this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                    }
                }
                rootH = helper = this.getDirectionRoot(rootH, i, 1);
                for (o = 0; o < 2; ++o) {
                    for (times = 1; times <= 1; ++times) {
                        helper = o == 0 ? this.getDirectionRoot(rootH, (i + 1) % 4, times) : this.getDirectionRoot(rootH, (i + 3) % 4, times);
                        this.placeBlock(worldIn, helper, state);
                        if (current != 0 || !rand.nextBoolean()) continue;
                        this.addVines(worldIn, helper.func_177977_b(), rand, longer);
                    }
                }
                helper = this.getDirectionRoot(rootH, i, 1);
                this.placeBlock(worldIn, rootH, state);
                if (current != 0 || !rand.nextBoolean()) continue;
                this.addVines(worldIn, rootH.func_177977_b(), rand, longer);
            }
            ++current;
            currentP = currentP.func_177984_a();
        }
        return currentP;
    }
}

