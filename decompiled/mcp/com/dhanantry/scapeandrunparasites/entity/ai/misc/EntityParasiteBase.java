/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 *  net.minecraft.advancements.CriteriaTriggers
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockEndGateway
 *  net.minecraft.block.BlockEndPortalFrame
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.BlockPortal
 *  net.minecraft.block.SoundType
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.EnumCreatureType
 *  net.minecraft.entity.IEntityLivingData
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.EntityAIBase
 *  net.minecraft.entity.item.EntityBoat
 *  net.minecraft.entity.item.EntityMinecart
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.passive.EntityVillager
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.init.MobEffects
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemShield
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.pathfinding.PathNavigateFlying
 *  net.minecraft.pathfinding.PathNavigateGround
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.stats.StatList
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.DifficultyInstance
 *  net.minecraft.world.EnumDifficulty
 *  net.minecraft.world.EnumSkyBlock
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraft.world.biome.Biome
 *  net.minecraftforge.event.ForgeEventFactory
 *  net.minecraftforge.fml.common.eventhandler.Event$Result
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.block.IMetaName;
import com.dhanantry.scapeandrunparasites.client.particle.ParticleSpawner;
import com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle;
import com.dhanantry.scapeandrunparasites.entity.EntityToxicCloud;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAINearestAttackableTargetStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIParasiteFollow;
import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIWanderStatus;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPDispatcher;
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityGore;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.init.SRPItems;
import com.dhanantry.scapeandrunparasites.init.SRPPotions;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.item.tool.WeaponToolMeleeBase;
import com.dhanantry.scapeandrunparasites.item.tool.WeaponToolRangeBase;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEndGateway;
import net.minecraft.block.BlockEndPortalFrame;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateFlying;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityParasiteBase
extends EntityMob {
    protected double killcount = 0.0;
    protected boolean canD = true;
    private int waitInt;
    private boolean canWorkTask;
    private EntityParasiteBase owner;
    private EntityParasiteBase notOwner;
    public boolean canChangeVariant = false;
    private static final DataParameter<Byte> SPECIAL = EntityDataManager.createKey(EntityParasiteBase.class, (DataSerializer)DataSerializers.BYTE);
    private static final DataParameter<Integer> SELFE = EntityDataManager.createKey(EntityParasiteBase.class, (DataSerializer)DataSerializers.VARINT);
    private static final DataParameter<Byte> SKIN = EntityDataManager.createKey(EntityParasiteBase.class, (DataSerializer)DataSerializers.BYTE);
    private static final DataParameter<Boolean> COLD_L = EntityDataManager.createKey(EntityParasiteBase.class, (DataSerializer)DataSerializers.BOOLEAN);
    protected int srpTicks;
    protected int lastActiveTime;
    protected int timeSinceIgnited;
    protected int fuseTime = 40;
    protected byte canModRender = 0;
    protected int attackCooldown;
    private byte madeRng = (byte)-1;
    private boolean spawnedByColo;
    protected byte type = 0;
    protected int damageCap = 1;
    protected float MiniDamage = 0.0f;
    protected float miniCap;
    protected boolean miniCapA = false;
    protected byte phaseCreated;
    protected EntityAIJumping jumpT = new EntityAIJumping((EntityLiving)this);
    protected EntityAIWait wait = new EntityAIWait();
    protected EntityAIParasiteFollow folow = new EntityAIParasiteFollow(this, 1.3, 16.0, 6.0, true);
    protected EntityAIWanderStatus aiWander = new EntityAIWanderStatus(this, 1.0, 0.001f, true);
    protected int oneMindDeathValue;
    protected float foodSteal;
    private float aniticks;
    private boolean still;
    private int stillTicks;
    private int canBeStored;
    private int dodFatherID = 0;
    public boolean canSpawnSpawn;
    protected int valueEvDeath;
    protected int liquidLeap;
    protected float blockH;
    protected int BGheight;
    protected int BGrange;
    protected boolean SkillBGflag;
    private ArrayList<String> inbBlockName = new ArrayList();
    private ArrayList<Integer> inbBlockNumber = new ArrayList();
    protected int attacking;
    protected double targetX;
    protected double targetZ;
    protected float leapMotionY;
    protected double jumpSpeed;
    protected int jumpR;
    protected boolean SkillLeapFlag;

    public EntityParasiteBase(World worldIn) {
        super(worldIn);
        this.tasks.addTask(0, (EntityAIBase)this.wait);
        this.tasks.addTask(5, (EntityAIBase)this.aiWander);
        this.tasks.addTask(6, (EntityAIBase)this.folow);
        this.tasks.addTask(5, (EntityAIBase)this.jumpT);
        this.canBeStored = 0;
        this.attackCooldown = 0;
        this.canWorkTask = true;
        this.srpTicks = 0;
        this.madeRng = (byte)-1;
        this.foodSteal = 0.001f;
        this.spawnedByColo = false;
        this.SkillBGflag = false;
        this.SkillLeapFlag = false;
        this.canChangeVariant = false;
        this.oneMindDeathValue = 1;
        this.canSpawnSpawn = true;
        this.still = false;
        this.miniCap = SRPConfig.miniminiCap;
    }

    public void setCreatedPhase(byte in) {
        this.phaseCreated = in;
    }

    public abstract int getParasiteIDRegister();

    public void applyBonuses(int colony, int node, byte phase) {
        if (this.spawnedByColo) {
            return;
        }
        this.phaseCreated = phase;
        if (this.phaseCreated >= SRPConfigSystems.evolutionAssimilatedDehiding) {
            this.targetTasks.addTask(5, new EntityAINearestAttackableTargetStatus<EntityVillager>(this, EntityVillager.class, true));
        }
        if (this.phaseCreated >= SRPConfigSystems.evolutionTotalKill) {
            this.targetTasks.addTask(4, new EntityAINearestAttackableTargetStatus<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, new Predicate<EntityLivingBase>(){

                public boolean apply(@Nullable EntityLivingBase entity) {
                    return !(entity instanceof EntityPlayer) && !ParasiteEventEntity.checkEntity(entity, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite);
                }
            }, SRPConfig.adaptedSneakPen, SRPConfig.adaptedInviPen));
        }
        this.setColonyBonus(colony);
        this.setNodeBonus(node);
        this.spawnedByColo = true;
    }

    protected void setColonyBonus(int totalColonyPoints) {
        if (totalColonyPoints == 0) {
            return;
        }
        double bonus = (float)totalColonyPoints / SRPConfigWorld.colonyExtraHealthPoint * SRPConfigWorld.colonyExtraHealthValue;
        double currentV = this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(currentV + currentV * bonus);
        this.setHealth((float)this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue());
        bonus = (float)totalColonyPoints / SRPConfigWorld.colonyExtraArmorPoint * SRPConfigWorld.colonyExtraArmorValue;
        currentV = this.getEntityAttribute(SharedMonsterAttributes.ARMOR).getBaseValue();
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(currentV + currentV * bonus);
        bonus = (float)totalColonyPoints / SRPConfigWorld.colonyExtraDamagePoint * SRPConfigWorld.colonyExtraDamageValue;
        currentV = this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getBaseValue();
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(currentV + currentV * bonus);
        bonus = (float)totalColonyPoints / SRPConfigWorld.colonyExtraKDResPoint * SRPConfigWorld.colonyExtraKDResValue;
        currentV = this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).getBaseValue();
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(currentV + currentV * bonus);
        bonus = (float)totalColonyPoints / SRPConfigWorld.colonyDamageCapPoint * SRPConfigWorld.colonyDamageCapValue;
        this.damageCap = (int)((double)this.damageCap + (double)this.damageCap * bonus);
    }

    protected void setNodeBonus(int totalPoints) {
        if (totalPoints == 0) {
            return;
        }
        String[] here = new String[3];
        for (String i : SRPConfigWorld.potionEffectForNodes) {
            here = i.split(";");
            int level = Integer.parseInt(here[0]);
            if (totalPoints < level) continue;
            int amp = Integer.parseInt(here[2]);
            Potion potion = Potion.getPotionFromResourceLocation((String)here[1]);
            if (potion == null) continue;
            this.addPotionEffect(new PotionEffect(potion, 7777, amp));
        }
    }

    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(SPECIAL, (Object)0);
        this.dataManager.register(SELFE, (Object)-1);
        this.dataManager.register(SKIN, (Object)0);
        this.dataManager.register(COLD_L, (Object)false);
    }

    public void cannotDespawn(boolean in) {
        this.canD = in;
    }

    public boolean canDespawn() {
        return this.canD;
    }

    public void setApplyColonyB(boolean in) {
        this.spawnedByColo = in;
    }

    public boolean getApplyColonyB() {
        return this.spawnedByColo;
    }

    public void onLivingUpdate() {
        ++this.srpTicks;
        if (this.isAIDisabled()) {
            return;
        }
        if (this.getWait() > 0) {
            int j1 = this.getWait() - 1;
            if (j1 == 0) {
                this.setParasiteStatus(0);
            }
            this.setWait(j1);
        } else {
            super.onLivingUpdate();
        }
        if (!this.world.isRemote) {
            byte k = this.getParasiteStatus();
            if (this.getAttackCooldownAni() != 0 || k == 1 || k == 2) {
                if (this.getAttackCooldownAni() != 0) {
                    int i = this.getAttackCooldownAni() - 1;
                    this.setAttackCooldownAni(i);
                }
                if (k == 1 || k == 2) {
                    if (this.getAttackTarget() != null) {
                        if (!this.getAttackTarget().isEntityAlive()) {
                            this.setAttackTarget(null);
                            this.setParasiteStatus(0);
                        }
                    } else {
                        this.setParasiteStatus(0);
                        this.setAttackTarget(null);
                    }
                }
            }
            if (this.srpTicks % 15 == 0 && this.world.getBlockState(this.getPosition()).getBlock() instanceof BlockLiquid && this.getAttackTarget() != null) {
                ++this.liquidLeap;
                if (this.liquidLeap > 4) {
                    this.liquidLeap = 4;
                }
            }
            if (this.srpTicks > 20) {
                this.srpTicks = 0;
                if (!this.inbBlockName.isEmpty() && this.rand.nextInt(50) == 0) {
                    this.spawnCyst();
                }
                if (this.getAttackTarget() instanceof EntityPlayer) {
                    this.fearPlayer(this.getAttackTarget());
                }
                if (SRPConfigSystems.useEvolution && this.killcount >= 0.0) {
                    switch (this.phaseCreated) {
                        case 1: {
                            this.killcount += SRPConfigSystems.phaseKillCountPlusOne;
                            break;
                        }
                        case 2: {
                            this.killcount += SRPConfigSystems.phaseKillCountPlusTwo;
                            break;
                        }
                        case 3: {
                            this.killcount += SRPConfigSystems.phaseKillCountPlusThree;
                            break;
                        }
                        case 4: {
                            this.killcount += SRPConfigSystems.phaseKillCountPlusFour;
                            break;
                        }
                        case 5: {
                            this.killcount += SRPConfigSystems.phaseKillCountPlusFive;
                            break;
                        }
                        case 6: {
                            this.killcount += SRPConfigSystems.phaseKillCountPlusSix;
                            break;
                        }
                        case 7: {
                            this.killcount += SRPConfigSystems.phaseKillCountPlusSeven;
                            break;
                        }
                        case 8: {
                            this.killcount += SRPConfigSystems.phaseKillCountPlusEight;
                        }
                    }
                } else if (this.world.getDifficulty() == EnumDifficulty.HARD && this.killcount >= 0.0) {
                    this.killcount += SRPConfig.killcountplus;
                }
                this.placeNidus();
            }
            if (this.liquidLeap >= 1) {
                double h = 0.1;
                double str = 0.5;
                this.getNavigator().clearPath();
                EntityLivingBase entitylivingbase = this.getAttackTarget();
                if (entitylivingbase != null) {
                    Block bl = this.world.getBlockState(this.getPosition()).getBlock();
                    if (!bl.isPassable((IBlockAccess)this.world, this.getPosition())) {
                        h = 0.3;
                        str = 1.0;
                    }
                    --this.liquidLeap;
                    double dd0 = entitylivingbase.posX - this.posX;
                    double dd1 = entitylivingbase.posZ - this.posZ;
                    float f = MathHelper.sqrt((double)(dd0 * dd0 + dd1 * dd1));
                    this.motionX += dd0 / (double)f * str * (double)0.8f + this.motionX * (double)0.2f;
                    this.motionZ += dd1 / (double)f * str * (double)0.8f + this.motionZ * (double)0.2f;
                    this.motionY = h;
                    this.getLookHelper().setLookPosition(entitylivingbase.posX, entitylivingbase.posY + (double)entitylivingbase.getEyeHeight(), entitylivingbase.posZ, 10.0f, 40.0f);
                }
            }
        } else if (this.srpTicks > 20) {
            this.srpTicks = 0;
        }
        if (this.posX == this.prevPosX && this.posZ == this.prevPosZ) {
            ++this.stillTicks;
        } else {
            this.canBeStored = 55;
            this.stillTicks = 0;
            this.still = false;
        }
        if (this.stillTicks > 25) {
            this.still = true;
        }
        this.aniticks = this.still ? (this.aniticks += 0.0012f) : 0.0f;
        if (this.canBeStored > 0) {
            --this.canBeStored;
        }
    }

    protected void fearPlayer(EntityLivingBase player) {
    }

    protected void placeNidus() {
        if (SRPConfigSystems.useEvolution && this.phaseCreated <= 0) {
            return;
        }
        if (this.world.rand.nextInt(350) != 0 || this.type < 11) {
            return;
        }
        if (this.killcount < 10.0) {
            return;
        }
        AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX + 1.0, this.posY + 1.0, this.posZ + 1.0).grow(SRPConfig.nexussivFollow);
        List moblist = this.world.getEntitiesWithinAABB(EntityParasiteBase.class, axisalignedbb);
        int collec = 0;
        for (EntityParasiteBase mob : moblist) {
            int idP = mob.getParasiteIDRegister();
            if (idP == 73 || idP == 77 || idP == 78 || idP == 79) {
                return;
            }
            collec = (int)((double)collec + mob.getKillC());
        }
        if (collec < SRPConfig.reinforcerNidusStart) {
            return;
        }
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
        bomb.setType((byte)11);
        bomb.copyLocationAndAnglesFrom((Entity)this);
        bomb.setMotion(d3 *= (d7 *= (double)(this.world.rand.nextFloat() * this.world.rand.nextFloat() + 0.3f)), d4, d5 *= d7, 0.1, 0.5);
        this.world.spawnEntity((Entity)bomb);
    }

    public void setDodFatherID(int in) {
        this.dodFatherID = in;
    }

    protected void updateAITasks() {
        super.updateAITasks();
        if (this.getWait() > 0) {
            int j1 = this.getWait() - 1;
            if (j1 == 0) {
                this.setParasiteStatus(0);
            }
            this.setWait(j1);
        }
    }

    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (this.world.isRemote) {
            return false;
        }
        this.canBeStored = 55;
        if (this.madeRng == -1) {
            this.madeRng = (byte)this.rand.nextInt(2);
            if (this.madeRng == 0) {
                this.world.setEntityState((Entity)this, (byte)40);
            }
        }
        if (source == DamageSource.OUT_OF_WORLD) {
            return super.attackEntityFrom(source, amount);
        }
        if (source == DamageSource.IN_WALL) {
            this.skillBreakBlocks();
        }
        if (source.getImmediateSource() != null && source.getImmediateSource() instanceof EntityPlayer && ((EntityPlayer)source.getTrueSource()).getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem() instanceof WeaponToolMeleeBase) {
            super.attackEntityFrom(source, amount);
        }
        if (source == DamageSource.IN_FIRE || source == DamageSource.ON_FIRE) {
            if (!this.isImmuneToFire) {
                if (this.rand.nextInt(5) == 0 && !this.isPotionActive(SRPPotions.RAGE_E)) {
                    this.addPotionEffect(new PotionEffect(SRPPotions.RAGE_E, 200, 1, false, false));
                }
                super.attackEntityFrom(source, this.getSkin() == 120 ? amount * (SRPConfig.firemultyplier - SRPConfig.firemultyplier / 2.0f) : amount * SRPConfig.firemultyplier);
            } else {
                return false;
            }
        }
        if (this.notOwner != null) {
            if (this.notOwner.isEntityAlive()) {
                if (this.isPotionActive(SRPPotions.PIVOT_E)) {
                    this.notOwner.attackEntityFrom(source, amount * (float)(this.getActivePotionEffect(SRPPotions.PIVOT_E).getAmplifier() + 1) * SRPConfigSystems.pivotDamageRHost);
                    return super.attackEntityFrom(source, amount * SRPConfigSystems.pivotDamageRNotHost);
                }
                this.removePotionEffect(SRPPotions.PIVOT_E);
                this.notOwner = null;
            } else {
                this.notOwner = null;
            }
        }
        boolean flagWeak = SRPConfig.parasiteWeakToMobs.length > 0 || SRPConfig.parasiteWeakToItems.length > 0 || SRPConfig.parasiteWeakToElse.length > 0;
        boolean flagCap = this.damageCap > 1;
        String damageName = "";
        int naniDesu = 0;
        if (flagWeak || flagCap) {
            if (source.getImmediateSource() instanceof EntityPlayer) {
                damageName = ((EntityPlayer)source.getTrueSource()).getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem().getRegistryName().toString();
                naniDesu = 1;
            } else if (source.getImmediateSource() instanceof EntityLivingBase) {
                damageName = EntityList.getKey((Entity)source.getImmediateSource()).toString();
                naniDesu = 2;
            } else {
                damageName = source.damageType;
                naniDesu = 3;
            }
        }
        if (flagWeak) {
            switch (naniDesu) {
                case 1: {
                    int i;
                    for (i = 0; i < SRPConfig.parasiteWeakToItems.length; ++i) {
                        String[] here;
                        if (SRPConfig.parasiteWeakToItems[i] == null || !(here = SRPConfig.parasiteWeakToItems[i].split(";"))[0].equals(damageName)) continue;
                        amount *= Float.parseFloat(here[1]);
                    }
                    break;
                }
                case 2: {
                    int i;
                    for (i = 0; i < SRPConfig.parasiteWeakToMobs.length; ++i) {
                        String[] here;
                        if (SRPConfig.parasiteWeakToMobs[i] == null || !(here = SRPConfig.parasiteWeakToMobs[i].split(";"))[0].equals(damageName)) continue;
                        amount *= Float.parseFloat(here[1]);
                    }
                    break;
                }
                case 3: {
                    int i;
                    for (i = 0; i < SRPConfig.parasiteWeakToElse.length; ++i) {
                        String[] here;
                        if (SRPConfig.parasiteWeakToElse[i] == null || !(here = SRPConfig.parasiteWeakToElse[i].split(";"))[0].equals(damageName)) continue;
                        amount *= Float.parseFloat(here[1]);
                    }
                    break;
                }
            }
        }
        if (flagCap) {
            switch (naniDesu) {
                case 1: {
                    if (!ParasiteEventEntity.checkName(damageName, SRPConfig.damageCapBlackListItem, SRPConfig.damageCapBlackListWhite)) break;
                    return super.attackEntityFrom(source, amount);
                }
                case 2: {
                    if (!ParasiteEventEntity.checkName(damageName, SRPConfig.damageCapBlackListMob, SRPConfig.damageCapBlackListWhite)) break;
                    return super.attackEntityFrom(source, amount);
                }
                case 3: {
                    if (!ParasiteEventEntity.checkName(damageName, SRPConfig.damageCapBlackListElse, SRPConfig.damageCapBlackListWhite)) break;
                    return super.attackEntityFrom(source, amount);
                }
            }
            float damage = this.getMaxHealth() / (float)this.damageCap + this.getMaxHealth() % (float)this.damageCap * 0.5f;
            if (amount >= damage) {
                source.setDamageBypassesArmor();
                if (!this.isPotionActive(SRPPotions.RAGE_E)) {
                    this.addPotionEffect(new PotionEffect(SRPPotions.RAGE_E, 200, 1, false, false));
                }
            }
            return super.attackEntityFrom(source, Math.min(amount, damage));
        }
        if (SRPConfigSystems.useOneMind && source.getImmediateSource() instanceof EntityLivingBase && this.getAttackTarget() == source.getImmediateSource()) {
            ParasiteEventEntity.alertOthers(this, this.getAttackTarget(), this.world, 3);
        }
        return super.attackEntityFrom(source, amount);
    }

    public boolean attackEntityAsMob(Entity entityIn) {
        boolean flag;
        if (this.world.isRemote) {
            return false;
        }
        this.canBeStored = 55;
        boolean green = entityIn instanceof EntityLivingBase;
        if (green) {
            this.attackEntityAsMobMinimum((EntityLivingBase)entityIn);
        }
        if (flag = super.attackEntityAsMob(entityIn)) {
            if (this.getSkin() == 120) {
                SRPPotions.applyStackPotion(MobEffects.SLOWNESS, (EntityLivingBase)entityIn, 100, 1);
            }
            if (green) {
                this.setAttackCooldownAni(100);
                if (SRPConfigSystems.useOneMind) {
                    ParasiteEventEntity.alertOthers(this, (EntityLivingBase)entityIn, this.world, 3);
                }
            }
        }
        return flag;
    }

    public boolean attackEntityAsMobMinimum(EntityLivingBase target) {
        if (this.MiniDamage == 0.0f) {
            return false;
        }
        float f1 = target.getHealth();
        if (f1 <= 0.0f || f1 <= this.miniCap && this.miniCapA) {
            return false;
        }
        if (target instanceof EntityPlayer) {
            ItemStack itemstack1;
            EntityPlayer entityplayer = (EntityPlayer)target;
            if (entityplayer.capabilities.isCreativeMode) {
                return false;
            }
            entityplayer.addExhaustion(this.foodSteal);
            ItemStack itemStack = itemstack1 = entityplayer.isHandActive() ? entityplayer.getActiveItemStack() : ItemStack.EMPTY;
            if (itemstack1.getItem() instanceof ItemShield && entityplayer.isActiveItemStackBlocking() && !entityplayer.getCooldownTracker().hasCooldown(itemstack1.getItem())) {
                float f12 = 0.25f + (float)EnchantmentHelper.getEfficiencyModifier((EntityLivingBase)this) * 0.05f;
                if (this.rand.nextFloat() < f12 && this.type >= 31) {
                    entityplayer.getCooldownTracker().setCooldown(itemstack1.getItem(), 100);
                    this.world.setEntityState((Entity)entityplayer, (byte)30);
                }
                this.damageShield(this.MiniDamage);
                return true;
            }
        }
        DamageSource s = DamageSource.causeMobDamage((EntityLivingBase)this);
        float damage = 0.0f;
        if (target.isPotionActive(SRPPotions.VIRA_E)) {
            damage = this.MiniDamage * (float)(target.getActivePotionEffect(SRPPotions.VIRA_E).getAmplifier() + 1);
        }
        damage += this.MiniDamage;
        try {
            if (target.getCombatTracker() != null && s != null) {
                target.getCombatTracker().trackDamage(s, f1, damage);
            }
        }
        catch (Exception f12) {
            // empty catch block
        }
        if (target.getAbsorptionAmount() > 0.0f) {
            target.setHealth(f1 - damage / 2.0f);
            target.setAbsorptionAmount(target.getAbsorptionAmount() - damage / 2.0f);
        } else {
            target.setHealth(f1 - damage);
        }
        this.world.setEntityState((Entity)target, (byte)2);
        if (target.getHealth() <= 0.0f) {
            ItemStack itemstack = null;
            for (EnumHand enumhand : EnumHand.values()) {
                ItemStack itemstack1 = target.getHeldItem(enumhand);
                if (itemstack1.getItem() != Items.TOTEM_OF_UNDYING) continue;
                itemstack = itemstack1.copy();
                itemstack1.shrink(1);
                break;
            }
            if (itemstack != null) {
                if (target instanceof EntityPlayerMP) {
                    EntityPlayerMP entityplayermp = (EntityPlayerMP)target;
                    entityplayermp.addStat(StatList.getObjectUseStats((Item)Items.TOTEM_OF_UNDYING));
                    CriteriaTriggers.USED_TOTEM.trigger(entityplayermp, itemstack);
                }
                target.setHealth(1.0f);
                target.clearActivePotions();
                target.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 900, 1));
                target.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 100, 1));
                target.world.setEntityState((Entity)target, (byte)35);
            } else {
                target.onDeath(s);
                this.killcount += 1.0;
            }
        }
        return true;
    }

    public void onKillEntity(EntityLivingBase entityLivingIn) {
        if (this.world.isRemote) {
            return;
        }
        if (this.killcount >= 0.0) {
            if (this.getSkin() != 120) {
                this.killcount += 1.0;
            } else if (this.rand.nextInt(3) == 0) {
                this.killcount += 1.0;
            }
        }
        if (SRPConfigSystems.useEvolution) {
            if (this.isPotionActive(SRPPotions.PIVOT_E)) {
                int amp = this.getActivePotionEffect(SRPPotions.PIVOT_E).getAmplifier();
                SRPSaveData.get(this.world).setTotalKills(this.world.provider.getDimension(), SRPConfigSystems.valueKill * (SRPConfigSystems.pivotPointMultiplier * (amp + 1)), true, this.world, true);
            } else {
                SRPSaveData.get(this.world).setTotalKills(this.world.provider.getDimension(), SRPConfigSystems.valueKill, true, this.world, true);
            }
        }
        if (entityLivingIn.isPotionActive(SRPPotions.COTH_E) && this.rand.nextDouble() < (double)SRPConfigSystems.cothConvert) {
            ParasiteEventEntity.convertEntity(entityLivingIn, entityLivingIn.getEntityData(), true, SRPConfigSystems.COTHVictimParasite);
        }
        this.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 80, 0, false, false));
        this.setWait(10);
    }

    public boolean isPotionApplicable(PotionEffect potioneffectIn) {
        Potion potion = potioneffectIn.getPotion();
        if (potion == MobEffects.POISON || potion == SRPPotions.COTH_E || potion == SRPPotions.VIRA_E || potion == SRPPotions.CORRO_E || potion == SRPPotions.DLER_E) {
            return false;
        }
        return super.isPotionApplicable(potioneffectIn);
    }

    protected boolean canBeRidden(Entity entityIn) {
        if (entityIn instanceof EntityBoat || entityIn instanceof EntityMinecart) {
            return false;
        }
        return super.canBeRidden(entityIn);
    }

    public boolean canAttackClass(Class<? extends EntityLivingBase> cls) {
        if (cls == EntityPlayer.class || cls == EntityPlayerMP.class) {
            return true;
        }
        String name = null;
        try {
            name = EntityList.getKey(cls).toString();
        }
        catch (Exception e) {
            return true;
        }
        if (name == null) {
            return true;
        }
        if (name.contains("srparasites")) {
            return false;
        }
        return !SRPConfig.mobAttackingFull || !ParasiteEventEntity.checkName(name, SRPConfig.mobattackingBlackList, SRPConfig.mobattackingBlackListWhite);
    }

    public boolean isCreatureType(EnumCreatureType type, boolean forSpawnCount) {
        if (forSpawnCount) {
            return false;
        }
        if (this instanceof EntityLiving && this.isNoDespawnRequired()) {
            return false;
        }
        return type.getCreatureClass().isAssignableFrom(((Object)((Object)this)).getClass());
    }

    protected boolean processInteract(EntityPlayer player, EnumHand hand) {
        if (!this.world.isRemote) {
            Item wea = player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem();
            if (wea == SRPItems.itemEvolve) {
                this.killcount += 1.0E9;
                this.killcount += 1.0E9;
                this.killcount += 1.0E9;
            } else if (wea == SRPItems.itemDevolve) {
                this.canChangeVariant = true;
                this.onDeath(DamageSource.GENERIC);
                this.setDead();
            } else if (wea == SRPItems.itemVariant) {
                this.canChangeVariant = true;
                this.onInitialSpawn(this.world.getDifficultyForLocation(new BlockPos((Entity)this)), null);
                this.canChangeVariant = false;
            }
        }
        return super.processInteract(player, hand);
    }

    public int canBeStored() {
        return this.canBeStored;
    }

    public int getSelfeState() {
        return (Integer)this.dataManager.get(SELFE);
    }

    public void setSelfeState(int state) {
        this.dataManager.set(SELFE, (Object)state);
    }

    public float getMiniDamage() {
        return this.MiniDamage;
    }

    public int getLLeap() {
        return this.liquidLeap;
    }

    public void setWorkTask(boolean in) {
        this.canWorkTask = in;
    }

    public boolean shouldWorkTask() {
        return this.canWorkTask;
    }

    public void setParasiteToFollow(@Nullable EntityParasiteBase in) {
        this.owner = in;
    }

    public EntityParasiteBase getParasiteFollowing() {
        if (this.owner != null) {
            if (this.owner.isEntityAlive()) {
                return this.owner;
            }
            this.setParasiteToFollow(null);
        }
        return null;
    }

    public void SetRooter(@Nullable EntityParasiteBase in) {
        this.notOwner = in;
    }

    public EntityParasiteBase getRooter() {
        if (this.notOwner != null) {
            if (this.notOwner.isEntityAlive()) {
                return this.notOwner;
            }
            this.SetRooter(null);
        }
        return null;
    }

    public byte getParasiteStatus() {
        return (Byte)this.dataManager.get(SPECIAL);
    }

    public void setParasiteStatus(int state) {
        this.dataManager.set(SPECIAL, (Object)((byte)state));
    }

    public void setWait(int in) {
        this.waitInt = in;
    }

    public int getWait() {
        return this.waitInt;
    }

    public void resetIdleTime() {
        this.idleTime = 0;
    }

    public byte getPhaseCreated() {
        return this.phaseCreated;
    }

    public int getSkin() {
        return ((Byte)this.dataManager.get(SKIN)).intValue();
    }

    public boolean getColdL() {
        return (Boolean)this.dataManager.get(COLD_L);
    }

    public void setSkin(int texture) {
        if (this.getSkin() == 120) {
            if (!this.canChangeVariant) {
                return;
            }
            if (this.rand.nextInt(3) == 0) {
                return;
            }
        }
        this.dataManager.set(SKIN, (Object)((byte)texture));
    }

    public int getCCDeathValue() {
        return this.oneMindDeathValue;
    }

    public void setAttackCooldownAni(int i) {
        this.attackCooldown = i;
    }

    public int getAttackCooldownAni() {
        return this.attackCooldown;
    }

    public void setKillC(double i) {
        this.killcount = i;
    }

    public double getKillC() {
        return this.killcount;
    }

    public byte getParasiteType() {
        return this.type;
    }

    public void onDeath(DamageSource cause) {
        super.onDeath(cause);
        if (!this.world.isRemote) {
            this.spawnCyst();
            ParasiteEventEntity.spawnBeckon(this.world, cause, this);
            ParasiteEventEntity.leaveScent(this.world, cause, this);
            if (SRPConfigSystems.useEvolution && !this.isPotionActive(SRPPotions.DEBAR_E)) {
                SRPSaveData.get(this.world).setTotalKills(this.world.provider.getDimension(), -this.valueEvDeath, true, this.world, false);
            }
            if (cause.getTrueSource() != null && cause.getTrueSource() instanceof EntityPlayer) {
                this.checkWeapon((EntityPlayer)cause.getTrueSource());
            }
        }
    }

    private void checkWeapon(EntityPlayer playerIn) {
        if (!SRPConfigSystems.useScent) {
            return;
        }
        Item ga = playerIn.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem();
        if ((ga instanceof WeaponToolMeleeBase || ga instanceof WeaponToolRangeBase) && this.rand.nextInt(10) == 0) {
            playerIn.addPotionEffect(new PotionEffect(SRPPotions.PREY_E, 600, 0, false, false));
        }
    }

    protected void onDeathUpdate() {
        if (this.canModRender == 1) {
            if (this.madeRng == 0) {
                this.setSelfeState(1);
                this.setParasiteStatus(6);
                this.dyingBurst(true, 1);
            } else {
                this.onDeathUpdateOG();
            }
        } else if (this.canModRender == 2) {
            if (this.madeRng == 0) {
                this.selfExplode();
                this.OnDeathHelper();
            } else {
                this.onDeathUpdateOG();
            }
        } else {
            this.onDeathUpdateOG();
        }
    }

    protected void onDeathUpdateOG() {
        ++this.deathTime;
        if (this.deathTime == 20) {
            if (!this.world.isRemote && (this.isPlayer() || this.recentlyHit > 0 && this.canDropLoot() && this.world.getGameRules().getBoolean("doMobLoot")) && !this.isPotionActive(SRPPotions.DEBAR_E)) {
                int j;
                int i;
                if (SRPConfigSystems.useEvolution) {
                    if (SRPSaveData.get(this.world).getEvolutionPhase(this.world.provider.getDimension()) < SRPConfigSystems.evolutionPArasitesWithoutXP) {
                        i = this.getExperiencePoints(this.attackingPlayer);
                        for (i = ForgeEventFactory.getExperienceDrop((EntityLivingBase)this, (EntityPlayer)this.attackingPlayer, (int)i); i > 0; i -= j) {
                            j = EntityXPOrb.getXPSplit((int)i);
                            this.world.spawnEntity((Entity)new EntityXPOrb(this.world, this.posX, this.posY, this.posZ, j));
                        }
                    }
                } else {
                    i = this.getExperiencePoints(this.attackingPlayer);
                    for (i = ForgeEventFactory.getExperienceDrop((EntityLivingBase)this, (EntityPlayer)this.attackingPlayer, (int)i); i > 0; i -= j) {
                        j = EntityXPOrb.getXPSplit((int)i);
                        this.world.spawnEntity((Entity)new EntityXPOrb(this.world, this.posX, this.posY, this.posZ, j));
                    }
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

    protected void dyingBurst(boolean fromDeath, int value) {
        int i = this.getSelfeState();
        if (i <= 0 || this.timeSinceIgnited == 0) {
            // empty if block
        }
        this.timeSinceIgnited += i * value;
        if (this.timeSinceIgnited < 0) {
            this.timeSinceIgnited = 0;
        }
        if (this.timeSinceIgnited >= this.fuseTime) {
            this.timeSinceIgnited = this.fuseTime;
            this.selfExplode();
            if (fromDeath) {
                this.OnDeathHelper();
            }
        }
    }

    public void OnDeathHelper() {
        if (!this.world.isRemote && (this.isPlayer() || this.recentlyHit > 0 && this.canDropLoot() && this.world.getGameRules().getBoolean("doMobLoot"))) {
            int j;
            int i = this.getExperiencePoints(this.attackingPlayer);
            for (i = ForgeEventFactory.getExperienceDrop((EntityLivingBase)this, (EntityPlayer)this.attackingPlayer, (int)i); i > 0; i -= j) {
                j = EntityXPOrb.getXPSplit((int)i);
                this.world.spawnEntity((Entity)new EntityXPOrb(this.world, this.posX, this.posY, this.posZ, j));
            }
        }
    }

    protected void selfExplode() {
        if (this.world.isRemote) {
            this.spawnEffectsGore();
        }
        if (!this.world.isRemote) {
            this.spawnGore();
            this.playSound(SRPSounds.MOBEXPLOTION, 1.0f, 1.0f);
            this.dead = true;
            this.setDead();
            EntityToxicCloud entityareaeffectcloud = new EntityToxicCloud(this.world, this.posX, this.posY, this.posZ);
            entityareaeffectcloud.setRadius(this.width, this.height);
            entityareaeffectcloud.setWaitTime(10);
            entityareaeffectcloud.setDuration(entityareaeffectcloud.getDuration() / 2);
            entityareaeffectcloud.setRadiusPerTick(-entityareaeffectcloud.getRadius() / (float)entityareaeffectcloud.getDuration());
            entityareaeffectcloud.addEffect(new PotionEffect(MobEffects.POISON, 300, 0));
            entityareaeffectcloud.addEffect(new PotionEffect(SRPPotions.COTH_E, 3600, 0, false, false));
            this.world.spawnEntity((Entity)entityareaeffectcloud);
        }
    }

    protected void spawnGore() {
    }

    protected void collideWithEntity(Entity entityIn) {
        super.collideWithEntity(entityIn);
    }

    public boolean getCanSpawnHere() {
        if (SRPConfigSystems.useEvolution) {
            if (this.phaseCreated >= SRPConfigSystems.evolutionSpawningIgnoreSunlight) {
                IBlockState iblockstate = this.world.getBlockState(new BlockPos((Entity)this).down());
                return iblockstate.canEntitySpawn((Entity)this) && this.world.getDifficulty() != EnumDifficulty.PEACEFUL && this.isValidLightLevelTwo() && SRPConfig.spawnDays <= (int)this.world.getWorldTime();
            }
            IBlockState iblockstate = this.world.getBlockState(new BlockPos((Entity)this).down());
            return iblockstate.canEntitySpawn((Entity)this) && this.world.getDifficulty() != EnumDifficulty.PEACEFUL && this.isValidLightLevelOne() && SRPConfig.spawnDays <= (int)this.world.getWorldTime();
        }
        if (SRPConfig.ignoreL) {
            IBlockState iblockstate = this.world.getBlockState(new BlockPos((Entity)this).down());
            return iblockstate.canEntitySpawn((Entity)this) && this.world.getDifficulty() != EnumDifficulty.PEACEFUL && this.isValidLightLevelTwo() && SRPConfig.spawnDays <= (int)this.world.getWorldTime();
        }
        IBlockState iblockstate = this.world.getBlockState(new BlockPos((Entity)this).down());
        return iblockstate.canEntitySpawn((Entity)this) && this.world.getDifficulty() != EnumDifficulty.PEACEFUL && this.isValidLightLevelOne() && SRPConfig.spawnDays <= (int)this.world.getWorldTime();
    }

    protected void despawnEntity() {
        Event.Result result = null;
        if (this.isNoDespawnRequired()) {
            this.idleTime = 0;
        } else if ((this.idleTime & 0x1F) == 31 && (result = ForgeEventFactory.canEntityDespawn((EntityLiving)this)) != Event.Result.DEFAULT) {
            if (result == Event.Result.DENY) {
                this.idleTime = 0;
            } else {
                this.spawnCyst();
                this.storeBefDes();
                this.setDead();
            }
        } else {
            EntityPlayer entity = this.world.getClosestPlayerToEntity((Entity)this, -1.0);
            if (entity != null) {
                double d0 = entity.posX - this.posX;
                double d1 = entity.posY - this.posY;
                double d2 = entity.posZ - this.posZ;
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                if (this.canDespawn() && d3 > 16384.0) {
                    this.spawnCyst();
                    this.storeBefDes();
                    this.setDead();
                }
                if (this.idleTime > 600 && this.rand.nextInt(800) == 0 && d3 > 1024.0 && this.canDespawn()) {
                    this.spawnCyst();
                    this.storeBefDes();
                    this.setDead();
                } else if (d3 < 1024.0) {
                    this.idleTime = 0;
                }
            }
        }
    }

    protected void storeBefDes() {
        Entity dod;
        if (this.dodFatherID != 0 && (dod = this.world.getEntityByID(this.dodFatherID)) != null && dod.isEntityAlive() && dod instanceof EntityPDispatcher) {
            ((EntityPDispatcher)dod).storeParasite(this);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean isValidLightLevelOne() {
        if (this.world.getBiome(this.getPosition()) instanceof BiomeParasite) {
            return this.isValidLightLevelTwo();
        }
        BlockPos blockpos = new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ);
        if (this.world.getLightFor(EnumSkyBlock.SKY, blockpos) > this.rand.nextInt(32)) {
            return false;
        }
        int i = this.world.getLightFromNeighbors(blockpos);
        if (this.world.isThundering()) {
            int j = this.world.getSkylightSubtracted();
            this.world.setSkylightSubtracted(10);
            i = this.world.getLightFromNeighbors(blockpos);
            this.world.setSkylightSubtracted(j);
        }
        if (i > this.rand.nextInt(8)) return false;
        BlockPos blockPos = new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ);
        if (!(this.getBlockPathWeight(blockPos) >= 0.0f)) return false;
        return true;
    }

    protected boolean isValidLightLevelTwo() {
        BlockPos blockpos = new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ);
        int light = this.world.getLightFor(EnumSkyBlock.BLOCK, blockpos);
        if (light > this.rand.nextInt(1000) || light > 7) {
            return false;
        }
        return this.rand.nextInt(8) == 0;
    }

    private boolean isInParasiteBiome() {
        return this.rand.nextInt(8) == 0 && this.world.getBiome(this.getPosition()) instanceof BiomeParasite;
    }

    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
        IEntityLivingData floo = super.onInitialSpawn(difficulty, livingdata);
        if (SRPConfigSystems.useEvolution) {
            this.phaseCreated = SRPSaveData.get(this.world).getEvolutionPhase(this.world.provider.getDimension());
            if (this.phaseCreated >= SRPConfigSystems.evolutionParasiteStatIncrease) {
                this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue() * (double)(1.0f + SRPConfigSystems.evolutionParasiteStatIncreaseValue));
                this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(this.getEntityAttribute(SharedMonsterAttributes.ARMOR).getBaseValue() * (double)(1.0f + SRPConfigSystems.evolutionParasiteStatIncreaseValue));
                this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getBaseValue() * (double)(1.0f + SRPConfigSystems.evolutionParasiteStatIncreaseValue));
            }
        }
        return floo;
    }

    protected boolean applyColdBiome() {
        boolean flag;
        Biome c = this.world.getBiome(this.getPosition());
        boolean bl = flag = this.rand.nextInt(1) == 0 && this.canChangeVariant;
        if (c.getTemperature(this.getPosition()) < 0.15f || c.isSnowyBiome() || flag) {
            this.setSkin(120);
            this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getBaseValue() * 0.6);
            this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getBaseValue() * 1.4);
            this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).getBaseValue() * 1.3);
            return true;
        }
        return false;
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setInteger("parasitetype", this.getSkin());
        compound.setBoolean("parasitedespawn", this.canDespawn());
        compound.setFloat("parasitekills", (float)this.getKillC());
        compound.setBoolean("parasitecolob", this.getApplyColonyB());
        compound.setBoolean("parasitecoldl", ((Boolean)this.dataManager.get(COLD_L)).booleanValue());
        compound.setByte("phasecreat", this.phaseCreated);
        NBTTagList allResS = new NBTTagList();
        NBTTagList allResI = new NBTTagList();
        if (this.inbBlockName.size() != this.inbBlockNumber.size()) {
            return;
        }
        for (int i = 0; i < this.inbBlockName.size(); ++i) {
            String res = this.inbBlockName.get(i);
            NBTTagCompound resT = new NBTTagCompound();
            resT.setString("blocks" + i, res);
            allResS.appendTag((NBTBase)resT);
            int resi = this.inbBlockNumber.get(i);
            NBTTagCompound resU = new NBTTagCompound();
            resU.setInteger("blocki" + i, resi);
            allResI.appendTag((NBTBase)resU);
        }
        compound.setTag("srpinvblocksname", (NBTBase)allResS);
        compound.setTag("srpinvblocksnumber", (NBTBase)allResI);
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        if (compound.hasKey("parasitetype", 99)) {
            this.setSkin(compound.getInteger("parasitetype"));
        }
        if (compound.hasKey("parasitedespawn", 99)) {
            this.cannotDespawn(compound.getBoolean("parasitedespawn"));
        }
        if (compound.hasKey("parasitekills", 99)) {
            this.setKillC(compound.getFloat("parasitekills"));
        }
        if (compound.hasKey("parasitecolob", 99)) {
            this.setApplyColonyB(compound.getBoolean("parasitecolob"));
        }
        if (compound.hasKey("parasitecoldl", 99)) {
            this.dataManager.set(COLD_L, (Object)compound.getBoolean("parasitecoldl"));
        }
        if (compound.hasKey("phasecreat", 99)) {
            this.phaseCreated = compound.getByte("phasecreat");
        }
        if (compound.hasKey("srpinvblocksname")) {
            NBTTagList allResS = compound.getTagList("srpinvblocksname", 10);
            NBTTagList allResI = compound.getTagList("srpinvblocksnumber", 10);
            if (allResS.tagCount() != allResI.tagCount()) {
                return;
            }
            for (int i = 0; i < allResS.tagCount(); ++i) {
                NBTTagCompound resT = allResS.getCompoundTagAt(i);
                String res = resT.getString("blocks" + i);
                this.inbBlockName.add(i, res);
                NBTTagCompound resU = allResI.getCompoundTagAt(i);
                int resi = resU.getInteger("blocki" + i);
                this.inbBlockNumber.add(i, resi);
            }
        }
    }

    public void particleStatus(byte id) {
        this.world.setEntityState((Entity)this, id);
    }

    @SideOnly(value=Side.CLIENT)
    protected void spawnEffectsGore() {
    }

    @SideOnly(value=Side.CLIENT)
    public void handleStatusUpdate(byte id) {
        switch (id) {
            case 5: {
                for (int i = 0; i <= 10; ++i) {
                    this.spawnParticles(SRPEnumParticle.RHAPPY, 0, 0, 0);
                }
                break;
            }
            case 6: {
                for (int i = 0; i <= 10; ++i) {
                    this.spawnParticles(SRPEnumParticle.GCLOUD, 127, 0, 0);
                }
                break;
            }
            case 7: {
                for (int i = 0; i <= 10; ++i) {
                    this.spawnParticles(EnumParticleTypes.EXPLOSION_LARGE);
                }
                break;
            }
            case 8: {
                for (int i = 0; i <= 10; ++i) {
                    this.spawnParticles(SRPEnumParticle.BIOMASS, 0, 0, 0);
                }
                break;
            }
            case 10: {
                for (int i = 0; i <= 40; ++i) {
                    this.spawnParticles(EnumParticleTypes.CRIT_MAGIC);
                }
                break;
            }
            case 11: {
                for (int i = 0; i <= 10; ++i) {
                    this.spawnParticles(SRPEnumParticle.GCLOUD, 0, 0, 0);
                }
                break;
            }
            case 12: {
                for (int i = 0; i <= 10; ++i) {
                    this.spawnParticles(SRPEnumParticle.GCLOUD, 0, 0, 0);
                }
                break;
            }
            case 13: {
                for (int i = 0; i <= 10; ++i) {
                    this.spawnParticles(SRPEnumParticle.GSPLASH, 4, -1, -1);
                }
                break;
            }
            case 40: {
                this.madeRng = 0;
                break;
            }
            case 41: {
                break;
            }
            case 42: {
                break;
            }
            case 43: {
                int iddd = Block.getStateId((IBlockState)this.world.getBlockState(new BlockPos(this.posX, this.posY, this.posZ).down()));
                for (int i = 0; i <= 10; ++i) {
                    this.world.spawnParticle(EnumParticleTypes.BLOCK_CRACK, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, this.posY, this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02, new int[]{iddd});
                }
                break;
            }
            default: {
                super.handleStatusUpdate(id);
            }
        }
    }

    @SideOnly(value=Side.CLIENT)
    public void spawnParticles(EnumParticleTypes particleType) {
        double d0 = this.rand.nextGaussian() * 0.02;
        double d1 = this.rand.nextGaussian() * 0.02;
        double d2 = this.rand.nextGaussian() * 0.02;
        this.world.spawnParticle(particleType, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, this.posY + 0.5 + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, d0, d1, d2, new int[0]);
    }

    @SideOnly(value=Side.CLIENT)
    public void spawnParticles(SRPEnumParticle particleType, int r, int g, int b) {
        double d0 = this.rand.nextGaussian() * 0.02;
        double d1 = this.rand.nextGaussian() * 0.02;
        double d2 = this.rand.nextGaussian() * 0.02;
        ParticleSpawner.spawnParticle(particleType, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, this.posY + 0.5 + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, d0, d1, d2, r, g, b);
    }

    @SideOnly(value=Side.CLIENT)
    public void spawnParticlesGore(SRPEnumParticle particleType, int r, int g, int b) {
        this.spawnParticlesGore(particleType, r, g, b, 1.0, 4.0);
    }

    @SideOnly(value=Side.CLIENT)
    public void spawnParticlesGore(SRPEnumParticle particleType, int r, int g, int b, double xF, double yF) {
        double d0 = (float)this.posX + this.rand.nextFloat();
        double d1 = (float)this.posY + this.rand.nextFloat();
        double d2 = (float)this.posZ + this.rand.nextFloat();
        double d3 = d0 - this.posX;
        double d4 = d1 - this.posY;
        double d5 = d2 - this.posZ;
        double d6 = MathHelper.sqrt((double)(d3 * d3 + d4 * d4 + d5 * d5));
        d3 /= d6;
        d4 /= d6;
        d5 /= d6;
        double d7 = 0.5 / (d6 / 4.0 + 0.1);
        d3 = d3 * (d7 *= (double)(this.rand.nextFloat() * this.rand.nextFloat() + 0.3f)) * xF;
        d4 = d4 * d7 * yF;
        d5 = d5 * d7 * xF;
        d3 = Math.min(d3, 0.2) * (Math.random() * 2.0 - 1.0);
        d4 = Math.min(d4, 0.6) * (Math.random() * 2.0 - 1.0);
        d5 = Math.min(d5, 0.2) * (Math.random() * 2.0 - 1.0);
        ParticleSpawner.spawnParticle(particleType, this.posX, this.posY + 0.2 + (double)this.height, this.posZ, d3, d4, d5, r, g, b);
    }

    @SideOnly(value=Side.CLIENT)
    public void spawnParticlesGoreMouth(SRPEnumParticle particleType, int r, int g, int b, double xF, double yF) {
        double d0 = (float)this.posX + this.rand.nextFloat();
        double d1 = (float)this.posY + this.rand.nextFloat();
        double d2 = (float)this.posZ + this.rand.nextFloat();
        double d3 = d0 - this.posX;
        double d4 = d1 - this.posY;
        double d5 = d2 - this.posZ;
        double d6 = MathHelper.sqrt((double)(d3 * d3 + d4 * d4 + d5 * d5));
        d3 /= d6;
        d4 /= d6;
        d5 /= d6;
        double d7 = 0.5 / (d6 / 4.0 + 0.1);
        d3 = d3 * (d7 *= (double)(this.rand.nextFloat() * this.rand.nextFloat() + 0.3f)) * xF;
        d4 = d4 * d7 * yF;
        d5 = d5 * d7 * xF;
        d3 = Math.min(d3, 0.2) * (Math.random() * 2.0 - 1.0);
        d4 = Math.min(d4, 0.6) * (Math.random() * 2.0 - 1.0);
        d5 = Math.min(d5, 0.2) * (Math.random() * 2.0 - 1.0);
        ParticleSpawner.spawnParticle(particleType, this.posX, this.posY, this.posZ, d3, d4, d5, r, g, b);
    }

    @SideOnly(value=Side.CLIENT)
    public void spawnParticlesGoreBox(SRPEnumParticle particleType, int r, int g, int b, double xF, double yF) {
        double d0 = (float)this.posX + this.rand.nextFloat();
        double d1 = (float)this.posY + this.rand.nextFloat();
        double d2 = (float)this.posZ + this.rand.nextFloat();
        double d3 = d0 - this.posX;
        double d4 = d1 - this.posY;
        double d5 = d2 - this.posZ;
        double d6 = MathHelper.sqrt((double)(d3 * d3 + d4 * d4 + d5 * d5));
        d3 /= d6;
        d4 /= d6;
        d5 /= d6;
        double d7 = 0.5 / (d6 / 4.0 + 0.1);
        d3 = d3 * (d7 *= (double)(this.rand.nextFloat() * this.rand.nextFloat() + 0.3f)) * xF;
        d4 = d4 * d7 * yF;
        d5 = d5 * d7 * xF;
        d3 = Math.min(d3, 0.2) * (Math.random() * 2.0 - 1.0);
        d4 = Math.min(d4, 0.6) * (Math.random() * 2.0 - 1.0);
        d5 = Math.min(d5, 0.2) * (Math.random() * 2.0 - 1.0);
        ParticleSpawner.spawnParticle(particleType, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, this.posY + 0.5 + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0f) - (double)this.width, d3, d4, d5, r, g, b);
    }

    @SideOnly(value=Side.CLIENT)
    public void spawnParticles(SRPEnumParticle particleType, int r, int g, int b, double d0, double d1, double d2, double d3, double d4, double d5) {
        ParticleSpawner.spawnParticle(particleType, d0, d1, d2, d3, d4, d5, r, g, b);
    }

    @SideOnly(value=Side.CLIENT)
    public float getSelfeFlashIntensity(float p_70831_1_) {
        return ((float)this.lastActiveTime + (float)(this.timeSinceIgnited - this.lastActiveTime) * p_70831_1_) / (float)(this.fuseTime - 2);
    }

    @SideOnly(value=Side.CLIENT)
    public boolean isSwingingArms() {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    public float getscale(float p_70831_1_) {
        return 0.0f;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean getStillAni() {
        return this.still;
    }

    @SideOnly(value=Side.CLIENT)
    public float getAniTick() {
        return this.aniticks;
    }

    public void doSpecialSkill(byte id) {
        switch (id) {
            case 13: {
                this.skillBreakBlocks();
                return;
            }
            case 14: {
                this.skillLeap();
                return;
            }
        }
    }

    public boolean getFinished(byte attID) {
        switch (attID) {
            case 13: {
                return this.SkillBGflag;
            }
            case 14: {
                return this.SkillLeapFlag;
            }
        }
        return false;
    }

    public void setFinished(byte attID, boolean in) {
        switch (attID) {
            case 13: {
                this.SkillBGflag = in;
            }
            case 14: {
                this.SkillLeapFlag = in;
            }
        }
    }

    public void setSkillBreakBlocksValues(float hardness, int heightIn, int rangeIn) {
        this.blockH = hardness;
        this.BGheight = heightIn;
        this.BGrange = rangeIn;
    }

    public float getBlockH() {
        if (this.getSkin() == 120) {
            return this.blockH * 1.5f;
        }
        if (this.getSkin() == 7) {
            return this.blockH * 2.0f;
        }
        return this.blockH;
    }

    public void skillBreakBlocks() {
        EntityLivingBase target;
        if (this.isDead) {
            return;
        }
        if (this.getBlockH() == 0.0f) {
            return;
        }
        int blocksbroke = 0;
        if (!ForgeEventFactory.getMobGriefingEvent((World)this.world, (Entity)this)) {
            return;
        }
        int i1 = MathHelper.floor((double)(this.posY + 0.1));
        double l1 = this.posX;
        double i2 = this.posZ;
        boolean flag = false;
        int Brangeatm = this.BGrange;
        int offsetT = 0;
        if (this.getAttackTarget() != null && (target = this.getAttackTarget()).getDistanceSq(this.posX, target.posY, this.posZ) < 9.0) {
            if (target.posY - this.posY < -1.0) {
                offsetT -= 2;
                if (!this.onGround) {
                    --offsetT;
                }
            } else if (target.posY - this.posY > 2.0) {
                ++offsetT;
                this.BGrange = 0;
            }
        }
        for (int k2 = -1 * this.BGrange; k2 <= 1 * this.BGrange; ++k2) {
            for (int l2 = -1 * this.BGrange; l2 <= 1 * this.BGrange; ++l2) {
                for (int j = 1 + offsetT; j <= this.BGheight + offsetT; ++j) {
                    String name;
                    double i3 = l1 + (double)k2;
                    double k = i1 + j;
                    double l = i2 + (double)l2;
                    BlockPos blockpos = new BlockPos(i3, k, l);
                    IBlockState iblockstate = this.world.getBlockState(blockpos);
                    Block block = iblockstate.getBlock();
                    float bHard = iblockstate.getBlockHardness(this.world, blockpos);
                    if (!(bHard <= this.getBlockH()) || !(bHard > 0.0f) || block instanceof IMetaName && block != SRPBlocks.ParasiteCanister || block == SRPBlocks.BiomeHeart || block == SRPBlocks.ColonyHeart || block == SRPBlocks.ParasiteRubbleDense || block == SRPBlocks.ParasiteCanisterActive || block == SRPBlocks.dodN || block instanceof BlockLiquid || block instanceof BlockPortal || block instanceof BlockEndGateway || block instanceof BlockEndPortalFrame || iblockstate.getMaterial() == Material.PORTAL || this.blockException(name = block.getRegistryName().toString()) || block == Blocks.AIR || !block.canEntityDestroy(iblockstate, (IBlockAccess)this.world, blockpos, (Entity)this) || !ForgeEventFactory.onEntityDestroyBlock((EntityLivingBase)this, (BlockPos)blockpos, (IBlockState)iblockstate)) continue;
                    if (SRPConfig.cystActive) {
                        int meta = block.getMetaFromState(iblockstate);
                        boolean bl = flag = this.destroyBlockPos(blockpos, false) || flag;
                        if (SRPConfig.doTileDrops) {
                            this.addToBlockInv(name + ";" + meta);
                        }
                    } else {
                        this.destroyBlockPos(blockpos, SRPConfig.doTileDrops);
                    }
                    ++blocksbroke;
                }
            }
        }
        this.BGrange = Brangeatm;
        this.SkillBGflag = true;
    }

    protected boolean destroyBlockPos(BlockPos pos, boolean dropBlock) {
        IBlockState iblockstate = this.world.getBlockState(pos);
        Block block = iblockstate.getBlock();
        if (block.isAir(iblockstate, (IBlockAccess)this.world, pos)) {
            return false;
        }
        if (this.rand.nextDouble() < SRPConfig.blockParticleChance) {
            this.world.playEvent(2001, pos, Block.getStateId((IBlockState)iblockstate));
        }
        if (this.rand.nextDouble() < SRPConfig.blockSoundChance) {
            SoundType soundtype = block.getSoundType(Block.getStateById((int)Block.getStateId((IBlockState)iblockstate)), this.world, pos, null);
            this.world.playSound((EntityPlayer)null, pos, soundtype.getBreakSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0f) / 2.0f, soundtype.getPitch() * 0.8f);
        }
        if (dropBlock && this.rand.nextDouble() < SRPConfig.blockDropChance) {
            block.dropBlockAsItem(this.world, pos, iblockstate, 0);
        }
        return this.world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
    }

    protected boolean blockException(String name) {
        return ParasiteEventEntity.checkName(name, SRPConfig.parasiteGriefingBlackList, SRPConfig.parasiteGriefingWhite);
    }

    public void addToBlockInv(String name) {
        boolean flag = true;
        for (int i = 0; i < this.inbBlockName.size(); ++i) {
            if (!this.inbBlockName.get(i).equals(name) || this.inbBlockNumber.get(i) > 64) continue;
            int iiii = this.inbBlockNumber.get(i) + 1;
            this.inbBlockNumber.set(i, iiii);
            flag = false;
            break;
        }
        if (flag) {
            if (this.inbBlockName.size() >= 22) {
                this.spawnCyst();
            }
            this.inbBlockName.add(name);
            this.inbBlockNumber.add(1);
        }
    }

    protected void spawnCyst() {
        if (this.inbBlockName.isEmpty()) {
            return;
        }
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
        bomb.setType((byte)10);
        bomb.copyLocationAndAnglesFrom((Entity)this);
        bomb.setMotion(d3 *= (d7 *= (double)(this.world.rand.nextFloat() * this.world.rand.nextFloat() + 0.3f)), d4, d5 *= d7, 0.25, 0.75);
        this.world.spawnEntity((Entity)bomb);
        bomb.inbBlockName = new ArrayList<String>(this.inbBlockName);
        bomb.inbBlockNumber = new ArrayList<Integer>(this.inbBlockNumber);
        this.inbBlockName = new ArrayList();
        this.inbBlockNumber = new ArrayList();
    }

    public void setskillLeapValues(float leapY, double leapSpeed, int jumpRad) {
        this.leapMotionY = leapY;
        this.jumpSpeed = leapSpeed;
        this.jumpR = jumpRad;
    }

    protected void skillLeap() {
        if (this.leapMotionY == 0.0f) {
            return;
        }
        if (this.getAttackTarget() != null && this.shouldWorkTask() && !this.isPotionActive(MobEffects.SLOWNESS) && this.getParasiteStatus() <= 2) {
            EntityLivingBase entitylivingbase = this.getAttackTarget();
            if (this.attacking == 0) {
                ++this.attacking;
                this.targetX = entitylivingbase.posX;
                this.targetZ = entitylivingbase.posZ;
            }
        }
        if (this.attacking >= 1) {
            ++this.attacking;
            this.skillBreakBlocks();
            if (this.attacking == 2 && this.onGround) {
                this.setParasiteStatus(10);
                this.getNavigator().clearPath();
                double d0 = this.targetX - this.posX;
                double d1 = this.targetZ - this.posZ;
                double f = MathHelper.sqrt((double)(d0 * d0 + d1 * d1));
                this.motionY = this.leapMotionY;
                this.motionX += d0 / f * this.jumpSpeed * 0.9 + this.motionX * 0.3;
                this.motionZ += d1 / f * this.jumpSpeed * 0.9 + this.motionZ * 0.3;
            }
            if (this.attacking > 2 && this.onGround) {
                if (this.jumpR != 0) {
                    float damage = (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getBaseValue();
                    AxisAlignedBB axisalignedbb = new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX + 1.0, this.posY + 1.0, this.posZ + 1.0).grow((double)this.jumpR, 2.0, (double)this.jumpR);
                    List moblist = this.world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
                    for (EntityLivingBase mob : moblist) {
                        if (mob == this || mob instanceof EntityParasiteBase) continue;
                        mob.knockBack((Entity)mob, 2.5f, this.posX - mob.posX, this.posZ - mob.posZ);
                        this.attackEntityAsMob((Entity)mob);
                    }
                }
                this.setParasiteStatus(0);
                this.attacking = 0;
                if (this.type >= 31 && this.height > 2.0f) {
                    this.playSound(SRPSounds.HITGROUND, 15.0f, 1.0f);
                }
                this.SkillLeapFlag = true;
            }
        }
    }

    public class EntityAIJumping
    extends EntityAIBase {
        private final EntityLiving parent;
        private int secs;

        public EntityAIJumping(EntityLiving parentIn) {
            this.parent = parentIn;
            this.setMutexBits(4);
            if (parentIn.getNavigator() instanceof PathNavigateGround) {
                ((PathNavigateGround)parentIn.getNavigator()).setCanSwim(true);
            } else if (parentIn.getNavigator() instanceof PathNavigateFlying) {
                ((PathNavigateFlying)parentIn.getNavigator()).setCanFloat(true);
            }
        }

        public boolean shouldExecute() {
            ++this.secs;
            if (this.secs < 10) {
                return false;
            }
            this.secs = 0;
            EntityLivingBase target = this.parent.getAttackTarget();
            if (target == null) {
                return false;
            }
            if (target.getDistanceSq(this.parent.posX, target.posY, this.parent.posZ) < 4.0 && target.posY - (this.parent.posY + (double)this.parent.getEyeHeight()) > 1.0 && this.parent.onGround) {
                this.parent.getNavigator().clearPath();
                double dd0 = target.posX - this.parent.posX;
                double dd1 = target.posZ - this.parent.posZ;
                float f = MathHelper.sqrt((double)(dd0 * dd0 + dd1 * dd1));
                this.parent.motionX += dd0 / (double)f * 0.5 * (double)0.8f + this.parent.motionX * (double)0.2f;
                this.parent.motionZ += dd1 / (double)f * 0.5 * (double)0.8f + this.parent.motionZ * (double)0.2f;
                this.parent.motionY = 0.2 + (double)this.parent.height * 0.15;
            }
            return false;
        }

        public void updateTask() {
            if (this.parent.getRNG().nextFloat() < 0.8f) {
                this.parent.getJumpHelper().setJumping();
            }
        }
    }

    class EntityAIWait
    extends EntityAIBase {
        public EntityAIWait() {
            this.setMutexBits(7);
        }

        public boolean shouldExecute() {
            return EntityParasiteBase.this.getWait() > 0;
        }

        public void updateTask() {
        }
    }
}

