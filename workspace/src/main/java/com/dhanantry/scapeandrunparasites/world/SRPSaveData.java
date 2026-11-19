package com.dhanantry.scapeandrunparasites.world;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.network.SRPCommandEvolution;
import com.dhanantry.scapeandrunparasites.util.ParasiteEventEntity;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.SavedData;

import java.util.ArrayList;

/**
 * Migracion de SRPSaveData (WorldSavedData + MapStorage -> SavedData + DataStorage).
 * Lote 3: persistencia global de evolucion.
 */
public class SRPSaveData extends SavedData
{
    private ArrayList<Integer> dimEPid = new ArrayList<>();
    private ArrayList<Integer> dimEPtotalKills = new ArrayList<>();
    private ArrayList<Byte> dimEPevolution = new ArrayList<>();
    private ArrayList<Integer> dimEPtimeEvolution = new ArrayList<>();
    private ArrayList<Boolean> dimEPcanGainPoints = new ArrayList<>();
    private ArrayList<Boolean> dimEPcanLossPoints = new ArrayList<>();
    private static final String DATA_NAME = "srparasites_global_data";
    private static SRPSaveData instance;
    private ArrayList<Integer> lockedParasites = new ArrayList<>();
    private ArrayList<Byte> simRegId = new ArrayList<>();
    private ArrayList<Integer> simRegIdTimes = new ArrayList<>();

    public SRPSaveData() { super(); }

    public static int dimensionId(Level level) {
        ResourceKey<Level> d = level.dimension();
        if (d == Level.OVERWORLD) return 0;
        if (d == Level.NETHER) return -1;
        if (d == Level.END) return 1;
        return d.location().hashCode();
    }

    public static SRPSaveData get(Level level) {
        ServerLevel sl = level.getServer() != null ? level.getServer().getLevel(Level.OVERWORLD) : (level instanceof ServerLevel ? (ServerLevel) level : null);
        if (sl == null) return null;
        instance = sl.getDataStorage().computeIfAbsent(SRPSaveData::load, SRPSaveData::new, DATA_NAME);
        if (instance == null) {
            instance = new SRPSaveData();
            sl.getDataStorage().set(DATA_NAME, instance);
            instance = createData(level, sl);
        }
        return instance;
    }

    private static SRPSaveData createData(Level world, ServerLevel storage) {
        int currentDim = dimensionId(world);
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
            addDim(dim);
            instance.setEvolutionPhase(dim, (byte) phase, true, world, true);
            if (phase == -1) {
                points = Integer.parseInt(here[2]);
                instance.setTotalKills(dim, -points, false, world, true);
            } else if (phase == -2) {
                instance.setGaining(false, dim);
                instance.setLoss(true, dim);
            } else {
                instance.setTotalKills(dim, points, false, world, true);
            }
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
        SRPSaveData.instance.dimEPevolution.add((byte) 0);
        SRPSaveData.instance.dimEPtimeEvolution.add(0);
        SRPSaveData.instance.dimEPtotalKills.add(0);
        instance.setDirty();
    }

    public static SRPSaveData load(CompoundTag compound) {
        SRPSaveData data = new SRPSaveData();
        if (compound.contains("srpparasitepoints")) {
            ListTag kills = compound.getList("srpparasitepoints", Tag.TAG_COMPOUND);
            ListTag time = compound.getList("srpparasitetimeevoworld", Tag.TAG_COMPOUND);
            ListTag evolution = compound.getList("srpparasiteevolution", Tag.TAG_COMPOUND);
            ListTag gaining = compound.getList("srpevolutiongaining", Tag.TAG_COMPOUND);
            ListTag loss = compound.getList("srpevolutionloss", Tag.TAG_COMPOUND);
            ListTag dimid = compound.getList("srpevolutiondimid", Tag.TAG_COMPOUND);
            if (dimid.size() != evolution.size() || dimid.size() != kills.size() || dimid.size() != gaining.size() || dimid.size() != loss.size() || dimid.size() != time.size()) {
                SRPMain.LOGGER.error("Problem while reading ep");
            } else {
                for (int i = 0; i < dimid.size(); ++i) {
                    CompoundTag tagA = kills.getCompound(i);
                    int k = tagA.getInt("kills" + i);
                    data.dimEPtotalKills.add(i, k);
                    CompoundTag tagB = time.getCompound(i);
                    int t = tagB.getInt("time" + i);
                    data.dimEPtimeEvolution.add(i, t);
                    CompoundTag tagC = evolution.getCompound(i);
                    int e = tagC.getInt("ev" + i);
                    data.dimEPevolution.add(i, (byte) e);
                    CompoundTag tagD = gaining.getCompound(i);
                    boolean g = tagD.getBoolean("gain" + i);
                    data.dimEPcanGainPoints.add(i, g);
                    CompoundTag tagE = loss.getCompound(i);
                    boolean l = tagE.getBoolean("loss" + i);
                    data.dimEPcanLossPoints.add(i, l);
                    CompoundTag tagF = dimid.getCompound(i);
                    int d = tagF.getInt("dimid" + i);
                    data.dimEPid.add(i, d);
                }
            }
        }
        if (compound.contains("srplockedparasites")) {
            ListTag tagListX = compound.getList("srplockedparasites", Tag.TAG_COMPOUND);
            for (int i = 0; i < tagListX.size(); ++i) {
                CompoundTag tagX = tagListX.getCompound(i);
                int id = tagX.getInt("parasiteid" + i);
                data.lockedParasites.add(i, id);
            }
        }
        if (compound.contains("srpassimilatedtotal")) {
            ListTag tagListX = compound.getList("srpassimilatedtotal", Tag.TAG_COMPOUND);
            ListTag tagListY = compound.getList("srpassimilatedtotaltimes", Tag.TAG_COMPOUND);
            for (int i = 0; i < tagListX.size(); ++i) {
                CompoundTag tagX = tagListX.getCompound(i);
                int ix = tagX.getInt("srpassimilatedtotalid" + i);
                data.simRegId.add(i, (byte) ix);
                CompoundTag tagY = tagListY.getCompound(i);
                int iy = tagY.getInt("srpassimilatedtotalidtimes" + i);
                data.simRegIdTimes.add(i, iy);
            }
        }
        return data;
    }

    @Override
    public CompoundTag save(CompoundTag compound) {
        if (this.dimEPid.size() != this.dimEPevolution.size() || this.dimEPid.size() != this.dimEPtotalKills.size() || this.dimEPid.size() != this.dimEPcanGainPoints.size() || this.dimEPid.size() != this.dimEPcanLossPoints.size() || this.dimEPid.size() != this.dimEPtimeEvolution.size()) {
            SRPMain.LOGGER.error("Problem while writing ep");
        } else {
            ListTag kills = new ListTag();
            ListTag time = new ListTag();
            ListTag evolution = new ListTag();
            ListTag gaining = new ListTag();
            ListTag loss = new ListTag();
            ListTag dimid = new ListTag();
            for (int i = 0; i < this.dimEPid.size(); ++i) {
                CompoundTag tagA = new CompoundTag();
                tagA.putInt("kills" + i, this.dimEPtotalKills.get(i).intValue());
                kills.add(tagA);
                CompoundTag tagB = new CompoundTag();
                tagB.putInt("time" + i, this.dimEPtimeEvolution.get(i).intValue());
                time.add(tagB);
                CompoundTag tagC = new CompoundTag();
                tagC.putInt("ev" + i, (int) this.dimEPevolution.get(i).byteValue());
                evolution.add(tagC);
                CompoundTag tagD = new CompoundTag();
                tagD.putBoolean("gain" + i, this.dimEPcanGainPoints.get(i).booleanValue());
                gaining.add(tagD);
                CompoundTag tagE = new CompoundTag();
                tagE.putBoolean("loss" + i, this.dimEPcanLossPoints.get(i).booleanValue());
                loss.add(tagE);
                CompoundTag tagF = new CompoundTag();
                tagF.putInt("dimid" + i, this.dimEPid.get(i).intValue());
                dimid.add(tagF);
            }
            compound.put("srpparasitepoints", kills);
            compound.put("srpparasitetimeevoworld", time);
            compound.put("srpparasiteevolution", evolution);
            compound.put("srpevolutiongaining", gaining);
            compound.put("srpevolutionloss", loss);
            compound.put("srpevolutiondimid", dimid);
        }
        ListTag tagListXX = new ListTag();
        for (int i = 0; i < this.lockedParasites.size(); ++i) {
            int id = this.lockedParasites.get(i);
            CompoundTag tagX = new CompoundTag();
            tagX.putInt("parasiteid" + i, id);
            tagListXX.add(tagX);
        }
        compound.put("srplockedparasites", tagListXX);
        tagListXX = new ListTag();
        ListTag tagListYY = new ListTag();
        for (int i = 0; i < this.simRegId.size(); ++i) {
            byte ix = this.simRegId.get(i);
            CompoundTag tagX = new CompoundTag();
            tagX.putInt("srpassimilatedtotalid" + i, (int) ix);
            tagListXX.add(tagX);
            int iy = this.simRegIdTimes.get(i);
            CompoundTag tagY = new CompoundTag();
            tagY.putInt("srpassimilatedtotalidtimes" + i, iy);
            tagListYY.add(tagY);
        }
        compound.put("srpassimilatedtotal", tagListXX);
        compound.put("srpassimilatedtotaltimes", tagListYY);
        return compound;
    }

    public boolean checkParasiteID(int in) {
        for (int i = 0; i < this.lockedParasites.size(); ++i) {
            if (this.lockedParasites.get(i) != in) continue;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getLockedList() { return this.lockedParasites; }

    public boolean unlockParasite(int in) {
        for (int i = 0; i < this.lockedParasites.size(); ++i) {
            if (this.lockedParasites.get(i) != in) continue;
            this.lockedParasites.remove(i);
            this.setDirty();
            return true;
        }
        return false;
    }

    public void resetLock() {
        ArrayList<Integer> aaa = new ArrayList<>();
        String[] here = new String[3];
        int id = 0;
        for (int i = 0; i < SRPConfigSystems.evolutionParasiteLock.length; ++i) {
            if (SRPConfigSystems.evolutionParasiteLock[i] == null) continue;
            here = SRPConfigSystems.evolutionParasiteLock[i].split(";");
            id = Integer.parseInt(here[2]);
            aaa.add(id);
        }
        this.lockedParasites = aaa;
        this.setDirty();
    }

    public void setGaining(boolean in, int id) {
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            this.dimEPcanGainPoints.set(i, in);
        }
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

    public void setCooldown(int in, Level worldIn, int id) {
        int currentWT = (int) worldIn.getGameTime();
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            int timer = this.dimEPtimeEvolution.get(i);
            timer = currentWT - this.getDelay(this.getEvolutionPhase(id)) * 20 + in * 20;
            this.dimEPtimeEvolution.set(i, timer);
        }
        this.setDirty();
    }

    public int getCooldown(Level worldIn, int id) {
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            if (this.dimEPtimeEvolution.get(i) == 0) return 0;
            int currentWT = (int) worldIn.getGameTime();
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

    public boolean setTotalKills(int id, int in, boolean plus, Level worldIn, boolean canChangePhase) {
        if (SRPConfigSystems.evolutionNoPlayerMultipler && worldIn.players().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            if (!this.getCanGain(id) && plus && in > 0) return false;
            if (this.getCanLoss(id) && plus && in < 0) return false;
            if (!SRPConfigSystems.useEvolution) return false;
            if (this.getEvolutionPhase(id) == -2) return false;
            if (this.getDelay(this.getEvolutionPhase(id)) != 0 && this.getCooldown(worldIn, id) != 0 && plus) return false;
            if (plus) {
                int kills = this.dimEPtotalKills.get(i);
                if ((kills += in) < 0 && this.getEvolutionPhase(id) >= 0) kills = 0;
                if (kills > SRPConfigSystems.phaseTenTotalPoints) kills = SRPConfigSystems.phaseTenTotalPoints;
                boolean ttt = true;
                while (ttt) ttt = this.checkKills(id, kills, worldIn, canChangePhase);
                this.dimEPtotalKills.set(i, kills);
            } else {
                this.dimEPtotalKills.set(i, in);
            }
        }
        this.setDirty();
        return true;
    }

    private int getDelay(byte in) {
        switch (in) {
            case 1: return SRPConfigSystems.phaseDelayTicksOne;
            case 2: return SRPConfigSystems.phaseDelayTicksTwo;
            case 3: return SRPConfigSystems.phaseDelayTicksThree;
            case 4: return SRPConfigSystems.phaseDelayTicksFour;
            case 5: return SRPConfigSystems.phaseDelayTicksFive;
            case 6: return SRPConfigSystems.phaseDelayTicksSix;
            case 7: return SRPConfigSystems.phaseDelayTicksSeven;
            case 8: return SRPConfigSystems.phaseDelayTicksEight;
        }
        return 0;
    }

    private boolean checkKills(int id, int in, Level worldIn, boolean canChangePhase) {
        boolean flag = false;
        switch (this.getEvolutionPhase(id)) {
            case -1:
                if (in <= 0 || !this.setEvolutionPhase(id, (byte) 0, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningZero, 0);
                break;
            case 0:
                if (in <= SRPConfigSystems.phaseKillsOne || !this.setEvolutionPhase(id, (byte) 1, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningOne, 1);
                break;
            case 1:
                if (in > SRPConfigSystems.phaseKillsTwo && this.setEvolutionPhase(id, (byte) 2, false, worldIn, canChangePhase))
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningTwo, 2);
                if (in >= SRPConfigSystems.phaseKillsOne || !this.setEvolutionPhase(id, (byte) 0, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            case 2:
                if (in > SRPConfigSystems.phaseKillsThree && this.setEvolutionPhase(id, (byte) 3, false, worldIn, canChangePhase))
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningThree, 3);
                if (in >= SRPConfigSystems.phaseKillsTwo || !this.setEvolutionPhase(id, (byte) 1, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            case 3:
                if (in > SRPConfigSystems.phaseKillsFour) {
                    if (!this.setEvolutionPhase(id, (byte) 4, false, worldIn, canChangePhase)) break;
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningFour, 4);
                    break;
                }
                if (in >= SRPConfigSystems.phaseKillsThree || !this.setEvolutionPhase(id, (byte) 2, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            case 4:
                if (in > SRPConfigSystems.phaseKillsFive && this.setEvolutionPhase(id, (byte) 5, false, worldIn, canChangePhase))
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningFive, 5);
                if (in >= SRPConfigSystems.phaseKillsFour || !this.setEvolutionPhase(id, (byte) 3, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            case 5:
                if (in > SRPConfigSystems.phaseKillsSix && this.setEvolutionPhase(id, (byte) 6, false, worldIn, canChangePhase))
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningSix, 6);
                if (in >= SRPConfigSystems.phaseKillsFive || !this.setEvolutionPhase(id, (byte) 4, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            case 6:
                if (in > SRPConfigSystems.phaseKillsSeven && this.setEvolutionPhase(id, (byte) 7, false, worldIn, canChangePhase))
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningSeven, 7);
                if (in >= SRPConfigSystems.phaseKillsSix || !this.setEvolutionPhase(id, (byte) 5, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            case 7:
                if (in > SRPConfigSystems.phaseKillsEight && this.setEvolutionPhase(id, (byte) 8, false, worldIn, canChangePhase))
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningEight, 8);
                if (in >= SRPConfigSystems.phaseKillsSeven || !this.setEvolutionPhase(id, (byte) 6, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            case 8:
                if (in > SRPConfigSystems.phaseKillsNine && this.setEvolutionPhase(id, (byte) 9, false, worldIn, canChangePhase))
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningNine, 9);
                if (in >= SRPConfigSystems.phaseKillsEight || !this.setEvolutionPhase(id, (byte) 7, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            case 9:
                if (in > SRPConfigSystems.phaseKillsTen && this.setEvolutionPhase(id, (byte) 10, false, worldIn, canChangePhase))
                    ParasiteEventEntity.alertAllPlayerDim(worldIn, SRPConfigSystems.phaseWarningTen, 10);
                if (in >= SRPConfigSystems.phaseKillsNine || !this.setEvolutionPhase(id, (byte) 8, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
                break;
            case 10:
                if (in >= SRPConfigSystems.phaseKillsTen || !this.setEvolutionPhase(id, (byte) 9, false, worldIn, canChangePhase)) break;
                ParasiteEventEntity.alertAllPlayerDim(worldIn, "Phase decreased", -7);
                flag = true;
        }
        return flag;
    }

    public boolean setEvolutionPhase(int id, byte in, boolean override, Level worldIn, boolean canChangePhase) {
        for (int i = 0; i < this.dimEPid.size(); ++i) {
            if (this.dimEPid.get(i) != id) continue;
            if (!canChangePhase) {
                this.dimEPtotalKills.set(i, SRPCommandEvolution.getNeededPoints(this.getEvolutionPhase(id)));
                this.setDirty();
                return false;
            }
            if (override) {
                this.dimEPevolution.set(i, in);
                this.checkPhase(id, in, worldIn);
            } else {
                this.dimEPevolution.set(i, in);
            }
            this.dimEPtimeEvolution.set(i, (int) worldIn.getGameTime());
            this.checkForUnlock(this.getEvolutionPhase(id), id, worldIn);
        }
        this.setDirty();
        return true;
    }

    private void checkForUnlock(byte phase, int worldId, Level w) {
        String[] here = new String[3];
        int id = 0;
        int dim = 0;
        byte p = 0;
        for (int i = 0; i < SRPConfigSystems.evolutionParasiteLock.length; ++i) {
            if (SRPConfigSystems.evolutionParasiteLock[i] == null) continue;
            here = SRPConfigSystems.evolutionParasiteLock[i].split(";");
            dim = Integer.parseInt(here[0]);
            p = Byte.parseByte(here[1]);
            if (worldId != dim || p != phase) continue;
            id = Integer.parseInt(here[2]);
            if (!this.unlockParasite(id)) continue;
            ParasiteEventEntity.alertAllPlayerSer(SRPConfigSystems.evolutionParasiteLockMessage, w);
        }
    }

    private void checkPhase(int id, byte in, Level worldIn) {
        switch (in) {
            case -1: this.setTotalKills(id, -10, false, worldIn, true); break;
            case 0: this.setTotalKills(id, 0, false, worldIn, true); break;
            case 1: this.setTotalKills(id, SRPConfigSystems.phaseKillsOne, false, worldIn, true); break;
            case 2: this.setTotalKills(id, SRPConfigSystems.phaseKillsTwo, false, worldIn, true); break;
            case 3: this.setTotalKills(id, SRPConfigSystems.phaseKillsThree, false, worldIn, true); break;
            case 4: this.setTotalKills(id, SRPConfigSystems.phaseKillsFour, false, worldIn, true); break;
            case 5: this.setTotalKills(id, SRPConfigSystems.phaseKillsFive, false, worldIn, true); break;
            case 6: this.setTotalKills(id, SRPConfigSystems.phaseKillsSix, false, worldIn, true); break;
            case 7: this.setTotalKills(id, SRPConfigSystems.phaseKillsSeven, false, worldIn, true); break;
            case 8: this.setTotalKills(id, SRPConfigSystems.phaseKillsEight, false, worldIn, true); break;
            case 9: this.setTotalKills(id, SRPConfigSystems.phaseKillsNine, false, worldIn, true); break;
            case 10: this.setTotalKills(id, SRPConfigSystems.phaseKillsTen, false, worldIn, true); break;
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
            this.simRegId.add((byte) id);
            this.simRegIdTimes.add(1);
        }
    }
}
