package com.dhanantry.scapeandrunparasites.client.model.entity.deterrent;

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
import com.dhanantry.scapeandrunparasites.entity.monster.deterrent.EntityNak;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelNak extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "nak"), "main");
    private final ModelPart mainbody;
    private final ModelPart taclejointb1;
    private final ModelPart dec;
    private final ModelPart tentacle;
    private final ModelPart taclejointb2;
    private final ModelPart decttt;
    private final ModelPart jointLA;
    private final ModelPart jointA;
    private final ModelPart jointL;
    private final ModelPart jointdont;
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
    private final ModelPart jointdont_1;
    private final ModelPart arm_10;
    private final ModelPart jointA_1;
    private final ModelPart arm_11;
    private final ModelPart jointA_2;
    private final ModelPart arm_12;
    private final ModelPart jointA_3;
    private final ModelPart arm_13;
    private final ModelPart jointA_4;
    private final ModelPart arm_14;
    private final ModelPart jointA_5;
    private final ModelPart arm_15;
    private final ModelPart jointA_6;
    private final ModelPart arm_16;
    private final ModelPart jointA_7;
    private final ModelPart arm_17;
    private final ModelPart jointA_8;
    private final ModelPart arm_18;
    private final ModelPart arm_19;
    private final ModelPart jointdont_2;
    private final ModelPart arm_20;
    private final ModelPart jointL_1;
    private final ModelPart arm_21;
    private final ModelPart jointL_2;
    private final ModelPart arm_22;
    private final ModelPart jointL_3;
    private final ModelPart arm_23;
    private final ModelPart jointL_4;
    private final ModelPart arm_24;
    private final ModelPart jointL_5;
    private final ModelPart arm_25;
    private final ModelPart jointL_6;
    private final ModelPart arm_26;
    private final ModelPart jointL_7;
    private final ModelPart arm_27;
    private final ModelPart jointL_8;
    private final ModelPart arm_28;
    private final ModelPart arm_29;

    public ModelNak(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.taclejointb1 = root.getChild("mainbody").getChild("taclejointb1");
        this.dec = root.getChild("mainbody").getChild("dec");
        this.tentacle = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle");
        this.taclejointb2 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2");
        this.decttt = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt");
        this.jointLA = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA");
        this.jointA = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA");
        this.jointL = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL");
        this.jointdont = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont");
        this.arm = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm");
        this.jointLA_1 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1");
        this.arm_1 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1");
        this.jointLA_2 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2");
        this.arm_2 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2");
        this.jointLA_3 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3");
        this.arm_3 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3");
        this.jointLA_4 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4");
        this.arm_4 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4");
        this.jointLA_5 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5");
        this.arm_5 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5");
        this.jointLA_6 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6");
        this.arm_6 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6").getChild("arm_6");
        this.jointLA_7 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6").getChild("arm_6").getChild("jointLA_7");
        this.arm_7 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6").getChild("arm_6").getChild("jointLA_7").getChild("arm_7");
        this.jointLA_8 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6").getChild("arm_6").getChild("jointLA_7").getChild("arm_7").getChild("jointLA_8");
        this.arm_8 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6").getChild("arm_6").getChild("jointLA_7").getChild("arm_7").getChild("jointLA_8").getChild("arm_8");
        this.arm_9 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointLA").getChild("jointdont").getChild("arm").getChild("jointLA_1").getChild("arm_1").getChild("jointLA_2").getChild("arm_2").getChild("jointLA_3").getChild("arm_3").getChild("jointLA_4").getChild("arm_4").getChild("jointLA_5").getChild("arm_5").getChild("jointLA_6").getChild("arm_6").getChild("jointLA_7").getChild("arm_7").getChild("jointLA_8").getChild("arm_8").getChild("arm_9");
        this.jointdont_1 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1");
        this.arm_10 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10");
        this.jointA_1 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1");
        this.arm_11 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11");
        this.jointA_2 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2");
        this.arm_12 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12");
        this.jointA_3 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3");
        this.arm_13 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3").getChild("arm_13");
        this.jointA_4 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3").getChild("arm_13").getChild("jointA_4");
        this.arm_14 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3").getChild("arm_13").getChild("jointA_4").getChild("arm_14");
        this.jointA_5 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3").getChild("arm_13").getChild("jointA_4").getChild("arm_14").getChild("jointA_5");
        this.arm_15 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3").getChild("arm_13").getChild("jointA_4").getChild("arm_14").getChild("jointA_5").getChild("arm_15");
        this.jointA_6 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3").getChild("arm_13").getChild("jointA_4").getChild("arm_14").getChild("jointA_5").getChild("arm_15").getChild("jointA_6");
        this.arm_16 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3").getChild("arm_13").getChild("jointA_4").getChild("arm_14").getChild("jointA_5").getChild("arm_15").getChild("jointA_6").getChild("arm_16");
        this.jointA_7 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3").getChild("arm_13").getChild("jointA_4").getChild("arm_14").getChild("jointA_5").getChild("arm_15").getChild("jointA_6").getChild("arm_16").getChild("jointA_7");
        this.arm_17 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3").getChild("arm_13").getChild("jointA_4").getChild("arm_14").getChild("jointA_5").getChild("arm_15").getChild("jointA_6").getChild("arm_16").getChild("jointA_7").getChild("arm_17");
        this.jointA_8 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3").getChild("arm_13").getChild("jointA_4").getChild("arm_14").getChild("jointA_5").getChild("arm_15").getChild("jointA_6").getChild("arm_16").getChild("jointA_7").getChild("arm_17").getChild("jointA_8");
        this.arm_18 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3").getChild("arm_13").getChild("jointA_4").getChild("arm_14").getChild("jointA_5").getChild("arm_15").getChild("jointA_6").getChild("arm_16").getChild("jointA_7").getChild("arm_17").getChild("jointA_8").getChild("arm_18");
        this.arm_19 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointA").getChild("jointdont_1").getChild("arm_10").getChild("jointA_1").getChild("arm_11").getChild("jointA_2").getChild("arm_12").getChild("jointA_3").getChild("arm_13").getChild("jointA_4").getChild("arm_14").getChild("jointA_5").getChild("arm_15").getChild("jointA_6").getChild("arm_16").getChild("jointA_7").getChild("arm_17").getChild("jointA_8").getChild("arm_18").getChild("arm_19");
        this.jointdont_2 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2");
        this.arm_20 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20");
        this.jointL_1 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1");
        this.arm_21 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21");
        this.jointL_2 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2");
        this.arm_22 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22");
        this.jointL_3 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3");
        this.arm_23 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3").getChild("arm_23");
        this.jointL_4 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3").getChild("arm_23").getChild("jointL_4");
        this.arm_24 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3").getChild("arm_23").getChild("jointL_4").getChild("arm_24");
        this.jointL_5 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3").getChild("arm_23").getChild("jointL_4").getChild("arm_24").getChild("jointL_5");
        this.arm_25 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3").getChild("arm_23").getChild("jointL_4").getChild("arm_24").getChild("jointL_5").getChild("arm_25");
        this.jointL_6 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3").getChild("arm_23").getChild("jointL_4").getChild("arm_24").getChild("jointL_5").getChild("arm_25").getChild("jointL_6");
        this.arm_26 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3").getChild("arm_23").getChild("jointL_4").getChild("arm_24").getChild("jointL_5").getChild("arm_25").getChild("jointL_6").getChild("arm_26");
        this.jointL_7 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3").getChild("arm_23").getChild("jointL_4").getChild("arm_24").getChild("jointL_5").getChild("arm_25").getChild("jointL_6").getChild("arm_26").getChild("jointL_7");
        this.arm_27 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3").getChild("arm_23").getChild("jointL_4").getChild("arm_24").getChild("jointL_5").getChild("arm_25").getChild("jointL_6").getChild("arm_26").getChild("jointL_7").getChild("arm_27");
        this.jointL_8 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3").getChild("arm_23").getChild("jointL_4").getChild("arm_24").getChild("jointL_5").getChild("arm_25").getChild("jointL_6").getChild("arm_26").getChild("jointL_7").getChild("arm_27").getChild("jointL_8");
        this.arm_28 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3").getChild("arm_23").getChild("jointL_4").getChild("arm_24").getChild("jointL_5").getChild("arm_25").getChild("jointL_6").getChild("arm_26").getChild("jointL_7").getChild("arm_27").getChild("jointL_8").getChild("arm_28");
        this.arm_29 = root.getChild("mainbody").getChild("taclejointb1").getChild("tentacle").getChild("taclejointb2").getChild("decttt").getChild("jointL").getChild("jointdont_2").getChild("arm_20").getChild("jointL_1").getChild("arm_21").getChild("jointL_2").getChild("arm_22").getChild("jointL_3").getChild("arm_23").getChild("jointL_4").getChild("arm_24").getChild("jointL_5").getChild("arm_25").getChild("jointL_6").getChild("arm_26").getChild("jointL_7").getChild("arm_27").getChild("jointL_8").getChild("arm_28").getChild("arm_29");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 23.0f, 0.0f, 1.5707964f, 0.0f, 0.0f));
        PartDefinition dec = mainbody.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(3, 0).addBox(-3.5f, -3.5f, 0.0f, 7, 7, 5), PartPose.offset(0.0f, 0.0f, -4.0f));
        PartDefinition taclejointb1 = mainbody.addOrReplaceChild("taclejointb1", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tentacle = taclejointb1.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(27, 0).addBox(-2.0f, -2.0f, 0.0f, 4, 4, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition taclejointb2 = tentacle.addOrReplaceChild("taclejointb2", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition decttt = taclejointb2.addOrReplaceChild("decttt", CubeListBuilder.create().texOffs(22, 11).addBox(-2.5f, -1.5f, -2.0f, 5, 4, 5), PartPose.offsetAndRotation(0.0f, 1.0f, -1.0f, -0.75398225f, 0.0f, 0.0f));
        PartDefinition jointLA = decttt.addOrReplaceChild("jointLA", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, -1.5f, 1.0f));
        PartDefinition jointdont = jointLA.addOrReplaceChild("jointdont", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -1.5707964f, 0.0f));
        PartDefinition arm = jointdont.addOrReplaceChild("arm", CubeListBuilder.create().texOffs(37, 11).addBox(-2.0f, -1.0f, -1.0f, 11, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.50265485f, -0.56548667f));
        PartDefinition jointLA_1 = arm.addOrReplaceChild("jointLA_1", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 0.0f, 0.0f));
        PartDefinition arm_1 = jointLA_1.addOrReplaceChild("arm_1", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0f, -1.0f, -1.5f, 9, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.25132743f, -0.4607669f));
        PartDefinition jointLA_2 = arm_1.addOrReplaceChild("jointLA_2", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, 0.0f, 0.0f));
        PartDefinition arm_2 = jointLA_2.addOrReplaceChild("arm_2", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0f, -1.0f, -1.0f, 9, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.18849556f, 0.41887903f));
        PartDefinition jointLA_3 = arm_2.addOrReplaceChild("jointLA_3", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, 0.0f, 0.0f));
        PartDefinition arm_3 = jointLA_3.addOrReplaceChild("arm_3", CubeListBuilder.create().texOffs(42, 2).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.31415927f, 0.54454273f));
        PartDefinition jointLA_4 = arm_3.addOrReplaceChild("jointLA_4", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition arm_4 = jointLA_4.addOrReplaceChild("arm_4", CubeListBuilder.create().texOffs(49, 6).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.18849556f, 0.6073746f));
        PartDefinition jointLA_5 = arm_4.addOrReplaceChild("jointLA_5", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_5 = jointLA_5.addOrReplaceChild("arm_5", CubeListBuilder.create().texOffs(42, 15).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.31415927f, 0.6073746f));
        PartDefinition jointLA_6 = arm_5.addOrReplaceChild("jointLA_6", CubeListBuilder.create().texOffs(22, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_6 = jointLA_6.addOrReplaceChild("arm_6", CubeListBuilder.create().texOffs(40, 19).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.25132743f, 0.56199604f));
        PartDefinition jointLA_7 = arm_6.addOrReplaceChild("jointLA_7", CubeListBuilder.create().texOffs(26, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, 0.1f));
        PartDefinition arm_7 = jointLA_7.addOrReplaceChild("arm_7", CubeListBuilder.create().texOffs(22, 20).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.12566371f, 0.6073746f));
        PartDefinition jointLA_8 = arm_7.addOrReplaceChild("jointLA_8", CubeListBuilder.create().texOffs(30, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_8 = jointLA_8.addOrReplaceChild("arm_8", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.25132743f, 0.6073746f));
        PartDefinition arm_9 = arm_8.addOrReplaceChild("arm_9", CubeListBuilder.create().texOffs(35, 23).addBox(-0.5f, -1.0f, -0.5f, 8, 2, 1), PartPose.offsetAndRotation(4.0f, 0.0f, 0.0f, 0.0f, 0.31415927f, 0.37699112f));
        PartDefinition jointA = decttt.addOrReplaceChild("jointA", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.0f, -1.5f, 1.0f));
        PartDefinition jointdont_1 = jointA.addOrReplaceChild("jointdont_1", CubeListBuilder.create().texOffs(58, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -1.5707964f, 0.0f));
        PartDefinition arm_10 = jointdont_1.addOrReplaceChild("arm_10", CubeListBuilder.create().texOffs(0, 26).addBox(-2.0f, -1.0f, -1.0f, 11, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.25132743f, -0.25132743f));
        PartDefinition jointA_1 = arm_10.addOrReplaceChild("jointA_1", CubeListBuilder.create().texOffs(27, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 0.0f, 0.0f));
        PartDefinition arm_11 = jointA_1.addOrReplaceChild("arm_11", CubeListBuilder.create().texOffs(26, 26).addBox(-1.0f, -1.0f, -1.5f, 9, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.25132743f, -0.5864306f));
        PartDefinition jointA_2 = arm_11.addOrReplaceChild("jointA_2", CubeListBuilder.create().texOffs(30, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, 0.0f, 0.0f));
        PartDefinition arm_12 = jointA_2.addOrReplaceChild("arm_12", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0f, -1.0f, -1.0f, 9, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.25132743f, 0.41887903f));
        PartDefinition jointA_3 = arm_12.addOrReplaceChild("jointA_3", CubeListBuilder.create().texOffs(20, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, 0.0f, 0.0f));
        PartDefinition arm_13 = jointA_3.addOrReplaceChild("arm_13", CubeListBuilder.create().texOffs(22, 31).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.25132743f, 0.54454273f));
        PartDefinition jointA_4 = arm_13.addOrReplaceChild("jointA_4", CubeListBuilder.create().texOffs(23, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition arm_14 = jointA_4.addOrReplaceChild("arm_14", CubeListBuilder.create().texOffs(48, 29).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.18849556f, 0.6073746f));
        PartDefinition jointA_5 = arm_14.addOrReplaceChild("jointA_5", CubeListBuilder.create().texOffs(54, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_15 = jointA_5.addOrReplaceChild("arm_15", CubeListBuilder.create().texOffs(38, 33).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.18849556f, 0.6073746f));
        PartDefinition jointA_6 = arm_15.addOrReplaceChild("jointA_6", CubeListBuilder.create().texOffs(58, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_16 = jointA_6.addOrReplaceChild("arm_16", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.18849556f, 0.56199604f));
        PartDefinition jointA_7 = arm_16.addOrReplaceChild("jointA_7", CubeListBuilder.create().texOffs(56, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, -0.1f));
        PartDefinition arm_17 = jointA_7.addOrReplaceChild("arm_17", CubeListBuilder.create().texOffs(18, 35).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.18849556f, 0.6073746f));
        PartDefinition jointA_8 = arm_17.addOrReplaceChild("jointA_8", CubeListBuilder.create().texOffs(59, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_18 = jointA_8.addOrReplaceChild("arm_18", CubeListBuilder.create().texOffs(30, 37).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.18849556f, 0.6073746f));
        PartDefinition arm_19 = arm_18.addOrReplaceChild("arm_19", CubeListBuilder.create().texOffs(44, 37).addBox(-0.5f, -1.0f, -0.5f, 8, 2, 1), PartPose.offsetAndRotation(4.0f, 0.0f, 0.0f, 0.0f, -0.18849556f, 0.37699112f));
        PartDefinition jointL = decttt.addOrReplaceChild("jointL", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 2.5f, 1.0f));
        PartDefinition jointdont_2 = jointL.addOrReplaceChild("jointdont_2", CubeListBuilder.create().texOffs(56, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -1.5707964f, 0.0f));
        PartDefinition arm_20 = jointdont_2.addOrReplaceChild("arm_20", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0f, -1.0f, -1.0f, 10, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.12566371f, 0.0f));
        PartDefinition jointL_1 = arm_20.addOrReplaceChild("jointL_1", CubeListBuilder.create().texOffs(34, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 0.0f, 0.0f));
        PartDefinition arm_21 = jointL_1.addOrReplaceChild("arm_21", CubeListBuilder.create().texOffs(21, 41).addBox(-1.0f, -1.0f, -1.5f, 9, 2, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.18849556f, -0.5864306f));
        PartDefinition jointL_2 = arm_21.addOrReplaceChild("jointL_2", CubeListBuilder.create().texOffs(59, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, 0.0f, 0.0f));
        PartDefinition arm_22 = jointL_2.addOrReplaceChild("arm_22", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0f, -1.0f, -1.0f, 9, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.18849556f, -0.39793506f));
        PartDefinition jointL_3 = arm_22.addOrReplaceChild("jointL_3", CubeListBuilder.create().texOffs(12, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, 0.0f, 0.0f));
        PartDefinition arm_23 = jointL_3.addOrReplaceChild("arm_23", CubeListBuilder.create().texOffs(42, 40).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.25132743f, 0.54454273f));
        PartDefinition jointL_4 = arm_23.addOrReplaceChild("jointL_4", CubeListBuilder.create().texOffs(16, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition arm_24 = jointL_4.addOrReplaceChild("arm_24", CubeListBuilder.create().texOffs(43, 44).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.18849556f, 0.6073746f));
        PartDefinition jointL_5 = arm_24.addOrReplaceChild("jointL_5", CubeListBuilder.create().texOffs(57, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_25 = jointL_5.addOrReplaceChild("arm_25", CubeListBuilder.create().texOffs(20, 46).addBox(-1.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.25132743f, 0.6073746f));
        PartDefinition jointL_6 = arm_25.addOrReplaceChild("jointL_6", CubeListBuilder.create().texOffs(19, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition arm_26 = jointL_6.addOrReplaceChild("arm_26", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.18849556f, 0.56199604f));
        PartDefinition jointL_7 = arm_26.addOrReplaceChild("jointL_7", CubeListBuilder.create().texOffs(53, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, 0.1f));
        PartDefinition arm_27 = jointL_7.addOrReplaceChild("arm_27", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.25132743f, 0.6073746f));
        PartDefinition jointL_8 = arm_27.addOrReplaceChild("jointL_8", CubeListBuilder.create().texOffs(14, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition arm_28 = jointL_8.addOrReplaceChild("arm_28", CubeListBuilder.create().texOffs(16, 50).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.18849556f, 0.6073746f));
        PartDefinition arm_29 = arm_28.addOrReplaceChild("arm_29", CubeListBuilder.create().texOffs(34, 52).addBox(-0.5f, -1.0f, -0.5f, 9, 2, 1), PartPose.offsetAndRotation(6.0f, 0.0f, 0.0f, 0.0f, 0.18849556f, 0.37699112f));
        return LayerDefinition.create(mesh, 64, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityNak parasite = (EntityNak)entity;
        if (parasite.getTargetedEntity() == null) {
            float f1 = Mth.cos((float)(ageInTicks * 0.11095986f)) * 0.16429871f;
            float f2 = -1.0f * Mth.cos((float)(ageInTicks * 0.13986f)) * 0.17429872f;
            float f3 = Mth.cos((float)(ageInTicks * 0.0886f)) * 0.1472f;
            this.jointLA.xRot = f1;
            this.jointLA.yRot = f1 * 0.3f;
            this.jointLA_1.zRot = f1;
            this.jointLA_2.zRot = 0.0f;
            this.jointLA_3.zRot = f1;
            this.jointLA_5.zRot = f1;
            this.jointLA_7.zRot = f1;
            this.jointA.xRot = f2;
            this.jointA.yRot = f2 * -0.2333f;
            this.jointA_1.zRot = f2;
            this.jointA_2.zRot = 0.0f;
            this.jointA_3.zRot = f2;
            this.jointA_5.zRot = f2;
            this.jointA_7.zRot = f2;
            this.jointL.xRot = f3;
            this.jointL.yRot = f3 * 0.5f;
            this.jointL_1.zRot = f3;
            this.jointL_2.zRot = 0.0f;
            this.jointL_3.zRot = f3;
            this.jointL_5.zRot = f3;
            this.jointL_7.zRot = f3;
        } else {
            float f1 = Mth.cos((float)(ageInTicks * 0.1586f)) * 0.16429871f;
            float f2 = -1.0f * Mth.cos((float)(ageInTicks * 0.196f)) * 0.17429872f;
            float f3 = Mth.cos((float)(ageInTicks * 0.1716f)) * 0.1472f;
            this.jointLA.xRot = 0.5f + f1;
            this.jointLA.yRot = f1 * 0.3f;
            this.jointLA_1.zRot = -0.3f + f1;
            this.jointLA_2.zRot = -0.6f;
            this.jointLA_3.zRot = -1.0f + f1;
            this.jointLA_5.zRot = f1;
            this.jointLA_7.zRot = f1;
            this.jointA.xRot = 0.8f + f2;
            this.jointA.yRot = f2 * -0.2333f;
            this.jointA_1.zRot = -0.3f + f2;
            this.jointA_2.zRot = -0.6f;
            this.jointA_3.zRot = f2;
            this.jointA_5.zRot = f2;
            this.jointA_7.zRot = f2;
            this.jointL.xRot = 0.5f + f3;
            this.jointL.yRot = f3 * 0.5f;
            this.jointL_1.zRot = -0.3f + f3;
            this.jointL_2.zRot = -0.4f;
            this.jointL_3.zRot = -0.1f + f3;
            this.jointL_5.zRot = f3;
            this.jointL_7.zRot = f3;
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
