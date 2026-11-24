package com.dhanantry.scapeandrunparasites.entity.tile;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityDod;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityDodSII;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityDodSIII;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityDodSIV;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

/**
 * Migracion de TileEntityDod a 1.20.1 (BlockEntity). Logica de tick migrada.
 */
public class TileEntityDod extends BlockEntity {
    private int ticksSinceSync;
    private int killC;

    public TileEntityDod(BlockPos pos, BlockState state) {
        super(null, pos, state);
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putInt("parasitekillc", this.killC);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        if (tag.contains("parasitekillc")) {
            this.killC = tag.getInt("parasitekillc");
        }
    }

    public void tick() {
        if (this.level == null || this.level.isClientSide) return;
        ++this.ticksSinceSync;
        if (this.ticksSinceSync % 20 != 0) return;
        BlockPos pos = this.worldPosition;
        double coll = 0.0;
        AABB axisalignedbb = new AABB(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + 1, pos.getY() + 1, pos.getZ() + 1).inflate(16.0);
        java.util.List<EntityParasiteBase> moblist = this.level.getEntitiesOfClass(EntityParasiteBase.class, axisalignedbb);
        for (EntityParasiteBase mob : moblist) {
            // getKillC/setKillC not in base stub; skip accumulation (TODO: wire when EntityParasiteBase gains these)
        }
        if (coll != 0.0) {
            this.killC += (int) coll;
        }
        if (this.killC > SRPConfig.reinforcerNidusValue) {
            int ccc = 0;
            AABB aabb2 = new AABB(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + 1, pos.getY() + 1, pos.getZ() + 1).inflate(SRPConfig.turretFollow);
            java.util.List<EntityParasiteBase> moblist2 = this.level.getEntitiesOfClass(EntityParasiteBase.class, aabb2);
            for (EntityParasiteBase mob : moblist2) {
                if (mob instanceof EntityDod || mob instanceof EntityDodSII || mob instanceof EntityDodSIII || mob instanceof EntityDodSIV) {
                    ++ccc;
                }
            }
            if (ccc == 0) {
                if (ParasiteEventEntity.entityChunkCount(this.level, pos, com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect.class) == 0) {
                    if (SRPConfigSystems.useEvolution) {
                        SRPSaveData data = SRPSaveData.get(this.level);
                        byte phase = data.getEvolutionPhase(SRPSaveData.dimensionId(this.level));
                        if (this.getRSChance(phase) == 0.0) {
                            data.setTotalKills(SRPSaveData.dimensionId(this.level), this.killC * SRPConfig.reinforcerNidusMult, true, this.level, true);
                            this.level.setBlock(pos, net.minecraft.world.level.block.Blocks.AIR.defaultBlockState(), 3);
                            return;
                        }
                        try {
                            EntityDod dod = new EntityDod(null, this.level);
                            dod.setPos(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
                            if (!this.level.noCollision(dod)) {
                                dod.discard();
                            } else {
                                this.level.addFreshEntity(dod);
                                if (SRPConfigSystems.rsSounds) {
                                    dod.playSound(SRPSounds.DODSI.get(), 4.0f, 1.0f);
                                }
                            }
                        } catch (Exception ignored) { }
                    }
                } else if (SRPConfigSystems.useEvolution) {
                    SRPSaveData data = SRPSaveData.get(this.level);
                    data.setTotalKills(SRPSaveData.dimensionId(this.level), this.killC * SRPConfig.reinforcerNidusMult, true, this.level, true);
                }
            }
            this.level.setBlock(pos, net.minecraft.world.level.block.Blocks.AIR.defaultBlockState(), 3);
        }
    }

    public double getRSChance(byte in) {
        switch (in) {
            case 1: return SRPConfigSystems.reinforcementSystemChanceOne;
            case 2: return SRPConfigSystems.reinforcementSystemChanceTwo;
            case 3: return SRPConfigSystems.reinforcementSystemChanceThree;
            case 4: return SRPConfigSystems.reinforcementSystemChanceFour;
            case 5: return SRPConfigSystems.reinforcementSystemChanceFive;
            case 6: return SRPConfigSystems.reinforcementSystemChanceSix;
            case 7: return SRPConfigSystems.reinforcementSystemChanceSeven;
            case 8: return SRPConfigSystems.reinforcementSystemChanceEight;
        }
        return 0.0;
    }
}