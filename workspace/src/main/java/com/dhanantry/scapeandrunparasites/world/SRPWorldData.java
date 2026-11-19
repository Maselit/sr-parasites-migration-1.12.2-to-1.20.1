package com.dhanantry.scapeandrunparasites.world;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.SavedData;

import java.util.ArrayList;

/**
 * Migracion de SRPWorldData (WorldSavedData + per-world MapStorage -> SavedData + DataStorage).
 */
public class SRPWorldData extends SavedData
{
    private static final String DATA_NAME = "srparasites_data";
    private static SRPWorldData instance;
    private int currentVenkrol;
    private ArrayList<Integer> nodeX = new ArrayList<>();
    private ArrayList<Integer> nodeY = new ArrayList<>();
    private ArrayList<Integer> nodeZ = new ArrayList<>();
    private ArrayList<Integer> nodeA = new ArrayList<>();
    private ArrayList<Integer> colonyX = new ArrayList<>();
    private ArrayList<Integer> colonyY = new ArrayList<>();
    private ArrayList<Integer> colonyZ = new ArrayList<>();
    private ArrayList<Integer> colonyA = new ArrayList<>();
    private ArrayList<Integer> resistanceI = new ArrayList<>();
    private ArrayList<String> resistanceS = new ArrayList<>();

    public SRPWorldData() { super(); }

    public static SRPWorldData get(Level level) {
        ServerLevel sl = level instanceof ServerLevel ? (ServerLevel) level : (level.getServer() != null ? level.getServer().getLevel(level.dimension()) : null);
        if (sl == null) return null;
        instance = sl.getDataStorage().computeIfAbsent(SRPWorldData::load, SRPWorldData::new, DATA_NAME);
        if (instance == null) {
            instance = new SRPWorldData();
            sl.getDataStorage().set(DATA_NAME, instance);
        }
        return instance;
    }

    public static SRPWorldData load(CompoundTag compound) {
        SRPWorldData data = new SRPWorldData();
        if (compound.contains("srpcurrentbeckons")) data.currentVenkrol = compound.getInt("srpcurrentbeckons");
        if (compound.contains("srpnodescoordsx")) {
            ListTag tagListX = compound.getList("srpnodescoordsx", Tag.TAG_COMPOUND);
            ListTag tagListY = compound.getList("srpnodescoordsy", Tag.TAG_COMPOUND);
            ListTag tagListZ = compound.getList("srpnodescoordsz", Tag.TAG_COMPOUND);
            ListTag tagListA = compound.getList("srpnodesages", Tag.TAG_COMPOUND);
            if (tagListX.size() != tagListY.size() || tagListX.size() != tagListZ.size() || tagListX.size() != tagListA.size()) {
                SRPMain.LOGGER.error("Problem while reading nodes coords");
            } else {
                for (int i = 0; i < tagListX.size(); ++i) {
                    data.nodeX.add(i, tagListX.getCompound(i).getInt("nodex" + i));
                    data.nodeY.add(i, tagListY.getCompound(i).getInt("nodey" + i));
                    data.nodeZ.add(i, tagListZ.getCompound(i).getInt("nodez" + i));
                    data.nodeA.add(i, tagListA.getCompound(i).getInt("nodea" + i));
                }
            }
        }
        if (compound.contains("srpcoloniescoordsx")) {
            ListTag tagListX = compound.getList("srpcoloniescoordsx", Tag.TAG_COMPOUND);
            ListTag tagListY = compound.getList("srpcoloniescoordsy", Tag.TAG_COMPOUND);
            ListTag tagListZ = compound.getList("srpcoloniescoordsz", Tag.TAG_COMPOUND);
            ListTag tagListA = compound.getList("srpcoloniesages", Tag.TAG_COMPOUND);
            if (tagListX.size() != tagListY.size() || tagListX.size() != tagListZ.size() || tagListX.size() != tagListA.size()) {
                SRPMain.LOGGER.error("Problem while reading colonies coords");
            } else {
                for (int i = 0; i < tagListX.size(); ++i) {
                    data.colonyX.add(i, tagListX.getCompound(i).getInt("colonyx" + i));
                    data.colonyY.add(i, tagListY.getCompound(i).getInt("colonyy" + i));
                    data.colonyZ.add(i, tagListZ.getCompound(i).getInt("colonyz" + i));
                    data.colonyA.add(i, tagListA.getCompound(i).getInt("colonya" + i));
                }
            }
        }
        if (compound.contains("srpcolonyresistances")) {
            ListTag tagListX = compound.getList("srpcolonyresistancei", Tag.TAG_COMPOUND);
            ListTag tagListY = compound.getList("srpcolonyresistances", Tag.TAG_COMPOUND);
            if (tagListX.size() != tagListY.size()) {
                SRPMain.LOGGER.error("Problem while reading resistance");
            } else {
                for (int i = 0; i < tagListX.size(); ++i) {
                    data.resistanceI.add(i, tagListX.getCompound(i).getInt("resistance" + i));
                    data.resistanceS.add(i, tagListY.getCompound(i).getString("resistance" + i));
                }
            }
        }
        return data;
    }

    @Override
    public CompoundTag save(CompoundTag compound) {
        compound.putInt("srpcurrentbeckons", this.currentVenkrol);
        if (this.nodeX.size() != this.nodeY.size() || this.nodeX.size() != this.nodeZ.size() || this.nodeX.size() != this.nodeA.size()) {
            SRPMain.LOGGER.error("Problem while writing nodes coords");
        } else {
            ListTag tagListX = new ListTag(), tagListY = new ListTag(), tagListZ = new ListTag(), tagListA = new ListTag();
            for (int i = 0; i < this.nodeX.size(); ++i) {
                CompoundTag tX = new CompoundTag(); tX.putInt("nodex" + i, this.nodeX.get(i)); tagListX.add(tX);
                CompoundTag tY = new CompoundTag(); tY.putInt("nodey" + i, this.nodeY.get(i)); tagListY.add(tY);
                CompoundTag tZ = new CompoundTag(); tZ.putInt("nodez" + i, this.nodeZ.get(i)); tagListZ.add(tZ);
                CompoundTag tA = new CompoundTag(); tA.putInt("nodea" + i, this.nodeA.get(i)); tagListA.add(tA);
            }
            compound.put("srpnodescoordsx", tagListX);
            compound.put("srpnodescoordsy", tagListY);
            compound.put("srpnodescoordsz", tagListZ);
            compound.put("srpnodesages", tagListA);
        }
        if (this.colonyX.size() != this.colonyY.size() || this.colonyX.size() != this.colonyZ.size() || this.colonyX.size() != this.colonyA.size()) {
            SRPMain.LOGGER.error("Problem while writing colonies coords");
        } else {
            ListTag tagListX = new ListTag(), tagListY = new ListTag(), tagListZ = new ListTag(), tagListA = new ListTag();
            for (int i = 0; i < this.colonyX.size(); ++i) {
                CompoundTag tX = new CompoundTag(); tX.putInt("colonyx" + i, this.colonyX.get(i)); tagListX.add(tX);
                CompoundTag tY = new CompoundTag(); tY.putInt("colonyy" + i, this.colonyY.get(i)); tagListY.add(tY);
                CompoundTag tZ = new CompoundTag(); tZ.putInt("colonyz" + i, this.colonyZ.get(i)); tagListZ.add(tZ);
                CompoundTag tA = new CompoundTag(); tA.putInt("colonya" + i, this.colonyA.get(i)); tagListA.add(tA);
            }
            compound.put("srpcoloniescoordsx", tagListX);
            compound.put("srpcoloniescoordsy", tagListY);
            compound.put("srpcoloniescoordsz", tagListZ);
            compound.put("srpcoloniesages", tagListA);
        }
        if (this.resistanceI.size() != this.resistanceS.size()) {
            SRPMain.LOGGER.error("Problem while writing resistance");
        } else {
            ListTag tagListX = new ListTag(), tagListY = new ListTag();
            for (int i = 0; i < this.resistanceI.size(); ++i) {
                CompoundTag tX = new CompoundTag(); tX.putInt("resistance" + i, this.resistanceI.get(i)); tagListX.add(tX);
                CompoundTag tY = new CompoundTag(); tY.putString("resistance" + i, this.resistanceS.get(i)); tagListY.add(tY);
            }
            compound.put("srpcolonyresistancei", tagListX);
            compound.put("srpcolonyresistances", tagListY);
        }
        return compound;
    }

    public void setCurrentV(int in) { this.currentVenkrol += in; this.setDirty(); }
    public int getCurrentV() { return this.currentVenkrol; }

    private double getDistanceSQ(double rootx, double rooty, double rootz, double standingx, double standingy, double standingz) {
        double d0 = rootx - standingx; double d1 = rooty - standingy; double d2 = rootz - standingz;
        return d0 * d0 + d1 * d1 + d2 * d2;
    }

    public void clearNodeList() { this.nodeX = new ArrayList<>(); this.nodeY = new ArrayList<>(); this.nodeZ = new ArrayList<>(); this.nodeA = new ArrayList<>(); this.setDirty(); }
    public ArrayList<Integer> getNodes(String i) {
        if (i.equals("x")) return this.nodeX;
        if (i.equals("y")) return this.nodeY;
        if (i.equals("z")) return this.nodeZ;
        if (i.equals("a")) return this.nodeA;
        return null;
    }
    public int setNode(int x, int y, int z) {
        if (!this.canNodeBeMade(new BlockPos(x, y, z))) return 8;
        if (this.nodeX.size() >= SRPConfigWorld.maximumNumberNodes) return 9;
        int canAdd = 1;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            if (this.nodeX.get(i) != x || this.nodeY.get(i) != y || this.nodeZ.get(i) != z) continue;
            if (this.nodeA.get(i) != 1) { this.removeNode(x, y, z); this.setNode(x, y, z); }
            canAdd = 10;
        }
        if (canAdd == 1) { this.nodeX.add(x); this.nodeY.add(y); this.nodeZ.add(z); this.nodeA.add(1); this.setDirty(); }
        return canAdd;
    }
    public boolean canNodeBeMade(BlockPos pos) {
        int distance = SRPConfigWorld.minimumDistanceBetweenNodes * SRPConfigWorld.minimumDistanceBetweenNodes;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            double distanceSQ = this.getDistanceSQ(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue(), pos.getX(), pos.getY(), pos.getZ());
            if (distanceSQ <= (double) distance) return false;
        }
        return true;
    }
    public boolean removeNode(int x, int y, int z) {
        for (int i = 0; i < this.nodeX.size(); ++i) {
            if (this.nodeX.get(i) != x || this.nodeY.get(i) != y || this.nodeZ.get(i) != z) continue;
            this.nodeX.remove(i); this.nodeY.remove(i); this.nodeZ.remove(i); this.nodeA.remove(i); this.setDirty();
            return true;
        }
        return false;
    }
    public int isInRangeOfHeart(BlockPos pos, double distance) {
        distance += 1.0;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            double distanceSQ = this.getDistanceSQ(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue(), pos.getX(), pos.getY(), pos.getZ());
            if (distanceSQ < distance * distance) return (int) distanceSQ;
        }
        return -1;
    }
    public int nearestHeartAge(BlockPos pos, boolean spread, int currentDay) {
        int heart = -1; double distance = -1.0;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            double distanceSQ = this.getDistanceSQ(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue(), pos.getX(), pos.getY(), pos.getZ());
            int currentage = this.convertDayToAgeNode(currentDay, this.nodeA.get(i));
            int ageDistance = spread ? this.getDistanceSpreadByAge(currentage, true) : this.getDistanceEffectByAge(currentage, true);
            if (distanceSQ <= (double) ageDistance) {
                if (distance == -1.0) { heart = currentage; distance = distanceSQ; }
                else if (distance <= distanceSQ) { heart = currentage; distance = distanceSQ; }
            }
        }
        return heart;
    }
    public BlockPos nearestHeartAgePosition(BlockPos pos, int currentDay) {
        BlockPos heart = null; double distance = -1.0;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            double distanceSQ = this.getDistanceSQ(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue(), pos.getX(), pos.getY(), pos.getZ());
            int currentage = this.convertDayToAgeNode(currentDay, this.nodeA.get(i));
            int ageDistance = this.getDistanceEffectByAge(currentage, true);
            if (distanceSQ <= (double) ageDistance) {
                if (distance == -1.0) { heart = new BlockPos(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue()); distance = distanceSQ; }
                else if (distance <= distanceSQ) { heart = new BlockPos(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue()); distance = distanceSQ; }
            }
        }
        return heart;
    }
    private int convertDayToAgeNode(int currentDay, int nodeBirthday) {
        int age = nodeBirthday;
        if (age >= SRPConfigWorld.timeNeedeToNodeThree) return 3;
        if (age >= SRPConfigWorld.timeNeedeToNodeTwo) return 2;
        if (age >= SRPConfigWorld.timeNeedeToNodeOne) return 1;
        return 1;
    }
    public int totalNodePoints(int currentDay) {
        int points = 0;
        for (int i = 0; i < this.nodeX.size(); ++i) points += this.convertDayToAgeNode(currentDay, this.nodeA.get(i));
        return points;
    }
    /** Edad (nivel) del nodo en la posicion indicada, o -1 si no hay nodo ahi. */
    public int getHeartPocition(BlockPos pos, int currentDay) {
        for (int i = 0; i < this.nodeX.size(); ++i) {
            if (this.nodeX.get(i).intValue() != pos.getX() || this.nodeY.get(i).intValue() != pos.getY() || this.nodeZ.get(i).intValue() != pos.getZ()) continue;
            return this.convertDayToAgeNode(currentDay, this.nodeA.get(i));
        }
        return -1;
    }
    public void clearColonyList() { this.colonyX = new ArrayList<>(); this.colonyY = new ArrayList<>(); this.colonyZ = new ArrayList<>(); this.colonyA = new ArrayList<>(); this.setDirty(); }
    public ArrayList<Integer> getColonies(String i) {
        if (i.equals("x")) return this.colonyX;
        if (i.equals("y")) return this.colonyY;
        if (i.equals("z")) return this.colonyZ;
        if (i.equals("a")) return this.colonyA;
        return null;
    }
    public int setColony(int x, int y, int z) {
        if (!this.canColonyBeMade(new BlockPos(x, y, z))) return 6;
        if (this.colonyX.size() >= SRPConfigWorld.maximumNumberColonies) return 7;
        int canAdd = 1;
        for (int i = 0; i < this.colonyX.size(); ++i) {
            if (this.colonyX.get(i) != x || this.colonyY.get(i) != y || this.colonyZ.get(i) != z) continue;
            if (this.colonyA.get(i) != 1) { this.removeColony(x, y, z); this.setColony(x, y, z); }
            canAdd = 10;
        }
        if (canAdd == 1) { this.colonyX.add(x); this.colonyY.add(y); this.colonyZ.add(z); this.colonyA.add(1); this.setDirty(); }
        return canAdd;
    }
    public boolean canColonyBeMade(BlockPos pos) {
        int distance = SRPConfigWorld.minimumDistanceBetweenColonies * SRPConfigWorld.minimumDistanceBetweenColonies;
        for (int i = 0; i < this.colonyX.size(); ++i) {
            double distanceSQ = this.getDistanceSQ(this.colonyX.get(i).intValue(), this.colonyY.get(i).intValue(), this.colonyZ.get(i).intValue(), pos.getX(), pos.getY(), pos.getZ());
            if (distanceSQ <= (double) distance) return false;
        }
        return true;
    }
    public boolean removeColony(int x, int y, int z) {
        for (int i = 0; i < this.colonyX.size(); ++i) {
            if (this.colonyX.get(i) != x || this.colonyY.get(i) != y || this.colonyZ.get(i) != z) continue;
            this.colonyX.remove(i); this.colonyY.remove(i); this.colonyZ.remove(i); this.colonyA.remove(i); this.setDirty();
            return true;
        }
        return false;
    }
    public BlockPos nearestColonyPosition(BlockPos pos, boolean effect) {
        BlockPos posColony = null; double distance = -1.0;
        for (int i = 0; i < this.colonyX.size(); ++i) {
            double distanceSQ = this.getDistanceSQ(this.colonyX.get(i).intValue(), this.colonyY.get(i).intValue(), this.colonyZ.get(i).intValue(), pos.getX(), pos.getY(), pos.getZ());
            int ageDistance = this.convertDayToPointsColony(this.colonyA.get(i));
            ageDistance = this.getColonyDistanceSpreadByPoints(ageDistance, true, effect);
            if (distanceSQ <= (double) ageDistance) {
                if (distance == -1.0) { posColony = new BlockPos(this.colonyX.get(i).intValue(), this.colonyY.get(i).intValue(), this.colonyZ.get(i).intValue()); distance = distanceSQ; }
                else if (distance <= distanceSQ) { posColony = new BlockPos(this.colonyX.get(i).intValue(), this.colonyY.get(i).intValue(), this.colonyZ.get(i).intValue()); distance = distanceSQ; }
            }
        }
        return posColony;
    }
    private int convertDayToPointsColony(int nodeBirthday) { return Math.min(nodeBirthday, SRPConfigWorld.colonyPointCap); }
    public int colonunumber() { return this.colonyA.size(); }
    public int getColonyDistanceSpreadByPoints(int points, boolean sq, boolean effect) {
        if (effect) {
            int baseRange = SRPConfigWorld.colonyBaseEffectRadiusValue;
            int a = points / SRPConfigWorld.colonySpreadEffectPoint;
            int b = a * SRPConfigWorld.colonySpreadEffectValue + baseRange;
            return sq ? b * b : b;
        }
        int baseRange = SRPConfigWorld.colonyBaseRadiusValue;
        int a = points / SRPConfigWorld.colonySpreadPoint;
        int b = a * SRPConfigWorld.colonySpreadValue + baseRange;
        return sq ? b * b : b;
    }
    public int getColonyDistanceSpreadByPosition(BlockPos pos, boolean sq) {
        int x = pos.getX(); int y = pos.getY(); int z = pos.getZ();
        for (int i = 0; i < this.colonyX.size(); ++i) {
            if (this.colonyX.get(i) != x || this.colonyY.get(i) != y || this.colonyZ.get(i) != z) continue;
            int ageDistance = this.convertDayToPointsColony(this.colonyA.get(i));
            return this.getColonyDistanceSpreadByPoints(ageDistance, sq, false);
        }
        return 0;
    }
    public BlockPos isInRangeOfColony(BlockPos pos, double distance) {
        distance += 1.0;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            double distanceSQ = this.getDistanceSQ(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue(), pos.getX(), pos.getY(), pos.getZ());
            if (distanceSQ < distance * distance) return new BlockPos(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue());
        }
        return null;
    }
    public int totalColonyPoints(int currentDay) {
        int points = 0;
        for (int i = 0; i < this.colonyX.size(); ++i) points += this.convertDayToPointsColony(this.colonyA.get(i));
        return Math.min(points, SRPConfigWorld.colonyTotalPointCap);
    }
    public void checkColonyExistance(Level worldIn) {
        for (int i = 0; i < this.colonyX.size(); ++i) {
            BlockPos pos = new BlockPos(this.colonyX.get(i).intValue(), this.colonyY.get(i).intValue(), this.colonyZ.get(i).intValue());
            if (!worldIn.isAreaLoaded(pos, 3)) continue;
            if (false) { // SRPBlocks.ColonyHeart not migrated yet
                this.removeColony(this.colonyX.get(i), this.colonyY.get(i), this.colonyZ.get(i));
                continue;
            }
            int in = this.colonyA.get(i) + 1;
            this.colonyA.set(i, in);
        }
    }
    public void checkHeartExistance(Level worldIn) {
        for (int i = 0; i < this.nodeX.size(); ++i) {
            BlockPos pos = new BlockPos(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue());
            if (!worldIn.isAreaLoaded(pos, 3)) continue;
            if (false) { // SRPBlocks.BiomeHeart not migrated yet
                this.removeNode(this.nodeX.get(i), this.nodeY.get(i), this.nodeZ.get(i));
                continue;
            }
            int in = this.nodeA.get(i) + 1;
            this.nodeA.set(i, in);
        }
    }
    public void addGlobalResistance(String damage) { boolean flag = true;
        for (int i = 0; i < this.resistanceS.size(); ++i) {
            if (!this.resistanceS.get(i).equals(damage)) continue;
            this.resistanceI.set(i, this.resistanceI.get(i) + 1); flag = false; break;
        }
        if (flag) { this.resistanceS.add(damage); this.resistanceI.add(1); }
        this.setDirty();
    }
    public String getMostCommonDamageS() {
        ArrayList<String> s = this.resistanceS; ArrayList<Integer> ii = this.resistanceI;
        String atm = null; int times = 0;
        for (int i = 0; i < ii.size(); ++i) if (ii.get(i) > times) { times = ii.get(i); atm = s.get(i); }
        return atm;
    }
    public int getMostCommonDamageI() {
        ArrayList<Integer> ii = this.resistanceI; int times = 0;
        for (int i = 0; i < ii.size(); ++i) if (ii.get(i) > times) times = ii.get(i);
        return times;
    }
    public void resetGlobalAdaptation() { this.resistanceI = new ArrayList<>(); this.resistanceS = new ArrayList<>(); this.setDirty(); }
    public ArrayList<String> getAdaptationS() { return this.resistanceS; }
    public ArrayList<Integer> getAdaptationI() { return this.resistanceI; }
    public int getDistanceSpreadByAge(int age, boolean sq) {
        switch (age) {
            case 1: return sq ? SRPConfigWorld.nodeRangeSpreadOne * SRPConfigWorld.nodeRangeSpreadOne : SRPConfigWorld.nodeRangeSpreadOne;
            case 2: return sq ? SRPConfigWorld.nodeRangeSpreadTwo * SRPConfigWorld.nodeRangeSpreadTwo : SRPConfigWorld.nodeRangeSpreadTwo;
            case 3: return sq ? SRPConfigWorld.nodeRangeSpreadThree * SRPConfigWorld.nodeRangeSpreadThree : SRPConfigWorld.nodeRangeSpreadThree;
        }
        return -1;
    }
    public int getDistanceEffectByAge(int age, boolean sq) {
        switch (age) {
            case 1: return sq ? SRPConfigWorld.nodeRangeEffectsOne * SRPConfigWorld.nodeRangeEffectsOne : SRPConfigWorld.nodeRangeEffectsOne;
            case 2: return sq ? SRPConfigWorld.nodeRangeEffectsTwo * SRPConfigWorld.nodeRangeEffectsTwo : SRPConfigWorld.nodeRangeEffectsTwo;
            case 3: return sq ? SRPConfigWorld.nodeRangeEffectsThree * SRPConfigWorld.nodeRangeEffectsThree : SRPConfigWorld.nodeRangeEffectsThree;
        }
        return -1;
    }
}
