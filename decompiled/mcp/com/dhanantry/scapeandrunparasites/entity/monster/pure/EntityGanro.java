/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.pathfinding.PathNavigate
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.monster.pure;

import com.dhanantry.scapeandrunparasites.entity.EntityBody;
import com.dhanantry.scapeandrunparasites.entity.EntityDamage;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatusAOE;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIEvadeDash;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISkill;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISwimmingDiving;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIWaterLeapAtTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityBodyParts;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCutomAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPPure;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.EntityWaveShock;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.PathNavigateClimberStatus;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityGanro
extends EntityPPure
implements EntityCutomAttack,
EntityBodyParts {
    private float attackTimer;
    private boolean up;
    public EntityBody tendril1;
    public EntityBody tendril2;
    private byte left1;
    private byte right2;
    private static final DataParameter<Byte> CLIMBING = EntityDataManager.createKey(EntityGanro.class, (DataSerializer)DataSerializers.BYTE);
    private int attacking;
    private double targetX;
    private double targetY;
    private double targetZ;
    private boolean skillCharge;
    private int border;
    private boolean skillshockwave;

    public EntityGanro(World worldIn) {
        super(worldIn);
        this.setSize(0.901f, 4.2f);
        this.stepHeight = 1.0f;
        this.tendril1 = new EntityBody(this, 0.7f, 0.9f, 1.0f, 0.7f, 3.7f, 1, 1, true);
        this.tendril2 = new EntityBody(this, 0.7f, 0.9f, 1.0f, 0.7f, 3.7f, -1, 2, true);
        this.left1 = 1;
        this.right2 = 1;
        this.adaptationCap = 0.95f;
        this.ignoreFrustumCheck = true;
        this.skillCharge = false;
    }

    @Override
    public int getParasiteIDRegister() {
        return 33;
    }

    protected void initEntityAI() {
        this.tasks.addTask(0, (EntityAIBase)new EntityAISkill(this, 80, 100, 10, true, 14));
        this.setskillLeapValues(1.2f, 2.5, 5);
        this.tasks.addTask(2, (EntityAIBase)new EntityAISkill(this, 40, (int)(SRPConfig.pureFollow * 0.7), 2, false, 2));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false, new Class[0]));
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimmingDiving((EntityLiving)this, 0.12));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIWaterLeapAtTargetStatus(this, 0.7f, 1.5, 3, 20, 0));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIAttackMeleeStatusAOE((EntityParasiteBase)this, 1.3, false, 8.0, 4.0));
        this.tasks.addTask(2, (EntityAIBase)new EntityAISkill(this, 40, 32, 8, true, 1));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIEvadeDash(this, 20, 2, 4, 3.0, 15));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.GANRO_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.GANRO_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.27);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.GANRO_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(SRPAttributes.GANRO_KD_RESISTANCE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.pureFollow);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.up) {
            this.attackTimer = (float)((double)this.attackTimer + 0.2);
            if ((double)this.attackTimer > 1.5) {
                this.up = false;
            }
        } else {
            this.attackTimer = (float)((double)this.attackTimer - 0.1);
        }
        this.tendril1.onUpdate();
        this.tendril2.onUpdate();
        if (!this.world.isRemote) {
            this.setBesideClimbableBlock(this.collidedHorizontally);
        }
    }

    @Override
    protected boolean spawnT(EntityLivingBase in, int range2, int mini2, int check, int type) {
        if (this.canEntityBeSeen((Entity)in)) {
            return false;
        }
        if (this.rand.nextInt(4) == 0) {
            return super.spawnT(in, range2, mini2, check, type);
        }
        return super.spawnT(in, range2, mini2, check, 2);
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(CLIMBING, (Object)0);
    }

    public boolean isBesideClimbableBlock() {
        return ((Byte)this.dataManager.get(CLIMBING) & 1) != 0;
    }

    public void setBesideClimbableBlock(boolean climbing) {
        byte b0 = (Byte)this.dataManager.get(CLIMBING);
        if (this.getAttackTarget() != null) {
            if (!this.canEntityBeSeen((Entity)this.getAttackTarget())) {
                if (this.getDistanceSq((Entity)this.getAttackTarget()) < 100.0) {
                    b0 = (byte)(b0 & 0xFFFFFFFE);
                    this.dataManager.set(CLIMBING, (Object)b0);
                    return;
                }
            } else if (this.getAttackTarget().posY + 1.0 < this.posY) {
                b0 = (byte)(b0 & 0xFFFFFFFE);
                this.dataManager.set(CLIMBING, (Object)b0);
                return;
            }
        }
        b0 = climbing ? (byte)(b0 | 1) : (byte)(b0 & 0xFFFFFFFE);
        this.dataManager.set(CLIMBING, (Object)b0);
    }

    public boolean isOnLadder() {
        return this.isBesideClimbableBlock();
    }

    protected PathNavigate createNavigator(World worldIn) {
        return new PathNavigateClimberStatus((EntityLiving)this, worldIn);
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
    public void fall(float distance, float damageMultiplier) {
    }

    public float getEyeHeight() {
        return 3.5f;
    }

    public static void registerFixesLodo(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityGanro.class);
    }

    protected SoundEvent getAmbientSound() {
        if (this.getParasiteStatus() != 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.GANRO_GROWL;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        if (this.rand.nextBoolean() && this.getHitStatus() > 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.GANRO_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SRPSounds.GANRO_DEATH;
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag) {
            ParasiteEventEntity.orbApplyEffects(in, this, SRPConfigMobs.ganroOrbEffects, mobs);
        }
        return flag;
    }

    public void setDead() {
        if (this.tendril1 != null) {
            this.world.removeEntityDangerously((Entity)this.tendril1);
        }
        if (this.tendril2 != null) {
            this.world.removeEntityDangerously((Entity)this.tendril2);
        }
        super.setDead();
    }

    @Override
    public boolean attackEntityAsMobAOE(Entity entityIn) {
        if (this.borderOrb != 0) {
            return false;
        }
        this.up = true;
        this.attackTimer = 0.0f;
        this.world.setEntityState((Entity)this, (byte)12);
        boolean flag = false;
        this.playSound(SRPSounds.SWIPE, 2.0f, 1.0f);
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(entityIn.posX, entityIn.posY, entityIn.posZ, entityIn.posX + 1.0, entityIn.posY + 1.0, entityIn.posZ + 1.0).grow(2.0);
        List moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
        for (EntityLivingBase mob : moblist) {
            if (mob instanceof EntityParasiteBase) {
                if (this.getAttackTarget() != mob) continue;
                this.setAttackTarget(null);
                return false;
            }
            if (mob == this || !this.canEntityBeSeen((Entity)mob) || !this.attackEntityAsMob((Entity)mob)) continue;
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean attackEntityBodyFrom(DamageSource source, float amount, int id, boolean notify) {
        if (this.rand.nextBoolean()) {
            SRPPotions.applyStackPotion(SRPPotions.BLEED_E, (EntityLivingBase)this, 80, 0);
        }
        return this.attackEntityFrom(source, amount * 3.0f);
    }

    @Override
    public void setBodyPartDead(int id) {
        if (this.tendril1.getId() == id) {
            this.tendril1.setDead();
        } else if (this.tendril2.getId() == id) {
            this.tendril2.setDead();
        }
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        IEntityLivingData floo = super.onInitialSpawn(difficulty, livingdata);
        if (this.rand.nextDouble() < SRPConfig.variantChance || this.phaseCreated >= SRPConfigSystems.evolutionParasiteAlwaysVariant || this.canChangeVariant) {
            switch (this.rand.nextInt(1)) {
                case 0: {
                    this.setSkin(7);
                }
            }
        }
        return floo;
    }

    @SideOnly(value=Side.CLIENT)
    public float getAttackTimer() {
        return this.attackTimer;
    }

    @SideOnly(value=Side.CLIENT)
    public byte getLeft() {
        return this.left1;
    }

    @SideOnly(value=Side.CLIENT)
    public byte getRight() {
        return this.right2;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 11) {
            this.left1 = 0;
        } else if (id == 12) {
            this.up = true;
            this.attackTimer = 0.0f;
        } else if (id == 22) {
            this.right2 = 0;
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
                return this.skillCharge;
            }
            case 2: {
                return this.skillshockwave;
            }
        }
        return super.getFinished(attID);
    }

    @Override
    public void setFinished(byte attID, boolean in) {
        switch (attID) {
            case 1: {
                this.skillCharge = in;
                return;
            }
            case 2: {
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
                this.charge();
                return;
            }
            case 2: {
                this.shockwave();
                return;
            }
        }
        super.doSpecialSkill(id);
    }

    private void charge() {
        ++this.attacking;
        this.miniCapA = true;
        if (this.attacking < 20) {
            EntityLivingBase entitylivingbase;
            this.world.setEntityState((Entity)this, (byte)100);
            if (this.attacking == 2) {
                float v = (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4f + 2.0f;
                this.playSound(this.getHurtSound(DamageSource.GENERIC), 4.0f, v);
            }
            if ((entitylivingbase = this.getAttackTarget()) == null || !this.onGround || this.isInWater() || entitylivingbase.posY > this.posY && entitylivingbase.onGround) {
                this.skillCharge = true;
                this.attacking = 0;
                this.miniCapA = false;
                this.setParasiteStatus(0);
                return;
            }
            if (!entitylivingbase.isEntityAlive()) {
                this.skillCharge = true;
                this.attacking = 0;
                this.miniCapA = false;
                this.setParasiteStatus(0);
                return;
            }
            if (this.attacking <= 19) {
                double dis = this.getDistance((Entity)entitylivingbase);
                this.setParasiteStatus(3);
                this.getNavigator().clearPath();
                this.targetX = this.posX + 15.0 * (entitylivingbase.posX - this.posX) / dis;
                this.targetY = this.posY + 15.0 * (entitylivingbase.posY - this.posY) / dis;
                this.targetZ = this.posZ + 15.0 * (entitylivingbase.posZ - this.posZ) / dis;
            }
        }
        if (this.attacking == 20) {
            this.getNavigator().tryMoveToXYZ(this.targetX, this.targetY, this.targetZ, 3.0);
        }
        if (this.attacking >= 20) {
            for (EntityLivingBase mob : this.world.getEntitiesWithinAABB(EntityLivingBase.class, this.getEntityBoundingBox().grow(2.0, 0.0, 2.0))) {
                if (mob == this || mob instanceof EntityParasiteBase) continue;
                float f = (float)MathHelper.atan2((double)(mob.posZ - this.posZ), (double)(mob.posX - this.posX));
                EntityDamage damage = new EntityDamage(this.world, mob.posX, mob.posY, mob.posZ, f, (EntityLivingBase)this, 1.0f, false, 0.5f);
                this.world.spawnEntity((Entity)damage);
            }
        }
        this.skillBreakBlocks();
        if (!this.onGround) {
            this.motionX *= 0.7;
            this.motionZ *= 0.7;
        }
        if (this.attacking >= 60 && this.posX == this.prevPosX && this.posZ == this.prevPosZ) {
            this.attacking = 0;
            this.miniCapA = false;
            this.skillCharge = true;
            this.setParasiteStatus(2);
        }
    }

    private void shockwave() {
        this.setParasiteStatus(100);
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
        if (this.border == 2) {
            this.spawnShock();
            this.up = true;
            this.attackTimer = 0.0f;
            this.world.setEntityState((Entity)this, (byte)12);
            this.playSound(SRPSounds.SWIPE, 2.0f, 1.0f);
        }
        if (this.border > 3) {
            this.skillshockwave = true;
            this.setParasiteStatus(0);
            this.border = 0;
        }
    }

    private void spawnShock() {
        EntityWaveShock wa = new EntityWaveShock(this.world, this);
        wa.setPositionAndUpdate(this.posX, this.posY, this.posZ);
        if (!wa.world.getCollisionBoxes((Entity)wa, wa.getEntityBoundingBox()).isEmpty()) {
            wa.setDead();
            this.skillshockwave = true;
            this.setParasiteStatus(0);
            this.border = 0;
            return;
        }
        wa.setDamages(this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.3, this.MiniDamage, 1, 60);
        this.world.spawnEntity((Entity)wa);
        wa.setAttackTarget(this.getAttackTarget());
    }
}

