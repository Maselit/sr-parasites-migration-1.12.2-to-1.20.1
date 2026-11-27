package com.dhanantry.scapeandrunparasites.entity.ai.misc;

import com.dhanantry.scapeandrunparasites.entity.ai.EntityAIVenkrolSummon;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrol;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrolSII;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrolSIII;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.ArrayList;

public abstract class EntityPDispatcher extends com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase {
    // Dispatcher (Dod) fields
    protected ArrayList<String> mobNameId = new ArrayList<>();
    protected int crude;
    protected int inf;
    protected int mangler;
    protected int flesh;

    // Architect (nexus) fields
    public int totalP = 0;
    public int actualP = 0;
    public boolean convert = true;
    public int[] mobID;
    public int[] mobPT;
    public boolean rsSpawned = false;
    public byte stage = 1;
    public float body = 0.0f;
    public int neededTime = 100;
    public int actualTime = 0;
    public int topParticles = 0;
    public boolean canGrowTo = true;
    private int bombC = 0;

    // Config-ish fields
    public int pointCap = 0;
    public double pointReduction = 0.0;
    public double chanceLearn = 0.0;
    public double chanceLearnFire = 0.0;
    public int DamageTypeCap = 0;
    public int damageCap = 1;
    public int valueEvDeath = 0;
    public double buried = 0.0;
    public double buriedT = 0.0;

    public boolean canChangeVariant = false;
    public Object summonV = null;

    public EntityPDispatcher(Level level) {
        super(level);
        this.killcount = -10.0;
        this.canGrowTo = true;
    }

    public EntityPDispatcher(EntityType<? extends EntityPDispatcher> type, Level level) {
        super(type, level);
        this.killcount = -10.0;
        this.canGrowTo = true;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.topParticles > 0) {
            --this.topParticles;
        }
        if (this.bombC > 0) {
            --this.bombC;
        }
    }

    // Basic setters/getters
    public void setCanGrowTo(boolean in) { this.canGrowTo = in; }
    public void setConvert(boolean in) { this.convert = in; }

    public int setGT(int minGrowTime, int maxGrowTime) {
        int atm = maxGrowTime - minGrowTime + 1;
        if (atm <= 0 || maxGrowTime <= minGrowTime) {
            return 1;
        }
        return this.getRandom().nextInt(atm) + minGrowTime;
    }

    public void setActualT(int in) {
        if (this.canGrowTo) {
            this.actualTime = in;
        }
    }

    public int getActualT() { return this.actualTime; }
    public int getNeededTime() { return this.neededTime; }
    public byte getStageV() { return this.stage; }
    public float getBODY() { return this.body; }
    public int getHitStatus() { return 0; }

    public void setRSSpawned(boolean in) { this.rsSpawned = in; }
    public boolean getRSSpawned() { return this.rsSpawned; }

    public LivingEntity getAttackTarget() { return this.getTarget(); }

    public boolean canEntityBeSeen(Entity e) {
        try { return this.hasLineOfSight(e); } catch (Exception ex) { return true; }
    }

    // ID management
    public void addID(int id, int points) {
        if (this.mobID == null) return;
        for (int i = 0; i < this.mobID.length; ++i) {
            if (this.mobID[i] != -777) continue;
            this.mobID[i] = id;
            this.mobPT[i] = points;
            return;
        }
    }

    public int IDable() {
        if (this.mobID == null) return 0;
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

    public void checkID() {
        if (this.mobID == null) return;
        for (int i = 0; i < this.mobID.length; ++i) {
            Entity flag = null;
            if (this.mobID[i] <= 0) continue;
            try { flag = this.level().getEntity(this.mobID[i]); } catch (Exception e) { flag = null; }
            if (flag != null) continue;
            this.mobID[i] = -777;
            int negative = this.mobPT[i] * -1;
            this.setActualParasites(negative);
        }
    }

    public int[] getIDList() { return this.mobID; }
    public int[] getPointList() { return this.mobPT; }

    public int getTotalParasites() { return this.totalP; }

    public int getActualParasites() { return this.actualP; }

    public void setActualParasites(int i) { this.actualP += i; }


    // Nearby parasite management (Venkrol)
    public int countNeraby(int id) {
        int count = 1;
        try {
            int st = this.stage;
            net.minecraft.world.entity.ai.attributes.AttributeInstance attr = this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE);
            double range = (attr == null ? 16.0 : attr.getValue()) + 5.0;
            net.minecraft.world.phys.AABB bb = new net.minecraft.world.phys.AABB(this.getX(), this.getY(), this.getZ(), this.getX() + 1.0, this.getY() + 1.0, this.getZ() + 1.0).inflate(range);
            if (st == 1) {
                for (EntityVenkrol mob : this.level().getEntitiesOfClass(EntityVenkrol.class, bb)) {
                    if (mob.getId() == id || !mob.isAlive() || !mob.hasLineOfSight(this) || (mob.summonV instanceof EntityAIVenkrolSummon && ((EntityAIVenkrolSummon) mob.summonV).getCounted())) continue;
                    if (mob.summonV instanceof EntityAIVenkrolSummon) ((EntityAIVenkrolSummon) mob.summonV).setCounted(true);
                    count += mob.countNeraby(id);
                }
            } else if (st == 2) {
                for (EntityVenkrolSII mob : this.level().getEntitiesOfClass(EntityVenkrolSII.class, bb)) {
                    if (mob.getId() == id || !mob.isAlive() || !mob.hasLineOfSight(this) || (mob.summonV instanceof EntityAIVenkrolSummon && ((EntityAIVenkrolSummon) mob.summonV).getCounted())) continue;
                    if (mob.summonV instanceof EntityAIVenkrolSummon) ((EntityAIVenkrolSummon) mob.summonV).setCounted(true);
                    count += mob.countNeraby(id);
                }
            } else if (st == 3) {
                for (EntityVenkrolSIII mob : this.level().getEntitiesOfClass(EntityVenkrolSIII.class, bb)) {
                    if (mob.getId() == id || !mob.isAlive() || !mob.hasLineOfSight(this) || (mob.summonV instanceof EntityAIVenkrolSummon && ((EntityAIVenkrolSummon) mob.summonV).getCounted())) continue;
                    if (mob.summonV instanceof EntityAIVenkrolSummon) ((EntityAIVenkrolSummon) mob.summonV).setCounted(true);
                    count += mob.countNeraby(id);
                }
            }
        } catch (Exception e) {}
        return count;
    }

    public void setNearbyNonConted(int id) {
        try {
            int st = this.stage;
            net.minecraft.world.entity.ai.attributes.AttributeInstance attr = this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE);
            double range = (attr == null ? 16.0 : attr.getValue()) + 5.0;
            net.minecraft.world.phys.AABB bb = new net.minecraft.world.phys.AABB(this.getX(), this.getY(), this.getZ(), this.getX() + 1.0, this.getY() + 1.0, this.getZ() + 1.0).inflate(range);
            if (st == 1) {
                for (EntityVenkrol mob : this.level().getEntitiesOfClass(EntityVenkrol.class, bb)) {
                    if (mob.getId() == id || !mob.isAlive()) continue;
                    if (!(mob.summonV instanceof EntityAIVenkrolSummon)) continue;
                    EntityAIVenkrolSummon ai = (EntityAIVenkrolSummon) mob.summonV;
                    if (!ai.getCounted()) continue;
                    if (!mob.hasLineOfSight(this)) continue;
                    ai.setCounted(false);
                    mob.setNearbyNonConted(id);
                }
            } else if (st == 2) {
                for (EntityVenkrolSII mob : this.level().getEntitiesOfClass(EntityVenkrolSII.class, bb)) {
                    if (mob.getId() == id || !mob.isAlive()) continue;
                    if (!(mob.summonV instanceof EntityAIVenkrolSummon)) continue;
                    EntityAIVenkrolSummon ai = (EntityAIVenkrolSummon) mob.summonV;
                    if (!ai.getCounted()) continue;
                    if (!mob.hasLineOfSight(this)) continue;
                    ai.setCounted(false);
                    mob.setNearbyNonConted(id);
                }
            } else if (st == 3) {
                for (EntityVenkrolSIII mob : this.level().getEntitiesOfClass(EntityVenkrolSIII.class, bb)) {
                    if (mob.getId() == id || !mob.isAlive()) continue;
                    if (!(mob.summonV instanceof EntityAIVenkrolSummon)) continue;
                    EntityAIVenkrolSummon ai = (EntityAIVenkrolSummon) mob.summonV;
                    if (!ai.getCounted()) continue;
                    if (!mob.hasLineOfSight(this)) continue;
                    ai.setCounted(false);
                    mob.setNearbyNonConted(id);
                }
            }
        } catch (Exception e) {}
    }

    public void setNerabyLocked(int id) {
        try {
            int st = this.stage;
            net.minecraft.world.entity.ai.attributes.AttributeInstance attr = this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE);
            double range = (attr == null ? 16.0 : attr.getValue()) + 5.0;
            net.minecraft.world.phys.AABB bb = new net.minecraft.world.phys.AABB(this.getX(), this.getY(), this.getZ(), this.getX() + 1.0, this.getY() + 1.0, this.getZ() + 1.0).inflate(range);
            if (st == 1) {
                for (EntityVenkrol mob : this.level().getEntitiesOfClass(EntityVenkrol.class, bb)) {
                    if (mob.getId() == id || !mob.isAlive()) continue;
                    if (!(mob.summonV instanceof EntityAIVenkrolSummon)) continue;
                    EntityAIVenkrolSummon ai = (EntityAIVenkrolSummon) mob.summonV;
                    if (ai.getLocker()) continue;
                    if (!mob.hasLineOfSight(this)) continue;
                    ai.setlocker(true);
                    mob.setNerabyLocked(id);
                }
            } else if (st == 2) {
                for (EntityVenkrolSII mob : this.level().getEntitiesOfClass(EntityVenkrolSII.class, bb)) {
                    if (mob.getId() == id || !mob.isAlive()) continue;
                    if (!(mob.summonV instanceof EntityAIVenkrolSummon)) continue;
                    EntityAIVenkrolSummon ai = (EntityAIVenkrolSummon) mob.summonV;
                    if (ai.getLocker()) continue;
                    if (!mob.hasLineOfSight(this)) continue;
                    ai.setlocker(true);
                    mob.setNerabyLocked(id);
                }
            } else if (st == 3) {
                for (EntityVenkrolSIII mob : this.level().getEntitiesOfClass(EntityVenkrolSIII.class, bb)) {
                    if (mob.getId() == id || !mob.isAlive()) continue;
                    if (!(mob.summonV instanceof EntityAIVenkrolSummon)) continue;
                    EntityAIVenkrolSummon ai = (EntityAIVenkrolSummon) mob.summonV;
                    if (ai.getLocker()) continue;
                    if (!mob.hasLineOfSight(this)) continue;
                    ai.setlocker(true);
                    mob.setNerabyLocked(id);
                }
            }
        } catch (Exception e) {}
    }

    public void setNearbyFree(int id) {
        try {
            int st = this.stage;
            net.minecraft.world.entity.ai.attributes.AttributeInstance attr = this.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE);
            double range = (attr == null ? 16.0 : attr.getValue()) + 5.0;
            net.minecraft.world.phys.AABB bb = new net.minecraft.world.phys.AABB(this.getX(), this.getY(), this.getZ(), this.getX() + 1.0, this.getY() + 1.0, this.getZ() + 1.0).inflate(range);
            if (st == 1) {
                for (EntityVenkrol mob : this.level().getEntitiesOfClass(EntityVenkrol.class, bb)) {
                    if (mob.getId() == id || !mob.isAlive()) continue;
                    if (!(mob.summonV instanceof EntityAIVenkrolSummon)) continue;
                    EntityAIVenkrolSummon ai = (EntityAIVenkrolSummon) mob.summonV;
                    if (!ai.getLocker()) continue;
                    if (!mob.hasLineOfSight(this)) continue;
                    ai.setlocker(false);
                    ai.setCooldownZero(-ai.getSCooldown());
                    mob.setNearbyFree(id);
                }
            } else if (st == 2) {
                for (EntityVenkrolSII mob : this.level().getEntitiesOfClass(EntityVenkrolSII.class, bb)) {
                    if (mob.getId() == id || !mob.isAlive()) continue;
                    if (!(mob.summonV instanceof EntityAIVenkrolSummon)) continue;
                    EntityAIVenkrolSummon ai = (EntityAIVenkrolSummon) mob.summonV;
                    if (!ai.getLocker()) continue;
                    if (!mob.hasLineOfSight(this)) continue;
                    ai.setlocker(false);
                    ai.setCooldownZero(-ai.getSCooldown());
                    mob.setNearbyFree(id);
                }
            } else if (st == 3) {
                for (EntityVenkrolSIII mob : this.level().getEntitiesOfClass(EntityVenkrolSIII.class, bb)) {
                    if (mob.getId() == id || !mob.isAlive()) continue;
                    if (!(mob.summonV instanceof EntityAIVenkrolSummon)) continue;
                    EntityAIVenkrolSummon ai = (EntityAIVenkrolSummon) mob.summonV;
                    if (!ai.getLocker()) continue;
                    if (!mob.hasLineOfSight(this)) continue;
                    ai.setlocker(false);
                    ai.setCooldownZero(-ai.getSCooldown());
                    mob.setNearbyFree(id);
                }
            }
        } catch (Exception e) {}
    }

    // Dispatcher store methods
    public java.util.ArrayList<String> getMobList() { return this.mobNameId; }

    protected java.lang.String entityKey(Entity e) {
        try {
            ResourceLocation rl = BuiltInRegistries.ENTITY_TYPE.getKey(e.getType());
            return rl == null ? null : rl.toString();
        } catch (Exception ex) {
            return null;
        }
    }

    public boolean storeLodo(EntityParasiteBase in, boolean upgrade) {
        if (in.getParasiteIDRegister() == 5 && upgrade) {
            this.mobNameId.add("srparasites:rupter");
            in.particleStatus((byte) 7);
            in.discard();
            return true;
        }
        if (in.getParasiteIDRegister() == 23 && upgrade) {
            in.particleStatus((byte) 7);
            in.discard();
            ++this.flesh;
            if (this.flesh >= 2) {
                this.flesh -= 2;
                this.addPrim();
                return true;
            }
            return true;
        }
        return false;
    }

    protected boolean storeInf(EntityParasiteBase in, boolean upgrade) {
        if ((in instanceof com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPInfected || in.getParasiteIDRegister() == 23) && upgrade) {
            ++this.inf;
            String key = entityKey(in);
            if (key != null) this.mobNameId.add(key);
            in.particleStatus((byte) 7);
            in.discard();
            if (this.inf >= 4 && this.mobNameId != null) {
                this.inf -= 4;
                int current = 0;
                for (int i = 0; i < this.mobNameId.size(); ++i) {
                    if (this.mobNameId.get(i) == null) {
                        this.mobNameId.remove(i);
                        --i;
                        continue;
                    }
                    if (!this.mobNameId.get(i).contains("sim_")) continue;
                    this.mobNameId.remove(i);
                    i = -1;
                    if (++current < 4) continue;
                    this.addPrim();
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    protected boolean storeCrude(EntityParasiteBase in, boolean upgrade) {
        if ((in.getParasiteIDRegister() == 43 || in.getParasiteIDRegister() == 39) && upgrade) {
            this.crude = in.getParasiteIDRegister() == 39 ? ++this.crude : (this.crude += 2);
            String key = entityKey(in);
            if (key != null) this.mobNameId.add(key);
            in.particleStatus((byte) 7);
            in.discard();
            if (this.crude >= 6 && this.mobNameId != null) {
                this.crude -= 6;
                int current = 0;
                for (int i = 0; i < this.mobNameId.size(); ++i) {
                    if (this.mobNameId.get(i) == null) {
                        this.mobNameId.remove(i);
                        --i;
                        continue;
                    }
                    if (!this.mobNameId.get(i).contains("incompleteform")) continue;
                    this.mobNameId.remove(i);
                    i = -1;
                    if (++current < 6) continue;
                    this.mobNameId.add("srparasites:heed");
                    break;
                }
            }
            return true;
        }
        return false;
    }

    protected boolean storeMudo(EntityParasiteBase in, boolean upgrade) {
        if (in.getParasiteIDRegister() == 12 && upgrade) {
            this.mobNameId.add("srparasites:mangler");
            in.particleStatus((byte) 7);
            in.discard();
            return true;
        }
        return false;
    }

    protected boolean storeMangler(EntityParasiteBase in, boolean upgrade) {
        if (in.getParasiteIDRegister() == 76 && upgrade) {
            ++this.mangler;
            String key = entityKey(in);
            if (key != null) this.mobNameId.add(key);
            in.particleStatus((byte) 7);
            in.discard();
            return true;
        }
        return false;
    }

    public void storeAll(EntityParasiteBase in) {
        String key = entityKey(in);
        if (key != null) this.mobNameId.add(key);
        in.particleStatus((byte) 7);
        in.discard();
    }

    public boolean storeParasite(EntityParasiteBase in) {
        if (!in.isAlive()) {
            return true;
        }
        if (in.getParasiteIDRegister() == 36) {
            return true;
        }
        float bHard = 0.0f;
        BlockPos down1 = this.blockPosition().below();
        BlockState state2 = this.level().getBlockState(down1);
        float atm = state2.getDestroySpeed(this.level(), down1);
        if (atm <= 0.0f) {
            return true;
        }
        bHard += atm;
        BlockPos down2 = this.blockPosition().below(2);
        atm = this.level().getBlockState(down2).getDestroySpeed(this.level(), down2);
        if (atm <= 0.0f) {
            return true;
        }
        bHard += atm;
        BlockPos down3 = this.blockPosition().below(3);
        atm = this.level().getBlockState(down3).getDestroySpeed(this.level(), down3);
        if (atm <= 0.0f) {
            return true;
        }
        return (bHard += atm) >= 10.0f;
    }

    private void addPrim() {
        int prim = this.getRandom().nextInt(7);
        boolean canAdd = true;
        for (int safe = 0; canAdd && safe < 10; ++safe) {
            switch (prim) {
                case 0:
                    if (com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs.emanaEnabled) { this.mobNameId.add("srparasites:pri_yelloweye"); canAdd = false; }
                    break;
                case 1:
                    if (com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs.canraEnabled) { this.mobNameId.add("srparasites:pri_summoner"); canAdd = false; }
                    break;
                case 2:
                    if (com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs.zetmoEnabled) { this.mobNameId.add("srparasites:pri_bolster"); canAdd = false; }
                    break;
                case 3:
                    if (com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs.shycoEnabled) { this.mobNameId.add("srparasites:pri_longarms"); canAdd = false; }
                    break;
                case 4:
                    if (com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs.arachnidaEnabled) { this.mobNameId.add("srparasites:pri_arachnida"); canAdd = false; }
                    break;
                case 5:
                    if (com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs.noglaEnabled) { this.mobNameId.add("srparasites:pri_reeker"); canAdd = false; }
                    break;
                case 6:
                    if (com.dhanantry.scapeandrunparasites.util.config.SRPConfigMobs.hullEnabled) { this.mobNameId.add("srparasites:pri_manducater"); canAdd = false; }
                    break;
            }
            if (++prim < 7) continue;
            prim = 0;
        }
    }

    public String getParasiteStored() {
        if (this.mobNameId.isEmpty()) {
            return null;
        }
        int j = this.getRandom().nextInt(this.mobNameId.size());
        String name = this.mobNameId.get(j);
        if (name == null) {
            return null;
        }
        if (name.contains("sim_")) {
            --this.inf;
        } else if (name.contains("incompleteform_small")) {
            --this.crude;
        } else if (name.contains("incompleteform_medium")) {
            this.crude -= 2;
        } else if (name.contains("mangler")) {
            --this.mangler;
        }
        this.mobNameId.remove(j);
        return name;
    }

    public void addParaBack(String id) {
        this.mobNameId.add(id);
    }

    public abstract float getBombDamage();

    public boolean hasLineOfSight(LivingEntity e) {
        return super.hasLineOfSight(e);
    }

    // particle helper stub
    public void spawnParticlesTop(com.dhanantry.scapeandrunparasites.client.particle.SRPEnumParticle particleType, int r, int g, int b) {
        // no-op client-side helper; original spawns particles
    }
}
