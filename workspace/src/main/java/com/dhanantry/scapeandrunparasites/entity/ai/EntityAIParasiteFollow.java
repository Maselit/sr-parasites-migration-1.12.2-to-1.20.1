package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIParasiteFollow a 1.20.1 (Goal).
 */
public class EntityAIParasiteFollow extends Goal {
    private final EntityParasiteBase tameable;
    private EntityParasiteBase owner;
    private final double followSpeed;
    private final net.minecraft.world.entity.ai.navigation.PathNavigation petPathfinder;
    private int timeToRecalcPath;
    private final double minBlockDistance;
    private final double maxBlockDistance;
    private float oldWaterCost;
    private final boolean canSendOrder;

    public EntityAIParasiteFollow(EntityParasiteBase tameableIn, double followSpeedIn, double mindistance, double maxdistance, boolean send) {
        this.tameable = tameableIn;
        this.followSpeed = followSpeedIn;
        this.petPathfinder = tameableIn.getNavigation();
        this.minBlockDistance = mindistance * mindistance;
        this.maxBlockDistance = maxdistance * maxdistance;
        this.canSendOrder = send;
        this.setFlags(java.util.EnumSet.of(Flag.MOVE, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        EntityParasiteBase entitylivingbase = this.tameable.getParasiteFollowing();
        if (entitylivingbase == null) {
            return false;
        }
        if (this.tameable.distanceToSqr(entitylivingbase) < this.minBlockDistance) {
            return false;
        }
        this.owner = entitylivingbase;
        return true;
    }

    @Override
    public boolean canContinueToUse() {
        if (this.owner == null || !this.owner.isAlive()) {
            this.tameable.setParasiteToFollow(null);
            return false;
        }
        return !this.petPathfinder.isDone() && this.tameable.distanceToSqr(this.owner) > this.maxBlockDistance;
    }

    @Override
    public void start() {
        this.timeToRecalcPath = 0;
        this.oldWaterCost = this.tameable.getPathfindingMalus(net.minecraft.world.level.pathfinder.BlockPathTypes.WATER);
        this.tameable.setPathfindingMalus(net.minecraft.world.level.pathfinder.BlockPathTypes.WATER, 0.0f);
    }

    @Override
    public void stop() {
        this.petPathfinder.stop();
        this.tameable.setPathfindingMalus(net.minecraft.world.level.pathfinder.BlockPathTypes.WATER, this.oldWaterCost);
    }

    @Override
    public void tick() {
        this.tameable.getLookControl().setLookAt(this.owner, 10.0f, (float) this.tameable.getMaxHeadYRot());
        if (this.tameable.getTarget() != null && this.canSendOrder && this.tameable.getParasiteFollowing() != null && this.tameable.getParasiteFollowing().getTarget() == null && !(this.tameable.getTarget() instanceof EntityParasiteBase)) {
            this.tameable.getParasiteFollowing().setTarget(this.tameable.getTarget());
        }
        if (--this.timeToRecalcPath <= 0) {
            this.timeToRecalcPath = 10;
            if (!this.petPathfinder.moveTo(this.owner, this.followSpeed)) {
                this.tameable.setParasiteToFollow(null);
            }
        }
    }
}