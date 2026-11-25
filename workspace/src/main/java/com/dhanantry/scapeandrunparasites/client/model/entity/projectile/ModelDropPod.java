package com.dhanantry.scapeandrunparasites.client.model.entity.projectile;

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
import com.dhanantry.scapeandrunparasites.entity.projectile.EntityDropPod;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelDropPod extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "droppod"), "main");
    private final ModelPart mainbody;
    private final ModelPart bodyl;
    private final ModelPart bodyf;
    private final ModelPart bodyb;
    private final ModelPart bodyu;
    private final ModelPart bodyd;
    private final ModelPart bodyr;
    private final ModelPart body;
    private final ModelPart body_1;
    private final ModelPart hair_jointRTLB;
    private final ModelPart hair_jointRTLM;
    private final ModelPart hair_jointRTLF;
    private final ModelPart hair;
    private final ModelPart hair_jointLB1;
    private final ModelPart hair_1;
    private final ModelPart hair_jointLB2;
    private final ModelPart hair_2;
    private final ModelPart hair_jointLB3;
    private final ModelPart hair_3;
    private final ModelPart hair_jointLB4;
    private final ModelPart hair_4;
    private final ModelPart hair_jointLB5;
    private final ModelPart hair_5;
    private final ModelPart hair_jointLB6;
    private final ModelPart hair_6;
    private final ModelPart hair_jointLB7;
    private final ModelPart hair_7;
    private final ModelPart hair_jointLB8;
    private final ModelPart hair_8;
    private final ModelPart hair_jointLB9;
    private final ModelPart hair_9;
    private final ModelPart hair_10;
    private final ModelPart hair_jointLM1;
    private final ModelPart hair_11;
    private final ModelPart hair_jointLM2;
    private final ModelPart hair_12;
    private final ModelPart hair_jointLM3;
    private final ModelPart hair_13;
    private final ModelPart hair_jointLM4;
    private final ModelPart hair_14;
    private final ModelPart hair_jointLM5;
    private final ModelPart hair_15;
    private final ModelPart hair_jointLM6;
    private final ModelPart hair_16;
    private final ModelPart hair_jointLM7;
    private final ModelPart hair_17;
    private final ModelPart hair_jointLM8;
    private final ModelPart hair_18;
    private final ModelPart hair_jointLM9;
    private final ModelPart hair_19;
    private final ModelPart hair_20;
    private final ModelPart hair_jointLF1;
    private final ModelPart hair_21;
    private final ModelPart hair_jointLF2;
    private final ModelPart hair_22;
    private final ModelPart hair_jointLF3;
    private final ModelPart hair_23;
    private final ModelPart hair_jointLF4;
    private final ModelPart hair_24;
    private final ModelPart hair_jointLF5;
    private final ModelPart hair_25;
    private final ModelPart hair_jointLF6;
    private final ModelPart hair_26;
    private final ModelPart hair_jointLF7;
    private final ModelPart hair_27;
    private final ModelPart hair_jointLF8;
    private final ModelPart hair_28;
    private final ModelPart hair_jointLF9;
    private final ModelPart hair_29;
    private final ModelPart taclejoint1;
    private final ModelPart dec;
    private final ModelPart dec_1;
    private final ModelPart dec_2;
    private final ModelPart dec_3;
    private final ModelPart tentacle;
    private final ModelPart taclejoint2;
    private final ModelPart tentacle_1;
    private final ModelPart taclejoint3;
    private final ModelPart tentacle_2;
    private final ModelPart taclejoint4;
    private final ModelPart tentacle_3;
    private final ModelPart hair_jointRTRF;
    private final ModelPart hair_jointRTRM;
    private final ModelPart hair_jointRTRB;
    private final ModelPart hair_30;
    private final ModelPart hair_jointRF1;
    private final ModelPart hair_31;
    private final ModelPart hair_jointRF2;
    private final ModelPart hair_32;
    private final ModelPart hair_jointRF3;
    private final ModelPart hair_33;
    private final ModelPart hair_jointRF4;
    private final ModelPart hair_34;
    private final ModelPart hair_jointRF5;
    private final ModelPart hair_35;
    private final ModelPart hair_jointRF6;
    private final ModelPart hair_36;
    private final ModelPart hair_jointRF7;
    private final ModelPart hair_37;
    private final ModelPart hair_jointRF8;
    private final ModelPart hair_38;
    private final ModelPart hair_jointRF9;
    private final ModelPart hair_39;
    private final ModelPart hair_40;
    private final ModelPart hair_jointRM1;
    private final ModelPart hair_41;
    private final ModelPart hair_jointRM2;
    private final ModelPart hair_42;
    private final ModelPart hair_jointRM3;
    private final ModelPart hair_43;
    private final ModelPart hair_jointRM4;
    private final ModelPart hair_44;
    private final ModelPart hair_jointRM5;
    private final ModelPart hair_45;
    private final ModelPart hair_jointRM6;
    private final ModelPart hair_46;
    private final ModelPart hair_jointRM7;
    private final ModelPart hair_47;
    private final ModelPart hair_jointRM8;
    private final ModelPart hair_48;
    private final ModelPart hair_jointRM9;
    private final ModelPart hair_49;
    private final ModelPart hair_50;
    private final ModelPart hair_jointRB1;
    private final ModelPart hair_51;
    private final ModelPart hair_jointRB2;
    private final ModelPart hair_52;
    private final ModelPart hair_jointRB3;
    private final ModelPart hair_53;
    private final ModelPart hair_jointRB4;
    private final ModelPart hair_54;
    private final ModelPart hair_jointRB5;
    private final ModelPart hair_55;
    private final ModelPart hair_jointRB6;
    private final ModelPart hair_56;
    private final ModelPart hair_jointRB7;
    private final ModelPart hair_57;
    private final ModelPart hair_jointRB8;
    private final ModelPart hair_58;
    private final ModelPart hair_jointRB9;
    private final ModelPart hair_59;

    public ModelDropPod(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.bodyl = root.getChild("mainbody").getChild("bodyl");
        this.bodyf = root.getChild("mainbody").getChild("bodyf");
        this.bodyb = root.getChild("mainbody").getChild("bodyb");
        this.bodyu = root.getChild("mainbody").getChild("bodyu");
        this.bodyd = root.getChild("mainbody").getChild("bodyd");
        this.bodyr = root.getChild("mainbody").getChild("bodyr");
        this.body = root.getChild("mainbody").getChild("body");
        this.body_1 = root.getChild("mainbody").getChild("body_1");
        this.hair_jointRTLB = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB");
        this.hair_jointRTLM = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM");
        this.hair_jointRTLF = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF");
        this.hair = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair");
        this.hair_jointLB1 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1");
        this.hair_1 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1");
        this.hair_jointLB2 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2");
        this.hair_2 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2");
        this.hair_jointLB3 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3");
        this.hair_3 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3");
        this.hair_jointLB4 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3").getChild("hair_jointLB4");
        this.hair_4 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3").getChild("hair_jointLB4").getChild("hair_4");
        this.hair_jointLB5 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3").getChild("hair_jointLB4").getChild("hair_4").getChild("hair_jointLB5");
        this.hair_5 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3").getChild("hair_jointLB4").getChild("hair_4").getChild("hair_jointLB5").getChild("hair_5");
        this.hair_jointLB6 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3").getChild("hair_jointLB4").getChild("hair_4").getChild("hair_jointLB5").getChild("hair_5").getChild("hair_jointLB6");
        this.hair_6 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3").getChild("hair_jointLB4").getChild("hair_4").getChild("hair_jointLB5").getChild("hair_5").getChild("hair_jointLB6").getChild("hair_6");
        this.hair_jointLB7 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3").getChild("hair_jointLB4").getChild("hair_4").getChild("hair_jointLB5").getChild("hair_5").getChild("hair_jointLB6").getChild("hair_6").getChild("hair_jointLB7");
        this.hair_7 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3").getChild("hair_jointLB4").getChild("hair_4").getChild("hair_jointLB5").getChild("hair_5").getChild("hair_jointLB6").getChild("hair_6").getChild("hair_jointLB7").getChild("hair_7");
        this.hair_jointLB8 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3").getChild("hair_jointLB4").getChild("hair_4").getChild("hair_jointLB5").getChild("hair_5").getChild("hair_jointLB6").getChild("hair_6").getChild("hair_jointLB7").getChild("hair_7").getChild("hair_jointLB8");
        this.hair_8 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3").getChild("hair_jointLB4").getChild("hair_4").getChild("hair_jointLB5").getChild("hair_5").getChild("hair_jointLB6").getChild("hair_6").getChild("hair_jointLB7").getChild("hair_7").getChild("hair_jointLB8").getChild("hair_8");
        this.hair_jointLB9 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3").getChild("hair_jointLB4").getChild("hair_4").getChild("hair_jointLB5").getChild("hair_5").getChild("hair_jointLB6").getChild("hair_6").getChild("hair_jointLB7").getChild("hair_7").getChild("hair_jointLB8").getChild("hair_8").getChild("hair_jointLB9");
        this.hair_9 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLB").getChild("hair").getChild("hair_jointLB1").getChild("hair_1").getChild("hair_jointLB2").getChild("hair_2").getChild("hair_jointLB3").getChild("hair_3").getChild("hair_jointLB4").getChild("hair_4").getChild("hair_jointLB5").getChild("hair_5").getChild("hair_jointLB6").getChild("hair_6").getChild("hair_jointLB7").getChild("hair_7").getChild("hair_jointLB8").getChild("hair_8").getChild("hair_jointLB9").getChild("hair_9");
        this.hair_10 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10");
        this.hair_jointLM1 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1");
        this.hair_11 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11");
        this.hair_jointLM2 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2");
        this.hair_12 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12");
        this.hair_jointLM3 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3");
        this.hair_13 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13");
        this.hair_jointLM4 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13").getChild("hair_jointLM4");
        this.hair_14 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13").getChild("hair_jointLM4").getChild("hair_14");
        this.hair_jointLM5 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13").getChild("hair_jointLM4").getChild("hair_14").getChild("hair_jointLM5");
        this.hair_15 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13").getChild("hair_jointLM4").getChild("hair_14").getChild("hair_jointLM5").getChild("hair_15");
        this.hair_jointLM6 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13").getChild("hair_jointLM4").getChild("hair_14").getChild("hair_jointLM5").getChild("hair_15").getChild("hair_jointLM6");
        this.hair_16 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13").getChild("hair_jointLM4").getChild("hair_14").getChild("hair_jointLM5").getChild("hair_15").getChild("hair_jointLM6").getChild("hair_16");
        this.hair_jointLM7 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13").getChild("hair_jointLM4").getChild("hair_14").getChild("hair_jointLM5").getChild("hair_15").getChild("hair_jointLM6").getChild("hair_16").getChild("hair_jointLM7");
        this.hair_17 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13").getChild("hair_jointLM4").getChild("hair_14").getChild("hair_jointLM5").getChild("hair_15").getChild("hair_jointLM6").getChild("hair_16").getChild("hair_jointLM7").getChild("hair_17");
        this.hair_jointLM8 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13").getChild("hair_jointLM4").getChild("hair_14").getChild("hair_jointLM5").getChild("hair_15").getChild("hair_jointLM6").getChild("hair_16").getChild("hair_jointLM7").getChild("hair_17").getChild("hair_jointLM8");
        this.hair_18 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13").getChild("hair_jointLM4").getChild("hair_14").getChild("hair_jointLM5").getChild("hair_15").getChild("hair_jointLM6").getChild("hair_16").getChild("hair_jointLM7").getChild("hair_17").getChild("hair_jointLM8").getChild("hair_18");
        this.hair_jointLM9 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13").getChild("hair_jointLM4").getChild("hair_14").getChild("hair_jointLM5").getChild("hair_15").getChild("hair_jointLM6").getChild("hair_16").getChild("hair_jointLM7").getChild("hair_17").getChild("hair_jointLM8").getChild("hair_18").getChild("hair_jointLM9");
        this.hair_19 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLM").getChild("hair_10").getChild("hair_jointLM1").getChild("hair_11").getChild("hair_jointLM2").getChild("hair_12").getChild("hair_jointLM3").getChild("hair_13").getChild("hair_jointLM4").getChild("hair_14").getChild("hair_jointLM5").getChild("hair_15").getChild("hair_jointLM6").getChild("hair_16").getChild("hair_jointLM7").getChild("hair_17").getChild("hair_jointLM8").getChild("hair_18").getChild("hair_jointLM9").getChild("hair_19");
        this.hair_20 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20");
        this.hair_jointLF1 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1");
        this.hair_21 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21");
        this.hair_jointLF2 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2");
        this.hair_22 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22");
        this.hair_jointLF3 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3");
        this.hair_23 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23");
        this.hair_jointLF4 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23").getChild("hair_jointLF4");
        this.hair_24 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23").getChild("hair_jointLF4").getChild("hair_24");
        this.hair_jointLF5 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23").getChild("hair_jointLF4").getChild("hair_24").getChild("hair_jointLF5");
        this.hair_25 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23").getChild("hair_jointLF4").getChild("hair_24").getChild("hair_jointLF5").getChild("hair_25");
        this.hair_jointLF6 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23").getChild("hair_jointLF4").getChild("hair_24").getChild("hair_jointLF5").getChild("hair_25").getChild("hair_jointLF6");
        this.hair_26 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23").getChild("hair_jointLF4").getChild("hair_24").getChild("hair_jointLF5").getChild("hair_25").getChild("hair_jointLF6").getChild("hair_26");
        this.hair_jointLF7 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23").getChild("hair_jointLF4").getChild("hair_24").getChild("hair_jointLF5").getChild("hair_25").getChild("hair_jointLF6").getChild("hair_26").getChild("hair_jointLF7");
        this.hair_27 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23").getChild("hair_jointLF4").getChild("hair_24").getChild("hair_jointLF5").getChild("hair_25").getChild("hair_jointLF6").getChild("hair_26").getChild("hair_jointLF7").getChild("hair_27");
        this.hair_jointLF8 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23").getChild("hair_jointLF4").getChild("hair_24").getChild("hair_jointLF5").getChild("hair_25").getChild("hair_jointLF6").getChild("hair_26").getChild("hair_jointLF7").getChild("hair_27").getChild("hair_jointLF8");
        this.hair_28 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23").getChild("hair_jointLF4").getChild("hair_24").getChild("hair_jointLF5").getChild("hair_25").getChild("hair_jointLF6").getChild("hair_26").getChild("hair_jointLF7").getChild("hair_27").getChild("hair_jointLF8").getChild("hair_28");
        this.hair_jointLF9 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23").getChild("hair_jointLF4").getChild("hair_24").getChild("hair_jointLF5").getChild("hair_25").getChild("hair_jointLF6").getChild("hair_26").getChild("hair_jointLF7").getChild("hair_27").getChild("hair_jointLF8").getChild("hair_28").getChild("hair_jointLF9");
        this.hair_29 = root.getChild("mainbody").getChild("bodyl").getChild("hair_jointRTLF").getChild("hair_20").getChild("hair_jointLF1").getChild("hair_21").getChild("hair_jointLF2").getChild("hair_22").getChild("hair_jointLF3").getChild("hair_23").getChild("hair_jointLF4").getChild("hair_24").getChild("hair_jointLF5").getChild("hair_25").getChild("hair_jointLF6").getChild("hair_26").getChild("hair_jointLF7").getChild("hair_27").getChild("hair_jointLF8").getChild("hair_28").getChild("hair_jointLF9").getChild("hair_29");
        this.taclejoint1 = root.getChild("mainbody").getChild("bodyu").getChild("taclejoint1");
        this.dec = root.getChild("mainbody").getChild("bodyu").getChild("dec");
        this.dec_1 = root.getChild("mainbody").getChild("bodyu").getChild("dec_1");
        this.dec_2 = root.getChild("mainbody").getChild("bodyu").getChild("dec_2");
        this.dec_3 = root.getChild("mainbody").getChild("bodyu").getChild("dec_3");
        this.tentacle = root.getChild("mainbody").getChild("bodyu").getChild("taclejoint1").getChild("tentacle");
        this.taclejoint2 = root.getChild("mainbody").getChild("bodyu").getChild("taclejoint1").getChild("tentacle").getChild("taclejoint2");
        this.tentacle_1 = root.getChild("mainbody").getChild("bodyu").getChild("taclejoint1").getChild("tentacle").getChild("taclejoint2").getChild("tentacle_1");
        this.taclejoint3 = root.getChild("mainbody").getChild("bodyu").getChild("taclejoint1").getChild("tentacle").getChild("taclejoint2").getChild("tentacle_1").getChild("taclejoint3");
        this.tentacle_2 = root.getChild("mainbody").getChild("bodyu").getChild("taclejoint1").getChild("tentacle").getChild("taclejoint2").getChild("tentacle_1").getChild("taclejoint3").getChild("tentacle_2");
        this.taclejoint4 = root.getChild("mainbody").getChild("bodyu").getChild("taclejoint1").getChild("tentacle").getChild("taclejoint2").getChild("tentacle_1").getChild("taclejoint3").getChild("tentacle_2").getChild("taclejoint4");
        this.tentacle_3 = root.getChild("mainbody").getChild("bodyu").getChild("taclejoint1").getChild("tentacle").getChild("taclejoint2").getChild("tentacle_1").getChild("taclejoint3").getChild("tentacle_2").getChild("taclejoint4").getChild("tentacle_3");
        this.hair_jointRTRF = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF");
        this.hair_jointRTRM = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM");
        this.hair_jointRTRB = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB");
        this.hair_30 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30");
        this.hair_jointRF1 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1");
        this.hair_31 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31");
        this.hair_jointRF2 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2");
        this.hair_32 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32");
        this.hair_jointRF3 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3");
        this.hair_33 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33");
        this.hair_jointRF4 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33").getChild("hair_jointRF4");
        this.hair_34 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33").getChild("hair_jointRF4").getChild("hair_34");
        this.hair_jointRF5 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33").getChild("hair_jointRF4").getChild("hair_34").getChild("hair_jointRF5");
        this.hair_35 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33").getChild("hair_jointRF4").getChild("hair_34").getChild("hair_jointRF5").getChild("hair_35");
        this.hair_jointRF6 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33").getChild("hair_jointRF4").getChild("hair_34").getChild("hair_jointRF5").getChild("hair_35").getChild("hair_jointRF6");
        this.hair_36 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33").getChild("hair_jointRF4").getChild("hair_34").getChild("hair_jointRF5").getChild("hair_35").getChild("hair_jointRF6").getChild("hair_36");
        this.hair_jointRF7 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33").getChild("hair_jointRF4").getChild("hair_34").getChild("hair_jointRF5").getChild("hair_35").getChild("hair_jointRF6").getChild("hair_36").getChild("hair_jointRF7");
        this.hair_37 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33").getChild("hair_jointRF4").getChild("hair_34").getChild("hair_jointRF5").getChild("hair_35").getChild("hair_jointRF6").getChild("hair_36").getChild("hair_jointRF7").getChild("hair_37");
        this.hair_jointRF8 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33").getChild("hair_jointRF4").getChild("hair_34").getChild("hair_jointRF5").getChild("hair_35").getChild("hair_jointRF6").getChild("hair_36").getChild("hair_jointRF7").getChild("hair_37").getChild("hair_jointRF8");
        this.hair_38 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33").getChild("hair_jointRF4").getChild("hair_34").getChild("hair_jointRF5").getChild("hair_35").getChild("hair_jointRF6").getChild("hair_36").getChild("hair_jointRF7").getChild("hair_37").getChild("hair_jointRF8").getChild("hair_38");
        this.hair_jointRF9 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33").getChild("hair_jointRF4").getChild("hair_34").getChild("hair_jointRF5").getChild("hair_35").getChild("hair_jointRF6").getChild("hair_36").getChild("hair_jointRF7").getChild("hair_37").getChild("hair_jointRF8").getChild("hair_38").getChild("hair_jointRF9");
        this.hair_39 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRF").getChild("hair_30").getChild("hair_jointRF1").getChild("hair_31").getChild("hair_jointRF2").getChild("hair_32").getChild("hair_jointRF3").getChild("hair_33").getChild("hair_jointRF4").getChild("hair_34").getChild("hair_jointRF5").getChild("hair_35").getChild("hair_jointRF6").getChild("hair_36").getChild("hair_jointRF7").getChild("hair_37").getChild("hair_jointRF8").getChild("hair_38").getChild("hair_jointRF9").getChild("hair_39");
        this.hair_40 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40");
        this.hair_jointRM1 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1");
        this.hair_41 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41");
        this.hair_jointRM2 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2");
        this.hair_42 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42");
        this.hair_jointRM3 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3");
        this.hair_43 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43");
        this.hair_jointRM4 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43").getChild("hair_jointRM4");
        this.hair_44 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43").getChild("hair_jointRM4").getChild("hair_44");
        this.hair_jointRM5 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43").getChild("hair_jointRM4").getChild("hair_44").getChild("hair_jointRM5");
        this.hair_45 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43").getChild("hair_jointRM4").getChild("hair_44").getChild("hair_jointRM5").getChild("hair_45");
        this.hair_jointRM6 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43").getChild("hair_jointRM4").getChild("hair_44").getChild("hair_jointRM5").getChild("hair_45").getChild("hair_jointRM6");
        this.hair_46 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43").getChild("hair_jointRM4").getChild("hair_44").getChild("hair_jointRM5").getChild("hair_45").getChild("hair_jointRM6").getChild("hair_46");
        this.hair_jointRM7 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43").getChild("hair_jointRM4").getChild("hair_44").getChild("hair_jointRM5").getChild("hair_45").getChild("hair_jointRM6").getChild("hair_46").getChild("hair_jointRM7");
        this.hair_47 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43").getChild("hair_jointRM4").getChild("hair_44").getChild("hair_jointRM5").getChild("hair_45").getChild("hair_jointRM6").getChild("hair_46").getChild("hair_jointRM7").getChild("hair_47");
        this.hair_jointRM8 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43").getChild("hair_jointRM4").getChild("hair_44").getChild("hair_jointRM5").getChild("hair_45").getChild("hair_jointRM6").getChild("hair_46").getChild("hair_jointRM7").getChild("hair_47").getChild("hair_jointRM8");
        this.hair_48 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43").getChild("hair_jointRM4").getChild("hair_44").getChild("hair_jointRM5").getChild("hair_45").getChild("hair_jointRM6").getChild("hair_46").getChild("hair_jointRM7").getChild("hair_47").getChild("hair_jointRM8").getChild("hair_48");
        this.hair_jointRM9 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43").getChild("hair_jointRM4").getChild("hair_44").getChild("hair_jointRM5").getChild("hair_45").getChild("hair_jointRM6").getChild("hair_46").getChild("hair_jointRM7").getChild("hair_47").getChild("hair_jointRM8").getChild("hair_48").getChild("hair_jointRM9");
        this.hair_49 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRM").getChild("hair_40").getChild("hair_jointRM1").getChild("hair_41").getChild("hair_jointRM2").getChild("hair_42").getChild("hair_jointRM3").getChild("hair_43").getChild("hair_jointRM4").getChild("hair_44").getChild("hair_jointRM5").getChild("hair_45").getChild("hair_jointRM6").getChild("hair_46").getChild("hair_jointRM7").getChild("hair_47").getChild("hair_jointRM8").getChild("hair_48").getChild("hair_jointRM9").getChild("hair_49");
        this.hair_50 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50");
        this.hair_jointRB1 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1");
        this.hair_51 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51");
        this.hair_jointRB2 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2");
        this.hair_52 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52");
        this.hair_jointRB3 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3");
        this.hair_53 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53");
        this.hair_jointRB4 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53").getChild("hair_jointRB4");
        this.hair_54 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53").getChild("hair_jointRB4").getChild("hair_54");
        this.hair_jointRB5 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53").getChild("hair_jointRB4").getChild("hair_54").getChild("hair_jointRB5");
        this.hair_55 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53").getChild("hair_jointRB4").getChild("hair_54").getChild("hair_jointRB5").getChild("hair_55");
        this.hair_jointRB6 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53").getChild("hair_jointRB4").getChild("hair_54").getChild("hair_jointRB5").getChild("hair_55").getChild("hair_jointRB6");
        this.hair_56 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53").getChild("hair_jointRB4").getChild("hair_54").getChild("hair_jointRB5").getChild("hair_55").getChild("hair_jointRB6").getChild("hair_56");
        this.hair_jointRB7 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53").getChild("hair_jointRB4").getChild("hair_54").getChild("hair_jointRB5").getChild("hair_55").getChild("hair_jointRB6").getChild("hair_56").getChild("hair_jointRB7");
        this.hair_57 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53").getChild("hair_jointRB4").getChild("hair_54").getChild("hair_jointRB5").getChild("hair_55").getChild("hair_jointRB6").getChild("hair_56").getChild("hair_jointRB7").getChild("hair_57");
        this.hair_jointRB8 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53").getChild("hair_jointRB4").getChild("hair_54").getChild("hair_jointRB5").getChild("hair_55").getChild("hair_jointRB6").getChild("hair_56").getChild("hair_jointRB7").getChild("hair_57").getChild("hair_jointRB8");
        this.hair_58 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53").getChild("hair_jointRB4").getChild("hair_54").getChild("hair_jointRB5").getChild("hair_55").getChild("hair_jointRB6").getChild("hair_56").getChild("hair_jointRB7").getChild("hair_57").getChild("hair_jointRB8").getChild("hair_58");
        this.hair_jointRB9 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53").getChild("hair_jointRB4").getChild("hair_54").getChild("hair_jointRB5").getChild("hair_55").getChild("hair_jointRB6").getChild("hair_56").getChild("hair_jointRB7").getChild("hair_57").getChild("hair_jointRB8").getChild("hair_58").getChild("hair_jointRB9");
        this.hair_59 = root.getChild("mainbody").getChild("bodyr").getChild("hair_jointRTRB").getChild("hair_50").getChild("hair_jointRB1").getChild("hair_51").getChild("hair_jointRB2").getChild("hair_52").getChild("hair_jointRB3").getChild("hair_53").getChild("hair_jointRB4").getChild("hair_54").getChild("hair_jointRB5").getChild("hair_55").getChild("hair_jointRB6").getChild("hair_56").getChild("hair_jointRB7").getChild("hair_57").getChild("hair_jointRB8").getChild("hair_58").getChild("hair_jointRB9").getChild("hair_59");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0f, -0.5f, -9.0f, 18, 30, 18), PartPose.offset(0.0f, -5.4f, 0.0f));
        PartDefinition bodyd = mainbody.addOrReplaceChild("bodyd", CubeListBuilder.create().texOffs(188, 6).addBox(-7.0f, -0.5f, -7.0f, 14, 2, 14), PartPose.offset(0.0f, 29.6f, 0.0f));
        PartDefinition bodyr = mainbody.addOrReplaceChild("bodyr", CubeListBuilder.create().texOffs(162, 20).addBox(-3.0f, -5.0f, -4.0f, 6, 8, 8), PartPose.offsetAndRotation(-14.1f, 1.5f, 0.0f, 0.0f, (float)Math.PI, -0.20943952f));
        PartDefinition hair_jointRTRF = bodyr.addOrReplaceChild("hair_jointRTRF", CubeListBuilder.create().texOffs(118, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, -5.0f, 3.0f, 1.5707964f, 0.0f, 0.0f));
        PartDefinition hair_30 = hair_jointRTRF.addOrReplaceChild("hair_30", CubeListBuilder.create().texOffs(106, 34).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.17453292f, -0.17453292f, 0.2617994f));
        PartDefinition hair_jointRF1 = hair_30.addOrReplaceChild("hair_jointRF1", CubeListBuilder.create().texOffs(162, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_31 = hair_jointRF1.addOrReplaceChild("hair_31", CubeListBuilder.create().texOffs(72, 35).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRF2 = hair_31.addOrReplaceChild("hair_jointRF2", CubeListBuilder.create().texOffs(169, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_32 = hair_jointRF2.addOrReplaceChild("hair_32", CubeListBuilder.create().texOffs(240, 36).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointRF3 = hair_32.addOrReplaceChild("hair_jointRF3", CubeListBuilder.create().texOffs(173, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 5.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_33 = hair_jointRF3.addOrReplaceChild("hair_33", CubeListBuilder.create().texOffs(235, 42).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointRF4 = hair_33.addOrReplaceChild("hair_jointRF4", CubeListBuilder.create().texOffs(194, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_34 = hair_jointRF4.addOrReplaceChild("hair_34", CubeListBuilder.create().texOffs(242, 43).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointRF5 = hair_34.addOrReplaceChild("hair_jointRF5", CubeListBuilder.create().texOffs(201, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_35 = hair_jointRF5.addOrReplaceChild("hair_35", CubeListBuilder.create().texOffs(120, 46).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointRF6 = hair_35.addOrReplaceChild("hair_jointRF6", CubeListBuilder.create().texOffs(205, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_36 = hair_jointRF6.addOrReplaceChild("hair_36", CubeListBuilder.create().texOffs(143, 46).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRF7 = hair_36.addOrReplaceChild("hair_jointRF7", CubeListBuilder.create().texOffs(213, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_37 = hair_jointRF7.addOrReplaceChild("hair_37", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRF8 = hair_37.addOrReplaceChild("hair_jointRF8", CubeListBuilder.create().texOffs(217, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_38 = hair_jointRF8.addOrReplaceChild("hair_38", CubeListBuilder.create().texOffs(20, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRF9 = hair_38.addOrReplaceChild("hair_jointRF9", CubeListBuilder.create().texOffs(225, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_39 = hair_jointRF9.addOrReplaceChild("hair_39", CubeListBuilder.create().texOffs(32, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRTRM = bodyr.addOrReplaceChild("hair_jointRTRM", CubeListBuilder.create().texOffs(125, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, -5.0f, 0.0f, 1.5707964f, 0.0f, 0.0f));
        PartDefinition hair_40 = hair_jointRTRM.addOrReplaceChild("hair_40", CubeListBuilder.create().texOffs(44, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRM1 = hair_40.addOrReplaceChild("hair_jointRM1", CubeListBuilder.create().texOffs(229, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_41 = hair_jointRM1.addOrReplaceChild("hair_41", CubeListBuilder.create().texOffs(56, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRM2 = hair_41.addOrReplaceChild("hair_jointRM2", CubeListBuilder.create().texOffs(237, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_42 = hair_jointRM2.addOrReplaceChild("hair_42", CubeListBuilder.create().texOffs(150, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointRM3 = hair_42.addOrReplaceChild("hair_jointRM3", CubeListBuilder.create().texOffs(241, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 5.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_43 = hair_jointRM3.addOrReplaceChild("hair_43", CubeListBuilder.create().texOffs(232, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointRM4 = hair_43.addOrReplaceChild("hair_jointRM4", CubeListBuilder.create().texOffs(249, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_44 = hair_jointRM4.addOrReplaceChild("hair_44", CubeListBuilder.create().texOffs(157, 49).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointRM5 = hair_44.addOrReplaceChild("hair_jointRM5", CubeListBuilder.create().texOffs(14, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_45 = hair_jointRM5.addOrReplaceChild("hair_45", CubeListBuilder.create().texOffs(239, 49).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointRM6 = hair_45.addOrReplaceChild("hair_jointRM6", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_46 = hair_jointRM6.addOrReplaceChild("hair_46", CubeListBuilder.create().texOffs(120, 52).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRM7 = hair_46.addOrReplaceChild("hair_jointRM7", CubeListBuilder.create().texOffs(7, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_47 = hair_jointRM7.addOrReplaceChild("hair_47", CubeListBuilder.create().texOffs(143, 52).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRM8 = hair_47.addOrReplaceChild("hair_jointRM8", CubeListBuilder.create().texOffs(11, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_48 = hair_jointRM8.addOrReplaceChild("hair_48", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRM9 = hair_48.addOrReplaceChild("hair_jointRM9", CubeListBuilder.create().texOffs(86, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_49 = hair_jointRM9.addOrReplaceChild("hair_49", CubeListBuilder.create().texOffs(20, 54).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRTRB = bodyr.addOrReplaceChild("hair_jointRTRB", CubeListBuilder.create().texOffs(129, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, -5.0f, -3.0f, 1.5707964f, 0.0f, 0.0f));
        PartDefinition hair_50 = hair_jointRTRB.addOrReplaceChild("hair_50", CubeListBuilder.create().texOffs(32, 54).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.17453292f, -0.17453292f, -0.2617994f));
        PartDefinition hair_jointRB1 = hair_50.addOrReplaceChild("hair_jointRB1", CubeListBuilder.create().texOffs(130, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_51 = hair_jointRB1.addOrReplaceChild("hair_51", CubeListBuilder.create().texOffs(44, 54).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRB2 = hair_51.addOrReplaceChild("hair_jointRB2", CubeListBuilder.create().texOffs(174, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_52 = hair_jointRB2.addOrReplaceChild("hair_52", CubeListBuilder.create().texOffs(56, 54).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointRB3 = hair_52.addOrReplaceChild("hair_jointRB3", CubeListBuilder.create().texOffs(14, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 5.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_53 = hair_jointRB3.addOrReplaceChild("hair_53", CubeListBuilder.create().texOffs(232, 54).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointRB4 = hair_53.addOrReplaceChild("hair_jointRB4", CubeListBuilder.create().texOffs(74, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_54 = hair_jointRB4.addOrReplaceChild("hair_54", CubeListBuilder.create().texOffs(156, 55).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointRB5 = hair_54.addOrReplaceChild("hair_jointRB5", CubeListBuilder.create().texOffs(78, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_55 = hair_jointRB5.addOrReplaceChild("hair_55", CubeListBuilder.create().texOffs(239, 55).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointRB6 = hair_55.addOrReplaceChild("hair_jointRB6", CubeListBuilder.create().texOffs(82, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_56 = hair_jointRB6.addOrReplaceChild("hair_56", CubeListBuilder.create().texOffs(36, 60).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRB7 = hair_56.addOrReplaceChild("hair_jointRB7", CubeListBuilder.create().texOffs(86, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_57 = hair_jointRB7.addOrReplaceChild("hair_57", CubeListBuilder.create().texOffs(48, 60).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRB8 = hair_57.addOrReplaceChild("hair_jointRB8", CubeListBuilder.create().texOffs(118, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_58 = hair_jointRB8.addOrReplaceChild("hair_58", CubeListBuilder.create().texOffs(60, 60).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRB9 = hair_58.addOrReplaceChild("hair_jointRB9", CubeListBuilder.create().texOffs(122, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_59 = hair_jointRB9.addOrReplaceChild("hair_59", CubeListBuilder.create().texOffs(185, 61).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition body_1 = mainbody.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(72, 28).addBox(-5.0f, -7.0f, -7.0f, 10, 25, 14), PartPose.offsetAndRotation(-10.0f, 10.0f, 0.0f, 0.0f, 0.0f, -0.34906584f));
        PartDefinition bodyu = mainbody.addOrReplaceChild("bodyu", CubeListBuilder.create().texOffs(170, 0).addBox(-4.0f, -0.5f, -4.0f, 8, 12, 8), PartPose.offsetAndRotation(0.0f, -9.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition dec = bodyu.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(120, 34).addBox(-2.0f, -4.0f, -2.0f, 4, 8, 4), PartPose.offsetAndRotation(0.0f, 6.4f, -4.5f, -0.57595867f, 0.0f, 0.0f));
        PartDefinition taclejoint1 = bodyu.addOrReplaceChild("taclejoint1", CubeListBuilder.create().texOffs(237, 31).addBox(-2.0f, 0.0f, -2.0f, 4, 1, 4), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tentacle = taclejoint1.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(120, 46).addBox(-2.5f, -2.5f, 0.0f, 5, 5, 13), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.5707964f, 0.7853982f, 0.0f));
        PartDefinition taclejoint2 = tentacle.addOrReplaceChild("taclejoint2", CubeListBuilder.create().texOffs(54, 4).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
        PartDefinition tentacle_1 = taclejoint2.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(210, 47).addBox(-2.0f, -2.0f, -1.0f, 4, 4, 14), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition taclejoint3 = tentacle_1.addOrReplaceChild("taclejoint3", CubeListBuilder.create().texOffs(81, 2).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
        PartDefinition tentacle_2 = taclejoint3.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(156, 47).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 14), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition taclejoint4 = tentacle_2.addOrReplaceChild("taclejoint4", CubeListBuilder.create().texOffs(74, 2).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 11.0f));
        PartDefinition tentacle_3 = taclejoint4.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 16), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition dec_3 = bodyu.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(152, 36).addBox(-2.0f, -4.0f, -2.0f, 4, 8, 4), PartPose.offsetAndRotation(-4.5f, 6.4f, 0.0f, 0.0f, 0.0f, 0.57595867f));
        PartDefinition dec_1 = bodyu.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(136, 34).addBox(-2.0f, -4.0f, -2.0f, 4, 8, 4), PartPose.offsetAndRotation(0.0f, 6.4f, 4.5f, 0.57595867f, 0.0f, 0.0f));
        PartDefinition dec_2 = bodyu.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(224, 35).addBox(-2.0f, -4.0f, -2.0f, 4, 8, 4), PartPose.offsetAndRotation(4.5f, 6.4f, 0.0f, 0.0f, 0.0f, -0.57595867f));
        PartDefinition bodyf = mainbody.addOrReplaceChild("bodyf", CubeListBuilder.create().texOffs(82, 0).addBox(-7.0f, -10.0f, -4.0f, 14, 20, 8), PartPose.offsetAndRotation(0.0f, 11.0f, -8.8f, 0.36651915f, 0.0f, 0.0f));
        PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(176, 22).addBox(-5.0f, -7.0f, -7.0f, 10, 25, 14), PartPose.offsetAndRotation(10.0f, 10.0f, 0.0f, 0.0f, 0.0f, 0.34906584f));
        PartDefinition bodyl = mainbody.addOrReplaceChild("bodyl", CubeListBuilder.create().texOffs(54, 0).addBox(-3.0f, -5.0f, -4.0f, 6, 8, 8), PartPose.offsetAndRotation(14.1f, 1.5f, 0.0f, 0.0f, 0.0f, 0.20943952f));
        PartDefinition hair_jointRTLF = bodyl.addOrReplaceChild("hair_jointRTLF", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, -5.0f, -3.0f, 1.5707964f, 0.0f, 0.0f));
        PartDefinition hair_20 = hair_jointRTLF.addOrReplaceChild("hair_20", CubeListBuilder.create().texOffs(243, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.17453292f, -0.17453292f, -0.2617994f));
        PartDefinition hair_jointLF1 = hair_20.addOrReplaceChild("hair_jointLF1", CubeListBuilder.create().texOffs(229, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_21 = hair_jointLF1.addOrReplaceChild("hair_21", CubeListBuilder.create().texOffs(106, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLF2 = hair_21.addOrReplaceChild("hair_jointLF2", CubeListBuilder.create().texOffs(237, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_22 = hair_jointLF2.addOrReplaceChild("hair_22", CubeListBuilder.create().texOffs(118, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointLF3 = hair_22.addOrReplaceChild("hair_jointLF3", CubeListBuilder.create().texOffs(241, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 5.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_23 = hair_jointLF3.addOrReplaceChild("hair_23", CubeListBuilder.create().texOffs(130, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointLF4 = hair_23.addOrReplaceChild("hair_jointLF4", CubeListBuilder.create().texOffs(249, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_24 = hair_jointLF4.addOrReplaceChild("hair_24", CubeListBuilder.create().texOffs(142, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointLF5 = hair_24.addOrReplaceChild("hair_jointLF5", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_25 = hair_jointLF5.addOrReplaceChild("hair_25", CubeListBuilder.create().texOffs(210, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointLF6 = hair_25.addOrReplaceChild("hair_jointLF6", CubeListBuilder.create().texOffs(7, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_26 = hair_jointLF6.addOrReplaceChild("hair_26", CubeListBuilder.create().texOffs(222, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLF7 = hair_26.addOrReplaceChild("hair_jointLF7", CubeListBuilder.create().texOffs(11, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_27 = hair_jointLF7.addOrReplaceChild("hair_27", CubeListBuilder.create().texOffs(72, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLF8 = hair_27.addOrReplaceChild("hair_jointLF8", CubeListBuilder.create().texOffs(54, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_28 = hair_jointLF8.addOrReplaceChild("hair_28", CubeListBuilder.create().texOffs(149, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLF9 = hair_28.addOrReplaceChild("hair_jointLF9", CubeListBuilder.create().texOffs(58, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_29 = hair_jointLF9.addOrReplaceChild("hair_29", CubeListBuilder.create().texOffs(229, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRTLB = bodyl.addOrReplaceChild("hair_jointRTLB", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, -5.0f, 3.0f, 1.5707964f, 0.0f, 0.0f));
        PartDefinition hair = hair_jointRTLB.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.17453292f, -0.17453292f, 0.2617994f));
        PartDefinition hair_jointLB1 = hair.addOrReplaceChild("hair_jointLB1", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_1 = hair_jointLB1.addOrReplaceChild("hair_1", CubeListBuilder.create().texOffs(118, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLB2 = hair_1.addOrReplaceChild("hair_jointLB2", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_2 = hair_jointLB2.addOrReplaceChild("hair_2", CubeListBuilder.create().texOffs(162, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointLB3 = hair_2.addOrReplaceChild("hair_jointLB3", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 5.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_3 = hair_jointLB3.addOrReplaceChild("hair_3", CubeListBuilder.create().texOffs(194, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointLB4 = hair_3.addOrReplaceChild("hair_jointLB4", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_4 = hair_jointLB4.addOrReplaceChild("hair_4", CubeListBuilder.create().texOffs(206, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointLB5 = hair_4.addOrReplaceChild("hair_jointLB5", CubeListBuilder.create().texOffs(81, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_5 = hair_jointLB5.addOrReplaceChild("hair_5", CubeListBuilder.create().texOffs(218, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointLB6 = hair_5.addOrReplaceChild("hair_jointLB6", CubeListBuilder.create().texOffs(85, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_6 = hair_jointLB6.addOrReplaceChild("hair_6", CubeListBuilder.create().texOffs(230, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLB7 = hair_6.addOrReplaceChild("hair_jointLB7", CubeListBuilder.create().texOffs(118, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_7 = hair_jointLB7.addOrReplaceChild("hair_7", CubeListBuilder.create().texOffs(242, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLB8 = hair_7.addOrReplaceChild("hair_jointLB8", CubeListBuilder.create().texOffs(125, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_8 = hair_jointLB8.addOrReplaceChild("hair_8", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLB9 = hair_8.addOrReplaceChild("hair_jointLB9", CubeListBuilder.create().texOffs(129, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_9 = hair_jointLB9.addOrReplaceChild("hair_9", CubeListBuilder.create().texOffs(230, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointRTLM = bodyl.addOrReplaceChild("hair_jointRTLM", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, -5.0f, 0.0f, 1.5707964f, 0.0f, 0.0f));
        PartDefinition hair_10 = hair_jointRTLM.addOrReplaceChild("hair_10", CubeListBuilder.create().texOffs(242, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLM1 = hair_10.addOrReplaceChild("hair_jointLM1", CubeListBuilder.create().texOffs(162, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_11 = hair_jointLM1.addOrReplaceChild("hair_11", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLM2 = hair_11.addOrReplaceChild("hair_jointLM2", CubeListBuilder.create().texOffs(169, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_12 = hair_jointLM2.addOrReplaceChild("hair_12", CubeListBuilder.create().texOffs(230, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointLM3 = hair_12.addOrReplaceChild("hair_jointLM3", CubeListBuilder.create().texOffs(173, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 5.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_13 = hair_jointLM3.addOrReplaceChild("hair_13", CubeListBuilder.create().texOffs(242, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointLM4 = hair_13.addOrReplaceChild("hair_jointLM4", CubeListBuilder.create().texOffs(194, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_14 = hair_jointLM4.addOrReplaceChild("hair_14", CubeListBuilder.create().texOffs(239, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointLM5 = hair_14.addOrReplaceChild("hair_jointLM5", CubeListBuilder.create().texOffs(201, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_15 = hair_jointLM5.addOrReplaceChild("hair_15", CubeListBuilder.create().texOffs(210, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.0f));
        PartDefinition hair_jointLM6 = hair_15.addOrReplaceChild("hair_jointLM6", CubeListBuilder.create().texOffs(205, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_16 = hair_jointLM6.addOrReplaceChild("hair_16", CubeListBuilder.create().texOffs(222, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLM7 = hair_16.addOrReplaceChild("hair_jointLM7", CubeListBuilder.create().texOffs(213, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_17 = hair_jointLM7.addOrReplaceChild("hair_17", CubeListBuilder.create().texOffs(72, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLM8 = hair_17.addOrReplaceChild("hair_jointLM8", CubeListBuilder.create().texOffs(217, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_18 = hair_jointLM8.addOrReplaceChild("hair_18", CubeListBuilder.create().texOffs(229, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition hair_jointLM9 = hair_18.addOrReplaceChild("hair_jointLM9", CubeListBuilder.create().texOffs(225, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 5.0f));
        PartDefinition hair_19 = hair_jointLM9.addOrReplaceChild("hair_19", CubeListBuilder.create().texOffs(236, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.0f));
        PartDefinition bodyb = mainbody.addOrReplaceChild("bodyb", CubeListBuilder.create().texOffs(126, 0).addBox(-7.0f, -10.0f, -4.0f, 14, 20, 8), PartPose.offsetAndRotation(0.0f, 11.0f, 8.8f, -0.36651915f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 256, 70);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityDropPod parasite = (EntityDropPod)entity;
        float f1 = Mth.cos((float)(ageInTicks * 0.1133f)) * 0.091f;
        float f2 = -1.0f * Mth.cos((float)(ageInTicks * 0.1f)) * 0.07f;
        float f3 = Mth.cos((float)(ageInTicks * 0.13f)) * 0.08f;
        byte i = parasite.getParasiteStatus();
        this.hair_jointLB1.yRot = f1;
        this.hair_jointLB2.yRot = f1;
        this.hair_jointLB3.yRot = f1;
        this.hair_jointLB4.yRot = f1;
        this.hair_jointLB5.yRot = f1;
        this.hair_jointLB7.yRot = f1;
        this.hair_jointLB9.yRot = f1;
        this.hair_jointRB1.yRot = f1;
        this.hair_jointRB2.yRot = f1;
        this.hair_jointRB3.yRot = f1;
        this.hair_jointRB4.yRot = f1;
        this.hair_jointRB5.yRot = f1;
        this.hair_jointRB7.yRot = f1;
        this.hair_jointRB9.yRot = f1;
        this.hair_jointLM1.yRot = f2;
        this.hair_jointLM2.yRot = f2;
        this.hair_jointLM3.yRot = f2;
        this.hair_jointLM4.yRot = f2;
        this.hair_jointLM5.yRot = f2;
        this.hair_jointLM7.yRot = f2;
        this.hair_jointLM9.yRot = f2;
        this.hair_jointRM1.yRot = f2;
        this.hair_jointRM2.yRot = f2;
        this.hair_jointRM3.yRot = f2;
        this.hair_jointRM4.yRot = f2;
        this.hair_jointRM5.yRot = f2;
        this.hair_jointRM7.yRot = f2;
        this.hair_jointRM9.yRot = f2;
        this.hair_jointLF1.yRot = f3;
        this.hair_jointLF2.yRot = f3;
        this.hair_jointLF3.yRot = f3;
        this.hair_jointLF4.yRot = f3;
        this.hair_jointLF5.yRot = f3;
        this.hair_jointLF7.yRot = f3;
        this.hair_jointLF9.yRot = f3;
        this.hair_jointRF1.yRot = f3;
        this.hair_jointRF2.yRot = f3;
        this.hair_jointRF3.yRot = f3;
        this.hair_jointRF4.yRot = f3;
        this.hair_jointRF5.yRot = f3;
        this.hair_jointRF7.yRot = f3;
        this.hair_jointRF9.yRot = f3;
        f1 = 0.3f * Mth.sin((float)(ageInTicks * 0.19f)) * 0.211f;
        f2 = 0.6f * Mth.sin((float)(ageInTicks * 0.21f)) * 0.19f;
        this.taclejoint1.xRot = f1;
        this.taclejoint2.xRot = f1;
        this.taclejoint3.xRot = f1;
        this.taclejoint4.xRot = f1;
        this.taclejoint1.yRot = f2;
        this.taclejoint2.yRot = f2;
        this.taclejoint3.yRot = f2;
        this.taclejoint4.yRot = f2;
        this.taclejoint1.zRot = f2 = 0.9f * Mth.sin((float)(ageInTicks * 0.2f)) * 0.2f;
        if (i == 0) {
            f1 = 0.3f * Mth.sin((float)(ageInTicks * 1.29f)) * 0.111f;
            f2 = 0.6f * Mth.sin((float)(ageInTicks * 1.31f)) * 0.09f;
            this.mainbody.x = 0.0f;
            this.mainbody.z = 0.0f;
        } else if (i == 1) {
            this.mainbody.x = f1;
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
