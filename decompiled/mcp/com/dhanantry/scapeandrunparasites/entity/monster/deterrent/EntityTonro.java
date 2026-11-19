/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityAILookIdle
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.monster.deterrent;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatusAOE;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISkill;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCutomAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationary;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.EntityWave;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityTonro
extends EntityPStationary
implements EntityCutomAttack {
    private float attackTimer;
    private boolean up;
    private int border;
    private boolean skillshockwave;

    public EntityTonro(World worldIn) {
        super(worldIn);
        this.setSize(0.7f, 4.5f);
        this.experienceValue = SRPAttributes.XP_ADAPTED * 2;
        this.type = (byte)40;
        this.buriedT = 7.5;
        this.damageCap = SRPConfig.turretCap;
        this.pointCap = SRPConfig.turretPointCap;
        this.pointReduction = SRPConfig.turretPointRed;
        this.chanceLearn = SRPConfig.turretChanceLe;
        this.chanceLearnFire = SRPConfig.turretChanceLeFire;
        this.DamageTypeCap = SRPConfig.turretPointDamCap;
        this.MiniDamage = SRPConfig.turretMinDamage;
        this.regen = SRPConfig.turretRegen;
    }

    @Override
    public int getParasiteIDRegister() {
        return 29;
    }

    protected void initEntityAI() {
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIAttackMeleeStatusAOE((EntityParasiteBase)this, 0.0, false, 8.0, 7.0));
        this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.tasks.addTask(2, (EntityAIBase)new EntityAISkill(this, 20, 16, 1, true, 1));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.TONRO_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.TONRO_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.TONRO_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(20.0);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.up) {
            this.attackTimer = (float)((double)this.attackTimer + 0.15);
            if (this.attackTimer > 1.0f) {
                this.up = false;
            }
        } else {
            this.attackTimer = (float)((double)this.attackTimer - 0.2);
        }
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        boolean flag = super.attackEntityAsMob(entityIn);
        if (flag) {
            entityIn.motionY += 0.5000000059604645;
        }
        return flag;
    }

    @Override
    public boolean attackEntityAsMobAOE(Entity entityIn) {
        this.up = true;
        this.attackTimer = 0.0f;
        this.world.setEntityState((Entity)this, (byte)12);
        boolean flag = false;
        this.playSound(SRPSounds.SWIPE, 3.0f, 1.0f);
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(entityIn.posX, entityIn.posY, entityIn.posZ, entityIn.posX + 1.0, entityIn.posY + 1.0, entityIn.posZ + 1.0).grow(2.0);
        List moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
        for (EntityLivingBase mob : moblist) {
            if (mob == this || mob instanceof EntityParasiteBase || !this.canEntityBeSeen((Entity)mob) || !this.attackEntityAsMob((Entity)mob)) continue;
            flag = true;
        }
        return flag;
    }

    public float getEyeHeight() {
        return 3.8f;
    }

    public static void registerFixesTonro(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityTonro.class);
    }

    @SideOnly(value=Side.CLIENT)
    public float getAttackTimer() {
        return this.attackTimer;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 12) {
            this.up = true;
            this.attackTimer = 0.0f;
        } else if (id == 100) {
            for (int i = 0; i <= 1; ++i) {
                this.spawnParticles(EnumParticleTypes.FLAME);
            }
        } else {
            super.handleStatusUpdate(id);
        }
    }

    @Override
    public boolean getFinished(byte attID) {
        switch (attID) {
            case 1: {
                return this.skillshockwave;
            }
        }
        return super.getFinished(attID);
    }

    @Override
    public void setFinished(byte attID, boolean in) {
        switch (attID) {
            case 1: {
                this.skillshockwave = in;
                return;
            }
        }
        super.setFinished(attID, in);
    }

    @Override
    public void doSpecialSkill(byte id) {
        switch (id) {
            case 1: {
                this.shockwave();
                return;
            }
        }
        super.doSpecialSkill(id);
    }

    private void shockwave() {
        this.setParasiteStatus(10);
        this.getNavigator().clearPath();
        if (this.border == 0) {
            float v = (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4f + 2.0f;
            this.playSound(this.getHurtSound(DamageSource.GENERIC), 4.0f, v);
            ++this.border;
            return;
        }
        if (this.border <= 2) {
            this.world.setEntityState((Entity)this, (byte)100);
        }
        if (this.ticksExisted % 20 != 0) {
            return;
        }
        ++this.border;
        if (this.getAttackTarget() == null) {
            this.skillshockwave = true;
            this.setParasiteStatus(0);
            this.border = 0;
            return;
        }
        if (this.getAttackTarget().posY != this.posY) {
            this.skillshockwave = true;
            this.setParasiteStatus(0);
            this.border = 0;
            return;
        }
        if (this.border == 3) {
            this.spawnShock();
        }
        if (this.border == 5) {
            this.spawnShock();
        }
        if (this.border > 6) {
            this.skillshockwave = true;
            this.setParasiteStatus(0);
            this.border = 0;
        }
    }

    private void spawnShock() {
        EntityWave wa = new EntityWave(this.world);
        float f19 = MathHelper.sin((float)(this.rotationYaw * ((float)Math.PI / 180) - this.randomYawVelocity * 0.01f));
        float f14 = 0.17453292f;
        float f16 = MathHelper.cos((float)f14);
        float f4 = MathHelper.cos((float)(this.rotationYaw * ((float)Math.PI / 180) - this.randomYawVelocity * 0.01f));
        wa.setPositionAndUpdate(this.posX + -1.0 * (double)(f19 * 2.0f * f16), this.posY, this.posZ - -1.0 * (double)(f4 * 2.0f * f16));
        if (!wa.world.getCollisionBoxes((Entity)wa, wa.getEntityBoundingBox()).isEmpty()) {
            wa.setDead();
            this.skillshockwave = true;
            this.setParasiteStatus(0);
            this.border = 0;
            return;
        }
        wa.setDamages(this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.3, this.MiniDamage, 1, 12);
        this.world.spawnEntity((Entity)wa);
        wa.setAttackTarget(this.getAttackTarget());
    }
}

