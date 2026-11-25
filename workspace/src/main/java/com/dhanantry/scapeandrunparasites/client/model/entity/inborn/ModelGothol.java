package com.dhanantry.scapeandrunparasites.client.model.entity.inborn;

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

public class ModelGothol extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "gothol"), "main");
    private final ModelPart mainbody;
    private final ModelPart body;
    private final ModelPart jointLL1;
    private final ModelPart jointRL1;
    private final ModelPart neck;
    private final ModelPart neck_1;
    private final ModelPart neck_2;
    private final ModelPart neckp;
    private final ModelPart neck_3;
    private final ModelPart neck_4;
    private final ModelPart neckpT;
    private final ModelPart neck_5;
    private final ModelPart neck_6;
    private final ModelPart neckpT_1;
    private final ModelPart neckp_1;
    private final ModelPart neck_7;
    private final ModelPart neckpp;
    private final ModelPart neck_8;
    private final ModelPart neckT;
    private final ModelPart neck_9;
    private final ModelPart neck_10;
    private final ModelPart neck_11;
    private final ModelPart neck_12;
    private final ModelPart neck_13;
    private final ModelPart body_1;
    private final ModelPart body_2;
    private final ModelPart jointdont;
    private final ModelPart leg;
    private final ModelPart jointLL2;
    private final ModelPart leg_1;
    private final ModelPart jointdont_1;
    private final ModelPart leg_2;
    private final ModelPart jointRL2;
    private final ModelPart leg_3;
    private final ModelPart neckddd;
    private final ModelPart neckddd_1;
    private final ModelPart jointB;
    private final ModelPart hair;
    private final ModelPart jointB_1;
    private final ModelPart hair_1;
    private final ModelPart jointB_2;
    private final ModelPart hair_2;
    private final ModelPart jointB_3;
    private final ModelPart hair_3;
    private final ModelPart jointB_4;
    private final ModelPart hair_4;
    private final ModelPart jointB_5;
    private final ModelPart hair_5;
    private final ModelPart jointB_6;
    private final ModelPart hair_6;
    private final ModelPart jointB_7;
    private final ModelPart hair_7;
    private final ModelPart jointB_8;
    private final ModelPart hair_8;
    private final ModelPart jointB_9;
    private final ModelPart hair_9;
    private final ModelPart jointB_10;
    private final ModelPart hair_10;
    private final ModelPart jointB_11;
    private final ModelPart hair_11;
    private final ModelPart jointB_12;
    private final ModelPart hair_12;
    private final ModelPart jointB_13;
    private final ModelPart hair_13;
    private final ModelPart jointB_14;
    private final ModelPart hair_14;
    private final ModelPart neckddd_2;
    private final ModelPart jointC;
    private final ModelPart hair_15;
    private final ModelPart jointC_1;
    private final ModelPart hair_16;
    private final ModelPart jointC_2;
    private final ModelPart hair_17;
    private final ModelPart jointC_3;
    private final ModelPart hair_18;
    private final ModelPart jointC_4;
    private final ModelPart hair_19;
    private final ModelPart jointC_5;
    private final ModelPart hair_20;
    private final ModelPart jointC_6;
    private final ModelPart hair_21;
    private final ModelPart jointC_7;
    private final ModelPart hair_22;
    private final ModelPart jointC_8;
    private final ModelPart hair_23;
    private final ModelPart jointC_9;
    private final ModelPart hair_24;
    private final ModelPart jointC_10;
    private final ModelPart hair_25;
    private final ModelPart jointC_11;
    private final ModelPart hair_26;
    private final ModelPart jointC_12;
    private final ModelPart hair_27;
    private final ModelPart jointC_13;
    private final ModelPart hair_28;
    private final ModelPart neckddd_3;
    private final ModelPart neckddd_4;
    private final ModelPart neckddd_5;
    private final ModelPart jointA;
    private final ModelPart hair_29;
    private final ModelPart jointA_1;
    private final ModelPart hair_30;
    private final ModelPart jointA_2;
    private final ModelPart hair_31;
    private final ModelPart jointA_3;
    private final ModelPart hair_32;
    private final ModelPart jointA_4;
    private final ModelPart hair_33;
    private final ModelPart jointA_5;
    private final ModelPart hair_34;
    private final ModelPart jointA_6;
    private final ModelPart hair_35;
    private final ModelPart jointA_7;
    private final ModelPart hair_36;
    private final ModelPart jointA_8;
    private final ModelPart hair_37;
    private final ModelPart jointA_9;
    private final ModelPart hair_38;
    private final ModelPart jointA_10;
    private final ModelPart hair_39;
    private final ModelPart jointA_11;
    private final ModelPart hair_40;
    private final ModelPart jointA_12;
    private final ModelPart hair_41;

    public ModelGothol(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.body = root.getChild("mainbody").getChild("body");
        this.jointLL1 = root.getChild("mainbody").getChild("jointLL1");
        this.jointRL1 = root.getChild("mainbody").getChild("jointRL1");
        this.neck = root.getChild("mainbody").getChild("neck");
        this.neck_1 = root.getChild("mainbody").getChild("neck_1");
        this.neck_2 = root.getChild("mainbody").getChild("neck_2");
        this.neckp = root.getChild("mainbody").getChild("neckp");
        this.neck_3 = root.getChild("mainbody").getChild("neck_3");
        this.neck_4 = root.getChild("mainbody").getChild("neck_4");
        this.neckpT = root.getChild("mainbody").getChild("neckpT");
        this.neck_5 = root.getChild("mainbody").getChild("neck_5");
        this.neck_6 = root.getChild("mainbody").getChild("neck_6");
        this.neckpT_1 = root.getChild("mainbody").getChild("neckpT_1");
        this.neckp_1 = root.getChild("mainbody").getChild("neckp_1");
        this.neck_7 = root.getChild("mainbody").getChild("neck_7");
        this.neckpp = root.getChild("mainbody").getChild("neckpp");
        this.neck_8 = root.getChild("mainbody").getChild("neck_8");
        this.neckT = root.getChild("mainbody").getChild("neckT");
        this.neck_9 = root.getChild("mainbody").getChild("neck_9");
        this.neck_10 = root.getChild("mainbody").getChild("neck_10");
        this.neck_11 = root.getChild("mainbody").getChild("neck_11");
        this.neck_12 = root.getChild("mainbody").getChild("neck_12");
        this.neck_13 = root.getChild("mainbody").getChild("neck_13");
        this.body_1 = root.getChild("mainbody").getChild("body").getChild("body_1");
        this.body_2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2");
        this.jointdont = root.getChild("mainbody").getChild("jointLL1").getChild("jointdont");
        this.leg = root.getChild("mainbody").getChild("jointLL1").getChild("jointdont").getChild("leg");
        this.jointLL2 = root.getChild("mainbody").getChild("jointLL1").getChild("jointdont").getChild("leg").getChild("jointLL2");
        this.leg_1 = root.getChild("mainbody").getChild("jointLL1").getChild("jointdont").getChild("leg").getChild("jointLL2").getChild("leg_1");
        this.jointdont_1 = root.getChild("mainbody").getChild("jointRL1").getChild("jointdont_1");
        this.leg_2 = root.getChild("mainbody").getChild("jointRL1").getChild("jointdont_1").getChild("leg_2");
        this.jointRL2 = root.getChild("mainbody").getChild("jointRL1").getChild("jointdont_1").getChild("leg_2").getChild("jointRL2");
        this.leg_3 = root.getChild("mainbody").getChild("jointRL1").getChild("jointdont_1").getChild("leg_2").getChild("jointRL2").getChild("leg_3");
        this.neckddd = root.getChild("mainbody").getChild("neckp").getChild("neckddd");
        this.neckddd_1 = root.getChild("mainbody").getChild("neckpT").getChild("neckddd_1");
        this.jointB = root.getChild("mainbody").getChild("neckpT").getChild("jointB");
        this.hair = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair");
        this.jointB_1 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1");
        this.hair_1 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1");
        this.jointB_2 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2");
        this.hair_2 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2");
        this.jointB_3 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3");
        this.hair_3 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3");
        this.jointB_4 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4");
        this.hair_4 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4");
        this.jointB_5 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5");
        this.hair_5 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5");
        this.jointB_6 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6");
        this.hair_6 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6");
        this.jointB_7 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7");
        this.hair_7 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7");
        this.jointB_8 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8");
        this.hair_8 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8");
        this.jointB_9 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8").getChild("jointB_9");
        this.hair_9 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8").getChild("jointB_9").getChild("hair_9");
        this.jointB_10 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8").getChild("jointB_9").getChild("hair_9").getChild("jointB_10");
        this.hair_10 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8").getChild("jointB_9").getChild("hair_9").getChild("jointB_10").getChild("hair_10");
        this.jointB_11 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8").getChild("jointB_9").getChild("hair_9").getChild("jointB_10").getChild("hair_10").getChild("jointB_11");
        this.hair_11 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8").getChild("jointB_9").getChild("hair_9").getChild("jointB_10").getChild("hair_10").getChild("jointB_11").getChild("hair_11");
        this.jointB_12 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8").getChild("jointB_9").getChild("hair_9").getChild("jointB_10").getChild("hair_10").getChild("jointB_11").getChild("hair_11").getChild("jointB_12");
        this.hair_12 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8").getChild("jointB_9").getChild("hair_9").getChild("jointB_10").getChild("hair_10").getChild("jointB_11").getChild("hair_11").getChild("jointB_12").getChild("hair_12");
        this.jointB_13 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8").getChild("jointB_9").getChild("hair_9").getChild("jointB_10").getChild("hair_10").getChild("jointB_11").getChild("hair_11").getChild("jointB_12").getChild("hair_12").getChild("jointB_13");
        this.hair_13 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8").getChild("jointB_9").getChild("hair_9").getChild("jointB_10").getChild("hair_10").getChild("jointB_11").getChild("hair_11").getChild("jointB_12").getChild("hair_12").getChild("jointB_13").getChild("hair_13");
        this.jointB_14 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8").getChild("jointB_9").getChild("hair_9").getChild("jointB_10").getChild("hair_10").getChild("jointB_11").getChild("hair_11").getChild("jointB_12").getChild("hair_12").getChild("jointB_13").getChild("hair_13").getChild("jointB_14");
        this.hair_14 = root.getChild("mainbody").getChild("neckpT").getChild("jointB").getChild("hair").getChild("jointB_1").getChild("hair_1").getChild("jointB_2").getChild("hair_2").getChild("jointB_3").getChild("hair_3").getChild("jointB_4").getChild("hair_4").getChild("jointB_5").getChild("hair_5").getChild("jointB_6").getChild("hair_6").getChild("jointB_7").getChild("hair_7").getChild("jointB_8").getChild("hair_8").getChild("jointB_9").getChild("hair_9").getChild("jointB_10").getChild("hair_10").getChild("jointB_11").getChild("hair_11").getChild("jointB_12").getChild("hair_12").getChild("jointB_13").getChild("hair_13").getChild("jointB_14").getChild("hair_14");
        this.neckddd_2 = root.getChild("mainbody").getChild("neckpT_1").getChild("neckddd_2");
        this.jointC = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC");
        this.hair_15 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15");
        this.jointC_1 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1");
        this.hair_16 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16");
        this.jointC_2 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2");
        this.hair_17 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17");
        this.jointC_3 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3");
        this.hair_18 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18");
        this.jointC_4 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4");
        this.hair_19 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19");
        this.jointC_5 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5");
        this.hair_20 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20");
        this.jointC_6 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6");
        this.hair_21 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21");
        this.jointC_7 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7");
        this.hair_22 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22");
        this.jointC_8 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22").getChild("jointC_8");
        this.hair_23 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22").getChild("jointC_8").getChild("hair_23");
        this.jointC_9 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22").getChild("jointC_8").getChild("hair_23").getChild("jointC_9");
        this.hair_24 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22").getChild("jointC_8").getChild("hair_23").getChild("jointC_9").getChild("hair_24");
        this.jointC_10 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22").getChild("jointC_8").getChild("hair_23").getChild("jointC_9").getChild("hair_24").getChild("jointC_10");
        this.hair_25 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22").getChild("jointC_8").getChild("hair_23").getChild("jointC_9").getChild("hair_24").getChild("jointC_10").getChild("hair_25");
        this.jointC_11 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22").getChild("jointC_8").getChild("hair_23").getChild("jointC_9").getChild("hair_24").getChild("jointC_10").getChild("hair_25").getChild("jointC_11");
        this.hair_26 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22").getChild("jointC_8").getChild("hair_23").getChild("jointC_9").getChild("hair_24").getChild("jointC_10").getChild("hair_25").getChild("jointC_11").getChild("hair_26");
        this.jointC_12 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22").getChild("jointC_8").getChild("hair_23").getChild("jointC_9").getChild("hair_24").getChild("jointC_10").getChild("hair_25").getChild("jointC_11").getChild("hair_26").getChild("jointC_12");
        this.hair_27 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22").getChild("jointC_8").getChild("hair_23").getChild("jointC_9").getChild("hair_24").getChild("jointC_10").getChild("hair_25").getChild("jointC_11").getChild("hair_26").getChild("jointC_12").getChild("hair_27");
        this.jointC_13 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22").getChild("jointC_8").getChild("hair_23").getChild("jointC_9").getChild("hair_24").getChild("jointC_10").getChild("hair_25").getChild("jointC_11").getChild("hair_26").getChild("jointC_12").getChild("hair_27").getChild("jointC_13");
        this.hair_28 = root.getChild("mainbody").getChild("neckpT_1").getChild("jointC").getChild("hair_15").getChild("jointC_1").getChild("hair_16").getChild("jointC_2").getChild("hair_17").getChild("jointC_3").getChild("hair_18").getChild("jointC_4").getChild("hair_19").getChild("jointC_5").getChild("hair_20").getChild("jointC_6").getChild("hair_21").getChild("jointC_7").getChild("hair_22").getChild("jointC_8").getChild("hair_23").getChild("jointC_9").getChild("hair_24").getChild("jointC_10").getChild("hair_25").getChild("jointC_11").getChild("hair_26").getChild("jointC_12").getChild("hair_27").getChild("jointC_13").getChild("hair_28");
        this.neckddd_3 = root.getChild("mainbody").getChild("neckp_1").getChild("neckddd_3");
        this.neckddd_4 = root.getChild("mainbody").getChild("neckpp").getChild("neckddd_4");
        this.neckddd_5 = root.getChild("mainbody").getChild("neckpp").getChild("neckddd_5");
        this.jointA = root.getChild("mainbody").getChild("neckT").getChild("jointA");
        this.hair_29 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29");
        this.jointA_1 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1");
        this.hair_30 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30");
        this.jointA_2 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2");
        this.hair_31 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31");
        this.jointA_3 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3");
        this.hair_32 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32");
        this.jointA_4 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4");
        this.hair_33 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33");
        this.jointA_5 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5");
        this.hair_34 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34");
        this.jointA_6 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6");
        this.hair_35 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35");
        this.jointA_7 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35").getChild("jointA_7");
        this.hair_36 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35").getChild("jointA_7").getChild("hair_36");
        this.jointA_8 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35").getChild("jointA_7").getChild("hair_36").getChild("jointA_8");
        this.hair_37 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35").getChild("jointA_7").getChild("hair_36").getChild("jointA_8").getChild("hair_37");
        this.jointA_9 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35").getChild("jointA_7").getChild("hair_36").getChild("jointA_8").getChild("hair_37").getChild("jointA_9");
        this.hair_38 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35").getChild("jointA_7").getChild("hair_36").getChild("jointA_8").getChild("hair_37").getChild("jointA_9").getChild("hair_38");
        this.jointA_10 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35").getChild("jointA_7").getChild("hair_36").getChild("jointA_8").getChild("hair_37").getChild("jointA_9").getChild("hair_38").getChild("jointA_10");
        this.hair_39 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35").getChild("jointA_7").getChild("hair_36").getChild("jointA_8").getChild("hair_37").getChild("jointA_9").getChild("hair_38").getChild("jointA_10").getChild("hair_39");
        this.jointA_11 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35").getChild("jointA_7").getChild("hair_36").getChild("jointA_8").getChild("hair_37").getChild("jointA_9").getChild("hair_38").getChild("jointA_10").getChild("hair_39").getChild("jointA_11");
        this.hair_40 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35").getChild("jointA_7").getChild("hair_36").getChild("jointA_8").getChild("hair_37").getChild("jointA_9").getChild("hair_38").getChild("jointA_10").getChild("hair_39").getChild("jointA_11").getChild("hair_40");
        this.jointA_12 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35").getChild("jointA_7").getChild("hair_36").getChild("jointA_8").getChild("hair_37").getChild("jointA_9").getChild("hair_38").getChild("jointA_10").getChild("hair_39").getChild("jointA_11").getChild("hair_40").getChild("jointA_12");
        this.hair_41 = root.getChild("mainbody").getChild("neckT").getChild("jointA").getChild("hair_29").getChild("jointA_1").getChild("hair_30").getChild("jointA_2").getChild("hair_31").getChild("jointA_3").getChild("hair_32").getChild("jointA_4").getChild("hair_33").getChild("jointA_5").getChild("hair_34").getChild("jointA_6").getChild("hair_35").getChild("jointA_7").getChild("hair_36").getChild("jointA_8").getChild("hair_37").getChild("jointA_9").getChild("hair_38").getChild("jointA_10").getChild("hair_39").getChild("jointA_11").getChild("hair_40").getChild("jointA_12").getChild("hair_41");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 1.5f, -2.0f));
        PartDefinition neck_10 = mainbody.addOrReplaceChild("neck_10", CubeListBuilder.create().texOffs(101, 55).addBox(-2.0f, -1.5f, -2.0f, 4, 8, 8), PartPose.offsetAndRotation(-7.0f, -11.0f, 9.0f, -0.43982297f, 2.2619467f, 0.0f));
        PartDefinition neck_2 = mainbody.addOrReplaceChild("neck_2", CubeListBuilder.create().texOffs(77, 0).addBox(-5.5f, 1.0f, -3.5f, 7, 5, 6), PartPose.offsetAndRotation(-3.0f, 0.0f, 1.0f, 0.143117f, 0.0f, -0.31415927f));
        PartDefinition neckpT_1 = mainbody.addOrReplaceChild("neckpT_1", CubeListBuilder.create().texOffs(56, 27).addBox(-3.5f, -4.0f, -3.5f, 7, 10, 10), PartPose.offsetAndRotation(-7.0f, -4.0f, 1.1f, -0.045378562f, -0.12566371f, 0.06283186f));
        PartDefinition jointC = neckpT_1.addOrReplaceChild("jointC", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.4f, 0.3f, 1.4f));
        PartDefinition hair_15 = jointC.addOrReplaceChild("hair_15", CubeListBuilder.create().texOffs(23, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 2.0380208f, 0.81681406f, -0.75398225f));
        PartDefinition jointC_1 = hair_15.addOrReplaceChild("jointC_1", CubeListBuilder.create().texOffs(105, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_16 = jointC_1.addOrReplaceChild("hair_16", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.56897736f, 0.0f, 0.0f));
        PartDefinition jointC_2 = hair_16.addOrReplaceChild("jointC_2", CubeListBuilder.create().texOffs(109, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_17 = jointC_2.addOrReplaceChild("hair_17", CubeListBuilder.create().texOffs(42, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.29670596f, 0.25132743f, 0.0f));
        PartDefinition jointC_3 = hair_17.addOrReplaceChild("jointC_3", CubeListBuilder.create().texOffs(113, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_18 = jointC_3.addOrReplaceChild("hair_18", CubeListBuilder.create().texOffs(22, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.29670596f, 0.0f, 0.0f));
        PartDefinition jointC_4 = hair_18.addOrReplaceChild("jointC_4", CubeListBuilder.create().texOffs(123, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_19 = jointC_4.addOrReplaceChild("hair_19", CubeListBuilder.create().texOffs(116, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.56199604f, 0.0f, 0.0f));
        PartDefinition jointC_5 = hair_19.addOrReplaceChild("jointC_5", CubeListBuilder.create().texOffs(6, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_20 = jointC_5.addOrReplaceChild("hair_20", CubeListBuilder.create().texOffs(92, 29).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.25132743f, 0.0f));
        PartDefinition jointC_6 = hair_20.addOrReplaceChild("jointC_6", CubeListBuilder.create().texOffs(32, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_21 = jointC_6.addOrReplaceChild("hair_21", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.48520154f, 0.0f, 0.0f));
        PartDefinition jointC_7 = hair_21.addOrReplaceChild("jointC_7", CubeListBuilder.create().texOffs(36, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_22 = jointC_7.addOrReplaceChild("hair_22", CubeListBuilder.create().texOffs(116, 32).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.5061455f, 0.0f, 0.0f));
        PartDefinition jointC_8 = hair_22.addOrReplaceChild("jointC_8", CubeListBuilder.create().texOffs(77, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_23 = jointC_8.addOrReplaceChild("hair_23", CubeListBuilder.create().texOffs(89, 33).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.35953784f, 0.0f, 0.0f));
        PartDefinition jointC_9 = hair_23.addOrReplaceChild("jointC_9", CubeListBuilder.create().texOffs(97, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_24 = jointC_9.addOrReplaceChild("hair_24", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.48520154f, 0.0f, 0.0f));
        PartDefinition jointC_10 = hair_24.addOrReplaceChild("jointC_10", CubeListBuilder.create().texOffs(32, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_25 = jointC_10.addOrReplaceChild("hair_25", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition jointC_11 = hair_25.addOrReplaceChild("jointC_11", CubeListBuilder.create().texOffs(77, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_26 = jointC_11.addOrReplaceChild("hair_26", CubeListBuilder.create().texOffs(76, 47).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.7993608f, 0.25132743f, 0.0f));
        PartDefinition jointC_12 = hair_26.addOrReplaceChild("jointC_12", CubeListBuilder.create().texOffs(97, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_27 = jointC_12.addOrReplaceChild("hair_27", CubeListBuilder.create().texOffs(81, 48).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.7574729f, 0.0f, 0.0f));
        PartDefinition jointC_13 = hair_27.addOrReplaceChild("jointC_13", CubeListBuilder.create().texOffs(35, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_28 = jointC_13.addOrReplaceChild("hair_28", CubeListBuilder.create().texOffs(102, 50).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.9250245f, 0.0f, 0.0f));
        PartDefinition neckddd_2 = neckpT_1.addOrReplaceChild("neckddd_2", CubeListBuilder.create().texOffs(80, 26).addBox(-2.5f, 1.0f, -3.5f, 2, 4, 4), PartPose.offsetAndRotation(-3.0f, -1.0f, 4.0f, 0.143117f, 0.12566371f, -0.18849556f));
        PartDefinition neck_9 = mainbody.addOrReplaceChild("neck_9", CubeListBuilder.create().texOffs(83, 50).addBox(-2.0f, -1.5f, -2.0f, 6, 6, 7), PartPose.offsetAndRotation(-6.0f, -13.0f, 4.0f, -0.75398225f, 1.5707964f, 0.0f));
        PartDefinition neckp = mainbody.addOrReplaceChild("neckp", CubeListBuilder.create().texOffs(94, 2).addBox(-5.0f, -1.5f, -5.0f, 7, 9, 9), PartPose.offsetAndRotation(8.0f, -1.0f, 6.0f, -0.25132743f, 0.0f, 0.37699112f));
        PartDefinition neckddd = neckp.addOrReplaceChild("neckddd", CubeListBuilder.create().texOffs(0, 11).addBox(-2.5f, 1.0f, -3.5f, 1, 4, 2), PartPose.offsetAndRotation(4.5f, 1.1f, 2.3f, -0.54803336f, 0.0f, 0.0f));
        PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, 2.0f, -2.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.2687807f, 0.0f, 0.0f));
        PartDefinition body_1 = body.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(93, 71).addBox(-4.0f, -4.0f, -2.0f, 8, 8, 6), PartPose.offsetAndRotation(0.0f, 5.0f, 0.0f, -0.143117f, 0.0f, 0.0f));
        PartDefinition body_2 = body_1.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(0, 66).addBox(-2.5f, -3.0f, -2.5f, 5, 4, 5), PartPose.offsetAndRotation(0.0f, 4.5f, 0.0f, 0.18849556f, 0.0f, 0.0f));
        PartDefinition neck_7 = mainbody.addOrReplaceChild("neck_7", CubeListBuilder.create().texOffs(25, 41).addBox(-2.0f, -1.5f, -2.0f, 4, 9, 5), PartPose.offsetAndRotation(7.3f, 1.2f, -3.0f, 0.50265485f, -0.9424778f, 0.0f));
        PartDefinition neck_13 = mainbody.addOrReplaceChild("neck_13", CubeListBuilder.create().texOffs(79, 63).addBox(-5.0f, -1.5f, -5.0f, 4, 7, 6), PartPose.offsetAndRotation(-6.0f, 3.0f, 11.0f, -0.50265485f, -0.87964594f, 0.0f));
        PartDefinition neck_1 = mainbody.addOrReplaceChild("neck_1", CubeListBuilder.create().texOffs(39, 0).addBox(-6.0f, -1.5f, -2.0f, 13, 14, 12), PartPose.offsetAndRotation(0.0f, -10.0f, -1.0f, -0.06283186f, 0.0f, 0.0f));
        PartDefinition neck_12 = mainbody.addOrReplaceChild("neck_12", CubeListBuilder.create().texOffs(25, 64).addBox(-2.0f, -1.5f, -2.0f, 7, 6, 9), PartPose.offsetAndRotation(-6.0f, -4.0f, 12.0f, -0.12566371f, 1.3194689f, -0.18849556f));
        PartDefinition neck_11 = mainbody.addOrReplaceChild("neck_11", CubeListBuilder.create().texOffs(55, 62).addBox(-5.5f, -1.5f, -5.0f, 6, 5, 6), PartPose.offsetAndRotation(0.0f, 3.0f, 12.0f, -0.56548667f, -0.25132743f, 0.0f));
        PartDefinition neckT = mainbody.addOrReplaceChild("neckT", CubeListBuilder.create().texOffs(61, 47).addBox(-2.0f, -2.0f, -5.0f, 4, 8, 7), PartPose.offsetAndRotation(4.0f, -6.0f, 11.0f, 0.06283186f, 0.37699112f, -0.06283186f));
        PartDefinition jointA = neckT.addOrReplaceChild("jointA", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.3f, 1.5f));
        PartDefinition hair_29 = jointA.addOrReplaceChild("hair_29", CubeListBuilder.create().texOffs(67, 73).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.027401669f, -0.37699112f, 2.8902652f));
        PartDefinition jointA_1 = hair_29.addOrReplaceChild("jointA_1", CubeListBuilder.create().texOffs(112, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_30 = jointA_1.addOrReplaceChild("hair_30", CubeListBuilder.create().texOffs(72, 74).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.56897736f, 0.0f, 0.0f));
        PartDefinition jointA_2 = hair_30.addOrReplaceChild("jointA_2", CubeListBuilder.create().texOffs(89, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_31 = jointA_2.addOrReplaceChild("hair_31", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.29670596f, 0.25132743f, 0.0f));
        PartDefinition jointA_3 = hair_31.addOrReplaceChild("jointA_3", CubeListBuilder.create().texOffs(112, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_32 = jointA_3.addOrReplaceChild("hair_32", CubeListBuilder.create().texOffs(8, 75).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.29670596f, 0.0f, 0.0f));
        PartDefinition jointA_4 = hair_32.addOrReplaceChild("jointA_4", CubeListBuilder.create().texOffs(89, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_33 = jointA_4.addOrReplaceChild("hair_33", CubeListBuilder.create().texOffs(13, 76).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.56199604f, 0.0f, 0.0f));
        PartDefinition jointA_5 = hair_33.addOrReplaceChild("jointA_5", CubeListBuilder.create().texOffs(28, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_34 = jointA_5.addOrReplaceChild("hair_34", CubeListBuilder.create().texOffs(77, 76).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.25132743f, 0.0f));
        PartDefinition jointA_6 = hair_34.addOrReplaceChild("jointA_6", CubeListBuilder.create().texOffs(32, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_35 = jointA_6.addOrReplaceChild("hair_35", CubeListBuilder.create().texOffs(85, 76).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.48520154f, 0.0f, 0.0f));
        PartDefinition jointA_7 = hair_35.addOrReplaceChild("jointA_7", CubeListBuilder.create().texOffs(47, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_36 = jointA_7.addOrReplaceChild("hair_36", CubeListBuilder.create().texOffs(18, 77).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.5061455f, 0.0f, 0.0f));
        PartDefinition jointA_8 = hair_36.addOrReplaceChild("jointA_8", CubeListBuilder.create().texOffs(61, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_37 = jointA_8.addOrReplaceChild("hair_37", CubeListBuilder.create().texOffs(54, 77).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.35953784f, 0.0f, 0.0f));
        PartDefinition jointA_9 = hair_37.addOrReplaceChild("jointA_9", CubeListBuilder.create().texOffs(80, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_38 = jointA_9.addOrReplaceChild("hair_38", CubeListBuilder.create().texOffs(59, 78).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.48520154f, 0.0f, 0.0f));
        PartDefinition jointA_10 = hair_38.addOrReplaceChild("jointA_10", CubeListBuilder.create().texOffs(30, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_39 = jointA_10.addOrReplaceChild("hair_39", CubeListBuilder.create().texOffs(67, 78).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition jointA_11 = hair_39.addOrReplaceChild("jointA_11", CubeListBuilder.create().texOffs(27, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_40 = jointA_11.addOrReplaceChild("hair_40", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.7993608f, 0.0f, 0.0f));
        PartDefinition jointA_12 = hair_40.addOrReplaceChild("jointA_12", CubeListBuilder.create().texOffs(61, 28).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_41 = jointA_12.addOrReplaceChild("hair_41", CubeListBuilder.create().texOffs(8, 79).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.7574729f, 0.25132743f, 0.0f));
        PartDefinition neckp_1 = mainbody.addOrReplaceChild("neckp_1", CubeListBuilder.create().texOffs(90, 29).addBox(-4.5f, -4.0f, -3.5f, 8, 11, 10), PartPose.offsetAndRotation(7.0f, -10.0f, 4.1f, -0.045378562f, -0.18849556f, -0.50265485f));
        PartDefinition neckddd_3 = neckp_1.addOrReplaceChild("neckddd_3", CubeListBuilder.create().texOffs(43, 37).addBox(-2.5f, 1.0f, -3.5f, 2, 6, 4), PartPose.offsetAndRotation(4.7f, -3.6f, 0.8f, 0.143117f, 0.12566371f, -0.12566371f));
        PartDefinition jointRL1 = mainbody.addOrReplaceChild("jointRL1", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.5f, 9.4f, 2.6f));
        PartDefinition jointdont_1 = jointRL1.addOrReplaceChild("jointdont_1", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.13962634f, 0.0f));
        PartDefinition leg_2 = jointdont_1.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(26, 14).addBox(-1.5f, -2.0f, -1.5f, 3, 7, 3), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.19896753f, 0.0f, 0.0f));
        PartDefinition jointRL2 = leg_2.addOrReplaceChild("jointRL2", CubeListBuilder.create().texOffs(101, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.0f, 0.0f));
        PartDefinition leg_3 = jointRL2.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(0, 2).addBox(-1.0f, -1.2f, -1.0f, 2, 7, 2), PartPose.offsetAndRotation(0.0f, 1.4f, 0.3f, 0.2617994f, 0.0f, 0.0f));
        PartDefinition neck_3 = mainbody.addOrReplaceChild("neck_3", CubeListBuilder.create().texOffs(0, 14).addBox(-4.0f, -1.5f, -2.0f, 7, 6, 6), PartPose.offsetAndRotation(-4.0f, -12.0f, -2.0f, -0.43982297f, 0.31415927f, 0.0f));
        PartDefinition neck_5 = mainbody.addOrReplaceChild("neck_5", CubeListBuilder.create().texOffs(30, 26).addBox(-2.0f, -5.5f, -2.0f, 4, 11, 4), PartPose.offsetAndRotation(-5.2f, -2.0f, -4.0f, 0.18849556f, 0.50265485f, 0.0f));
        PartDefinition neck_6 = mainbody.addOrReplaceChild("neck_6", CubeListBuilder.create().texOffs(46, 26).addBox(-2.0f, -1.5f, -2.0f, 5, 6, 5), PartPose.offsetAndRotation(-1.0f, -6.6f, -5.7f, -0.18849556f, -0.12566371f, 0.0f));
        PartDefinition neck_8 = mainbody.addOrReplaceChild("neck_8", CubeListBuilder.create().texOffs(35, 47).addBox(-5.0f, -1.5f, -5.0f, 5, 8, 8), PartPose.offsetAndRotation(6.0f, 2.0f, 10.0f, -0.56548667f, 0.31415927f, 0.0f));
        PartDefinition neck = mainbody.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(9, 0).addBox(-2.0f, -1.5f, -2.0f, 8, 7, 7), PartPose.offsetAndRotation(-0.7f, 0.7f, -5.0f, 0.25132743f, 0.0f, 0.0f));
        PartDefinition jointLL1 = mainbody.addOrReplaceChild("jointLL1", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.5f, 9.4f, 2.6f));
        PartDefinition jointdont = jointLL1.addOrReplaceChild("jointdont", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.13962634f, 0.0f));
        PartDefinition leg = jointdont.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(39, 2).addBox(-1.5f, -2.0f, -1.5f, 3, 7, 3), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.19896753f, 0.0f, 0.0f));
        PartDefinition jointLL2 = leg.addOrReplaceChild("jointLL2", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.0f, 0.0f));
        PartDefinition leg_1 = jointLL2.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(117, 0).addBox(-1.0f, -1.2f, -1.0f, 2, 7, 2), PartPose.offsetAndRotation(0.0f, 1.4f, 0.3f, 0.2617994f, 0.0f, 0.0f));
        PartDefinition neckpT = mainbody.addOrReplaceChild("neckpT", CubeListBuilder.create().texOffs(0, 26).addBox(-2.0f, -1.5f, -2.0f, 7, 9, 8), PartPose.offsetAndRotation(5.5f, -8.0f, -5.0f, -0.12566371f, -0.69115037f, 0.0f));
        PartDefinition jointB = neckpT.addOrReplaceChild("jointB", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.0f, 1.3f, -1.5f));
        PartDefinition hair = jointB.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(110, 50).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, (float)Math.PI, 0.18849556f, 0.37699112f));
        PartDefinition jointB_1 = hair.addOrReplaceChild("jointB_1", CubeListBuilder.create().texOffs(117, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_1 = jointB_1.addOrReplaceChild("hair_1", CubeListBuilder.create().texOffs(118, 50).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.56897736f, 0.0f, 0.0f));
        PartDefinition jointB_2 = hair_1.addOrReplaceChild("jointB_2", CubeListBuilder.create().texOffs(121, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_2 = jointB_2.addOrReplaceChild("hair_2", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.29670596f, -0.18849556f, 0.0f));
        PartDefinition jointB_3 = hair_2.addOrReplaceChild("jointB_3", CubeListBuilder.create().texOffs(4, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_3 = jointB_3.addOrReplaceChild("hair_3", CubeListBuilder.create().texOffs(117, 54).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.29670596f, 0.0f, 0.0f));
        PartDefinition jointB_4 = hair_3.addOrReplaceChild("jointB_4", CubeListBuilder.create().texOffs(89, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_4 = jointB_4.addOrReplaceChild("hair_4", CubeListBuilder.create().texOffs(117, 58).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, -0.56199604f, 0.0f, 0.0f));
        PartDefinition jointB_5 = hair_4.addOrReplaceChild("jointB_5", CubeListBuilder.create().texOffs(89, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_5 = jointB_5.addOrReplaceChild("hair_5", CubeListBuilder.create().texOffs(73, 62).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, -0.25132743f, 0.0f));
        PartDefinition jointB_6 = hair_5.addOrReplaceChild("jointB_6", CubeListBuilder.create().texOffs(20, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_6 = jointB_6.addOrReplaceChild("hair_6", CubeListBuilder.create().texOffs(48, 63).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.48520154f, 0.0f, 0.0f));
        PartDefinition jointB_7 = hair_6.addOrReplaceChild("jointB_7", CubeListBuilder.create().texOffs(24, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_7 = jointB_7.addOrReplaceChild("hair_7", CubeListBuilder.create().texOffs(93, 63).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.5061455f, 0.0f, 0.0f));
        PartDefinition jointB_8 = hair_7.addOrReplaceChild("jointB_8", CubeListBuilder.create().texOffs(35, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_8 = jointB_8.addOrReplaceChild("hair_8", CubeListBuilder.create().texOffs(53, 64).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.35953784f, 0.0f, 0.0f));
        PartDefinition jointB_9 = hair_8.addOrReplaceChild("jointB_9", CubeListBuilder.create().texOffs(89, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_9 = jointB_9.addOrReplaceChild("hair_9", CubeListBuilder.create().texOffs(15, 66).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.48520154f, 0.0f, 0.0f));
        PartDefinition jointB_10 = hair_9.addOrReplaceChild("jointB_10", CubeListBuilder.create().texOffs(20, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_10 = jointB_10.addOrReplaceChild("hair_10", CubeListBuilder.create().texOffs(23, 66).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition jointB_11 = hair_10.addOrReplaceChild("jointB_11", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_11 = jointB_11.addOrReplaceChild("hair_11", CubeListBuilder.create().texOffs(115, 71).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.7993608f, 0.0f, 0.0f));
        PartDefinition jointB_12 = hair_11.addOrReplaceChild("jointB_12", CubeListBuilder.create().texOffs(89, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_12 = jointB_12.addOrReplaceChild("hair_12", CubeListBuilder.create().texOffs(17, 72).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.7574729f, 0.25132743f, 0.0f));
        PartDefinition jointB_13 = hair_12.addOrReplaceChild("jointB_13", CubeListBuilder.create().texOffs(20, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_13 = jointB_13.addOrReplaceChild("hair_13", CubeListBuilder.create().texOffs(57, 73).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.9250245f, 0.0f, 0.0f));
        PartDefinition jointB_14 = hair_13.addOrReplaceChild("jointB_14", CubeListBuilder.create().texOffs(89, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 2.0f));
        PartDefinition hair_14 = jointB_14.addOrReplaceChild("hair_14", CubeListBuilder.create().texOffs(61, 73).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.5f, 0.7993608f, 0.0f, 0.0f));
        PartDefinition neckddd_1 = neckpT.addOrReplaceChild("neckddd_1", CubeListBuilder.create().texOffs(8, 2).addBox(-1.5f, 1.0f, -3.5f, 2, 3, 2), PartPose.offsetAndRotation(3.5f, 1.1f, 0.6f, -0.23387411f, 0.06283186f, 0.37699112f));
        PartDefinition neck_4 = mainbody.addOrReplaceChild("neck_4", CubeListBuilder.create().texOffs(89, 20).addBox(-4.0f, -1.5f, -3.0f, 9, 4, 5), PartPose.offsetAndRotation(3.2f, -10.8f, -2.0f, -0.62831855f, -0.31415927f, 0.0f));
        PartDefinition neckpp = mainbody.addOrReplaceChild("neckpp", CubeListBuilder.create().texOffs(0, 45).addBox(-3.5f, -6.0f, -5.5f, 7, 11, 10), PartPose.offsetAndRotation(-1.0f, -11.0f, 8.1f, 0.33161256f, -0.06283186f, 0.06283186f));
        PartDefinition neckddd_4 = neckpp.addOrReplaceChild("neckddd_4", CubeListBuilder.create().texOffs(117, 20).addBox(-2.5f, 1.0f, -2.5f, 3, 6, 2), PartPose.offsetAndRotation(-0.3f, -4.6f, 6.2f, -0.045378562f, 0.12566371f, -0.31415927f));
        PartDefinition neckddd_5 = neckpp.addOrReplaceChild("neckddd_5", CubeListBuilder.create().texOffs(53, 47).addBox(-2.5f, 1.0f, -3.5f, 3, 2, 3), PartPose.offsetAndRotation(0.7f, -8.1f, 3.8f, 0.08028515f, -0.50265485f, -0.12566371f));
        return LayerDefinition.create(mesh, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityParasiteBase parasite = (EntityParasiteBase)entity;
        this.jointLL1.xRot = 0.0f;
        this.jointLL2.xRot = 0.0f;
        this.jointRL1.xRot = 0.0f;
        this.jointRL2.xRot = 0.0f;
        this.mainbody.zRot = 0.0f;
        this.mainbody.y = 0.0f;
        if (!parasite.getStillAni()) {
            float GS = 0.9f;
            float GD = 1.1f;
            this.swingX(this.jointLL1, 0.7f * GS, 1.0f * GD, 1, 0.5f, -0.5f, limbSwing, limbSwingAmount);
            this.swingX(this.jointLL2, 0.7f * GS, 1.0f * GD, 1, -0.5f, 0.5f, limbSwing, limbSwingAmount);
            this.swingX(this.jointRL1, 0.7f * GS, 1.0f * GD, -1, 0.5f, -0.5f, limbSwing, limbSwingAmount);
            this.swingX(this.jointRL2, 0.7f * GS, 1.0f * GD, -1, -0.5f, 0.5f, limbSwing, limbSwingAmount);
            this.swingZ(this.mainbody, 0.7f * GS, 0.3f * GD, -1, limbSwing, limbSwingAmount);
            this.moveY(this.mainbody, 1.4f * GS, 1, limbSwing, limbSwingAmount, 0.07f);
            this.mainbody.xRot = 0.0f;
        }
        float f1 = Mth.sin((float)(ageInTicks * 0.17f)) * 0.02605f;
        float f2 = Mth.sin((float)(ageInTicks * 0.2087f)) * 0.02345065f;
        float f3 = Mth.sin((float)(ageInTicks * 0.197f)) * 0.02534065f;
        float f4 = Mth.sin((float)(ageInTicks * 0.187f)) * 0.02543065f;
        float f5 = Mth.sin((float)(ageInTicks * 0.187f)) * 0.0263065f;
        float f6 = Mth.sin((float)(ageInTicks * 0.187f)) * 0.0256065f;
        float f7 = Mth.sin((float)(ageInTicks * 0.217f)) * 0.02432065f;
        float f8 = Mth.sin((float)(ageInTicks * 0.187f)) * 0.02423065f;
        float f9 = Mth.sin((float)(ageInTicks * 0.197f)) * 0.0223065f;
        this.neck.y = f1;
        this.neck_1.y = f2;
        this.neck_2.y = f3;
        this.neck_3.y = f4;
        this.neck_4.y = f5;
        this.neck_5.y = f6;
        this.neck_6.y = f7;
        this.neck_7.y = f8;
        this.neck_8.y = f9;
        this.neck_9.y = f1;
        this.neck_10.y = f2;
        this.neck_11.y = f3;
        this.neck_12.y = f4;
        this.neck_13.y = f5;
        this.neckp.y = f6;
        this.neckT.y = f7;
        this.neckpT_1.y = f2;
        this.neckpT.y = f9;
        this.neckpp.y = f1;
        this.neckp_1.y = f2;
        f1 = Mth.sin((float)(ageInTicks * 0.117f)) * 0.2605f;
        f2 = Mth.sin((float)(ageInTicks * 0.122087f)) * 0.2345065f;
        f3 = Mth.sin((float)(ageInTicks * 0.1297f)) * 0.2534065f;
        f4 = Mth.sin((float)(ageInTicks * 0.1187f)) * 0.2543065f;
        f5 = Mth.sin((float)(ageInTicks * 0.1287f)) * 0.263065f;
        f6 = Mth.sin((float)(ageInTicks * 0.1387f)) * 0.256065f;
        f7 = Mth.sin((float)(ageInTicks * 0.12217f)) * 0.2432065f;
        f8 = Mth.sin((float)(ageInTicks * 0.1387f)) * 0.2423065f;
        f9 = Mth.sin((float)(ageInTicks * 0.1197f)) * 0.223065f;
        this.jointA.xRot = f1;
        this.jointA_2.xRot = f2;
        this.jointA_3.xRot = f4;
        this.jointA_5.xRot = f3;
        this.jointA_7.xRot = f5;
        this.jointA_9.xRot = f2;
        this.jointB.xRot = f7;
        this.jointB_2.xRot = f6;
        this.jointB_3.xRot = f5;
        this.jointB_5.xRot = f3;
        this.jointB_7.xRot = f9;
        this.jointB_9.xRot = f1;
        this.jointC.xRot = f9;
        this.jointC_2.xRot = f2;
        this.jointC_3.xRot = f6;
        this.jointC_5.xRot = f4;
        this.jointC_7.xRot = f8;
        this.jointC_9.xRot = f3;
        this.underground((EntityParasiteBase)entity, ageInTicks, this.mainbody);
    
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
