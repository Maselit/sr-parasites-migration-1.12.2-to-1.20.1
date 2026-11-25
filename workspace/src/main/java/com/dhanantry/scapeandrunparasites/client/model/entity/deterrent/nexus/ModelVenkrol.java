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
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.nexus.EntityVenkrol;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelVenkrol extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "venkrol"), "main");
    private final ModelPart mainbody;
    private final ModelPart body1;
    private final ModelPart root_center;
    private final ModelPart body2;
    private final ModelPart body3;
    private final ModelPart body4;
    private final ModelPart body5;
    private final ModelPart ten_center;
    private final ModelPart core;
    private final ModelPart JD;
    private final ModelPart JD_1;
    private final ModelPart JD_2;
    private final ModelPart JD_3;
    private final ModelPart jointBR1;
    private final ModelPart tacle;
    private final ModelPart jointBR2;
    private final ModelPart decorn1;
    private final ModelPart tacle_1;
    private final ModelPart jointBR3;
    private final ModelPart tacle_2;
    private final ModelPart jointBR4;
    private final ModelPart tacle_3;
    private final ModelPart jointBL1;
    private final ModelPart tacle_4;
    private final ModelPart jointBL2;
    private final ModelPart decorn2;
    private final ModelPart tacle_5;
    private final ModelPart jointBL3;
    private final ModelPart tacle_6;
    private final ModelPart jointBL4;
    private final ModelPart tacle_7;
    private final ModelPart jointFR1;
    private final ModelPart tacle_8;
    private final ModelPart jointFR2;
    private final ModelPart decorn3;
    private final ModelPart tacle_9;
    private final ModelPart jointFR3;
    private final ModelPart tacle_10;
    private final ModelPart jointFR4;
    private final ModelPart tacle_11;
    private final ModelPart jointFL1;
    private final ModelPart tacle_12;
    private final ModelPart jointFL2;
    private final ModelPart decorn4;
    private final ModelPart tacle_13;
    private final ModelPart jointFL3;
    private final ModelPart tacle_14;
    private final ModelPart jointFL4;
    private final ModelPart tacle_15;
    private final ModelPart core1;
    private final ModelPart core2;
    private final ModelPart core3;
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

    public ModelVenkrol(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.body1 = root.getChild("mainbody").getChild("body1");
        this.root_center = root.getChild("mainbody").getChild("root_center");
        this.body2 = root.getChild("mainbody").getChild("body1").getChild("body2");
        this.body3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3");
        this.body4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4");
        this.body5 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5");
        this.ten_center = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center");
        this.core = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("core");
        this.JD = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD");
        this.JD_1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1");
        this.JD_2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2");
        this.JD_3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3");
        this.jointBR1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1");
        this.tacle = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle");
        this.jointBR2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2");
        this.decorn1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("decorn1");
        this.tacle_1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2").getChild("tacle_1");
        this.jointBR3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2").getChild("tacle_1").getChild("jointBR3");
        this.tacle_2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2").getChild("tacle_1").getChild("jointBR3").getChild("tacle_2");
        this.jointBR4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2").getChild("tacle_1").getChild("jointBR3").getChild("tacle_2").getChild("jointBR4");
        this.tacle_3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD").getChild("jointBR1").getChild("tacle").getChild("jointBR2").getChild("tacle_1").getChild("jointBR3").getChild("tacle_2").getChild("jointBR4").getChild("tacle_3");
        this.jointBL1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1");
        this.tacle_4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4");
        this.jointBL2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2");
        this.decorn2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("decorn2");
        this.tacle_5 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2").getChild("tacle_5");
        this.jointBL3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2").getChild("tacle_5").getChild("jointBL3");
        this.tacle_6 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2").getChild("tacle_5").getChild("jointBL3").getChild("tacle_6");
        this.jointBL4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2").getChild("tacle_5").getChild("jointBL3").getChild("tacle_6").getChild("jointBL4");
        this.tacle_7 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_1").getChild("jointBL1").getChild("tacle_4").getChild("jointBL2").getChild("tacle_5").getChild("jointBL3").getChild("tacle_6").getChild("jointBL4").getChild("tacle_7");
        this.jointFR1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1");
        this.tacle_8 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8");
        this.jointFR2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2");
        this.decorn3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("decorn3");
        this.tacle_9 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2").getChild("tacle_9");
        this.jointFR3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2").getChild("tacle_9").getChild("jointFR3");
        this.tacle_10 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2").getChild("tacle_9").getChild("jointFR3").getChild("tacle_10");
        this.jointFR4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2").getChild("tacle_9").getChild("jointFR3").getChild("tacle_10").getChild("jointFR4");
        this.tacle_11 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_2").getChild("jointFR1").getChild("tacle_8").getChild("jointFR2").getChild("tacle_9").getChild("jointFR3").getChild("tacle_10").getChild("jointFR4").getChild("tacle_11");
        this.jointFL1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1");
        this.tacle_12 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12");
        this.jointFL2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2");
        this.decorn4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("decorn4");
        this.tacle_13 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2").getChild("tacle_13");
        this.jointFL3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2").getChild("tacle_13").getChild("jointFL3");
        this.tacle_14 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2").getChild("tacle_13").getChild("jointFL3").getChild("tacle_14");
        this.jointFL4 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2").getChild("tacle_13").getChild("jointFL3").getChild("tacle_14").getChild("jointFL4");
        this.tacle_15 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("ten_center").getChild("JD_3").getChild("jointFL1").getChild("tacle_12").getChild("jointFL2").getChild("tacle_13").getChild("jointFL3").getChild("tacle_14").getChild("jointFL4").getChild("tacle_15");
        this.core1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("core").getChild("core1");
        this.core2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("core").getChild("core1").getChild("core2");
        this.core3 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("core").getChild("core1").getChild("core2").getChild("core3");
        this.rootmain = root.getChild("mainbody").getChild("root_center").getChild("rootmain");
        this.root = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root");
        this.root_1 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_1");
        this.root_2 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_2");
        this.root_3 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_3");
        this.root_4 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_4");
        this.root_5 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_5");
        this.root_6 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_6");
        this.root_7 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_7");
        this.root_8 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root").getChild("root_8");
        this.root_9 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_1").getChild("root_9");
        this.root_10 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_2").getChild("root_10");
        this.root_11 = root.getChild("mainbody").getChild("root_center").getChild("rootmain").getChild("root_3").getChild("root_11");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, 0.0f, -4.0f, 8, 2, 8), PartPose.offset(0.0f, 22.8f, 0.0f));
        PartDefinition root_center = mainbody.addOrReplaceChild("root_center", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 1.0f, 0.0f));
        PartDefinition rootmain = root_center.addOrReplaceChild("rootmain", CubeListBuilder.create().texOffs(113, 28).addBox(-1.5f, 0.0f, -1.5f, 3, 7, 3), PartPose.offset(0.0f, 1.0f, 0.0f));
        PartDefinition root_2 = rootmain.addOrReplaceChild("root_2", CubeListBuilder.create().texOffs(72, 10).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(1.3f, 0.9f, 0.0f, 0.91053826f, 1.6390387f, 0.0f));
        PartDefinition root_10 = root_2.addOrReplaceChild("root_10", CubeListBuilder.create().texOffs(20, 20).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(0.0f, 3.7f, 0.0f, -0.7285004f, 0.0f, 0.0f));
        PartDefinition root_4 = rootmain.addOrReplaceChild("root_4", CubeListBuilder.create().texOffs(44, 11).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(0.0f, 4.9f, 1.3f, 0.4098033f, 0.0f, 0.0f));
        PartDefinition root_ = rootmain.addOrReplaceChild("root", CubeListBuilder.create().texOffs(122, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(0.0f, 0.9f, 1.3f, 0.95609134f, 0.0f, 0.0f));
        PartDefinition root_8 = root_.addOrReplaceChild("root_8", CubeListBuilder.create().texOffs(118, 13).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(0.0f, 3.7f, 0.0f, -0.7285004f, 0.0f, 0.0f));
        PartDefinition root_6 = rootmain.addOrReplaceChild("root_6", CubeListBuilder.create().texOffs(52, 11).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(0.0f, 4.9f, -1.3f, 0.31869712f, (float)Math.PI, 0.0f));
        PartDefinition root_1 = rootmain.addOrReplaceChild("root_1", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(0.0f, 0.9f, -1.3f, 0.91053826f, (float)Math.PI, 0.0f));
        PartDefinition root_9 = root_1.addOrReplaceChild("root_9", CubeListBuilder.create().texOffs(16, 20).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(0.0f, 3.7f, 0.0f, -0.7285004f, 0.0f, 0.0f));
        PartDefinition root_5 = rootmain.addOrReplaceChild("root_5", CubeListBuilder.create().texOffs(48, 11).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(-1.3f, 4.9f, 0.0f, 0.3642502f, -1.5025539f, 0.0f));
        PartDefinition root_7 = rootmain.addOrReplaceChild("root_7", CubeListBuilder.create().texOffs(123, 12).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(1.3f, 4.9f, 0.0f, 0.3642502f, 1.6390387f, 0.0f));
        PartDefinition root_3 = rootmain.addOrReplaceChild("root_3", CubeListBuilder.create().texOffs(96, 10).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(-1.3f, 0.9f, 0.0f, 0.91053826f, -1.5025539f, 0.0f));
        PartDefinition root_11 = root_3.addOrReplaceChild("root_11", CubeListBuilder.create().texOffs(74, 21).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(0.0f, 3.7f, 0.0f, -0.7285004f, 0.0f, 0.0f));
        PartDefinition body1 = mainbody.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(32, 0).addBox(-3.0f, -4.0f, -3.0f, 6, 5, 6), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(56, 0).addBox(-2.5f, -4.0f, -2.5f, 5, 5, 5), PartPose.offset(0.0f, -4.0f, 0.0f));
        PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(76, 0).addBox(-2.0f, -5.0f, -2.0f, 4, 6, 4), PartPose.offset(0.0f, -4.0f, 0.0f));
        PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(92, 0).addBox(-2.5f, -5.0f, -2.5f, 5, 5, 5), PartPose.offset(0.0f, -4.0f, 0.0f));
        PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(0, 10).addBox(-3.0f, -4.0f, -3.0f, 6, 4, 6), PartPose.offset(0.0f, -4.0f, 0.0f));
        PartDefinition ten_center = body5.addOrReplaceChild("ten_center", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -3.0f, 0.0f));
        PartDefinition JD_3 = ten_center.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(2.0f, 0.0f, -2.0f, 0.0f, 2.3561945f, 0.0f));
        PartDefinition jointFL1 = JD_3.addOrReplaceChild("jointFL1", CubeListBuilder.create().texOffs(24, 2).addBox(-0.5f, 0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tacle_12 = jointFL1.addOrReplaceChild("tacle_12", CubeListBuilder.create().texOffs(88, 23).addBox(-1.5f, -2.5f, -1.0f, 3, 5, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.6981317f, 1.5707964f));
        PartDefinition decorn4 = tacle_12.addOrReplaceChild("decorn4", CubeListBuilder.create().texOffs(81, 10).addBox(0.0f, -1.0f, -2.0f, 1, 2, 4), PartPose.offset(1.0f, 0.0f, 3.0f));
        PartDefinition jointFL2 = tacle_12.addOrReplaceChild("jointFL2", CubeListBuilder.create().texOffs(28, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tacle_13 = jointFL2.addOrReplaceChild("tacle_13", CubeListBuilder.create().texOffs(50, 25).addBox(-1.0f, -2.0f, -1.0f, 2, 4, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.19198622f, 0.0f));
        PartDefinition jointFL3 = tacle_13.addOrReplaceChild("jointFL3", CubeListBuilder.create().texOffs(32, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition tacle_14 = jointFL3.addOrReplaceChild("tacle_14", CubeListBuilder.create().texOffs(8, 26).addBox(-0.5f, -1.5f, -1.0f, 1, 3, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.13962634f, 0.0f));
        PartDefinition jointFL4 = tacle_14.addOrReplaceChild("jointFL4", CubeListBuilder.create().texOffs(50, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.2f, 0.0f, 4.0f));
        PartDefinition tacle_15 = jointFL4.addOrReplaceChild("tacle_15", CubeListBuilder.create().texOffs(102, 23).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.13962634f, 0.0f));
        PartDefinition JD = ten_center.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-2.0f, 0.0f, 2.0f, 0.0f, -0.7853982f, 0.0f));
        PartDefinition jointBR1 = JD.addOrReplaceChild("jointBR1", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tacle = jointBR1.addOrReplaceChild("tacle", CubeListBuilder.create().texOffs(48, 10).addBox(-1.5f, -2.5f, -1.0f, 3, 5, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.6981317f, -1.5707964f));
        PartDefinition jointBR2 = tacle.addOrReplaceChild("jointBR2", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tacle_1 = jointBR2.addOrReplaceChild("tacle_1", CubeListBuilder.create().texOffs(70, 10).addBox(-1.0f, -2.0f, -1.0f, 2, 4, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.19198622f, 0.0f));
        PartDefinition jointBR3 = tacle_1.addOrReplaceChild("jointBR3", CubeListBuilder.create().texOffs(75, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition tacle_2 = jointBR3.addOrReplaceChild("tacle_2", CubeListBuilder.create().texOffs(24, 10).addBox(-0.5f, -1.5f, -1.0f, 1, 3, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.13962634f, 0.0f));
        PartDefinition jointBR4 = tacle_2.addOrReplaceChild("jointBR4", CubeListBuilder.create().texOffs(88, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.2f, 0.0f, 4.0f));
        PartDefinition tacle_3 = jointBR4.addOrReplaceChild("tacle_3", CubeListBuilder.create().texOffs(88, 10).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.13962634f, 0.0f));
        PartDefinition decorn1 = tacle.addOrReplaceChild("decorn1", CubeListBuilder.create().texOffs(112, 0).addBox(0.0f, -1.0f, -2.0f, 1, 2, 4), PartPose.offset(-2.0f, 0.0f, 3.0f));
        PartDefinition JD_1 = ten_center.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(2.0f, 0.0f, 2.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition jointBL1 = JD_1.addOrReplaceChild("jointBL1", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tacle_4 = jointBL1.addOrReplaceChild("tacle_4", CubeListBuilder.create().texOffs(94, 10).addBox(-1.5f, -2.5f, -1.0f, 3, 5, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.6981317f, 1.5707964f));
        PartDefinition jointBL2 = tacle_4.addOrReplaceChild("jointBL2", CubeListBuilder.create().texOffs(107, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tacle_5 = jointBL2.addOrReplaceChild("tacle_5", CubeListBuilder.create().texOffs(31, 16).addBox(-1.0f, -2.0f, -1.0f, 2, 4, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.19198622f, 0.0f));
        PartDefinition jointBL3 = tacle_5.addOrReplaceChild("jointBL3", CubeListBuilder.create().texOffs(111, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition tacle_6 = jointBL3.addOrReplaceChild("tacle_6", CubeListBuilder.create().texOffs(110, 17).addBox(-0.5f, -1.5f, -1.0f, 1, 3, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.13962634f, 0.0f));
        PartDefinition jointBL4 = tacle_6.addOrReplaceChild("jointBL4", CubeListBuilder.create().texOffs(118, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.2f, 0.0f, 4.0f));
        PartDefinition tacle_7 = jointBL4.addOrReplaceChild("tacle_7", CubeListBuilder.create().texOffs(82, 18).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.13962634f, 0.0f));
        PartDefinition decorn2 = tacle_4.addOrReplaceChild("decorn2", CubeListBuilder.create().texOffs(18, 10).addBox(0.0f, -1.0f, -2.0f, 1, 2, 4), PartPose.offset(1.0f, 0.0f, 3.0f));
        PartDefinition JD_2 = ten_center.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-2.0f, 0.0f, -2.0f, 0.0f, -2.3561945f, 0.0f));
        PartDefinition jointFR1 = JD_2.addOrReplaceChild("jointFR1", CubeListBuilder.create().texOffs(122, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tacle_8 = jointFR1.addOrReplaceChild("tacle_8", CubeListBuilder.create().texOffs(16, 19).addBox(-1.5f, -2.5f, -1.0f, 3, 5, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.6981317f, -1.5707964f));
        PartDefinition decorn3 = tacle_8.addOrReplaceChild("decorn3", CubeListBuilder.create().texOffs(62, 10).addBox(0.0f, -1.0f, -2.0f, 1, 2, 4), PartPose.offset(-2.0f, 0.0f, 3.0f));
        PartDefinition jointFR2 = tacle_8.addOrReplaceChild("jointFR2", CubeListBuilder.create().texOffs(57, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tacle_9 = jointFR2.addOrReplaceChild("tacle_9", CubeListBuilder.create().texOffs(63, 21).addBox(-1.0f, -2.0f, -1.0f, 2, 4, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.19198622f, 0.0f));
        PartDefinition jointFR3 = tacle_9.addOrReplaceChild("jointFR3", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition tacle_10 = jointFR3.addOrReplaceChild("tacle_10", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5f, -1.5f, -1.0f, 1, 3, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.13962634f, 0.0f));
        PartDefinition jointFR4 = tacle_10.addOrReplaceChild("jointFR4", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.2f, 0.0f, 4.0f));
        PartDefinition tacle_11 = jointFR4.addOrReplaceChild("tacle_11", CubeListBuilder.create().texOffs(43, 23).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.13962634f, 0.0f));
        PartDefinition core = body5.addOrReplaceChild("core", CubeListBuilder.create().texOffs(108, 6).addBox(-2.0f, -3.0f, -2.0f, 4, 3, 4), PartPose.offset(0.0f, -2.4f, 0.0f));
        PartDefinition core1 = core.addOrReplaceChild("core1", CubeListBuilder.create().texOffs(32, 11).addBox(-1.5f, -3.0f, -1.5f, 3, 2, 3), PartPose.offset(0.0f, -0.5f, 0.0f));
        PartDefinition core2 = core1.addOrReplaceChild("core2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0f, -3.0f, -1.0f, 2, 2, 2), PartPose.offset(0.0f, -0.5f, 0.0f));
        PartDefinition core3 = core2.addOrReplaceChild("core3", CubeListBuilder.create().texOffs(54, 2).addBox(-0.5f, -3.0f, -0.5f, 1, 2, 1), PartPose.offset(0.0f, -0.5f, 0.0f));
        return LayerDefinition.create(mesh, 128, 40);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityVenkrol parasite = (EntityVenkrol)entity;
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
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            float f1 = 0.3f * Mth.sin((float)(ageInTicks * 0.091688f)) * 0.011f;
            float f2 = -0.6f * Mth.sin((float)(ageInTicks * 0.053515f)) * 0.011f;
            float f3 = 0.3f * Mth.sin((float)(ageInTicks * 0.1f)) * 0.15f;
            float j = parasite.getBODY();
            this.jointFL1.xRot = Math.min(j, 0.6f) + -1.0f * f3;
            this.jointFL2.yRot = -1.0f * Math.min(j, 0.45f);
            this.jointFL3.yRot = 0.0f + f3;
            this.jointFL4.yRot = 0.0f;
            this.jointFR1.xRot = Math.min(j, 0.6f) + f3;
            this.jointFR2.yRot = Math.min(j, 0.45f);
            this.jointFR3.yRot = 0.0f + f3;
            this.jointFR4.yRot = 0.0f;
            this.jointBL1.xRot = Math.min(j, 0.6f) + -1.0f * f3;
            this.jointBL2.yRot = -1.0f * Math.min(j, 0.45f);
            this.jointBL3.yRot = 0.0f + f3;
            this.jointBL4.yRot = 0.0f;
            this.jointBR1.xRot = Math.min(j, 0.6f) + f3;
            this.jointBR2.yRot = Math.min(j, 0.45f);
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
        } else if (i >= 1) {
            float f1 = 0.3f * Mth.sin((float)(ageInTicks * 0.051688f)) * 0.0011f;
            float f2 = -0.6f * Mth.sin((float)(ageInTicks * 0.013515f)) * 0.0011f;
            float f3 = 0.3f * Mth.sin((float)(ageInTicks * 0.1f)) * 0.25f;
            float j = parasite.getBODY();
            this.jointFL1.xRot = Math.min(j, 0.6f) + -1.0f * f3;
            this.jointFL2.yRot = -1.0f * Math.min(j, 0.45f);
            this.jointFL3.yRot = 0.0f + f3;
            this.jointFL4.yRot = 0.0f;
            this.jointFR1.xRot = Math.min(j, 0.6f) + f3;
            this.jointFR2.yRot = Math.min(j, 0.45f);
            this.jointFR3.yRot = 0.0f + f3;
            this.jointFR4.yRot = 0.0f;
            this.jointBL1.xRot = Math.min(j, 0.6f) + -1.0f * f3;
            this.jointBL2.yRot = -1.0f * Math.min(j, 0.45f);
            this.jointBL3.yRot = 0.0f + f3;
            this.jointBL4.yRot = 0.0f;
            this.jointBR1.xRot = Math.min(j, 0.6f) + f3;
            this.jointBR2.yRot = Math.min(j, 0.45f);
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
