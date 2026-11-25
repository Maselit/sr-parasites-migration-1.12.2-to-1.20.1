package com.dhanantry.scapeandrunparasites.client.model.entity.feral;

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

public class ModelFerBear extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "ferbear"), "main");
    private final ModelPart mainbody;
    private final ModelPart bodym;
    private final ModelPart bodym_1;
    private final ModelPart bodym_2;
    private final ModelPart jointLL;
    private final ModelPart jointUM1;
    private final ModelPart jointDM1;
    private final ModelPart jointRL;
    private final ModelPart jointLAX;
    private final ModelPart jointRAX;
    private final ModelPart mouthTR;
    private final ModelPart body;
    private final ModelPart jointLL_1;
    private final ModelPart body_1;
    private final ModelPart body1;
    private final ModelPart jointUM2;
    private final ModelPart dec;
    private final ModelPart dec_1;
    private final ModelPart dec_2;
    private final ModelPart dec_3;
    private final ModelPart dec_4;
    private final ModelPart dec_5;
    private final ModelPart dec_6;
    private final ModelPart dec_7;
    private final ModelPart dec_8;
    private final ModelPart dec_9;
    private final ModelPart dec_10;
    private final ModelPart dec_11;
    private final ModelPart dec_12;
    private final ModelPart bodyh;
    private final ModelPart jointUM3;
    private final ModelPart dec_13;
    private final ModelPart dec_14;
    private final ModelPart dec_15;
    private final ModelPart dec_16;
    private final ModelPart dec_17;
    private final ModelPart dec_18;
    private final ModelPart bodyht;
    private final ModelPart dec_19;
    private final ModelPart dec_20;
    private final ModelPart dec_21;
    private final ModelPart dec_22;
    private final ModelPart bodyl;
    private final ModelPart jointDM2;
    private final ModelPart dec_23;
    private final ModelPart dec_24;
    private final ModelPart dec_25;
    private final ModelPart dec_26;
    private final ModelPart dec_27;
    private final ModelPart dec_28;
    private final ModelPart dec_29;
    private final ModelPart dec_30;
    private final ModelPart dec_31;
    private final ModelPart dec_32;
    private final ModelPart dec_33;
    private final ModelPart dec_34;
    private final ModelPart bodyl2;
    private final ModelPart jointDM3;
    private final ModelPart dec_35;
    private final ModelPart dec_36;
    private final ModelPart dec_37;
    private final ModelPart dec_38;
    private final ModelPart dec_39;
    private final ModelPart dec_40;
    private final ModelPart bodylooo;
    private final ModelPart dec_41;
    private final ModelPart dec_42;
    private final ModelPart dec_43;
    private final ModelPart dec_44;
    private final ModelPart body_2;
    private final ModelPart jointRL_1;
    private final ModelPart body_3;
    private final ModelPart JD;
    private final ModelPart jointLAY;
    private final ModelPart body_4;
    private final ModelPart jointLA1;
    private final ModelPart bodys;
    private final ModelPart body_5;
    private final ModelPart body_6;
    private final ModelPart body_7;
    private final ModelPart body_8;
    private final ModelPart body_9;
    private final ModelPart body_10;
    private final ModelPart JD_1;
    private final ModelPart jointRAY;
    private final ModelPart body_11;
    private final ModelPart jointRA1;
    private final ModelPart bodys_1;
    private final ModelPart body_12;
    private final ModelPart body_13;
    private final ModelPart body_14;
    private final ModelPart body_15;
    private final ModelPart body_16;
    private final ModelPart body_17;
    private final ModelPart jointRR1;
    private final ModelPart jointRL1;
    private final ModelPart jointRM1;
    private final ModelPart dec_45;
    private final ModelPart joinRR2;
    private final ModelPart JD_2;
    private final ModelPart dec_46;
    private final ModelPart jointRR3;
    private final ModelPart JD_3;
    private final ModelPart dec_47;
    private final ModelPart jointRR4;
    private final ModelPart dec_48;
    private final ModelPart dec_49;
    private final ModelPart joinRL2;
    private final ModelPart JD_4;
    private final ModelPart dec_50;
    private final ModelPart jointRL3;
    private final ModelPart JD_5;
    private final ModelPart dec_51;
    private final ModelPart jointRL4;
    private final ModelPart dec_52;
    private final ModelPart dec_53;
    private final ModelPart joinRM2;
    private final ModelPart JD_6;
    private final ModelPart dec_54;
    private final ModelPart jointRM3;
    private final ModelPart JD_7;
    private final ModelPart dec_55;
    private final ModelPart jointRM4;
    private final ModelPart dec_56;

    public ModelFerBear(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.bodym = root.getChild("mainbody").getChild("bodym");
        this.bodym_1 = root.getChild("mainbody").getChild("bodym_1");
        this.bodym_2 = root.getChild("mainbody").getChild("bodym_2");
        this.jointLL = root.getChild("mainbody").getChild("bodym").getChild("jointLL");
        this.jointUM1 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1");
        this.jointDM1 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1");
        this.jointRL = root.getChild("mainbody").getChild("bodym").getChild("jointRL");
        this.jointLAX = root.getChild("mainbody").getChild("bodym").getChild("jointLAX");
        this.jointRAX = root.getChild("mainbody").getChild("bodym").getChild("jointRAX");
        this.mouthTR = root.getChild("mainbody").getChild("bodym").getChild("mouthTR");
        this.body = root.getChild("mainbody").getChild("bodym").getChild("jointLL").getChild("body");
        this.jointLL_1 = root.getChild("mainbody").getChild("bodym").getChild("jointLL").getChild("body").getChild("jointLL_1");
        this.body_1 = root.getChild("mainbody").getChild("bodym").getChild("jointLL").getChild("body").getChild("jointLL_1").getChild("body_1");
        this.body1 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1");
        this.jointUM2 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2");
        this.dec = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec");
        this.dec_1 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec_1");
        this.dec_2 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec_2");
        this.dec_3 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec_3");
        this.dec_4 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec_4");
        this.dec_5 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec_5");
        this.dec_6 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec_6");
        this.dec_7 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec_7");
        this.dec_8 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec_8");
        this.dec_9 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec_9");
        this.dec_10 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec_10");
        this.dec_11 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec_11");
        this.dec_12 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("dec_12");
        this.bodyh = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh");
        this.jointUM3 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh").getChild("jointUM3");
        this.dec_13 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh").getChild("dec_13");
        this.dec_14 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh").getChild("dec_14");
        this.dec_15 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh").getChild("dec_15");
        this.dec_16 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh").getChild("dec_16");
        this.dec_17 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh").getChild("dec_17");
        this.dec_18 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh").getChild("dec_18");
        this.bodyht = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh").getChild("jointUM3").getChild("bodyht");
        this.dec_19 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh").getChild("jointUM3").getChild("bodyht").getChild("dec_19");
        this.dec_20 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh").getChild("jointUM3").getChild("bodyht").getChild("dec_20");
        this.dec_21 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh").getChild("jointUM3").getChild("bodyht").getChild("dec_21");
        this.dec_22 = root.getChild("mainbody").getChild("bodym").getChild("jointUM1").getChild("body1").getChild("jointUM2").getChild("bodyh").getChild("jointUM3").getChild("bodyht").getChild("dec_22");
        this.bodyl = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl");
        this.jointDM2 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2");
        this.dec_23 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("dec_23");
        this.dec_24 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("dec_24");
        this.dec_25 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("dec_25");
        this.dec_26 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("dec_26");
        this.dec_27 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("dec_27");
        this.dec_28 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("dec_28");
        this.dec_29 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("dec_29");
        this.dec_30 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("dec_30");
        this.dec_31 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("dec_31");
        this.dec_32 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("dec_32");
        this.dec_33 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("dec_33");
        this.dec_34 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("dec_34");
        this.bodyl2 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2");
        this.jointDM3 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2").getChild("jointDM3");
        this.dec_35 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2").getChild("dec_35");
        this.dec_36 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2").getChild("dec_36");
        this.dec_37 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2").getChild("dec_37");
        this.dec_38 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2").getChild("dec_38");
        this.dec_39 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2").getChild("dec_39");
        this.dec_40 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2").getChild("dec_40");
        this.bodylooo = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2").getChild("jointDM3").getChild("bodylooo");
        this.dec_41 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2").getChild("jointDM3").getChild("bodylooo").getChild("dec_41");
        this.dec_42 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2").getChild("jointDM3").getChild("bodylooo").getChild("dec_42");
        this.dec_43 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2").getChild("jointDM3").getChild("bodylooo").getChild("dec_43");
        this.dec_44 = root.getChild("mainbody").getChild("bodym").getChild("jointDM1").getChild("bodyl").getChild("jointDM2").getChild("bodyl2").getChild("jointDM3").getChild("bodylooo").getChild("dec_44");
        this.body_2 = root.getChild("mainbody").getChild("bodym").getChild("jointRL").getChild("body_2");
        this.jointRL_1 = root.getChild("mainbody").getChild("bodym").getChild("jointRL").getChild("body_2").getChild("jointRL_1");
        this.body_3 = root.getChild("mainbody").getChild("bodym").getChild("jointRL").getChild("body_2").getChild("jointRL_1").getChild("body_3");
        this.JD = root.getChild("mainbody").getChild("bodym").getChild("jointLAX").getChild("JD");
        this.jointLAY = root.getChild("mainbody").getChild("bodym").getChild("jointLAX").getChild("JD").getChild("jointLAY");
        this.body_4 = root.getChild("mainbody").getChild("bodym").getChild("jointLAX").getChild("JD").getChild("jointLAY").getChild("body_4");
        this.jointLA1 = root.getChild("mainbody").getChild("bodym").getChild("jointLAX").getChild("JD").getChild("jointLAY").getChild("body_4").getChild("jointLA1");
        this.bodys = root.getChild("mainbody").getChild("bodym").getChild("jointLAX").getChild("JD").getChild("jointLAY").getChild("body_4").getChild("jointLA1").getChild("bodys");
        this.body_5 = root.getChild("mainbody").getChild("bodym").getChild("jointLAX").getChild("JD").getChild("jointLAY").getChild("body_4").getChild("jointLA1").getChild("bodys").getChild("body_5");
        this.body_6 = root.getChild("mainbody").getChild("bodym").getChild("jointLAX").getChild("JD").getChild("jointLAY").getChild("body_4").getChild("jointLA1").getChild("bodys").getChild("body_6");
        this.body_7 = root.getChild("mainbody").getChild("bodym").getChild("jointLAX").getChild("JD").getChild("jointLAY").getChild("body_4").getChild("jointLA1").getChild("bodys").getChild("body_7");
        this.body_8 = root.getChild("mainbody").getChild("bodym").getChild("jointLAX").getChild("JD").getChild("jointLAY").getChild("body_4").getChild("jointLA1").getChild("bodys").getChild("body_5").getChild("body_8");
        this.body_9 = root.getChild("mainbody").getChild("bodym").getChild("jointLAX").getChild("JD").getChild("jointLAY").getChild("body_4").getChild("jointLA1").getChild("bodys").getChild("body_6").getChild("body_9");
        this.body_10 = root.getChild("mainbody").getChild("bodym").getChild("jointLAX").getChild("JD").getChild("jointLAY").getChild("body_4").getChild("jointLA1").getChild("bodys").getChild("body_7").getChild("body_10");
        this.JD_1 = root.getChild("mainbody").getChild("bodym").getChild("jointRAX").getChild("JD_1");
        this.jointRAY = root.getChild("mainbody").getChild("bodym").getChild("jointRAX").getChild("JD_1").getChild("jointRAY");
        this.body_11 = root.getChild("mainbody").getChild("bodym").getChild("jointRAX").getChild("JD_1").getChild("jointRAY").getChild("body_11");
        this.jointRA1 = root.getChild("mainbody").getChild("bodym").getChild("jointRAX").getChild("JD_1").getChild("jointRAY").getChild("body_11").getChild("jointRA1");
        this.bodys_1 = root.getChild("mainbody").getChild("bodym").getChild("jointRAX").getChild("JD_1").getChild("jointRAY").getChild("body_11").getChild("jointRA1").getChild("bodys_1");
        this.body_12 = root.getChild("mainbody").getChild("bodym").getChild("jointRAX").getChild("JD_1").getChild("jointRAY").getChild("body_11").getChild("jointRA1").getChild("bodys_1").getChild("body_12");
        this.body_13 = root.getChild("mainbody").getChild("bodym").getChild("jointRAX").getChild("JD_1").getChild("jointRAY").getChild("body_11").getChild("jointRA1").getChild("bodys_1").getChild("body_13");
        this.body_14 = root.getChild("mainbody").getChild("bodym").getChild("jointRAX").getChild("JD_1").getChild("jointRAY").getChild("body_11").getChild("jointRA1").getChild("bodys_1").getChild("body_14");
        this.body_15 = root.getChild("mainbody").getChild("bodym").getChild("jointRAX").getChild("JD_1").getChild("jointRAY").getChild("body_11").getChild("jointRA1").getChild("bodys_1").getChild("body_12").getChild("body_15");
        this.body_16 = root.getChild("mainbody").getChild("bodym").getChild("jointRAX").getChild("JD_1").getChild("jointRAY").getChild("body_11").getChild("jointRA1").getChild("bodys_1").getChild("body_13").getChild("body_16");
        this.body_17 = root.getChild("mainbody").getChild("bodym").getChild("jointRAX").getChild("JD_1").getChild("jointRAY").getChild("body_11").getChild("jointRA1").getChild("bodys_1").getChild("body_14").getChild("body_17");
        this.jointRR1 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRR1");
        this.jointRL1 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRL1");
        this.jointRM1 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRM1");
        this.dec_45 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRR1").getChild("dec_45");
        this.joinRR2 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRR1").getChild("dec_45").getChild("joinRR2");
        this.JD_2 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRR1").getChild("dec_45").getChild("joinRR2").getChild("JD_2");
        this.dec_46 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRR1").getChild("dec_45").getChild("joinRR2").getChild("JD_2").getChild("dec_46");
        this.jointRR3 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRR1").getChild("dec_45").getChild("joinRR2").getChild("JD_2").getChild("dec_46").getChild("jointRR3");
        this.JD_3 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRR1").getChild("dec_45").getChild("joinRR2").getChild("JD_2").getChild("dec_46").getChild("jointRR3").getChild("JD_3");
        this.dec_47 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRR1").getChild("dec_45").getChild("joinRR2").getChild("JD_2").getChild("dec_46").getChild("jointRR3").getChild("JD_3").getChild("dec_47");
        this.jointRR4 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRR1").getChild("dec_45").getChild("joinRR2").getChild("JD_2").getChild("dec_46").getChild("jointRR3").getChild("JD_3").getChild("dec_47").getChild("jointRR4");
        this.dec_48 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRR1").getChild("dec_45").getChild("joinRR2").getChild("JD_2").getChild("dec_46").getChild("jointRR3").getChild("JD_3").getChild("dec_47").getChild("jointRR4").getChild("dec_48");
        this.dec_49 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRL1").getChild("dec_49");
        this.joinRL2 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRL1").getChild("dec_49").getChild("joinRL2");
        this.JD_4 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRL1").getChild("dec_49").getChild("joinRL2").getChild("JD_4");
        this.dec_50 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRL1").getChild("dec_49").getChild("joinRL2").getChild("JD_4").getChild("dec_50");
        this.jointRL3 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRL1").getChild("dec_49").getChild("joinRL2").getChild("JD_4").getChild("dec_50").getChild("jointRL3");
        this.JD_5 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRL1").getChild("dec_49").getChild("joinRL2").getChild("JD_4").getChild("dec_50").getChild("jointRL3").getChild("JD_5");
        this.dec_51 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRL1").getChild("dec_49").getChild("joinRL2").getChild("JD_4").getChild("dec_50").getChild("jointRL3").getChild("JD_5").getChild("dec_51");
        this.jointRL4 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRL1").getChild("dec_49").getChild("joinRL2").getChild("JD_4").getChild("dec_50").getChild("jointRL3").getChild("JD_5").getChild("dec_51").getChild("jointRL4");
        this.dec_52 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRL1").getChild("dec_49").getChild("joinRL2").getChild("JD_4").getChild("dec_50").getChild("jointRL3").getChild("JD_5").getChild("dec_51").getChild("jointRL4").getChild("dec_52");
        this.dec_53 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRM1").getChild("dec_53");
        this.joinRM2 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRM1").getChild("dec_53").getChild("joinRM2");
        this.JD_6 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRM1").getChild("dec_53").getChild("joinRM2").getChild("JD_6");
        this.dec_54 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRM1").getChild("dec_53").getChild("joinRM2").getChild("JD_6").getChild("dec_54");
        this.jointRM3 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRM1").getChild("dec_53").getChild("joinRM2").getChild("JD_6").getChild("dec_54").getChild("jointRM3");
        this.JD_7 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRM1").getChild("dec_53").getChild("joinRM2").getChild("JD_6").getChild("dec_54").getChild("jointRM3").getChild("JD_7");
        this.dec_55 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRM1").getChild("dec_53").getChild("joinRM2").getChild("JD_6").getChild("dec_54").getChild("jointRM3").getChild("JD_7").getChild("dec_55");
        this.jointRM4 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRM1").getChild("dec_53").getChild("joinRM2").getChild("JD_6").getChild("dec_54").getChild("jointRM3").getChild("JD_7").getChild("dec_55").getChild("jointRM4");
        this.dec_56 = root.getChild("mainbody").getChild("bodym").getChild("mouthTR").getChild("jointRM1").getChild("dec_53").getChild("joinRM2").getChild("JD_6").getChild("dec_54").getChild("jointRM3").getChild("JD_7").getChild("dec_55").getChild("jointRM4").getChild("dec_56");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, 9.0f, 7.0f, 0.0f, 1.5707964f, 0.0f));
        PartDefinition bodym = mainbody.addOrReplaceChild("bodym", CubeListBuilder.create().texOffs(4, 0).addBox(-1.0f, -1.0f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, -2.0f, 0.0f, 1.5707964f, 0.0f, -0.17802358f));
        PartDefinition jointRL = bodym.addOrReplaceChild("jointRL", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-6.0f, -6.0f, -4.0f));
        PartDefinition body_2 = jointRL.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(69, 58).addBox(-2.0f, -2.5f, -4.0f, 8, 5, 8), PartPose.offsetAndRotation(1.0f, -1.0f, -1.0f, 0.0f, 1.8116517f, 0.0f));
        PartDefinition jointRL_1 = body_2.addOrReplaceChild("jointRL_1", CubeListBuilder.create().texOffs(38, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition body_3 = jointRL_1.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(14, 58).addBox(-3.0f, -2.0f, -4.0f, 6, 4, 8), PartPose.offsetAndRotation(1.3f, 0.0f, 0.0f, 0.0f, 1.5037757f, 0.0f));
        PartDefinition mouthTR = bodym.addOrReplaceChild("mouthTR", CubeListBuilder.create().texOffs(50, 0).addBox(-1.5f, 1.0f, -1.0f, 3, 4, 4), PartPose.offsetAndRotation(7.0f, 0.0f, -2.5f, 2.8902652f, 0.06283186f, 1.5707964f));
        PartDefinition jointRR1 = mouthTR.addOrReplaceChild("jointRR1", CubeListBuilder.create().texOffs(44, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.1f, 3.0f, 1.0f));
        PartDefinition dec_45 = jointRR1.addOrReplaceChild("dec_45", CubeListBuilder.create().texOffs(93, 58).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.9669124f, 1.2566371f, 0.0f));
        PartDefinition joinRR2 = dec_45.addOrReplaceChild("joinRR2", CubeListBuilder.create().texOffs(66, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_2 = joinRR2.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(38, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2863812f));
        PartDefinition dec_46 = JD_2.addOrReplaceChild("dec_46", CubeListBuilder.create().texOffs(34, 59).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.6457718f, 0.0f));
        PartDefinition jointRR3 = dec_46.addOrReplaceChild("jointRR3", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_3 = jointRR3.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(56, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_47 = JD_3.addOrReplaceChild("dec_47", CubeListBuilder.create().texOffs(98, 72).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.0681415f, -0.07679449f, 0.43982297f));
        PartDefinition jointRR4 = dec_47.addOrReplaceChild("jointRR4", CubeListBuilder.create().texOffs(38, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_48 = jointRR4.addOrReplaceChild("dec_48", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.25132743f, 0.8656833f, 0.0f));
        PartDefinition jointRL1 = mouthTR.addOrReplaceChild("jointRL1", CubeListBuilder.create().texOffs(117, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.6f, 3.0f, 1.0f));
        PartDefinition dec_49 = jointRL1.addOrReplaceChild("dec_49", CubeListBuilder.create().texOffs(36, 75).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.8535397f, -1.1239921f, -0.81681406f));
        PartDefinition joinRL2 = dec_49.addOrReplaceChild("joinRL2", CubeListBuilder.create().texOffs(44, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_4 = joinRL2.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(50, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2863812f));
        PartDefinition dec_50 = JD_4.addOrReplaceChild("dec_50", CubeListBuilder.create().texOffs(105, 74).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.47822022f, -0.21642083f, 0.0f));
        PartDefinition jointRL3 = dec_50.addOrReplaceChild("jointRL3", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_5 = jointRL3.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(56, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_51 = JD_5.addOrReplaceChild("dec_51", CubeListBuilder.create().texOffs(41, 76).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.134464f, -0.4537856f, 0.0f));
        PartDefinition jointRL4 = dec_51.addOrReplaceChild("jointRL4", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_52 = jointRL4.addOrReplaceChild("dec_52", CubeListBuilder.create().texOffs(53, 76).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.6981317f, 0.0f));
        PartDefinition jointRM1 = mouthTR.addOrReplaceChild("jointRM1", CubeListBuilder.create().texOffs(121, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.6f, 1.2f));
        PartDefinition dec_53 = jointRM1.addOrReplaceChild("dec_53", CubeListBuilder.create().texOffs(117, 75).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.9896754f, 0.12217305f, 0.0f));
        PartDefinition joinRM2 = dec_53.addOrReplaceChild("joinRM2", CubeListBuilder.create().texOffs(43, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_6 = joinRM2.addOrReplaceChild("JD_6", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0420353f));
        PartDefinition dec_54 = JD_6.addOrReplaceChild("dec_54", CubeListBuilder.create().texOffs(94, 78).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, 0.35953784f, 0.0f));
        PartDefinition jointRM3 = dec_54.addOrReplaceChild("jointRM3", CubeListBuilder.create().texOffs(4, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_7 = jointRM3.addOrReplaceChild("JD_7", CubeListBuilder.create().texOffs(67, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
        PartDefinition dec_55 = JD_7.addOrReplaceChild("dec_55", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.43633232f, -0.20943952f, 0.0f));
        PartDefinition jointRM4 = dec_55.addOrReplaceChild("jointRM4", CubeListBuilder.create().texOffs(94, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_56 = jointRM4.addOrReplaceChild("dec_56", CubeListBuilder.create().texOffs(58, 77).addBox(-0.5f, -0.5f, -7.0f, 1, 1, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 0.82030475f, 0.0f));
        PartDefinition jointLAX = bodym.addOrReplaceChild("jointLAX", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(8.0f, 9.0f, -3.5f, 0.0f, -0.06981317f, 0.0f));
        PartDefinition JD = jointLAX.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(44, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.61086524f));
        PartDefinition jointLAY = JD.addOrReplaceChild("jointLAY", CubeListBuilder.create().texOffs(48, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_4 = jointLAY.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(42, 61).addBox(-3.0f, -0.5f, -2.0f, 6, 10, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.1938052f, 0.0f, 0.0f));
        PartDefinition jointLA1 = body_4.addOrReplaceChild("jointLA1", CubeListBuilder.create().texOffs(60, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 8.5f, 0.5f));
        PartDefinition bodys = jointLA1.addOrReplaceChild("bodys", CubeListBuilder.create().texOffs(101, 61).addBox(-2.0f, 1.5f, -1.5f, 4, 8, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.0471976f, 0.18849556f, 0.06283186f));
        PartDefinition body_6 = bodys.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(115, 61).addBox(-1.0f, -0.5f, -1.0f, 2, 7, 2), PartPose.offsetAndRotation(2.0f, 4.0f, 0.0f, 0.25132743f, 0.0f, -0.81681406f));
        PartDefinition body_9 = body_6.addOrReplaceChild("body_9", CubeListBuilder.create().texOffs(64, 62).addBox(-0.5f, -0.5f, -0.5f, 1, 12, 1), PartPose.offsetAndRotation(0.0f, 6.7f, 0.0f, -1.410226f, 0.0f, 0.0f));
        PartDefinition body_5 = bodys.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(118, 25).addBox(-1.0f, -0.5f, -1.0f, 2, 7, 2), PartPose.offsetAndRotation(-2.0f, 4.0f, 0.0f, 0.50265485f, 0.0f, 0.62831855f));
        PartDefinition body_8 = body_5.addOrReplaceChild("body_8", CubeListBuilder.create().texOffs(123, 61).addBox(-0.5f, -0.5f, -0.5f, 1, 14, 1), PartPose.offsetAndRotation(0.0f, 6.7f, 0.0f, -1.5358897f, 0.0f, 0.0f));
        PartDefinition body_7 = bodys.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(0, 63).addBox(-1.0f, -0.5f, -1.0f, 2, 7, 2), PartPose.offsetAndRotation(0.0f, 9.0f, 0.0f, 0.50265485f, 0.0f, 0.0f));
        PartDefinition body_10 = body_7.addOrReplaceChild("body_10", CubeListBuilder.create().texOffs(8, 63).addBox(-0.5f, -0.5f, -0.5f, 1, 14, 1), PartPose.offsetAndRotation(0.0f, 6.7f, 0.0f, -1.5358897f, 0.0f, 0.0f));
        PartDefinition jointUM1 = bodym.addOrReplaceChild("jointUM1", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.5f, 0.0f, 4.0f));
        PartDefinition body1 = jointUM1.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0f, -6.0f, -3.0f, 13, 12, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.12566371f, -0.21991149f, 0.0f));
        PartDefinition dec_2 = body1.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(38, 2).addBox(-0.5f, -0.5f, -4.5f, 1, 1, 4), PartPose.offsetAndRotation(7.1f, 5.0f, -1.7f, 0.06981317f, 0.0f, -0.4712389f));
        PartDefinition dec = body1.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -5.5f, 1, 1, 5), PartPose.offsetAndRotation(8.9f, 5.0f, -2.4f, 0.10471976f, 0.0f, -0.6457718f));
        PartDefinition dec_11 = body1.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(89, 4).addBox(-0.5f, -0.5f, -4.5f, 1, 1, 3), PartPose.offsetAndRotation(1.6f, 4.9f, -1.3f, 0.16406095f, 0.1850049f, -0.2687807f));
        PartDefinition jointUM2 = body1.addOrReplaceChild("jointUM2", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(11.6f, 0.0f, -0.3f));
        PartDefinition bodyh = jointUM2.addOrReplaceChild("bodyh", CubeListBuilder.create().texOffs(42, 35).addBox(-0.5f, -2.5f, -3.5f, 8, 6, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.69646f, -0.31415927f, 0.0f));
        PartDefinition dec_17 = bodyh.addOrReplaceChild("dec_17", CubeListBuilder.create().texOffs(64, 9).addBox(-0.5f, -3.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(3.4f, -2.1f, -2.6f, 0.2443461f, 0.4712389f, 0.0f));
        PartDefinition dec_14 = bodyh.addOrReplaceChild("dec_14", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -4.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(3.4f, -2.1f, 2.6f, -0.2443461f, -0.4712389f, 0.0f));
        PartDefinition dec_16 = bodyh.addOrReplaceChild("dec_16", CubeListBuilder.create().texOffs(60, 9).addBox(-0.5f, -3.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(5.1f, -2.7f, -2.6f, 0.2443461f, 0.4712389f, 0.0f));
        PartDefinition dec_18 = bodyh.addOrReplaceChild("dec_18", CubeListBuilder.create().texOffs(106, 13).addBox(-0.5f, -4.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(1.7f, -1.6f, -2.5f, 0.2443461f, 0.61086524f, 0.0f));
        PartDefinition dec_13 = bodyh.addOrReplaceChild("dec_13", CubeListBuilder.create().texOffs(67, 1).addBox(-0.5f, -3.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(5.4f, -2.7f, 2.6f, -0.2443461f, -0.4712389f, 0.0f));
        PartDefinition jointUM3 = bodyh.addOrReplaceChild("jointUM3", CubeListBuilder.create().texOffs(117, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.8f, -2.0f, 0.0f));
        PartDefinition bodyht = jointUM3.addOrReplaceChild("bodyht", CubeListBuilder.create().texOffs(110, 13).addBox(-1.0f, -2.5f, -1.0f, 6, 5, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.7592919f, 0.0f, 0.19198622f));
        PartDefinition dec_20 = bodyht.addOrReplaceChild("dec_20", CubeListBuilder.create().texOffs(116, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 4), PartPose.offsetAndRotation(0.1f, 1.6f, 0.6f, -0.20943952f, (float)Math.PI / 90, 0.7330383f));
        PartDefinition dec_22 = bodyht.addOrReplaceChild("dec_22", CubeListBuilder.create().texOffs(65, 35).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(1.7f, 1.1f, 0.4f, -0.20943952f, (float)Math.PI / 90, 0.5235988f));
        PartDefinition dec_21 = bodyht.addOrReplaceChild("dec_21", CubeListBuilder.create().texOffs(34, 32).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 4), PartPose.offsetAndRotation(1.6f, -1.6f, 1.4f, 0.19198622f, (float)Math.PI / 180, 1.0297443f));
        PartDefinition dec_19 = bodyht.addOrReplaceChild("dec_19", CubeListBuilder.create().texOffs(106, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 4), PartPose.offsetAndRotation(0.1f, -1.6f, 0.7f, 0.20943952f, -0.21642083f, 0.7330383f));
        PartDefinition dec_15 = bodyh.addOrReplaceChild("dec_15", CubeListBuilder.create().texOffs(12, 6).addBox(-0.5f, -4.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(1.4f, -1.6f, 2.4f, -0.3700098f, -0.12915437f, -0.18849556f));
        PartDefinition dec_3 = body1.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(44, 4).addBox(-0.5f, -0.5f, -5.5f, 1, 1, 4), PartPose.offsetAndRotation(5.1f, 4.9f, -1.4f, 0.15707964f, (float)Math.PI / 180, -0.5934119f));
        PartDefinition dec_8 = body1.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(50, 8).addBox(-0.5f, -0.5f, -4.5f, 1, 1, 4), PartPose.offsetAndRotation(9.0f, -5.1f, -2.4f, -0.10471976f, 0.0f, 0.6527531f));
        PartDefinition dec_6 = body1.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5f, -0.5f, -4.5f, 1, 1, 3), PartPose.offsetAndRotation(5.5f, -5.1f, -1.4f, -0.09424778f, 0.08028515f, 0.35953784f));
        PartDefinition dec_5 = body1.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(38, 7).addBox(-0.5f, -0.5f, -5.5f, 1, 1, 4), PartPose.offsetAndRotation(3.6f, -4.9f, -1.3f, -0.101229094f, 0.25830874f, 0.5375614f));
        PartDefinition dec_10 = body1.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(7, 2).addBox(-0.5f, -0.5f, -4.5f, 1, 1, 3), PartPose.offsetAndRotation(10.7f, 3.2f, -1.0f, 0.15707964f, 0.0f, -0.8552113f));
        PartDefinition dec_7 = body1.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5f, -0.5f, -4.5f, 1, 1, 4), PartPose.offsetAndRotation(7.4f, -5.2f, -1.7f, -0.06981317f, 0.0f, 0.4712389f));
        PartDefinition dec_12 = body1.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(6, 8).addBox(-0.5f, -0.5f, -4.5f, 1, 1, 3), PartPose.offsetAndRotation(11.2f, -3.1f, -1.4f, -0.09424778f, 0.08028515f, 0.35953784f));
        PartDefinition dec_1 = body1.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(117, 0).addBox(-0.5f, -0.5f, -4.5f, 1, 1, 4), PartPose.offsetAndRotation(10.9f, 4.8f, -1.9f, 0.10471976f, 0.0f, -0.9773844f));
        PartDefinition dec_4 = body1.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(60, 4).addBox(-0.5f, -0.5f, -5.5f, 1, 1, 4), PartPose.offsetAndRotation(3.3f, 4.7f, -1.3f, 0.2268928f, 0.12217305f, -0.6457718f));
        PartDefinition dec_9 = body1.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(43, 9).addBox(-0.5f, -0.5f, -5.5f, 1, 1, 5), PartPose.offsetAndRotation(10.7f, -5.0f, -1.9f, -0.10471976f, 0.25132743f, 1.7348573f));
        PartDefinition jointLL = bodym.addOrReplaceChild("jointLL", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-6.0f, 6.0f, -4.0f));
        PartDefinition body = jointLL.addOrReplaceChild("body", CubeListBuilder.create().texOffs(89, 0).addBox(-4.0f, -2.5f, -4.0f, 10, 5, 8), PartPose.offsetAndRotation(1.0f, 1.0f, -1.0f, 0.0f, 1.8116517f, 0.0f));
        PartDefinition jointLL_1 = body.addOrReplaceChild("jointLL_1", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition body_1 = jointLL_1.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(98, 27).addBox(-3.0f, -2.0f, -4.0f, 6, 4, 8), PartPose.offsetAndRotation(1.3f, 0.0f, 0.0f, 0.0f, 1.5037757f, 0.0f));
        PartDefinition jointRAX = bodym.addOrReplaceChild("jointRAX", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(8.0f, -9.0f, -3.5f, 0.0f, -0.06981317f, 0.0f));
        PartDefinition JD_1 = jointRAX.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(117, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5307274f));
        PartDefinition jointRAY = JD_1.addOrReplaceChild("jointRAY", CubeListBuilder.create().texOffs(123, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_11 = jointRAY.addOrReplaceChild("body_11", CubeListBuilder.create().texOffs(12, 70).addBox(-3.0f, -1.5f, -2.0f, 6, 10, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.1938052f, 0.0f, 0.0f));
        PartDefinition jointRA1 = body_11.addOrReplaceChild("jointRA1", CubeListBuilder.create().texOffs(38, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 8.5f, 0.5f));
        PartDefinition bodys_1 = jointRA1.addOrReplaceChild("bodys_1", CubeListBuilder.create().texOffs(68, 71).addBox(-2.0f, -0.5f, -1.5f, 4, 10, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.0471976f, -0.18849556f, -0.06283186f));
        PartDefinition body_13 = bodys_1.addOrReplaceChild("body_13", CubeListBuilder.create().texOffs(113, 70).addBox(-1.0f, -0.5f, -1.0f, 2, 7, 2), PartPose.offsetAndRotation(2.0f, 4.0f, 0.0f, -0.31415927f, 0.0f, -1.11352f));
        PartDefinition body_16 = body_13.addOrReplaceChild("body_16", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5f, -0.5f, -0.5f, 1, 7, 1), PartPose.offsetAndRotation(0.0f, 6.7f, 0.0f, -0.7819075f, 0.0f, 0.0f));
        PartDefinition body_12 = bodys_1.addOrReplaceChild("body_12", CubeListBuilder.create().texOffs(32, 70).addBox(-1.0f, -0.5f, -1.0f, 2, 7, 2), PartPose.offsetAndRotation(-2.0f, 4.0f, 0.0f, 0.62831855f, 0.0f, 0.81681406f));
        PartDefinition body_15 = body_12.addOrReplaceChild("body_15", CubeListBuilder.create().texOffs(90, 71).addBox(-0.5f, -0.5f, -0.5f, 1, 14, 1), PartPose.offsetAndRotation(0.0f, 6.7f, 0.0f, -1.9128809f, 0.0f, 0.0f));
        PartDefinition body_14 = bodys_1.addOrReplaceChild("body_14", CubeListBuilder.create().texOffs(82, 71).addBox(-1.0f, -0.5f, -1.0f, 2, 7, 2), PartPose.offsetAndRotation(0.0f, 9.0f, 0.0f, 0.25132743f, 0.0f, 0.0f));
        PartDefinition body_17 = body_14.addOrReplaceChild("body_17", CubeListBuilder.create().texOffs(94, 71).addBox(-0.5f, -0.5f, -0.5f, 1, 11, 1), PartPose.offsetAndRotation(0.0f, 6.7f, 0.0f, -1.5358897f, 0.0f, 0.0f));
        PartDefinition jointDM1 = bodym.addOrReplaceChild("jointDM1", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.3f, 0.0f, -5.5f));
        PartDefinition bodyl = jointDM1.addOrReplaceChild("bodyl", CubeListBuilder.create().texOffs(72, 39).addBox(-1.0f, -6.5f, -4.0f, 13, 13, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.06283186f, 0.40840703f, 0.0f));
        PartDefinition dec_25 = bodyl.addOrReplaceChild("dec_25", CubeListBuilder.create().texOffs(114, 39).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 4), PartPose.offsetAndRotation(3.2f, 5.5f, 2.0f, -0.19198622f, 0.0f, 0.75049156f));
        PartDefinition dec_31 = bodyl.addOrReplaceChild("dec_31", CubeListBuilder.create().texOffs(54, 13).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(1.4f, -5.5f, 2.0f, 0.19198622f, 0.0f, -1.1903145f));
        PartDefinition dec_33 = bodyl.addOrReplaceChild("dec_33", CubeListBuilder.create().texOffs(55, 48).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(1.2f, 4.9f, 2.0f, -0.25481808f, -0.3351032f, -0.39793506f));
        PartDefinition dec_30 = bodyl.addOrReplaceChild("dec_30", CubeListBuilder.create().texOffs(43, 48).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(11.3f, -4.0f, 1.7f, 0.19198622f, -0.2268928f, 1.1868238f));
        PartDefinition dec_24 = bodyl.addOrReplaceChild("dec_24", CubeListBuilder.create().texOffs(104, 39).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 4), PartPose.offsetAndRotation(7.0f, 4.9f, 2.0f, -0.19198622f, -0.20943952f, -0.83775806f));
        PartDefinition dec_23 = bodyl.addOrReplaceChild("dec_23", CubeListBuilder.create().texOffs(7, 12).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(9.4f, 5.5f, 2.0f, -0.19198622f, -0.29670596f, -0.82030475f));
        PartDefinition dec_29 = bodyl.addOrReplaceChild("dec_29", CubeListBuilder.create().texOffs(38, 48).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 4), PartPose.offsetAndRotation(11.3f, 4.9f, 1.9f, -0.19198622f, -0.20943952f, -1.1519173f));
        PartDefinition dec_32 = bodyl.addOrReplaceChild("dec_32", CubeListBuilder.create().texOffs(50, 48).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 4), PartPose.offsetAndRotation(9.8f, -5.5f, 2.0f, 0.2617994f, -0.12217305f, 1.0821041f));
        PartDefinition dec_26 = bodyl.addOrReplaceChild("dec_26", CubeListBuilder.create().texOffs(110, 44).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 4), PartPose.offsetAndRotation(5.4f, -5.5f, 2.0f, 0.19198622f, 0.18849556f, -0.75049156f));
        PartDefinition dec_28 = bodyl.addOrReplaceChild("dec_28", CubeListBuilder.create().texOffs(38, 12).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(7.8f, -5.5f, 2.0f, 0.2617994f, -0.12217305f, 1.0821041f));
        PartDefinition dec_27 = bodyl.addOrReplaceChild("dec_27", CubeListBuilder.create().texOffs(115, 44).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(3.4f, -4.9f, 2.0f, 0.19198622f, -0.38397244f, 1.1519173f));
        PartDefinition jointDM2 = bodyl.addOrReplaceChild("jointDM2", CubeListBuilder.create().texOffs(123, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.2f, 0.0f, 0.0f));
        PartDefinition bodyl2 = jointDM2.addOrReplaceChild("bodyl2", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5f, -4.0f, -2.0f, 8, 8, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.12566371f, 0.23038346f, 0.0f));
        PartDefinition dec_36 = bodyl2.addOrReplaceChild("dec_36", CubeListBuilder.create().texOffs(117, 50).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 4), PartPose.offsetAndRotation(4.3f, 3.0f, 0.9f, (float)(-Math.PI) / 180, -0.36651915f, -1.6022123f));
        PartDefinition jointDM3 = bodyl2.addOrReplaceChild("jointDM3", CubeListBuilder.create().texOffs(12, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.8f, 0.0f, -0.5f));
        PartDefinition bodylooo = jointDM3.addOrReplaceChild("bodylooo", CubeListBuilder.create().texOffs(56, 54).addBox(-0.5f, -2.5f, -1.5f, 5, 5, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.18849556f, 0.10471976f, 0.0f));
        PartDefinition dec_43 = bodylooo.addOrReplaceChild("dec_43", CubeListBuilder.create().texOffs(116, 56).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 4), PartPose.offsetAndRotation(0.9f, -1.6f, -0.1f, 0.36651915f, -0.15707964f, -0.2268928f));
        PartDefinition dec_44 = bodylooo.addOrReplaceChild("dec_44", CubeListBuilder.create().texOffs(89, 13).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 3), PartPose.offsetAndRotation(2.3f, -1.4f, -0.1f, 0.4537856f, 0.21991149f, -0.13962634f));
        PartDefinition dec_41 = bodylooo.addOrReplaceChild("dec_41", CubeListBuilder.create().texOffs(65, 56).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(0.4f, 1.6f, -0.1f, -0.36651915f, 0.15707964f, 0.2268928f));
        PartDefinition dec_42 = bodylooo.addOrReplaceChild("dec_42", CubeListBuilder.create().texOffs(106, 56).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 4), PartPose.offsetAndRotation(2.1f, 1.4f, -0.1f, -0.4537856f, 0.28274333f, 0.13962634f));
        PartDefinition dec_35 = bodyl2.addOrReplaceChild("dec_35", CubeListBuilder.create().texOffs(62, 48).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 4), PartPose.offsetAndRotation(6.4f, 2.8f, 0.9f, -0.2443461f, -0.2268928f, -1.2042772f));
        PartDefinition dec_40 = bodyl2.addOrReplaceChild("dec_40", CubeListBuilder.create().texOffs(46, 54).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 4), PartPose.offsetAndRotation(5.7f, -2.5f, 0.9f, 0.2443461f, -0.27925268f, 1.4381514f));
        PartDefinition dec_39 = bodyl2.addOrReplaceChild("dec_39", CubeListBuilder.create().texOffs(34, 53).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(3.6f, -2.7f, 0.9f, 0.33161256f, -0.4712389f, 1.3439035f));
        PartDefinition dec_38 = bodyl2.addOrReplaceChild("dec_38", CubeListBuilder.create().texOffs(29, 52).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 4), PartPose.offsetAndRotation(1.4f, -2.7f, 0.9f, 0.2443461f, -0.41887903f, 1.2915436f));
        PartDefinition dec_37 = bodyl2.addOrReplaceChild("dec_37", CubeListBuilder.create().texOffs(22, 52).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(1.4f, 2.7f, 0.9f, -0.2443461f, -0.38397244f, -1.4974926f));
        PartDefinition dec_34 = bodyl.addOrReplaceChild("dec_34", CubeListBuilder.create().texOffs(110, 50).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 5), PartPose.offsetAndRotation(5.0f, 4.9f, 1.9f, -0.19198622f, -0.20943952f, -1.1519173f));
        PartDefinition bodym_1 = mainbody.addOrReplaceChild("bodym_1", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0f, -8.0f, -9.5f, 11, 16, 16), PartPose.offsetAndRotation(0.0f, -2.0f, 0.0f, 1.5707964f, 0.0f, -0.17802358f));
        PartDefinition bodym_2 = mainbody.addOrReplaceChild("bodym_2", CubeListBuilder.create().texOffs(54, 0).addBox(0.0f, -9.0f, -6.5f, 9, 18, 17), PartPose.offsetAndRotation(1.0f, -2.0f, 0.0f, 1.6336281f, 0.0f, -0.11519173f));
        return LayerDefinition.create(mesh, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        float f2;
        float f1;
        float GD;
        float GS;
        EntityParasiteBase parasite = (EntityParasiteBase)entity;
        this.jointLL.yRot = 0.0f;
        this.jointRL.yRot = 0.0f;
        this.jointRAX.zRot = 0.0f;
        this.jointRAY.xRot = 0.0f;
        this.jointLAX.zRot = 0.0f;
        this.jointLAY.xRot = 0.0f;
        this.jointDM1.yRot = 0.0f;
        this.jointDM2.yRot = 0.0f;
        this.jointDM3.yRot = 0.0f;
        this.jointUM1.yRot = 0.0f;
        this.jointUM2.yRot = 0.0f;
        this.jointUM3.yRot = 0.0f;
        this.jointUM3.zRot = 0.0f;
        this.mainbody.y = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                GS = 2.0f;
                GD = 0.6f;
                this.swingZ(this.jointRAX, 0.2f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointRAY, 0.2f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLAX, 0.2f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointLAY, 0.2f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLL, 0.2f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingY(this.jointRL, 0.2f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.4f * GS, 1, limbSwing, limbSwingAmount, 0.08f);
            }
            f1 = Mth.cos((float)(ageInTicks * 0.15f)) * 0.0415f;
            f2 = -1.0f * Mth.cos((float)(ageInTicks * 0.15f)) * 0.0915f;
            float f3 = Mth.cos((float)(ageInTicks * 0.17955f)) * 0.0262f;
            float f4 = Mth.cos((float)(ageInTicks * 0.15222f)) * 0.0265f;
            this.jointDM1.yRot = f1;
            this.jointDM2.yRot = f1;
            this.jointDM3.yRot = f1;
            this.jointUM1.yRot = f2;
            this.jointUM2.yRot = f2;
            this.jointUM3.zRot = f2;
        } else if (i != 1 && i == 2) {
            if (!parasite.getStillAni()) {
                GS = 3.0f;
                GD = 0.4f;
                this.swingZ(this.jointRAX, 0.2f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointRAY, 0.2f * GS, 1.0f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLAX, 0.2f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointLAY, 0.2f * GS, 1.0f * GD, -1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLL, 0.2f * GS, 1.5f * GD, -1, limbSwing, limbSwingAmount);
                this.swingY(this.jointRL, 0.2f * GS, 1.5f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.4f * GS, 1, limbSwing, limbSwingAmount, 0.08f);
            }
            f1 = Mth.cos((float)(ageInTicks * 0.3f)) * 0.0415f;
            f2 = -1.0f * Mth.cos((float)(ageInTicks * 0.3f)) * 0.0915f;
            float f3 = Mth.cos((float)(ageInTicks * 0.27955f)) * 0.0262f;
            float f4 = Mth.cos((float)(ageInTicks * 0.35222f)) * 0.0265f;
            this.jointDM1.yRot = f1;
            this.jointDM2.yRot = 0.3f + f1;
            this.jointDM3.yRot = f1;
            this.jointUM1.yRot = -0.2f + f2;
            this.jointUM2.yRot = -0.3f + f2;
            this.jointUM3.zRot = 0.4f + f2;
        }
        float f4 = Mth.cos((float)(ageInTicks * 0.18f)) * 0.2065f;
        float f3 = Mth.cos((float)(ageInTicks * 0.17f)) * 0.2065f;
        f4 = Mth.cos((float)(ageInTicks * 0.2216f)) * 0.3021f;
        f3 = Mth.cos((float)(ageInTicks * 0.2014f)) * 0.322f;
        this.jointRM1.xRot = f4;
        this.joinRM2.yRot = f3;
        this.jointRM3.zRot = f4;
        this.jointRM4.xRot = f3;
        this.jointRR1.yRot = f4;
        this.joinRR2.zRot = f3;
        this.jointRR3.xRot = f4;
        this.jointRR4.yRot = f3;
        this.jointRL1.zRot = f4;
        this.joinRL2.xRot = f3;
        this.jointRL3.yRot = f4;
        this.jointRL4.zRot = f3;
        f4 = Mth.cos((float)(ageInTicks * 0.16f)) * 0.195f;
        f3 = Mth.cos((float)(ageInTicks * 0.14f)) * 0.185f;
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
