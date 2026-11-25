package com.dhanantry.scapeandrunparasites.client.model.entity.inborn;

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
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelMudo extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "mudo"), "main");
    private final ModelPart mainbody;
    private final ModelPart joingRB;
    private final ModelPart jointLB;
    private final ModelPart jointFLLX;
    private final ModelPart jointFRLX;
    private final ModelPart jointBLLX;
    private final ModelPart jointBRLX;
    private final ModelPart head;
    private final ModelPart body;
    private final ModelPart body_1;
    private final ModelPart body_2;
    private final ModelPart body_3;
    private final ModelPart body_4;
    private final ModelPart JD;
    private final ModelPart jointFLLY;
    private final ModelPart leg;
    private final ModelPart jointFLL1;
    private final ModelPart leg_1;
    private final ModelPart jointFLL2;
    private final ModelPart leg_2;
    private final ModelPart JD_1;
    private final ModelPart jointFRLY;
    private final ModelPart leg_3;
    private final ModelPart jointFRL1;
    private final ModelPart leg_4;
    private final ModelPart jointFRL2;
    private final ModelPart leg_5;
    private final ModelPart JD_2;
    private final ModelPart jointBLLY;
    private final ModelPart leg_6;
    private final ModelPart jointBLL1;
    private final ModelPart leg_7;
    private final ModelPart jointBLL2;
    private final ModelPart leg_8;
    private final ModelPart JD_3;
    private final ModelPart jointBRLY;
    private final ModelPart leg_9;
    private final ModelPart jointBRL1;
    private final ModelPart leg_10;
    private final ModelPart jointBRL2;
    private final ModelPart leg_11;
    private final ModelPart hair_jointRTL;
    private final ModelPart hair_jointRTR;
    private final ModelPart hair_jointRTM;
    private final ModelPart hair_jointRTLL;
    private final ModelPart hair_jointRTRR;
    private final ModelPart hair;
    private final ModelPart hair_jointL1;
    private final ModelPart hair_1;
    private final ModelPart hair_jointL2;
    private final ModelPart hair_2;
    private final ModelPart hair_jointL3;
    private final ModelPart hair_3;
    private final ModelPart hair_jointL4;
    private final ModelPart hair_4;
    private final ModelPart hair_jointL5;
    private final ModelPart hair_5;
    private final ModelPart hair_jointL6;
    private final ModelPart hair_6;
    private final ModelPart hair_7;
    private final ModelPart hair_jointR1;
    private final ModelPart hair_8;
    private final ModelPart hair_jointR2;
    private final ModelPart hair_9;
    private final ModelPart hair_jointR3;
    private final ModelPart hair_10;
    private final ModelPart hair_jointR4;
    private final ModelPart hair_11;
    private final ModelPart hair_jointR5;
    private final ModelPart hair_12;
    private final ModelPart hair_jointR6;
    private final ModelPart hair_13;
    private final ModelPart hair_14;
    private final ModelPart hair_jointM1;
    private final ModelPart hair_15;
    private final ModelPart hair_jointM2;
    private final ModelPart hair_16;
    private final ModelPart hair_jointM3;
    private final ModelPart hair_17;
    private final ModelPart hair_jointM4;
    private final ModelPart hair_18;
    private final ModelPart hair_jointM5;
    private final ModelPart hair_19;
    private final ModelPart hair_jointM6;
    private final ModelPart hair_20;
    private final ModelPart hair_21;
    private final ModelPart hair_jointLL1;
    private final ModelPart hair_22;
    private final ModelPart hair_jointLL2;
    private final ModelPart hair_23;
    private final ModelPart hair_jointLL3;
    private final ModelPart hair_24;
    private final ModelPart hair_jointLL4;
    private final ModelPart hair_25;
    private final ModelPart hair_jointLL5;
    private final ModelPart hair_26;
    private final ModelPart hair_jointLL6;
    private final ModelPart hair_27;
    private final ModelPart hair_28;
    private final ModelPart hair_jointRR1;
    private final ModelPart hair_29;
    private final ModelPart hair_jointRR2;
    private final ModelPart hair_30;
    private final ModelPart hair_jointRR3;
    private final ModelPart hair_31;
    private final ModelPart hair_jointRR4;
    private final ModelPart hair_32;
    private final ModelPart hair_jointRR5;
    private final ModelPart hair_33;
    private final ModelPart hair_jointRR6;
    private final ModelPart hair_34;
    private final ModelPart tail;
    private final ModelPart tail_1;

    public ModelMudo(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.joingRB = root.getChild("mainbody").getChild("joingRB");
        this.jointLB = root.getChild("mainbody").getChild("jointLB");
        this.jointFLLX = root.getChild("mainbody").getChild("jointFLLX");
        this.jointFRLX = root.getChild("mainbody").getChild("jointFRLX");
        this.jointBLLX = root.getChild("mainbody").getChild("jointBLLX");
        this.jointBRLX = root.getChild("mainbody").getChild("jointBRLX");
        this.head = root.getChild("mainbody").getChild("head");
        this.body = root.getChild("mainbody").getChild("body");
        this.body_1 = root.getChild("mainbody").getChild("joingRB").getChild("body_1");
        this.body_2 = root.getChild("mainbody").getChild("joingRB").getChild("body_1").getChild("body_2");
        this.body_3 = root.getChild("mainbody").getChild("jointLB").getChild("body_3");
        this.body_4 = root.getChild("mainbody").getChild("jointLB").getChild("body_3").getChild("body_4");
        this.JD = root.getChild("mainbody").getChild("jointFLLX").getChild("JD");
        this.jointFLLY = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY");
        this.leg = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg");
        this.jointFLL1 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1");
        this.leg_1 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1");
        this.jointFLL2 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2");
        this.leg_2 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2");
        this.JD_1 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1");
        this.jointFRLY = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY");
        this.leg_3 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_3");
        this.jointFRL1 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_3").getChild("jointFRL1");
        this.leg_4 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_3").getChild("jointFRL1").getChild("leg_4");
        this.jointFRL2 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_3").getChild("jointFRL1").getChild("leg_4").getChild("jointFRL2");
        this.leg_5 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_3").getChild("jointFRL1").getChild("leg_4").getChild("jointFRL2").getChild("leg_5");
        this.JD_2 = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2");
        this.jointBLLY = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2").getChild("jointBLLY");
        this.leg_6 = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2").getChild("jointBLLY").getChild("leg_6");
        this.jointBLL1 = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2").getChild("jointBLLY").getChild("leg_6").getChild("jointBLL1");
        this.leg_7 = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2").getChild("jointBLLY").getChild("leg_6").getChild("jointBLL1").getChild("leg_7");
        this.jointBLL2 = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2").getChild("jointBLLY").getChild("leg_6").getChild("jointBLL1").getChild("leg_7").getChild("jointBLL2");
        this.leg_8 = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2").getChild("jointBLLY").getChild("leg_6").getChild("jointBLL1").getChild("leg_7").getChild("jointBLL2").getChild("leg_8");
        this.JD_3 = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_3");
        this.jointBRLY = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_3").getChild("jointBRLY");
        this.leg_9 = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_3").getChild("jointBRLY").getChild("leg_9");
        this.jointBRL1 = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_3").getChild("jointBRLY").getChild("leg_9").getChild("jointBRL1");
        this.leg_10 = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_3").getChild("jointBRLY").getChild("leg_9").getChild("jointBRL1").getChild("leg_10");
        this.jointBRL2 = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_3").getChild("jointBRLY").getChild("leg_9").getChild("jointBRL1").getChild("leg_10").getChild("jointBRL2");
        this.leg_11 = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_3").getChild("jointBRLY").getChild("leg_9").getChild("jointBRL1").getChild("leg_10").getChild("jointBRL2").getChild("leg_11");
        this.hair_jointRTL = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL");
        this.hair_jointRTR = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR");
        this.hair_jointRTM = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM");
        this.hair_jointRTLL = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL");
        this.hair_jointRTRR = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR");
        this.hair = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair");
        this.hair_jointL1 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1");
        this.hair_1 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1");
        this.hair_jointL2 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2");
        this.hair_2 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2");
        this.hair_jointL3 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3");
        this.hair_3 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3");
        this.hair_jointL4 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3").getChild("hair_jointL4");
        this.hair_4 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3").getChild("hair_jointL4").getChild("hair_4");
        this.hair_jointL5 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3").getChild("hair_jointL4").getChild("hair_4").getChild("hair_jointL5");
        this.hair_5 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3").getChild("hair_jointL4").getChild("hair_4").getChild("hair_jointL5").getChild("hair_5");
        this.hair_jointL6 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3").getChild("hair_jointL4").getChild("hair_4").getChild("hair_jointL5").getChild("hair_5").getChild("hair_jointL6");
        this.hair_6 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3").getChild("hair_jointL4").getChild("hair_4").getChild("hair_jointL5").getChild("hair_5").getChild("hair_jointL6").getChild("hair_6");
        this.hair_7 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7");
        this.hair_jointR1 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1");
        this.hair_8 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8");
        this.hair_jointR2 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2");
        this.hair_9 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9");
        this.hair_jointR3 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3");
        this.hair_10 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10");
        this.hair_jointR4 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10").getChild("hair_jointR4");
        this.hair_11 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10").getChild("hair_jointR4").getChild("hair_11");
        this.hair_jointR5 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10").getChild("hair_jointR4").getChild("hair_11").getChild("hair_jointR5");
        this.hair_12 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10").getChild("hair_jointR4").getChild("hair_11").getChild("hair_jointR5").getChild("hair_12");
        this.hair_jointR6 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10").getChild("hair_jointR4").getChild("hair_11").getChild("hair_jointR5").getChild("hair_12").getChild("hair_jointR6");
        this.hair_13 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10").getChild("hair_jointR4").getChild("hair_11").getChild("hair_jointR5").getChild("hair_12").getChild("hair_jointR6").getChild("hair_13");
        this.hair_14 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14");
        this.hair_jointM1 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1");
        this.hair_15 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15");
        this.hair_jointM2 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2");
        this.hair_16 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16");
        this.hair_jointM3 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3");
        this.hair_17 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17");
        this.hair_jointM4 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17").getChild("hair_jointM4");
        this.hair_18 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17").getChild("hair_jointM4").getChild("hair_18");
        this.hair_jointM5 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17").getChild("hair_jointM4").getChild("hair_18").getChild("hair_jointM5");
        this.hair_19 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17").getChild("hair_jointM4").getChild("hair_18").getChild("hair_jointM5").getChild("hair_19");
        this.hair_jointM6 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17").getChild("hair_jointM4").getChild("hair_18").getChild("hair_jointM5").getChild("hair_19").getChild("hair_jointM6");
        this.hair_20 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17").getChild("hair_jointM4").getChild("hair_18").getChild("hair_jointM5").getChild("hair_19").getChild("hair_jointM6").getChild("hair_20");
        this.hair_21 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21");
        this.hair_jointLL1 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21").getChild("hair_jointLL1");
        this.hair_22 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21").getChild("hair_jointLL1").getChild("hair_22");
        this.hair_jointLL2 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21").getChild("hair_jointLL1").getChild("hair_22").getChild("hair_jointLL2");
        this.hair_23 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21").getChild("hair_jointLL1").getChild("hair_22").getChild("hair_jointLL2").getChild("hair_23");
        this.hair_jointLL3 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21").getChild("hair_jointLL1").getChild("hair_22").getChild("hair_jointLL2").getChild("hair_23").getChild("hair_jointLL3");
        this.hair_24 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21").getChild("hair_jointLL1").getChild("hair_22").getChild("hair_jointLL2").getChild("hair_23").getChild("hair_jointLL3").getChild("hair_24");
        this.hair_jointLL4 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21").getChild("hair_jointLL1").getChild("hair_22").getChild("hair_jointLL2").getChild("hair_23").getChild("hair_jointLL3").getChild("hair_24").getChild("hair_jointLL4");
        this.hair_25 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21").getChild("hair_jointLL1").getChild("hair_22").getChild("hair_jointLL2").getChild("hair_23").getChild("hair_jointLL3").getChild("hair_24").getChild("hair_jointLL4").getChild("hair_25");
        this.hair_jointLL5 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21").getChild("hair_jointLL1").getChild("hair_22").getChild("hair_jointLL2").getChild("hair_23").getChild("hair_jointLL3").getChild("hair_24").getChild("hair_jointLL4").getChild("hair_25").getChild("hair_jointLL5");
        this.hair_26 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21").getChild("hair_jointLL1").getChild("hair_22").getChild("hair_jointLL2").getChild("hair_23").getChild("hair_jointLL3").getChild("hair_24").getChild("hair_jointLL4").getChild("hair_25").getChild("hair_jointLL5").getChild("hair_26");
        this.hair_jointLL6 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21").getChild("hair_jointLL1").getChild("hair_22").getChild("hair_jointLL2").getChild("hair_23").getChild("hair_jointLL3").getChild("hair_24").getChild("hair_jointLL4").getChild("hair_25").getChild("hair_jointLL5").getChild("hair_26").getChild("hair_jointLL6");
        this.hair_27 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTLL").getChild("hair_21").getChild("hair_jointLL1").getChild("hair_22").getChild("hair_jointLL2").getChild("hair_23").getChild("hair_jointLL3").getChild("hair_24").getChild("hair_jointLL4").getChild("hair_25").getChild("hair_jointLL5").getChild("hair_26").getChild("hair_jointLL6").getChild("hair_27");
        this.hair_28 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28");
        this.hair_jointRR1 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28").getChild("hair_jointRR1");
        this.hair_29 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28").getChild("hair_jointRR1").getChild("hair_29");
        this.hair_jointRR2 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28").getChild("hair_jointRR1").getChild("hair_29").getChild("hair_jointRR2");
        this.hair_30 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28").getChild("hair_jointRR1").getChild("hair_29").getChild("hair_jointRR2").getChild("hair_30");
        this.hair_jointRR3 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28").getChild("hair_jointRR1").getChild("hair_29").getChild("hair_jointRR2").getChild("hair_30").getChild("hair_jointRR3");
        this.hair_31 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28").getChild("hair_jointRR1").getChild("hair_29").getChild("hair_jointRR2").getChild("hair_30").getChild("hair_jointRR3").getChild("hair_31");
        this.hair_jointRR4 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28").getChild("hair_jointRR1").getChild("hair_29").getChild("hair_jointRR2").getChild("hair_30").getChild("hair_jointRR3").getChild("hair_31").getChild("hair_jointRR4");
        this.hair_32 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28").getChild("hair_jointRR1").getChild("hair_29").getChild("hair_jointRR2").getChild("hair_30").getChild("hair_jointRR3").getChild("hair_31").getChild("hair_jointRR4").getChild("hair_32");
        this.hair_jointRR5 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28").getChild("hair_jointRR1").getChild("hair_29").getChild("hair_jointRR2").getChild("hair_30").getChild("hair_jointRR3").getChild("hair_31").getChild("hair_jointRR4").getChild("hair_32").getChild("hair_jointRR5");
        this.hair_33 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28").getChild("hair_jointRR1").getChild("hair_29").getChild("hair_jointRR2").getChild("hair_30").getChild("hair_jointRR3").getChild("hair_31").getChild("hair_jointRR4").getChild("hair_32").getChild("hair_jointRR5").getChild("hair_33");
        this.hair_jointRR6 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28").getChild("hair_jointRR1").getChild("hair_29").getChild("hair_jointRR2").getChild("hair_30").getChild("hair_jointRR3").getChild("hair_31").getChild("hair_jointRR4").getChild("hair_32").getChild("hair_jointRR5").getChild("hair_33").getChild("hair_jointRR6");
        this.hair_34 = root.getChild("mainbody").getChild("head").getChild("hair_jointRTRR").getChild("hair_28").getChild("hair_jointRR1").getChild("hair_29").getChild("hair_jointRR2").getChild("hair_30").getChild("hair_jointRR3").getChild("hair_31").getChild("hair_jointRR4").getChild("hair_32").getChild("hair_jointRR5").getChild("hair_33").getChild("hair_jointRR6").getChild("hair_34");
        this.tail = root.getChild("mainbody").getChild("body").getChild("tail");
        this.tail_1 = root.getChild("mainbody").getChild("body").getChild("tail").getChild("tail_1");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, -2.0f, -5.0f, 1, 1, 1), PartPose.offset(0.0f, 12.9f, 5.7f));
        PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0f, -1.5f, -1.0f, 6, 5, 5), PartPose.offsetAndRotation(0.0f, -3.0f, -4.0f, 0.34906584f, 0.0f, 0.0f));
        PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(36, 39).addBox(-2.5f, -1.5f, 0.0f, 5, 3, 4), PartPose.offsetAndRotation(0.0f, 0.8f, 3.5f, -0.2268928f, 0.0f, 0.0f));
        PartDefinition tail_1 = tail.addOrReplaceChild("tail_1", CubeListBuilder.create().texOffs(16, 40).addBox(-1.5f, -1.0f, 0.0f, 3, 2, 5), PartPose.offsetAndRotation(0.0f, -0.1f, 2.6f, -0.2268928f, 0.0f, 0.0f));
        PartDefinition joingRB = mainbody.addOrReplaceChild("joingRB", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.5f, 0.5f, -6.0f));
        PartDefinition body_1 = joingRB.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(44, 0).addBox(-3.0f, -2.0f, -2.0f, 5, 4, 4), PartPose.offsetAndRotation(-1.0f, 0.0f, 1.0f, 0.0f, 0.43633232f, -0.27925268f));
        PartDefinition body_2 = body_1.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(0, 2).addBox(-3.5f, -1.0f, -1.0f, 4, 2, 2), PartPose.offsetAndRotation(-3.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.38397244f));
        PartDefinition jointFLLX = mainbody.addOrReplaceChild("jointFLLX", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.7f, 3.0f, -9.5f));
        PartDefinition JD = jointFLLX.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.38397244f, 0.0f));
        PartDefinition jointFLLY = JD.addOrReplaceChild("jointFLLY", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg = jointFLLY.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(24, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.43633232f));
        PartDefinition jointFLL1 = leg.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(10, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.0f, 0.0f));
        PartDefinition leg_1 = jointFLL1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.4486233f));
        PartDefinition jointFLL2 = leg_1.addOrReplaceChild("jointFLL2", CubeListBuilder.create().texOffs(44, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 2.7f, 0.0f));
        PartDefinition leg_2 = jointFLL2.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(52, 8).addBox(-0.5f, -1.7f, -1.0f, 1, 8, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.7976891f));
        PartDefinition jointBRLX = mainbody.addOrReplaceChild("jointBRLX", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.7f, 3.8f, -4.7f));
        PartDefinition JD_3 = jointBRLX.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(58, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.3561945f, 0.0f));
        PartDefinition jointBRLY = JD_3.addOrReplaceChild("jointBRLY", CubeListBuilder.create().texOffs(22, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_9 = jointBRLY.addOrReplaceChild("leg_9", CubeListBuilder.create().texOffs(36, 16).addBox(-0.5f, 0.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.38397244f));
        PartDefinition jointBRL1 = leg_9.addOrReplaceChild("jointBRL1", CubeListBuilder.create().texOffs(44, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.0f, 0.0f));
        PartDefinition leg_10 = jointBRL1.addOrReplaceChild("leg_10", CubeListBuilder.create().texOffs(58, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.4486233f));
        PartDefinition jointBRL2 = leg_10.addOrReplaceChild("jointBRL2", CubeListBuilder.create().texOffs(22, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.7f, 0.0f));
        PartDefinition leg_11 = jointBRL2.addOrReplaceChild("leg_11", CubeListBuilder.create().texOffs(52, 18).addBox(-0.5f, -1.5f, -1.0f, 1, 7, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.7976891f));
        PartDefinition jointLB = mainbody.addOrReplaceChild("jointLB", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.5f, 0.5f, -6.0f));
        PartDefinition body_3 = jointLB.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(22, 16).addBox(-2.0f, -2.0f, -2.0f, 5, 4, 4), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, -0.43633232f, 0.27925268f));
        PartDefinition body_4 = body_3.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(12, 2).addBox(-0.5f, -1.0f, -1.0f, 4, 2, 2), PartPose.offsetAndRotation(3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.38397244f));
        PartDefinition jointFRLX = mainbody.addOrReplaceChild("jointFRLX", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.7f, 3.0f, -9.5f));
        PartDefinition JD_1 = jointFRLX.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(58, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 2.7576203f, 0.0f));
        PartDefinition jointFRLY = JD_1.addOrReplaceChild("jointFRLY", CubeListBuilder.create().texOffs(4, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_3 = jointFRLY.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(8, 6).addBox(-0.5f, 0.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.43633232f));
        PartDefinition jointFRL1 = leg_3.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(12, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.0f, 0.0f));
        PartDefinition leg_4 = jointFRL1.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(16, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.4486233f));
        PartDefinition jointFRL2 = leg_4.addOrReplaceChild("jointFRL2", CubeListBuilder.create().texOffs(20, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 2.7f, 0.0f));
        PartDefinition leg_5 = jointFRL2.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(40, 16).addBox(-0.5f, -1.7f, -1.0f, 1, 8, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.7976891f));
        PartDefinition head = mainbody.addOrReplaceChild("head", CubeListBuilder.create().texOffs(20, 0).addBox(-4.0f, -4.0f, -4.0f, 8, 8, 8), PartPose.offsetAndRotation(0.0f, -0.3f, -7.1f, -0.17453292f, 0.0f, 0.0f));
        PartDefinition hair_jointRTRR = head.addOrReplaceChild("hair_jointRTRR", CubeListBuilder.create().texOffs(16, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.5f, -3.0f, -1.4f));
        PartDefinition hair_28 = hair_jointRTRR.addOrReplaceChild("hair_28", CubeListBuilder.create().texOffs(44, 35).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.3212879f, 1.0821041f, 0.0f));
        PartDefinition hair_jointRR1 = hair_28.addOrReplaceChild("hair_jointRR1", CubeListBuilder.create().texOffs(49, 35).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_29 = hair_jointRR1.addOrReplaceChild("hair_29", CubeListBuilder.create().texOffs(18, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.82030475f, 0.0f, 0.0f));
        PartDefinition hair_jointRR2 = hair_29.addOrReplaceChild("hair_jointRR2", CubeListBuilder.create().texOffs(23, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_30 = hair_jointRR2.addOrReplaceChild("hair_30", CubeListBuilder.create().texOffs(26, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointRR3 = hair_30.addOrReplaceChild("hair_jointRR3", CubeListBuilder.create().texOffs(52, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_31 = hair_jointRR3.addOrReplaceChild("hair_31", CubeListBuilder.create().texOffs(53, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointRR4 = hair_31.addOrReplaceChild("hair_jointRR4", CubeListBuilder.create().texOffs(58, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_32 = hair_jointRR4.addOrReplaceChild("hair_32", CubeListBuilder.create().texOffs(13, 37).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition hair_jointRR5 = hair_32.addOrReplaceChild("hair_jointRR5", CubeListBuilder.create().texOffs(39, 37).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_33 = hair_jointRR5.addOrReplaceChild("hair_33", CubeListBuilder.create().texOffs(31, 38).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointRR6 = hair_33.addOrReplaceChild("hair_jointRR6", CubeListBuilder.create().texOffs(36, 38).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_34 = hair_jointRR6.addOrReplaceChild("hair_34", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointRTM = head.addOrReplaceChild("hair_jointRTM", CubeListBuilder.create().texOffs(8, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.5f, -3.4f));
        PartDefinition hair_14 = hair_jointRTM.addOrReplaceChild("hair_14", CubeListBuilder.create().texOffs(13, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.4609141f, 0.0f, 0.0f));
        PartDefinition hair_jointM1 = hair_14.addOrReplaceChild("hair_jointM1", CubeListBuilder.create().texOffs(42, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_15 = hair_jointM1.addOrReplaceChild("hair_15", CubeListBuilder.create().texOffs(43, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.82030475f, 0.0f, 0.0f));
        PartDefinition hair_jointM2 = hair_15.addOrReplaceChild("hair_jointM2", CubeListBuilder.create().texOffs(56, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_16 = hair_jointM2.addOrReplaceChild("hair_16", CubeListBuilder.create().texOffs(34, 30).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointM3 = hair_16.addOrReplaceChild("hair_jointM3", CubeListBuilder.create().texOffs(39, 30).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_17 = hair_jointM3.addOrReplaceChild("hair_17", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointM4 = hair_17.addOrReplaceChild("hair_jointM4", CubeListBuilder.create().texOffs(59, 30).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_18 = hair_jointM4.addOrReplaceChild("hair_18", CubeListBuilder.create().texOffs(8, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition hair_jointM5 = hair_18.addOrReplaceChild("hair_jointM5", CubeListBuilder.create().texOffs(5, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_19 = hair_jointM5.addOrReplaceChild("hair_19", CubeListBuilder.create().texOffs(48, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointM6 = hair_19.addOrReplaceChild("hair_jointM6", CubeListBuilder.create().texOffs(53, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_20 = hair_jointM6.addOrReplaceChild("hair_20", CubeListBuilder.create().texOffs(18, 32).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointRTLL = head.addOrReplaceChild("hair_jointRTLL", CubeListBuilder.create().texOffs(12, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.5f, -3.0f, -1.4f));
        PartDefinition hair_21 = hair_jointRTLL.addOrReplaceChild("hair_21", CubeListBuilder.create().texOffs(26, 32).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.3212879f, -1.0821041f, 0.0f));
        PartDefinition hair_jointLL1 = hair_21.addOrReplaceChild("hair_jointLL1", CubeListBuilder.create().texOffs(23, 32).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_22 = hair_jointLL1.addOrReplaceChild("hair_22", CubeListBuilder.create().texOffs(54, 32).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.82030475f, 0.0f, 0.0f));
        PartDefinition hair_jointLL2 = hair_22.addOrReplaceChild("hair_jointLL2", CubeListBuilder.create().texOffs(59, 32).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_23 = hair_jointLL2.addOrReplaceChild("hair_23", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointLL3 = hair_23.addOrReplaceChild("hair_jointLL3", CubeListBuilder.create().texOffs(31, 33).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_24 = hair_jointLL3.addOrReplaceChild("hair_24", CubeListBuilder.create().texOffs(39, 33).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointLL4 = hair_24.addOrReplaceChild("hair_jointLL4", CubeListBuilder.create().texOffs(44, 33).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_25 = hair_jointLL4.addOrReplaceChild("hair_25", CubeListBuilder.create().texOffs(32, 34).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition hair_jointLL5 = hair_25.addOrReplaceChild("hair_jointLL5", CubeListBuilder.create().texOffs(37, 34).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_26 = hair_jointLL5.addOrReplaceChild("hair_26", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointLL6 = hair_26.addOrReplaceChild("hair_jointLL6", CubeListBuilder.create().texOffs(5, 35).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_27 = hair_jointLL6.addOrReplaceChild("hair_27", CubeListBuilder.create().texOffs(8, 35).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointRTR = head.addOrReplaceChild("hair_jointRTR", CubeListBuilder.create().texOffs(4, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.0f, 0.0f, -2.4f));
        PartDefinition hair_7 = hair_jointRTR.addOrReplaceChild("hair_7", CubeListBuilder.create().texOffs(55, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.7576203f, 0.57595867f, 0.0f));
        PartDefinition hair_jointR1 = hair_7.addOrReplaceChild("hair_jointR1", CubeListBuilder.create().texOffs(18, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_8 = hair_jointR1.addOrReplaceChild("hair_8", CubeListBuilder.create().texOffs(35, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition hair_jointR2 = hair_8.addOrReplaceChild("hair_jointR2", CubeListBuilder.create().texOffs(48, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_9 = hair_jointR2.addOrReplaceChild("hair_9", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointR3 = hair_9.addOrReplaceChild("hair_jointR3", CubeListBuilder.create().texOffs(40, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_10 = hair_jointR3.addOrReplaceChild("hair_10", CubeListBuilder.create().texOffs(8, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointR4 = hair_10.addOrReplaceChild("hair_jointR4", CubeListBuilder.create().texOffs(5, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_11 = hair_jointR4.addOrReplaceChild("hair_11", CubeListBuilder.create().texOffs(48, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition hair_jointR5 = hair_11.addOrReplaceChild("hair_jointR5", CubeListBuilder.create().texOffs(20, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_12 = hair_jointR5.addOrReplaceChild("hair_12", CubeListBuilder.create().texOffs(21, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointR6 = hair_12.addOrReplaceChild("hair_jointR6", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_13 = hair_jointR6.addOrReplaceChild("hair_13", CubeListBuilder.create().texOffs(29, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointRTL = head.addOrReplaceChild("hair_jointRTL", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, 0.0f, -2.4f));
        PartDefinition hair = hair_jointRTL.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(17, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.7576203f, -0.57595867f, 0.0f));
        PartDefinition hair_jointL1 = hair.addOrReplaceChild("hair_jointL1", CubeListBuilder.create().texOffs(58, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_1 = hair_jointL1.addOrReplaceChild("hair_1", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition hair_jointL2 = hair_1.addOrReplaceChild("hair_jointL2", CubeListBuilder.create().texOffs(5, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_2 = hair_jointL2.addOrReplaceChild("hair_2", CubeListBuilder.create().texOffs(8, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointL3 = hair_2.addOrReplaceChild("hair_jointL3", CubeListBuilder.create().texOffs(13, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_3 = hair_jointL3.addOrReplaceChild("hair_3", CubeListBuilder.create().texOffs(22, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointL4 = hair_3.addOrReplaceChild("hair_jointL4", CubeListBuilder.create().texOffs(58, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_4 = hair_jointL4.addOrReplaceChild("hair_4", CubeListBuilder.create().texOffs(30, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition hair_jointL5 = hair_4.addOrReplaceChild("hair_jointL5", CubeListBuilder.create().texOffs(27, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_5 = hair_jointL5.addOrReplaceChild("hair_5", CubeListBuilder.create().texOffs(13, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointL6 = hair_5.addOrReplaceChild("hair_jointL6", CubeListBuilder.create().texOffs(35, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_6 = hair_jointL6.addOrReplaceChild("hair_6", CubeListBuilder.create().texOffs(43, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition jointBLLX = mainbody.addOrReplaceChild("jointBLLX", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.7f, 3.8f, -4.7f));
        PartDefinition JD_2 = jointBLLX.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(24, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.7853982f, 0.0f));
        PartDefinition jointBLLY = JD_2.addOrReplaceChild("jointBLLY", CubeListBuilder.create().texOffs(4, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_6 = jointBLLY.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(58, 8).addBox(-0.5f, 0.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.38397244f));
        PartDefinition jointBLL1 = leg_6.addOrReplaceChild("jointBLL1", CubeListBuilder.create().texOffs(12, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.0f, 0.0f));
        PartDefinition leg_7 = jointBLL1.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.4486233f));
        PartDefinition jointBLL2 = leg_7.addOrReplaceChild("jointBLL2", CubeListBuilder.create().texOffs(58, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.7f, 0.0f));
        PartDefinition leg_8 = jointBLL2.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(46, 16).addBox(-0.5f, -1.5f, -1.0f, 1, 7, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.7976891f));
        return LayerDefinition.create(mesh, 64, 50);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityParasiteBase parasite = (EntityParasiteBase)entity;
        this.jointFLLX.yRot = 0.0f;
        this.jointFLLY.zRot = 0.0f;
        this.jointFRLX.yRot = 0.0f;
        this.jointFRLY.zRot = 0.0f;
        this.jointFLL1.zRot = 0.0f;
        this.jointFRL1.zRot = 0.0f;
        this.jointBLLX.yRot = 0.0f;
        this.jointBLLY.zRot = 0.0f;
        this.jointBRLX.yRot = 0.0f;
        this.jointBRLY.zRot = 0.0f;
        this.mainbody.y = 0.0f;
        this.mainbody.xRot = 0.0f;
        this.hair_jointM1.xRot = 0.0f;
        this.hair_jointM2.xRot = 0.0f;
        this.hair_jointM3.xRot = 0.0f;
        this.hair_jointM4.xRot = 0.0f;
        this.hair_jointM5.xRot = 0.0f;
        this.hair_jointM6.xRot = 0.0f;
        this.hair_jointL1.xRot = 0.0f;
        this.hair_jointL2.xRot = 0.0f;
        this.hair_jointL3.xRot = 0.0f;
        this.hair_jointL4.xRot = 0.0f;
        this.hair_jointL5.xRot = 0.0f;
        this.hair_jointL6.xRot = 0.0f;
        this.hair_jointR1.xRot = 0.0f;
        this.hair_jointR2.xRot = 0.0f;
        this.hair_jointR3.xRot = 0.0f;
        this.hair_jointR4.xRot = 0.0f;
        this.hair_jointR5.xRot = 0.0f;
        this.hair_jointR6.xRot = 0.0f;
        this.hair_jointLL1.xRot = 0.0f;
        this.hair_jointLL2.xRot = 0.0f;
        this.hair_jointLL3.xRot = 0.0f;
        this.hair_jointLL4.xRot = 0.0f;
        this.hair_jointLL5.xRot = 0.0f;
        this.hair_jointLL6.xRot = 0.0f;
        this.hair_jointRR1.xRot = 0.0f;
        this.hair_jointRR2.xRot = 0.0f;
        this.hair_jointRR3.xRot = 0.0f;
        this.hair_jointRR4.xRot = 0.0f;
        this.hair_jointRR5.xRot = 0.0f;
        this.hair_jointRR6.xRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                float GS = 2.7f;
                float GD = 0.4f;
                this.swingY(this.jointFLLX, 0.2f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLLY, 0.2f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.2f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRLY, 0.2f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBLLX, 0.2f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBLLY, 0.2f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBRLX, 0.2f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBRLY, 0.2f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.4f * GS, 1, limbSwing, limbSwingAmount, 0.02f);
            }
            float f2 = Mth.cos((float)(ageInTicks * 0.1f)) * 0.05f;
            float nf2 = -1.0f * f2;
            this.hair_jointM1.xRot = f2;
            this.hair_jointM2.xRot = f2;
            this.hair_jointM3.xRot = f2;
            this.hair_jointM4.xRot = f2;
            this.hair_jointM5.xRot = f2;
            this.hair_jointM6.xRot = f2;
            this.hair_jointL1.xRot = nf2;
            this.hair_jointL2.xRot = nf2;
            this.hair_jointL3.xRot = nf2;
            this.hair_jointL4.xRot = nf2;
            this.hair_jointL5.xRot = nf2;
            this.hair_jointL6.xRot = nf2;
            this.hair_jointR1.xRot = nf2;
            this.hair_jointR2.xRot = nf2;
            this.hair_jointR3.xRot = nf2;
            this.hair_jointR4.xRot = nf2;
            this.hair_jointR5.xRot = nf2;
            this.hair_jointR6.xRot = nf2;
            this.hair_jointLL1.xRot = f2;
            this.hair_jointLL2.xRot = f2;
            this.hair_jointLL3.xRot = f2;
            this.hair_jointLL4.xRot = f2;
            this.hair_jointLL5.xRot = f2;
            this.hair_jointLL6.xRot = f2;
            this.hair_jointRR1.xRot = f2;
            this.hair_jointRR2.xRot = f2;
            this.hair_jointRR3.xRot = f2;
            this.hair_jointRR4.xRot = f2;
            this.hair_jointRR5.xRot = f2;
            this.hair_jointRR6.xRot = f2;
        } else if (i == 1 || i == 2) {
            if (!parasite.getStillAni()) {
                float GS = 1.2f;
                float GD = 0.5f;
                this.swingY(this.jointFLLX, 0.6f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLLY, 0.6f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.6f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRLY, 0.6f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBLLX, 0.6f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBLLY, 0.6f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBRLX, 0.6f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBRLY, 0.6f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 1.2f * GS, 1, limbSwing, limbSwingAmount, 0.02f);
            }
            float f2 = 0.3f + Mth.cos((float)(ageInTicks * 0.8f)) * 0.08f;
            float nf2 = 0.6f + -1.0f * f2;
            this.hair_jointM1.xRot = f2;
            this.hair_jointM2.xRot = f2;
            this.hair_jointM3.xRot = f2;
            this.hair_jointM4.xRot = f2;
            this.hair_jointM5.xRot = f2;
            this.hair_jointM6.xRot = f2;
            this.hair_jointL1.xRot = nf2;
            this.hair_jointL2.xRot = nf2;
            this.hair_jointL3.xRot = nf2;
            this.hair_jointL4.xRot = nf2;
            this.hair_jointL5.xRot = nf2;
            this.hair_jointL6.xRot = nf2;
            this.hair_jointR1.xRot = nf2;
            this.hair_jointR2.xRot = nf2;
            this.hair_jointR3.xRot = nf2;
            this.hair_jointR4.xRot = nf2;
            this.hair_jointR5.xRot = nf2;
            this.hair_jointR6.xRot = nf2;
            this.hair_jointLL1.xRot = f2;
            this.hair_jointLL2.xRot = f2;
            this.hair_jointLL3.xRot = f2;
            this.hair_jointLL4.xRot = f2;
            this.hair_jointLL5.xRot = f2;
            this.hair_jointLL6.xRot = f2;
            this.hair_jointRR1.xRot = f2;
            this.hair_jointRR2.xRot = f2;
            this.hair_jointRR3.xRot = f2;
            this.hair_jointRR4.xRot = f2;
            this.hair_jointRR5.xRot = f2;
            this.hair_jointRR6.xRot = f2;
        } else if (i == 10) {
            float f2 = Mth.cos((float)(ageInTicks * 0.9f)) * 0.04f;
            this.jointFLLY.zRot = -0.3f + f2;
            this.jointFRLY.zRot = -0.3f + f2;
            this.jointFLL1.zRot = -0.1f + f2 * 0.5f;
            this.jointFRL1.zRot = -0.1f + f2 * 0.5f;
            this.jointBLLY.zRot = f2 * 1.2f;
            this.jointBRLY.zRot = f2 * 1.2f;
            this.mainbody.xRot = -0.9f;
            f2 = 0.3f + Mth.cos((float)(ageInTicks * 0.8f)) * 0.08f;
            float nf2 = 0.6f + -1.0f * f2;
            this.hair_jointM1.xRot = f2;
            this.hair_jointM2.xRot = f2;
            this.hair_jointM3.xRot = f2;
            this.hair_jointM4.xRot = f2;
            this.hair_jointM5.xRot = f2;
            this.hair_jointM6.xRot = f2;
            this.hair_jointL1.xRot = nf2;
            this.hair_jointL2.xRot = nf2;
            this.hair_jointL3.xRot = nf2;
            this.hair_jointL4.xRot = nf2;
            this.hair_jointL5.xRot = nf2;
            this.hair_jointL6.xRot = nf2;
            this.hair_jointR1.xRot = nf2;
            this.hair_jointR2.xRot = nf2;
            this.hair_jointR3.xRot = nf2;
            this.hair_jointR4.xRot = nf2;
            this.hair_jointR5.xRot = nf2;
            this.hair_jointR6.xRot = nf2;
            this.hair_jointLL1.xRot = f2;
            this.hair_jointLL2.xRot = f2;
            this.hair_jointLL3.xRot = f2;
            this.hair_jointLL4.xRot = f2;
            this.hair_jointLL5.xRot = f2;
            this.hair_jointLL6.xRot = f2;
            this.hair_jointRR1.xRot = f2;
            this.hair_jointRR2.xRot = f2;
            this.hair_jointRR3.xRot = f2;
            this.hair_jointRR4.xRot = f2;
            this.hair_jointRR5.xRot = f2;
            this.hair_jointRR6.xRot = f2;
        }
        this.underground(parasite, ageInTicks, this.mainbody);
    
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
