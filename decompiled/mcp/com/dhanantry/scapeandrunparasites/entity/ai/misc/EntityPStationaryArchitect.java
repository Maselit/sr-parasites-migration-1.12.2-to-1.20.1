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
        return this.rand.nextInt(atm) + minGrowTime;
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
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.topParticles > 0) {
            --this.topParticles;
        }
        this.freeDead();
        if (this.bombC > 0) {
            --this.bombC;
        }
    }

    @Override
    protected boolean processInteract(EntityPlayer player, EnumHand hand) {
        Item wea = player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem();
        if (wea == SRPItems.itemEvolve) {
            this.canChangeVariant = true;
            this.setActualT(100000000);
            this.setActualT(100000000);
        }
        return super.processInteract(player, hand);
    }

    protected void freeDead() {
        if (!this.world.isRemote && this.isDead) {
            int meta;
            BlockPos floor;
            World world;
            Block bbb;
            if (!(!this.convert && this.getRSChance(this.phaseCreated) != 0.0 || (bbb = (world = this.world).getBlockState(floor = new BlockPos((Entity)this).down()).getBlock()) != SRPBlocks.InfestedStain && bbb != SRPBlocks.InfestedRubble || ((meta = bbb.getMetaFromState(world.getBlockState(floor))) > SRPConfigSystems.rsBlockRevertStage || meta > this.stage) && this.getRSChance(this.phaseCreated) != 0.0)) {
                this.world.setBlockState(floor, SRPBlocks.InfestedStain.getDefaultState().withProperty((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(5)));
                world.updateBlockTick(floor, SRPBlocks.InfestedStain.getDefaultState().withProperty((IProperty)BlockInfestedStain.STAGE, (Comparable)Integer.valueOf(5)).getBlock(), 40, 5);
            }
            if (this.rsSpawned) {
                SRPWorldData data = SRPWorldData.get(this.world);
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
    public boolean canDespawn() {
        if (this.world.getBiome(this.getPosition()) instanceof BiomeParasite) {
            return true;
        }
        return super.canDespawn();
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        float red = this.getParasiteStatus() == 0 ? 0.4f : 1.0f;
        boolean flag = super.attackEntityFrom(source, amount * red);
        if (flag && this.bombC == 0 && source != DamageSource.OUT_OF_WORLD) {
            if (source.getTrueSource() instanceof EntityLivingBase) {
                if (source.getTrueSource().getDistanceSq((Entity)this) > 36.0) {
                    return flag;
                }
            } else {
                return flag;
            }
            for (int i = 0; i < this.stage * 2; ++i) {
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
                d3 *= (d7 *= (double)(this.world.rand.nextFloat() * this.world.rand.nextFloat() + 0.65f));
                d4 = d4 * d7 * (double)this.stage * 3.0;
                d5 *= d7;
                EntityBomb bomb = new EntityBomb(this.world, this, false);
                bomb.setFuse(60);
                bomb.setStren(0.0f);
                bomb.setSkin(1);
                bomb.setDamage(this.getBombDamage(), this.stage);
                bomb.rotationPitch -= -20.0f;
                bomb.copyLocationAndAnglesFrom((Entity)this);
                bomb.setMotion(d3, d4, d5, 0.35, (float)this.stage / 10.0f * 2.0f);
                this.world.spawnEntity((Entity)bomb);
                bomb.updateSTR();
            }
            this.bombC = 80;
        }
        return flag;
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setBoolean("belongtors", this.getRSSpawned());
        compound.setInteger("tickse", this.actualTime);
        compound.setInteger("neededtime", this.neededTime);
        compound.setBoolean("cangrowto", this.canGrowTo);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        if (compound.hasKey("belongtors", 99)) {
            this.setRSSpawned(compound.getBoolean("belongtors"));
        }
        if (compound.hasKey("tickse", 99)) {
            this.actualTime = compound.getInteger("tickse");
        }
        if (compound.hasKey("neededtime", 99)) {
            this.neededTime = compound.getInteger("neededtime");
        }
        if (compound.hasKey("cangrowto", 99)) {
            this.canGrowTo = compound.getBoolean("cangrowto");
        }
    }

    @Override
    public void handleStatusUpdate(byte id) {
        if (id == 12) {
            this.topParticles = 20;
        } else {
            super.handleStatusUpdate(id);
        }
    }

    @SideOnly(value=Side.CLIENT)
    public void spawnParticlesTop(SRPEnumParticle particleType, int r, int g, int b) {
        double d0 = this.rand.nextGaussian() * 0.02;
        double d1 = this.rand.nextGaussian() * 0.02;
        double d2 = this.rand.nextGaussian() * 0.02;
        ParticleSpawner.spawnParticle(particleType, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, this.posY + (double)this.height + (double)this.rand.nextFloat() * ((double)(this.height - this.getEyeHeight()) + 0.5), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, d0, d1, d2, r, g, b);
    }
}

