/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBush
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.passive.EntityWaterMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.block.BlockGore;
import com.dhanantry.scapeandrunparasites.entity.EntityRemain;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAINearestAttackableTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAISkill;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanSummon;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPMalleable;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationary;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.EntityDodT;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.EntityNak;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityGore;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityPPure
extends EntityPMalleable
implements EntityCanSummon {
    protected int totalP;
    protected int actualP;
    protected int[] mobID;
    protected int[] mobPT;
    private int ggg;

    public EntityPPure(World worldIn) {
        super(worldIn);
        this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityPlayer>(this, EntityPlayer.class, 0, SRPConfig.pureWalls, false, null, SRPConfig.pureSneakPen, SRPConfig.pureInviPen));
        if (SRPConfig.canOrbAttack) {
            this.tasks.addTask(2, (EntityAIBase)new EntityAISkill(this, 80, 5, false, 21));
        }
        if (SRPConfig.mobattacking) {
            this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityLiving>(this, EntityLiving.class, 0, SRPConfig.pureWalls, false, new Predicate<EntityLiving>(){

                public boolean apply(@Nullable EntityLiving entity) {
                    return !(entity instanceof EntityWaterMob) && !(entity instanceof EntityAnimal) && !ParasiteEventEntity.checkEntity((EntityLivingBase)entity, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite);
                }
            }, SRPConfig.pureSneakPen, SRPConfig.pureInviPen));
        }
        this.tasks.removeTask((EntityAIBase)this.folow);
        this.experienceValue = SRPAttributes.XP_ADAPTED;
        this.canD = SRPConfig.puredespawn;
        this.damageCap = SRPConfig.pureCap;
        this.canModRender = 1;
        this.fuseTime = 70;
        this.type = (byte)51;
        this.killcount = 10.0;
        this.fuseOrb = 20;
        this.orbStartTimer = 5;
        this.foodSteal = SRPConfig.pureFoodSteal;
        this.orbItemCool = SRPConfig.pureItemOrbCooldown * 20;
        this.pointCap = SRPConfig.purePointCap;
        this.pointReduction = SRPConfig.purePointRed;
        this.chanceLearn = SRPConfig.pureChanceLe;
        this.chanceLearnFire = SRPConfig.pureChanceLeFire;
        this.DamageTypeCap = SRPConfig.purePointDamCap;
        this.MiniDamage = SRPConfig.pureMinDamage;
        this.regen = SRPConfig.pureRegen * SRPConfig.globalHealthMultiplier;
        this.oneMindDeathValue = SRPConfig.pureOneMindDeathV;
        this.regenEff = 3;
        this.foodRott = SRPConfig.pureFoodChance;
        this.foodRootNumber = SRPConfig.pureFoodAmount;
        this.totalP = SRPConfig.pureSeiZ;
        this.mobID = new int[this.totalP];
        this.mobPT = new int[this.totalP];
        for (int i = 0; i < this.mobID.length; ++i) {
            this.mobID[i] = -777;
        }
        this.valueEvDeath = SRPConfig.pureLoosingEPValue;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        ++this.ggg;
        if (this.ggg > 60) {
            this.ggg = 0;
        }
        if (this.getAttackTarget() != null) {
            this.summonTentacles(this.getAttackTarget());
        }
    }

    @Override
    protected void fearPlayer(EntityLivingBase player) {
        try {
            if (player == null) {
                return;
            }
            if (!this.canEntityBeSeen((Entity)player)) {
                return;
            }
            if (!player.isPotionActive(SRPPotions.FEAR_E)) {
                player.addPotionEffect(new PotionEffect(SRPPotions.FEAR_E, 300, 2, false, false));
            } else if (player.getActivePotionEffect(SRPPotions.FEAR_E).getAmplifier() < 2) {
                player.addPotionEffect(new PotionEffect(SRPPotions.FEAR_E, 300, 2, false, false));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        EntityLivingBase target;
        boolean flag = super.attackEntityAsMob(entityIn);
        if (flag && entityIn instanceof EntityLivingBase && this.rand.nextDouble() < (double)SRPConfigSystems.cothPure && !(target = (EntityLivingBase)entityIn).isPotionActive(SRPPotions.COTH_E)) {
            if (target.isPotionActive(SRPPotions.EPEL_E)) {
                if (this.rand.nextDouble() >= SRPConfigSystems.epelChanceCOTH) {
                    target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
                }
            } else {
                target.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
            }
        }
        return flag;
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        boolean flag = super.attackEntityFrom(source, amount);
        if (flag && source.getTrueSource() instanceof EntityLivingBase) {
            this.summonTentacles((EntityLivingBase)source.getTrueSource());
        }
        return flag;
    }

    public void fall(float distance, float damageMultiplier) {
        if (distance >= 80.0f) {
            super.fall(distance, damageMultiplier);
        }
    }

    protected void summonTentacles(EntityLivingBase in) {
        boolean flag;
        if (this.ggg != 20) {
            return;
        }
        if (SRPConfigSystems.useEvolution && this.getRSChance(this.phaseCreated) == 0.0) {
            return;
        }
        double dis = this.getDistanceSq((Entity)in);
        boolean bl = flag = !this.canEntityBeSeen((Entity)in);
        if (dis > 64.0 && flag && this.rand.nextInt(3) == 0 || this.rand.nextInt(10) == 0) {
            this.checkID();
            if (this.getActualParasites() < this.getTotalParasites() && this.spawnT(in, 5, 3, 2, 2)) {
                this.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 150, 120, false, false));
            }
        } else {
            if (in.isPotionActive(MobEffects.SLOWNESS) && in.getActivePotionEffect(MobEffects.SLOWNESS).getAmplifier() == 2) {
                return;
            }
            this.checkID();
            if (this.getActualParasites() >= this.getTotalParasites() || this.spawnT(in, 3, 1, 16, 1)) {
                // empty if block
            }
        }
    }

    protected boolean spawnT(EntityLivingBase in, int range2, int mini2, int check, int type) {
        int range = range2;
        int mini = mini2;
        Random rand = new Random();
        double x = in.posX;
        double y = in.posY;
        double z = in.posZ;
        double randomx = rand.nextInt(range) + mini;
        double randomz = rand.nextInt(range) + mini;
        double negative = rand.nextInt(2);
        if (negative == 0.0) {
            randomx *= -1.0;
        }
        if ((negative = (double)rand.nextInt(2)) == 0.0) {
            randomz *= -1.0;
        }
        int limit = 0;
        boolean flag = true;
        EntityPStationary entityout = new EntityDodT(this.world);
        ((EntityDodT)entityout).setTele(this);
        if (type == 1) {
            entityout = new EntityNak(this.world);
        }
        while (flag) {
            if (limit >= 5) {
                entityout.setDead();
                return false;
            }
            BlockPos pos = new BlockPos(x + randomx, y, z + randomz);
            if ((pos = ParasiteEventEntity.getFloor(this.world, pos, 5)) != null) {
                IBlockState state = this.world.getBlockState(pos);
                if (this.world.getBlockState(pos.down()).isFullCube()) {
                    AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)(pos.getY() + 1), (double)(pos.getZ() + 1)).grow((double)check);
                    List moblist = this.world.getEntitiesWithinAABB(EntityNak.class, axisalignedbb);
                    if (moblist.size() > 10) {
                        return false;
                    }
                    axisalignedbb = new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)(pos.getY() + 1), (double)(pos.getZ() + 1)).grow(2.0);
                    moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
                    if (moblist.isEmpty()) {
                        entityout.setLocationAndAngles(x + randomx, y, z + randomz, this.rotationYaw, this.rotationPitch);
                        if (!this.world.getCollisionBoxes((Entity)entityout, entityout.getEntityBoundingBox()).isEmpty()) {
                            randomx = rand.nextInt(range) + mini;
                            randomz = rand.nextInt(range) + mini;
                            negative = rand.nextInt(2);
                            if (negative == 0.0) {
                                randomx *= -1.0;
                            }
                            if ((negative = (double)rand.nextInt(2)) == 0.0) {
                                randomz *= -1.0;
                            }
                            ++limit;
                            continue;
                        }
                        entityout.onInitialSpawn(this.world.getDifficultyForLocation(new BlockPos((Entity)entityout)), null);
                        entityout.setAttackTarget(in);
                        this.setActualParasites(1);
                        this.addID(entityout.getEntityId(), 1);
                        entityout.setBuried();
                        this.world.spawnEntity((Entity)entityout);
                        this.world.setEntityState((Entity)entityout, (byte)50);
                        flag = false;
                        return true;
                    }
                }
            }
            randomx = rand.nextInt(range) + mini;
            randomz = rand.nextInt(range) + mini;
            negative = rand.nextInt(2);
            if (negative == 0.0) {
                randomx *= -1.0;
            }
            if ((negative = (double)rand.nextInt(2)) == 0.0) {
                randomz *= -1.0;
            }
            ++limit;
        }
        return false;
    }

    private EntityDodT getTentacle() {
        for (int i = 0; i < this.mobID.length; ++i) {
            if (this.mobID[i] <= 0 || !(this.world.getEntityByID(this.mobID[i]) instanceof EntityDodT)) continue;
            EntityDodT flag = (EntityDodT)this.world.getEntityByID(this.mobID[i]);
            if (flag == null) {
                this.mobID[i] = -777;
                int negative = this.mobPT[i] * -1;
                this.setActualParasites(negative);
                continue;
            }
            if (!flag.isEntityAlive() || flag.getTele() != null || flag.buried()) continue;
            return flag;
        }
        return null;
    }

    public double getRSChance(byte in) {
        switch (in) {
            case 1: {
                return SRPConfigSystems.reinforcementSystemChanceOne;
            }
            case 2: {
                return SRPConfigSystems.reinforcementSystemChanceTwo;
            }
            case 3: {
                return SRPConfigSystems.reinforcementSystemChanceThree;
            }
            case 4: {
                return SRPConfigSystems.reinforcementSystemChanceFour;
            }
            case 5: {
                return SRPConfigSystems.reinforcementSystemChanceFive;
            }
            case 6: {
                return SRPConfigSystems.reinforcementSystemChanceSix;
            }
            case 7: {
                return SRPConfigSystems.reinforcementSystemChanceSeven;
            }
            case 8: {
                return SRPConfigSystems.reinforcementSystemChanceEight;
            }
        }
        return 0.0;
    }

    @Override
    protected void spawnGore() {
        int range = 4;
        double i1 = MathHelper.floor((double)(this.posY + 0.1));
        double l1 = this.posX;
        double i2 = this.posZ;
        for (int k2 = -1 * range; k2 <= 1 * range && SRPConfig.paraGore; ++k2) {
            for (int l2 = -1 * range; l2 <= 1 * range; ++l2) {
                double i3 = l1 + (double)k2;
                double l = i2 + (double)l2;
                BlockPos blockpos = new BlockPos(i3, i1, l);
                Block block = this.world.getBlockState(blockpos).getBlock();
                Block blockDown = this.world.getBlockState(blockpos.down()).getBlock();
                if (block != Blocks.AIR || blockDown == Blocks.AIR || !this.world.getBlockState(blockpos.down()).isFullBlock() || blockDown == SRPBlocks.InfestedStain || this.world.rand.nextInt(4) != 0) continue;
                this.world.setBlockState(blockpos, SRPBlocks.Gore.getDefaultState().withProperty(BlockGore.VARIANT, (Comparable)((Object)BlockGore.EnumType.PURE_FLAT)));
            }
        }
        if (this.world.getBlockState(this.getPosition().down()).isFullBlock() && (this.world.getBlockState(this.getPosition()).getBlock() instanceof BlockBush || this.world.getBlockState(this.getPosition()).getBlock() == Blocks.AIR)) {
            this.world.setBlockState(this.getPosition(), SRPBlocks.Gore.getDefaultState().withProperty(BlockGore.VARIANT, (Comparable)((Object)BlockGore.EnumType.PURE_BIG)));
            EntityRemain nnn = new EntityRemain(this.world);
            nnn.setLocationAndAngles((double)this.getPosition().getX() + 0.5, this.getPosition().getY(), (double)this.getPosition().getZ() + 0.5, 0.0f, 0.0f);
            nnn.setParasite(EntityList.getKey((Entity)this).toString());
            nnn.setSkin((byte)this.getSkin());
            nnn.setGoal(20 * SRPConfig.pureRemainValue);
            this.world.spawnEntity((Entity)nnn);
        }
        for (int i = 0; i < 7 && SRPConfig.paraGore; ++i) {
            double d0 = (float)this.posX + this.world.rand.nextFloat();
            double d1 = (float)this.posY + this.world.rand.nextFloat();
            double d2 = (float)this.posZ + this.world.rand.nextFloat();
            double d3 = d0 - this.posX;
            double d4 = d1 - this.posY;
            double d5 = d2 - this.posZ;
            double d6 = MathHelper.sqrt((double)(d3 * d3 + d4 * d4 + d5 * d5));
            d3 /= d6;
            d4 /= d6;
            d5 /= d6;
            double d7 = 0.5 / (d6 / 4.0 + 0.1);
            d4 = d4 * d7 * 2.0;
            EntityGore bomb = new EntityGore(this.world);
            bomb.setType((byte)4);
            bomb.copyLocationAndAnglesFrom((Entity)this);
            bomb.setMotion(d3 *= (d7 *= (double)(this.world.rand.nextFloat() * this.world.rand.nextFloat() + 0.3f)), d4, d5 *= d7, 0.25, 0.65);
            this.world.spawnEntity((Entity)bomb);
        }
    }

    @Override
    public int getTotalParasites() {
        return this.totalP;
    }

    @Override
    public int getActualParasites() {
        return this.actualP;
    }

    @Override
    public void setActualParasites(int i) {
        this.actualP += i;
    }

    @Override
    public void addID(int id, int points) {
        for (int i = 0; i < this.mobID.length; ++i) {
            if (this.mobID[i] != -777) continue;
            this.mobID[i] = id;
            this.mobPT[i] = points;
            return;
        }
    }

    @Override
    public int IDable() {
        int flag = 0;
        for (int i = 0; i < this.mobID.length; ++i) {
            if (this.mobID[i] != -777) continue;
            ++flag;
        }
        if (flag > this.totalP) {
            flag = this.totalP;
        }
        return flag;
    }

    @Override
    public void checkID() {
        for (int i = 0; i < this.mobID.length; ++i) {
            Entity flag;
            if (this.mobID[i] <= 0 || (flag = this.world.getEntityByID(this.mobID[i])) != null) continue;
            this.mobID[i] = -777;
            int negative = this.mobPT[i] * -1;
            this.setActualParasites(negative);
        }
    }

    @Override
    public int[] getIDList() {
        return this.mobID;
    }

    @Override
    public int[] getPointList() {
        return this.mobPT;
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public void spawnEffectsGore() {
    }

    @Override
    public boolean scaryOrbEffect(EntityLivingBase in, int mobs) {
        boolean flag = super.scaryOrbEffect(in, mobs);
        if (flag && in instanceof EntityPlayer) {
            EntityPlayer playerIn = (EntityPlayer)in;
            if (playerIn.experienceLevel > 0) {
                playerIn.addExperience(-SRPConfig.pureExpSteal);
                if (playerIn.experience < 0.0f) {
                    --playerIn.experienceLevel;
                    playerIn.experience = 1.0f;
                }
            } else {
                playerIn.addExperience(-SRPConfig.pureExpSteal);
                if (playerIn.experience < 0.0f) {
                    playerIn.experience = 0.0f;
                }
            }
        }
        return flag;
    }
}

