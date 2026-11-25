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

public class ModelAta extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "ata"), "main");
    private final ModelPart mainbody;
    private final ModelPart head;
    private final ModelPart bottom;
    private final ModelPart lbody;
    private final ModelPart rbody;
    private final ModelPart lbody_1;
    private final ModelPart lbody_2;
    private final ModelPart lbody_3;
    private final ModelPart lbody_4;
    private final ModelPart lbody_5;
    private final ModelPart jointFLLX;
    private final ModelPart jointMLLX;
    private final ModelPart jointBLLX;
    private final ModelPart jointFRLX;
    private final ModelPart jointMRLX;
    private final ModelPart jointBRLX;
    private final ModelPart hair_jointRTL;
    private final ModelPart hair_jointRTR;
    private final ModelPart hair_jointRTM;
    private final ModelPart JD;
    private final ModelPart jointFLLY;
    private final ModelPart leg;
    private final ModelPart jointFLL1;
    private final ModelPart leg_1;
    private final ModelPart jointFLL2;
    private final ModelPart leg_2;
    private final ModelPart JD_1;
    private final ModelPart jointMLLY;
    private final ModelPart leg_3;
    private final ModelPart jointMLL1;
    private final ModelPart leg_4;
    private final ModelPart jointMLL2;
    private final ModelPart leg_5;
    private final ModelPart JD_2;
    private final ModelPart jointBLLY;
    private final ModelPart leg_6;
    private final ModelPart jointBLL1;
    private final ModelPart leg_7;
    private final ModelPart jointBLL2;
    private final ModelPart leg_8;
    private final ModelPart JD_3;
    private final ModelPart jointFRLY;
    private final ModelPart leg_9;
    private final ModelPart jointFRL1;
    private final ModelPart leg_10;
    private final ModelPart jointFRL2;
    private final ModelPart leg_11;
    private final ModelPart JD_4;
    private final ModelPart jointMRLY;
    private final ModelPart leg_12;
    private final ModelPart jointMRL1;
    private final ModelPart leg_13;
    private final ModelPart jointMRL2;
    private final ModelPart leg_14;
    private final ModelPart JD_5;
    private final ModelPart jointBRLY;
    private final ModelPart leg_15;
    private final ModelPart jointBRL1;
    private final ModelPart leg_16;
    private final ModelPart jointBRL2;
    private final ModelPart leg_17;
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

    public ModelAta(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.head = root.getChild("mainbody").getChild("head");
        this.bottom = root.getChild("mainbody").getChild("bottom");
        this.lbody = root.getChild("mainbody").getChild("lbody");
        this.rbody = root.getChild("mainbody").getChild("rbody");
        this.lbody_1 = root.getChild("mainbody").getChild("lbody_1");
        this.lbody_2 = root.getChild("mainbody").getChild("lbody_2");
        this.lbody_3 = root.getChild("mainbody").getChild("lbody_3");
        this.lbody_4 = root.getChild("mainbody").getChild("lbody_4");
        this.lbody_5 = root.getChild("mainbody").getChild("lbody_5");
        this.jointFLLX = root.getChild("mainbody").getChild("jointFLLX");
        this.jointMLLX = root.getChild("mainbody").getChild("jointMLLX");
        this.jointBLLX = root.getChild("mainbody").getChild("jointBLLX");
        this.jointFRLX = root.getChild("mainbody").getChild("jointFRLX");
        this.jointMRLX = root.getChild("mainbody").getChild("jointMRLX");
        this.jointBRLX = root.getChild("mainbody").getChild("jointBRLX");
        this.hair_jointRTL = root.getChild("mainbody").getChild("hair_jointRTL");
        this.hair_jointRTR = root.getChild("mainbody").getChild("hair_jointRTR");
        this.hair_jointRTM = root.getChild("mainbody").getChild("hair_jointRTM");
        this.JD = root.getChild("mainbody").getChild("jointFLLX").getChild("JD");
        this.jointFLLY = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY");
        this.leg = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg");
        this.jointFLL1 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1");
        this.leg_1 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1");
        this.jointFLL2 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2");
        this.leg_2 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2");
        this.JD_1 = root.getChild("mainbody").getChild("jointMLLX").getChild("JD_1");
        this.jointMLLY = root.getChild("mainbody").getChild("jointMLLX").getChild("JD_1").getChild("jointMLLY");
        this.leg_3 = root.getChild("mainbody").getChild("jointMLLX").getChild("JD_1").getChild("jointMLLY").getChild("leg_3");
        this.jointMLL1 = root.getChild("mainbody").getChild("jointMLLX").getChild("JD_1").getChild("jointMLLY").getChild("leg_3").getChild("jointMLL1");
        this.leg_4 = root.getChild("mainbody").getChild("jointMLLX").getChild("JD_1").getChild("jointMLLY").getChild("leg_3").getChild("jointMLL1").getChild("leg_4");
        this.jointMLL2 = root.getChild("mainbody").getChild("jointMLLX").getChild("JD_1").getChild("jointMLLY").getChild("leg_3").getChild("jointMLL1").getChild("leg_4").getChild("jointMLL2");
        this.leg_5 = root.getChild("mainbody").getChild("jointMLLX").getChild("JD_1").getChild("jointMLLY").getChild("leg_3").getChild("jointMLL1").getChild("leg_4").getChild("jointMLL2").getChild("leg_5");
        this.JD_2 = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2");
        this.jointBLLY = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2").getChild("jointBLLY");
        this.leg_6 = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2").getChild("jointBLLY").getChild("leg_6");
        this.jointBLL1 = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2").getChild("jointBLLY").getChild("leg_6").getChild("jointBLL1");
        this.leg_7 = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2").getChild("jointBLLY").getChild("leg_6").getChild("jointBLL1").getChild("leg_7");
        this.jointBLL2 = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2").getChild("jointBLLY").getChild("leg_6").getChild("jointBLL1").getChild("leg_7").getChild("jointBLL2");
        this.leg_8 = root.getChild("mainbody").getChild("jointBLLX").getChild("JD_2").getChild("jointBLLY").getChild("leg_6").getChild("jointBLL1").getChild("leg_7").getChild("jointBLL2").getChild("leg_8");
        this.JD_3 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_3");
        this.jointFRLY = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_3").getChild("jointFRLY");
        this.leg_9 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_3").getChild("jointFRLY").getChild("leg_9");
        this.jointFRL1 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_3").getChild("jointFRLY").getChild("leg_9").getChild("jointFRL1");
        this.leg_10 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_3").getChild("jointFRLY").getChild("leg_9").getChild("jointFRL1").getChild("leg_10");
        this.jointFRL2 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_3").getChild("jointFRLY").getChild("leg_9").getChild("jointFRL1").getChild("leg_10").getChild("jointFRL2");
        this.leg_11 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_3").getChild("jointFRLY").getChild("leg_9").getChild("jointFRL1").getChild("leg_10").getChild("jointFRL2").getChild("leg_11");
        this.JD_4 = root.getChild("mainbody").getChild("jointMRLX").getChild("JD_4");
        this.jointMRLY = root.getChild("mainbody").getChild("jointMRLX").getChild("JD_4").getChild("jointMRLY");
        this.leg_12 = root.getChild("mainbody").getChild("jointMRLX").getChild("JD_4").getChild("jointMRLY").getChild("leg_12");
        this.jointMRL1 = root.getChild("mainbody").getChild("jointMRLX").getChild("JD_4").getChild("jointMRLY").getChild("leg_12").getChild("jointMRL1");
        this.leg_13 = root.getChild("mainbody").getChild("jointMRLX").getChild("JD_4").getChild("jointMRLY").getChild("leg_12").getChild("jointMRL1").getChild("leg_13");
        this.jointMRL2 = root.getChild("mainbody").getChild("jointMRLX").getChild("JD_4").getChild("jointMRLY").getChild("leg_12").getChild("jointMRL1").getChild("leg_13").getChild("jointMRL2");
        this.leg_14 = root.getChild("mainbody").getChild("jointMRLX").getChild("JD_4").getChild("jointMRLY").getChild("leg_12").getChild("jointMRL1").getChild("leg_13").getChild("jointMRL2").getChild("leg_14");
        this.JD_5 = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_5");
        this.jointBRLY = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_5").getChild("jointBRLY");
        this.leg_15 = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_5").getChild("jointBRLY").getChild("leg_15");
        this.jointBRL1 = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_5").getChild("jointBRLY").getChild("leg_15").getChild("jointBRL1");
        this.leg_16 = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_5").getChild("jointBRLY").getChild("leg_15").getChild("jointBRL1").getChild("leg_16");
        this.jointBRL2 = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_5").getChild("jointBRLY").getChild("leg_15").getChild("jointBRL1").getChild("leg_16").getChild("jointBRL2");
        this.leg_17 = root.getChild("mainbody").getChild("jointBRLX").getChild("JD_5").getChild("jointBRLY").getChild("leg_15").getChild("jointBRL1").getChild("leg_16").getChild("jointBRL2").getChild("leg_17");
        this.hair = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair");
        this.hair_jointL1 = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1");
        this.hair_1 = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1");
        this.hair_jointL2 = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2");
        this.hair_2 = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2");
        this.hair_jointL3 = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3");
        this.hair_3 = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3");
        this.hair_jointL4 = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3").getChild("hair_jointL4");
        this.hair_4 = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3").getChild("hair_jointL4").getChild("hair_4");
        this.hair_jointL5 = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3").getChild("hair_jointL4").getChild("hair_4").getChild("hair_jointL5");
        this.hair_5 = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3").getChild("hair_jointL4").getChild("hair_4").getChild("hair_jointL5").getChild("hair_5");
        this.hair_jointL6 = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3").getChild("hair_jointL4").getChild("hair_4").getChild("hair_jointL5").getChild("hair_5").getChild("hair_jointL6");
        this.hair_6 = root.getChild("mainbody").getChild("hair_jointRTL").getChild("hair").getChild("hair_jointL1").getChild("hair_1").getChild("hair_jointL2").getChild("hair_2").getChild("hair_jointL3").getChild("hair_3").getChild("hair_jointL4").getChild("hair_4").getChild("hair_jointL5").getChild("hair_5").getChild("hair_jointL6").getChild("hair_6");
        this.hair_7 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7");
        this.hair_jointR1 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1");
        this.hair_8 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8");
        this.hair_jointR2 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2");
        this.hair_9 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9");
        this.hair_jointR3 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3");
        this.hair_10 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10");
        this.hair_jointR4 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10").getChild("hair_jointR4");
        this.hair_11 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10").getChild("hair_jointR4").getChild("hair_11");
        this.hair_jointR5 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10").getChild("hair_jointR4").getChild("hair_11").getChild("hair_jointR5");
        this.hair_12 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10").getChild("hair_jointR4").getChild("hair_11").getChild("hair_jointR5").getChild("hair_12");
        this.hair_jointR6 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10").getChild("hair_jointR4").getChild("hair_11").getChild("hair_jointR5").getChild("hair_12").getChild("hair_jointR6");
        this.hair_13 = root.getChild("mainbody").getChild("hair_jointRTR").getChild("hair_7").getChild("hair_jointR1").getChild("hair_8").getChild("hair_jointR2").getChild("hair_9").getChild("hair_jointR3").getChild("hair_10").getChild("hair_jointR4").getChild("hair_11").getChild("hair_jointR5").getChild("hair_12").getChild("hair_jointR6").getChild("hair_13");
        this.hair_14 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14");
        this.hair_jointM1 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1");
        this.hair_15 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15");
        this.hair_jointM2 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2");
        this.hair_16 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16");
        this.hair_jointM3 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3");
        this.hair_17 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17");
        this.hair_jointM4 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17").getChild("hair_jointM4");
        this.hair_18 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17").getChild("hair_jointM4").getChild("hair_18");
        this.hair_jointM5 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17").getChild("hair_jointM4").getChild("hair_18").getChild("hair_jointM5");
        this.hair_19 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17").getChild("hair_jointM4").getChild("hair_18").getChild("hair_jointM5").getChild("hair_19");
        this.hair_jointM6 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17").getChild("hair_jointM4").getChild("hair_18").getChild("hair_jointM5").getChild("hair_19").getChild("hair_jointM6");
        this.hair_20 = root.getChild("mainbody").getChild("hair_jointRTM").getChild("hair_14").getChild("hair_jointM1").getChild("hair_15").getChild("hair_jointM2").getChild("hair_16").getChild("hair_jointM3").getChild("hair_17").getChild("hair_jointM4").getChild("hair_18").getChild("hair_jointM5").getChild("hair_19").getChild("hair_jointM6").getChild("hair_20");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0f, -1.0f, -5.0f, 2, 2, 5), PartPose.offset(0.0f, 18.5f, 1.7f));
        PartDefinition lbody_3 = mainbody.addOrReplaceChild("lbody_3", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0f, -3.1f, -2.0f, 4, 5, 4), PartPose.offsetAndRotation(-3.5f, -7.3f, -2.3f, -0.56548667f, 0.0f, 0.31415927f));
        PartDefinition bottom = mainbody.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -3.0f, 0.0f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.7f, -5.2f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointRTM = mainbody.addOrReplaceChild("hair_jointRTM", CubeListBuilder.create().texOffs(26, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -3.4f, -6.0f));
        PartDefinition hair_14 = hair_jointRTM.addOrReplaceChild("hair_14", CubeListBuilder.create().texOffs(42, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 2.136283f, 0.0f, 0.0f));
        PartDefinition hair_jointM1 = hair_14.addOrReplaceChild("hair_jointM1", CubeListBuilder.create().texOffs(56, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_15 = hair_jointM1.addOrReplaceChild("hair_15", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.56199604f, 0.0f, 0.0f));
        PartDefinition hair_jointM2 = hair_15.addOrReplaceChild("hair_jointM2", CubeListBuilder.create().texOffs(47, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_16 = hair_jointM2.addOrReplaceChild("hair_16", CubeListBuilder.create().texOffs(31, 30).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.54803336f, 0.0f, 0.0f));
        PartDefinition hair_jointM3 = hair_16.addOrReplaceChild("hair_jointM3", CubeListBuilder.create().texOffs(59, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_17 = hair_jointM3.addOrReplaceChild("hair_17", CubeListBuilder.create().texOffs(10, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.6736971f, 0.0f, 0.0f));
        PartDefinition hair_jointM4 = hair_17.addOrReplaceChild("hair_jointM4", CubeListBuilder.create().texOffs(15, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_18 = hair_jointM4.addOrReplaceChild("hair_18", CubeListBuilder.create().texOffs(18, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition hair_jointM5 = hair_18.addOrReplaceChild("hair_jointM5", CubeListBuilder.create().texOffs(23, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_19 = hair_jointM5.addOrReplaceChild("hair_19", CubeListBuilder.create().texOffs(26, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointM6 = hair_19.addOrReplaceChild("hair_jointM6", CubeListBuilder.create().texOffs(58, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_20 = hair_jointM6.addOrReplaceChild("hair_20", CubeListBuilder.create().texOffs(5, 32).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition lbody_1 = mainbody.addOrReplaceChild("lbody_1", CubeListBuilder.create().texOffs(46, 0).addBox(-2.0f, -3.1f, -2.0f, 4, 6, 3), PartPose.offsetAndRotation(0.0f, -2.3f, -1.3f, -0.56548667f, 0.0f, 0.0f));
        PartDefinition jointFLLX = mainbody.addOrReplaceChild("jointFLLX", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.7f, 0.9f, -4.0f));
        PartDefinition JD = jointFLLX.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(38, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.38397244f, 0.0f));
        PartDefinition jointFLLY = JD.addOrReplaceChild("jointFLLY", CubeListBuilder.create().texOffs(42, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg = jointFLLY.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.81332344f));
        PartDefinition jointFLL1 = leg.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(12, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 2.0f, 0.0f));
        PartDefinition leg_1 = jointFLL1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(16, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.3159783f));
        PartDefinition jointFLL2 = leg_1.addOrReplaceChild("jointFLL2", CubeListBuilder.create().texOffs(20, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 1.7f, 0.0f));
        PartDefinition leg_2 = jointFLL2.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(59, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7784169f));
        PartDefinition lbody_4 = mainbody.addOrReplaceChild("lbody_4", CubeListBuilder.create().texOffs(36, 9).addBox(-3.0f, -3.1f, -4.0f, 6, 7, 6), PartPose.offsetAndRotation(0.0f, -7.3f, 1.7f, -0.31415927f, 0.0f, 0.0f));
        PartDefinition hair_jointRTR = mainbody.addOrReplaceChild("hair_jointRTR", CubeListBuilder.create().texOffs(13, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.7f, -2.4f, -6.5f));
        PartDefinition hair_7 = hair_jointRTR.addOrReplaceChild("hair_7", CubeListBuilder.create().texOffs(31, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 2.8274333f, 0.57595867f, 0.0f));
        PartDefinition hair_jointR1 = hair_7.addOrReplaceChild("hair_jointR1", CubeListBuilder.create().texOffs(51, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_8 = hair_jointR1.addOrReplaceChild("hair_8", CubeListBuilder.create().texOffs(10, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.5794493f, 0.0f, 0.0f));
        PartDefinition hair_jointR2 = hair_8.addOrReplaceChild("hair_jointR2", CubeListBuilder.create().texOffs(36, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_9 = hair_jointR2.addOrReplaceChild("hair_9", CubeListBuilder.create().texOffs(18, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointR3 = hair_9.addOrReplaceChild("hair_jointR3", CubeListBuilder.create().texOffs(15, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_10 = hair_jointR3.addOrReplaceChild("hair_10", CubeListBuilder.create().texOffs(26, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointR4 = hair_10.addOrReplaceChild("hair_jointR4", CubeListBuilder.create().texOffs(23, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_11 = hair_jointR4.addOrReplaceChild("hair_11", CubeListBuilder.create().texOffs(5, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition hair_jointR5 = hair_11.addOrReplaceChild("hair_jointR5", CubeListBuilder.create().texOffs(59, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_12 = hair_jointR5.addOrReplaceChild("hair_12", CubeListBuilder.create().texOffs(36, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointR6 = hair_12.addOrReplaceChild("hair_jointR6", CubeListBuilder.create().texOffs(41, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_13 = hair_jointR6.addOrReplaceChild("hair_13", CubeListBuilder.create().texOffs(51, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition lbody_5 = mainbody.addOrReplaceChild("lbody_5", CubeListBuilder.create().texOffs(12, 12).addBox(-2.0f, -3.1f, -2.0f, 4, 7, 4), PartPose.offsetAndRotation(0.0f, -8.3f, 3.7f, 0.06283186f, 0.0f, 0.0f));
        PartDefinition lbody_2 = mainbody.addOrReplaceChild("lbody_2", CubeListBuilder.create().texOffs(26, 5).addBox(-2.0f, -3.1f, -2.0f, 4, 5, 4), PartPose.offsetAndRotation(3.5f, -7.3f, -2.3f, -0.56548667f, 0.0f, -0.31415927f));
        PartDefinition head = mainbody.addOrReplaceChild("head", CubeListBuilder.create().texOffs(14, 0).addBox(-2.0f, -1.5f, -3.0f, 4, 3, 4), PartPose.offsetAndRotation(0.0f, -1.6f, -4.1f, -0.5235988f, 0.0f, 0.0f));
        PartDefinition jointMLLX = mainbody.addOrReplaceChild("jointMLLX", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.7f, 0.9f, -2.5f));
        PartDefinition JD_1 = jointMLLX.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(24, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.06981317f, 0.0f));
        PartDefinition jointMLLY = JD_1.addOrReplaceChild("jointMLLY", CubeListBuilder.create().texOffs(38, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_3 = jointMLLY.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(19, 9).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.81332344f));
        PartDefinition jointMLL1 = leg_3.addOrReplaceChild("jointMLL1", CubeListBuilder.create().texOffs(42, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 2.0f, 0.0f));
        PartDefinition leg_4 = jointMLL1.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(54, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.3159783f));
        PartDefinition jointMLL2 = leg_4.addOrReplaceChild("jointMLL2", CubeListBuilder.create().texOffs(12, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 1.7f, 0.0f));
        PartDefinition leg_5 = jointMLL2.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(28, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7784169f));
        PartDefinition rbody = mainbody.addOrReplaceChild("rbody", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0f, -1.5f, -2.0f, 2, 3, 2), PartPose.offsetAndRotation(-2.0f, -1.3f, 0.0f, 0.50265485f, 0.0f, -0.15707964f));
        PartDefinition jointFRLX = mainbody.addOrReplaceChild("jointFRLX", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.7f, 0.9f, -4.0f));
        PartDefinition JD_3 = jointFRLX.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(31, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 2.7576203f, 0.0f));
        PartDefinition jointFRLY = JD_3.addOrReplaceChild("jointFRLY", CubeListBuilder.create().texOffs(3, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_9 = jointFRLY.addOrReplaceChild("leg_9", CubeListBuilder.create().texOffs(28, 18).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.81332344f));
        PartDefinition jointFRL1 = leg_9.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 2.0f, 0.0f));
        PartDefinition leg_10 = jointFRL1.addOrReplaceChild("leg_10", CubeListBuilder.create().texOffs(32, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.3159783f));
        PartDefinition jointFRL2 = leg_10.addOrReplaceChild("jointFRL2", CubeListBuilder.create().texOffs(3, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 1.7f, 0.0f));
        PartDefinition leg_11 = jointFRL2.addOrReplaceChild("leg_11", CubeListBuilder.create().texOffs(7, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7784169f));
        PartDefinition jointBRLX = mainbody.addOrReplaceChild("jointBRLX", CubeListBuilder.create().texOffs(57, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.7f, 0.9f, -1.0f));
        PartDefinition JD_5 = jointBRLX.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(43, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.7750735f, 0.0f));
        PartDefinition jointBRLY = JD_5.addOrReplaceChild("jointBRLY", CubeListBuilder.create().texOffs(47, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_15 = jointBRLY.addOrReplaceChild("leg_15", CubeListBuilder.create().texOffs(51, 22).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.81332344f));
        PartDefinition jointBRL1 = leg_15.addOrReplaceChild("jointBRL1", CubeListBuilder.create().texOffs(55, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 2.0f, 0.0f));
        PartDefinition leg_16 = jointBRL1.addOrReplaceChild("leg_16", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.3159783f));
        PartDefinition jointBRL2 = leg_16.addOrReplaceChild("jointBRL2", CubeListBuilder.create().texOffs(10, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 1.7f, 0.0f));
        PartDefinition leg_17 = jointBRL2.addOrReplaceChild("leg_17", CubeListBuilder.create().texOffs(14, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7784169f));
        PartDefinition jointMRLX = mainbody.addOrReplaceChild("jointMRLX", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.7f, 0.9f, -2.5f));
        PartDefinition JD_4 = jointMRLX.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 3.0717795f, 0.0f));
        PartDefinition jointMRLY = JD_4.addOrReplaceChild("jointMRLY", CubeListBuilder.create().texOffs(28, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_12 = jointMRLY.addOrReplaceChild("leg_12", CubeListBuilder.create().texOffs(59, 21).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.81332344f));
        PartDefinition jointMRL1 = leg_12.addOrReplaceChild("jointMRL1", CubeListBuilder.create().texOffs(3, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 2.0f, 0.0f));
        PartDefinition leg_13 = jointMRL1.addOrReplaceChild("leg_13", CubeListBuilder.create().texOffs(31, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.3159783f));
        PartDefinition jointMRL2 = leg_13.addOrReplaceChild("jointMRL2", CubeListBuilder.create().texOffs(35, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 1.7f, 0.0f));
        PartDefinition leg_14 = jointMRL2.addOrReplaceChild("leg_14", CubeListBuilder.create().texOffs(39, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7784169f));
        PartDefinition lbody = mainbody.addOrReplaceChild("lbody", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0f, -1.5f, -2.0f, 2, 3, 2), PartPose.offsetAndRotation(2.0f, -1.3f, 0.0f, 0.50265485f, 0.0f, 0.15707964f));
        PartDefinition jointBLLX = mainbody.addOrReplaceChild("jointBLLX", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.7f, 0.9f, -1.0f));
        PartDefinition JD_2 = jointBLLX.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(54, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.36651915f, 0.0f));
        PartDefinition jointBLLY = JD_2.addOrReplaceChild("jointBLLY", CubeListBuilder.create().texOffs(58, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_6 = jointBLLY.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(32, 14).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.81332344f));
        PartDefinition jointBLL1 = leg_6.addOrReplaceChild("jointBLL1", CubeListBuilder.create().texOffs(24, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 2.0f, 0.0f));
        PartDefinition leg_7 = jointBLL1.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.3159783f));
        PartDefinition jointBLL2 = leg_7.addOrReplaceChild("jointBLL2", CubeListBuilder.create().texOffs(4, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 1.7f, 0.0f));
        PartDefinition leg_8 = jointBLL2.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(8, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7784169f));
        PartDefinition hair_jointRTL = mainbody.addOrReplaceChild("hair_jointRTL", CubeListBuilder.create().texOffs(9, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.7f, -2.4f, -6.5f));
        PartDefinition hair = hair_jointRTL.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(18, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 2.8274333f, -0.57595867f, 0.0f));
        PartDefinition hair_jointL1 = hair.addOrReplaceChild("hair_jointL1", CubeListBuilder.create().texOffs(23, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_1 = hair_jointL1.addOrReplaceChild("hair_1", CubeListBuilder.create().texOffs(26, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.5794493f, 0.0f, 0.0f));
        PartDefinition hair_jointL2 = hair_1.addOrReplaceChild("hair_jointL2", CubeListBuilder.create().texOffs(4, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_2 = hair_jointL2.addOrReplaceChild("hair_2", CubeListBuilder.create().texOffs(5, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointL3 = hair_2.addOrReplaceChild("hair_jointL3", CubeListBuilder.create().texOffs(34, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_3 = hair_jointL3.addOrReplaceChild("hair_3", CubeListBuilder.create().texOffs(40, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointL4 = hair_3.addOrReplaceChild("hair_jointL4", CubeListBuilder.create().texOffs(45, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_4 = hair_jointL4.addOrReplaceChild("hair_4", CubeListBuilder.create().texOffs(52, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition hair_jointL5 = hair_4.addOrReplaceChild("hair_jointL5", CubeListBuilder.create().texOffs(57, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_5 = hair_jointL5.addOrReplaceChild("hair_5", CubeListBuilder.create().texOffs(46, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointL6 = hair_5.addOrReplaceChild("hair_jointL6", CubeListBuilder.create().texOffs(10, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_6 = hair_jointL6.addOrReplaceChild("hair_6", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 64, 64);
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
        this.jointMLLX.yRot = 0.0f;
        this.jointMLLY.zRot = 0.0f;
        this.jointMRLX.yRot = 0.0f;
        this.jointMRLY.zRot = 0.0f;
        this.jointBLLX.yRot = 0.0f;
        this.jointBLLY.zRot = 0.0f;
        this.jointBRLX.yRot = 0.0f;
        this.jointBRLY.zRot = 0.0f;
        this.mainbody.y = 0.0f;
        this.mainbody.xRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                float GS = 2.7f;
                float GD = 0.4f;
                this.swingY(this.jointFLLX, 0.2f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLLY, 0.2f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.2f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRLY, 0.2f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointMLLX, 0.2f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointMLLY, 0.2f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointMRLX, 0.2f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointMRLY, 0.2f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBLLX, 0.2f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBLLY, 0.2f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBRLX, 0.2f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBRLY, 0.2f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
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
        } else if (i == 1 || i == 2) {
            if (!parasite.getStillAni()) {
                float GS = 1.2f;
                float GD = 0.5f;
                this.swingY(this.jointFLLX, 0.6f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLLY, 0.6f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.6f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRLY, 0.6f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointMLLX, 0.6f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointMLLY, 0.6f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointMRLX, 0.6f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointMRLY, 0.6f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBLLX, 0.6f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBLLY, 0.6f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBRLX, 0.6f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBRLY, 0.6f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
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
        } else if (i == 10) {
            float f2 = Mth.cos((float)(ageInTicks * 0.9f)) * 0.04f;
            this.jointFLLY.zRot = -0.3f + f2;
            this.jointFRLY.zRot = -0.3f + f2;
            this.jointFLL1.zRot = -0.1f + f2 * 0.5f;
            this.jointFRL1.zRot = -0.1f + f2 * 0.5f;
            this.jointMLLY.zRot = f2 * -1.2f;
            this.jointMRLY.zRot = f2 * -1.2f;
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
