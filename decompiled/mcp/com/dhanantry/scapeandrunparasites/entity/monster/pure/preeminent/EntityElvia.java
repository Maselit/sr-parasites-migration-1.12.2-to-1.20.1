/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.MoverType
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityAILookIdle
 *  net.minecraft.entity.ai.EntityMoveHelper
 *  net.minecraft.entity.ai.EntityMoveHelper$Action
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.entity.projectile.EntityFireball
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.pure.preeminent;

import com.dhanantry.scapeandrunparasites.entity.EntityDamage;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackProjectile;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIFlightAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIFlightLimits;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanShoot;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPPreeminent;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityProjectileElviaBall;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityProjectileNade;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntityElvia
extends EntityPPreeminent
implements EntityCanShoot {
    protected static final DataParameter<Byte> VEX_FLAGS = EntityDataManager.createKey(EntityElvia.class, (DataSerializer)DataSerializers.BYTE);
    private int timer = 0;
    private boolean camu;
    private int count;

    public EntityElvia(World worldIn) {
        super(worldIn);
        this.setSize(4.0f, 4.0f);
        this.moveHelper = new AIMoveControl(this);
        this.setNoGravity(true);
        this.tasks.removeTask((EntityAIBase)this.aiWander);
        this.adaptationCap = 0.95f;
        this.ignoreFrustumCheck = true;
    }

    @Override
    public int getParasiteIDRegister() {
        return 85;
    }

    protected void initEntityAI() {
        super.initEntityAI();
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIFlightAttack(this, SRPConfig.preeminentFollow, true, 3));
        this.tasks.addTask(5, (EntityAIBase)new EntityAIAttackProjectile(this, 20, 10, 4, true));
        this.tasks.addTask(4, (EntityAIBase)new AIChargeAttack());
        this.tasks.addTask(6, (EntityAIBase)new AIMoveRandom());
        this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIFlightLimits(this, 10, false));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIFlightLimits(this, 30, true));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.ELVIA_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.ELVIA_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(2.0);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.preeminentFollow);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (!this.world.isRemote) {
            if (this.onGround) {
                this.moveHelper.setMoveTo(this.posX, this.posY + 5.0, this.posZ, 0.5);
            }
            if (this.srpTicks == 10) {
                if (this.getAttackTarget() != null) {
                    for (EntityLivingBase entitylivingbase : this.world.getEntitiesWithinAABB(EntityLivingBase.class, this.getEntityBoundingBox().grow(3.0, 3.0, 3.0))) {
                        if (entitylivingbase == this || entitylivingbase instanceof EntityParasiteBase) continue;
                        float f = (float)MathHelper.atan2((double)(entitylivingbase.posZ - this.posZ), (double)(entitylivingbase.posX - this.posX));
                        EntityDamage damage = new EntityDamage(this.world, entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, f, (EntityLivingBase)this, 1.0f, false, 2.5f);
                        this.world.spawnEntity((Entity)damage);
                    }
                }
                if ((this.world.getBlockState(this.getPosition().down(1)).getBlock() != Blocks.AIR || this.world.getBlockState(this.getPosition().down(2)).getBlock() != Blocks.AIR) && this.getAttackTarget() != null) {
                    this.motionY = 0.5;
                }
                float currentH = this.getHealth() / this.getMaxHealth();
                if (this.getSSS()) {
                    this.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 25, 1, false, false));
                    if ((double)currentH < SRPConfigMobs.elvianeededhealth) {
                        this.setSSS(false);
                    }
                } else if ((double)currentH >= SRPConfigMobs.elvianeededhealth) {
                    ++this.timer;
                    if (this.timer > 2) {
                        this.setSSS(true);
                        this.particleStatus((byte)6);
                        this.timer = 0;
                    }
                }
            }
        }
    }

    public boolean getSSS() {
        return this.camu;
    }

    public void setSSS(boolean in) {
        this.camu = in;
    }

    @Override
    protected boolean summonFlam(EntityLivingBase in) {
        boolean flag = super.summonFlam(in);
        return flag;
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        this.setSSS(false);
        this.timer = 0;
        return super.attackEntityFrom(source, amount);
    }

    public void onUpdate() {
        super.onUpdate();
        this.setNoGravity(true);
    }

    @Override
    protected void updateAITasks() {
        super.updateAITasks();
    }

    public void addTrackingPlayer(EntityPlayerMP player) {
    }

    public int getHorizontalFaceSpeed() {
        return 3;
    }

    public float getEyeHeight() {
        return 2.1f;
    }

    protected SoundEvent getAmbientSound() {
        if (this.getParasiteStatus() != 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.ELVIA_GROWL;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        if (this.rand.nextBoolean() && this.getHitStatus() > 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.ELVIA_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SRPSounds.ELVIA_DEATH;
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag) {
            ParasiteEventEntity.orbApplyEffects(in, this, SRPConfigMobs.elviaOrbEffects, mobs);
        }
        return flag;
    }

    protected float getSoundVolume() {
        return 5.0f;
    }

    public static void registerFixesOronco(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityElvia.class);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
    }

    @Override
    public void fall(float distance, float damageMultiplier) {
    }

    public boolean isOnLadder() {
        return false;
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

    public static void registerFixesButhol(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityElvia.class);
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

    public boolean isCharging() {
        return this.getVexFlag(1);
    }

    public void setCharging(boolean charging) {
        this.setVexFlag(1, charging);
    }

    public EntityFireball getProj(double accelX, double accelY, double accelZ) {
        this.setSSS(false);
        this.timer = 0;
        if (this.count >= 1) {
            this.count = 0;
            return new EntityProjectileNade(this.world, (EntityLivingBase)this, accelX, accelY, accelZ, 4, 60);
        }
        return new EntityProjectileElviaBall(this.world, (EntityLivingBase)this, accelX, accelY, accelZ);
    }

    @Override
    public void playProjSound() {
        ++this.count;
        this.setSSS(false);
        this.timer = 0;
    }

    class AIBomb
    extends EntityAIBase {
        private final EntityLiving parent;
        private int ccc;

        public AIBomb(EntityLiving parentIn) {
            this.parent = parentIn;
            this.ccc = 0;
        }

        public boolean shouldExecute() {
            ++this.ccc;
            if (this.ccc >= 100) {
                EntityLivingBase target;
                this.ccc = 0;
                if (this.parent.getAttackTarget() != null && (target = this.parent.getAttackTarget()).getDistanceSq(this.parent.posX, target.posY, this.parent.posZ) < 256.0) {
                    return true;
                }
            }
            return false;
        }

        public void updateTask() {
        }
    }

    class AIChargeAttack
    extends EntityAIBase {
        public AIChargeAttack() {
            this.setMutexBits(1);
        }

        public boolean shouldExecute() {
            if (EntityElvia.this.getAttackTarget() != null && EntityElvia.this.rand.nextInt(5) == 0) {
                return EntityElvia.this.getDistanceSq((Entity)EntityElvia.this.getAttackTarget()) > 4.0;
            }
            return false;
        }

        public boolean shouldContinueExecuting() {
            return EntityElvia.this.getMoveHelper().isUpdating() && EntityElvia.this.isCharging() && EntityElvia.this.getAttackTarget() != null && EntityElvia.this.getAttackTarget().isEntityAlive();
        }

        public void startExecuting() {
            EntityLivingBase entitylivingbase = EntityElvia.this.getAttackTarget();
            Vec3d vec3d = entitylivingbase.getPositionEyes(1.0f);
            EntityElvia.this.moveHelper.setMoveTo(vec3d.x, entitylivingbase.posY + 20.0, vec3d.z, 0.7);
            EntityElvia.this.setCharging(true);
        }

        public void resetTask() {
            EntityElvia.this.setCharging(false);
        }

        public void updateTask() {
            EntityLivingBase entitylivingbase = EntityElvia.this.getAttackTarget();
            if (entitylivingbase != null && entitylivingbase.isEntityAlive()) {
                if (EntityElvia.this.getEntityBoundingBox().intersects(entitylivingbase.getEntityBoundingBox())) {
                    EntityElvia.this.attackEntityAsMob((Entity)entitylivingbase);
                    EntityElvia.this.setCharging(false);
                } else {
                    double d0 = EntityElvia.this.getDistanceSq((Entity)entitylivingbase);
                    if (d0 < 9.0) {
                        if (EntityElvia.this.canEntityBeSeen((Entity)entitylivingbase)) {
                            Vec3d vec3d = entitylivingbase.getPositionEyes(1.0f);
                            EntityElvia.this.moveHelper.setMoveTo(vec3d.x, vec3d.y + 20.0, vec3d.z, 0.7);
                        } else {
                            Vec3d vec3d = entitylivingbase.getPositionEyes(1.0f);
                            EntityElvia.this.moveHelper.setMoveTo(vec3d.x, vec3d.y, vec3d.z, 1.1);
                        }
                    } else {
                        Vec3d vec3d = entitylivingbase.getPositionEyes(1.0f);
                        EntityElvia.this.moveHelper.setMoveTo(vec3d.x, entitylivingbase.posY + 20.0, vec3d.z, 1.1);
                    }
                }
            }
        }
    }

    class AIMoveRandom
    extends EntityAIBase {
        public AIMoveRandom() {
            this.setMutexBits(1);
        }

        public boolean shouldExecute() {
            return !EntityElvia.this.getMoveHelper().isUpdating() && EntityElvia.this.rand.nextInt(7) == 0;
        }

        public boolean shouldContinueExecuting() {
            return false;
        }

        public void updateTask() {
            BlockPos blockpos = new BlockPos((Entity)EntityElvia.this);
            int flag = 1;
            double speed = 0.6;
            if (EntityElvia.this.getAttackTarget() != null) {
                if (EntityElvia.this.getDistanceSq((Entity)EntityElvia.this.getAttackTarget()) > 100.0) {
                    blockpos = new BlockPos((Entity)EntityElvia.this.getAttackTarget());
                    flag = 2;
                    speed += 0.1;
                } else if (EntityElvia.this.getDistanceSq((Entity)EntityElvia.this.getAttackTarget()) < 36.0) {
                    blockpos = new BlockPos((Entity)EntityElvia.this.getAttackTarget());
                    flag = 3;
                    speed += 0.15;
                }
            }
            for (int i = 0; i < 3; ++i) {
                BlockPos blockpos1 = blockpos.add(EntityElvia.this.rand.nextInt(15) - 7, EntityElvia.this.rand.nextInt(11) - 5, EntityElvia.this.rand.nextInt(15) - 7);
                if (flag == 2) {
                    blockpos1 = blockpos.add(EntityElvia.this.rand.nextInt(6) - 2, EntityElvia.this.rand.nextInt(7) - 2, EntityElvia.this.rand.nextInt(6) - 2);
                } else if (flag == 3) {
                    blockpos1 = blockpos.add(EntityElvia.this.rand.nextInt(4) + 3, EntityElvia.this.rand.nextInt(5) + 4, EntityElvia.this.rand.nextInt(4) + 3);
                }
                if (!EntityElvia.this.world.isAirBlock(blockpos1)) continue;
                EntityElvia.this.moveHelper.setMoveTo((double)blockpos1.getX() + 0.5, (double)blockpos1.getY() + 1.0, (double)blockpos1.getZ() + 0.5, speed);
                if (EntityElvia.this.getAttackTarget() != null) break;
                EntityElvia.this.getLookHelper().setLookPosition((double)blockpos1.getX() + 0.5, (double)blockpos1.getY() + 1.0, (double)blockpos1.getZ() + 0.5, 180.0f, 20.0f);
                break;
            }
        }
    }

    class AIMoveControl
    extends EntityMoveHelper {
        public AIMoveControl(EntityElvia vex) {
            super((EntityLiving)vex);
        }

        public void onUpdateMoveHelper() {
            if (this.action == EntityMoveHelper.Action.MOVE_TO) {
                double d0 = this.posX - EntityElvia.this.posX;
                double d1 = this.posY - EntityElvia.this.posY;
                double d2 = this.posZ - EntityElvia.this.posZ;
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                if ((d3 = (double)MathHelper.sqrt((double)d3)) < EntityElvia.this.getEntityBoundingBox().getAverageEdgeLength()) {
                    this.action = EntityMoveHelper.Action.WAIT;
                    EntityElvia.this.motionX *= 0.5;
                    EntityElvia.this.motionY *= 0.5;
                    EntityElvia.this.motionZ *= 0.5;
                } else {
                    EntityElvia.this.motionX += d0 / d3 * 0.05 * this.speed;
                    EntityElvia.this.motionY += d1 / d3 * 0.05 * this.speed;
                    EntityElvia.this.motionZ += d2 / d3 * 0.05 * this.speed;
                    if (EntityElvia.this.getAttackTarget() == null) {
                        EntityElvia.this.renderYawOffset = EntityElvia.this.rotationYaw = -((float)MathHelper.atan2((double)EntityElvia.this.motionX, (double)EntityElvia.this.motionZ)) * 57.295776f;
                    } else {
                        double d4 = EntityElvia.this.getAttackTarget().posX - EntityElvia.this.posX;
                        double d5 = EntityElvia.this.getAttackTarget().posZ - EntityElvia.this.posZ;
                        EntityElvia.this.renderYawOffset = EntityElvia.this.rotationYaw = -((float)MathHelper.atan2((double)d4, (double)d5)) * 57.295776f;
                    }
                }
            }
        }
    }
}

