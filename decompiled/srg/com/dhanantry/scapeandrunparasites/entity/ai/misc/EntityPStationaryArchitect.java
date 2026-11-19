/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.Item
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.block.BlockInfestedStain;
import com.dhanantry.scapeandrunparasites.client.particle.ParticleSpawner;
import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityCanSummon;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationary;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityBomb;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPWorldData;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityPStationaryArchitect
extends EntityPStationary
implements EntityCanSummon {
    protected int totalP;
    protected int actualP;
    protected boolean convert = true;
    protected int[] mobID;
    protected int[] mobPT;
    protected boolean rsSpawned = false;
    protected byte stage;
    protected float body;
    public int neededTime;
    protected int actualTime;
    protected int topParticles;
    private boolean canGrowTo;
    private int bombC;

    public EntityPStationaryArchitect(World worldIn) {
        super(worldIn);
        this.killcount = -10.0;
        this.canD = SRPConfig.rsDespawn;
        this.canGrowTo = true;
        this.borderOrb = -1;
    }

    public void setCanGrowTo(boolean in) {
        this.canGrowTo = in;
    }

    public void setConvert(boolean in) {
        this.convert = in;
    }

    public int setGT(int minGrowTime, int maxGrowTime) {
        int atm = maxGrowTime - minGrowTime + 1;
        if (atm <= 0 || maxGrowTime <= minGrowTime) {
            return 1;
        }
        return this.field_70146_Z.nextInt(atm) + minGrowTime;
    }

    public void setActualT(int in) {
        if (this.canGrowTo) {
            this.actualTime = in;
        }
    }

    public int getActualT() {
        return this.actualTime;
    }

    public int getNeededTime() {
        return this.neededTime;
    }

    @Override
    public void func_70636_d() {
        super.func_70636_d();
        if (this.topParticles > 0) {
            --this.topParticles;
        }
        this.freeDead();
        if (this.bombC > 0) {
            --this.bombC;
        }
    }

    @Override
    protected boolean func_184645_a(EntityPlayer player, EnumHand hand) {
        Item wea = player.func_184582_a(EntityEquipmentSlot.MAINHAND).func_77973_b();
        if (wea == SRPItems.itemEvolve) {
            this.canChangeVariant = true;
            this.setActualT(100000000);
            this.setActualT(100000000);
        }
        return super.func_184645_a(player, hand);
    }

    protected void freeDead() {
        if (!this.field_70170_p.field_72995_K && this.field_70128_L) {
            int meta;
            BlockPos floor;
            World world;
            Block bbb;
            if (!(!this.convert && this.getRSChance(this.phaseCreated) != 0.0 || (bbb = (world = this.field_70170_p).func_180495_p(floor = new BlockPos((Entity)this).func_177977_b()).func_177230_c()) != SRPBlocks.InfestedStain && bbb != SRPBlocks.InfestedRubble || ((meta = bbb.func_176201_c(world.func_180495_p(floor))) > SRPConfigSystems.rsBlockRevertStage || meta > this.stage) && this.getRSChance(this.phaseCreated) != 0.0)) {
                this.field_70170_p.func_175656_a(floor, SRPBlocks.InfestedStain.func_176223_P().func_177226_a((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(5)));
                world.func_175654_a(floor, SRPBlocks.InfestedStain.func_176223_P().func_177226_a((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(5)).func_177230_c(), 40, 5);
            }
            if (this.rsSpawned) {
                SRPWorldData data = SRPWorldData.get(this.field_70170_p);
                data.setCurrentV(-1);
            }
        }
    }

    public float getBODY() {
        return this.body;
    }

    public byte getStageV() {
        return this.stage;
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
            if (this.mobID[i] <= 0 || (flag = this.field_70170_p.func_73045_a(this.mobID[i])) != null) continue;
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

    public void setRSSpawned(boolean in) {
        this.rsSpawned = in;
    }

    public boolean getRSSpawned() {
        return this.rsSpawned;
    }

    public abstract float getBombDamage();

    @Override
    public boolean func_70692_ba() {
        if (this.field_70170_p.func_180494_b(this.func_180425_c()) instanceof BiomeParasite) {
            return true;
        }
        return super.func_70692_ba();
    }

    @Override
    public boolean func_70097_a(DamageSource source, float amount) {
        float red = this.getParasiteStatus() == 0 ? 0.4f : 1.0f;
        boolean flag = super.func_70097_a(source, amount * red);
        if (flag && this.bombC == 0 && source != DamageSource.field_76380_i) {
            if (source.func_76346_g() instanceof EntityLivingBase) {
                if (source.func_76346_g().func_70068_e((Entity)this) > 36.0) {
                    return flag;
                }
            } else {
                return flag;
            }
            for (int i = 0; i < this.stage * 2; ++i) {
                double d0 = (float)this.field_70165_t + this.field_70170_p.field_73012_v.nextFloat();
                double d1 = (float)this.field_70163_u + this.field_70170_p.field_73012_v.nextFloat();
                double d2 = (float)this.field_70161_v + this.field_70170_p.field_73012_v.nextFloat();
                double d3 = d0 - this.field_70165_t;
                double d4 = d1 - this.field_70163_u;
                double d5 = d2 - this.field_70161_v;
                double d6 = MathHelper.func_76133_a((double)(d3 * d3 + d4 * d4 + d5 * d5));
                d3 /= d6;
                d4 /= d6;
                d5 /= d6;
                double d7 = 0.5 / (d6 / 4.0 + 0.1);
                d3 *= (d7 *= (double)(this.field_70170_p.field_73012_v.nextFloat() * this.field_70170_p.field_73012_v.nextFloat() + 0.65f));
                d4 = d4 * d7 * (double)this.stage * 3.0;
                d5 *= d7;
                EntityBomb bomb = new EntityBomb(this.field_70170_p, this, false);
                bomb.setFuse(60);
                bomb.setStren(0.0f);
                bomb.setSkin(1);
                bomb.setDamage(this.getBombDamage(), this.stage);
                bomb.field_70125_A -= -20.0f;
                bomb.func_82149_j((Entity)this);
                bomb.setMotion(d3, d4, d5, 0.35, (float)this.stage / 10.0f * 2.0f);
                this.field_70170_p.func_72838_d((Entity)bomb);
                bomb.updateSTR();
            }
            this.bombC = 80;
        }
        return flag;
    }

    @Override
    public void func_70014_b(NBTTagCompound compound) {
        super.func_70014_b(compound);
        compound.func_74757_a("belongtors", this.getRSSpawned());
        compound.func_74768_a("tickse", this.actualTime);
        compound.func_74768_a("neededtime", this.neededTime);
        compound.func_74757_a("cangrowto", this.canGrowTo);
    }

    @Override
    public void func_70037_a(NBTTagCompound compound) {
        super.func_70037_a(compound);
        if (compound.func_150297_b("belongtors", 99)) {
            this.setRSSpawned(compound.func_74767_n("belongtors"));
        }
        if (compound.func_150297_b("tickse", 99)) {
            this.actualTime = compound.func_74762_e("tickse");
        }
        if (compound.func_150297_b("neededtime", 99)) {
            this.neededTime = compound.func_74762_e("neededtime");
        }
        if (compound.func_150297_b("cangrowto", 99)) {
            this.canGrowTo = compound.func_74767_n("cangrowto");
        }
    }

    @Override
    public void func_70103_a(byte id) {
        if (id == 12) {
            this.topParticles = 20;
        } else {
            super.func_70103_a(id);
        }
    }

    @SideOnly(value=Side.CLIENT)
    public void spawnParticlesTop(SRPEnumParticle particleType, int r, int g, int b) {
        double d0 = this.field_70146_Z.nextGaussian() * 0.02;
        double d1 = this.field_70146_Z.nextGaussian() * 0.02;
        double d2 = this.field_70146_Z.nextGaussian() * 0.02;
        ParticleSpawner.spawnParticle(particleType, this.field_70165_t + (double)(this.field_70146_Z.nextFloat() * this.field_70130_N * 2.0f) - (double)this.field_70130_N, this.field_70163_u + (double)this.field_70131_O + (double)this.field_70146_Z.nextFloat() * ((double)(this.field_70131_O - this.func_70047_e()) + 0.5), this.field_70161_v + (double)(this.field_70146_Z.nextFloat() * this.field_70130_N * 2.0f) - (double)this.field_70130_N, d0, d1, d2, r, g, b);
    }
}

