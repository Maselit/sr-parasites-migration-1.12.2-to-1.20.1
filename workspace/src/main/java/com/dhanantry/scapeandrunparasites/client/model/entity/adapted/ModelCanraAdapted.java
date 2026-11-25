package com.dhanantry.scapeandrunparasites.client.model.entity.adapted;

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
import com.dhanantry.scapeandrunparasites.entity.monster.adapted.EntityCanraAdapted;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelCanraAdapted extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "canraadapted"), "main");
    private final ModelPart mainbody;
    private final ModelPart bodym;
    private final ModelPart jointFLAX;
    private final ModelPart jointFRAX;
    private final ModelPart jointRLX;
    private final ModelPart jointLLx;
    private final ModelPart bodyd;
    private final ModelPart body;
    private final ModelPart jointH;
    private final ModelPart bodyd_1;
    private final ModelPart taclejointL1;
    private final ModelPart taclejointR1;
    private final ModelPart bodyd_2;
    private final ModelPart bodyd_3;
    private final ModelPart bodyd_4;
    private final ModelPart bodymm;
    private final ModelPart bodyl;
    private final ModelPart body_1;
    private final ModelPart bodybm;
    private final ModelPart body_2;
    private final ModelPart jointLM;
    private final ModelPart jointRM;
    private final ModelPart mouth;
    private final ModelPart jointLM1;
    private final ModelPart dec;
    private final ModelPart dec_1;
    private final ModelPart dec_2;
    private final ModelPart dec_3;
    private final ModelPart dec_4;
    private final ModelPart dec_5;
    private final ModelPart mouth_1;
    private final ModelPart dec_6;
    private final ModelPart dec_7;
    private final ModelPart dec_8;
    private final ModelPart dec_9;
    private final ModelPart mouth_2;
    private final ModelPart jointRM1;
    private final ModelPart dec_10;
    private final ModelPart dec_11;
    private final ModelPart dec_12;
    private final ModelPart dec_13;
    private final ModelPart dec_14;
    private final ModelPart dec_15;
    private final ModelPart mouth_3;
    private final ModelPart dec_16;
    private final ModelPart dec_17;
    private final ModelPart dec_18;
    private final ModelPart dec_19;
    private final ModelPart bodyd_5;
    private final ModelPart bodyd_6;
    private final ModelPart bodyd_7;
    private final ModelPart tentacle;
    private final ModelPart taclejointL2;
    private final ModelPart tentacle_1;
    private final ModelPart taclejointL3;
    private final ModelPart tentacle_2;
    private final ModelPart taclejointL4;
    private final ModelPart tentacle_3;
    private final ModelPart tentacle_4;
    private final ModelPart taclejointR2;
    private final ModelPart tentacle_5;
    private final ModelPart taclejointR3;
    private final ModelPart tentacle_6;
    private final ModelPart taclejointR4;
    private final ModelPart tentacle_7;
    private final ModelPart JD;
    private final ModelPart jointFLAY;
    private final ModelPart body_3;
    private final ModelPart jointFLA1;
    private final ModelPart bodydec;
    private final ModelPart body_4;
    private final ModelPart jointFLA2;
    private final ModelPart body_5;
    private final ModelPart jointFLA2_1;
    private final ModelPart body_6;
    private final ModelPart jointFLA3;
    private final ModelPart body_7;
    private final ModelPart jointFLA4;
    private final ModelPart body_8;
    private final ModelPart toe;
    private final ModelPart toe_1;
    private final ModelPart JD_1;
    private final ModelPart jointFRAY;
    private final ModelPart body_9;
    private final ModelPart jointFRA1;
    private final ModelPart bodydec_1;
    private final ModelPart body_10;
    private final ModelPart jointFRA2;
    private final ModelPart body_11;
    private final ModelPart jointFRA2_1;
    private final ModelPart body_12;
    private final ModelPart jointFRA3;
    private final ModelPart body_13;
    private final ModelPart jointFRA4;
    private final ModelPart body_14;
    private final ModelPart toe_2;
    private final ModelPart toe_3;
    private final ModelPart JD_2;
    private final ModelPart jointRLY;
    private final ModelPart body_15;
    private final ModelPart jointRL1;
    private final ModelPart dec_20;
    private final ModelPart leg;
    private final ModelPart jointRL2;
    private final ModelPart leg_1;
    private final ModelPart jointRL3;
    private final ModelPart leg_2;
    private final ModelPart jointRL4;
    private final ModelPart leg_3;
    private final ModelPart toe_4;
    private final ModelPart toe_5;
    private final ModelPart JD_3;
    private final ModelPart jointLLY;
    private final ModelPart body_16;
    private final ModelPart jointLL1;
    private final ModelPart dec_21;
    private final ModelPart leg_4;
    private final ModelPart jointLL2;
    private final ModelPart leg_5;
    private final ModelPart jointLL3;
    private final ModelPart leg_6;
    private final ModelPart jointLL4;
    private final ModelPart leg_7;
    private final ModelPart toe_6;
    private final ModelPart toe_7;

    public ModelCanraAdapted(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.bodym = root.getChild("mainbody").getChild("bodym");
        this.jointFLAX = root.getChild("mainbody").getChild("jointFLAX");
        this.jointFRAX = root.getChild("mainbody").getChild("jointFRAX");
        this.jointRLX = root.getChild("mainbody").getChild("jointRLX");
        this.jointLLx = root.getChild("mainbody").getChild("jointLLx");
        this.bodyd = root.getChild("mainbody").getChild("bodym").getChild("bodyd");
        this.body = root.getChild("mainbody").getChild("bodym").getChild("body");
        this.jointH = root.getChild("mainbody").getChild("bodym").getChild("jointH");
        this.bodyd_1 = root.getChild("mainbody").getChild("bodym").getChild("bodyd_1");
        this.taclejointL1 = root.getChild("mainbody").getChild("bodym").getChild("taclejointL1");
        this.taclejointR1 = root.getChild("mainbody").getChild("bodym").getChild("taclejointR1");
        this.bodyd_2 = root.getChild("mainbody").getChild("bodym").getChild("bodyd").getChild("bodyd_2");
        this.bodyd_3 = root.getChild("mainbody").getChild("bodym").getChild("bodyd").getChild("bodyd_3");
        this.bodyd_4 = root.getChild("mainbody").getChild("bodym").getChild("bodyd").getChild("bodyd_2").getChild("bodyd_4");
        this.bodymm = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("bodymm");
        this.bodyl = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("bodymm").getChild("bodyl");
        this.body_1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("bodymm").getChild("bodyl").getChild("body_1");
        this.bodybm = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm");
        this.body_2 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("body_2");
        this.jointLM = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM");
        this.jointRM = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM");
        this.mouth = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth");
        this.jointLM1 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth").getChild("jointLM1");
        this.dec = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth").getChild("dec");
        this.dec_1 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth").getChild("dec_1");
        this.dec_2 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth").getChild("dec_2");
        this.dec_3 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth").getChild("dec_3");
        this.dec_4 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth").getChild("dec_4");
        this.dec_5 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth").getChild("dec_5");
        this.mouth_1 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth").getChild("jointLM1").getChild("mouth_1");
        this.dec_6 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth").getChild("jointLM1").getChild("mouth_1").getChild("dec_6");
        this.dec_7 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth").getChild("jointLM1").getChild("mouth_1").getChild("dec_7");
        this.dec_8 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth").getChild("jointLM1").getChild("mouth_1").getChild("dec_8");
        this.dec_9 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouth").getChild("jointLM1").getChild("mouth_1").getChild("dec_9");
        this.mouth_2 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2");
        this.jointRM1 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2").getChild("jointRM1");
        this.dec_10 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2").getChild("dec_10");
        this.dec_11 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2").getChild("dec_11");
        this.dec_12 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2").getChild("dec_12");
        this.dec_13 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2").getChild("dec_13");
        this.dec_14 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2").getChild("dec_14");
        this.dec_15 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2").getChild("dec_15");
        this.mouth_3 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2").getChild("jointRM1").getChild("mouth_3");
        this.dec_16 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2").getChild("jointRM1").getChild("mouth_3").getChild("dec_16");
        this.dec_17 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2").getChild("jointRM1").getChild("mouth_3").getChild("dec_17");
        this.dec_18 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2").getChild("jointRM1").getChild("mouth_3").getChild("dec_18");
        this.dec_19 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouth_2").getChild("jointRM1").getChild("mouth_3").getChild("dec_19");
        this.bodyd_5 = root.getChild("mainbody").getChild("bodym").getChild("bodyd_1").getChild("bodyd_5");
        this.bodyd_6 = root.getChild("mainbody").getChild("bodym").getChild("bodyd_1").getChild("bodyd_6");
        this.bodyd_7 = root.getChild("mainbody").getChild("bodym").getChild("bodyd_1").getChild("bodyd_5").getChild("bodyd_7");
        this.tentacle = root.getChild("mainbody").getChild("bodym").getChild("taclejointL1").getChild("tentacle");
        this.taclejointL2 = root.getChild("mainbody").getChild("bodym").getChild("taclejointL1").getChild("tentacle").getChild("taclejointL2");
        this.tentacle_1 = root.getChild("mainbody").getChild("bodym").getChild("taclejointL1").getChild("tentacle").getChild("taclejointL2").getChild("tentacle_1");
        this.taclejointL3 = root.getChild("mainbody").getChild("bodym").getChild("taclejointL1").getChild("tentacle").getChild("taclejointL2").getChild("tentacle_1").getChild("taclejointL3");
        this.tentacle_2 = root.getChild("mainbody").getChild("bodym").getChild("taclejointL1").getChild("tentacle").getChild("taclejointL2").getChild("tentacle_1").getChild("taclejointL3").getChild("tentacle_2");
        this.taclejointL4 = root.getChild("mainbody").getChild("bodym").getChild("taclejointL1").getChild("tentacle").getChild("taclejointL2").getChild("tentacle_1").getChild("taclejointL3").getChild("tentacle_2").getChild("taclejointL4");
        this.tentacle_3 = root.getChild("mainbody").getChild("bodym").getChild("taclejointL1").getChild("tentacle").getChild("taclejointL2").getChild("tentacle_1").getChild("taclejointL3").getChild("tentacle_2").getChild("taclejointL4").getChild("tentacle_3");
        this.tentacle_4 = root.getChild("mainbody").getChild("bodym").getChild("taclejointR1").getChild("tentacle_4");
        this.taclejointR2 = root.getChild("mainbody").getChild("bodym").getChild("taclejointR1").getChild("tentacle_4").getChild("taclejointR2");
        this.tentacle_5 = root.getChild("mainbody").getChild("bodym").getChild("taclejointR1").getChild("tentacle_4").getChild("taclejointR2").getChild("tentacle_5");
        this.taclejointR3 = root.getChild("mainbody").getChild("bodym").getChild("taclejointR1").getChild("tentacle_4").getChild("taclejointR2").getChild("tentacle_5").getChild("taclejointR3");
        this.tentacle_6 = root.getChild("mainbody").getChild("bodym").getChild("taclejointR1").getChild("tentacle_4").getChild("taclejointR2").getChild("tentacle_5").getChild("taclejointR3").getChild("tentacle_6");
        this.taclejointR4 = root.getChild("mainbody").getChild("bodym").getChild("taclejointR1").getChild("tentacle_4").getChild("taclejointR2").getChild("tentacle_5").getChild("taclejointR3").getChild("tentacle_6").getChild("taclejointR4");
        this.tentacle_7 = root.getChild("mainbody").getChild("bodym").getChild("taclejointR1").getChild("tentacle_4").getChild("taclejointR2").getChild("tentacle_5").getChild("taclejointR3").getChild("tentacle_6").getChild("taclejointR4").getChild("tentacle_7");
        this.JD = root.getChild("mainbody").getChild("jointFLAX").getChild("JD");
        this.jointFLAY = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY");
        this.body_3 = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3");
        this.jointFLA1 = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("jointFLA1");
        this.bodydec = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("bodydec");
        this.body_4 = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("jointFLA1").getChild("body_4");
        this.jointFLA2 = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("jointFLA1").getChild("body_4").getChild("jointFLA2");
        this.body_5 = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("jointFLA1").getChild("body_4").getChild("jointFLA2").getChild("body_5");
        this.jointFLA2_1 = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("jointFLA1").getChild("body_4").getChild("jointFLA2").getChild("body_5").getChild("jointFLA2_1");
        this.body_6 = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("jointFLA1").getChild("body_4").getChild("jointFLA2").getChild("body_5").getChild("jointFLA2_1").getChild("body_6");
        this.jointFLA3 = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("jointFLA1").getChild("body_4").getChild("jointFLA2").getChild("body_5").getChild("jointFLA2_1").getChild("body_6").getChild("jointFLA3");
        this.body_7 = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("jointFLA1").getChild("body_4").getChild("jointFLA2").getChild("body_5").getChild("jointFLA2_1").getChild("body_6").getChild("jointFLA3").getChild("body_7");
        this.jointFLA4 = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("jointFLA1").getChild("body_4").getChild("jointFLA2").getChild("body_5").getChild("jointFLA2_1").getChild("body_6").getChild("jointFLA3").getChild("body_7").getChild("jointFLA4");
        this.body_8 = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("jointFLA1").getChild("body_4").getChild("jointFLA2").getChild("body_5").getChild("jointFLA2_1").getChild("body_6").getChild("jointFLA3").getChild("body_7").getChild("jointFLA4").getChild("body_8");
        this.toe = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("jointFLA1").getChild("body_4").getChild("jointFLA2").getChild("body_5").getChild("jointFLA2_1").getChild("body_6").getChild("jointFLA3").getChild("body_7").getChild("jointFLA4").getChild("body_8").getChild("toe");
        this.toe_1 = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY").getChild("body_3").getChild("jointFLA1").getChild("body_4").getChild("jointFLA2").getChild("body_5").getChild("jointFLA2_1").getChild("body_6").getChild("jointFLA3").getChild("body_7").getChild("jointFLA4").getChild("body_8").getChild("toe_1");
        this.JD_1 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1");
        this.jointFRAY = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY");
        this.body_9 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9");
        this.jointFRA1 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("jointFRA1");
        this.bodydec_1 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("bodydec_1");
        this.body_10 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("jointFRA1").getChild("body_10");
        this.jointFRA2 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("jointFRA1").getChild("body_10").getChild("jointFRA2");
        this.body_11 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("jointFRA1").getChild("body_10").getChild("jointFRA2").getChild("body_11");
        this.jointFRA2_1 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("jointFRA1").getChild("body_10").getChild("jointFRA2").getChild("body_11").getChild("jointFRA2_1");
        this.body_12 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("jointFRA1").getChild("body_10").getChild("jointFRA2").getChild("body_11").getChild("jointFRA2_1").getChild("body_12");
        this.jointFRA3 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("jointFRA1").getChild("body_10").getChild("jointFRA2").getChild("body_11").getChild("jointFRA2_1").getChild("body_12").getChild("jointFRA3");
        this.body_13 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("jointFRA1").getChild("body_10").getChild("jointFRA2").getChild("body_11").getChild("jointFRA2_1").getChild("body_12").getChild("jointFRA3").getChild("body_13");
        this.jointFRA4 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("jointFRA1").getChild("body_10").getChild("jointFRA2").getChild("body_11").getChild("jointFRA2_1").getChild("body_12").getChild("jointFRA3").getChild("body_13").getChild("jointFRA4");
        this.body_14 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("jointFRA1").getChild("body_10").getChild("jointFRA2").getChild("body_11").getChild("jointFRA2_1").getChild("body_12").getChild("jointFRA3").getChild("body_13").getChild("jointFRA4").getChild("body_14");
        this.toe_2 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("jointFRA1").getChild("body_10").getChild("jointFRA2").getChild("body_11").getChild("jointFRA2_1").getChild("body_12").getChild("jointFRA3").getChild("body_13").getChild("jointFRA4").getChild("body_14").getChild("toe_2");
        this.toe_3 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_9").getChild("jointFRA1").getChild("body_10").getChild("jointFRA2").getChild("body_11").getChild("jointFRA2_1").getChild("body_12").getChild("jointFRA3").getChild("body_13").getChild("jointFRA4").getChild("body_14").getChild("toe_3");
        this.JD_2 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2");
        this.jointRLY = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY");
        this.body_15 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY").getChild("body_15");
        this.jointRL1 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY").getChild("body_15").getChild("jointRL1");
        this.dec_20 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY").getChild("body_15").getChild("dec_20");
        this.leg = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY").getChild("body_15").getChild("jointRL1").getChild("leg");
        this.jointRL2 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY").getChild("body_15").getChild("jointRL1").getChild("leg").getChild("jointRL2");
        this.leg_1 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY").getChild("body_15").getChild("jointRL1").getChild("leg").getChild("jointRL2").getChild("leg_1");
        this.jointRL3 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY").getChild("body_15").getChild("jointRL1").getChild("leg").getChild("jointRL2").getChild("leg_1").getChild("jointRL3");
        this.leg_2 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY").getChild("body_15").getChild("jointRL1").getChild("leg").getChild("jointRL2").getChild("leg_1").getChild("jointRL3").getChild("leg_2");
        this.jointRL4 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY").getChild("body_15").getChild("jointRL1").getChild("leg").getChild("jointRL2").getChild("leg_1").getChild("jointRL3").getChild("leg_2").getChild("jointRL4");
        this.leg_3 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY").getChild("body_15").getChild("jointRL1").getChild("leg").getChild("jointRL2").getChild("leg_1").getChild("jointRL3").getChild("leg_2").getChild("jointRL4").getChild("leg_3");
        this.toe_4 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY").getChild("body_15").getChild("jointRL1").getChild("leg").getChild("jointRL2").getChild("leg_1").getChild("jointRL3").getChild("leg_2").getChild("jointRL4").getChild("leg_3").getChild("toe_4");
        this.toe_5 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_2").getChild("jointRLY").getChild("body_15").getChild("jointRL1").getChild("leg").getChild("jointRL2").getChild("leg_1").getChild("jointRL3").getChild("leg_2").getChild("jointRL4").getChild("leg_3").getChild("toe_5");
        this.JD_3 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3");
        this.jointLLY = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY");
        this.body_16 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY").getChild("body_16");
        this.jointLL1 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY").getChild("body_16").getChild("jointLL1");
        this.dec_21 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY").getChild("body_16").getChild("dec_21");
        this.leg_4 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY").getChild("body_16").getChild("jointLL1").getChild("leg_4");
        this.jointLL2 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY").getChild("body_16").getChild("jointLL1").getChild("leg_4").getChild("jointLL2");
        this.leg_5 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY").getChild("body_16").getChild("jointLL1").getChild("leg_4").getChild("jointLL2").getChild("leg_5");
        this.jointLL3 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY").getChild("body_16").getChild("jointLL1").getChild("leg_4").getChild("jointLL2").getChild("leg_5").getChild("jointLL3");
        this.leg_6 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY").getChild("body_16").getChild("jointLL1").getChild("leg_4").getChild("jointLL2").getChild("leg_5").getChild("jointLL3").getChild("leg_6");
        this.jointLL4 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY").getChild("body_16").getChild("jointLL1").getChild("leg_4").getChild("jointLL2").getChild("leg_5").getChild("jointLL3").getChild("leg_6").getChild("jointLL4");
        this.leg_7 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY").getChild("body_16").getChild("jointLL1").getChild("leg_4").getChild("jointLL2").getChild("leg_5").getChild("jointLL3").getChild("leg_6").getChild("jointLL4").getChild("leg_7");
        this.toe_6 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY").getChild("body_16").getChild("jointLL1").getChild("leg_4").getChild("jointLL2").getChild("leg_5").getChild("jointLL3").getChild("leg_6").getChild("jointLL4").getChild("leg_7").getChild("toe_6");
        this.toe_7 = root.getChild("mainbody").getChild("jointLLx").getChild("JD_3").getChild("jointLLY").getChild("body_16").getChild("jointLL1").getChild("leg_4").getChild("jointLL2").getChild("leg_5").getChild("jointLL3").getChild("leg_6").getChild("jointLL4").getChild("leg_7").getChild("toe_7");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -11.0f, -12.0f));
        PartDefinition jointFRAX = mainbody.addOrReplaceChild("jointFRAX", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-8.0f, -4.0f, 3.0f));
        PartDefinition JD_1 = jointFRAX.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(165, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 2.4260077f, 0.0f));
        PartDefinition jointFRAY = JD_1.addOrReplaceChild("jointFRAY", CubeListBuilder.create().texOffs(169, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_9 = jointFRAY.addOrReplaceChild("body_9", CubeListBuilder.create().texOffs(36, 68).addBox(-2.0f, -3.0f, -3.0f, 15, 6, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7330383f));
        PartDefinition jointFRA1 = body_9.addOrReplaceChild("jointFRA1", CubeListBuilder.create().texOffs(173, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.0f, 0.0f, 0.0f));
        PartDefinition body_10 = jointFRA1.addOrReplaceChild("body_10", CubeListBuilder.create().texOffs(176, 72).addBox(-1.0f, -2.0f, -2.5f, 17, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.7104226f));
        PartDefinition jointFRA2 = body_10.addOrReplaceChild("jointFRA2", CubeListBuilder.create().texOffs(177, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(16.0f, 0.0f, 0.0f));
        PartDefinition body_11 = jointFRA2.addOrReplaceChild("body_11", CubeListBuilder.create().texOffs(72, 76).addBox(1.0f, -2.0f, -3.0f, 15, 4, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2340214f));
        PartDefinition jointFRA2_1 = body_11.addOrReplaceChild("jointFRA2_1", CubeListBuilder.create().texOffs(251, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(16.0f, 0.0f, 0.0f));
        PartDefinition body_12 = jointFRA2_1.addOrReplaceChild("body_12", CubeListBuilder.create().texOffs(107, 79).addBox(-2.5f, -2.0f, -3.5f, 15, 5, 7), PartPose.offsetAndRotation(0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2268928f));
        PartDefinition jointFRA3 = body_12.addOrReplaceChild("jointFRA3", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(11.5f, 0.0f, 0.0f));
        PartDefinition body_13 = jointFRA3.addOrReplaceChild("body_13", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.7f, -4.0f, 13, 6, 8), PartPose.offsetAndRotation(0.8f, 0.4f, 0.0f, 0.0f, 0.0f, 0.2268928f));
        PartDefinition jointFRA4 = body_13.addOrReplaceChild("jointFRA4", CubeListBuilder.create().texOffs(136, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.3f, 0.0f, 0.0f));
        PartDefinition body_14 = jointFRA4.addOrReplaceChild("body_14", CubeListBuilder.create().texOffs(19, 80).addBox(-2.0f, -4.0f, -4.5f, 6, 8, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.13962634f));
        PartDefinition toe_3 = body_14.addOrReplaceChild("toe_3", CubeListBuilder.create().texOffs(78, 66).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 7), PartPose.offsetAndRotation(0.3f, -4.5f, 0.0f, 1.5707964f, 0.0f, 0.6981317f));
        PartDefinition toe_2 = body_14.addOrReplaceChild("toe_2", CubeListBuilder.create().texOffs(22, 34).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 6), PartPose.offsetAndRotation(0.5f, 0.0f, -5.0f, 0.0f, 2.4958208f, 0.0f));
        PartDefinition bodydec_1 = body_9.addOrReplaceChild("bodydec_1", CubeListBuilder.create().texOffs(0, 69).addBox(-8.0f, -4.0f, -2.0f, 10, 8, 4), PartPose.offsetAndRotation(-2.0f, 0.0f, -4.0f, 0.0f, 3.0194197f, 0.0f));
        PartDefinition jointFLAX = mainbody.addOrReplaceChild("jointFLAX", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, -4.0f, 3.0f));
        PartDefinition JD = jointFLAX.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(36, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.715585f, 0.0f));
        PartDefinition jointFLAY = JD.addOrReplaceChild("jointFLAY", CubeListBuilder.create().texOffs(214, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_3 = jointFLAY.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(0, 57).addBox(-2.0f, -3.0f, -3.0f, 15, 6, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7330383f));
        PartDefinition jointFLA1 = body_3.addOrReplaceChild("jointFLA1", CubeListBuilder.create().texOffs(251, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.0f, 0.0f, 0.0f));
        PartDefinition body_4 = jointFLA1.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(157, 57).addBox(-1.0f, -2.0f, -2.5f, 17, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.7104226f));
        PartDefinition jointFLA2 = body_4.addOrReplaceChild("jointFLA2", CubeListBuilder.create().texOffs(129, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(16.0f, 0.0f, 0.0f));
        PartDefinition body_5 = jointFLA2.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(42, 58).addBox(1.0f, -2.0f, -3.0f, 15, 4, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2340214f));
        PartDefinition jointFLA2_1 = body_5.addOrReplaceChild("jointFLA2_1", CubeListBuilder.create().texOffs(135, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(16.0f, 0.0f, 0.0f));
        PartDefinition body_6 = jointFLA2_1.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(194, 60).addBox(-2.5f, -2.0f, -3.5f, 15, 5, 7), PartPose.offsetAndRotation(0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2268928f));
        PartDefinition jointFLA3 = body_6.addOrReplaceChild("jointFLA3", CubeListBuilder.create().texOffs(248, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(11.5f, 0.0f, 0.0f));
        PartDefinition body_7 = jointFLA3.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(104, 62).addBox(-1.0f, -2.7f, -4.0f, 13, 6, 8), PartPose.offsetAndRotation(0.8f, 0.4f, 0.0f, 0.0f, 0.0f, 0.2268928f));
        PartDefinition jointFLA4 = body_7.addOrReplaceChild("jointFLA4", CubeListBuilder.create().texOffs(36, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.3f, 0.0f, 0.0f));
        PartDefinition body_8 = jointFLA4.addOrReplaceChild("body_8", CubeListBuilder.create().texOffs(146, 66).addBox(-2.0f, -4.0f, -4.5f, 6, 8, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.13962634f));
        PartDefinition toe_1 = body_8.addOrReplaceChild("toe_1", CubeListBuilder.create().texOffs(46, 43).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 7), PartPose.offsetAndRotation(0.3f, -4.5f, 0.0f, 1.5707964f, 0.0f, 0.6981317f));
        PartDefinition toe = body_8.addOrReplaceChild("toe", CubeListBuilder.create().texOffs(160, 21).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 6), PartPose.offsetAndRotation(0.5f, 0.0f, 5.0f, 0.0f, 0.6457718f, 0.0f));
        PartDefinition bodydec = body_3.addOrReplaceChild("bodydec", CubeListBuilder.create().texOffs(84, 54).addBox(-8.0f, -4.0f, -2.0f, 10, 8, 4), PartPose.offsetAndRotation(-2.0f, 0.0f, 4.0f, 0.0f, -3.0194197f, 0.0f));
        PartDefinition bodym = mainbody.addOrReplaceChild("bodym", CubeListBuilder.create().texOffs(0, 0).addBox(-6.5f, -3.0f, -5.0f, 13, 24, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.5358897f, 0.0f, 0.0f));
        PartDefinition body = bodym.addOrReplaceChild("body", CubeListBuilder.create().texOffs(104, 0).addBox(-3.0f, -17.5f, -7.5f, 6, 6, 9), PartPose.offsetAndRotation(0.0f, 9.0f, 2.0f, 0.2617994f, 0.0f, 0.0f));
        PartDefinition bodymm = body.addOrReplaceChild("bodymm", CubeListBuilder.create().texOffs(212, 11).addBox(-4.0f, 1.0f, -6.0f, 8, 18, 12), PartPose.offsetAndRotation(0.0f, 4.0f, -2.0f, 0.4537856f, 0.0f, 0.0f));
        PartDefinition bodyl = bodymm.addOrReplaceChild("bodyl", CubeListBuilder.create().texOffs(140, 21).addBox(-2.0f, -3.5f, -6.5f, 4, 13, 12), PartPose.offsetAndRotation(0.0f, 19.2f, -1.0f, -0.41887903f, 0.0f, 0.0f));
        PartDefinition body_1 = bodyl.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(172, 23).addBox(-1.0f, 0.0f, -4.0f, 2, 10, 9), PartPose.offsetAndRotation(0.0f, 8.0f, -0.5f, -0.2617994f, 0.0f, 0.0f));
        PartDefinition jointH = bodym.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -5.0f, -5.0f));
        PartDefinition bodybm = jointH.addOrReplaceChild("bodybm", CubeListBuilder.create().texOffs(40, 29).addBox(-4.0f, -5.0f, -3.5f, 8, 8, 6), PartPose.offsetAndRotation(0.0f, -3.0f, -2.0f, -1.2915436f, 0.0f, 0.0f));
        PartDefinition jointLM = bodybm.addOrReplaceChild("jointLM", CubeListBuilder.create().texOffs(103, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, -1.2f, -2.0f));
        PartDefinition mouth = jointLM.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(194, 23).addBox(-1.5f, -4.0f, -0.5f, 3, 8, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, (float)Math.PI, -0.29670596f, 0.0f));
        PartDefinition dec_5 = mouth.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(36, 2).addBox(-1.0f, -1.5f, -1.5f, 2, 3, 4), PartPose.offsetAndRotation(-0.5f, 4.7f, 1.3f, 0.0f, 0.0f, 0.6457718f));
        PartDefinition dec_2 = mouth.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(165, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, 2.0f, 2.0f, -0.4537856f, -0.9075712f, 0.0f));
        PartDefinition dec_4 = mouth.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(232, 0).addBox(-1.0f, -1.5f, -1.5f, 2, 3, 4), PartPose.offsetAndRotation(-0.5f, -4.7f, 1.3f, 0.0f, 0.0f, -0.6457718f));
        PartDefinition dec_3 = mouth.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(173, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, -3.0f, 2.0f, 0.4537856f, -0.9075712f, 0.0f));
        PartDefinition dec_1 = mouth.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(133, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2), PartPose.offsetAndRotation(-1.5f, -3.0f, 4.0f, 0.12217305f, -0.9075712f, 0.0f));
        PartDefinition jointLM1 = mouth.addOrReplaceChild("jointLM1", CubeListBuilder.create().texOffs(125, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.5f));
        PartDefinition mouth_1 = jointLM1.addOrReplaceChild("mouth_1", CubeListBuilder.create().texOffs(240, 3).addBox(-1.0f, -3.0f, -3.5f, 2, 6, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.3f, (float)Math.PI, 0.2443461f, 0.0f));
        PartDefinition dec_6 = mouth_1.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(170, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2), PartPose.offsetAndRotation(-0.4f, 1.0f, -1.0f, -0.2617994f, -1.9896754f, 0.0f));
        PartDefinition dec_8 = mouth_1.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(240, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2), PartPose.offsetAndRotation(-0.4f, -2.0f, -1.0f, 0.2617994f, -1.9896754f, 0.0f));
        PartDefinition dec_7 = mouth_1.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(228, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2), PartPose.offsetAndRotation(-0.4f, 1.0f, -2.7f, -0.2617994f, -2.2514746f, 0.0f));
        PartDefinition dec_9 = mouth_1.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(246, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2), PartPose.offsetAndRotation(-0.4f, -2.0f, -2.7f, 0.2617994f, -2.2514746f, 0.0f));
        PartDefinition dec = mouth.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(127, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2), PartPose.offsetAndRotation(-1.5f, 2.0f, 4.0f, -0.12217305f, -0.9075712f, 0.0f));
        PartDefinition body_2 = bodybm.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(214, 0).addBox(-2.5f, -2.5f, -2.5f, 5, 5, 4), PartPose.offset(0.0f, -1.3f, -4.5f));
        PartDefinition jointRM = bodybm.addOrReplaceChild("jointRM", CubeListBuilder.create().texOffs(107, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.0f, -1.2f, -2.0f));
        PartDefinition mouth_2 = jointRM.addOrReplaceChild("mouth_2", CubeListBuilder.create().texOffs(68, 29).addBox(-1.5f, -4.0f, -0.5f, 3, 8, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, (float)Math.PI, -0.29670596f, (float)(-Math.PI)));
        PartDefinition dec_10 = mouth_2.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(0, 2).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2), PartPose.offsetAndRotation(-1.5f, 2.0f, 4.0f, -0.12217305f, -0.9075712f, 0.0f));
        PartDefinition dec_15 = mouth_2.addOrReplaceChild("dec_15", CubeListBuilder.create().texOffs(240, 13).addBox(-1.0f, -1.5f, -1.5f, 2, 3, 4), PartPose.offsetAndRotation(-0.5f, 4.7f, 1.3f, 0.0f, 0.0f, 0.6457718f));
        PartDefinition dec_14 = mouth_2.addOrReplaceChild("dec_14", CubeListBuilder.create().texOffs(99, 2).addBox(-1.0f, -1.5f, -1.5f, 2, 3, 4), PartPose.offsetAndRotation(-0.5f, -4.7f, 1.3f, 0.0f, 0.0f, -0.6457718f));
        PartDefinition dec_11 = mouth_2.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(44, 2).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2), PartPose.offsetAndRotation(-1.5f, -3.0f, 4.0f, 0.12217305f, -0.9075712f, 0.0f));
        PartDefinition dec_12 = mouth_2.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(47, 2).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, 2.0f, 2.0f, -0.4537856f, -0.9075712f, 0.0f));
        PartDefinition dec_13 = mouth_2.addOrReplaceChild("dec_13", CubeListBuilder.create().texOffs(95, 2).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, -3.0f, 2.0f, 0.4537856f, -0.9075712f, 0.0f));
        PartDefinition jointRM1 = mouth_2.addOrReplaceChild("jointRM1", CubeListBuilder.create().texOffs(131, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.5f));
        PartDefinition mouth_3 = jointRM1.addOrReplaceChild("mouth_3", CubeListBuilder.create().texOffs(140, 21).addBox(-1.0f, -3.0f, -3.5f, 2, 6, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.3f, (float)Math.PI, 0.2443461f, 0.0f));
        PartDefinition dec_16 = mouth_3.addOrReplaceChild("dec_16", CubeListBuilder.create().texOffs(107, 2).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2), PartPose.offsetAndRotation(-0.4f, 1.0f, -1.0f, -0.2617994f, -1.9896754f, 0.0f));
        PartDefinition dec_19 = mouth_3.addOrReplaceChild("dec_19", CubeListBuilder.create().texOffs(131, 3).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2), PartPose.offsetAndRotation(-0.4f, -2.0f, -2.7f, 0.2617994f, -2.2514746f, 0.0f));
        PartDefinition dec_18 = mouth_3.addOrReplaceChild("dec_18", CubeListBuilder.create().texOffs(125, 3).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2), PartPose.offsetAndRotation(-0.4f, -2.0f, -1.0f, 0.2617994f, -1.9896754f, 0.0f));
        PartDefinition dec_17 = mouth_3.addOrReplaceChild("dec_17", CubeListBuilder.create().texOffs(4, 3).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2), PartPose.offsetAndRotation(-0.4f, 1.0f, -2.7f, -0.2617994f, -2.2514746f, 0.0f));
        PartDefinition taclejointR1 = bodym.addOrReplaceChild("taclejointR1", CubeListBuilder.create().texOffs(99, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-5.5f, 13.0f, -1.0f));
        PartDefinition tentacle_4 = taclejointR1.addOrReplaceChild("tentacle_4", CubeListBuilder.create().texOffs(58, 43).addBox(-2.5f, -2.5f, -1.0f, 5, 5, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.2617994f, 1.0821041f, (float)Math.PI));
        PartDefinition taclejointR2 = tentacle_4.addOrReplaceChild("taclejointR2", CubeListBuilder.create().texOffs(232, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tentacle_5 = taclejointR2.addOrReplaceChild("tentacle_5", CubeListBuilder.create().texOffs(114, 44).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.2617994f, 0.0f));
        PartDefinition taclejointR3 = tentacle_5.addOrReplaceChild("taclejointR3", CubeListBuilder.create().texOffs(244, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_6 = taclejointR3.addOrReplaceChild("tentacle_6", CubeListBuilder.create().texOffs(222, 45).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.2443461f, 0.0f));
        PartDefinition taclejointR4 = tentacle_6.addOrReplaceChild("taclejointR4", CubeListBuilder.create().texOffs(250, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_7 = taclejointR4.addOrReplaceChild("tentacle_7", CubeListBuilder.create().texOffs(134, 48).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.15707964f, 0.0f));
        PartDefinition bodyd = bodym.addOrReplaceChild("bodyd", CubeListBuilder.create().texOffs(46, 0).addBox(-10.0f, -3.6f, -5.3f, 20, 8, 9), PartPose.offsetAndRotation(0.0f, -5.0f, 5.0f, 0.7679449f, 0.0f, 0.0f));
        PartDefinition bodyd_3 = bodyd.addOrReplaceChild("bodyd_3", CubeListBuilder.create().texOffs(46, 17).addBox(-8.0f, -2.5f, -2.0f, 16, 6, 6), PartPose.offsetAndRotation(0.0f, -3.0f, -2.5f, 0.6981317f, 0.0f, 0.0f));
        PartDefinition bodyd_2 = bodyd.addOrReplaceChild("bodyd_2", CubeListBuilder.create().texOffs(172, 0).addBox(-8.0f, -1.0f, -5.5f, 16, 13, 10), PartPose.offsetAndRotation(0.0f, 3.0f, -1.0f, -0.54105204f, 0.0f, 0.0f));
        PartDefinition bodyd_4 = bodyd_2.addOrReplaceChild("bodyd_4", CubeListBuilder.create().texOffs(96, 15).addBox(-7.0f, -4.0f, -3.5f, 14, 13, 8), PartPose.offsetAndRotation(0.0f, 14.0f, -0.5f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition bodyd_1 = bodym.addOrReplaceChild("bodyd_1", CubeListBuilder.create().texOffs(134, 0).addBox(-6.0f, -3.0f, -6.0f, 12, 14, 7), PartPose.offsetAndRotation(0.0f, 5.0f, -10.0f, 0.0f, (float)Math.PI, 0.0f));
        PartDefinition bodyd_5 = bodyd_1.addOrReplaceChild("bodyd_5", CubeListBuilder.create().texOffs(0, 34).addBox(-3.5f, -2.0f, -5.5f, 7, 14, 8), PartPose.offsetAndRotation(0.0f, 10.8f, -2.6f, -0.715585f, 0.0f, 0.0f));
        PartDefinition bodyd_7 = bodyd_5.addOrReplaceChild("bodyd_7", CubeListBuilder.create().texOffs(110, 36).addBox(-1.5f, -1.0f, -3.0f, 3, 15, 5), PartPose.offsetAndRotation(0.0f, 12.0f, 0.0f, -0.19198622f, 0.0f, 0.0f));
        PartDefinition bodyd_6 = bodyd_1.addOrReplaceChild("bodyd_6", CubeListBuilder.create().texOffs(78, 36).addBox(-4.0f, -5.5f, -4.0f, 8, 9, 8), PartPose.offsetAndRotation(0.0f, -3.0f, -2.5f, 0.38397244f, 0.0f, 0.0f));
        PartDefinition taclejointL1 = bodym.addOrReplaceChild("taclejointL1", CubeListBuilder.create().texOffs(95, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(5.5f, 13.0f, -1.0f));
        PartDefinition tentacle = taclejointL1.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(184, 37).addBox(-2.5f, -2.5f, -1.0f, 5, 5, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.2617994f, 1.0821041f, 0.0f));
        PartDefinition taclejointL2 = tentacle.addOrReplaceChild("taclejointL2", CubeListBuilder.create().texOffs(137, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tentacle_1 = taclejointL2.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(202, 41).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.2617994f, 0.0f));
        PartDefinition taclejointL3 = tentacle_1.addOrReplaceChild("taclejointL3", CubeListBuilder.create().texOffs(178, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_2 = taclejointL3.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(160, 42).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.2443461f, 0.0f));
        PartDefinition taclejointL4 = tentacle_2.addOrReplaceChild("taclejointL4", CubeListBuilder.create().texOffs(214, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 9.0f));
        PartDefinition tentacle_3 = taclejointL4.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(30, 43).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.15707964f, 0.0f));
        PartDefinition jointRLX = mainbody.addOrReplaceChild("jointRLX", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.0f, -9.0f, 30.0f));
        PartDefinition JD_2 = jointRLX.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(248, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.6354473f, 0.0f));
        PartDefinition jointRLY = JD_2.addOrReplaceChild("jointRLY", CubeListBuilder.create().texOffs(3, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_15 = jointRLY.addOrReplaceChild("body_15", CubeListBuilder.create().texOffs(171, 82).addBox(-2.0f, -2.0f, -2.5f, 17, 6, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0471976f));
        PartDefinition jointRL1 = body_15.addOrReplaceChild("jointRL1", CubeListBuilder.create().texOffs(48, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 1.0f, 0.0f));
        PartDefinition leg = jointRL1.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(209, 87).addBox(-2.0f, -1.5f, -3.0f, 13, 5, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0297443f));
        PartDefinition jointRL2 = leg.addOrReplaceChild("jointRL2", CubeListBuilder.create().texOffs(95, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.0f, 1.0f, 0.0f));
        PartDefinition leg_1 = jointRL2.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(0, 81).addBox(-1.5f, -1.0f, -2.0f, 3, 13, 4), PartPose.offsetAndRotation(0.9f, -0.2f, 0.0f, 0.0f, 0.0f, -0.10471976f));
        PartDefinition jointRL3 = leg_1.addOrReplaceChild("jointRL3", CubeListBuilder.create().texOffs(125, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 13.0f, 0.0f));
        PartDefinition leg_2 = jointRL3.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(77, 91).addBox(-3.5f, -1.2f, -3.0f, 12, 4, 6), PartPose.offsetAndRotation(0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 1.6406095f));
        PartDefinition jointRL4 = leg_2.addOrReplaceChild("jointRL4", CubeListBuilder.create().texOffs(129, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.5f, 0.0f, 0.0f));
        PartDefinition leg_3 = jointRL4.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(143, 85).addBox(-1.0f, -2.5f, -4.0f, 10, 6, 8), PartPose.offset(0.5f, 0.4f, 0.0f));
        PartDefinition toe_4 = leg_3.addOrReplaceChild("toe_4", CubeListBuilder.create().texOffs(7, 91).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 7), PartPose.offsetAndRotation(3.3f, -2.5f, -2.0f, 1.5707964f, 0.0f, 1.1868238f));
        PartDefinition toe_5 = leg_3.addOrReplaceChild("toe_5", CubeListBuilder.create().texOffs(126, 36).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 5), PartPose.offsetAndRotation(5.0f, -2.5f, 2.0f, 1.5707964f, 0.0f, 1.1868238f));
        PartDefinition dec_20 = body_15.addOrReplaceChild("dec_20", CubeListBuilder.create().texOffs(49, 86).addBox(-3.0f, -2.0f, -3.5f, 10, 4, 7), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, -0.13962634f, 0.0f, -0.19198622f));
        PartDefinition jointLLx = mainbody.addOrReplaceChild("jointLLx", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, -9.0f, 30.0f));
        PartDefinition JD_3 = jointLLx.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(172, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.5061455f, 0.0f));
        PartDefinition jointLLY = JD_3.addOrReplaceChild("jointLLY", CubeListBuilder.create().texOffs(176, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_16 = jointLLY.addOrReplaceChild("body_16", CubeListBuilder.create().texOffs(20, 97).addBox(-2.0f, -2.0f, -2.5f, 17, 6, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0471976f));
        PartDefinition dec_21 = body_16.addOrReplaceChild("dec_21", CubeListBuilder.create().texOffs(113, 92).addBox(-3.0f, -2.0f, -3.5f, 10, 4, 7), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, 0.13962634f, 0.0f, -0.19198622f));
        PartDefinition jointLL1 = body_16.addOrReplaceChild("jointLL1", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 1.0f, 0.0f));
        PartDefinition leg_4 = jointLL1.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(173, 93).addBox(-2.0f, -1.5f, -3.0f, 13, 5, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0297443f));
        PartDefinition jointLL2 = leg_4.addOrReplaceChild("jointLL2", CubeListBuilder.create().texOffs(6, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.0f, 1.0f, 0.0f));
        PartDefinition leg_5 = jointLL2.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(64, 97).addBox(-1.5f, -1.0f, -2.0f, 3, 13, 4), PartPose.offsetAndRotation(0.9f, -0.2f, 0.0f, 0.0f, 0.0f, -0.10471976f));
        PartDefinition jointLL3 = leg_5.addOrReplaceChild("jointLL3", CubeListBuilder.create().texOffs(51, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 13.0f, 0.0f));
        PartDefinition leg_6 = jointLL3.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(205, 98).addBox(-3.5f, -1.2f, -3.0f, 12, 4, 6), PartPose.offsetAndRotation(0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 1.6406095f));
        PartDefinition jointLL4 = leg_6.addOrReplaceChild("jointLL4", CubeListBuilder.create().texOffs(232, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.5f, 0.0f, 0.0f));
        PartDefinition leg_7 = jointLL4.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(139, 99).addBox(-1.0f, -2.5f, -4.0f, 10, 6, 8), PartPose.offset(0.5f, 0.4f, 0.0f));
        PartDefinition toe_6 = leg_7.addOrReplaceChild("toe_6", CubeListBuilder.create().texOffs(240, 41).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 5), PartPose.offsetAndRotation(5.0f, -2.5f, -2.0f, 1.5707964f, 0.0f, 1.1868238f));
        PartDefinition toe_7 = leg_7.addOrReplaceChild("toe_7", CubeListBuilder.create().texOffs(0, 100).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 7), PartPose.offsetAndRotation(3.3f, -2.5f, 2.0f, 1.5707964f, 0.0f, 1.1868238f));
        return LayerDefinition.create(mesh, 256, 120);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityCanraAdapted parasite = (EntityCanraAdapted)entity;
        this.jointFLAX.yRot = 0.0f;
        this.jointFLAY.zRot = 0.0f;
        this.jointFLA1.zRot = 0.0f;
        this.jointFLA2.zRot = 0.0f;
        this.jointFRAX.yRot = 0.0f;
        this.jointFRAY.zRot = 0.0f;
        this.jointFRA1.zRot = 0.0f;
        this.jointFRA2.zRot = 0.0f;
        this.jointLLx.yRot = 0.0f;
        this.jointLLY.zRot = 0.0f;
        this.jointLL1.zRot = 0.0f;
        this.jointLL2.zRot = 0.0f;
        this.jointRLX.yRot = 0.0f;
        this.jointRLY.zRot = 0.0f;
        this.jointRL1.zRot = 0.0f;
        this.jointRL2.zRot = 0.0f;
        this.taclejointL1.yRot = 0.0f;
        this.taclejointL3.yRot = 0.0f;
        this.taclejointR1.yRot = 0.0f;
        this.taclejointR3.yRot = 0.0f;
        this.mainbody.xRot = 0.0f;
        this.mainbody.y = 0.0f;
        this.mainbody.x = 0.0f;
        this.mainbody.z = 0.0f;
        this.jointH.xRot = headPitch * 0.016f;
        this.jointH.yRot = 0.0f;
        this.jointH.zRot = -1.0f * netHeadYaw * 0.016f;
        this.jointLM.yRot = 0.0f;
        this.jointLM1.yRot = 0.0f;
        this.jointRM.yRot = 0.0f;
        this.jointRM1.yRot = 0.0f;
        this.taclejointL1.visible = !(parasite.getLeft() == 0.0f);
        this.taclejointR1.visible = !(parasite.getRight() == 0.0f);
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                float GS = 1.85f;
                float GD = 0.35f;
                this.swingY(this.jointFLAX, 0.2f * GS, 1.5f * GD, 1, -0.2f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLAY, 0.2f * GS, 0.7f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLA1, 0.2f * GS, 0.3f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLA2, 0.2f * GS, 0.3f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRAX, 0.2f * GS, 1.5f * GD, 1, -0.2f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRAY, 0.2f * GS, 0.7f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRA1, 0.2f * GS, 0.3f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRA2, 0.2f * GS, 0.3f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLLx, 0.2f * GS, 1.2f * GD, -1, -0.2f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLLY, 0.2f * GS, 0.6f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLL1, 0.2f * GS, 0.4f * GD, 1, 2.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLL2, 0.2f * GS, 0.4f * GD, 2, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointRLX, 0.2f * GS, 1.2f * GD, -1, -0.2f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRLY, 0.2f * GS, 0.6f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRL1, 0.2f * GS, 0.4f * GD, -1, 2.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRL2, 0.2f * GS, 0.4f * GD, -2, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.4f * GS, -1, limbSwing, limbSwingAmount, 0.08f);
            }
            float f1 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.22f;
            float f2 = Mth.cos((float)(ageInTicks * 0.119f)) * 0.24f;
            float f3 = Mth.cos((float)(ageInTicks * 0.099f)) * 0.25f;
            this.taclejointL1.yRot = f2;
            this.taclejointL3.yRot = f2;
            this.taclejointR1.yRot = f2;
            this.taclejointR3.yRot = -1.0f * f2;
            this.jointLM.yRot = f1 = Mth.cos((float)(ageInTicks * 0.155984f)) * 0.24f;
            this.jointLM1.yRot = -1.0f * f1;
            this.jointRM.yRot = -1.0f * f1;
            this.jointRM1.yRot = -1.0f * f1;
        } else if (i == 1) {
            if (!parasite.getStillAni()) {
                float GS = 1.85f;
                float GD = 0.35f;
                this.swingY(this.jointFLAX, 0.2f * GS, 1.5f * GD, 1, -0.2f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLAY, 0.2f * GS, 0.7f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLA1, 0.2f * GS, 0.3f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLA2, 0.2f * GS, 0.3f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRAX, 0.2f * GS, 1.5f * GD, 1, -0.2f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRAY, 0.2f * GS, 0.7f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRA1, 0.2f * GS, 0.3f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRA2, 0.2f * GS, 0.3f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLLx, 0.2f * GS, 1.2f * GD, -1, -0.2f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLLY, 0.2f * GS, 0.6f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLL1, 0.2f * GS, 0.4f * GD, 1, 2.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLL2, 0.2f * GS, 0.4f * GD, 2, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointRLX, 0.2f * GS, 1.2f * GD, -1, -0.2f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRLY, 0.2f * GS, 0.6f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRL1, 0.2f * GS, 0.4f * GD, -1, 2.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRL2, 0.2f * GS, 0.4f * GD, -2, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.4f * GS, -1, limbSwing, limbSwingAmount, 0.08f);
            }
            float f1 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.22f;
            float f2 = Mth.cos((float)(ageInTicks * 0.119f)) * 0.24f;
            float f3 = Mth.cos((float)(ageInTicks * 0.099f)) * 0.25f;
            this.taclejointL1.yRot = f2;
            this.taclejointL3.yRot = f2;
            this.taclejointR1.yRot = f2;
            this.taclejointR3.yRot = -1.0f * f2;
            this.jointLM.yRot = f1 = Mth.cos((float)(ageInTicks * 0.255984f)) * 0.24f;
            this.jointLM1.yRot = -1.0f * f1;
            this.jointRM.yRot = -1.0f * f1;
            this.jointRM1.yRot = -1.0f * f1;
        } else if (i == 2) {
            if (!parasite.getStillAni()) {
                float GS = 2.1f;
                float GD = 0.35f;
                this.swingY(this.jointFLAX, 0.2f * GS, 1.5f * GD, 1, -0.2f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLAY, 0.2f * GS, 0.7f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLA1, 0.2f * GS, 0.3f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLA2, 0.2f * GS, 0.3f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRAX, 0.2f * GS, 1.5f * GD, 1, -0.2f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRAY, 0.2f * GS, 0.7f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRA1, 0.2f * GS, 0.3f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRA2, 0.2f * GS, 0.3f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLLx, 0.2f * GS, 1.2f * GD, -1, -0.2f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLLY, 0.2f * GS, 0.6f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLL1, 0.2f * GS, 0.4f * GD, 1, 2.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLL2, 0.2f * GS, 0.4f * GD, 2, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointRLX, 0.2f * GS, 1.2f * GD, -1, -0.2f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRLY, 0.2f * GS, 0.6f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRL1, 0.2f * GS, 0.4f * GD, -1, 2.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRL2, 0.2f * GS, 0.4f * GD, -2, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.4f * GS, -1, limbSwing, limbSwingAmount, 0.08f);
            }
            float f1 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.22f;
            float f2 = Mth.cos((float)(ageInTicks * 0.119f)) * 0.24f;
            float f3 = Mth.cos((float)(ageInTicks * 0.099f)) * 0.25f;
            this.taclejointL1.yRot = f2;
            this.taclejointL3.yRot = f2;
            this.taclejointR1.yRot = f2;
            this.taclejointR3.yRot = -1.0f * f2;
            this.jointLM.yRot = f1 = Mth.cos((float)(ageInTicks * 0.255984f)) * 0.24f;
            this.jointLM1.yRot = -1.0f * f1;
            this.jointRM.yRot = -1.0f * f1;
            this.jointRM1.yRot = -1.0f * f1;
        } else if (i == 10) {
            float f1 = Mth.cos((float)(ageInTicks * 0.3f)) * 0.42f;
            this.jointH.xRot = 0.5f;
            this.jointH.zRot = f1;
            f1 = Mth.cos((float)(ageInTicks * 0.455984f)) * 0.14f;
            this.jointLM.yRot = -0.5f + f1;
            this.jointLM1.yRot = -1.0f * f1;
            this.jointRM.yRot = 0.5f + -1.0f * f1;
            this.jointRM1.yRot = -1.0f * f1;
            f1 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.22f;
            float f2 = Mth.cos((float)(ageInTicks * 0.119f)) * 0.24f;
            this.taclejointL1.yRot = 0.5f + f2;
            this.taclejointL3.yRot = -0.5f + f2;
            this.taclejointR1.yRot = -0.5f + f2;
            this.taclejointR3.yRot = -0.5f + -1.0f * f2;
        } else if (i == 25) {
            float f2 = Mth.cos((float)(ageInTicks * 2.6f)) * 0.015f;
            float f1 = Mth.cos((float)(ageInTicks * 2.27f)) * 0.02f;
            this.mainbody.x = f2;
            this.mainbody.z = f1;
            f1 = Mth.cos((float)(ageInTicks * 0.3f)) * 0.042f;
            this.jointH.xRot = 0.5f;
            this.jointH.zRot = f1;
            f1 = Mth.cos((float)(ageInTicks * 0.155984f)) * 0.14f;
            this.jointLM.yRot = -0.5f + f1;
            this.jointLM1.yRot = -1.0f * f1;
            this.jointRM.yRot = 0.5f + -1.0f * f1;
            this.jointRM1.yRot = -1.0f * f1;
            f1 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.22f;
            f2 = Mth.cos((float)(ageInTicks * 0.119f)) * 0.4f;
            this.taclejointL1.yRot = 0.5f + f2;
            this.taclejointL3.yRot = -0.5f + f2;
            this.taclejointR1.yRot = -0.5f + f2;
            this.taclejointR3.yRot = -0.5f + -1.0f * f2;
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
