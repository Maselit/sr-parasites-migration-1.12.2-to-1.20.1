/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.init.MobEffects
 *  net.minecraft.util.math.MathHelper
 */
package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.init.MobEffects;
import net.minecraft.util.math.MathHelper;

public class EntityAIEvade
extends EntityAIBase {
    private final EntityParasiteBase parent;
    private int eCooldown;
    private int cooldown;
    private int eDuration;
    private int tracker;
    private boolean inC;
    private int blockDistance;

    public EntityAIEvade(EntityParasiteBase in, int cooldown, int duration, int distance) {
        this.parent = in;
        this.tracker = 0;
        this.eCooldown = cooldown;
        this.cooldown = cooldown + 1;
        this.eDuration = duration;
        this.blockDistance = distance * distance;
        this.inC = false;
    }

    public boolean func_75250_a() {
        return (this.parent.func_70638_az() != null || this.inC) && this.parent.getParasiteStatus() > 0 && this.parent.getParasiteStatus() < 3 && this.parent.field_70122_E;
    }

    public void func_75251_c() {
        this.cooldown = 0;
        this.tracker = 0;
        this.inC = false;
        this.parent.field_70702_br = 0.0f;
    }

    public void func_75246_d() {
        EntityLivingBase target = this.parent.func_70638_az();
        if ((target != null || this.inC) && !this.parent.func_70644_a(MobEffects.field_76421_d)) {
            if (this.inC) {
                ++this.tracker;
                if (this.tracker >= this.eDuration) {
                    this.parent.field_70702_br = 0.0f;
                    this.tracker = 0;
                    this.cooldown = 0;
                    this.inC = false;
                }
            } else {
                if (this.parent.func_70068_e((Entity)target) > (double)this.blockDistance && this.parent.func_70685_l((Entity)target) && this.parent.func_70068_e((Entity)target) < 225.0) {
                    ++this.cooldown;
                }
                if (this.cooldown >= this.eCooldown && this.parent.field_70702_br == 0.0f) {
                    int i = this.parent.func_70681_au().nextInt(2) == 0 ? 1 : -1;
                    this.parent.field_70702_br = i;
                    this.inC = true;
                    double dd0 = target.field_70165_t - this.parent.field_70165_t;
                    double dd1 = target.field_70161_v - this.parent.field_70161_v;
                    float f = MathHelper.func_76133_a((double)(dd0 * dd0 + dd1 * dd1));
                    this.parent.field_70159_w += dd0 / (double)f * 1.77 * (double)0.8f + this.parent.field_70159_w * (double)0.2f;
                    this.parent.field_70179_y += dd1 / (double)f * 1.77 * (double)0.8f + this.parent.field_70179_y * (double)0.2f;
                    this.parent.field_70181_x = 0.2 + (double)this.parent.field_70131_O * 0.1;
                    this.parent.func_70661_as().func_75499_g();
                }
            }
        }
    }
}

