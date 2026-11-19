/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
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
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.adapted;

import com.dhanantry.scapeandrunparasites.entity.EntityBody;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIBlockResidue;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIEvade;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIGetFollowers;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISkill;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISwimmingDiving;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIWaterLeapAtTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityBodyParts;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPAdapted;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityRanrac;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityProjectilePullball;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.PathNavigateClimberStatus;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
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
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityRanracAdapted
extends EntityPAdapted
implements EntityBodyParts {
    private static final DataParameter<Integer> TARGET_ENTITY = EntityDataManager.func_187226_a(EntityRanracAdapted.class, (DataSerializer)DataSerializers.field_187192_b);
    private EntityLivingBase targetedEntity;
    private EntityBody head;
    private int pulling;
    private boolean canPull;
    private boolean leapTo;
    private static final DataParameter<Byte> CLIMBING = EntityDataManager.func_187226_a(EntityRanracAdapted.class, (DataSerializer)DataSerializers.field_187191_a);
    private int border;
    private boolean skillpulling;

    public EntityRanracAdapted(World worldIn) {
        super(worldIn);
        this.func_70105_a(1.901f, 2.85f);
        this.field_70138_W = 1.0f;
        this.head = new EntityBody(this, 1.8f, 1.7f, 2.0f, 2.0f, 1.7f, 1, 1, false, 0.2f);
        this.field_70158_ak = true;
        this.canPull = true;
    }

    @Override
    public int getParasiteIDRegister() {
        return 58;
    }

    protected void func_184651_r() {
        this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimmingDiving((EntityLiving)this, 0.11));
        this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAISkill(this, 10, 300, 7, true, 1));
        this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWaterLeapAtTargetStatus(this, 0.7f, 1.5, 3, 20, 0));
        this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIAttackMeleeStatus(this, 1.3, false, 8.0));
        if (SRPConfig.parasiteGenResidue) {
            this.field_70714_bg.func_75776_a(9, (EntityAIBase)new EntityAIBlockResidue(this, 2));
        }
        this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIGetFollowers(this, 3, 32));
        this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIEvade(this, 25, 10, 4));
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.field_70180_af.func_187214_a(TARGET_ENTITY, (Object)0);
        this.field_70180_af.func_187214_a(CLIMBING, (Object)0);
    }

    protected void func_110147_ax() {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(SRPAttributes.RANRAC_HEALTH + SRPAttributes.RANRAC_A_HEALTH);
        this.func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(SRPAttributes.RANRAC_ARMOR + SRPAttributes.RANRAC_A_ARMOR);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.33);
        this.func_110148_a(SharedMonsterAttributes.field_111266_c).func_111128_a(SRPAttributes.RANRAC_KD_RESISTANCE + SRPAttributes.RANRAC_A_KD_RESISTANCE);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(SRPAttributes.RANRAC_ATTACK_DAMAGE + SRPAttributes.RANRAC_A_ATTACK_DAMAGE);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(SRPConfig.adaptedFollow);
    }

    @Override
    public void func_70636_d() {
        super.func_70636_d();
        this.head.func_70071_h_();
        if (!this.field_70170_p.field_72995_K) {
            if (!this.canPull) {
                --this.pulling;
                if (this.pulling == 0) {
                    this.canPull = true;
                }
            }
            if (this.func_70638_az() != null) {
                if (!this.func_70638_az().func_70089_S()) {
                    this.func_70624_b(null);
                    this.setTargetedEntity(0);
                    this.setParasiteStatus(0);
                } else if (this.func_70685_l((Entity)this.func_70638_az()) && this.func_70068_e((Entity)this.func_70638_az()) > 36.0 && this.canPull) {
                    ++this.pulling;
                    if (this.pulling > 140) {
                        this.setParasiteStatus(2);
                        this.setTargetedEntity(0);
                        this.canPull = false;
                    }
                } else {
                    if (this.leapTo) {
                        int i = this.func_70681_au().nextInt(2) == 0 ? 1 : -1;
                        this.field_70702_br = i;
                        double dd0 = this.func_70638_az().field_70165_t - this.field_70165_t;
                        double dd1 = this.func_70638_az().field_70161_v - this.field_70161_v;
                        float f = MathHelper.func_76133_a((double)(dd0 * dd0 + dd1 * dd1));
                        this.field_70159_w += dd0 / (double)f * 2.77 * (double)0.8f + this.field_70159_w * (double)0.2f;
                        this.field_70179_y += dd1 / (double)f * 2.77 * (double)0.8f + this.field_70179_y * (double)0.2f;
                        this.field_70181_x = 0.2 + (double)this.field_70131_O * 0.1;
                        this.func_70661_as().func_75499_g();
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
        if (this.getTargetedEntity() != null && this.func_70068_e((Entity)this.getTargetedEntity()) > 36.0) {
            EntityLivingBase target = this.getTargetedEntity();
            target.func_184210_p();
            double str = 0.6;
            target.field_70159_w += (Math.signum(this.field_70165_t - target.field_70165_t) * str - target.field_70159_w) * str;
            target.field_70179_y += (Math.signum(this.field_70161_v - target.field_70161_v) * str - target.field_70179_y) * str;
            str = 0.015;
            if (target.field_70163_u > this.field_70163_u + 1.0) {
                target.field_70181_x -= (Math.signum(this.field_70163_u - target.field_70163_u) * str - target.field_70181_x) * str;
            } else if (target.field_70163_u < this.field_70163_u) {
                target.field_70181_x += (Math.signum(this.field_70163_u - target.field_70163_u) * str - target.field_70181_x) * str;
            }
        }
        if (!this.field_70170_p.field_72995_K) {
            this.setBesideClimbableBlock(this.field_70123_F);
        }
    }

    public boolean isBesideClimbableBlock() {
        return ((Byte)this.field_70180_af.func_187225_a(CLIMBING) & 1) != 0;
    }

    public void setBesideClimbableBlock(boolean climbing) {
        byte b0 = (Byte)this.field_70180_af.func_187225_a(CLIMBING);
        if (this.func_70638_az() != null) {
            if (!this.func_70685_l((Entity)this.func_70638_az())) {
                if (this.func_70068_e((Entity)this.func_70638_az()) < 100.0) {
                    b0 = (byte)(b0 & 0xFFFFFFFE);
                    this.field_70180_af.func_187227_b(CLIMBING, (Object)b0);
                    return;
                }
            } else if (this.func_70638_az().field_70163_u + 1.0 < this.field_70163_u) {
                b0 = (byte)(b0 & 0xFFFFFFFE);
                this.field_70180_af.func_187227_b(CLIMBING, (Object)b0);
                return;
            }
        }
        b0 = climbing ? (byte)(b0 | 1) : (byte)(b0 & 0xFFFFFFFE);
        this.field_70180_af.func_187227_b(CLIMBING, (Object)b0);
    }

    public boolean func_70617_f_() {
        return this.isBesideClimbableBlock();
    }

    protected PathNavigate func_175447_b(World worldIn) {
        return new PathNavigateClimberStatus((EntityLiving)this, worldIn);
    }

    public void setTargetedEntity(int entityId) {
        if (!this.canPull && entityId != 0) {
            return;
        }
        this.leapTo = entityId != 0;
        this.field_70180_af.func_187227_b(TARGET_ENTITY, (Object)entityId);
    }

    public boolean hasTargetedEntity() {
        if (!this.canPull) {
            return false;
        }
        return (Integer)this.field_70180_af.func_187225_a(TARGET_ENTITY) != 0;
    }

    @Nullable
    public EntityLivingBase getTargetedEntity() {
        if (!this.hasTargetedEntity()) {
            return null;
        }
        if (this.field_70170_p.field_72995_K) {
            if (this.targetedEntity != null) {
                return this.targetedEntity;
            }
            Entity entity = this.field_70170_p.func_73045_a(((Integer)this.field_70180_af.func_187225_a(TARGET_ENTITY)).intValue());
            if (entity instanceof EntityLivingBase) {
                this.targetedEntity = (EntityLivingBase)entity;
                return this.targetedEntity;
            }
            return null;
        }
        return this.func_70638_az();
    }

    public void func_184206_a(DataParameter<?> key) {
        super.func_184206_a(key);
        if (TARGET_ENTITY.equals(key)) {
            this.targetedEntity = null;
        }
    }

    @Override
    public boolean attackEntityBodyFrom(DamageSource source, float amount, int id, boolean notify) {
        if (this.field_70146_Z.nextBoolean()) {
            SRPPotions.applyStackPotion(SRPPotions.BLEED_E, (EntityLivingBase)this, 80, 0);
        }
        return this.func_70097_a(source, amount * 3.0f);
    }

    @Override
    public boolean func_70652_k(Entity entityIn) {
        boolean flag = super.func_70652_k(entityIn);
        if (flag) {
            if (entityIn instanceof EntityLivingBase) {
                switch (this.getSkin()) {
                    case 5: {
                        SRPPotions.applyStackPotion(SRPPotions.VIRA_E, (EntityLivingBase)entityIn, 100, 0);
                        break;
                    }
                    case 6: {
                        SRPPotions.applyStackPotion(SRPPotions.BLEED_E, (EntityLivingBase)entityIn, 100, 0);
                    }
                }
            }
            this.canPull = false;
            this.pulling = 80;
        }
        return flag;
    }

    @Override
    public void setBodyPartDead(int id) {
    }

    @Override
    protected void func_82167_n(Entity entityIn) {
        super.func_82167_n(entityIn);
        if (this.field_70170_p.field_72995_K) {
            return;
        }
        if (entityIn instanceof EntityLivingBase && !(entityIn instanceof EntityParasiteBase) && this.getSkin() == 5) {
            SRPPotions.applyStackPotion(SRPPotions.VIRA_E, (EntityLivingBase)entityIn, 100, 0);
        }
    }

    public float func_70047_e() {
        return 1.5f;
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag) {
            ParasiteEventEntity.orbApplyEffects(in, this, SRPConfigMobs.arachnidaadaptedOrbEffects, mobs);
        }
        return flag;
    }

    @Override
    public void func_70645_a(DamageSource cause) {
        if (!this.field_70170_p.field_72995_K) {
            if (SRPConfigWorld.coloniesActivated || this.canChangeVariant) {
                if (ParasiteEventWorld.numberofColonies(this.field_70170_p) >= 1 || this.canChangeVariant) {
                    ParasiteEventEntity.checkColony(this.field_70170_p, cause, this);
                    ParasiteEventEntity.spawnNext(this, new EntityRanrac(this.field_70170_p), true, false);
                } else {
                    super.func_70645_a(cause);
                }
            } else {
                super.func_70645_a(cause);
            }
        }
    }

    @Override
    public IEntityLivingData func_180482_a(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        IEntityLivingData floo = super.func_180482_a(difficulty, livingdata);
        if (this.field_70146_Z.nextDouble() < SRPConfig.variantChance || this.phaseCreated >= SRPConfigSystems.evolutionParasiteAlwaysVariant || this.canChangeVariant) {
            switch (this.field_70146_Z.nextInt(3)) {
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

    public void func_70106_y() {
        if (this.head != null) {
            this.field_70170_p.func_72973_f((Entity)this.head);
        }
        super.func_70106_y();
    }

    public static void registerFixesBano(DataFixer fixer) {
        EntityLiving.func_189752_a((DataFixer)fixer, EntityRanracAdapted.class);
    }

    protected SoundEvent func_184639_G() {
        if (this.getParasiteStatus() != 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.ARANRAC_GROWL;
    }

    protected SoundEvent func_184601_bQ(DamageSource damageSourceIn) {
        if (this.field_70146_Z.nextBoolean() && this.getHitStatus() > 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.ARANRAC_HURT;
    }

    protected SoundEvent func_184615_bR() {
        return SRPSounds.ARANRAC_DEATH;
    }

    protected void func_180429_a(BlockPos pos, Block blockIn) {
        this.func_184185_a(this.getStepSound(), this.func_70599_aP(), this.func_70647_i());
    }

    protected SoundEvent getStepSound() {
        return SRPSounds.ARANRAC_STEP;
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
        if (!this.field_70122_E || !this.canPull) {
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
        this.func_70661_as().func_75499_g();
        if (this.border == 0) {
            // empty if block
        }
        if (this.border <= 2) {
            // empty if block
        }
        if (this.field_70173_aa % 20 != 0) {
            return;
        }
        ++this.border;
        if (this.func_70638_az() == null) {
            this.skillpulling = true;
            this.setParasiteStatus(0);
            this.border = 0;
            return;
        }
        if (!this.func_70685_l((Entity)this.func_70638_az())) {
            this.skillpulling = true;
            this.setParasiteStatus(0);
            this.border = 0;
            return;
        }
        EntityLivingBase entitylivingbase = this.func_70638_az();
        Vec3d vec3d = this.func_70676_i(1.0f);
        double d2 = entitylivingbase.field_70165_t - (this.field_70165_t + vec3d.field_72450_a);
        double d3 = entitylivingbase.func_174813_aQ().field_72337_e + (double)(entitylivingbase.field_70131_O + 0.8f) - (0.5 + this.field_70163_u + (double)(this.field_70131_O / 1.0f));
        double d4 = entitylivingbase.field_70161_v - (this.field_70161_v + vec3d.field_72449_c);
        EntityProjectilePullball entitylargefireball = new EntityProjectilePullball(this.field_70170_p, (EntityLivingBase)this, d2, d3, d4, 2);
        entitylargefireball.field_70165_t = this.field_70165_t + vec3d.field_72450_a;
        entitylargefireball.field_70163_u = this.field_70163_u + (double)this.func_70047_e() - 0.2;
        entitylargefireball.field_70161_v = this.field_70161_v + vec3d.field_72449_c;
        this.field_70170_p.func_72838_d((Entity)entitylargefireball);
        if (this.border > 6) {
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

