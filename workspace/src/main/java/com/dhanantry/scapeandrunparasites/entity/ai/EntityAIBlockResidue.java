package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;

/**
 * Migracion de EntityAIBlockResidue a 1.20.1 (Goal).
 */
public class EntityAIBlockResidue extends Goal {
    private final EntityParasiteBase parent;
    private int ticks = 0;
    private final int range;
    private int blockBreakCounter = 200;

    public EntityAIBlockResidue(EntityParasiteBase ghast, int range) {
        this.parent = ghast;
        this.range = range;
        this.blockBreakCounter = 200;
    }

    @Override
    public boolean canUse() {
        return this.parent.getTarget() == null && !this.parent.isInWater();
    }

    @Override
    public void stop() {
        this.parent.setParasiteStatus(0);
        this.blockBreakCounter = 200;
    }

    @Override
    public void tick() {
        if (this.blockBreakCounter > 0) {
            if (this.parent.getRandom().nextInt(6) == 0) {
                --this.blockBreakCounter;
            }
        } else {
            --this.blockBreakCounter;
            if (this.blockBreakCounter == -1) {
                this.parent.setParasiteStatus(25);
                this.parent.getNavigation().stop();
                this.parent.playSound(SRPSounds.ADAPTED_V.get(), 2.0f, 1.0f);
            }
            if (this.blockBreakCounter == -40) {
                this.parent.playSound(SRPSounds.ADAPTED_V.get(), 2.0f, 1.0f);
            }
            // particleStatus stub
            if (this.blockBreakCounter == -60) {
                double i1 = Math.floor(this.parent.getY() + 0.1);
                double l1 = this.parent.getX();
                double i2 = this.parent.getZ();
                net.minecraft.world.level.Level world = this.parent.level();
                for (int k2 = -1 * this.range; k2 <= 1 * this.range; ++k2) {
                    for (int l2 = -1 * this.range; l2 <= 1 * this.range; ++l2) {
                        double i3 = l1 + (double) k2;
                        double l = i2 + (double) l2;
                        BlockPos blockpos = new BlockPos((int) i3, (int) i1, (int) l);
                        net.minecraft.world.level.block.Block block = world.getBlockState(blockpos).getBlock();
                        net.minecraft.world.level.block.Block blockDown = world.getBlockState(blockpos.below()).getBlock();
                        if (block != Blocks.AIR || blockDown == Blocks.AIR || !world.getBlockState(blockpos.below()).isCollisionShapeFullBlock(world, blockpos.below()) || blockDown == SRPBlocks.InfestedStain.get() || world.getRandom().nextInt(2) != 0) continue;
                        world.setBlock(blockpos, SRPBlocks.InfestRemain.get().defaultBlockState(), 3);
                    }
                }
            }
            if (this.blockBreakCounter == -100) {
                this.parent.setParasiteStatus(0);
                this.blockBreakCounter = 200;
            }
        }
    }
}