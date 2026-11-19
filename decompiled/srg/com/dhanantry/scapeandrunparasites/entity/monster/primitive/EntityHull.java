/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.EnumCreatureAttribute
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityAILookIdle
 *  net.minecraft.init.MobEffects
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.entity.monster.primitive;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIEvade;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISwimmingDiving;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIWaterLeapAtTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPPrimitive;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityHullAdapted;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityLesh;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityHull
extends EntityPPrimitive {
    private int timer = 0;
    private static final DataParameter<Boolean> CAM = EntityDataManager.func_187226_a(EntityHull.class, (DataSerializer)DataSerializers.field_187198_h);

    public EntityHull(World worldIn) {
        super(worldIn);
        this.func_70105_a(1.3f, 1.2f);
    }

    @Override
    public int getParasiteIDRegister() {
        return 7;
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.field_70180_af.func_187214_a(CAM, (Object)false);
    }

    protected void func_184651_r() {
        this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimmingDiving((EntityLiving)this, 0.095));
        this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWaterLeapAtTargetStatus(this, 0.7f, 1.5, 3, 20, 0));
        this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIEvade(this, 40, 5, 8));
        this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIAttackMeleeStatus(this, 1.3, false, 8.0, 6));
        this.field_70714_bg.func_75776_a(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    }

    protected void func_110147_ax() {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(SRPAttributes.HULL_HEALTH);
        this.func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(SRPAttributes.HULL_ARMOR);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.35);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(SRPAttributes.HULL_ATTACK_DAMAGE);
        this.func_110148_a(SharedMonsterAttributes.field_111266_c).func_111128_a(SRPAttributes.HULL_KD_RESISTANCE);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(SRPConfig.primitiveFollow);
    }

    @Override
    public void func_70636_d() {
        super.func_70636_d();
        if (this.srpTicks == 10 && !this.field_70170_p.field_72995_K) {
            float currentH = this.func_110143_aJ() / this.func_110138_aP();
            if (this.getSSS()) {
                this.func_70690_d(new PotionEffect(MobEffects.field_76441_p, 25, 0, false, false));
                this.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 25, 2, false, false));
                if (this.field_70173_aa % 2 == 0) {
                    this.func_184185_a(SRPSounds.HULL_C, 0.2f, (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.2f + 1.0f);
                }
                if ((double)currentH < SRPConfigMobs.hullNeededHealth) {
                    this.setSSS(false);
                }
            } else if ((double)currentH >= SRPConfigMobs.hullNeededHealth) {
                ++this.timer;
                if ((float)this.timer > SRPConfigMobs.hullNeededTime) {
                    this.setSSS(true);
                    this.particleStatus((byte)6);
                    this.timer = 0;
                }
            }
        }
        if (!this.field_70170_p.field_72995_K && this.field_70173_aa % 20 == 0 && this.killcount > SRPConfig.adaptedKills && ParasiteEventEntity.canSpawnNext) {
            ParasiteEventEntity.spawnNext(this, new EntityHullAdapted(this.field_70170_p), true, true);
        }
    }

    @Override
    public boolean func_70097_a(DamageSource source, float amount) {
        this.setSSS(false);
        this.timer = 0;
        return super.func_70097_a(source, amount);
    }

    @Override
    public boolean func_70652_k(Entity entityIn) {
        boolean flag = super.func_70652_k(entityIn);
        if (flag && this.getSSS()) {
            float f = (float)this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111126_e() * SRPConfigMobs.hullStealthDamageMultiplier;
            if (entityIn instanceof EntityLivingBase) {
                f += EnchantmentHelper.func_152377_a((ItemStack)this.func_184614_ca(), (EnumCreatureAttribute)((EntityLivingBase)entityIn).func_70668_bt());
            }
            entityIn.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this), f);
            this.setSSS(false);
            this.timer = 0;
        }
        return flag;
    }

    @Override
    public boolean attackEntityAsMobMinimum(EntityLivingBase entityIn) {
        boolean flag = super.attackEntityAsMobMinimum(entityIn);
        if (flag && this.getSSS()) {
            this.setSSS(false);
            this.timer = 0;
        }
        return flag;
    }

    public float func_70047_e() {
        return 1.0f;
    }

    @Override
    public void func_70645_a(DamageSource cause) {
        if (!this.field_70170_p.field_72995_K) {
            if (SRPConfigWorld.coloniesActivated || this.canChangeVariant) {
                if (ParasiteEventWorld.numberofColonies(this.field_70170_p) >= 1 || this.canChangeVariant) {
                    ParasiteEventEntity.checkColony(this.field_70170_p, cause, this);
                    ParasiteEventEntity.spawnNext(this, new EntityLesh(this.field_70170_p), true, false);
                } else {
                    super.func_70645_a(cause);
                }
            } else {
                super.func_70645_a(cause);
            }
        }
    }

    public boolean getSSS() {
        return (Boolean)this.field_70180_af.func_187225_a(CAM);
    }

    public void setSSS(boolean in) {
        this.field_70180_af.func_187227_b(CAM, (Object)in);
    }

    public static void registerFixesHull(DataFixer fixer) {
        EntityLiving.func_189752_a((DataFixer)fixer, EntityHull.class);
    }

    @Override
    public void func_70074_a(EntityLivingBase entityLivingIn) {
        super.func_70074_a(entityLivingIn);
        this.particleStatus((byte)5);
        if (!this.field_70170_p.field_72995_K && this.killcount > SRPConfig.adaptedKills && ParasiteEventEntity.canSpawnNext) {
            ParasiteEventEntity.spawnNext(this, new EntityHullAdapted(this.field_70170_p), true, true);
        }
    }

    protected SoundEvent func_184639_G() {
        if (this.getParasiteStatus() != 0 || this.func_70644_a(MobEffects.field_76441_p)) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.HULL_GROWL;
    }

    protected SoundEvent func_184601_bQ(DamageSource damageSourceIn) {
        if (this.field_70146_Z.nextBoolean() && this.getHitStatus() > 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.HULL_HURT;
    }

    protected SoundEvent func_184615_bR() {
        return SRPSounds.HULL_DEATH;
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag) {
            ParasiteEventEntity.orbApplyEffects(in, this, SRPConfigMobs.hullOrbEffects, mobs);
        }
        return flag;
    }

    protected void func_180429_a(BlockPos pos, Block blockIn) {
        this.func_184185_a(SRPSounds.MONSTER_STEP, 0.15f, 1.0f);
    }

    @Override
    public IEntityLivingData func_180482_a(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        IEntityLivingData floo = super.func_180482_a(difficulty, livingdata);
        if (this.field_70146_Z.nextDouble() < SRPConfig.variantChance || this.phaseCreated >= SRPConfigSystems.evolutionParasiteAlwaysVariant || this.canChangeVariant) {
            switch (this.field_70146_Z.nextInt(1)) {
                case 0: {
                    this.setSkin(7);
                }
            }
        }
        return floo;
    }
}

