package com.dhanantry.scapeandrunparasites.client.model.entity.crude;

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
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityInhooM;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelInhooM extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "inhoom"), "main");
    private final ModelPart mainbody;
    private final ModelPart bodym;
    private final ModelPart jointLLX;
    private final ModelPart jointRLX;
    private final ModelPart jointT;
    private final ModelPart body;
    private final ModelPart body_1;
    private final ModelPart body_2;
    private final ModelPart body_3;
    private final ModelPart jointN;
    private final ModelPart bodyl;
    private final ModelPart bodymm;
    private final ModelPart bodyuuuuuuuu;
    private final ModelPart hair_jointM0;
    private final ModelPart jointRMB;
    private final ModelPart jointLMB;
    private final ModelPart dec;
    private final ModelPart jointH;
    private final ModelPart body_4;
    private final ModelPart body_5;
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
    private final ModelPart body_6;
    private final ModelPart dec_13;
    private final ModelPart dec_14;
    private final ModelPart dec_15;
    private final ModelPart dec_16;
    private final ModelPart body_7;
    private final ModelPart dec_17;
    private final ModelPart dec_18;
    private final ModelPart dec_19;
    private final ModelPart dec_20;
    private final ModelPart dec_21;
    private final ModelPart dec_22;
    private final ModelPart dec_23;
    private final ModelPart dec_24;
    private final ModelPart dec_25;
    private final ModelPart dec_26;
    private final ModelPart dec_27;
    private final ModelPart dec_28;
    private final ModelPart hair;
    private final ModelPart hair_jointM1;
    private final ModelPart hair_1;
    private final ModelPart hair_jointM2;
    private final ModelPart hair_2;
    private final ModelPart hair_jointM3;
    private final ModelPart hair_3;
    private final ModelPart hair_jointM4;
    private final ModelPart hair_4;
    private final ModelPart hair_jointM5;
    private final ModelPart hair_5;
    private final ModelPart hair_jointM6;
    private final ModelPart hair_6;
    private final ModelPart hair_jointM7;
    private final ModelPart hair_7;
    private final ModelPart decmL;
    private final ModelPart jointRM;
    private final ModelPart bodylll;
    private final ModelPart decrrr;
    private final ModelPart decllll;
    private final ModelPart body_8;
    private final ModelPart dec_29;
    private final ModelPart dec_30;
    private final ModelPart bodya;
    private final ModelPart jointRRX;
    private final ModelPart jointRAX;
    private final ModelPart JD;
    private final ModelPart jointRAY;
    private final ModelPart leg;
    private final ModelPart jointRA1;
    private final ModelPart leg_1;
    private final ModelPart joint;
    private final ModelPart leg_2;
    private final ModelPart jointRAC2;
    private final ModelPart jointRAC1;
    private final ModelPart body_9;
    private final ModelPart body_10;
    private final ModelPart body_11;
    private final ModelPart body_12;
    private final ModelPart JD_1;
    private final ModelPart jointRRY;
    private final ModelPart leg_3;
    private final ModelPart jointRR1;
    private final ModelPart leg_4;
    private final ModelPart decu;
    private final ModelPart dec_31;
    private final ModelPart dec_32;
    private final ModelPart dec_33;
    private final ModelPart decmR;
    private final ModelPart jointLM;
    private final ModelPart bodyrrr;
    private final ModelPart dec11111;
    private final ModelPart dec33333;
    private final ModelPart body_13;
    private final ModelPart dec_34;
    private final ModelPart dec_35;
    private final ModelPart bodya_1;
    private final ModelPart jointLRX;
    private final ModelPart jointLAX;
    private final ModelPart JD_2;
    private final ModelPart jointLAY;
    private final ModelPart leg_5;
    private final ModelPart jointLA1;
    private final ModelPart leg_6;
    private final ModelPart joint_1;
    private final ModelPart leg_7;
    private final ModelPart jointLAC2;
    private final ModelPart jointLAC1;
    private final ModelPart body_14;
    private final ModelPart body_15;
    private final ModelPart body_16;
    private final ModelPart body_17;
    private final ModelPart JD_3;
    private final ModelPart jointLRY;
    private final ModelPart leg_8;
    private final ModelPart jointLR1;
    private final ModelPart leg_9;
    private final ModelPart decu222;
    private final ModelPart dec_36;
    private final ModelPart dec_37;
    private final ModelPart dec_38;
    private final ModelPart JD_4;
    private final ModelPart jointLLY;
    private final ModelPart leg_10;
    private final ModelPart jointLL1;
    private final ModelPart leg_11;
    private final ModelPart joint_2;
    private final ModelPart leg_12;
    private final ModelPart jointLLC2;
    private final ModelPart jointLLC1;
    private final ModelPart body_18;
    private final ModelPart body_19;
    private final ModelPart body_20;
    private final ModelPart body_21;
    private final ModelPart JD_5;
    private final ModelPart jointRLY;
    private final ModelPart leg_13;
    private final ModelPart jointRL1;
    private final ModelPart leg_14;
    private final ModelPart joint_3;
    private final ModelPart leg_15;
    private final ModelPart jointRLC2;
    private final ModelPart jointRLC1;
    private final ModelPart body_22;
    private final ModelPart body_23;
    private final ModelPart body_24;
    private final ModelPart body_25;

    public ModelInhooM(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.bodym = root.getChild("mainbody").getChild("bodym");
        this.jointLLX = root.getChild("mainbody").getChild("jointLLX");
        this.jointRLX = root.getChild("mainbody").getChild("jointRLX");
        this.jointT = root.getChild("mainbody").getChild("bodym").getChild("jointT");
        this.body = root.getChild("mainbody").getChild("bodym").getChild("body");
        this.body_1 = root.getChild("mainbody").getChild("bodym").getChild("body_1");
        this.body_2 = root.getChild("mainbody").getChild("bodym").getChild("body_2");
        this.body_3 = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_3");
        this.jointN = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN");
        this.bodyl = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl");
        this.bodymm = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm");
        this.bodyuuuuuuuu = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu");
        this.hair_jointM0 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0");
        this.jointRMB = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB");
        this.jointLMB = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB");
        this.dec = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("dec");
        this.jointH = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH");
        this.body_4 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4");
        this.body_5 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5");
        this.dec_1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("dec_1");
        this.dec_2 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("dec_2");
        this.dec_3 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("dec_3");
        this.dec_4 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("dec_4");
        this.dec_5 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("dec_5");
        this.dec_6 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("dec_6");
        this.dec_7 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("dec_7");
        this.dec_8 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("dec_8");
        this.dec_9 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("dec_9");
        this.dec_10 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("dec_10");
        this.dec_11 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("dec_11");
        this.dec_12 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("dec_12");
        this.body_6 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6");
        this.dec_13 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("dec_13");
        this.dec_14 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("dec_14");
        this.dec_15 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("dec_15");
        this.dec_16 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("dec_16");
        this.body_7 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("body_7");
        this.dec_17 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("dec_17");
        this.dec_18 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("dec_18");
        this.dec_19 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("dec_19");
        this.dec_20 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("dec_20");
        this.dec_21 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("dec_21");
        this.dec_22 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("dec_22");
        this.dec_23 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("dec_23");
        this.dec_24 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("dec_24");
        this.dec_25 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("body_7").getChild("dec_25");
        this.dec_26 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("body_7").getChild("dec_26");
        this.dec_27 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("body_7").getChild("dec_27");
        this.dec_28 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("bodyuuuuuuuu").getChild("jointH").getChild("body_4").getChild("body_5").getChild("body_6").getChild("body_7").getChild("dec_28");
        this.hair = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair");
        this.hair_jointM1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1");
        this.hair_1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1");
        this.hair_jointM2 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1").getChild("hair_jointM2");
        this.hair_2 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1").getChild("hair_jointM2").getChild("hair_2");
        this.hair_jointM3 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1").getChild("hair_jointM2").getChild("hair_2").getChild("hair_jointM3");
        this.hair_3 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1").getChild("hair_jointM2").getChild("hair_2").getChild("hair_jointM3").getChild("hair_3");
        this.hair_jointM4 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1").getChild("hair_jointM2").getChild("hair_2").getChild("hair_jointM3").getChild("hair_3").getChild("hair_jointM4");
        this.hair_4 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1").getChild("hair_jointM2").getChild("hair_2").getChild("hair_jointM3").getChild("hair_3").getChild("hair_jointM4").getChild("hair_4");
        this.hair_jointM5 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1").getChild("hair_jointM2").getChild("hair_2").getChild("hair_jointM3").getChild("hair_3").getChild("hair_jointM4").getChild("hair_4").getChild("hair_jointM5");
        this.hair_5 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1").getChild("hair_jointM2").getChild("hair_2").getChild("hair_jointM3").getChild("hair_3").getChild("hair_jointM4").getChild("hair_4").getChild("hair_jointM5").getChild("hair_5");
        this.hair_jointM6 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1").getChild("hair_jointM2").getChild("hair_2").getChild("hair_jointM3").getChild("hair_3").getChild("hair_jointM4").getChild("hair_4").getChild("hair_jointM5").getChild("hair_5").getChild("hair_jointM6");
        this.hair_6 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1").getChild("hair_jointM2").getChild("hair_2").getChild("hair_jointM3").getChild("hair_3").getChild("hair_jointM4").getChild("hair_4").getChild("hair_jointM5").getChild("hair_5").getChild("hair_jointM6").getChild("hair_6");
        this.hair_jointM7 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1").getChild("hair_jointM2").getChild("hair_2").getChild("hair_jointM3").getChild("hair_3").getChild("hair_jointM4").getChild("hair_4").getChild("hair_jointM5").getChild("hair_5").getChild("hair_jointM6").getChild("hair_6").getChild("hair_jointM7");
        this.hair_7 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("hair_jointM0").getChild("hair").getChild("hair_jointM1").getChild("hair_1").getChild("hair_jointM2").getChild("hair_2").getChild("hair_jointM3").getChild("hair_3").getChild("hair_jointM4").getChild("hair_4").getChild("hair_jointM5").getChild("hair_5").getChild("hair_jointM6").getChild("hair_6").getChild("hair_jointM7").getChild("hair_7");
        this.decmL = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL");
        this.jointRM = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("jointRM");
        this.bodylll = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll");
        this.decrrr = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("decrrr");
        this.decllll = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("decllll");
        this.body_8 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("jointRM").getChild("body_8");
        this.dec_29 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("jointRM").getChild("body_8").getChild("dec_29");
        this.dec_30 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("jointRM").getChild("body_8").getChild("dec_30");
        this.bodya = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya");
        this.jointRRX = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("jointRRX");
        this.jointRAX = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX");
        this.JD = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD");
        this.jointRAY = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD").getChild("jointRAY");
        this.leg = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD").getChild("jointRAY").getChild("leg");
        this.jointRA1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD").getChild("jointRAY").getChild("leg").getChild("jointRA1");
        this.leg_1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD").getChild("jointRAY").getChild("leg").getChild("jointRA1").getChild("leg_1");
        this.joint = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD").getChild("jointRAY").getChild("leg").getChild("jointRA1").getChild("leg_1").getChild("joint");
        this.leg_2 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD").getChild("jointRAY").getChild("leg").getChild("jointRA1").getChild("leg_1").getChild("joint").getChild("leg_2");
        this.jointRAC2 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD").getChild("jointRAY").getChild("leg").getChild("jointRA1").getChild("leg_1").getChild("joint").getChild("leg_2").getChild("jointRAC2");
        this.jointRAC1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD").getChild("jointRAY").getChild("leg").getChild("jointRA1").getChild("leg_1").getChild("joint").getChild("leg_2").getChild("jointRAC1");
        this.body_9 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD").getChild("jointRAY").getChild("leg").getChild("jointRA1").getChild("leg_1").getChild("joint").getChild("leg_2").getChild("jointRAC2").getChild("body_9");
        this.body_10 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD").getChild("jointRAY").getChild("leg").getChild("jointRA1").getChild("leg_1").getChild("joint").getChild("leg_2").getChild("jointRAC2").getChild("body_9").getChild("body_10");
        this.body_11 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD").getChild("jointRAY").getChild("leg").getChild("jointRA1").getChild("leg_1").getChild("joint").getChild("leg_2").getChild("jointRAC1").getChild("body_11");
        this.body_12 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("bodya").getChild("jointRAX").getChild("JD").getChild("jointRAY").getChild("leg").getChild("jointRA1").getChild("leg_1").getChild("joint").getChild("leg_2").getChild("jointRAC1").getChild("body_11").getChild("body_12");
        this.JD_1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("jointRRX").getChild("JD_1");
        this.jointRRY = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("jointRRX").getChild("JD_1").getChild("jointRRY");
        this.leg_3 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("jointRRX").getChild("JD_1").getChild("jointRRY").getChild("leg_3");
        this.jointRR1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("jointRRX").getChild("JD_1").getChild("jointRRY").getChild("leg_3").getChild("jointRR1");
        this.leg_4 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("bodylll").getChild("jointRRX").getChild("JD_1").getChild("jointRRY").getChild("leg_3").getChild("jointRR1").getChild("leg_4");
        this.decu = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("decrrr").getChild("decu");
        this.dec_31 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("decrrr").getChild("decu").getChild("dec_31");
        this.dec_32 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("decllll").getChild("dec_32");
        this.dec_33 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointRMB").getChild("decmL").getChild("decllll").getChild("dec_32").getChild("dec_33");
        this.decmR = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR");
        this.jointLM = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("jointLM");
        this.bodyrrr = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr");
        this.dec11111 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("dec11111");
        this.dec33333 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("dec33333");
        this.body_13 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("jointLM").getChild("body_13");
        this.dec_34 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("jointLM").getChild("body_13").getChild("dec_34");
        this.dec_35 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("jointLM").getChild("body_13").getChild("dec_35");
        this.bodya_1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1");
        this.jointLRX = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("jointLRX");
        this.jointLAX = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX");
        this.JD_2 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2");
        this.jointLAY = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2").getChild("jointLAY");
        this.leg_5 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2").getChild("jointLAY").getChild("leg_5");
        this.jointLA1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2").getChild("jointLAY").getChild("leg_5").getChild("jointLA1");
        this.leg_6 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2").getChild("jointLAY").getChild("leg_5").getChild("jointLA1").getChild("leg_6");
        this.joint_1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2").getChild("jointLAY").getChild("leg_5").getChild("jointLA1").getChild("leg_6").getChild("joint_1");
        this.leg_7 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2").getChild("jointLAY").getChild("leg_5").getChild("jointLA1").getChild("leg_6").getChild("joint_1").getChild("leg_7");
        this.jointLAC2 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2").getChild("jointLAY").getChild("leg_5").getChild("jointLA1").getChild("leg_6").getChild("joint_1").getChild("leg_7").getChild("jointLAC2");
        this.jointLAC1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2").getChild("jointLAY").getChild("leg_5").getChild("jointLA1").getChild("leg_6").getChild("joint_1").getChild("leg_7").getChild("jointLAC1");
        this.body_14 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2").getChild("jointLAY").getChild("leg_5").getChild("jointLA1").getChild("leg_6").getChild("joint_1").getChild("leg_7").getChild("jointLAC2").getChild("body_14");
        this.body_15 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2").getChild("jointLAY").getChild("leg_5").getChild("jointLA1").getChild("leg_6").getChild("joint_1").getChild("leg_7").getChild("jointLAC2").getChild("body_14").getChild("body_15");
        this.body_16 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2").getChild("jointLAY").getChild("leg_5").getChild("jointLA1").getChild("leg_6").getChild("joint_1").getChild("leg_7").getChild("jointLAC1").getChild("body_16");
        this.body_17 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("bodya_1").getChild("jointLAX").getChild("JD_2").getChild("jointLAY").getChild("leg_5").getChild("jointLA1").getChild("leg_6").getChild("joint_1").getChild("leg_7").getChild("jointLAC1").getChild("body_16").getChild("body_17");
        this.JD_3 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("jointLRX").getChild("JD_3");
        this.jointLRY = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("jointLRX").getChild("JD_3").getChild("jointLRY");
        this.leg_8 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("jointLRX").getChild("JD_3").getChild("jointLRY").getChild("leg_8");
        this.jointLR1 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("jointLRX").getChild("JD_3").getChild("jointLRY").getChild("leg_8").getChild("jointLR1");
        this.leg_9 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("bodyrrr").getChild("jointLRX").getChild("JD_3").getChild("jointLRY").getChild("leg_8").getChild("jointLR1").getChild("leg_9");
        this.decu222 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("dec11111").getChild("decu222");
        this.dec_36 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("dec11111").getChild("decu222").getChild("dec_36");
        this.dec_37 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("dec33333").getChild("dec_37");
        this.dec_38 = root.getChild("mainbody").getChild("bodym").getChild("body").getChild("jointN").getChild("bodyl").getChild("bodymm").getChild("jointLMB").getChild("decmR").getChild("dec33333").getChild("dec_37").getChild("dec_38");
        this.JD_4 = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4");
        this.jointLLY = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4").getChild("jointLLY");
        this.leg_10 = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4").getChild("jointLLY").getChild("leg_10");
        this.jointLL1 = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4").getChild("jointLLY").getChild("leg_10").getChild("jointLL1");
        this.leg_11 = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4").getChild("jointLLY").getChild("leg_10").getChild("jointLL1").getChild("leg_11");
        this.joint_2 = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4").getChild("jointLLY").getChild("leg_10").getChild("jointLL1").getChild("leg_11").getChild("joint_2");
        this.leg_12 = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4").getChild("jointLLY").getChild("leg_10").getChild("jointLL1").getChild("leg_11").getChild("joint_2").getChild("leg_12");
        this.jointLLC2 = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4").getChild("jointLLY").getChild("leg_10").getChild("jointLL1").getChild("leg_11").getChild("joint_2").getChild("leg_12").getChild("jointLLC2");
        this.jointLLC1 = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4").getChild("jointLLY").getChild("leg_10").getChild("jointLL1").getChild("leg_11").getChild("joint_2").getChild("leg_12").getChild("jointLLC1");
        this.body_18 = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4").getChild("jointLLY").getChild("leg_10").getChild("jointLL1").getChild("leg_11").getChild("joint_2").getChild("leg_12").getChild("jointLLC2").getChild("body_18");
        this.body_19 = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4").getChild("jointLLY").getChild("leg_10").getChild("jointLL1").getChild("leg_11").getChild("joint_2").getChild("leg_12").getChild("jointLLC2").getChild("body_18").getChild("body_19");
        this.body_20 = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4").getChild("jointLLY").getChild("leg_10").getChild("jointLL1").getChild("leg_11").getChild("joint_2").getChild("leg_12").getChild("jointLLC1").getChild("body_20");
        this.body_21 = root.getChild("mainbody").getChild("jointLLX").getChild("JD_4").getChild("jointLLY").getChild("leg_10").getChild("jointLL1").getChild("leg_11").getChild("joint_2").getChild("leg_12").getChild("jointLLC1").getChild("body_20").getChild("body_21");
        this.JD_5 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5");
        this.jointRLY = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5").getChild("jointRLY");
        this.leg_13 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5").getChild("jointRLY").getChild("leg_13");
        this.jointRL1 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5").getChild("jointRLY").getChild("leg_13").getChild("jointRL1");
        this.leg_14 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5").getChild("jointRLY").getChild("leg_13").getChild("jointRL1").getChild("leg_14");
        this.joint_3 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5").getChild("jointRLY").getChild("leg_13").getChild("jointRL1").getChild("leg_14").getChild("joint_3");
        this.leg_15 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5").getChild("jointRLY").getChild("leg_13").getChild("jointRL1").getChild("leg_14").getChild("joint_3").getChild("leg_15");
        this.jointRLC2 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5").getChild("jointRLY").getChild("leg_13").getChild("jointRL1").getChild("leg_14").getChild("joint_3").getChild("leg_15").getChild("jointRLC2");
        this.jointRLC1 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5").getChild("jointRLY").getChild("leg_13").getChild("jointRL1").getChild("leg_14").getChild("joint_3").getChild("leg_15").getChild("jointRLC1");
        this.body_22 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5").getChild("jointRLY").getChild("leg_13").getChild("jointRL1").getChild("leg_14").getChild("joint_3").getChild("leg_15").getChild("jointRLC2").getChild("body_22");
        this.body_23 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5").getChild("jointRLY").getChild("leg_13").getChild("jointRL1").getChild("leg_14").getChild("joint_3").getChild("leg_15").getChild("jointRLC2").getChild("body_22").getChild("body_23");
        this.body_24 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5").getChild("jointRLY").getChild("leg_13").getChild("jointRL1").getChild("leg_14").getChild("joint_3").getChild("leg_15").getChild("jointRLC1").getChild("body_24");
        this.body_25 = root.getChild("mainbody").getChild("jointRLX").getChild("JD_5").getChild("jointRLY").getChild("leg_13").getChild("jointRL1").getChild("leg_14").getChild("joint_3").getChild("leg_15").getChild("jointRLC1").getChild("body_24").getChild("body_25");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 23.0f, -1.3f));
        PartDefinition jointLLX = mainbody.addOrReplaceChild("jointLLX", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(5.0f, -1.5f, -1.0f));
        PartDefinition JD_4 = jointLLX.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(22, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.443461f, 0.0f));
        PartDefinition jointLLY = JD_4.addOrReplaceChild("jointLLY", CubeListBuilder.create().texOffs(91, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_10 = jointLLY.addOrReplaceChild("leg_10", CubeListBuilder.create().texOffs(94, 47).addBox(-5.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.012291f));
        PartDefinition jointLL1 = leg_10.addOrReplaceChild("jointLL1", CubeListBuilder.create().texOffs(120, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-5.2f, 0.2f, 0.0f));
        PartDefinition leg_11 = jointLL1.addOrReplaceChild("leg_11", CubeListBuilder.create().texOffs(75, 47).addBox(-4.5f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9424778f));
        PartDefinition joint_2 = leg_11.addOrReplaceChild("joint_2", CubeListBuilder.create().texOffs(123, 30).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_12 = joint_2.addOrReplaceChild("leg_12", CubeListBuilder.create().texOffs(108, 48).addBox(-4.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(-5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.2915436f));
        PartDefinition jointLLC1 = leg_12.addOrReplaceChild("jointLLC1", CubeListBuilder.create().texOffs(120, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.4f, 0.7f, -0.5f));
        PartDefinition body_20 = jointLLC1.addOrReplaceChild("body_20", CubeListBuilder.create().texOffs(25, 48).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 1.5707964f, 0.0f, 0.27925268f));
        PartDefinition body_21 = body_20.addOrReplaceChild("body_21", CubeListBuilder.create().texOffs(117, 48).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 3), PartPose.offsetAndRotation(-0.6f, 0.0f, -2.4f, 0.0f, -2.3561945f, 0.0f));
        PartDefinition jointLLC2 = leg_12.addOrReplaceChild("jointLLC2", CubeListBuilder.create().texOffs(54, 31).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.8f, 0.7f, -0.5f));
        PartDefinition body_18 = jointLLC2.addOrReplaceChild("body_18", CubeListBuilder.create().texOffs(42, 44).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 1.5707964f, 0.0f, 0.62831855f));
        PartDefinition body_19 = body_18.addOrReplaceChild("body_19", CubeListBuilder.create().texOffs(19, 48).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 4), PartPose.offsetAndRotation(-0.6f, 0.0f, -2.0f, 0.0f, -2.0943952f, 0.0f));
        PartDefinition bodym = mainbody.addOrReplaceChild("bodym", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5f, -2.0f, -6.5f, 9, 4, 13), PartPose.offsetAndRotation(0.0f, -0.5f, 0.0f, (float)Math.PI, 0.0f, 0.0f));
        PartDefinition body_1 = bodym.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(51, 0).addBox(-2.5f, -2.5f, -2.5f, 5, 3, 4), PartPose.offsetAndRotation(5.0f, 0.6f, 1.7f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition body = bodym.addOrReplaceChild("body", CubeListBuilder.create().texOffs(31, 0).addBox(-3.0f, -1.5f, -2.5f, 6, 3, 8), PartPose.offsetAndRotation(0.0f, 2.5f, -1.3f, -0.17453292f, 0.0f, 0.0f));
        PartDefinition jointN = body.addOrReplaceChild("jointN", CubeListBuilder.create().texOffs(68, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 2.0f, 2.8f));
        PartDefinition bodyl = jointN.addOrReplaceChild("bodyl", CubeListBuilder.create().texOffs(67, 8).addBox(-1.5f, -1.0f, -3.5f, 3, 8, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.2617994f, 0.0f, 0.0f));
        PartDefinition bodymm = bodyl.addOrReplaceChild("bodymm", CubeListBuilder.create().texOffs(83, 8).addBox(-1.5f, -0.1f, -3.5f, 3, 12, 5), PartPose.offsetAndRotation(0.0f, 6.6f, -0.1f, 0.36651915f, 0.0f, 0.0f));
        PartDefinition jointLMB = bodymm.addOrReplaceChild("jointLMB", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.0f, 7.0f, 0.0f));
        PartDefinition decmR = jointLMB.addOrReplaceChild("decmR", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5f, -2.5f, -1.0f, 8, 13, 2), PartPose.offsetAndRotation(-1.0f, 3.0f, 0.0f, 0.0f, -0.34906584f, (float)(-Math.PI)));
        PartDefinition jointLM = decmR.addOrReplaceChild("jointLM", CubeListBuilder.create().texOffs(38, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 3.5f, 1.0f));
        PartDefinition body_13 = jointLM.addOrReplaceChild("body_13", CubeListBuilder.create().texOffs(61, 34).addBox(-1.0f, -6.0f, -1.0f, 4, 12, 3), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.0f, -0.7679449f, (float)Math.PI));
        PartDefinition dec_34 = body_13.addOrReplaceChild("dec_34", CubeListBuilder.create().texOffs(16, 33).addBox(0.0f, -5.5f, -1.0f, 3, 11, 2), PartPose.offset(2.8f, 0.0f, 0.8f));
        PartDefinition dec_35 = body_13.addOrReplaceChild("dec_35", CubeListBuilder.create().texOffs(86, 33).addBox(0.0f, -5.5f, -1.0f, 3, 11, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 1.2f, 0.0f, -0.7853982f, 0.0f));
        PartDefinition dec33333 = decmR.addOrReplaceChild("dec33333", CubeListBuilder.create().texOffs(110, 10).addBox(-0.5f, -1.5f, -1.0f, 6, 3, 2), PartPose.offsetAndRotation(0.0f, 11.5f, 0.4f, 0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_37 = dec33333.addOrReplaceChild("dec_37", CubeListBuilder.create().texOffs(44, 11).addBox(-0.5f, -1.5f, -1.0f, 3, 3, 2), PartPose.offsetAndRotation(1.2f, 2.7f, 0.4f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition dec_38 = dec_37.addOrReplaceChild("dec_38", CubeListBuilder.create().texOffs(84, 46).addBox(0.0f, -0.5f, -1.0f, 2, 1, 3), PartPose.offsetAndRotation(0.3f, 0.2f, 1.4f, 0.4886922f, 0.0f, 0.0f));
        PartDefinition bodyrrr = decmR.addOrReplaceChild("bodyrrr", CubeListBuilder.create().texOffs(0, 36).addBox(-3.0f, -1.0f, -1.0f, 6, 11, 2), PartPose.offset(4.0f, -0.5f, -1.5f));
        PartDefinition bodya_1 = bodyrrr.addOrReplaceChild("bodya_1", CubeListBuilder.create().texOffs(26, 36).addBox(-2.0f, -2.5f, -1.5f, 4, 4, 3), PartPose.offsetAndRotation(0.4f, 2.3f, -2.2f, 0.0f, 0.0f, 0.54105204f));
        PartDefinition jointLAX = bodya_1.addOrReplaceChild("jointLAX", CubeListBuilder.create().texOffs(123, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, -0.5f, -0.5f));
        PartDefinition JD_2 = jointLAX.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(62, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.6703537f, 0.0f));
        PartDefinition jointLAY = JD_2.addOrReplaceChild("jointLAY", CubeListBuilder.create().texOffs(121, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_5 = jointLAY.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(108, 36).addBox(-5.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.2217305f));
        PartDefinition jointLA1 = leg_5.addOrReplaceChild("jointLA1", CubeListBuilder.create().texOffs(76, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-5.2f, -0.2f, 0.0f));
        PartDefinition leg_6 = jointLA1.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(37, 37).addBox(-4.5f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.1693707f));
        PartDefinition joint_1 = leg_6.addOrReplaceChild("joint_1", CubeListBuilder.create().texOffs(123, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_7 = joint_1.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(40, 39).addBox(-5.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(-5.0f, 0.0f, 0.0f, (float)Math.PI, 0.0f, -1.2915436f));
        PartDefinition jointLAC1 = leg_7.addOrReplaceChild("jointLAC1", CubeListBuilder.create().texOffs(107, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.4f, 0.7f, -0.5f));
        PartDefinition body_16 = jointLAC1.addOrReplaceChild("body_16", CubeListBuilder.create().texOffs(75, 38).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 1.5707964f, 0.0f, 0.27925268f));
        PartDefinition body_17 = body_16.addOrReplaceChild("body_17", CubeListBuilder.create().texOffs(96, 38).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 3), PartPose.offsetAndRotation(-0.6f, 0.0f, -2.4f, 0.0f, -2.3561945f, 0.0f));
        PartDefinition jointLAC2 = leg_7.addOrReplaceChild("jointLAC2", CubeListBuilder.create().texOffs(79, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.8f, 0.7f, -0.5f));
        PartDefinition body_14 = jointLAC2.addOrReplaceChild("body_14", CubeListBuilder.create().texOffs(119, 37).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 1.5707964f, 0.0f, 0.62831855f));
        PartDefinition body_15 = body_14.addOrReplaceChild("body_15", CubeListBuilder.create().texOffs(50, 37).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 4), PartPose.offsetAndRotation(-0.6f, 0.0f, -2.0f, 0.0f, -2.0943952f, 0.0f));
        PartDefinition jointLRX = bodyrrr.addOrReplaceChild("jointLRX", CubeListBuilder.create().texOffs(63, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.6f, 8.4f, -0.8f));
        PartDefinition JD_3 = jointLRX.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(118, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.82030475f, -2.0943952f, 0.6806784f));
        PartDefinition jointLRY = JD_3.addOrReplaceChild("jointLRY", CubeListBuilder.create().texOffs(122, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_8 = jointLRY.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(104, 40).addBox(-7.0f, -0.5f, -0.5f, 7, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9599311f));
        PartDefinition jointLR1 = leg_8.addOrReplaceChild("jointLR1", CubeListBuilder.create().texOffs(20, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-7.0f, 0.0f, 0.0f));
        PartDefinition leg_9 = jointLR1.addOrReplaceChild("leg_9", CubeListBuilder.create().texOffs(39, 42).addBox(-10.0f, -0.5f, -0.5f, 10, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.8849556f));
        PartDefinition dec11111 = decmR.addOrReplaceChild("dec11111", CubeListBuilder.create().texOffs(62, 21).addBox(-0.5f, -1.5f, -1.0f, 6, 3, 2), PartPose.offsetAndRotation(0.3f, -3.2f, 1.0f, -0.57595867f, 0.0f, 0.0f));
        PartDefinition decu222 = dec11111.addOrReplaceChild("decu222", CubeListBuilder.create().texOffs(113, 19).addBox(-1.5f, -1.0f, -1.0f, 3, 2, 2), PartPose.offsetAndRotation(2.0f, -1.9f, 0.4f, -0.41887903f, 0.0f, 0.0f));
        PartDefinition dec_36 = decu222.addOrReplaceChild("dec_36", CubeListBuilder.create().texOffs(20, 22).addBox(0.0f, -0.5f, -1.0f, 2, 1, 2), PartPose.offset(-1.0f, 0.0f, 1.8f));
        PartDefinition bodyuuuuuuuu = bodymm.addOrReplaceChild("bodyuuuuuuuu", CubeListBuilder.create().texOffs(99, 13).addBox(-1.5f, -0.1f, -2.5f, 3, 6, 4), PartPose.offsetAndRotation(0.0f, 11.0f, -0.3f, 0.75049156f, 0.0f, 0.0f));
        PartDefinition jointH = bodyuuuuuuuu.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 6.5f, -0.4f));
        PartDefinition body_4 = jointH.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(111, 0).addBox(-1.0f, -1.0f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.10471976f, 0.0f, 0.0f));
        PartDefinition dec_3 = body_4.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(69, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-1.0f, 3.0f, 0.0f, 0.0f, 0.0f, 1.1170107f));
        PartDefinition dec_7 = body_4.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(117, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 3.0f, -0.7f, 1.1170107f, 0.0f, 0.0f));
        PartDefinition body_5 = body_4.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(119, 0).addBox(-1.0f, -0.1f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(0.0f, 3.6f, 0.1f, -0.5235988f, 0.0f, 0.0f));
        PartDefinition dec_16 = body_5.addOrReplaceChild("dec_16", CubeListBuilder.create().texOffs(106, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 3.4f, -0.7f, 1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_15 = body_5.addOrReplaceChild("dec_15", CubeListBuilder.create().texOffs(85, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 3.4f, 0.7f, -1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_12 = body_5.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(35, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.4f, -0.7f, 1.1170107f, 0.0f, 0.0f));
        PartDefinition body_6 = body_5.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0f, -1.0f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(0.0f, 4.8f, -0.4f, -0.9075712f, 0.0f, 0.0f));
        PartDefinition dec_17 = body_6.addOrReplaceChild("dec_17", CubeListBuilder.create().texOffs(31, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.1170107f));
        PartDefinition dec_18 = body_6.addOrReplaceChild("dec_18", CubeListBuilder.create().texOffs(82, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, 3.0f, 0.0f, 0.0f, 0.0f, -1.1170107f));
        PartDefinition dec_22 = body_6.addOrReplaceChild("dec_22", CubeListBuilder.create().texOffs(9, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 3.0f, 0.7f, -1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_23 = body_6.addOrReplaceChild("dec_23", CubeListBuilder.create().texOffs(65, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 3.0f, -0.7f, 1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_24 = body_6.addOrReplaceChild("dec_24", CubeListBuilder.create().texOffs(110, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.0f, -0.7f, 1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_20 = body_6.addOrReplaceChild("dec_20", CubeListBuilder.create().texOffs(35, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.1170107f));
        PartDefinition dec_19 = body_6.addOrReplaceChild("dec_19", CubeListBuilder.create().texOffs(88, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-1.0f, 3.0f, 0.0f, 0.0f, 0.0f, 1.1170107f));
        PartDefinition dec_21 = body_6.addOrReplaceChild("dec_21", CubeListBuilder.create().texOffs(6, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.0f, 0.7f, -1.1170107f, 0.0f, 0.0f));
        PartDefinition body_7 = body_6.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(59, 7).addBox(-1.0f, -0.1f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(0.0f, 3.6f, 0.1f, -0.5235988f, 0.0f, 0.0f));
        PartDefinition dec_25 = body_7.addOrReplaceChild("dec_25", CubeListBuilder.create().texOffs(114, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(1.0f, 1.4f, 0.0f, 0.0f, 0.0f, -1.1170107f));
        PartDefinition dec_27 = body_7.addOrReplaceChild("dec_27", CubeListBuilder.create().texOffs(122, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.4f, 0.7f, -1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_26 = body_7.addOrReplaceChild("dec_26", CubeListBuilder.create().texOffs(118, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-1.0f, 1.4f, 0.0f, 0.0f, 0.0f, 1.1170107f));
        PartDefinition dec_28 = body_7.addOrReplaceChild("dec_28", CubeListBuilder.create().texOffs(8, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.4f, -0.7f, 1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_11 = body_5.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(31, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.4f, 0.7f, -1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_14 = body_5.addOrReplaceChild("dec_14", CubeListBuilder.create().texOffs(69, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, 3.4f, 0.0f, 0.0f, 0.0f, -1.1170107f));
        PartDefinition dec_10 = body_5.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(8, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-1.0f, 1.4f, 0.0f, 0.0f, 0.0f, 1.1170107f));
        PartDefinition dec_9 = body_5.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(1.0f, 1.4f, 0.0f, 0.0f, 0.0f, -1.1170107f));
        PartDefinition dec_13 = body_5.addOrReplaceChild("dec_13", CubeListBuilder.create().texOffs(65, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-1.0f, 3.4f, 0.0f, 0.0f, 0.0f, 1.1170107f));
        PartDefinition dec_6 = body_4.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(106, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 3.0f, 0.7f, -1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_5 = body_4.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.0f, 0.7f, -1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_8 = body_4.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.0f, -0.7f, 1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_1 = body_4.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.1170107f));
        PartDefinition dec_4 = body_4.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(82, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.1170107f));
        PartDefinition dec_2 = body_4.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(65, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, 3.0f, 0.0f, 0.0f, 0.0f, -1.1170107f));
        PartDefinition dec = bodyuuuuuuuu.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(67, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 6.0f, 0.0f));
        PartDefinition jointRMB = bodymm.addOrReplaceChild("jointRMB", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.0f, 7.0f, 0.0f));
        PartDefinition decmL = jointRMB.addOrReplaceChild("decmL", CubeListBuilder.create().texOffs(42, 16).addBox(-0.5f, -2.5f, -1.0f, 8, 13, 2), PartPose.offsetAndRotation(1.0f, -5.0f, 0.0f, 0.0f, -0.34906584f, 0.0f));
        PartDefinition jointRM = decmL.addOrReplaceChild("jointRM", CubeListBuilder.create().texOffs(31, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.0f, 3.5f, 1.0f));
        PartDefinition body_8 = jointRM.addOrReplaceChild("body_8", CubeListBuilder.create().texOffs(96, 23).addBox(-1.0f, -6.0f, -1.0f, 4, 12, 3), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.0f, -0.7679449f, (float)Math.PI));
        PartDefinition dec_29 = body_8.addOrReplaceChild("dec_29", CubeListBuilder.create().texOffs(110, 23).addBox(0.0f, -5.5f, -1.0f, 3, 11, 2), PartPose.offset(2.8f, 0.0f, 0.8f));
        PartDefinition dec_30 = body_8.addOrReplaceChild("dec_30", CubeListBuilder.create().texOffs(76, 25).addBox(0.0f, -5.5f, -1.0f, 3, 11, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 1.2f, 0.0f, -0.7853982f, 0.0f));
        PartDefinition decrrr = decmL.addOrReplaceChild("decrrr", CubeListBuilder.create().texOffs(20, 17).addBox(-0.5f, -1.5f, -1.0f, 6, 3, 2), PartPose.offsetAndRotation(0.3f, 11.2f, 1.0f, 0.57595867f, 0.0f, 0.0f));
        PartDefinition decu = decrrr.addOrReplaceChild("decu", CubeListBuilder.create().texOffs(113, 15).addBox(-1.5f, -1.0f, -1.0f, 3, 2, 2), PartPose.offsetAndRotation(2.0f, 1.9f, 0.4f, 0.41887903f, 0.0f, 0.0f));
        PartDefinition dec_31 = decu.addOrReplaceChild("dec_31", CubeListBuilder.create().texOffs(34, 20).addBox(0.0f, -0.5f, -1.0f, 2, 1, 2), PartPose.offset(-1.0f, 0.0f, 1.8f));
        PartDefinition decllll = decmL.addOrReplaceChild("decllll", CubeListBuilder.create().texOffs(94, 8).addBox(-0.5f, -1.5f, -1.0f, 6, 3, 2), PartPose.offsetAndRotation(0.0f, -3.5f, 0.4f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_32 = decllll.addOrReplaceChild("dec_32", CubeListBuilder.create().texOffs(78, 8).addBox(-0.5f, -1.5f, -1.0f, 3, 3, 2), PartPose.offsetAndRotation(1.2f, -2.7f, 0.4f, -0.33161256f, 0.0f, 0.0f));
        PartDefinition dec_33 = dec_32.addOrReplaceChild("dec_33", CubeListBuilder.create().texOffs(13, 46).addBox(0.0f, -0.5f, -1.0f, 2, 1, 3), PartPose.offsetAndRotation(0.3f, -0.2f, 1.4f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition bodylll = decmL.addOrReplaceChild("bodylll", CubeListBuilder.create().texOffs(26, 23).addBox(-3.0f, -1.0f, -1.0f, 6, 11, 2), PartPose.offset(4.0f, -0.5f, -1.5f));
        PartDefinition jointRRX = bodylll.addOrReplaceChild("jointRRX", CubeListBuilder.create().texOffs(35, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.6f, 0.4f, -0.8f));
        PartDefinition JD_1 = jointRRX.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(60, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.321986f, -2.0943952f, -0.6806784f));
        PartDefinition jointRRY = JD_1.addOrReplaceChild("jointRRY", CubeListBuilder.create().texOffs(18, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_3 = jointRRY.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(0, 34).addBox(-7.0f, -0.5f, -0.5f, 7, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9599311f));
        PartDefinition jointRR1 = leg_3.addOrReplaceChild("jointRR1", CubeListBuilder.create().texOffs(34, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-7.0f, 0.0f, 0.0f));
        PartDefinition leg_4 = jointRR1.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(41, 35).addBox(-10.0f, -0.5f, -0.5f, 10, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.8849556f));
        PartDefinition bodya = bodylll.addOrReplaceChild("bodya", CubeListBuilder.create().texOffs(62, 26).addBox(-2.0f, -2.5f, -1.5f, 4, 4, 3), PartPose.offsetAndRotation(0.4f, 7.6f, -2.2f, 0.0f, 0.0f, -0.54105204f));
        PartDefinition jointRAX = bodya.addOrReplaceChild("jointRAX", CubeListBuilder.create().texOffs(39, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, -0.5f, -0.5f));
        PartDefinition JD = jointRAX.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(52, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.6703537f, 0.0f));
        PartDefinition jointRAY = JD.addOrReplaceChild("jointRAY", CubeListBuilder.create().texOffs(55, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg = jointRAY.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(42, 31).addBox(-5.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.2217305f));
        PartDefinition jointRA1 = leg.addOrReplaceChild("jointRA1", CubeListBuilder.create().texOffs(99, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-5.2f, 0.2f, 0.0f));
        PartDefinition leg_1 = jointRA1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(54, 14).addBox(-4.5f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.1693707f));
        PartDefinition joint = leg_1.addOrReplaceChild("joint", CubeListBuilder.create().texOffs(99, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_2 = joint.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(0, 32).addBox(-5.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(-5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.2915436f));
        PartDefinition jointRAC1 = leg_2.addOrReplaceChild("jointRAC1", CubeListBuilder.create().texOffs(121, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.4f, 0.7f, -0.5f));
        PartDefinition body_11 = jointRAC1.addOrReplaceChild("body_11", CubeListBuilder.create().texOffs(86, 29).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 1.5707964f, 0.0f, 0.27925268f));
        PartDefinition body_12 = body_11.addOrReplaceChild("body_12", CubeListBuilder.create().texOffs(56, 31).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 3), PartPose.offsetAndRotation(-0.6f, 0.0f, -2.4f, 0.0f, -2.3561945f, 0.0f));
        PartDefinition jointRAC2 = leg_2.addOrReplaceChild("jointRAC2", CubeListBuilder.create().texOffs(109, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.8f, 0.7f, -0.5f));
        PartDefinition body_9 = jointRAC2.addOrReplaceChild("body_9", CubeListBuilder.create().texOffs(86, 25).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 1.5707964f, 0.0f, 0.62831855f));
        PartDefinition body_10 = body_9.addOrReplaceChild("body_10", CubeListBuilder.create().texOffs(16, 28).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 4), PartPose.offsetAndRotation(-0.6f, 0.0f, -2.0f, 0.0f, -2.0943952f, 0.0f));
        PartDefinition hair_jointM0 = bodymm.addOrReplaceChild("hair_jointM0", CubeListBuilder.create().texOffs(8, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.5f, 1.0f));
        PartDefinition hair = hair_jointM0.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(75, 42).addBox(-1.0f, -0.5f, -0.5f, 2, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.6529005f, (float)Math.PI, 0.0f));
        PartDefinition hair_jointM1 = hair.addOrReplaceChild("hair_jointM1", CubeListBuilder.create().texOffs(84, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_1 = hair_jointM1.addOrReplaceChild("hair_1", CubeListBuilder.create().texOffs(92, 42).addBox(-1.0f, -0.5f, -0.5f, 2, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.2268928f, 0.0f, 0.0f));
        PartDefinition hair_jointM2 = hair_1.addOrReplaceChild("hair_jointM2", CubeListBuilder.create().texOffs(91, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_2 = hair_jointM2.addOrReplaceChild("hair_2", CubeListBuilder.create().texOffs(104, 42).addBox(-1.0f, -0.5f, -0.5f, 2, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointM3 = hair_2.addOrReplaceChild("hair_jointM3", CubeListBuilder.create().texOffs(120, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_3 = hair_jointM3.addOrReplaceChild("hair_3", CubeListBuilder.create().texOffs(22, 43).addBox(-1.5f, -0.5f, -0.5f, 3, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointM4 = hair_3.addOrReplaceChild("hair_jointM4", CubeListBuilder.create().texOffs(123, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_4 = hair_jointM4.addOrReplaceChild("hair_4", CubeListBuilder.create().texOffs(112, 43).addBox(-1.5f, -0.5f, -0.5f, 3, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.43633232f, 0.0f, 0.0f));
        PartDefinition hair_jointM5 = hair_4.addOrReplaceChild("hair_jointM5", CubeListBuilder.create().texOffs(22, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_5 = hair_jointM5.addOrReplaceChild("hair_5", CubeListBuilder.create().texOffs(32, 44).addBox(-1.5f, -0.5f, -0.5f, 3, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointM6 = hair_5.addOrReplaceChild("hair_jointM6", CubeListBuilder.create().texOffs(120, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_6 = hair_jointM6.addOrReplaceChild("hair_6", CubeListBuilder.create().texOffs(46, 44).addBox(-1.5f, -0.5f, -0.5f, 3, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition hair_jointM7 = hair_6.addOrReplaceChild("hair_jointM7", CubeListBuilder.create().texOffs(123, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 3.0f));
        PartDefinition hair_7 = hair_jointM7.addOrReplaceChild("hair_7", CubeListBuilder.create().texOffs(100, 42).addBox(-1.0f, -0.5f, -0.5f, 2, 1, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.7679449f, 0.0f, 0.0f));
        PartDefinition body_2 = bodym.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(69, 0).addBox(-1.5f, -2.5f, -2.5f, 4, 3, 5), PartPose.offsetAndRotation(-5.0f, 0.6f, 1.7f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition jointT = bodym.addOrReplaceChild("jointT", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -0.4f, -6.0f));
        PartDefinition body_3 = jointT.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(87, 0).addBox(-3.5f, -0.5f, -0.5f, 7, 3, 5), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, (float)(-Math.PI), 0.0f, 0.0f));
        PartDefinition jointRLX = mainbody.addOrReplaceChild("jointRLX", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-5.0f, -1.5f, -1.0f));
        PartDefinition JD_5 = jointRLX.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(123, 32).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.6981317f, 0.0f));
        PartDefinition jointRLY = JD_5.addOrReplaceChild("jointRLY", CubeListBuilder.create().texOffs(72, 33).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_13 = jointRLY.addOrReplaceChild("leg_13", CubeListBuilder.create().texOffs(0, 49).addBox(-5.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.012291f));
        PartDefinition jointRL1 = leg_13.addOrReplaceChild("jointRL1", CubeListBuilder.create().texOffs(120, 33).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-5.2f, 0.2f, 0.0f));
        PartDefinition leg_14 = jointRL1.addOrReplaceChild("leg_14", CubeListBuilder.create().texOffs(30, 49).addBox(-4.5f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9424778f));
        PartDefinition joint_3 = leg_14.addOrReplaceChild("joint_3", CubeListBuilder.create().texOffs(123, 34).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_15 = joint_3.addOrReplaceChild("leg_15", CubeListBuilder.create().texOffs(42, 49).addBox(-4.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(-5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.2915436f));
        PartDefinition jointRLC2 = leg_15.addOrReplaceChild("jointRLC2", CubeListBuilder.create().texOffs(72, 35).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.8f, 0.7f, -0.5f));
        PartDefinition body_22 = jointRLC2.addOrReplaceChild("body_22", CubeListBuilder.create().texOffs(51, 49).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 1.5707964f, 0.0f, 0.62831855f));
        PartDefinition body_23 = body_22.addOrReplaceChild("body_23", CubeListBuilder.create().texOffs(55, 49).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 4), PartPose.offsetAndRotation(-0.6f, 0.0f, -2.0f, 0.0f, -2.0943952f, 0.0f));
        PartDefinition jointRLC1 = leg_15.addOrReplaceChild("jointRLC1", CubeListBuilder.create().texOffs(120, 35).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.4f, 0.7f, -0.5f));
        PartDefinition body_24 = jointRLC1.addOrReplaceChild("body_24", CubeListBuilder.create().texOffs(61, 49).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 1.5707964f, 0.0f, 0.27925268f));
        PartDefinition body_25 = body_24.addOrReplaceChild("body_25", CubeListBuilder.create().texOffs(69, 49).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 3), PartPose.offsetAndRotation(-0.6f, 0.0f, -2.4f, 0.0f, -2.3561945f, 0.0f));
        return LayerDefinition.create(mesh, 128, 55);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityInhooM parasite = (EntityInhooM)entity;
        this.jointRM.yRot = 0.0f;
        this.jointLM.yRot = 0.0f;
        this.jointRMB.yRot = 0.0f;
        this.jointLMB.yRot = 0.0f;
        this.jointLRX.xRot = 0.0f;
        this.jointLRY.yRot = 0.0f;
        this.jointLR1.zRot = 0.0f;
        this.jointRRX.xRot = 0.0f;
        this.jointRRY.yRot = 0.0f;
        this.jointRR1.zRot = 0.0f;
        this.jointLAX.zRot = 0.0f;
        this.jointLA1.zRot = 0.0f;
        this.jointRAX.zRot = 0.0f;
        this.jointRA1.zRot = 0.0f;
        this.jointH.xRot = 0.0f;
        this.jointLLX.zRot = 0.0f;
        this.jointLL1.zRot = 0.0f;
        this.jointRLX.zRot = 0.0f;
        this.jointRL1.zRot = 0.0f;
        this.jointN.xRot = 0.0f;
        this.hair_jointM0.xRot = 0.0f;
        this.hair_jointM1.xRot = 0.0f;
        this.hair_jointM2.xRot = 0.0f;
        this.hair_jointM3.xRot = 0.0f;
        this.hair_jointM4.xRot = 0.0f;
        this.hair_jointM5.xRot = 0.0f;
        this.hair_jointM6.xRot = 0.0f;
        this.hair_jointM7.xRot = 0.0f;
        limbSwing = parasite.tickCount;
        limbSwingAmount = 0.5f;
        byte i = parasite.getParasiteStatus();
        i = 0;
        if (i == 0) {
            if (!parasite.getStillAni()) {
                // empty if block
            }
            float f1 = Mth.sin((float)(ageInTicks * 0.08f)) * 0.05f;
            float f2 = Mth.sin((float)(ageInTicks * 0.13f)) * 0.2f;
            float f3 = Mth.sin((float)(ageInTicks * 0.2f)) * 0.1f;
            float f4 = Mth.sin((float)(ageInTicks * 0.05f)) * 0.2f;
            float f5 = Mth.sin((float)(ageInTicks * 0.2f)) * 0.2f;
            float f6 = Mth.sin((float)(ageInTicks * 0.05f)) * 0.3f;
            float f7 = Mth.sin((float)(ageInTicks * 0.21f)) * 0.18f;
            float f8 = Mth.sin((float)(ageInTicks * 0.04f)) * 0.32f;
            float f9 = Mth.sin((float)(ageInTicks * 0.08f)) * 0.12f;
            this.jointRM.yRot = f1;
            this.jointLM.yRot = -1.0f * f1;
            this.jointRMB.yRot = f2;
            this.jointLMB.yRot = -1.0f * f2;
            this.jointLRX.xRot = f3;
            this.jointLRY.yRot = f4;
            this.jointLR1.zRot = f3;
            this.jointRRX.xRot = -1.0f * f4;
            this.jointRRY.yRot = -1.0f * f3;
            this.jointRR1.zRot = -1.0f * f4;
            this.jointLAX.zRot = f5;
            this.jointLA1.zRot = f6;
            this.jointRAX.zRot = -1.0f * f6;
            this.jointRA1.zRot = -1.0f * f5;
            this.jointH.xRot = f3;
            this.jointLLX.zRot = -1.0f * f7;
            this.jointLL1.zRot = -1.0f * f8;
            this.jointRLX.zRot = f8;
            this.jointRL1.zRot = f7;
            this.jointN.xRot = f1;
            this.hair_jointM0.xRot = f9;
            this.hair_jointM1.xRot = f9;
            this.hair_jointM2.xRot = f9;
            this.hair_jointM3.xRot = f9;
            this.hair_jointM4.xRot = f9;
            this.hair_jointM5.xRot = f9;
            this.hair_jointM6.xRot = f9;
            this.hair_jointM7.xRot = f9;
        } else if (i == 1 || i == 2 || i == 6) {
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

