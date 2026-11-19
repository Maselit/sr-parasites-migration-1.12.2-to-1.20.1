/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPMalleable;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityPCosmical
extends EntityPMalleable {
    protected int shakeee;
    protected boolean canAvoidD;
    protected int showC;

    public EntityPCosmical(World worldIn) {
        super(worldIn);
        this.type = (byte)71;
        this.canAvoidD = true;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.shakeee > 0) {
            --this.shakeee;
        }
        if (this.showC > -10) {
            --this.showC;
        }
        if (this.rand.nextInt(10) == 0 && this.showC <= -10) {
            this.showC = this.rand.nextInt(1) * 60;
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (this.world.isRemote) {
            return false;
        }
        if (this.canAvoidD) {
            this.shakeee = 15;
            this.showC = 15;
            this.world.setEntityState((Entity)this, (byte)41);
            return false;
        }
        return super.attackEntityFrom(source, amount);
    }

    public int shakingC() {
        return this.shakeee;
    }

    public int showC() {
        return this.showC;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void handleStatusUpdate(byte id) {
        switch (id) {
            case 41: {
                this.shakeee = 15;
                this.showC = 15;
                break;
            }
            default: {
                super.handleStatusUpdate(id);
            }
        }
    }
}

