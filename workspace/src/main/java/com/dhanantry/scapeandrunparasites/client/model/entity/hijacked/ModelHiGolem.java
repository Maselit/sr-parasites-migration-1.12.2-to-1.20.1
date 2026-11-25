package com.dhanantry.scapeandrunparasites.client.model.entity.hijacked;

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

public class ModelHiGolem extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "higolem"), "main");
    private final ModelPart mainbody;
    private final ModelPart b;
    private final ModelPart b_1;
    private final ModelPart b_2;
    private final ModelPart b_3;
    private final ModelPart b_4;
    private final ModelPart b_5;
    private final ModelPart b_6;
    private final ModelPart b_7;
    private final ModelPart b_8;
    private final ModelPart jointLL1;
    private final ModelPart bf;
    private final ModelPart bf_1;
    private final ModelPart bf_2;
    private final ModelPart bf_3;
    private final ModelPart bf_4;
    private final ModelPart bf_5;
    private final ModelPart bf_6;
    private final ModelPart bf_7;
    private final ModelPart bf_8;
    private final ModelPart bf_9;
    private final ModelPart bf_10;
    private final ModelPart bf_11;
    private final ModelPart bf_12;
    private final ModelPart bf_13;
    private final ModelPart bf_14;
    private final ModelPart bf_15;
    private final ModelPart jointRL1;
    private final ModelPart bf_16;
    private final ModelPart bf_17;
    private final ModelPart bf_18;
    private final ModelPart jointH;
    private final ModelPart jointLA1;
    private final ModelPart jointRA1;
    private final ModelPart h;
    private final ModelPart h_1;
    private final ModelPart bf_19;
    private final ModelPart bf_20;
    private final ModelPart bf_21;
    private final ModelPart bf_22;
    private final ModelPart jointDR1;
    private final ModelPart jointDL1;
    private final ModelPart jointDM1;
    private final ModelPart hair;
    private final ModelPart jointDR2;
    private final ModelPart hair_1;
    private final ModelPart jointDR3;
    private final ModelPart hair_2;
    private final ModelPart jointDR4;
    private final ModelPart hair_3;
    private final ModelPart hair_4;
    private final ModelPart jointDL2;
    private final ModelPart hair_5;
    private final ModelPart jointDL3;
    private final ModelPart hair_6;
    private final ModelPart jointDL4;
    private final ModelPart hair_7;
    private final ModelPart hair_8;
    private final ModelPart jointDM2;
    private final ModelPart hair_9;
    private final ModelPart jointDM3;
    private final ModelPart hair_10;
    private final ModelPart jointDM4;
    private final ModelPart hair_11;
    private final ModelPart a;
    private final ModelPart jointLA2;
    private final ModelPart ad;
    private final ModelPart ad_1;
    private final ModelPart ad_2;
    private final ModelPart a_1;
    private final ModelPart bf_23;
    private final ModelPart bf_24;
    private final ModelPart a_2;
    private final ModelPart ad_3;
    private final ModelPart ad_4;
    private final ModelPart ad_5;
    private final ModelPart jointRA2;
    private final ModelPart a_3;
    private final ModelPart bf_25;
    private final ModelPart bf_26;
    private final ModelPart l;
    private final ModelPart jointLL2;
    private final ModelPart bf_27;
    private final ModelPart l_1;
    private final ModelPart bf_28;
    private final ModelPart bf_29;
    private final ModelPart l_2;
    private final ModelPart bf_30;
    private final ModelPart jointRL2;
    private final ModelPart l_3;
    private final ModelPart bf_31;
    private final ModelPart bf_32;

    public ModelHiGolem(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.b = root.getChild("mainbody").getChild("b");
        this.b_1 = root.getChild("mainbody").getChild("b_1");
        this.b_2 = root.getChild("mainbody").getChild("b_2");
        this.b_3 = root.getChild("mainbody").getChild("b_3");
        this.b_4 = root.getChild("mainbody").getChild("b_4");
        this.b_5 = root.getChild("mainbody").getChild("b_5");
        this.b_6 = root.getChild("mainbody").getChild("b_6");
        this.b_7 = root.getChild("mainbody").getChild("b_7");
        this.b_8 = root.getChild("mainbody").getChild("b_8");
        this.jointLL1 = root.getChild("mainbody").getChild("jointLL1");
        this.bf = root.getChild("mainbody").getChild("bf");
        this.bf_1 = root.getChild("mainbody").getChild("bf_1");
        this.bf_2 = root.getChild("mainbody").getChild("bf_2");
        this.bf_3 = root.getChild("mainbody").getChild("bf_3");
        this.bf_4 = root.getChild("mainbody").getChild("bf_4");
        this.bf_5 = root.getChild("mainbody").getChild("bf_5");
        this.bf_6 = root.getChild("mainbody").getChild("bf_6");
        this.bf_7 = root.getChild("mainbody").getChild("bf_7");
        this.bf_8 = root.getChild("mainbody").getChild("bf_8");
        this.bf_9 = root.getChild("mainbody").getChild("bf_9");
        this.bf_10 = root.getChild("mainbody").getChild("bf_10");
        this.bf_11 = root.getChild("mainbody").getChild("bf_11");
        this.bf_12 = root.getChild("mainbody").getChild("bf_12");
        this.bf_13 = root.getChild("mainbody").getChild("bf_13");
        this.bf_14 = root.getChild("mainbody").getChild("bf_14");
        this.bf_15 = root.getChild("mainbody").getChild("bf_15");
        this.jointRL1 = root.getChild("mainbody").getChild("jointRL1");
        this.bf_16 = root.getChild("mainbody").getChild("bf_16");
        this.bf_17 = root.getChild("mainbody").getChild("bf_17");
        this.bf_18 = root.getChild("mainbody").getChild("bf_18");
        this.jointH = root.getChild("mainbody").getChild("b").getChild("jointH");
        this.jointLA1 = root.getChild("mainbody").getChild("b").getChild("jointLA1");
        this.jointRA1 = root.getChild("mainbody").getChild("b").getChild("jointRA1");
        this.h = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("h");
        this.h_1 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("h_1");
        this.bf_19 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("bf_19");
        this.bf_20 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("bf_20");
        this.bf_21 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("bf_21");
        this.bf_22 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("bf_22");
        this.jointDR1 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDR1");
        this.jointDL1 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDL1");
        this.jointDM1 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDM1");
        this.hair = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDR1").getChild("hair");
        this.jointDR2 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDR1").getChild("hair").getChild("jointDR2");
        this.hair_1 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDR1").getChild("hair").getChild("jointDR2").getChild("hair_1");
        this.jointDR3 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDR1").getChild("hair").getChild("jointDR2").getChild("hair_1").getChild("jointDR3");
        this.hair_2 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDR1").getChild("hair").getChild("jointDR2").getChild("hair_1").getChild("jointDR3").getChild("hair_2");
        this.jointDR4 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDR1").getChild("hair").getChild("jointDR2").getChild("hair_1").getChild("jointDR3").getChild("hair_2").getChild("jointDR4");
        this.hair_3 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDR1").getChild("hair").getChild("jointDR2").getChild("hair_1").getChild("jointDR3").getChild("hair_2").getChild("jointDR4").getChild("hair_3");
        this.hair_4 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDL1").getChild("hair_4");
        this.jointDL2 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDL1").getChild("hair_4").getChild("jointDL2");
        this.hair_5 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDL1").getChild("hair_4").getChild("jointDL2").getChild("hair_5");
        this.jointDL3 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDL1").getChild("hair_4").getChild("jointDL2").getChild("hair_5").getChild("jointDL3");
        this.hair_6 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDL1").getChild("hair_4").getChild("jointDL2").getChild("hair_5").getChild("jointDL3").getChild("hair_6");
        this.jointDL4 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDL1").getChild("hair_4").getChild("jointDL2").getChild("hair_5").getChild("jointDL3").getChild("hair_6").getChild("jointDL4");
        this.hair_7 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDL1").getChild("hair_4").getChild("jointDL2").getChild("hair_5").getChild("jointDL3").getChild("hair_6").getChild("jointDL4").getChild("hair_7");
        this.hair_8 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDM1").getChild("hair_8");
        this.jointDM2 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDM1").getChild("hair_8").getChild("jointDM2");
        this.hair_9 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDM1").getChild("hair_8").getChild("jointDM2").getChild("hair_9");
        this.jointDM3 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDM1").getChild("hair_8").getChild("jointDM2").getChild("hair_9").getChild("jointDM3");
        this.hair_10 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDM1").getChild("hair_8").getChild("jointDM2").getChild("hair_9").getChild("jointDM3").getChild("hair_10");
        this.jointDM4 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDM1").getChild("hair_8").getChild("jointDM2").getChild("hair_9").getChild("jointDM3").getChild("hair_10").getChild("jointDM4");
        this.hair_11 = root.getChild("mainbody").getChild("b").getChild("jointH").getChild("jointDM1").getChild("hair_8").getChild("jointDM2").getChild("hair_9").getChild("jointDM3").getChild("hair_10").getChild("jointDM4").getChild("hair_11");
        this.a = root.getChild("mainbody").getChild("b").getChild("jointLA1").getChild("a");
        this.jointLA2 = root.getChild("mainbody").getChild("b").getChild("jointLA1").getChild("a").getChild("jointLA2");
        this.ad = root.getChild("mainbody").getChild("b").getChild("jointLA1").getChild("a").getChild("ad");
        this.ad_1 = root.getChild("mainbody").getChild("b").getChild("jointLA1").getChild("a").getChild("ad_1");
        this.ad_2 = root.getChild("mainbody").getChild("b").getChild("jointLA1").getChild("a").getChild("ad_2");
        this.a_1 = root.getChild("mainbody").getChild("b").getChild("jointLA1").getChild("a").getChild("jointLA2").getChild("a_1");
        this.bf_23 = root.getChild("mainbody").getChild("b").getChild("jointLA1").getChild("a").getChild("jointLA2").getChild("a_1").getChild("bf_23");
        this.bf_24 = root.getChild("mainbody").getChild("b").getChild("jointLA1").getChild("a").getChild("jointLA2").getChild("a_1").getChild("bf_24");
        this.a_2 = root.getChild("mainbody").getChild("b").getChild("jointRA1").getChild("a_2");
        this.ad_3 = root.getChild("mainbody").getChild("b").getChild("jointRA1").getChild("a_2").getChild("ad_3");
        this.ad_4 = root.getChild("mainbody").getChild("b").getChild("jointRA1").getChild("a_2").getChild("ad_4");
        this.ad_5 = root.getChild("mainbody").getChild("b").getChild("jointRA1").getChild("a_2").getChild("ad_5");
        this.jointRA2 = root.getChild("mainbody").getChild("b").getChild("jointRA1").getChild("a_2").getChild("jointRA2");
        this.a_3 = root.getChild("mainbody").getChild("b").getChild("jointRA1").getChild("a_2").getChild("jointRA2").getChild("a_3");
        this.bf_25 = root.getChild("mainbody").getChild("b").getChild("jointRA1").getChild("a_2").getChild("jointRA2").getChild("a_3").getChild("bf_25");
        this.bf_26 = root.getChild("mainbody").getChild("b").getChild("jointRA1").getChild("a_2").getChild("jointRA2").getChild("a_3").getChild("bf_26");
        this.l = root.getChild("mainbody").getChild("jointLL1").getChild("l");
        this.jointLL2 = root.getChild("mainbody").getChild("jointLL1").getChild("l").getChild("jointLL2");
        this.bf_27 = root.getChild("mainbody").getChild("jointLL1").getChild("l").getChild("bf_27");
        this.l_1 = root.getChild("mainbody").getChild("jointLL1").getChild("l").getChild("jointLL2").getChild("l_1");
        this.bf_28 = root.getChild("mainbody").getChild("jointLL1").getChild("l").getChild("jointLL2").getChild("l_1").getChild("bf_28");
        this.bf_29 = root.getChild("mainbody").getChild("jointLL1").getChild("l").getChild("jointLL2").getChild("l_1").getChild("bf_29");
        this.l_2 = root.getChild("mainbody").getChild("jointRL1").getChild("l_2");
        this.bf_30 = root.getChild("mainbody").getChild("jointRL1").getChild("l_2").getChild("bf_30");
        this.jointRL2 = root.getChild("mainbody").getChild("jointRL1").getChild("l_2").getChild("jointRL2");
        this.l_3 = root.getChild("mainbody").getChild("jointRL1").getChild("l_2").getChild("jointRL2").getChild("l_3");
        this.bf_31 = root.getChild("mainbody").getChild("jointRL1").getChild("l_2").getChild("jointRL2").getChild("l_3").getChild("bf_31");
        this.bf_32 = root.getChild("mainbody").getChild("jointRL1").getChild("l_2").getChild("jointRL2").getChild("l_3").getChild("bf_32");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, -2.9f, 0.0f));
        PartDefinition bf_12 = mainbody.addOrReplaceChild("bf_12", CubeListBuilder.create().texOffs(50, 23).addBox(-2.9f, -2.0f, -1.5f, 6, 2, 3), PartPose.offsetAndRotation(-7.8f, -7.7f, 0.0f, 0.0f, 0.0f, 0.087964594f));
        PartDefinition bf_11 = mainbody.addOrReplaceChild("bf_11", CubeListBuilder.create().texOffs(70, 36).addBox(-2.0f, -2.0f, -2.0f, 3, 3, 4), PartPose.offsetAndRotation(-8.4f, -6.0f, 0.0f, 0.0f, 0.0f, -0.09477138f));
        PartDefinition b_3 = mainbody.addOrReplaceChild("b_3", CubeListBuilder.create().texOffs(72, 0).addBox(-4.5f, -2.0f, -6.0f, 9, 8, 6), PartPose.offsetAndRotation(-4.5f, -7.0f, -2.0f, -0.12566371f, 0.18849556f, 0.0f));
        PartDefinition bf = mainbody.addOrReplaceChild("bf", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0f, -2.0f, -2.0f, 4, 6, 6), PartPose.offsetAndRotation(-5.3f, -2.0f, 0.0f, 0.0f, 0.0f, 0.06283186f));
        PartDefinition bf_8 = mainbody.addOrReplaceChild("bf_8", CubeListBuilder.create().texOffs(52, 34).addBox(-2.0f, -2.0f, -2.0f, 7, 2, 4), PartPose.offsetAndRotation(0.7f, -3.7f, -4.2f, 0.12566371f, -0.18849556f, 0.06283186f));
        PartDefinition jointLL1 = mainbody.addOrReplaceChild("jointLL1", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.5f, 8.0f, 0.0f));
        PartDefinition l = jointLL1.addOrReplaceChild("l", CubeListBuilder.create().texOffs(0, 76).addBox(-3.0f, -3.0f, -2.5f, 6, 8, 5), PartPose.offset(2.0f, 4.0f, 0.0f));
        PartDefinition jointLL2 = l.addOrReplaceChild("jointLL2", CubeListBuilder.create().texOffs(120, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition l_1 = jointLL2.addOrReplaceChild("l_1", CubeListBuilder.create().texOffs(22, 77).addBox(-3.0f, -3.0f, -2.5f, 6, 8, 5), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition bf_29 = l_1.addOrReplaceChild("bf_29", CubeListBuilder.create().texOffs(68, 77).addBox(-1.5f, -2.0f, -3.0f, 3, 4, 6), PartPose.offsetAndRotation(-2.0f, -4.0f, 1.0f, 0.62831855f, 0.0f, 0.06283186f));
        PartDefinition bf_28 = l_1.addOrReplaceChild("bf_28", CubeListBuilder.create().texOffs(44, 77).addBox(-2.0f, -2.0f, -2.0f, 4, 4, 4), PartPose.offsetAndRotation(0.0f, -4.0f, 0.0f, 0.0f, 0.0f, -0.25132743f));
        PartDefinition bf_27 = l.addOrReplaceChild("bf_27", CubeListBuilder.create().texOffs(58, 73).addBox(-2.0f, -2.0f, -2.0f, 4, 2, 4), PartPose.offsetAndRotation(0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.25132743f));
        PartDefinition b_5 = mainbody.addOrReplaceChild("b_5", CubeListBuilder.create().texOffs(0, 11).addBox(-9.0f, 0.0f, 0.0f, 18, 7, 5), PartPose.offsetAndRotation(0.0f, -9.4f, 0.4f, 0.18849556f, 0.0f, 0.0f));
        PartDefinition b = mainbody.addOrReplaceChild("b", CubeListBuilder.create().texOffs(4, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, -7.0f, 0.0f));
        PartDefinition jointRA1 = b.addOrReplaceChild("jointRA1", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-10.0f, -1.0f, 0.0f));
        PartDefinition a_2 = jointRA1.addOrReplaceChild("a_2", CubeListBuilder.create().texOffs(26, 61).addBox(-2.0f, 2.5f, -3.0f, 4, 10, 6), PartPose.offsetAndRotation(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.06283186f));
        PartDefinition jointRA2 = a_2.addOrReplaceChild("jointRA2", CubeListBuilder.create().texOffs(122, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 12.5f, 0.0f));
        PartDefinition a_3 = jointRA2.addOrReplaceChild("a_3", CubeListBuilder.create().texOffs(95, 66).addBox(-2.0f, -0.5f, -3.0f, 4, 15, 6), PartPose.offset(0.0f, 2.5f, 0.0f));
        PartDefinition bf_25 = a_3.addOrReplaceChild("bf_25", CubeListBuilder.create().texOffs(46, 70).addBox(-2.5f, -2.0f, -2.0f, 5, 4, 3), PartPose.offsetAndRotation(0.0f, -0.7f, 1.5f, -0.50265485f, 0.0f, -0.12566371f));
        PartDefinition bf_26 = a_3.addOrReplaceChild("bf_26", CubeListBuilder.create().texOffs(73, 69).addBox(-1.5f, -2.5f, -2.0f, 3, 4, 4), PartPose.offsetAndRotation(0.7f, -1.2f, -1.0f, -0.62831855f, 0.0f, 0.12566371f));
        PartDefinition ad_4 = a_2.addOrReplaceChild("ad_4", CubeListBuilder.create().texOffs(77, 61).addBox(-1.5f, -2.0f, -1.5f, 3, 5, 3), PartPose.offsetAndRotation(-1.0f, 2.0f, 0.0f, 0.0f, 0.0f, -0.06283186f));
        PartDefinition ad_5 = a_2.addOrReplaceChild("ad_5", CubeListBuilder.create().texOffs(89, 64).addBox(-1.0f, -2.0f, -2.0f, 2, 4, 4), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, -0.06283186f, 0.0f, 0.62831855f));
        PartDefinition ad_3 = a_2.addOrReplaceChild("ad_3", CubeListBuilder.create().texOffs(61, 61).addBox(-1.5f, 2.5f, -2.5f, 3, 7, 5), PartPose.offset(1.0f, -4.0f, 0.0f));
        PartDefinition jointH = b.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -4.0f, 0.0f));
        PartDefinition bf_22 = jointH.addOrReplaceChild("bf_22", CubeListBuilder.create().texOffs(44, 46).addBox(-2.5f, -4.5f, -2.0f, 5, 6, 4), PartPose.offsetAndRotation(-0.9f, -4.9f, -5.1f, -0.25132743f, 0.18849556f, 0.43982297f));
        PartDefinition h_1 = jointH.addOrReplaceChild("h_1", CubeListBuilder.create().texOffs(63, 43).addBox(-2.0f, -8.0f, -5.5f, 4, 10, 8), PartPose.offsetAndRotation(2.3f, -2.0f, -2.0f, -0.12566371f, -0.18849556f, 0.0f));
        PartDefinition jointDM1 = jointH.addOrReplaceChild("jointDM1", CubeListBuilder.create().texOffs(100, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.0f, -6.2f, -6.5f));
        PartDefinition hair_8 = jointDM1.addOrReplaceChild("hair_8", CubeListBuilder.create().texOffs(92, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 2.5132742f, -0.43982297f, -1.0053097f));
        PartDefinition jointDM2 = hair_8.addOrReplaceChild("jointDM2", CubeListBuilder.create().texOffs(26, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_9 = jointDM2.addOrReplaceChild("hair_9", CubeListBuilder.create().texOffs(14, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.75049156f, 0.0f, 0.0f));
        PartDefinition jointDM3 = hair_9.addOrReplaceChild("jointDM3", CubeListBuilder.create().texOffs(74, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_10 = jointDM3.addOrReplaceChild("hair_10", CubeListBuilder.create().texOffs(34, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.6736971f, 0.0f, 0.0f));
        PartDefinition jointDM4 = hair_10.addOrReplaceChild("jointDM4", CubeListBuilder.create().texOffs(96, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_11 = jointDM4.addOrReplaceChild("hair_11", CubeListBuilder.create().texOffs(36, 43).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.9250245f, 0.0f, 0.0f));
        PartDefinition bf_20 = jointH.addOrReplaceChild("bf_20", CubeListBuilder.create().texOffs(0, 44).addBox(-1.5f, -4.5f, -2.0f, 3, 6, 4), PartPose.offsetAndRotation(-0.3f, -7.2f, -3.0f, -0.12566371f, 0.0f, -0.37699112f));
        PartDefinition jointDR1 = jointH.addOrReplaceChild("jointDR1", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.0f, -7.0f, -6.5f));
        PartDefinition hair = jointDR1.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(114, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 2.576106f, -0.06283186f, 0.50265485f));
        PartDefinition jointDR2 = hair.addOrReplaceChild("jointDR2", CubeListBuilder.create().texOffs(119, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_1 = jointDR2.addOrReplaceChild("hair_1", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.75049156f, 0.0f, 0.0f));
        PartDefinition jointDR3 = hair_1.addOrReplaceChild("jointDR3", CubeListBuilder.create().texOffs(123, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_2 = jointDR3.addOrReplaceChild("hair_2", CubeListBuilder.create().texOffs(18, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.6736971f, 0.0f, 0.0f));
        PartDefinition jointDR4 = hair_2.addOrReplaceChild("jointDR4", CubeListBuilder.create().texOffs(23, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_3 = jointDR4.addOrReplaceChild("hair_3", CubeListBuilder.create().texOffs(41, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.9250245f, 0.0f, 0.0f));
        PartDefinition jointDL1 = jointH.addOrReplaceChild("jointDL1", CubeListBuilder.create().texOffs(96, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.7f, -4.2f, -6.8f));
        PartDefinition hair_4 = jointDL1.addOrReplaceChild("hair_4", CubeListBuilder.create().texOffs(66, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 2.953097f, -0.12566371f, -2.6663394f));
        PartDefinition jointDL2 = hair_4.addOrReplaceChild("jointDL2", CubeListBuilder.create().texOffs(71, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_5 = jointDL2.addOrReplaceChild("hair_5", CubeListBuilder.create().texOffs(119, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.75049156f, 0.0f, 0.0f));
        PartDefinition jointDL3 = hair_5.addOrReplaceChild("jointDL3", CubeListBuilder.create().texOffs(96, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_6 = jointDL3.addOrReplaceChild("hair_6", CubeListBuilder.create().texOffs(92, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.6736971f, 0.0f, 0.0f));
        PartDefinition jointDL4 = hair_6.addOrReplaceChild("jointDL4", CubeListBuilder.create().texOffs(100, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_7 = jointDL4.addOrReplaceChild("hair_7", CubeListBuilder.create().texOffs(114, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.9250245f, 0.0f, 0.0f));
        PartDefinition h = jointH.addOrReplaceChild("h", CubeListBuilder.create().texOffs(20, 43).addBox(-2.0f, -8.0f, -5.5f, 4, 10, 8), PartPose.offsetAndRotation(-3.2f, -2.0f, -2.0f, -0.12566371f, 0.25132743f, 0.0f));
        PartDefinition bf_19 = jointH.addOrReplaceChild("bf_19", CubeListBuilder.create().texOffs(113, 40).addBox(-1.5f, -4.5f, -2.0f, 3, 6, 4), PartPose.offsetAndRotation(-0.3f, -1.2f, -1.0f, -0.12566371f, 0.0f, 0.0f));
        PartDefinition bf_21 = jointH.addOrReplaceChild("bf_21", CubeListBuilder.create().texOffs(79, 43).addBox(-1.5f, -4.5f, -2.0f, 5, 4, 4), PartPose.offsetAndRotation(-1.9f, 0.1f, -5.2f, -0.18849556f, 0.06283186f, 0.25132743f));
        PartDefinition jointLA1 = b.addOrReplaceChild("jointLA1", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.3f, -0.9f, 0.0f));
        PartDefinition a = jointLA1.addOrReplaceChild("a", CubeListBuilder.create().texOffs(91, 48).addBox(-2.0f, 2.5f, -3.0f, 4, 10, 6), PartPose.offsetAndRotation(2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.06283186f));
        PartDefinition ad_2 = a.addOrReplaceChild("ad_2", CubeListBuilder.create().texOffs(44, 56).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 2), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -0.62831855f));
        PartDefinition ad_1 = a.addOrReplaceChild("ad_1", CubeListBuilder.create().texOffs(0, 54).addBox(-1.5f, -2.0f, -1.5f, 3, 4, 3), PartPose.offset(1.0f, 2.0f, 0.0f));
        PartDefinition jointLA2 = a.addOrReplaceChild("jointLA2", CubeListBuilder.create().texOffs(118, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 12.5f, 0.0f));
        PartDefinition a_1 = jointLA2.addOrReplaceChild("a_1", CubeListBuilder.create().texOffs(6, 55).addBox(-2.0f, -0.5f, -3.0f, 4, 15, 6), PartPose.offset(0.0f, 2.5f, 0.0f));
        PartDefinition bf_24 = a_1.addOrReplaceChild("bf_24", CubeListBuilder.create().texOffs(52, 58).addBox(-1.5f, -2.5f, -2.0f, 3, 4, 4), PartPose.offsetAndRotation(-0.7f, -1.2f, -1.0f, -0.62831855f, 0.0f, -0.12566371f));
        PartDefinition bf_23 = a_1.addOrReplaceChild("bf_23", CubeListBuilder.create().texOffs(111, 60).addBox(-2.5f, -2.0f, -2.0f, 5, 4, 3), PartPose.offsetAndRotation(0.0f, -0.7f, 1.5f, -0.50265485f, 0.0f, 0.12566371f));
        PartDefinition ad = a.addOrReplaceChild("ad", CubeListBuilder.create().texOffs(111, 50).addBox(-1.5f, 2.5f, -2.5f, 3, 5, 5), PartPose.offset(-1.0f, -4.0f, 0.0f));
        PartDefinition b_4 = mainbody.addOrReplaceChild("b_4", CubeListBuilder.create().texOffs(97, 9).addBox(-4.5f, -2.0f, -6.0f, 9, 4, 5), PartPose.offsetAndRotation(-4.5f, 1.4f, -0.9f, 0.06283186f, 0.12566371f, 0.0f));
        PartDefinition bf_10 = mainbody.addOrReplaceChild("bf_10", CubeListBuilder.create().texOffs(25, 36).addBox(-2.0f, -2.0f, -2.0f, 5, 3, 4), PartPose.offsetAndRotation(-2.6f, -9.0f, -1.0f, 0.0f, 0.0f, -0.16336282f));
        PartDefinition bf_13 = mainbody.addOrReplaceChild("bf_13", CubeListBuilder.create().texOffs(84, 36).addBox(-2.0f, -2.0f, -2.0f, 4, 2, 5), PartPose.offsetAndRotation(7.9f, -8.6f, -0.8f, 0.0f, -0.06283186f, -0.12566371f));
        PartDefinition b_6 = mainbody.addOrReplaceChild("b_6", CubeListBuilder.create().texOffs(46, 11).addBox(-4.5f, -3.0f, -6.0f, 9, 7, 5), PartPose.offsetAndRotation(4.5f, -1.0f, 0.0f, 0.06283186f, -0.12566371f, 0.0f));
        PartDefinition bf_15 = mainbody.addOrReplaceChild("bf_15", CubeListBuilder.create().texOffs(12, 40).addBox(-1.5f, -2.0f, -2.0f, 4, 4, 4), PartPose.offsetAndRotation(2.3f, 6.9f, 0.5f, 0.0f, 0.0f, -0.18849556f));
        PartDefinition bf_16 = mainbody.addOrReplaceChild("bf_16", CubeListBuilder.create().texOffs(55, 40).addBox(-3.0f, -2.0f, -2.0f, 4, 2, 4), PartPose.offsetAndRotation(4.9f, -7.6f, -0.8f, 0.12566371f, -0.06283186f, 0.0f));
        PartDefinition bf_9 = mainbody.addOrReplaceChild("bf_9", CubeListBuilder.create().texOffs(0, 35).addBox(-2.0f, -2.0f, -2.0f, 4, 2, 4), PartPose.offsetAndRotation(5.9f, -3.0f, -2.8f, 0.0f, -0.31415927f, 0.06283186f));
        PartDefinition bf_14 = mainbody.addOrReplaceChild("bf_14", CubeListBuilder.create().texOffs(43, 37).addBox(-1.0f, -2.0f, -1.0f, 3, 5, 3), PartPose.offsetAndRotation(8.3f, -7.3f, -0.8f, 0.0f, -0.06283186f, 0.0f));
        PartDefinition b_1 = mainbody.addOrReplaceChild("b_1", CubeListBuilder.create().texOffs(2, 0).addBox(-4.5f, 10.0f, -3.0f, 5, 5, 6), PartPose.offsetAndRotation(0.1f, -6.3f, 0.0f, -0.03141593f, 0.0f, 0.06283186f));
        PartDefinition jointRL1 = mainbody.addOrReplaceChild("jointRL1", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.5f, 8.0f, 0.0f));
        PartDefinition l_2 = jointRL1.addOrReplaceChild("l_2", CubeListBuilder.create().texOffs(39, 85).addBox(-3.0f, -3.0f, -2.5f, 6, 8, 5), PartPose.offset(-2.0f, 4.0f, 0.0f));
        PartDefinition bf_30 = l_2.addOrReplaceChild("bf_30", CubeListBuilder.create().texOffs(56, 83).addBox(-2.0f, -2.0f, -2.0f, 4, 2, 4), PartPose.offsetAndRotation(0.0f, -2.0f, 0.0f, 0.0f, 0.0f, -0.25132743f));
        PartDefinition jointRL2 = l_2.addOrReplaceChild("jointRL2", CubeListBuilder.create().texOffs(123, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition l_3 = jointRL2.addOrReplaceChild("l_3", CubeListBuilder.create().texOffs(67, 87).addBox(-3.0f, -3.0f, -2.5f, 6, 8, 5), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition bf_31 = l_3.addOrReplaceChild("bf_31", CubeListBuilder.create().texOffs(111, 83).addBox(-2.0f, -2.0f, -2.0f, 4, 4, 4), PartPose.offsetAndRotation(0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.25132743f));
        PartDefinition bf_32 = l_3.addOrReplaceChild("bf_32", CubeListBuilder.create().texOffs(89, 87).addBox(-1.5f, -2.0f, -3.0f, 3, 4, 6), PartPose.offsetAndRotation(2.0f, -4.0f, 1.0f, 0.62831855f, 0.0f, -0.06283186f));
        PartDefinition bf_2 = mainbody.addOrReplaceChild("bf_2", CubeListBuilder.create().texOffs(20, 23).addBox(-2.0f, -2.0f, -2.0f, 5, 6, 4), PartPose.offsetAndRotation(-2.1f, -1.4f, -4.0f, 0.0f, -0.18849556f, 0.0f));
        PartDefinition b_7 = mainbody.addOrReplaceChild("b_7", CubeListBuilder.create().texOffs(68, 17).addBox(-4.5f, -2.0f, -6.0f, 9, 5, 6), PartPose.offsetAndRotation(4.5f, -7.0f, -2.0f, -0.18849556f, -0.12566371f, 0.0f));
        PartDefinition bf_3 = mainbody.addOrReplaceChild("bf_3", CubeListBuilder.create().texOffs(38, 23).addBox(-2.0f, -2.2f, -5.0f, 3, 7, 6), PartPose.offsetAndRotation(0.7f, -6.4f, -3.0f, -0.18849556f, 0.0f, 0.0f));
        PartDefinition b_2 = mainbody.addOrReplaceChild("b_2", CubeListBuilder.create().texOffs(24, 0).addBox(-9.0f, -2.0f, -6.0f, 18, 5, 6), PartPose.offsetAndRotation(0.0f, 0.2f, 5.0f, -0.12566371f, 0.0f, 0.0f));
        PartDefinition bf_4 = mainbody.addOrReplaceChild("bf_4", CubeListBuilder.create().texOffs(56, 28).addBox(-2.0f, -2.0f, -2.0f, 6, 2, 4), PartPose.offsetAndRotation(-6.8f, 0.0f, -4.0f, 0.0f, 0.18849556f, 0.06283186f));
        PartDefinition bf_7 = mainbody.addOrReplaceChild("bf_7", CubeListBuilder.create().texOffs(17, 33).addBox(-2.0f, -2.0f, -2.0f, 3, 4, 3), PartPose.offsetAndRotation(0.7f, 7.3f, 0.6f, 0.0f, 0.0f, -0.06283186f));
        PartDefinition b_8 = mainbody.addOrReplaceChild("b_8", CubeListBuilder.create().texOffs(98, 18).addBox(-4.5f, 10.0f, -3.0f, 4, 5, 6), PartPose.offsetAndRotation(3.9f, -6.7f, 0.0f, 0.06283186f, 0.0f, -0.06283186f));
        PartDefinition bf_17 = mainbody.addOrReplaceChild("bf_17", CubeListBuilder.create().texOffs(97, 40).addBox(-2.0f, -2.0f, -2.5f, 3, 3, 5), PartPose.offsetAndRotation(1.4f, -9.0f, -1.1f, 0.0f, 0.0f, 0.2136283f));
        PartDefinition bf_6 = mainbody.addOrReplaceChild("bf_6", CubeListBuilder.create().texOffs(102, 32).addBox(-2.0f, -2.0f, -2.0f, 8, 4, 4), PartPose.offsetAndRotation(-2.3f, 4.0f, 0.0f, 0.0f, 0.0f, 0.06283186f));
        PartDefinition bf_18 = mainbody.addOrReplaceChild("bf_18", CubeListBuilder.create().texOffs(112, 18).addBox(-1.5f, -4.5f, -2.0f, 3, 2, 4), PartPose.offsetAndRotation(-0.3f, -6.2f, -4.0f, 0.06283186f, 0.0f, -0.12566371f));
        PartDefinition bf_5 = mainbody.addOrReplaceChild("bf_5", CubeListBuilder.create().texOffs(76, 29).addBox(-2.0f, -3.0f, -2.0f, 11, 3, 4), PartPose.offsetAndRotation(-1.3f, -2.0f, 1.0f, 0.0f, 0.0f, 0.06283186f));
        PartDefinition bf_1 = mainbody.addOrReplaceChild("bf_1", CubeListBuilder.create().texOffs(102, 0).addBox(-2.0f, -2.0f, -2.0f, 4, 5, 4), PartPose.offsetAndRotation(-6.6f, -7.0f, 0.0f, 0.0f, 0.0f, 0.025132742f));
        return LayerDefinition.create(mesh, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        float GD;
        float GS;
        EntityParasiteBase parasite = (EntityParasiteBase)entity;
        this.jointLL1.xRot = 0.0f;
        this.jointLL2.xRot = 0.0f;
        this.jointRL1.xRot = 0.0f;
        this.jointRL2.xRot = 0.0f;
        this.jointLA1.xRot = 0.0f;
        this.jointLA2.xRot = 0.0f;
        this.jointRA1.xRot = 0.0f;
        this.jointRA2.xRot = 0.0f;
        this.jointLA1.zRot = 0.0f;
        this.jointRA1.zRot = 0.0f;
        this.mainbody.y = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                GS = 1.1f;
                GD = 1.0f;
                this.swingX(this.jointLL1, 0.3f * GS, 1.0f * GD, 1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL1, 0.3f * GS, 1.0f * GD, -1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointLL2, 0.3f * GS, 1.0f * GD, 1, -1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL2, 0.3f * GS, 1.0f * GD, -1, -1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.05f);
                this.swingX(this.jointLA1, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointRA1, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointLA2, 0.3f * GS, 1.0f * GD, -1, -1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRA2, 0.3f * GS, 1.0f * GD, 1, -1.0f, 0.2f, limbSwing, limbSwingAmount);
            }
        } else if (i != 1 && i == 2 && !parasite.getStillAni()) {
            GS = 0.9f;
            GD = 0.9f;
            this.jointLA1.zRot = -0.4f;
            this.jointRA1.zRot = 0.4f;
            this.swingX(this.jointLL1, 0.3f * GS, 1.3f * GD, 1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
            this.swingX(this.jointRL1, 0.3f * GS, 1.3f * GD, -1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
            this.swingX(this.jointLL2, 0.3f * GS, 1.0f * GD, 1, -1.0f, 0.2f, limbSwing, limbSwingAmount);
            this.swingX(this.jointRL2, 0.3f * GS, 1.0f * GD, -1, -1.0f, 0.2f, limbSwing, limbSwingAmount);
            this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.05f);
            this.swingX(this.jointLA1, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
            this.swingX(this.jointRA1, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
            this.swingX(this.jointLA2, 0.3f * GS, 1.0f * GD, -1, -1.0f, 0.2f, limbSwing, limbSwingAmount);
            this.swingX(this.jointRA2, 0.3f * GS, 1.0f * GD, 1, -1.0f, 0.2f, limbSwing, limbSwingAmount);
            this.jointRA1.xRot += -1.0f;
            this.jointRA2.xRot += -1.0f;
            this.jointLA1.xRot += -1.0f;
            this.jointLA2.xRot += -1.0f;
        }
        float f4 = Mth.cos((float)(ageInTicks * 0.18f)) * 0.2065f;
        float f3 = Mth.cos((float)(ageInTicks * 0.17f)) * 0.2065f;
        this.jointH.xRot = f4;
        this.jointH.zRot = f3;
        f4 = Mth.cos((float)(ageInTicks * 0.2216f)) * 0.3021f;
        f3 = Mth.cos((float)(ageInTicks * 0.2014f)) * 0.322f;
        this.jointDM1.xRot = f4;
        this.jointDM2.yRot = f3;
        this.jointDM3.zRot = f4;
        this.jointDM4.xRot = f3;
        this.jointDR1.yRot = f4;
        this.jointDR2.zRot = f3;
        this.jointDR3.xRot = f4;
        this.jointDR4.yRot = f3;
        this.jointDL1.zRot = f4;
        this.jointDL2.xRot = f3;
        this.jointDL3.yRot = f4;
        this.jointDL4.zRot = f3;
        f4 = Mth.cos((float)(ageInTicks * 0.16f)) * 0.195f;
        f3 = Mth.cos((float)(ageInTicks * 0.14f)) * 0.185f;
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
