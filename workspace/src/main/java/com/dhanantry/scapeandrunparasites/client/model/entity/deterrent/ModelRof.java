package com.dhanantry.scapeandrunparasites.client.model.entity.deterrent;

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
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.EntityRof;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelRof extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "rof"), "main");
    private final ModelPart mainbody;
    private final ModelPart b;
    private final ModelPart jointN;
    private final ModelPart b_1;
    private final ModelPart nten;
    private final ModelPart jointN_1;
    private final ModelPart jd;
    private final ModelPart jd_1;
    private final ModelPart jd_2;
    private final ModelPart jd_3;
    private final ModelPart jd_4;
    private final ModelPart jd_5;
    private final ModelPart jd_6;
    private final ModelPart jd_7;
    private final ModelPart n;
    private final ModelPart jointN_2;
    private final ModelPart bhhhhhh;
    private final ModelPart jd_8;
    private final ModelPart jd_9;
    private final ModelPart jd_10;
    private final ModelPart jd_11;
    private final ModelPart b_2;
    private final ModelPart b_3;
    private final ModelPart b_4;
    private final ModelPart b_5;
    private final ModelPart jointMA;
    private final ModelPart m;
    private final ModelPart jointMA_1;
    private final ModelPart m_1;
    private final ModelPart jointMA_2;
    private final ModelPart m_2;
    private final ModelPart jointMB;
    private final ModelPart m_3;
    private final ModelPart jointMB_1;
    private final ModelPart m_4;
    private final ModelPart jointMB_2;
    private final ModelPart m_5;
    private final ModelPart jointMC;
    private final ModelPart m_6;
    private final ModelPart jointMC_1;
    private final ModelPart m_7;
    private final ModelPart jointMC_2;
    private final ModelPart m_8;
    private final ModelPart jointMD;
    private final ModelPart m_9;
    private final ModelPart jointMD_1;
    private final ModelPart m_10;
    private final ModelPart jointMD_2;
    private final ModelPart m_11;
    private final ModelPart taclejointA;
    private final ModelPart d;
    private final ModelPart tentacle;
    private final ModelPart taclejointA_1;
    private final ModelPart tentacle_1;
    private final ModelPart taclejointA_2;
    private final ModelPart tentacle_2;
    private final ModelPart taclejointA_3;
    private final ModelPart tentacle_3;
    private final ModelPart taclejointB;
    private final ModelPart d_1;
    private final ModelPart tentacle_4;
    private final ModelPart taclejointB_1;
    private final ModelPart tentacle_5;
    private final ModelPart taclejointB_2;
    private final ModelPart tentacle_6;
    private final ModelPart taclejointB_3;
    private final ModelPart tentacle_7;
    private final ModelPart taclejointC;
    private final ModelPart d_2;
    private final ModelPart tentacle_8;
    private final ModelPart taclejointC_1;
    private final ModelPart tentacle_9;
    private final ModelPart taclejointC_2;
    private final ModelPart tentacle_10;
    private final ModelPart taclejointC_3;
    private final ModelPart tentacle_11;
    private final ModelPart taclejointD;
    private final ModelPart d_3;
    private final ModelPart tentacle_12;
    private final ModelPart taclejointD_1;
    private final ModelPart tentacle_13;
    private final ModelPart taclejointD_2;
    private final ModelPart tentacle_14;
    private final ModelPart taclejointD_3;
    private final ModelPart tentacle_15;
    private final ModelPart taclejointE;
    private final ModelPart d_4;
    private final ModelPart tentacle_16;
    private final ModelPart taclejointE_1;
    private final ModelPart tentacle_17;
    private final ModelPart taclejointE_2;
    private final ModelPart tentacle_18;
    private final ModelPart taclejointE_3;
    private final ModelPart tentacle_19;
    private final ModelPart taclejointF;
    private final ModelPart d_5;
    private final ModelPart tentacle_20;
    private final ModelPart taclejointF_1;
    private final ModelPart tentacle_21;
    private final ModelPart taclejointF_2;
    private final ModelPart tentacle_22;
    private final ModelPart taclejointF_3;
    private final ModelPart tentacle_23;
    private final ModelPart taclejointG;
    private final ModelPart d_6;
    private final ModelPart tentacle_24;
    private final ModelPart taclejointG_1;
    private final ModelPart tentacle_25;
    private final ModelPart taclejointG_2;
    private final ModelPart tentacle_26;
    private final ModelPart taclejointG_3;
    private final ModelPart tentacle_27;
    private final ModelPart taclejointH;
    private final ModelPart d_7;
    private final ModelPart tentacle_28;
    private final ModelPart taclejointH_1;
    private final ModelPart tentacle_29;
    private final ModelPart taclejointH_2;
    private final ModelPart tentacle_30;
    private final ModelPart taclejointH_3;
    private final ModelPart tentacle_31;

    public ModelRof(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.b = root.getChild("mainbody").getChild("b");
        this.jointN = root.getChild("mainbody").getChild("b").getChild("jointN");
        this.b_1 = root.getChild("mainbody").getChild("b").getChild("b_1");
        this.nten = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten");
        this.jointN_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1");
        this.jd = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd");
        this.jd_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_1");
        this.jd_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_2");
        this.jd_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_3");
        this.jd_4 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_4");
        this.jd_5 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_5");
        this.jd_6 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_6");
        this.jd_7 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_7");
        this.n = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n");
        this.jointN_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2");
        this.bhhhhhh = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh");
        this.jd_8 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_8");
        this.jd_9 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_9");
        this.jd_10 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_10");
        this.jd_11 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_11");
        this.b_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("b_2");
        this.b_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("b_3");
        this.b_4 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("b_4");
        this.b_5 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("b_5");
        this.jointMA = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_8").getChild("jointMA");
        this.m = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_8").getChild("jointMA").getChild("m");
        this.jointMA_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_8").getChild("jointMA").getChild("m").getChild("jointMA_1");
        this.m_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_8").getChild("jointMA").getChild("m").getChild("jointMA_1").getChild("m_1");
        this.jointMA_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_8").getChild("jointMA").getChild("m").getChild("jointMA_1").getChild("m_1").getChild("jointMA_2");
        this.m_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_8").getChild("jointMA").getChild("m").getChild("jointMA_1").getChild("m_1").getChild("jointMA_2").getChild("m_2");
        this.jointMB = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_9").getChild("jointMB");
        this.m_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_9").getChild("jointMB").getChild("m_3");
        this.jointMB_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_9").getChild("jointMB").getChild("m_3").getChild("jointMB_1");
        this.m_4 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_9").getChild("jointMB").getChild("m_3").getChild("jointMB_1").getChild("m_4");
        this.jointMB_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_9").getChild("jointMB").getChild("m_3").getChild("jointMB_1").getChild("m_4").getChild("jointMB_2");
        this.m_5 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_9").getChild("jointMB").getChild("m_3").getChild("jointMB_1").getChild("m_4").getChild("jointMB_2").getChild("m_5");
        this.jointMC = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_10").getChild("jointMC");
        this.m_6 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_10").getChild("jointMC").getChild("m_6");
        this.jointMC_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_10").getChild("jointMC").getChild("m_6").getChild("jointMC_1");
        this.m_7 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_10").getChild("jointMC").getChild("m_6").getChild("jointMC_1").getChild("m_7");
        this.jointMC_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_10").getChild("jointMC").getChild("m_6").getChild("jointMC_1").getChild("m_7").getChild("jointMC_2");
        this.m_8 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_10").getChild("jointMC").getChild("m_6").getChild("jointMC_1").getChild("m_7").getChild("jointMC_2").getChild("m_8");
        this.jointMD = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_11").getChild("jointMD");
        this.m_9 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_11").getChild("jointMD").getChild("m_9");
        this.jointMD_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_11").getChild("jointMD").getChild("m_9").getChild("jointMD_1");
        this.m_10 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_11").getChild("jointMD").getChild("m_9").getChild("jointMD_1").getChild("m_10");
        this.jointMD_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_11").getChild("jointMD").getChild("m_9").getChild("jointMD_1").getChild("m_10").getChild("jointMD_2");
        this.m_11 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jointN_1").getChild("n").getChild("jointN_2").getChild("bhhhhhh").getChild("jd_11").getChild("jointMD").getChild("m_9").getChild("jointMD_1").getChild("m_10").getChild("jointMD_2").getChild("m_11");
        this.taclejointA = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd").getChild("taclejointA");
        this.d = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd").getChild("d");
        this.tentacle = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd").getChild("taclejointA").getChild("tentacle");
        this.taclejointA_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd").getChild("taclejointA").getChild("tentacle").getChild("taclejointA_1");
        this.tentacle_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd").getChild("taclejointA").getChild("tentacle").getChild("taclejointA_1").getChild("tentacle_1");
        this.taclejointA_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd").getChild("taclejointA").getChild("tentacle").getChild("taclejointA_1").getChild("tentacle_1").getChild("taclejointA_2");
        this.tentacle_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd").getChild("taclejointA").getChild("tentacle").getChild("taclejointA_1").getChild("tentacle_1").getChild("taclejointA_2").getChild("tentacle_2");
        this.taclejointA_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd").getChild("taclejointA").getChild("tentacle").getChild("taclejointA_1").getChild("tentacle_1").getChild("taclejointA_2").getChild("tentacle_2").getChild("taclejointA_3");
        this.tentacle_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd").getChild("taclejointA").getChild("tentacle").getChild("taclejointA_1").getChild("tentacle_1").getChild("taclejointA_2").getChild("tentacle_2").getChild("taclejointA_3").getChild("tentacle_3");
        this.taclejointB = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_1").getChild("taclejointB");
        this.d_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_1").getChild("d_1");
        this.tentacle_4 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_1").getChild("taclejointB").getChild("tentacle_4");
        this.taclejointB_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_1").getChild("taclejointB").getChild("tentacle_4").getChild("taclejointB_1");
        this.tentacle_5 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_1").getChild("taclejointB").getChild("tentacle_4").getChild("taclejointB_1").getChild("tentacle_5");
        this.taclejointB_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_1").getChild("taclejointB").getChild("tentacle_4").getChild("taclejointB_1").getChild("tentacle_5").getChild("taclejointB_2");
        this.tentacle_6 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_1").getChild("taclejointB").getChild("tentacle_4").getChild("taclejointB_1").getChild("tentacle_5").getChild("taclejointB_2").getChild("tentacle_6");
        this.taclejointB_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_1").getChild("taclejointB").getChild("tentacle_4").getChild("taclejointB_1").getChild("tentacle_5").getChild("taclejointB_2").getChild("tentacle_6").getChild("taclejointB_3");
        this.tentacle_7 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_1").getChild("taclejointB").getChild("tentacle_4").getChild("taclejointB_1").getChild("tentacle_5").getChild("taclejointB_2").getChild("tentacle_6").getChild("taclejointB_3").getChild("tentacle_7");
        this.taclejointC = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_2").getChild("taclejointC");
        this.d_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_2").getChild("d_2");
        this.tentacle_8 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_2").getChild("taclejointC").getChild("tentacle_8");
        this.taclejointC_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_2").getChild("taclejointC").getChild("tentacle_8").getChild("taclejointC_1");
        this.tentacle_9 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_2").getChild("taclejointC").getChild("tentacle_8").getChild("taclejointC_1").getChild("tentacle_9");
        this.taclejointC_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_2").getChild("taclejointC").getChild("tentacle_8").getChild("taclejointC_1").getChild("tentacle_9").getChild("taclejointC_2");
        this.tentacle_10 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_2").getChild("taclejointC").getChild("tentacle_8").getChild("taclejointC_1").getChild("tentacle_9").getChild("taclejointC_2").getChild("tentacle_10");
        this.taclejointC_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_2").getChild("taclejointC").getChild("tentacle_8").getChild("taclejointC_1").getChild("tentacle_9").getChild("taclejointC_2").getChild("tentacle_10").getChild("taclejointC_3");
        this.tentacle_11 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_2").getChild("taclejointC").getChild("tentacle_8").getChild("taclejointC_1").getChild("tentacle_9").getChild("taclejointC_2").getChild("tentacle_10").getChild("taclejointC_3").getChild("tentacle_11");
        this.taclejointD = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_3").getChild("taclejointD");
        this.d_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_3").getChild("d_3");
        this.tentacle_12 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_3").getChild("taclejointD").getChild("tentacle_12");
        this.taclejointD_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_3").getChild("taclejointD").getChild("tentacle_12").getChild("taclejointD_1");
        this.tentacle_13 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_3").getChild("taclejointD").getChild("tentacle_12").getChild("taclejointD_1").getChild("tentacle_13");
        this.taclejointD_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_3").getChild("taclejointD").getChild("tentacle_12").getChild("taclejointD_1").getChild("tentacle_13").getChild("taclejointD_2");
        this.tentacle_14 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_3").getChild("taclejointD").getChild("tentacle_12").getChild("taclejointD_1").getChild("tentacle_13").getChild("taclejointD_2").getChild("tentacle_14");
        this.taclejointD_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_3").getChild("taclejointD").getChild("tentacle_12").getChild("taclejointD_1").getChild("tentacle_13").getChild("taclejointD_2").getChild("tentacle_14").getChild("taclejointD_3");
        this.tentacle_15 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_3").getChild("taclejointD").getChild("tentacle_12").getChild("taclejointD_1").getChild("tentacle_13").getChild("taclejointD_2").getChild("tentacle_14").getChild("taclejointD_3").getChild("tentacle_15");
        this.taclejointE = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_4").getChild("taclejointE");
        this.d_4 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_4").getChild("d_4");
        this.tentacle_16 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_4").getChild("taclejointE").getChild("tentacle_16");
        this.taclejointE_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_4").getChild("taclejointE").getChild("tentacle_16").getChild("taclejointE_1");
        this.tentacle_17 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_4").getChild("taclejointE").getChild("tentacle_16").getChild("taclejointE_1").getChild("tentacle_17");
        this.taclejointE_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_4").getChild("taclejointE").getChild("tentacle_16").getChild("taclejointE_1").getChild("tentacle_17").getChild("taclejointE_2");
        this.tentacle_18 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_4").getChild("taclejointE").getChild("tentacle_16").getChild("taclejointE_1").getChild("tentacle_17").getChild("taclejointE_2").getChild("tentacle_18");
        this.taclejointE_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_4").getChild("taclejointE").getChild("tentacle_16").getChild("taclejointE_1").getChild("tentacle_17").getChild("taclejointE_2").getChild("tentacle_18").getChild("taclejointE_3");
        this.tentacle_19 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_4").getChild("taclejointE").getChild("tentacle_16").getChild("taclejointE_1").getChild("tentacle_17").getChild("taclejointE_2").getChild("tentacle_18").getChild("taclejointE_3").getChild("tentacle_19");
        this.taclejointF = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_5").getChild("taclejointF");
        this.d_5 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_5").getChild("d_5");
        this.tentacle_20 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_5").getChild("taclejointF").getChild("tentacle_20");
        this.taclejointF_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_5").getChild("taclejointF").getChild("tentacle_20").getChild("taclejointF_1");
        this.tentacle_21 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_5").getChild("taclejointF").getChild("tentacle_20").getChild("taclejointF_1").getChild("tentacle_21");
        this.taclejointF_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_5").getChild("taclejointF").getChild("tentacle_20").getChild("taclejointF_1").getChild("tentacle_21").getChild("taclejointF_2");
        this.tentacle_22 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_5").getChild("taclejointF").getChild("tentacle_20").getChild("taclejointF_1").getChild("tentacle_21").getChild("taclejointF_2").getChild("tentacle_22");
        this.taclejointF_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_5").getChild("taclejointF").getChild("tentacle_20").getChild("taclejointF_1").getChild("tentacle_21").getChild("taclejointF_2").getChild("tentacle_22").getChild("taclejointF_3");
        this.tentacle_23 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_5").getChild("taclejointF").getChild("tentacle_20").getChild("taclejointF_1").getChild("tentacle_21").getChild("taclejointF_2").getChild("tentacle_22").getChild("taclejointF_3").getChild("tentacle_23");
        this.taclejointG = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_6").getChild("taclejointG");
        this.d_6 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_6").getChild("d_6");
        this.tentacle_24 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_6").getChild("taclejointG").getChild("tentacle_24");
        this.taclejointG_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_6").getChild("taclejointG").getChild("tentacle_24").getChild("taclejointG_1");
        this.tentacle_25 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_6").getChild("taclejointG").getChild("tentacle_24").getChild("taclejointG_1").getChild("tentacle_25");
        this.taclejointG_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_6").getChild("taclejointG").getChild("tentacle_24").getChild("taclejointG_1").getChild("tentacle_25").getChild("taclejointG_2");
        this.tentacle_26 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_6").getChild("taclejointG").getChild("tentacle_24").getChild("taclejointG_1").getChild("tentacle_25").getChild("taclejointG_2").getChild("tentacle_26");
        this.taclejointG_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_6").getChild("taclejointG").getChild("tentacle_24").getChild("taclejointG_1").getChild("tentacle_25").getChild("taclejointG_2").getChild("tentacle_26").getChild("taclejointG_3");
        this.tentacle_27 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_6").getChild("taclejointG").getChild("tentacle_24").getChild("taclejointG_1").getChild("tentacle_25").getChild("taclejointG_2").getChild("tentacle_26").getChild("taclejointG_3").getChild("tentacle_27");
        this.taclejointH = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_7").getChild("taclejointH");
        this.d_7 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_7").getChild("d_7");
        this.tentacle_28 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_7").getChild("taclejointH").getChild("tentacle_28");
        this.taclejointH_1 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_7").getChild("taclejointH").getChild("tentacle_28").getChild("taclejointH_1");
        this.tentacle_29 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_7").getChild("taclejointH").getChild("tentacle_28").getChild("taclejointH_1").getChild("tentacle_29");
        this.taclejointH_2 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_7").getChild("taclejointH").getChild("tentacle_28").getChild("taclejointH_1").getChild("tentacle_29").getChild("taclejointH_2");
        this.tentacle_30 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_7").getChild("taclejointH").getChild("tentacle_28").getChild("taclejointH_1").getChild("tentacle_29").getChild("taclejointH_2").getChild("tentacle_30");
        this.taclejointH_3 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_7").getChild("taclejointH").getChild("tentacle_28").getChild("taclejointH_1").getChild("tentacle_29").getChild("taclejointH_2").getChild("tentacle_30").getChild("taclejointH_3");
        this.tentacle_31 = root.getChild("mainbody").getChild("b").getChild("jointN").getChild("nten").getChild("jd_7").getChild("taclejointH").getChild("tentacle_28").getChild("taclejointH_1").getChild("tentacle_29").getChild("taclejointH_2").getChild("tentacle_30").getChild("taclejointH_3").getChild("tentacle_31");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 21.0f, 0.0f));
        PartDefinition b = mainbody.addOrReplaceChild("b", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0f, 0.0f, -12.0f, 24, 20, 24), PartPose.offset(0.0f, -15.0f, 0.0f));
        PartDefinition b_1 = b.addOrReplaceChild("b_1", CubeListBuilder.create().texOffs(96, 0).addBox(-12.0f, -2.0f, -12.0f, 24, 45, 24), PartPose.offsetAndRotation(0.0f, -5.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition jointN = b.addOrReplaceChild("jointN", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition nten = jointN.addOrReplaceChild("nten", CubeListBuilder.create().texOffs(0, 69).addBox(-17.0f, -15.0f, -17.0f, 34, 25, 34), PartPose.offsetAndRotation(0.0f, -6.0f, 0.0f, 0.0f, -0.7853982f, 0.0f));
        PartDefinition jd_4 = nten.addOrReplaceChild("jd_4", CubeListBuilder.create().texOffs(76, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(16.3f, -7.2f, 16.6f, -1.5707964f, -0.69115037f, 0.0f));
        PartDefinition d_4 = jd_4.addOrReplaceChild("d_4", CubeListBuilder.create().texOffs(72, 14).addBox(-4.0f, -2.0f, -3.5f, 6, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, 0.82030475f, 0.0f));
        PartDefinition taclejointE = jd_4.addOrReplaceChild("taclejointE", CubeListBuilder.create().texOffs(210, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, 0.0f, 0.0f));
        PartDefinition tentacle_16 = taclejointE.addOrReplaceChild("tentacle_16", CubeListBuilder.create().texOffs(118, 195).addBox(-3.0f, -1.0f, -1.0f, 4, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.829105f, 0.0f));
        PartDefinition taclejointE_1 = tentacle_16.addOrReplaceChild("taclejointE_1", CubeListBuilder.create().texOffs(214, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_17 = taclejointE_1.addOrReplaceChild("tentacle_17", CubeListBuilder.create().texOffs(138, 197).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.56548667f, 0.0f));
        PartDefinition taclejointE_2 = tentacle_17.addOrReplaceChild("taclejointE_2", CubeListBuilder.create().texOffs(218, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_18 = taclejointE_2.addOrReplaceChild("tentacle_18", CubeListBuilder.create().texOffs(0, 198).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.37699112f, 0.0f));
        PartDefinition taclejointE_3 = tentacle_18.addOrReplaceChild("taclejointE_3", CubeListBuilder.create().texOffs(222, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_19 = taclejointE_3.addOrReplaceChild("tentacle_19", CubeListBuilder.create().texOffs(14, 198).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.37699112f, 0.0f));
        PartDefinition jd_6 = nten.addOrReplaceChild("jd_6", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-16.7f, 4.8f, 14.6f, -1.5707964f, -2.7017696f, 0.0f));
        PartDefinition d_6 = jd_6.addOrReplaceChild("d_6", CubeListBuilder.create().texOffs(233, 42).addBox(-4.0f, -2.0f, -3.5f, 6, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, 0.82030475f, 0.0f));
        PartDefinition taclejointG = jd_6.addOrReplaceChild("taclejointG", CubeListBuilder.create().texOffs(229, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, 0.0f, 0.0f));
        PartDefinition tentacle_24 = taclejointG.addOrReplaceChild("tentacle_24", CubeListBuilder.create().texOffs(32, 210).addBox(-3.0f, -1.0f, -1.0f, 4, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.829105f, 0.0f));
        PartDefinition taclejointG_1 = tentacle_24.addOrReplaceChild("taclejointG_1", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_25 = taclejointG_1.addOrReplaceChild("tentacle_25", CubeListBuilder.create().texOffs(52, 212).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.56548667f, 0.0f));
        PartDefinition taclejointG_2 = tentacle_25.addOrReplaceChild("taclejointG_2", CubeListBuilder.create().texOffs(17, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_26 = taclejointG_2.addOrReplaceChild("tentacle_26", CubeListBuilder.create().texOffs(122, 209).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.37699112f, 0.0f));
        PartDefinition taclejointG_3 = tentacle_26.addOrReplaceChild("taclejointG_3", CubeListBuilder.create().texOffs(72, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_27 = taclejointG_3.addOrReplaceChild("tentacle_27", CubeListBuilder.create().texOffs(136, 212).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.37699112f, 0.0f));
        PartDefinition jd_1 = nten.addOrReplaceChild("jd_1", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(6.3f, 0.8f, -16.4f, -1.5707964f, 1.0681415f, 0.0f));
        PartDefinition d_1 = jd_1.addOrReplaceChild("d_1", CubeListBuilder.create().texOffs(0, 2).addBox(-4.0f, -2.0f, -3.5f, 6, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, 0.82030475f, 0.0f));
        PartDefinition taclejointB = jd_1.addOrReplaceChild("taclejointB", CubeListBuilder.create().texOffs(229, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, 0.0f, 0.0f));
        PartDefinition tentacle_4 = taclejointB.addOrReplaceChild("tentacle_4", CubeListBuilder.create().texOffs(102, 69).addBox(-3.0f, -1.0f, -1.0f, 4, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.829105f, 0.0f));
        PartDefinition taclejointB_1 = tentacle_4.addOrReplaceChild("taclejointB_1", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_5 = taclejointB_1.addOrReplaceChild("tentacle_5", CubeListBuilder.create().texOffs(122, 71).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.56548667f, 0.0f));
        PartDefinition taclejointB_2 = tentacle_5.addOrReplaceChild("taclejointB_2", CubeListBuilder.create().texOffs(17, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_6 = taclejointB_2.addOrReplaceChild("tentacle_6", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.37699112f, 0.0f));
        PartDefinition taclejointB_3 = tentacle_6.addOrReplaceChild("taclejointB_3", CubeListBuilder.create().texOffs(72, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_7 = taclejointB_3.addOrReplaceChild("tentacle_7", CubeListBuilder.create().texOffs(102, 83).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.37699112f, 0.0f));
        PartDefinition jd_3 = nten.addOrReplaceChild("jd_3", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(16.3f, 6.8f, 0.6f, -1.5707964f, 0.06283186f, 0.0f));
        PartDefinition taclejointD = jd_3.addOrReplaceChild("taclejointD", CubeListBuilder.create().texOffs(180, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, 0.0f, 0.0f));
        PartDefinition tentacle_12 = taclejointD.addOrReplaceChild("tentacle_12", CubeListBuilder.create().texOffs(222, 151).addBox(-3.0f, -1.0f, -1.0f, 4, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.829105f, 0.0f));
        PartDefinition taclejointD_1 = tentacle_12.addOrReplaceChild("taclejointD_1", CubeListBuilder.create().texOffs(198, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_13 = taclejointD_1.addOrReplaceChild("tentacle_13", CubeListBuilder.create().texOffs(222, 165).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.56548667f, 0.0f));
        PartDefinition taclejointD_2 = tentacle_13.addOrReplaceChild("taclejointD_2", CubeListBuilder.create().texOffs(202, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_14 = taclejointD_2.addOrReplaceChild("tentacle_14", CubeListBuilder.create().texOffs(158, 183).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.37699112f, 0.0f));
        PartDefinition taclejointD_3 = tentacle_14.addOrReplaceChild("taclejointD_3", CubeListBuilder.create().texOffs(206, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_15 = taclejointD_3.addOrReplaceChild("tentacle_15", CubeListBuilder.create().texOffs(172, 187).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.37699112f, 0.0f));
        PartDefinition d_3 = jd_3.addOrReplaceChild("d_3", CubeListBuilder.create().texOffs(0, 11).addBox(-4.0f, -2.0f, -3.5f, 6, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, 0.82030475f, 0.0f));
        PartDefinition jointN_1 = nten.addOrReplaceChild("jointN_1", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -14.0f, 0.0f));
        PartDefinition n = jointN_1.addOrReplaceChild("n", CubeListBuilder.create().texOffs(136, 69).addBox(-11.0f, -13.0f, -11.2f, 22, 17, 22), PartPose.offset(0.0f, -2.0f, 0.0f));
        PartDefinition jointN_2 = n.addOrReplaceChild("jointN_2", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -12.0f, -1.0f));
        PartDefinition bhhhhhh = jointN_2.addOrReplaceChild("bhhhhhh", CubeListBuilder.create().texOffs(106, 108).addBox(-15.0f, -12.0f, -15.0f, 30, 25, 30), PartPose.offset(0.0f, -10.0f, 0.7f));
        PartDefinition jd_8 = bhhhhhh.addOrReplaceChild("jd_8", CubeListBuilder.create().texOffs(96, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(-15.0f, -11.0f, 0.0f));
        PartDefinition jointMA = jd_8.addOrReplaceChild("jointMA", CubeListBuilder.create().texOffs(112, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition m = jointMA.addOrReplaceChild("m", CubeListBuilder.create().texOffs(202, 42).addBox(-2.5f, -6.0f, -10.5f, 5, 14, 21), PartPose.offsetAndRotation(-1.0f, 1.5f, 0.0f, 0.0f, (float)Math.PI, 2.6389377f));
        PartDefinition jointMA_1 = m.addOrReplaceChild("jointMA_1", CubeListBuilder.create().texOffs(116, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 8.0f, 0.0f));
        PartDefinition m_1 = jointMA_1.addOrReplaceChild("m_1", CubeListBuilder.create().texOffs(0, 128).addBox(-3.0f, -3.0f, -10.0f, 7, 12, 20), PartPose.offsetAndRotation(3.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.7592919f));
        PartDefinition jointMA_2 = m_1.addOrReplaceChild("jointMA_2", CubeListBuilder.create().texOffs(168, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -2.5f, 0.0f));
        PartDefinition m_2 = jointMA_2.addOrReplaceChild("m_2", CubeListBuilder.create().texOffs(0, 44).addBox(-12.0f, -2.0f, -8.0f, 15, 3, 16), PartPose.offsetAndRotation(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0681415f));
        PartDefinition b_2 = bhhhhhh.addOrReplaceChild("b_2", CubeListBuilder.create().texOffs(168, 0).addBox(-3.0f, -3.0f, -9.0f, 6, 6, 18), PartPose.offsetAndRotation(15.0f, 7.0f, 0.0f, 0.0f, 0.0f, -0.81681406f));
        PartDefinition jd_11 = bhhhhhh.addOrReplaceChild("jd_11", CubeListBuilder.create().texOffs(108, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, -11.0f, 15.0f, 0.0f, 1.5707964f, 0.0f));
        PartDefinition jointMD = jd_11.addOrReplaceChild("jointMD", CubeListBuilder.create().texOffs(210, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition m_9 = jointMD.addOrReplaceChild("m_9", CubeListBuilder.create().texOffs(191, 163).addBox(-2.5f, -7.0f, -10.5f, 5, 17, 21), PartPose.offsetAndRotation(-1.0f, 1.5f, 0.0f, 0.0f, (float)Math.PI, 2.7017696f));
        PartDefinition jointMD_1 = m_9.addOrReplaceChild("jointMD_1", CubeListBuilder.create().texOffs(214, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 10.0f, 0.0f));
        PartDefinition m_10 = jointMD_1.addOrReplaceChild("m_10", CubeListBuilder.create().texOffs(32, 178).addBox(-4.0f, -3.0f, -10.0f, 8, 12, 20), PartPose.offsetAndRotation(3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.8221238f));
        PartDefinition jointMD_2 = m_10.addOrReplaceChild("jointMD_2", CubeListBuilder.create().texOffs(218, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -2.5f, 0.0f));
        PartDefinition m_11 = jointMD_2.addOrReplaceChild("m_11", CubeListBuilder.create().texOffs(72, 195).addBox(-12.0f, -2.0f, -8.0f, 15, 3, 16), PartPose.offsetAndRotation(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.1938052f));
        PartDefinition jd_10 = bhhhhhh.addOrReplaceChild("jd_10", CubeListBuilder.create().texOffs(104, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, -11.0f, -15.0f, 0.0f, -1.5707964f, 0.0f));
        PartDefinition jointMC = jd_10.addOrReplaceChild("jointMC", CubeListBuilder.create().texOffs(198, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition m_6 = jointMC.addOrReplaceChild("m_6", CubeListBuilder.create().texOffs(0, 160).addBox(-2.5f, -7.0f, -10.5f, 5, 17, 21), PartPose.offsetAndRotation(-1.0f, 1.5f, 0.0f, 0.0f, (float)Math.PI, 2.7017696f));
        PartDefinition jointMC_1 = m_6.addOrReplaceChild("jointMC_1", CubeListBuilder.create().texOffs(202, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 10.0f, 0.0f));
        PartDefinition m_7 = jointMC_1.addOrReplaceChild("m_7", CubeListBuilder.create().texOffs(114, 163).addBox(-4.0f, -3.0f, -10.0f, 8, 12, 20), PartPose.offsetAndRotation(3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.8221238f));
        PartDefinition jointMC_2 = m_7.addOrReplaceChild("jointMC_2", CubeListBuilder.create().texOffs(206, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -2.5f, 0.0f));
        PartDefinition m_8 = jointMC_2.addOrReplaceChild("m_8", CubeListBuilder.create().texOffs(150, 163).addBox(-12.0f, -2.0f, -8.0f, 15, 3, 16), PartPose.offsetAndRotation(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.1309733f));
        PartDefinition b_5 = bhhhhhh.addOrReplaceChild("b_5", CubeListBuilder.create().texOffs(192, 30).addBox(-9.0f, -3.0f, -3.0f, 18, 6, 6), PartPose.offsetAndRotation(0.0f, 7.0f, -15.0f, 0.81681406f, 0.0f, 0.0f));
        PartDefinition b_4 = bhhhhhh.addOrReplaceChild("b_4", CubeListBuilder.create().texOffs(72, 2).addBox(-9.0f, -3.0f, -3.0f, 18, 6, 6), PartPose.offsetAndRotation(0.0f, 7.0f, 15.0f, 0.81681406f, 0.0f, 0.0f));
        PartDefinition jd_9 = bhhhhhh.addOrReplaceChild("jd_9", CubeListBuilder.create().texOffs(100, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(15.0f, -11.0f, 0.0f, 0.0f, (float)(-Math.PI), 0.0f));
        PartDefinition jointMB = jd_9.addOrReplaceChild("jointMB", CubeListBuilder.create().texOffs(172, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition m_3 = jointMB.addOrReplaceChild("m_3", CubeListBuilder.create().texOffs(203, 87).addBox(-2.5f, -6.0f, -10.5f, 5, 14, 21), PartPose.offsetAndRotation(-1.0f, 1.5f, 0.0f, 0.0f, (float)Math.PI, 2.6389377f));
        PartDefinition jointMB_1 = m_3.addOrReplaceChild("jointMB_1", CubeListBuilder.create().texOffs(176, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 8.0f, 0.0f));
        PartDefinition m_4 = jointMB_1.addOrReplaceChild("m_4", CubeListBuilder.create().texOffs(34, 140).addBox(-3.0f, -3.0f, -10.0f, 7, 12, 20), PartPose.offsetAndRotation(3.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.7592919f));
        PartDefinition jointMB_2 = m_4.addOrReplaceChild("jointMB_2", CubeListBuilder.create().texOffs(180, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -2.5f, 0.0f));
        PartDefinition m_5 = jointMB_2.addOrReplaceChild("m_5", CubeListBuilder.create().texOffs(72, 163).addBox(-12.0f, -2.0f, -8.0f, 15, 3, 16), PartPose.offsetAndRotation(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0053097f));
        PartDefinition b_3 = bhhhhhh.addOrReplaceChild("b_3", CubeListBuilder.create().texOffs(198, 6).addBox(-3.0f, -3.0f, -9.0f, 6, 6, 18), PartPose.offsetAndRotation(-15.0f, 7.0f, 0.0f, 0.0f, 0.0f, -0.81681406f));
        PartDefinition jd_5 = nten.addOrReplaceChild("jd_5", CubeListBuilder.create().texOffs(80, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-0.7f, -0.2f, 16.6f, -1.5707964f, -1.69646f, 0.0f));
        PartDefinition d_5 = jd_5.addOrReplaceChild("d_5", CubeListBuilder.create().texOffs(94, 14).addBox(-4.0f, -2.0f, -3.5f, 6, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, 0.82030475f, 0.0f));
        PartDefinition taclejointF = jd_5.addOrReplaceChild("taclejointF", CubeListBuilder.create().texOffs(226, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, 0.0f, 0.0f));
        PartDefinition tentacle_20 = taclejointF.addOrReplaceChild("tentacle_20", CubeListBuilder.create().texOffs(190, 201).addBox(-3.0f, -1.0f, -1.0f, 4, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.829105f, 0.0f));
        PartDefinition taclejointF_1 = tentacle_20.addOrReplaceChild("taclejointF_1", CubeListBuilder.create().texOffs(245, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_21 = taclejointF_1.addOrReplaceChild("tentacle_21", CubeListBuilder.create().texOffs(222, 201).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.56548667f, 0.0f));
        PartDefinition taclejointF_2 = tentacle_21.addOrReplaceChild("taclejointF_2", CubeListBuilder.create().texOffs(249, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_22 = taclejointF_2.addOrReplaceChild("tentacle_22", CubeListBuilder.create().texOffs(156, 200).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.37699112f, 0.0f));
        PartDefinition taclejointF_3 = tentacle_22.addOrReplaceChild("taclejointF_3", CubeListBuilder.create().texOffs(20, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_23 = taclejointF_3.addOrReplaceChild("tentacle_23", CubeListBuilder.create().texOffs(170, 202).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.37699112f, 0.0f));
        PartDefinition jd_2 = nten.addOrReplaceChild("jd_2", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(16.3f, -9.2f, -11.4f, -1.5707964f, 0.43982297f, 0.0f));
        PartDefinition d_2 = jd_2.addOrReplaceChild("d_2", CubeListBuilder.create().texOffs(228, 9).addBox(-4.0f, -2.0f, -3.5f, 6, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, 0.82030475f, 0.0f));
        PartDefinition taclejointC = jd_2.addOrReplaceChild("taclejointC", CubeListBuilder.create().texOffs(114, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, 0.0f, 0.0f));
        PartDefinition tentacle_8 = taclejointC.addOrReplaceChild("tentacle_8", CubeListBuilder.create().texOffs(196, 122).addBox(-3.0f, -1.0f, -1.0f, 4, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.829105f, 0.0f));
        PartDefinition taclejointC_1 = tentacle_8.addOrReplaceChild("taclejointC_1", CubeListBuilder.create().texOffs(168, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_9 = taclejointC_1.addOrReplaceChild("tentacle_9", CubeListBuilder.create().texOffs(68, 128).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.56548667f, 0.0f));
        PartDefinition taclejointC_2 = tentacle_9.addOrReplaceChild("taclejointC_2", CubeListBuilder.create().texOffs(172, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_10 = taclejointC_2.addOrReplaceChild("tentacle_10", CubeListBuilder.create().texOffs(216, 124).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.37699112f, 0.0f));
        PartDefinition taclejointC_3 = tentacle_10.addOrReplaceChild("taclejointC_3", CubeListBuilder.create().texOffs(176, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_11 = taclejointC_3.addOrReplaceChild("tentacle_11", CubeListBuilder.create().texOffs(68, 143).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.37699112f, 0.0f));
        PartDefinition jd = nten.addOrReplaceChild("jd", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-10.7f, -10.2f, -16.4f, -1.5707964f, 2.0106194f, 0.0f));
        PartDefinition taclejointA = jd.addOrReplaceChild("taclejointA", CubeListBuilder.create().texOffs(222, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, 0.0f, 0.0f));
        PartDefinition tentacle = taclejointA.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(46, 44).addBox(-3.0f, -1.0f, -1.0f, 4, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.829105f, 0.0f));
        PartDefinition taclejointA_1 = tentacle.addOrReplaceChild("taclejointA_1", CubeListBuilder.create().texOffs(226, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_1 = taclejointA_1.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(192, 42).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.56548667f, 0.0f));
        PartDefinition taclejointA_2 = tentacle_1.addOrReplaceChild("taclejointA_2", CubeListBuilder.create().texOffs(245, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_2 = taclejointA_2.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(66, 46).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.37699112f, 0.0f));
        PartDefinition taclejointA_3 = tentacle_2.addOrReplaceChild("taclejointA_3", CubeListBuilder.create().texOffs(249, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_3 = taclejointA_3.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.37699112f, 0.0f));
        PartDefinition d = jd.addOrReplaceChild("d", CubeListBuilder.create().texOffs(228, 0).addBox(-4.0f, -2.0f, -3.5f, 6, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, 0.82030475f, 0.0f));
        PartDefinition jd_7 = nten.addOrReplaceChild("jd_7", CubeListBuilder.create().texOffs(88, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-16.7f, -0.2f, -3.4f, -1.5707964f, 2.8274333f, 0.0f));
        PartDefinition taclejointH = jd_7.addOrReplaceChild("taclejointH", CubeListBuilder.create().texOffs(114, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, 0.0f, 0.0f));
        PartDefinition tentacle_28 = taclejointH.addOrReplaceChild("tentacle_28", CubeListBuilder.create().texOffs(0, 213).addBox(-3.0f, -1.0f, -1.0f, 4, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.829105f, 0.0f));
        PartDefinition taclejointH_1 = tentacle_28.addOrReplaceChild("taclejointH_1", CubeListBuilder.create().texOffs(168, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_29 = taclejointH_1.addOrReplaceChild("tentacle_29", CubeListBuilder.create().texOffs(82, 214).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.56548667f, 0.0f));
        PartDefinition taclejointH_2 = tentacle_29.addOrReplaceChild("taclejointH_2", CubeListBuilder.create().texOffs(172, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_30 = taclejointH_2.addOrReplaceChild("tentacle_30", CubeListBuilder.create().texOffs(154, 215).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.37699112f, 0.0f));
        PartDefinition taclejointH_3 = tentacle_30.addOrReplaceChild("taclejointH_3", CubeListBuilder.create().texOffs(176, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_31 = taclejointH_3.addOrReplaceChild("tentacle_31", CubeListBuilder.create().texOffs(98, 215).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.37699112f, 0.0f));
        PartDefinition d_7 = jd_7.addOrReplaceChild("d_7", CubeListBuilder.create().texOffs(233, 51).addBox(-4.0f, -2.0f, -3.5f, 6, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, 0.82030475f, 0.0f));
        return LayerDefinition.create(mesh, 256, 256);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityRof ven = (EntityRof)entity;
        this.jointMA.zRot = 0.0f;
        this.jointMB.zRot = 0.0f;
        this.jointMC.zRot = 0.0f;
        this.jointMD.zRot = 0.0f;
        this.jointMA_1.zRot = 0.0f;
        this.jointMB_1.zRot = 0.0f;
        this.jointMC_1.zRot = 0.0f;
        this.jointMD_1.zRot = 0.0f;
        this.jointMA_2.zRot = 0.0f;
        this.jointMB_2.zRot = 0.0f;
        this.jointMC_2.zRot = 0.0f;
        this.jointMD_2.zRot = 0.0f;
        float f1 = Mth.sin((float)(ageInTicks * 0.06f + 0.0f)) * 0.0221f;
        float f2 = Mth.sin((float)(ageInTicks * 0.116f + 0.0f)) * 0.022f;
        float f3 = Mth.sin((float)(ageInTicks * 0.116f + 0.0f)) * 0.0323f;
        float f4 = Mth.sin((float)(ageInTicks * 0.116f + 0.0f)) * 0.0622f;
        this.jointN.xRot = f1;
        this.jointN.zRot = f2;
        this.jointN_1.xRot = f3;
        this.jointN_1.zRot = f4;
        this.jointN_2.xRot = f1;
        this.jointN_2.zRot = f3;
        f1 = Mth.sin((float)(ageInTicks * 0.056f)) * 0.2321f;
        f2 = Mth.sin((float)(ageInTicks * 0.1016f)) * 0.192f;
        f3 = Mth.sin((float)(ageInTicks * 0.076f)) * 0.2021f;
        f4 = Mth.sin((float)(ageInTicks * 0.1216f)) * 0.22f;
        if (ven.getParasiteStatus() == 3) {
            f1 = Mth.sin((float)(ageInTicks * 0.5206f + 0.0f)) * 0.04221f;
            f2 = Mth.sin((float)(ageInTicks * 0.4116f + 0.0f)) * 0.05622f;
            f3 = Mth.sin((float)(ageInTicks * 0.5116f + 0.0f)) * 0.0323f;
            f4 = Mth.sin((float)(ageInTicks * 0.3116f + 0.0f)) * 0.0622f;
            this.jointN.xRot = f1;
            this.jointN.zRot = f2;
            this.jointN_1.xRot = f3;
            this.jointN_1.zRot = f4;
            this.jointN_2.xRot = f1;
            this.jointN_2.zRot = f3;
            f1 = Mth.sin((float)(ageInTicks * 0.856f)) * 0.42321f;
            f2 = Mth.sin((float)(ageInTicks * 0.641016f)) * 0.3192f;
            f3 = Mth.sin((float)(ageInTicks * 0.75076f)) * 0.42021f;
            f4 = Mth.sin((float)(ageInTicks * 0.71216f)) * 0.322f;
            this.taclejointA.yRot = f1;
            this.taclejointA_2.yRot = f1;
            this.taclejointB.yRot = f2;
            this.taclejointB_2.yRot = f2;
            this.taclejointC.yRot = f3;
            this.taclejointC_2.yRot = f3;
            this.taclejointD.yRot = f4;
            this.taclejointD_2.yRot = f4;
            this.taclejointE.yRot = f2;
            this.taclejointE_2.yRot = f2;
            this.taclejointF.yRot = f1;
            this.taclejointF_2.yRot = f1;
            this.taclejointG.yRot = f3;
            this.taclejointG_2.yRot = f3;
            this.taclejointH.yRot = f4;
            this.taclejointH_2.yRot = f4;
        } else {
            this.taclejointA.yRot = f1;
            this.taclejointA_2.yRot = f1;
            this.taclejointB.yRot = f2;
            this.taclejointB_2.yRot = f2;
            this.taclejointC.yRot = f3;
            this.taclejointC_2.yRot = f3;
            this.taclejointD.yRot = f4;
            this.taclejointD_2.yRot = f4;
            this.taclejointE.yRot = f2;
            this.taclejointE_2.yRot = f2;
            this.taclejointF.yRot = f1;
            this.taclejointF_2.yRot = f1;
            this.taclejointG.yRot = f3;
            this.taclejointG_2.yRot = f3;
            this.taclejointH.yRot = f4;
            this.taclejointH_2.yRot = f4;
        }
        float id = ven.getAttackTimer();
        if (id > 0.0f) {
            this.jointMA.zRot += Math.min(-1.0f, id);
            this.jointMB.zRot += Math.min(-1.0f, id);
            this.jointMC.zRot += Math.min(-1.0f, id);
            this.jointMD.zRot += Math.min(-1.0f, id);
            this.jointMA_1.zRot += Math.min(1.0f, id);
            this.jointMB_1.zRot += Math.min(1.0f, id);
            this.jointMC_1.zRot += Math.min(1.0f, id);
            this.jointMD_1.zRot += Math.min(1.0f, id);
            this.jointMA_2.zRot += Math.min(1.0f, id);
            this.jointMB_2.zRot += Math.min(1.0f, id);
            this.jointMC_2.zRot += Math.min(1.0f, id);
            this.jointMD_2.zRot += Math.min(1.0f, id);
        }
        f1 = Mth.sin((float)(ageInTicks * 0.6f)) * 0.02321f;
        f2 = Mth.sin((float)(ageInTicks * 0.6f)) * 0.0192f;
        f3 = Mth.sin((float)(ageInTicks * 0.5076f)) * 0.02021f;
        f4 = Mth.sin((float)(ageInTicks * 0.71216f)) * 0.022f;
        this.jointMA.zRot += f1;
        this.jointMB.zRot += f2;
        this.jointMC.zRot += f3;
        this.jointMD.zRot += f4;
        this.jointMA_1.zRot += f4;
        this.jointMB_1.zRot += f3;
        this.jointMC_1.zRot += f2;
        this.jointMD_1.zRot += f1;
    
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
