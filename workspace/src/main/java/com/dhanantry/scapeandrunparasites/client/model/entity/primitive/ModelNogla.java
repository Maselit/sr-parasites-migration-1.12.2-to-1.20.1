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

public class ModelNogla extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "nogla"), "main");
    private final ModelPart jointRA4;
    private final ModelPart jointBRL1;
    private final ModelPart jointBRL2;
    private final ModelPart jointLAFLF;
    private final ModelPart jointBLL1;
    private final ModelPart mainbody;
    private final ModelPart jointBLL2;
    private final ModelPart jointLABRF;
    private final ModelPart jointRABRF;
    private final ModelPart jointRABLF;
    private final ModelPart jointH;
    private final ModelPart jointRA2;
    private final ModelPart jointFLL1;
    private final ModelPart jointRAFLF;
    private final ModelPart jointRA3;
    private final ModelPart jointLA2;
    private final ModelPart jointFLL2;
    private final ModelPart jointRAFRF;
    private final ModelPart jointLA3;
    private final ModelPart jointLA1;
    private final ModelPart jointLA4;
    private final ModelPart jointFRL2;
    private final ModelPart jointLABLF;
    private final ModelPart jointFRL1;
    private final ModelPart joint;
    private final ModelPart jointLAFRF;
    private final ModelPart jointRA1;
    private final float mainbodyBaseX;
    private final float mainbodyBaseY;
    private final float mainbodyBaseZ;

    public ModelNogla(ModelPart root) {
        this.jointRA4 = root.getChild("mainbody").getChild("body").getChild("jointRA1").getChild("arm_4").getChild("arm_5").getChild("jointRA2").getChild("arm_6").getChild("jointRA3").getChild("arm_7").getChild("jointRA4");
        this.jointBRL1 = root.getChild("mainbody").getChild("jointBRL1");
        this.jointBRL2 = root.getChild("mainbody").getChild("jointBRL1").getChild("leg_11").getChild("jointBRL2");
        this.jointLAFLF = root.getChild("mainbody").getChild("body").getChild("jointLA1").getChild("arm").getChild("arm_1").getChild("jointLA2").getChild("arm_2").getChild("jointLA3").getChild("arm_3").getChild("jointLA4").getChild("hand").getChild("jointLAFLF");
        this.jointBLL1 = root.getChild("mainbody").getChild("jointBLL1");
        this.mainbody = root.getChild("mainbody");
        this.jointBLL2 = root.getChild("mainbody").getChild("jointBLL1").getChild("leg_4").getChild("jointBLL2");
        this.jointLABRF = root.getChild("mainbody").getChild("body").getChild("jointLA1").getChild("arm").getChild("arm_1").getChild("jointLA2").getChild("arm_2").getChild("jointLA3").getChild("arm_3").getChild("jointLA4").getChild("hand").getChild("jointLABRF");
        this.jointRABRF = root.getChild("mainbody").getChild("body").getChild("jointRA1").getChild("arm_4").getChild("arm_5").getChild("jointRA2").getChild("arm_6").getChild("jointRA3").getChild("arm_7").getChild("jointRA4").getChild("hand_1").getChild("jointRABRF");
        this.jointRABLF = root.getChild("mainbody").getChild("body").getChild("jointRA1").getChild("arm_4").getChild("arm_5").getChild("jointRA2").getChild("arm_6").getChild("jointRA3").getChild("arm_7").getChild("jointRA4").getChild("hand_1").getChild("jointRABLF");
        this.jointH = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("jointdont").getChild("jointH");
        this.jointRA2 = root.getChild("mainbody").getChild("body").getChild("jointRA1").getChild("arm_4").getChild("arm_5").getChild("jointRA2");
        this.jointFLL1 = root.getChild("mainbody").getChild("jointFLL1");
        this.jointRAFLF = root.getChild("mainbody").getChild("body").getChild("jointRA1").getChild("arm_4").getChild("arm_5").getChild("jointRA2").getChild("arm_6").getChild("jointRA3").getChild("arm_7").getChild("jointRA4").getChild("hand_1").getChild("jointRAFLF");
        this.jointRA3 = root.getChild("mainbody").getChild("body").getChild("jointRA1").getChild("arm_4").getChild("arm_5").getChild("jointRA2").getChild("arm_6").getChild("jointRA3");
        this.jointLA2 = root.getChild("mainbody").getChild("body").getChild("jointLA1").getChild("arm").getChild("arm_1").getChild("jointLA2");
        this.jointFLL2 = root.getChild("mainbody").getChild("jointFLL1").getChild("leg").getChild("jointFLL2");
        this.jointRAFRF = root.getChild("mainbody").getChild("body").getChild("jointRA1").getChild("arm_4").getChild("arm_5").getChild("jointRA2").getChild("arm_6").getChild("jointRA3").getChild("arm_7").getChild("jointRA4").getChild("hand_1").getChild("jointRAFRF");
        this.jointLA3 = root.getChild("mainbody").getChild("body").getChild("jointLA1").getChild("arm").getChild("arm_1").getChild("jointLA2").getChild("arm_2").getChild("jointLA3");
        this.jointLA1 = root.getChild("mainbody").getChild("body").getChild("jointLA1");
        this.jointLA4 = root.getChild("mainbody").getChild("body").getChild("jointLA1").getChild("arm").getChild("arm_1").getChild("jointLA2").getChild("arm_2").getChild("jointLA3").getChild("arm_3").getChild("jointLA4");
        this.jointFRL2 = root.getChild("mainbody").getChild("jointFRL1").getChild("leg_7").getChild("jointFRL2");
        this.jointLABLF = root.getChild("mainbody").getChild("body").getChild("jointLA1").getChild("arm").getChild("arm_1").getChild("jointLA2").getChild("arm_2").getChild("jointLA3").getChild("arm_3").getChild("jointLA4").getChild("hand").getChild("jointLABLF");
        this.jointFRL1 = root.getChild("mainbody").getChild("jointFRL1");
        this.joint = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("jointdont").getChild("jointH").getChild("head").getChild("head_1").getChild("joint");
        this.jointLAFRF = root.getChild("mainbody").getChild("body").getChild("jointLA1").getChild("arm").getChild("arm_1").getChild("jointLA2").getChild("arm_2").getChild("jointLA3").getChild("arm_3").getChild("jointLA4").getChild("hand").getChild("jointLAFRF");
        this.jointRA1 = root.getChild("mainbody").getChild("body").getChild("jointRA1");
        this.mainbodyBaseX = 0.0f;
        this.mainbodyBaseY = -6.0f;
        this.mainbodyBaseZ = 0.0f;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -6.0f, 0.0f));
                PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0f, -4.5f, -6.0f, 12, 9, 12), PartPose.offset(0.0f, 0.0f, 2.0f));
                PartDefinition body_1 = body.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(48, 0).addBox(-8.0f, -6.5f, -1.0f, 16, 12, 13), PartPose.offsetAndRotation(0.0f, 1.0f, 5.0f, -0.27925268f, 0.0f, 0.0f));
                PartDefinition body_3 = body_1.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(93, 0).addBox(-3.0f, -2.0f, -4.0f, 6, 5, 8), PartPose.offsetAndRotation(0.0f, 4.0f, 13.0f, -0.6806784f, 0.0f, 0.0f));
                PartDefinition jointdont = body_3.addOrReplaceChild("jointdont", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.0f, 3.0f, -0.55850536f, 0.0f, 0.0f));
                PartDefinition jointH = jointdont.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition head = jointH.addOrReplaceChild("head", CubeListBuilder.create().texOffs(42, 25).addBox(-4.0f, -4.0f, -2.0f, 8, 6, 8), PartPose.offsetAndRotation(0.0f, -4.5f, 4.4f, -1.5707964f, 0.0f, 0.0f));
                PartDefinition head_1 = head.addOrReplaceChild("head_1", CubeListBuilder.create().texOffs(36, 2).addBox(-4.0f, -4.0f, -2.0f, 8, 3, 4), PartPose.offset(0.0f, 6.0f, 4.0f));
                PartDefinition joint = head_1.addOrReplaceChild("joint", CubeListBuilder.create().texOffs(93, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -1.5f, -2.0f));
                PartDefinition head_2 = joint.addOrReplaceChild("head_2", CubeListBuilder.create().texOffs(100, 19).addBox(-3.5f, -1.0f, -5.0f, 7, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, 0.0f, 0.0f));
                PartDefinition teeth = head_2.addOrReplaceChild("teeth", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, -1.8f, -5.3f, 0.2443461f, 0.0f, 0.0f));
                PartDefinition teeth_1 = head_2.addOrReplaceChild("teeth_1", CubeListBuilder.create().texOffs(113, 0).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(2.0f, -1.8f, -5.3f, 0.2443461f, 0.0f, 0.0f));
                PartDefinition teeth_2 = head_2.addOrReplaceChild("teeth_2", CubeListBuilder.create().texOffs(117, 0).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-2.0f, -1.8f, -5.3f, 0.2443461f, 0.0f, 0.0f));
                PartDefinition teeth_3 = head_2.addOrReplaceChild("teeth_3", CubeListBuilder.create().texOffs(121, 0).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(3.8f, -1.8f, -3.0f, 0.0f, 0.0f, 0.2443461f));
                PartDefinition teeth_4 = head_2.addOrReplaceChild("teeth_4", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-3.8f, -1.8f, -3.0f, 0.0f, 0.0f, -0.2443461f));
                PartDefinition body_2 = body.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(0, 21).addBox(-5.0f, -3.5f, -10.0f, 10, 7, 11), PartPose.offsetAndRotation(0.0f, -0.5f, -5.0f, 0.40142572f, 0.0f, 0.0f));
                PartDefinition jointLA1 = body.addOrReplaceChild("jointLA1", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 2.0f, -1.5f));
                PartDefinition arm = jointLA1.addOrReplaceChild("arm", CubeListBuilder.create().texOffs(74, 25).addBox(-3.0f, -3.0f, -2.5f, 5, 6, 5), PartPose.offsetAndRotation(0.5f, 2.0f, 0.0f, 0.0f, -0.17453292f, 0.61086524f));
                PartDefinition arm_1 = arm.addOrReplaceChild("arm_1", CubeListBuilder.create().texOffs(94, 27).addBox(-1.5f, 1.5f, -1.5f, 3, 11, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.19198622f, -1.3264502f));
                PartDefinition jointLA2 = arm_1.addOrReplaceChild("jointLA2", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 11.5f, -0.4f));
                PartDefinition arm_2 = jointLA2.addOrReplaceChild("arm_2", CubeListBuilder.create().texOffs(106, 27).addBox(-1.0f, 0.0f, -1.5f, 2, 14, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.0821041f, 0.17453292f, 0.0f));
                PartDefinition jointLA3 = arm_2.addOrReplaceChild("jointLA3", CubeListBuilder.create().texOffs(8, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 13.3f, 0.0f));
                PartDefinition arm_3 = jointLA3.addOrReplaceChild("arm_3", CubeListBuilder.create().texOffs(116, 27).addBox(-1.5f, 0.0f, -1.0f, 3, 13, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 0.61086524f, 0.0f, 0.0f));
                PartDefinition jointLA4 = arm_3.addOrReplaceChild("jointLA4", CubeListBuilder.create().texOffs(36, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 12.5f, 0.0f));
                PartDefinition hand = jointLA4.addOrReplaceChild("hand", CubeListBuilder.create().texOffs(31, 21).addBox(-2.0f, 0.0f, -1.0f, 4, 6, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 0.715585f, 0.0f, 0.0f));
                PartDefinition jointLAFLF = hand.addOrReplaceChild("jointLAFLF", CubeListBuilder.create().texOffs(56, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.4f, 5.3f, 0.0f));
                PartDefinition finger = jointLAFLF.addOrReplaceChild("finger", CubeListBuilder.create().texOffs(2, 4).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 1.0821041f, 0.2268928f, 0.0f));
                PartDefinition dec_1 = finger.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(117, 3).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 4.8f, -0.5f, 0.34906584f, 0.0f, 0.0f));
                PartDefinition jointLAFRF = hand.addOrReplaceChild("jointLAFRF", CubeListBuilder.create().texOffs(93, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.4f, 5.3f, 0.0f));
                PartDefinition finger_1 = jointLAFRF.addOrReplaceChild("finger_1", CubeListBuilder.create().texOffs(119, 11).addBox(-1.0f, 0.0f, -1.0f, 2, 6, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 1.0821041f, -0.2443461f, 0.0f));
                PartDefinition dec_2 = finger_1.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(121, 3).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 5.8f, -0.5f, 0.34906584f, 0.0f, 0.0f));
                PartDefinition jointLABLF = hand.addOrReplaceChild("jointLABLF", CubeListBuilder.create().texOffs(96, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.4f, 1.3f, 0.0f));
                PartDefinition finger_2 = jointLABLF.addOrReplaceChild("finger_2", CubeListBuilder.create().texOffs(106, 13).addBox(-1.0f, 0.0f, -1.0f, 2, 4, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 1.2566371f, 0.17453292f, 0.0f));
                PartDefinition dec_3 = finger_2.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(93, 4).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 3.8f, -0.5f, 0.34906584f, 0.0f, 0.0f));
                PartDefinition jointLABRF = hand.addOrReplaceChild("jointLABRF", CubeListBuilder.create().texOffs(113, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.4f, 1.3f, 0.0f));
                PartDefinition finger_3 = jointLABRF.addOrReplaceChild("finger_3", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0f, 0.0f, -1.0f, 2, 4, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 1.2566371f, -0.19198622f, 0.0f));
                PartDefinition dec_4 = finger_3.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(97, 5).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 3.8f, -0.5f, 0.34906584f, 0.0f, 0.0f));
                PartDefinition jointRA1 = body.addOrReplaceChild("jointRA1", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-6.0f, 2.0f, -1.5f));
                PartDefinition arm_4 = jointRA1.addOrReplaceChild("arm_4", CubeListBuilder.create().texOffs(69, 36).addBox(-2.0f, -3.0f, -2.5f, 5, 6, 5), PartPose.offsetAndRotation(-0.5f, 2.0f, 0.0f, 0.0f, 0.17453292f, -0.57595867f));
                PartDefinition arm_5 = arm_4.addOrReplaceChild("arm_5", CubeListBuilder.create().texOffs(0, 39).addBox(-1.5f, 1.5f, -1.5f, 3, 11, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.19198622f, 1.3264502f));
                PartDefinition jointRA2 = arm_5.addOrReplaceChild("jointRA2", CubeListBuilder.create().texOffs(8, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 11.5f, -0.4f));
                PartDefinition arm_6 = jointRA2.addOrReplaceChild("arm_6", CubeListBuilder.create().texOffs(12, 39).addBox(-1.0f, 0.0f, -1.5f, 2, 14, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.0821041f, -0.17453292f, 0.0f));
                PartDefinition jointRA3 = arm_6.addOrReplaceChild("jointRA3", CubeListBuilder.create().texOffs(36, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 13.3f, 0.0f));
                PartDefinition arm_7 = jointRA3.addOrReplaceChild("arm_7", CubeListBuilder.create().texOffs(22, 39).addBox(-1.5f, 0.0f, -1.0f, 3, 13, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 0.61086524f, 0.0f, 0.0f));
                PartDefinition jointRA4 = arm_7.addOrReplaceChild("jointRA4", CubeListBuilder.create().texOffs(56, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 12.5f, 0.0f));
                PartDefinition hand_1 = jointRA4.addOrReplaceChild("hand_1", CubeListBuilder.create().texOffs(32, 39).addBox(-2.0f, 0.0f, -1.0f, 4, 6, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 0.715585f, 0.0f, 0.0f));
                PartDefinition jointRAFLF = hand_1.addOrReplaceChild("jointRAFLF", CubeListBuilder.create().texOffs(113, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.4f, 5.3f, 0.0f));
                PartDefinition finger_4 = jointRAFLF.addOrReplaceChild("finger_4", CubeListBuilder.create().texOffs(66, 25).addBox(-1.0f, 0.0f, -1.0f, 2, 6, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 1.0821041f, 0.2443461f, 0.0f));
                PartDefinition dec_5 = finger_4.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(36, 9).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 5.8f, -0.5f, 0.34906584f, 0.0f, 0.0f));
                PartDefinition jointRAFRF = hand_1.addOrReplaceChild("jointRAFRF", CubeListBuilder.create().texOffs(116, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.4f, 5.3f, 0.0f));
                PartDefinition finger_5 = jointRAFRF.addOrReplaceChild("finger_5", CubeListBuilder.create().texOffs(44, 39).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 1.0821041f, -0.2268928f, 0.0f));
                PartDefinition dec_6 = finger_5.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(40, 9).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 4.8f, -0.5f, 0.34906584f, 0.0f, 0.0f));
                PartDefinition jointRABRF = hand_1.addOrReplaceChild("jointRABRF", CubeListBuilder.create().texOffs(120, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.4f, 1.3f, 0.0f));
                PartDefinition finger_6 = jointRABRF.addOrReplaceChild("finger_6", CubeListBuilder.create().texOffs(42, 27).addBox(-1.0f, 0.0f, -1.0f, 2, 4, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 1.2566371f, 0.19198622f, 0.0f));
                PartDefinition dec_7 = finger_6.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(44, 9).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 3.8f, -0.5f, 0.34906584f, 0.0f, 0.0f));
                PartDefinition jointRABLF = hand_1.addOrReplaceChild("jointRABLF", CubeListBuilder.create().texOffs(123, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.4f, 1.3f, 0.0f));
                PartDefinition finger_7 = jointRABLF.addOrReplaceChild("finger_7", CubeListBuilder.create().texOffs(52, 39).addBox(-1.0f, 0.0f, -1.0f, 2, 4, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 1.2566371f, -0.17453292f, 0.0f));
                PartDefinition dec_8 = finger_7.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(48, 9).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 3.8f, -0.5f, 0.34906584f, 0.0f, 0.0f));
                PartDefinition jointFLL1 = mainbody.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, -3.0f, -11.0f));
                PartDefinition leg = jointFLL1.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(89, 41).addBox(-2.0f, -2.0f, -2.5f, 4, 15, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.20943952f, 0.0f, 0.0f));
                PartDefinition jointFLL2 = leg.addOrReplaceChild("jointFLL2", CubeListBuilder.create().texOffs(52, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 13.0f, -0.2f));
                PartDefinition jointdont_1 = jointFLL2.addOrReplaceChild("jointdont_1", CubeListBuilder.create().texOffs(56, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.4712389f, 0.0f));
                PartDefinition leg_1 = jointdont_1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(114, 42).addBox(-1.5f, -1.0f, -1.0f, 3, 14, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.55850536f, 0.0f, 0.0f));
                PartDefinition jointFLL3 = leg_1.addOrReplaceChild("jointFLL3", CubeListBuilder.create().texOffs(121, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 12.5f, 0.0f));
                PartDefinition leg_2 = jointFLL3.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(60, 39).addBox(-1.0f, -1.0f, -1.0f, 2, 4, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.3962634f, 0.0f, 0.0f));
                PartDefinition leg_3 = leg_2.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(20, 47).addBox(-2.5f, -0.5f, -2.5f, 5, 2, 12), PartPose.offsetAndRotation(0.5f, 3.0f, -0.1f, 0.17453292f, -0.12217305f, 0.0f));
                PartDefinition dec_9 = leg.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(46, 45).addBox(-3.0f, -1.5f, -3.0f, 7, 3, 6), PartPose.offsetAndRotation(2.5f, 0.0f, 0.0f, 0.0f, 0.0f, -1.2042772f));
                PartDefinition jointBLL1 = mainbody.addOrReplaceChild("jointBLL1", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, -1.5f, 12.0f));
                PartDefinition leg_4 = jointBLL1.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(66, 48).addBox(-2.5f, -2.0f, -3.0f, 5, 17, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, -0.17453292f, 0.0f, 0.0f));
                PartDefinition jointBLL2 = leg_4.addOrReplaceChild("jointBLL2", CubeListBuilder.create().texOffs(51, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 12.5f, -0.2f));
                PartDefinition leg_5 = jointBLL2.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(51, 58).addBox(-2.0f, -0.5f, -1.5f, 4, 10, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.4486233f, 0.0f, 0.0f));
                PartDefinition leg_6 = leg_5.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(104, 58).addBox(-1.5f, -1.0f, -1.5f, 3, 14, 3), PartPose.offsetAndRotation(0.0f, 9.0f, 0.0f, -1.4835298f, 0.0f, 0.0f));
                PartDefinition jointBLL3 = leg_6.addOrReplaceChild("jointBLL3", CubeListBuilder.create().texOffs(55, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.5f, 12.5f, 0.5f));
                PartDefinition feet = jointBLL3.addOrReplaceChild("feet", CubeListBuilder.create().texOffs(32, 66).addBox(-2.5f, -1.0f, -2.5f, 5, 5, 5), PartPose.offsetAndRotation(0.0f, 0.4f, 0.0f, 0.17453292f, 0.0f, 0.0f));
                PartDefinition dec_10 = leg_4.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(0, 61).addBox(-4.0f, -1.5f, -4.0f, 8, 3, 8), PartPose.offsetAndRotation(2.5f, -1.0f, 0.0f, 0.0f, 0.0f, -1.2566371f));
                PartDefinition jointFRL1 = mainbody.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-8.0f, -3.0f, -11.0f));
                PartDefinition leg_7 = jointFRL1.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(83, 66).addBox(-2.0f, -2.0f, -2.5f, 4, 15, 5), PartPose.offsetAndRotation(-1.0f, 0.0f, 0.0f, 0.20943952f, 0.0f, 0.0f));
                PartDefinition jointFRL2 = leg_7.addOrReplaceChild("jointFRL2", CubeListBuilder.create().texOffs(112, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 13.0f, -0.2f));
                PartDefinition jointdont_2 = jointFRL2.addOrReplaceChild("jointdont_2", CubeListBuilder.create().texOffs(115, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.4712389f, 0.0f));
                PartDefinition leg_8 = jointdont_2.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(116, 58).addBox(-1.5f, -1.0f, -1.0f, 3, 14, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.55850536f, 0.0f, 0.0f));
                PartDefinition jointFRL3 = leg_8.addOrReplaceChild("jointFRL3", CubeListBuilder.create().texOffs(114, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 12.5f, 0.0f));
                PartDefinition leg_9 = jointFRL3.addOrReplaceChild("leg_9", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0f, -1.0f, -1.0f, 2, 4, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.3962634f, 0.0f, 0.0f));
                PartDefinition leg_10 = leg_9.addOrReplaceChild("leg_10", CubeListBuilder.create().texOffs(0, 72).addBox(-2.5f, -0.5f, -2.5f, 5, 2, 12), PartPose.offsetAndRotation(-0.5f, 3.0f, -0.1f, 0.17453292f, 0.12217305f, 0.0f));
                PartDefinition dec_11 = leg_7.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(46, 71).addBox(-3.0f, -1.5f, -3.0f, 7, 3, 6), PartPose.offsetAndRotation(-2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 1.2042772f));
                PartDefinition jointBRL1 = mainbody.addOrReplaceChild("jointBRL1", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-6.0f, -1.5f, 12.0f));
                PartDefinition leg_11 = jointBRL1.addOrReplaceChild("leg_11", CubeListBuilder.create().texOffs(101, 75).addBox(-2.5f, -2.0f, -3.0f, 5, 15, 6), PartPose.offsetAndRotation(-1.0f, 0.0f, 0.0f, -0.17453292f, 0.0f, 0.0f));
                PartDefinition jointBRL2 = leg_11.addOrReplaceChild("jointBRL2", CubeListBuilder.create().texOffs(120, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 12.5f, -0.2f));
                PartDefinition leg_12 = jointBRL2.addOrReplaceChild("leg_12", CubeListBuilder.create().texOffs(69, 77).addBox(-2.0f, -0.5f, -1.5f, 4, 10, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.4486233f, 0.0f, 0.0f));
                PartDefinition leg_13 = leg_12.addOrReplaceChild("leg_13", CubeListBuilder.create().texOffs(0, 86).addBox(-1.5f, -1.0f, -1.5f, 3, 14, 3), PartPose.offsetAndRotation(0.0f, 9.0f, 0.0f, -1.4835298f, 0.0f, 0.0f));
                PartDefinition jointBLL3_1 = leg_13.addOrReplaceChild("jointBLL3_1", CubeListBuilder.create().texOffs(123, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.5f, 12.5f, 0.5f));
                PartDefinition feet_1 = jointBLL3_1.addOrReplaceChild("feet_1", CubeListBuilder.create().texOffs(53, 86).addBox(-2.5f, -1.0f, -2.5f, 5, 5, 5), PartPose.offsetAndRotation(0.0f, 0.4f, 0.0f, 0.17453292f, 0.0f, 0.0f));
                PartDefinition dec_12 = leg_11.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(26, 80).addBox(-4.0f, -1.5f, -4.0f, 8, 3, 8), PartPose.offsetAndRotation(-2.5f, -1.0f, 0.0f, 0.0f, 0.0f, 1.2566371f));
                PartDefinition dec = root.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 128, 110);
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
        this.jointFLL1.xRot = 0.0f;
        this.jointFRL1.xRot = 0.0f;
        this.jointBLL1.xRot = 0.0f;
        this.jointBRL1.xRot = 0.0f;
        this.jointFLL2.xRot = 0.0f;
        this.jointFRL2.xRot = 0.0f;
        this.jointBLL2.xRot = 0.0f;
        this.jointBRL2.xRot = 0.0f;
        this.mainbody.x = this.mainbodyBaseX + (0.0f);
        this.mainbody.y = this.mainbodyBaseY + (0.0f);
        this.mainbody.z = this.mainbodyBaseZ + (0.0f);
        this.mainbody.xRot = 0.0f;
        this.joint.xRot = 0.0f;
        this.jointLA1.zRot = 0.0f;
        this.jointLA2.xRot = 0.0f;
        this.jointLA3.xRot = 0.0f;
        this.jointLA4.xRot = 0.0f;
        this.jointRA1.zRot = 0.0f;
        this.jointRA2.xRot = 0.0f;
        this.jointRA3.xRot = 0.0f;
        this.jointRA4.xRot = 0.0f;
        this.jointRAFRF.xRot = 0.0f;
        this.jointRAFLF.xRot = 0.0f;
        this.jointRABRF.xRot = 0.0f;
        this.jointRABLF.xRot = 0.0f;
        this.jointLAFRF.xRot = 0.0f;
        this.jointLAFLF.xRot = 0.0f;
        this.jointLABRF.xRot = 0.0f;
        this.jointLABLF.xRot = 0.0f;
        this.jointH.xRot = headPitch * 0.016f;
        this.jointH.zRot = netHeadYaw * -0.016f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                float GS = 1.4f;
                float GD = 0.5f;
                this.swingX(this.jointFLL1, 0.2f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL1, 0.2f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL1, 0.2f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL1, 0.2f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.jointFLL2.xRot = 0.0f;
                this.jointFRL2.xRot = 0.0f;
                this.jointBLL2.xRot = 0.0f;
                this.jointBRL2.xRot = 0.0f;
                this.moveY(this.mainbody, 0.4f * GS, 1, limbSwing, limbSwingAmount, 0.05f);
                this.mainbody.xRot = 0.0f;
            }
            float f1 = Mth.cos((float)(ageInTicks * 0.211f)) * 0.111f;
            float f2 = Mth.cos((float)(ageInTicks * 0.0933f)) * 0.05f;
            this.joint.xRot = f1;
            this.jointLA1.zRot = f2;
            this.jointLA2.xRot = -1.0f * f2;
            this.jointLA3.xRot = -1.0f * f2;
            this.jointLA4.xRot = -1.0f * f2;
            this.jointRA1.zRot = f2;
            this.jointRA2.xRot = f2;
            this.jointRA3.xRot = f2;
            this.jointRA4.xRot = f2;
            f1 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.15f;
            f2 = Mth.cos((float)(ageInTicks * 0.2f - 2.0f)) * 0.15f;
            this.jointRAFRF.xRot = f1;
            this.jointRAFLF.xRot = f1;
            this.jointRABRF.xRot = f2;
            this.jointRABLF.xRot = f2;
            this.jointLAFRF.xRot = f1;
            this.jointLAFLF.xRot = f1;
            this.jointLABRF.xRot = f2;
            this.jointLABLF.xRot = f2;
        } else if (i == 1) {
            if (!parasite.getStillAni()) {
                float GS = 1.4f;
                float GD = 0.5f;
                this.swingX(this.jointFLL1, 0.2f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL1, 0.2f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL1, 0.2f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL1, 0.2f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.jointFLL2.xRot = 0.0f;
                this.jointFRL2.xRot = 0.0f;
                this.jointBLL2.xRot = 0.0f;
                this.jointBRL2.xRot = 0.0f;
                this.moveY(this.mainbody, 0.4f * GS, 1, limbSwing, limbSwingAmount, 0.05f);
                this.mainbody.xRot = 0.0f;
            }
            float f1 = Mth.cos((float)(ageInTicks * 0.5f)) * 0.3f;
            float f2 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.2f;
            this.joint.xRot = f1;
            this.jointLA1.zRot = f2 * 2.0f;
            this.jointLA2.xRot = -1.0f * f2;
            this.jointLA3.xRot = -1.0f * f2;
            this.jointLA4.xRot = -1.0f * f2;
            this.jointRA1.zRot = f2 * 2.0f;
            this.jointRA2.xRot = f2;
            this.jointRA3.xRot = f2;
            this.jointRA4.xRot = f2;
            f1 = -0.5f + Mth.cos((float)(ageInTicks * 0.6f)) * 0.15f;
            f2 = -0.3f + Mth.cos((float)(ageInTicks * 0.6f - 2.0f)) * 0.15f;
            this.jointRAFRF.xRot = f1;
            this.jointRAFLF.xRot = f1;
            this.jointRABRF.xRot = f2;
            this.jointRABLF.xRot = f2;
            this.jointLAFRF.xRot = f1;
            this.jointLAFLF.xRot = f1;
            this.jointLABRF.xRot = f2;
            this.jointLABLF.xRot = f2;
        } else if (i == 2) {
            if (!parasite.getStillAni()) {
                float GS = 1.3f;
                float GD = 0.2f;
                this.swingX(this.jointFLL1, 0.2f * GS, 2.5f * GD, -1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL1, 0.2f * GS, 2.5f * GD, -1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL1, 0.2f * GS, 3.8f * GD, 1, -0.5f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL1, 0.2f * GS, 3.8f * GD, 1, 0.5f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFLL2, 0.2f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL2, 0.2f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL2, 0.2f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL2, 0.2f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.2f * GS, -1, limbSwing, limbSwingAmount, 0.08f);
                this.swingX(this.mainbody, 0.2f * GS, 0.8f * GD, -1, 0.8f, 0.0f, limbSwing, limbSwingAmount);
            }
            float f1 = Mth.cos((float)(ageInTicks * 0.5f)) * 0.3f;
            float f2 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.2f;
            this.joint.xRot = f1;
            this.jointLA1.zRot = f2 * 2.0f;
            this.jointLA2.xRot = -1.0f * f2;
            this.jointLA3.xRot = -1.0f * f2;
            this.jointLA4.xRot = -1.0f * f2;
            this.jointRA1.zRot = f2 * 2.0f;
            this.jointRA2.xRot = f2;
            this.jointRA3.xRot = f2;
            this.jointRA4.xRot = f2;
            f1 = -0.5f + Mth.cos((float)(ageInTicks * 0.6f)) * 0.15f;
            f2 = -0.3f + Mth.cos((float)(ageInTicks * 0.6f - 2.0f)) * 0.15f;
            this.jointRAFRF.xRot = f1;
            this.jointRAFLF.xRot = f1;
            this.jointRABRF.xRot = f2;
            this.jointRABLF.xRot = f2;
            this.jointLAFRF.xRot = f1;
            this.jointLAFLF.xRot = f1;
            this.jointLABRF.xRot = f2;
            this.jointLABLF.xRot = f2;
        } else if (i == 3) {
            if (!parasite.getStillAni()) {
                float GS = 2.1f;
                float GD = 0.2f;
                this.swingX(this.jointFLL1, 0.2f * GS, 2.5f * GD, -1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL1, 0.2f * GS, 2.5f * GD, -1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL1, 0.2f * GS, 3.8f * GD, 1, -0.5f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL1, 0.2f * GS, 3.8f * GD, 1, 0.5f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFLL2, 0.2f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL2, 0.2f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL2, 0.2f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL2, 0.2f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.2f * GS, -1, limbSwing, limbSwingAmount, 0.08f);
                this.swingX(this.mainbody, 0.2f * GS, 0.8f * GD, -1, 0.8f, 0.0f, limbSwing, limbSwingAmount);
            } else {
                float f2 = Mth.cos((float)(ageInTicks * 2.6f)) * 0.015f;
                float f1 = Mth.cos((float)(ageInTicks * 2.27f)) * 0.02f;
                this.mainbody.x = this.mainbodyBaseX + (f2);
                this.mainbody.z = this.mainbodyBaseZ + (f1);
            }
            float f1 = Mth.cos((float)(ageInTicks * 0.5f)) * 0.3f;
            float f2 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.2f;
            this.joint.xRot = f1;
            this.jointLA1.zRot = f2 * 2.0f;
            this.jointLA2.xRot = -1.0f * f2;
            this.jointLA3.xRot = -1.0f * f2;
            this.jointLA4.xRot = -1.0f * f2;
            this.jointRA1.zRot = f2 * 2.0f;
            this.jointRA2.xRot = f2;
            this.jointRA3.xRot = f2;
            this.jointRA4.xRot = f2;
            f1 = -0.5f + Mth.cos((float)(ageInTicks * 0.6f)) * 0.15f;
            f2 = -0.3f + Mth.cos((float)(ageInTicks * 0.6f - 2.0f)) * 0.15f;
            this.jointRAFRF.xRot = f1;
            this.jointRAFLF.xRot = f1;
            this.jointRABRF.xRot = f2;
            this.jointRABLF.xRot = f2;
            this.jointLAFRF.xRot = f1;
            this.jointLAFLF.xRot = f1;
            this.jointLABRF.xRot = f2;
            this.jointLABLF.xRot = f2;
        }
        this.underground(parasite, ageInTicks, this.mainbody);
    }


    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}