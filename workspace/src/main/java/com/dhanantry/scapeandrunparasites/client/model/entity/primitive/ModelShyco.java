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
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityShyco;

public class ModelShyco extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "shyco"), "main");
    private final ModelPart jointLM1;
    private final ModelPart jointRM1;
    private final ModelPart jointLA;
    private final ModelPart jointLA3;
    private final ModelPart jointRA3;
    private final ModelPart jointRL1;
    private final ModelPart jointRL2;
    private final ModelPart jointRA;
    private final ModelPart jointLL;
    private final ModelPart jointLM2;
    private final ModelPart jointLL1;
    private final ModelPart jointLL2;
    private final ModelPart jointRL;
    private final ModelPart mainbody;
    private final ModelPart jointRM2;
    private final float mainbodyBaseX;
    private final float mainbodyBaseY;
    private final float mainbodyBaseZ;

    public ModelShyco(ModelPart root) {
        this.jointLM1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("body_3").getChild("bodyT").getChild("body_4").getChild("body_6").getChild("jointLM1");
        this.jointRM1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("body_3").getChild("bodyT").getChild("body_5").getChild("body_9").getChild("jointRM1");
        this.jointLA = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("body_3").getChild("bodyT").getChild("body_4").getChild("body_6").getChild("jointLM1").getChild("bodyJ").getChild("jointdont").getChild("jointdont_1").getChild("jointLA");
        this.jointLA3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("body_3").getChild("bodyT").getChild("body_4").getChild("body_6").getChild("jointLM1").getChild("bodyJ").getChild("jointdont").getChild("jointdont_1").getChild("jointLA").getChild("arm").getChild("jointLA1").getChild("arm_1").getChild("jointLA2").getChild("arm_2").getChild("jointLA3");
        this.jointRA3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("body_3").getChild("bodyT").getChild("body_5").getChild("body_9").getChild("jointRM1").getChild("bodyJ_1").getChild("jointdont_2").getChild("jointdont_3").getChild("jointRA").getChild("arm_5").getChild("jointRA1").getChild("arm_6").getChild("jointRA2").getChild("arm_7").getChild("jointRA3");
        this.jointRL1 = root.getChild("mainbody").getChild("jointRL").getChild("leg_3").getChild("jointdont_6").getChild("jointdont_7").getChild("jointRL1");
        this.jointRL2 = root.getChild("mainbody").getChild("jointRL").getChild("leg_3").getChild("jointdont_6").getChild("jointdont_7").getChild("jointRL1").getChild("leg_4").getChild("leg_5").getChild("jointRL2");
        this.jointRA = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("body_3").getChild("bodyT").getChild("body_5").getChild("body_9").getChild("jointRM1").getChild("bodyJ_1").getChild("jointdont_2").getChild("jointdont_3").getChild("jointRA");
        this.jointLL = root.getChild("mainbody").getChild("jointLL");
        this.jointLM2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("body_3").getChild("bodyT").getChild("body_4").getChild("body_6").getChild("jointLM1").getChild("bodyJ").getChild("jointLM2");
        this.jointLL1 = root.getChild("mainbody").getChild("jointLL").getChild("leg").getChild("jointdont_4").getChild("jointdont_5").getChild("jointLL1");
        this.jointLL2 = root.getChild("mainbody").getChild("jointLL").getChild("leg").getChild("jointdont_4").getChild("jointdont_5").getChild("jointLL1").getChild("leg_1").getChild("leg_2").getChild("jointLL2");
        this.jointRL = root.getChild("mainbody").getChild("jointRL");
        this.mainbody = root.getChild("mainbody");
        this.jointRM2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("body_3").getChild("bodyT").getChild("body_5").getChild("body_9").getChild("jointRM1").getChild("bodyJ_1").getChild("jointRM2");
        this.mainbodyBaseX = 0.0f;
        this.mainbodyBaseY = 0.0f;
        this.mainbodyBaseZ = 5.0f;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
                PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0f, -2.0f, -3.0f, 6, 4, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.54105204f, 0.0f, 0.0f));
                PartDefinition body_1 = body.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(24, 0).addBox(-2.5f, -5.0f, -2.0f, 5, 6, 4), PartPose.offsetAndRotation(0.0f, -2.5f, -0.3f, -0.20943952f, 0.0f, 0.0f));
                PartDefinition body_2 = body_1.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(42, 0).addBox(-2.0f, -5.0f, -1.5f, 4, 6, 3), PartPose.offsetAndRotation(0.0f, -5.4f, 0.5f, -0.13962634f, 0.0f, 0.0f));
                PartDefinition body_3 = body_2.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(56, 0).addBox(-1.5f, -11.0f, -1.0f, 3, 12, 2), PartPose.offsetAndRotation(0.0f, -5.0f, 0.0f, -0.13962634f, 0.0f, 0.0f));
                PartDefinition bodyT = body_3.addOrReplaceChild("bodyT", CubeListBuilder.create().texOffs(66, 0).addBox(-2.5f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, -11.0f, 0.0f, -0.7679449f, 0.0f, 0.0f));
                PartDefinition body_4 = bodyT.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(76, 0).addBox(-2.0f, -1.5f, -2.0f, 4, 3, 4), PartPose.offsetAndRotation(3.2f, -1.0f, 0.0f, 0.0f, 0.0f, -0.57595867f));
                PartDefinition body_6 = body_4.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(102, 1).addBox(-1.5f, -4.0f, -3.0f, 4, 9, 6), PartPose.offset(3.0f, 0.0f, 0.0f));
                PartDefinition jointLM1 = body_6.addOrReplaceChild("jointLM1", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5f, -3.5f, -0.5f, 1, 1, 1), PartPose.offset(0.4f, 3.9f, 0.0f));
                PartDefinition bodyJ = jointLM1.addOrReplaceChild("bodyJ", CubeListBuilder.create().texOffs(66, 7).addBox(-3.5f, -1.5f, -2.5f, 7, 4, 5), PartPose.offsetAndRotation(-2.2f, 2.0f, 0.0f, 0.0f, 0.0f, -0.80285144f));
                PartDefinition jointdont = bodyJ.addOrReplaceChild("jointdont", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, -0.13962634f, -0.4886922f, 0.0f));
                PartDefinition jointdont_1 = jointdont.addOrReplaceChild("jointdont_1", CubeListBuilder.create().texOffs(41, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.15707964f));
                PartDefinition jointLA = jointdont_1.addOrReplaceChild("jointLA", CubeListBuilder.create().texOffs(18, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition arm = jointLA.addOrReplaceChild("arm", CubeListBuilder.create().texOffs(40, 9).addBox(-1.0f, -0.5f, -1.0f, 2, 4, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 0.0f, 0.0f));
                PartDefinition jointLA1 = arm.addOrReplaceChild("jointLA1", CubeListBuilder.create().texOffs(22, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.4f, 0.0f));
                PartDefinition arm_1 = jointLA1.addOrReplaceChild("arm_1", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0f, -1.0f, -2.0f, 4, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.3f, 0.31415927f, 0.0f, 0.0f));
                PartDefinition jointLA2 = arm_1.addOrReplaceChild("jointLA2", CubeListBuilder.create().texOffs(38, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.0f, 0.0f));
                PartDefinition arm_2 = jointLA2.addOrReplaceChild("arm_2", CubeListBuilder.create().texOffs(48, 9).addBox(-1.0f, -1.0f, -1.0f, 2, 14, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.36651915f, 0.0f, 0.0f));
                PartDefinition jointLA3 = arm_2.addOrReplaceChild("jointLA3", CubeListBuilder.create().texOffs(123, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 12.4f, 0.0f));
                PartDefinition arm_3 = jointLA3.addOrReplaceChild("arm_3", CubeListBuilder.create().texOffs(16, 10).addBox(-1.5f, -1.0f, -1.5f, 3, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.3f, 0.31415927f, 0.0f, 0.0f));
                PartDefinition jointLA4 = arm_3.addOrReplaceChild("jointLA4", CubeListBuilder.create().texOffs(116, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 1.0f, 0.0f));
                PartDefinition arm_4 = jointLA4.addOrReplaceChild("arm_4", CubeListBuilder.create().texOffs(28, 10).addBox(-1.0f, -1.0f, -1.0f, 2, 20, 2), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition hand = arm_4.addOrReplaceChild("hand", CubeListBuilder.create().texOffs(90, 12).addBox(-1.5f, -0.5f, -1.5f, 3, 4, 3), PartPose.offsetAndRotation(0.0f, 18.5f, -0.1f, -0.06981317f, 0.0f, 0.0f));
                PartDefinition dec = bodyJ.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(85, 7).addBox(-2.0f, -1.0f, -1.5f, 4, 2, 3), PartPose.offset(0.0f, 2.0f, 0.0f));
                PartDefinition teeth = bodyJ.addOrReplaceChild("teeth", CubeListBuilder.create().texOffs(88, 0).addBox(0.0f, -2.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(0.5f, -1.0f, -1.5f, 0.0f, 0.0f, -0.17453292f));
                PartDefinition teeth_1 = bodyJ.addOrReplaceChild("teeth_1", CubeListBuilder.create().texOffs(92, 0).addBox(0.0f, -2.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(0.5f, -1.0f, 0.5f, 0.0f, 0.0f, -0.17453292f));
                PartDefinition teeth_2 = bodyJ.addOrReplaceChild("teeth_2", CubeListBuilder.create().texOffs(104, 0).addBox(0.0f, -2.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(-1.4f, -1.0f, -1.5f, 0.0f, 0.0f, -0.2443461f));
                PartDefinition teeth_3 = bodyJ.addOrReplaceChild("teeth_3", CubeListBuilder.create().texOffs(116, 0).addBox(0.0f, -2.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(-1.4f, -1.0f, 0.5f, 0.0f, 0.0f, -0.2443461f));
                PartDefinition teeth_4 = bodyJ.addOrReplaceChild("teeth_4", CubeListBuilder.create().texOffs(120, 0).addBox(0.0f, -1.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(-3.5f, -2.0f, -1.5f, 0.0f, 0.0f, -0.33161256f));
                PartDefinition teeth_5 = bodyJ.addOrReplaceChild("teeth_5", CubeListBuilder.create().texOffs(0, 2).addBox(0.0f, -2.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(-3.2f, -1.0f, 0.5f, 0.0f, 0.0f, -0.33161256f));
                PartDefinition jointLM2 = bodyJ.addOrReplaceChild("jointLM2", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 3.0f));
                PartDefinition body_7 = jointLM2.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(56, 16).addBox(-3.0f, -1.0f, -4.0f, 6, 3, 8), PartPose.offsetAndRotation(-0.3f, 0.3f, 0.0f, -0.15707964f, -0.62831855f, 0.0f));
                PartDefinition teeth_6 = body_7.addOrReplaceChild("teeth_6", CubeListBuilder.create().texOffs(120, 3).addBox(0.0f, -1.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(-2.9f, -1.5f, -1.1f, 0.0f, 0.0f, -0.33161256f));
                PartDefinition teeth_7 = body_7.addOrReplaceChild("teeth_7", CubeListBuilder.create().texOffs(66, 4).addBox(0.0f, -2.0f, 0.0f, 1, 3, 1), PartPose.offsetAndRotation(-2.9f, -1.2f, 0.7f, -0.12217305f, 0.0f, -0.61086524f));
                PartDefinition teeth_8 = body_7.addOrReplaceChild("teeth_8", CubeListBuilder.create().texOffs(123, 5).addBox(0.0f, -2.5f, 0.0f, 1, 4, 1), PartPose.offsetAndRotation(-2.9f, -1.2f, 2.7f, -0.2268928f, 0.0f, -0.61086524f));
                PartDefinition teeth_9 = body_7.addOrReplaceChild("teeth_9", CubeListBuilder.create().texOffs(66, 8).addBox(0.0f, -2.0f, 0.0f, 1, 3, 1), PartPose.offsetAndRotation(-0.9f, -1.2f, 0.7f, -0.17453292f, 0.0f, -0.57595867f));
                PartDefinition teeth_10 = body_7.addOrReplaceChild("teeth_10", CubeListBuilder.create().texOffs(36, 10).addBox(0.0f, -2.5f, 0.0f, 1, 4, 1), PartPose.offsetAndRotation(-0.9f, -1.2f, 2.7f, -0.34906584f, 0.0f, -0.54105204f));
                PartDefinition teeth_11 = body_7.addOrReplaceChild("teeth_11", CubeListBuilder.create().texOffs(0, 10).addBox(0.0f, -2.0f, 0.0f, 1, 3, 1), PartPose.offsetAndRotation(1.1f, -1.2f, 0.7f, -0.2268928f, 0.0f, -0.4537856f));
                PartDefinition teeth_12 = body_7.addOrReplaceChild("teeth_12", CubeListBuilder.create().texOffs(122, 10).addBox(0.0f, -2.5f, 0.0f, 1, 4, 1), PartPose.offsetAndRotation(1.1f, -1.2f, 2.7f, -0.40142572f, 0.0f, -0.40142572f));
                PartDefinition body_8 = body_7.addOrReplaceChild("body_8", CubeListBuilder.create().texOffs(76, 16).addBox(-2.5f, -1.0f, 0.0f, 5, 2, 4), PartPose.offsetAndRotation(0.0f, 0.7f, 3.5f, 0.38397244f, 0.0f, 0.0f));
                PartDefinition body_5 = bodyT.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(92, 0).addBox(-2.0f, -1.5f, -2.0f, 4, 3, 4), PartPose.offsetAndRotation(-3.2f, -1.0f, 0.0f, 0.0f, 0.0f, 0.57595867f));
                PartDefinition body_9 = body_5.addOrReplaceChild("body_9", CubeListBuilder.create().texOffs(96, 16).addBox(-2.5f, -4.0f, -3.0f, 4, 9, 6), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition jointRM1 = body_9.addOrReplaceChild("jointRM1", CubeListBuilder.create().texOffs(18, 4).addBox(-0.5f, -3.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.4f, 3.9f, 0.0f));
                PartDefinition bodyJ_1 = jointRM1.addOrReplaceChild("bodyJ_1", CubeListBuilder.create().texOffs(0, 18).addBox(-3.5f, -1.5f, -2.5f, 7, 4, 5), PartPose.offsetAndRotation(2.2f, 2.0f, 0.0f, 0.0f, 0.0f, 0.80285144f));
                PartDefinition jointdont_2 = bodyJ_1.addOrReplaceChild("jointdont_2", CubeListBuilder.create().texOffs(70, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, -0.13962634f, 0.4886922f, 0.0f));
                PartDefinition jointdont_3 = jointdont_2.addOrReplaceChild("jointdont_3", CubeListBuilder.create().texOffs(46, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.15707964f));
                PartDefinition jointRA = jointdont_3.addOrReplaceChild("jointRA", CubeListBuilder.create().texOffs(25, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition arm_5 = jointRA.addOrReplaceChild("arm_5", CubeListBuilder.create().texOffs(36, 15).addBox(-1.0f, -0.5f, -1.0f, 2, 4, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 0.0f, 0.0f));
                PartDefinition jointRA1 = arm_5.addOrReplaceChild("jointRA1", CubeListBuilder.create().texOffs(24, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.4f, 0.0f));
                PartDefinition arm_6 = jointRA1.addOrReplaceChild("arm_6", CubeListBuilder.create().texOffs(36, 21).addBox(-2.0f, -1.0f, -2.0f, 4, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.3f, 0.31415927f, 0.0f, 0.0f));
                PartDefinition jointRA2 = arm_6.addOrReplaceChild("jointRA2", CubeListBuilder.create().texOffs(42, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.0f, 0.0f));
                PartDefinition arm_7 = jointRA2.addOrReplaceChild("arm_7", CubeListBuilder.create().texOffs(116, 21).addBox(-1.0f, -1.0f, -1.0f, 2, 14, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.36651915f, 0.0f, 0.0f));
                PartDefinition jointRA3 = arm_7.addOrReplaceChild("jointRA3", CubeListBuilder.create().texOffs(121, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 12.4f, 0.0f));
                PartDefinition arm_8 = jointRA3.addOrReplaceChild("arm_8", CubeListBuilder.create().texOffs(84, 22).addBox(-1.5f, -1.0f, -1.5f, 3, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.3f, 0.31415927f, 0.0f, 0.0f));
                PartDefinition jointRA4 = arm_8.addOrReplaceChild("jointRA4", CubeListBuilder.create().texOffs(76, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 1.0f, 0.0f));
                PartDefinition arm_9 = jointRA4.addOrReplaceChild("arm_9", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0f, -1.0f, -1.0f, 2, 20, 2), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition hand_1 = arm_9.addOrReplaceChild("hand_1", CubeListBuilder.create().texOffs(8, 27).addBox(-1.5f, -0.5f, -1.5f, 3, 4, 3), PartPose.offsetAndRotation(0.0f, 18.5f, -0.1f, -0.06981317f, 0.0f, 0.0f));
                PartDefinition dec_1 = bodyJ_1.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(110, 16).addBox(-2.0f, -1.0f, -1.5f, 4, 2, 3), PartPose.offset(0.0f, 2.0f, 0.0f));
                PartDefinition teeth_13 = bodyJ_1.addOrReplaceChild("teeth_13", CubeListBuilder.create().texOffs(96, 7).addBox(0.0f, -2.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(-1.5f, -1.5f, -1.5f, 0.0f, 0.0f, 0.17453292f));
                PartDefinition teeth_14 = bodyJ_1.addOrReplaceChild("teeth_14", CubeListBuilder.create().texOffs(12, 10).addBox(0.0f, -2.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(-1.5f, -1.5f, 0.5f, 0.0f, 0.0f, 0.17453292f));
                PartDefinition teeth_15 = bodyJ_1.addOrReplaceChild("teeth_15", CubeListBuilder.create().texOffs(56, 14).addBox(0.0f, -2.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(0.4f, -1.5f, -1.5f, 0.0f, 0.0f, 0.2443461f));
                PartDefinition teeth_16 = bodyJ_1.addOrReplaceChild("teeth_16", CubeListBuilder.create().texOffs(60, 14).addBox(0.0f, -1.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(2.6f, -2.4f, -1.5f, 0.0f, 0.0f, 0.33161256f));
                PartDefinition teeth_17 = bodyJ_1.addOrReplaceChild("teeth_17", CubeListBuilder.create().texOffs(16, 15).addBox(0.0f, -2.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(0.4f, -1.5f, 0.5f, 0.0f, 0.0f, 0.2443461f));
                PartDefinition teeth_18 = bodyJ_1.addOrReplaceChild("teeth_18", CubeListBuilder.create().texOffs(20, 15).addBox(0.0f, -2.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(2.3f, -1.5f, 0.5f, 0.0f, 0.0f, 0.33161256f));
                PartDefinition jointRM2 = bodyJ_1.addOrReplaceChild("jointRM2", CubeListBuilder.create().texOffs(116, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.0f, 0.0f, 3.0f));
                PartDefinition body_10 = jointRM2.addOrReplaceChild("body_10", CubeListBuilder.create().texOffs(44, 27).addBox(-3.0f, -1.0f, -4.0f, 6, 3, 8), PartPose.offsetAndRotation(0.3f, 0.3f, 0.0f, -0.15707964f, 0.62831855f, 0.0f));
                PartDefinition teeth_19 = body_10.addOrReplaceChild("teeth_19", CubeListBuilder.create().texOffs(23, 17).addBox(0.0f, -1.0f, 0.0f, 1, 2, 1), PartPose.offsetAndRotation(2.0f, -1.9f, -1.1f, 0.0f, 0.0f, 0.33161256f));
                PartDefinition teeth_20 = body_10.addOrReplaceChild("teeth_20", CubeListBuilder.create().texOffs(44, 17).addBox(0.0f, -2.0f, 0.0f, 1, 3, 1), PartPose.offsetAndRotation(2.0f, -1.6f, 0.7f, -0.12217305f, 0.0f, 0.61086524f));
                PartDefinition teeth_21 = body_10.addOrReplaceChild("teeth_21", CubeListBuilder.create().texOffs(56, 17).addBox(0.0f, -2.5f, 0.0f, 1, 4, 1), PartPose.offsetAndRotation(2.0f, -1.6f, 2.7f, -0.2268928f, 0.0f, 0.61086524f));
                PartDefinition teeth_22 = body_10.addOrReplaceChild("teeth_22", CubeListBuilder.create().texOffs(60, 17).addBox(0.0f, -2.0f, 0.0f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, -1.6f, 0.7f, -0.17453292f, 0.0f, 0.57595867f));
                PartDefinition teeth_23 = body_10.addOrReplaceChild("teeth_23", CubeListBuilder.create().texOffs(0, 18).addBox(0.0f, -2.5f, 0.0f, 1, 4, 1), PartPose.offsetAndRotation(0.0f, -1.6f, 2.7f, -0.34906584f, 0.0f, 0.54105204f));
                PartDefinition teeth_24 = body_10.addOrReplaceChild("teeth_24", CubeListBuilder.create().texOffs(19, 18).addBox(0.0f, -2.0f, 0.0f, 1, 3, 1), PartPose.offsetAndRotation(-2.0f, -1.6f, 0.7f, -0.2268928f, 0.0f, 0.4537856f));
                PartDefinition teeth_25 = body_10.addOrReplaceChild("teeth_25", CubeListBuilder.create().texOffs(24, 20).addBox(0.0f, -2.5f, 0.0f, 1, 4, 1), PartPose.offsetAndRotation(-2.0f, -1.6f, 2.7f, -0.40142572f, 0.0f, 0.40142572f));
                PartDefinition body_11 = body_10.addOrReplaceChild("body_11", CubeListBuilder.create().texOffs(64, 27).addBox(-2.5f, -1.0f, 0.0f, 5, 2, 4), PartPose.offsetAndRotation(0.0f, 0.7f, 3.5f, 0.38397244f, 0.0f, 0.0f));
                PartDefinition jointLL = mainbody.addOrReplaceChild("jointLL", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.2f, 0.3f, -1.0f));
                PartDefinition leg = jointLL.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(82, 27).addBox(-2.0f, -2.5f, -1.5f, 4, 13, 3), PartPose.offsetAndRotation(1.9f, 2.0f, -0.9f, -0.7853982f, 0.0f, 0.0f));
                PartDefinition body_12 = leg.addOrReplaceChild("body_12", CubeListBuilder.create().texOffs(96, 31).addBox(-2.5f, -3.0f, -1.0f, 5, 6, 2), PartPose.offsetAndRotation(1.9f, -1.2f, 0.0f, 0.12217305f, 1.5707964f, 0.0f));
                PartDefinition jointdont_4 = leg.addOrReplaceChild("jointdont_4", CubeListBuilder.create().texOffs(121, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.4f, 9.0f, 0.0f, 0.7853982f, 0.0f, 0.0f));
                PartDefinition jointdont_5 = jointdont_4.addOrReplaceChild("jointdont_5", CubeListBuilder.create().texOffs(76, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.20943952f, 0.0f));
                PartDefinition jointLL1 = jointdont_5.addOrReplaceChild("jointLL1", CubeListBuilder.create().texOffs(94, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition leg_1 = jointLL1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(17, 31).addBox(-1.5f, -1.0f, -1.5f, 3, 5, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 2.1f, 0.87266463f, 0.0f, 0.0f));
                PartDefinition leg_2 = leg_1.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(29, 32).addBox(-2.0f, -1.5f, -1.5f, 4, 12, 3), PartPose.offsetAndRotation(0.0f, 4.5f, -0.5f, -1.0297443f, 0.0f, 0.0f));
                PartDefinition jointLL2 = leg_2.addOrReplaceChild("jointLL2", CubeListBuilder.create().texOffs(98, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 10.1f, 0.0f));
                PartDefinition foot = jointLL2.addOrReplaceChild("foot", CubeListBuilder.create().texOffs(107, 37).addBox(-2.5f, -1.5f, -1.0f, 5, 4, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.6f, -1.4137167f, 0.0f, 0.0f));
                PartDefinition toe = foot.addOrReplaceChild("toe", CubeListBuilder.create().texOffs(40, 29).addBox(-1.0f, -2.0f, 0.0f, 2, 3, 2), PartPose.offset(0.0f, 3.0f, 0.0f));
                PartDefinition toe_1 = foot.addOrReplaceChild("toe_1", CubeListBuilder.create().texOffs(72, 33).addBox(-1.0f, -2.0f, 0.0f, 2, 3, 2), PartPose.offset(2.5f, 1.0f, 0.0f));
                PartDefinition jointRL = mainbody.addOrReplaceChild("jointRL", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.2f, 0.3f, -1.0f));
                PartDefinition leg_3 = jointRL.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(43, 38).addBox(-2.0f, -2.5f, -1.5f, 4, 13, 3), PartPose.offsetAndRotation(-1.9f, 2.0f, -0.9f, -0.7853982f, 0.0f, 0.0f));
                PartDefinition body_13 = leg_3.addOrReplaceChild("body_13", CubeListBuilder.create().texOffs(57, 38).addBox(-2.5f, -3.0f, -1.0f, 5, 6, 2), PartPose.offsetAndRotation(-1.9f, -1.2f, 0.0f, -0.12217305f, 1.5707964f, 0.0f));
                PartDefinition jointdont_6 = leg_3.addOrReplaceChild("jointdont_6", CubeListBuilder.create().texOffs(123, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-0.4f, 9.0f, 0.0f, 0.7853982f, 0.0f, 0.0f));
                PartDefinition jointdont_7 = jointdont_6.addOrReplaceChild("jointdont_7", CubeListBuilder.create().texOffs(36, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.20943952f, 0.0f));
                PartDefinition jointRL1 = jointdont_7.addOrReplaceChild("jointRL1", CubeListBuilder.create().texOffs(59, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition leg_4 = jointRL1.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(8, 36).addBox(-1.5f, -1.0f, -1.5f, 3, 5, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 2.1f, 0.87266463f, 0.0f, 0.0f));
                PartDefinition leg_5 = leg_4.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(71, 40).addBox(-2.0f, -1.5f, -1.5f, 4, 12, 3), PartPose.offsetAndRotation(0.0f, 4.5f, -0.5f, -1.0297443f, 0.0f, 0.0f));
                PartDefinition jointRL2 = leg_5.addOrReplaceChild("jointRL2", CubeListBuilder.create().texOffs(56, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 10.1f, 0.0f));
                PartDefinition foot_1 = jointRL2.addOrReplaceChild("foot_1", CubeListBuilder.create().texOffs(93, 41).addBox(-2.5f, -1.5f, -1.0f, 5, 4, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.6f, -1.4137167f, 0.0f, 0.0f));
                PartDefinition toe_2 = foot_1.addOrReplaceChild("toe_2", CubeListBuilder.create().texOffs(20, 39).addBox(-1.0f, -2.0f, 0.0f, 2, 3, 2), PartPose.offset(0.0f, 3.0f, 0.0f));
                PartDefinition toe_3 = foot_1.addOrReplaceChild("toe_3", CubeListBuilder.create().texOffs(85, 43).addBox(-1.0f, -2.0f, 0.0f, 2, 3, 2), PartPose.offset(-2.5f, 1.0f, 0.0f));
        return LayerDefinition.create(mesh, 128, 60);
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
        float f1;
        float GS;
        EntityShyco parasite = (EntityShyco)entity;
        this.jointLL.xRot = 0.0f;
        this.jointRL.xRot = 0.0f;
        this.jointLL1.xRot = 0.0f;
        this.jointRL1.xRot = 0.0f;
        this.jointLL2.xRot = 0.0f;
        this.jointRL2.xRot = 0.0f;
        this.mainbody.y = this.mainbodyBaseY + (0.0f);
        this.jointLA.yRot = 0.0f;
        this.jointRA.yRot = 0.0f;
        this.jointLA.xRot = 0.0f;
        this.jointRA.xRot = 0.0f;
        this.jointLA3.zRot = 0.0f;
        this.jointRA3.zRot = 0.0f;
        this.jointLA.xRot = 0.0f;
        this.jointRA.xRot = 0.0f;
        this.jointLM1.zRot = 0.0f;
        this.jointLM2.zRot = 0.0f;
        this.jointRM1.zRot = 0.0f;
        this.jointRM2.zRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                GS = 1.1f;
                float GD = 0.5f;
                this.swingX(this.jointLL, 0.3f * GS, 0.9f * GD, 1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL, 0.3f * GS, 0.9f * GD, -1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointLL1, 0.3f * GS, 0.8f * GD, 1, 0.0f, 0.3f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL1, 0.3f * GS, 0.8f * GD, -1, 0.0f, 0.3f, limbSwing, limbSwingAmount);
                this.swingX(this.jointLL2, 0.3f * GS, 0.8f * GD, 1, 0.0f, 0.3f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL2, 0.3f * GS, 0.8f * GD, -1, 0.0f, 0.3f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.09f);
                this.swingY(this.jointLA, 0.3f * GS, 0.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingY(this.jointRA, 0.3f * GS, 0.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointLA, 0.3f * GS, 0.2f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointRA, 0.3f * GS, 0.2f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLM1, 0.3f * GS, 0.2f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLM2, 0.3f * GS, 0.3f * GD, 1, limbSwing, limbSwingAmount);
                this.jointLM1.zRot += -0.2f;
                this.jointLM2.zRot += -0.05f;
                this.swingZ(this.jointRM1, 0.3f * GS, 0.2f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRM2, 0.3f * GS, 0.3f * GD, -1, limbSwing, limbSwingAmount);
                this.jointRM1.zRot += 0.2f;
                this.jointRM2.zRot += 0.05f;
            } else {
                f1 = Mth.cos((float)(ageInTicks * 0.1133f)) * 0.111f;
                float f2 = Mth.cos((float)(ageInTicks * 0.1f)) * 0.15f;
                this.jointLL.xRot = 0.0f;
                this.jointRL.xRot = 0.0f;
                this.jointLL1.xRot = 0.0f;
                this.jointRL1.xRot = 0.0f;
                this.jointLL2.xRot = 0.0f;
                this.jointRL2.xRot = 0.0f;
                this.mainbody.y = this.mainbodyBaseY + (0.0f);
                this.jointLA.yRot = f1;
                this.jointRA.yRot = f1;
                this.jointLA.xRot = -1.0f * f2;
                this.jointRA.xRot = -1.0f * f2;
                this.jointLM1.zRot = f2;
                this.jointLM2.zRot = f2;
                this.jointRM1.zRot = -1.0f * f2;
                this.jointRM2.zRot = -1.0f * f2;
            }
        } else if (i == 1) {
            if (!parasite.getStillAni()) {
                GS = 1.1f;
                float GD = 0.5f;
                this.swingX(this.jointLL, 0.3f * GS, 0.9f * GD, 1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL, 0.3f * GS, 0.9f * GD, -1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointLL1, 0.3f * GS, 0.8f * GD, 1, 0.0f, 0.3f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL1, 0.3f * GS, 0.8f * GD, -1, 0.0f, 0.3f, limbSwing, limbSwingAmount);
                this.swingX(this.jointLL2, 0.3f * GS, 0.8f * GD, 1, 0.0f, 0.3f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL2, 0.3f * GS, 0.8f * GD, -1, 0.0f, 0.3f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.09f);
                this.swingY(this.jointLA, 0.3f * GS, 0.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingY(this.jointRA, 0.3f * GS, 0.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointLA, 0.3f * GS, 0.7f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointRA, 0.3f * GS, 0.7f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLM1, 0.3f * GS, 0.7f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLM2, 0.3f * GS, 0.5f * GD, 1, limbSwing, limbSwingAmount);
                this.jointLM1.zRot += -0.2f;
                this.jointLM2.zRot += -0.05f;
                this.swingZ(this.jointRM1, 0.3f * GS, 0.7f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRM2, 0.3f * GS, 0.5f * GD, -1, limbSwing, limbSwingAmount);
                this.jointRM1.zRot += 0.2f;
                this.jointRM2.zRot += 0.05f;
            } else {
                f1 = Mth.cos((float)(ageInTicks * 0.2133f)) * 0.111f;
                float f2 = Mth.cos((float)(ageInTicks * 0.159f)) * 0.15f;
                this.jointLL.xRot = 0.0f;
                this.jointRL.xRot = 0.0f;
                this.jointLL1.xRot = 0.0f;
                this.jointRL1.xRot = 0.0f;
                this.jointLL2.xRot = 0.0f;
                this.jointRL2.xRot = 0.0f;
                this.mainbody.y = this.mainbodyBaseY + (0.0f);
                this.jointLA.yRot = f1;
                this.jointRA.yRot = f1;
                this.jointLA.xRot = -1.0f * f2;
                this.jointRA.xRot = -1.0f * f2;
                this.jointLM1.zRot = f2;
                this.jointLM2.zRot = f2;
                this.jointRM1.zRot = -1.0f * f2;
                this.jointRM2.zRot = -1.0f * f2;
            }
        } else if (i == 2) {
            if (!parasite.getStillAni()) {
                GS = 0.8f;
                float GD = 0.4f;
                this.swingX(this.jointLL, 0.4f * GS, 0.9f * GD, 1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL, 0.4f * GS, 0.9f * GD, -1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointLL1, 0.4f * GS, 0.9f * GD, 1, 0.0f, 0.3f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL1, 0.4f * GS, 0.9f * GD, -1, 0.0f, 0.3f, limbSwing, limbSwingAmount);
                this.swingX(this.jointLL2, 0.4f * GS, 0.9f * GD, 1, 0.0f, 0.3f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL2, 0.4f * GS, 0.9f * GD, -1, 0.0f, 0.3f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.8f * GS, 1, limbSwing, limbSwingAmount, 0.09f);
                this.swingY(this.jointLA, 0.45f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingY(this.jointRA, 0.45f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointLA, 0.57f * GS, 0.7f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointRA, 0.57f * GS, 0.7f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLM1, 0.57f * GS, 0.7f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLM2, 0.57f * GS, 0.5f * GD, 1, limbSwing, limbSwingAmount);
                this.jointLM1.zRot += -0.5f;
                this.jointLM2.zRot += -0.2f;
                this.swingZ(this.jointRM1, 0.57f * GS, 0.7f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRM2, 0.57f * GS, 0.5f * GD, -1, limbSwing, limbSwingAmount);
                this.jointRM1.zRot += 0.5f;
                this.jointRM2.zRot += 0.2f;
            } else {
                f1 = Mth.cos((float)(ageInTicks * 0.2133f)) * 0.111f;
                float f2 = Mth.cos((float)(ageInTicks * 0.159f)) * 0.15f;
                this.jointLL.xRot = 0.0f;
                this.jointRL.xRot = 0.0f;
                this.jointLL1.xRot = 0.0f;
                this.jointRL1.xRot = 0.0f;
                this.jointLL2.xRot = 0.0f;
                this.jointRL2.xRot = 0.0f;
                this.mainbody.y = this.mainbodyBaseY + (0.0f);
                this.jointLA.yRot = f1;
                this.jointRA.yRot = f1;
                this.jointLA.xRot = -1.0f * f2;
                this.jointRA.xRot = -1.0f * f2;
                this.jointLM1.zRot = f2;
                this.jointLM2.zRot = f2;
                this.jointRM1.zRot = -1.0f * f2;
                this.jointRM2.zRot = -1.0f * f2;
            }
        }
        float id = parasite.getAttackTimer();
        if (id > 0.0f) {
            this.jointLA.yRot -= Math.min(2.0f, id);
            this.jointRA.yRot += Math.min(2.0f, id);
            this.jointLA3.zRot -= Math.min(0.5f, id);
            this.jointRA3.zRot += Math.min(0.5f, id);
            this.jointLA.xRot -= Math.min(0.4f, id);
            this.jointRA.xRot -= Math.min(0.4f, id);
        }
        this.underground(parasite, ageInTicks, this.mainbody);
    }


    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}