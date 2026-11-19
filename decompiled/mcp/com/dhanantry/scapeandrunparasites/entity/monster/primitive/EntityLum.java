/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.MoverType
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityMoveHelper
 *  net.minecraft.entity.ai.EntityMoveHelper$Action
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.pathfinding.PathNavigate
 *  net.minecraft.pathfinding.PathNavigateSwimmer
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.primitive;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeNotGround;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanFly;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCutomAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPPrimitive;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityLum
extends EntityPPrimitive
implements EntityCanFly,
EntityCutomAttack {
    protected static final DataParameter<Byte> VEX_FLAGS = EntityDataManager.createKey(EntityLum.class, (DataSerializer)DataSerializers.BYTE);

    public EntityLum(World worldIn) {
        super(worldIn);
        this.setSize(1.3f, 1.8f);
        this.moveHelper = new AIMoveControl(this);
        this.borderOrb = -1;
        this.tasks.removeTask((EntityAIBase)this.folow);
        this.tasks.removeTask((EntityAIBase)this.aiWander);
        this.ignoreFrustumCheck = true;
    }

    @Override
    public int getParasiteIDRegister() {
        return 66;
    }

    protected void initEntityAI() {
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackMeleeNotGround(this, 4.0, SRPConfig.primitiveFollow, 0.08, false, 0));
        this.tasks.addTask(6, (EntityAIBase)new AIMoveRandom());
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.LUM_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.LUM_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.LUM_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(SRPAttributes.LUM_KD_RESISTANCE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.primitiveFollow);
    }

    protected PathNavigate createNavigator(World worldIn) {
        return new PathNavigateSwimmer((EntityLiving)this, worldIn);
    }

    @Override
    public void onLivingUpdate() {
        if (this.isAIDisabled()) {
            return;
        }
        this.liquidLeap = 0;
        super.onLivingUpdate();
        if (this.inWater) {
            this.setNoGravity(true);
        } else {
            this.setNoGravity(false);
        }
        this.liquidLeap = 0;
        if (!this.world.isRemote) {
            if (this.getAttackTarget() != null) {
                this.setParasiteStatus(1);
            }
            if (this.ticksExisted % 20 == 0) {
                // empty if block
            }
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        return super.attackEntityFrom(source, amount);
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        boolean flag = super.attackEntityAsMob(entityIn);
        if (flag) {
            // empty if block
        }
        return flag;
    }

    @Override
    public boolean attackEntityAsMobAOE(Entity entityIn) {
        return this.attackEntityAsMob(entityIn);
    }

    public float getEyeHeight() {
        return 1.0f;
    }

    public static void registerFixesHull(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityLum.class);
    }

    @Override
    public void onKillEntity(EntityLivingBase entityLivingIn) {
        super.onKillEntity(entityLivingIn);
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag) {
            // empty if block
        }
        return flag;
    }

    protected SoundEvent getAmbientSound() {
        if (this.getParasiteStatus() != 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.LUM_GROWL;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        if (this.rand.nextBoolean() && this.getHitStatus() > 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.LUM_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SRPSounds.LUM_DEATH;
    }

    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public boolean getCanSpawnHere() {
        return true;
    }

    public boolean isNotColliding() {
        return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), (Entity)this);
    }

    public int getTalkInterval() {
        return 0;
    }

    @Override
    public boolean canDespawn() {
        return true;
    }

    protected int getExperiencePoints(EntityPlayer player) {
        return 1 + this.world.rand.nextInt(3);
    }

    public void onEntityUpdate() {
        int i = this.getAir();
        super.onEntityUpdate();
        if (this.isAIDisabled()) {
            return;
        }
        if (this.isEntityAlive() && !this.isInWater()) {
            this.setAir(--i);
            if (this.getAir() == -20) {
                this.setAir(0);
                this.attackEntityFrom(DamageSource.DROWN, 2.0f);
            }
        } else {
            this.setAir(300);
        }
    }

    public boolean isPushedByWater() {
        return false;
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

    public void move(MoverType type, double x, double y, double z) {
        super.move(type, x, y, z);
        this.doBlockCollisions();
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(VEX_FLAGS, (Object)0);
    }

    public static void registerFixesLum(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityLum.class);
    }

    private boolean getVexFlag(int mask) {
        byte i = (Byte)this.dataManager.get(VEX_FLAGS);
        return (i & mask) != 0;
    }

    private void setVexFlag(int mask, boolean value) {
        int i = ((Byte)this.dataManager.get(VEX_FLAGS)).byteValue();
        i = value ? (i |= mask) : (i &= ~mask);
        this.dataManager.set(VEX_FLAGS, (Object)((byte)(i & 0xFF)));
    }

    class AIMoveRandom
    extends EntityAIBase {
        public AIMoveRandom() {
            this.setMutexBits(1);
        }

        public boolean shouldExecute() {
            return EntityLum.this.rand.nextInt(7) == 0;
        }

        public boolean shouldContinueExecuting() {
            return false;
        }

        public void updateTask() {
            BlockPos blockpos = new BlockPos((Entity)EntityLum.this);
            int flag = 1;
            double speed = 0.19;
            if (EntityLum.this.getAttackTarget() != null) {
                if (EntityLum.this.getDistanceSq((Entity)EntityLum.this.getAttackTarget()) > 100.0) {
                    blockpos = new BlockPos((Entity)EntityLum.this.getAttackTarget());
                    flag = 2;
                } else if (EntityLum.this.getDistanceSq((Entity)EntityLum.this.getAttackTarget()) < 36.0) {
                    blockpos = new BlockPos((Entity)EntityLum.this.getAttackTarget());
                    flag = 3;
                }
            }
            for (int i = 0; i < 3; ++i) {
                BlockPos blockpos1 = blockpos.add(EntityLum.this.rand.nextInt(15) - 7, EntityLum.this.rand.nextInt(11) - 5, EntityLum.this.rand.nextInt(15) - 7);
                if (flag == 2) {
                    blockpos1 = blockpos.add(EntityLum.this.rand.nextInt(6) - 2, EntityLum.this.rand.nextInt(7) - 2, EntityLum.this.rand.nextInt(6) - 2);
                } else if (flag == 3) {
                    blockpos1 = blockpos.add(EntityLum.this.rand.nextInt(4) + 3, EntityLum.this.rand.nextInt(5) + 4, EntityLum.this.rand.nextInt(4) + 3);
                }
                if (EntityLum.this.world.getBlockState(blockpos1).getMaterial() != Material.WATER) continue;
                EntityLum.this.moveHelper.setMoveTo((double)blockpos1.getX() + 0.5, (double)blockpos1.getY() + 0.5, (double)blockpos1.getZ() + 0.5, speed);
                if (EntityLum.this.getAttackTarget() != null) break;
                EntityLum.this.getLookHelper().setLookPosition((double)blockpos1.getX() + 0.5, (double)blockpos1.getY() + 0.5, (double)blockpos1.getZ() + 0.5, 180.0f, 20.0f);
                break;
            }
        }
    }

    class AIMoveControl
    extends EntityMoveHelper {
        public AIMoveControl(EntityLum vex) {
            super((EntityLiving)vex);
        }

        public void onUpdateMoveHelper() {
            if (this.action == EntityMoveHelper.Action.MOVE_TO) {
                double d0 = this.posX - EntityLum.this.posX;
                double d1 = this.posY - EntityLum.this.posY;
                double d2 = this.posZ - EntityLum.this.posZ;
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                if ((d3 = (double)MathHelper.sqrt((double)d3)) < EntityLum.this.getEntityBoundingBox().getAverageEdgeLength()) {
                    this.action = EntityMoveHelper.Action.WAIT;
                    EntityLum.this.motionX *= 0.5;
                    EntityLum.this.motionY *= 0.5;
                    EntityLum.this.motionZ *= 0.5;
                } else {
                    EntityLum.this.motionX += d0 / d3 * 0.05 * this.speed;
                    EntityLum.this.motionY += d1 / d3 * 0.05 * this.speed;
                    EntityLum.this.motionZ += d2 / d3 * 0.05 * this.speed;
                    if (EntityLum.this.getAttackTarget() == null) {
                        EntityLum.this.renderYawOffset = EntityLum.this.rotationYaw = -((float)MathHelper.atan2((double)EntityLum.this.motionX, (double)EntityLum.this.motionZ)) * 57.295776f;
                    } else {
                        double d4 = EntityLum.this.getAttackTarget().posX - EntityLum.this.posX;
                        double d5 = EntityLum.this.getAttackTarget().posZ - EntityLum.this.posZ;
                        EntityLum.this.renderYawOffset = EntityLum.this.rotationYaw = -((float)MathHelper.atan2((double)d4, (double)d5)) * 57.295776f;
                    }
                }
            }
        }
    }
}

