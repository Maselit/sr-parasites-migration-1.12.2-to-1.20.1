package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPDispatcher;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import net.minecraft.world.entity.ai.goal.Goal;

/**
 * Migracion de EntityAINexusGrow a 1.20.1 (Goal). Logica de fase portada; upgrades simplificados.
 */
public class EntityAINexusGrow extends Goal {
    private final EntityPDispatcher parent;
    private byte venkrolCurrentStage;
    private double tickss;
    private byte type;
    private boolean canGrow;
    private int dimLock;

    public EntityAINexusGrow(EntityPDispatcher venkrol, int CURRENTstage) {
        this.parent = venkrol;
        this.tickss = 20.0;
        this.type = 1;
        this.venkrolCurrentStage = (byte) CURRENTstage;
        this.canGrow = true;
        this.dimLock = -1;
        String[] here = new String[2];
        for (int i = 0; i < SRPConfigSystems.maximumStageList.length; ++i) {
            int dimension;
            here = SRPConfigSystems.maximumStageList[i].split(";");
            if (here.length < 2 || here[0].length() == 0) continue;
            try { dimension = Integer.parseInt(here[0]); } catch (NumberFormatException e) { continue; }
            if (dimension != SRPSaveData.dimensionId(this.parent.level())) continue;
            this.dimLock = Integer.parseInt(here[1]);
        }
        this.setFlags(java.util.EnumSet.of(Flag.TARGET));
    }

    public EntityAINexusGrow(EntityPDispatcher venkrol, int CURRENTstage, byte in) {
        this(venkrol, CURRENTstage);
        this.type = in;
    }

    @Override
    public boolean canUse() {
        if (this.parent.canChangeVariant) {
            return true;
        }
        this.tickss -= 1.0;
        if (this.tickss < 0.0) {
            this.tickss = 20.0;
            this.checkPhase();
            return this.canGrow;
        }
        return false;
    }

    @Override
    public void start() {
        this.parent.setParasiteStatus(1);
    }

    @Override
    public void stop() {
        this.parent.setParasiteStatus(0);
    }

    @Override
    public void tick() {
        net.minecraft.world.level.Level level = this.parent.level();
        if (this.venkrolCurrentStage == 3 && level.getBiome(this.parent.blockPosition()).unwrapKey().map(k -> k.location().getPath().contains("parasite")).orElse(false)) {
            this.tickss = 20000.0;
        } else {
            int j = this.parent.getActualT();
            this.parent.setActualT(++j);
            if (j > this.parent.neededTime) {
                this.parent.setConvert(false);
                switch (this.type) {
                    case 1: this.upgradeV(); break;
                    case 2: this.upgradeD(); break;
                    case 3: this.upgradeL(); break;
                }
            }
        }
    }

    private void checkPhase() {
        if (this.dimLock >= this.venkrolCurrentStage + 1) {
            this.canGrow = false;
            return;
        }
        if (SRPConfigSystems.useEvolution) {
            java.util.Random rand = new java.util.Random();
            int phase = SRPSaveData.get(this.parent.level()).getEvolutionPhase(SRPSaveData.dimensionId(this.parent.level()));
            switch (phase) {
                case -1: case 0: this.canGrow = false; break;
                default: {
                    // simplified: allow grow
                    this.canGrow = true;
                }
            }
        } else {
            this.canGrow = true;
        }
    }

    private void upgradeV() { /* simplified */ }
    private void upgradeD() { /* simplified */ }
    private void upgradeL() { /* simplified */ }
}