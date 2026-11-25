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
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityWymo;

public class ModelWymo extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "wymo"), "main");
    private final ModelPart jointb5;
    private final ModelPart jointb4ar_2;
    private final ModelPart jointb4a;
    private final ModelPart jointb7ar_1;
    private final ModelPart jointb4ar_4;
    private final ModelPart jointb2;
    private final ModelPart jointb4;
    private final ModelPart jointb4ar_3;
    private final ModelPart jointb9;
    private final ModelPart jointm4;
    private final ModelPart jointb4ar;
    private final ModelPart jointb8;
    private final ModelPart jointb7;
    private final ModelPart jointm6;
    private final ModelPart jointb7ar_3;
    private final ModelPart jointm2;
    private final ModelPart jointb6;
    private final ModelPart jointb7a_3;
    private final ModelPart jointm9;
    private final ModelPart jointm7;
    private final ModelPart jointb7ar_4;
    private final ModelPart jointb4a_3;
    private final ModelPart jointm5;
    private final ModelPart jointb7a_4;
    private final ModelPart jointm0;
    private final ModelPart jointb4a_1;
    private final ModelPart jointb7a_1;
    private final ModelPart jointb4a_4;
    private final ModelPart jointb3;
    private final ModelPart jointb4ar_1;
    private final ModelPart jointm3;
    private final ModelPart jointb1;
    private final ModelPart jointm8;
    private final ModelPart jointb7a_2;
    private final ModelPart jointb7ar_2;
    private final ModelPart jointb7ar;
    private final ModelPart mainbody;
    private final ModelPart jointb4a_2;
    private final ModelPart jointm1;
    private final ModelPart jointb7a;
    private final float mainbodyBaseX;
    private final float mainbodyBaseY;
    private final float mainbodyBaseZ;

    public ModelWymo(ModelPart root) {
        this.jointb5 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5");
        this.jointb4ar_2 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("jointb4ar").getChild("jd_3").getChild("body_47").getChild("jointb4ar_1").getChild("body_48").getChild("jointb4ar_2");
        this.jointb4a = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("jointb4a");
        this.jointb7ar_1 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("jointb7ar").getChild("jd_1").getChild("body_36").getChild("jointb7ar_1");
        this.jointb4ar_4 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("jointb4ar").getChild("jd_3").getChild("body_47").getChild("jointb4ar_1").getChild("body_48").getChild("jointb4ar_2").getChild("b_5").getChild("jointb4ar_3").getChild("body_49").getChild("jointb4ar_4");
        this.jointb2 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2");
        this.jointb4 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4");
        this.jointb4ar_3 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("jointb4ar").getChild("jd_3").getChild("body_47").getChild("jointb4ar_1").getChild("body_48").getChild("jointb4ar_2").getChild("b_5").getChild("jointb4ar_3");
        this.jointb9 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("bodyS_3").getChild("jointb8").getChild("body_4").getChild("jointb9");
        this.jointm4 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("bodyS_3").getChild("jointb8").getChild("body_4").getChild("jointb9").getChild("bodyS_4").getChild("jointb10").getChild("bodyA").getChild("jointH").getChild("b").getChild("JD_3").getChild("jointm4");
        this.jointb4ar = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("jointb4ar");
        this.jointb8 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("bodyS_3").getChild("jointb8");
        this.jointb7 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7");
        this.jointm6 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("bodyS_3").getChild("jointb8").getChild("body_4").getChild("jointb9").getChild("bodyS_4").getChild("jointb10").getChild("bodyA").getChild("jointH").getChild("b_1").getChild("JD_5").getChild("jointm6");
        this.jointb7ar_3 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("jointb7ar").getChild("jd_1").getChild("body_36").getChild("jointb7ar_1").getChild("body_37").getChild("jointb7ar_2").getChild("body_38").getChild("jointb7ar_3");
        this.jointm2 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("bodyS_3").getChild("jointb8").getChild("body_4").getChild("jointb9").getChild("bodyS_4").getChild("jointb10").getChild("bodyA").getChild("jointH").getChild("b").getChild("JD_1").getChild("jointm2");
        this.jointb6 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6");
        this.jointb7a_3 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("jointb7a").getChild("jd").getChild("body_30").getChild("jointb7a_1").getChild("body_31").getChild("jointb7a_2").getChild("body_32").getChild("jointb7a_3");
        this.jointm9 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("bodyS_3").getChild("jointb8").getChild("body_4").getChild("jointb9").getChild("bodyS_4").getChild("jointb10").getChild("bodyA").getChild("jointH").getChild("b_1").getChild("JD_8").getChild("jointm9");
        this.jointm7 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("bodyS_3").getChild("jointb8").getChild("body_4").getChild("jointb9").getChild("bodyS_4").getChild("jointb10").getChild("bodyA").getChild("jointH").getChild("b_1").getChild("JD_6").getChild("jointm7");
        this.jointb7ar_4 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("jointb7ar").getChild("jd_1").getChild("body_36").getChild("jointb7ar_1").getChild("body_37").getChild("jointb7ar_2").getChild("body_38").getChild("jointb7ar_3").getChild("body_39").getChild("jointb7ar_4");
        this.jointb4a_3 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("jointb4a").getChild("jd_2").getChild("body_42").getChild("jointb4a_1").getChild("body_43").getChild("jointb4a_2").getChild("b_4").getChild("jointb4a_3");
        this.jointm5 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("bodyS_3").getChild("jointb8").getChild("body_4").getChild("jointb9").getChild("bodyS_4").getChild("jointb10").getChild("bodyA").getChild("jointH").getChild("b").getChild("JD_4").getChild("jointm5");
        this.jointb7a_4 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("jointb7a").getChild("jd").getChild("body_30").getChild("jointb7a_1").getChild("body_31").getChild("jointb7a_2").getChild("body_32").getChild("jointb7a_3").getChild("body_33").getChild("jointb7a_4");
        this.jointm0 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("bodyS_3").getChild("jointb8").getChild("body_4").getChild("jointb9").getChild("bodyS_4").getChild("jointb10").getChild("bodyA").getChild("jointH").getChild("b_1").getChild("JD_9").getChild("jointm0");
        this.jointb4a_1 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("jointb4a").getChild("jd_2").getChild("body_42").getChild("jointb4a_1");
        this.jointb7a_1 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("jointb7a").getChild("jd").getChild("body_30").getChild("jointb7a_1");
        this.jointb4a_4 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("jointb4a").getChild("jd_2").getChild("body_42").getChild("jointb4a_1").getChild("body_43").getChild("jointb4a_2").getChild("b_4").getChild("jointb4a_3").getChild("body_44").getChild("jointb4a_4");
        this.jointb3 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3");
        this.jointb4ar_1 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("jointb4ar").getChild("jd_3").getChild("body_47").getChild("jointb4ar_1");
        this.jointm3 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("bodyS_3").getChild("jointb8").getChild("body_4").getChild("jointb9").getChild("bodyS_4").getChild("jointb10").getChild("bodyA").getChild("jointH").getChild("b").getChild("JD_2").getChild("jointm3");
        this.jointb1 = root.getChild("mainbody").getChild("body").getChild("jointb1");
        this.jointm8 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("bodyS_3").getChild("jointb8").getChild("body_4").getChild("jointb9").getChild("bodyS_4").getChild("jointb10").getChild("bodyA").getChild("jointH").getChild("b_1").getChild("JD_7").getChild("jointm8");
        this.jointb7a_2 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("jointb7a").getChild("jd").getChild("body_30").getChild("jointb7a_1").getChild("body_31").getChild("jointb7a_2");
        this.jointb7ar_2 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("jointb7ar").getChild("jd_1").getChild("body_36").getChild("jointb7ar_1").getChild("body_37").getChild("jointb7ar_2");
        this.jointb7ar = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("jointb7ar");
        this.mainbody = root.getChild("mainbody");
        this.jointb4a_2 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("jointb4a").getChild("jd_2").getChild("body_42").getChild("jointb4a_1").getChild("body_43").getChild("jointb4a_2");
        this.jointm1 = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("bodyS_3").getChild("jointb8").getChild("body_4").getChild("jointb9").getChild("bodyS_4").getChild("jointb10").getChild("bodyA").getChild("jointH").getChild("b").getChild("JD").getChild("jointm1");
        this.jointb7a = root.getChild("mainbody").getChild("body").getChild("jointb1").getChild("bodyS").getChild("jointb2").getChild("body_1").getChild("jointb3").getChild("bodyS_1").getChild("jointb4").getChild("body_2").getChild("jointb5").getChild("bodyS_2").getChild("jointb6").getChild("body_3").getChild("jointb7").getChild("jointb7a");
        this.mainbodyBaseX = 0.0f;
        this.mainbodyBaseY = 23.0f;
        this.mainbodyBaseZ = 0.0f;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 23.0f, 0.0f));
                PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5f, -2.5f, -5.5f, 11, 5, 11), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition dec = body.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(44, 0).addBox(-5.5f, -2.0f, -5.5f, 11, 4, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
                PartDefinition jointb1 = body.addOrReplaceChild("jointb1", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -3.5f, 0.0f));
                PartDefinition bodyS = jointb1.addOrReplaceChild("bodyS", CubeListBuilder.create().texOffs(88, 0).addBox(-4.5f, -3.0f, -4.5f, 9, 5, 9), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, -0.17453292f, 0.0f, 0.0f));
                PartDefinition jointb2 = bodyS.addOrReplaceChild("jointb2", CubeListBuilder.create().texOffs(37, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -1.0f, 0.0f));
                PartDefinition body_1 = jointb2.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(124, 0).addBox(-5.5f, -3.0f, -5.5f, 11, 4, 11), PartPose.offset(0.0f, -1.5f, 0.0f));
                PartDefinition dec_1 = body_1.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(168, 0).addBox(-5.5f, -1.5f, -5.5f, 11, 3, 11), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
                PartDefinition jointb3 = body_1.addOrReplaceChild("jointb3", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -3.5f, 0.0f));
                PartDefinition bodyS_1 = jointb3.addOrReplaceChild("bodyS_1", CubeListBuilder.create().texOffs(212, 0).addBox(-4.5f, -3.0f, -4.5f, 9, 5, 9), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, -0.13962634f, 0.0f, 0.0f));
                PartDefinition jointb4 = bodyS_1.addOrReplaceChild("jointb4", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -1.0f, 0.0f));
                PartDefinition body_2 = jointb4.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(77, 14).addBox(-5.5f, -3.0f, -5.5f, 11, 4, 11), PartPose.offset(0.0f, -1.5f, 0.0f));
                PartDefinition dec_2 = body_2.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(157, 14).addBox(-5.5f, -1.5f, -5.5f, 11, 3, 11), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
                PartDefinition jointb5 = body_2.addOrReplaceChild("jointb5", CubeListBuilder.create().texOffs(81, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -3.5f, 0.0f));
                PartDefinition bodyS_2 = jointb5.addOrReplaceChild("bodyS_2", CubeListBuilder.create().texOffs(201, 14).addBox(-4.5f, -3.0f, -4.5f, 9, 5, 9), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.10471976f, 0.0f, 0.0f));
                PartDefinition jointb6 = bodyS_2.addOrReplaceChild("jointb6", CubeListBuilder.create().texOffs(85, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -1.0f, 0.0f));
                PartDefinition body_3 = jointb6.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(33, 15).addBox(-5.5f, -3.0f, -5.5f, 11, 4, 11), PartPose.offset(0.0f, -1.5f, 0.0f));
                PartDefinition dec_3 = body_3.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(121, 17).addBox(-5.5f, -1.5f, -5.5f, 11, 3, 11), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
                PartDefinition jointb7 = body_3.addOrReplaceChild("jointb7", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -3.5f, 0.0f));
                PartDefinition bodyS_3 = jointb7.addOrReplaceChild("bodyS_3", CubeListBuilder.create().texOffs(0, 21).addBox(-4.5f, -3.0f, -4.5f, 9, 5, 9), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.12217305f, 0.0f, 0.0f));
                PartDefinition jointb8 = bodyS_3.addOrReplaceChild("jointb8", CubeListBuilder.create().texOffs(119, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -1.0f, 0.0f));
                PartDefinition body_4 = jointb8.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(154, 28).addBox(-5.5f, -3.0f, -5.5f, 11, 4, 11), PartPose.offset(0.0f, -1.5f, 0.0f));
                PartDefinition dec_4 = body_4.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(198, 28).addBox(-5.5f, -1.5f, -5.5f, 11, 3, 11), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
                PartDefinition jointb9 = body_4.addOrReplaceChild("jointb9", CubeListBuilder.create().texOffs(123, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -3.5f, 0.0f));
                PartDefinition bodyS_4 = jointb9.addOrReplaceChild("bodyS_4", CubeListBuilder.create().texOffs(68, 29).addBox(-4.5f, -3.0f, -4.5f, 9, 5, 9), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.13962634f, 0.0f, 0.0f));
                PartDefinition jointb10 = bodyS_4.addOrReplaceChild("jointb10", CubeListBuilder.create().texOffs(127, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -1.0f, 0.0f));
                PartDefinition bodyA = jointb10.addOrReplaceChild("bodyA", CubeListBuilder.create().texOffs(104, 31).addBox(-5.5f, -3.0f, -5.5f, 11, 4, 11), PartPose.offset(0.0f, -1.5f, 0.0f));
                PartDefinition jointH = bodyA.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(131, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -11.0f, 0.0f));
                PartDefinition b = jointH.addOrReplaceChild("b", CubeListBuilder.create().texOffs(31, 30).addBox(-2.5f, -3.5f, -2.5f, 5, 7, 5), PartPose.offsetAndRotation(-6.5f, 0.0f, 1.0f, 0.0f, 0.31415927f, 1.5707964f));
                PartDefinition bodyH = b.addOrReplaceChild("bodyH", CubeListBuilder.create().texOffs(14, 42).addBox(-4.0f, -6.0f, -4.0f, 8, 5, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7225663f, 0.0f, 0.0f));
                PartDefinition JD = b.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(167, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-4.0f, -2.0f, 0.0f, 0.0f, 0.0f, 1.0471976f));
                PartDefinition jointm1 = JD.addOrReplaceChild("jointm1", CubeListBuilder.create().texOffs(209, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_6 = jointm1.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(190, 42).addBox(-2.5f, -1.5f, -2.0f, 5, 3, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.7627826f, 0.0f, 0.0f));
                PartDefinition jointm1_1 = body_6.addOrReplaceChild("jointm1_1", CubeListBuilder.create().texOffs(213, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
                PartDefinition body_7 = jointm1_1.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(239, 0).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
                PartDefinition body_8 = body_7.addOrReplaceChild("body_8", CubeListBuilder.create().texOffs(110, 14).addBox(-1.0f, -1.0f, -1.0f, 1, 3, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 4.5f, -0.80285144f, 0.0f, 0.0f));
                PartDefinition JD_1 = b.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(171, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-4.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.55850536f));
                PartDefinition jointm2 = JD_1.addOrReplaceChild("jointm2", CubeListBuilder.create().texOffs(217, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_9 = jointm2.addOrReplaceChild("body_9", CubeListBuilder.create().texOffs(66, 15).addBox(-1.5f, -1.0f, -2.0f, 3, 2, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.5481808f, 0.0f, 0.0f));
                PartDefinition jointm2_1 = body_9.addOrReplaceChild("jointm2_1", CubeListBuilder.create().texOffs(239, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
                PartDefinition body_10 = jointm2_1.addOrReplaceChild("body_10", CubeListBuilder.create().texOffs(33, 2).addBox(0.0f, -1.0f, -1.0f, 1, 3, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
                PartDefinition JD_2 = b.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(175, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(4.0f, 0.0f, -6.0f, 0.0f, 0.0f, -0.55850536f));
                PartDefinition jointm3 = JD_2.addOrReplaceChild("jointm3", CubeListBuilder.create().texOffs(249, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_11 = jointm3.addOrReplaceChild("body_11", CubeListBuilder.create().texOffs(187, 28).addBox(-1.5f, -1.0f, -2.0f, 3, 2, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.5481808f, 0.0f, 0.0f));
                PartDefinition jointm3_1 = body_11.addOrReplaceChild("jointm3_1", CubeListBuilder.create().texOffs(7, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
                PartDefinition body_12 = jointm3_1.addOrReplaceChild("body_12", CubeListBuilder.create().texOffs(161, 2).addBox(0.0f, -1.0f, -1.0f, 1, 3, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
                PartDefinition JD_3 = b.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(201, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -6.0f));
                PartDefinition jointm4 = JD_3.addOrReplaceChild("jointm4", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_13 = jointm4.addOrReplaceChild("body_13", CubeListBuilder.create().texOffs(77, 2).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.5481808f, 0.0f, 0.0f));
                PartDefinition jointm4_1 = body_13.addOrReplaceChild("jointm4_1", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 4.0f));
                PartDefinition body_14 = jointm4_1.addOrReplaceChild("body_14", CubeListBuilder.create().texOffs(115, 2).addBox(0.0f, -1.0f, -1.0f, 1, 2, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
                PartDefinition JD_4 = b.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(205, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(4.0f, -2.0f, 0.0f, 0.0f, 0.0f, -1.0471976f));
                PartDefinition jointm5 = JD_4.addOrReplaceChild("jointm5", CubeListBuilder.create().texOffs(33, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_15 = jointm5.addOrReplaceChild("body_15", CubeListBuilder.create().texOffs(216, 42).addBox(-2.5f, -1.5f, -2.0f, 5, 3, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.0769417f, 0.0f, 0.0f));
                PartDefinition jointm5_1 = body_15.addOrReplaceChild("jointm5_1", CubeListBuilder.create().texOffs(41, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
                PartDefinition body_16 = jointm5_1.addOrReplaceChild("body_16", CubeListBuilder.create().texOffs(190, 14).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.55850536f, 0.0f, 0.0f));
                PartDefinition body_17 = body_16.addOrReplaceChild("body_17", CubeListBuilder.create().texOffs(234, 36).addBox(0.0f, -1.0f, -1.0f, 1, 3, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 4.5f, -0.80285144f, 0.0f, 0.0f));
                PartDefinition b_1 = jointH.addOrReplaceChild("b_1", CubeListBuilder.create().texOffs(0, 35).addBox(-2.5f, -3.5f, -2.5f, 5, 7, 5), PartPose.offsetAndRotation(6.5f, 0.0f, 1.0f, 0.0f, -0.31415927f, -1.5707964f));
                PartDefinition bodyH_1 = b_1.addOrReplaceChild("bodyH_1", CubeListBuilder.create().texOffs(73, 43).addBox(-4.0f, -6.0f, -4.0f, 8, 5, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7225663f, 0.0f, 0.0f));
                PartDefinition JD_5 = b_1.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(45, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-4.0f, -2.0f, 0.0f, 0.0f, 0.0f, 1.0471976f));
                PartDefinition jointm6 = JD_5.addOrReplaceChild("jointm6", CubeListBuilder.create().texOffs(115, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_18 = jointm6.addOrReplaceChild("body_18", CubeListBuilder.create().texOffs(140, 43).addBox(-2.5f, -1.5f, -2.0f, 5, 3, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.0769417f, 0.0f, 0.0f));
                PartDefinition jointm6_1 = body_18.addOrReplaceChild("jointm6_1", CubeListBuilder.create().texOffs(122, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
                PartDefinition body_19 = jointm6_1.addOrReplaceChild("body_19", CubeListBuilder.create().texOffs(228, 14).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.55850536f, 0.0f, 0.0f));
                PartDefinition body_20 = body_19.addOrReplaceChild("body_20", CubeListBuilder.create().texOffs(166, 43).addBox(-1.0f, -1.0f, -1.0f, 1, 3, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 4.5f, -0.80285144f, 0.0f, 0.0f));
                PartDefinition JD_6 = b_1.addOrReplaceChild("JD_6", CubeListBuilder.create().texOffs(49, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-4.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.55850536f));
                PartDefinition jointm7 = JD_6.addOrReplaceChild("jointm7", CubeListBuilder.create().texOffs(126, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_21 = jointm7.addOrReplaceChild("body_21", CubeListBuilder.create().texOffs(93, 46).addBox(-1.5f, -1.0f, -2.0f, 3, 2, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.5481808f, 0.0f, 0.0f));
                PartDefinition jointm7_1 = body_21.addOrReplaceChild("jointm7_1", CubeListBuilder.create().texOffs(130, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
                PartDefinition body_22 = jointm7_1.addOrReplaceChild("body_22", CubeListBuilder.create().texOffs(154, 15).addBox(-1.0f, -1.0f, -1.0f, 1, 3, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
                PartDefinition JD_7 = b_1.addOrReplaceChild("JD_7", CubeListBuilder.create().texOffs(77, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(4.0f, 0.0f, -6.0f, 0.0f, 0.0f, -0.55850536f));
                PartDefinition jointm8 = JD_7.addOrReplaceChild("jointm8", CubeListBuilder.create().texOffs(169, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_23 = jointm8.addOrReplaceChild("body_23", CubeListBuilder.create().texOffs(115, 46).addBox(-1.5f, -1.0f, -2.0f, 3, 2, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.5481808f, 0.0f, 0.0f));
                PartDefinition jointm8_1 = body_23.addOrReplaceChild("jointm8_1", CubeListBuilder.create().texOffs(173, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
                PartDefinition body_24 = jointm8_1.addOrReplaceChild("body_24", CubeListBuilder.create().texOffs(27, 16).addBox(-1.0f, -1.0f, -1.0f, 1, 3, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
                PartDefinition JD_8 = b_1.addOrReplaceChild("JD_8", CubeListBuilder.create().texOffs(86, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -6.0f));
                PartDefinition jointm9 = JD_8.addOrReplaceChild("jointm9", CubeListBuilder.create().texOffs(201, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_25 = jointm9.addOrReplaceChild("body_25", CubeListBuilder.create().texOffs(201, 2).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.5481808f, 0.0f, 0.0f));
                PartDefinition jointm9_1 = body_25.addOrReplaceChild("jointm9_1", CubeListBuilder.create().texOffs(210, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 4.0f));
                PartDefinition body_26 = jointm9_1.addOrReplaceChild("body_26", CubeListBuilder.create().texOffs(243, 9).addBox(-1.0f, -1.0f, -1.0f, 1, 2, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
                PartDefinition JD_9 = b_1.addOrReplaceChild("JD_9", CubeListBuilder.create().texOffs(90, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(4.0f, -2.0f, 0.0f, 0.0f, 0.0f, -1.0471976f));
                PartDefinition jointm0 = JD_9.addOrReplaceChild("jointm0", CubeListBuilder.create().texOffs(214, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_27 = jointm0.addOrReplaceChild("body_27", CubeListBuilder.create().texOffs(34, 51).addBox(-2.5f, -1.5f, -2.0f, 5, 3, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.7627826f, 0.0f, 0.0f));
                PartDefinition jointm0_1 = body_27.addOrReplaceChild("jointm0_1", CubeListBuilder.create().texOffs(239, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
                PartDefinition body_28 = jointm0_1.addOrReplaceChild("body_28", CubeListBuilder.create().texOffs(95, 29).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
                PartDefinition body_29 = body_28.addOrReplaceChild("body_29", CubeListBuilder.create().texOffs(0, 47).addBox(0.0f, -1.0f, -1.0f, 1, 3, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 4.5f, -0.80285144f, 0.0f, 0.0f));
                PartDefinition b_2 = jointH.addOrReplaceChild("b_2", CubeListBuilder.create().texOffs(43, 35).addBox(-3.5f, -2.0f, 0.0f, 7, 8, 8), PartPose.offsetAndRotation(0.0f, -1.0f, -2.0f, 0.56548667f, 0.0f, 0.0f));
                PartDefinition b_3 = jointH.addOrReplaceChild("b_3", CubeListBuilder.create().texOffs(157, 0).addBox(-2.0f, -2.0f, 0.0f, 4, 6, 1), PartPose.offsetAndRotation(0.0f, 0.0f, -3.0f, -0.31415927f, 0.0f, 0.0f));
                PartDefinition body_5 = bodyA.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(231, 22).addBox(-3.0f, -5.0f, -3.0f, 6, 8, 6), PartPose.offset(0.0f, -3.0f, 0.0f));
                PartDefinition jointb7a = jointb7.addOrReplaceChild("jointb7a", CubeListBuilder.create().texOffs(93, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, -3.0f, 4.0f));
                PartDefinition jd = jointb7a.addOrReplaceChild("jd", CubeListBuilder.create().texOffs(249, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.9948377f, 0.0f));
                PartDefinition body_30 = jd.addOrReplaceChild("body_30", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5f, -1.0f, -1.5f, 10, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.25132743f, -0.62831855f));
                PartDefinition jointb7a_1 = body_30.addOrReplaceChild("jointb7a_1", CubeListBuilder.create().texOffs(7, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 0.0f, 0.0f));
                PartDefinition body_31 = jointb7a_1.addOrReplaceChild("body_31", CubeListBuilder.create().texOffs(184, 53).addBox(-1.0f, -0.5f, -1.0f, 20, 1, 2), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 0.0f, 0.31415927f, -0.87964594f));
                PartDefinition jointb7a_2 = body_31.addOrReplaceChild("jointb7a_2", CubeListBuilder.create().texOffs(93, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(19.0f, 0.0f, 0.0f));
                PartDefinition body_32 = jointb7a_2.addOrReplaceChild("body_32", CubeListBuilder.create().texOffs(52, 54).addBox(-1.0f, -0.5f, -1.0f, 15, 1, 2), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, -0.06283186f, 1.3194689f, 0.0f));
                PartDefinition jointb7a_3 = body_32.addOrReplaceChild("jointb7a_3", CubeListBuilder.create().texOffs(217, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 0.0f, 0.0f));
                PartDefinition body_33 = jointb7a_3.addOrReplaceChild("body_33", CubeListBuilder.create().texOffs(135, 55).addBox(-1.0f, -0.5f, -1.0f, 15, 1, 2), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 0.0f, 1.3194689f, 0.0f));
                PartDefinition jointb7a_4 = body_33.addOrReplaceChild("jointb7a_4", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 0.0f, 0.0f));
                PartDefinition body_34 = jointb7a_4.addOrReplaceChild("body_34", CubeListBuilder.create().texOffs(83, 56).addBox(0.0f, -1.0f, -1.5f, 13, 2, 3), PartPose.offsetAndRotation(-0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.81681406f));
                PartDefinition body_35 = body_34.addOrReplaceChild("body_35", CubeListBuilder.create().texOffs(169, 56).addBox(-2.0f, -1.5f, 0.5f, 17, 7, 1), PartPose.offset(3.0f, 0.5f, -0.5f));
                PartDefinition jointb7ar = jointb7.addOrReplaceChild("jointb7ar", CubeListBuilder.create().texOffs(115, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.0f, -3.0f, 4.0f));
                PartDefinition jd_1 = jointb7ar.addOrReplaceChild("jd_1", CubeListBuilder.create().texOffs(4, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.146755f, 0.0f));
                PartDefinition body_36 = jd_1.addOrReplaceChild("body_36", CubeListBuilder.create().texOffs(46, 30).addBox(-0.5f, -1.0f, -1.5f, 10, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.25132743f, -0.62831855f));
                PartDefinition jointb7ar_1 = body_36.addOrReplaceChild("jointb7ar_1", CubeListBuilder.create().texOffs(33, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 0.0f, 0.0f));
                PartDefinition body_37 = jointb7ar_1.addOrReplaceChild("body_37", CubeListBuilder.create().texOffs(205, 56).addBox(-1.0f, -0.5f, -1.0f, 20, 1, 2), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 0.0f, -0.31415927f, -0.87964594f));
                PartDefinition jointb7ar_2 = body_37.addOrReplaceChild("jointb7ar_2", CubeListBuilder.create().texOffs(41, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(19.0f, 0.0f, 0.0f));
                PartDefinition body_38 = jointb7ar_2.addOrReplaceChild("body_38", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0f, -0.5f, -1.0f, 15, 1, 2), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, -0.06283186f, -1.3194689f, 0.0f));
                PartDefinition jointb7ar_3 = body_38.addOrReplaceChild("jointb7ar_3", CubeListBuilder.create().texOffs(45, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 0.0f, 0.0f));
                PartDefinition body_39 = jointb7ar_3.addOrReplaceChild("body_39", CubeListBuilder.create().texOffs(115, 58).addBox(-1.0f, -0.5f, -1.0f, 15, 1, 2), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 0.0f, -1.3194689f, 0.0f));
                PartDefinition jointb7ar_4 = body_39.addOrReplaceChild("jointb7ar_4", CubeListBuilder.create().texOffs(49, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 0.0f, 0.0f));
                PartDefinition body_40 = jointb7ar_4.addOrReplaceChild("body_40", CubeListBuilder.create().texOffs(205, 59).addBox(0.0f, -1.0f, -1.5f, 13, 2, 3), PartPose.offsetAndRotation(-0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.81681406f));
                PartDefinition body_41 = body_40.addOrReplaceChild("body_41", CubeListBuilder.create().texOffs(59, 61).addBox(-2.0f, -1.5f, -0.5f, 17, 7, 1), PartPose.offset(3.0f, 0.5f, -0.5f));
                PartDefinition jointb4a = jointb4.addOrReplaceChild("jointb4a", CubeListBuilder.create().texOffs(49, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, -2.0f, 5.0f));
                PartDefinition jd_2 = jointb4a.addOrReplaceChild("jd_2", CubeListBuilder.create().texOffs(77, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.9948377f, 0.0f));
                PartDefinition body_42 = jd_2.addOrReplaceChild("body_42", CubeListBuilder.create().texOffs(137, 31).addBox(-0.5f, -1.0f, -1.5f, 10, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.31415927f));
                PartDefinition jointb4a_1 = body_42.addOrReplaceChild("jointb4a_1", CubeListBuilder.create().texOffs(86, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 0.0f, 0.0f));
                PartDefinition body_43 = jointb4a_1.addOrReplaceChild("body_43", CubeListBuilder.create().texOffs(137, 36).addBox(-1.0f, -0.5f, -1.0f, 10, 1, 2), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 0.0f, 0.50265485f, -0.9424778f));
                PartDefinition jointb4a_2 = body_43.addOrReplaceChild("jointb4a_2", CubeListBuilder.create().texOffs(90, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 0.0f, 0.0f));
                PartDefinition b_4 = jointb4a_2.addOrReplaceChild("b_4", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0f, -0.5f, -1.0f, 15, 1, 2), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, -0.69115037f, 1.3194689f, 0.0f));
                PartDefinition jointb4a_3 = b_4.addOrReplaceChild("jointb4a_3", CubeListBuilder.create().texOffs(115, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 0.0f, 0.0f));
                PartDefinition body_44 = jointb4a_3.addOrReplaceChild("body_44", CubeListBuilder.create().texOffs(95, 61).addBox(-1.0f, -0.5f, -1.0f, 15, 1, 2), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 0.0f, 1.3194689f, 0.0f));
                PartDefinition jointb4a_4 = body_44.addOrReplaceChild("jointb4a_4", CubeListBuilder.create().texOffs(122, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 0.0f, 0.0f));
                PartDefinition body_45 = jointb4a_4.addOrReplaceChild("body_45", CubeListBuilder.create().texOffs(126, 61).addBox(0.0f, -1.0f, -1.5f, 13, 2, 3), PartPose.offsetAndRotation(-0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.81681406f));
                PartDefinition body_46 = body_45.addOrReplaceChild("body_46", CubeListBuilder.create().texOffs(0, 64).addBox(-2.0f, -1.5f, 0.5f, 17, 7, 1), PartPose.offset(3.0f, 0.5f, -0.5f));
                PartDefinition jointb4ar = jointb4.addOrReplaceChild("jointb4ar", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.0f, -2.0f, 5.0f));
                PartDefinition jd_3 = jointb4ar.addOrReplaceChild("jd_3", CubeListBuilder.create().texOffs(126, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.146755f, 0.0f));
                PartDefinition body_47 = jd_3.addOrReplaceChild("body_47", CubeListBuilder.create().texOffs(95, 64).addBox(-0.5f, -1.0f, -1.5f, 10, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.31415927f));
                PartDefinition jointb4ar_1 = body_47.addOrReplaceChild("jointb4ar_1", CubeListBuilder.create().texOffs(130, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 0.0f, 0.0f));
                PartDefinition body_48 = jointb4ar_1.addOrReplaceChild("body_48", CubeListBuilder.create().texOffs(18, 53).addBox(-1.0f, -0.5f, -1.0f, 10, 1, 2), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 0.0f, -0.50265485f, -0.9424778f));
                PartDefinition jointb4ar_2 = body_48.addOrReplaceChild("jointb4ar_2", CubeListBuilder.create().texOffs(169, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 0.0f, 0.0f));
                PartDefinition b_5 = jointb4ar_2.addOrReplaceChild("b_5", CubeListBuilder.create().texOffs(156, 64).addBox(-1.0f, -0.5f, -1.0f, 15, 1, 2), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 0.69115037f, -1.3194689f, 0.0f));
                PartDefinition jointb4ar_3 = b_5.addOrReplaceChild("jointb4ar_3", CubeListBuilder.create().texOffs(173, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 0.0f, 0.0f));
                PartDefinition body_49 = jointb4ar_3.addOrReplaceChild("body_49", CubeListBuilder.create().texOffs(190, 64).addBox(-1.0f, -0.5f, -1.0f, 15, 1, 2), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 0.0f, -1.3194689f, 0.0f));
                PartDefinition jointb4ar_4 = body_49.addOrReplaceChild("jointb4ar_4", CubeListBuilder.create().texOffs(201, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 0.0f, 0.0f));
                PartDefinition body_50 = jointb4ar_4.addOrReplaceChild("body_50", CubeListBuilder.create().texOffs(221, 64).addBox(0.0f, -1.0f, -1.5f, 13, 2, 3), PartPose.offsetAndRotation(-0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.81681406f));
                PartDefinition body_51 = body_50.addOrReplaceChild("body_51", CubeListBuilder.create().texOffs(121, 66).addBox(-2.0f, -1.5f, -0.5f, 17, 7, 1), PartPose.offset(3.0f, 0.5f, -0.5f));
                PartDefinition jointb1s = mainbody.addOrReplaceChild("jointb1s", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.5f, 0.0f));
                PartDefinition bodyS_5 = jointb1s.addOrReplaceChild("bodyS_5", CubeListBuilder.create().texOffs(27, 63).addBox(-4.5f, -3.0f, -4.5f, 9, 5, 9), PartPose.offset(0.0f, 0.5f, 0.0f));
                PartDefinition jointb2s = bodyS_5.addOrReplaceChild("jointb2s", CubeListBuilder.create().texOffs(210, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -1.0f, 0.0f));
                PartDefinition body_52 = jointb2s.addOrReplaceChild("body_52", CubeListBuilder.create().texOffs(146, 67).addBox(-5.5f, -3.0f, -5.5f, 11, 5, 11), PartPose.offset(0.0f, -1.5f, 0.0f));
                PartDefinition dec_5 = body_52.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(52, 69).addBox(-5.5f, -1.5f, -5.5f, 11, 3, 11), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
                PartDefinition jointb3s = body_52.addOrReplaceChild("jointb3s", CubeListBuilder.create().texOffs(214, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -3.5f, 0.0f));
                PartDefinition bodyS_6 = jointb3s.addOrReplaceChild("bodyS_6", CubeListBuilder.create().texOffs(190, 67).addBox(-4.5f, -3.0f, -4.5f, 9, 5, 9), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, -0.13962634f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 256, 128);
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
        EntityWymo parasite = (EntityWymo)entity;
        float ft6 = parasite.getBurrowTimer();
        boolean g6 = parasite.getBurrowed();
        boolean open = parasite.getOpen();
        this.mainbody.visible = !((double)ft6 >= 4.8 && !g6);
        if (!open) {
            if (!parasite.getStillAni()) {
                // empty if block
            }
            f1 = Mth.sin((float)(ageInTicks * 0.51597f)) * 0.05f;
            float f2 = Mth.sin((float)(ageInTicks * 0.54148f)) * 0.07f;
            float f3 = Mth.sin((float)(ageInTicks * 0.5621675f)) * 0.06f;
            float f4 = Mth.sin((float)(ageInTicks * 0.51864f)) * 0.05f;
            float f5 = Mth.sin((float)(ageInTicks * 0.55311f)) * 0.1f;
            float f6 = Mth.sin((float)(ageInTicks * 0.59197f)) * 0.15f;
            float f7 = Mth.sin((float)(ageInTicks * 0.5317185f)) * 0.133f;
            float f8 = Mth.sin((float)(ageInTicks * 0.5252119f)) * 0.125f;
            float f9 = Mth.sin((float)(ageInTicks * 0.08f)) * 0.12f;
            this.jointb1.xRot = f1;
            this.jointb2.zRot = f1;
            this.jointb3.xRot = f2;
            this.jointb4.zRot = f3;
            this.jointb5.xRot = f4;
            this.jointb6.zRot = f3;
            this.jointb7.zRot = f1;
            this.jointb8.xRot = f2;
            this.jointb9.zRot = f3;
            f1 = Mth.sin((float)(ageInTicks * 0.87217f)) * 0.415f;
            f2 = Mth.sin((float)(ageInTicks * 0.7216f)) * 0.417f;
            f3 = Mth.sin((float)(ageInTicks * 0.972315f)) * 0.316f;
            f4 = Mth.sin((float)(ageInTicks * 0.872214f)) * 0.415f;
            f5 = Mth.sin((float)(ageInTicks * 0.7211f)) * 0.1f;
            f6 = Mth.sin((float)(ageInTicks * 0.9717f)) * 0.15f;
            f7 = Mth.sin((float)(ageInTicks * 0.8715f)) * 0.133f;
            f8 = Mth.sin((float)(ageInTicks * 0.7919f)) * 0.125f;
            this.jointb7a.zRot = f1;
            this.jointb7a_1.yRot = 0.0f;
            this.jointb7a_2.yRot = f2;
            this.jointb7a_3.yRot = f3;
            this.jointb7a_4.zRot = 0.0f;
            this.jointb7ar.zRot = f1;
            this.jointb7ar_1.yRot = 0.0f;
            this.jointb7ar_2.yRot = f2;
            this.jointb7ar_3.yRot = f3;
            this.jointb7ar_4.zRot = 0.0f;
            this.jointb4a.zRot = f3;
            this.jointb4a_1.yRot = 0.0f;
            this.jointb4a_2.xRot = f1;
            this.jointb4a_3.xRot = f2;
            this.jointb4a_4.zRot = 0.0f;
            this.jointb4ar.zRot = f3;
            this.jointb4ar_1.yRot = 0.0f;
            this.jointb4ar_2.xRot = f1;
            this.jointb4ar_3.xRot = f2;
            this.jointb4ar_4.zRot = 0.0f;
            f1 = Mth.sin((float)(ageInTicks * 0.87217f)) * 0.15f;
            f2 = Mth.sin((float)(ageInTicks * 0.7216f)) * 0.17f;
            f3 = Mth.sin((float)(ageInTicks * 0.972315f)) * 0.16f;
            f4 = Mth.sin((float)(ageInTicks * 0.872214f)) * 0.15f;
            this.jointm0.xRot = -0.7f + f1;
            this.jointm1.xRot = -0.7f + f2;
            this.jointm2.xRot = -0.7f + f2;
            this.jointm3.xRot = -0.7f + f3;
            this.jointm4.xRot = -0.7f + f4;
            this.jointm5.xRot = -0.7f + f2;
            this.jointm6.xRot = -0.7f + f3;
            this.jointm7.xRot = -0.7f + f1;
            this.jointm8.xRot = -0.7f + f2;
            this.jointm9.xRot = -0.7f + f4;
        } else {
            if (!parasite.getStillAni()) {
                // empty if block
            }
            f1 = Mth.sin((float)(ageInTicks * 0.1597f)) * 0.05f;
            float f2 = Mth.sin((float)(ageInTicks * 0.148f)) * 0.07f;
            float f3 = Mth.sin((float)(ageInTicks * 0.1675f)) * 0.06f;
            float f4 = Mth.sin((float)(ageInTicks * 0.1864f)) * 0.05f;
            float f5 = Mth.sin((float)(ageInTicks * 0.1311f)) * 0.1f;
            float f6 = Mth.sin((float)(ageInTicks * 0.197f)) * 0.15f;
            float f7 = Mth.sin((float)(ageInTicks * 0.185f)) * 0.133f;
            float f8 = Mth.sin((float)(ageInTicks * 0.2119f)) * 0.125f;
            float f9 = Mth.sin((float)(ageInTicks * 0.08f)) * 0.12f;
            this.jointb1.xRot = f1;
            this.jointb2.zRot = f1;
            this.jointb3.xRot = f2;
            this.jointb4.zRot = f3;
            this.jointb5.xRot = f4;
            this.jointb6.zRot = f3;
            this.jointb7.zRot = f1;
            this.jointb8.xRot = f2;
            this.jointb9.zRot = f3;
            f1 = Mth.sin((float)(ageInTicks * 0.187217f)) * 0.15f;
            f2 = Mth.sin((float)(ageInTicks * 0.27216f)) * 0.17f;
            f3 = Mth.sin((float)(ageInTicks * 0.1972315f)) * 0.16f;
            f4 = Mth.sin((float)(ageInTicks * 0.2872214f)) * 0.15f;
            f5 = Mth.sin((float)(ageInTicks * 0.27211f)) * 0.1f;
            f6 = Mth.sin((float)(ageInTicks * 0.19717f)) * 0.15f;
            f7 = Mth.sin((float)(ageInTicks * 0.28715f)) * 0.133f;
            f8 = Mth.sin((float)(ageInTicks * 0.17919f)) * 0.125f;
            this.jointb7a.zRot = f1;
            this.jointb7a_1.yRot = 0.0f;
            this.jointb7a_2.yRot = f2;
            this.jointb7a_3.yRot = f3;
            this.jointb7a_4.zRot = 0.0f;
            this.jointb7ar.zRot = f1;
            this.jointb7ar_1.yRot = 0.0f;
            this.jointb7ar_2.yRot = f2;
            this.jointb7ar_3.yRot = f3;
            this.jointb7ar_4.zRot = 0.0f;
            this.jointb4a.zRot = f3;
            this.jointb4a_1.yRot = 0.0f;
            this.jointb4a_2.xRot = f1;
            this.jointb4a_3.xRot = f2;
            this.jointb4a_4.zRot = 0.0f;
            this.jointb4ar.zRot = f3;
            this.jointb4ar_1.yRot = 0.0f;
            this.jointb4ar_2.xRot = f1;
            this.jointb4ar_3.xRot = f2;
            this.jointb4ar_4.zRot = 0.0f;
            f1 = Mth.sin((float)(ageInTicks * 0.287217f)) * 0.2415f;
            f2 = Mth.sin((float)(ageInTicks * 0.37216f)) * 0.2517f;
            f3 = Mth.sin((float)(ageInTicks * 0.2972315f)) * 0.2316f;
            f4 = Mth.sin((float)(ageInTicks * 0.3872214f)) * 0.2215f;
            this.jointm0.xRot = 0.1f + f1;
            this.jointm1.xRot = 0.1f + f2;
            this.jointm2.xRot = 0.1f + f2;
            this.jointm3.xRot = 0.1f + f3;
            this.jointm4.xRot = 0.1f + f4;
            this.jointm5.xRot = 0.1f + f2;
            this.jointm6.xRot = 0.1f + f3;
            this.jointm7.xRot = 0.1f + f1;
            this.jointm8.xRot = 0.1f + f2;
            this.jointm9.xRot = 0.1f + f4;
        }
        float id = parasite.getAttackTimer();
        if (id > 0.0f) {
            // empty if block
        }
    }


    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}