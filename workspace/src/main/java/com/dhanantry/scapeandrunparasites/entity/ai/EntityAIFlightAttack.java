package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIFlightAttack a 1.20.1 (Goal).
 */
public class EntityAIFlightAttack extends Goal {
    private final EntityParasiteBase parent;
    private int delay;
    private final double distance;
    private final boolean xRay;
    private final int fromF;

    public EntityAIFlightAttack(EntityParasiteBase in, double distance) {
        this(in, distance, false, 0);
    }

    public EntityAIFlightAttack(EntityParasiteBase in, double distance, boolean ignoreSee, int floorS) {
        this.parent = in;
        this.delay = 0;
        this.distance = distance * distance;
        this.xRay = ignoreSee;
        this.fromF = floorS;
    }

    @Override
    public boolean canUse() {
        return this.parent.getWait() == 0 && this.parent.tickCount % 20 == 0;
    }

    @Override
    public void tick() {
        net.minecraft.world.entity.LivingEntity target = this.parent.getTarget();
        if (target != null) {
            if (target instanceof EntityParasiteBase) {
                this.parent.setTarget(null);
                this.delay = 0;
                this.parent.setParasiteStatus(0);
                return;
            }
            if (!target.isAlive()) {
                this.parent.setTarget(null);
                this.delay = 0;
                this.parent.setParasiteStatus(0);
                return;
            }
            if (target instanceof net.minecraft.world.entity.player.Player) {
                net.minecraft.world.entity.player.Player p = (net.minecraft.world.entity.player.Player) target;
                if (p.isCreative()) {
                    this.parent.setTarget(null);
                    this.delay = 0;
                    this.parent.setParasiteStatus(0);
                    return;
                }
            }
            if (!this.parent.hasLineOfSight(target)) {
                if (this.xRay) {
                    if (this.parent.getRandom().nextInt(5) == 0) {
                        ++this.delay;
                    }
                } else {
                    ++this.delay;
                }
            } else {
                this.delay = target.distanceToSqr(this.parent) >= this.distance ? ++this.delay : 0;
            }
            if (this.delay >= 6) {
                this.parent.setTarget(null);
                this.parent.setParasiteStatus(0);
                this.delay = 0;
            }
        } else {
            this.attackSurr();
        }
    }

    protected void attackSurr() {
        net.minecraft.core.BlockPos posi = this.parent.blockPosition();
        if (this.fromF != 0 && this.parent.getRandom().nextInt(this.fromF) == 0) {
            posi = ParasiteEventEntity.getFloor(this.parent.level(), posi, 25);
            if (posi == null) posi = this.parent.blockPosition();
        }
        net.minecraft.world.phys.AABB axisalignedbb = this.parent.getBoundingBox().inflate(this.parent.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE).getValue());
        java.util.List<net.minecraft.world.entity.LivingEntity> moblist = this.parent.level().getEntitiesOfClass(net.minecraft.world.entity.LivingEntity.class, axisalignedbb);
        for (net.minecraft.world.entity.LivingEntity mob : moblist) {
            if (mob == null) continue;
            if (mob instanceof net.minecraft.world.entity.player.Player) {
                net.minecraft.world.entity.player.Player p = (net.minecraft.world.entity.player.Player) mob;
                if (p.isCreative()) continue;
                this.parent.setTarget(mob);
                return;
            }
            if (mob instanceof EntityParasiteBase || mob instanceof net.minecraft.world.entity.animal.Animal || mob instanceof net.minecraft.world.entity.monster.Creeper || mob instanceof net.minecraft.world.entity.animal.WaterAnimal) continue;
            if (!SRPConfig.mobattacking) continue;
            if (ParasiteEventEntity.checkEntity(mob, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite)) continue;
            if (this.fromF != 0 && mob.distanceToSqr(this.parent) > this.distance) continue;
            if (mob == this.parent) continue;
            if (!this.parent.canAttackClass(mob.getClass())) continue;
            if (!this.parent.hasLineOfSight(mob) && !this.xRay) continue;
            if (!(mob.distanceToSqr(this.parent) < 1024.0)) continue;
            if (!mob.isAlive()) continue;
            this.parent.setTarget(mob);
            this.parent.setParasiteStatus(1);
            return;
        }
    }
}