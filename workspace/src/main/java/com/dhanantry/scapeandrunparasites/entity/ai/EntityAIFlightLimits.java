package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;

/**
 * Migracion de EntityAIFlightLimits a 1.20.1 (Goal).
 */
public class EntityAIFlightLimits extends Goal {
    private final EntityParasiteBase parent;
    private final int limit;
    private final boolean fLimit;

    public EntityAIFlightLimits(EntityParasiteBase in, int limit, boolean flighLimit) {
        this.parent = in;
        this.limit = limit;
        this.fLimit = flighLimit;
    }

    @Override
    public boolean canUse() {
        return true;
    }

    @Override
    public void tick() {
        if (this.fLimit) {
            net.minecraft.world.entity.LivingEntity target = this.parent.getTarget();
            if (target != null) {
                if (target.getY() + (double) this.limit > this.parent.getY()) {
                    this.parent.setDeltaMovement(this.parent.getDeltaMovement().x, this.parent.getDeltaMovement().y - 0.04, this.parent.getDeltaMovement().z);
                }
            } else {
                boolean ground = this.howMuchNeg(this.parent.blockPosition().below(), 1);
                if (ground) {
                    this.parent.setDeltaMovement(this.parent.getDeltaMovement().x, this.parent.getDeltaMovement().y - 0.04, this.parent.getDeltaMovement().z);
                }
            }
        } else {
            boolean ground = this.howMuchPos(this.parent.blockPosition().below(), 1);
            if (ground) {
                this.parent.setDeltaMovement(this.parent.getDeltaMovement().x, this.parent.getDeltaMovement().y + 0.04, this.parent.getDeltaMovement().z);
            }
        }
    }

    private boolean howMuchNeg(BlockPos y, int count) {
        if (y.getY() < 1) {
            return false;
        }
        if (count <= this.limit) {
            if (this.parent.level().getBlockState(y).getBlock() == Blocks.AIR) {
                return this.howMuchNeg(y.below(), ++count);
            }
            return false;
        }
        return true;
    }

    private boolean howMuchPos(BlockPos y, int count) {
        if (y.getY() < 1) {
            return false;
        }
        if (count <= this.limit) {
            if (this.parent.level().getBlockState(y).getBlock() == Blocks.AIR) {
                return this.howMuchPos(y.below(), ++count);
            }
            return true;
        }
        return count <= this.limit;
    }
}