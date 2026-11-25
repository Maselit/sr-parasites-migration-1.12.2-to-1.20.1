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

public class ModelIki extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "iki"), "main");
    private final ModelPart jointBRA;
    private final ModelPart jointFRA;
    private final ModelPart jointBLA_1;
    private final ModelPart jointBRA_4;
    private final ModelPart jointFLA_3;
    private final ModelPart mainbody;
    private final ModelPart jointFLA;
    private final ModelPart jointFRA_4;
    private final ModelPart jointFRA_2;
    private final ModelPart jointBRA_1;
    private final ModelPart jointBLA_4;
    private final ModelPart jointBLA_2;
    private final ModelPart jointFLA_4;
    private final ModelPart jointBLA;
    private final ModelPart jointFRA_1;
    private final ModelPart jointFRA_3;
    private final ModelPart jointFLA_2;
    private final ModelPart jointBLA_3;
    private final ModelPart jointBRA_2;
    private final ModelPart jointBRA_3;
    private final ModelPart jointFLA_1;
    private final float mainbodyBaseX;
    private final float mainbodyBaseY;
    private final float mainbodyBaseZ;

    public ModelIki(ModelPart root) {
        this.jointBRA = root.getChild("mainbody").getChild("jd_1").getChild("body_3").getChild("jointBRA");
        this.jointFRA = root.getChild("mainbody").getChild("bbb").getChild("jd_3").getChild("body_1").getChild("jointFRA");
        this.jointBLA_1 = root.getChild("mainbody").getChild("jd").getChild("body_2").getChild("jointBLA").getChild("tentacle_10").getChild("jointBLA_1");
        this.jointBRA_4 = root.getChild("mainbody").getChild("jd_1").getChild("body_3").getChild("jointBRA").getChild("tentacle_15").getChild("jointBRA_1").getChild("tentacle_16").getChild("jointBRA_2").getChild("tentacle_17").getChild("jointBRA_3").getChild("tentacle_18").getChild("jointBRA_4");
        this.jointFLA_3 = root.getChild("mainbody").getChild("bbb").getChild("jd_2").getChild("body").getChild("jointFLA").getChild("tentacle").getChild("jointFLA_1").getChild("tentacle_1").getChild("jointFLA_2").getChild("tentacle_2").getChild("jointFLA_3");
        this.mainbody = root.getChild("mainbody");
        this.jointFLA = root.getChild("mainbody").getChild("bbb").getChild("jd_2").getChild("body").getChild("jointFLA");
        this.jointFRA_4 = root.getChild("mainbody").getChild("bbb").getChild("jd_3").getChild("body_1").getChild("jointFRA").getChild("tentacle_5").getChild("jointFRA_1").getChild("tentacle_6").getChild("jointFRA_2").getChild("tentacle_7").getChild("jointFRA_3").getChild("tentacle_8").getChild("jointFRA_4");
        this.jointFRA_2 = root.getChild("mainbody").getChild("bbb").getChild("jd_3").getChild("body_1").getChild("jointFRA").getChild("tentacle_5").getChild("jointFRA_1").getChild("tentacle_6").getChild("jointFRA_2");
        this.jointBRA_1 = root.getChild("mainbody").getChild("jd_1").getChild("body_3").getChild("jointBRA").getChild("tentacle_15").getChild("jointBRA_1");
        this.jointBLA_4 = root.getChild("mainbody").getChild("jd").getChild("body_2").getChild("jointBLA").getChild("tentacle_10").getChild("jointBLA_1").getChild("tentacle_11").getChild("jointBLA_2").getChild("tentacle_12").getChild("jointBLA_3").getChild("tentacle_13").getChild("jointBLA_4");
        this.jointBLA_2 = root.getChild("mainbody").getChild("jd").getChild("body_2").getChild("jointBLA").getChild("tentacle_10").getChild("jointBLA_1").getChild("tentacle_11").getChild("jointBLA_2");
        this.jointFLA_4 = root.getChild("mainbody").getChild("bbb").getChild("jd_2").getChild("body").getChild("jointFLA").getChild("tentacle").getChild("jointFLA_1").getChild("tentacle_1").getChild("jointFLA_2").getChild("tentacle_2").getChild("jointFLA_3").getChild("tentacle_3").getChild("jointFLA_4");
        this.jointBLA = root.getChild("mainbody").getChild("jd").getChild("body_2").getChild("jointBLA");
        this.jointFRA_1 = root.getChild("mainbody").getChild("bbb").getChild("jd_3").getChild("body_1").getChild("jointFRA").getChild("tentacle_5").getChild("jointFRA_1");
        this.jointFRA_3 = root.getChild("mainbody").getChild("bbb").getChild("jd_3").getChild("body_1").getChild("jointFRA").getChild("tentacle_5").getChild("jointFRA_1").getChild("tentacle_6").getChild("jointFRA_2").getChild("tentacle_7").getChild("jointFRA_3");
        this.jointFLA_2 = root.getChild("mainbody").getChild("bbb").getChild("jd_2").getChild("body").getChild("jointFLA").getChild("tentacle").getChild("jointFLA_1").getChild("tentacle_1").getChild("jointFLA_2");
        this.jointBLA_3 = root.getChild("mainbody").getChild("jd").getChild("body_2").getChild("jointBLA").getChild("tentacle_10").getChild("jointBLA_1").getChild("tentacle_11").getChild("jointBLA_2").getChild("tentacle_12").getChild("jointBLA_3");
        this.jointBRA_2 = root.getChild("mainbody").getChild("jd_1").getChild("body_3").getChild("jointBRA").getChild("tentacle_15").getChild("jointBRA_1").getChild("tentacle_16").getChild("jointBRA_2");
        this.jointBRA_3 = root.getChild("mainbody").getChild("jd_1").getChild("body_3").getChild("jointBRA").getChild("tentacle_15").getChild("jointBRA_1").getChild("tentacle_16").getChild("jointBRA_2").getChild("tentacle_17").getChild("jointBRA_3");
        this.jointFLA_1 = root.getChild("mainbody").getChild("bbb").getChild("jd_2").getChild("body").getChild("jointFLA").getChild("tentacle").getChild("jointFLA_1");
        this.mainbodyBaseX = 0.0f;
        this.mainbodyBaseY = 7.0f;
        this.mainbodyBaseZ = 7.0f;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 7.0f, 7.0f));
                PartDefinition bbb = mainbody.addOrReplaceChild("bbb", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0f, -2.0f, -14.0f, 14, 14, 17), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.12566371f, 0.0f, 0.0f));
                PartDefinition jd_2 = bbb.addOrReplaceChild("jd_2", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(8.0f, -2.0f, -11.0f, -2.2619467f, 0.0f, -1.5707964f));
                PartDefinition body = jd_2.addOrReplaceChild("body", CubeListBuilder.create().texOffs(138, 0).addBox(-3.0f, -2.0f, -2.0f, 6, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.9424778f, 0.0f));
                PartDefinition jointFLA = body.addOrReplaceChild("jointFLA", CubeListBuilder.create().texOffs(110, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition tentacle = jointFLA.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(226, 15).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.25132743f, -1.69646f, 0.0f));
                PartDefinition jointFLA_1 = tentacle.addOrReplaceChild("jointFLA_1", CubeListBuilder.create().texOffs(114, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.5f));
                PartDefinition tentacle_1 = jointFLA_1.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(48, 23).addBox(-1.0f, -0.5f, -1.0f, 2, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.62831855f, 0.0f));
                PartDefinition jointFLA_2 = tentacle_1.addOrReplaceChild("jointFLA_2", CubeListBuilder.create().texOffs(138, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 12.0f));
                PartDefinition tentacle_2 = jointFLA_2.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(80, 23).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.12566371f, -0.43982297f, 0.0f));
                PartDefinition jointFLA_3 = tentacle_2.addOrReplaceChild("jointFLA_3", CubeListBuilder.create().texOffs(154, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
                PartDefinition tentacle_3 = jointFLA_3.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(178, 27).addBox(-1.0f, -0.5f, -1.0f, 2, 1, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.62831855f, 0.0f));
                PartDefinition jointFLA_4 = tentacle_3.addOrReplaceChild("jointFLA_4", CubeListBuilder.create().texOffs(158, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 14.5f));
                PartDefinition tentacle_4 = jointFLA_4.addOrReplaceChild("tentacle_4", CubeListBuilder.create().texOffs(198, 27).addBox(-0.5f, 0.0f, -1.0f, 1, 1, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.50265485f, 0.0f));
                PartDefinition t = bbb.addOrReplaceChild("t", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(-6.3f, 11.9f, -13.0f, 0.0f, 0.0f, 0.43982297f));
                PartDefinition t_1 = bbb.addOrReplaceChild("t_1", CubeListBuilder.create().texOffs(49, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(-6.3f, 11.9f, -11.0f, 0.06283186f, 0.0f, 0.56548667f));
                PartDefinition t_2 = bbb.addOrReplaceChild("t_2", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(-6.2f, 11.9f, -9.0f, 0.12566371f, 0.0f, 0.62831855f));
                PartDefinition t_3 = bbb.addOrReplaceChild("t_3", CubeListBuilder.create().texOffs(57, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(-6.3f, 11.9f, -7.0f, 0.18849556f, 0.0f, 0.43982297f));
                PartDefinition t_4 = bbb.addOrReplaceChild("t_4", CubeListBuilder.create().texOffs(61, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(-6.3f, 11.9f, -5.0f, 0.31415927f, 0.0f, 0.43982297f));
                PartDefinition t_5 = bbb.addOrReplaceChild("t_5", CubeListBuilder.create().texOffs(65, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(6.2f, 11.9f, -13.0f, -0.12566371f, 0.0f, -0.43982297f));
                PartDefinition t_6 = bbb.addOrReplaceChild("t_6", CubeListBuilder.create().texOffs(69, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(6.2f, 11.9f, -11.0f, -0.06283186f, 0.0f, -0.37699112f));
                PartDefinition t_7 = bbb.addOrReplaceChild("t_7", CubeListBuilder.create().texOffs(94, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(6.3f, 11.9f, -9.0f, -0.06283186f, 0.0f, -0.37699112f));
                PartDefinition t_8 = bbb.addOrReplaceChild("t_8", CubeListBuilder.create().texOffs(98, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(6.0f, 11.9f, -7.0f, 0.06283186f, 0.0f, -0.62831855f));
                PartDefinition t_9 = bbb.addOrReplaceChild("t_9", CubeListBuilder.create().texOffs(102, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(6.4f, 11.9f, -5.0f, 0.25132743f, 0.0f, -0.31415927f));
                PartDefinition jd_3 = bbb.addOrReplaceChild("jd_3", CubeListBuilder.create().texOffs(106, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-8.0f, -2.0f, -11.0f, 2.2619467f, 0.0f, -1.5707964f));
                PartDefinition body_1 = jd_3.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(182, 0).addBox(-3.0f, -2.0f, -2.0f, 6, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.9424778f, 0.0f));
                PartDefinition jointFRA = body_1.addOrReplaceChild("jointFRA", CubeListBuilder.create().texOffs(182, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition tentacle_5 = jointFRA.addOrReplaceChild("tentacle_5", CubeListBuilder.create().texOffs(214, 29).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.25132743f, -1.69646f, 0.0f));
                PartDefinition jointFRA_1 = tentacle_5.addOrReplaceChild("jointFRA_1", CubeListBuilder.create().texOffs(198, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.5f));
                PartDefinition tentacle_6 = jointFRA_1.addOrReplaceChild("tentacle_6", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0f, -0.5f, -1.0f, 2, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.62831855f, 0.0f));
                PartDefinition jointFRA_2 = tentacle_6.addOrReplaceChild("jointFRA_2", CubeListBuilder.create().texOffs(202, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 12.0f));
                PartDefinition tentacle_7 = jointFRA_2.addOrReplaceChild("tentacle_7", CubeListBuilder.create().texOffs(97, 31).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.12566371f, -0.43982297f, 0.0f));
                PartDefinition jointFRA_3 = tentacle_7.addOrReplaceChild("jointFRA_3", CubeListBuilder.create().texOffs(226, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
                PartDefinition tentacle_8 = jointFRA_3.addOrReplaceChild("tentacle_8", CubeListBuilder.create().texOffs(16, 31).addBox(-1.0f, -0.5f, -1.0f, 2, 1, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.62831855f, 0.0f));
                PartDefinition jointFRA_4 = tentacle_8.addOrReplaceChild("jointFRA_4", CubeListBuilder.create().texOffs(230, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 14.5f));
                PartDefinition tentacle_9 = jointFRA_4.addOrReplaceChild("tentacle_9", CubeListBuilder.create().texOffs(127, 31).addBox(-0.5f, 0.0f, -1.0f, 1, 1, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.50265485f, 0.0f));
                PartDefinition bh = mainbody.addOrReplaceChild("bh", CubeListBuilder.create().texOffs(62, 0).addBox(-5.0f, -2.0f, -9.0f, 10, 11, 12), PartPose.offsetAndRotation(0.0f, 1.0f, -17.0f, 0.25132743f, 0.0f, 0.0f));
                PartDefinition b_3 = bh.addOrReplaceChild("b_3", CubeListBuilder.create().texOffs(155, 31).addBox(-2.0f, -4.0f, -2.0f, 4, 13, 6), PartPose.offsetAndRotation(0.0f, -1.5f, -8.5f, -0.37699112f, 0.0f, 0.0f));
                PartDefinition b_4 = bh.addOrReplaceChild("b_4", CubeListBuilder.create().texOffs(66, 23).addBox(-2.0f, -2.0f, -3.0f, 4, 7, 6), PartPose.offsetAndRotation(4.0f, 2.0f, -4.0f, 0.0f, 0.0f, -0.43982297f));
                PartDefinition b_5 = bh.addOrReplaceChild("b_5", CubeListBuilder.create().texOffs(114, 31).addBox(-2.0f, -2.0f, -3.0f, 4, 7, 6), PartPose.offsetAndRotation(-4.0f, 2.0f, -4.0f, 0.0f, 0.0f, 0.37699112f));
                PartDefinition t_10 = bh.addOrReplaceChild("t_10", CubeListBuilder.create().texOffs(234, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 7, 1), PartPose.offsetAndRotation(4.0f, 8.6f, -1.4f, -0.31415927f, 0.0f, -0.56548667f));
                PartDefinition t_11 = bh.addOrReplaceChild("t_11", CubeListBuilder.create().texOffs(238, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(4.2f, 8.6f, -3.4f, -0.31415927f, 0.0f, -0.43982297f));
                PartDefinition t_12 = bh.addOrReplaceChild("t_12", CubeListBuilder.create().texOffs(242, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(3.9f, 8.6f, -5.4f, -0.25132743f, 0.0f, -0.69115037f));
                PartDefinition t_13 = bh.addOrReplaceChild("t_13", CubeListBuilder.create().texOffs(246, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(4.0f, 8.6f, -7.4f, -0.25132743f, 0.0f, -0.62831855f));
                PartDefinition t_14 = bh.addOrReplaceChild("t_14", CubeListBuilder.create().texOffs(250, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 7, 1), PartPose.offsetAndRotation(-4.1f, 8.6f, -1.4f, -0.31415927f, 0.0f, 0.56548667f));
                PartDefinition t_15 = bh.addOrReplaceChild("t_15", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(-4.1f, 8.6f, -3.4f, -0.37699112f, 0.0f, 0.50265485f));
                PartDefinition t_16 = bh.addOrReplaceChild("t_16", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(-3.7f, 8.6f, -5.4f, -0.31415927f, 0.0f, 0.9424778f));
                PartDefinition t_17 = bh.addOrReplaceChild("t_17", CubeListBuilder.create().texOffs(8, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(-3.9f, 8.6f, -7.4f, -0.43982297f, -0.06283186f, 0.56548667f));
                PartDefinition t_18 = bh.addOrReplaceChild("t_18", CubeListBuilder.create().texOffs(12, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(0.0f, 8.6f, -8.0f, -0.56548667f, 0.0f, 0.0f));
                PartDefinition t_19 = bh.addOrReplaceChild("t_19", CubeListBuilder.create().texOffs(106, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 6, 1), PartPose.offsetAndRotation(-2.0f, 8.6f, -7.9f, -0.62831855f, 0.0f, 0.06283186f));
                PartDefinition t_20 = bh.addOrReplaceChild("t_20", CubeListBuilder.create().texOffs(110, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 7, 1), PartPose.offsetAndRotation(2.0f, 8.6f, -8.1f, -0.56548667f, 0.0f, -0.12566371f));
                PartDefinition t_21 = bh.addOrReplaceChild("t_21", CubeListBuilder.create().texOffs(114, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(-4.0f, 8.6f, -7.9f, -0.62831855f, 0.25132743f, 0.0f));
                PartDefinition t_22 = bh.addOrReplaceChild("t_22", CubeListBuilder.create().texOffs(158, 2).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(4.0f, 8.6f, -7.8f, -0.62831855f, -0.43982297f, 0.0f));
                PartDefinition b = mainbody.addOrReplaceChild("b", CubeListBuilder.create().texOffs(106, 0).addBox(-5.0f, -5.0f, -6.0f, 10, 19, 12), PartPose.offsetAndRotation(-8.0f, -3.0f, 2.0f, 0.50265485f, -0.37699112f, 0.0f));
                PartDefinition b_6 = b.addOrReplaceChild("b_6", CubeListBuilder.create().texOffs(42, 38).addBox(-4.0f, -4.0f, -5.0f, 8, 12, 10), PartPose.offsetAndRotation(-4.0f, 2.0f, 2.0f, 0.0f, -0.37699112f, 0.0f));
                PartDefinition b_1 = mainbody.addOrReplaceChild("b_1", CubeListBuilder.create().texOffs(150, 0).addBox(-5.0f, -5.0f, -6.0f, 10, 19, 12), PartPose.offsetAndRotation(8.0f, -3.0f, 2.0f, 0.50265485f, 0.37699112f, 0.0f));
                PartDefinition b_7 = b_1.addOrReplaceChild("b_7", CubeListBuilder.create().texOffs(204, 43).addBox(-4.0f, -4.0f, -5.0f, 8, 12, 10), PartPose.offsetAndRotation(4.0f, 2.0f, 2.0f, 0.0f, 0.37699112f, 0.0f));
                PartDefinition b_2 = mainbody.addOrReplaceChild("b_2", CubeListBuilder.create().texOffs(194, 0).addBox(-5.0f, -6.0f, -6.0f, 10, 15, 12), PartPose.offsetAndRotation(0.0f, 9.0f, 2.0f, 0.37699112f, 0.0f, 0.0f));
                PartDefinition b_8 = b_2.addOrReplaceChild("b_8", CubeListBuilder.create().texOffs(165, 44).addBox(-2.5f, -4.0f, -5.0f, 5, 14, 10), PartPose.offsetAndRotation(0.0f, 2.5f, 4.5f, -0.37699112f, 0.0f, 0.0f));
                PartDefinition jd = mainbody.addOrReplaceChild("jd", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(7.0f, 7.0f, -6.0f, -1.2566371f, 0.0f, -1.5707964f));
                PartDefinition body_2 = jd.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(230, 29).addBox(-3.0f, -2.0f, -2.0f, 6, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.56548667f, 0.0f));
                PartDefinition jointBLA = body_2.addOrReplaceChild("jointBLA", CubeListBuilder.create().texOffs(138, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition tentacle_10 = jointBLA.addOrReplaceChild("tentacle_10", CubeListBuilder.create().texOffs(78, 38).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.18849556f, -1.4451326f, 0.0f));
                PartDefinition jointBLA_1 = tentacle_10.addOrReplaceChild("jointBLA_1", CubeListBuilder.create().texOffs(154, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.5f));
                PartDefinition tentacle_11 = jointBLA_1.addOrReplaceChild("tentacle_11", CubeListBuilder.create().texOffs(113, 45).addBox(-1.0f, -0.5f, -1.0f, 2, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.62831855f, 0.0f));
                PartDefinition jointBLA_2 = tentacle_11.addOrReplaceChild("jointBLA_2", CubeListBuilder.create().texOffs(182, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 12.0f));
                PartDefinition tentacle_12 = jointBLA_2.addOrReplaceChild("tentacle_12", CubeListBuilder.create().texOffs(93, 47).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.12566371f, -0.43982297f, 0.0f));
                PartDefinition jointBLA_3 = tentacle_12.addOrReplaceChild("jointBLA_3", CubeListBuilder.create().texOffs(198, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
                PartDefinition tentacle_13 = jointBLA_3.addOrReplaceChild("tentacle_13", CubeListBuilder.create().texOffs(129, 45).addBox(-1.0f, -0.5f, -1.0f, 2, 1, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.62831855f, 0.0f));
                PartDefinition jointBLA_4 = tentacle_13.addOrReplaceChild("jointBLA_4", CubeListBuilder.create().texOffs(202, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 14.5f));
                PartDefinition tentacle_14 = jointBLA_4.addOrReplaceChild("tentacle_14", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5f, 0.0f, -1.0f, 1, 1, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.50265485f, 0.0f));
                PartDefinition jd_1 = mainbody.addOrReplaceChild("jd_1", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-7.0f, 7.0f, -6.0f, 1.2566371f, 0.0f, -1.5707964f));
                PartDefinition body_3 = jd_1.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(68, 38).addBox(-3.0f, -2.0f, -2.0f, 6, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.56548667f, 0.0f));
                PartDefinition jointBRA = body_3.addOrReplaceChild("jointBRA", CubeListBuilder.create().texOffs(226, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 0.0f));
                PartDefinition tentacle_15 = jointBRA.addOrReplaceChild("tentacle_15", CubeListBuilder.create().texOffs(16, 48).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.18849556f, -1.4451326f, 0.0f));
                PartDefinition jointBRA_1 = tentacle_15.addOrReplaceChild("jointBRA_1", CubeListBuilder.create().texOffs(230, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.5f));
                PartDefinition tentacle_16 = jointBRA_1.addOrReplaceChild("tentacle_16", CubeListBuilder.create().texOffs(64, 52).addBox(-1.0f, -0.5f, -1.0f, 2, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.62831855f, 0.0f));
                PartDefinition jointBRA_2 = tentacle_16.addOrReplaceChild("jointBRA_2", CubeListBuilder.create().texOffs(102, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 12.0f));
                PartDefinition tentacle_17 = jointBRA_2.addOrReplaceChild("tentacle_17", CubeListBuilder.create().texOffs(182, 55).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.12566371f, -0.43982297f, 0.0f));
                PartDefinition jointBRA_3 = tentacle_17.addOrReplaceChild("jointBRA_3", CubeListBuilder.create().texOffs(202, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
                PartDefinition tentacle_18 = jointBRA_3.addOrReplaceChild("tentacle_18", CubeListBuilder.create().texOffs(28, 60).addBox(-1.0f, -0.5f, -1.0f, 2, 1, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.62831855f, 0.0f));
                PartDefinition jointBRA_4 = tentacle_18.addOrReplaceChild("jointBRA_4", CubeListBuilder.create().texOffs(226, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 14.5f));
                PartDefinition tentacle_19 = jointBRA_4.addOrReplaceChild("tentacle_19", CubeListBuilder.create().texOffs(227, 52).addBox(-0.5f, 0.0f, -1.0f, 1, 1, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.50265485f, 0.0f));
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
        float f1 = Mth.cos((float)(ageInTicks * 0.14986f)) * 0.1872f;
        float f2 = Mth.cos((float)(ageInTicks * 0.13786f)) * 0.2219872f;
        float f3 = Mth.cos((float)(ageInTicks * 0.12786f)) * 0.2872f;
        float f4 = Mth.cos((float)(ageInTicks * 0.1286f)) * 0.1972f;
        this.mainbody.z = this.mainbodyBaseZ + (0.5f);
        this.jointFLA.zRot = f1;
        this.jointFLA_1.zRot = -f3;
        this.jointFLA_2.zRot = f4;
        this.jointFLA_3.zRot = -f1;
        this.jointFLA_4.zRot = f2;
        this.jointFRA.zRot = f3;
        this.jointFRA_1.zRot = -f4;
        this.jointFRA_2.zRot = f1;
        this.jointFRA_3.zRot = -f2;
        this.jointFRA_4.zRot = -f3;
        this.jointBLA.zRot = -f4;
        this.jointBLA_1.zRot = f3;
        this.jointBLA_2.zRot = f1;
        this.jointBLA_3.zRot = f2;
        this.jointBLA_4.zRot = -f3;
        this.jointBRA.zRot = f2;
        this.jointBRA_1.zRot = -f1;
        this.jointBRA_2.zRot = f2;
        this.jointBRA_3.zRot = f3;
        this.jointBRA_4.zRot = -f4;
    }


    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}