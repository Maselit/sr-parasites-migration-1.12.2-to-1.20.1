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
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.pure.preeminent;

import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIFlightAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIFlightLimits;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPPreeminent;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityBomb;
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
import net.minecraft.init.Blocks;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntityJinjo
extends EntityPPreeminent {
    protected static final DataParameter<Byte> VEX_FLAGS = EntityDataManager.createKey(EntityJinjo.class, (DataSerializer)DataSerializers.BYTE);

    public EntityJinjo(World worldIn) {
        super(worldIn);
        this.moveHelper = new AIMoveControl(this);
        this.setSize(3.7f, 4.4f);
        this.setNoGravity(true);
        if (SRPConfigMobs.ombooMaxY != 256) {
            this.tasks.addTask(3, (EntityAIBase)new EntityAIFlightLimits(this, SRPConfigMobs.ombooMaxY, true));
        }
        this.canTeleportToo = true;
        this.adaptationCap = 0.95f;
        this.ignoreFrustumCheck = true;
    }

    @Override
    public int getParasiteIDRegister() {
        return 65;
    }

    protected void initEntityAI() {
        super.initEntityAI();
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIFlightAttack(this, SRPConfig.pureFollow));
        this.tasks.addTask(4, (EntityAIBase)new AIChargeAttack());
        this.tasks.addTask(6, (EntityAIBase)new AIMoveRandom());
        this.tasks.addTask(5, (EntityAIBase)new AIBomb(this));
        this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIFlightLimits(this, 10, false));
        this.tasks.addTask(4, (EntityAIBase)new EntityAIFlightLimits(this, 25, true));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(SRPAttributes.JINJO_HEALTH);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(SRPAttributes.JINJO_ARMOR);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(SRPAttributes.JINJO_KD_RESISTANCE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(SRPAttributes.JINJO_ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.preeminentFollow);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (!this.world.isRemote) {
            if (this.onGround) {
                this.moveHelper.setMoveTo(this.posX, this.posY + 5.0, this.posZ, 0.5);
            }
            if (this.srpTicks == 10 && (this.world.getBlockState(this.getPosition().down(1)).getBlock() != Blocks.AIR || this.world.getBlockState(this.getPosition().down(2)).getBlock() != Blocks.AIR) && this.getAttackTarget() != null) {
                this.motionY = 0.5;
            }
        } else if (this.rand.nextInt(30) == 0) {
            for (int i = 0; i <= 20; ++i) {
                if (i % 5 != 0) continue;
                this.spawnParticlesGoreMouth(SRPEnumParticle.GSPLASH, 0, -1, -1, 0.2, 0.0);
            }
        }
    }

    public void onUpdate() {
        super.onUpdate();
        this.setNoGravity(true);
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag) {
            ParasiteEventEntity.orbApplyEffects(in, this, SRPConfigMobs.jinjoOrbEffects, mobs);
        }
        return flag;
    }

    @Override
    public void fall(float distance, float damageMultiplier) {
    }

    public float getEyeHeight() {
        return 2.4f;
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
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityJinjo.class);
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

    class AIBomb
    extends EntityAIBase {
        private final EntityParasiteBase parent;
        private int ccc;

        public AIBomb(EntityParasiteBase parentIn) {
            this.parent = parentIn;
            this.ccc = 0;
        }

        public boolean shouldExecute() {
            ++this.ccc;
            if (this.ccc >= 100) {
                this.ccc = 0;
                if (this.parent.getAttackTarget() != null) {
                    EntityLivingBase target = this.parent.getAttackTarget();
                    if (!target.onGround) {
                        this.ccc = 70;
                        return false;
                    }
                    if (target.getDistanceSq(this.parent.posX, target.posY, this.parent.posZ) < 256.0) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void updateTask() {
            EntityBomb out = new EntityBomb(this.parent.world, this.parent, SRPConfigMobs.jinjoGriefing);
            if (this.parent.getAttackTarget() != null) {
                boolean flag = this.parent.canEntityBeSeen((Entity)this.parent.getAttackTarget()) || this.parent.world.rand.nextInt(3) == 0;
                out.copyLocationAndAnglesFrom((Entity)this.parent);
                out.setFuse(80);
                out.setStren(flag ? 4.0f : 8.0f);
                out.setSkin(flag ? 2 : 3);
                out.setDamage((float)this.parent.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * SRPConfigMobs.jinjoExplotionMult, 7);
                this.parent.world.spawnEntity((Entity)out);
                out.updateSTR();
            }
        }
    }

    class AIChargeAttack
    extends EntityAIBase {
        public AIChargeAttack() {
            this.setMutexBits(1);
        }

        public boolean shouldExecute() {
            if (EntityJinjo.this.getAttackTarget() != null && EntityJinjo.this.rand.nextInt(5) == 0) {
                return EntityJinjo.this.getDistanceSq((Entity)EntityJinjo.this.getAttackTarget()) > 4.0;
            }
            return false;
        }

        public boolean shouldContinueExecuting() {
            return EntityJinjo.this.getMoveHelper().isUpdating() && EntityJinjo.this.isCharging() && EntityJinjo.this.getAttackTarget() != null && EntityJinjo.this.getAttackTarget().isEntityAlive();
        }

        public void startExecuting() {
            EntityLivingBase entitylivingbase = EntityJinjo.this.getAttackTarget();
            Vec3d vec3d = entitylivingbase.getPositionEyes(1.0f);
            EntityJinjo.this.moveHelper.setMoveTo(vec3d.x, entitylivingbase.posY + 20.0, vec3d.z, 0.2);
            EntityJinjo.this.setCharging(true);
        }

        public void resetTask() {
            EntityJinjo.this.setCharging(false);
        }

        public void updateTask() {
            EntityLivingBase entitylivingbase = EntityJinjo.this.getAttackTarget();
            if (entitylivingbase != null && entitylivingbase.isEntityAlive()) {
                if (EntityJinjo.this.getEntityBoundingBox().intersects(entitylivingbase.getEntityBoundingBox())) {
                    EntityJinjo.this.attackEntityAsMob((Entity)entitylivingbase);
                    EntityJinjo.this.setCharging(false);
                } else {
                    double d0 = EntityJinjo.this.getDistanceSq((Entity)entitylivingbase);
                    if (d0 < 9.0) {
                        Vec3d vec3d = entitylivingbase.getPositionEyes(1.0f);
                        EntityJinjo.this.moveHelper.setMoveTo(vec3d.x, entitylivingbase.posY + 20.0, vec3d.z, 1.0);
                    } else {
                        Vec3d vec3d = entitylivingbase.getPositionEyes(1.0f);
                        EntityJinjo.this.moveHelper.setMoveTo(vec3d.x, entitylivingbase.posY + 20.0, vec3d.z, 1.1);
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
            return !EntityJinjo.this.getMoveHelper().isUpdating() && EntityJinjo.this.rand.nextInt(7) == 0;
        }

        public boolean shouldContinueExecuting() {
            return false;
        }

        public void updateTask() {
            BlockPos blockpos = new BlockPos((Entity)EntityJinjo.this);
            int flag = 1;
            double speed = 0.1;
            if (EntityJinjo.this.getAttackTarget() != null) {
                if (EntityJinjo.this.getDistanceSq((Entity)EntityJinjo.this.getAttackTarget()) > 100.0) {
                    blockpos = new BlockPos((Entity)EntityJinjo.this.getAttackTarget());
                    flag = 2;
                    speed += 0.05;
                } else if (EntityJinjo.this.getDistanceSq((Entity)EntityJinjo.this.getAttackTarget()) < 36.0) {
                    blockpos = new BlockPos((Entity)EntityJinjo.this.getAttackTarget());
                    flag = 3;
                    speed += 0.05;
                }
            }
            for (int i = 0; i < 3; ++i) {
                BlockPos blockpos1 = blockpos.add(EntityJinjo.this.rand.nextInt(15) - 7, EntityJinjo.this.rand.nextInt(11) - 5, EntityJinjo.this.rand.nextInt(15) - 7);
                if (flag == 2) {
                    blockpos1 = blockpos.add(EntityJinjo.this.rand.nextInt(6) - 2, EntityJinjo.this.rand.nextInt(7) - 2, EntityJinjo.this.rand.nextInt(6) - 2);
                } else if (flag == 3) {
                    blockpos1 = blockpos.add(EntityJinjo.this.rand.nextInt(4) + 3, EntityJinjo.this.rand.nextInt(5) + 4, EntityJinjo.this.rand.nextInt(4) + 3);
                }
                if (!EntityJinjo.this.world.isAirBlock(blockpos1)) continue;
                EntityJinjo.this.moveHelper.setMoveTo((double)blockpos1.getX() + 0.5, (double)blockpos1.getY() + 1.0, (double)blockpos1.getZ() + 0.5, speed);
                if (EntityJinjo.this.getAttackTarget() != null) break;
                EntityJinjo.this.getLookHelper().setLookPosition((double)blockpos1.getX() + 0.5, (double)blockpos1.getY() + 1.0, (double)blockpos1.getZ() + 0.5, 180.0f, 20.0f);
                break;
            }
        }
    }

    class AIMoveControl
    extends EntityMoveHelper {
        public AIMoveControl(EntityJinjo vex) {
            super((EntityLiving)vex);
        }

        public void onUpdateMoveHelper() {
            if (this.action == EntityMoveHelper.Action.MOVE_TO) {
                double d0 = this.posX - EntityJinjo.this.posX;
                double d1 = this.posY - EntityJinjo.this.posY;
                double d2 = this.posZ - EntityJinjo.this.posZ;
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                if ((d3 = (double)MathHelper.sqrt((double)d3)) < EntityJinjo.this.getEntityBoundingBox().getAverageEdgeLength()) {
                    this.action = EntityMoveHelper.Action.WAIT;
                    EntityJinjo.this.motionX *= 0.5;
                    EntityJinjo.this.motionY *= 0.5;
                    EntityJinjo.this.motionZ *= 0.5;
                } else {
                    EntityJinjo.this.motionX += d0 / d3 * 0.05 * this.speed;
                    EntityJinjo.this.motionY += d1 / d3 * 0.05 * this.speed;
                    EntityJinjo.this.motionZ += d2 / d3 * 0.05 * this.speed;
                    if (EntityJinjo.this.getAttackTarget() == null) {
                        EntityJinjo.this.renderYawOffset = EntityJinjo.this.rotationYaw = -((float)MathHelper.atan2((double)EntityJinjo.this.motionX, (double)EntityJinjo.this.motionZ)) * 57.295776f;
                    } else {
                        double d4 = EntityJinjo.this.getAttackTarget().posX - EntityJinjo.this.posX;
                        double d5 = EntityJinjo.this.getAttackTarget().posZ - EntityJinjo.this.posZ;
                        EntityJinjo.this.renderYawOffset = EntityJinjo.this.rotationYaw = -((float)MathHelper.atan2((double)d4, (double)d5)) * 57.295776f;
                    }
                }
            }
        }
    }
}

