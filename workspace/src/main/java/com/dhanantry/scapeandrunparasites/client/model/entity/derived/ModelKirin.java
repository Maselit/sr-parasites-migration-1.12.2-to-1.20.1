package com.dhanantry.scapeandrunparasites.client.model.entity.derived;

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
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityPCosmical;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelKirin extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "kirin"), "main");
    private final ModelPart mainbody;
    private final ModelPart bodym;
    private final ModelPart jointFLAX;
    private final ModelPart jointFRAX;
    private final ModelPart joint;
    private final ModelPart joint_1;
    private final ModelPart jointFRAX_1;
    private final ModelPart joint_2;
    private final ModelPart joint_3;
    private final ModelPart bodyd;
    private final ModelPart body;
    private final ModelPart jointH;
    private final ModelPart bodyd_1;
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
    private final ModelPart mouthl;
    private final ModelPart jointLM1;
    private final ModelPart dec;
    private final ModelPart dec_1;
    private final ModelPart dec_2;
    private final ModelPart dec_3;
    private final ModelPart dec_4;
    private final ModelPart dec_5;
    private final ModelPart dec_6;
    private final ModelPart dec_7;
    private final ModelPart mouth;
    private final ModelPart dec_8;
    private final ModelPart dec_9;
    private final ModelPart dec_10;
    private final ModelPart dec_11;
    private final ModelPart dec_12;
    private final ModelPart mouthr;
    private final ModelPart jointRM1;
    private final ModelPart dec_13;
    private final ModelPart dec_14;
    private final ModelPart dec_15;
    private final ModelPart dec_16;
    private final ModelPart dec_17;
    private final ModelPart dec_18;
    private final ModelPart dec_19;
    private final ModelPart dec_20;
    private final ModelPart mouth_1;
    private final ModelPart dec_21;
    private final ModelPart dec_22;
    private final ModelPart dec_23;
    private final ModelPart dec_24;
    private final ModelPart dec_25;
    private final ModelPart bodyd_5;
    private final ModelPart bodyd_6;
    private final ModelPart bodyd_7;
    private final ModelPart JD;
    private final ModelPart jointFLAY;
    private final ModelPart JD_1;
    private final ModelPart jointFRAY;
    private final ModelPart body_3;
    private final ModelPart jointFRA1;
    private final ModelPart bodydec;
    private final ModelPart body_4;
    private final ModelPart jointFRA2;
    private final ModelPart body_5;
    private final ModelPart jointFRA2_1;
    private final ModelPart body_6;
    private final ModelPart jointFRA3;
    private final ModelPart body_7;
    private final ModelPart body_8;
    private final ModelPart body_9;
    private final ModelPart JD_2;
    private final ModelPart joint_4;
    private final ModelPart body_10;
    private final ModelPart joint_5;
    private final ModelPart body_11;
    private final ModelPart joint_6;
    private final ModelPart body_12;
    private final ModelPart joint_7;
    private final ModelPart body_13;
    private final ModelPart joint_8;
    private final ModelPart body_14;
    private final ModelPart body_15;
    private final ModelPart body_16;
    private final ModelPart body_17;
    private final ModelPart JD_3;
    private final ModelPart joint_9;
    private final ModelPart body_18;
    private final ModelPart joint_10;
    private final ModelPart body_19;
    private final ModelPart joint_11;
    private final ModelPart body_20;
    private final ModelPart joint_12;
    private final ModelPart body_21;
    private final ModelPart joint_13;
    private final ModelPart body_22;
    private final ModelPart body_23;
    private final ModelPart body_24;
    private final ModelPart body_25;
    private final ModelPart JD_4;
    private final ModelPart jointFRAY_1;
    private final ModelPart body_26;
    private final ModelPart jointFRA1_1;
    private final ModelPart bodydec_1;
    private final ModelPart body_27;
    private final ModelPart jointFRA2_2;
    private final ModelPart body_28;
    private final ModelPart jointFRA2_3;
    private final ModelPart body_29;
    private final ModelPart jointFRA3_1;
    private final ModelPart body_30;
    private final ModelPart body_31;
    private final ModelPart body_32;
    private final ModelPart JD_5;
    private final ModelPart joint_14;
    private final ModelPart body_33;
    private final ModelPart joint_15;
    private final ModelPart body_34;
    private final ModelPart joint_16;
    private final ModelPart body_35;
    private final ModelPart joint_17;
    private final ModelPart body_36;
    private final ModelPart joint_18;
    private final ModelPart body_37;
    private final ModelPart body_38;
    private final ModelPart body_39;
    private final ModelPart body_40;
    private final ModelPart JD_6;
    private final ModelPart joint_19;
    private final ModelPart body_41;
    private final ModelPart joint_20;
    private final ModelPart body_42;
    private final ModelPart joint_21;
    private final ModelPart body_43;
    private final ModelPart joint_22;
    private final ModelPart body_44;
    private final ModelPart joint_23;
    private final ModelPart body_45;
    private final ModelPart body_46;
    private final ModelPart body_47;
    private final ModelPart body_48;

    public ModelKirin(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.bodym = root.getChild("mainbody").getChild("bodym");
        this.jointFLAX = root.getChild("mainbody").getChild("jointFLAX");
        this.jointFRAX = root.getChild("mainbody").getChild("jointFRAX");
        this.joint = root.getChild("mainbody").getChild("joint");
        this.joint_1 = root.getChild("mainbody").getChild("joint_1");
        this.jointFRAX_1 = root.getChild("mainbody").getChild("jointFRAX_1");
        this.joint_2 = root.getChild("mainbody").getChild("joint_2");
        this.joint_3 = root.getChild("mainbody").getChild("joint_3");
        this.bodyd = root.getChild("mainbody").getChild("bodym").getChild("bodyd");
        this.body = root.getChild("mainbody").getChild("bodym").getChild("body");
        this.jointH = root.getChild("mainbody").getChild("bodym").getChild("jointH");
        this.bodyd_1 = root.getChild("mainbody").getChild("bodym").getChild("bodyd_1");
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
        this.mouthl = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl");
        this.jointLM1 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("jointLM1");
        this.dec = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("dec");
        this.dec_1 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("dec_1");
        this.dec_2 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("dec_2");
        this.dec_3 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("dec_3");
        this.dec_4 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("dec_4");
        this.dec_5 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("dec_5");
        this.dec_6 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("dec_6");
        this.dec_7 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("dec_7");
        this.mouth = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("jointLM1").getChild("mouth");
        this.dec_8 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("jointLM1").getChild("mouth").getChild("dec_8");
        this.dec_9 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("jointLM1").getChild("mouth").getChild("dec_9");
        this.dec_10 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("jointLM1").getChild("mouth").getChild("dec_10");
        this.dec_11 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("jointLM1").getChild("mouth").getChild("dec_11");
        this.dec_12 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointLM").getChild("mouthl").getChild("jointLM1").getChild("mouth").getChild("dec_12");
        this.mouthr = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr");
        this.jointRM1 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("jointRM1");
        this.dec_13 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("dec_13");
        this.dec_14 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("dec_14");
        this.dec_15 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("dec_15");
        this.dec_16 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("dec_16");
        this.dec_17 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("dec_17");
        this.dec_18 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("dec_18");
        this.dec_19 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("dec_19");
        this.dec_20 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("dec_20");
        this.mouth_1 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("jointRM1").getChild("mouth_1");
        this.dec_21 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("jointRM1").getChild("mouth_1").getChild("dec_21");
        this.dec_22 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("jointRM1").getChild("mouth_1").getChild("dec_22");
        this.dec_23 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("jointRM1").getChild("mouth_1").getChild("dec_23");
        this.dec_24 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("jointRM1").getChild("mouth_1").getChild("dec_24");
        this.dec_25 = root.getChild("mainbody").getChild("bodym").getChild("jointH").getChild("bodybm").getChild("jointRM").getChild("mouthr").getChild("jointRM1").getChild("mouth_1").getChild("dec_25");
        this.bodyd_5 = root.getChild("mainbody").getChild("bodym").getChild("bodyd_1").getChild("bodyd_5");
        this.bodyd_6 = root.getChild("mainbody").getChild("bodym").getChild("bodyd_1").getChild("bodyd_6");
        this.bodyd_7 = root.getChild("mainbody").getChild("bodym").getChild("bodyd_1").getChild("bodyd_5").getChild("bodyd_7");
        this.JD = root.getChild("mainbody").getChild("jointFLAX").getChild("JD");
        this.jointFLAY = root.getChild("mainbody").getChild("jointFLAX").getChild("JD").getChild("jointFLAY");
        this.JD_1 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1");
        this.jointFRAY = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY");
        this.body_3 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_3");
        this.jointFRA1 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_3").getChild("jointFRA1");
        this.bodydec = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_3").getChild("bodydec");
        this.body_4 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_3").getChild("jointFRA1").getChild("body_4");
        this.jointFRA2 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_3").getChild("jointFRA1").getChild("body_4").getChild("jointFRA2");
        this.body_5 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_3").getChild("jointFRA1").getChild("body_4").getChild("jointFRA2").getChild("body_5");
        this.jointFRA2_1 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_3").getChild("jointFRA1").getChild("body_4").getChild("jointFRA2").getChild("body_5").getChild("jointFRA2_1");
        this.body_6 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_3").getChild("jointFRA1").getChild("body_4").getChild("jointFRA2").getChild("body_5").getChild("jointFRA2_1").getChild("body_6");
        this.jointFRA3 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_3").getChild("jointFRA1").getChild("body_4").getChild("jointFRA2").getChild("body_5").getChild("jointFRA2_1").getChild("body_6").getChild("jointFRA3");
        this.body_7 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_3").getChild("jointFRA1").getChild("body_4").getChild("jointFRA2").getChild("body_5").getChild("jointFRA2_1").getChild("body_6").getChild("jointFRA3").getChild("body_7");
        this.body_8 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_3").getChild("jointFRA1").getChild("body_4").getChild("jointFRA2").getChild("body_5").getChild("jointFRA2_1").getChild("body_6").getChild("jointFRA3").getChild("body_7").getChild("body_8");
        this.body_9 = root.getChild("mainbody").getChild("jointFRAX").getChild("JD_1").getChild("jointFRAY").getChild("body_3").getChild("jointFRA1").getChild("body_4").getChild("jointFRA2").getChild("body_5").getChild("jointFRA2_1").getChild("body_6").getChild("jointFRA3").getChild("body_7").getChild("body_8").getChild("body_9");
        this.JD_2 = root.getChild("mainbody").getChild("joint").getChild("JD_2");
        this.joint_4 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4");
        this.body_10 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4").getChild("body_10");
        this.joint_5 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4").getChild("body_10").getChild("joint_5");
        this.body_11 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4").getChild("body_10").getChild("joint_5").getChild("body_11");
        this.joint_6 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4").getChild("body_10").getChild("joint_5").getChild("body_11").getChild("joint_6");
        this.body_12 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4").getChild("body_10").getChild("joint_5").getChild("body_11").getChild("joint_6").getChild("body_12");
        this.joint_7 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4").getChild("body_10").getChild("joint_5").getChild("body_11").getChild("joint_6").getChild("body_12").getChild("joint_7");
        this.body_13 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4").getChild("body_10").getChild("joint_5").getChild("body_11").getChild("joint_6").getChild("body_12").getChild("joint_7").getChild("body_13");
        this.joint_8 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4").getChild("body_10").getChild("joint_5").getChild("body_11").getChild("joint_6").getChild("body_12").getChild("joint_7").getChild("body_13").getChild("joint_8");
        this.body_14 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4").getChild("body_10").getChild("joint_5").getChild("body_11").getChild("joint_6").getChild("body_12").getChild("joint_7").getChild("body_13").getChild("joint_8").getChild("body_14");
        this.body_15 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4").getChild("body_10").getChild("joint_5").getChild("body_11").getChild("joint_6").getChild("body_12").getChild("joint_7").getChild("body_13").getChild("joint_8").getChild("body_14").getChild("body_15");
        this.body_16 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4").getChild("body_10").getChild("joint_5").getChild("body_11").getChild("joint_6").getChild("body_12").getChild("joint_7").getChild("body_13").getChild("joint_8").getChild("body_14").getChild("body_15").getChild("body_16");
        this.body_17 = root.getChild("mainbody").getChild("joint").getChild("JD_2").getChild("joint_4").getChild("body_10").getChild("joint_5").getChild("body_11").getChild("joint_6").getChild("body_12").getChild("joint_7").getChild("body_13").getChild("joint_8").getChild("body_14").getChild("body_15").getChild("body_16").getChild("body_17");
        this.JD_3 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3");
        this.joint_9 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9");
        this.body_18 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9").getChild("body_18");
        this.joint_10 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9").getChild("body_18").getChild("joint_10");
        this.body_19 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9").getChild("body_18").getChild("joint_10").getChild("body_19");
        this.joint_11 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9").getChild("body_18").getChild("joint_10").getChild("body_19").getChild("joint_11");
        this.body_20 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9").getChild("body_18").getChild("joint_10").getChild("body_19").getChild("joint_11").getChild("body_20");
        this.joint_12 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9").getChild("body_18").getChild("joint_10").getChild("body_19").getChild("joint_11").getChild("body_20").getChild("joint_12");
        this.body_21 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9").getChild("body_18").getChild("joint_10").getChild("body_19").getChild("joint_11").getChild("body_20").getChild("joint_12").getChild("body_21");
        this.joint_13 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9").getChild("body_18").getChild("joint_10").getChild("body_19").getChild("joint_11").getChild("body_20").getChild("joint_12").getChild("body_21").getChild("joint_13");
        this.body_22 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9").getChild("body_18").getChild("joint_10").getChild("body_19").getChild("joint_11").getChild("body_20").getChild("joint_12").getChild("body_21").getChild("joint_13").getChild("body_22");
        this.body_23 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9").getChild("body_18").getChild("joint_10").getChild("body_19").getChild("joint_11").getChild("body_20").getChild("joint_12").getChild("body_21").getChild("joint_13").getChild("body_22").getChild("body_23");
        this.body_24 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9").getChild("body_18").getChild("joint_10").getChild("body_19").getChild("joint_11").getChild("body_20").getChild("joint_12").getChild("body_21").getChild("joint_13").getChild("body_22").getChild("body_23").getChild("body_24");
        this.body_25 = root.getChild("mainbody").getChild("joint_1").getChild("JD_3").getChild("joint_9").getChild("body_18").getChild("joint_10").getChild("body_19").getChild("joint_11").getChild("body_20").getChild("joint_12").getChild("body_21").getChild("joint_13").getChild("body_22").getChild("body_23").getChild("body_24").getChild("body_25");
        this.JD_4 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4");
        this.jointFRAY_1 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1");
        this.body_26 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1").getChild("body_26");
        this.jointFRA1_1 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1").getChild("body_26").getChild("jointFRA1_1");
        this.bodydec_1 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1").getChild("body_26").getChild("bodydec_1");
        this.body_27 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1").getChild("body_26").getChild("jointFRA1_1").getChild("body_27");
        this.jointFRA2_2 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1").getChild("body_26").getChild("jointFRA1_1").getChild("body_27").getChild("jointFRA2_2");
        this.body_28 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1").getChild("body_26").getChild("jointFRA1_1").getChild("body_27").getChild("jointFRA2_2").getChild("body_28");
        this.jointFRA2_3 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1").getChild("body_26").getChild("jointFRA1_1").getChild("body_27").getChild("jointFRA2_2").getChild("body_28").getChild("jointFRA2_3");
        this.body_29 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1").getChild("body_26").getChild("jointFRA1_1").getChild("body_27").getChild("jointFRA2_2").getChild("body_28").getChild("jointFRA2_3").getChild("body_29");
        this.jointFRA3_1 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1").getChild("body_26").getChild("jointFRA1_1").getChild("body_27").getChild("jointFRA2_2").getChild("body_28").getChild("jointFRA2_3").getChild("body_29").getChild("jointFRA3_1");
        this.body_30 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1").getChild("body_26").getChild("jointFRA1_1").getChild("body_27").getChild("jointFRA2_2").getChild("body_28").getChild("jointFRA2_3").getChild("body_29").getChild("jointFRA3_1").getChild("body_30");
        this.body_31 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1").getChild("body_26").getChild("jointFRA1_1").getChild("body_27").getChild("jointFRA2_2").getChild("body_28").getChild("jointFRA2_3").getChild("body_29").getChild("jointFRA3_1").getChild("body_30").getChild("body_31");
        this.body_32 = root.getChild("mainbody").getChild("jointFRAX_1").getChild("JD_4").getChild("jointFRAY_1").getChild("body_26").getChild("jointFRA1_1").getChild("body_27").getChild("jointFRA2_2").getChild("body_28").getChild("jointFRA2_3").getChild("body_29").getChild("jointFRA3_1").getChild("body_30").getChild("body_31").getChild("body_32");
        this.JD_5 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5");
        this.joint_14 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14");
        this.body_33 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14").getChild("body_33");
        this.joint_15 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14").getChild("body_33").getChild("joint_15");
        this.body_34 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14").getChild("body_33").getChild("joint_15").getChild("body_34");
        this.joint_16 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14").getChild("body_33").getChild("joint_15").getChild("body_34").getChild("joint_16");
        this.body_35 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14").getChild("body_33").getChild("joint_15").getChild("body_34").getChild("joint_16").getChild("body_35");
        this.joint_17 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14").getChild("body_33").getChild("joint_15").getChild("body_34").getChild("joint_16").getChild("body_35").getChild("joint_17");
        this.body_36 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14").getChild("body_33").getChild("joint_15").getChild("body_34").getChild("joint_16").getChild("body_35").getChild("joint_17").getChild("body_36");
        this.joint_18 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14").getChild("body_33").getChild("joint_15").getChild("body_34").getChild("joint_16").getChild("body_35").getChild("joint_17").getChild("body_36").getChild("joint_18");
        this.body_37 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14").getChild("body_33").getChild("joint_15").getChild("body_34").getChild("joint_16").getChild("body_35").getChild("joint_17").getChild("body_36").getChild("joint_18").getChild("body_37");
        this.body_38 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14").getChild("body_33").getChild("joint_15").getChild("body_34").getChild("joint_16").getChild("body_35").getChild("joint_17").getChild("body_36").getChild("joint_18").getChild("body_37").getChild("body_38");
        this.body_39 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14").getChild("body_33").getChild("joint_15").getChild("body_34").getChild("joint_16").getChild("body_35").getChild("joint_17").getChild("body_36").getChild("joint_18").getChild("body_37").getChild("body_38").getChild("body_39");
        this.body_40 = root.getChild("mainbody").getChild("joint_2").getChild("JD_5").getChild("joint_14").getChild("body_33").getChild("joint_15").getChild("body_34").getChild("joint_16").getChild("body_35").getChild("joint_17").getChild("body_36").getChild("joint_18").getChild("body_37").getChild("body_38").getChild("body_39").getChild("body_40");
        this.JD_6 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6");
        this.joint_19 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19");
        this.body_41 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19").getChild("body_41");
        this.joint_20 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19").getChild("body_41").getChild("joint_20");
        this.body_42 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19").getChild("body_41").getChild("joint_20").getChild("body_42");
        this.joint_21 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19").getChild("body_41").getChild("joint_20").getChild("body_42").getChild("joint_21");
        this.body_43 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19").getChild("body_41").getChild("joint_20").getChild("body_42").getChild("joint_21").getChild("body_43");
        this.joint_22 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19").getChild("body_41").getChild("joint_20").getChild("body_42").getChild("joint_21").getChild("body_43").getChild("joint_22");
        this.body_44 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19").getChild("body_41").getChild("joint_20").getChild("body_42").getChild("joint_21").getChild("body_43").getChild("joint_22").getChild("body_44");
        this.joint_23 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19").getChild("body_41").getChild("joint_20").getChild("body_42").getChild("joint_21").getChild("body_43").getChild("joint_22").getChild("body_44").getChild("joint_23");
        this.body_45 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19").getChild("body_41").getChild("joint_20").getChild("body_42").getChild("joint_21").getChild("body_43").getChild("joint_22").getChild("body_44").getChild("joint_23").getChild("body_45");
        this.body_46 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19").getChild("body_41").getChild("joint_20").getChild("body_42").getChild("joint_21").getChild("body_43").getChild("joint_22").getChild("body_44").getChild("joint_23").getChild("body_45").getChild("body_46");
        this.body_47 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19").getChild("body_41").getChild("joint_20").getChild("body_42").getChild("joint_21").getChild("body_43").getChild("joint_22").getChild("body_44").getChild("joint_23").getChild("body_45").getChild("body_46").getChild("body_47");
        this.body_48 = root.getChild("mainbody").getChild("joint_3").getChild("JD_6").getChild("joint_19").getChild("body_41").getChild("joint_20").getChild("body_42").getChild("joint_21").getChild("body_43").getChild("joint_22").getChild("body_44").getChild("joint_23").getChild("body_45").getChild("body_46").getChild("body_47").getChild("body_48");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, -77.0f, -16.0f, 0.43633232f, 0.0f, (float)Math.PI));
        PartDefinition jointFLAX = mainbody.addOrReplaceChild("jointFLAX", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, -4.0f, 3.0f));
        PartDefinition JD = jointFLAX.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(36, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.715585f, 0.0f));
        PartDefinition jointFLAY = JD.addOrReplaceChild("jointFLAY", CubeListBuilder.create().texOffs(214, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition jointFRAX = mainbody.addOrReplaceChild("jointFRAX", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.0f, 11.0f, 3.0f));
        PartDefinition JD_1 = jointFRAX.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(165, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.0943952f, 0.0f));
        PartDefinition jointFRAY = JD_1.addOrReplaceChild("jointFRAY", CubeListBuilder.create().texOffs(169, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_3 = jointFRAY.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(36, 68).addBox(-2.0f, -3.0f, -3.0f, 15, 6, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, (float)Math.PI, 0.7679449f));
        PartDefinition jointFRA1 = body_3.addOrReplaceChild("jointFRA1", CubeListBuilder.create().texOffs(173, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.0f, 0.0f, 0.0f));
        PartDefinition body_4 = jointFRA1.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(176, 72).addBox(-1.0f, -2.0f, -2.5f, 17, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, -0.43633232f, -0.5934119f));
        PartDefinition jointFRA2 = body_4.addOrReplaceChild("jointFRA2", CubeListBuilder.create().texOffs(177, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(16.0f, 0.0f, 0.0f));
        PartDefinition body_5 = jointFRA2.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(72, 76).addBox(-2.0f, -2.0f, -3.0f, 20, 4, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.29670596f));
        PartDefinition jointFRA2_1 = body_5.addOrReplaceChild("jointFRA2_1", CubeListBuilder.create().texOffs(251, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(16.0f, 0.0f, 0.0f));
        PartDefinition body_6 = jointFRA2_1.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(107, 79).addBox(0.5f, -2.0f, -2.5f, 31, 5, 5), PartPose.offsetAndRotation(0.8f, 0.0f, 0.0f, 0.0f, 0.0f, -0.34906584f));
        PartDefinition jointFRA3 = body_6.addOrReplaceChild("jointFRA3", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(29.5f, 0.0f, 0.0f));
        PartDefinition body_7 = jointFRA3.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.0f, -2.0f, 14, 4, 4), PartPose.offsetAndRotation(0.8f, 0.4f, 0.0f, 0.0f, 0.0f, 0.5934119f));
        PartDefinition body_8 = body_7.addOrReplaceChild("body_8", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.5f, -2.5f, 14, 5, 5), PartPose.offsetAndRotation(13.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.12217305f));
        PartDefinition body_9 = body_8.addOrReplaceChild("body_9", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -3.0f, -3.0f, 9, 6, 6), PartPose.offsetAndRotation(13.5f, 0.3f, 0.0f, 0.0f, 0.0f, (float)Math.PI / 180));
        PartDefinition bodydec = body_3.addOrReplaceChild("bodydec", CubeListBuilder.create().texOffs(0, 69).addBox(-4.0f, -1.5f, -4.0f, 8, 3, 8), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.43633232f));
        PartDefinition joint_3 = mainbody.addOrReplaceChild("joint_3", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-6.0f, -12.0f, 34.0f));
        PartDefinition JD_6 = joint_3.addOrReplaceChild("JD_6", CubeListBuilder.create().texOffs(165, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.4537856f, 0.0f));
        PartDefinition joint_19 = JD_6.addOrReplaceChild("joint_19", CubeListBuilder.create().texOffs(169, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_41 = joint_19.addOrReplaceChild("body_41", CubeListBuilder.create().texOffs(36, 68).addBox(-1.0f, -3.0f, -3.0f, 14, 6, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, (float)Math.PI, 0.7679449f));
        PartDefinition joint_20 = body_41.addOrReplaceChild("joint_20", CubeListBuilder.create().texOffs(173, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.0f, 0.0f, 0.0f));
        PartDefinition body_42 = joint_20.addOrReplaceChild("body_42", CubeListBuilder.create().texOffs(176, 72).addBox(-1.0f, -2.0f, -2.5f, 12, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.715585f, -0.43633232f));
        PartDefinition joint_21 = body_42.addOrReplaceChild("joint_21", CubeListBuilder.create().texOffs(177, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(11.0f, 0.0f, 0.0f));
        PartDefinition body_43 = joint_21.addOrReplaceChild("body_43", CubeListBuilder.create().texOffs(72, 76).addBox(-2.0f, -2.0f, -3.0f, 14, 4, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.29670596f));
        PartDefinition joint_22 = body_43.addOrReplaceChild("joint_22", CubeListBuilder.create().texOffs(251, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.0f, 0.0f, 0.0f));
        PartDefinition body_44 = joint_22.addOrReplaceChild("body_44", CubeListBuilder.create().texOffs(107, 79).addBox(0.5f, -2.0f, -2.5f, 31, 5, 5), PartPose.offsetAndRotation(0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4886922f));
        PartDefinition joint_23 = body_44.addOrReplaceChild("joint_23", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(29.5f, 0.0f, 0.0f));
        PartDefinition body_45 = joint_23.addOrReplaceChild("body_45", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.0f, -2.0f, 14, 4, 4), PartPose.offsetAndRotation(0.8f, 0.4f, 0.0f, 0.0f, 0.0f, 0.40142572f));
        PartDefinition body_46 = body_45.addOrReplaceChild("body_46", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.5f, -2.5f, 13, 5, 5), PartPose.offsetAndRotation(12.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.10471976f));
        PartDefinition body_47 = body_46.addOrReplaceChild("body_47", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -3.0f, -3.0f, 12, 6, 6), PartPose.offsetAndRotation(12.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.05235988f));
        PartDefinition body_48 = body_47.addOrReplaceChild("body_48", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -3.5f, -4.0f, 9, 7, 8), PartPose.offset(10.7f, 0.0f, 0.0f));
        PartDefinition bodym = mainbody.addOrReplaceChild("bodym", CubeListBuilder.create().texOffs(0, 0).addBox(-9.5f, -3.0f, -5.0f, 19, 24, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.6632251f, 0.0f, (float)Math.PI));
        PartDefinition bodyd = bodym.addOrReplaceChild("bodyd", CubeListBuilder.create().texOffs(46, 0).addBox(-12.0f, -3.6f, -5.3f, 24, 8, 9), PartPose.offsetAndRotation(0.0f, -5.0f, 5.0f, 0.7679449f, 0.0f, 0.0f));
        PartDefinition bodyd_2 = bodyd.addOrReplaceChild("bodyd_2", CubeListBuilder.create().texOffs(172, 0).addBox(-11.0f, -1.0f, -5.5f, 22, 13, 10), PartPose.offsetAndRotation(0.0f, 3.0f, -1.0f, -0.54105204f, 0.0f, 0.0f));
        PartDefinition bodyd_4 = bodyd_2.addOrReplaceChild("bodyd_4", CubeListBuilder.create().texOffs(96, 15).addBox(-10.0f, -4.0f, -3.5f, 20, 16, 8), PartPose.offsetAndRotation(0.0f, 14.0f, -0.5f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition bodyd_3 = bodyd.addOrReplaceChild("bodyd_3", CubeListBuilder.create().texOffs(46, 17).addBox(-8.0f, -2.5f, -2.0f, 16, 6, 6), PartPose.offsetAndRotation(0.0f, -3.0f, -2.5f, 0.6981317f, 0.0f, 0.0f));
        PartDefinition body = bodym.addOrReplaceChild("body", CubeListBuilder.create().texOffs(104, 0).addBox(-3.0f, -17.5f, -4.5f, 6, 6, 6), PartPose.offsetAndRotation(0.0f, 9.0f, 2.0f, 0.2617994f, 0.0f, 0.0f));
        PartDefinition bodymm = body.addOrReplaceChild("bodymm", CubeListBuilder.create().texOffs(212, 11).addBox(-8.0f, 1.0f, -6.0f, 16, 18, 12), PartPose.offsetAndRotation(0.0f, 4.0f, -2.0f, 0.4537856f, 0.0f, 0.0f));
        PartDefinition bodyl = bodymm.addOrReplaceChild("bodyl", CubeListBuilder.create().texOffs(140, 21).addBox(-5.0f, -3.5f, -6.5f, 10, 13, 12), PartPose.offsetAndRotation(0.0f, 19.2f, -1.0f, -0.41887903f, 0.0f, 0.0f));
        PartDefinition body_1 = bodyl.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(172, 23).addBox(-3.0f, 0.0f, -4.0f, 6, 10, 9), PartPose.offsetAndRotation(0.0f, 8.0f, -0.5f, -0.2617994f, 0.0f, 0.0f));
        PartDefinition jointH = bodym.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 10.0f, -10.0f));
        PartDefinition bodybm = jointH.addOrReplaceChild("bodybm", CubeListBuilder.create().texOffs(47, 29).addBox(-5.0f, -8.0f, -3.5f, 10, 16, 6), PartPose.offset(0.0f, -2.0f, -3.0f));
        PartDefinition jointRM = bodybm.addOrReplaceChild("jointRM", CubeListBuilder.create().texOffs(107, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-5.0f, -1.2f, -2.0f));
        PartDefinition mouthr = jointRM.addOrReplaceChild("mouthr", CubeListBuilder.create().texOffs(68, 29).addBox(-1.5f, -7.0f, -0.5f, 3, 14, 6), PartPose.offsetAndRotation(0.0f, 1.5f, 0.0f, (float)Math.PI, -0.29670596f, (float)(-Math.PI)));
        PartDefinition dec_17 = mouthr.addOrReplaceChild("dec_17", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, -2.0f, 4.0f, 0.0f, -1.0297443f, 0.0f));
        PartDefinition jointRM1 = mouthr.addOrReplaceChild("jointRM1", CubeListBuilder.create().texOffs(131, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.5f));
        PartDefinition mouth_1 = jointRM1.addOrReplaceChild("mouth_1", CubeListBuilder.create().texOffs(140, 21).addBox(-1.0f, -6.0f, -5.5f, 2, 12, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.3f, (float)Math.PI, 0.2443461f, 0.0f));
        PartDefinition dec_21 = mouth_1.addOrReplaceChild("dec_21", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(-0.5f, 0.0f, -2.0f, 0.0f, -2.024582f, 0.0f));
        PartDefinition dec_25 = mouth_1.addOrReplaceChild("dec_25", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(-0.5f, 4.0f, -2.0f, 0.0f, -2.024582f, 0.0f));
        PartDefinition dec_24 = mouth_1.addOrReplaceChild("dec_24", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(-0.5f, -4.0f, -2.0f, 0.0f, -2.024582f, 0.0f));
        PartDefinition dec_23 = mouth_1.addOrReplaceChild("dec_23", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(-0.5f, -2.0f, -2.0f, 0.0f, -2.024582f, 0.0f));
        PartDefinition dec_22 = mouth_1.addOrReplaceChild("dec_22", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(-0.5f, 2.0f, -2.0f, 0.0f, -2.024582f, 0.0f));
        PartDefinition dec_19 = mouthr.addOrReplaceChild("dec_19", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, 4.0f, 4.0f, 0.0f, -1.0297443f, 0.0f));
        PartDefinition dec_13 = mouthr.addOrReplaceChild("dec_13", CubeListBuilder.create().texOffs(99, 2).addBox(-1.0f, -2.5f, -3.0f, 2, 5, 6), PartPose.offsetAndRotation(-0.5f, -8.7f, 2.5f, 0.0f, 0.0f, -0.6457718f));
        PartDefinition dec_20 = mouthr.addOrReplaceChild("dec_20", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, -6.0f, 4.0f, 0.0f, -1.0297443f, 0.0f));
        PartDefinition dec_18 = mouthr.addOrReplaceChild("dec_18", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, -4.0f, 4.0f, 0.0f, -1.0297443f, 0.0f));
        PartDefinition dec_14 = mouthr.addOrReplaceChild("dec_14", CubeListBuilder.create().texOffs(240, 13).addBox(-1.0f, -2.5f, -3.0f, 2, 5, 6), PartPose.offsetAndRotation(-0.5f, 8.7f, 2.0f, 0.0f, 0.0f, 0.6457718f));
        PartDefinition dec_16 = mouthr.addOrReplaceChild("dec_16", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, 0.0f, 4.0f, 0.0f, -1.0297443f, 0.0f));
        PartDefinition dec_15 = mouthr.addOrReplaceChild("dec_15", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, 2.0f, 4.0f, 0.0f, -1.0297443f, 0.0f));
        PartDefinition jointLM = bodybm.addOrReplaceChild("jointLM", CubeListBuilder.create().texOffs(103, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(5.0f, -1.2f, -2.0f));
        PartDefinition mouthl = jointLM.addOrReplaceChild("mouthl", CubeListBuilder.create().texOffs(194, 23).addBox(-1.5f, -7.0f, -0.5f, 3, 14, 6), PartPose.offsetAndRotation(0.0f, 1.5f, 0.0f, (float)Math.PI, -0.29670596f, 0.0f));
        PartDefinition dec_2 = mouthl.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, 0.0f, 4.0f, 0.0f, -1.0297443f, 0.0f));
        PartDefinition dec_6 = mouthl.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, 4.0f, 4.0f, 0.0f, -1.0297443f, 0.0f));
        PartDefinition dec_3 = mouthl.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, -2.0f, 4.0f, 0.0f, -1.0297443f, 0.0f));
        PartDefinition dec_1 = mouthl.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(36, 2).addBox(-1.0f, -2.5f, -3.0f, 2, 5, 6), PartPose.offsetAndRotation(-0.5f, 8.7f, 2.5f, 0.0f, 0.0f, 0.6457718f));
        PartDefinition dec_5 = mouthl.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, 2.0f, 4.0f, 0.0f, -1.0297443f, 0.0f));
        PartDefinition jointLM1 = mouthl.addOrReplaceChild("jointLM1", CubeListBuilder.create().texOffs(125, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.5f));
        PartDefinition mouth = jointLM1.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(240, 3).addBox(-1.0f, -6.0f, -5.5f, 2, 12, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.3f, (float)Math.PI, 0.2443461f, 0.0f));
        PartDefinition dec_11 = mouth.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(-0.5f, 2.0f, -2.0f, 0.0f, -2.024582f, 0.0f));
        PartDefinition dec_8 = mouth.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(-0.5f, -4.0f, -2.0f, 0.0f, -2.024582f, 0.0f));
        PartDefinition dec_10 = mouth.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(-0.5f, 0.0f, -2.0f, 0.0f, -2.024582f, 0.0f));
        PartDefinition dec_12 = mouth.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(-0.5f, 4.0f, -2.0f, 0.0f, -2.024582f, 0.0f));
        PartDefinition dec_9 = mouth.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(-0.5f, -2.0f, -2.0f, 0.0f, -2.024582f, 0.0f));
        PartDefinition dec_7 = mouthl.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, -6.0f, 4.0f, 0.0f, -1.0297443f, 0.0f));
        PartDefinition dec = mouthl.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(232, 0).addBox(-1.0f, -2.5f, -3.0f, 2, 5, 6), PartPose.offsetAndRotation(-0.5f, -8.7f, 2.0f, 0.0f, 0.0f, -0.6457718f));
        PartDefinition dec_4 = mouthl.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(-1.5f, -4.0f, 4.0f, 0.0f, -1.0297443f, 0.0f));
        PartDefinition body_2 = bodybm.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(214, 0).addBox(-2.5f, -5.0f, -2.5f, 5, 10, 4), PartPose.offset(0.0f, -0.2f, -4.5f));
        PartDefinition bodyd_1 = bodym.addOrReplaceChild("bodyd_1", CubeListBuilder.create().texOffs(134, 0).addBox(-8.0f, -3.0f, -6.0f, 16, 14, 7), PartPose.offsetAndRotation(0.0f, 5.0f, -10.0f, 0.0f, (float)Math.PI, 0.0f));
        PartDefinition bodyd_5 = bodyd_1.addOrReplaceChild("bodyd_5", CubeListBuilder.create().texOffs(0, 34).addBox(-3.5f, -2.0f, -5.5f, 7, 14, 8), PartPose.offsetAndRotation(0.0f, 10.8f, -2.6f, -0.715585f, 0.0f, 0.0f));
        PartDefinition bodyd_7 = bodyd_5.addOrReplaceChild("bodyd_7", CubeListBuilder.create().texOffs(110, 36).addBox(-1.5f, -1.0f, -3.0f, 3, 15, 5), PartPose.offsetAndRotation(0.0f, 12.0f, 0.0f, -0.19198622f, 0.0f, 0.0f));
        PartDefinition bodyd_6 = bodyd_1.addOrReplaceChild("bodyd_6", CubeListBuilder.create().texOffs(78, 36).addBox(-4.0f, -8.5f, -4.0f, 8, 11, 8), PartPose.offsetAndRotation(0.0f, -3.0f, -2.5f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition joint_1 = mainbody.addOrReplaceChild("joint_1", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, -12.0f, 34.0f));
        PartDefinition JD_3 = joint_1.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(165, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 2.687807f, 0.0f));
        PartDefinition joint_9 = JD_3.addOrReplaceChild("joint_9", CubeListBuilder.create().texOffs(169, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_18 = joint_9.addOrReplaceChild("body_18", CubeListBuilder.create().texOffs(36, 68).addBox(-1.0f, -3.0f, -3.0f, 14, 6, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, (float)Math.PI, 0.7679449f));
        PartDefinition joint_10 = body_18.addOrReplaceChild("joint_10", CubeListBuilder.create().texOffs(173, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.0f, 0.0f, 0.0f));
        PartDefinition body_19 = joint_10.addOrReplaceChild("body_19", CubeListBuilder.create().texOffs(176, 72).addBox(-1.0f, -2.0f, -2.5f, 12, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, -0.715585f, -0.43633232f));
        PartDefinition joint_11 = body_19.addOrReplaceChild("joint_11", CubeListBuilder.create().texOffs(177, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(11.0f, 0.0f, 0.0f));
        PartDefinition body_20 = joint_11.addOrReplaceChild("body_20", CubeListBuilder.create().texOffs(72, 76).addBox(-2.0f, -2.0f, -3.0f, 14, 4, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.29670596f));
        PartDefinition joint_12 = body_20.addOrReplaceChild("joint_12", CubeListBuilder.create().texOffs(251, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.0f, 0.0f, 0.0f));
        PartDefinition body_21 = joint_12.addOrReplaceChild("body_21", CubeListBuilder.create().texOffs(107, 79).addBox(0.5f, -2.0f, -2.5f, 31, 5, 5), PartPose.offsetAndRotation(0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4886922f));
        PartDefinition joint_13 = body_21.addOrReplaceChild("joint_13", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(29.5f, 0.0f, 0.0f));
        PartDefinition body_22 = joint_13.addOrReplaceChild("body_22", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.0f, -2.0f, 14, 4, 4), PartPose.offsetAndRotation(0.8f, 0.4f, 0.0f, 0.0f, 0.0f, 0.40142572f));
        PartDefinition body_23 = body_22.addOrReplaceChild("body_23", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.5f, -2.5f, 13, 5, 5), PartPose.offsetAndRotation(12.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.10471976f));
        PartDefinition body_24 = body_23.addOrReplaceChild("body_24", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -3.0f, -3.0f, 12, 6, 6), PartPose.offsetAndRotation(12.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.05235988f));
        PartDefinition body_25 = body_24.addOrReplaceChild("body_25", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -3.5f, -4.0f, 9, 7, 8), PartPose.offset(10.7f, 0.0f, 0.0f));
        PartDefinition jointFRAX_1 = mainbody.addOrReplaceChild("jointFRAX_1", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-12.0f, 11.0f, 3.0f));
        PartDefinition JD_4 = jointFRAX_1.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(165, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -1.0471976f, 0.0f));
        PartDefinition jointFRAY_1 = JD_4.addOrReplaceChild("jointFRAY_1", CubeListBuilder.create().texOffs(169, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_26 = jointFRAY_1.addOrReplaceChild("body_26", CubeListBuilder.create().texOffs(36, 68).addBox(-2.0f, -3.0f, -3.0f, 15, 6, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, (float)Math.PI, 0.7679449f));
        PartDefinition jointFRA1_1 = body_26.addOrReplaceChild("jointFRA1_1", CubeListBuilder.create().texOffs(173, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.0f, 0.0f, 0.0f));
        PartDefinition body_27 = jointFRA1_1.addOrReplaceChild("body_27", CubeListBuilder.create().texOffs(176, 72).addBox(-1.0f, -2.0f, -2.5f, 17, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.43633232f, -0.5934119f));
        PartDefinition jointFRA2_2 = body_27.addOrReplaceChild("jointFRA2_2", CubeListBuilder.create().texOffs(177, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(16.0f, 0.0f, 0.0f));
        PartDefinition body_28 = jointFRA2_2.addOrReplaceChild("body_28", CubeListBuilder.create().texOffs(72, 76).addBox(-2.0f, -2.0f, -3.0f, 20, 4, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.29670596f));
        PartDefinition jointFRA2_3 = body_28.addOrReplaceChild("jointFRA2_3", CubeListBuilder.create().texOffs(251, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(16.0f, 0.0f, 0.0f));
        PartDefinition body_29 = jointFRA2_3.addOrReplaceChild("body_29", CubeListBuilder.create().texOffs(107, 79).addBox(0.5f, -2.0f, -2.5f, 31, 5, 5), PartPose.offsetAndRotation(0.8f, 0.0f, 0.0f, 0.0f, 0.0f, -0.34906584f));
        PartDefinition jointFRA3_1 = body_29.addOrReplaceChild("jointFRA3_1", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(29.5f, 0.0f, 0.0f));
        PartDefinition body_30 = jointFRA3_1.addOrReplaceChild("body_30", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.0f, -2.0f, 14, 4, 4), PartPose.offsetAndRotation(0.8f, 0.4f, 0.0f, 0.0f, 0.0f, 0.5934119f));
        PartDefinition body_31 = body_30.addOrReplaceChild("body_31", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.5f, -2.5f, 14, 5, 5), PartPose.offsetAndRotation(13.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.12217305f));
        PartDefinition body_32 = body_31.addOrReplaceChild("body_32", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -3.0f, -3.0f, 9, 6, 6), PartPose.offsetAndRotation(13.5f, 0.3f, 0.0f, 0.0f, 0.0f, (float)Math.PI / 180));
        PartDefinition bodydec_1 = body_26.addOrReplaceChild("bodydec_1", CubeListBuilder.create().texOffs(0, 69).addBox(-4.0f, -1.5f, -4.0f, 8, 3, 8), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.43633232f));
        PartDefinition joint_2 = mainbody.addOrReplaceChild("joint_2", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-10.0f, -1.0f, 18.0f));
        PartDefinition JD_5 = joint_2.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(165, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition joint_14 = JD_5.addOrReplaceChild("joint_14", CubeListBuilder.create().texOffs(169, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_33 = joint_14.addOrReplaceChild("body_33", CubeListBuilder.create().texOffs(36, 68).addBox(-2.0f, -3.0f, -3.0f, 15, 6, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, (float)Math.PI, 0.7679449f));
        PartDefinition joint_15 = body_33.addOrReplaceChild("joint_15", CubeListBuilder.create().texOffs(173, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.0f, 0.0f, 0.0f));
        PartDefinition body_34 = joint_15.addOrReplaceChild("body_34", CubeListBuilder.create().texOffs(176, 72).addBox(-1.0f, -2.0f, -2.5f, 17, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.55850536f, -0.33161256f));
        PartDefinition joint_16 = body_34.addOrReplaceChild("joint_16", CubeListBuilder.create().texOffs(177, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(16.0f, 0.0f, 0.0f));
        PartDefinition body_35 = joint_16.addOrReplaceChild("body_35", CubeListBuilder.create().texOffs(72, 76).addBox(-2.0f, -2.0f, -3.0f, 17, 4, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.38397244f));
        PartDefinition joint_17 = body_35.addOrReplaceChild("joint_17", CubeListBuilder.create().texOffs(251, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(13.0f, 0.0f, 0.0f));
        PartDefinition body_36 = joint_17.addOrReplaceChild("body_36", CubeListBuilder.create().texOffs(107, 79).addBox(1.0f, -2.0f, -2.5f, 26, 5, 5), PartPose.offsetAndRotation(0.8f, 0.0f, 0.0f, 0.0f, 0.0f, -0.34906584f));
        PartDefinition joint_18 = body_36.addOrReplaceChild("joint_18", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(26.5f, 0.0f, 0.0f));
        PartDefinition body_37 = joint_18.addOrReplaceChild("body_37", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.0f, -2.0f, 14, 4, 4), PartPose.offsetAndRotation(0.8f, 0.4f, 0.0f, 0.0f, 0.0f, 0.40142572f));
        PartDefinition body_38 = body_37.addOrReplaceChild("body_38", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.5f, -2.5f, 13, 5, 5), PartPose.offsetAndRotation(12.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.10471976f));
        PartDefinition body_39 = body_38.addOrReplaceChild("body_39", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -3.0f, -3.0f, 12, 6, 6), PartPose.offsetAndRotation(12.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.05235988f));
        PartDefinition body_40 = body_39.addOrReplaceChild("body_40", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -3.5f, -4.0f, 7, 7, 8), PartPose.offset(10.7f, 0.0f, 0.0f));
        PartDefinition joint = mainbody.addOrReplaceChild("joint", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.0f, -1.0f, 18.0f));
        PartDefinition JD_2 = joint.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(165, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, (float)(-Math.PI), 0.0f));
        PartDefinition joint_4 = JD_2.addOrReplaceChild("joint_4", CubeListBuilder.create().texOffs(169, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_10 = joint_4.addOrReplaceChild("body_10", CubeListBuilder.create().texOffs(36, 68).addBox(-2.0f, -3.0f, -3.0f, 15, 6, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, (float)Math.PI, 0.7679449f));
        PartDefinition joint_5 = body_10.addOrReplaceChild("joint_5", CubeListBuilder.create().texOffs(173, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.0f, 0.0f, 0.0f));
        PartDefinition body_11 = joint_5.addOrReplaceChild("body_11", CubeListBuilder.create().texOffs(176, 72).addBox(-1.0f, -2.0f, -2.5f, 17, 4, 5), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, -0.55850536f, -0.33161256f));
        PartDefinition joint_6 = body_11.addOrReplaceChild("joint_6", CubeListBuilder.create().texOffs(177, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(16.0f, 0.0f, 0.0f));
        PartDefinition body_12 = joint_6.addOrReplaceChild("body_12", CubeListBuilder.create().texOffs(72, 76).addBox(-2.0f, -2.0f, -3.0f, 17, 4, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.38397244f));
        PartDefinition joint_7 = body_12.addOrReplaceChild("joint_7", CubeListBuilder.create().texOffs(251, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(13.0f, 0.0f, 0.0f));
        PartDefinition body_13 = joint_7.addOrReplaceChild("body_13", CubeListBuilder.create().texOffs(107, 79).addBox(1.0f, -2.0f, -2.5f, 26, 5, 5), PartPose.offsetAndRotation(0.8f, 0.0f, 0.0f, 0.0f, 0.0f, -0.34906584f));
        PartDefinition joint_8 = body_13.addOrReplaceChild("joint_8", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(26.5f, 0.0f, 0.0f));
        PartDefinition body_14 = joint_8.addOrReplaceChild("body_14", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.0f, -2.0f, 14, 4, 4), PartPose.offsetAndRotation(0.8f, 0.4f, 0.0f, 0.0f, 0.0f, 0.40142572f));
        PartDefinition body_15 = body_14.addOrReplaceChild("body_15", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -2.5f, -2.5f, 13, 5, 5), PartPose.offsetAndRotation(12.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.10471976f));
        PartDefinition body_16 = body_15.addOrReplaceChild("body_16", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -3.0f, -3.0f, 12, 6, 6), PartPose.offsetAndRotation(12.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.05235988f));
        PartDefinition body_17 = body_16.addOrReplaceChild("body_17", CubeListBuilder.create().texOffs(212, 73).addBox(-1.0f, -3.5f, -4.0f, 7, 7, 8), PartPose.offset(10.7f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 64, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityPCosmical parasite = (EntityPCosmical)entity;
        this.mainbody.x = 0.0f;
        this.mainbody.z = 0.0f;
        int j = parasite.shakingC();
        if (j > 0) {
            float f1;
            float f2 = Mth.cos((float)(ageInTicks * 5.6f)) * 0.08912575f;
            this.mainbody.x = f1 = Mth.cos((float)(ageInTicks * 5.27f)) * 0.08912576f;
            this.mainbody.z = f2;
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
