/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityAILookIdle
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.pathfinding.PathNavigate
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.primitive;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIEvade;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIGetFollowers;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISkill;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISwimmingDiving;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIWaterLeapAtTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPPrimitive;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityRanracAdapted;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityLesh;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityProjectilePullball;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.PathNavigateClimberStatus;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityRanrac
extends EntityPPrimitive {
    private static final DataParameter<Integer> TARGET_ENTITY = EntityDataManager.createKey(EntityRanrac.class, (DataSerializer)DataSerializers.VARINT);
    private EntityLivingBase targetedEntity;
    private int pulling;
    private boolean canPull;
    private boolean leapTo;
    private static final DataParameter<Byte> CLIMBING = EntityDataManager.createKey(EntityRanrac.class, (DataSerializer)DataSerializers.BYTE);
    private int border;
    private boolean skillpulling;

    public EntityRanrac(World worldIn) {
        super(worldIn);
        this.setSize(0.9f, 2.7f);
        this.stepHeight = 1.0f;
        this.canPull = true;
    }

    @Override
    public int getParasiteIDRegister() {
        return 38;
    }

    protected void initEntityAI() {
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimmingDiving((EntityLiving)this, 0.095));
        this.tasks.addTask(2, (EntityAIBase)new EntityAISkill(this, 10, 300, 7, true, 1));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIWaterLeapAtTargetStatus(this, 0.7f, 1.5, 3, 20, 0));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIAttackMeleeStatus(this, 1.3, false, 8.0));
        this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.tasks.addTask(6, (EntityAIBase)new EntityAIGetFollowers(this, 2, 16));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIEvade(this, 55, 10, 4));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.RANRAC_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.RANRAC_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.33);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(SRPAttributes.RANRAC_KD_RESISTANCE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.RANRAC_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.primitiveFollow);
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(TARGET_ENTITY, (Object)0);
        this.dataManager.register(CLIMBING, (Object)0);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (!this.world.isRemote && this.ticksExisted % 20 == 0 && this.killcount > SRPConfig.adaptedKills && ParasiteEventEntity.canSpawnNext) {
            ParasiteEventEntity.spawnNext(this, new EntityRanracAdapted(this.world), true, true);
        }
        if (!this.world.isRemote) {
            if (!this.canPull) {
                --this.pulling;
                if (this.pulling == 0) {
                    this.canPull = true;
                }
            }
            if (this.getAttackTarget() != null) {
                if (!this.getAttackTarget().isEntityAlive()) {
                    this.setAttackTarget(null);
                    this.setTargetedEntity(0);
                    this.setParasiteStatus(0);
                } else if (this.canEntityBeSeen((Entity)this.getAttackTarget()) && this.getDistanceSq((Entity)this.getAttackTarget()) > 36.0 && this.canPull) {
                    ++this.pulling;
                    if (this.pulling > 140) {
                        this.setParasiteStatus(2);
                        this.setTargetedEntity(0);
                        this.canPull = false;
                    }
                } else {
                    if (this.leapTo) {
                        int i = this.getRNG().nextInt(2) == 0 ? 1 : -1;
                        this.moveStrafing = i;
                        double dd0 = this.getAttackTarget().posX - this.posX;
                        double dd1 = this.getAttackTarget().posZ - this.posZ;
                        float f = MathHelper.sqrt((double)(dd0 * dd0 + dd1 * dd1));
                        this.motionX += dd0 / (double)f * 2.77 * (double)0.8f + this.motionX * (double)0.2f;
                        this.motionZ += dd1 / (double)f * 2.77 * (double)0.8f + this.motionZ * (double)0.2f;
                        this.motionY = 0.2 + (double)this.height * 0.1;
                        this.getNavigator().clearPath();
                        this.leapTo = false;
                        this.pulling += 20;
                        this.canPull = false;
                    }
                    this.setParasiteStatus(2);
                    this.setTargetedEntity(0);
                }
            } else {
                this.setParasiteStatus(0);
                this.setTargetedEntity(0);
            }
        }
        if (this.getTargetedEntity() != null && this.getDistanceSq((Entity)this.getTargetedEntity()) > 36.0) {
            EntityLivingBase target = this.getTargetedEntity();
            target.dismountRidingEntity();
            double str = 0.4;
            target.motionX += (Math.signum(this.posX - target.posX) * str - target.motionX) * str;
            target.motionZ += (Math.signum(this.posZ - target.posZ) * str - target.motionZ) * str;
            str = 0.012;
            if (target.posY > this.posY + 1.0) {
                target.motionY -= (Math.signum(this.posY - target.posY) * str - target.motionY) * str;
            } else if (target.posY < this.posY) {
                target.motionY += (Math.signum(this.posY - target.posY) * str - target.motionY) * str;
            }
        }
        if (!this.world.isRemote) {
            this.setBesideClimbableBlock(this.collidedHorizontally);
        }
    }

    @Override
    protected void collideWithEntity(Entity entityIn) {
        super.collideWithEntity(entityIn);
        if (this.world.isRemote) {
            return;
        }
        if (entityIn instanceof EntityLivingBase && !(entityIn instanceof EntityParasiteBase) && this.getSkin() == 5) {
            SRPPotions.applyStackPotion(SRPPotions.VIRA_E, (EntityLivingBase)entityIn, 40, 0);
        }
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

    public void setTargetedEntity(int entityId) {
        if (!this.canPull && entityId != 0) {
            return;
        }
        this.leapTo = entityId != 0;
        this.dataManager.set(TARGET_ENTITY, (Object)entityId);
    }

    public boolean hasTargetedEntity() {
        if (!this.canPull) {
            return false;
        }
        return (Integer)this.dataManager.get(TARGET_ENTITY) != 0;
    }

    @Nullable
    public EntityLivingBase getTargetedEntity() {
        if (!this.hasTargetedEntity()) {
            return null;
        }
        if (this.world.isRemote) {
            if (this.targetedEntity != null) {
                return this.targetedEntity;
            }
            Entity entity = this.world.getEntityByID(((Integer)this.dataManager.get(TARGET_ENTITY)).intValue());
            if (entity instanceof EntityLivingBase) {
                this.targetedEntity = (EntityLivingBase)entity;
                return this.targetedEntity;
            }
            return null;
        }
        return this.getAttackTarget();
    }

    public void notifyDataManagerChange(DataParameter<?> key) {
        super.notifyDataManagerChange(key);
        if (TARGET_ENTITY.equals(key)) {
            this.targetedEntity = null;
        }
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        boolean flag = super.attackEntityAsMob(entityIn);
        if (flag) {
            if (entityIn instanceof EntityLivingBase) {
                switch (this.getSkin()) {
                    case 5: {
                        SRPPotions.applyStackPotion(SRPPotions.VIRA_E, (EntityLivingBase)entityIn, 40, 0);
                        break;
                    }
                    case 6: {
                        SRPPotions.applyStackPotion(SRPPotions.BLEED_E, (EntityLivingBase)entityIn, 40, 0);
                    }
                }
            }
            this.canPull = false;
            this.pulling = 80;
        }
        return flag;
    }

    public float getEyeHeight() {
        return 1.5f;
    }

    @Override
    public void onDeath(DamageSource cause) {
        if (!this.world.isRemote) {
            if (SRPConfigWorld.coloniesActivated || this.canChangeVariant) {
                if (ParasiteEventWorld.numberofColonies(this.world) >= 1 || this.canChangeVariant) {
                    ParasiteEventEntity.checkColony(this.world, cause, this);
                    ParasiteEventEntity.spawnNext(this, new EntityLesh(this.world), true, false);
                } else {
                    super.onDeath(cause);
                }
            } else {
                super.onDeath(cause);
            }
        }
    }

    public static void registerFixesBano(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityRanrac.class);
    }

    @Override
    public void onKillEntity(EntityLivingBase entityLivingIn) {
        super.onKillEntity(entityLivingIn);
        this.particleStatus((byte)5);
        if (!this.world.isRemote && this.killcount > SRPConfig.adaptedKills && ParasiteEventEntity.canSpawnNext) {
            ParasiteEventEntity.spawnNext(this, new EntityRanracAdapted(this.world), true, true);
        }
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag) {
            ParasiteEventEntity.orbApplyEffects(in, this, SRPConfigMobs.arachnidaOrbEffects, mobs);
        }
        return flag;
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        IEntityLivingData floo = super.onInitialSpawn(difficulty, livingdata);
        if (this.rand.nextDouble() < SRPConfig.variantChance || this.phaseCreated >= SRPConfigSystems.evolutionParasiteAlwaysVariant || this.canChangeVariant) {
            switch (this.rand.nextInt(3)) {
                case 0: {
                    this.setSkin(5);
                    break;
                }
                case 1: {
                    this.setSkin(6);
                    break;
                }
                case 2: {
                    this.setSkin(7);
                }
            }
        }
        return floo;
    }

    @Override
    public boolean getFinished(byte attID) {
        switch (attID) {
            case 1: {
                return this.skillpulling;
            }
        }
        return super.getFinished(attID);
    }

    @Override
    public void setFinished(byte attID, boolean in) {
        switch (attID) {
            case 1: {
                this.skillpulling = in;
                return;
            }
        }
        super.setFinished(attID, in);
    }

    @Override
    public void doSpecialSkill(byte id) {
        switch (id) {
            case 1: {
                this.pullingE();
                return;
            }
        }
        super.doSpecialSkill(id);
    }

    private void pullingE() {
        if (!this.onGround || !this.canPull) {
            this.skillpulling = true;
            this.setParasiteStatus(0);
            this.border = 0;
            return;
        }
        if (this.hasTargetedEntity()) {
            this.skillpulling = true;
            this.border = 0;
            return;
        }
        this.setParasiteStatus(11);
        this.getNavigator().clearPath();
        if (this.border == 0) {
            // empty if block
        }
        if (this.border <= 2) {
            // empty if block
        }
        if (this.ticksExisted % 20 != 0) {
            return;
        }
        ++this.border;
        if (this.getAttackTarget() == null) {
            this.skillpulling = true;
            this.setParasiteStatus(0);
            this.border = 0;
            return;
        }
        if (!this.canEntityBeSeen((Entity)this.getAttackTarget())) {
            this.skillpulling = true;
            this.setParasiteStatus(0);
            this.border = 0;
            return;
        }
        EntityLivingBase entitylivingbase = this.getAttackTarget();
        Vec3d vec3d = this.getLook(1.0f);
        double d2 = entitylivingbase.posX - (this.posX + vec3d.x);
        double d3 = entitylivingbase.getEntityBoundingBox().maxY + (double)(entitylivingbase.height + 0.8f) - (0.5 + this.posY + (double)(this.height / 1.0f));
        double d4 = entitylivingbase.posZ - (this.posZ + vec3d.z);
        EntityProjectilePullball entitylargefireball = new EntityProjectilePullball(this.world, (EntityLivingBase)this, d2, d3, d4, 1);
        entitylargefireball.posX = this.posX + vec3d.x;
        entitylargefireball.posY = this.posY + (double)this.getEyeHeight() - 0.2;
        entitylargefireball.posZ = this.posZ + vec3d.z;
        this.world.spawnEntity((Entity)entitylargefireball);
        if (this.border > 5) {
            this.skillpulling = true;
            this.setParasiteStatus(0);
            this.border = 0;
            this.pulling = 60;
        }
    }

    public void resetPullSkill() {
        this.skillpulling = true;
        this.border = 0;
    }
}

