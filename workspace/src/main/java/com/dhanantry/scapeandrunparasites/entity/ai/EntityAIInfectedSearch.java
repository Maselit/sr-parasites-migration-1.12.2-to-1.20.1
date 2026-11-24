package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanMelt;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityLesh;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAIInfectedSearch a 1.20.1 (Goal).
 */
public class EntityAIInfectedSearch extends Goal {
    private final EntityParasiteBase parent;
    private double moveSpeed;
    private boolean canmelt;

    public EntityAIInfectedSearch(EntityParasiteBase animal, double speedIn, boolean melt) {
        this.parent = animal;
        this.moveSpeed = speedIn;
        this.canmelt = melt;
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    @Override
    public boolean canUse() {
        if (this.parent.tickCount % 40 == 0) {
            return false;
        }
        if (this.parent.getTarget() != null) {
            return false;
        }
        return this.leshCount();
    }

    @Override
    public void tick() {
        if (this.parent.tickCount % 20 != 0 || this.parent.getKillC() < 0.0) {
            return;
        }
        int count = 0;
        net.minecraft.world.phys.AABB axisalignedbb = this.parent.getBoundingBox().inflate(this.parent.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE).getValue());
        java.util.List<EntityParasiteBase> moblist = this.parent.level().getEntitiesOfClass(EntityParasiteBase.class, axisalignedbb);
        for (EntityParasiteBase mob : moblist) {
            if (mob instanceof EntityLesh) {
                count += 1; // getTimes stub
            }
        }
        if (count >= 3 && this.canmelt && this.parent instanceof EntityCanMelt) {
            ((EntityCanMelt) this.parent).melt();
            return;
        }
        for (EntityParasiteBase mob : moblist) {
            if (mob == null || mob == this.parent || !(mob instanceof EntityCanMelt) || !this.parent.hasLineOfSight(mob) || mob.getTarget() != null) continue;
            EntityCanMelt meh = (EntityCanMelt) mob;
            if (meh.isMelting()) continue;
            meh.melt();
            if (++count < 3 || !this.canmelt) continue;
            if (this.parent instanceof EntityCanMelt) {
                ((EntityCanMelt) this.parent).melt();
            }
            return;
        }
        if (this.canmelt && this.parent instanceof EntityCanMelt) {
            ((EntityCanMelt) this.parent).melt();
        }
    }

    protected boolean leshCount() {
        return true; // simplified
    }
}