/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.entity.ai.EntityAILookIdle
 *  net.minecraft.init.MobEffects
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.monster.primitive;

import com.dhanantry.scapeandrunparasites.entity.EntityDamage;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIEvade;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIGetFollowers;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISkill;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISwimmingDiving;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIWaterLeapAtTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPPrimitive;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityNoglaAdapted;
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityLesh;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityNogla
extends EntityPPrimitive {
    private int attacking;
    private double targetX;
    private double targetY;
    private double targetZ;
    private boolean skillCharge;

    public EntityNogla(World worldIn) {
        super(worldIn);
        this.func_70105_a(0.9f, 2.6f);
        this.field_70138_W = 1.0f;
        this.skillCharge = false;
    }

    @Override
    public int getParasiteIDRegister() {
        return 10;
    }

    protected void func_184651_r() {
        this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.field_70714_bg.func_75776_a(0, (EntityAIBase)new EntityAISwimmingDiving((EntityLiving)this, 0.095));
        this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIWaterLeapAtTargetStatus(this, 0.7f, 1.5, 3, 20, 0));
        this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIAttackMeleeStatus(this, 1.3, false, 8.0));
        this.field_70714_bg.func_75776_a(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAISkill(this, 40, 32, 8, true, 1));
        this.field_70714_bg.func_75776_a(6, (EntityAIBase)new EntityAIGetFollowers(this, 2, 16));
        this.field_70714_bg.func_75776_a(2, (EntityAIBase)new EntityAIEvade(this, 55, 10, 4));
    }

    protected void func_110147_ax() {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(SRPAttributes.NOGLA_HEALTH);
        this.func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(SRPAttributes.NOGLA_ARMOR);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.31234);
        this.func_110148_a(SharedMonsterAttributes.field_111266_c).func_111128_a(SRPAttributes.NOGLA_KD_RESISTANCE);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(SRPAttributes.NOGLA_ATTACK_DAMAGE);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(SRPConfig.primitiveFollow);
    }

    @Override
    public void func_70636_d() {
        super.func_70636_d();
        if (!this.field_70170_p.field_72995_K && this.field_70173_aa % 20 == 0 && this.killcount > SRPConfig.adaptedKills && ParasiteEventEntity.canSpawnNext) {
            ParasiteEventEntity.spawnNext(this, new EntityNoglaAdapted(this.field_70170_p), true, true);
        }
    }

    @Override
    protected void func_82167_n(Entity entityIn) {
        super.func_82167_n(entityIn);
        if (this.field_70170_p.field_72995_K) {
            return;
        }
        if (entityIn instanceof EntityLivingBase && !(entityIn instanceof EntityParasiteBase) && this.getSkin() == 5) {
            SRPPotions.applyStackPotion(SRPPotions.VIRA_E, (EntityLivingBase)entityIn, 40, 0);
        }
    }

    public float func_70047_e() {
        return 2.4f;
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

    public static void registerFixesNogla(DataFixer fixer) {
        EntityLiving.func_189752_a((DataFixer)fixer, EntityNogla.class);
    }

    @Override
    public boolean func_70652_k(Entity entityIn) {
        boolean flag = super.func_70652_k(entityIn);
        if (flag && entityIn instanceof EntityLivingBase) {
            ((EntityLivingBase)entityIn).func_70690_d(new PotionEffect(MobEffects.field_76436_u, 100));
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
        return flag;
    }

    @Override
    public void func_70074_a(EntityLivingBase entityLivingIn) {
        super.func_70074_a(entityLivingIn);
        this.particleStatus((byte)5);
        if (!this.field_70170_p.field_72995_K && this.killcount > SRPConfig.adaptedKills && ParasiteEventEntity.canSpawnNext) {
            ParasiteEventEntity.spawnNext(this, new EntityNoglaAdapted(this.field_70170_p), true, true);
        }
    }

    protected SoundEvent func_184639_G() {
        if (this.getParasiteStatus() != 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.NOGLA_GROWL;
    }

    protected SoundEvent func_184601_bQ(DamageSource damageSourceIn) {
        if (this.field_70146_Z.nextBoolean() && this.getHitStatus() > 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.NOGLA_HURT;
    }

    protected SoundEvent func_184615_bR() {
        return SRPSounds.NOGLA_DEATH;
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag) {
            ParasiteEventEntity.orbApplyEffects(in, this, SRPConfigMobs.noglaOrbEffects, mobs);
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
            switch (this.field_70146_Z.nextInt(4)) {
                case 0: {
                    this.setSkin(5);
                    break;
                }
                case 1: {
                    this.setSkin(6);
                    break;
                }
                case 2: {
                    this.setSkin(1);
                    this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(SRPAttributes.NOGLA_HEALTH * 0.5);
                    this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(SRPAttributes.NOGLA_ATTACK_DAMAGE * 1.5);
                    this.func_70606_j((float)this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111125_b());
                    break;
                }
                case 3: {
                    this.setSkin(7);
                }
            }
        }
        return floo;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void func_70103_a(byte id) {
        switch (id) {
            case 100: {
                for (int i = 0; i <= 1; ++i) {
                    this.spawnParticles(EnumParticleTypes.FLAME);
                }
                break;
            }
            default: {
                super.func_70103_a(id);
            }
        }
    }

    @Override
    public boolean getFinished(byte attID) {
        switch (attID) {
            case 1: {
                return this.skillCharge;
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
        }
        super.doSpecialSkill(id);
    }

    private void charge() {
        ++this.attacking;
        this.miniCapA = true;
        if (this.attacking < 20) {
            EntityLivingBase entitylivingbase;
            this.field_70170_p.func_72960_a((Entity)this, (byte)100);
            if (this.attacking == 2) {
                float v = (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.4f + 2.0f;
                this.func_184185_a(this.func_184601_bQ(DamageSource.field_76377_j), 4.0f, v);
            }
            if ((entitylivingbase = this.func_70638_az()) == null || !this.field_70122_E || this.func_70090_H() || entitylivingbase.field_70163_u > this.field_70163_u && entitylivingbase.field_70122_E) {
                this.skillCharge = true;
                this.attacking = 0;
                this.miniCapA = false;
                this.setParasiteStatus(0);
                return;
            }
            if (!entitylivingbase.func_70089_S()) {
                this.skillCharge = true;
                this.attacking = 0;
                this.miniCapA = false;
                this.setParasiteStatus(0);
                return;
            }
            if (this.attacking <= 19) {
                double dis = this.func_70032_d((Entity)entitylivingbase);
                this.setParasiteStatus(3);
                this.func_70661_as().func_75499_g();
                this.targetX = this.field_70165_t + 15.0 * (entitylivingbase.field_70165_t - this.field_70165_t) / dis;
                this.targetY = this.field_70163_u + 15.0 * (entitylivingbase.field_70163_u - this.field_70163_u) / dis;
                this.targetZ = this.field_70161_v + 15.0 * (entitylivingbase.field_70161_v - this.field_70161_v) / dis;
            }
        }
        if (this.attacking == 20) {
            this.func_70661_as().func_75492_a(this.targetX, this.targetY, this.targetZ, 2.5);
        }
        if (this.attacking >= 20) {
            for (EntityLivingBase mob : this.field_70170_p.func_72872_a(EntityLivingBase.class, this.func_174813_aQ().func_72314_b(2.0, 0.0, 2.0))) {
                if (mob == this || mob instanceof EntityParasiteBase) continue;
                float f = (float)MathHelper.func_181159_b((double)(mob.field_70161_v - this.field_70161_v), (double)(mob.field_70165_t - this.field_70165_t));
                EntityDamage damage = new EntityDamage(this.field_70170_p, mob.field_70165_t, mob.field_70163_u, mob.field_70161_v, f, (EntityLivingBase)this, 1.0f, false, 0.5f);
                this.field_70170_p.func_72838_d((Entity)damage);
            }
        }
        this.skillBreakBlocks();
        if (!this.field_70122_E) {
            this.field_70159_w *= 0.7;
            this.field_70179_y *= 0.7;
        }
        if (this.attacking >= 60 && this.field_70165_t == this.field_70169_q && this.field_70161_v == this.field_70166_s) {
            this.attacking = 0;
            this.miniCapA = false;
            this.skillCharge = true;
            this.setParasiteStatus(2);
        }
    }
}

