package com.dhanantry.scapeandrunparasites.client.model.entity.ancient;

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

public class ModelOroncoTen extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "oroncoten"), "main");
    private final ModelPart bodytenbaseUR;
    private final ModelPart jointdont;
    private final ModelPart jointdont_1;
    private final ModelPart jointdont_2;
    private final ModelPart tentacle;
    private final ModelPart tentacle_1;
    private final ModelPart tacleJointUR1;
    private final ModelPart tentacle_2;
    private final ModelPart tacleJointUR2;
    private final ModelPart tentacle_3;
    private final ModelPart tacleJointUR3;
    private final ModelPart tentacle_4;
    private final ModelPart tacleJointUR4;
    private final ModelPart tentacle_5;
    private final ModelPart tacleJointUR5;
    private final ModelPart tentaclesplit;
    private final ModelPart tacleJointURRF1;
    private final ModelPart tacleJointURLF1;
    private final ModelPart tentacle_6;
    private final ModelPart tacleJointURRF2;
    private final ModelPart tentacle_7;
    private final ModelPart tacleJointURRF3;
    private final ModelPart tentacle_8;
    private final ModelPart tacleJointURRF4;
    private final ModelPart tentacle_9;
    private final ModelPart tacleJointURRF5;
    private final ModelPart tentacle_10;
    private final ModelPart tacleJointURRF6;
    private final ModelPart tentacle_11;
    private final ModelPart tacleJointURRF7;
    private final ModelPart tentacle_12;
    private final ModelPart tentacle_13;
    private final ModelPart tacleJointURLF2;
    private final ModelPart tentacle_14;
    private final ModelPart tacleJointURLF3;
    private final ModelPart tentacle_15;
    private final ModelPart tacleJointURLF4;
    private final ModelPart tentacle_16;
    private final ModelPart tacleJointURLF5;
    private final ModelPart tentacle_17;
    private final ModelPart tacleJointURLF6;
    private final ModelPart tentacle_18;
    private final ModelPart tacleJointURLF7;
    private final ModelPart tentacle_19;

    public ModelOroncoTen(ModelPart root) {
        this.bodytenbaseUR = root.getChild("bodytenbaseUR");
        this.jointdont = root.getChild("bodytenbaseUR").getChild("jointdont");
        this.jointdont_1 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1");
        this.jointdont_2 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2");
        this.tentacle = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle");
        this.tentacle_1 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1");
        this.tacleJointUR1 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1");
        this.tentacle_2 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2");
        this.tacleJointUR2 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2");
        this.tentacle_3 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3");
        this.tacleJointUR3 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3");
        this.tentacle_4 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4");
        this.tacleJointUR4 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4");
        this.tentacle_5 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5");
        this.tacleJointUR5 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5");
        this.tentaclesplit = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit");
        this.tacleJointURRF1 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1");
        this.tacleJointURLF1 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1");
        this.tentacle_6 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6");
        this.tacleJointURRF2 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6").getChild("tacleJointURRF2");
        this.tentacle_7 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6").getChild("tacleJointURRF2").getChild("tentacle_7");
        this.tacleJointURRF3 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6").getChild("tacleJointURRF2").getChild("tentacle_7").getChild("tacleJointURRF3");
        this.tentacle_8 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6").getChild("tacleJointURRF2").getChild("tentacle_7").getChild("tacleJointURRF3").getChild("tentacle_8");
        this.tacleJointURRF4 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6").getChild("tacleJointURRF2").getChild("tentacle_7").getChild("tacleJointURRF3").getChild("tentacle_8").getChild("tacleJointURRF4");
        this.tentacle_9 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6").getChild("tacleJointURRF2").getChild("tentacle_7").getChild("tacleJointURRF3").getChild("tentacle_8").getChild("tacleJointURRF4").getChild("tentacle_9");
        this.tacleJointURRF5 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6").getChild("tacleJointURRF2").getChild("tentacle_7").getChild("tacleJointURRF3").getChild("tentacle_8").getChild("tacleJointURRF4").getChild("tentacle_9").getChild("tacleJointURRF5");
        this.tentacle_10 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6").getChild("tacleJointURRF2").getChild("tentacle_7").getChild("tacleJointURRF3").getChild("tentacle_8").getChild("tacleJointURRF4").getChild("tentacle_9").getChild("tacleJointURRF5").getChild("tentacle_10");
        this.tacleJointURRF6 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6").getChild("tacleJointURRF2").getChild("tentacle_7").getChild("tacleJointURRF3").getChild("tentacle_8").getChild("tacleJointURRF4").getChild("tentacle_9").getChild("tacleJointURRF5").getChild("tentacle_10").getChild("tacleJointURRF6");
        this.tentacle_11 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6").getChild("tacleJointURRF2").getChild("tentacle_7").getChild("tacleJointURRF3").getChild("tentacle_8").getChild("tacleJointURRF4").getChild("tentacle_9").getChild("tacleJointURRF5").getChild("tentacle_10").getChild("tacleJointURRF6").getChild("tentacle_11");
        this.tacleJointURRF7 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6").getChild("tacleJointURRF2").getChild("tentacle_7").getChild("tacleJointURRF3").getChild("tentacle_8").getChild("tacleJointURRF4").getChild("tentacle_9").getChild("tacleJointURRF5").getChild("tentacle_10").getChild("tacleJointURRF6").getChild("tentacle_11").getChild("tacleJointURRF7");
        this.tentacle_12 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURRF1").getChild("tentacle_6").getChild("tacleJointURRF2").getChild("tentacle_7").getChild("tacleJointURRF3").getChild("tentacle_8").getChild("tacleJointURRF4").getChild("tentacle_9").getChild("tacleJointURRF5").getChild("tentacle_10").getChild("tacleJointURRF6").getChild("tentacle_11").getChild("tacleJointURRF7").getChild("tentacle_12");
        this.tentacle_13 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13");
        this.tacleJointURLF2 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13").getChild("tacleJointURLF2");
        this.tentacle_14 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13").getChild("tacleJointURLF2").getChild("tentacle_14");
        this.tacleJointURLF3 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13").getChild("tacleJointURLF2").getChild("tentacle_14").getChild("tacleJointURLF3");
        this.tentacle_15 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13").getChild("tacleJointURLF2").getChild("tentacle_14").getChild("tacleJointURLF3").getChild("tentacle_15");
        this.tacleJointURLF4 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13").getChild("tacleJointURLF2").getChild("tentacle_14").getChild("tacleJointURLF3").getChild("tentacle_15").getChild("tacleJointURLF4");
        this.tentacle_16 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13").getChild("tacleJointURLF2").getChild("tentacle_14").getChild("tacleJointURLF3").getChild("tentacle_15").getChild("tacleJointURLF4").getChild("tentacle_16");
        this.tacleJointURLF5 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13").getChild("tacleJointURLF2").getChild("tentacle_14").getChild("tacleJointURLF3").getChild("tentacle_15").getChild("tacleJointURLF4").getChild("tentacle_16").getChild("tacleJointURLF5");
        this.tentacle_17 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13").getChild("tacleJointURLF2").getChild("tentacle_14").getChild("tacleJointURLF3").getChild("tentacle_15").getChild("tacleJointURLF4").getChild("tentacle_16").getChild("tacleJointURLF5").getChild("tentacle_17");
        this.tacleJointURLF6 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13").getChild("tacleJointURLF2").getChild("tentacle_14").getChild("tacleJointURLF3").getChild("tentacle_15").getChild("tacleJointURLF4").getChild("tentacle_16").getChild("tacleJointURLF5").getChild("tentacle_17").getChild("tacleJointURLF6");
        this.tentacle_18 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13").getChild("tacleJointURLF2").getChild("tentacle_14").getChild("tacleJointURLF3").getChild("tentacle_15").getChild("tacleJointURLF4").getChild("tentacle_16").getChild("tacleJointURLF5").getChild("tentacle_17").getChild("tacleJointURLF6").getChild("tentacle_18");
        this.tacleJointURLF7 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13").getChild("tacleJointURLF2").getChild("tentacle_14").getChild("tacleJointURLF3").getChild("tentacle_15").getChild("tacleJointURLF4").getChild("tentacle_16").getChild("tacleJointURLF5").getChild("tentacle_17").getChild("tacleJointURLF6").getChild("tentacle_18").getChild("tacleJointURLF7");
        this.tentacle_19 = root.getChild("bodytenbaseUR").getChild("jointdont").getChild("jointdont_1").getChild("jointdont_2").getChild("tentacle").getChild("tentacle_1").getChild("tacleJointUR1").getChild("tentacle_2").getChild("tacleJointUR2").getChild("tentacle_3").getChild("tacleJointUR3").getChild("tentacle_4").getChild("tacleJointUR4").getChild("tentacle_5").getChild("tacleJointUR5").getChild("tentaclesplit").getChild("tacleJointURLF1").getChild("tentacle_13").getChild("tacleJointURLF2").getChild("tentacle_14").getChild("tacleJointURLF3").getChild("tentacle_15").getChild("tacleJointURLF4").getChild("tentacle_16").getChild("tacleJointURLF5").getChild("tentacle_17").getChild("tacleJointURLF6").getChild("tentacle_18").getChild("tacleJointURLF7").getChild("tentacle_19");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition bodytenbaseUR = root.addOrReplaceChild("bodytenbaseUR", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0f, -6.0f, -2.5f, 12, 12, 5), PartPose.offsetAndRotation(0.0f, -12.5f, 40.0f, -1.850049f, (float)Math.PI, 0.0f));
        PartDefinition jointdont = bodytenbaseUR.addOrReplaceChild("jointdont", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition jointdont_1 = jointdont.addOrReplaceChild("jointdont_1", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition jointdont_2 = jointdont_1.addOrReplaceChild("jointdont_2", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tentacle = jointdont_2.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(34, 0).addBox(-4.0f, -4.0f, -7.5f, 8, 8, 9), PartPose.offset(0.0f, 0.0f, -0.5f));
        PartDefinition tentacle_1 = tentacle.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(68, 0).addBox(-3.5f, -3.5f, -1.0f, 7, 7, 8), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tacleJointUR1 = tentacle_1.addOrReplaceChild("tacleJointUR1", CubeListBuilder.create().texOffs(37, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tentacle_2 = tacleJointUR1.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(98, 0).addBox(-3.0f, -3.0f, -1.0f, 6, 6, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointUR2 = tentacle_2.addOrReplaceChild("tacleJointUR2", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tentacle_3 = tacleJointUR2.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(126, 0).addBox(-4.5f, -3.5f, -1.0f, 9, 7, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointUR3 = tentacle_3.addOrReplaceChild("tacleJointUR3", CubeListBuilder.create().texOffs(63, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tentacle_4 = tacleJointUR3.addOrReplaceChild("tentacle_4", CubeListBuilder.create().texOffs(164, 0).addBox(-5.0f, -4.0f, -1.0f, 10, 8, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointUR4 = tentacle_4.addOrReplaceChild("tacleJointUR4", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_5 = tacleJointUR4.addOrReplaceChild("tentacle_5", CubeListBuilder.create().texOffs(206, 0).addBox(-5.5f, -4.5f, -1.0f, 11, 9, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointUR5 = tentacle_5.addOrReplaceChild("tacleJointUR5", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentaclesplit = tacleJointUR5.addOrReplaceChild("tentaclesplit", CubeListBuilder.create().texOffs(82, 14).addBox(-6.5f, -5.0f, -1.0f, 13, 10, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointURRF1 = tentaclesplit.addOrReplaceChild("tacleJointURRF1", CubeListBuilder.create().texOffs(90, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.7f, 0.0f, 14.0f));
        PartDefinition tentacle_6 = tacleJointURRF1.addOrReplaceChild("tentacle_6", CubeListBuilder.create().texOffs(0, 17).addBox(-4.0f, -4.0f, -2.0f, 8, 8, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, -0.20943952f, 0.0f));
        PartDefinition tacleJointURRF2 = tentacle_6.addOrReplaceChild("tacleJointURRF2", CubeListBuilder.create().texOffs(98, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 14.0f));
        PartDefinition tentacle_7 = tacleJointURRF2.addOrReplaceChild("tentacle_7", CubeListBuilder.create().texOffs(140, 19).addBox(-4.5f, -4.5f, -1.0f, 9, 9, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, (float)Math.PI / 180, 0.0f, 0.0f));
        PartDefinition tacleJointURRF3 = tentacle_7.addOrReplaceChild("tacleJointURRF3", CubeListBuilder.create().texOffs(102, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
        PartDefinition tentacle_8 = tacleJointURRF3.addOrReplaceChild("tentacle_8", CubeListBuilder.create().texOffs(184, 21).addBox(-4.0f, -4.0f, -1.0f, 8, 8, 15), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointURRF4 = tentacle_8.addOrReplaceChild("tacleJointURRF4", CubeListBuilder.create().texOffs(118, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
        PartDefinition tentacle_9 = tacleJointURRF4.addOrReplaceChild("tentacle_9", CubeListBuilder.create().texOffs(48, 25).addBox(-3.5f, -3.5f, -1.0f, 7, 7, 15), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointURRF5 = tentacle_9.addOrReplaceChild("tacleJointURRF5", CubeListBuilder.create().texOffs(122, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
        PartDefinition tentacle_10 = tacleJointURRF5.addOrReplaceChild("tentacle_10", CubeListBuilder.create().texOffs(77, 40).addBox(-3.0f, -3.0f, -1.0f, 6, 6, 15), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointURRF6 = tentacle_10.addOrReplaceChild("tacleJointURRF6", CubeListBuilder.create().texOffs(126, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
        PartDefinition tentacle_11 = tacleJointURRF6.addOrReplaceChild("tentacle_11", CubeListBuilder.create().texOffs(215, 29).addBox(-2.5f, -2.5f, -1.0f, 5, 5, 15), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointURRF7 = tentacle_11.addOrReplaceChild("tacleJointURRF7", CubeListBuilder.create().texOffs(130, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
        PartDefinition tentacle_12 = tacleJointURRF7.addOrReplaceChild("tentacle_12", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 19), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointURLF1 = tentaclesplit.addOrReplaceChild("tacleJointURLF1", CubeListBuilder.create().texOffs(94, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.7f, 0.0f, 14.0f));
        PartDefinition tentacle_13 = tacleJointURLF1.addOrReplaceChild("tentacle_13", CubeListBuilder.create().texOffs(119, 41).addBox(-4.0f, -4.0f, -2.0f, 8, 8, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.20943952f, 0.0f));
        PartDefinition tacleJointURLF2 = tentacle_13.addOrReplaceChild("tacleJointURLF2", CubeListBuilder.create().texOffs(154, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 12.0f));
        PartDefinition tentacle_14 = tacleJointURLF2.addOrReplaceChild("tentacle_14", CubeListBuilder.create().texOffs(163, 44).addBox(-4.5f, -4.5f, -1.0f, 9, 9, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, (float)Math.PI / 180, 0.0f, 0.0f));
        PartDefinition tacleJointURLF3 = tentacle_14.addOrReplaceChild("tacleJointURLF3", CubeListBuilder.create().texOffs(158, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_15 = tacleJointURLF3.addOrReplaceChild("tentacle_15", CubeListBuilder.create().texOffs(44, 48).addBox(-4.0f, -4.0f, -1.0f, 8, 8, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointURLF4 = tentacle_15.addOrReplaceChild("tacleJointURLF4", CubeListBuilder.create().texOffs(162, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
        PartDefinition tentacle_16 = tacleJointURLF4.addOrReplaceChild("tentacle_16", CubeListBuilder.create().texOffs(203, 49).addBox(-3.5f, -3.5f, -1.0f, 7, 7, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointURLF5 = tentacle_16.addOrReplaceChild("tacleJointURLF5", CubeListBuilder.create().texOffs(166, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
        PartDefinition tentacle_17 = tacleJointURLF5.addOrReplaceChild("tentacle_17", CubeListBuilder.create().texOffs(73, 61).addBox(-3.0f, -3.0f, -1.0f, 6, 6, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointURLF6 = tentacle_17.addOrReplaceChild("tacleJointURLF6", CubeListBuilder.create().texOffs(170, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
        PartDefinition tentacle_18 = tacleJointURLF6.addOrReplaceChild("tentacle_18", CubeListBuilder.create().texOffs(0, 63).addBox(-2.5f, -2.5f, -1.0f, 5, 5, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition tacleJointURLF7 = tentacle_18.addOrReplaceChild("tacleJointURLF7", CubeListBuilder.create().texOffs(195, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
        PartDefinition tentacle_19 = tacleJointURLF7.addOrReplaceChild("tentacle_19", CubeListBuilder.create().texOffs(94, 63).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 17), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 256, 85);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    
    }

    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bodytenbaseUR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
