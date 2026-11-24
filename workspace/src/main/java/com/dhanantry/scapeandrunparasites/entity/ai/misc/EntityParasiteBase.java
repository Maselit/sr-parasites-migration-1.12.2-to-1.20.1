package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.util.SRPAttributes;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

import java.util.ArrayList;

/**
 * Migracion de EntityParasiteBase a 1.20.1 (Lote 1: estructura + atributos + data params).
 * La logica compleja (onLivingUpdate, combate, NBT, spawn) se migra en lotes posteriores.
 */
public abstract class EntityParasiteBase extends Monster {
    protected double killcount = 0.0;
    protected boolean canD = true;
    private int waitInt;
    private boolean canWorkTask;
    protected EntityParasiteBase owner;
    protected EntityParasiteBase notOwner;
    public boolean canChangeVariant = false;
    private static final EntityDataAccessor<Byte> SPECIAL = SynchedEntityData.defineId(EntityParasiteBase.class, EntityDataSerializers.BYTE);
    private static final EntityDataAccessor<Integer> SELFE = SynchedEntityData.defineId(EntityParasiteBase.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Byte> SKIN = SynchedEntityData.defineId(EntityParasiteBase.class, EntityDataSerializers.BYTE);
    private static final EntityDataAccessor<Boolean> COLD_L = SynchedEntityData.defineId(EntityParasiteBase.class, EntityDataSerializers.BOOLEAN);
    protected int srpTicks;
    protected int lastActiveTime;
    protected int timeSinceIgnited;
    protected int fuseTime = 40;
    protected byte canModRender = 0;
    protected int attackCooldown;
    private byte madeRng = (byte) -1;
    private boolean spawnedByColo;
    protected byte type = 0;
    protected int damageCap = 1;
    protected float MiniDamage = 0.0f;
    protected float miniCap;
    protected boolean miniCapA = false;
    protected byte phaseCreated;
    protected int oneMindDeathValue = 1;
    protected float foodSteal = 0.001f;
    private byte madeRng2 = (byte) -1;
    private ArrayList<String> inbBlockName = new ArrayList();
    private int inbBlockNumber_dummy;
    private float aniticks;
    private boolean still;
    private int stillTicks;
    private int canBeStored;
    private int dodFatherID = 0;
    public boolean canSpawnSpawn = true;
    protected int valueEvDeath;
    protected int liquidLeap;
    protected float blockH;
    protected int BGheight;
    protected int BGrange;
    protected boolean SkillBGflag;
    protected int attacking;
    protected double targetX;
    protected double targetZ;
    protected float leapMotionY;
    protected double jumpSpeed;
    protected int jumpR;
    protected boolean SkillLeapFlag;
    protected int attacking2;

    public EntityParasiteBase(EntityType<? extends EntityParasiteBase> type, Level level) {
        super(type, level);
        this.canBeStored = 0;
        this.attackCooldown = 0;
        this.canWorkTask = true;
        this.srpTicks = 0;
        this.madeRng = (byte) -1;
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

    public EntityParasiteBase(Level level) {
        this((EntityType) EntityType.ZOMBIE, level);
    }

    public abstract int getParasiteIDRegister();

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(SPECIAL, (byte) 0);
        this.entityData.define(SELFE, -1);
        this.entityData.define(SKIN, (byte) 0);
        this.entityData.define(COLD_L, false);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes();
    }

    // Getters / setters basicos
    public void setCreatedPhase(byte in) { this.phaseCreated = in; }
    public byte getPhaseCreated() { return this.phaseCreated; }
    public int getSkin() { return this.entityData.get(SKIN); }
    public void setSkin(int texture) { this.entityData.set(SKIN, (byte) texture); }
    public boolean getColdL() { return this.entityData.get(COLD_L); }
    public byte getParasiteStatus() { return this.entityData.get(SPECIAL); }
    public void setParasiteStatus(int state) { this.entityData.set(SPECIAL, (byte) state); }
    public int getSelfeState() { return this.entityData.get(SELFE); }
    public void setSelfeState(int state) { this.entityData.set(SELFE, state); }
    public int getWait() { return this.waitInt; }
    public void setWait(int in) { this.waitInt = in; }
    public double getKillC() { return this.killcount; }
    public void setKillC(double i) { this.killcount = i; }
    public byte getParasiteType() { return this.type; }
    public int canBeStored() { return this.canBeStored; }
    public boolean shouldWorkTask() { return this.canWorkTask; }
    public void setWorkTask(boolean in) { this.canWorkTask = in; }
    public int getAttackCooldownAni() { return this.attackCooldown; }
    public void setAttackCooldownAni(int i) { this.attackCooldown = i; }
    public float getMiniDamage() { return this.MiniDamage; }
    public int getLLeap() { return this.liquidLeap; }
    public void setDodFatherID(int in) { this.dodFatherID = in; }
    public boolean canDespawn() { return this.canD; }
    public void cannotDespawn(boolean in) { this.canD = in; }
    public boolean getApplyColonyB() { return this.spawnedByColo; }
    public void setApplyColonyB(boolean in) { this.spawnedByColo = in; }

    // Stubs para logica compleja (se migran en lotes posteriores)
    @Override
    public void tick() { super.tick(); }
    public void onLivingUpdate() {
        ++this.srpTicks;
        if (this.isNoAi()) {
            return;
        }
        if (this.getWait() > 0) {
            int j1 = this.getWait() - 1;
            if (j1 == 0) {
                this.setParasiteStatus(0);
            }
            this.setWait(j1);
        } else {
            super.aiStep();
        }
        if (!this.level().isClientSide) {
            byte k = this.getParasiteStatus();
            if (this.getAttackCooldownAni() != 0 || k == 1 || k == 2) {
                if (this.getAttackCooldownAni() != 0) {
                    int i = this.getAttackCooldownAni() - 1;
                    this.setAttackCooldownAni(i);
                }
                if (k == 1 || k == 2) {
                    net.minecraft.world.entity.LivingEntity target = this.getTarget();
                    if (target != null) {
                        if (!target.isAlive()) {
                            this.setTarget(null);
                            this.setParasiteStatus(0);
                        }
                    } else {
                        this.setParasiteStatus(0);
                        this.setTarget(null);
                    }
                }
            }
            if (this.srpTicks % 15 == 0 && this.level().getBlockState(this.blockPosition()).getBlock() instanceof net.minecraft.world.level.block.LiquidBlock && this.getTarget() != null) {
                ++this.liquidLeap;
                if (this.liquidLeap > 4) {
                    this.liquidLeap = 4;
                }
            }
            if (this.srpTicks > 20) {
                this.srpTicks = 0;
                if (!this.inbBlockName.isEmpty() && this.getRandom().nextInt(50) == 0) {
                    this.spawnCyst();
                }
                net.minecraft.world.entity.LivingEntity atkTarget = this.getTarget();
                if (atkTarget instanceof net.minecraft.world.entity.player.Player) {
                    this.fearPlayer(atkTarget);
                }
                if (SRPConfigSystems.useEvolution && this.killcount >= 0.0) {
                    switch (this.phaseCreated) {
                        case 1: this.killcount += SRPConfigSystems.phaseKillCountPlusOne; break;
                        case 2: this.killcount += SRPConfigSystems.phaseKillCountPlusTwo; break;
                        case 3: this.killcount += SRPConfigSystems.phaseKillCountPlusThree; break;
                        case 4: this.killcount += SRPConfigSystems.phaseKillCountPlusFour; break;
                        case 5: this.killcount += SRPConfigSystems.phaseKillCountPlusFive; break;
                        case 6: this.killcount += SRPConfigSystems.phaseKillCountPlusSix; break;
                        case 7: this.killcount += SRPConfigSystems.phaseKillCountPlusSeven; break;
                        case 8: this.killcount += SRPConfigSystems.phaseKillCountPlusEight; break;
                        default: break;
                    }
                } else if (this.level().getDifficulty() == net.minecraft.world.Difficulty.HARD && this.killcount >= 0.0) {
                    this.killcount += SRPConfig.killcountplus;
                }
                this.placeNidus();
            }
            if (this.liquidLeap >= 1) {
                double h = 0.1;
                double str = 0.5;
                this.getNavigation().stop();
                net.minecraft.world.entity.LivingEntity entitylivingbase = this.getTarget();
                if (entitylivingbase != null) {
                    net.minecraft.world.level.block.state.BlockState bl = this.level().getBlockState(this.blockPosition());
                    if (!bl.isAir()) {
                        h = 0.3;
                        str = 1.0;
                    }
                    --this.liquidLeap;
                    double dd0 = entitylivingbase.getX() - this.getX();
                    double dd1 = entitylivingbase.getZ() - this.getZ();
                    float f = (float) Math.sqrt(dd0 * dd0 + dd1 * dd1);
                    this.setDeltaMovement(this.getDeltaMovement().x + dd0 / (double) f * str * 0.8 + this.getDeltaMovement().x * 0.2,
                            h,
                            this.getDeltaMovement().z + dd1 / (double) f * str * 0.8 + this.getDeltaMovement().z * 0.2);
                    this.getLookControl().setLookAt(entitylivingbase.getX(), entitylivingbase.getY() + (double) entitylivingbase.getEyeHeight(), entitylivingbase.getZ(), 10.0f, 40.0f);
                }
            }
        } else if (this.srpTicks > 20) {
            this.srpTicks = 0;
        }
        if (this.getX() == this.xOld && this.getZ() == this.zOld) {
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
    protected void fearPlayer(net.minecraft.world.entity.LivingEntity player) { /* TODO */ }
    protected void placeNidus() { /* TODO */ }
    protected void updateAITasks() { /* TODO */ }
    protected void spawnCyst() { /* TODO */ }
}