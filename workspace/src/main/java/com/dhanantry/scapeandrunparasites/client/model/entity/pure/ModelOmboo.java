package com.dhanantry.scapeandrunparasites.client.model.entity.pure;

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

public class ModelOmboo extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "omboo"), "main");
    private final ModelPart mainbody;
    private final ModelPart mpop1;
    private final ModelPart jointp2;
    private final ModelPart mpop3;
    private final ModelPart mpop4;
    private final ModelPart mpop5;
    private final ModelPart mpop6;
    private final ModelPart jointp7;
    private final ModelPart mpop8;
    private final ModelPart mpop9;
    private final ModelPart mpop10;
    private final ModelPart jointp11;
    private final ModelPart mpop12;
    private final ModelPart mpop13;
    private final ModelPart mpop14;
    private final ModelPart jointp15;
    private final ModelPart mpop16;
    private final ModelPart jointp17;
    private final ModelPart jointp18;
    private final ModelPart mpop19;
    private final ModelPart bodyh;
    private final ModelPart jointLW;
    private final ModelPart body;
    private final ModelPart bodyt;
    private final ModelPart body_1;
    private final ModelPart jointRW;
    private final ModelPart bodyt_1;
    private final ModelPart body_2;
    private final ModelPart body_3;
    private final ModelPart bodytt;
    private final ModelPart taclejointFL1;
    private final ModelPart taclejointFR1;
    private final ModelPart taclejointBL1;
    private final ModelPart taclejointBR1;
    private final ModelPart bt;
    private final ModelPart tentacle;
    private final ModelPart taclejointBL2;
    private final ModelPart tentacle_1;
    private final ModelPart taclejointBL3;
    private final ModelPart tentacle_2;
    private final ModelPart taclejointBL4;
    private final ModelPart tentacle_3;
    private final ModelPart tentacle_4;
    private final ModelPart taclejointBR2;
    private final ModelPart tentacle_5;
    private final ModelPart taclejointBR3;
    private final ModelPart tentacle_6;
    private final ModelPart taclejointBR4;
    private final ModelPart tentacle_7;
    private final ModelPart tentacle_8;
    private final ModelPart taclejointFL2;
    private final ModelPart tentacle_9;
    private final ModelPart taclejointFL3;
    private final ModelPart tentacle_10;
    private final ModelPart taclejointFL4;
    private final ModelPart tentacle_11;
    private final ModelPart tentacle_12;
    private final ModelPart taclejointFR2;
    private final ModelPart tentacle_13;
    private final ModelPart taclejointFR3;
    private final ModelPart tentacle_14;
    private final ModelPart taclejointFR4;
    private final ModelPart tentacle_15;
    private final ModelPart bodyt_2;
    private final ModelPart body_4;
    private final ModelPart body_5;
    private final ModelPart JD;
    private final ModelPart spop;
    private final ModelPart spop_1;
    private final ModelPart JD_1;
    private final ModelPart spop_2;
    private final ModelPart spop_3;
    private final ModelPart JD_2;
    private final ModelPart spop_4;
    private final ModelPart spop_5;
    private final ModelPart JD_3;
    private final ModelPart spop_6;
    private final ModelPart spop_7;
    private final ModelPart JD_4;
    private final ModelPart spop_8;
    private final ModelPart spop_9;
    private final ModelPart JD_5;
    private final ModelPart spop_10;
    private final ModelPart spop_11;

    public ModelOmboo(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.mpop1 = root.getChild("mpop1");
        this.jointp2 = root.getChild("jointp2");
        this.mpop3 = root.getChild("mpop3");
        this.mpop4 = root.getChild("mpop4");
        this.mpop5 = root.getChild("mpop5");
        this.mpop6 = root.getChild("mpop6");
        this.jointp7 = root.getChild("jointp7");
        this.mpop8 = root.getChild("mpop8");
        this.mpop9 = root.getChild("mpop9");
        this.mpop10 = root.getChild("mpop10");
        this.jointp11 = root.getChild("jointp11");
        this.mpop12 = root.getChild("mpop12");
        this.mpop13 = root.getChild("mpop13");
        this.mpop14 = root.getChild("mpop14");
        this.jointp15 = root.getChild("jointp15");
        this.mpop16 = root.getChild("mpop16");
        this.jointp17 = root.getChild("jointp17");
        this.jointp18 = root.getChild("jointp18");
        this.mpop19 = root.getChild("mpop19");
        this.bodyh = root.getChild("mainbody").getChild("bodyh");
        this.jointLW = root.getChild("mainbody").getChild("bodyh").getChild("jointLW");
        this.body = root.getChild("mainbody").getChild("bodyh").getChild("body");
        this.bodyt = root.getChild("mainbody").getChild("bodyh").getChild("bodyt");
        this.body_1 = root.getChild("mainbody").getChild("bodyh").getChild("body_1");
        this.jointRW = root.getChild("mainbody").getChild("bodyh").getChild("jointRW");
        this.bodyt_1 = root.getChild("mainbody").getChild("bodyh").getChild("jointLW").getChild("bodyt_1");
        this.body_2 = root.getChild("mainbody").getChild("bodyh").getChild("jointLW").getChild("bodyt_1").getChild("body_2");
        this.body_3 = root.getChild("mainbody").getChild("bodyh").getChild("jointLW").getChild("bodyt_1").getChild("body_3");
        this.bodytt = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt");
        this.taclejointFL1 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFL1");
        this.taclejointFR1 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFR1");
        this.taclejointBL1 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBL1");
        this.taclejointBR1 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBR1");
        this.bt = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("bt");
        this.tentacle = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBL1").getChild("tentacle");
        this.taclejointBL2 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBL1").getChild("tentacle").getChild("taclejointBL2");
        this.tentacle_1 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBL1").getChild("tentacle").getChild("taclejointBL2").getChild("tentacle_1");
        this.taclejointBL3 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBL1").getChild("tentacle").getChild("taclejointBL2").getChild("tentacle_1").getChild("taclejointBL3");
        this.tentacle_2 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBL1").getChild("tentacle").getChild("taclejointBL2").getChild("tentacle_1").getChild("taclejointBL3").getChild("tentacle_2");
        this.taclejointBL4 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBL1").getChild("tentacle").getChild("taclejointBL2").getChild("tentacle_1").getChild("taclejointBL3").getChild("tentacle_2").getChild("taclejointBL4");
        this.tentacle_3 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBL1").getChild("tentacle").getChild("taclejointBL2").getChild("tentacle_1").getChild("taclejointBL3").getChild("tentacle_2").getChild("taclejointBL4").getChild("tentacle_3");
        this.tentacle_4 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBR1").getChild("tentacle_4");
        this.taclejointBR2 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBR1").getChild("tentacle_4").getChild("taclejointBR2");
        this.tentacle_5 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBR1").getChild("tentacle_4").getChild("taclejointBR2").getChild("tentacle_5");
        this.taclejointBR3 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBR1").getChild("tentacle_4").getChild("taclejointBR2").getChild("tentacle_5").getChild("taclejointBR3");
        this.tentacle_6 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBR1").getChild("tentacle_4").getChild("taclejointBR2").getChild("tentacle_5").getChild("taclejointBR3").getChild("tentacle_6");
        this.taclejointBR4 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBR1").getChild("tentacle_4").getChild("taclejointBR2").getChild("tentacle_5").getChild("taclejointBR3").getChild("tentacle_6").getChild("taclejointBR4");
        this.tentacle_7 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("bodytt").getChild("taclejointBR1").getChild("tentacle_4").getChild("taclejointBR2").getChild("tentacle_5").getChild("taclejointBR3").getChild("tentacle_6").getChild("taclejointBR4").getChild("tentacle_7");
        this.tentacle_8 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFL1").getChild("tentacle_8");
        this.taclejointFL2 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFL1").getChild("tentacle_8").getChild("taclejointFL2");
        this.tentacle_9 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFL1").getChild("tentacle_8").getChild("taclejointFL2").getChild("tentacle_9");
        this.taclejointFL3 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFL1").getChild("tentacle_8").getChild("taclejointFL2").getChild("tentacle_9").getChild("taclejointFL3");
        this.tentacle_10 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFL1").getChild("tentacle_8").getChild("taclejointFL2").getChild("tentacle_9").getChild("taclejointFL3").getChild("tentacle_10");
        this.taclejointFL4 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFL1").getChild("tentacle_8").getChild("taclejointFL2").getChild("tentacle_9").getChild("taclejointFL3").getChild("tentacle_10").getChild("taclejointFL4");
        this.tentacle_11 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFL1").getChild("tentacle_8").getChild("taclejointFL2").getChild("tentacle_9").getChild("taclejointFL3").getChild("tentacle_10").getChild("taclejointFL4").getChild("tentacle_11");
        this.tentacle_12 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFR1").getChild("tentacle_12");
        this.taclejointFR2 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFR1").getChild("tentacle_12").getChild("taclejointFR2");
        this.tentacle_13 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFR1").getChild("tentacle_12").getChild("taclejointFR2").getChild("tentacle_13");
        this.taclejointFR3 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFR1").getChild("tentacle_12").getChild("taclejointFR2").getChild("tentacle_13").getChild("taclejointFR3");
        this.tentacle_14 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFR1").getChild("tentacle_12").getChild("taclejointFR2").getChild("tentacle_13").getChild("taclejointFR3").getChild("tentacle_14");
        this.taclejointFR4 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFR1").getChild("tentacle_12").getChild("taclejointFR2").getChild("tentacle_13").getChild("taclejointFR3").getChild("tentacle_14").getChild("taclejointFR4");
        this.tentacle_15 = root.getChild("mainbody").getChild("bodyh").getChild("bodyt").getChild("taclejointFR1").getChild("tentacle_12").getChild("taclejointFR2").getChild("tentacle_13").getChild("taclejointFR3").getChild("tentacle_14").getChild("taclejointFR4").getChild("tentacle_15");
        this.bodyt_2 = root.getChild("mainbody").getChild("bodyh").getChild("jointRW").getChild("bodyt_2");
        this.body_4 = root.getChild("mainbody").getChild("bodyh").getChild("jointRW").getChild("bodyt_2").getChild("body_4");
        this.body_5 = root.getChild("mainbody").getChild("bodyh").getChild("jointRW").getChild("bodyt_2").getChild("body_5");
        this.JD = root.getChild("jointp2").getChild("JD");
        this.spop = root.getChild("jointp2").getChild("JD").getChild("spop");
        this.spop_1 = root.getChild("jointp2").getChild("JD").getChild("spop").getChild("spop_1");
        this.JD_1 = root.getChild("jointp7").getChild("JD_1");
        this.spop_2 = root.getChild("jointp7").getChild("JD_1").getChild("spop_2");
        this.spop_3 = root.getChild("jointp7").getChild("JD_1").getChild("spop_2").getChild("spop_3");
        this.JD_2 = root.getChild("jointp11").getChild("JD_2");
        this.spop_4 = root.getChild("jointp11").getChild("JD_2").getChild("spop_4");
        this.spop_5 = root.getChild("jointp11").getChild("JD_2").getChild("spop_4").getChild("spop_5");
        this.JD_3 = root.getChild("jointp15").getChild("JD_3");
        this.spop_6 = root.getChild("jointp15").getChild("JD_3").getChild("spop_6");
        this.spop_7 = root.getChild("jointp15").getChild("JD_3").getChild("spop_6").getChild("spop_7");
        this.JD_4 = root.getChild("jointp17").getChild("JD_4");
        this.spop_8 = root.getChild("jointp17").getChild("JD_4").getChild("spop_8");
        this.spop_9 = root.getChild("jointp17").getChild("JD_4").getChild("spop_8").getChild("spop_9");
        this.JD_5 = root.getChild("jointp18").getChild("JD_5");
        this.spop_10 = root.getChild("jointp18").getChild("JD_5").getChild("spop_10");
        this.spop_11 = root.getChild("jointp18").getChild("JD_5").getChild("spop_10").getChild("spop_11");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, -8.0f, 0.0f, (float)Math.PI, 0.0f));
        PartDefinition bodyh = mainbody.addOrReplaceChild("bodyh", CubeListBuilder.create().texOffs(90, 13).addBox(-14.0f, -12.0f, -16.0f, 28, 24, 32), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body = bodyh.addOrReplaceChild("body", CubeListBuilder.create().texOffs(229, 17).addBox(-11.5f, -8.0f, -7.0f, 23, 17, 25), PartPose.offsetAndRotation(0.0f, 7.7f, -4.4f, -0.5934119f, 0.0f, 0.0f));
        PartDefinition jointLW = bodyh.addOrReplaceChild("jointLW", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-13.0f, -8.0f, 0.0f));
        PartDefinition bodyt_1 = jointLW.addOrReplaceChild("bodyt_1", CubeListBuilder.create().texOffs(186, 59).addBox(-18.0f, -8.0f, -12.0f, 25, 8, 24), PartPose.offsetAndRotation(-2.0f, 4.0f, 0.0f, 0.0f, 0.0f, -0.9599311f));
        PartDefinition body_3 = bodyt_1.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(284, 59).addBox(-5.0f, -9.0f, -10.0f, 10, 18, 20), PartPose.offsetAndRotation(1.0f, 3.0f, 0.0f, 0.0f, 0.0f, -0.75049156f));
        PartDefinition body_2 = bodyt_1.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(52, 69).addBox(-11.0f, -3.0f, -10.0f, 13, 6, 20), PartPose.offsetAndRotation(0.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.7330383f));
        PartDefinition jointRW = bodyh.addOrReplaceChild("jointRW", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(13.0f, -8.0f, 0.0f));
        PartDefinition bodyt_2 = jointRW.addOrReplaceChild("bodyt_2", CubeListBuilder.create().texOffs(26, 95).addBox(-18.0f, -8.0f, -12.0f, 25, 8, 24), PartPose.offsetAndRotation(2.0f, 4.0f, 0.0f, 0.0f, (float)Math.PI, 0.9599311f));
        PartDefinition body_5 = bodyt_2.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(124, 101).addBox(-5.0f, -9.0f, -10.0f, 10, 18, 20), PartPose.offsetAndRotation(1.0f, 3.0f, 0.0f, 0.0f, 0.0f, -0.75049156f));
        PartDefinition body_4 = bodyt_2.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(272, 97).addBox(-11.0f, -3.0f, -10.0f, 13, 6, 20), PartPose.offsetAndRotation(0.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.7330383f));
        PartDefinition body_1 = bodyh.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(0, 50).addBox(-12.0f, -8.0f, -6.0f, 24, 16, 12), PartPose.offsetAndRotation(0.0f, 1.0f, 15.5f, 0.6457718f, 0.0f, 0.0f));
        PartDefinition bodyt = bodyh.addOrReplaceChild("bodyt", CubeListBuilder.create().texOffs(11, 13).addBox(-10.0f, -10.0f, -7.0f, 20, 20, 17), PartPose.offsetAndRotation(0.0f, 1.5f, -24.0f, 0.17453292f, 0.0f, 0.0f));
        PartDefinition bodytt = bodyt.addOrReplaceChild("bodytt", CubeListBuilder.create().texOffs(118, 69).addBox(-7.0f, -7.0f, -1.0f, 14, 14, 18), PartPose.offsetAndRotation(0.0f, 0.0f, -5.0f, -2.8448868f, 0.0f, 0.0f));
        PartDefinition taclejointBL1 = bodytt.addOrReplaceChild("taclejointBL1", CubeListBuilder.create().texOffs(131, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.0f, -6.0f, 10.0f));
        PartDefinition tentacle = taclejointBL1.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(68, 13).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.0471976f, 0.36651915f, -0.20943952f));
        PartDefinition taclejointBL2 = tentacle.addOrReplaceChild("taclejointBL2", CubeListBuilder.create().texOffs(161, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_1 = taclejointBL2.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(178, 13).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4886922f, 0.0f, 0.0f));
        PartDefinition taclejointBL3 = tentacle_1.addOrReplaceChild("taclejointBL3", CubeListBuilder.create().texOffs(165, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_2 = taclejointBL3.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(198, 19).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4537856f, 0.0f, 0.0f));
        PartDefinition taclejointBL4 = tentacle_2.addOrReplaceChild("taclejointBL4", CubeListBuilder.create().texOffs(191, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_3 = taclejointBL4.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(214, 20).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition taclejointBR1 = bodytt.addOrReplaceChild("taclejointBR1", CubeListBuilder.create().texOffs(157, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, -6.0f, 10.0f));
        PartDefinition tentacle_4 = taclejointBR1.addOrReplaceChild("tentacle_4", CubeListBuilder.create().texOffs(85, 23).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.0471976f, -0.36651915f, 0.20943952f));
        PartDefinition taclejointBR2 = tentacle_4.addOrReplaceChild("taclejointBR2", CubeListBuilder.create().texOffs(195, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_5 = taclejointBR2.addOrReplaceChild("tentacle_5", CubeListBuilder.create().texOffs(178, 29).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4886922f, 0.0f, 0.0f));
        PartDefinition taclejointBR3 = tentacle_5.addOrReplaceChild("taclejointBR3", CubeListBuilder.create().texOffs(199, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_6 = taclejointBR3.addOrReplaceChild("tentacle_6", CubeListBuilder.create().texOffs(260, 59).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4537856f, 0.0f, 0.0f));
        PartDefinition taclejointBR4 = tentacle_6.addOrReplaceChild("taclejointBR4", CubeListBuilder.create().texOffs(218, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_7 = taclejointBR4.addOrReplaceChild("tentacle_7", CubeListBuilder.create().texOffs(98, 69).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition bt = bodytt.addOrReplaceChild("bt", CubeListBuilder.create().texOffs(300, 11).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 15.0f, 0.4537856f, 0.0f, 0.0f));
        PartDefinition taclejointFL1 = bodyt.addOrReplaceChild("taclejointFL1", CubeListBuilder.create().texOffs(91, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-6.0f, 10.0f, 0.0f));
        PartDefinition tentacle_8 = taclejointFL1.addOrReplaceChild("tentacle_8", CubeListBuilder.create().texOffs(164, 69).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.5707964f, -0.36651915f, 0.20943952f));
        PartDefinition taclejointFL2 = tentacle_8.addOrReplaceChild("taclejointFL2", CubeListBuilder.create().texOffs(222, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_9 = taclejointFL2.addOrReplaceChild("tentacle_9", CubeListBuilder.create().texOffs(0, 78).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4886922f, 0.0f, 0.0f));
        PartDefinition taclejointFL3 = tentacle_9.addOrReplaceChild("taclejointFL3", CubeListBuilder.create().texOffs(238, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_10 = taclejointFL3.addOrReplaceChild("tentacle_10", CubeListBuilder.create().texOffs(20, 82).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4537856f, 0.0f, 0.0f));
        PartDefinition taclejointFL4 = tentacle_10.addOrReplaceChild("taclejointFL4", CubeListBuilder.create().texOffs(253, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_11 = taclejointFL4.addOrReplaceChild("tentacle_11", CubeListBuilder.create().texOffs(166, 85).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition taclejointFR1 = bodyt.addOrReplaceChild("taclejointFR1", CubeListBuilder.create().texOffs(127, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 10.0f, 0.0f));
        PartDefinition tentacle_12 = taclejointFR1.addOrReplaceChild("tentacle_12", CubeListBuilder.create().texOffs(202, 91).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.5707964f, 0.36651915f, -0.20943952f));
        PartDefinition taclejointFR2 = tentacle_12.addOrReplaceChild("taclejointFR2", CubeListBuilder.create().texOffs(257, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_13 = taclejointFR2.addOrReplaceChild("tentacle_13", CubeListBuilder.create().texOffs(230, 91).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4886922f, 0.0f, 0.0f));
        PartDefinition taclejointFR3 = tentacle_13.addOrReplaceChild("taclejointFR3", CubeListBuilder.create().texOffs(261, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_14 = taclejointFR3.addOrReplaceChild("tentacle_14", CubeListBuilder.create().texOffs(262, 91).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4537856f, 0.0f, 0.0f));
        PartDefinition taclejointFR4 = tentacle_14.addOrReplaceChild("taclejointFR4", CubeListBuilder.create().texOffs(277, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_15 = taclejointFR4.addOrReplaceChild("tentacle_15", CubeListBuilder.create().texOffs(0, 94).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition mpop1 = root.addOrReplaceChild("mpop1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, -6.5f, -2.5f, 5, 9, 9), PartPose.offsetAndRotation(11.5f, 22.0f, -11.0f, -0.5934119f, (float)Math.PI, 0.0f));
        PartDefinition jointp2 = root.addOrReplaceChild("jointp2", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 5.5f, 11.1f));
        PartDefinition JD = jointp2.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(298, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.27925268f, 0.0f));
        PartDefinition spop = JD.addOrReplaceChild("spop", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5f, -1.5f, -1.5f, 10, 3, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5235988f));
        PartDefinition spop_1 = spop.addOrReplaceChild("spop_1", CubeListBuilder.create().texOffs(328, 6).addBox(3.6f, -2.5f, -2.5f, 4, 5, 5), PartPose.offset(1.0f, 0.0f, 0.0f));
        PartDefinition mpop3 = root.addOrReplaceChild("mpop3", CubeListBuilder.create().texOffs(28, 0).addBox(-2.0f, -3.0f, -2.5f, 10, 6, 6), PartPose.offsetAndRotation(8.5f, 15.4f, -20.3f, -0.5934119f, (float)Math.PI, 0.0f));
        PartDefinition mpop4 = root.addOrReplaceChild("mpop4", CubeListBuilder.create().texOffs(60, 0).addBox(-2.0f, -3.0f, -2.5f, 10, 6, 7), PartPose.offsetAndRotation(14.5f, 17.4f, -3.3f, -0.5934119f, (float)Math.PI, 0.0f));
        PartDefinition mpop5 = root.addOrReplaceChild("mpop5", CubeListBuilder.create().texOffs(94, 0).addBox(-2.0f, -3.0f, -2.5f, 15, 6, 3), PartPose.offsetAndRotation(5.5f, 22.5f, -16.4f, -0.5934119f, (float)Math.PI, 0.0f));
        PartDefinition mpop6 = root.addOrReplaceChild("mpop6", CubeListBuilder.create().texOffs(130, 0).addBox(-2.0f, -2.0f, -2.5f, 10, 5, 7), PartPose.offsetAndRotation(4.5f, 22.8f, -8.5f, -0.5934119f, (float)Math.PI, 0.0f));
        PartDefinition jointp7 = root.addOrReplaceChild("jointp7", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, -3.5f, 13.1f));
        PartDefinition JD_1 = jointp7.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(327, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.2443461f, 0.0f));
        PartDefinition spop_2 = JD_1.addOrReplaceChild("spop_2", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5f, -1.5f, -1.5f, 10, 3, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.43633232f));
        PartDefinition spop_3 = spop_2.addOrReplaceChild("spop_3", CubeListBuilder.create().texOffs(232, 19).addBox(3.6f, -2.5f, -2.5f, 4, 5, 5), PartPose.offset(1.0f, 0.0f, 0.0f));
        PartDefinition mpop8 = root.addOrReplaceChild("mpop8", CubeListBuilder.create().texOffs(164, 0).addBox(-2.0f, -3.0f, -2.5f, 10, 6, 7), PartPose.offsetAndRotation(-5.5f, 4.4f, -30.3f, 0.6457718f, (float)Math.PI, 0.0f));
        PartDefinition mpop9 = root.addOrReplaceChild("mpop9", CubeListBuilder.create().texOffs(198, 0).addBox(-2.0f, -3.0f, -2.5f, 6, 6, 8), PartPose.offsetAndRotation(-4.5f, 15.4f, -20.3f, -0.5934119f, (float)Math.PI, 0.0f));
        PartDefinition mpop10 = root.addOrReplaceChild("mpop10", CubeListBuilder.create().texOffs(210, 0).addBox(-3.0f, -2.5f, -15.5f, 6, 3, 16), PartPose.offsetAndRotation(-7.5f, 25.5f, -11.4f, -0.5934119f, (float)Math.PI, 0.0f));
        PartDefinition jointp11 = root.addOrReplaceChild("jointp11", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 3.5f, 19.1f));
        PartDefinition JD_2 = jointp11.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(331, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.4712389f, 0.0f));
        PartDefinition spop_4 = JD_2.addOrReplaceChild("spop_4", CubeListBuilder.create().texOffs(300, 31).addBox(-0.5f, -1.5f, -1.5f, 10, 3, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5061455f));
        PartDefinition spop_5 = spop_4.addOrReplaceChild("spop_5", CubeListBuilder.create().texOffs(102, 23).addBox(3.6f, -2.5f, -2.5f, 4, 5, 5), PartPose.offset(1.0f, 0.0f, 0.0f));
        PartDefinition mpop12 = root.addOrReplaceChild("mpop12", CubeListBuilder.create().texOffs(238, 0).addBox(-2.0f, -3.0f, -2.5f, 4, 6, 7), PartPose.offsetAndRotation(-11.5f, 19.5f, -13.3f, -0.5934119f, (float)Math.PI, 0.0f));
        PartDefinition mpop13 = root.addOrReplaceChild("mpop13", CubeListBuilder.create().texOffs(260, 0).addBox(-2.0f, -3.0f, -2.5f, 6, 5, 5), PartPose.offsetAndRotation(-11.5f, 16.5f, -6.7f, -0.5934119f, (float)Math.PI, 0.0f));
        PartDefinition mpop14 = root.addOrReplaceChild("mpop14", CubeListBuilder.create().texOffs(271, 0).addBox(-2.0f, -2.0f, -6.5f, 8, 6, 11), PartPose.offsetAndRotation(2.5f, 17.8f, -1.5f, -0.5934119f, (float)Math.PI, 0.0f));
        PartDefinition jointp15 = root.addOrReplaceChild("jointp15", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-9.0f, 5.5f, 12.1f));
        PartDefinition JD_3 = jointp15.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(335, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.8274333f, 0.0f));
        PartDefinition spop_6 = JD_3.addOrReplaceChild("spop_6", CubeListBuilder.create().texOffs(323, 34).addBox(-0.5f, -1.5f, -1.5f, 10, 3, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5235988f));
        PartDefinition spop_7 = spop_6.addOrReplaceChild("spop_7", CubeListBuilder.create().texOffs(210, 36).addBox(3.6f, -2.5f, -2.5f, 4, 5, 5), PartPose.offset(1.0f, 0.0f, 0.0f));
        PartDefinition mpop16 = root.addOrReplaceChild("mpop16", CubeListBuilder.create().texOffs(298, 0).addBox(-4.0f, -3.0f, -2.5f, 12, 6, 5), PartPose.offsetAndRotation(-2.5f, 10.4f, -27.3f, 0.6457718f, (float)Math.PI, 0.0f));
        PartDefinition jointp17 = root.addOrReplaceChild("jointp17", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-9.0f, -3.5f, 13.1f));
        PartDefinition JD_4 = jointp17.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(339, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.9670596f, 0.0f));
        PartDefinition spop_8 = JD_4.addOrReplaceChild("spop_8", CubeListBuilder.create().texOffs(228, 36).addBox(-0.5f, -1.5f, -1.5f, 10, 3, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4537856f));
        PartDefinition spop_9 = spop_8.addOrReplaceChild("spop_9", CubeListBuilder.create().texOffs(325, 40).addBox(3.6f, -2.5f, -2.5f, 4, 5, 5), PartPose.offset(1.0f, 0.0f, 0.0f));
        PartDefinition jointp18 = root.addOrReplaceChild("jointp18", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-9.0f, 1.5f, 19.1f));
        PartDefinition JD_5 = jointp18.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(343, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.7227137f, 0.0f));
        PartDefinition spop_10 = JD_5.addOrReplaceChild("spop_10", CubeListBuilder.create().texOffs(85, 37).addBox(-0.5f, -1.5f, -1.5f, 10, 3, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4712389f));
        PartDefinition spop_11 = spop_10.addOrReplaceChild("spop_11", CubeListBuilder.create().texOffs(210, 46).addBox(3.6f, -2.5f, -2.5f, 4, 5, 5), PartPose.offset(1.0f, 0.0f, 0.0f));
        PartDefinition mpop19 = root.addOrReplaceChild("mpop19", CubeListBuilder.create().texOffs(86, 9).addBox(-4.0f, -4.0f, -4.5f, 10, 6, 8), PartPose.offsetAndRotation(9.5f, 8.4f, -30.3f, 0.6457718f, (float)Math.PI, 0.0f));
        return LayerDefinition.create(mesh, 350, 140);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityParasiteBase parasite = (EntityParasiteBase)entity;
        this.taclejointFL1.zRot = 0.0f;
        this.taclejointFL2.xRot = 0.0f;
        this.taclejointFL3.xRot = 0.0f;
        this.taclejointFL4.xRot = 0.0f;
        this.taclejointBL1.zRot = 0.0f;
        this.taclejointBL2.xRot = 0.0f;
        this.taclejointBL3.xRot = 0.0f;
        this.taclejointBL4.xRot = 0.0f;
        this.taclejointFR1.zRot = 0.0f;
        this.taclejointFR2.xRot = 0.0f;
        this.taclejointFR3.xRot = 0.0f;
        this.taclejointFR4.xRot = 0.0f;
        this.taclejointBR1.zRot = 0.0f;
        this.taclejointBR2.xRot = 0.0f;
        this.taclejointBR3.xRot = 0.0f;
        this.taclejointBR4.xRot = 0.0f;
        this.jointLW.zRot = 0.0f;
        this.jointRW.zRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        i = 0;
        if (i == 0) {
            float f1 = Mth.sin((float)(ageInTicks * 0.06f + 0.0f)) * 0.1f;
            float f2 = Mth.sin((float)(ageInTicks * 0.04f + 8.0f)) * 0.1f;
            float f3 = Mth.sin((float)(ageInTicks * 0.09f + 4.0f)) * 0.1f;
            this.taclejointFL1.zRot = f1;
            this.taclejointFL2.xRot = f1;
            this.taclejointFL3.xRot = f1;
            this.taclejointFL4.xRot = f1;
            this.taclejointBL1.zRot = f2;
            this.taclejointBL2.xRot = f2;
            this.taclejointBL3.xRot = f2;
            this.taclejointBL4.xRot = f2;
            this.taclejointFR1.zRot = -1.0f * f1;
            this.taclejointFR2.xRot = -1.0f * f1;
            this.taclejointFR3.xRot = -1.0f * f1;
            this.taclejointFR4.xRot = -1.0f * f1;
            this.taclejointBR1.zRot = -1.0f * f2;
            this.taclejointBR2.xRot = -1.0f * f2;
            this.taclejointBR3.xRot = -1.0f * f2;
            this.taclejointBR4.xRot = -1.0f * f2;
            this.jointLW.zRot = f3;
            this.jointRW.zRot = -1.0f * f3;
        } else if (i == 1) {
            // empty if block
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
