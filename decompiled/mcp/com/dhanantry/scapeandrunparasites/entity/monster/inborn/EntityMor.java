/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.inborn;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.World;

public class EntityMor
extends EntityParasiteBase {
    public EntityMor(World worldIn) {
        super(worldIn);
        this.setSize(0.85f, 1.0f);
        this.experienceValue = SRPAttributes.XP_LiTTLE;
        this.tasks.removeTask((EntityAIBase)this.folow);
        this.type = (byte)7;
        this.killcount = -10.0;
    }

    @Override
    public int getParasiteIDRegister() {
        return 305;
    }

    protected void initEntityAI() {
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.LODO_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.LODO_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.LODO_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(SRPAttributes.LODO_KD_RESISTANCE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }

    public float getEyeHeight() {
        return 0.8f;
    }

    public static void registerFixesLodo(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityMor.class);
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

