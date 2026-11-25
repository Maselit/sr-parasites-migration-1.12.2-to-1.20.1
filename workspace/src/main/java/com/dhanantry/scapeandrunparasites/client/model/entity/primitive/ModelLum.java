package com.dhanantry.scapeandrunparasites.client.model.entity.primitive;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelLum extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "lum"), "main");
    private final ModelPart taclejointRF_5;
    private final ModelPart taclejointLF_1;
    private final ModelPart taclejointRF_1;
    private final ModelPart taclejointFL_3;
    private final ModelPart taclejointRB_3;
    private final ModelPart taclejointLF_4;
    private final ModelPart taclejointBL_3;
    private final ModelPart taclejointFL;
    private final ModelPart taclejointBR_1;
    private final ModelPart taclejointLF;
    private final ModelPart taclejointRB_5;
    private final ModelPart jointRM_1;
    private final ModelPart jointLM_2;
    private final ModelPart taclejointLB_2;
    private final ModelPart taclejointLB_3;
    private final ModelPart jointLM;
    private final ModelPart taclejointFR_2;
    private final ModelPart taclejointBL_4;
    private final ModelPart taclejointBR;
    private final ModelPart taclejointBL;
    private final ModelPart taclejointLF_2;
    private final ModelPart taclejointLB;
    private final ModelPart taclejointLB_4;
    private final ModelPart taclejointRF;
    private final ModelPart taclejointBL_5;
    private final ModelPart taclejointLF_5;
    private final ModelPart taclejointRB;
    private final ModelPart taclejointRB_1;
    private final ModelPart jointRM_2;
    private final ModelPart taclejointBL_2;
    private final ModelPart taclejointBR_2;
    private final ModelPart taclejointRF_4;
    private final ModelPart taclejointFL_5;
    private final ModelPart taclejointFL_1;
    private final ModelPart jointLM_1;
    private final ModelPart taclejointRB_2;
    private final ModelPart taclejointLB_5;
    private final ModelPart taclejointFR_3;
    private final ModelPart taclejointRF_2;
    private final ModelPart taclejointRB_4;
    private final ModelPart taclejointFL_2;
    private final ModelPart taclejointBL_1;
    private final ModelPart jointRM;
    private final ModelPart taclejointBR_5;
    private final ModelPart taclejointRF_3;
    private final ModelPart taclejointFR_1;
    private final ModelPart taclejointFL_4;
    private final ModelPart taclejointLB_1;
    private final ModelPart mainbody;
    private final ModelPart taclejointLF_3;
    private final ModelPart taclejointBR_3;
    private final ModelPart taclejointBR_4;
    private final ModelPart taclejointFR_5;
    private final ModelPart taclejointFR_4;
    private final ModelPart taclejointFR;
    private final float mainbodyBaseX;
    private final float mainbodyBaseY;
    private final float mainbodyBaseZ;

    public ModelLum(ModelPart root) {
        this.taclejointRF_5 = root.getChild("mainbody").getChild("bodymmm").getChild("body_7").getChild("taclejointRF").getChild("tentacle_36").getChild("taclejointRF_1").getChild("tentacle_37").getChild("taclejointRF_2").getChild("tentacle_38").getChild("taclejointRF_3").getChild("tentacle_39").getChild("taclejointRF_4").getChild("tentacle_40").getChild("taclejointRF_5");
        this.taclejointLF_1 = root.getChild("mainbody").getChild("bodymmm").getChild("body_8").getChild("taclejointLF").getChild("tentacle_42").getChild("taclejointLF_1");
        this.taclejointRF_1 = root.getChild("mainbody").getChild("bodymmm").getChild("body_7").getChild("taclejointRF").getChild("tentacle_36").getChild("taclejointRF_1");
        this.taclejointFL_3 = root.getChild("mainbody").getChild("bodymmm").getChild("body_2").getChild("taclejointFL").getChild("tentacle_12").getChild("taclejointFL_1").getChild("tentacle_13").getChild("taclejointFL_2").getChild("tentacle_14").getChild("taclejointFL_3");
        this.taclejointRB_3 = root.getChild("mainbody").getChild("bodymmm").getChild("body_6").getChild("taclejointRB").getChild("tentacle_30").getChild("taclejointRB_1").getChild("tentacle_31").getChild("taclejointRB_2").getChild("tentacle_32").getChild("taclejointRB_3");
        this.taclejointLF_4 = root.getChild("mainbody").getChild("bodymmm").getChild("body_8").getChild("taclejointLF").getChild("tentacle_42").getChild("taclejointLF_1").getChild("tentacle_43").getChild("taclejointLF_2").getChild("tentacle_44").getChild("taclejointLF_3").getChild("tentacle_45").getChild("taclejointLF_4");
        this.taclejointBL_3 = root.getChild("mainbody").getChild("bodymmm").getChild("body").getChild("taclejointBL").getChild("tentacle").getChild("taclejointBL_1").getChild("tentacle_1").getChild("taclejointBL_2").getChild("tentacle_2").getChild("taclejointBL_3");
        this.taclejointFL = root.getChild("mainbody").getChild("bodymmm").getChild("body_2").getChild("taclejointFL");
        this.taclejointBR_1 = root.getChild("mainbody").getChild("bodymmm").getChild("body_1").getChild("taclejointBR").getChild("tentacle_6").getChild("taclejointBR_1");
        this.taclejointLF = root.getChild("mainbody").getChild("bodymmm").getChild("body_8").getChild("taclejointLF");
        this.taclejointRB_5 = root.getChild("mainbody").getChild("bodymmm").getChild("body_6").getChild("taclejointRB").getChild("tentacle_30").getChild("taclejointRB_1").getChild("tentacle_31").getChild("taclejointRB_2").getChild("tentacle_32").getChild("taclejointRB_3").getChild("tentacle_33").getChild("taclejointRB_4").getChild("tentacle_34").getChild("taclejointRB_5");
        this.jointRM_1 = root.getChild("mainbody").getChild("jointRM").getChild("mouth_3").getChild("jointRM_1");
        this.jointLM_2 = root.getChild("mainbody").getChild("jointLM").getChild("mouth").getChild("jointLM_1").getChild("mouth_1").getChild("jointLM_2");
        this.taclejointLB_2 = root.getChild("mainbody").getChild("bodymmm").getChild("body_5").getChild("taclejointLB").getChild("tentacle_24").getChild("taclejointLB_1").getChild("tentacle_25").getChild("taclejointLB_2");
        this.taclejointLB_3 = root.getChild("mainbody").getChild("bodymmm").getChild("body_5").getChild("taclejointLB").getChild("tentacle_24").getChild("taclejointLB_1").getChild("tentacle_25").getChild("taclejointLB_2").getChild("tentacle_26").getChild("taclejointLB_3");
        this.jointLM = root.getChild("mainbody").getChild("jointLM");
        this.taclejointFR_2 = root.getChild("mainbody").getChild("bodymmm").getChild("body_3").getChild("taclejointFR").getChild("tentacle_18").getChild("taclejointFR_1").getChild("tentacle_19").getChild("taclejointFR_2");
        this.taclejointBL_4 = root.getChild("mainbody").getChild("bodymmm").getChild("body").getChild("taclejointBL").getChild("tentacle").getChild("taclejointBL_1").getChild("tentacle_1").getChild("taclejointBL_2").getChild("tentacle_2").getChild("taclejointBL_3").getChild("tentacle_3").getChild("taclejointBL_4");
        this.taclejointBR = root.getChild("mainbody").getChild("bodymmm").getChild("body_1").getChild("taclejointBR");
        this.taclejointBL = root.getChild("mainbody").getChild("bodymmm").getChild("body").getChild("taclejointBL");
        this.taclejointLF_2 = root.getChild("mainbody").getChild("bodymmm").getChild("body_8").getChild("taclejointLF").getChild("tentacle_42").getChild("taclejointLF_1").getChild("tentacle_43").getChild("taclejointLF_2");
        this.taclejointLB = root.getChild("mainbody").getChild("bodymmm").getChild("body_5").getChild("taclejointLB");
        this.taclejointLB_4 = root.getChild("mainbody").getChild("bodymmm").getChild("body_5").getChild("taclejointLB").getChild("tentacle_24").getChild("taclejointLB_1").getChild("tentacle_25").getChild("taclejointLB_2").getChild("tentacle_26").getChild("taclejointLB_3").getChild("tentacle_27").getChild("taclejointLB_4");
        this.taclejointRF = root.getChild("mainbody").getChild("bodymmm").getChild("body_7").getChild("taclejointRF");
        this.taclejointBL_5 = root.getChild("mainbody").getChild("bodymmm").getChild("body").getChild("taclejointBL").getChild("tentacle").getChild("taclejointBL_1").getChild("tentacle_1").getChild("taclejointBL_2").getChild("tentacle_2").getChild("taclejointBL_3").getChild("tentacle_3").getChild("taclejointBL_4").getChild("tentacle_4").getChild("taclejointBL_5");
        this.taclejointLF_5 = root.getChild("mainbody").getChild("bodymmm").getChild("body_8").getChild("taclejointLF").getChild("tentacle_42").getChild("taclejointLF_1").getChild("tentacle_43").getChild("taclejointLF_2").getChild("tentacle_44").getChild("taclejointLF_3").getChild("tentacle_45").getChild("taclejointLF_4").getChild("tentacle_46").getChild("taclejointLF_5");
        this.taclejointRB = root.getChild("mainbody").getChild("bodymmm").getChild("body_6").getChild("taclejointRB");
        this.taclejointRB_1 = root.getChild("mainbody").getChild("bodymmm").getChild("body_6").getChild("taclejointRB").getChild("tentacle_30").getChild("taclejointRB_1");
        this.jointRM_2 = root.getChild("mainbody").getChild("jointRM").getChild("mouth_3").getChild("jointRM_1").getChild("mouth_4").getChild("jointRM_2");
        this.taclejointBL_2 = root.getChild("mainbody").getChild("bodymmm").getChild("body").getChild("taclejointBL").getChild("tentacle").getChild("taclejointBL_1").getChild("tentacle_1").getChild("taclejointBL_2");
        this.taclejointBR_2 = root.getChild("mainbody").getChild("bodymmm").getChild("body_1").getChild("taclejointBR").getChild("tentacle_6").getChild("taclejointBR_1").getChild("tentacle_7").getChild("taclejointBR_2");
        this.taclejointRF_4 = root.getChild("mainbody").getChild("bodymmm").getChild("body_7").getChild("taclejointRF").getChild("tentacle_36").getChild("taclejointRF_1").getChild("tentacle_37").getChild("taclejointRF_2").getChild("tentacle_38").getChild("taclejointRF_3").getChild("tentacle_39").getChild("taclejointRF_4");
        this.taclejointFL_5 = root.getChild("mainbody").getChild("bodymmm").getChild("body_2").getChild("taclejointFL").getChild("tentacle_12").getChild("taclejointFL_1").getChild("tentacle_13").getChild("taclejointFL_2").getChild("tentacle_14").getChild("taclejointFL_3").getChild("tentacle_15").getChild("taclejointFL_4").getChild("tentacle_16").getChild("taclejointFL_5");
        this.taclejointFL_1 = root.getChild("mainbody").getChild("bodymmm").getChild("body_2").getChild("taclejointFL").getChild("tentacle_12").getChild("taclejointFL_1");
        this.jointLM_1 = root.getChild("mainbody").getChild("jointLM").getChild("mouth").getChild("jointLM_1");
        this.taclejointRB_2 = root.getChild("mainbody").getChild("bodymmm").getChild("body_6").getChild("taclejointRB").getChild("tentacle_30").getChild("taclejointRB_1").getChild("tentacle_31").getChild("taclejointRB_2");
        this.taclejointLB_5 = root.getChild("mainbody").getChild("bodymmm").getChild("body_5").getChild("taclejointLB").getChild("tentacle_24").getChild("taclejointLB_1").getChild("tentacle_25").getChild("taclejointLB_2").getChild("tentacle_26").getChild("taclejointLB_3").getChild("tentacle_27").getChild("taclejointLB_4").getChild("tentacle_28").getChild("taclejointLB_5");
        this.taclejointFR_3 = root.getChild("mainbody").getChild("bodymmm").getChild("body_3").getChild("taclejointFR").getChild("tentacle_18").getChild("taclejointFR_1").getChild("tentacle_19").getChild("taclejointFR_2").getChild("tentacle_20").getChild("taclejointFR_3");
        this.taclejointRF_2 = root.getChild("mainbody").getChild("bodymmm").getChild("body_7").getChild("taclejointRF").getChild("tentacle_36").getChild("taclejointRF_1").getChild("tentacle_37").getChild("taclejointRF_2");
        this.taclejointRB_4 = root.getChild("mainbody").getChild("bodymmm").getChild("body_6").getChild("taclejointRB").getChild("tentacle_30").getChild("taclejointRB_1").getChild("tentacle_31").getChild("taclejointRB_2").getChild("tentacle_32").getChild("taclejointRB_3").getChild("tentacle_33").getChild("taclejointRB_4");
        this.taclejointFL_2 = root.getChild("mainbody").getChild("bodymmm").getChild("body_2").getChild("taclejointFL").getChild("tentacle_12").getChild("taclejointFL_1").getChild("tentacle_13").getChild("taclejointFL_2");
        this.taclejointBL_1 = root.getChild("mainbody").getChild("bodymmm").getChild("body").getChild("taclejointBL").getChild("tentacle").getChild("taclejointBL_1");
        this.jointRM = root.getChild("mainbody").getChild("jointRM");
        this.taclejointBR_5 = root.getChild("mainbody").getChild("bodymmm").getChild("body_1").getChild("taclejointBR").getChild("tentacle_6").getChild("taclejointBR_1").getChild("tentacle_7").getChild("taclejointBR_2").getChild("tentacle_8").getChild("taclejointBR_3").getChild("tentacle_9").getChild("taclejointBR_4").getChild("tentacle_10").getChild("taclejointBR_5");
        this.taclejointRF_3 = root.getChild("mainbody").getChild("bodymmm").getChild("body_7").getChild("taclejointRF").getChild("tentacle_36").getChild("taclejointRF_1").getChild("tentacle_37").getChild("taclejointRF_2").getChild("tentacle_38").getChild("taclejointRF_3");
        this.taclejointFR_1 = root.getChild("mainbody").getChild("bodymmm").getChild("body_3").getChild("taclejointFR").getChild("tentacle_18").getChild("taclejointFR_1");
        this.taclejointFL_4 = root.getChild("mainbody").getChild("bodymmm").getChild("body_2").getChild("taclejointFL").getChild("tentacle_12").getChild("taclejointFL_1").getChild("tentacle_13").getChild("taclejointFL_2").getChild("tentacle_14").getChild("taclejointFL_3").getChild("tentacle_15").getChild("taclejointFL_4");
        this.taclejointLB_1 = root.getChild("mainbody").getChild("bodymmm").getChild("body_5").getChild("taclejointLB").getChild("tentacle_24").getChild("taclejointLB_1");
        this.mainbody = root.getChild("mainbody");
        this.taclejointLF_3 = root.getChild("mainbody").getChild("bodymmm").getChild("body_8").getChild("taclejointLF").getChild("tentacle_42").getChild("taclejointLF_1").getChild("tentacle_43").getChild("taclejointLF_2").getChild("tentacle_44").getChild("taclejointLF_3");
        this.taclejointBR_3 = root.getChild("mainbody").getChild("bodymmm").getChild("body_1").getChild("taclejointBR").getChild("tentacle_6").getChild("taclejointBR_1").getChild("tentacle_7").getChild("taclejointBR_2").getChild("tentacle_8").getChild("taclejointBR_3");
        this.taclejointBR_4 = root.getChild("mainbody").getChild("bodymmm").getChild("body_1").getChild("taclejointBR").getChild("tentacle_6").getChild("taclejointBR_1").getChild("tentacle_7").getChild("taclejointBR_2").getChild("tentacle_8").getChild("taclejointBR_3").getChild("tentacle_9").getChild("taclejointBR_4");
        this.taclejointFR_5 = root.getChild("mainbody").getChild("bodymmm").getChild("body_3").getChild("taclejointFR").getChild("tentacle_18").getChild("taclejointFR_1").getChild("tentacle_19").getChild("taclejointFR_2").getChild("tentacle_20").getChild("taclejointFR_3").getChild("tentacle_21").getChild("taclejointFR_4").getChild("tentacle_22").getChild("taclejointFR_5");
        this.taclejointFR_4 = root.getChild("mainbody").getChild("bodymmm").getChild("body_3").getChild("taclejointFR").getChild("tentacle_18").getChild("taclejointFR_1").getChild("tentacle_19").getChild("taclejointFR_2").getChild("tentacle_20").getChild("taclejointFR_3").getChild("tentacle_21").getChild("taclejointFR_4");
        this.taclejointFR = root.getChild("mainbody").getChild("bodymmm").getChild("body_3").getChild("taclejointFR");
        this.mainbodyBaseX = 0.0f;
        this.mainbodyBaseY = 21.0f;
        this.mainbodyBaseZ = 0.0f;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 21.0f, 0.0f, 0.0f, 0.0f, 1.5707964f));
                PartDefinition bodymmm = mainbody.addOrReplaceChild("bodymmm", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, -7.0f, -7.0f, 18, 14, 14), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body = bodymmm.addOrReplaceChild("body", CubeListBuilder.create().texOffs(50, 0).addBox(-3.0f, -2.0f, -2.0f, 6, 4, 4), PartPose.offsetAndRotation(5.0f, -4.0f, -8.0f, 0.0f, -0.7679449f, 0.34906584f));
                PartDefinition taclejointBL = body.addOrReplaceChild("taclejointBL", CubeListBuilder.create().texOffs(90, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition tentacle = taclejointBL.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(64, 8).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.13962634f, -2.0490165f, 0.0f));
                PartDefinition taclejointBL_1 = tentacle.addOrReplaceChild("taclejointBL_1", CubeListBuilder.create().texOffs(106, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
                PartDefinition tentacle_1 = taclejointBL_1.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(78, 8).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.08726646f, 0.75398225f, 0.0f));
                PartDefinition taclejointBL_2 = tentacle_1.addOrReplaceChild("taclejointBL_2", CubeListBuilder.create().texOffs(110, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_2 = taclejointBL_2.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(134, 9).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.08726646f, 0.87964594f, 0.0f));
                PartDefinition taclejointBL_3 = tentacle_2.addOrReplaceChild("taclejointBL_3", CubeListBuilder.create().texOffs(126, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_3 = taclejointBL_3.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(201, 9).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.08726646f, -0.43982297f, 0.0f));
                PartDefinition taclejointBL_4 = tentacle_3.addOrReplaceChild("taclejointBL_4", CubeListBuilder.create().texOffs(142, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_4 = taclejointBL_4.addOrReplaceChild("tentacle_4", CubeListBuilder.create().texOffs(156, 12).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.08726646f, 0.50265485f, 0.0f));
                PartDefinition taclejointBL_5 = tentacle_4.addOrReplaceChild("taclejointBL_5", CubeListBuilder.create().texOffs(146, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_5 = taclejointBL_5.addOrReplaceChild("tentacle_5", CubeListBuilder.create().texOffs(100, 10).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 18), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.08726646f, -0.69115037f, 0.0f));
                PartDefinition body_1 = bodymmm.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(70, 0).addBox(-3.0f, -2.0f, -2.0f, 6, 4, 4), PartPose.offsetAndRotation(5.0f, 4.0f, -8.0f, 0.0f, -0.7679449f, -0.34906584f));
                PartDefinition taclejointBR = body_1.addOrReplaceChild("taclejointBR", CubeListBuilder.create().texOffs(150, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition tentacle_6 = taclejointBR.addOrReplaceChild("tentacle_6", CubeListBuilder.create().texOffs(182, 19).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.13962634f, -2.0490165f, 0.0f));
                PartDefinition taclejointBR_1 = tentacle_6.addOrReplaceChild("taclejointBR_1", CubeListBuilder.create().texOffs(169, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
                PartDefinition tentacle_7 = taclejointBR_1.addOrReplaceChild("tentacle_7", CubeListBuilder.create().texOffs(48, 23).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.08726646f, 0.75398225f, 0.0f));
                PartDefinition taclejointBR_2 = tentacle_7.addOrReplaceChild("taclejointBR_2", CubeListBuilder.create().texOffs(173, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_8 = taclejointBR_2.addOrReplaceChild("tentacle_8", CubeListBuilder.create().texOffs(0, 28).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.08726646f, 0.87964594f, 0.0f));
                PartDefinition taclejointBR_3 = tentacle_8.addOrReplaceChild("taclejointBR_3", CubeListBuilder.create().texOffs(193, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_9 = taclejointBR_3.addOrReplaceChild("tentacle_9", CubeListBuilder.create().texOffs(72, 28).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.08726646f, -0.43982297f, 0.0f));
                PartDefinition taclejointBR_4 = tentacle_9.addOrReplaceChild("taclejointBR_4", CubeListBuilder.create().texOffs(208, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_10 = taclejointBR_4.addOrReplaceChild("tentacle_10", CubeListBuilder.create().texOffs(124, 28).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.08726646f, 0.50265485f, 0.0f));
                PartDefinition taclejointBR_5 = tentacle_10.addOrReplaceChild("taclejointBR_5", CubeListBuilder.create().texOffs(220, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_11 = taclejointBR_5.addOrReplaceChild("tentacle_11", CubeListBuilder.create().texOffs(20, 29).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 18), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.08726646f, -0.69115037f, 0.0f));
                PartDefinition body_2 = bodymmm.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(90, 0).addBox(-3.0f, -2.0f, -2.0f, 6, 4, 4), PartPose.offsetAndRotation(5.0f, -4.0f, 8.0f, 0.0f, 0.7679449f, 0.34906584f));
                PartDefinition taclejointFL = body_2.addOrReplaceChild("taclejointFL", CubeListBuilder.create().texOffs(241, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition tentacle_12 = taclejointFL.addOrReplaceChild("tentacle_12", CubeListBuilder.create().texOffs(200, 29).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.13962634f, -1.0925761f, 0.0f));
                PartDefinition taclejointFL_1 = tentacle_12.addOrReplaceChild("taclejointFL_1", CubeListBuilder.create().texOffs(245, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
                PartDefinition tentacle_13 = taclejointFL_1.addOrReplaceChild("tentacle_13", CubeListBuilder.create().texOffs(146, 31).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.08726646f, -0.75398225f, 0.0f));
                PartDefinition taclejointFL_2 = tentacle_13.addOrReplaceChild("taclejointFL_2", CubeListBuilder.create().texOffs(223, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_14 = taclejointFL_2.addOrReplaceChild("tentacle_14", CubeListBuilder.create().texOffs(96, 32).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.08726646f, -0.87964594f, 0.0f));
                PartDefinition taclejointFL_3 = tentacle_14.addOrReplaceChild("taclejointFL_3", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_15 = taclejointFL_3.addOrReplaceChild("tentacle_15", CubeListBuilder.create().texOffs(170, 35).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.08726646f, 0.43982297f, 0.0f));
                PartDefinition taclejointFL_4 = tentacle_15.addOrReplaceChild("taclejointFL_4", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_16 = taclejointFL_4.addOrReplaceChild("tentacle_16", CubeListBuilder.create().texOffs(44, 43).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.08726646f, -0.50265485f, 0.0f));
                PartDefinition taclejointFL_5 = tentacle_16.addOrReplaceChild("taclejointFL_5", CubeListBuilder.create().texOffs(8, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_17 = taclejointFL_5.addOrReplaceChild("tentacle_17", CubeListBuilder.create().texOffs(192, 44).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 18), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.08726646f, 0.69115037f, 0.0f));
                PartDefinition body_3 = bodymmm.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(110, 0).addBox(-3.0f, -2.0f, -2.0f, 6, 4, 4), PartPose.offsetAndRotation(5.0f, 4.0f, 8.0f, 0.0f, 0.7679449f, -0.34906584f));
                PartDefinition taclejointFR = body_3.addOrReplaceChild("taclejointFR", CubeListBuilder.create().texOffs(50, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition tentacle_18 = taclejointFR.addOrReplaceChild("tentacle_18", CubeListBuilder.create().texOffs(218, 32).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.13962634f, -1.0925761f, 0.0f));
                PartDefinition taclejointFR_1 = tentacle_18.addOrReplaceChild("taclejointFR_1", CubeListBuilder.create().texOffs(66, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
                PartDefinition tentacle_19 = taclejointFR_1.addOrReplaceChild("tentacle_19", CubeListBuilder.create().texOffs(118, 47).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.08726646f, -0.75398225f, 0.0f));
                PartDefinition taclejointFR_2 = tentacle_19.addOrReplaceChild("taclejointFR_2", CubeListBuilder.create().texOffs(70, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_20 = taclejointFR_2.addOrReplaceChild("tentacle_20", CubeListBuilder.create().texOffs(66, 48).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.08726646f, -0.87964594f, 0.0f));
                PartDefinition taclejointFR_3 = tentacle_20.addOrReplaceChild("taclejointFR_3", CubeListBuilder.create().texOffs(86, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_21 = taclejointFR_3.addOrReplaceChild("tentacle_21", CubeListBuilder.create().texOffs(0, 49).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.08726646f, 0.43982297f, 0.0f));
                PartDefinition taclejointFR_4 = tentacle_21.addOrReplaceChild("taclejointFR_4", CubeListBuilder.create().texOffs(90, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_22 = taclejointFR_4.addOrReplaceChild("tentacle_22", CubeListBuilder.create().texOffs(88, 51).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.08726646f, -0.50265485f, 0.0f));
                PartDefinition taclejointFR_5 = tentacle_22.addOrReplaceChild("taclejointFR_5", CubeListBuilder.create().texOffs(106, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_23 = taclejointFR_5.addOrReplaceChild("tentacle_23", CubeListBuilder.create().texOffs(22, 51).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 18), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.08726646f, 0.69115037f, 0.0f));
                PartDefinition body_4 = bodymmm.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(122, 0).addBox(-1.0f, -4.0f, -4.0f, 6, 8, 8), PartPose.offsetAndRotation(18.0f, 0.0f, 0.0f, -0.7853982f, 0.0f, 0.0f));
                PartDefinition body_9 = body_4.addOrReplaceChild("body_9", CubeListBuilder.create().texOffs(225, 9).addBox(0.0f, -3.0f, -3.0f, 5, 6, 6), PartPose.offset(5.0f, 0.0f, 0.0f));
                PartDefinition body_10 = body_9.addOrReplaceChild("body_10", CubeListBuilder.create().texOffs(102, 8).addBox(0.0f, -2.0f, -2.0f, 4, 4, 4), PartPose.offset(5.0f, 0.0f, 0.0f));
                PartDefinition jointL = bodymmm.addOrReplaceChild("jointL", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.3f, -3.0f, 0.0f));
                PartDefinition mouthi = jointL.addOrReplaceChild("mouthi", CubeListBuilder.create().texOffs(178, 9).addBox(-2.0f, -1.0f, -3.0f, 3, 3, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.6457718f));
                PartDefinition jointR = bodymmm.addOrReplaceChild("jointR", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.3f, 3.0f, 0.0f));
                PartDefinition mouthi_1 = jointR.addOrReplaceChild("mouthi_1", CubeListBuilder.create().texOffs(122, 16).addBox(-2.0f, -2.0f, -3.0f, 4, 3, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6457718f));
                PartDefinition jointB = bodymmm.addOrReplaceChild("jointB", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.3f, 0.0f, -6.0f));
                PartDefinition mouthi_2 = jointB.addOrReplaceChild("mouthi_2", CubeListBuilder.create().texOffs(42, 28).addBox(-3.0f, -1.5f, -3.0f, 5, 3, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.5707964f, 0.34906584f, 0.0f));
                PartDefinition jointF = bodymmm.addOrReplaceChild("jointF", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.3f, 0.0f, 6.0f));
                PartDefinition mouthi_3 = jointF.addOrReplaceChild("mouthi_3", CubeListBuilder.create().texOffs(118, 30).addBox(-3.0f, -1.5f, -3.0f, 5, 3, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.5707964f, -0.34906584f, 0.0f));
                PartDefinition body_5 = bodymmm.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(150, 0).addBox(-3.0f, -2.0f, -2.5f, 7, 4, 5), PartPose.offsetAndRotation(12.0f, -8.0f, -4.0f, -1.5707964f, -0.20943952f, 0.7679449f));
                PartDefinition taclejointLB = body_5.addOrReplaceChild("taclejointLB", CubeListBuilder.create().texOffs(110, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition tentacle_24 = taclejointLB.addOrReplaceChild("tentacle_24", CubeListBuilder.create().texOffs(145, 54).addBox(-1.5f, -1.5f, -1.5f, 3, 3, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.8771753f, 0.0f));
                PartDefinition taclejointLB_1 = tentacle_24.addOrReplaceChild("taclejointLB_1", CubeListBuilder.create().texOffs(126, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
                PartDefinition tentacle_25 = taclejointLB_1.addOrReplaceChild("tentacle_25", CubeListBuilder.create().texOffs(161, 55).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointLB_2 = tentacle_25.addOrReplaceChild("taclejointLB_2", CubeListBuilder.create().texOffs(142, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_26 = taclejointLB_2.addOrReplaceChild("tentacle_26", CubeListBuilder.create().texOffs(185, 64).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointLB_3 = tentacle_26.addOrReplaceChild("taclejointLB_3", CubeListBuilder.create().texOffs(146, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_27 = taclejointLB_3.addOrReplaceChild("tentacle_27", CubeListBuilder.create().texOffs(46, 67).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointLB_4 = tentacle_27.addOrReplaceChild("taclejointLB_4", CubeListBuilder.create().texOffs(150, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_28 = taclejointLB_4.addOrReplaceChild("tentacle_28", CubeListBuilder.create().texOffs(110, 67).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointLB_5 = tentacle_28.addOrReplaceChild("taclejointLB_5", CubeListBuilder.create().texOffs(169, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_29 = taclejointLB_5.addOrReplaceChild("tentacle_29", CubeListBuilder.create().texOffs(202, 64).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 21), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition body_6 = bodymmm.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(174, 0).addBox(-3.0f, -1.9f, -2.5f, 7, 4, 5), PartPose.offsetAndRotation(12.0f, 8.0f, -4.0f, 1.5707964f, -0.20943952f, -0.7679449f));
                PartDefinition taclejointRB = body_6.addOrReplaceChild("taclejointRB", CubeListBuilder.create().texOffs(173, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition tentacle_30 = taclejointRB.addOrReplaceChild("tentacle_30", CubeListBuilder.create().texOffs(0, 69).addBox(-1.5f, -1.5f, -1.5f, 3, 3, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.8771753f, 0.0f));
                PartDefinition taclejointRB_1 = tentacle_30.addOrReplaceChild("taclejointRB_1", CubeListBuilder.create().texOffs(193, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
                PartDefinition tentacle_31 = taclejointRB_1.addOrReplaceChild("tentacle_31", CubeListBuilder.create().texOffs(86, 70).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointRB_2 = tentacle_31.addOrReplaceChild("taclejointRB_2", CubeListBuilder.create().texOffs(241, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_32 = taclejointRB_2.addOrReplaceChild("tentacle_32", CubeListBuilder.create().texOffs(132, 70).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointRB_3 = tentacle_32.addOrReplaceChild("taclejointRB_3", CubeListBuilder.create().texOffs(245, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_33 = taclejointRB_3.addOrReplaceChild("tentacle_33", CubeListBuilder.create().texOffs(16, 71).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointRB_4 = tentacle_33.addOrReplaceChild("taclejointRB_4", CubeListBuilder.create().texOffs(222, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_34 = taclejointRB_4.addOrReplaceChild("tentacle_34", CubeListBuilder.create().texOffs(154, 75).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointRB_5 = tentacle_34.addOrReplaceChild("taclejointRB_5", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_35 = taclejointRB_5.addOrReplaceChild("tentacle_35", CubeListBuilder.create().texOffs(171, 83).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 21), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition b = bodymmm.addOrReplaceChild("b", CubeListBuilder.create().texOffs(198, 0).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 2), PartPose.offsetAndRotation(13.0f, 0.0f, -7.7f, 0.0f, 0.0f, -0.7853982f));
                PartDefinition b_1 = bodymmm.addOrReplaceChild("b_1", CubeListBuilder.create().texOffs(210, 0).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 2), PartPose.offsetAndRotation(13.0f, 0.0f, 7.7f, 0.0f, 0.0f, -0.7853982f));
                PartDefinition body_7 = bodymmm.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(222, 0).addBox(-3.0f, -2.0f, -2.5f, 7, 4, 5), PartPose.offsetAndRotation(12.0f, 8.0f, 4.0f, 1.5707964f, 0.20943952f, -0.7679449f));
                PartDefinition taclejointRF = body_7.addOrReplaceChild("taclejointRF", CubeListBuilder.create().texOffs(4, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition tentacle_36 = taclejointRF.addOrReplaceChild("tentacle_36", CubeListBuilder.create().texOffs(113, 86).addBox(-1.5f, -1.5f, -1.5f, 3, 3, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.8771753f, 0.0f));
                PartDefinition taclejointRF_1 = tentacle_36.addOrReplaceChild("taclejointRF_1", CubeListBuilder.create().texOffs(8, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
                PartDefinition tentacle_37 = taclejointRF_1.addOrReplaceChild("tentacle_37", CubeListBuilder.create().texOffs(40, 87).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointRF_2 = tentacle_37.addOrReplaceChild("taclejointRF_2", CubeListBuilder.create().texOffs(142, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_38 = taclejointRF_2.addOrReplaceChild("tentacle_38", CubeListBuilder.create().texOffs(129, 89).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointRF_3 = tentacle_38.addOrReplaceChild("taclejointRF_3", CubeListBuilder.create().texOffs(146, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_39 = taclejointRF_3.addOrReplaceChild("tentacle_39", CubeListBuilder.create().texOffs(80, 90).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointRF_4 = tentacle_39.addOrReplaceChild("taclejointRF_4", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_40 = taclejointRF_4.addOrReplaceChild("tentacle_40", CubeListBuilder.create().texOffs(201, 90).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointRF_5 = tentacle_40.addOrReplaceChild("taclejointRF_5", CubeListBuilder.create().texOffs(4, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_41 = taclejointRF_5.addOrReplaceChild("tentacle_41", CubeListBuilder.create().texOffs(0, 91).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 21), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition body_8 = bodymmm.addOrReplaceChild("body_8", CubeListBuilder.create().texOffs(193, 6).addBox(-3.0f, -2.0f, -2.5f, 7, 4, 5), PartPose.offsetAndRotation(12.0f, -8.0f, 4.0f, -1.5707964f, 0.20943952f, 0.7679449f));
                PartDefinition taclejointLF = body_8.addOrReplaceChild("taclejointLF", CubeListBuilder.create().texOffs(8, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition tentacle_42 = taclejointLF.addOrReplaceChild("tentacle_42", CubeListBuilder.create().texOffs(64, 87).addBox(-1.5f, -1.5f, -1.5f, 3, 3, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.8771753f, 0.0f));
                PartDefinition taclejointLF_1 = tentacle_42.addOrReplaceChild("taclejointLF_1", CubeListBuilder.create().texOffs(142, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
                PartDefinition tentacle_43 = taclejointLF_1.addOrReplaceChild("tentacle_43", CubeListBuilder.create().texOffs(104, 102).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointLF_2 = tentacle_43.addOrReplaceChild("taclejointLF_2", CubeListBuilder.create().texOffs(146, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_44 = taclejointLF_2.addOrReplaceChild("tentacle_44", CubeListBuilder.create().texOffs(151, 106).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointLF_3 = tentacle_44.addOrReplaceChild("taclejointLF_3", CubeListBuilder.create().texOffs(212, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_45 = taclejointLF_3.addOrReplaceChild("tentacle_45", CubeListBuilder.create().texOffs(30, 107).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointLF_4 = tentacle_45.addOrReplaceChild("taclejointLF_4", CubeListBuilder.create().texOffs(216, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_46 = taclejointLF_4.addOrReplaceChild("tentacle_46", CubeListBuilder.create().texOffs(128, 109).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition taclejointLF_5 = tentacle_46.addOrReplaceChild("taclejointLF_5", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
                PartDefinition tentacle_47 = taclejointLF_5.addOrReplaceChild("tentacle_47", CubeListBuilder.create().texOffs(168, 106).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 21), PartPose.offset(0.0f, 0.0f, 1.0f));
                PartDefinition jointLM = mainbody.addOrReplaceChild("jointLM", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -6.0f, 0.0f));
                PartDefinition mouth = jointLM.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(193, 109).addBox(-2.0f, -3.0f, -6.5f, 12, 4, 13), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition jointLM_1 = mouth.addOrReplaceChild("jointLM_1", CubeListBuilder.create().texOffs(4, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.0f, 0.0f, 0.0f));
                PartDefinition mouth_1 = jointLM_1.addOrReplaceChild("mouth_1", CubeListBuilder.create().texOffs(70, 111).addBox(-1.0f, -2.0f, -5.5f, 11, 3, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.21642083f));
                PartDefinition jointLM_2 = mouth_1.addOrReplaceChild("jointLM_2", CubeListBuilder.create().texOffs(86, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.0f, 0.0f, 0.0f));
                PartDefinition mouth_2 = jointLM_2.addOrReplaceChild("mouth_2", CubeListBuilder.create().texOffs(214, 47).addBox(-1.0f, -1.0f, -3.5f, 10, 2, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.34906584f));
                PartDefinition dec_16 = mouth_2.addOrReplaceChild("dec_16", CubeListBuilder.create().texOffs(102, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(2.0f, 1.0f, -2.0f, -0.56548667f, 0.0f, -0.36651915f));
                PartDefinition dec_17 = mouth_2.addOrReplaceChild("dec_17", CubeListBuilder.create().texOffs(114, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(2.0f, 1.0f, 2.0f, 0.43982297f, 0.0f, -0.49218285f));
                PartDefinition dec_18 = mouth_2.addOrReplaceChild("dec_18", CubeListBuilder.create().texOffs(241, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(4.0f, 1.0f, -2.5f, -0.50265485f, 0.0f, -0.36651915f));
                PartDefinition dec_19 = mouth_2.addOrReplaceChild("dec_19", CubeListBuilder.create().texOffs(86, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(4.0f, 1.0f, 2.5f, 0.50265485f, 0.0f, -0.5550147f));
                PartDefinition dec_20 = mouth_2.addOrReplaceChild("dec_20", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(6.0f, 1.0f, -2.0f, -0.50265485f, 0.0f, -0.429351f));
                PartDefinition dec_21 = mouth_2.addOrReplaceChild("dec_21", CubeListBuilder.create().texOffs(4, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(6.0f, 1.0f, 2.0f, 0.25132743f, 0.0f, -0.36651915f));
                PartDefinition dec_22 = mouth_2.addOrReplaceChild("dec_22", CubeListBuilder.create().texOffs(90, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(8.0f, 1.0f, -1.0f, -0.31415927f, 0.0f, -0.49218285f));
                PartDefinition dec_23 = mouth_2.addOrReplaceChild("dec_23", CubeListBuilder.create().texOffs(71, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(8.0f, 1.0f, 1.0f, 0.08726646f, 0.0f, -0.4537856f));
                PartDefinition dec_8 = mouth_1.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(90, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(2.5f, 1.0f, -4.0f, -0.43982297f, 0.0f, -0.07679449f));
                PartDefinition dec_9 = mouth_1.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(245, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(2.5f, 1.0f, 4.0f, 0.25132743f, 0.0f, -0.3281219f));
                PartDefinition dec_10 = mouth_1.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(156, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(5.0f, 1.0f, -3.5f, -0.50265485f, 0.0f, -0.07679449f));
                PartDefinition dec_11 = mouth_1.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(160, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(5.0f, 1.0f, 3.5f, 0.25132743f, 0.0f, -0.39095375f));
                PartDefinition dec_12 = mouth_1.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(164, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 6, 1), PartPose.offset(7.5f, 1.0f, -4.5f));
                PartDefinition dec_13 = mouth_1.addOrReplaceChild("dec_13", CubeListBuilder.create().texOffs(168, 9).addBox(-0.5f, -0.5f, -0.4f, 1, 6, 1), PartPose.offsetAndRotation(7.5f, 1.0f, 4.5f, 0.31415927f, 0.0f, -0.22340214f));
                PartDefinition dec_14 = mouth_1.addOrReplaceChild("dec_14", CubeListBuilder.create().texOffs(178, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(9.4f, 1.0f, -4.0f, -0.31415927f, 0.0f, -0.2443461f));
                PartDefinition dec_15 = mouth_1.addOrReplaceChild("dec_15", CubeListBuilder.create().texOffs(225, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(9.4f, 1.0f, 4.0f, 0.25132743f, 0.0f, -0.2443461f));
                PartDefinition dec = mouth.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(8, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(2.5f, 1.0f, -4.5f, -0.56548667f, 0.0f, -0.33161256f));
                PartDefinition dec_1 = mouth.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(50, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(5.0f, 1.0f, -5.0f, -0.43982297f, 0.0f, -0.2687807f));
                PartDefinition dec_2 = mouth.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(54, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(8.0f, 1.0f, -4.0f, -0.50265485f, 0.0f, -0.20594884f));
                PartDefinition dec_3 = mouth.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(64, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(8.0f, 1.0f, 4.0f, 0.43982297f, 0.0f, -0.2687807f));
                PartDefinition dec_4 = mouth.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(58, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(5.0f, 1.0f, 5.0f, 0.43982297f, 0.0f, -0.3944444f));
                PartDefinition dec_5 = mouth.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(68, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(2.5f, 1.0f, 4.5f, 0.43982297f, 0.0f, -0.33161256f));
                PartDefinition dec_6 = mouth.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(72, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(10.0f, 1.0f, -5.0f, -0.43982297f, 0.0f, -0.33161256f));
                PartDefinition dec_7 = mouth.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(82, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(10.0f, 1.0f, 5.0f, 0.25132743f, 0.0f, -0.3944444f));
                PartDefinition jointRM = mainbody.addOrReplaceChild("jointRM", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 6.0f, 0.0f));
                PartDefinition mouth_3 = jointRM.addOrReplaceChild("mouth_3", CubeListBuilder.create().texOffs(57, 125).addBox(-2.0f, -3.0f, -6.5f, 12, 4, 13), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition jointRM_1 = mouth_3.addOrReplaceChild("jointRM_1", CubeListBuilder.create().texOffs(118, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.0f, 0.0f, 0.0f));
                PartDefinition mouth_4 = jointRM_1.addOrReplaceChild("mouth_4", CubeListBuilder.create().texOffs(203, 126).addBox(-1.0f, -2.0f, -5.5f, 11, 3, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.21642083f));
                PartDefinition jointRM_2 = mouth_4.addOrReplaceChild("jointRM_2", CubeListBuilder.create().texOffs(212, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.0f, 0.0f, 0.0f));
                PartDefinition mouth_5 = jointRM_2.addOrReplaceChild("mouth_5", CubeListBuilder.create().texOffs(151, 94).addBox(-1.0f, -1.0f, -3.5f, 10, 2, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.34906584f));
                PartDefinition dec_40 = mouth_5.addOrReplaceChild("dec_40", CubeListBuilder.create().texOffs(196, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(2.0f, 1.0f, -2.0f, -0.6143559f, 0.0f, -0.36651915f));
                PartDefinition dec_41 = mouth_5.addOrReplaceChild("dec_41", CubeListBuilder.create().texOffs(164, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(2.0f, 1.0f, 2.0f, 0.31415927f, 0.0f, -0.36651915f));
                PartDefinition dec_42 = mouth_5.addOrReplaceChild("dec_42", CubeListBuilder.create().texOffs(168, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(4.0f, 1.0f, -2.5f, -0.37699112f, 0.0f, -0.429351f));
                PartDefinition dec_43 = mouth_5.addOrReplaceChild("dec_43", CubeListBuilder.create().texOffs(86, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(4.0f, 1.0f, 2.5f, 0.37699112f, 0.0f, -0.36651915f));
                PartDefinition dec_44 = mouth_5.addOrReplaceChild("dec_44", CubeListBuilder.create().texOffs(178, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(6.0f, 1.0f, -2.0f, -0.43982297f, 0.0f, -0.36651915f));
                PartDefinition dec_45 = mouth_5.addOrReplaceChild("dec_45", CubeListBuilder.create().texOffs(182, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(6.0f, 1.0f, 2.0f, 0.37699112f, 0.0f, -0.36651915f));
                PartDefinition dec_46 = mouth_5.addOrReplaceChild("dec_46", CubeListBuilder.create().texOffs(186, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(8.0f, 1.0f, -1.0f, -0.3211406f, 0.0f, -0.5550147f));
                PartDefinition dec_47 = mouth_5.addOrReplaceChild("dec_47", CubeListBuilder.create().texOffs(190, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(8.0f, 1.0f, 1.0f, 0.37350047f, 0.0f, -0.5061455f));
                PartDefinition dec_32 = mouth_4.addOrReplaceChild("dec_32", CubeListBuilder.create().texOffs(64, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(2.5f, 1.0f, -4.0f, -0.3036873f, 0.0f, -0.07679449f));
                PartDefinition dec_33 = mouth_4.addOrReplaceChild("dec_33", CubeListBuilder.create().texOffs(106, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(2.5f, 1.0f, 4.0f, 0.37699112f, 0.0f, -0.3281219f));
                PartDefinition dec_34 = mouth_4.addOrReplaceChild("dec_34", CubeListBuilder.create().texOffs(110, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(5.0f, 1.0f, -3.5f, -0.43982297f, 0.0f, -0.07679449f));
                PartDefinition dec_35 = mouth_4.addOrReplaceChild("dec_35", CubeListBuilder.create().texOffs(114, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(5.0f, 1.0f, 3.5f, 0.37699112f, 0.0f, -0.3281219f));
                PartDefinition dec_36 = mouth_4.addOrReplaceChild("dec_36", CubeListBuilder.create().texOffs(122, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offset(7.5f, 1.0f, -4.5f));
                PartDefinition dec_37 = mouth_4.addOrReplaceChild("dec_37", CubeListBuilder.create().texOffs(136, 16).addBox(-0.5f, -0.5f, -0.4f, 1, 4, 1), PartPose.offsetAndRotation(7.5f, 1.0f, 4.5f, 0.56548667f, 0.0f, -0.22340214f));
                PartDefinition dec_38 = mouth_4.addOrReplaceChild("dec_38", CubeListBuilder.create().texOffs(140, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(9.4f, 1.0f, -4.0f, -0.31415927f, 0.0f, -0.055850536f));
                PartDefinition dec_39 = mouth_4.addOrReplaceChild("dec_39", CubeListBuilder.create().texOffs(144, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(9.4f, 1.0f, 4.0f, 0.43982297f, 0.0f, -0.2443461f));
                PartDefinition dec_24 = mouth_3.addOrReplaceChild("dec_24", CubeListBuilder.create().texOffs(82, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(2.5f, 1.0f, -4.5f, -0.37699112f, 0.0f, -0.3944444f));
                PartDefinition dec_25 = mouth_3.addOrReplaceChild("dec_25", CubeListBuilder.create().texOffs(156, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(5.0f, 1.0f, -5.0f, -0.37699112f, 0.0f, -0.20594884f));
                PartDefinition dec_26 = mouth_3.addOrReplaceChild("dec_26", CubeListBuilder.create().texOffs(160, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(8.0f, 1.0f, -4.0f, -0.37699112f, 0.0f, -0.143117f));
                PartDefinition dec_27 = mouth_3.addOrReplaceChild("dec_27", CubeListBuilder.create().texOffs(200, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(8.0f, 1.0f, 4.0f, 0.50265485f, 0.0f, -0.2687807f));
                PartDefinition dec_28 = mouth_3.addOrReplaceChild("dec_28", CubeListBuilder.create().texOffs(204, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(5.0f, 1.0f, 5.0f, 0.50265485f, 0.0f, -0.33161256f));
                PartDefinition dec_29 = mouth_3.addOrReplaceChild("dec_29", CubeListBuilder.create().texOffs(208, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(2.5f, 1.0f, 4.5f, 0.50265485f, 0.0f, -0.45727625f));
                PartDefinition dec_30 = mouth_3.addOrReplaceChild("dec_30", CubeListBuilder.create().texOffs(212, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(10.0f, 1.0f, -5.0f, -0.43982297f, 0.0f, -0.2687807f));
                PartDefinition dec_31 = mouth_3.addOrReplaceChild("dec_31", CubeListBuilder.create().texOffs(102, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(10.0f, 1.0f, 5.0f, 0.37699112f, 0.0f, -0.45727625f));
        return LayerDefinition.create(mesh, 250, 150);
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
        float base = (modelRenderer == this.mainbody) ? this.mainbodyBaseY : 0.0f;
        modelRenderer.y = base + (float)invert * Mth.cos(f * speed) * f1 * distance;
    }

    private void underground(com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase parasite, float ageInTicks, ModelPart mainbody) {
    }


    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        EntityParasiteBase parasite = (EntityParasiteBase)entity;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            float f1 = Mth.sin((float)(ageInTicks * 0.098f)) * 0.0865f;
            float f2 = Mth.sin((float)(ageInTicks * 0.09878f)) * 0.07545f;
            float f3 = Mth.sin((float)(ageInTicks * 0.0885f)) * 0.08655f;
            float f4 = Mth.sin((float)(ageInTicks * 0.08768f)) * 0.0865f;
            float f5 = Mth.sin((float)(ageInTicks * 0.0888f)) * 0.0975f;
            this.taclejointFL.yRot = f1;
            this.taclejointFL_1.yRot = f2;
            this.taclejointFL_2.yRot = f4;
            this.taclejointFL_3.yRot = f5;
            this.taclejointFL_4.yRot = f2;
            this.taclejointFL_4.zRot = f1;
            this.taclejointFL_5.yRot = f3;
            this.taclejointFL_5.zRot = f3;
            this.taclejointFR.yRot = f3;
            this.taclejointFR_1.yRot = f4;
            this.taclejointFR_2.yRot = f1;
            this.taclejointFR_3.yRot = f2;
            this.taclejointFR_4.yRot = f1;
            this.taclejointFR_4.zRot = f5;
            this.taclejointFR_5.yRot = f3;
            this.taclejointFR_5.zRot = f2;
            this.taclejointBL.yRot = f5;
            this.taclejointBL_1.yRot = f4;
            this.taclejointBL_2.yRot = f4;
            this.taclejointBL_3.yRot = f2;
            this.taclejointBL_4.yRot = f4;
            this.taclejointBL_4.zRot = f5;
            this.taclejointBL_5.yRot = f1;
            this.taclejointBL_5.zRot = f3;
            this.taclejointBR.yRot = f2;
            this.taclejointBR_1.yRot = f2;
            this.taclejointBR_2.yRot = f3;
            this.taclejointBR_3.yRot = f4;
            this.taclejointBR_4.yRot = f5;
            this.taclejointBR_4.zRot = f1;
            this.taclejointBR_5.yRot = f2;
            this.taclejointBR_5.zRot = f4;
            f1 = Mth.sin((float)(ageInTicks * 0.198f)) * 0.075f;
            f2 = Mth.sin((float)(ageInTicks * 0.0878f)) * 0.07545f;
            f3 = Mth.sin((float)(ageInTicks * 0.09885f)) * 0.0755f;
            f4 = Mth.sin((float)(ageInTicks * 0.08768f)) * 0.09765f;
            this.taclejointLF.yRot = f5 = Mth.sin((float)(ageInTicks * 0.0888f)) * 0.0865f;
            this.taclejointLF_1.yRot = f3;
            this.taclejointLF_2.yRot = f2;
            this.taclejointLF_2.xRot = f1;
            this.taclejointLF_3.yRot = f3;
            this.taclejointLF_3.xRot = f4;
            this.taclejointLF_4.yRot = f4;
            this.taclejointLF_5.yRot = f5;
            this.taclejointLB.yRot = f1;
            this.taclejointLB_1.yRot = f2;
            this.taclejointLB_2.yRot = f2;
            this.taclejointLB_2.xRot = f3;
            this.taclejointLB_3.yRot = f5;
            this.taclejointLB_3.xRot = f3;
            this.taclejointLB_4.yRot = f4;
            this.taclejointLB_5.yRot = f1;
            this.taclejointRF.yRot = f3;
            this.taclejointRF_1.yRot = f1;
            this.taclejointRF_2.yRot = f2;
            this.taclejointRF_2.xRot = f4;
            this.taclejointRF_3.yRot = f5;
            this.taclejointRF_3.xRot = f2;
            this.taclejointRF_4.yRot = f1;
            this.taclejointRF_5.yRot = f3;
            this.taclejointRB.yRot = f4;
            this.taclejointRB_1.yRot = f3;
            this.taclejointRB_2.yRot = f2;
            this.taclejointRB_2.xRot = f5;
            this.taclejointRB_3.yRot = f1;
            this.taclejointRB_3.xRot = f2;
            this.taclejointRB_4.yRot = f1;
            this.taclejointRB_5.yRot = f3;
            f1 = Mth.sin((float)(ageInTicks * 0.088f)) * 0.1375f;
            f2 = Mth.sin((float)(ageInTicks * 0.0878f)) * 0.137545f;
            this.jointLM.zRot = -0.15f + f1;
            this.jointLM_1.zRot = f1;
            this.jointLM_2.zRot = f1;
            this.jointRM.zRot = 0.15f + -1.0f * f1;
            this.jointRM_1.zRot = f1;
            this.jointRM_2.zRot = f1;
        } else if (i == 1 || i == 2) {
            float f1 = Mth.sin((float)(ageInTicks * 0.098f)) * 0.0865f;
            float f2 = Mth.sin((float)(ageInTicks * 0.09878f)) * 0.07545f;
            float f3 = Mth.sin((float)(ageInTicks * 0.0885f)) * 0.08655f;
            float f4 = Mth.sin((float)(ageInTicks * 0.18768f)) * 0.0865f;
            float f5 = Mth.sin((float)(ageInTicks * 0.09888f)) * 0.1975f;
            this.taclejointFL.yRot = -0.5f + f1;
            this.taclejointFL_1.yRot = -0.2f + f2;
            this.taclejointFL_2.yRot = 1.8f + f4;
            this.taclejointFL_3.yRot = 1.1f + f5;
            this.taclejointFL_4.yRot = 1.5f + f2;
            this.taclejointFL_4.zRot = -0.5f + f1;
            this.taclejointFL_5.yRot = -1.5f + f3;
            this.taclejointFL_5.zRot = 0.5f + f3;
            this.taclejointFR.yRot = -0.5f + f3;
            this.taclejointFR_1.yRot = -0.2f + f4;
            this.taclejointFR_2.yRot = 1.8f + f1;
            this.taclejointFR_3.yRot = 1.1f + f2;
            this.taclejointFR_4.yRot = 1.5f + f1;
            this.taclejointFR_4.zRot = 0.5f + f5;
            this.taclejointFR_5.yRot = -1.5f + f3;
            this.taclejointFR_5.zRot = -0.5f + f2;
            this.taclejointBL.yRot = 0.5f + f5;
            this.taclejointBL_1.yRot = 0.2f + f4;
            this.taclejointBL_2.yRot = -1.8f + f4;
            this.taclejointBL_3.yRot = -1.1f + f2;
            this.taclejointBL_4.yRot = -1.5f + f4;
            this.taclejointBL_4.zRot = 0.5f + f5;
            this.taclejointBL_5.yRot = 1.5f + f1;
            this.taclejointBL_5.zRot = -0.5f + f3;
            this.taclejointBR.yRot = 0.5f + f2;
            this.taclejointBR_1.yRot = 0.2f + f2;
            this.taclejointBR_2.yRot = -1.8f + f3;
            this.taclejointBR_3.yRot = -1.1f + f4;
            this.taclejointBR_4.yRot = -1.5f + f5;
            this.taclejointBR_4.zRot = -0.5f + f1;
            this.taclejointBR_5.yRot = 1.5f + f2;
            this.taclejointBR_5.zRot = 0.5f + f4;
            f1 = Mth.sin((float)(ageInTicks * 0.198f)) * 0.075f;
            f2 = Mth.sin((float)(ageInTicks * 0.0878f)) * 0.07545f;
            f3 = Mth.sin((float)(ageInTicks * 0.09885f)) * 0.0755f;
            f4 = Mth.sin((float)(ageInTicks * 0.08768f)) * 0.09765f;
            f5 = Mth.sin((float)(ageInTicks * 0.0888f)) * 0.0865f;
            this.taclejointLF.yRot = 1.8f + f5;
            this.taclejointLF_1.yRot = -1.8f + f3;
            this.taclejointLF_2.yRot = -2.2f + f2;
            this.taclejointLF_2.xRot = 0.2f + f1;
            this.taclejointLF_3.yRot = -0.7f + f3;
            this.taclejointLF_3.xRot = 0.2f + f4;
            this.taclejointLF_4.yRot = 0.6f + f4;
            this.taclejointLF_5.yRot = 1.8f + f5;
            this.taclejointLB.yRot = 1.8f + f1;
            this.taclejointLB_1.yRot = -1.8f + f2;
            this.taclejointLB_2.yRot = -2.2f + f2;
            this.taclejointLB_2.xRot = -0.2f + f3;
            this.taclejointLB_3.yRot = -0.7f + f5;
            this.taclejointLB_3.xRot = -0.2f + f3;
            this.taclejointLB_4.yRot = 0.6f + f4;
            this.taclejointLB_5.yRot = 1.8f + f1;
            this.taclejointRF.yRot = 1.8f + f3;
            this.taclejointRF_1.yRot = -1.8f + f1;
            this.taclejointRF_2.yRot = -2.2f + f2;
            this.taclejointRF_2.xRot = -0.2f + f4;
            this.taclejointRF_3.yRot = -0.7f + f5;
            this.taclejointRF_3.xRot = -0.2f + f2;
            this.taclejointRF_4.yRot = 0.6f + f1;
            this.taclejointRF_5.yRot = 1.8f + f3;
            this.taclejointRB.yRot = 1.8f + f4;
            this.taclejointRB_1.yRot = -1.8f + f3;
            this.taclejointRB_2.yRot = -2.2f + f2;
            this.taclejointRB_2.xRot = 0.2f + f5;
            this.taclejointRB_3.yRot = -0.7f + f1;
            this.taclejointRB_3.xRot = 0.2f + f2;
            this.taclejointRB_4.yRot = 0.6f + f1;
            this.taclejointRB_5.yRot = 1.8f + f3;
            f1 = Mth.sin((float)(ageInTicks * 0.198f)) * 0.175f;
            f2 = Mth.sin((float)(ageInTicks * 0.0878f)) * 0.17545f;
            this.jointLM.zRot = -0.3f + f1;
            this.jointLM_1.zRot = f1;
            this.jointLM_2.zRot = f1;
            this.jointRM.zRot = 0.3f + -1.0f * f1;
            this.jointRM_1.zRot = f1;
            this.jointRM_2.zRot = f1;
        }
    }


    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}