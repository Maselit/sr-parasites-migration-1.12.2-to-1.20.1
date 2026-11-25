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
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelDodT extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "dodt"), "main");
    private final ModelPart mainbody;
    private final ModelPart taclejointB;
    private final ModelPart dec;
    private final ModelPart tentacle;
    private final ModelPart taclejointB_1;
    private final ModelPart dec_1;
    private final ModelPart tentacle111;
    private final ModelPart taclejointB_2;
    private final ModelPart tentacle_1;
    private final ModelPart taclejointB_3;
    private final ModelPart tentacle2;
    private final ModelPart taclejointB_4;
    private final ModelPart tentacle_2;
    private final ModelPart taclejointB_5;
    private final ModelPart tentacle_3;
    private final ModelPart decttt;
    private final ModelPart decb;
    private final ModelPart jd;
    private final ModelPart jd_1;
    private final ModelPart jd_2;
    private final ModelPart jd_3;
    private final ModelPart jd_4;
    private final ModelPart jd_5;
    private final ModelPart jd_6;
    private final ModelPart dec_2;
    private final ModelPart dec_3;
    private final ModelPart dec_4;
    private final ModelPart dec_5;
    private final ModelPart hair;
    private final ModelPart hjointA;
    private final ModelPart hair_1;
    private final ModelPart hjointA_1;
    private final ModelPart hair_2;
    private final ModelPart hjointA_2;
    private final ModelPart hair_3;
    private final ModelPart hjointA_3;
    private final ModelPart hair_4;
    private final ModelPart hjointA_4;
    private final ModelPart hair_5;
    private final ModelPart hair_6;
    private final ModelPart hjointB;
    private final ModelPart hair_7;
    private final ModelPart hjointB_1;
    private final ModelPart hair_8;
    private final ModelPart hjointB_2;
    private final ModelPart hair_9;
    private final ModelPart hjointB_3;
    private final ModelPart hair_10;
    private final ModelPart hjointB_4;
    private final ModelPart hair_11;
    private final ModelPart hair_12;
    private final ModelPart hjointC;
    private final ModelPart hair_13;
    private final ModelPart hjointC_1;
    private final ModelPart hair_14;
    private final ModelPart hjointC_2;
    private final ModelPart hair_15;
    private final ModelPart hjointC_3;
    private final ModelPart hair_16;
    private final ModelPart hjointC_4;
    private final ModelPart hair_17;
    private final ModelPart hair_18;
    private final ModelPart hjointD;
    private final ModelPart hair_19;
    private final ModelPart hjointD_1;
    private final ModelPart hair_20;
    private final ModelPart hjointD_2;
    private final ModelPart hair_21;
    private final ModelPart hjointD_3;
    private final ModelPart hair_22;
    private final ModelPart hjointD_4;
    private final ModelPart hair_23;
    private final ModelPart hair_24;
    private final ModelPart hjointE;
    private final ModelPart hair_25;
    private final ModelPart hjointE_1;
    private final ModelPart hair_26;
    private final ModelPart hjointE_2;
    private final ModelPart hair_27;
    private final ModelPart hjointE_3;
    private final ModelPart hair_28;
    private final ModelPart hjointE_4;
    private final ModelPart hair_29;
    private final ModelPart hair_30;
    private final ModelPart hjointF;
    private final ModelPart hair_31;
    private final ModelPart hjointF_1;
    private final ModelPart hair_32;
    private final ModelPart hjointF_2;
    private final ModelPart hair_33;
    private final ModelPart hjointF_3;
    private final ModelPart hair_34;
    private final ModelPart hjointF_4;
    private final ModelPart hair_35;
    private final ModelPart hair_36;
    private final ModelPart hjointG;
    private final ModelPart hair_37;
    private final ModelPart hjointG_1;
    private final ModelPart hair_38;
    private final ModelPart hjointG_2;
    private final ModelPart hair_39;
    private final ModelPart hjointG_3;
    private final ModelPart hair_40;
    private final ModelPart hjointG_4;
    private final ModelPart hair_41;

    public ModelDodT(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.taclejointB = root.getChild("mainbody").getChild("taclejointB");
        this.dec = root.getChild("mainbody").getChild("dec");
        this.tentacle = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle");
        this.taclejointB_1 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1");
        this.dec_1 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("dec_1");
        this.tentacle111 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111");
        this.taclejointB_2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2");
        this.tentacle_1 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1");
        this.taclejointB_3 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3");
        this.tentacle2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2");
        this.taclejointB_4 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4");
        this.tentacle_2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2");
        this.taclejointB_5 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5");
        this.tentacle_3 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3");
        this.decttt = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt");
        this.decb = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("decb");
        this.jd = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd");
        this.jd_1 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_1");
        this.jd_2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_2");
        this.jd_3 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_3");
        this.jd_4 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_4");
        this.jd_5 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_5");
        this.jd_6 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_6");
        this.dec_2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("decb").getChild("dec_2");
        this.dec_3 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("decb").getChild("dec_3");
        this.dec_4 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("decb").getChild("dec_4");
        this.dec_5 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("decb").getChild("dec_5");
        this.hair = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd").getChild("hair");
        this.hjointA = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd").getChild("hair").getChild("hjointA");
        this.hair_1 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd").getChild("hair").getChild("hjointA").getChild("hair_1");
        this.hjointA_1 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd").getChild("hair").getChild("hjointA").getChild("hair_1").getChild("hjointA_1");
        this.hair_2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd").getChild("hair").getChild("hjointA").getChild("hair_1").getChild("hjointA_1").getChild("hair_2");
        this.hjointA_2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd").getChild("hair").getChild("hjointA").getChild("hair_1").getChild("hjointA_1").getChild("hair_2").getChild("hjointA_2");
        this.hair_3 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd").getChild("hair").getChild("hjointA").getChild("hair_1").getChild("hjointA_1").getChild("hair_2").getChild("hjointA_2").getChild("hair_3");
        this.hjointA_3 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd").getChild("hair").getChild("hjointA").getChild("hair_1").getChild("hjointA_1").getChild("hair_2").getChild("hjointA_2").getChild("hair_3").getChild("hjointA_3");
        this.hair_4 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd").getChild("hair").getChild("hjointA").getChild("hair_1").getChild("hjointA_1").getChild("hair_2").getChild("hjointA_2").getChild("hair_3").getChild("hjointA_3").getChild("hair_4");
        this.hjointA_4 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd").getChild("hair").getChild("hjointA").getChild("hair_1").getChild("hjointA_1").getChild("hair_2").getChild("hjointA_2").getChild("hair_3").getChild("hjointA_3").getChild("hair_4").getChild("hjointA_4");
        this.hair_5 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd").getChild("hair").getChild("hjointA").getChild("hair_1").getChild("hjointA_1").getChild("hair_2").getChild("hjointA_2").getChild("hair_3").getChild("hjointA_3").getChild("hair_4").getChild("hjointA_4").getChild("hair_5");
        this.hair_6 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_1").getChild("hair_6");
        this.hjointB = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_1").getChild("hair_6").getChild("hjointB");
        this.hair_7 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_1").getChild("hair_6").getChild("hjointB").getChild("hair_7");
        this.hjointB_1 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_1").getChild("hair_6").getChild("hjointB").getChild("hair_7").getChild("hjointB_1");
        this.hair_8 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_1").getChild("hair_6").getChild("hjointB").getChild("hair_7").getChild("hjointB_1").getChild("hair_8");
        this.hjointB_2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_1").getChild("hair_6").getChild("hjointB").getChild("hair_7").getChild("hjointB_1").getChild("hair_8").getChild("hjointB_2");
        this.hair_9 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_1").getChild("hair_6").getChild("hjointB").getChild("hair_7").getChild("hjointB_1").getChild("hair_8").getChild("hjointB_2").getChild("hair_9");
        this.hjointB_3 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_1").getChild("hair_6").getChild("hjointB").getChild("hair_7").getChild("hjointB_1").getChild("hair_8").getChild("hjointB_2").getChild("hair_9").getChild("hjointB_3");
        this.hair_10 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_1").getChild("hair_6").getChild("hjointB").getChild("hair_7").getChild("hjointB_1").getChild("hair_8").getChild("hjointB_2").getChild("hair_9").getChild("hjointB_3").getChild("hair_10");
        this.hjointB_4 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_1").getChild("hair_6").getChild("hjointB").getChild("hair_7").getChild("hjointB_1").getChild("hair_8").getChild("hjointB_2").getChild("hair_9").getChild("hjointB_3").getChild("hair_10").getChild("hjointB_4");
        this.hair_11 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_1").getChild("hair_6").getChild("hjointB").getChild("hair_7").getChild("hjointB_1").getChild("hair_8").getChild("hjointB_2").getChild("hair_9").getChild("hjointB_3").getChild("hair_10").getChild("hjointB_4").getChild("hair_11");
        this.hair_12 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_2").getChild("hair_12");
        this.hjointC = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_2").getChild("hair_12").getChild("hjointC");
        this.hair_13 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_2").getChild("hair_12").getChild("hjointC").getChild("hair_13");
        this.hjointC_1 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_2").getChild("hair_12").getChild("hjointC").getChild("hair_13").getChild("hjointC_1");
        this.hair_14 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_2").getChild("hair_12").getChild("hjointC").getChild("hair_13").getChild("hjointC_1").getChild("hair_14");
        this.hjointC_2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_2").getChild("hair_12").getChild("hjointC").getChild("hair_13").getChild("hjointC_1").getChild("hair_14").getChild("hjointC_2");
        this.hair_15 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_2").getChild("hair_12").getChild("hjointC").getChild("hair_13").getChild("hjointC_1").getChild("hair_14").getChild("hjointC_2").getChild("hair_15");
        this.hjointC_3 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_2").getChild("hair_12").getChild("hjointC").getChild("hair_13").getChild("hjointC_1").getChild("hair_14").getChild("hjointC_2").getChild("hair_15").getChild("hjointC_3");
        this.hair_16 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_2").getChild("hair_12").getChild("hjointC").getChild("hair_13").getChild("hjointC_1").getChild("hair_14").getChild("hjointC_2").getChild("hair_15").getChild("hjointC_3").getChild("hair_16");
        this.hjointC_4 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_2").getChild("hair_12").getChild("hjointC").getChild("hair_13").getChild("hjointC_1").getChild("hair_14").getChild("hjointC_2").getChild("hair_15").getChild("hjointC_3").getChild("hair_16").getChild("hjointC_4");
        this.hair_17 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_2").getChild("hair_12").getChild("hjointC").getChild("hair_13").getChild("hjointC_1").getChild("hair_14").getChild("hjointC_2").getChild("hair_15").getChild("hjointC_3").getChild("hair_16").getChild("hjointC_4").getChild("hair_17");
        this.hair_18 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_3").getChild("hair_18");
        this.hjointD = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_3").getChild("hair_18").getChild("hjointD");
        this.hair_19 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_3").getChild("hair_18").getChild("hjointD").getChild("hair_19");
        this.hjointD_1 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_3").getChild("hair_18").getChild("hjointD").getChild("hair_19").getChild("hjointD_1");
        this.hair_20 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_3").getChild("hair_18").getChild("hjointD").getChild("hair_19").getChild("hjointD_1").getChild("hair_20");
        this.hjointD_2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_3").getChild("hair_18").getChild("hjointD").getChild("hair_19").getChild("hjointD_1").getChild("hair_20").getChild("hjointD_2");
        this.hair_21 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_3").getChild("hair_18").getChild("hjointD").getChild("hair_19").getChild("hjointD_1").getChild("hair_20").getChild("hjointD_2").getChild("hair_21");
        this.hjointD_3 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_3").getChild("hair_18").getChild("hjointD").getChild("hair_19").getChild("hjointD_1").getChild("hair_20").getChild("hjointD_2").getChild("hair_21").getChild("hjointD_3");
        this.hair_22 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_3").getChild("hair_18").getChild("hjointD").getChild("hair_19").getChild("hjointD_1").getChild("hair_20").getChild("hjointD_2").getChild("hair_21").getChild("hjointD_3").getChild("hair_22");
        this.hjointD_4 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_3").getChild("hair_18").getChild("hjointD").getChild("hair_19").getChild("hjointD_1").getChild("hair_20").getChild("hjointD_2").getChild("hair_21").getChild("hjointD_3").getChild("hair_22").getChild("hjointD_4");
        this.hair_23 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_3").getChild("hair_18").getChild("hjointD").getChild("hair_19").getChild("hjointD_1").getChild("hair_20").getChild("hjointD_2").getChild("hair_21").getChild("hjointD_3").getChild("hair_22").getChild("hjointD_4").getChild("hair_23");
        this.hair_24 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_4").getChild("hair_24");
        this.hjointE = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_4").getChild("hair_24").getChild("hjointE");
        this.hair_25 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_4").getChild("hair_24").getChild("hjointE").getChild("hair_25");
        this.hjointE_1 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_4").getChild("hair_24").getChild("hjointE").getChild("hair_25").getChild("hjointE_1");
        this.hair_26 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_4").getChild("hair_24").getChild("hjointE").getChild("hair_25").getChild("hjointE_1").getChild("hair_26");
        this.hjointE_2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_4").getChild("hair_24").getChild("hjointE").getChild("hair_25").getChild("hjointE_1").getChild("hair_26").getChild("hjointE_2");
        this.hair_27 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_4").getChild("hair_24").getChild("hjointE").getChild("hair_25").getChild("hjointE_1").getChild("hair_26").getChild("hjointE_2").getChild("hair_27");
        this.hjointE_3 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_4").getChild("hair_24").getChild("hjointE").getChild("hair_25").getChild("hjointE_1").getChild("hair_26").getChild("hjointE_2").getChild("hair_27").getChild("hjointE_3");
        this.hair_28 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_4").getChild("hair_24").getChild("hjointE").getChild("hair_25").getChild("hjointE_1").getChild("hair_26").getChild("hjointE_2").getChild("hair_27").getChild("hjointE_3").getChild("hair_28");
        this.hjointE_4 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_4").getChild("hair_24").getChild("hjointE").getChild("hair_25").getChild("hjointE_1").getChild("hair_26").getChild("hjointE_2").getChild("hair_27").getChild("hjointE_3").getChild("hair_28").getChild("hjointE_4");
        this.hair_29 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_4").getChild("hair_24").getChild("hjointE").getChild("hair_25").getChild("hjointE_1").getChild("hair_26").getChild("hjointE_2").getChild("hair_27").getChild("hjointE_3").getChild("hair_28").getChild("hjointE_4").getChild("hair_29");
        this.hair_30 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_5").getChild("hair_30");
        this.hjointF = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_5").getChild("hair_30").getChild("hjointF");
        this.hair_31 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_5").getChild("hair_30").getChild("hjointF").getChild("hair_31");
        this.hjointF_1 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_5").getChild("hair_30").getChild("hjointF").getChild("hair_31").getChild("hjointF_1");
        this.hair_32 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_5").getChild("hair_30").getChild("hjointF").getChild("hair_31").getChild("hjointF_1").getChild("hair_32");
        this.hjointF_2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_5").getChild("hair_30").getChild("hjointF").getChild("hair_31").getChild("hjointF_1").getChild("hair_32").getChild("hjointF_2");
        this.hair_33 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_5").getChild("hair_30").getChild("hjointF").getChild("hair_31").getChild("hjointF_1").getChild("hair_32").getChild("hjointF_2").getChild("hair_33");
        this.hjointF_3 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_5").getChild("hair_30").getChild("hjointF").getChild("hair_31").getChild("hjointF_1").getChild("hair_32").getChild("hjointF_2").getChild("hair_33").getChild("hjointF_3");
        this.hair_34 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_5").getChild("hair_30").getChild("hjointF").getChild("hair_31").getChild("hjointF_1").getChild("hair_32").getChild("hjointF_2").getChild("hair_33").getChild("hjointF_3").getChild("hair_34");
        this.hjointF_4 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_5").getChild("hair_30").getChild("hjointF").getChild("hair_31").getChild("hjointF_1").getChild("hair_32").getChild("hjointF_2").getChild("hair_33").getChild("hjointF_3").getChild("hair_34").getChild("hjointF_4");
        this.hair_35 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_5").getChild("hair_30").getChild("hjointF").getChild("hair_31").getChild("hjointF_1").getChild("hair_32").getChild("hjointF_2").getChild("hair_33").getChild("hjointF_3").getChild("hair_34").getChild("hjointF_4").getChild("hair_35");
        this.hair_36 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_6").getChild("hair_36");
        this.hjointG = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_6").getChild("hair_36").getChild("hjointG");
        this.hair_37 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_6").getChild("hair_36").getChild("hjointG").getChild("hair_37");
        this.hjointG_1 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_6").getChild("hair_36").getChild("hjointG").getChild("hair_37").getChild("hjointG_1");
        this.hair_38 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_6").getChild("hair_36").getChild("hjointG").getChild("hair_37").getChild("hjointG_1").getChild("hair_38");
        this.hjointG_2 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_6").getChild("hair_36").getChild("hjointG").getChild("hair_37").getChild("hjointG_1").getChild("hair_38").getChild("hjointG_2");
        this.hair_39 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_6").getChild("hair_36").getChild("hjointG").getChild("hair_37").getChild("hjointG_1").getChild("hair_38").getChild("hjointG_2").getChild("hair_39");
        this.hjointG_3 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_6").getChild("hair_36").getChild("hjointG").getChild("hair_37").getChild("hjointG_1").getChild("hair_38").getChild("hjointG_2").getChild("hair_39").getChild("hjointG_3");
        this.hair_40 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_6").getChild("hair_36").getChild("hjointG").getChild("hair_37").getChild("hjointG_1").getChild("hair_38").getChild("hjointG_2").getChild("hair_39").getChild("hjointG_3").getChild("hair_40");
        this.hjointG_4 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_6").getChild("hair_36").getChild("hjointG").getChild("hair_37").getChild("hjointG_1").getChild("hair_38").getChild("hjointG_2").getChild("hair_39").getChild("hjointG_3").getChild("hair_40").getChild("hjointG_4");
        this.hair_41 = root.getChild("mainbody").getChild("taclejointB").getChild("tentacle").getChild("taclejointB_1").getChild("tentacle111").getChild("taclejointB_2").getChild("tentacle_1").getChild("taclejointB_3").getChild("tentacle2").getChild("taclejointB_4").getChild("tentacle_2").getChild("taclejointB_5").getChild("tentacle_3").getChild("decttt").getChild("jd_6").getChild("hair_36").getChild("hjointG").getChild("hair_37").getChild("hjointG_1").getChild("hair_38").getChild("hjointG_2").getChild("hair_39").getChild("hjointG_3").getChild("hair_40").getChild("hjointG_4").getChild("hair_41");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 24.0f, 0.0f, 1.5707964f, 0.0f, 0.0f));
        PartDefinition taclejointB = mainbody.addOrReplaceChild("taclejointB", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition tentacle = taclejointB.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(29, 0).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.20594884f, 0.0f, 0.0f));
        PartDefinition dec_1 = tentacle.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(42, 0).addBox(-2.5f, -2.5f, 0.0f, 5, 5, 4), PartPose.offset(0.0f, 0.0f, -1.0f));
        PartDefinition taclejointB_1 = tentacle.addOrReplaceChild("taclejointB_1", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tentacle111 = taclejointB_1.addOrReplaceChild("tentacle111", CubeListBuilder.create().texOffs(51, 0).addBox(-1.5f, -2.0f, -1.0f, 3, 4, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.5305801f, 0.0f, 0.0f));
        PartDefinition taclejointB_2 = tentacle111.addOrReplaceChild("taclejointB_2", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tentacle_1 = taclejointB_2.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(75, 0).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.18849556f, 0.0f, 0.0f));
        PartDefinition taclejointB_3 = tentacle_1.addOrReplaceChild("taclejointB_3", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tentacle2 = taclejointB_3.addOrReplaceChild("tentacle2", CubeListBuilder.create().texOffs(20, 11).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointB_4 = tentacle2.addOrReplaceChild("taclejointB_4", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tentacle_2 = taclejointB_4.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(65, 12).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.45727625f, 0.0f, 0.0f));
        PartDefinition taclejointB_5 = tentacle_2.addOrReplaceChild("taclejointB_5", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tentacle_3 = taclejointB_5.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(79, 12).addBox(-2.5f, -1.5f, -0.5f, 5, 3, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.75398225f, 0.0f, 0.0f));
        PartDefinition decttt = tentacle_3.addOrReplaceChild("decttt", CubeListBuilder.create().texOffs(46, 13).addBox(-3.5f, -2.6f, -0.5f, 7, 5, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 3.0f, 0.37699112f, 0.0f, 0.0f));
        PartDefinition jd_4 = decttt.addOrReplaceChild("jd_4", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(2.0f, 2.0f, 1.0f, 1.7592919f, (float)(-Math.PI), 2.2619467f));
        PartDefinition hair_24 = jd_4.addOrReplaceChild("hair_24", CubeListBuilder.create().texOffs(77, 33).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.25132743f, 0.0f, 0.0f));
        PartDefinition hjointE = hair_24.addOrReplaceChild("hjointE", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_25 = hjointE.addOrReplaceChild("hair_25", CubeListBuilder.create().texOffs(85, 33).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.43982297f, 0.0f, 0.0f));
        PartDefinition hjointE_1 = hair_25.addOrReplaceChild("hjointE_1", CubeListBuilder.create().texOffs(79, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_26 = hjointE_1.addOrReplaceChild("hair_26", CubeListBuilder.create().texOffs(90, 34).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.50265485f, 0.0f, 0.0f));
        PartDefinition hjointE_2 = hair_26.addOrReplaceChild("hjointE_2", CubeListBuilder.create().texOffs(94, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_27 = hjointE_2.addOrReplaceChild("hair_27", CubeListBuilder.create().texOffs(35, 35).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.43982297f, 0.0f, 0.0f));
        PartDefinition hjointE_3 = hair_27.addOrReplaceChild("hjointE_3", CubeListBuilder.create().texOffs(18, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_28 = hjointE_3.addOrReplaceChild("hair_28", CubeListBuilder.create().texOffs(27, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.56548667f, 0.0f, 0.0f));
        PartDefinition hjointE_4 = hair_28.addOrReplaceChild("hjointE_4", CubeListBuilder.create().texOffs(37, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_29 = hjointE_4.addOrReplaceChild("hair_29", CubeListBuilder.create().texOffs(49, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.62831855f, 0.0f, 0.0f));
        PartDefinition jd_1 = decttt.addOrReplaceChild("jd_1", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-2.0f, -2.5f, 1.0f, 1.5707964f, 0.0f, -0.75398225f));
        PartDefinition hair_6 = jd_1.addOrReplaceChild("hair_6", CubeListBuilder.create().texOffs(89, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.37699112f, 0.0f, 0.0f));
        PartDefinition hjointB = hair_6.addOrReplaceChild("hjointB", CubeListBuilder.create().texOffs(42, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_7 = hjointB.addOrReplaceChild("hair_7", CubeListBuilder.create().texOffs(13, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.37699112f, 0.0f, 0.0f));
        PartDefinition hjointB_1 = hair_7.addOrReplaceChild("hjointB_1", CubeListBuilder.create().texOffs(56, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_8 = hjointB_1.addOrReplaceChild("hair_8", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.50265485f, 0.0f, 0.0f));
        PartDefinition hjointB_2 = hair_8.addOrReplaceChild("hjointB_2", CubeListBuilder.create().texOffs(71, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_9 = hjointB_2.addOrReplaceChild("hair_9", CubeListBuilder.create().texOffs(64, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.81681406f, 0.0f, 0.0f));
        PartDefinition hjointB_3 = hair_9.addOrReplaceChild("hjointB_3", CubeListBuilder.create().texOffs(94, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_10 = hjointB_3.addOrReplaceChild("hair_10", CubeListBuilder.create().texOffs(89, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.56548667f, 0.0f, 0.0f));
        PartDefinition hjointB_4 = hair_10.addOrReplaceChild("hjointB_4", CubeListBuilder.create().texOffs(79, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_11 = hjointB_4.addOrReplaceChild("hair_11", CubeListBuilder.create().texOffs(30, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.62831855f, 0.0f, 0.0f));
        PartDefinition jd_2 = decttt.addOrReplaceChild("jd_2", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(3.0f, 0.5f, 1.0f, 1.5707964f, 0.0f, 1.1938052f));
        PartDefinition hair_12 = jd_2.addOrReplaceChild("hair_12", CubeListBuilder.create().texOffs(54, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.37699112f, 0.0f, 0.0f));
        PartDefinition hjointC = hair_12.addOrReplaceChild("hjointC", CubeListBuilder.create().texOffs(81, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_13 = hjointC.addOrReplaceChild("hair_13", CubeListBuilder.create().texOffs(25, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.37699112f, 0.0f, 0.0f));
        PartDefinition hjointC_1 = hair_13.addOrReplaceChild("hjointC_1", CubeListBuilder.create().texOffs(29, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_14 = hjointC_1.addOrReplaceChild("hair_14", CubeListBuilder.create().texOffs(72, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.50265485f, 0.0f, 0.0f));
        PartDefinition hjointC_2 = hair_14.addOrReplaceChild("hjointC_2", CubeListBuilder.create().texOffs(33, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_15 = hjointC_2.addOrReplaceChild("hair_15", CubeListBuilder.create().texOffs(90, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.43982297f, 0.0f, 0.0f));
        PartDefinition hjointC_3 = hair_15.addOrReplaceChild("hjointC_3", CubeListBuilder.create().texOffs(66, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_16 = hjointC_3.addOrReplaceChild("hair_16", CubeListBuilder.create().texOffs(39, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.56548667f, 0.0f, 0.0f));
        PartDefinition hjointC_4 = hair_16.addOrReplaceChild("hjointC_4", CubeListBuilder.create().texOffs(70, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_17 = hjointC_4.addOrReplaceChild("hair_17", CubeListBuilder.create().texOffs(42, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.62831855f, 0.0f, 0.0f));
        PartDefinition jd_3 = decttt.addOrReplaceChild("jd_3", CubeListBuilder.create().texOffs(78, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-3.0f, 0.5f, 1.0f, 1.5707964f, 0.0f, -1.1938052f));
        PartDefinition hair_18 = jd_3.addOrReplaceChild("hair_18", CubeListBuilder.create().texOffs(49, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.37699112f, 0.0f, 0.0f));
        PartDefinition hjointD = hair_18.addOrReplaceChild("hjointD", CubeListBuilder.create().texOffs(74, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_19 = hjointD.addOrReplaceChild("hair_19", CubeListBuilder.create().texOffs(30, 32).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.37699112f, 0.0f, 0.0f));
        PartDefinition hjointD_1 = hair_19.addOrReplaceChild("hjointD_1", CubeListBuilder.create().texOffs(94, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_20 = hjointD_1.addOrReplaceChild("hair_20", CubeListBuilder.create().texOffs(54, 32).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.50265485f, 0.0f, 0.0f));
        PartDefinition hjointD_2 = hair_20.addOrReplaceChild("hjointD_2", CubeListBuilder.create().texOffs(80, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_21 = hjointD_2.addOrReplaceChild("hair_21", CubeListBuilder.create().texOffs(59, 33).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.43982297f, 0.0f, 0.0f));
        PartDefinition hjointD_3 = hair_21.addOrReplaceChild("hjointD_3", CubeListBuilder.create().texOffs(37, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_22 = hjointD_3.addOrReplaceChild("hair_22", CubeListBuilder.create().texOffs(67, 33).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.56548667f, 0.0f, 0.0f));
        PartDefinition hjointD_4 = hair_22.addOrReplaceChild("hjointD_4", CubeListBuilder.create().texOffs(44, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_23 = hjointD_4.addOrReplaceChild("hair_23", CubeListBuilder.create().texOffs(70, 33).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.62831855f, 0.0f, 0.0f));
        PartDefinition jd = decttt.addOrReplaceChild("jd", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(2.0f, -2.5f, 1.0f, 1.5707964f, 0.0f, 0.75398225f));
        PartDefinition hair = jd.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(29, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.37699112f, 0.0f, 0.0f));
        PartDefinition hjointA = hair.addOrReplaceChild("hjointA", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_1 = hjointA.addOrReplaceChild("hair_1", CubeListBuilder.create().texOffs(66, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.37699112f, 0.0f, 0.0f));
        PartDefinition hjointA_1 = hair_1.addOrReplaceChild("hjointA_1", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_2 = hjointA_1.addOrReplaceChild("hair_2", CubeListBuilder.create().texOffs(74, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.50265485f, 0.0f, 0.0f));
        PartDefinition hjointA_2 = hair_2.addOrReplaceChild("hjointA_2", CubeListBuilder.create().texOffs(24, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_3 = hjointA_2.addOrReplaceChild("hair_3", CubeListBuilder.create().texOffs(89, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.81681406f, 0.0f, 0.0f));
        PartDefinition hjointA_3 = hair_3.addOrReplaceChild("hjointA_3", CubeListBuilder.create().texOffs(28, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_4 = hjointA_3.addOrReplaceChild("hair_4", CubeListBuilder.create().texOffs(75, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.56548667f, 0.0f, 0.0f));
        PartDefinition hjointA_4 = hair_4.addOrReplaceChild("hjointA_4", CubeListBuilder.create().texOffs(34, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_5 = hjointA_4.addOrReplaceChild("hair_5", CubeListBuilder.create().texOffs(37, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.62831855f, 0.0f, 0.0f));
        PartDefinition jd_5 = decttt.addOrReplaceChild("jd_5", CubeListBuilder.create().texOffs(93, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-2.0f, 2.0f, 1.0f, 1.7592919f, (float)(-Math.PI), -2.2619467f));
        PartDefinition hair_30 = jd_5.addOrReplaceChild("hair_30", CubeListBuilder.create().texOffs(40, 37).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.25132743f, 0.0f, 0.0f));
        PartDefinition hjointF = hair_30.addOrReplaceChild("hjointF", CubeListBuilder.create().texOffs(44, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_31 = hjointF.addOrReplaceChild("hair_31", CubeListBuilder.create().texOffs(56, 37).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.43982297f, 0.0f, 0.0f));
        PartDefinition hjointF_1 = hair_31.addOrReplaceChild("hjointF_1", CubeListBuilder.create().texOffs(69, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_32 = hjointF_1.addOrReplaceChild("hair_32", CubeListBuilder.create().texOffs(64, 37).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.50265485f, 0.0f, 0.0f));
        PartDefinition hjointF_2 = hair_32.addOrReplaceChild("hjointF_2", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_33 = hjointF_2.addOrReplaceChild("hair_33", CubeListBuilder.create().texOffs(79, 37).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.43982297f, 0.0f, 0.0f));
        PartDefinition hjointF_3 = hair_33.addOrReplaceChild("hjointF_3", CubeListBuilder.create().texOffs(79, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_34 = hjointF_3.addOrReplaceChild("hair_34", CubeListBuilder.create().texOffs(84, 38).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.56548667f, 0.0f, 0.0f));
        PartDefinition hjointF_4 = hair_34.addOrReplaceChild("hjointF_4", CubeListBuilder.create().texOffs(94, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_35 = hjointF_4.addOrReplaceChild("hair_35", CubeListBuilder.create().texOffs(87, 38).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.62831855f, 0.0f, 0.0f));
        PartDefinition jd_6 = decttt.addOrReplaceChild("jd_6", CubeListBuilder.create().texOffs(81, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 2.5f, 1.0f, 1.8221238f, 0.0f, (float)Math.PI));
        PartDefinition hair_36 = jd_6.addOrReplaceChild("hair_36", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.37699112f, 0.0f, 0.0f));
        PartDefinition hjointG = hair_36.addOrReplaceChild("hjointG", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_37 = hjointG.addOrReplaceChild("hair_37", CubeListBuilder.create().texOffs(8, 39).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, 0.0f, 0.0f));
        PartDefinition hjointG_1 = hair_37.addOrReplaceChild("hjointG_1", CubeListBuilder.create().texOffs(71, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_38 = hjointG_1.addOrReplaceChild("hair_38", CubeListBuilder.create().texOffs(16, 39).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.0053097f, 0.0f, 0.0f));
        PartDefinition hjointG_2 = hair_38.addOrReplaceChild("hjointG_2", CubeListBuilder.create().texOffs(18, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_39 = hjointG_2.addOrReplaceChild("hair_39", CubeListBuilder.create().texOffs(32, 39).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.81681406f, 0.0f, 0.0f));
        PartDefinition hjointG_3 = hair_39.addOrReplaceChild("hjointG_3", CubeListBuilder.create().texOffs(22, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_40 = hjointG_3.addOrReplaceChild("hair_40", CubeListBuilder.create().texOffs(69, 39).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.56548667f, 0.0f, 0.0f));
        PartDefinition hjointG_4 = hair_40.addOrReplaceChild("hjointG_4", CubeListBuilder.create().texOffs(37, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_41 = hjointG_4.addOrReplaceChild("hair_41", CubeListBuilder.create().texOffs(19, 39).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.62831855f, 0.0f, 0.0f));
        PartDefinition decb = decttt.addOrReplaceChild("decb", CubeListBuilder.create().texOffs(0, 24).addBox(-5.0f, -5.0f, -0.5f, 10, 10, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.7853982f));
        PartDefinition dec_2 = decb.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(0, 13).addBox(-2.0f, -2.0f, -0.5f, 4, 4, 5), PartPose.offsetAndRotation(-2.0f, 0.0f, 3.0f, -0.25132743f, -0.25132743f, 0.7853982f));
        PartDefinition dec_5 = decb.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(77, 24).addBox(-2.0f, -2.0f, -0.5f, 4, 4, 5), PartPose.offsetAndRotation(0.0f, -2.0f, 3.0f, 0.25132743f, -0.25132743f, 0.7853982f));
        PartDefinition dec_4 = decb.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(59, 24).addBox(-2.0f, -2.0f, -0.5f, 4, 4, 5), PartPose.offsetAndRotation(0.0f, 2.0f, 3.0f, -0.25132743f, 0.25132743f, 0.7853982f));
        PartDefinition dec_3 = decb.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(41, 22).addBox(-2.0f, -2.0f, -0.5f, 4, 4, 5), PartPose.offsetAndRotation(2.0f, 0.0f, 3.0f, 0.25132743f, 0.25132743f, 0.7853982f));
        PartDefinition dec = mainbody.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(3, 0).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 5), PartPose.offset(0.0f, 0.0f, -4.0f));
        return LayerDefinition.create(mesh, 100, 50);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        this.hjointA.xRot = 0.0f;
        this.hjointA.yRot = 0.0f;
        this.hjointA_1.xRot = 0.0f;
        this.hjointA_1.yRot = 0.0f;
        this.hjointA_2.xRot = 0.0f;
        this.hjointA_2.yRot = 0.0f;
        this.hjointA_4.xRot = 0.0f;
        this.hjointA_4.yRot = 0.0f;
        float f1 = Mth.sin((float)(ageInTicks * 0.06f + 0.0f)) * 0.221f;
        float f2 = Mth.sin((float)(ageInTicks * 0.116f + 0.0f)) * 0.2f;
        this.hjointA.xRot = f1;
        this.hjointA.yRot = f2;
        this.hjointA_1.xRot = f1;
        this.hjointA_1.yRot = f2;
        this.hjointA_2.xRot = f1;
        this.hjointA_2.yRot = f2;
        this.hjointA_4.xRot = f1;
        this.hjointA_4.yRot = f2;
        f1 = -1.0f * Mth.sin((float)(ageInTicks * 0.056f + 0.0f)) * 0.2321f;
        f2 = Mth.sin((float)(ageInTicks * 0.1016f + 0.0f)) * 0.192f;
        this.hjointB.xRot = f1;
        this.hjointB.yRot = f2;
        this.hjointB_1.xRot = f1;
        this.hjointB_1.yRot = f2;
        this.hjointB_2.xRot = f1;
        this.hjointB_2.yRot = f2;
        this.hjointB_4.xRot = f1;
        this.hjointB_4.yRot = f2;
        f1 = Mth.sin((float)(ageInTicks * 0.076f + 0.0f)) * 0.2021f;
        f2 = -1.0f * Mth.sin((float)(ageInTicks * 0.1216f + 0.0f)) * 0.22f;
        this.hjointC.xRot = f1;
        this.hjointC.yRot = f2;
        this.hjointC_1.xRot = f1;
        this.hjointC_1.yRot = f2;
        this.hjointC_2.xRot = f1;
        this.hjointC_2.yRot = f2;
        this.hjointC_4.xRot = f1;
        this.hjointC_4.yRot = f2;
        f1 = -1.0f * Mth.sin((float)(ageInTicks * 0.06f + 0.0f)) * 0.221f;
        f2 = -1.0f * Mth.sin((float)(ageInTicks * 0.116f + 0.0f)) * 0.2f;
        this.hjointD.xRot = f1;
        this.hjointD.yRot = f2;
        this.hjointD_1.xRot = f1;
        this.hjointD_1.yRot = f2;
        this.hjointD_2.xRot = f1;
        this.hjointD_2.yRot = f2;
        this.hjointD_4.xRot = f1;
        this.hjointD_4.yRot = f2;
        f1 = Mth.sin((float)(ageInTicks * 0.06f + 0.0f)) * 0.221f;
        f2 = Mth.sin((float)(ageInTicks * 0.116f + 0.0f)) * 0.2f;
        this.hjointE.xRot = f1;
        this.hjointE.yRot = f2;
        this.hjointE_1.xRot = f1;
        this.hjointE_1.yRot = f2;
        this.hjointE_2.xRot = f1;
        this.hjointE_2.yRot = f2;
        this.hjointE_4.xRot = f1;
        this.hjointE_4.yRot = f2;
        f1 = -1.0f * Mth.sin((float)(ageInTicks * 0.056f + 0.0f)) * 0.2321f;
        f2 = Mth.sin((float)(ageInTicks * 0.1016f + 0.0f)) * 0.192f;
        this.hjointF.xRot = f1;
        this.hjointF.yRot = f2;
        this.hjointF_1.xRot = f1;
        this.hjointF_1.yRot = f2;
        this.hjointF_2.xRot = f1;
        this.hjointF_2.yRot = f2;
        this.hjointF_4.xRot = f1;
        this.hjointF_4.yRot = f2;
        f1 = Mth.sin((float)(ageInTicks * 0.076f + 0.0f)) * 0.2021f;
        f2 = -1.0f * Mth.sin((float)(ageInTicks * 0.1216f + 0.0f)) * 0.22f;
        this.hjointG.xRot = f1;
        this.hjointG.yRot = f2;
        this.hjointG_1.xRot = f1;
        this.hjointG_1.yRot = f2;
        this.hjointG_2.xRot = f1;
        this.hjointG_2.yRot = f2;
        this.hjointG_4.xRot = f1;
        this.hjointG_4.yRot = f2;
        this.taclejointB.xRot = f1 = Mth.sin((float)(ageInTicks * 0.076f + 0.0f)) * 0.0481f;
        this.taclejointB_1.xRot = f1 * 0.5f;
        this.taclejointB_3.xRot = f1 * 0.5f;
        this.taclejointB_5.xRot = f1 * 0.5f;
        this.taclejointB.yRot = f1 = Mth.sin((float)(ageInTicks * 0.0976f + 0.0f)) * 0.03921f;
        this.taclejointB_1.yRot = f1;
        this.taclejointB_3.yRot = f1;
        this.taclejointB_5.yRot = f1;
    
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
