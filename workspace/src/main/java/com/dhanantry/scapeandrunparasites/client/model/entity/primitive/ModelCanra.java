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

public class ModelCanra extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "canra"), "main");
    private final ModelPart jointBLLY;
    private final ModelPart jointBRLY;
    private final ModelPart jointRM;
    private final ModelPart jointFLLX;
    private final ModelPart jointH;
    private final ModelPart mainbody;
    private final ModelPart jointFRLX;
    private final ModelPart jointFLLY;
    private final ModelPart jointLM;
    private final ModelPart jointBRLX;
    private final ModelPart jointBLLX;
    private final ModelPart jointFRLY;
    private final float mainbodyBaseX;
    private final float mainbodyBaseY;
    private final float mainbodyBaseZ;

    public ModelCanra(ModelPart root) {
        this.jointBLLY = root.getChild("mainbody").getChild("jointBLLX").getChild("jointdont").getChild("jointBLLY");
        this.jointBRLY = root.getChild("mainbody").getChild("jointBRLX").getChild("jointdont_3").getChild("jointBRLY");
        this.jointRM = root.getChild("mainbody").getChild("jointH").getChild("body_3").getChild("jointRM");
        this.jointFLLX = root.getChild("mainbody").getChild("jointFLLX");
        this.jointH = root.getChild("mainbody").getChild("jointH");
        this.mainbody = root.getChild("mainbody");
        this.jointFRLX = root.getChild("mainbody").getChild("jointFRLX");
        this.jointFLLY = root.getChild("mainbody").getChild("jointFLLX").getChild("jointdont_1").getChild("jointFLLY");
        this.jointLM = root.getChild("mainbody").getChild("jointH").getChild("body_3").getChild("jointLM");
        this.jointBRLX = root.getChild("mainbody").getChild("jointBRLX");
        this.jointBLLX = root.getChild("mainbody").getChild("jointBLLX");
        this.jointFRLY = root.getChild("mainbody").getChild("jointFRLX").getChild("jointdont_2").getChild("jointFRLY");
        this.mainbodyBaseX = 0.0f;
        this.mainbodyBaseY = 6.0f;
        this.mainbodyBaseZ = -6.0f;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 6.0f, -6.0f));
                PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0f, -5.0f, -4.5f, 16, 10, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.20943952f, 0.0f, 0.0f));
                PartDefinition body_1 = body.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(50, 0).addBox(-6.0f, -4.0f, -2.0f, 12, 8, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 5.0f, 0.19198622f, 0.0f, 0.0f));
                PartDefinition body_2 = body_1.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(82, 8).addBox(-5.5f, -3.0f, -1.0f, 11, 6, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 6.0f, 0.20943952f, 0.0f, 0.0f));
                PartDefinition jointBLLX = mainbody.addOrReplaceChild("jointBLLX", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, -7.0f, 13.0f));
                PartDefinition jointdont = jointBLLX.addOrReplaceChild("jointdont", CubeListBuilder.create().texOffs(82, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.6632251f, 0.0f));
                PartDefinition jointBLLY = jointdont.addOrReplaceChild("jointBLLY", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition leg = jointBLLY.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(86, 0).addBox(-1.0f, -2.0f, -2.0f, 11, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.12217305f));
                PartDefinition jointBLL1 = leg.addOrReplaceChild("jointBLL1", CubeListBuilder.create().texOffs(112, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.5f, 0.0f, 0.0f));
                PartDefinition leg_1 = jointBLL1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0f, -1.5f, -1.5f, 12, 3, 3), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 1.43117f));
                PartDefinition jointBLL2 = leg_1.addOrReplaceChild("jointBLL2", CubeListBuilder.create().texOffs(116, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.5f, 0.0f, 0.0f));
                PartDefinition leg_2 = jointBLL2.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(63, 22).addBox(-1.0f, -2.0f, -2.0f, 8, 4, 4), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -0.9075712f));
                PartDefinition jointBLL3 = leg_2.addOrReplaceChild("jointBLL3", CubeListBuilder.create().texOffs(120, 0).addBox(-0.5f, 0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.5f, -0.1f, 0.0f));
                PartDefinition leg_3 = jointBLL3.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(87, 22).addBox(-1.5f, -1.0f, -1.5f, 10, 2, 3), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.7330383f));
                PartDefinition leg_4 = leg_3.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(28, 23).addBox(-1.0f, -1.0f, -1.0f, 9, 2, 2), PartPose.offsetAndRotation(0.5f, 1.0f, 0.0f, 0.0f, 0.0f, 0.55850536f));
                PartDefinition legdec = leg.addOrReplaceChild("legdec", CubeListBuilder.create().texOffs(45, 16).addBox(-2.5f, -1.0f, -2.5f, 6, 2, 5), PartPose.offsetAndRotation(0.0f, -2.0f, 0.0f, 0.34906584f, 0.0f, 0.0f));
                PartDefinition jointFLLX = mainbody.addOrReplaceChild("jointFLLX", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, -3.0f, -1.0f));
                PartDefinition jointdont_1 = jointFLLX.addOrReplaceChild("jointdont_1", CubeListBuilder.create().texOffs(123, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.715585f, 0.0f));
                PartDefinition jointFLLY = jointdont_1.addOrReplaceChild("jointFLLY", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition leg_5 = jointFLLY.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0f, -2.0f, -2.0f, 17, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9773844f));
                PartDefinition jointFLL1 = leg_5.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(15.5f, 0.0f, 0.0f));
                PartDefinition leg_6 = jointFLL1.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(84, 27).addBox(-2.5f, -1.5f, -1.5f, 18, 3, 3), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 2.1118484f));
                PartDefinition jointFLL2 = leg_6.addOrReplaceChild("jointFLL2", CubeListBuilder.create().texOffs(41, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(15.3f, 0.0f, 0.0f));
                PartDefinition leg_7 = jointFLL2.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(62, 33).addBox(-1.0f, -2.0f, -2.0f, 13, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7679449f));
                PartDefinition jointFLL3 = leg_7.addOrReplaceChild("jointFLL3", CubeListBuilder.create().texOffs(45, 2).addBox(-0.5f, 0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.9f, -0.3f, 0.0f));
                PartDefinition leg_8 = jointFLL3.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(96, 33).addBox(-1.5f, -1.0f, -1.5f, 9, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.55850536f));
                PartDefinition leg_9 = leg_8.addOrReplaceChild("leg_9", CubeListBuilder.create().texOffs(0, 35).addBox(-2.0f, -1.0f, -1.0f, 9, 2, 2), PartPose.offsetAndRotation(0.5f, 1.0f, 0.0f, 0.0f, 0.0f, 0.55850536f));
                PartDefinition legdec_1 = leg_5.addOrReplaceChild("legdec_1", CubeListBuilder.create().texOffs(42, 27).addBox(-2.5f, -1.5f, -2.5f, 7, 4, 5), PartPose.offsetAndRotation(2.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.12217305f));
                PartDefinition jointFRLX = mainbody.addOrReplaceChild("jointFRLX", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-8.0f, -3.0f, -1.0f));
                PartDefinition jointdont_2 = jointFRLX.addOrReplaceChild("jointdont_2", CubeListBuilder.create().texOffs(49, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 2.4260077f, 0.0f));
                PartDefinition jointFRLY = jointdont_2.addOrReplaceChild("jointFRLY", CubeListBuilder.create().texOffs(53, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition leg_10 = jointFRLY.addOrReplaceChild("leg_10", CubeListBuilder.create().texOffs(18, 36).addBox(-1.0f, -2.0f, -2.0f, 17, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9773844f));
                PartDefinition jointFRL1 = leg_10.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(82, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(15.5f, 0.0f, 0.0f));
                PartDefinition leg_11 = jointFRL1.addOrReplaceChild("leg_11", CubeListBuilder.create().texOffs(0, 44).addBox(-2.5f, -1.5f, -1.5f, 18, 3, 3), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 2.1118484f));
                PartDefinition jointFRL2 = leg_11.addOrReplaceChild("jointFRL2", CubeListBuilder.create().texOffs(86, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(15.3f, 0.0f, 0.0f));
                PartDefinition leg_12 = jointFRL2.addOrReplaceChild("leg_12", CubeListBuilder.create().texOffs(56, 41).addBox(-1.0f, -2.0f, -2.0f, 13, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7679449f));
                PartDefinition jointFRL3 = leg_12.addOrReplaceChild("jointFRL3", CubeListBuilder.create().texOffs(112, 2).addBox(-0.5f, 0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.9f, -0.3f, 0.0f));
                PartDefinition leg_13 = jointFRL3.addOrReplaceChild("leg_13", CubeListBuilder.create().texOffs(87, 47).addBox(-1.5f, -1.0f, -1.5f, 9, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.55850536f));
                PartDefinition leg_14 = leg_13.addOrReplaceChild("leg_14", CubeListBuilder.create().texOffs(40, 49).addBox(-2.0f, -1.0f, -1.0f, 9, 2, 2), PartPose.offsetAndRotation(0.5f, 1.0f, 0.0f, 0.0f, 0.0f, 0.55850536f));
                PartDefinition legdec_2 = leg_10.addOrReplaceChild("legdec_2", CubeListBuilder.create().texOffs(91, 38).addBox(-2.5f, -1.5f, -2.5f, 7, 4, 5), PartPose.offsetAndRotation(2.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.12217305f));
                PartDefinition jointBRLX = mainbody.addOrReplaceChild("jointBRLX", CubeListBuilder.create().texOffs(49, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-6.0f, -7.0f, 13.0f));
                PartDefinition jointdont_3 = jointBRLX.addOrReplaceChild("jointdont_3", CubeListBuilder.create().texOffs(116, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.4783676f, 0.0f));
                PartDefinition jointBRLY = jointdont_3.addOrReplaceChild("jointBRLY", CubeListBuilder.create().texOffs(120, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition leg_15 = jointBRLY.addOrReplaceChild("leg_15", CubeListBuilder.create().texOffs(58, 49).addBox(-1.0f, -2.0f, -2.0f, 11, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.12217305f));
                PartDefinition jointBRL1 = leg_15.addOrReplaceChild("jointBRL1", CubeListBuilder.create().texOffs(123, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.5f, 0.0f, 0.0f));
                PartDefinition leg_16 = jointBRL1.addOrReplaceChild("leg_16", CubeListBuilder.create().texOffs(88, 52).addBox(-1.0f, -1.5f, -1.5f, 12, 3, 3), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 1.43117f));
                PartDefinition jointBRL2 = leg_16.addOrReplaceChild("jointBRL2", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.5f, 0.0f, 0.0f));
                PartDefinition leg_17 = jointBRL2.addOrReplaceChild("leg_17", CubeListBuilder.create().texOffs(18, 53).addBox(-1.0f, -2.0f, -2.0f, 8, 4, 4), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -0.9075712f));
                PartDefinition jointBRL3 = leg_17.addOrReplaceChild("jointBRL3", CubeListBuilder.create().texOffs(4, 4).addBox(-0.5f, 0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.5f, -0.1f, 0.0f));
                PartDefinition leg_18 = jointBRL3.addOrReplaceChild("leg_18", CubeListBuilder.create().texOffs(42, 57).addBox(-1.5f, -1.0f, -1.5f, 10, 2, 3), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.7330383f));
                PartDefinition leg_19 = leg_18.addOrReplaceChild("leg_19", CubeListBuilder.create().texOffs(68, 57).addBox(-1.0f, -1.0f, -1.0f, 9, 2, 2), PartPose.offsetAndRotation(0.5f, 1.0f, 0.0f, 0.0f, 0.0f, 0.55850536f));
                PartDefinition legdec_3 = leg_15.addOrReplaceChild("legdec_3", CubeListBuilder.create().texOffs(0, 50).addBox(-2.5f, -1.0f, -2.5f, 6, 2, 5), PartPose.offsetAndRotation(0.0f, -2.0f, 0.0f, -0.34906584f, 0.0f, 0.0f));
                PartDefinition jointH = mainbody.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 2.0f, -5.0f));
                PartDefinition body_3 = jointH.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(84, 58).addBox(-4.0f, -2.0f, -2.0f, 8, 6, 6), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition jointLM = body_3.addOrReplaceChild("jointLM", CubeListBuilder.create().texOffs(41, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.5f, 0.5f, -1.5f));
                PartDefinition mouth = jointLM.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(0, 57).addBox(-1.5f, -1.0f, -3.5f, 3, 4, 7), PartPose.offsetAndRotation(1.0f, 0.5f, -1.0f, 1.5707964f, 0.2617994f, 0.0f));
                PartDefinition teeth = mouth.addOrReplaceChild("teeth", CubeListBuilder.create().texOffs(49, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, -2.2f, -0.2f, 0.0f, 0.0f, -0.27925268f));
                PartDefinition teeth_1 = mouth.addOrReplaceChild("teeth_1", CubeListBuilder.create().texOffs(53, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, -2.2f, -2.4f, 0.08726646f, 0.0f, -0.27925268f));
                PartDefinition teeth_2 = mouth.addOrReplaceChild("teeth_2", CubeListBuilder.create().texOffs(82, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, -2.2f, 2.0f, -0.08726646f, 0.0f, -0.27925268f));
                PartDefinition jointRM = body_3.addOrReplaceChild("jointRM", CubeListBuilder.create().texOffs(45, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.5f, 0.5f, -1.5f));
                PartDefinition mouth_1 = jointRM.addOrReplaceChild("mouth_1", CubeListBuilder.create().texOffs(13, 61).addBox(-1.5f, -1.0f, -3.5f, 3, 4, 7), PartPose.offsetAndRotation(-1.0f, 0.5f, -1.0f, 1.5707964f, -0.2617994f, 0.0f));
                PartDefinition teeth_3 = mouth_1.addOrReplaceChild("teeth_3", CubeListBuilder.create().texOffs(116, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, -2.2f, -0.2f, 0.0f, 0.0f, 0.27925268f));
                PartDefinition teeth_4 = mouth_1.addOrReplaceChild("teeth_4", CubeListBuilder.create().texOffs(120, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, -2.2f, -2.4f, 0.08726646f, 0.0f, 0.27925268f));
                PartDefinition teeth_5 = mouth_1.addOrReplaceChild("teeth_5", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, -2.2f, 2.0f, -0.08726646f, 0.0f, 0.27925268f));
        return LayerDefinition.create(mesh, 128, 75);
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
        this.jointFLLX.yRot = 0.0f;
        this.jointFLLY.zRot = 0.0f;
        this.jointFRLX.yRot = 0.0f;
        this.jointFRLY.zRot = 0.0f;
        this.jointBLLX.yRot = 0.0f;
        this.jointBLLY.zRot = 0.0f;
        this.jointBRLX.yRot = 0.0f;
        this.jointBRLY.zRot = 0.0f;
        this.jointLM.yRot = 0.0f;
        this.jointRM.yRot = 0.0f;
        this.mainbody.y = this.mainbodyBaseY + (0.0f);
        this.jointH.xRot = 0.0f;
        this.jointH.yRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                float GS = 2.0f;
                float GD = 1.0f;
                this.swingY(this.jointFLLX, 0.2f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLLY, 0.2f * GS, 0.5f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.2f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRLY, 0.2f * GS, 0.5f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBLLX, 0.2f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBLLY, 0.2f * GS, 0.4f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBRLX, 0.2f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBRLY, 0.2f * GS, 0.4f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLM, 0.2f * GS, 0.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingY(this.jointRM, 0.2f * GS, 0.5f * GD, -1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.4f * GS, 1, limbSwing, limbSwingAmount, 0.04f);
            }
            float f1 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.1f;
            this.jointLM.yRot = -1.0f * f1;
            this.jointRM.yRot = f1;
        } else if (i == 1) {
            if (!parasite.getStillAni()) {
                float GS = 2.0f;
                float GD = 1.0f;
                this.swingY(this.jointFLLX, 0.2f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLLY, 0.2f * GS, 0.5f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.2f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRLY, 0.2f * GS, 0.5f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBLLX, 0.2f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBLLY, 0.2f * GS, 0.4f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBRLX, 0.2f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBRLY, 0.2f * GS, 0.4f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLM, 0.2f * GS, 0.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingY(this.jointRM, 0.2f * GS, 0.5f * GD, -1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.4f * GS, 1, limbSwing, limbSwingAmount, 0.04f);
            } else {
                float f1 = Mth.cos((float)(ageInTicks * 0.4f)) * 0.2f;
                this.jointLM.yRot = -1.0f * f1;
                this.jointRM.yRot = f1;
            }
        } else if (i == 2) {
            if (!parasite.getStillAni()) {
                float GS = 1.6f;
                float GD = 0.6f;
                this.swingY(this.jointFLLX, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLLY, 0.3f * GS, 0.5f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRLY, 0.3f * GS, 0.5f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBLLX, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBLLY, 0.3f * GS, 0.4f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBRLX, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBRLY, 0.3f * GS, 0.4f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLM, 0.35f * GS, 0.6f * GD, 1, limbSwing, limbSwingAmount);
                this.swingY(this.jointRM, 0.35f * GS, 0.6f * GD, -1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.04f);
            }
            float f1 = Mth.cos((float)(ageInTicks * 0.4f)) * 0.2f;
            this.jointLM.yRot = -1.0f * f1;
            this.jointRM.yRot = f1;
        } else if (i == 10) {
            float f2 = Mth.cos((float)(ageInTicks * 0.6f)) * 0.4f;
            float f3 = Mth.cos((float)(ageInTicks * 0.3f)) * 0.3f;
            this.jointLM.yRot = -0.3f + f3;
            this.jointRM.yRot = 0.5f + -1.0f * f3;
            this.jointH.xRot = -0.1f;
            this.jointH.yRot = f2;
        }
        this.underground(parasite, ageInTicks, this.mainbody);
    }


    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}