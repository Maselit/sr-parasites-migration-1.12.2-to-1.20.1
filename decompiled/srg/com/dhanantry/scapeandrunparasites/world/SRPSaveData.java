/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.world.World
 *  net.minecraft.world.storage.MapStorage
 *  net.minecraft.world.storage.WorldSavedData
 *  org.apache.logging.log4j.Level
 */
package com.dhanantry.scapeandrunparasites.world;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.network.SRPCommandEvolution;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import java.util.ArrayList;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapStorage;
import net.minecraft.world.storage.WorldSavedData;
import org.apache.logging.log4j.Level;

public class SRPSaveData
extends WorldSavedData {
    private ArrayList<Integer> dimEPid = new ArrayList();
    private ArrayList<Integer> dimEPtotalKills = new ArrayList();
    private ArrayList<Byte> dimEPevolution = new ArrayList();
    private ArrayList<Integer> dimEPtimeEvolution = new ArrayList();
    private ArrayList<Boolean> dimEPcanGainPoints = new ArrayList();
    private ArrayList<Boolean> dimEPcanLossPoints = new ArrayList();
    private static final String DATA_NAME = "srparasites_global_data";
    private static SRPSaveData instance;
    private ArrayList<Integer> lockedParasites = new ArrayList();
    private ArrayList<Byte> simRegId = new ArrayList();
    private ArrayList<Integer> simRegIdTimes = new ArrayList();

    public SRPSaveData() {
        super(DATA_NAME);
    }

    public SRPSaveData(String name) {
        super(name);
    }

    public static SRPSaveData get(World world) {
        MapStorage storage = world.func_175693_T();
        instance = (SRPSaveData)storage.func_75742_a(SRPSaveData.class, DATA_NAME);
        if (instance == null) {
            System.out.println("nanissss--------asdddddddddddddddddddddddddddddddddddddddd----");
            instance = new SRPSaveData();
            storage.func_75745_a(DATA_NAME, (WorldSavedData)instance);
            instance = SRPSaveData.createData(world, storage);
        }
        return instance;
    }

    private static SRPSaveData createData(World world, MapStorage storage) {
        int currentDim = world.field_73011_w.getDimension();
        String[] here = new String[3];
        int id = 0;
        for (int i = 0; i < SRPConfigSystems.evolutionParasiteLock.length; ++i) {
            if (SRPConfigSystems.evolutionParasiteLock[i] == null) continue;
            here = SRPConfigSystems.evolutionParasiteLock[i].split(";");
            id = Integer.parseInt(here[2]);
            SRPSaveData.instance.lockedParasites.add(id);
        }
        here = new String[3];
        for (int i = 0; i < SRPConfigSystems.evolutionDimStart.length; ++i) {
            here = SRPConfigSystems.evolutionDimStart[i].split(";");
            int dim = Integer.parseInt(here[0]);
            int phase = Integer.parseInt(here[1]);
            int points = Integer.parseInt(here[2]);
            SRPSaveData.addDim(dim);
            instance.setEvolutionPhase(dim, (byte)phase, true, world, true);
            if (phase == -1) {
                points = Integer.parseInt(here[2]);
                instance.setTotalKills(dim, -points, false, world, true);
                continue;
            }
            if (phase == -2) {
                instance.setGaining(false, dim);
                instance.setLoss(true, dim);
                continue;
            }
            instance.setTotalKills(dim, points, false, world, true);
        }
        return instance;
    }

    private static void addDim(int id) {
        for (int i = 0; i < SRPSaveData.instance.dimEPid.size(); ++i) {
            if (SRPSaveData.instance.dimEPid.get(i) != id) continue;
            return;
        }
        SRPSaveData.instance.dimEPid.add(id);
        SRPSaveData.instance.dimEPcanGainPoints.add(true);
        SRPSaveData.instance.dimEPcanLossPoints.add(true);
        SRPSaveData.instance.dimEPevolution.add((byte)0);
        SRPSaveData.instance.dimEPtimeEvolution.add(0);
        SRPSaveData.instance.dimEPtotalKills.add(0);
        instance.func_76185_a();
    }

    public void func_76184_a(NBTTagCompound compound) {
        NBTTagList tagListX;
        if (compound.func_74764_b("srpparasitepoints")) {
            NBTTagList kills = compound.func_150295_c("srpparasitepoints", 10);
            NBTTagList time = compound.func_150295_c("srpparasitetimeevoworld", 10);
            NBTTagList evolution = compound.func_150295_c("srpparasiteevolution", 10);
            NBTTagList gaining = compound.func_150295_c("srpevolutiongaining", 10);
            NBTTagList loss = compound.func_150295_c("srpevolutionloss", 10);
            NBTTagList dimid = compound.func_150295_c("srpevolutiondimid", 10);
            if (dimid.func_74745_c() != evolution.func_74745_c() || dimid.func_74745_c() != kills.func_74745_c() || dimid.func_74745_c() != gaining.func_74745_c() || dimid.func_74745_c() != loss.func_74745_c() || dimid.func_74745_c() != time.func_74745_c()) {
                SRPMain.logger.log(Level.ERROR, "Problem while reading ep");
            } else {
                for (int i = 0; i < dimid.func_74745_c(); ++i) {
                    NBTTagCompound tagA = kills.func_150305_b(i);
                    int k = tagA.func_74762_e("kills" + i);
                    this.dimEPtotalKills.add(i, k);
                    NBTTagCompound tagB = time.func_150305_b(i);
                    int t = tagB.func_74762_e("time" + i);
                    this.dimEPtimeEvolution.add(i, t);
                    NBTTagCompound tagC = evolution.func_150305_b(i);
                    int e = tagC.func_74762_e("ev" + i);
                    this.dimEPevolution.add(i, (byte)e);
                    NBTTagCompound tagD = gaining.func_150305_b(i);
                    boolean g = tagD.func_74767_n("gain" + i);
                    this.dimEPcanGainPoints.add(i, g);
                    NBTTagCompound tagE = loss.func_150305_b(i);
                    boolean l = tagE.func_74767_n("loss" + i);
                    this.dimEPcanLossPoints.add(i, l);
                    NBTTagCompound tagF = dimid.func_150305_b(i);
                    int d = tagF.func_74762_e("dimid" + i);
                    this.dimEPid.add(i, d);
                }
            }
        }
        if (compound.func_74764_b("srplockedparasites")) {
            tagListX = compound.func_150295_c("srplockedparasites", 10);
            for (int i = 0; i < tagListX.func_74745_c(); ++i) {
                NBTTagCompound tagX = tagListX.func_150305_b(i);
                int id = tagX.func_74762_e("parasiteid" + i);
                this.lockedParasites.add(i, id);
            }
        }
        if (compound.func_74764_b("srpassimilatedtotal")) {
            tagListX = compound.func_150295_c("srpassimilatedtotal", 10);
            NBTTagList tagListY = compound.func_150295_c("srpassimilatedtotaltimes", 10);
            for (int i = 0; i < tagListX.func_74745_c(); ++i) {
                NBTTagCompound tagX = tagListX.func_150305_b(i);
                int ix = tagX.func_74762_e("srpassimilatedtotalid" + i);
                this.simRegId.add(i, (byte)ix);
                NBTTagCompound tagY = tagListY.func_150305_b(i);
                int iy = tagY.func_74762_e("srpassimilatedtotalidtimes" + i);
                this.simRegIdTimes.add(i, iy);
            }
        }
    }

    public NBTTagCompound func_189551_b(NBTTagCompound compound) {
        if (this.dimEPid.size() != this.dimEPevolution.size() || this.dimEPid.size() != this.dimEPtotalKills.size() || this.dimEPid.size() != this.dimEPcanGainPoints.size() || this.dimEPid.size() != this.dimEPcanLossPoints.size() || this.dimEPid.size() != this.dimEPtimeEvolution.size()) {
            SRPMain.logger.log(Level.ERROR, "Problem while writing ep");
        } else {
            NBTTagList kills = new NBTTagList();
            NBTTagList time = new NBTTagList();
            NBTTagList evolution = new NBTTagList();
            NBTTagList gaining = new NBTTagList();
            NBTTagList loss = new NBTTagList();
            NBTTagList dimid = new NBTTagList();
            for (int i = 0; i < this.dimEPid.size(); ++i) {
                NBTTagCompound tagA = new NBTTagCompound();
                tagA.func_74768_a("kills" + i, this.dimEPtotalKills.get(i).intValue());
                kills.func_74742_a((NBTBase)tagA);
                NBTTagCompound tagB = new NBTTagCompound();
                tagB.func_74768_a("time" + i, this.dimEPtimeEvolution.get(i).intValue());
                time.func_74742_a((NBTBase)tagB);
                NBTTagCompound tagC = new NBTTagCompound();
                tagC.func_74768_a("ev" + i, (int)this.dimEPevolution.get(i).byteValue());
                evolution.func_74742_a((NBTBase)tagC);
                NBTTagCompound tagD = new NBTTagCompound();
                tagD.func_74757_a("gain" + i, this.dimEPcanGainPoints.get(i).booleanValue());
                gaining.func_74742_a((NBTBase)tagD);
                NBTTagCompound tagE = new NBTTagCompound();
                tagE.func_74757_a("loss" + i, this.dimEPcanLossPoints.get(i).booleanValue());
                loss.func_74742_a((NBTBase)tagE);
                NBTTagCompound tagF = new NBTTagCompound();
                tagF.func_74768_a("dimid" + i, this.dimEPid.get(i).intValue());
                dimid.func_74742_a((NBTBase)tagF);
            }
            compound.func_74782_a("srpparasitepoints", (NBTBase)kills);
            compound.func_74782_a("srpparasitetimeevoworld", (NBTBase)time);
            compound.func_74782_a("srpparasiteevolution", (NBTBase)evolution);
            compound.func_74782_a("srpevolutiongaining", (NBTBase)gaining);
            compound.func_74782_a("srpevolutionloss", (NBTBase)loss);
            compound.func_74782_a("srpevolutiondimid", (NBTBase)dimid);
        }
        NBTTagList tagListXX = new NBTTagList();
        for (int i = 0; i < this.lockedParasites.size(); ++i) {
            int id = this.lockedParasites.get(i);
            NBTTagCompound tagX = new NBTTagCompound();
            tagX.func_74768_a("parasiteid" + i, id);
            tagListXX.func_74742_a((NBTBase)tagX);
        }
        compound.func_74782_a("srplockedparasites", (NBTBase)tagListXX);
        tagListXX = new NBTTagList();
        NBTTagList tagListYY = new NBTTagList();
        for (int i = 0; i < this.simRegId.size(); ++i) {
            byte ix = this.simRegId.get(i);
            NBTTagCompound tagX = new NBTTagCompound();
            tagX.func_74768_a("srpassimilatedtotalid" + i, (int)ix);
            tagListXX.func_74742_a((NBTBase)tagX);
            int iy = this.simRegIdTimes.get(i);
            NBTTagCompound tagY = new NBTTagCompound();
            tagY.func_74768_a("srpassimilatedtotalidtimes" + i, iy);
            tagListYY.func_74742_a((NBTBase)tagY);
        }
        compound.func_74782_a("srpassimilatedtotal", (NBTBase)tagListXX);
        compound.func_74782_a("srpassimilatedtotaltimes", (NBTBase)tagListYY);
        return compound;
    }

    public boolean checkParasiteID(int in) {
        for (int i = 0; i < this.lockedParasites.size(); ++i) {
            if (this.lockedParasites.get(i) != in) continue;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getLockedList() {
        return this.lockedParasites;
    }

    public boolean unlockParasite(int in) {
        for (int i = 0; i < this.lockedParasites.size(); ++i) {
            if (this.lockedParasites.get(i) != in) continue;
            this.lockedParasites.remove(i);
            this.func_76185_a();
            return true;
        }
        return false;
    }

    public void resetLock() {
        ArrayList<Integer> aaa = new ArrayList<Integer>();
        String[] here = new String[3];
        int id = 0;
        for (int i = 0; i < SRPConfigSystems.evolutionParasiteLock.length; ++i) {
            if (SRPConfigSystems.evolutionParasiteLock[i] == null) continue;
            here = SRPConfigSystems.evolutionParasiteLock[i].split(";");
            id = Integer.parseInt(here[2]);
            aaa.add(id);
        }
        this.lockedParasites = aaa;
        this.func_76185_a();
    }

    public void setGaining(boolean in, int id) {
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            this.dimEPcanGainPoints.set(i, in);
        }
        this.func_76185_a();
    }

    public boolean getCanGain(int id) {
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            return this.dimEPcanGainPoints.get(i);
        }
        return false;
    }

    public void setLoss(boolean in, int id) {
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            this.dimEPcanLossPoints.set(i, in);
        }
        this.func_76185_a();
    }

    public boolean getCanLoss(int id) {
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            return this.dimEPcanLossPoints.get(i);
        }
        return false;
    }

    public byte getEvolutionPhase(int id) {
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            return this.dimEPevolution.get(i);
        }
        return 0;
    }

    public void setCooldown(int in, World worldIn, int id) {
        int currentWT = (int)worldIn.func_72820_D();
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            int timer = this.dimEPtimeEvolution.get(i);
            timer = currentWT - this.getDelay(this.getEvolutionPhase(id)) * 20 + in * 20;
            this.dimEPtimeEvolution.set(i, timer);
        }
        this.func_76185_a();
    }

    public int getCooldown(World worldIn, int id) {
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            if (this.dimEPtimeEvolution.get(i) == 0) {
                return 0;
            }
            int currentWT = (int)worldIn.func_72820_D();
            return Math.max((this.getDelay(this.getEvolutionPhase(id)) * 20 - (currentWT - this.dimEPtimeEvolution.get(i))) / 20, 0);
        }
        return 0;
    }

    public int getTotalKills(int id) {
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            return this.dimEPtotalKills.get(i);
        }
        return 0;
    }

    public boolean setTotalKills(int id, int in, boolean plus, World worldIn, boolean canChangePhase) {
        if (SRPConfigSystems.evolutionNoPlayerMultipler && worldIn.field_73010_i.isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            if (!this.getCanGain(id) && plus && in > 0) {
                return false;
            }
            if (this.getCanLoss(id) && plus && in < 0) {
                return false;
            }
            if (!SRPConfigSystems.useEvolution) {
                return false;
            }
            if (this.getEvolutionPhase(id) == -2) {
                return false;
            }
            if (this.getDelay(this.getEvolutionPhase(id)) != 0 && this.getCooldown(worldIn, id) != 0 && plus) {
                return false;
            }
            if (plus) {
                int kills = this.dimEPtotalKills.get(i);
                if ((kills += in) < 0 && this.getEvolutionPhase(id) >= 0) {
                    kills = 0;
                }
                if (kills > SRPConfigSystems.phaseTenTotalPoints) {
                    kills = SRPConfigSystems.phaseTenTotalPoints;
                }
                boolean ttt = true;
                while (ttt) {
                    ttt = this.checkKills(id, kills, worldIn, canChangePhase);
                }
                this.dimEPtotalKills.set(i, kills);
                continue;
            }
            this.dimEPtotalKills.set(i, in);
        }
        this.func_76185_a();
        return true;
    }

    private int getDelay(byte in) {
        switch (in) {
            case 1: {
                return SRPConfigSystems.phaseDelayTicksOne;
            }
            case 2: {
                return SRPConfigSystems.phaseDelayTicksTwo;
            }
            case 3: {
                return SRPConfigSystems.phaseDelayTicksThree;
            }
            case 4: {
                return SRPConfigSystems.phaseDelayTicksFour;
            }
            case 5: {
                return SRPConfigSystems.phaseDelayTicksFive;
            }
            case 6: {
                return SRPConfigSystems.phaseDelayTicksSix;
            }
            case 7: {
                return SRPConfigSystems.phaseDelayTicksSeven;
            }
            case 8: {
                return SRPConfigSystems.phaseDelayTicksEight;
            }
        }
        return 0;
    }

    private boolean checkKills(int id, int in, World worldIn, boolean canChangePhase) {
        boolean flag = false;
        switch (this.getEvolutionPhase(id)) {
            case -1: {
                if (in <= 0 || !this.setEvolutionPhase(id, (byte)0, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningZero, 0);
                break;
            }
            case 0: {
                if (in <= SRPConfigSystems.phaseKillsOne || !this.setEvolutionPhase(id, (byte)1, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningOne, 1);
                break;
            }
            case 1: {
                if (in > SRPConfigSystems.phaseKillsTwo && this.setEvolutionPhase(id, (byte)2, false, worldIn, canChangePhase)) {
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningTwo, 2);
                }
                if (in >= SRPConfigSystems.phaseKillsOne || !this.setEvolutionPhase(id, (byte)0, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            }
            case 2: {
                if (in > SRPConfigSystems.phaseKillsThree && this.setEvolutionPhase(id, (byte)3, false, worldIn, canChangePhase)) {
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningThree, 3);
                }
                if (in >= SRPConfigSystems.phaseKillsTwo || !this.setEvolutionPhase(id, (byte)1, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            }
            case 3: {
                if (in > SRPConfigSystems.phaseKillsFour) {
                    if (!this.setEvolutionPhase(id, (byte)4, false, worldIn, canChangePhase)) break;
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningFour, 4);
                    break;
                }
                if (in >= SRPConfigSystems.phaseKillsThree || !this.setEvolutionPhase(id, (byte)2, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            }
            case 4: {
                if (in > SRPConfigSystems.phaseKillsFive && this.setEvolutionPhase(id, (byte)5, false, worldIn, canChangePhase)) {
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningFive, 5);
                }
                if (in >= SRPConfigSystems.phaseKillsFour || !this.setEvolutionPhase(id, (byte)3, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            }
            case 5: {
                if (in > SRPConfigSystems.phaseKillsSix && this.setEvolutionPhase(id, (byte)6, false, worldIn, canChangePhase)) {
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningSix, 6);
                }
                if (in >= SRPConfigSystems.phaseKillsFive || !this.setEvolutionPhase(id, (byte)4, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            }
            case 6: {
                if (in > SRPConfigSystems.phaseKillsSeven && this.setEvolutionPhase(id, (byte)7, false, worldIn, canChangePhase)) {
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningSeven, 7);
                }
                if (in >= SRPConfigSystems.phaseKillsSix || !this.setEvolutionPhase(id, (byte)5, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            }
            case 7: {
                if (in > SRPConfigSystems.phaseKillsEight && this.setEvolutionPhase(id, (byte)8, false, worldIn, canChangePhase)) {
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningEight, 8);
                }
                if (in >= SRPConfigSystems.phaseKillsSeven || !this.setEvolutionPhase(id, (byte)6, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            }
            case 8: {
                if (in > SRPConfigSystems.phaseKillsNine && this.setEvolutionPhase(id, (byte)9, false, worldIn, canChangePhase)) {
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningNine, 9);
                }
                if (in >= SRPConfigSystems.phaseKillsEight || !this.setEvolutionPhase(id, (byte)7, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            }
            case 9: {
                if (in > SRPConfigSystems.phaseKillsTen && this.setEvolutionPhase(id, (byte)10, false, worldIn, canChangePhase)) {
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningTen, 10);
                }
                if (in >= SRPConfigSystems.phaseKillsNine || !this.setEvolutionPhase(id, (byte)8, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            }
            case 10: {
                if (in >= SRPConfigSystems.phaseKillsTen || !this.setEvolutionPhase(id, (byte)9, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
            }
        }
        return flag;
    }

    public boolean setEvolutionPhase(int id, byte in, boolean override, World worldIn, boolean canChangePhase) {
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            if (!canChangePhase) {
                this.dimEPtotalKills.set(i, SRPCommandEvolution.getNeededPoints(this.getEvolutionPhase(id)));
                this.func_76185_a();
                return false;
            }
            if (override) {
                this.dimEPevolution.set(i, in);
                this.checkPhase(id, in, worldIn);
            } else {
                this.dimEPevolution.set(i, in);
            }
            this.dimEPtimeEvolution.set(i, (int)worldIn.func_72820_D());
            this.checkForUnlock(this.getEvolutionPhase(id), id, worldIn);
        }
        this.func_76185_a();
        return true;
    }

    private void checkForUnlock(byte phase, int worldId, World w) {
        String[] here = new String[3];
        int id = 0;
        int dim = 0;
        byte p = 0;
        for (int i = 0; i < SRPConfigSystems.evolutionParasiteLock.length; ++i) {
            if (SRPConfigSystems.evolutionParasiteLock[i] == null || worldId != (dim = Integer.parseInt((here = SRPConfigSystems.evolutionParasiteLock[i].split(";"))[0])) || (p = Byte.parseByte(here[1])) != phase || !this.unlockParasite(id = Integer.parseInt(here[2]))) continue;
            ParasiteEventEntity.alertAllPlayerSer(SRPConfigSystems.evolutionParasiteLockMessage, w);
        }
    }

    private void checkPhase(int id, byte in, World worldIn) {
        switch (in) {
            case -1: {
                this.setTotalKills(id, -10, false, worldIn, true);
                break;
            }
            case 0: {
                this.setTotalKills(id, 0, false, worldIn, true);
                break;
            }
            case 1: {
                this.setTotalKills(id, SRPConfigSystems.phaseKillsOne, false, worldIn, true);
                break;
            }
            case 2: {
                this.setTotalKills(id, SRPConfigSystems.phaseKillsTwo, false, worldIn, true);
                break;
            }
            case 3: {
                this.setTotalKills(id, SRPConfigSystems.phaseKillsThree, false, worldIn, true);
                break;
            }
            case 4: {
                this.setTotalKills(id, SRPConfigSystems.phaseKillsFour, false, worldIn, true);
                break;
            }
            case 5: {
                this.setTotalKills(id, SRPConfigSystems.phaseKillsFive, false, worldIn, true);
                break;
            }
            case 6: {
                this.setTotalKills(id, SRPConfigSystems.phaseKillsSix, false, worldIn, true);
                break;
            }
            case 7: {
                this.setTotalKills(id, SRPConfigSystems.phaseKillsSeven, false, worldIn, true);
                break;
            }
            case 8: {
                this.setTotalKills(id, SRPConfigSystems.phaseKillsEight, false, worldIn, true);
                break;
            }
            case 9: {
                this.setTotalKills(id, SRPConfigSystems.phaseKillsNine, false, worldIn, true);
                break;
            }
            case 10: {
                this.setTotalKills(id, SRPConfigSystems.phaseKillsTen, false, worldIn, true);
            }
        }
    }

    public int getNumberIDDataSpawn(int id) {
        for (int i = 0; i < this.simRegId.size(); ++i) {
            if (this.simRegId.get(i) != id) continue;
            return this.simRegIdTimes.get(i);
        }
        return -1;
    }

    public void addNumberIDDataSpawn(int id) {
        boolean flag = true;
        for (int i = 0; i < this.simRegId.size(); ++i) {
            if (this.simRegId.get(i) != id) continue;
            int tt = this.simRegIdTimes.get(i);
            this.simRegIdTimes.set(i, tt + 1);
            flag = false;
        }
        if (flag) {
            this.simRegId.add((byte)id);
            this.simRegIdTimes.add(1);
        }
    }
}

