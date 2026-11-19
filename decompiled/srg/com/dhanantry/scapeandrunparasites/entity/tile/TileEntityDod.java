/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.ITickable
 *  net.minecraft.util.math.AxisAlignedBB
 */
package com.dhanantry.scapeandrunparasites.entity.tile;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPStationaryArchitect;
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
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.AxisAlignedBB;

public class TileEntityDod
extends TileEntity
implements ITickable {
    private int ticksSinceSync;
    private int killC;

    public void func_145839_a(NBTTagCompound compound) {
        super.func_145839_a(compound);
        if (compound.func_150297_b("parasitekillc", 3)) {
            this.killC = compound.func_74762_e("parasitekillc");
        }
    }

    public NBTTagCompound func_189515_b(NBTTagCompound compound) {
        super.func_189515_b(compound);
        compound.func_74768_a("parasitekillc", this.killC);
        return compound;
    }

    public void func_73660_a() {
        if (!this.field_145850_b.field_72995_K) {
            ++this.ticksSinceSync;
            if (this.ticksSinceSync % 20 != 0) {
                return;
            }
            double coll = 0.0;
            AxisAlignedBB axisalignedbb = new AxisAlignedBB((double)this.field_174879_c.func_177958_n(), (double)this.field_174879_c.func_177956_o(), (double)this.field_174879_c.func_177952_p(), (double)(this.field_174879_c.func_177958_n() + 1), (double)(this.field_174879_c.func_177956_o() + 1), (double)(this.field_174879_c.func_177952_p() + 1)).func_186662_g(16.0);
            List moblist = this.field_145850_b.func_72872_a(EntityParasiteBase.class, axisalignedbb);
            for (Object mob : moblist) {
                if (!(mob.getKillC() > 1.0)) continue;
                coll += mob.getKillC();
                mob.setKillC(0.0);
            }
            if (coll != 0.0) {
                this.killC += (int)coll;
            }
            if (this.killC > SRPConfig.reinforcerNidusValue) {
                assert (Blocks.field_150350_a != null);
                int ccc = 0;
                axisalignedbb = new AxisAlignedBB((double)this.field_174879_c.func_177958_n(), (double)this.field_174879_c.func_177956_o(), (double)this.field_174879_c.func_177952_p(), (double)(this.field_174879_c.func_177958_n() + 1), (double)(this.field_174879_c.func_177956_o() + 1), (double)(this.field_174879_c.func_177952_p() + 1)).func_186662_g(SRPConfig.turretFollow);
                moblist = this.field_145850_b.func_72872_a(EntityPStationaryArchitect.class, axisalignedbb);
                for (EntityParasiteBase mob : moblist) {
                    if (!(mob instanceof EntityDod) && !(mob instanceof EntityDodSII) && !(mob instanceof EntityDodSIII) && !(mob instanceof EntityDodSIV)) continue;
                    ++ccc;
                }
                if (ccc == 0) {
                    SRPSaveData data;
                    if (ParasiteEventEntity.entityChunkCount(this.field_145850_b, this.field_174879_c, EntityPStationaryArchitect.class) == 0) {
                        if (SRPConfigSystems.useEvolution && this.getRSChance((data = SRPSaveData.get(this.field_145850_b)).getEvolutionPhase(this.field_145850_b.field_73011_w.getDimension())) == 0.0) {
                            data.setTotalKills(this.field_145850_b.field_73011_w.getDimension(), this.killC * SRPConfig.reinforcerNidusMult, true, this.field_145850_b, true);
                            this.field_145850_b.func_175656_a(this.func_174877_v(), Blocks.field_150350_a.func_176223_P());
                            return;
                        }
                        EntityDod dod = new EntityDod(this.field_145850_b);
                        dod.func_70107_b((double)this.field_174879_c.func_177958_n() + 0.5, this.field_174879_c.func_177956_o() + 1, (double)this.field_174879_c.func_177952_p() + 0.5);
                        if (!dod.field_70170_p.func_184144_a((Entity)dod, dod.func_174813_aQ()).isEmpty()) {
                            dod.func_70106_y();
                        } else {
                            this.field_145850_b.func_72838_d((Entity)dod);
                            dod.particleStatus((byte)7);
                            if (SRPConfigSystems.rsSounds) {
                                dod.func_184185_a(SRPSounds.DODSI, 4.0f, 1.0f);
                            }
                        }
                    } else if (SRPConfigSystems.useEvolution) {
                        data = SRPSaveData.get(this.field_145850_b);
                        data.setTotalKills(this.field_145850_b.field_73011_w.getDimension(), this.killC * SRPConfig.reinforcerNidusMult, true, this.field_145850_b, true);
                    }
                }
                this.field_145850_b.func_175656_a(this.func_174877_v(), Blocks.field_150350_a.func_176223_P());
            }
        }
    }

    public double getRSChance(byte in) {
        switch (in) {
            case 1: {
                return SRPConfigSystems.reinforcementSystemChanceOne;
            }
            case 2: {
                return SRPConfigSystems.reinforcementSystemChanceTwo;
            }
            case 3: {
                return SRPConfigSystems.reinforcementSystemChanceThree;
            }
            case 4: {
                return SRPConfigSystems.reinforcementSystemChanceFour;
            }
            case 5: {
                return SRPConfigSystems.reinforcementSystemChanceFive;
            }
            case 6: {
                return SRPConfigSystems.reinforcementSystemChanceSix;
            }
            case 7: {
                return SRPConfigSystems.reinforcementSystemChanceSeven;
            }
            case 8: {
                return SRPConfigSystems.reinforcementSystemChanceEight;
            }
        }
        return 0.0;
    }
}

