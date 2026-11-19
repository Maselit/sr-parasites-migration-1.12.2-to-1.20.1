/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.ai.RandomPositionGenerator
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.MobEffects
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.CooldownTracker
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.world.World
 *  net.minecraftforge.event.ForgeEventFactory
 */
package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.EntityScaryOrb;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIBlockLight;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.CooldownTracker;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public abstract class EntityPMalleable
extends EntityParasiteBase {
    private static final DataParameter<Byte> HIT = EntityDataManager.createKey(EntityPMalleable.class, (DataSerializer)DataSerializers.BYTE);
    private ArrayList<String> resistanceS = new ArrayList();
    private ArrayList<Integer> resistanceI = new ArrayList();
    protected int newDamageCooldown = 0;
    protected float pointReduction = 0.1f;
    protected int pointCap = 10;
    protected int DamageTypeCap = 5;
    protected double chanceLearn = 0.5;
    protected double chanceLearnFire = 0.0;
    private int onFireA;
    private int onProj;
    protected float adaptationCap = 1.0f;
    protected float regen = 0.0f;
    protected int regenEff = 1;
    protected int regenUse = 1;
    private int lastTimeDama;
    private int stun;
    public boolean colonySpawned;
    protected int fuseOrb;
    protected int orbStartTimer;
    protected int orbItemCool;
    private int orbVersionCooldown;
    protected double foodRott = 0.0;
    protected int foodRootNumber = 1;
    private int limitOrb;
    protected int borderOrb;
    private boolean skillOrb;

    public EntityPMalleable(World worldIn) {
        super(worldIn);
        if (SRPConfig.canTargetBlock) {
            this.tasks.addTask(7, (EntityAIBase)new EntityAIBlockLight(this, 20, 5));
        }
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(HIT, (Object)0);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (!this.world.isRemote) {
            if (this.srpTicks == 10) {
                if (this.isPotionActive(SRPPotions.RES_E)) {
                    this.removeAllResistance(1);
                }
                if (this.orbVersionCooldown > 0) {
                    --this.orbVersionCooldown;
                }
            }
            if (this.onFireA > 0) {
                --this.onFireA;
            }
            if (this.onProj > 0) {
                --this.onProj;
            }
            if (this.newDamageCooldown > 0) {
                --this.newDamageCooldown;
            }
            if (this.lastTimeDama > 0) {
                --this.lastTimeDama;
            } else if (!this.isDead && this.getHealth() > 0.0f && this.regen > 0.0f && this.killcount > 1.0 && this.getHealth() < this.getMaxHealth()) {
                this.setHealth(this.getHealth() + this.regen);
                --this.regenUse;
                if (this.regenUse <= 0) {
                    this.killcount -= 1.0;
                    this.regenUse = this.regenEff;
                }
            }
            if (this.stun >= 0) {
                --this.stun;
                if (this.stun < 0 && this.getParasiteStatus() == 25) {
                    this.setParasiteStatus(0);
                }
            }
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        String mobname;
        if (this.world.isRemote) {
            return false;
        }
        this.dataManager.set(HIT, (Object)0);
        if (SRPConfigSystems.useOneMind && source.getTrueSource() instanceof EntityLivingBase && ParasiteEventEntity.alertOthers(this, (EntityLivingBase)source.getTrueSource(), this.world, 3)) {
            this.addPotionEffect(new PotionEffect(SRPPotions.SENS_E, 300, 3, false, false));
        }
        if (source == DamageSource.OUT_OF_WORLD || source == DamageSource.IN_WALL) {
            return super.attackEntityFrom(source, amount);
        }
        if ((source == DamageSource.IN_FIRE || source == DamageSource.ON_FIRE) && this.rand.nextDouble() < this.chanceLearnFire) {
            this.onFireA = SRPConfig.fireTickWindow;
        }
        float times = 0.0f;
        times = source.getImmediateSource() instanceof EntityLivingBase ? (source.getImmediateSource() instanceof EntityPlayer ? (float)this.hasResistance(((EntityPlayer)source.getImmediateSource()).getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem().getRegistryName().toString(), (byte)1) : ((mobname = EntityList.getKey((Entity)source.getImmediateSource()).toString()) == null ? (float)this.hasResistance(source.getDamageType(), (byte)2) : (float)this.hasResistance(mobname, (byte)0))) : (source.getTrueSource() instanceof EntityLivingBase ? (source.getTrueSource() instanceof EntityPlayer ? (float)this.hasResistance(((EntityPlayer)source.getTrueSource()).getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem().getRegistryName().toString(), (byte)1) : ((mobname = EntityList.getKey((Entity)source.getTrueSource()).toString()) == null ? (float)this.hasResistance(source.getDamageType(), (byte)2) : (float)this.hasResistance(mobname, (byte)0))) : (float)this.hasResistance(source.getDamageType(), (byte)2));
        float bonus = times * this.pointReduction * amount;
        amount = Math.max(amount - bonus * this.adaptationCap, 0.0f);
        if (bonus != 0.0f && amount != 0.0f) {
            this.particleStatus((byte)9);
            this.particleStatus((byte)9);
        }
        if (amount == 0.0f) {
            this.particleStatus((byte)9);
            this.particleStatus((byte)9);
        }
        this.outOfRange(source);
        boolean flag = super.attackEntityFrom(source, amount);
        if (flag) {
            this.lastTimeDama = SRPConfig.regenTimer;
            switch (this.getHitStatus()) {
                case 1: {
                    this.playSound(SRPSounds.ADAPTATION_P, this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                    return flag;
                }
                case 2: {
                    this.playSound(SRPSounds.ADAPTATION_F, this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                    return flag;
                }
            }
        }
        return flag;
    }

    @Override
    protected boolean processInteract(EntityPlayer player, EnumHand hand) {
        if (this.world.isRemote) {
            return true;
        }
        Item wea = player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem();
        if (wea == SRPItems.itembase) {
            String out = "Current adaptation for " + EntityList.getKey((Entity)this).toString() + " (Damage type, points): ";
            for (int i = 0; i < this.resistanceS.size(); ++i) {
                out = out + "[" + this.resistanceS.get(i) + ", " + this.resistanceI.get(i) + "] ";
            }
            player.sendMessage((ITextComponent)new TextComponentString(out));
            return true;
        }
        return super.processInteract(player, hand);
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        if (this.borderOrb > 0) {
            return false;
        }
        boolean flag = super.attackEntityAsMob(entityIn);
        if (flag) {
            this.attackEntityAsMobFood(entityIn, true);
        }
        return flag;
    }

    public boolean attackEntityAsMobFood(Entity target, boolean hit) {
        if (this.rand.nextDouble() >= this.foodRott && hit) {
            return false;
        }
        if (!(target instanceof EntityPlayer)) {
            return false;
        }
        if (this.foodRootNumber <= 0) {
            return false;
        }
        EntityPlayer player = (EntityPlayer)target;
        if (player.capabilities.isCreativeMode) {
            return false;
        }
        for (int i = 0; i < player.inventory.mainInventory.size(); ++i) {
            if (!(((ItemStack)player.inventory.mainInventory.get(i)).getItem() instanceof ItemFood)) continue;
            int amm = this.rand.nextInt(this.foodRootNumber) + 1;
            ((ItemStack)player.inventory.mainInventory.get(i)).shrink(amm);
            ItemStack stack = new ItemStack(SRPItems.infected_drop, amm);
            EntityItem entityitem = new EntityItem(this.world, target.posX, target.posY, target.posZ, stack);
            entityitem.setDefaultPickupDelay();
            this.world.spawnEntity((Entity)entityitem);
            return true;
        }
        if (player.getItemStackFromSlot(EntityEquipmentSlot.OFFHAND).getItem() instanceof ItemFood) {
            int amm = this.rand.nextInt(this.foodRootNumber) + 1;
            player.getItemStackFromSlot(EntityEquipmentSlot.OFFHAND).shrink(amm);
            ItemStack stack = new ItemStack(SRPItems.infected_drop, amm);
            EntityItem entityitem = new EntityItem(this.world, target.posX, target.posY, target.posZ, stack);
            entityitem.setDefaultPickupDelay();
            this.world.spawnEntity((Entity)entityitem);
            return true;
        }
        return false;
    }

    public int hasResistance(String damage, byte type) {
        if (this.isPotionActive(SRPPotions.RES_E) || this.dead) {
            return 0;
        }
        if (this.checkList(damage, type)) {
            return 0;
        }
        if (this.DamageTypeCap <= 0) {
            return 0;
        }
        if (this.rand.nextDouble() < this.getChanceLearn()) {
            this.addResistance(damage);
        }
        for (int i = 0; i < this.resistanceS.size(); ++i) {
            if (!this.resistanceS.get(i).equals(damage)) continue;
            int dama = this.resistanceI.get(i);
            if (dama <= this.pointCap) {
                this.dataManager.set(HIT, (Object)1);
            } else {
                this.dataManager.set(HIT, (Object)2);
            }
            return Math.min(dama, this.pointCap);
        }
        return 0;
    }

    private double getChanceLearn() {
        double bonus = 0.0;
        if (SRPConfig.adaptationDimStrong.length > 0) {
            String[] here = new String[2];
            for (int i = 0; i < SRPConfig.adaptationDimStrong.length; ++i) {
                here = SRPConfigSystems.evolutionDimStart[i].split(";");
                int dim = Integer.parseInt(here[0]);
                double b = Double.parseDouble(here[1]);
                if (dim != this.world.provider.getDimension()) continue;
                bonus = b;
                break;
            }
        }
        return this.chanceLearn + this.chanceLearn * bonus;
    }

    public void addResistance(String damage) {
        if (this.onFireA > 0) {
            return;
        }
        if (this.newDamageCooldown > 0) {
            return;
        }
        boolean flag = true;
        for (int i = 0; i < this.resistanceS.size(); ++i) {
            if (!this.resistanceS.get(i).equals(damage)) continue;
            int iiii = this.resistanceI.get(i) + 1;
            this.resistanceI.set(i, iiii);
            flag = false;
            if (iiii > this.pointCap) break;
            this.particleStatus((byte)5);
            this.particleStatus((byte)5);
            break;
        }
        if (flag) {
            if (this.resistanceS.size() >= this.DamageTypeCap) {
                return;
            }
            this.resistanceS.add(damage);
            this.resistanceI.add(1);
            this.particleStatus((byte)5);
            this.particleStatus((byte)5);
        }
        this.newDamageCooldown = SRPConfig.adaptationNewDamageCooldon;
    }

    public void removeAllResistance(int value) {
        for (int i = 0; i < this.resistanceS.size(); ++i) {
            int iiii = this.resistanceI.get(i) - value;
            if (iiii <= 0) {
                this.resistanceI.remove(i);
                this.resistanceS.remove(i);
                continue;
            }
            this.resistanceI.set(i, iiii);
        }
    }

    public ArrayList<String> getResistanceS() {
        return this.resistanceS;
    }

    public ArrayList<Integer> getResistanceI() {
        return this.resistanceI;
    }

    public void copyResistancesFrom(EntityPMalleable in) {
        this.resistanceS = in.getResistanceS();
        this.resistanceI = in.getResistanceI();
    }

    public void increaseAllResistances() {
        for (int i = 0; i < this.resistanceI.size(); ++i) {
            int iiii = this.resistanceI.get(i) + 1;
            this.resistanceI.set(i, iiii);
        }
    }

    public void cutResistances(int in) {
        if (this.DamageTypeCap <= 0) {
            return;
        }
        this.stun += 40;
        this.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 40, 100, false, false));
        this.setParasiteStatus(25);
        this.playSound(SRPSounds.TENDRIL, 3.0f, 1.0f);
        if (SRPConfigSystems.rageEnable) {
            this.addPotionEffect(new PotionEffect(SRPPotions.RAGE_E, 200, 1, false, false));
        }
        SRPPotions.applyStackPotion(SRPPotions.BLEED_E, (EntityLivingBase)this, 100, 0);
        if (in % 2 != 0) {
            ++in;
        }
        this.DamageTypeCap -= in;
        if (this.resistanceI.size() != this.resistanceS.size()) {
            this.resistanceI = new ArrayList();
            this.resistanceS = new ArrayList();
            this.DamageTypeCap = 0;
            return;
        }
        int size = this.resistanceS.size() - in;
        if (size <= 0) {
            this.resistanceI = new ArrayList();
            this.resistanceS = new ArrayList();
            return;
        }
        while (in <= 0) {
            if (this.resistanceI.isEmpty()) {
                this.DamageTypeCap = 0;
                return;
            }
            if (this.resistanceI.size() == 0) {
                this.DamageTypeCap = 0;
                return;
            }
            this.resistanceI.remove(0);
            this.resistanceS.remove(0);
            --in;
        }
    }

    public void increaseDamageCap(int in) {
        this.DamageTypeCap += in;
    }

    private boolean checkList(String damage, byte type) {
        switch (type) {
            case 0: {
                if (ParasiteEventEntity.checkName(damage, SRPConfig.damageTypeBlackListMob, SRPConfig.damageTypeBlackListWhite)) {
                    return true;
                }
            }
            case 1: {
                if (ParasiteEventEntity.checkName(damage, SRPConfig.damageTypeBlackListItem, SRPConfig.damageTypeBlackListWhite)) {
                    return true;
                }
            }
            case 2: {
                if (!ParasiteEventEntity.checkName(damage, SRPConfig.damageTypeBlackListElse, SRPConfig.damageTypeBlackListWhite)) break;
                return true;
            }
        }
        return false;
    }

    private void outOfRange(DamageSource source) {
        if (this.getAttackTarget() == null) {
            Vec3d vec3d;
            if (source.getTrueSource() instanceof Entity) {
                Entity sss = source.getTrueSource();
                if (sss instanceof EntityPlayer) {
                    EntityPlayer pl = (EntityPlayer)sss;
                    if (pl.capabilities.disableDamage || pl.isSpectator()) {
                        return;
                    }
                }
                if (this.canEntityBeSeen(sss) && SRPPotions.applySense((EntityLivingBase)this, 600, this.getDistanceSq(sss), 50)) {
                    this.getNavigator().tryMoveToXYZ(sss.posX, sss.posY, sss.posZ, 1.3);
                }
            } else if (this.getNavigator().getPath() == null && (vec3d = RandomPositionGenerator.findRandomTargetBlockAwayFrom((EntityCreature)this, (int)16, (int)7, (Vec3d)new Vec3d(this.posX, this.posY, this.posZ))) != null && !this.getNavigator().tryMoveToXYZ(vec3d.x, vec3d.y, vec3d.z, 1.3) && (vec3d = RandomPositionGenerator.findRandomTargetBlockAwayFrom((EntityCreature)this, (int)16, (int)7, (Vec3d)new Vec3d(this.posX, this.posY, this.posZ))) != null && !this.getNavigator().tryMoveToXYZ(vec3d.x, vec3d.y, vec3d.z, 1.3) && this.ticksExisted % 20 == 0) {
                this.getNavigator().clearPath();
                double dd0 = vec3d.x - this.posX;
                double dd1 = vec3d.z - this.posZ;
                float f = MathHelper.sqrt((double)(dd0 * dd0 + dd1 * dd1));
                this.motionX += dd0 / (double)f * 1.0 * (double)0.8f + this.motionX * (double)0.2f;
                this.motionZ += dd1 / (double)f * 1.0 * (double)0.8f + this.motionZ * (double)0.2f;
                this.motionY = 0.15;
            }
        }
    }

    public byte getHitStatus() {
        return (Byte)this.dataManager.get(HIT);
    }

    public void setOrbVersionCooldown(int in) {
        this.orbVersionCooldown = in;
    }

    public String getMostCommonDamage() {
        if (this.isPotionActive(SRPPotions.RES_E)) {
            return null;
        }
        String atm = null;
        int times = 0;
        for (int i = 0; i < this.resistanceS.size(); ++i) {
            if (this.resistanceI.get(i) <= times) continue;
            times = this.resistanceI.get(i);
            atm = this.resistanceS.get(i);
        }
        return atm;
    }

    public void removeCommonDamage(String damage, int times) {
        for (int i = 0; i < this.resistanceS.size(); ++i) {
            if (!this.resistanceS.get(i).equals(damage)) continue;
            int neww = this.resistanceI.get(i) - times;
            if (neww <= 0) {
                this.resistanceS.remove(i);
                this.resistanceI.remove(i);
                continue;
            }
            this.resistanceI.set(i, neww);
        }
    }

    public boolean scaryOrbEffect(EntityLivingBase in, int totalMobs) {
        if (in instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)in;
            if (player.capabilities.isCreativeMode) {
                return false;
            }
            player.addExhaustion(this.foodSteal * (float)SRPConfig.orbFoodMult);
            if (this.orbItemCool > 0) {
                CooldownTracker track = player.getCooldownTracker();
                for (int i = 0; i < player.inventory.mainInventory.size(); ++i) {
                    if (track.getCooldown(((ItemStack)player.inventory.mainInventory.get(i)).getItem(), 1.0f) != 0.0f) continue;
                    track.setCooldown(((ItemStack)player.inventory.mainInventory.get(i)).getItem(), this.orbItemCool);
                }
            }
            this.attackEntityAsMobFood((Entity)player, false);
        } else {
            if (in == this) {
                return false;
            }
            ResourceLocation enti = EntityList.getKey((Entity)in);
            if (enti == null) {
                return false;
            }
            if (ParasiteEventEntity.checkName(enti.toString(), SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite)) {
                return false;
            }
        }
        in.addPotionEffect(new PotionEffect(SRPPotions.COTH_E, 1200, 3, false, false));
        return true;
    }

    @Override
    public void onDeath(DamageSource cause) {
        super.onDeath(cause);
        if (!this.world.isRemote) {
            ParasiteEventEntity.checkColony(this.world, cause, this);
        }
    }

    @Override
    protected void onDeathUpdateOG() {
        ++this.deathTime;
        if (this.deathTime == 20) {
            if (!this.world.isRemote && (this.isPlayer() || this.recentlyHit > 0 && this.canDropLoot() && this.world.getGameRules().getBoolean("doMobLoot"))) {
                int j;
                int i = this.getExperiencePoints(this.attackingPlayer);
                for (i = ForgeEventFactory.getExperienceDrop((EntityLivingBase)this, (EntityPlayer)this.attackingPlayer, (int)i); i > 0; i -= j) {
                    j = EntityXPOrb.getXPSplit((int)i);
                    this.world.spawnEntity((Entity)new EntityXPOrb(this.world, this.posX, this.posY, this.posZ, j));
                }
            }
            this.setDead();
            if (this.world.isRemote) {
                for (int k = 0; k < 20; ++k) {
                    this.spawnParticles(SRPEnumParticle.GCLOUD, 127, 0, 0);
                }
            }
        }
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setBoolean("paracolony", this.colonySpawned);
        if (this.resistanceS.size() != this.resistanceI.size()) {
            return;
        }
        NBTTagList allResS = new NBTTagList();
        NBTTagList allResI = new NBTTagList();
        for (int i = 0; i < this.resistanceS.size(); ++i) {
            String res = this.resistanceS.get(i);
            NBTTagCompound resT = new NBTTagCompound();
            resT.setString("resistance" + i, res);
            allResS.appendTag((NBTBase)resT);
            int resi = this.resistanceI.get(i);
            NBTTagCompound resU = new NBTTagCompound();
            resU.setInteger("resistance" + i, resi);
            allResI.appendTag((NBTBase)resU);
        }
        compound.setInteger("damagetypecap", this.DamageTypeCap);
        compound.setTag("sprresistances", (NBTBase)allResS);
        compound.setTag("sprresistancei", (NBTBase)allResI);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        if (compound.hasKey("paracolony", 99)) {
            this.colonySpawned = compound.getBoolean("paracolony");
        }
        if (compound.hasKey("damagetypecap", 99)) {
            this.DamageTypeCap = compound.getInteger("damagetypecap");
        }
        if (compound.hasKey("sprresistances")) {
            NBTTagList allResS = compound.getTagList("sprresistances", 10);
            NBTTagList allResI = compound.getTagList("sprresistancei", 10);
            if (allResS.tagCount() != allResI.tagCount()) {
                return;
            }
            for (int i = 0; i < allResS.tagCount(); ++i) {
                NBTTagCompound resT = allResS.getCompoundTagAt(i);
                String res = resT.getString("resistance" + i);
                this.resistanceS.add(i, res);
                NBTTagCompound resU = allResI.getCompoundTagAt(i);
                int resi = resU.getInteger("resistance" + i);
                this.resistanceI.add(i, resi);
            }
        }
    }

    @Override
    public boolean getFinished(byte attID) {
        switch (attID) {
            case 21: {
                return this.skillOrb;
            }
        }
        return super.getFinished(attID);
    }

    @Override
    public void setFinished(byte attID, boolean in) {
        switch (attID) {
            case 21: {
                this.skillOrb = in;
                return;
            }
        }
        super.setFinished(attID, in);
    }

    @Override
    public void doSpecialSkill(byte id) {
        switch (id) {
            case 21: {
                this.scaryOrb();
                return;
            }
        }
        super.doSpecialSkill(id);
    }

    private void scaryOrb() {
        if (this.borderOrb == -1 || this.orbVersionCooldown > 0 && this.borderOrb == 0) {
            this.skillOrb = true;
            return;
        }
        if (this.borderOrb == 0) {
            AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX + 1.0, this.posY + 1.0, this.posZ + 1.0).grow((double)(this.fuseOrb / 2 + 1));
            List moblist = this.world.getEntitiesWithinAABB(EntityPMalleable.class, axisalignedbb);
            for (EntityPMalleable mob : moblist) {
                if (mob == this || mob.getParasiteType() > this.getParasiteType()) continue;
                mob.setOrbVersionCooldown(4);
            }
        }
        this.setParasiteStatus(9);
        this.getNavigator().clearPath();
        if (this.ticksExisted % 20 != 0) {
            return;
        }
        ++this.borderOrb;
        if (this.borderOrb == 1) {
            EntityScaryOrb ttt = new EntityScaryOrb(this.world, this, this.fuseOrb, this.orbStartTimer);
            ttt.copyLocationAndAnglesFrom((Entity)this);
            this.world.spawnEntity((Entity)ttt);
            this.playSound(SRPSounds.ORB_S, 1.0f, 1.0f);
        }
        if (this.borderOrb > 3) {
            this.skillOrb = true;
            this.setParasiteStatus(0);
            this.borderOrb = 0;
            this.limitOrb = 0;
        }
    }
}

