/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.ai.EntityAIBase
 */
package com.dhanantry.scapeandrunparasites.entity.ai;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityDodSII;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityDodSIII;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityDodSIV;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityLeemSII;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityLeemSIII;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityLeemSIV;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrolSII;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrolSIII;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrolSIV;
import com.dhanantry.scapeandrunparasites.init.SRPSounds;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventWorld;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import com.dhanantry.scapeandrunparasites.world.biome.BiomeParasite;
import java.util.Random;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAINexusGrow
extends EntityAIBase {
    private final EntityPStationaryArchitect parent;
    private byte venkrolCurrentStage;
    private double tickss;
    private byte type;
    private boolean canGrow;
    private int dimLock;

    public EntityAINexusGrow(EntityPStationaryArchitect venkrol, int CURRENTstage) {
        this.parent = venkrol;
        this.tickss = 20.0;
        this.type = 1;
        this.venkrolCurrentStage = (byte)CURRENTstage;
        this.canGrow = true;
        this.dimLock = -1;
        String[] here = new String[2];
        for (int i = 0; i < SRPConfigSystems.maximumStageList.length; ++i) {
            int dimension;
            here = SRPConfigSystems.maximumStageList[i].split(";");
            if (here[0].length() == 0 || (dimension = Integer.parseInt(here[0])) != this.parent.field_70170_p.field_73011_w.getDimension()) continue;
            this.dimLock = Integer.parseInt(here[1]);
        }
    }

    public EntityAINexusGrow(EntityPStationaryArchitect venkrol, int CURRENTstage, byte in) {
        this(venkrol, CURRENTstage);
        this.type = in;
    }

    public boolean func_75250_a() {
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

    public void func_75251_c() {
    }

    public void func_75246_d() {
        if (this.venkrolCurrentStage == 3 && this.parent.field_70170_p.func_180494_b(this.parent.func_180425_c()) instanceof BiomeParasite) {
            this.tickss = 20000.0;
        } else {
            int j = this.parent.getActualT();
            this.parent.setActualT(++j);
            if (j > this.parent.neededTime) {
                this.parent.setConvert(false);
                switch (this.type) {
                    case 1: {
                        this.upgradeV();
                        break;
                    }
                    case 2: {
                        this.upgradeD();
                        break;
                    }
                    case 3: {
                        this.upgradeL();
                    }
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
            Random rand = new Random();
            block0 : switch (SRPSaveData.get(this.parent.field_70170_p).getEvolutionPhase(this.parent.field_70170_p.field_73011_w.getDimension())) {
                case -1: {
                    this.canGrow = false;
                    break;
                }
                case 0: {
                    this.canGrow = false;
                    break;
                }
                case 1: {
                    switch (this.venkrolCurrentStage) {
                        case 1: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIGrowPenaltyOne) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 2: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIIGrowPenaltyOne) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 3: {
                            this.canGrow = !(rand.nextDouble() < SRPConfigSystems.beckonStageIIIGrowPenaltyOne);
                        }
                    }
                    break;
                }
                case 2: {
                    switch (this.venkrolCurrentStage) {
                        case 1: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIGrowPenaltyTwo) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 2: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIIGrowPenaltyTwo) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 3: {
                            this.canGrow = !(rand.nextDouble() < SRPConfigSystems.beckonStageIIIGrowPenaltyTwo);
                        }
                    }
                    break;
                }
                case 3: {
                    switch (this.venkrolCurrentStage) {
                        case 1: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIGrowPenaltyThree) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 2: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIIGrowPenaltyThree) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 3: {
                            this.canGrow = !(rand.nextDouble() < SRPConfigSystems.beckonStageIIIGrowPenaltyThree);
                        }
                    }
                    break;
                }
                case 4: {
                    switch (this.venkrolCurrentStage) {
                        case 1: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIGrowPenaltyFour) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 2: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIIGrowPenaltyFour) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 3: {
                            this.canGrow = !(rand.nextDouble() < SRPConfigSystems.beckonStageIIIGrowPenaltyFour);
                        }
                    }
                    break;
                }
                case 5: {
                    switch (this.venkrolCurrentStage) {
                        case 1: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIGrowPenaltyFive) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 2: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIIGrowPenaltyFive) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 3: {
                            this.canGrow = !(rand.nextDouble() < SRPConfigSystems.beckonStageIIIGrowPenaltyFive);
                        }
                    }
                    break;
                }
                case 6: {
                    switch (this.venkrolCurrentStage) {
                        case 1: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIGrowPenaltySix) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 2: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIIGrowPenaltySix) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 3: {
                            this.canGrow = !(rand.nextDouble() < SRPConfigSystems.beckonStageIIIGrowPenaltySix);
                        }
                    }
                    break;
                }
                case 7: {
                    switch (this.venkrolCurrentStage) {
                        case 1: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIGrowPenaltySeven) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 2: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIIGrowPenaltySeven) {
                                this.canGrow = false;
                                break;
                            }
                            this.canGrow = true;
                            break;
                        }
                        case 3: {
                            this.canGrow = !(rand.nextDouble() < SRPConfigSystems.beckonStageIIIGrowPenaltySeven);
                        }
                    }
                    break;
                }
                case 8: {
                    switch (this.venkrolCurrentStage) {
                        case 1: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIGrowPenaltyEight) {
                                this.canGrow = false;
                                break block0;
                            }
                            this.canGrow = true;
                            break block0;
                        }
                        case 2: {
                            if (rand.nextDouble() < SRPConfigSystems.beckonStageIIGrowPenaltyEight) {
                                this.canGrow = false;
                                break block0;
                            }
                            this.canGrow = true;
                            break block0;
                        }
                        case 3: {
                            this.canGrow = !(rand.nextDouble() < SRPConfigSystems.beckonStageIIIGrowPenaltyEight);
                        }
                    }
                }
            }
        }
    }

    private void upgradeV() {
        if (!ParasiteEventEntity.canSpawnNext) {
            return;
        }
        if (this.venkrolCurrentStage == 1) {
            EntityVenkrolSII out = new EntityVenkrolSII(this.parent.field_70170_p);
            out.setRSSpawned(this.parent.getRSSpawned());
            out.cannotDespawn(this.parent.func_70692_ba());
            ParasiteEventEntity.spawnNext(this.parent, out, true, false);
            if (SRPConfigSystems.rsSounds) {
                this.parent.func_184185_a(SRPSounds.VENKROLSII, 10.0f, 1.0f);
            }
        } else if (this.venkrolCurrentStage == 2) {
            EntityVenkrolSIII out = new EntityVenkrolSIII(this.parent.field_70170_p);
            out.setRSSpawned(this.parent.getRSSpawned());
            out.cannotDespawn(this.parent.func_70692_ba());
            ParasiteEventEntity.spawnNext(this.parent, out, true, false);
            if (SRPConfigSystems.rsSounds) {
                this.parent.func_184185_a(SRPSounds.VENKROLSIII, 9.0f, 1.0f);
            }
        } else if (this.venkrolCurrentStage == 3) {
            if (ParasiteEventWorld.canBiomeStillExist(this.parent.field_70170_p, this.parent.func_180425_c(), false) >= 1) {
                this.tickss = 20000.0;
                return;
            }
            EntityVenkrolSIV out = new EntityVenkrolSIV(this.parent.field_70170_p);
            out.setRSSpawned(this.parent.getRSSpawned());
            out.cannotDespawn(this.parent.func_70692_ba());
            ParasiteEventEntity.spawnNext(this.parent, out, true, false);
            if (SRPConfigSystems.rsSounds) {
                this.parent.func_184185_a(SRPSounds.VENKROLSIV, 10.0f, 1.0f);
            }
        }
    }

    private void upgradeD() {
        if (!ParasiteEventEntity.canSpawnNext) {
            return;
        }
        if (this.venkrolCurrentStage == 1) {
            EntityDodSII out = new EntityDodSII(this.parent.field_70170_p);
            out.setRSSpawned(this.parent.getRSSpawned());
            out.cannotDespawn(this.parent.func_70692_ba());
            ParasiteEventEntity.spawnNext(this.parent, out, true, false);
            if (SRPConfigSystems.rsSounds) {
                this.parent.func_184185_a(SRPSounds.DODSII, 10.0f, 1.0f);
            }
        } else if (this.venkrolCurrentStage == 2) {
            EntityDodSIII out = new EntityDodSIII(this.parent.field_70170_p);
            out.setRSSpawned(this.parent.getRSSpawned());
            out.cannotDespawn(this.parent.func_70692_ba());
            ParasiteEventEntity.spawnNext(this.parent, out, true, false);
            if (SRPConfigSystems.rsSounds) {
                this.parent.func_184185_a(SRPSounds.DODSIII, 9.0f, 1.0f);
            }
        } else if (this.venkrolCurrentStage == 3) {
            if (ParasiteEventWorld.rangeOfColony(this.parent.field_70170_p, this.parent.func_180425_c(), true) != null) {
                this.tickss = 20000.0;
                return;
            }
            EntityDodSIV out = new EntityDodSIV(this.parent.field_70170_p);
            out.setRSSpawned(this.parent.getRSSpawned());
            out.cannotDespawn(this.parent.func_70692_ba());
            ParasiteEventEntity.spawnNext(this.parent, out, true, false);
            if (SRPConfigSystems.rsSounds) {
                this.parent.func_184185_a(SRPSounds.DODSIV, 10.0f, 1.0f);
            }
        }
    }

    private void upgradeL() {
        if (!ParasiteEventEntity.canSpawnNext) {
            return;
        }
        if (this.venkrolCurrentStage == 1) {
            EntityLeemSII out = new EntityLeemSII(this.parent.field_70170_p);
            out.setRSSpawned(this.parent.getRSSpawned());
            out.cannotDespawn(this.parent.func_70692_ba());
            ParasiteEventEntity.spawnNext(this.parent, out, true, false);
            if (SRPConfigSystems.rsSounds) {
                this.parent.func_184185_a(SRPSounds.DODSII, 10.0f, 1.0f);
            }
        } else if (this.venkrolCurrentStage == 2) {
            EntityLeemSIII out = new EntityLeemSIII(this.parent.field_70170_p);
            out.setRSSpawned(this.parent.getRSSpawned());
            out.cannotDespawn(this.parent.func_70692_ba());
            ParasiteEventEntity.spawnNext(this.parent, out, true, false);
            if (SRPConfigSystems.rsSounds) {
                this.parent.func_184185_a(SRPSounds.DODSIII, 9.0f, 1.0f);
            }
        } else if (this.venkrolCurrentStage == 3) {
            EntityLeemSIV out = new EntityLeemSIV(this.parent.field_70170_p);
            out.setRSSpawned(this.parent.getRSSpawned());
            out.cannotDespawn(this.parent.func_70692_ba());
            ParasiteEventEntity.spawnNext(this.parent, out, true, false);
            if (SRPConfigSystems.rsSounds) {
                this.parent.func_184185_a(SRPSounds.DODSIV, 10.0f, 1.0f);
            }
        }
    }
}

