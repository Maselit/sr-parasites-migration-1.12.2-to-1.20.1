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
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelLeem extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "leem"), "main");
    private final ModelPart mainbody;
    private final ModelPart jd;
    private final ModelPart joint;
    private final ModelPart b;
    private final ModelPart b_1;
    private final ModelPart joint_1;
    private final ModelPart b_2;
    private final ModelPart joint_2;
    private final ModelPart bbb;
    private final ModelPart b_3;
    private final ModelPart b_4;
    private final ModelPart b_5;
    private final ModelPart b_6;
    private final ModelPart b_7;
    private final ModelPart jd_1;
    private final ModelPart jd_2;
    private final ModelPart dec;
    private final ModelPart jointD;
    private final ModelPart dec_1;
    private final ModelPart jointD_1;
    private final ModelPart dec_2;
    private final ModelPart jointD_2;
    private final ModelPart dec_3;
    private final ModelPart jointD_3;
    private final ModelPart dec_4;
    private final ModelPart dec_5;
    private final ModelPart jointD_4;
    private final ModelPart dec_6;
    private final ModelPart jointD_5;
    private final ModelPart dec_7;
    private final ModelPart jointD_6;
    private final ModelPart dec_8;
    private final ModelPart jointD_7;
    private final ModelPart dec_9;
    private final ModelPart jd_3;
    private final ModelPart dec_10;
    private final ModelPart jointD_8;
    private final ModelPart dec_11;
    private final ModelPart jointD_9;
    private final ModelPart dec_12;
    private final ModelPart jointD_10;
    private final ModelPart dec_13;
    private final ModelPart jointD_11;
    private final ModelPart dec_14;

    public ModelLeem(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.jd = root.getChild("jd");
        this.joint = root.getChild("joint");
        this.b = root.getChild("mainbody").getChild("b");
        this.b_1 = root.getChild("mainbody").getChild("b_1");
        this.joint_1 = root.getChild("mainbody").getChild("b").getChild("joint_1");
        this.b_2 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2");
        this.joint_2 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2");
        this.bbb = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb");
        this.b_3 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_3");
        this.b_4 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4");
        this.b_5 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_5");
        this.b_6 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_6");
        this.b_7 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_3").getChild("b_7");
        this.jd_1 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_1");
        this.jd_2 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_2");
        this.dec = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_1").getChild("dec");
        this.jointD = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_1").getChild("dec").getChild("jointD");
        this.dec_1 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_1").getChild("dec").getChild("jointD").getChild("dec_1");
        this.jointD_1 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_1").getChild("dec").getChild("jointD").getChild("dec_1").getChild("jointD_1");
        this.dec_2 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_1").getChild("dec").getChild("jointD").getChild("dec_1").getChild("jointD_1").getChild("dec_2");
        this.jointD_2 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_1").getChild("dec").getChild("jointD").getChild("dec_1").getChild("jointD_1").getChild("dec_2").getChild("jointD_2");
        this.dec_3 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_1").getChild("dec").getChild("jointD").getChild("dec_1").getChild("jointD_1").getChild("dec_2").getChild("jointD_2").getChild("dec_3");
        this.jointD_3 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_1").getChild("dec").getChild("jointD").getChild("dec_1").getChild("jointD_1").getChild("dec_2").getChild("jointD_2").getChild("dec_3").getChild("jointD_3");
        this.dec_4 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_1").getChild("dec").getChild("jointD").getChild("dec_1").getChild("jointD_1").getChild("dec_2").getChild("jointD_2").getChild("dec_3").getChild("jointD_3").getChild("dec_4");
        this.dec_5 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_2").getChild("dec_5");
        this.jointD_4 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_2").getChild("dec_5").getChild("jointD_4");
        this.dec_6 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_2").getChild("dec_5").getChild("jointD_4").getChild("dec_6");
        this.jointD_5 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_2").getChild("dec_5").getChild("jointD_4").getChild("dec_6").getChild("jointD_5");
        this.dec_7 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_2").getChild("dec_5").getChild("jointD_4").getChild("dec_6").getChild("jointD_5").getChild("dec_7");
        this.jointD_6 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_2").getChild("dec_5").getChild("jointD_4").getChild("dec_6").getChild("jointD_5").getChild("dec_7").getChild("jointD_6");
        this.dec_8 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_2").getChild("dec_5").getChild("jointD_4").getChild("dec_6").getChild("jointD_5").getChild("dec_7").getChild("jointD_6").getChild("dec_8");
        this.jointD_7 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_2").getChild("dec_5").getChild("jointD_4").getChild("dec_6").getChild("jointD_5").getChild("dec_7").getChild("jointD_6").getChild("dec_8").getChild("jointD_7");
        this.dec_9 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_4").getChild("jd_2").getChild("dec_5").getChild("jointD_4").getChild("dec_6").getChild("jointD_5").getChild("dec_7").getChild("jointD_6").getChild("dec_8").getChild("jointD_7").getChild("dec_9");
        this.jd_3 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_6").getChild("jd_3");
        this.dec_10 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_6").getChild("jd_3").getChild("dec_10");
        this.jointD_8 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_6").getChild("jd_3").getChild("dec_10").getChild("jointD_8");
        this.dec_11 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_6").getChild("jd_3").getChild("dec_10").getChild("jointD_8").getChild("dec_11");
        this.jointD_9 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_6").getChild("jd_3").getChild("dec_10").getChild("jointD_8").getChild("dec_11").getChild("jointD_9");
        this.dec_12 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_6").getChild("jd_3").getChild("dec_10").getChild("jointD_8").getChild("dec_11").getChild("jointD_9").getChild("dec_12");
        this.jointD_10 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_6").getChild("jd_3").getChild("dec_10").getChild("jointD_8").getChild("dec_11").getChild("jointD_9").getChild("dec_12").getChild("jointD_10");
        this.dec_13 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_6").getChild("jd_3").getChild("dec_10").getChild("jointD_8").getChild("dec_11").getChild("jointD_9").getChild("dec_12").getChild("jointD_10").getChild("dec_13");
        this.jointD_11 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_6").getChild("jd_3").getChild("dec_10").getChild("jointD_8").getChild("dec_11").getChild("jointD_9").getChild("dec_12").getChild("jointD_10").getChild("dec_13").getChild("jointD_11");
        this.dec_14 = root.getChild("mainbody").getChild("b").getChild("joint_1").getChild("b_2").getChild("joint_2").getChild("bbb").getChild("b_6").getChild("jd_3").getChild("dec_10").getChild("jointD_8").getChild("dec_11").getChild("jointD_9").getChild("dec_12").getChild("jointD_10").getChild("dec_13").getChild("jointD_11").getChild("dec_14");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 10.0f, 0.0f));
        PartDefinition b = mainbody.addOrReplaceChild("b", CubeListBuilder.create().texOffs(4, 0).addBox(-4.0f, -4.0f, -3.5f, 8, 12, 8), PartPose.offsetAndRotation(0.0f, 9.0f, -1.0f, 0.12566371f, 0.0f, 0.0f));
        PartDefinition joint_1 = b.addOrReplaceChild("joint_1", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.0f, -4.0f, 0.5f));
        PartDefinition b_2 = joint_1.addOrReplaceChild("b_2", CubeListBuilder.create().texOffs(58, 0).addBox(-3.0f, -8.5f, -3.0f, 5, 16, 4), PartPose.offsetAndRotation(-1.0f, -5.5f, 1.0f, -0.18849556f, 0.0f, 0.0f));
        PartDefinition joint_2 = b_2.addOrReplaceChild("joint_2", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -9.0f, -0.1f));
        PartDefinition bbb = joint_2.addOrReplaceChild("bbb", CubeListBuilder.create().texOffs(60, 4).addBox(-8.0f, -2.2f, -8.0f, 17, 6, 16), PartPose.offsetAndRotation(-1.0f, -2.5f, 0.0f, -0.12566371f, 0.0f, 0.0f));
        PartDefinition b_3 = bbb.addOrReplaceChild("b_3", CubeListBuilder.create().texOffs(0, 20).addBox(-19.0f, -11.0f, -19.0f, 16, 18, 17), PartPose.offsetAndRotation(1.8f, -4.5f, 2.0f, 0.0f, 0.0f, 0.06283186f));
        PartDefinition b_7 = b_3.addOrReplaceChild("b_7", CubeListBuilder.create().texOffs(0, 96).addBox(-13.0f, -2.0f, -12.0f, 19, 13, 17), PartPose.offsetAndRotation(-0.2f, -16.2f, 1.0f, 0.06283186f, 0.0f, -0.12566371f));
        PartDefinition b_4 = bbb.addOrReplaceChild("b_4", CubeListBuilder.create().texOffs(47, 36).addBox(-18.0f, -11.0f, -16.0f, 15, 14, 19), PartPose.offsetAndRotation(1.8f, -2.5f, 14.0f, 0.0f, 0.0f, 0.06283186f));
        PartDefinition jd_1 = b_4.addOrReplaceChild("jd_1", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(9.9f, -8.7f, -10.6f, 0.0034906585f, -0.25132743f, 0.0f));
        PartDefinition dec = jd_1.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.38397244f));
        PartDefinition jointD = dec.addOrReplaceChild("jointD", CubeListBuilder.create().texOffs(57, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_1 = jointD.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(86, 0).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.89011794f));
        PartDefinition jointD_1 = dec_1.addOrReplaceChild("jointD_1", CubeListBuilder.create().texOffs(98, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_2 = jointD_1.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(102, 0).addBox(0.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.57595867f));
        PartDefinition jointD_2 = dec_2.addOrReplaceChild("jointD_2", CubeListBuilder.create().texOffs(116, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(5.5f, 0.0f, 0.0f));
        PartDefinition dec_3 = jointD_2.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(0, 2).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.62831855f));
        PartDefinition jointD_3 = dec_3.addOrReplaceChild("jointD_3", CubeListBuilder.create().texOffs(120, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_4 = jointD_3.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(72, 2).addBox(0.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4712389f));
        PartDefinition jd_2 = b_4.addOrReplaceChild("jd_2", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-17.7f, -8.7f, -3.8f, 0.0034906585f, -2.7646015f, 0.0f));
        PartDefinition dec_5 = jd_2.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(86, 2).addBox(-1.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.38397244f));
        PartDefinition jointD_4 = dec_5.addOrReplaceChild("jointD_4", CubeListBuilder.create().texOffs(123, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_6 = jointD_4.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(28, 2).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.89011794f));
        PartDefinition jointD_5 = dec_6.addOrReplaceChild("jointD_5", CubeListBuilder.create().texOffs(53, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_7 = jointD_5.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(100, 2).addBox(0.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.57595867f));
        PartDefinition jointD_6 = dec_7.addOrReplaceChild("jointD_6", CubeListBuilder.create().texOffs(57, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(5.5f, 0.0f, 0.0f));
        PartDefinition dec_8 = jointD_6.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(113, 3).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.62831855f));
        PartDefinition jointD_7 = dec_8.addOrReplaceChild("jointD_7", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_9 = jointD_7.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(110, 5).addBox(0.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4712389f));
        PartDefinition b_6 = bbb.addOrReplaceChild("b_6", CubeListBuilder.create().texOffs(40, 69).addBox(-16.0f, -11.0f, -16.0f, 20, 13, 14), PartPose.offsetAndRotation(13.8f, -2.5f, 2.0f, 0.0f, 0.0f, 0.06283186f));
        PartDefinition jd_3 = b_6.addOrReplaceChild("jd_3", CubeListBuilder.create().texOffs(4, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-9.1f, -8.7f, -15.8f, 0.0034906585f, 1.3823007f, 0.0f));
        PartDefinition dec_10 = jd_3.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(110, 7).addBox(-1.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.38397244f));
        PartDefinition jointD_8 = dec_10.addOrReplaceChild("jointD_8", CubeListBuilder.create().texOffs(8, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_11 = jointD_8.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(0, 6).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.89011794f));
        PartDefinition jointD_9 = dec_11.addOrReplaceChild("jointD_9", CubeListBuilder.create().texOffs(28, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_12 = jointD_9.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(110, 9).addBox(0.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.57595867f));
        PartDefinition jointD_10 = dec_12.addOrReplaceChild("jointD_10", CubeListBuilder.create().texOffs(32, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(5.5f, 0.0f, 0.0f));
        PartDefinition dec_13 = jointD_10.addOrReplaceChild("dec_13", CubeListBuilder.create().texOffs(36, 10).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.62831855f));
        PartDefinition jointD_11 = dec_13.addOrReplaceChild("jointD_11", CubeListBuilder.create().texOffs(28, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_14 = jointD_11.addOrReplaceChild("dec_14", CubeListBuilder.create().texOffs(110, 11).addBox(0.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4712389f));
        PartDefinition b_5 = bbb.addOrReplaceChild("b_5", CubeListBuilder.create().texOffs(0, 55).addBox(-16.0f, -11.0f, -16.0f, 13, 12, 14), PartPose.offsetAndRotation(14.8f, -0.5f, 14.0f, 0.0f, 0.0f, 0.06283186f));
        PartDefinition b_1 = mainbody.addOrReplaceChild("b_1", CubeListBuilder.create().texOffs(36, 0).addBox(-2.0f, -2.0f, -1.0f, 6, 5, 5), PartPose.offsetAndRotation(1.3f, 11.5f, 4.0f, -0.87964594f, 0.0f, -0.06283186f));
        PartDefinition jd = root.addOrReplaceChild("jd", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition joint = root.addOrReplaceChild("joint", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    
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
