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
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (!this.world.isRemote) {
            if (this.srpTicks == 5) {
                this.removeActivePotionEffect(SRPPotions.PIVOT_E);
            }
            if (this.srpTicks == 10 && this.leemCooldown <= 0) {
                this.leemCooldown = this.leemCooldownReset;
                AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX + 1.0, this.posY + 1.0, this.posZ + 1.0).grow((double)this.leemRangeEffect, (double)this.leemRangeEffect, (double)this.leemRangeEffect);
                List moblist = this.world.getEntitiesWithinAABB(EntityParasiteBase.class, axisalignedbb);
                for (EntityParasiteBase mob : moblist) {
                    if (!mob.isEntityAlive() || mob instanceof EntityPRooster || mob.getParasiteIDRegister() == 314) continue;
                    mob.addPotionEffect(new PotionEffect(SRPPotions.PIVOT_E, 300, this.stage - 1, false, false));
                    mob.SetRooter(this);
                }
            }
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (this.world.isRemote) {
            return false;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX + 1.0, this.posY + 1.0, this.posZ + 1.0).grow((double)(this.leemRange + 1), (double)this.leemRange, (double)(this.leemRange + 1));
        List moblist = this.world.getEntitiesWithinAABB(EntityLeemB.class, axisalignedbb);
        if (moblist.size() > 0) {
            float part = amount / (float)moblist.size();
            for (EntityLeemB mob : moblist) {
                mob.attackEntityFrom(source, part);
            }
            return super.attackEntityFrom(source, 0.0f);
        }
        this.spawnLeemB(this.leemBalls);
        return super.attackEntityFrom(source, amount);
    }

    protected void spawnLeemB(int in) {
        int cap = this.rand.nextInt(this.leemBalls) + 1;
        for (int i = 0; i < cap; ++i) {
            ParasiteEventEntity.SummonM(this, new String[]{"srparasites:rooterball;1;1"}, this.leemRange, null);
        }
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
    }
}

