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

    public boolean func_75250_a() {
        return this.parent.func_70638_az() != null;
    }

    public void func_75246_d() {
        if (this.parent.func_70638_az() != null) {
            EntityLivingBase entitylivingbase = this.parent.func_70638_az();
            if (entitylivingbase.func_70032_d((Entity)this.parent) < this.distance && this.parent.func_70685_l((Entity)entitylivingbase)) {
                this.parent.setWorkTask(true);
            } else {
                this.parent.setWorkTask(false);
            }
        }
    }
}

