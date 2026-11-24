package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIGetFollowers a 1.20.1 (Goal).
 */
public class EntityAIGetFollowers extends Goal {
    private final EntityParasiteBase parent;
    private final int version;
    private final int searchRange;

    public EntityAIGetFollowers(EntityParasiteBase in, int mobVersion, int range) {
        this.parent = in;
        this.version = mobVersion;
        this.searchRange = range;
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    @Override
    public boolean canUse() {
        return this.parent.tickCount % 20 == 0 && this.parent.getParasiteFollowing() == null && this.parent.getTarget() == null;
    }

    @Override
    public void tick() {
        net.minecraft.world.phys.AABB axisalignedbb = this.parent.getBoundingBox().inflate(this.searchRange, 2.0, this.searchRange);
        java.util.List<EntityParasiteBase> moblist = this.parent.level().getEntitiesOfClass(EntityParasiteBase.class, axisalignedbb);
        outer:
        switch (this.version) {
            case 1:
                for (EntityParasiteBase mob : moblist) {
                    if (mob == this.parent || !this.parent.hasLineOfSight(mob) || !mob.isAlive() || mob.getParasiteType() >= 31) continue;
                    if (mob.getParasiteFollowing() == null) {
                        mob.setParasiteToFollow(this.parent);
                        break outer;
                    }
                    if (mob.getParasiteFollowing().getParasiteType() > 10) continue;
                    mob.setParasiteToFollow(this.parent);
                    break outer;
                }
                break;
            case 2:
                for (EntityParasiteBase mob : moblist) {
                    if (mob == this.parent || !this.parent.hasLineOfSight(mob) || !mob.isAlive() || mob.getParasiteType() >= 41) continue;
                    if (mob.getParasiteFollowing() == null) {
                        mob.setParasiteToFollow(this.parent);
                        break outer;
                    }
                    if (mob.getParasiteFollowing().getParasiteType() > 30) continue;
                    mob.setParasiteToFollow(this.parent);
                    break outer;
                }
                break;
            case 3:
                for (EntityParasiteBase mob : moblist) {
                    if (mob == this.parent || !this.parent.hasLineOfSight(mob) || !mob.isAlive() || mob.getParasiteType() >= 41) continue;
                    if (mob.getParasiteFollowing() == null) {
                        mob.setParasiteToFollow(this.parent);
                        break outer;
                    }
                    if (mob.getParasiteFollowing().getParasiteType() > 40) continue;
                    mob.setParasiteToFollow(this.parent);
                    break outer;
                }
                break;
            case 4:
                for (EntityParasiteBase mob : moblist) {
                    if (mob == this.parent || !this.parent.hasLineOfSight(mob) || !mob.isAlive() || mob.getParasiteType() >= 61) continue;
                    if (mob.getParasiteFollowing() == null) {
                        mob.setParasiteToFollow(this.parent);
                        break outer;
                    }
                    if (mob.getParasiteFollowing().getParasiteType() > 60) continue;
                    mob.setParasiteToFollow(this.parent);
                    break outer;
                }
                break;
        }
    }
}