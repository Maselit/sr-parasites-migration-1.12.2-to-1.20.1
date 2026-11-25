package com.dhanantry.scapeandrunparasites.client.model.entity.deterrent.nexus;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrolSIII;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelVenkrolSIII extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "venkrolsiii"), "main");
    private final ModelPart mainbody;
    private final ModelPart body1;
    private final ModelPart root_center;
    private final ModelPart body2;
    private final ModelPart body3;
    private final ModelPart body4;
    private final ModelPart body5;
    private final ModelPart ten_center;
    private final ModelPart body6;
    private final ModelPart JD;
    private final ModelPart JD_1;
    private final ModelPart JD_2;
    private final ModelPart JD_3;
    private final ModelPart jointBR1;
    private final ModelPart tacle;
    private final ModelPart jointBR2;
    private final ModelPart decor;
    private final ModelPart tacle_1;
    private final ModelPart jointBR3;
    private final ModelPart decor_1;
    private final ModelPart tacle_2;
    private final ModelPart jointBR4;
    private final ModelPart decor_2;
    private final ModelPart tacle_3;
    private final ModelPart jointBL1;
    private final ModelPart tacle_4;
    private final ModelPart jointBL2;
    private final ModelPart decor_3;
    private final ModelPart tacle_5;
    private final ModelPart jointBL3;
    private final ModelPart decor_4;
    private final ModelPart tacle_6;
    private final ModelPart jointBL4;
    private final ModelPart decor_5;
    private final ModelPart tacle_7;
    private final ModelPart jointFR1;
    private final ModelPart tacle_8;
    private final ModelPart jointFR2;
    private final ModelPart decor_6;
    private final ModelPart tacle_9;
    private final ModelPart jointFR3;
    private final ModelPart decor_7;
    private final ModelPart tacle_10;
    private final ModelPart jointFR4;
    private final ModelPart decor_8;
    private final ModelPart tacle_11;
    private final ModelPart jointFL1;
    private final ModelPart tacle_12;
    private final ModelPart jointFL2;
    private final ModelPart decor_9;
    private final ModelPart tacle_13;
    private final ModelPart jointFL3;
    private final ModelPart decor_10;
    private final ModelPart tacle_14;
    private final ModelPart jointFL4;
    private final ModelPart decor_11;
    private final ModelPart tacle_15;
    private final ModelPart body7;
    private final ModelPart body8;
    private final ModelPart body9;
    private final ModelPart ten_center_1;
    private final ModelPart body10;
    private final ModelPart JD_4;
    private final ModelPart JD_5;
    private final ModelPart JD_6;
    private final ModelPart JD_7;
    private final ModelPart jointB1;
    private final ModelPart tacle_16;
    private final ModelPart jointB2;
    private final ModelPart tacle_17;
    private final ModelPart jointB3;
    private final ModelPart tacle_18;
    private final ModelPart jointB4;
    private final ModelPart tacle_19;
    private final ModelPart jointL1;
    private final ModelPart tacle_20;
    private final ModelPart jointL2;
    private final ModelPart tacle_21;
    private final ModelPart jointL3;
    private final ModelPart tacle_22;
    private final ModelPart jointL4;
    private final ModelPart tacle_23;
    private final ModelPart jointR1;
    private final ModelPart tacle_24;
    private final ModelPart jointR2;
    private final ModelPart tacle_25;
    private final ModelPart jointR3;
    private final ModelPart tacle_26;
    private final ModelPart jointR4;
    private final ModelPart tacle_27;
    private final ModelPart jointF1;
    private final ModelPart tacle_28;
    private final ModelPart jointF2;
    private final ModelPart tacle_29;
    private final ModelPart jointF3;
    private final ModelPart tacle_30;
    private final ModelPart jointF4;
    private final ModelPart tacle_31;
    private final ModelPart body11;
    private final ModelPart body12;
    private final ModelPart body13;
    private final ModelPart ten_center_2;
    private final ModelPart core1;
    private final ModelPart core2;
    private final ModelPart core5;
    private final ModelPart core3;
    private final ModelPart core4;
    private final ModelPart core6;
    private final ModelPart core7;
    private final ModelPart rootmain;
    private final ModelPart root;
    private final ModelPart root_1;
    private final ModelPart root_2;
    private final ModelPart root_3;
    private final ModelPart root_4;
    private final ModelPart root_5;
    private final ModelPart root_6;
    private final ModelPart root_7;
    private final ModelPart root_8;
    private final ModelPart root_9;
    private final ModelPart root_10;
    private final ModelPart root_11;
    private final ModelPart root_12;
    private final ModelPart root_13;
    private final ModelPart root_14;
    private final ModelPart root_15;
    private final ModelPart root_16;
    private final ModelPart root_17;
    private final ModelPart root_18;
    private final ModelPart root_19;

    public ModelVenkrolSIII(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.body1 = root.getChild("mainbody").getChild("body1");
        this.root_center = root.getChild("mainbody").getChild("root_center");
        this.body2 = root.getChild("mainbody").getChild("body1").getChild("body2");
        this.body3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3");
        this.body4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4");
        this.body5 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5");
        this.ten_center = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center");
        this.body6 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6");
        this.JD = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD");
        this.JD_1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1");
        this.JD_2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2");
        this.JD_3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3");
        this.jointBR1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1");
        this.tacle = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle");
        this.jointBR2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2");
        this.decor = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("decor");
        this.tacle_1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2").getChild("tacle_1");
        this.jointBR3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2").getChild("tacle_1").getChild("jointBR3");
        this.decor_1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2").getChild("tacle_1").getChild("decor_1");
        this.tacle_2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2").getChild("tacle_1").getChild("jointBR3").getChild("tacle_2");
        this.jointBR4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2").getChild("tacle_1").getChild("jointBR3").getChild("tacle_2").getChild("jointBR4");
        this.decor_2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2").getChild("tacle_1").getChild("jointBR3").getChild("tacle_2").getChild("decor_2");
        this.tacle_3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2").getChild("tacle_1").getChild("jointBR3").getChild("tacle_2").getChild("jointBR4").getChild("tacle_3");
        this.jointBL1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1");
        this.tacle_4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4");
        this.jointBL2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2");
        this.decor_3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("decor_3");
        this.tacle_5 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2").getChild("tacle_5");
        this.jointBL3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2").getChild("tacle_5").getChild("jointBL3");
        this.decor_4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2").getChild("tacle_5").getChild("decor_4");
        this.tacle_6 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2").getChild("tacle_5").getChild("jointBL3").getChild("tacle_6");
        this.jointBL4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2").getChild("tacle_5").getChild("jointBL3").getChild("tacle_6").getChild("jointBL4");
        this.decor_5 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2").getChild("tacle_5").getChild("jointBL3").getChild("tacle_6").getChild("decor_5");
        this.tacle_7 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2").getChild("tacle_5").getChild("jointBL3").getChild("tacle_6").getChild("jointBL4").getChild("tacle_7");
        this.jointFR1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1");
        this.tacle_8 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8");
        this.jointFR2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2");
        this.decor_6 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("decor_6");
        this.tacle_9 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2").getChild("tacle_9");
        this.jointFR3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2").getChild("tacle_9").getChild("jointFR3");
        this.decor_7 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2").getChild("tacle_9").getChild("decor_7");
        this.tacle_10 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2").getChild("tacle_9").getChild("jointFR3").getChild("tacle_10");
        this.jointFR4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2").getChild("tacle_9").getChild("jointFR3").getChild("tacle_10").getChild("jointFR4");
        this.decor_8 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2").getChild("tacle_9").getChild("jointFR3").getChild("tacle_10").getChild("decor_8");
        this.tacle_11 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2").getChild("tacle_9").getChild("jointFR3").getChild("tacle_10").getChild("jointFR4").getChild("tacle_11");
        this.jointFL1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1");
        this.tacle_12 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12");
        this.jointFL2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2");
        this.decor_9 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("decor_9");
        this.tacle_13 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2").getChild("tacle_13");
        this.jointFL3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2").getChild("tacle_13").getChild("jointFL3");
        this.decor_10 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2").getChild("tacle_13").getChild("decor_10");
        this.tacle_14 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2").getChild("tacle_13").getChild("jointFL3").getChild("tacle_14");
        this.jointFL4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2").getChild("tacle_13").getChild("jointFL3").getChild("tacle_14").getChild("jointFL4");
        this.decor_11 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2").getChild("tacle_13").getChild("jointFL3").getChild("tacle_14").getChild("decor_11");
        this.tacle_15 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2").getChild("tacle_13").getChild("jointFL3").getChild("tacle_14").getChild("jointFL4").getChild("tacle_15");
        this.body7 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7");
        this.body8 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8");
        this.body9 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9");
        this.ten_center_1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1");
        this.body10 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("body10");
        this.JD_4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_4");
        this.JD_5 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_5");
        this.JD_6 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_6");
        this.JD_7 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_7");
        this.jointB1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_4").getChild("jointB1");
        this.tacle_16 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_4").getChild("jointB1").getChild("tacle_16");
        this.jointB2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_4").getChild("jointB1").getChild("tacle_16").getChild("jointB2");
        this.tacle_17 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_4").getChild("jointB1").getChild("tacle_16").getChild("jointB2").getChild("tacle_17");
        this.jointB3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_4").getChild("jointB1").getChild("tacle_16").getChild("jointB2").getChild("tacle_17").getChild("jointB3");
        this.tacle_18 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_4").getChild("jointB1").getChild("tacle_16").getChild("jointB2").getChild("tacle_17").getChild("jointB3").getChild("tacle_18");
        this.jointB4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_4").getChild("jointB1").getChild("tacle_16").getChild("jointB2").getChild("tacle_17").getChild("jointB3").getChild("tacle_18").getChild("jointB4");
        this.tacle_19 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_4").getChild("jointB1").getChild("tacle_16").getChild("jointB2").getChild("tacle_17").getChild("jointB3").getChild("tacle_18").getChild("jointB4").getChild("tacle_19");
        this.jointL1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_5").getChild("jointL1");
        this.tacle_20 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_5").getChild("jointL1").getChild("tacle_20");
        this.jointL2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_5").getChild("jointL1").getChild("tacle_20").getChild("jointL2");
        this.tacle_21 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_5").getChild("jointL1").getChild("tacle_20").getChild("jointL2").getChild("tacle_21");
        this.jointL3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_5").getChild("jointL1").getChild("tacle_20").getChild("jointL2").getChild("tacle_21").getChild("jointL3");
        this.tacle_22 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_5").getChild("jointL1").getChild("tacle_20").getChild("jointL2").getChild("tacle_21").getChild("jointL3").getChild("tacle_22");
        this.jointL4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_5").getChild("jointL1").getChild("tacle_20").getChild("jointL2").getChild("tacle_21").getChild("jointL3").getChild("tacle_22").getChild("jointL4");
        this.tacle_23 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_5").getChild("jointL1").getChild("tacle_20").getChild("jointL2").getChild("tacle_21").getChild("jointL3").getChild("tacle_22").getChild("jointL4").getChild("tacle_23");
        this.jointR1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_6").getChild("jointR1");
        this.tacle_24 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_6").getChild("jointR1").getChild("tacle_24");
        this.jointR2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_6").getChild("jointR1").getChild("tacle_24").getChild("jointR2");
        this.tacle_25 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_6").getChild("jointR1").getChild("tacle_24").getChild("jointR2").getChild("tacle_25");
        this.jointR3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_6").getChild("jointR1").getChild("tacle_24").getChild("jointR2").getChild("tacle_25").getChild("jointR3");
        this.tacle_26 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_6").getChild("jointR1").getChild("tacle_24").getChild("jointR2").getChild("tacle_25").getChild("jointR3").getChild("tacle_26");
        this.jointR4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_6").getChild("jointR1").getChild("tacle_24").getChild("jointR2").getChild("tacle_25").getChild("jointR3").getChild("tacle_26").getChild("jointR4");
        this.tacle_27 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_6").getChild("jointR1").getChild("tacle_24").getChild("jointR2").getChild("tacle_25").getChild("jointR3").getChild("tacle_26").getChild("jointR4").getChild("tacle_27");
        this.jointF1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_7").getChild("jointF1");
        this.tacle_28 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_7").getChild("jointF1").getChild("tacle_28");
        this.jointF2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_7").getChild("jointF1").getChild("tacle_28").getChild("jointF2");
        this.tacle_29 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_7").getChild("jointF1").getChild("tacle_28").getChild("jointF2").getChild("tacle_29");
        this.jointF3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_7").getChild("jointF1").getChild("tacle_28").getChild("jointF2").getChild("tacle_29").getChild("jointF3");
        this.tacle_30 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_7").getChild("jointF1").getChild("tacle_28").getChild("jointF2").getChild("tacle_29").getChild("jointF3").getChild("tacle_30");
        this.jointF4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_7").getChild("jointF1").getChild("tacle_28").getChild("jointF2").getChild("tacle_29").getChild("jointF3").getChild("tacle_30").getChild("jointF4");
        this.tacle_31 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("ten_center_1").getChild("JD_7").getChild("jointF1").getChild("tacle_28").getChild("jointF2").getChild("tacle_29").getChild("jointF3").getChild("tacle_30").getChild("jointF4").getChild("tacle_31");
        this.body11 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("body10").getChild("body11");
        this.body12 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("body10").getChild("body11").getChild("body12");
        this.body13 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("body10").getChild("body11").getChild("body12").getChild("body13");
        this.ten_center_2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("body10").getChild("body11").getChild("body12").getChild("body13").getChild("ten_center_2");
        this.core1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("body10").getChild("body11").getChild("body12").getChild("body13").getChild("core1");
        this.core2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("body10").getChild("body11").getChild("body12").getChild("body13").getChild("core1").getChild("core2");
        this.core5 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("body10").getChild("body11").getChild("body12").getChild("body13").getChild("core1").getChild("core5");
        this.core3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("body10").getChild("body11").getChild("body12").getChild("body13").getChild("core1").getChild("core2").getChild("core3");
        this.core4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("body10").getChild("body11").getChild("body12").getChild("body13").getChild("core1").getChild("core2").getChild("core3").getChild("core4");
        this.core6 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("body10").getChild("body11").getChild("body12").getChild("body13").getChild("core1").getChild("core5").getChild("core6");
        this.core7 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("body8").getChild("body9").getChild("body10").getChild("body11").getChild("body12").getChild("body13").getChild("core1").getChild("core5").getChild("core6").getChild("core7");
        this.rootmain = root.getChild("mainbody").getChild("root_center").getChild("rootmain");
        this.root = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root");
        this.root_1 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_1");
        this.root_2 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_2");
        this.root_3 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_3");
        this.root_4 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_4");
        this.root_5 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_5");
        this.root_6 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_6");
        this.root_7 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_7");
        this.root_8 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_8");
        this.root_9 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_9");
        this.root_10 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_10");
        this.root_11 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_11");
        this.root_12 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_12");
        this.root_13 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_13");
        this.root_14 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_14");
        this.root_15 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_15");
        this.root_16 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root").getChild("root_16");
        this.root_17 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_1").getChild("root_17");
        this.root_18 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_2").getChild("root_18");
        this.root_19 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_3").getChild("root_19");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-6.5f, -3.0f, -6.5f, 13, 5, 13), PartPose.offset(0.0f, 22.8f, 0.0f));
        PartDefinition root_center = mainbody.addOrReplaceChild("root_center", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 1.0f, 0.0f));
        PartDefinition rootmain = root_center.addOrReplaceChild("rootmain", CubeListBuilder.create().texOffs(206, 76).addBox(-3.5f, 0.0f, -3.5f, 7, 11, 7), PartPose.offset(0.0f, 1.0f, 0.0f));
        PartDefinition root_7 = rootmain.addOrReplaceChild("root_7", CubeListBuilder.create().texOffs(226, 2).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(3.3f, 4.4f, 0.0f, 0.59184116f, 1.6390387f, 0.0f));
        PartDefinition root_13 = rootmain.addOrReplaceChild("root_13", CubeListBuilder.create().texOffs(57, 3).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(-2.3f, 10.5f, 0.0f, 0.3642502f, -1.5025539f, 0.0f));
        PartDefinition root_4 = rootmain.addOrReplaceChild("root_4", CubeListBuilder.create().texOffs(127, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(0.0f, 8.5f, 3.3f, 0.5462881f, 0.0f, 0.0f));
        PartDefinition root_14 = rootmain.addOrReplaceChild("root_14", CubeListBuilder.create().texOffs(106, 17).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(0.0f, 10.5f, 2.3f, 0.31869712f, 0.0f, 0.0f));
        PartDefinition root_10 = rootmain.addOrReplaceChild("root_10", CubeListBuilder.create().texOffs(244, 9).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(-3.3f, 4.4f, 0.0f, 0.68294734f, -1.5025539f, 0.0f));
        PartDefinition root_9 = rootmain.addOrReplaceChild("root_9", CubeListBuilder.create().texOffs(244, 2).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(0.0f, 4.4f, 3.3f, 0.7285004f, 0.0f, 0.0f));
        PartDefinition root_11 = rootmain.addOrReplaceChild("root_11", CubeListBuilder.create().texOffs(156, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(0.0f, 8.5f, -3.3f, 0.5009095f, (float)Math.PI, 0.0f));
        PartDefinition root_8 = rootmain.addOrReplaceChild("root_8", CubeListBuilder.create().texOffs(152, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(3.3f, 8.5f, 0.0f, 0.5009095f, 1.6390387f, 0.0f));
        PartDefinition root_2 = rootmain.addOrReplaceChild("root_2", CubeListBuilder.create().texOffs(136, 34).addBox(-1.5f, 0.0f, -1.5f, 3, 4, 3), PartPose.offsetAndRotation(3.3f, 0.9f, 0.0f, 1.0927507f, 1.6390387f, 0.0f));
        PartDefinition root_18 = root_2.addOrReplaceChild("root_18", CubeListBuilder.create().texOffs(133, 55).addBox(-1.5f, 0.0f, -1.5f, 3, 6, 3), PartPose.offsetAndRotation(0.0f, 3.7f, 0.0f, -0.31869712f, 0.0f, 0.0f));
        PartDefinition root_3 = rootmain.addOrReplaceChild("root_3", CubeListBuilder.create().texOffs(87, 47).addBox(-1.5f, 0.0f, -1.5f, 3, 4, 3), PartPose.offsetAndRotation(-3.3f, 0.9f, 0.0f, 1.1838568f, -1.5025539f, 0.0f));
        PartDefinition root_19 = root_3.addOrReplaceChild("root_19", CubeListBuilder.create().texOffs(96, 62).addBox(-1.5f, 0.0f, -1.5f, 3, 6, 3), PartPose.offsetAndRotation(0.0f, 3.7f, 0.0f, -0.4553564f, 0.0f, 0.0f));
        PartDefinition root_6 = rootmain.addOrReplaceChild("root_6", CubeListBuilder.create().texOffs(160, 2).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(0.0f, 4.4f, -3.3f, 0.7285004f, (float)Math.PI, 0.0f));
        PartDefinition root_1 = rootmain.addOrReplaceChild("root_1", CubeListBuilder.create().texOffs(29, 18).addBox(-1.5f, 0.0f, -1.5f, 3, 4, 3), PartPose.offsetAndRotation(0.0f, 0.9f, -3.3f, 1.1838568f, (float)Math.PI, 0.0f));
        PartDefinition root_17 = root_1.addOrReplaceChild("root_17", CubeListBuilder.create().texOffs(158, 51).addBox(-1.5f, 0.0f, -1.5f, 3, 6, 3), PartPose.offsetAndRotation(0.0f, 3.7f, 0.0f, -0.3642502f, 0.0f, 0.0f));
        PartDefinition root_5 = rootmain.addOrReplaceChild("root_5", CubeListBuilder.create().texOffs(131, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(-3.3f, 8.5f, 0.0f, 0.5462881f, -1.5025539f, 0.0f));
        PartDefinition root_ = rootmain.addOrReplaceChild("root", CubeListBuilder.create().texOffs(142, 17).addBox(-1.5f, 0.0f, -1.5f, 3, 4, 3), PartPose.offsetAndRotation(0.0f, 0.9f, 3.3f, 1.2292354f, 0.0f, 0.0f));
        PartDefinition root_16 = root_.addOrReplaceChild("root_16", CubeListBuilder.create().texOffs(174, 50).addBox(-1.5f, 0.0f, -1.5f, 3, 6, 3), PartPose.offsetAndRotation(0.0f, 3.7f, 0.0f, -0.4553564f, 0.0f, 0.0f));
        PartDefinition root_12 = rootmain.addOrReplaceChild("root_12", CubeListBuilder.create().texOffs(199, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(0.0f, 10.5f, -2.3f, 0.3642502f, (float)Math.PI, 0.0f));
        PartDefinition root_15 = rootmain.addOrReplaceChild("root_15", CubeListBuilder.create().texOffs(127, 17).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(2.3f, 10.5f, 0.0f, 0.27314404f, 1.6390387f, 0.0f));
        PartDefinition body1 = mainbody.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(52, 0).addBox(-5.0f, -7.0f, -5.0f, 10, 8, 10), PartPose.offset(0.0f, -3.0f, 0.0f));
        PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(92, 0).addBox(-4.5f, -7.0f, -4.5f, 9, 8, 9), PartPose.offset(0.0f, -7.0f, 0.0f));
        PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(128, 0).addBox(-4.0f, -8.0f, -4.0f, 8, 9, 8), PartPose.offset(0.0f, -7.0f, 0.0f));
        PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(160, 0).addBox(-4.5f, -8.0f, -4.5f, 9, 8, 9), PartPose.offset(0.0f, -7.0f, 0.0f));
        PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(196, 0).addBox(-5.0f, -7.0f, -5.0f, 10, 7, 10), PartPose.offset(0.0f, -7.0f, 0.0f));
        PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(85, 17).addBox(-3.5f, -5.0f, -3.5f, 7, 6, 7), PartPose.offsetAndRotation(0.0f, -6.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(171, 37).addBox(-3.0f, -6.0f, -3.0f, 6, 7, 6), PartPose.offset(0.0f, -5.0f, 0.0f));
        PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(195, 37).addBox(-3.5f, -6.0f, -3.5f, 7, 6, 7), PartPose.offset(0.0f, -5.0f, 0.0f));
        PartDefinition body9 = body8.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(55, 39).addBox(-4.0f, -5.0f, -4.0f, 8, 5, 8), PartPose.offset(0.0f, -5.0f, 0.0f));
        PartDefinition ten_center_1 = body9.addOrReplaceChild("ten_center_1", CubeListBuilder.create().texOffs(198, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -4.1f, 0.0f));
        PartDefinition JD_6 = ten_center_1.addOrReplaceChild("JD_6", CubeListBuilder.create().texOffs(230, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-3.0f, 0.0f, -3.0f, 0.0f, -2.3561945f, 0.0f));
        PartDefinition jointR1 = JD_6.addOrReplaceChild("jointR1", CubeListBuilder.create().texOffs(46, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tacle_24 = jointR1.addOrReplaceChild("tacle_24", CubeListBuilder.create().texOffs(137, 51).addBox(-2.0f, -3.0f, -1.0f, 4, 6, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.87266463f, -1.5707964f));
        PartDefinition jointR2 = tacle_24.addOrReplaceChild("jointR2", CubeListBuilder.create().texOffs(50, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tacle_25 = jointR2.addOrReplaceChild("tacle_25", CubeListBuilder.create().texOffs(64, 52).addBox(-1.5f, -2.5f, -1.0f, 3, 5, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.19198622f, 0.0f));
        PartDefinition jointR3 = tacle_25.addOrReplaceChild("jointR3", CubeListBuilder.create().texOffs(54, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tacle_26 = jointR3.addOrReplaceChild("tacle_26", CubeListBuilder.create().texOffs(231, 50).addBox(-1.0f, -2.0f, -1.0f, 2, 4, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.19198622f, 0.0f));
        PartDefinition jointR4 = tacle_26.addOrReplaceChild("jointR4", CubeListBuilder.create().texOffs(82, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tacle_27 = jointR4.addOrReplaceChild("tacle_27", CubeListBuilder.create().texOffs(196, 52).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.19198622f, 0.0f));
        PartDefinition JD_4 = ten_center_1.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(202, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-3.0f, 0.0f, 3.0f, 0.0f, -0.7853982f, 0.0f));
        PartDefinition jointB1 = JD_4.addOrReplaceChild("jointB1", CubeListBuilder.create().texOffs(238, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tacle_16 = jointB1.addOrReplaceChild("tacle_16", CubeListBuilder.create().texOffs(91, 43).addBox(-2.0f, -3.0f, -1.0f, 4, 6, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.87266463f, -1.5707964f));
        PartDefinition jointB2 = tacle_16.addOrReplaceChild("jointB2", CubeListBuilder.create().texOffs(242, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tacle_17 = jointB2.addOrReplaceChild("tacle_17", CubeListBuilder.create().texOffs(211, 43).addBox(-1.5f, -2.5f, -1.0f, 3, 5, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.19198622f, 0.0f));
        PartDefinition jointB3 = tacle_17.addOrReplaceChild("jointB3", CubeListBuilder.create().texOffs(246, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tacle_18 = jointB3.addOrReplaceChild("tacle_18", CubeListBuilder.create().texOffs(126, 41).addBox(-1.0f, -2.0f, -1.0f, 2, 4, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.19198622f, 0.0f));
        PartDefinition jointB4 = tacle_18.addOrReplaceChild("jointB4", CubeListBuilder.create().texOffs(250, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tacle_19 = jointB4.addOrReplaceChild("tacle_19", CubeListBuilder.create().texOffs(232, 36).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.19198622f, 0.0f));
        PartDefinition JD_5 = ten_center_1.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(226, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(3.0f, 0.0f, 3.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition jointL1 = JD_5.addOrReplaceChild("jointL1", CubeListBuilder.create().texOffs(58, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tacle_20 = jointL1.addOrReplaceChild("tacle_20", CubeListBuilder.create().texOffs(30, 46).addBox(-2.0f, -3.0f, -1.0f, 4, 6, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.87266463f, 1.5707964f));
        PartDefinition jointL2 = tacle_20.addOrReplaceChild("jointL2", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tacle_21 = jointL2.addOrReplaceChild("tacle_21", CubeListBuilder.create().texOffs(0, 47).addBox(-1.5f, -2.5f, -1.0f, 3, 5, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.19198622f, 0.0f));
        PartDefinition jointL3 = tacle_21.addOrReplaceChild("jointL3", CubeListBuilder.create().texOffs(7, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tacle_22 = jointL3.addOrReplaceChild("tacle_22", CubeListBuilder.create().texOffs(160, 50).addBox(-1.0f, -2.0f, -1.0f, 2, 4, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.19198622f, 0.0f));
        PartDefinition jointL4 = tacle_22.addOrReplaceChild("jointL4", CubeListBuilder.create().texOffs(39, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tacle_23 = jointL4.addOrReplaceChild("tacle_23", CubeListBuilder.create().texOffs(184, 50).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.19198622f, 0.0f));
        PartDefinition JD_7 = ten_center_1.addOrReplaceChild("JD_7", CubeListBuilder.create().texOffs(234, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(3.0f, 0.0f, -3.0f, 0.0f, 2.3561945f, 0.0f));
        PartDefinition jointF1 = JD_7.addOrReplaceChild("jointF1", CubeListBuilder.create().texOffs(86, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tacle_28 = jointF1.addOrReplaceChild("tacle_28", CubeListBuilder.create().texOffs(112, 57).addBox(-2.0f, -3.0f, -1.0f, 4, 6, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.87266463f, 1.5707964f));
        PartDefinition jointF2 = tacle_28.addOrReplaceChild("jointF2", CubeListBuilder.create().texOffs(92, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tacle_29 = jointF2.addOrReplaceChild("tacle_29", CubeListBuilder.create().texOffs(207, 60).addBox(-1.5f, -2.5f, -1.0f, 3, 5, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.19198622f, 0.0f));
        PartDefinition jointF3 = tacle_29.addOrReplaceChild("jointF3", CubeListBuilder.create().texOffs(96, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tacle_30 = jointF3.addOrReplaceChild("tacle_30", CubeListBuilder.create().texOffs(82, 62).addBox(-1.0f, -2.0f, -1.0f, 2, 4, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.19198622f, 0.0f));
        PartDefinition jointF4 = tacle_30.addOrReplaceChild("jointF4", CubeListBuilder.create().texOffs(119, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tacle_31 = jointF4.addOrReplaceChild("tacle_31", CubeListBuilder.create().texOffs(18, 55).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.19198622f, 0.0f));
        PartDefinition body10 = body9.addOrReplaceChild("body10", CubeListBuilder.create().texOffs(23, 42).addBox(-2.5f, -6.0f, -2.5f, 5, 7, 5), PartPose.offsetAndRotation(0.0f, -5.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition body11 = body10.addOrReplaceChild("body11", CubeListBuilder.create().texOffs(180, 62).addBox(-2.0f, -7.0f, -2.0f, 4, 8, 4), PartPose.offset(0.0f, -6.0f, 0.0f));
        PartDefinition body12 = body11.addOrReplaceChild("body12", CubeListBuilder.create().texOffs(0, 63).addBox(-2.5f, -7.0f, -2.5f, 5, 7, 5), PartPose.offset(0.0f, -6.0f, 0.0f));
        PartDefinition body13 = body12.addOrReplaceChild("body13", CubeListBuilder.create().texOffs(34, 65).addBox(-3.0f, -6.0f, -3.0f, 6, 6, 6), PartPose.offset(0.0f, -6.0f, 0.0f));
        PartDefinition ten_center_2 = body13.addOrReplaceChild("ten_center_2", CubeListBuilder.create().texOffs(123, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -3.0f, 0.0f));
        PartDefinition core1 = body13.addOrReplaceChild("core1", CubeListBuilder.create().texOffs(47, 68).addBox(-5.5f, -3.0f, -5.5f, 11, 3, 11), PartPose.offsetAndRotation(0.0f, -8.5f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition core5 = core1.addOrReplaceChild("core5", CubeListBuilder.create().texOffs(166, 74).addBox(-5.0f, -3.0f, -5.0f, 10, 2, 10), PartPose.offsetAndRotation(0.0f, -1.5f, 0.0f, (float)(-Math.PI), 0.0f, 0.0f));
        PartDefinition core6 = core5.addOrReplaceChild("core6", CubeListBuilder.create().texOffs(82, 76).addBox(-4.5f, -3.0f, -4.5f, 9, 2, 9), PartPose.offset(0.0f, -1.0f, 0.0f));
        PartDefinition core7 = core6.addOrReplaceChild("core7", CubeListBuilder.create().texOffs(229, 70).addBox(-3.0f, -6.0f, -3.0f, 6, 5, 6), PartPose.offset(0.0f, -1.5f, 0.0f));
        PartDefinition core2 = core1.addOrReplaceChild("core2", CubeListBuilder.create().texOffs(136, 70).addBox(-5.0f, -3.0f, -5.0f, 10, 2, 10), PartPose.offset(0.0f, -1.5f, 0.0f));
        PartDefinition core3 = core2.addOrReplaceChild("core3", CubeListBuilder.create().texOffs(0, 75).addBox(-4.5f, -3.0f, -4.5f, 9, 2, 9), PartPose.offset(0.0f, -1.0f, 0.0f));
        PartDefinition core4 = core3.addOrReplaceChild("core4", CubeListBuilder.create().texOffs(112, 43).addBox(-3.0f, -3.0f, -3.0f, 6, 2, 6), PartPose.offset(0.0f, -1.5f, 0.0f));
        PartDefinition ten_center = body5.addOrReplaceChild("ten_center", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -4.1f, 0.0f));
        PartDefinition JD_1 = ten_center.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(3.0f, 0.0f, 3.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition jointBL1 = JD_1.addOrReplaceChild("jointBL1", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -2.0f, 0.0f));
        PartDefinition tacle_4 = jointBL1.addOrReplaceChild("tacle_4", CubeListBuilder.create().texOffs(183, 17).addBox(-2.0f, -4.5f, -1.0f, 4, 9, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.43633232f, 1.5707964f));
        PartDefinition jointBL2 = tacle_4.addOrReplaceChild("jointBL2", CubeListBuilder.create().texOffs(96, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tacle_5 = jointBL2.addOrReplaceChild("tacle_5", CubeListBuilder.create().texOffs(14, 18).addBox(-1.5f, -4.0f, -1.0f, 3, 8, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.19198622f, 0.0f));
        PartDefinition jointBL3 = tacle_5.addOrReplaceChild("jointBL3", CubeListBuilder.create().texOffs(119, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tacle_6 = jointBL3.addOrReplaceChild("tacle_6", CubeListBuilder.create().texOffs(38, 18).addBox(-1.0f, -3.5f, -1.0f, 2, 7, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.13962634f, 0.0f));
        PartDefinition decor_5 = tacle_6.addOrReplaceChild("decor_5", CubeListBuilder.create().texOffs(187, 0).addBox(0.0f, -2.0f, -2.4f, 1, 4, 5), PartPose.offset(0.2f, 0.0f, 3.0f));
        PartDefinition jointBL4 = tacle_6.addOrReplaceChild("jointBL4", CubeListBuilder.create().texOffs(123, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition tacle_7 = jointBL4.addOrReplaceChild("tacle_7", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5f, -3.0f, -1.0f, 1, 6, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.13962634f, 0.0f));
        PartDefinition decor_4 = tacle_5.addOrReplaceChild("decor_4", CubeListBuilder.create().texOffs(39, 2).addBox(0.0f, -2.5f, -1.0f, 1, 5, 5), PartPose.offset(0.7f, 0.0f, 3.0f));
        PartDefinition decor_3 = tacle_4.addOrReplaceChild("decor_3", CubeListBuilder.create().texOffs(0, 18).addBox(0.0f, -3.0f, 0.0f, 1, 6, 6), PartPose.offset(1.3f, 0.0f, 3.0f));
        PartDefinition JD_3 = ten_center.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(47, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(3.0f, 0.0f, -3.0f, 0.0f, 2.3561945f, 0.0f));
        PartDefinition jointFL1 = JD_3.addOrReplaceChild("jointFL1", CubeListBuilder.create().texOffs(160, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -2.0f, 0.0f));
        PartDefinition tacle_12 = jointFL1.addOrReplaceChild("tacle_12", CubeListBuilder.create().texOffs(140, 31).addBox(-2.0f, -4.5f, -1.0f, 4, 9, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.43633232f, 1.5707964f));
        PartDefinition jointFL2 = tacle_12.addOrReplaceChild("jointFL2", CubeListBuilder.create().texOffs(164, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tacle_13 = jointFL2.addOrReplaceChild("tacle_13", CubeListBuilder.create().texOffs(80, 30).addBox(-1.5f, -4.0f, -1.0f, 3, 8, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.19198622f, 0.0f));
        PartDefinition decor_10 = tacle_13.addOrReplaceChild("decor_10", CubeListBuilder.create().texOffs(33, 32).addBox(0.0f, -2.5f, -1.0f, 1, 5, 5), PartPose.offset(0.7f, 0.0f, 3.0f));
        PartDefinition jointFL3 = tacle_13.addOrReplaceChild("jointFL3", CubeListBuilder.create().texOffs(187, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tacle_14 = jointFL3.addOrReplaceChild("tacle_14", CubeListBuilder.create().texOffs(45, 32).addBox(-1.0f, -3.5f, -1.0f, 2, 7, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.13962634f, 0.0f));
        PartDefinition jointFL4 = tacle_14.addOrReplaceChild("jointFL4", CubeListBuilder.create().texOffs(194, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition tacle_15 = jointFL4.addOrReplaceChild("tacle_15", CubeListBuilder.create().texOffs(14, 35).addBox(-0.5f, -3.0f, -1.0f, 1, 6, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.13962634f, 0.0f));
        PartDefinition decor_11 = tacle_14.addOrReplaceChild("decor_11", CubeListBuilder.create().texOffs(124, 34).addBox(0.0f, -2.0f, -2.4f, 1, 4, 5), PartPose.offset(0.2f, 0.0f, 3.0f));
        PartDefinition decor_9 = tacle_12.addOrReplaceChild("decor_9", CubeListBuilder.create().texOffs(0, 30).addBox(0.0f, -3.0f, 0.0f, 1, 6, 6), PartPose.offset(1.3f, 0.0f, 3.0f));
        PartDefinition JD = ten_center.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-3.0f, 0.0f, 3.0f, 0.0f, -0.7853982f, 0.0f));
        PartDefinition jointBR1 = JD.addOrReplaceChild("jointBR1", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -2.0f, 0.0f));
        PartDefinition tacle = jointBR1.addOrReplaceChild("tacle", CubeListBuilder.create().texOffs(225, 6).addBox(-2.0f, -4.5f, -1.0f, 4, 9, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.43633232f, -1.5707964f));
        PartDefinition decor = tacle.addOrReplaceChild("decor", CubeListBuilder.create().texOffs(113, 17).addBox(0.0f, -3.0f, 0.0f, 1, 6, 6), PartPose.offset(-2.3f, 0.0f, 3.0f));
        PartDefinition jointBR2 = tacle.addOrReplaceChild("jointBR2", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tacle_1 = jointBR2.addOrReplaceChild("tacle_1", CubeListBuilder.create().texOffs(127, 17).addBox(-1.5f, -4.0f, -1.0f, 3, 8, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.19198622f, 0.0f));
        PartDefinition jointBR3 = tacle_1.addOrReplaceChild("jointBR3", CubeListBuilder.create().texOffs(82, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tacle_2 = jointBR3.addOrReplaceChild("tacle_2", CubeListBuilder.create().texOffs(151, 17).addBox(-1.0f, -3.5f, -1.0f, 2, 7, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.13962634f, 0.0f));
        PartDefinition jointBR4 = tacle_2.addOrReplaceChild("jointBR4", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition tacle_3 = jointBR4.addOrReplaceChild("tacle_3", CubeListBuilder.create().texOffs(169, 17).addBox(-0.5f, -3.0f, -1.0f, 1, 6, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.13962634f, 0.0f));
        PartDefinition decor_2 = tacle_2.addOrReplaceChild("decor_2", CubeListBuilder.create().texOffs(85, 0).addBox(0.0f, -2.0f, -2.4f, 1, 4, 5), PartPose.offset(-1.2f, 0.0f, 3.0f));
        PartDefinition decor_1 = tacle_1.addOrReplaceChild("decor_1", CubeListBuilder.create().texOffs(0, 2).addBox(0.0f, -2.5f, -1.0f, 1, 5, 5), PartPose.offset(-1.7f, 0.0f, 3.0f));
        PartDefinition JD_2 = ten_center.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(43, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-3.0f, 0.0f, -3.0f, 0.0f, -2.3561945f, 0.0f));
        PartDefinition jointFR1 = JD_2.addOrReplaceChild("jointFR1", CubeListBuilder.create().texOffs(127, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -2.0f, 0.0f));
        PartDefinition tacle_8 = jointFR1.addOrReplaceChild("tacle_8", CubeListBuilder.create().texOffs(59, 19).addBox(-2.0f, -4.5f, -1.0f, 4, 9, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.43633232f, -1.5707964f));
        PartDefinition jointFR2 = tacle_8.addOrReplaceChild("jointFR2", CubeListBuilder.create().texOffs(131, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tacle_9 = jointFR2.addOrReplaceChild("tacle_9", CubeListBuilder.create().texOffs(218, 26).addBox(-1.5f, -4.0f, -1.0f, 3, 8, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.19198622f, 0.0f));
        PartDefinition decor_7 = tacle_9.addOrReplaceChild("decor_7", CubeListBuilder.create().texOffs(242, 26).addBox(0.0f, -2.5f, -1.0f, 1, 5, 5), PartPose.offset(-1.7f, 0.0f, 3.0f));
        PartDefinition jointFR3 = tacle_9.addOrReplaceChild("jointFR3", CubeListBuilder.create().texOffs(152, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tacle_10 = jointFR3.addOrReplaceChild("tacle_10", CubeListBuilder.create().texOffs(106, 29).addBox(-1.0f, -3.5f, -1.0f, 2, 7, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.13962634f, 0.0f));
        PartDefinition decor_8 = tacle_10.addOrReplaceChild("decor_8", CubeListBuilder.create().texOffs(202, 17).addBox(0.0f, -2.0f, -2.4f, 1, 4, 5), PartPose.offset(-1.2f, 0.0f, 3.0f));
        PartDefinition jointFR4 = tacle_10.addOrReplaceChild("jointFR4", CubeListBuilder.create().texOffs(156, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition tacle_11 = jointFR4.addOrReplaceChild("tacle_11", CubeListBuilder.create().texOffs(163, 29).addBox(-0.5f, -3.0f, -1.0f, 1, 6, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.13962634f, 0.0f));
        PartDefinition decor_6 = tacle_8.addOrReplaceChild("decor_6", CubeListBuilder.create().texOffs(213, 20).addBox(0.0f, -3.0f, 0.0f, 1, 6, 6), PartPose.offset(-2.3f, 0.0f, 3.0f));
        return LayerDefinition.create(mesh, 256, 100);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityVenkrolSIII parasite = (EntityVenkrolSIII)entity;
        this.jointFL1.xRot = 0.0f;
        this.jointFL2.yRot = 0.0f;
        this.jointFL3.yRot = 0.0f;
        this.jointFL4.yRot = 0.0f;
        this.jointFR1.xRot = 0.0f;
        this.jointFR2.yRot = 0.0f;
        this.jointFR3.yRot = 0.0f;
        this.jointFR4.yRot = 0.0f;
        this.jointBL1.xRot = 0.0f;
        this.jointBL2.yRot = 0.0f;
        this.jointBL3.yRot = 0.0f;
        this.jointBL4.yRot = 0.0f;
        this.jointBR1.xRot = 0.0f;
        this.jointBR2.yRot = 0.0f;
        this.jointBR3.yRot = 0.0f;
        this.jointBR4.yRot = 0.0f;
        this.jointF1.xRot = 0.0f;
        this.jointF2.yRot = 0.0f;
        this.jointF3.yRot = 0.0f;
        this.jointF4.yRot = 0.0f;
        this.jointR1.xRot = 0.0f;
        this.jointR2.yRot = 0.0f;
        this.jointR3.yRot = 0.0f;
        this.jointR4.yRot = 0.0f;
        this.jointL1.xRot = 0.0f;
        this.jointL2.yRot = 0.0f;
        this.jointL3.yRot = 0.0f;
        this.jointL4.yRot = 0.0f;
        this.jointB1.xRot = 0.0f;
        this.jointB2.yRot = 0.0f;
        this.jointB3.yRot = 0.0f;
        this.jointB4.yRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            float f1 = -0.3f * Mth.sin((float)(ageInTicks * 0.051688f)) * 0.011f;
            float f2 = -0.6f * Mth.sin((float)(ageInTicks * 0.013515f)) * 0.011f;
            float f3 = 0.3f * Mth.sin((float)(ageInTicks * 0.1f)) * 0.1f;
            float j = parasite.getBODY();
            this.jointFL1.xRot = Math.min(j, 0.6f) + -1.0f * f3;
            this.jointFL2.yRot = -1.0f * Math.min(j, 0.5f);
            this.jointFL3.yRot = 0.0f + f3;
            this.jointFL4.yRot = 0.0f;
            this.jointFR1.xRot = Math.min(j, 0.6f) + f3;
            this.jointFR2.yRot = Math.min(j, 0.5f);
            this.jointFR3.yRot = 0.0f + f3;
            this.jointFR4.yRot = 0.0f;
            this.jointBL1.xRot = Math.min(j, 0.6f) + -1.0f * f3;
            this.jointBL2.yRot = -1.0f * Math.min(j, 0.5f);
            this.jointBL3.yRot = 0.0f + f3;
            this.jointBL4.yRot = 0.0f;
            this.jointBR1.xRot = Math.min(j, 0.6f) + f3;
            this.jointBR2.yRot = Math.min(j, 0.5f);
            this.jointBR3.yRot = 0.0f + f3;
            this.jointBR4.yRot = 0.0f;
            this.body1.xRot = f1;
            this.body2.xRot = f1;
            this.body3.xRot = f1;
            this.body4.xRot = f1;
            this.body5.xRot = f1;
            this.body1.zRot = f2;
            this.body2.zRot = f2;
            this.body3.zRot = f2;
            this.body4.zRot = f2;
            this.body5.zRot = f2;
            float f6 = 0.3f * Mth.sin((float)(ageInTicks * 0.1f)) * 0.1f;
            this.jointF1.xRot = Math.min(j, 0.5f) + -1.0f * f6;
            this.jointF2.yRot = -1.0f * Math.min(j, 0.3f);
            this.jointF3.yRot = 0.0f + f6;
            this.jointF4.yRot = 0.0f;
            this.jointR1.xRot = Math.min(j, 0.5f) + f6;
            this.jointR2.yRot = Math.min(j, 0.3f);
            this.jointR3.yRot = 0.0f + f6;
            this.jointR4.yRot = 0.0f;
            this.jointL1.xRot = Math.min(j, 0.5f) + -1.0f * f6;
            this.jointL2.yRot = -1.0f * Math.min(j, 0.3f);
            this.jointL3.yRot = 0.0f + f6;
            this.jointL4.yRot = 0.0f;
            this.jointB1.xRot = Math.min(j, 0.5f) + f6;
            this.jointB2.yRot = Math.min(j, 0.3f);
            this.jointB3.yRot = 0.0f + f6;
            this.jointB4.yRot = 0.0f;
        } else if (i >= 1) {
            float f1 = -0.3f * Mth.sin((float)(ageInTicks * 0.051688f)) * 0.0011f;
            float f2 = -0.6f * Mth.sin((float)(ageInTicks * 0.013515f)) * 0.0011f;
            float f3 = 0.3f * Mth.sin((float)(ageInTicks * 0.1f)) * 0.1f;
            float j = parasite.getBODY();
            this.jointFL1.xRot = Math.min(j, 0.6f) + -1.0f * f3;
            this.jointFL2.yRot = -1.0f * Math.min(j, 0.5f);
            this.jointFL3.yRot = 0.0f + f3;
            this.jointFL4.yRot = 0.0f;
            this.jointFR1.xRot = Math.min(j, 0.6f) + f3;
            this.jointFR2.yRot = Math.min(j, 0.5f);
            this.jointFR3.yRot = 0.0f + f3;
            this.jointFR4.yRot = 0.0f;
            this.jointBL1.xRot = Math.min(j, 0.6f) + -1.0f * f3;
            this.jointBL2.yRot = -1.0f * Math.min(j, 0.5f);
            this.jointBL3.yRot = 0.0f + f3;
            this.jointBL4.yRot = 0.0f;
            this.jointBR1.xRot = Math.min(j, 0.6f) + f3;
            this.jointBR2.yRot = Math.min(j, 0.5f);
            this.jointBR3.yRot = 0.0f + f3;
            this.jointBR4.yRot = 0.0f;
            this.body1.xRot = f1;
            this.body2.xRot = f1;
            this.body3.xRot = f1;
            this.body4.xRot = f1;
            this.body5.xRot = f1;
            this.body1.zRot = f2;
            this.body2.zRot = f2;
            this.body3.zRot = f2;
            this.body4.zRot = f2;
            this.body5.zRot = f2;
            float f6 = 0.3f * Mth.sin((float)(ageInTicks * 0.1f)) * 0.1f;
            this.jointF1.xRot = Math.min(j, 0.5f) + -1.0f * f6;
            this.jointF2.yRot = -1.0f * Math.min(j, 0.3f);
            this.jointF3.yRot = 0.0f + f6;
            this.jointF4.yRot = 0.0f;
            this.jointR1.xRot = Math.min(j, 0.5f) + f6;
            this.jointR2.yRot = Math.min(j, 0.3f);
            this.jointR3.yRot = 0.0f + f6;
            this.jointR4.yRot = 0.0f;
            this.jointL1.xRot = Math.min(j, 0.5f) + -1.0f * f6;
            this.jointL2.yRot = -1.0f * Math.min(j, 0.3f);
            this.jointL3.yRot = 0.0f + f6;
            this.jointL4.yRot = 0.0f;
            this.jointB1.xRot = Math.min(j, 0.5f) + f6;
            this.jointB2.yRot = Math.min(j, 0.3f);
            this.jointB3.yRot = 0.0f + f6;
            this.jointB4.yRot = 0.0f;
        }
    
    }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    private void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    private void swingX(ModelPart modelRenderer, float speed, float degree, int invert, float limbSwing, float limbSwingAmount) {
        modelRenderer.xRot = (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed) * (double)limbSwingAmount);
    }

    private void swingX(ModelPart modelRenderer, float speed, float degree, int invert, float offset, float weight, float limbSwing, float limbSwingAmount) {
        modelRenderer.xRot = (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed + offset) + (double)(weight * limbSwingAmount));
    }

    private void swingX(float pref, ModelPart modelRenderer, float speed, float degree, int invert, float limbSwing, float limbSwingAmount) {
        modelRenderer.xRot = pref + (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed) * (double)limbSwingAmount);
    }

    private void swingY(ModelPart modelRenderer, float speed, float degree, int invert, float limbSwing, float limbSwingAmount) {
        modelRenderer.yRot = (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed) * (double)limbSwingAmount);
    }

    private void swingY(ModelPart modelRenderer, float speed, float degree, int invert, float offset, float weight, float limbSwing, float limbSwingAmount) {
        modelRenderer.yRot = (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed + offset) + (double)(weight * limbSwingAmount));
    }

    private void swingY(float pref, ModelPart modelRenderer, float speed, float degree, int invert, float limbSwing, float limbSwingAmount) {
        modelRenderer.yRot = pref + (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed) * (double)limbSwingAmount);
    }

    private void swingZ(ModelPart modelRenderer, float speed, float degree, int invert, float limbSwing, float limbSwingAmount) {
        modelRenderer.zRot = (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed) * (double)limbSwingAmount);
    }

    private void swingZ(ModelPart modelRenderer, float speed, float degree, int invert, float offset, float weight, float limbSwing, float limbSwingAmount) {
        modelRenderer.zRot = (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed + offset) + (double)(weight * limbSwingAmount));
    }

    private void swingZ(float pref, ModelPart modelRenderer, float speed, float degree, int invert, float limbSwing, float limbSwingAmount) {
        modelRenderer.zRot = pref + (float)((double)((float)invert * limbSwingAmount * degree) * Math.cos(limbSwing * speed) * (double)limbSwingAmount);
    }

    private void moveY(ModelPart modelRenderer, float speed, int invert, float f, float f1, float distance) {
        modelRenderer.y = (float)invert * Mth.cos(f * speed) * f1 * distance;
    }

    private void underground(com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase parasite, float ageInTicks, ModelPart mainbody) {
    }

}
