/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.EntityLeemB;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import java.util.List;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public abstract class EntityPRooster
extends EntityPStationaryArchitect {
    protected int leemRange;
    protected int leemRangeEffect;
    protected int leemBalls;
    protected int leemCooldown;
    protected int leemCooldownReset;

    public EntityPRooster(World worldIn) {
        super(worldIn);
    }

    @Override
    public void func_70636_d() {
        super.func_70636_d();
        if (!this.field_70170_p.field_72995_K) {
            if (this.srpTicks == 5) {
                this.func_184596_c(SRPPotions.PIVOT_E);
            }
            if (this.srpTicks == 10 && this.leemCooldown <= 0) {
                this.leemCooldown = this.leemCooldownReset;
                AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70165_t + 1.0, this.field_70163_u + 1.0, this.field_70161_v + 1.0).func_72314_b((double)this.leemRangeEffect, (double)this.leemRangeEffect, (double)this.leemRangeEffect);
                List moblist = this.field_70170_p.func_72872_a(EntityParasiteBase.class, axisalignedbb);
                for (EntityParasiteBase mob : moblist) {
                    if (!mob.func_70089_S() || mob instanceof EntityPRooster || mob.getParasiteIDRegister() == 314) continue;
                    mob.func_70690_d(new PotionEffect(SRPPotions.PIVOT_E, 300, this.stage - 1, false, false));
                    mob.SetRooter(this);
                }
            }
        }
    }

    @Override
    public boolean func_70097_a(DamageSource source, float amount) {
        if (this.field_70170_p.field_72995_K) {
            return false;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70165_t + 1.0, this.field_70163_u + 1.0, this.field_70161_v + 1.0).func_72314_b((double)(this.leemRange + 1), (double)this.leemRange, (double)(this.leemRange + 1));
        List moblist = this.field_70170_p.func_72872_a(EntityLeemB.class, axisalignedbb);
        if (moblist.size() > 0) {
            float part = amount / (float)moblist.size();
            for (EntityLeemB mob : moblist) {
                mob.func_70097_a(source, part);
            }
            return super.func_70097_a(source, 0.0f);
        }
        this.spawnLeemB(this.leemBalls);
        return super.func_70097_a(source, amount);
    }

    protected void spawnLeemB(int in) {
        int cap = this.field_70146_Z.nextInt(this.leemBalls) + 1;
        for (int i = 0; i < cap; ++i) {
            ParasiteEventEntity.SummonM(this, new String[]{"srparasites:rooterball;1;1"}, this.leemRange, null);
        }
    }

    @Override
    public void func_70014_b(NBTTagCompound compound) {
        super.func_70014_b(compound);
    }

    @Override
    public void func_70037_a(NBTTagCompound compound) {
        super.func_70037_a(compound);
    }
}

