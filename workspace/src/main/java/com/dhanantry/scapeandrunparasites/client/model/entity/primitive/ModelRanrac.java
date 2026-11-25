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

public class ModelRanrac extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "ranrac"), "main");
    private final ModelPart jointLALF1;
    private final ModelPart jointFRLX;
    private final ModelPart jointLA1;
    private final ModelPart jointRALF1;
    private final ModelPart jointFRL2;
    private final ModelPart jointMU;
    private final ModelPart jointLAY;
    private final ModelPart jointBLL1;
    private final ModelPart jointFLLX;
    private final ModelPart jointBRL2;
    private final ModelPart jointRAX;
    private final ModelPart jointLARF1;
    private final ModelPart jointRAY;
    private final ModelPart jointFLLY;
    private final ModelPart mainbody;
    private final ModelPart jointRA1;
    private final ModelPart jointRARF1;
    private final ModelPart jointBLL2;
    private final ModelPart jointFLL2;
    private final ModelPart jointLAMF1;
    private final ModelPart jointBLLX;
    private final ModelPart jointMD;
    private final ModelPart jointFRLY;
    private final ModelPart jointLAX;
    private final ModelPart jointFLL1;
    private final ModelPart jointFRL1;
    private final ModelPart jointBRLX;
    private final ModelPart jointRAMF1;
    private final ModelPart jointBRLY;
    private final ModelPart jointBLLY;
    private final ModelPart jointBRL1;
    private final float mainbodyBaseX;
    private final float mainbodyBaseY;
    private final float mainbodyBaseZ;

    public ModelRanrac(ModelPart root) {
        this.jointLALF1 = root.getChild("mainbody").getChild("bodyM").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("body_29").getChild("body_30").getChild("jointLA1").getChild("body_31").getChild("jointLA2").getChild("bodyH").getChild("jointLALF1");
        this.jointFRLX = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointFRLX");
        this.jointLA1 = root.getChild("mainbody").getChild("bodyM").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("body_29").getChild("body_30").getChild("jointLA1");
        this.jointRALF1 = root.getChild("mainbody").getChild("bodyM").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("body_38").getChild("body_39").getChild("jointRA1").getChild("body_40").getChild("jointRA2").getChild("bodyH_1").getChild("jointRALF1");
        this.jointFRL2 = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointFRLX").getChild("JD_2").getChild("jointFRLY").getChild("body_19").getChild("jointFRL1").getChild("body_20").getChild("jointFRL2");
        this.jointMU = root.getChild("mainbody").getChild("bodyM").getChild("body").getChild("jointH").getChild("head").getChild("jointMU");
        this.jointLAY = root.getChild("mainbody").getChild("bodyM").getChild("jointLAX").getChild("JD_4").getChild("jointLAY");
        this.jointBLL1 = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointBLLX").getChild("JD_1").getChild("jointBLLY").getChild("body_14").getChild("jointBLL1");
        this.jointFLLX = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointFLLX");
        this.jointBRL2 = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointBRLX").getChild("JD_3").getChild("jointBRLY").getChild("body_24").getChild("jointBRL1").getChild("body_25").getChild("jointBRL2");
        this.jointRAX = root.getChild("mainbody").getChild("bodyM").getChild("jointRAX");
        this.jointLARF1 = root.getChild("mainbody").getChild("bodyM").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("body_29").getChild("body_30").getChild("jointLA1").getChild("body_31").getChild("jointLA2").getChild("bodyH").getChild("jointLARF1");
        this.jointRAY = root.getChild("mainbody").getChild("bodyM").getChild("jointRAX").getChild("JD_5").getChild("jointRAY");
        this.jointFLLY = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointFLLX").getChild("JD").getChild("jointFLLY");
        this.mainbody = root.getChild("mainbody");
        this.jointRA1 = root.getChild("mainbody").getChild("bodyM").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("body_38").getChild("body_39").getChild("jointRA1");
        this.jointRARF1 = root.getChild("mainbody").getChild("bodyM").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("body_38").getChild("body_39").getChild("jointRA1").getChild("body_40").getChild("jointRA2").getChild("bodyH_1").getChild("jointRARF1");
        this.jointBLL2 = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointBLLX").getChild("JD_1").getChild("jointBLLY").getChild("body_14").getChild("jointBLL1").getChild("body_15").getChild("jointBLL2");
        this.jointFLL2 = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("body_2").getChild("jointFLL1").getChild("body_3").getChild("jointFLL2");
        this.jointLAMF1 = root.getChild("mainbody").getChild("bodyM").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("body_29").getChild("body_30").getChild("jointLA1").getChild("body_31").getChild("jointLA2").getChild("bodyH").getChild("jointLAMF1");
        this.jointBLLX = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointBLLX");
        this.jointMD = root.getChild("mainbody").getChild("bodyM").getChild("body").getChild("jointH").getChild("head").getChild("jointMD");
        this.jointFRLY = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointFRLX").getChild("JD_2").getChild("jointFRLY");
        this.jointLAX = root.getChild("mainbody").getChild("bodyM").getChild("jointLAX");
        this.jointFLL1 = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("body_2").getChild("jointFLL1");
        this.jointFRL1 = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointFRLX").getChild("JD_2").getChild("jointFRLY").getChild("body_19").getChild("jointFRL1");
        this.jointBRLX = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointBRLX");
        this.jointRAMF1 = root.getChild("mainbody").getChild("bodyM").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("body_38").getChild("body_39").getChild("jointRA1").getChild("body_40").getChild("jointRA2").getChild("bodyH_1").getChild("jointRAMF1");
        this.jointBRLY = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointBRLX").getChild("JD_3").getChild("jointBRLY");
        this.jointBLLY = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointBLLX").getChild("JD_1").getChild("jointBLLY");
        this.jointBRL1 = root.getChild("mainbody").getChild("bodyM").getChild("bodyL").getChild("jointBRLX").getChild("JD_3").getChild("jointBRLY").getChild("body_24").getChild("jointBRL1");
        this.mainbodyBaseX = 0.0f;
        this.mainbodyBaseY = -2.0f;
        this.mainbodyBaseZ = -4.0f;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, -2.0f, -4.0f, 0.0f, 1.5707964f, 0.0f));
                PartDefinition bodyM = mainbody.addOrReplaceChild("bodyM", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5f, -4.0f, -4.5f, 9, 8, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.31415927f));
                PartDefinition bodyL = bodyM.addOrReplaceChild("bodyL", CubeListBuilder.create().texOffs(36, 0).addBox(-6.8f, -1.2f, -3.5f, 12, 7, 7), PartPose.offsetAndRotation(-5.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.13962634f));
                PartDefinition jointFLLX = bodyL.addOrReplaceChild("jointFLLX", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.5f, 4.0f, 1.5f, 0.0f, 0.0f, -0.17453292f));
                PartDefinition JD = jointFLLX.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.15707964f, 0.0f));
                PartDefinition jointFLLY = JD.addOrReplaceChild("jointFLLY", CubeListBuilder.create().texOffs(75, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_2 = jointFLLY.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(100, 0).addBox(-1.0f, -1.0f, -2.0f, 2, 2, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.83775806f, 0.0f, 0.0f));
                PartDefinition jointFLL1 = body_2.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(85, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
                PartDefinition body_3 = jointFLL1.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(27, 14).addBox(-1.5f, -0.5f, -0.5f, 3, 2, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.1868238f, 0.0f, 0.0f));
                PartDefinition jointFLL2 = body_3.addOrReplaceChild("jointFLL2", CubeListBuilder.create().texOffs(100, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
                PartDefinition body_4 = jointFLL2.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(51, 14).addBox(-2.0f, -1.5f, -2.5f, 4, 3, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.5358897f, 0.0f, 0.0f));
                PartDefinition body_5 = body_4.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0f, -1.0f, -0.5f, 2, 2, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 5.0f, -0.19198622f, 0.0f, 0.0f));
                PartDefinition jointFLL3 = body_5.addOrReplaceChild("jointFLL3", CubeListBuilder.create().texOffs(104, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.5f));
                PartDefinition body_6 = jointFLL3.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(113, 0).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.62831855f, 0.0f, 0.0f));
                PartDefinition body_1 = bodyL.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(78, 0).addBox(-3.5f, -4.5f, -6.0f, 5, 12, 12), PartPose.offsetAndRotation(-4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4886922f));
                PartDefinition body_7 = body_1.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(60, 24).addBox(-3.5f, -6.5f, -7.5f, 4, 15, 15), PartPose.offsetAndRotation(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.19198622f));
                PartDefinition body_8 = body_7.addOrReplaceChild("body_8", CubeListBuilder.create().texOffs(14, 25).addBox(-3.5f, -8.2f, -9.0f, 4, 18, 18), PartPose.offsetAndRotation(-3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.10471976f));
                PartDefinition body_9 = body_8.addOrReplaceChild("body_9", CubeListBuilder.create().texOffs(82, 38).addBox(-2.5f, -7.5f, -8.0f, 4, 16, 16), PartPose.offsetAndRotation(-4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.05235988f));
                PartDefinition body_10 = body_9.addOrReplaceChild("body_10", CubeListBuilder.create().texOffs(44, 54).addBox(-4.0f, -6.3f, -7.0f, 4, 13, 14), PartPose.offsetAndRotation(-1.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.10471976f));
                PartDefinition body_11 = body_10.addOrReplaceChild("body_11", CubeListBuilder.create().texOffs(0, 61).addBox(-4.0f, -5.0f, -6.0f, 3, 10, 12), PartPose.offsetAndRotation(-2.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.10471976f));
                PartDefinition body_12 = body_11.addOrReplaceChild("body_12", CubeListBuilder.create().texOffs(83, 24).addBox(-2.5f, -4.0f, -3.0f, 5, 8, 6), PartPose.offsetAndRotation(-4.0f, 0.0f, 3.4f, 0.0f, 0.41887903f, -0.10471976f));
                PartDefinition body_13 = body_11.addOrReplaceChild("body_13", CubeListBuilder.create().texOffs(105, 24).addBox(-2.5f, -4.0f, -3.0f, 5, 8, 6), PartPose.offsetAndRotation(-4.0f, 0.0f, -3.4f, 0.0f, -0.41887903f, -0.10471976f));
                PartDefinition jointBLLX = bodyL.addOrReplaceChild("jointBLLX", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-1.0f, 4.0f, 1.5f, 0.0f, 0.0f, -0.17453292f));
                PartDefinition JD_1 = jointBLLX.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(113, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.6457718f, 0.0f));
                PartDefinition jointBLLY = JD_1.addOrReplaceChild("jointBLLY", CubeListBuilder.create().texOffs(120, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_14 = jointBLLY.addOrReplaceChild("body_14", CubeListBuilder.create().texOffs(40, 25).addBox(-1.0f, -1.0f, -2.0f, 2, 2, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.6806784f, 0.0f, 0.0f));
                PartDefinition jointBLL1 = body_14.addOrReplaceChild("jointBLL1", CubeListBuilder.create().texOffs(123, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
                PartDefinition body_15 = jointBLL1.addOrReplaceChild("body_15", CubeListBuilder.create().texOffs(18, 61).addBox(-1.5f, -0.5f, -0.5f, 3, 2, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.1868238f, 0.0f, 0.0f));
                PartDefinition jointBLL2 = body_15.addOrReplaceChild("jointBLL2", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
                PartDefinition body_16 = jointBLL2.addOrReplaceChild("body_16", CubeListBuilder.create().texOffs(80, 70).addBox(-2.0f, -1.5f, -2.5f, 4, 3, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.7802359f, 0.0f, 0.0f));
                PartDefinition body_17 = body_16.addOrReplaceChild("body_17", CubeListBuilder.create().texOffs(88, 70).addBox(-1.0f, -1.0f, -0.5f, 2, 2, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 5.0f, -0.19198622f, 0.0f, 0.0f));
                PartDefinition jointBLL3 = body_17.addOrReplaceChild("jointBLL3", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 15.5f));
                PartDefinition body_18 = jointBLL3.addOrReplaceChild("body_18", CubeListBuilder.create().texOffs(112, 11).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.62831855f, 0.0f, 0.0f));
                PartDefinition jointFRLX = bodyL.addOrReplaceChild("jointFRLX", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.5f, 4.0f, -1.5f, 0.0f, 0.0f, -0.17453292f));
                PartDefinition JD_2 = jointFRLX.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(27, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 2.984513f, 0.0f));
                PartDefinition jointFRLY = JD_2.addOrReplaceChild("jointFRLY", CubeListBuilder.create().texOffs(31, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_19 = jointFRLY.addOrReplaceChild("body_19", CubeListBuilder.create().texOffs(53, 27).addBox(-1.0f, -1.0f, -2.0f, 2, 2, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.83775806f, 0.0f, 0.0f));
                PartDefinition jointFRL1 = body_19.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(35, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
                PartDefinition body_20 = jointFRL1.addOrReplaceChild("body_20", CubeListBuilder.create().texOffs(21, 74).addBox(-1.5f, -0.5f, -0.5f, 3, 2, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.1868238f, 0.0f, 0.0f));
                PartDefinition jointFRL2 = body_20.addOrReplaceChild("jointFRL2", CubeListBuilder.create().texOffs(39, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
                PartDefinition body_21 = jointFRL2.addOrReplaceChild("body_21", CubeListBuilder.create().texOffs(37, 81).addBox(-2.0f, -1.5f, -2.5f, 4, 3, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.5358897f, 0.0f, 0.0f));
                PartDefinition body_22 = body_21.addOrReplaceChild("body_22", CubeListBuilder.create().texOffs(47, 81).addBox(-1.0f, -1.0f, -0.5f, 2, 2, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 5.0f, -0.19198622f, 0.0f, 0.0f));
                PartDefinition jointFRL3 = body_22.addOrReplaceChild("jointFRL3", CubeListBuilder.create().texOffs(67, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.5f));
                PartDefinition body_23 = jointFRL3.addOrReplaceChild("body_23", CubeListBuilder.create().texOffs(42, 14).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.62831855f, 0.0f, 0.0f));
                PartDefinition jointBRLX = bodyL.addOrReplaceChild("jointBRLX", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-1.0f, 4.0f, -1.5f, 0.0f, 0.0f, -0.17453292f));
                PartDefinition JD_3 = jointBRLX.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(71, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.4958208f, 0.0f));
                PartDefinition jointBRLY = JD_3.addOrReplaceChild("jointBRLY", CubeListBuilder.create().texOffs(75, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_24 = jointBRLY.addOrReplaceChild("body_24", CubeListBuilder.create().texOffs(65, 81).addBox(-1.0f, -1.0f, -2.0f, 2, 2, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.6806784f, 0.0f, 0.0f));
                PartDefinition jointBRL1 = body_24.addOrReplaceChild("jointBRL1", CubeListBuilder.create().texOffs(85, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
                PartDefinition body_25 = jointBRL1.addOrReplaceChild("body_25", CubeListBuilder.create().texOffs(0, 83).addBox(-1.5f, -0.5f, -0.5f, 3, 2, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.1868238f, 0.0f, 0.0f));
                PartDefinition jointBRL2 = body_25.addOrReplaceChild("jointBRL2", CubeListBuilder.create().texOffs(100, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
                PartDefinition body_26 = jointBRL2.addOrReplaceChild("body_26", CubeListBuilder.create().texOffs(18, 87).addBox(-2.0f, -1.5f, -2.5f, 4, 3, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.7802359f, 0.0f, 0.0f));
                PartDefinition body_27 = body_26.addOrReplaceChild("body_27", CubeListBuilder.create().texOffs(71, 88).addBox(-1.0f, -1.0f, -0.5f, 2, 2, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 5.0f, -0.19198622f, 0.0f, 0.0f));
                PartDefinition jointBRL3 = body_27.addOrReplaceChild("jointBRL3", CubeListBuilder.create().texOffs(104, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 15.5f));
                PartDefinition body_28 = jointBRL3.addOrReplaceChild("body_28", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.62831855f, 0.0f, 0.0f));
                PartDefinition jointLAX = bodyM.addOrReplaceChild("jointLAX", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(4.0f, 0.0f, 4.0f, 0.0f, 0.0f, -0.31415927f));
                PartDefinition JD_4 = jointLAX.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(113, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.4537856f, 0.0f));
                PartDefinition jointLAY = JD_4.addOrReplaceChild("jointLAY", CubeListBuilder.create().texOffs(120, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_29 = jointLAY.addOrReplaceChild("body_29", CubeListBuilder.create().texOffs(91, 88).addBox(-2.0f, -3.0f, -3.5f, 4, 5, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 2.0f, -0.55850536f, 0.0f, 0.0f));
                PartDefinition body_30 = body_29.addOrReplaceChild("body_30", CubeListBuilder.create().texOffs(0, 95).addBox(-1.5f, -1.0f, -0.5f, 3, 2, 11), PartPose.offset(0.0f, 0.0f, 2.0f));
                PartDefinition jointLA1 = body_30.addOrReplaceChild("jointLA1", CubeListBuilder.create().texOffs(123, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
                PartDefinition body_31 = jointLA1.addOrReplaceChild("body_31", CubeListBuilder.create().texOffs(26, 92).addBox(-1.0f, -1.0f, -0.5f, 2, 2, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.89011794f, 0.715585f, 0.0f));
                PartDefinition jointLA2 = body_31.addOrReplaceChild("jointLA2", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 15.5f));
                PartDefinition bodyH = jointLA2.addOrReplaceChild("bodyH", CubeListBuilder.create().texOffs(18, 17).addBox(-1.0f, -1.5f, -1.0f, 4, 3, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f));
                PartDefinition jointLALF1 = bodyH.addOrReplaceChild("jointLALF1", CubeListBuilder.create().texOffs(4, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.5f, -1.5f, 0.0f));
                PartDefinition body_32 = jointLALF1.addOrReplaceChild("body_32", CubeListBuilder.create().texOffs(113, 7).addBox(-0.5f, -0.5f, -0.5f, 4, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.57595867f, -0.6457718f));
                PartDefinition jointLALF2 = body_32.addOrReplaceChild("jointLALF2", CubeListBuilder.create().texOffs(35, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.5f, 0.0f, 0.0f));
                PartDefinition body_33 = jointLALF2.addOrReplaceChild("body_33", CubeListBuilder.create().texOffs(53, 25).addBox(-0.5f, -0.5f, -0.5f, 9, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -1.4835298f, 0.0f));
                PartDefinition jointLARF1 = bodyH.addOrReplaceChild("jointLARF1", CubeListBuilder.create().texOffs(27, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.5f, 1.5f, 0.0f));
                PartDefinition body_34 = jointLARF1.addOrReplaceChild("body_34", CubeListBuilder.create().texOffs(49, 14).addBox(-0.5f, -0.5f, -0.5f, 4, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.57595867f, 0.6457718f));
                PartDefinition jointLARF2 = body_34.addOrReplaceChild("jointLARF2", CubeListBuilder.create().texOffs(39, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.5f, 0.0f, 0.0f));
                PartDefinition body_35 = jointLARF2.addOrReplaceChild("body_35", CubeListBuilder.create().texOffs(112, 19).addBox(-0.5f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -1.4835298f, 0.0f));
                PartDefinition jointLAMF1 = bodyH.addOrReplaceChild("jointLAMF1", CubeListBuilder.create().texOffs(31, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.5f, 0.0f, 0.0f));
                PartDefinition body_36 = jointLAMF1.addOrReplaceChild("body_36", CubeListBuilder.create().texOffs(67, 14).addBox(-0.5f, -0.5f, -0.5f, 4, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.41887903f, 0.0f));
                PartDefinition jointLAMF2 = body_36.addOrReplaceChild("jointLAMF2", CubeListBuilder.create().texOffs(67, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.0f, 0.0f, 0.0f));
                PartDefinition body_37 = jointLAMF2.addOrReplaceChild("body_37", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5f, -0.5f, -0.5f, 7, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -1.0297443f, 0.0f));
                PartDefinition jointRAX = bodyM.addOrReplaceChild("jointRAX", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(4.0f, 0.0f, -4.0f, 0.0f, 0.0f, -0.31415927f));
                PartDefinition JD_5 = jointRAX.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(100, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 2.687807f, 0.0f));
                PartDefinition jointRAY = JD_5.addOrReplaceChild("jointRAY", CubeListBuilder.create().texOffs(104, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
                PartDefinition body_38 = jointRAY.addOrReplaceChild("body_38", CubeListBuilder.create().texOffs(100, 100).addBox(-2.0f, -3.0f, -3.5f, 4, 5, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 2.0f, -0.55850536f, 0.0f, 0.0f));
                PartDefinition body_39 = body_38.addOrReplaceChild("body_39", CubeListBuilder.create().texOffs(51, 99).addBox(-1.5f, -1.0f, -0.5f, 3, 2, 11), PartPose.offset(0.0f, 0.0f, 2.0f));
                PartDefinition jointRA1 = body_39.addOrReplaceChild("jointRA1", CubeListBuilder.create().texOffs(70, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
                PartDefinition body_40 = jointRA1.addOrReplaceChild("body_40", CubeListBuilder.create().texOffs(63, 106).addBox(-1.0f, -1.0f, -0.5f, 2, 2, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.89011794f, -0.715585f, 0.0f));
                PartDefinition jointRA2 = body_40.addOrReplaceChild("jointRA2", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 15.5f));
                PartDefinition bodyH_1 = jointRA2.addOrReplaceChild("bodyH_1", CubeListBuilder.create().texOffs(99, 24).addBox(-1.0f, -1.5f, -1.0f, 4, 3, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.6529005f, 0.0f));
                PartDefinition jointRARF1 = bodyH_1.addOrReplaceChild("jointRARF1", CubeListBuilder.create().texOffs(4, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.5f, -1.5f, 0.0f));
                PartDefinition body_41 = jointRARF1.addOrReplaceChild("body_41", CubeListBuilder.create().texOffs(49, 16).addBox(-0.5f, -0.5f, -0.5f, 4, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.57595867f, -0.6457718f));
                PartDefinition jointRARF2 = body_41.addOrReplaceChild("jointRARF2", CubeListBuilder.create().texOffs(100, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.5f, 0.0f, 0.0f));
                PartDefinition body_42 = jointRARF2.addOrReplaceChild("body_42", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5f, -0.5f, -0.5f, 9, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.4835298f, 0.0f));
                PartDefinition jointRALF1 = bodyH_1.addOrReplaceChild("jointRALF1", CubeListBuilder.create().texOffs(27, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.5f, 1.5f, 0.0f));
                PartDefinition body_43 = jointRALF1.addOrReplaceChild("body_43", CubeListBuilder.create().texOffs(67, 16).addBox(-0.5f, -0.5f, -0.5f, 4, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.57595867f, 0.6457718f));
                PartDefinition jointRALF2 = body_43.addOrReplaceChild("jointRALF2", CubeListBuilder.create().texOffs(104, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.5f, 0.0f, 0.0f));
                PartDefinition body_44 = jointRALF2.addOrReplaceChild("body_44", CubeListBuilder.create().texOffs(112, 21).addBox(-0.5f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.4835298f, 0.0f));
                PartDefinition jointRAMF1 = bodyH_1.addOrReplaceChild("jointRAMF1", CubeListBuilder.create().texOffs(31, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.5f, 0.0f, 0.0f));
                PartDefinition body_45 = jointRAMF1.addOrReplaceChild("body_45", CubeListBuilder.create().texOffs(67, 18).addBox(-0.5f, -0.5f, -0.5f, 4, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.41887903f, 0.0f));
                PartDefinition jointRAMF2 = body_45.addOrReplaceChild("jointRAMF2", CubeListBuilder.create().texOffs(123, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.0f, 0.0f, 0.0f));
                PartDefinition body_46 = jointRAMF2.addOrReplaceChild("body_46", CubeListBuilder.create().texOffs(16, 33).addBox(-0.5f, -0.5f, -0.5f, 7, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.0297443f, 0.0f));
                PartDefinition body = bodyM.addOrReplaceChild("body", CubeListBuilder.create().texOffs(74, 0).addBox(-1.5f, -2.0f, -2.5f, 3, 7, 5), PartPose.offset(8.0f, -3.0f, 0.0f));
                PartDefinition jointH = body.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(122, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.0f, -1.0f, 0.0f));
                PartDefinition head = jointH.addOrReplaceChild("head", CubeListBuilder.create().texOffs(106, 38).addBox(-1.5f, -2.5f, -3.5f, 3, 5, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.19198622f));
                PartDefinition jointMD = head.addOrReplaceChild("jointMD", CubeListBuilder.create().texOffs(112, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.0f, 2.0f, 0.0f));
                PartDefinition mouth = jointMD.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(17, 98).addBox(0.0f, -1.0f, -3.0f, 4, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4712389f));
                PartDefinition tooth = mouth.addOrReplaceChild("tooth", CubeListBuilder.create().texOffs(123, 12).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(3.5f, -0.5f, 2.2f, 0.20943952f, 0.0f, -2.740167f));
                PartDefinition tooth_1 = mouth.addOrReplaceChild("tooth_1", CubeListBuilder.create().texOffs(112, 13).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(3.5f, -0.5f, -2.2f, -0.20943952f, 0.0f, -2.740167f));
                PartDefinition tooth_2 = mouth.addOrReplaceChild("tooth_2", CubeListBuilder.create().texOffs(42, 14).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(3.5f, -0.5f, 0.7f, 0.13962634f, 0.0f, -2.740167f));
                PartDefinition tooth_3 = mouth.addOrReplaceChild("tooth_3", CubeListBuilder.create().texOffs(120, 14).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(3.5f, -0.5f, -0.7f, -0.13962634f, 0.0f, -2.740167f));
                PartDefinition tooth_4 = mouth.addOrReplaceChild("tooth_4", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offset(1.0f, 0.0f, 2.3f));
                PartDefinition tooth_5 = mouth.addOrReplaceChild("tooth_5", CubeListBuilder.create().texOffs(8, 17).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offset(2.4f, 0.0f, 2.3f));
                PartDefinition tooth_6 = mouth.addOrReplaceChild("tooth_6", CubeListBuilder.create().texOffs(30, 17).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offset(1.0f, 0.0f, -2.3f));
                PartDefinition tooth_7 = mouth.addOrReplaceChild("tooth_7", CubeListBuilder.create().texOffs(54, 18).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1), PartPose.offset(2.4f, 0.0f, -2.3f));
                PartDefinition jointMU = head.addOrReplaceChild("jointMU", CubeListBuilder.create().texOffs(120, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.0f, -1.0f, 0.0f));
                PartDefinition mouth_1 = jointMU.addOrReplaceChild("mouth_1", CubeListBuilder.create().texOffs(83, 106).addBox(0.0f, -1.0f, -3.0f, 4, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.27925268f));
                PartDefinition dec = mouth_1.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(18, 22).addBox(-1.0f, -1.0f, -2.5f, 2, 1, 5), PartPose.offsetAndRotation(2.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.27925268f));
        return LayerDefinition.create(mesh, 128, 128);
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
        float GD;
        float GS;
        EntityParasiteBase parasite = (EntityParasiteBase)entity;
        this.jointFLLX.yRot = 0.0f;
        this.jointFLLY.xRot = 0.0f;
        this.jointFLL1.xRot = 0.0f;
        this.jointFLL2.xRot = 0.0f;
        this.jointBLLX.yRot = 0.0f;
        this.jointBLLY.xRot = 0.0f;
        this.jointBLL1.xRot = 0.0f;
        this.jointBLL2.xRot = 0.0f;
        this.jointLAX.yRot = 0.0f;
        this.jointLAY.xRot = 0.0f;
        this.jointLA1.yRot = 0.0f;
        this.jointLA1.zRot = 0.0f;
        this.jointFRLX.yRot = 0.0f;
        this.jointFRLY.xRot = 0.0f;
        this.jointFRL1.xRot = 0.0f;
        this.jointFRL2.xRot = 0.0f;
        this.jointBRLX.yRot = 0.0f;
        this.jointBRLY.xRot = 0.0f;
        this.jointBRL1.xRot = 0.0f;
        this.jointBRL2.xRot = 0.0f;
        this.jointRAX.yRot = 0.0f;
        this.jointRAY.xRot = 0.0f;
        this.jointRA1.yRot = 0.0f;
        this.jointRA1.zRot = 0.0f;
        this.mainbody.xRot = 0.0f;
        this.mainbody.y = this.mainbodyBaseY + (0.0f);
        this.jointRALF1.yRot = 0.0f;
        this.jointRAMF1.yRot = 0.0f;
        this.jointRARF1.yRot = 0.0f;
        this.jointLALF1.yRot = 0.0f;
        this.jointLAMF1.yRot = 0.0f;
        this.jointLARF1.yRot = 0.0f;
        this.jointMU.zRot = 0.0f;
        this.jointMD.zRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                GS = 0.7f;
                GD = 0.3f;
                this.swingY(this.jointFLLX, 0.6f * GS, 1.2f * GD, 1, -0.6f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFLLY, 0.6f * GS, 0.8f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFLL1, 0.6f * GS, 1.2f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.6f * GS, 1.2f * GD, 1, -0.6f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRLY, 0.6f * GS, 0.8f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL1, 0.6f * GS, 1.2f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBLLX, 0.6f * GS, 1.2f * GD, -1, -0.6f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLLY, 0.6f * GS, 0.8f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL1, 0.6f * GS, 1.2f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBRLX, 0.6f * GS, 1.2f * GD, -1, -0.6f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRLY, 0.6f * GS, 0.8f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL1, 0.6f * GS, 1.2f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointRAX, 0.6f * GS, 0.8f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRAY, 0.6f * GS, 1.5f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointRA1, 0.6f * GS, 1.5f * GD, 1, -1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLAX, 0.6f * GS, 0.8f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointLAY, 0.6f * GS, 1.5f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLA1, 0.6f * GS, 1.5f * GD, 1, -1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 1.2f * GS, 1, limbSwing, limbSwingAmount, 0.04f);
                this.swingX(this.mainbody, 0.6f * GS, 0.3f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
            }
            this.jointMU.zRot = f1 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.2f;
            this.jointMD.zRot = f1 * -1.0f;
        }
        if (i == 1) {
            if (!parasite.getStillAni()) {
                GS = 0.7f;
                GD = 0.3f;
                this.swingY(this.jointFLLX, 0.6f * GS, 1.2f * GD, 1, -0.6f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFLLY, 0.6f * GS, 0.8f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFLL1, 0.6f * GS, 1.2f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.6f * GS, 1.2f * GD, 1, -0.6f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRLY, 0.6f * GS, 0.8f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL1, 0.6f * GS, 1.2f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBLLX, 0.6f * GS, 1.2f * GD, -1, -0.6f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLLY, 0.6f * GS, 0.8f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL1, 0.6f * GS, 1.2f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBRLX, 0.6f * GS, 1.2f * GD, -1, -0.6f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRLY, 0.6f * GS, 0.8f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL1, 0.6f * GS, 1.2f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointRAX, 0.6f * GS, 0.8f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRAY, 0.6f * GS, 1.5f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointRA1, 0.6f * GS, 1.5f * GD, 1, -1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLAX, 0.6f * GS, 0.8f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointLAY, 0.6f * GS, 1.5f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLA1, 0.6f * GS, 1.5f * GD, 1, -1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 1.2f * GS, 1, limbSwing, limbSwingAmount, 0.04f);
                this.swingX(this.mainbody, 0.6f * GS, 0.3f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
            }
            this.jointMU.zRot = f1 = Mth.cos((float)(ageInTicks * 0.4f)) * 0.2f - 0.4f;
            this.jointMD.zRot = f1 * -1.0f;
        } else if (i == 2) {
            if (!parasite.getStillAni()) {
                GS = 0.85f;
                GD = 0.3f;
                this.swingY(this.jointFLLX, 0.6f * GS, 1.2f * GD, 1, -0.6f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFLLY, 0.6f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFLL1, 0.6f * GS, 1.5f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.6f * GS, 1.2f * GD, 1, -0.6f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRLY, 0.6f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL1, 0.6f * GS, 1.5f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBLLX, 0.6f * GS, 1.2f * GD, -1, -0.6f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLLY, 0.6f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL1, 0.6f * GS, 1.5f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointBRLX, 0.6f * GS, 1.2f * GD, -1, -0.6f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRLY, 0.6f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL1, 0.6f * GS, 1.5f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointRAX, 0.6f * GS, 0.5f * GD, 1, 0.0f, -0.5f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRAY, 0.6f * GS, 0.5f * GD, -1, 0.0f, 0.5f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRA1, 0.6f * GS, 0.5f * GD, -1, 0.0f, 2.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointRA1, 0.6f * GS, 0.5f * GD, -1, 0.0f, 1.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLAX, 0.6f * GS, 0.5f * GD, 1, 0.0f, 0.5f, limbSwing, limbSwingAmount);
                this.swingX(this.jointLAY, 0.6f * GS, 0.5f * GD, 1, 0.0f, 0.5f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLA1, 0.6f * GS, 0.5f * GD, -1, 0.0f, -2.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLA1, 0.6f * GS, 0.5f * GD, -1, 0.0f, -1.0f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 1.2f * GS, 1, limbSwing, limbSwingAmount, 0.04f);
                this.swingX(this.mainbody, 0.6f * GS, 0.4f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
            }
            this.jointMU.zRot = f1 = Mth.cos((float)(ageInTicks * 0.4f)) * 0.2f - 0.4f;
            this.jointMD.zRot = f1 * -1.0f;
        } else if (i == 3) {
            f1 = Mth.sin((float)(ageInTicks * 0.3f + 2.0f)) * 0.2f;
            float f2 = Mth.sin((float)(ageInTicks * 0.15f + 2.0f)) * 0.2f;
            float f3 = Mth.sin((float)(ageInTicks * 0.3f)) * 0.8f;
            this.jointRAX.yRot = 0.0f;
            this.jointRAY.xRot = 0.5f + f1;
            this.jointRA1.zRot = 0.7f + f2;
            this.jointRA1.yRot = -0.7f + f3;
            this.jointRALF1.yRot = 0.6f + -1.0f * f3;
            this.jointRAMF1.yRot = 0.3f + -1.0f * f3;
            this.jointRARF1.yRot = 0.6f + -1.0f * f3;
            this.jointLAX.yRot = 0.0f;
            this.jointLAY.xRot = 0.5f + f1;
            this.jointLA1.zRot = -0.7f + f2;
            this.jointLA1.yRot = 0.7f + f3;
            this.jointLALF1.yRot = -0.6f + -1.0f * f3;
            this.jointLAMF1.yRot = -0.3f + -1.0f * f3;
            this.jointLARF1.yRot = -0.6f + -1.0f * f3;
            this.jointMU.zRot = f1 = Mth.cos((float)(ageInTicks * 0.4f)) * 0.2f - 0.7f;
            this.jointMD.zRot = f1 * -1.0f;
        }
        this.underground(parasite, ageInTicks, this.mainbody);
    }


    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}