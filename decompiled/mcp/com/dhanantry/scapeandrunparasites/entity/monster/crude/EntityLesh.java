/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIAttackMelee
 *  net.minecraft.entity.ai.EntityAIAvoidEntity
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAILookIdle
 *  net.minecraft.entity.ai.EntityAINearestAttackableTarget
 *  net.minecraft.entity.ai.EntityAISwimming
 *  net.minecraft.entity.monster.EntityCreeper
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.passive.EntityWaterMob
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.monster.crude;

import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIParasiteFollow;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityLesh
extends EntityParasiteBase {
    private int noLegs;
    private int noTimes;
    private float tSize;
    private float aSize;
    private int delay;
    private boolean st1;
    private float tSpeed;
    private static final DataParameter<Float> SIZE = EntityDataManager.createKey(EntityLesh.class, (DataSerializer)DataSerializers.FLOAT);

    public EntityLesh(World worldIn) {
        super(worldIn);
        this.setSize(0.7f, 0.5f);
        this.tasks.removeTask((EntityAIBase)this.folow);
        this.noLegs = (1 + this.rand.nextInt(2)) * 2;
        this.noTimes = 1;
        this.st1 = false;
        this.tSize = 1.0f;
        this.aSize = 1.0f;
        this.fuseTime = 70;
        this.killcount = -10.0;
        this.type = (byte)100;
    }

    @Override
    public int getParasiteIDRegister() {
        return 23;
    }

    protected void initEntityAI() {
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackMelee((EntityCreature)this, 1.0, false));
        this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.tasks.addTask(6, (EntityAIBase)new EntityAIParasiteFollow(this, 1.3, 10.0, 2.0, false));
        this.tasks.addTask(1, (EntityAIBase)new EntityAILeshCombine(this, 1.1));
        this.targetTasks.addTask(3, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityLesh.class, false, false));
        this.tasks.addTask(3, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityLivingBase.class, (Predicate)new Predicate<EntityLivingBase>(){

            public boolean apply(@Nullable EntityLivingBase entity) {
                return !(entity instanceof EntityWaterMob) && !(entity instanceof EntityCreeper) && !(entity instanceof EntityParasiteBase) && !(entity instanceof EntityAnimal);
            }
        }, 8.0f, 1.0, 1.0));
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(SIZE, (Object)Float.valueOf(this.tSize));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0.0);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0.0);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.0);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(SRPConfig.adaptedFollow);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.getAttackTarget() != null && this.ticksExisted % 20 == 0) {
            if (!this.getAttackTarget().isEntityAlive()) {
                this.setAttackTarget(null);
            }
            if (this.getAttackTarget() instanceof EntityLesh) {
                EntityLesh meh = (EntityLesh)this.getAttackTarget();
                if (this.getTimes() + meh.getTimes() > 4) {
                    this.setAttackTarget(null);
                }
            }
        }
        if (this.gettSize() > this.getaSize()) {
            this.setaSize(0.01f);
            this.setSize(0.7f + (this.getaSize() - 1.0f), 0.5f + (this.getaSize() - 1.0f));
        }
        if (this.getTimes() >= 4 && this.ticksExisted % 20 == 0) {
            ++this.delay;
            this.st1 = true;
        }
        if (this.delay >= 4 && this.st1) {
            this.setSelfeState(1);
        }
        if (!this.world.isRemote && !this.isDead && this.getHealth() > 0.0f && this.getHealth() < this.getMaxHealth()) {
            this.setHealth(this.getHealth() + 0.007f);
        }
    }

    public void onUpdate() {
        if (this.isEntityAlive()) {
            this.lastActiveTime = this.timeSinceIgnited;
            this.dyingBurst(false, 2);
        }
        super.onUpdate();
    }

    @Override
    protected void dyingBurst(boolean fromDeath, int value) {
        int i = this.getSelfeState();
        if (i > 0 && this.timeSinceIgnited == 0) {
            this.playSound(SRPSounds.FLESH_GROW, 10.0f, 1.0f);
        }
        this.timeSinceIgnited += i * value;
        if (this.timeSinceIgnited < 0) {
            this.timeSinceIgnited = 0;
        }
        if (this.timeSinceIgnited >= this.fuseTime) {
            this.timeSinceIgnited = this.fuseTime;
            this.selfExplode();
        }
    }

    @Override
    protected void selfExplode() {
        if (!this.world.isRemote) {
            this.dead = true;
            this.setDead();
            this.spawnPrimitive(this, this.noLegs);
            this.playSound(SRPSounds.FLESH_PRIMITIVE, 1.0f, 1.0f);
        } else {
            this.spawnParticles(SRPEnumParticle.GCLOUD, 127, 0, 0);
        }
    }

    public int getLegs() {
        return this.noLegs;
    }

    public void setLegs(int i, boolean plus) {
        if (plus) {
            this.noLegs += i;
            return;
        }
        this.noLegs = i;
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        if (!(entityIn instanceof EntityLesh)) {
            return true;
        }
        ++this.delay;
        if (this.delay >= 3) {
            EntityLesh meh = (EntityLesh)entityIn;
            if (this.getaSize() >= meh.getaSize()) {
                if (this.getCustomNameTag() == null && meh.getCustomNameTag() != null) {
                    this.setCustomNameTag(meh.getCustomNameTag());
                }
                this.setLegs(meh.getLegs(), true);
                this.setTimes(meh.getTimes());
                meh.particleStatus((byte)6);
                meh.setDead();
                this.playSound(SRPSounds.FLESH_EAT, 1.0f, 1.0f);
                this.settSize(0.3f);
                this.resetDelay();
                this.settSpeed((float)(this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getBaseValue() - 0.01));
                this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)this.tSpeed);
                this.particleStatus((byte)5);
                this.playSound(SRPSounds.FLESH_GROW, 10.0f, 1.0f);
            }
        }
        return true;
    }

    public int getTimes() {
        return this.noTimes;
    }

    public void setTimes(int in) {
        this.noTimes += in;
    }

    public float getEyeHeight() {
        return 0.3f;
    }

    public float gettSize() {
        return ((Float)this.dataManager.get(SIZE)).floatValue();
    }

    public void settSize(float in) {
        this.tSize += in;
        this.dataManager.set(SIZE, (Object)Float.valueOf(this.tSize));
    }

    public void settSpeed(float in) {
        this.tSpeed = in;
    }

    public float getaSize() {
        return this.aSize;
    }

    public void setaSize(float in) {
        this.aSize += in;
    }

    public void resetDelay() {
        this.delay = 0;
    }

    public static void registerFixesLodo(DataFixer fixer) {
        EntityLiving.registerFixesMob((DataFixer)fixer, EntityLesh.class);
    }

    protected SoundEvent getAmbientSound() {
        return SRPSounds.FLESH_GROWL;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SRPSounds.FLESH_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SRPSounds.FLESH_DEATH;
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setFloat("leshtotalsize", this.tSize);
        compound.setFloat("leshactualsize", this.aSize);
        compound.setInteger("leshlegs", this.noLegs);
        compound.setInteger("leshtimes", this.noTimes);
        compound.setFloat("leshspeed", this.tSpeed);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        if (compound.hasKey("leshtotalsize", 99)) {
            this.tSize = compound.getFloat("leshtotalsize");
            this.dataManager.set(SIZE, (Object)Float.valueOf(compound.getFloat("leshtotalsize")));
        }
        if (compound.hasKey("leshlegs", 99)) {
            this.noLegs = compound.getInteger("leshlegs");
        }
        if (compound.hasKey("leshtimes", 99)) {
            this.noTimes = compound.getInteger("leshtimes");
        }
        if (compound.hasKey("leshspeed", 99)) {
            this.tSpeed = compound.getFloat("leshspeed");
        }
    }

    @SideOnly(value=Side.CLIENT)
    public float getSelfeFlashIntensityS() {
        return this.aSize;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 4) {
            this.tSize += 0.3f;
        } else {
            super.handleStatusUpdate(id);
        }
    }

    private void spawnPrimitive(EntityLesh host, int code) {
        host.setDead();
        ParasiteEventEntity.merge(this, code, this.getCustomNameTag());
    }

    static class EntityAILeshCombine
    extends EntityAIBase {
        private final EntityLesh parent;

        public EntityAILeshCombine(EntityLesh animal, double speedIn) {
            this.parent = animal;
        }

        public boolean shouldExecute() {
            EntityLivingBase target = this.parent.getAttackTarget();
            if (target == null) {
                return true;
            }
            return !target.isEntityAlive();
        }

        public void resetTask() {
        }

        public void updateTask() {
            if (this.parent.ticksExisted % 20 != 0) {
                return;
            }
            AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.parent.posX, this.parent.posY, this.parent.posZ, this.parent.posX + 1.0, this.parent.posY + 1.0, this.parent.posZ + 1.0).grow(this.parent.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).getAttributeValue());
            List moblist = this.parent.world.getEntitiesWithinAABB(EntityLesh.class, axisalignedbb);
            for (EntityLesh mob : moblist) {
                if (mob == this.parent || !this.parent.canEntityBeSeen((Entity)mob) || !mob.isEntityAlive() || mob.getAttackingEntity() != null || mob.getTimes() + this.parent.getTimes() > 4) continue;
                this.parent.setAttackTarget((EntityLivingBase)mob);
                mob.setAttackTarget((EntityLivingBase)this.parent);
                return;
            }
        }
    }
}

