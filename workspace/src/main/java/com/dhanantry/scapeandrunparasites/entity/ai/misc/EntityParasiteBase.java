package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
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
    protected void fearPlayer(net.minecraft.world.entity.LivingEntity player) { /* stub: vacio en original */ }
    protected void placeNidus() {
        if (SRPConfigSystems.useEvolution && this.phaseCreated <= 0) {
            return;
        }
        if (this.getRandom().nextInt(350) != 0 || this.type < 11) {
            return;
        }
        if (this.killcount < 10.0) {
            return;
        }
        net.minecraft.world.phys.AABB axisalignedbb = new net.minecraft.world.phys.AABB(this.getX(), this.getY(), this.getZ(), this.getX() + 1.0, this.getY() + 1.0, this.getZ() + 1.0).inflate(SRPConfig.nexussivFollow);
        java.util.List<com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase> moblist = this.level().getEntitiesOfClass(com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase.class, axisalignedbb);
        int collec = 0;
        for (com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase mob : moblist) {
            int idP = mob.getParasiteIDRegister();
            if (idP == 73 || idP == 77 || idP == 78 || idP == 79) {
                return;
            }
            collec = (int) ((double) collec + mob.getKillC());
        }
        if (collec < SRPConfig.reinforcerNidusStart) {
            return;
        }
        double d0 = (float) this.getX() + this.getRandom().nextFloat();
        double d1 = (float) this.getY() + this.getRandom().nextFloat();
        double d2 = (float) this.getZ() + this.getRandom().nextFloat();
        double d3 = d0 - this.getX();
        double d4 = d1 - this.getY();
        double d5 = d2 - this.getZ();
        double d6 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
        d3 /= d6;
        d4 /= d6;
        d5 /= d6;
        double d7 = 0.5 / (d6 / 4.0 + 0.1);
        d4 = d4 * d7 * 2.0;
        // EntityGore spawn (TODO: migrar EntityGore logic)
        // com.dhanantry...EntityGore bomb = new ...; ... spawn
    }

    protected void updateAITasks() {
        if (this.getWait() > 0) {
            int j1 = this.getWait() - 1;
            if (j1 == 0) {
                this.setParasiteStatus(0);
            }
            this.setWait(j1);
        }
    }
    protected void skillBreakBlocks() { /* TODO */ }

    @Override
    public boolean isAffectedByPotions() { return true; }

    public boolean isPotionApplicable(net.minecraft.world.effect.MobEffectInstance potioneffectIn) {
        net.minecraft.world.effect.MobEffect potion = potioneffectIn.getEffect();
        if (potion == net.minecraft.world.effect.MobEffects.POISON || potion == com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get() || potion == com.dhanantry.scapeandrunparasites.init.SRPPotions.VIRA_E.get() || potion == com.dhanantry.scapeandrunparasites.init.SRPPotions.CORRO_E.get() || potion == com.dhanantry.scapeandrunparasites.init.SRPPotions.DLER_E.get()) {
            return false;
        }
        return super.isAffectedByPotions();
    }

    public void applyBonuses(int colony, int node, byte phase) {
        if (this.spawnedByColo) {
            return;
        }
        this.phaseCreated = phase;
        this.setColonyBonus(colony);
        this.setNodeBonus(node);
        this.spawnedByColo = true;
    }

    protected void setColonyBonus(int totalColonyPoints) {
        if (totalColonyPoints == 0) {
            return;
        }
        double bonus = (double) totalColonyPoints / SRPConfigWorld.colonyExtraHealthPoint * SRPConfigWorld.colonyExtraHealthValue;
        double currentV = this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).getBaseValue();
        this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).setBaseValue(currentV + currentV * bonus);
        this.setHealth((float) this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).getBaseValue());
        bonus = (double) totalColonyPoints / SRPConfigWorld.colonyExtraArmorPoint * SRPConfigWorld.colonyExtraArmorValue;
        currentV = this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).getBaseValue();
        this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(currentV + currentV * bonus);
        bonus = (double) totalColonyPoints / SRPConfigWorld.colonyExtraDamagePoint * SRPConfigWorld.colonyExtraDamageValue;
        currentV = this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getBaseValue();
        this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).setBaseValue(currentV + currentV * bonus);
        bonus = (double) totalColonyPoints / SRPConfigWorld.colonyExtraKDResPoint * SRPConfigWorld.colonyExtraKDResValue;
        currentV = this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE).getBaseValue();
        this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE).setBaseValue(currentV + currentV * bonus);
        bonus = (double) totalColonyPoints / SRPConfigWorld.colonyDamageCapPoint * SRPConfigWorld.colonyDamageCapValue;
        this.damageCap = (int) ((double) this.damageCap + (double) this.damageCap * bonus);
    }

    protected void setNodeBonus(int totalPoints) {
        if (totalPoints == 0) {
            return;
        }
        for (String i : SRPConfigWorld.potionEffectForNodes) {
            String[] here = i.split(";");
            int level = Integer.parseInt(here[0]);
            if (totalPoints < level) continue;
            int amp = Integer.parseInt(here[2]);
            net.minecraft.world.effect.MobEffect potion = net.minecraft.world.effect.MobEffect.byId(Integer.parseInt(here[1]));
            if (potion == null) continue;
            this.addEffect(new net.minecraft.world.effect.MobEffectInstance(potion, 7777, amp));
        }
    }

    public boolean getCanSpawnHere() {
        if (SRPConfigSystems.useEvolution) {
            net.minecraft.world.level.block.state.BlockState iblockstate = this.level().getBlockState(this.blockPosition().below());
            return iblockstate.canOcclude() && this.level().getDifficulty() != net.minecraft.world.Difficulty.PEACEFUL && SRPConfig.spawnDays <= (int) this.level().getGameTime();
        }
        net.minecraft.world.level.block.state.BlockState iblockstate = this.level().getBlockState(this.blockPosition().below());
        return iblockstate.canOcclude() && this.level().getDifficulty() != net.minecraft.world.Difficulty.PEACEFUL && SRPConfig.spawnDays <= (int) this.level().getGameTime();
    }

    protected boolean isValidLightLevelOne() {
        net.minecraft.core.BlockPos blockpos = net.minecraft.core.BlockPos.containing(this.getX(), this.getBoundingBox().minY, this.getZ());
        int i = this.level().getBrightness(net.minecraft.world.level.LightLayer.BLOCK, blockpos);
        return i <= this.getRandom().nextInt(8);
    }

    protected boolean isValidLightLevelTwo() {
        net.minecraft.core.BlockPos blockpos = net.minecraft.core.BlockPos.containing(this.getX(), this.getBoundingBox().minY, this.getZ());
        int light = this.level().getBrightness(net.minecraft.world.level.LightLayer.BLOCK, blockpos);
        if (light > this.getRandom().nextInt(1000) || light > 7) {
            return false;
        }
        return this.getRandom().nextInt(8) == 0;
    }

    @Override
    public void addAdditionalSaveData(net.minecraft.nbt.CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("srpTicks", this.srpTicks);
        tag.putInt("phaseCreated", this.phaseCreated);
        tag.putDouble("killcount", this.killcount);
        tag.putByte("type", this.type);
        tag.putInt("damageCap", this.damageCap);
    }

    @Override
    public void readAdditionalSaveData(net.minecraft.nbt.CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        if (tag.contains("srpTicks")) this.srpTicks = tag.getInt("srpTicks");
        if (tag.contains("phaseCreated")) this.phaseCreated = (byte) tag.getInt("phaseCreated");
        if (tag.contains("killcount")) this.killcount = tag.getDouble("killcount");
        if (tag.contains("type")) this.type = tag.getByte("type");
        if (tag.contains("damageCap")) this.damageCap = tag.getInt("damageCap");
    }

    protected void storeBefDes() { /* TODO */ }
    public double getMountedYOffset() { return this.getBbHeight() * 0.5; }
    public float getEyeHeight(net.minecraft.world.entity.Pose pose) { return 0.8f; }
    public boolean isPushedByFluid() { return true; }

    @Override
    public boolean hurt(net.minecraft.world.damagesource.DamageSource source, float amount) {
        if (this.level().isClientSide) {
            return false;
        }
        this.canBeStored = 55;
        if (this.madeRng == -1) {
            this.madeRng = (byte) this.getRandom().nextInt(2);
            if (this.madeRng == 0) {
                this.level().broadcastEntityEvent(this, (byte) 40);
            }
        }
        if (source == this.damageSources().fellOutOfWorld()) {
            return super.hurt(source, amount);
        }
        if (source == this.damageSources().inWall()) {
            this.skillBreakBlocks();
        }
        net.minecraft.world.entity.LivingEntity attacker = source.getEntity() instanceof net.minecraft.world.entity.LivingEntity ? (net.minecraft.world.entity.LivingEntity) source.getEntity() : null;
        if (attacker != null && attacker.getMainHandItem().getItem() instanceof com.dhanantry.scapeandrunparasites.item.tool.WeaponToolMeleeBase) {
            super.hurt(source, amount);
        }
        if (source == this.damageSources().inFire() || source == this.damageSources().onFire()) {
            if (!this.isInvulnerableTo(source)) {
                if (this.getRandom().nextInt(5) == 0 && !this.hasEffect(net.minecraft.world.effect.MobEffects.DAMAGE_RESISTANCE)) {
                    this.addEffect(new net.minecraft.world.effect.MobEffectInstance(com.dhanantry.scapeandrunparasites.init.SRPPotions.RAGE_E.get(), 200, 1));
                }
                super.hurt(source, this.getSkin() == 120 ? amount * (SRPConfig.firemultyplier - SRPConfig.firemultyplier / 2.0f) : amount * SRPConfig.firemultyplier);
            } else {
                return false;
            }
        }
        if (this.notOwner != null) {
            if (this.notOwner.isAlive()) {
                if (this.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.PIVOT_E.get())) {
                    net.minecraft.world.effect.MobEffectInstance pe = this.getEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.PIVOT_E.get());
                    this.notOwner.hurt(source, amount * (float) (pe.getAmplifier() + 1) * SRPConfigSystems.pivotDamageRHost);
                    return super.hurt(source, amount * SRPConfigSystems.pivotDamageRNotHost);
                }
                this.removeEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.PIVOT_E.get());
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
            if (source.getEntity() instanceof net.minecraft.world.entity.player.Player) {
                damageName = attacker != null ? attacker.getMainHandItem().getItem().toString() : "";
                naniDesu = 1;
            } else if (source.getEntity() instanceof net.minecraft.world.entity.LivingEntity) {
                damageName = source.getEntity() != null ? source.getEntity().getType().toString() : "";
                naniDesu = 2;
            } else {
                damageName = source.getMsgId();
                naniDesu = 3;
            }
        }
        if (flagWeak) {
            switch (naniDesu) {
                case 1:
                    for (int i = 0; i < SRPConfig.parasiteWeakToItems.length; ++i) {
                        String[] here;
                        if (SRPConfig.parasiteWeakToItems[i] == null || !(here = SRPConfig.parasiteWeakToItems[i].split(";"))[0].equals(damageName)) continue;
                        amount *= Float.parseFloat(here[1]);
                    }
                    break;
                case 2:
                    for (int i = 0; i < SRPConfig.parasiteWeakToMobs.length; ++i) {
                        String[] here;
                        if (SRPConfig.parasiteWeakToMobs[i] == null || !(here = SRPConfig.parasiteWeakToMobs[i].split(";"))[0].equals(damageName)) continue;
                        amount *= Float.parseFloat(here[1]);
                    }
                    break;
                case 3:
                    for (int i = 0; i < SRPConfig.parasiteWeakToElse.length; ++i) {
                        String[] here;
                        if (SRPConfig.parasiteWeakToElse[i] == null || !(here = SRPConfig.parasiteWeakToElse[i].split(";"))[0].equals(damageName)) continue;
                        amount *= Float.parseFloat(here[1]);
                    }
                    break;
            }
        }
        if (flagCap) {
            switch (naniDesu) {
                case 1:
                    if (ParasiteEventEntity.checkName(damageName, SRPConfig.damageCapBlackListItem, SRPConfig.damageCapBlackListWhite)) {
                        return super.hurt(source, amount);
                    }
                    break;
                case 2:
                    if (ParasiteEventEntity.checkName(damageName, SRPConfig.damageCapBlackListMob, SRPConfig.damageCapBlackListWhite)) {
                        return super.hurt(source, amount);
                    }
                    break;
                case 3:
                    if (ParasiteEventEntity.checkName(damageName, SRPConfig.damageCapBlackListElse, SRPConfig.damageCapBlackListWhite)) {
                        return super.hurt(source, amount);
                    }
                    break;
            }
            float damage = this.getMaxHealth() / (float) this.damageCap + this.getMaxHealth() % (float) this.damageCap * 0.5f;
            if (amount >= damage) {
                if (!this.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.RAGE_E.get())) {
                    this.addEffect(new net.minecraft.world.effect.MobEffectInstance(com.dhanantry.scapeandrunparasites.init.SRPPotions.RAGE_E.get(), 200, 1));
                }
            }
            return super.hurt(source, Math.min(amount, damage));
        }
        if (SRPConfigSystems.useOneMind && attacker != null && this.getTarget() == attacker) {
            ParasiteEventEntity.alertOthers(this, attacker, this.level(), 3);
        }
        return super.hurt(source, amount);
    }

    @Override
    public boolean doHurtTarget(net.minecraft.world.entity.Entity target) {
        if (this.level().isClientSide) {
            return false;
        }
        this.canBeStored = 55;
        boolean green = target instanceof net.minecraft.world.entity.LivingEntity;
        if (green) {
            this.attackEntityAsMobMinimum((net.minecraft.world.entity.LivingEntity) target);
        }
        boolean flag = super.doHurtTarget(target);
        if (flag) {
            if (this.getSkin() == 120) {
                net.minecraft.world.entity.LivingEntity le = (net.minecraft.world.entity.LivingEntity) target;
                le.addEffect(new net.minecraft.world.effect.MobEffectInstance(net.minecraft.world.effect.MobEffects.MOVEMENT_SLOWDOWN, 100, 1));
            }
            if (green) {
                this.setAttackCooldownAni(100);
                if (SRPConfigSystems.useOneMind) {
                    ParasiteEventEntity.alertOthers(this, (net.minecraft.world.entity.LivingEntity) target, this.level(), 3);
                }
            }
        }
        return flag;
    }

    public boolean attackEntityAsMobMinimum(net.minecraft.world.entity.LivingEntity target) {
        if (this.MiniDamage == 0.0f) {
            return false;
        }
        float f1 = target.getHealth();
        if (f1 <= 0.0f) {
            return false;
        }
        if (target instanceof net.minecraft.world.entity.player.Player) {
            net.minecraft.world.entity.player.Player player = (net.minecraft.world.entity.player.Player) target;
            if (player.isCreative()) {
                return false;
            }
            player.causeFoodExhaustion(this.foodSteal);
        }
        net.minecraft.world.damagesource.DamageSource s = this.damageSources().mobAttack(this);
        float damage = this.MiniDamage;
        if (target.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.VIRA_E.get())) {
            net.minecraft.world.effect.MobEffectInstance vira = target.getEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.VIRA_E.get());
            damage = this.MiniDamage * (float) (vira.getAmplifier() + 1);
        }
        damage += this.MiniDamage;
        try {
            // combat tracker API differs in 1.20.1; skip
        } catch (Exception ignored) { }
        if (target.getAbsorptionAmount() > 0.0f) {
            target.setHealth(f1 - damage / 2.0f);
            target.setAbsorptionAmount(target.getAbsorptionAmount() - damage / 2.0f);
        } else {
            target.setHealth(f1 - damage);
        }
        this.level().broadcastEntityEvent(target, (byte) 2);
        if (target.getHealth() <= 0.0f) {
            target.die(s);
            this.killcount += 1.0;
        }
        return true;
    }

    @Override
    public void die(net.minecraft.world.damagesource.DamageSource cause) {
        super.die(cause);
        if (!this.level().isClientSide) {
            this.spawnCyst();
            ParasiteEventEntity.spawnBeckon(this.level(), cause, this);
            ParasiteEventEntity.leaveScent(this.level(), cause, this);
            if (SRPConfigSystems.useEvolution && !this.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.DEBAR_E.get())) {
                com.dhanantry.scapeandrunparasites.world.SRPSaveData.get(this.level()).setTotalKills(this.level().dimension().location().hashCode(), -this.valueEvDeath, true, this.level(), false);
            }
            if (cause.getEntity() instanceof net.minecraft.world.entity.player.Player) {
                this.checkWeapon((net.minecraft.world.entity.player.Player) cause.getEntity());
            }
        }
    }

    private void checkWeapon(net.minecraft.world.entity.player.Player playerIn) {
        if (!SRPConfigSystems.useScent) {
            return;
        }
        net.minecraft.world.item.ItemStack ga = playerIn.getMainHandItem();
        if ((ga.getItem() instanceof com.dhanantry.scapeandrunparasites.item.tool.WeaponToolMeleeBase || ga.getItem() instanceof com.dhanantry.scapeandrunparasites.item.tool.WeaponToolRangeBase) && this.getRandom().nextInt(10) == 0) {
            playerIn.addEffect(new net.minecraft.world.effect.MobEffectInstance(com.dhanantry.scapeandrunparasites.init.SRPPotions.PREY_E.get(), 600, 0));
        }
    }

    public void onKillEntity(net.minecraft.world.entity.LivingEntity entityLivingIn) {
        if (this.level().isClientSide) {
            return;
        }
        if (this.killcount >= 0.0) {
            if (this.getSkin() != 120) {
                this.killcount += 1.0;
            } else if (this.getRandom().nextInt(3) == 0) {
                this.killcount += 1.0;
            }
        }
        if (SRPConfigSystems.useEvolution) {
            if (this.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.PIVOT_E.get())) {
                net.minecraft.world.effect.MobEffectInstance amp = this.getEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.PIVOT_E.get());
                com.dhanantry.scapeandrunparasites.world.SRPSaveData.get(this.level()).setTotalKills(this.level().dimension().location().hashCode(), SRPConfigSystems.valueKill * (SRPConfigSystems.pivotPointMultiplier * (amp.getAmplifier() + 1)), true, this.level(), true);
            } else {
                com.dhanantry.scapeandrunparasites.world.SRPSaveData.get(this.level()).setTotalKills(this.level().dimension().location().hashCode(), SRPConfigSystems.valueKill, true, this.level(), true);
            }
        }
        if (entityLivingIn.hasEffect(com.dhanantry.scapeandrunparasites.init.SRPPotions.COTH_E.get()) && this.getRandom().nextDouble() < (double) SRPConfigSystems.cothConvert) {
            ParasiteEventEntity.convertEntity(entityLivingIn, entityLivingIn.getPersistentData(), true, SRPConfigSystems.COTHVictimParasite);
        }
        this.addEffect(new net.minecraft.world.effect.MobEffectInstance(net.minecraft.world.effect.MobEffects.REGENERATION, 80, 0));
        this.setWait(10);
    }
    protected void spawnCyst() { /* TODO */ }
}