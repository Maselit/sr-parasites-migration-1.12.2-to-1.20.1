/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 */
package com.dhanantry.scapeandrunparasites.entity;

import com.dhanantry.scapeandrunparasites.entity.EntityBody;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;

public class EntityBodyModel
extends EntityBody {
    private static final DataParameter<Byte> SKIN = EntityDataManager.createKey(EntityBodyModel.class, (DataSerializer)DataSerializers.BYTE);
    public float prevRenderYawOffset;
    public float renderYawOffset;
    public float prevRotationYawHead;
    public float rotationYawHead;
    public float prevLimbSwingAmount;
    public float limbSwingAmount;
    public float limbSwing;
    public int hurtTime;
    public int deathTime;

    public EntityBodyModel(EntityParasiteBase parent, float width, float height, float damageMultiplier, float offset, float offheight, int inv, int id, boolean side) {
        super(parent, width, height, damageMultiplier, offset, offheight, inv, id, side);
    }

    public EntityBodyModel(EntityParasiteBase parent, float width, float height, float damageMultiplier, float offset, float offheight, int inv, int id, boolean side, float eyes) {
        super(parent, width, height, damageMultiplier, offset, offheight, inv, id, side, eyes);
    }

    @Override
    protected void entityInit() {
        this.dataManager.register(SKIN, (Object)0);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        this.prevRenderYawOffset = this.parent.prevRenderYawOffset;
        this.renderYawOffset = this.parent.renderYawOffset;
        this.prevRotationYawHead = this.parent.prevRotationYawHead;
        this.rotationYawHead = this.parent.rotationYawHead;
        this.prevLimbSwingAmount = this.parent.prevLimbSwingAmount;
        this.limbSwingAmount = this.parent.limbSwingAmount;
        this.limbSwing = this.parent.limbSwing;
        this.hurtTime = this.parent.hurtTime;
        this.deathTime = this.parent.deathTime;
        this.ticksExisted = this.parent.ticksExisted;
    }

    public byte getSkin() {
        return (byte)this.parent.getSkin();
    }

    public void setSkin(int texture) {
        this.dataManager.set(SKIN, (Object)((byte)texture));
    }
}

