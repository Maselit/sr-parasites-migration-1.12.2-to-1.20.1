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
import com.dhanantry.scapeandrunparasites.entity.monster.pure.EntityFlog;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelFlog extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "flog"), "main");
    private final ModelPart mainbody;
    private final ModelPart bodym;
    private final ModelPart body;
    private final ModelPart jointLA;
    private final ModelPart jointRA;
    private final ModelPart jointLD;
    private final ModelPart jointRD;
    private final ModelPart jointBD;
    private final ModelPart jointFD;
    private final ModelPart body_1;
    private final ModelPart body_2;
    private final ModelPart body_3;
    private final ModelPart body_4;
    private final ModelPart body_5;
    private final ModelPart body_6;
    private final ModelPart body_7;
    private final ModelPart body_8;
    private final ModelPart jointLL1;
    private final ModelPart jointRL1;
    private final ModelPart jointdont;
    private final ModelPart leg;
    private final ModelPart jointLL2;
    private final ModelPart leg_1;
    private final ModelPart jointLL3;
    private final ModelPart leg_2;
    private final ModelPart leg_3;
    private final ModelPart leg_4;
    private final ModelPart jointdont_1;
    private final ModelPart leg_5;
    private final ModelPart jointRL2;
    private final ModelPart leg_6;
    private final ModelPart jointRL3;
    private final ModelPart leg_7;
    private final ModelPart leg_8;
    private final ModelPart leg_9;
    private final ModelPart jointdont_2;
    private final ModelPart arm;
    private final ModelPart jointLA_1;
    private final ModelPart arm_1;
    private final ModelPart jointLA_2;
    private final ModelPart arm_2;
    private final ModelPart jointLA_3;
    private final ModelPart arm_3;
    private final ModelPart jointLA_4;
    private final ModelPart arm_4;
    private final ModelPart jointLA_5;
    private final ModelPart arm_5;
    private final ModelPart jointLA_6;
    private final ModelPart arm_6;
    private final ModelPart jointLA_7;
    private final ModelPart arm_7;
    private final ModelPart jointLA_8;
    private final ModelPart arm_8;
    private final ModelPart arm_9;
    private final ModelPart jointdont_3;
    private final ModelPart arm_10;
    private final ModelPart jointRA_1;
    private final ModelPart arm_11;
    private final ModelPart jointRA_2;
    private final ModelPart arm_12;
    private final ModelPart jointRA_3;
    private final ModelPart arm_13;
    private final ModelPart jointRA_4;
    private final ModelPart arm_14;
    private final ModelPart jointRA_5;
    private final ModelPart arm_15;
    private final ModelPart jointRA_6;
    private final ModelPart arm_16;
    private final ModelPart jointRA_7;
    private final ModelPart arm_17;
    private final ModelPart jointRA_8;
    private final ModelPart arm_18;
    private final ModelPart arm_19;
    private final ModelPart body_9;
    private final ModelPart body_10;
    private final ModelPart body_11;
    private final ModelPart body_12;

    public ModelFlog(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.bodym = root.getChild("mainbody").getChild("bodym");
        this.body = root.getChild("mainbody").getChild("bodym").getChild("body");
        this.jointLA = root.getChild("mainbody").getChild("bodym").getChild("jointLA");
        this.jointRA = root.getChild("mainbody").getChild("bodym").getChild("jointRA");
        this.jointLD = root.getChild("mainbody").getChild("bodym").getChild("jointLD");
        this.jointRD = root.getChild("mainbody").getChild("bodym").getChild("jointRD");
        this.jointBD = root.getChild("mainbody").getChild("bodym").getChild("jointBD");
        this.jointFD = root.getChild("mainbody").getChild("bodym").getChild("jointFD");
        this.body_1 = root.getChild("mainbody").getChild("bodym").getChild("body_1");
        this.body_2 = root.getChild("mainbody").getChild("bodym").getChild("body_2");
        this.body_3 = root.getChild("mainbody").getChild("bodym").getChild("body_3");
        this.body_4 = root.getChild("mainbody").getChild("bodym").getChild("body_4");
        this.body_5 = root.getChild("mainbody").getChild("bodym").getChild("body_5");
        this.body_6 = root.getChild("mainbody").getChild("bodym").getChild("body_6");
        this.body_7 = root.getChild("mainbody").getChild("bodym").getChild("body_7");
        this.body_8 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8");
        this.jointLL1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointLL1");
        this.jointRL1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointRL1");
        this.jointdont = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointLL1").getChild("jointdont");
        this.leg = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointLL1").getChild("jointdont").getChild("leg");
        this.jointLL2 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointLL1").getChild("jointdont").getChild("leg").getChild("jointLL2");
        this.leg_1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointLL1").getChild("jointdont").getChild("leg").getChild("jointLL2").getChild("leg_1");
        this.jointLL3 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointLL1").getChild("jointdont").getChild("leg").getChild("jointLL2").getChild("leg_1").getChild("jointLL3");
        this.leg_2 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointLL1").getChild("jointdont").getChild("leg").getChild("jointLL2").getChild("leg_1").getChild("jointLL3").getChild("leg_2");
        this.leg_3 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointLL1").getChild("jointdont").getChild("leg").getChild("jointLL2").getChild("leg_1").getChild("jointLL3").getChild("leg_2").getChild("leg_3");
        this.leg_4 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointLL1").getChild("jointdont").getChild("leg").getChild("jointLL2").getChild("leg_1").getChild("jointLL3").getChild("leg_2").getChild("leg_3").getChild("leg_4");
        this.jointdont_1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointRL1").getChild("jointdont_1");
        this.leg_5 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointRL1").getChild("jointdont_1").getChild("leg_5");
        this.jointRL2 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointRL1").getChild("jointdont_1").getChild("leg_5").getChild("jointRL2");
        this.leg_6 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointRL1").getChild("jointdont_1").getChild("leg_5").getChild("jointRL2").getChild("leg_6");
        this.jointRL3 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointRL1").getChild("jointdont_1").getChild("leg_5").getChild("jointRL2").getChild("leg_6").getChild("jointRL3");
        this.leg_7 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointRL1").getChild("jointdont_1").getChild("leg_5").getChild("jointRL2").getChild("leg_6").getChild("jointRL3").getChild("leg_7");
        this.leg_8 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointRL1").getChild("jointdont_1").getChild("leg_5").getChild("jointRL2").getChild("leg_6").getChild("jointRL3").getChild("leg_7").getChild("leg_8");
        this.leg_9 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("body_8").getChild("jointRL1").getChild("jointdont_1").getChild("leg_5").getChild("jointRL2").getChild("leg_6").getChild("jointRL3").getChild("leg_7").getChild("leg_8").getChild("leg_9");
        this.jointdont_2 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2");
        this.arm = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm");
        this.jointLA_1 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1");
        this.arm_1 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1");
        this.jointLA_2 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2");
        this.arm_2 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2");
        this.jointLA_3 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3");
        this.arm_3 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3");
        this.jointLA_4 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4");
        this.arm_4 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4");
        this.jointLA_5 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5");
        this.arm_5 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5");
        this.jointLA_6 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6");
        this.arm_6 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6").getChild("arm_6");
        this.jointLA_7 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6").getChild("arm_6").getChild("jointLA_7");
        this.arm_7 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6").getChild("arm_6").getChild("jointLA_7").getChild("arm_7");
        this.jointLA_8 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6").getChild("arm_6").getChild("jointLA_7").getChild("arm_7").getChild("jointLA_8");
        this.arm_8 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6").getChild("arm_6").getChild("jointLA_7").getChild("arm_7").getChild("jointLA_8").getChild("arm_8");
        this.arm_9 = root.getChild("mainbody").getChild("bodym").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6").getChild("arm_6").getChild("jointLA_7").getChild("arm_7").getChild("jointLA_8").getChild("arm_8").getChild("arm_9");
        this.jointdont_3 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3");
        this.arm_10 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10");
        this.jointRA_1 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1");
        this.arm_11 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11");
        this.jointRA_2 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2");
        this.arm_12 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12");
        this.jointRA_3 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3");
        this.arm_13 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3").getChild("arm_13");
        this.jointRA_4 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3").getChild("arm_13").getChild("jointRA_4");
        this.arm_14 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3").getChild("arm_13").getChild("jointRA_4").getChild("arm_14");
        this.jointRA_5 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3").getChild("arm_13").getChild("jointRA_4").getChild("arm_14").getChild("jointRA_5");
        this.arm_15 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3").getChild("arm_13").getChild("jointRA_4").getChild("arm_14").getChild("jointRA_5").getChild("arm_15");
        this.jointRA_6 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3").getChild("arm_13").getChild("jointRA_4").getChild("arm_14").getChild("jointRA_5").getChild("arm_15").getChild("jointRA_6");
        this.arm_16 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3").getChild("arm_13").getChild("jointRA_4").getChild("arm_14").getChild("jointRA_5").getChild("arm_15").getChild("jointRA_6").getChild("arm_16");
        this.jointRA_7 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3").getChild("arm_13").getChild("jointRA_4").getChild("arm_14").getChild("jointRA_5").getChild("arm_15").getChild("jointRA_6").getChild("arm_16").getChild("jointRA_7");
        this.arm_17 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3").getChild("arm_13").getChild("jointRA_4").getChild("arm_14").getChild("jointRA_5").getChild("arm_15").getChild("jointRA_6").getChild("arm_16").getChild("jointRA_7").getChild("arm_17");
        this.jointRA_8 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3").getChild("arm_13").getChild("jointRA_4").getChild("arm_14").getChild("jointRA_5").getChild("arm_15").getChild("jointRA_6").getChild("arm_16").getChild("jointRA_7").getChild("arm_17").getChild("jointRA_8");
        this.arm_18 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3").getChild("arm_13").getChild("jointRA_4").getChild("arm_14").getChild("jointRA_5").getChild("arm_15").getChild("jointRA_6").getChild("arm_16").getChild("jointRA_7").getChild("arm_17").getChild("jointRA_8").getChild("arm_18");
        this.arm_19 = root.getChild("mainbody").getChild("bodym").getChild("jointRA").getChild("jointdont_3").getChild("arm_10").getChild("jointRA_1").getChild("arm_11").getChild("jointRA_2").getChild("arm_12").getChild("jointRA_3").getChild("arm_13").getChild("jointRA_4").getChild("arm_14").getChild("jointRA_5").getChild("arm_15").getChild("jointRA_6").getChild("arm_16").getChild("jointRA_7").getChild("arm_17").getChild("jointRA_8").getChild("arm_18").getChild("arm_19");
        this.body_9 = root.getChild("mainbody").getChild("bodym").getChild("jointLD").getChild("body_9");
        this.body_10 = root.getChild("mainbody").getChild("bodym").getChild("jointRD").getChild("body_10");
        this.body_11 = root.getChild("mainbody").getChild("bodym").getChild("jointBD").getChild("body_11");
        this.body_12 = root.getChild("mainbody").getChild("bodym").getChild("jointFD").getChild("body_12");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, -4.1f, 1.0f, 0.2443461f, 0.0f, 0.0f));
        PartDefinition bodym = mainbody.addOrReplaceChild("bodym", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -2.0f, -3.5f, 8, 7, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition body = bodym.addOrReplaceChild("body", CubeListBuilder.create().texOffs(30, 0).addBox(-3.0f, -2.0f, -3.0f, 6, 6, 5), PartPose.offsetAndRotation(0.0f, 5.0f, 0.0f, -0.40142572f, 0.0f, 0.0f));
        PartDefinition body_8 = body.addOrReplaceChild("body_8", CubeListBuilder.create().texOffs(40, 19).addBox(-2.0f, -2.0f, -2.5f, 4, 5, 4), PartPose.offsetAndRotation(0.0f, 5.5f, 0.0f, -0.15707964f, 0.0f, 0.0f));
        PartDefinition jointRL1 = body_8.addOrReplaceChild("jointRL1", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.7f, 1.5f, -0.4f));
        PartDefinition jointdont_1 = jointRL1.addOrReplaceChild("jointdont_1", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.06981317f, 0.0f));
        PartDefinition leg_5 = jointdont_1.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(68, 24).addBox(-1.5f, -1.0f, -1.5f, 3, 7, 3), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, -0.6806784f, 0.0f, 0.0f));
        PartDefinition jointRL2 = leg_5.addOrReplaceChild("jointRL2", CubeListBuilder.create().texOffs(23, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition leg_6 = jointRL2.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(29, 22).addBox(-1.0f, -1.2f, -1.5f, 2, 6, 3), PartPose.offsetAndRotation(0.0f, 1.4f, 0.3f, 1.727876f, 0.0f, 0.0f));
        PartDefinition jointRL3 = leg_6.addOrReplaceChild("jointRL3", CubeListBuilder.create().texOffs(27, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.8f, 0.0f));
        PartDefinition leg_7 = jointRL3.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(80, 24).addBox(-1.0f, -1.0f, -5.0f, 2, 2, 6), PartPose.offsetAndRotation(-0.2f, 0.0f, 0.0f, 0.0f, 0.06283186f, -0.12566371f));
        PartDefinition leg_8 = leg_7.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(14, 25).addBox(-1.5f, -2.0f, -2.0f, 3, 3, 4), PartPose.offsetAndRotation(0.0f, 1.0f, -8.0f, -1.0471976f, 0.0f, 0.0f));
        PartDefinition leg_9 = leg_8.addOrReplaceChild("leg_9", CubeListBuilder.create().texOffs(68, 7).addBox(-1.2f, -2.0f, -1.0f, 2, 3, 2), PartPose.offsetAndRotation(0.0f, -2.0f, 0.7f, -0.57595867f, 0.0f, 0.0f));
        PartDefinition jointLL1 = body_8.addOrReplaceChild("jointLL1", CubeListBuilder.create().texOffs(65, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.7f, 1.5f, -0.4f));
        PartDefinition jointdont = jointLL1.addOrReplaceChild("jointdont", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.06981317f, 0.0f));
        PartDefinition leg = jointdont.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(56, 19).addBox(-1.5f, -1.0f, -1.5f, 3, 7, 3), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, -0.6806784f, 0.0f, 0.0f));
        PartDefinition jointLL2 = leg.addOrReplaceChild("jointLL2", CubeListBuilder.create().texOffs(93, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition leg_1 = jointLL2.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(89, 3).addBox(-1.0f, -1.2f, -1.5f, 2, 6, 3), PartPose.offsetAndRotation(0.0f, 1.4f, 0.3f, 1.727876f, 0.0f, 0.0f));
        PartDefinition jointLL3 = leg_1.addOrReplaceChild("jointLL3", CubeListBuilder.create().texOffs(3, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.8f, 0.0f));
        PartDefinition leg_2 = jointLL3.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(16, 17).addBox(-1.0f, -1.0f, -5.0f, 2, 2, 6), PartPose.offsetAndRotation(0.2f, 0.0f, 0.0f, 0.0f, -0.06283186f, 0.12566371f));
        PartDefinition leg_3 = leg_2.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(0, 23).addBox(-1.5f, -2.0f, -2.0f, 3, 3, 4), PartPose.offsetAndRotation(0.0f, 1.0f, -8.0f, -1.0471976f, 0.0f, 0.0f));
        PartDefinition leg_4 = leg_3.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(78, 6).addBox(-0.8f, -2.0f, -1.0f, 2, 3, 2), PartPose.offsetAndRotation(0.0f, -2.0f, 0.7f, -0.57595867f, 0.0f, 0.0f));
        PartDefinition body_5 = bodym.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(69, 13).addBox(-3.0f, -2.2f, -0.5f, 8, 5, 6), PartPose.offsetAndRotation(-3.0f, 5.0f, 3.0f, 1.1833333f, 0.87964594f, -0.18849556f));
        PartDefinition body_1 = bodym.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(56, 0).addBox(-1.5f, -2.0f, -1.0f, 3, 4, 3), PartPose.offsetAndRotation(3.5f, 4.0f, 0.0f, 0.0f, 0.0f, -0.9075712f));
        PartDefinition jointFD = bodym.addOrReplaceChild("jointFD", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -3.0f, -1.5f));
        PartDefinition body_12 = jointFD.addOrReplaceChild("body_12", CubeListBuilder.create().texOffs(22, 58).addBox(-3.0f, -2.0f, -3.5f, 8, 6, 8), PartPose.offsetAndRotation(0.0f, 0.0f, -2.0f, 0.8063421f, 0.31415927f, 0.18849556f));
        PartDefinition body_6 = bodym.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(0, 14).addBox(-3.0f, -1.2f, -1.5f, 6, 4, 5), PartPose.offsetAndRotation(1.0f, 6.0f, 2.0f, 0.9320058f, 0.15358898f, -0.06283186f));
        PartDefinition body_7 = bodym.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(26, 11).addBox(-3.0f, -2.2f, -2.5f, 5, 6, 4), PartPose.offsetAndRotation(0.4f, 3.0f, -4.0f, 0.24085544f, 0.06283186f, 0.25132743f));
        PartDefinition jointLD = bodym.addOrReplaceChild("jointLD", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.0f, 0.0f, 1.0f));
        PartDefinition body_9 = jointLD.addOrReplaceChild("body_9", CubeListBuilder.create().texOffs(33, 46).addBox(-2.5f, -5.0f, -3.0f, 6, 5, 7), PartPose.offsetAndRotation(1.0f, 0.0f, -1.0f, 0.18849556f, -0.18849556f, 1.267109f));
        PartDefinition body_2 = bodym.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(68, 0).addBox(-1.5f, -2.0f, -1.0f, 3, 4, 3), PartPose.offsetAndRotation(-3.5f, 4.0f, 0.0f, 0.0f, 0.0f, 0.9075712f));
        PartDefinition jointLA = bodym.addOrReplaceChild("jointLA", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 4.5f, 0.0f));
        PartDefinition jointdont_2 = jointLA.addOrReplaceChild("jointdont_2", CubeListBuilder.create().texOffs(31, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.75398225f, 0.0f, 0.0f));
        PartDefinition arm = jointdont_2.addOrReplaceChild("arm", CubeListBuilder.create().texOffs(39, 28).addBox(0.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.9599311f, 0.5235988f));
        PartDefinition jointLA_1 = arm.addOrReplaceChild("jointLA_1", CubeListBuilder.create().texOffs(47, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(5.0f, 0.0f, 0.0f));
        PartDefinition arm_1 = jointLA_1.addOrReplaceChild("arm_1", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0f, -1.0f, -1.5f, 9, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.19198622f, -0.96342176f));
        PartDefinition jointLA_2 = arm_1.addOrReplaceChild("jointLA_2", CubeListBuilder.create().texOffs(51, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, 0.0f, 0.0f));
        PartDefinition arm_2 = jointLA_2.addOrReplaceChild("arm_2", CubeListBuilder.create().texOffs(24, 32).addBox(-1.0f, -1.0f, -1.0f, 9, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.12217305f, 0.41887903f));
        PartDefinition jointLA_3 = arm_2.addOrReplaceChild("jointLA_3", CubeListBuilder.create().texOffs(3, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, 0.0f, 0.0f));
        PartDefinition arm_3 = jointLA_3.addOrReplaceChild("arm_3", CubeListBuilder.create().texOffs(46, 32).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.12217305f, 0.54454273f));
        PartDefinition jointLA_4 = arm_3.addOrReplaceChild("jointLA_4", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition arm_4 = jointLA_4.addOrReplaceChild("arm_4", CubeListBuilder.create().texOffs(78, 32).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.12217305f, 0.6073746f));
        PartDefinition jointLA_5 = arm_4.addOrReplaceChild("jointLA_5", CubeListBuilder.create().texOffs(23, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_5 = jointLA_5.addOrReplaceChild("arm_5", CubeListBuilder.create().texOffs(62, 34).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.12217305f, 0.6073746f));
        PartDefinition jointLA_6 = arm_5.addOrReplaceChild("jointLA_6", CubeListBuilder.create().texOffs(52, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_6 = jointLA_6.addOrReplaceChild("arm_6", CubeListBuilder.create().texOffs(22, 36).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.12217305f, 0.56199604f));
        PartDefinition jointLA_7 = arm_6.addOrReplaceChild("jointLA_7", CubeListBuilder.create().texOffs(3, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition arm_7 = jointLA_7.addOrReplaceChild("arm_7", CubeListBuilder.create().texOffs(40, 36).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.12217305f, 0.6073746f));
        PartDefinition jointLA_8 = arm_7.addOrReplaceChild("jointLA_8", CubeListBuilder.create().texOffs(26, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_8 = jointLA_8.addOrReplaceChild("arm_8", CubeListBuilder.create().texOffs(74, 36).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.12217305f, 0.6073746f));
        PartDefinition arm_9 = arm_8.addOrReplaceChild("arm_9", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5f, -1.0f, -0.5f, 8, 2, 1), PartPose.offsetAndRotation(4.0f, 0.0f, 0.0f, 0.0f, 0.12217305f, 0.37699112f));
        PartDefinition body_4 = bodym.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(45, 7).addBox(-3.0f, -2.2f, -1.5f, 8, 5, 7), PartPose.offsetAndRotation(1.0f, 3.0f, 5.0f, 1.3089969f, 0.31415927f, 0.18849556f));
        PartDefinition jointRD = bodym.addOrReplaceChild("jointRD", CubeListBuilder.create().texOffs(47, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, 0.0f, 1.0f));
        PartDefinition body_10 = jointRD.addOrReplaceChild("body_10", CubeListBuilder.create().texOffs(0, 48).addBox(-3.5f, -3.8f, -4.0f, 7, 5, 8), PartPose.offsetAndRotation(1.0f, -1.0f, 0.0f, 0.0f, 0.54105204f, -1.134464f));
        PartDefinition jointRA = bodym.addOrReplaceChild("jointRA", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.0f, 4.5f, 0.0f));
        PartDefinition jointdont_3 = jointRA.addOrReplaceChild("jointdont_3", CubeListBuilder.create().texOffs(84, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.75398225f, 0.0f, 0.0f));
        PartDefinition arm_10 = jointdont_3.addOrReplaceChild("arm_10", CubeListBuilder.create().texOffs(52, 38).addBox(0.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 2.1816616f, -0.5235988f));
        PartDefinition jointRA_1 = arm_10.addOrReplaceChild("jointRA_1", CubeListBuilder.create().texOffs(74, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(5.0f, 0.0f, 0.0f));
        PartDefinition arm_11 = jointRA_1.addOrReplaceChild("arm_11", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0f, -1.0f, -1.5f, 9, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.19198622f, -0.96342176f));
        PartDefinition jointRA_2 = arm_11.addOrReplaceChild("jointRA_2", CubeListBuilder.create().texOffs(85, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, 0.0f, 0.0f));
        PartDefinition arm_12 = jointRA_2.addOrReplaceChild("arm_12", CubeListBuilder.create().texOffs(24, 40).addBox(-1.0f, -1.0f, -1.0f, 9, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.12217305f, 0.41887903f));
        PartDefinition jointRA_3 = arm_12.addOrReplaceChild("jointRA_3", CubeListBuilder.create().texOffs(40, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, 0.0f, 0.0f));
        PartDefinition arm_13 = jointRA_3.addOrReplaceChild("arm_13", CubeListBuilder.create().texOffs(64, 40).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.12217305f, 0.54454273f));
        PartDefinition jointRA_4 = arm_13.addOrReplaceChild("jointRA_4", CubeListBuilder.create().texOffs(44, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition arm_14 = jointRA_4.addOrReplaceChild("arm_14", CubeListBuilder.create().texOffs(82, 40).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.12217305f, 0.6073746f));
        PartDefinition jointRA_5 = arm_14.addOrReplaceChild("jointRA_5", CubeListBuilder.create().texOffs(48, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_15 = jointRA_5.addOrReplaceChild("arm_15", CubeListBuilder.create().texOffs(44, 42).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.12217305f, 0.6073746f));
        PartDefinition jointRA_6 = arm_15.addOrReplaceChild("jointRA_6", CubeListBuilder.create().texOffs(75, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_16 = jointRA_6.addOrReplaceChild("arm_16", CubeListBuilder.create().texOffs(22, 44).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.12217305f, 0.56199604f));
        PartDefinition jointRA_7 = arm_16.addOrReplaceChild("jointRA_7", CubeListBuilder.create().texOffs(79, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition arm_17 = jointRA_7.addOrReplaceChild("arm_17", CubeListBuilder.create().texOffs(56, 44).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.12217305f, 0.6073746f));
        PartDefinition jointRA_8 = arm_17.addOrReplaceChild("jointRA_8", CubeListBuilder.create().texOffs(68, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_18 = jointRA_8.addOrReplaceChild("arm_18", CubeListBuilder.create().texOffs(70, 44).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.12217305f, 0.6073746f));
        PartDefinition arm_19 = arm_18.addOrReplaceChild("arm_19", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5f, -1.0f, -0.5f, 8, 2, 1), PartPose.offsetAndRotation(4.0f, 0.0f, 0.0f, 0.0f, -0.12217305f, 0.37699112f));
        PartDefinition body_3 = bodym.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(80, 0).addBox(-1.5f, -2.0f, -1.0f, 3, 3, 3), PartPose.offsetAndRotation(0.0f, 3.5f, 2.4f, -0.9948377f, 0.0f, 0.0f));
        PartDefinition jointBD = bodym.addOrReplaceChild("jointBD", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -1.0f, 2.5f));
        PartDefinition body_11 = jointBD.addOrReplaceChild("body_11", CubeListBuilder.create().texOffs(59, 48).addBox(-4.5f, -5.5f, -3.5f, 7, 5, 7), PartPose.offsetAndRotation(4.0f, 0.0f, -1.0f, -0.62133723f, -0.25132743f, 0.18849556f));
        return LayerDefinition.create(mesh, 100, 75);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityFlog parasite = (EntityFlog)entity;
        this.jointLL1.xRot = 0.0f;
        this.jointLL2.xRot = 0.0f;
        this.jointRL1.xRot = 0.0f;
        this.jointRL2.xRot = 0.0f;
        this.mainbody.y = 0.0f;
        this.mainbody.zRot = 0.0f;
        this.mainbody.xRot = 0.2f;
        this.jointRA.xRot = 0.0f;
        this.jointRA.zRot = 0.0f;
        this.jointRA_2.zRot = 0.0f;
        this.jointRA_4.zRot = 0.0f;
        this.jointRA_6.zRot = 0.0f;
        this.jointLA.xRot = 0.0f;
        this.jointLA.zRot = 0.0f;
        this.jointLA_2.zRot = 0.0f;
        this.jointLA_4.zRot = 0.0f;
        this.jointLA_6.zRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                float GS = 1.9f;
                float GD = 1.0f;
                this.swingX(this.jointLL1, 0.3f * GS, 1.0f * GD, 1, 1.0f, 0.5f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL1, 0.3f * GS, 1.0f * GD, -1, 1.0f, 0.5f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.05f);
                this.swingX(this.jointLA, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointRA, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
            }
            float f1 = Mth.cos((float)(ageInTicks * 0.09119f)) * 0.21f;
            float f2 = Mth.cos((float)(ageInTicks * 0.0921f)) * 0.2f;
            this.jointLA.zRot = f1;
            this.jointLA_2.zRot = f1;
            this.jointLA_4.zRot = f1;
            this.jointLA_6.zRot = f1;
            this.jointRA.zRot = f2;
            this.jointRA_2.zRot = -1.0f * f2;
            this.jointRA_4.zRot = -1.0f * f2;
            this.jointRA_6.zRot = -1.0f * f2;
        } else if (i == 1) {
            if (!parasite.getStillAni()) {
                float GS = 1.9f;
                float GD = 1.0f;
                this.swingX(this.jointLL1, 0.3f * GS, 1.5f * GD, 1, 1.0f, 0.5f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL1, 0.3f * GS, 1.5f * GD, -1, 1.0f, 0.5f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.05f);
                this.swingX(this.jointLA, 0.3f * GS, 0.5f * GD, -1, 0.0f, -0.5f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLA_2, 0.3f * GS, 0.4f * GD, -1, 1.0f, -1.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLA_4, 0.3f * GS, 0.3f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLA_6, 0.3f * GS, 0.2f * GD, -1, 1.0f, -1.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRA, 0.3f * GS, 0.5f * GD, 1, 0.0f, -0.5f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRA_2, 0.3f * GS, 0.4f * GD, 1, 1.0f, -1.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRA_4, 0.3f * GS, 0.3f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRA_6, 0.3f * GS, 0.2f * GD, 1, 1.0f, -1.0f, limbSwing, limbSwingAmount);
            }
        } else if (i == 2) {
            if (!parasite.getStillAni()) {
                float GS = 1.9f;
                float GD = 1.0f;
                this.swingX(this.jointLL1, 0.3f * GS, 1.0f * GD, 1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL1, 0.3f * GS, 1.0f * GD, -1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.05f);
                this.mainbody.xRot = 0.5f;
                this.swingX(this.jointLA, 0.3f * GS, 0.2f * GD, -1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLA_2, 0.3f * GS, 0.4f * GD, -1, 1.0f, -1.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLA_4, 0.3f * GS, 0.3f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLA_6, 0.3f * GS, 0.2f * GD, -1, 1.0f, -1.0f, limbSwing, limbSwingAmount);
                this.jointLL1.xRot += -0.3f;
                this.swingX(this.jointRA, 0.3f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRA_2, 0.3f * GS, 0.4f * GD, 1, 1.0f, -1.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRA_4, 0.3f * GS, 0.3f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRA_6, 0.3f * GS, 0.2f * GD, 1, 1.0f, -1.0f, limbSwing, limbSwingAmount);
                this.jointRL1.xRot += -0.3f;
            }
        } else if (i != 3 && i == 10) {
            float f1 = Mth.cos((float)(ageInTicks * 0.19f)) * 0.21f;
            float f2 = Mth.cos((float)(ageInTicks * 0.21f)) * 0.2f;
            float f3 = Mth.cos((float)(ageInTicks * 0.18f)) * 0.23f;
            float f4 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.24f;
            this.mainbody.y = 0.0f;
            this.mainbody.zRot = 0.0f;
            f2 = 0.2f + Mth.cos((float)(ageInTicks * 0.38f)) * 0.35f;
            f3 = 0.2f + Mth.cos((float)(ageInTicks * 0.37f)) * 0.345f;
            f1 = 0.2f + Mth.cos((float)(ageInTicks * 0.372f)) * 0.06f;
            this.jointLL1.xRot = -0.7f + f1;
            this.jointLL2.xRot = -0.3f + f1;
            this.jointRL1.xRot = 0.9f + -1.0f * f1;
            this.jointRL2.xRot = 0.5f + -1.0f * f1;
            f1 = Mth.cos((float)(ageInTicks * 0.09119f)) * 0.21f;
            f2 = Mth.cos((float)(ageInTicks * 0.0921f)) * 0.2f;
            this.jointLA.zRot = f1;
            this.jointLA_2.zRot = f1;
            this.jointLA_4.zRot = f1;
            this.jointLA_6.zRot = f1;
            this.jointRA.zRot = f2;
            this.jointRA_2.zRot = -1.0f * f2;
            this.jointRA_4.zRot = -1.0f * f2;
            this.jointRA_6.zRot = -1.0f * f2;
        }
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
