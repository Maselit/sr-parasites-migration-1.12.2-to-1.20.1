/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 */
package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIAttackMeleeRangeSwitch
extends EntityAIBase {
    private EntityParasiteBase parent;
    private float distance;

    public EntityAIAttackMeleeRangeSwitch(EntityParasiteBase in, float meleeDistance) {
        this.parent = in;
        this.distance = meleeDistance;
    }

    public boolean shouldExecute() {
        return this.parent.getAttackTarget() != null;
    }

    public void updateTask() {
        if (this.parent.getAttackTarget() != null) {
            EntityLivingBase entitylivingbase = this.parent.getAttackTarget();
            if (entitylivingbase.getDistance((Entity)this.parent) < this.distance && this.parent.canEntityBeSeen((Entity)entitylivingbase)) {
                this.parent.setWorkTask(true);
            } else {
                this.parent.setWorkTask(false);
            }
        }
    }
}

