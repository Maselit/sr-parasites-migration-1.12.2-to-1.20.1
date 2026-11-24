package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.util.LandRandomPos;
import net.minecraft.world.phys.Vec3;

/**
 * Migracion de EntityAIAvoidEntityStatus a 1.20.1 (Goal).
 */
public class EntityAIAvoidEntityStatus<T extends net.minecraft.world.entity.Entity> extends Goal {
    protected EntityParasiteBase entity;
    private final double farSpeed;
    protected T closestLivingEntity;
    private final float avoidDistance;
    private net.minecraft.world.level.pathfinder.Path path;
    private final net.minecraft.world.entity.ai.navigation.PathNavigation navigation;
    private final Class<T> classToAvoid;
    private final java.util.function.Predicate<? super T> avoidTargetSelector;

    public EntityAIAvoidEntityStatus(EntityParasiteBase entityIn, Class<T> classToAvoidIn, float avoidDistanceIn, double farSpeedIn) {
        this(entityIn, classToAvoidIn, t -> true, avoidDistanceIn, farSpeedIn);
    }

    public EntityAIAvoidEntityStatus(EntityParasiteBase entityIn, Class<T> classToAvoidIn, java.util.function.Predicate<? super T> avoidTargetSelectorIn, float avoidDistanceIn, double farSpeedIn) {
        this.entity = entityIn;
        this.classToAvoid = classToAvoidIn;
        this.avoidTargetSelector = avoidTargetSelectorIn;
        this.avoidDistance = avoidDistanceIn;
        this.farSpeed = farSpeedIn;
        this.navigation = entityIn.getNavigation();
        this.setFlags(java.util.EnumSet.of(Flag.MOVE));
    }

    @Override
    public boolean canUse() {
        java.util.List<T> list = this.entity.level().getEntitiesOfClass(this.classToAvoid, this.entity.getBoundingBox().inflate(this.avoidDistance, 3.0, this.avoidDistance));
        java.util.List<T> filtered = new java.util.ArrayList<>();
        for (T e : list) {
            if (e instanceof net.minecraft.world.entity.LivingEntity && ((net.minecraft.world.entity.LivingEntity) e).isAlive() && this.entity.hasLineOfSight((net.minecraft.world.entity.LivingEntity) e) && this.avoidTargetSelector.test(e)) {
                filtered.add(e);
            }
        }
        if (filtered.isEmpty() || this.entity.shouldWorkTask()) {
            return false;
        }
        this.closestLivingEntity = filtered.get(0);
        Vec3 vec3d = LandRandomPos.getPosAway(this.entity, 16, 7, new net.minecraft.world.phys.Vec3(((net.minecraft.world.entity.Entity) this.closestLivingEntity).getX(), ((net.minecraft.world.entity.Entity) this.closestLivingEntity).getY(), ((net.minecraft.world.entity.Entity) this.closestLivingEntity).getZ()));
        if (vec3d == null) {
            return false;
        }
        if (((net.minecraft.world.entity.Entity) this.closestLivingEntity).distanceToSqr(vec3d) < ((net.minecraft.world.entity.Entity) this.closestLivingEntity).distanceToSqr(this.entity)) {
            return false;
        }
        this.path = this.navigation.createPath(new net.minecraft.core.BlockPos((int) vec3d.x, (int) vec3d.y, (int) vec3d.z), 0);
        return this.path != null;
    }

    @Override
    public boolean canContinueToUse() {
        return !this.navigation.isDone();
    }

    @Override
    public void start() {
        this.navigation.moveTo(this.path, this.farSpeed);
    }

    @Override
    public void stop() {
        this.closestLivingEntity = null;
    }

    @Override
    public void tick() {
        this.entity.getNavigation().setSpeedModifier(this.farSpeed);
    }
}