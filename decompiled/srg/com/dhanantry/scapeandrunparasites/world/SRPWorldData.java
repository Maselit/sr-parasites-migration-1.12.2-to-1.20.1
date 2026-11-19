/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraft.world.storage.MapStorage
 *  net.minecraft.world.storage.WorldSavedData
 *  org.apache.logging.log4j.Level
 */
package com.dhanantry.scapeandrunparasites.world;

import com.dhanantry.scapeandrunparasites.SRPMain;
import com.dhanantry.scapeandrunparasites.init.SRPBlocks;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigWorld;
import java.util.ArrayList;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapStorage;
import net.minecraft.world.storage.WorldSavedData;
import org.apache.logging.log4j.Level;

public class SRPWorldData
extends WorldSavedData {
    private static final String DATA_NAME = "srparasites_data";
    private static SRPWorldData instance;
    private int currentVenkrol;
    private ArrayList<Integer> nodeX = new ArrayList();
    private ArrayList<Integer> nodeY = new ArrayList();
    private ArrayList<Integer> nodeZ = new ArrayList();
    private ArrayList<Integer> nodeA = new ArrayList();
    private ArrayList<Integer> colonyX = new ArrayList();
    private ArrayList<Integer> colonyY = new ArrayList();
    private ArrayList<Integer> colonyZ = new ArrayList();
    private ArrayList<Integer> colonyA = new ArrayList();
    private ArrayList<Integer> resistanceI = new ArrayList();
    private ArrayList<String> resistanceS = new ArrayList();

    public SRPWorldData() {
        super(DATA_NAME);
    }

    public SRPWorldData(String name) {
        super(name);
    }

    public static SRPWorldData get(World world) {
        MapStorage storage = world.getPerWorldStorage();
        instance = (SRPWorldData)storage.func_75742_a(SRPWorldData.class, DATA_NAME);
        if (instance == null) {
            instance = SRPWorldData.create(world, storage);
        }
        return instance;
    }

    private static SRPWorldData create(World world, MapStorage storage) {
        instance = new SRPWorldData();
        storage.func_75745_a(DATA_NAME, (WorldSavedData)instance);
        int currentDim = world.field_73011_w.getDimension();
        return instance;
    }

    public void resetInstance(World world) {
        MapStorage storage = world.getPerWorldStorage();
        instance = SRPWorldData.create(world, storage);
    }

    public void func_76184_a(NBTTagCompound compound) {
        int age;
        NBTTagCompound tagA;
        int coordz;
        NBTTagCompound tagZ;
        int coordy;
        NBTTagCompound tagY;
        int coordx;
        NBTTagCompound tagX;
        int i;
        NBTTagList tagListA;
        NBTTagList tagListZ;
        NBTTagList tagListY;
        NBTTagList tagListX;
        if (compound.func_74764_b("srpcurrentbeckons")) {
            this.currentVenkrol = compound.func_74762_e("srpcurrentbeckons");
        }
        if (compound.func_74764_b("srpnodescoordsx")) {
            tagListX = compound.func_150295_c("srpnodescoordsx", 10);
            tagListY = compound.func_150295_c("srpnodescoordsy", 10);
            tagListZ = compound.func_150295_c("srpnodescoordsz", 10);
            tagListA = compound.func_150295_c("srpnodesages", 10);
            if (tagListX.func_74745_c() != tagListY.func_74745_c() || tagListX.func_74745_c() != tagListZ.func_74745_c() || tagListX.func_74745_c() != tagListA.func_74745_c()) {
                SRPMain.logger.log(Level.ERROR, "Problem while reading nodes coords");
            } else {
                for (i = 0; i < tagListX.func_74745_c(); ++i) {
                    tagX = tagListX.func_150305_b(i);
                    coordx = tagX.func_74762_e("nodex" + i);
                    this.nodeX.add(i, coordx);
                    tagY = tagListY.func_150305_b(i);
                    coordy = tagY.func_74762_e("nodey" + i);
                    this.nodeY.add(i, coordy);
                    tagZ = tagListZ.func_150305_b(i);
                    coordz = tagZ.func_74762_e("nodez" + i);
                    this.nodeZ.add(i, coordz);
                    tagA = tagListA.func_150305_b(i);
                    age = tagA.func_74762_e("nodea" + i);
                    this.nodeA.add(i, age);
                }
            }
        }
        if (compound.func_74764_b("srpcoloniescoordsx")) {
            tagListX = compound.func_150295_c("srpcoloniescoordsx", 10);
            tagListY = compound.func_150295_c("srpcoloniescoordsy", 10);
            tagListZ = compound.func_150295_c("srpcoloniescoordsz", 10);
            tagListA = compound.func_150295_c("srpcoloniesages", 10);
            if (tagListX.func_74745_c() != tagListY.func_74745_c() || tagListX.func_74745_c() != tagListZ.func_74745_c() || tagListX.func_74745_c() != tagListA.func_74745_c()) {
                SRPMain.logger.log(Level.ERROR, "Problem while reading colonies coords");
            } else {
                for (i = 0; i < tagListX.func_74745_c(); ++i) {
                    tagX = tagListX.func_150305_b(i);
                    coordx = tagX.func_74762_e("colonyx" + i);
                    this.colonyX.add(i, coordx);
                    tagY = tagListY.func_150305_b(i);
                    coordy = tagY.func_74762_e("colonyy" + i);
                    this.colonyY.add(i, coordy);
                    tagZ = tagListZ.func_150305_b(i);
                    coordz = tagZ.func_74762_e("colonyz" + i);
                    this.colonyZ.add(i, coordz);
                    tagA = tagListA.func_150305_b(i);
                    age = tagA.func_74762_e("colonya" + i);
                    this.colonyA.add(i, age);
                }
            }
        }
        if (compound.func_74764_b("srpcolonyresistances")) {
            tagListX = compound.func_150295_c("srpcolonyresistancei", 10);
            tagListY = compound.func_150295_c("srpcolonyresistances", 10);
            if (tagListX.func_74745_c() != tagListY.func_74745_c()) {
                SRPMain.logger.log(Level.ERROR, "Problem while reading resistance");
            } else {
                for (int i2 = 0; i2 < tagListX.func_74745_c(); ++i2) {
                    NBTTagCompound tagX2 = tagListX.func_150305_b(i2);
                    int coordx2 = tagX2.func_74762_e("resistance" + i2);
                    this.resistanceI.add(i2, coordx2);
                    NBTTagCompound tagY2 = tagListY.func_150305_b(i2);
                    String coordy2 = tagY2.func_74779_i("resistance" + i2);
                    this.resistanceS.add(i2, coordy2);
                }
            }
        }
    }

    public NBTTagCompound func_189551_b(NBTTagCompound compound) {
        NBTTagCompound tagA;
        NBTTagCompound tagZ;
        NBTTagCompound tagY;
        NBTTagCompound tagX;
        int age;
        int coordz;
        int coordy;
        int coordx;
        int i;
        NBTTagList tagListA;
        NBTTagList tagListZ;
        NBTTagList tagListY;
        NBTTagList tagListX;
        compound.func_74768_a("srpcurrentbeckons", this.currentVenkrol);
        if (this.nodeX.size() != this.nodeY.size() || this.nodeX.size() != this.nodeZ.size() || this.nodeX.size() != this.nodeA.size()) {
            SRPMain.logger.log(Level.ERROR, "Problem while writing nodes coords");
        } else {
            tagListX = new NBTTagList();
            tagListY = new NBTTagList();
            tagListZ = new NBTTagList();
            tagListA = new NBTTagList();
            for (i = 0; i < this.nodeX.size(); ++i) {
                coordx = this.nodeX.get(i);
                coordy = this.nodeY.get(i);
                coordz = this.nodeZ.get(i);
                age = this.nodeA.get(i);
                tagX = new NBTTagCompound();
                tagX.func_74768_a("nodex" + i, coordx);
                tagListX.func_74742_a((NBTBase)tagX);
                tagY = new NBTTagCompound();
                tagY.func_74768_a("nodey" + i, coordy);
                tagListY.func_74742_a((NBTBase)tagY);
                tagZ = new NBTTagCompound();
                tagZ.func_74768_a("nodez" + i, coordz);
                tagListZ.func_74742_a((NBTBase)tagZ);
                tagA = new NBTTagCompound();
                tagA.func_74768_a("nodea" + i, age);
                tagListA.func_74742_a((NBTBase)tagA);
            }
            compound.func_74782_a("srpnodescoordsx", (NBTBase)tagListX);
            compound.func_74782_a("srpnodescoordsy", (NBTBase)tagListY);
            compound.func_74782_a("srpnodescoordsz", (NBTBase)tagListZ);
            compound.func_74782_a("srpnodesages", (NBTBase)tagListA);
        }
        if (this.colonyX.size() != this.colonyY.size() || this.colonyX.size() != this.colonyZ.size() || this.colonyX.size() != this.colonyA.size()) {
            SRPMain.logger.log(Level.ERROR, "Problem while writing colonies coords");
        } else {
            tagListX = new NBTTagList();
            tagListY = new NBTTagList();
            tagListZ = new NBTTagList();
            tagListA = new NBTTagList();
            for (i = 0; i < this.colonyX.size(); ++i) {
                coordx = this.colonyX.get(i);
                coordy = this.colonyY.get(i);
                coordz = this.colonyZ.get(i);
                age = this.colonyA.get(i);
                tagX = new NBTTagCompound();
                tagX.func_74768_a("colonyx" + i, coordx);
                tagListX.func_74742_a((NBTBase)tagX);
                tagY = new NBTTagCompound();
                tagY.func_74768_a("colonyy" + i, coordy);
                tagListY.func_74742_a((NBTBase)tagY);
                tagZ = new NBTTagCompound();
                tagZ.func_74768_a("colonyz" + i, coordz);
                tagListZ.func_74742_a((NBTBase)tagZ);
                tagA = new NBTTagCompound();
                tagA.func_74768_a("colonya" + i, age);
                tagListA.func_74742_a((NBTBase)tagA);
            }
            compound.func_74782_a("srpcoloniescoordsx", (NBTBase)tagListX);
            compound.func_74782_a("srpcoloniescoordsy", (NBTBase)tagListY);
            compound.func_74782_a("srpcoloniescoordsz", (NBTBase)tagListZ);
            compound.func_74782_a("srpcoloniesages", (NBTBase)tagListA);
        }
        if (this.resistanceI.size() != this.resistanceS.size()) {
            SRPMain.logger.log(Level.ERROR, "Problem while writing resistance");
        } else {
            tagListX = new NBTTagList();
            tagListY = new NBTTagList();
            for (int i2 = 0; i2 < this.resistanceI.size(); ++i2) {
                int coordx2 = this.resistanceI.get(i2);
                String coordy2 = this.resistanceS.get(i2);
                NBTTagCompound tagX2 = new NBTTagCompound();
                tagX2.func_74768_a("resistance" + i2, coordx2);
                tagListX.func_74742_a((NBTBase)tagX2);
                NBTTagCompound tagY2 = new NBTTagCompound();
                tagY2.func_74778_a("resistance" + i2, coordy2);
                tagListY.func_74742_a((NBTBase)tagY2);
            }
            compound.func_74782_a("srpcolonyresistancei", (NBTBase)tagListX);
            compound.func_74782_a("srpcolonyresistances", (NBTBase)tagListY);
        }
        return compound;
    }

    public void setCurrentV(int in) {
        this.currentVenkrol += in;
        this.func_76185_a();
    }

    public int getCurrentV() {
        return this.currentVenkrol;
    }

    private double getDistanceSQ(double rootx, double rooty, double rootz, double standingx, double standingy, double standingz) {
        double d0 = rootx - standingx;
        double d1 = rooty - standingy;
        double d2 = rootz - standingz;
        return d0 * d0 + d1 * d1 + d2 * d2;
    }

    public void clearNodeList() {
        this.nodeX = new ArrayList();
        this.nodeY = new ArrayList();
        this.nodeZ = new ArrayList();
        this.nodeA = new ArrayList();
        this.func_76185_a();
    }

    public ArrayList<Integer> getNodes(String i) {
        if (i.equals("x")) {
            return this.nodeX;
        }
        if (i.equals("y")) {
            return this.nodeY;
        }
        if (i.equals("z")) {
            return this.nodeZ;
        }
        if (i.equals("a")) {
            return this.nodeA;
        }
        return null;
    }

    public int setNode(int x, int y, int z) {
        if (!this.canNodeBeMade(new BlockPos(x, y, z))) {
            return 8;
        }
        if (this.nodeX.size() >= SRPConfigWorld.maximumNumberNodes) {
            return 9;
        }
        int canAdd = 1;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            if (this.nodeX.get(i) != x || this.nodeY.get(i) != y || this.nodeZ.get(i) != z) continue;
            if (this.nodeA.get(i) != 1) {
                this.removeNode(x, y, z);
                this.setNode(x, y, z);
            }
            canAdd = 10;
        }
        if (canAdd == 1) {
            this.nodeX.add(x);
            this.nodeY.add(y);
            this.nodeZ.add(z);
            this.nodeA.add(1);
            this.func_76185_a();
        }
        return canAdd;
    }

    public boolean canNodeBeMade(BlockPos pos) {
        int distance = SRPConfigWorld.minimumDistanceBetweenNodes * SRPConfigWorld.minimumDistanceBetweenNodes;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            double distanceSQ = this.getDistanceSQ(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue(), pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
            if (!(distanceSQ <= (double)distance)) continue;
            return false;
        }
        return true;
    }

    public boolean removeNode(int x, int y, int z) {
        for (int i = 0; i < this.nodeX.size(); ++i) {
            if (this.nodeX.get(i) != x || this.nodeY.get(i) != y || this.nodeZ.get(i) != z) continue;
            this.nodeX.remove(i);
            this.nodeY.remove(i);
            this.nodeZ.remove(i);
            this.nodeA.remove(i);
            this.func_76185_a();
            return true;
        }
        return false;
    }

    public int isInRangeOfHeart(BlockPos pos, double distance) {
        distance += 1.0;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            double distanceSQ = this.getDistanceSQ(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue(), pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
            if (!(distanceSQ < distance * distance)) continue;
            return (int)distanceSQ;
        }
        return -1;
    }

    public int nearestHeartAge(BlockPos pos, boolean spread, int currentDay) {
        int heart = -1;
        double distance = -1.0;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            int ageDistance;
            double distanceSQ = this.getDistanceSQ(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue(), pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
            int currentage = ageDistance = this.convertDayToAgeNode(currentDay, this.nodeA.get(i));
            ageDistance = spread ? this.getDistanceSpreadByAge(ageDistance, true) : this.getDistanceEffectByAge(ageDistance, true);
            if (!(distanceSQ <= (double)ageDistance)) continue;
            if (distance == -1.0) {
                heart = currentage;
                distance = distanceSQ;
                continue;
            }
            if (!(distance <= distanceSQ)) continue;
            heart = currentage;
            distance = distanceSQ;
        }
        return heart;
    }

    public BlockPos nearestHeartAgePosition(BlockPos pos, int currentDay) {
        BlockPos heart = null;
        double distance = -1.0;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            int ageDistance;
            double distanceSQ = this.getDistanceSQ(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue(), pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
            int currentage = ageDistance = this.convertDayToAgeNode(currentDay, this.nodeA.get(i));
            if (!(distanceSQ <= (double)(ageDistance = this.getDistanceEffectByAge(ageDistance, true)))) continue;
            if (distance == -1.0) {
                heart = new BlockPos(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue());
                distance = distanceSQ;
                continue;
            }
            if (!(distance <= distanceSQ)) continue;
            heart = new BlockPos(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue());
            distance = distanceSQ;
        }
        return heart;
    }

    private int convertDayToAgeNode(int currentDay, int nodeBirthday) {
        int age = nodeBirthday;
        if (age >= SRPConfigWorld.timeNeedeToNodeThree) {
            return 3;
        }
        if (age >= SRPConfigWorld.timeNeedeToNodeTwo) {
            return 2;
        }
        return 1;
    }

    public int getDistanceSpreadByAge(int age, boolean sq) {
        switch (age) {
            case 1: {
                if (sq) {
                    return SRPConfigWorld.nodeRangeSpreadOne * SRPConfigWorld.nodeRangeSpreadOne;
                }
                return SRPConfigWorld.nodeRangeSpreadOne;
            }
            case 2: {
                if (sq) {
                    return SRPConfigWorld.nodeRangeSpreadTwo * SRPConfigWorld.nodeRangeSpreadTwo;
                }
                return SRPConfigWorld.nodeRangeSpreadTwo;
            }
            case 3: {
                if (sq) {
                    return SRPConfigWorld.nodeRangeSpreadThree * SRPConfigWorld.nodeRangeSpreadThree;
                }
                return SRPConfigWorld.nodeRangeSpreadThree;
            }
        }
        return -1;
    }

    public int getDistanceEffectByAge(int age, boolean sq) {
        switch (age) {
            case 1: {
                if (sq) {
                    return SRPConfigWorld.nodeRangeEffectsOne * SRPConfigWorld.nodeRangeEffectsOne;
                }
                return SRPConfigWorld.nodeRangeEffectsOne;
            }
            case 2: {
                if (sq) {
                    return SRPConfigWorld.nodeRangeEffectsTwo * SRPConfigWorld.nodeRangeEffectsTwo;
                }
                return SRPConfigWorld.nodeRangeEffectsTwo;
            }
            case 3: {
                if (sq) {
                    return SRPConfigWorld.nodeRangeEffectsThree * SRPConfigWorld.nodeRangeEffectsThree;
                }
                return SRPConfigWorld.nodeRangeEffectsThree;
            }
        }
        return -1;
    }

    public void checkHeartExistance(World worldIn) {
        for (int i = 0; i < this.nodeX.size(); ++i) {
            BlockPos pos = new BlockPos(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue());
            if (!worldIn.func_175697_a(pos, 3)) continue;
            if (worldIn.func_180495_p(pos).func_177230_c() != SRPBlocks.BiomeHeart) {
                this.removeNode(this.nodeX.get(i), this.nodeY.get(i), this.nodeZ.get(i));
                continue;
            }
            int in = this.nodeA.get(i) + 1;
            this.nodeA.set(i, in);
        }
    }

    public int getHeartPocition(BlockPos pos, int currentDay) {
        for (int i = 0; i < this.nodeX.size(); ++i) {
            if (this.nodeX.get(i).intValue() != pos.func_177958_n() || this.nodeY.get(i).intValue() != pos.func_177956_o() || this.nodeZ.get(i).intValue() != pos.func_177952_p()) continue;
            return this.convertDayToAgeNode(currentDay, this.nodeA.get(i));
        }
        return -1;
    }

    public int totalNodePoints(int currentDay) {
        int points = 0;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            int age = this.convertDayToAgeNode(currentDay, this.nodeA.get(i));
            points += age;
        }
        return points;
    }

    public void clearColonyList() {
        this.colonyX = new ArrayList();
        this.colonyY = new ArrayList();
        this.colonyZ = new ArrayList();
        this.colonyA = new ArrayList();
        this.func_76185_a();
    }

    public ArrayList<Integer> getColonies(String i) {
        if (i.equals("x")) {
            return this.colonyX;
        }
        if (i.equals("y")) {
            return this.colonyY;
        }
        if (i.equals("z")) {
            return this.colonyZ;
        }
        if (i.equals("a")) {
            return this.colonyA;
        }
        return null;
    }

    public int setColony(int x, int y, int z) {
        if (!this.canColonyBeMade(new BlockPos(x, y, z))) {
            return 6;
        }
        if (this.colonyX.size() >= SRPConfigWorld.maximumNumberColonies) {
            return 7;
        }
        int canAdd = 1;
        for (int i = 0; i < this.colonyX.size(); ++i) {
            if (this.colonyX.get(i) != x || this.colonyY.get(i) != y || this.colonyZ.get(i) != z) continue;
            if (this.colonyA.get(i) != 1) {
                this.removeColony(x, y, z);
                this.setColony(x, y, z);
            }
            canAdd = 10;
        }
        if (canAdd == 1) {
            this.colonyX.add(x);
            this.colonyY.add(y);
            this.colonyZ.add(z);
            this.colonyA.add(1);
            this.func_76185_a();
        }
        return canAdd;
    }

    public boolean canColonyBeMade(BlockPos pos) {
        int distance = SRPConfigWorld.minimumDistanceBetweenColonies * SRPConfigWorld.minimumDistanceBetweenColonies;
        for (int i = 0; i < this.colonyX.size(); ++i) {
            double distanceSQ = this.getDistanceSQ(this.colonyX.get(i).intValue(), this.colonyY.get(i).intValue(), this.colonyZ.get(i).intValue(), pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
            if (!(distanceSQ <= (double)distance)) continue;
            return false;
        }
        return true;
    }

    public boolean removeColony(int x, int y, int z) {
        for (int i = 0; i < this.colonyX.size(); ++i) {
            if (this.colonyX.get(i) != x || this.colonyY.get(i) != y || this.colonyZ.get(i) != z) continue;
            this.colonyX.remove(i);
            this.colonyY.remove(i);
            this.colonyZ.remove(i);
            this.colonyA.remove(i);
            this.func_76185_a();
            return true;
        }
        return false;
    }

    public BlockPos nearestColonyPosition(BlockPos pos, boolean effect) {
        BlockPos posColony = null;
        double distance = -1.0;
        for (int i = 0; i < this.colonyX.size(); ++i) {
            double distanceSQ = this.getDistanceSQ(this.colonyX.get(i).intValue(), this.colonyY.get(i).intValue(), this.colonyZ.get(i).intValue(), pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
            int ageDistance = this.convertDayToPointsColony(this.colonyA.get(i));
            if (!(distanceSQ <= (double)(ageDistance = this.getColonyDistanceSpreadByPoints(ageDistance, true, effect)))) continue;
            if (distance == -1.0) {
                posColony = new BlockPos(this.colonyX.get(i).intValue(), this.colonyY.get(i).intValue(), this.colonyZ.get(i).intValue());
                distance = distanceSQ;
                continue;
            }
            if (!(distance <= distanceSQ)) continue;
            posColony = new BlockPos(this.colonyX.get(i).intValue(), this.colonyY.get(i).intValue(), this.colonyZ.get(i).intValue());
            distance = distanceSQ;
        }
        return posColony;
    }

    private int convertDayToPointsColony(int nodeBirthday) {
        int age = nodeBirthday;
        return Math.min(age, SRPConfigWorld.colonyPointCap);
    }

    public int colonunumber() {
        return this.colonyA.size();
    }

    public int getColonyDistanceSpreadByPoints(int points, boolean sq, boolean effect) {
        if (effect) {
            int baseRange = SRPConfigWorld.colonyBaseEffectRadiusValue;
            int a = points / SRPConfigWorld.colonySpreadEffectPoint;
            int b = a * SRPConfigWorld.colonySpreadEffectValue + baseRange;
            if (sq) {
                return b * b;
            }
            return b;
        }
        int baseRange = SRPConfigWorld.colonyBaseRadiusValue;
        int a = points / SRPConfigWorld.colonySpreadPoint;
        int b = a * SRPConfigWorld.colonySpreadValue + baseRange;
        if (sq) {
            return b * b;
        }
        return b;
    }

    public int getColonyDistanceSpreadByPosition(BlockPos pos, boolean sq) {
        int x = pos.func_177958_n();
        int y = pos.func_177956_o();
        int z = pos.func_177952_p();
        for (int i = 0; i < this.colonyX.size(); ++i) {
            if (this.colonyX.get(i) != x || this.colonyY.get(i) != y || this.colonyZ.get(i) != z) continue;
            int ageDistance = this.convertDayToPointsColony(this.colonyA.get(i));
            ageDistance = this.getColonyDistanceSpreadByPoints(ageDistance, sq, false);
            return ageDistance;
        }
        return 0;
    }

    public BlockPos isInRangeOfColony(BlockPos pos, double distance) {
        distance += 1.0;
        for (int i = 0; i < this.nodeX.size(); ++i) {
            double distanceSQ = this.getDistanceSQ(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue(), pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
            if (!(distanceSQ < distance * distance)) continue;
            return new BlockPos(this.nodeX.get(i).intValue(), this.nodeY.get(i).intValue(), this.nodeZ.get(i).intValue());
        }
        return null;
    }

    public int totalColonyPoints(int currentDay) {
        int points = 0;
        for (int i = 0; i < this.colonyX.size(); ++i) {
            int age = this.convertDayToPointsColony(this.colonyA.get(i));
            points += age;
        }
        return Math.min(points, SRPConfigWorld.colonyTotalPointCap);
    }

    public void checkColonyExistance(World worldIn) {
        for (int i = 0; i < this.colonyX.size(); ++i) {
            BlockPos pos = new BlockPos(this.colonyX.get(i).intValue(), this.colonyY.get(i).intValue(), this.colonyZ.get(i).intValue());
            if (!worldIn.func_175697_a(pos, 3)) continue;
            if (worldIn.func_180495_p(pos).func_177230_c() != SRPBlocks.ColonyHeart) {
                this.removeColony(this.colonyX.get(i), this.colonyY.get(i), this.colonyZ.get(i));
                continue;
            }
            int in = this.colonyA.get(i) + 1;
            this.colonyA.set(i, in);
        }
    }

    public void addGlobalResistance(String damage) {
        boolean flag = true;
        for (int i = 0; i < this.resistanceS.size(); ++i) {
            if (!this.resistanceS.get(i).equals(damage)) continue;
            int iiii = this.resistanceI.get(i) + 1;
            this.resistanceI.set(i, iiii);
            flag = false;
            break;
        }
        if (flag) {
            this.resistanceS.add(damage);
            this.resistanceI.add(1);
        }
        this.func_76185_a();
    }

    public String getMostCommonDamageS() {
        ArrayList<String> resistanceAAAS = this.resistanceS;
        ArrayList<Integer> resistanceAAAI = this.resistanceI;
        String atm = null;
        int times = 0;
        for (int i = 0; i < resistanceAAAI.size(); ++i) {
            if (resistanceAAAI.get(i) <= times) continue;
            times = resistanceAAAI.get(i);
            atm = resistanceAAAS.get(i);
        }
        return atm;
    }

    public int getMostCommonDamageI() {
        ArrayList<Integer> resistanceAAAI = this.resistanceI;
        int times = 0;
        for (int i = 0; i < resistanceAAAI.size(); ++i) {
            if (resistanceAAAI.get(i) <= times) continue;
            times = resistanceAAAI.get(i);
        }
        return times;
    }

    public void resetGlobalAdaptation() {
        this.resistanceI = new ArrayList();
        this.resistanceS = new ArrayList();
        this.func_76185_a();
    }

    public ArrayList<String> getAdaptationS() {
        return this.resistanceS;
    }

    public ArrayList<Integer> getAdaptationI() {
        return this.resistanceI;
    }
}

