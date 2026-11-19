/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.EntityAIHurtByTarget
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.pathfinding.PathNodeType
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.monster.primitive;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIAttackMeleeStatusAOE;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCutomAttack;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPPrimitive;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityWymo
extends EntityPPrimitive
implements EntityCutomAttack {
    private boolean open;
    private float buried;
    private int blockI;
    private int buriedC;
    private static final DataParameter<Boolean> UP = EntityDataManager.func_187226_a(EntityWymo.class, (DataSerializer)DataSerializers.field_187198_h);
    private float attackTimer;
    private boolean up;
    private int border;
    private boolean skillshockwave;

    public EntityWymo(World worldIn) {
        super(worldIn);
        this.func_70105_a(0.9f, 0.25f);
        this.field_70714_bg.func_85156_a((EntityAIBase)this.folow);
        this.func_184644_a(PathNodeType.WATER, -1.0f);
        this.canModRender = 0;
        this.buried = 4.6f;
        this.field_70138_W = 1.0f;
    }

    @Override
    public int getParasiteIDRegister() {
        return 37;
    }

    protected void func_184651_r() {
        this.field_70715_bh.func_75776_a(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
        this.field_70714_bg.func_75776_a(3, (EntityAIBase)new EntityAIAttackMeleeStatusAOE(this, 1.3, false, 0.0, 3.5, true));
    }

    @Override
    protected void func_70088_a() {
        super.func_70088_a();
        this.field_70180_af.func_187214_a(UP, (Object)false);
    }

    protected void func_110147_ax() {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(SRPAttributes.WYMO_HEALTH);
        this.func_110148_a(SharedMonsterAttributes.field_188791_g).func_111128_a(SRPAttributes.WYMO_ARMOR);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.26);
        this.func_110148_a(SharedMonsterAttributes.field_111266_c).func_111128_a(SRPAttributes.WYMO_KD_RESISTANCE);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(SRPAttributes.WYMO_ATTACK_DAMAGE);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(SRPConfig.primitiveFollow);
    }

    @Override
    public void func_70636_d() {
        if (this.func_175446_cd()) {
            this.setParasiteStatus(3);
            this.setBurrowed(true);
            this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.0);
            this.buriedC = 80;
            if (this.buriedC > 0) {
                --this.buriedC;
            }
            if (this.up) {
                this.attackTimer = (float)((double)this.attackTimer + 0.2);
                if (this.attackTimer > 1.0f) {
                    this.up = false;
                }
            } else {
                this.attackTimer = (float)((double)this.attackTimer - 0.1);
            }
            this.checkBurrowed();
            return;
        }
        super.func_70636_d();
        if (this.buriedC > 0) {
            --this.buriedC;
        }
        if (this.up) {
            this.attackTimer = (float)((double)this.attackTimer + 0.2);
            if (this.attackTimer > 1.0f) {
                this.up = false;
            }
        } else {
            this.attackTimer = (float)((double)this.attackTimer - 0.1);
        }
        this.checkBurrowed();
        this.checkSpeed();
        this.teleportByGround();
        if (!(this.getBurrowed() || this.field_70165_t == this.field_70169_q && this.field_70161_v == this.field_70166_s)) {
            this.spawnGroundParticles();
        }
    }

    private void checkBurrowed() {
        if (this.getBurrowed()) {
            if (this.field_70131_O < 3.0f) {
                this.func_70105_a(0.9f, this.field_70131_O + 0.13f);
            }
            if (this.buried >= 0.0f) {
                this.buried -= 0.18f;
                this.spawnGroundParticles();
                this.open = false;
            } else {
                this.open = true;
            }
        } else {
            if (this.field_70131_O > 0.25f) {
                this.func_70105_a(0.9f, this.field_70131_O - 0.15f);
            }
            if (this.buried < 4.6f) {
                this.buried += 0.18f;
                this.spawnGroundParticles();
                this.open = false;
            }
        }
    }

    private void checkSpeed() {
        if (!this.field_70170_p.field_72995_K) {
            if (this.func_70638_az() != null) {
                if (this.func_70068_e((Entity)this.func_70638_az()) <= 1.0) {
                    this.setParasiteStatus(3);
                    this.setBurrowed(true);
                    this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.0);
                    this.buriedC = 40;
                } else if (this.buriedC <= 0) {
                    this.setParasiteStatus(0);
                    this.setBurrowed(false);
                    this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.26);
                }
            } else if (this.getBurrowed() && this.buriedC <= 0) {
                this.setParasiteStatus(0);
                this.setBurrowed(false);
                this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.26);
            }
        }
    }

    private void spawnGroundParticles() {
        IBlockState state = this.field_70170_p.func_180495_p(this.func_180425_c().func_177977_b());
        if (state.func_177230_c() != Blocks.field_150350_a) {
            int id = Block.func_176210_f((IBlockState)state);
            for (int i = 0; i < 15; ++i) {
                this.field_70170_p.func_175688_a(EnumParticleTypes.BLOCK_CRACK, this.field_70165_t + (double)(this.field_70146_Z.nextFloat() * this.field_70130_N * 3.0f) - (double)this.field_70130_N, this.field_70163_u, this.field_70161_v + (double)(this.field_70146_Z.nextFloat() * this.field_70130_N * 3.0f) - (double)this.field_70130_N, this.field_70146_Z.nextGaussian() * 0.02, this.field_70146_Z.nextGaussian() * 0.02, this.field_70146_Z.nextGaussian() * 0.02, new int[]{id});
            }
        }
    }

    private void teleportByGround() {
        EntityLivingBase target;
        if (this.srpTicks != 10) {
            return;
        }
        if (!this.getBurrowed() && this.field_70146_Z.nextInt(3) == 0 && this.field_70131_O <= 0.25f && (target = this.func_70638_az()) != null && target.func_70068_e((Entity)this) > 49.0 && ParasiteEventEntity.teleportDigging(this, 10.0f, target.func_180425_c(), 4, 1)) {
            this.func_70690_d(new PotionEffect(MobEffects.field_76421_d, 10, 30, false, false));
        }
    }

    public void func_70024_g(double x, double y, double z) {
        if (this.getBurrowed()) {
            super.func_70024_g(x, y, z);
        }
    }

    @Override
    public boolean func_70097_a(DamageSource source, float amount) {
        if (this.field_70170_p.field_72995_K) {
            return false;
        }
        if (source == DamageSource.field_76368_d) {
            return false;
        }
        if (source == DamageSource.field_76380_i) {
            return super.func_70097_a(source, amount);
        }
        if (!this.getBurrowed() && this.field_70131_O < 1.0f) {
            if (source == DamageSource.field_76369_e) {
                return false;
            }
            if (source.func_76346_g() == null) {
                return super.func_70097_a(source, amount);
            }
            return false;
        }
        return super.func_70097_a(source, amount);
    }

    @Override
    public boolean func_70652_k(Entity entityIn) {
        if (!this.getBurrowed() || this.field_70131_O < 1.0f) {
            if (entityIn == null) {
                return false;
            }
            if (this.func_70068_e(entityIn) > 4.0) {
                return false;
            }
            this.setParasiteStatus(3);
            this.setBurrowed(true);
            this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.0);
            this.buriedC = 40;
            return false;
        }
        boolean flag = super.func_70652_k(entityIn);
        if (flag) {
            this.buriedC += 40;
        }
        return flag;
    }

    @Override
    public boolean attackEntityAsMobAOE(Entity entityIn) {
        if (this.borderOrb != 0) {
            return false;
        }
        this.up = true;
        this.attackTimer = 0.0f;
        boolean flag = false;
        this.func_184185_a(SRPSounds.SWIPE, 2.0f, 1.0f);
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(entityIn.field_70165_t, entityIn.field_70163_u, entityIn.field_70161_v, entityIn.field_70165_t + 1.0, entityIn.field_70163_u + 1.0, entityIn.field_70161_v + 1.0).func_186662_g(1.5);
        List moblist = this.field_70170_p.func_72872_a(EntityLivingBase.class, axisalignedbb);
        for (EntityLivingBase mob : moblist) {
            if (mob instanceof EntityParasiteBase) {
                if (this.func_70638_az() != mob) continue;
                this.func_70624_b(null);
                return false;
            }
            if (mob == this || !this.func_70685_l((Entity)mob) || !this.func_70652_k((Entity)mob)) continue;
            flag = true;
        }
        return flag;
    }

    public boolean func_96092_aw() {
        return super.func_96092_aw();
    }

    @Override
    public boolean func_70687_e(PotionEffect potioneffectIn) {
        return super.func_70687_e(potioneffectIn);
    }

    @Override
    public void func_70074_a(EntityLivingBase entityLivingIn) {
        super.func_70074_a(entityLivingIn);
        this.particleStatus((byte)5);
    }

    public float func_70047_e() {
        return this.field_70131_O;
    }

    public boolean getBurrowed() {
        return (Boolean)this.field_70180_af.func_187225_a(UP);
    }

    public void setBurrowed(boolean in) {
        this.field_70180_af.func_187227_b(UP, (Object)in);
    }

    public static void registerFixesBano(DataFixer fixer) {
        EntityLiving.func_189752_a((DataFixer)fixer, EntityWymo.class);
    }

    protected SoundEvent func_184639_G() {
        if (this.getParasiteStatus() != 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.MOBSILENCE;
    }

    protected SoundEvent func_184601_bQ(DamageSource damageSourceIn) {
        if (this.field_70146_Z.nextBoolean() && this.getHitStatus() > 0) {
            return SRPSounds.MOBSILENCE;
        }
        return SRPSounds.MOBSILENCE;
    }

    protected SoundEvent func_184615_bR() {
        return SRPSounds.MOBSILENCE;
    }

    @SideOnly(value=Side.CLIENT)
    public float getBurrowTimer() {
        return this.buried;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean getOpen() {
        return this.open;
    }

    @SideOnly(value=Side.CLIENT)
    public float getAttackTimer() {
        return this.attackTimer;
    }
}

