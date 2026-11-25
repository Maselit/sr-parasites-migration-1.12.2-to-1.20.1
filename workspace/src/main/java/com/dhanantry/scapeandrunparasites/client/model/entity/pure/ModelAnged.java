package com.dhanantry.scapeandrunparasites.client.model.entity.pure;

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
import com.dhanantry.scapeandrunparasites.entity.monster.pure.EntityAnged;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelAnged extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "anged"), "main");
    private final ModelPart mainbody;
    private final ModelPart tree1;
    private final ModelPart jointFLLX;
    private final ModelPart jointFRLX;
    private final ModelPart jointBL1;
    private final ModelPart top;
    private final ModelPart jointD1;
    private final ModelPart jointD2;
    private final ModelPart tree1_1;
    private final ModelPart tree1_2;
    private final ModelPart taclejointDLB1;
    private final ModelPart taclejointDLF1;
    private final ModelPart taclejointDRB1;
    private final ModelPart taclejointDRF1;
    private final ModelPart poptree1;
    private final ModelPart body1;
    private final ModelPart tentacle;
    private final ModelPart taclejointDLB2;
    private final ModelPart tentacle_1;
    private final ModelPart taclejointDLB3;
    private final ModelPart tentacle_2;
    private final ModelPart taclejointDLB4;
    private final ModelPart tentacle_3;
    private final ModelPart tentacle_4;
    private final ModelPart taclejointDLF2;
    private final ModelPart tentacle_5;
    private final ModelPart taclejointDLF3;
    private final ModelPart tentacle_6;
    private final ModelPart taclejointDLF4;
    private final ModelPart tentacle_7;
    private final ModelPart tentacle_8;
    private final ModelPart taclejointDRB2;
    private final ModelPart tentacle_9;
    private final ModelPart taclejointDRB3;
    private final ModelPart tentacle_10;
    private final ModelPart taclejointDRB4;
    private final ModelPart tentacle_11;
    private final ModelPart tentacle_12;
    private final ModelPart taclejointDRF2;
    private final ModelPart tentacle_13;
    private final ModelPart taclejointDRF3;
    private final ModelPart tentacle_14;
    private final ModelPart taclejointDRF4;
    private final ModelPart tentacle_15;
    private final ModelPart JD;
    private final ModelPart jointFLLY;
    private final ModelPart leg;
    private final ModelPart jointFLL1;
    private final ModelPart leg_1;
    private final ModelPart jointFLL2;
    private final ModelPart leg_2;
    private final ModelPart jointFLL3;
    private final ModelPart leg_3;
    private final ModelPart jointFLL4;
    private final ModelPart decor;
    private final ModelPart decor_1;
    private final ModelPart decor_2;
    private final ModelPart decor_3;
    private final ModelPart decor_4;
    private final ModelPart decor_5;
    private final ModelPart leg_4;
    private final ModelPart jointFLL5;
    private final ModelPart decor_6;
    private final ModelPart leg_5;
    private final ModelPart leg_6;
    private final ModelPart leg_7;
    private final ModelPart leg_8;
    private final ModelPart leg_9;
    private final ModelPart leg_10;
    private final ModelPart leg_11;
    private final ModelPart JD_1;
    private final ModelPart jointFRLY;
    private final ModelPart leg_12;
    private final ModelPart jointFRL1;
    private final ModelPart leg_13;
    private final ModelPart jointFRL2;
    private final ModelPart leg_14;
    private final ModelPart jointFRL3;
    private final ModelPart leg_15;
    private final ModelPart jointFRL4;
    private final ModelPart decor_7;
    private final ModelPart decor_8;
    private final ModelPart decor_9;
    private final ModelPart decor_10;
    private final ModelPart decor_11;
    private final ModelPart decor_12;
    private final ModelPart leg_16;
    private final ModelPart jointFRL5;
    private final ModelPart decor_13;
    private final ModelPart leg_17;
    private final ModelPart leg_18;
    private final ModelPart leg_19;
    private final ModelPart leg_20;
    private final ModelPart leg_21;
    private final ModelPart leg_22;
    private final ModelPart leg_23;
    private final ModelPart JD_2;
    private final ModelPart leg_24;
    private final ModelPart jointBL2;
    private final ModelPart leg_25;
    private final ModelPart jointBL3;
    private final ModelPart leg_26;
    private final ModelPart jointBL4;
    private final ModelPart decor_14;
    private final ModelPart decor_15;
    private final ModelPart leg_27;
    private final ModelPart leg_28;
    private final ModelPart leg_29;
    private final ModelPart leg_30;
    private final ModelPart leg_31;
    private final ModelPart decor_16;
    private final ModelPart decor_17;
    private final ModelPart decor_18;
    private final ModelPart top_1;
    private final ModelPart taclejointUL1;
    private final ModelPart taclejointUR1;
    private final ModelPart tentacle_16;
    private final ModelPart taclejointUL2;
    private final ModelPart tentacle_17;
    private final ModelPart taclejointUL3;
    private final ModelPart tentacle_18;
    private final ModelPart taclejointUL4;
    private final ModelPart tentacle_19;
    private final ModelPart tentacle_20;
    private final ModelPart taclejointUR2;
    private final ModelPart tentacle_21;
    private final ModelPart taclejointUR3;
    private final ModelPart tentacle_22;
    private final ModelPart taclejointUR4;
    private final ModelPart tentacle_23;

    public ModelAnged(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.tree1 = root.getChild("mainbody").getChild("tree1");
        this.jointFLLX = root.getChild("mainbody").getChild("jointFLLX");
        this.jointFRLX = root.getChild("mainbody").getChild("jointFRLX");
        this.jointBL1 = root.getChild("mainbody").getChild("jointBL1");
        this.top = root.getChild("mainbody").getChild("top");
        this.jointD1 = root.getChild("mainbody").getChild("tree1").getChild("jointD1");
        this.jointD2 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2");
        this.tree1_1 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1");
        this.tree1_2 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("tree1_2");
        this.taclejointDLB1 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLB1");
        this.taclejointDLF1 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLF1");
        this.taclejointDRB1 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRB1");
        this.taclejointDRF1 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRF1");
        this.poptree1 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("tree1_2").getChild("poptree1");
        this.body1 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("tree1_2").getChild("poptree1").getChild("body1");
        this.tentacle = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLB1").getChild("tentacle");
        this.taclejointDLB2 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLB1").getChild("tentacle").getChild("taclejointDLB2");
        this.tentacle_1 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLB1").getChild("tentacle").getChild("taclejointDLB2").getChild("tentacle_1");
        this.taclejointDLB3 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLB1").getChild("tentacle").getChild("taclejointDLB2").getChild("tentacle_1").getChild("taclejointDLB3");
        this.tentacle_2 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLB1").getChild("tentacle").getChild("taclejointDLB2").getChild("tentacle_1").getChild("taclejointDLB3").getChild("tentacle_2");
        this.taclejointDLB4 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLB1").getChild("tentacle").getChild("taclejointDLB2").getChild("tentacle_1").getChild("taclejointDLB3").getChild("tentacle_2").getChild("taclejointDLB4");
        this.tentacle_3 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLB1").getChild("tentacle").getChild("taclejointDLB2").getChild("tentacle_1").getChild("taclejointDLB3").getChild("tentacle_2").getChild("taclejointDLB4").getChild("tentacle_3");
        this.tentacle_4 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLF1").getChild("tentacle_4");
        this.taclejointDLF2 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLF1").getChild("tentacle_4").getChild("taclejointDLF2");
        this.tentacle_5 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLF1").getChild("tentacle_4").getChild("taclejointDLF2").getChild("tentacle_5");
        this.taclejointDLF3 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLF1").getChild("tentacle_4").getChild("taclejointDLF2").getChild("tentacle_5").getChild("taclejointDLF3");
        this.tentacle_6 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLF1").getChild("tentacle_4").getChild("taclejointDLF2").getChild("tentacle_5").getChild("taclejointDLF3").getChild("tentacle_6");
        this.taclejointDLF4 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLF1").getChild("tentacle_4").getChild("taclejointDLF2").getChild("tentacle_5").getChild("taclejointDLF3").getChild("tentacle_6").getChild("taclejointDLF4");
        this.tentacle_7 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDLF1").getChild("tentacle_4").getChild("taclejointDLF2").getChild("tentacle_5").getChild("taclejointDLF3").getChild("tentacle_6").getChild("taclejointDLF4").getChild("tentacle_7");
        this.tentacle_8 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRB1").getChild("tentacle_8");
        this.taclejointDRB2 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRB1").getChild("tentacle_8").getChild("taclejointDRB2");
        this.tentacle_9 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRB1").getChild("tentacle_8").getChild("taclejointDRB2").getChild("tentacle_9");
        this.taclejointDRB3 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRB1").getChild("tentacle_8").getChild("taclejointDRB2").getChild("tentacle_9").getChild("taclejointDRB3");
        this.tentacle_10 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRB1").getChild("tentacle_8").getChild("taclejointDRB2").getChild("tentacle_9").getChild("taclejointDRB3").getChild("tentacle_10");
        this.taclejointDRB4 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRB1").getChild("tentacle_8").getChild("taclejointDRB2").getChild("tentacle_9").getChild("taclejointDRB3").getChild("tentacle_10").getChild("taclejointDRB4");
        this.tentacle_11 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRB1").getChild("tentacle_8").getChild("taclejointDRB2").getChild("tentacle_9").getChild("taclejointDRB3").getChild("tentacle_10").getChild("taclejointDRB4").getChild("tentacle_11");
        this.tentacle_12 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRF1").getChild("tentacle_12");
        this.taclejointDRF2 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRF1").getChild("tentacle_12").getChild("taclejointDRF2");
        this.tentacle_13 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRF1").getChild("tentacle_12").getChild("taclejointDRF2").getChild("tentacle_13");
        this.taclejointDRF3 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRF1").getChild("tentacle_12").getChild("taclejointDRF2").getChild("tentacle_13").getChild("taclejointDRF3");
        this.tentacle_14 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRF1").getChild("tentacle_12").getChild("taclejointDRF2").getChild("tentacle_13").getChild("taclejointDRF3").getChild("tentacle_14");
        this.taclejointDRF4 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRF1").getChild("tentacle_12").getChild("taclejointDRF2").getChild("tentacle_13").getChild("taclejointDRF3").getChild("tentacle_14").getChild("taclejointDRF4");
        this.tentacle_15 = root.getChild("mainbody").getChild("tree1").getChild("jointD1").getChild("jointD2").getChild("tree1_1").getChild("taclejointDRF1").getChild("tentacle_12").getChild("taclejointDRF2").getChild("tentacle_13").getChild("taclejointDRF3").getChild("tentacle_14").getChild("taclejointDRF4").getChild("tentacle_15");
        this.JD = root.getChild("mainbody").getChild("jointFLLX").getChild("JD");
        this.jointFLLY = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY");
        this.leg = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg");
        this.jointFLL1 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1");
        this.leg_1 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1");
        this.jointFLL2 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2");
        this.leg_2 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2");
        this.jointFLL3 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3");
        this.leg_3 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3");
        this.jointFLL4 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("jointFLL4");
        this.decor = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("decor");
        this.decor_1 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("decor_1");
        this.decor_2 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("decor_2");
        this.decor_3 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("decor_3");
        this.decor_4 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("decor_4");
        this.decor_5 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("decor_5");
        this.leg_4 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("jointFLL4").getChild("leg_4");
        this.jointFLL5 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("jointFLL4").getChild("leg_4").getChild("jointFLL5");
        this.decor_6 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("jointFLL4").getChild("leg_4").getChild("decor_6");
        this.leg_5 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("jointFLL4").getChild("leg_4").getChild("jointFLL5").getChild("leg_5");
        this.leg_6 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("jointFLL4").getChild("leg_4").getChild("jointFLL5").getChild("leg_5").getChild("leg_6");
        this.leg_7 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("jointFLL4").getChild("leg_4").getChild("jointFLL5").getChild("leg_5").getChild("leg_6").getChild("leg_7");
        this.leg_8 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("jointFLL4").getChild("leg_4").getChild("jointFLL5").getChild("leg_5").getChild("leg_6").getChild("leg_7").getChild("leg_8");
        this.leg_9 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("jointFLL4").getChild("leg_4").getChild("jointFLL5").getChild("leg_5").getChild("leg_6").getChild("leg_7").getChild("leg_9");
        this.leg_10 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("jointFLL4").getChild("leg_4").getChild("jointFLL5").getChild("leg_5").getChild("leg_6").getChild("leg_7").getChild("leg_8").getChild("leg_10");
        this.leg_11 = root.getChild("mainbody").getChild("jointFLLX").getChild("JD").getChild("jointFLLY").getChild("leg").getChild("jointFLL1").getChild("leg_1").getChild("jointFLL2").getChild("leg_2").getChild("jointFLL3").getChild("leg_3").getChild("jointFLL4").getChild("leg_4").getChild("jointFLL5").getChild("leg_5").getChild("leg_6").getChild("leg_7").getChild("leg_9").getChild("leg_11");
        this.JD_1 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1");
        this.jointFRLY = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY");
        this.leg_12 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12");
        this.jointFRL1 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1");
        this.leg_13 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13");
        this.jointFRL2 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2");
        this.leg_14 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14");
        this.jointFRL3 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3");
        this.leg_15 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15");
        this.jointFRL4 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("jointFRL4");
        this.decor_7 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("decor_7");
        this.decor_8 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("decor_8");
        this.decor_9 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("decor_9");
        this.decor_10 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("decor_10");
        this.decor_11 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("decor_11");
        this.decor_12 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("decor_12");
        this.leg_16 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("jointFRL4").getChild("leg_16");
        this.jointFRL5 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("jointFRL4").getChild("leg_16").getChild("jointFRL5");
        this.decor_13 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("jointFRL4").getChild("leg_16").getChild("decor_13");
        this.leg_17 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("jointFRL4").getChild("leg_16").getChild("jointFRL5").getChild("leg_17");
        this.leg_18 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("jointFRL4").getChild("leg_16").getChild("jointFRL5").getChild("leg_17").getChild("leg_18");
        this.leg_19 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("jointFRL4").getChild("leg_16").getChild("jointFRL5").getChild("leg_17").getChild("leg_18").getChild("leg_19");
        this.leg_20 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("jointFRL4").getChild("leg_16").getChild("jointFRL5").getChild("leg_17").getChild("leg_18").getChild("leg_19").getChild("leg_20");
        this.leg_21 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("jointFRL4").getChild("leg_16").getChild("jointFRL5").getChild("leg_17").getChild("leg_18").getChild("leg_19").getChild("leg_21");
        this.leg_22 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("jointFRL4").getChild("leg_16").getChild("jointFRL5").getChild("leg_17").getChild("leg_18").getChild("leg_19").getChild("leg_20").getChild("leg_22");
        this.leg_23 = root.getChild("mainbody").getChild("jointFRLX").getChild("JD_1").getChild("jointFRLY").getChild("leg_12").getChild("jointFRL1").getChild("leg_13").getChild("jointFRL2").getChild("leg_14").getChild("jointFRL3").getChild("leg_15").getChild("jointFRL4").getChild("leg_16").getChild("jointFRL5").getChild("leg_17").getChild("leg_18").getChild("leg_19").getChild("leg_21").getChild("leg_23");
        this.JD_2 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2");
        this.leg_24 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24");
        this.jointBL2 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2");
        this.leg_25 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25");
        this.jointBL3 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3");
        this.leg_26 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3").getChild("leg_26");
        this.jointBL4 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3").getChild("leg_26").getChild("jointBL4");
        this.decor_14 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3").getChild("leg_26").getChild("decor_14");
        this.decor_15 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3").getChild("leg_26").getChild("decor_15");
        this.leg_27 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3").getChild("leg_26").getChild("jointBL4").getChild("leg_27");
        this.leg_28 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3").getChild("leg_26").getChild("jointBL4").getChild("leg_27").getChild("leg_28");
        this.leg_29 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3").getChild("leg_26").getChild("jointBL4").getChild("leg_27").getChild("leg_28").getChild("leg_29");
        this.leg_30 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3").getChild("leg_26").getChild("jointBL4").getChild("leg_27").getChild("leg_28").getChild("leg_29").getChild("leg_30");
        this.leg_31 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3").getChild("leg_26").getChild("jointBL4").getChild("leg_27").getChild("leg_28").getChild("leg_29").getChild("leg_30").getChild("leg_31");
        this.decor_16 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3").getChild("leg_26").getChild("decor_14").getChild("decor_16");
        this.decor_17 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3").getChild("leg_26").getChild("decor_14").getChild("decor_17");
        this.decor_18 = root.getChild("mainbody").getChild("jointBL1").getChild("JD_2").getChild("leg_24").getChild("jointBL2").getChild("leg_25").getChild("jointBL3").getChild("leg_26").getChild("decor_15").getChild("decor_18");
        this.top_1 = root.getChild("mainbody").getChild("top").getChild("top_1");
        this.taclejointUL1 = root.getChild("mainbody").getChild("top").getChild("taclejointUL1");
        this.taclejointUR1 = root.getChild("mainbody").getChild("top").getChild("taclejointUR1");
        this.tentacle_16 = root.getChild("mainbody").getChild("top").getChild("taclejointUL1").getChild("tentacle_16");
        this.taclejointUL2 = root.getChild("mainbody").getChild("top").getChild("taclejointUL1").getChild("tentacle_16").getChild("taclejointUL2");
        this.tentacle_17 = root.getChild("mainbody").getChild("top").getChild("taclejointUL1").getChild("tentacle_16").getChild("taclejointUL2").getChild("tentacle_17");
        this.taclejointUL3 = root.getChild("mainbody").getChild("top").getChild("taclejointUL1").getChild("tentacle_16").getChild("taclejointUL2").getChild("tentacle_17").getChild("taclejointUL3");
        this.tentacle_18 = root.getChild("mainbody").getChild("top").getChild("taclejointUL1").getChild("tentacle_16").getChild("taclejointUL2").getChild("tentacle_17").getChild("taclejointUL3").getChild("tentacle_18");
        this.taclejointUL4 = root.getChild("mainbody").getChild("top").getChild("taclejointUL1").getChild("tentacle_16").getChild("taclejointUL2").getChild("tentacle_17").getChild("taclejointUL3").getChild("tentacle_18").getChild("taclejointUL4");
        this.tentacle_19 = root.getChild("mainbody").getChild("top").getChild("taclejointUL1").getChild("tentacle_16").getChild("taclejointUL2").getChild("tentacle_17").getChild("taclejointUL3").getChild("tentacle_18").getChild("taclejointUL4").getChild("tentacle_19");
        this.tentacle_20 = root.getChild("mainbody").getChild("top").getChild("taclejointUR1").getChild("tentacle_20");
        this.taclejointUR2 = root.getChild("mainbody").getChild("top").getChild("taclejointUR1").getChild("tentacle_20").getChild("taclejointUR2");
        this.tentacle_21 = root.getChild("mainbody").getChild("top").getChild("taclejointUR1").getChild("tentacle_20").getChild("taclejointUR2").getChild("tentacle_21");
        this.taclejointUR3 = root.getChild("mainbody").getChild("top").getChild("taclejointUR1").getChild("tentacle_20").getChild("taclejointUR2").getChild("tentacle_21").getChild("taclejointUR3");
        this.tentacle_22 = root.getChild("mainbody").getChild("top").getChild("taclejointUR1").getChild("tentacle_20").getChild("taclejointUR2").getChild("tentacle_21").getChild("taclejointUR3").getChild("tentacle_22");
        this.taclejointUR4 = root.getChild("mainbody").getChild("top").getChild("taclejointUR1").getChild("tentacle_20").getChild("taclejointUR2").getChild("tentacle_21").getChild("taclejointUR3").getChild("tentacle_22").getChild("taclejointUR4");
        this.tentacle_23 = root.getChild("mainbody").getChild("top").getChild("taclejointUR1").getChild("tentacle_20").getChild("taclejointUR2").getChild("tentacle_21").getChild("taclejointUR3").getChild("tentacle_22").getChild("taclejointUR4").getChild("tentacle_23");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5f, 0.0f, -4.0f, 7, 4, 6), PartPose.offset(0.0f, -16.3f, 0.0f));
        PartDefinition jointFRLX = mainbody.addOrReplaceChild("jointFRLX", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.0f, -5.0f, -4.5f));
        PartDefinition JD_1 = jointFRLX.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(50, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 2.3561945f, 0.0f));
        PartDefinition jointFRLY = JD_1.addOrReplaceChild("jointFRLY", CubeListBuilder.create().texOffs(66, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_12 = jointFRLY.addOrReplaceChild("leg_12", CubeListBuilder.create().texOffs(180, 38).addBox(0.0f, -1.5f, -1.5f, 13, 3, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.55850536f));
        PartDefinition jointFRL1 = leg_12.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(155, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(13.0f, 0.0f, 0.0f));
        PartDefinition leg_13 = jointFRL1.addOrReplaceChild("leg_13", CubeListBuilder.create().texOffs(212, 39).addBox(-0.5f, -1.5f, -2.0f, 13, 3, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.7976891f));
        PartDefinition jointFRL2 = leg_13.addOrReplaceChild("jointFRL2", CubeListBuilder.create().texOffs(50, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.0f, 0.0f, 0.0f));
        PartDefinition leg_14 = jointFRL2.addOrReplaceChild("leg_14", CubeListBuilder.create().texOffs(87, 40).addBox(0.0f, -1.5f, -1.5f, 9, 3, 3), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.8325957f));
        PartDefinition jointFRL3 = leg_14.addOrReplaceChild("jointFRL3", CubeListBuilder.create().texOffs(54, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 0.0f, 0.0f));
        PartDefinition leg_15 = jointFRL3.addOrReplaceChild("leg_15", CubeListBuilder.create().texOffs(106, 41).addBox(0.0f, -2.0f, -2.5f, 14, 4, 5), PartPose.offsetAndRotation(1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 1.9547688f));
        PartDefinition decor_8 = leg_15.addOrReplaceChild("decor_8", CubeListBuilder.create().texOffs(218, 26).addBox(-2.5f, -1.0f, -2.0f, 4, 2, 4), PartPose.offsetAndRotation(1.0f, -1.5f, 2.0f, -0.6981317f, 0.0f, 0.0f));
        PartDefinition jointFRL4 = leg_15.addOrReplaceChild("jointFRL4", CubeListBuilder.create().texOffs(58, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 0.0f, 0.0f));
        PartDefinition leg_16 = jointFRL4.addOrReplaceChild("leg_16", CubeListBuilder.create().texOffs(144, 42).addBox(-1.0f, -1.5f, -2.0f, 11, 3, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.08726646f));
        PartDefinition decor_13 = leg_16.addOrReplaceChild("decor_13", CubeListBuilder.create().texOffs(15, 43).addBox(-2.5f, -1.0f, -1.5f, 7, 2, 3), PartPose.offset(5.0f, -2.0f, 0.0f));
        PartDefinition jointFRL5 = leg_16.addOrReplaceChild("jointFRL5", CubeListBuilder.create().texOffs(62, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.0f, 0.0f, 0.0f));
        PartDefinition leg_17 = jointFRL5.addOrReplaceChild("leg_17", CubeListBuilder.create().texOffs(171, 46).addBox(0.0f, -1.0f, -1.5f, 19, 2, 3), PartPose.offsetAndRotation(-0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.15707964f));
        PartDefinition leg_18 = leg_17.addOrReplaceChild("leg_18", CubeListBuilder.create().texOffs(156, 20).addBox(0.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(18.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4712389f));
        PartDefinition leg_19 = leg_18.addOrReplaceChild("leg_19", CubeListBuilder.create().texOffs(0, 23).addBox(0.0f, -1.0f, -1.5f, 4, 2, 3), PartPose.offsetAndRotation(6.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0646509f));
        PartDefinition leg_20 = leg_19.addOrReplaceChild("leg_20", CubeListBuilder.create().texOffs(180, 7).addBox(0.0f, -1.0f, -1.0f, 2, 2, 1), PartPose.offsetAndRotation(3.0f, 0.0f, -0.5f, 0.0f, 0.5235988f, 1.0646509f));
        PartDefinition leg_22 = leg_20.addOrReplaceChild("leg_22", CubeListBuilder.create().texOffs(214, 6).addBox(0.0f, -0.5f, -1.0f, 3, 1, 1), PartPose.offsetAndRotation(1.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.31415927f));
        PartDefinition leg_21 = leg_19.addOrReplaceChild("leg_21", CubeListBuilder.create().texOffs(246, 7).addBox(0.0f, -1.0f, -1.0f, 2, 2, 1), PartPose.offsetAndRotation(3.0f, 0.0f, 1.5f, 0.0f, -0.5235988f, 1.0646509f));
        PartDefinition leg_23 = leg_21.addOrReplaceChild("leg_23", CubeListBuilder.create().texOffs(58, 8).addBox(0.0f, -0.5f, -1.0f, 3, 1, 1), PartPose.offsetAndRotation(1.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.31415927f));
        PartDefinition decor_10 = leg_15.addOrReplaceChild("decor_10", CubeListBuilder.create().texOffs(0, 40).addBox(-2.5f, -1.0f, -2.0f, 5, 2, 4), PartPose.offsetAndRotation(6.0f, -1.5f, 2.0f, -0.6981317f, 0.0f, 0.0f));
        PartDefinition decor_11 = leg_15.addOrReplaceChild("decor_11", CubeListBuilder.create().texOffs(42, 42).addBox(-2.5f, -1.0f, -2.0f, 6, 2, 4), PartPose.offsetAndRotation(12.0f, -1.5f, -2.0f, 0.6981317f, 0.0f, 0.0f));
        PartDefinition decor_12 = leg_15.addOrReplaceChild("decor_12", CubeListBuilder.create().texOffs(62, 42).addBox(-2.5f, -1.0f, -2.0f, 6, 2, 4), PartPose.offsetAndRotation(12.0f, -1.5f, 2.0f, -0.6981317f, 0.0f, 0.0f));
        PartDefinition decor_9 = leg_15.addOrReplaceChild("decor_9", CubeListBuilder.create().texOffs(84, 29).addBox(-2.5f, -1.0f, -2.0f, 5, 2, 4), PartPose.offsetAndRotation(6.0f, -1.5f, -2.0f, 0.6981317f, 0.0f, 0.0f));
        PartDefinition decor_7 = leg_15.addOrReplaceChild("decor_7", CubeListBuilder.create().texOffs(196, 20).addBox(-2.5f, -1.0f, -2.0f, 4, 2, 4), PartPose.offsetAndRotation(1.0f, -1.5f, -2.0f, 0.6981317f, 0.0f, 0.0f));
        PartDefinition top = mainbody.addOrReplaceChild("top", CubeListBuilder.create().texOffs(58, 0).addBox(-5.0f, 0.0f, -5.0f, 10, 8, 12), PartPose.offsetAndRotation(0.0f, -6.0f, 0.0f, -0.40142572f, 0.0f, 0.0f));
        PartDefinition top_1 = top.addOrReplaceChild("top_1", CubeListBuilder.create().texOffs(32, 57).addBox(-3.5f, 0.0f, -5.0f, 7, 5, 10), PartPose.offsetAndRotation(0.0f, -2.0f, 2.3f, -0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointUR1 = top.addOrReplaceChild("taclejointUR1", CubeListBuilder.create().texOffs(182, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-3.0f, 5.2f, 2.0f, 0.0f, -1.3962634f, 0.0f));
        PartDefinition tentacle_20 = taclejointUR1.addOrReplaceChild("tentacle_20", CubeListBuilder.create().texOffs(90, 60).addBox(-2.0f, -2.0f, 0.0f, 4, 4, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.29670596f, 0.0f, -0.2617994f));
        PartDefinition taclejointUR2 = tentacle_20.addOrReplaceChild("taclejointUR2", CubeListBuilder.create().texOffs(18, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tentacle_21 = taclejointUR2.addOrReplaceChild("tentacle_21", CubeListBuilder.create().texOffs(184, 61).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.43633232f, 0.0f, 0.0f));
        PartDefinition taclejointUR3 = tentacle_21.addOrReplaceChild("taclejointUR3", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_22 = taclejointUR3.addOrReplaceChild("tentacle_22", CubeListBuilder.create().texOffs(214, 61).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.2617994f, 0.0f, 0.0f));
        PartDefinition taclejointUR4 = tentacle_22.addOrReplaceChild("taclejointUR4", CubeListBuilder.create().texOffs(62, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 12.0f));
        PartDefinition tentacle_23 = taclejointUR4.addOrReplaceChild("tentacle_23", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.43633232f, 0.0f, 0.0f));
        PartDefinition taclejointUL1 = top.addOrReplaceChild("taclejointUL1", CubeListBuilder.create().texOffs(48, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(3.0f, 5.2f, 2.0f, 0.0f, 1.3962634f, 0.0f));
        PartDefinition tentacle_16 = taclejointUL1.addOrReplaceChild("tentacle_16", CubeListBuilder.create().texOffs(72, 54).addBox(-2.0f, -2.0f, 0.0f, 4, 4, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.29670596f, 0.0f, 0.2617994f));
        PartDefinition taclejointUL2 = tentacle_16.addOrReplaceChild("taclejointUL2", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tentacle_17 = taclejointUL2.addOrReplaceChild("tentacle_17", CubeListBuilder.create().texOffs(118, 56).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.43633232f, 0.0f, 0.0f));
        PartDefinition taclejointUL3 = tentacle_17.addOrReplaceChild("taclejointUL3", CubeListBuilder.create().texOffs(18, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_18 = taclejointUL3.addOrReplaceChild("tentacle_18", CubeListBuilder.create().texOffs(134, 59).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.2617994f, 0.0f, 0.0f));
        PartDefinition taclejointUL4 = tentacle_18.addOrReplaceChild("taclejointUL4", CubeListBuilder.create().texOffs(58, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 12.0f));
        PartDefinition tentacle_19 = taclejointUL4.addOrReplaceChild("tentacle_19", CubeListBuilder.create().texOffs(150, 59).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.43633232f, 0.0f, 0.0f));
        PartDefinition jointFLLX = mainbody.addOrReplaceChild("jointFLLX", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, -5.0f, -4.5f));
        PartDefinition JD = jointFLLX.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(222, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition jointFLLY = JD.addOrReplaceChild("jointFLLY", CubeListBuilder.create().texOffs(28, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg = jointFLLY.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(0, 28).addBox(0.0f, -1.5f, -1.5f, 13, 3, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.55850536f));
        PartDefinition jointFLL1 = leg.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(50, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(13.0f, 0.0f, 0.0f));
        PartDefinition leg_1 = jointFLL1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(166, 29).addBox(-0.5f, -1.5f, -2.0f, 13, 3, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.7976891f));
        PartDefinition jointFLL2 = leg_1.addOrReplaceChild("jointFLL2", CubeListBuilder.create().texOffs(66, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(12.0f, 0.0f, 0.0f));
        PartDefinition leg_2 = jointFLL2.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(90, 6).addBox(0.0f, -1.5f, -1.5f, 9, 3, 3), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.8325957f));
        PartDefinition jointFLL3 = leg_2.addOrReplaceChild("jointFLL3", CubeListBuilder.create().texOffs(222, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.0f, 0.0f, 0.0f));
        PartDefinition leg_3 = jointFLL3.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(98, 31).addBox(0.0f, -2.0f, -2.5f, 14, 4, 5), PartPose.offsetAndRotation(1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 1.9547688f));
        PartDefinition decor_5 = leg_3.addOrReplaceChild("decor_5", CubeListBuilder.create().texOffs(0, 34).addBox(-2.5f, -1.0f, -2.0f, 6, 2, 4), PartPose.offsetAndRotation(12.0f, -1.5f, 2.0f, -0.6981317f, 0.0f, 0.0f));
        PartDefinition decor_1 = leg_3.addOrReplaceChild("decor_1", CubeListBuilder.create().texOffs(196, 14).addBox(-2.5f, -1.0f, -2.0f, 4, 2, 4), PartPose.offsetAndRotation(1.0f, -1.5f, 2.0f, -0.6981317f, 0.0f, 0.0f));
        PartDefinition jointFLL4 = leg_3.addOrReplaceChild("jointFLL4", CubeListBuilder.create().texOffs(247, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 0.0f, 0.0f));
        PartDefinition leg_4 = jointFLL4.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(16, 36).addBox(-1.0f, -1.5f, -2.0f, 11, 3, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.08726646f));
        PartDefinition jointFLL5 = leg_4.addOrReplaceChild("jointFLL5", CubeListBuilder.create().texOffs(251, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(10.0f, 0.0f, 0.0f));
        PartDefinition leg_5 = jointFLL5.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(46, 37).addBox(0.0f, -1.0f, -1.5f, 19, 2, 3), PartPose.offsetAndRotation(-0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.15707964f));
        PartDefinition leg_6 = leg_5.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(84, 20).addBox(0.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(18.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4712389f));
        PartDefinition leg_7 = leg_6.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(48, 20).addBox(0.0f, -1.0f, -1.5f, 4, 2, 3), PartPose.offsetAndRotation(6.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0646509f));
        PartDefinition leg_9 = leg_7.addOrReplaceChild("leg_9", CubeListBuilder.create().texOffs(180, 4).addBox(0.0f, -1.0f, -1.0f, 2, 2, 1), PartPose.offsetAndRotation(3.0f, 0.0f, 1.5f, 0.0f, -0.5235988f, 1.0646509f));
        PartDefinition leg_11 = leg_9.addOrReplaceChild("leg_11", CubeListBuilder.create().texOffs(246, 5).addBox(0.0f, -0.5f, -1.0f, 3, 1, 1), PartPose.offsetAndRotation(1.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.31415927f));
        PartDefinition leg_8 = leg_7.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(28, 4).addBox(0.0f, -1.0f, -1.0f, 2, 2, 1), PartPose.offsetAndRotation(3.0f, 0.0f, -0.5f, 0.0f, 0.5235988f, 1.0646509f));
        PartDefinition leg_10 = leg_8.addOrReplaceChild("leg_10", CubeListBuilder.create().texOffs(214, 4).addBox(0.0f, -0.5f, -1.0f, 3, 1, 1), PartPose.offsetAndRotation(1.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.31415927f));
        PartDefinition decor_6 = leg_4.addOrReplaceChild("decor_6", CubeListBuilder.create().texOffs(138, 5).addBox(-2.5f, -1.0f, -1.5f, 7, 2, 3), PartPose.offset(5.0f, -2.0f, 0.0f));
        PartDefinition decor_2 = leg_3.addOrReplaceChild("decor_2", CubeListBuilder.create().texOffs(112, 16).addBox(-2.5f, -1.0f, -2.0f, 5, 2, 4), PartPose.offsetAndRotation(6.0f, -1.5f, -2.0f, 0.6981317f, 0.0f, 0.0f));
        PartDefinition decor_4 = leg_3.addOrReplaceChild("decor_4", CubeListBuilder.create().texOffs(28, 30).addBox(-2.5f, -1.0f, -2.0f, 6, 2, 4), PartPose.offsetAndRotation(12.0f, -1.5f, -2.0f, 0.6981317f, 0.0f, 0.0f));
        PartDefinition decor_3 = leg_3.addOrReplaceChild("decor_3", CubeListBuilder.create().texOffs(230, 16).addBox(-2.5f, -1.0f, -2.0f, 5, 2, 4), PartPose.offsetAndRotation(6.0f, -1.5f, 2.0f, -0.6981317f, 0.0f, 0.0f));
        PartDefinition decor = leg_3.addOrReplaceChild("decor", CubeListBuilder.create().texOffs(156, 14).addBox(-2.5f, -1.0f, -2.0f, 4, 2, 4), PartPose.offsetAndRotation(1.0f, -1.5f, -2.0f, 0.6981317f, 0.0f, 0.0f));
        PartDefinition jointBL1 = mainbody.addOrReplaceChild("jointBL1", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -2.3f, 4.0f));
        PartDefinition JD_2 = jointBL1.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(66, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -1.5707964f, 0.0f));
        PartDefinition leg_24 = JD_2.addOrReplaceChild("leg_24", CubeListBuilder.create().texOffs(79, 46).addBox(0.0f, -1.5f, -1.5f, 7, 3, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.55850536f));
        PartDefinition jointBL2 = leg_24.addOrReplaceChild("jointBL2", CubeListBuilder.create().texOffs(66, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.0f, 0.0f, 0.0f));
        PartDefinition leg_25 = jointBL2.addOrReplaceChild("leg_25", CubeListBuilder.create().texOffs(215, 46).addBox(0.0f, -2.0f, -2.0f, 15, 4, 4), PartPose.offsetAndRotation(-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.6231562f));
        PartDefinition jointBL3 = leg_25.addOrReplaceChild("jointBL3", CubeListBuilder.create().texOffs(186, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(14.0f, 0.0f, 0.0f));
        PartDefinition leg_26 = jointBL3.addOrReplaceChild("leg_26", CubeListBuilder.create().texOffs(0, 48).addBox(0.0f, -1.5f, -2.5f, 27, 4, 5), PartPose.offsetAndRotation(1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 2.3387413f));
        PartDefinition decor_15 = leg_26.addOrReplaceChild("decor_15", CubeListBuilder.create().texOffs(92, 50).addBox(-2.5f, -1.5f, -3.5f, 12, 3, 7), PartPose.offset(15.0f, -2.0f, 0.0f));
        PartDefinition decor_18 = decor_15.addOrReplaceChild("decor_18", CubeListBuilder.create().texOffs(20, 57).addBox(-2.0f, -1.5f, -1.5f, 8, 3, 3), PartPose.offsetAndRotation(1.5f, -1.0f, 0.0f, 0.7853982f, 0.0f, 0.0f));
        PartDefinition decor_14 = leg_26.addOrReplaceChild("decor_14", CubeListBuilder.create().texOffs(137, 49).addBox(-2.5f, -1.5f, -3.5f, 12, 3, 7), PartPose.offset(2.0f, -2.0f, 0.0f));
        PartDefinition decor_17 = decor_14.addOrReplaceChild("decor_17", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0f, -1.5f, -1.5f, 7, 3, 3), PartPose.offsetAndRotation(1.5f, -1.5f, 0.0f, 0.7853982f, 0.0f, 0.0f));
        PartDefinition decor_16 = decor_14.addOrReplaceChild("decor_16", CubeListBuilder.create().texOffs(58, 55).addBox(-0.5f, -1.5f, -3.0f, 6, 3, 6), PartPose.offsetAndRotation(-1.6f, 0.0f, 0.0f, 0.0f, (float)Math.PI, 0.7330383f));
        PartDefinition jointBL4 = leg_26.addOrReplaceChild("jointBL4", CubeListBuilder.create().texOffs(251, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(27.0f, 0.0f, 0.0f));
        PartDefinition leg_27 = jointBL4.addOrReplaceChild("leg_27", CubeListBuilder.create().texOffs(175, 54).addBox(0.0f, -1.5f, -2.0f, 22, 3, 4), PartPose.offsetAndRotation(-1.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5061455f));
        PartDefinition leg_28 = leg_27.addOrReplaceChild("leg_28", CubeListBuilder.create().texOffs(64, 49).addBox(0.0f, -1.5f, -1.5f, 6, 3, 3), PartPose.offsetAndRotation(21.0f, 0.2f, 0.0f, 0.0f, 0.0f, -0.75049156f));
        PartDefinition leg_29 = leg_28.addOrReplaceChild("leg_29", CubeListBuilder.create().texOffs(227, 54).addBox(0.0f, -1.5f, -2.0f, 6, 3, 4), PartPose.offsetAndRotation(5.2f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0297443f));
        PartDefinition leg_30 = leg_29.addOrReplaceChild("leg_30", CubeListBuilder.create().texOffs(123, 50).addBox(0.0f, -1.5f, -1.5f, 4, 3, 3), PartPose.offsetAndRotation(4.7f, 0.4f, 0.0f, 0.0f, 0.0f, -1.0297443f));
        PartDefinition leg_31 = leg_30.addOrReplaceChild("leg_31", CubeListBuilder.create().texOffs(32, 13).addBox(0.0f, -1.5f, -0.5f, 5, 2, 1), PartPose.offsetAndRotation(3.7f, 1.0f, 0.0f, 0.0f, 0.0f, -0.34906584f));
        PartDefinition tree1 = mainbody.addOrReplaceChild("tree1", CubeListBuilder.create().texOffs(26, 0).addBox(-4.0f, -3.0f, -4.0f, 8, 5, 8), PartPose.offsetAndRotation(0.2f, 3.5f, -1.5f, -0.20943952f, 0.0f, 0.0f));
        PartDefinition jointD1 = tree1.addOrReplaceChild("jointD1", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        PartDefinition jointD2 = jointD1.addOrReplaceChild("jointD2", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.12217305f, 0.0f, 0.12217305f));
        PartDefinition tree1_1 = jointD2.addOrReplaceChild("tree1_1", CubeListBuilder.create().texOffs(102, 0).addBox(-6.0f, 0.0f, -6.0f, 12, 4, 12), PartPose.offset(0.0f, 1.0f, 0.0f));
        PartDefinition tree1_2 = tree1_1.addOrReplaceChild("tree1_2", CubeListBuilder.create().texOffs(150, 0).addBox(-5.0f, 0.0f, -5.0f, 10, 4, 10), PartPose.offsetAndRotation(0.0f, 3.2f, 0.0f, 0.06981317f, 0.0f, 0.06981317f));
        PartDefinition poptree1 = tree1_2.addOrReplaceChild("poptree1", CubeListBuilder.create().texOffs(190, 0).addBox(-4.0f, 0.0f, -4.0f, 8, 6, 8), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, 0.06981317f, 0.0f, 0.06981317f));
        PartDefinition body1 = poptree1.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(222, 0).addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4), PartPose.offsetAndRotation(0.0f, 5.0f, 0.0f, 0.08726646f, 0.0f, 0.08726646f));
        PartDefinition taclejointDLB1 = tree1_1.addOrReplaceChild("taclejointDLB1", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.5f, 5.0f));
        PartDefinition tentacle = taclejointDLB1.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(0, 10).addBox(-2.5f, -2.5f, 0.0f, 5, 5, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition taclejointDLB2 = tentacle.addOrReplaceChild("taclejointDLB2", CubeListBuilder.create().texOffs(148, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tentacle_1 = taclejointDLB2.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(212, 12).addBox(-2.0f, -2.0f, 0.0f, 4, 4, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointDLB3 = tentacle_1.addOrReplaceChild("taclejointDLB3", CubeListBuilder.create().texOffs(180, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tentacle_2 = taclejointDLB3.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(14, 13).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointDLB4 = tentacle_2.addOrReplaceChild("taclejointDLB4", CubeListBuilder.create().texOffs(188, 0).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_3 = taclejointDLB4.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(30, 14).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointDLF1 = tree1_1.addOrReplaceChild("taclejointDLF1", CubeListBuilder.create().texOffs(90, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(3.0f, 4.2f, 0.0f, 0.0f, 0.9948377f, 0.0f));
        PartDefinition tentacle_4 = taclejointDLF1.addOrReplaceChild("tentacle_4", CubeListBuilder.create().texOffs(230, 4).addBox(-2.0f, -2.0f, 0.0f, 4, 4, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.27925268f, 0.0f, 0.0f));
        PartDefinition taclejointDLF2 = tentacle_4.addOrReplaceChild("taclejointDLF2", CubeListBuilder.create().texOffs(214, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tentacle_5 = taclejointDLF2.addOrReplaceChild("tentacle_5", CubeListBuilder.create().texOffs(140, 14).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointDLF3 = tentacle_5.addOrReplaceChild("taclejointDLF3", CubeListBuilder.create().texOffs(234, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tentacle_6 = taclejointDLF3.addOrReplaceChild("tentacle_6", CubeListBuilder.create().texOffs(166, 14).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointDLF4 = tentacle_6.addOrReplaceChild("taclejointDLF4", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_7 = taclejointDLF4.addOrReplaceChild("tentacle_7", CubeListBuilder.create().texOffs(180, 14).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointDRF1 = tree1_1.addOrReplaceChild("taclejointDRF1", CubeListBuilder.create().texOffs(138, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 4.2f, -3.0f, 0.0f, -2.565634f, 0.0f));
        PartDefinition tentacle_12 = taclejointDRF1.addOrReplaceChild("tentacle_12", CubeListBuilder.create().texOffs(202, 26).addBox(-2.0f, -2.0f, 0.0f, 4, 4, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.27925268f, 0.0f, 0.0f));
        PartDefinition taclejointDRF2 = tentacle_12.addOrReplaceChild("taclejointDRF2", CubeListBuilder.create().texOffs(20, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tentacle_13 = taclejointDRF2.addOrReplaceChild("tentacle_13", CubeListBuilder.create().texOffs(226, 26).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointDRF3 = tentacle_13.addOrReplaceChild("taclejointDRF3", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tentacle_14 = taclejointDRF3.addOrReplaceChild("tentacle_14", CubeListBuilder.create().texOffs(136, 27).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointDRF4 = tentacle_14.addOrReplaceChild("taclejointDRF4", CubeListBuilder.create().texOffs(194, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_15 = taclejointDRF4.addOrReplaceChild("tentacle_15", CubeListBuilder.create().texOffs(150, 27).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointDRB1 = tree1_1.addOrReplaceChild("taclejointDRB1", CubeListBuilder.create().texOffs(100, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-5.0f, 3.5f, 0.0f, 0.0f, -1.5707964f, 0.0f));
        PartDefinition tentacle_8 = taclejointDRB1.addOrReplaceChild("tentacle_8", CubeListBuilder.create().texOffs(94, 16).addBox(-2.5f, -2.5f, 0.0f, 5, 5, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition taclejointDRB2 = tentacle_8.addOrReplaceChild("taclejointDRB2", CubeListBuilder.create().texOffs(187, 3).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 6.0f));
        PartDefinition tentacle_9 = taclejointDRB2.addOrReplaceChild("tentacle_9", CubeListBuilder.create().texOffs(120, 17).addBox(-2.0f, -2.0f, 0.0f, 4, 4, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointDRB3 = tentacle_9.addOrReplaceChild("taclejointDRB3", CubeListBuilder.create().texOffs(240, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 8.0f));
        PartDefinition tentacle_10 = taclejointDRB3.addOrReplaceChild("tentacle_10", CubeListBuilder.create().texOffs(50, 20).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 12), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition taclejointDRB4 = tentacle_10.addOrReplaceChild("taclejointDRB4", CubeListBuilder.create().texOffs(248, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 10.0f));
        PartDefinition tentacle_11 = taclejointDRB4.addOrReplaceChild("tentacle_11", CubeListBuilder.create().texOffs(66, 21).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 14), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.4712389f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 256, 85);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        float age2;
        float age1;
        float age;
        float GD;
        float GS;
        EntityAnged parasite = (EntityAnged)entity;
        this.taclejointDLB1.xRot = 0.0f;
        this.taclejointDLB2.xRot = 0.0f;
        this.taclejointDLB3.xRot = 0.0f;
        this.taclejointDLB4.xRot = 0.0f;
        this.taclejointDLF1.xRot = 0.0f;
        this.taclejointDLF2.xRot = 0.0f;
        this.taclejointDLF3.xRot = 0.0f;
        this.taclejointDLF4.xRot = 0.0f;
        this.taclejointUL1.xRot = 0.0f;
        this.taclejointUL2.xRot = 0.0f;
        this.taclejointUL3.xRot = 0.0f;
        this.taclejointUL4.xRot = 0.0f;
        this.taclejointDRB1.xRot = 0.0f;
        this.taclejointDRB2.xRot = 0.0f;
        this.taclejointDRB3.xRot = 0.0f;
        this.taclejointDRB4.xRot = 0.0f;
        this.taclejointDRF1.xRot = 0.0f;
        this.taclejointDRF2.xRot = 0.0f;
        this.taclejointDRF3.xRot = 0.0f;
        this.taclejointDRF4.xRot = 0.0f;
        this.taclejointUR1.xRot = 0.0f;
        this.taclejointUR2.xRot = 0.0f;
        this.taclejointUR3.xRot = 0.0f;
        this.taclejointUR4.xRot = 0.0f;
        this.jointFLLX.yRot = 0.0f;
        this.jointFLLY.zRot = 0.0f;
        this.jointFLL1.zRot = 0.0f;
        this.jointFLL2.zRot = 0.0f;
        this.jointFRLX.yRot = 0.0f;
        this.jointFRLY.zRot = 0.0f;
        this.jointFRL1.zRot = 0.0f;
        this.jointFRL2.zRot = 0.0f;
        this.jointBL1.xRot = 0.0f;
        this.jointBL2.zRot = 0.0f;
        this.jointBL3.zRot = 0.0f;
        this.jointBL4.zRot = 0.0f;
        this.mainbody.xRot = 0.0f;
        this.mainbody.y = 0.0f;
        this.mainbody.x = 0.0f;
        this.mainbody.z = 0.0f;
        this.taclejointUL1.visible = !(parasite.getLeft() == 0.0f);
        this.taclejointUR1.visible = !(parasite.getRight() == 0.0f);
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                GS = 2.5f;
                GD = 0.7f;
                this.swingY(this.jointFLLX, 0.2f * GS, 0.6f * GD, -1, -1.0f, 0.5f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLLY, 0.2f * GS, 0.7f * GD, 1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLL1, 0.2f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLL2, 0.2f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.2f * GS, 0.6f * GD, 1, -1.0f, -0.5f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRLY, 0.2f * GS, 0.7f * GD, 1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRL1, 0.2f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRL2, 0.2f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBL1, 0.2f * GS, 0.4f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBL2, 0.2f * GS, 0.4f * GD, 1, -1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBL3, 0.2f * GS, 0.4f * GD, 1, -1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBL4, 0.2f * GS, 0.6f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.mainbody, 0.2f * GS, 0.4f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.2f * GS, 1, limbSwing, limbSwingAmount, 0.2f);
            }
            age = 0.2f * Mth.sin((float)(ageInTicks * 0.1f + 2.0f)) * 0.3f;
            age1 = 0.2f * Mth.sin((float)(ageInTicks * 0.1f + 4.0f)) * 0.3f;
            age2 = 0.2f * Mth.sin((float)(ageInTicks * 0.1f + 2.0f)) * 0.5f;
            this.taclejointDLB1.xRot = age;
            this.taclejointDLB2.xRot = age;
            this.taclejointDLB3.xRot = age;
            this.taclejointDLB4.xRot = age;
            this.taclejointDLF1.xRot = age1;
            this.taclejointDLF2.xRot = age1;
            this.taclejointDLF3.xRot = age1;
            this.taclejointDLF4.xRot = age1;
            this.taclejointUL1.xRot = age2;
            this.taclejointUL2.xRot = age2;
            this.taclejointUL3.xRot = age2;
            this.taclejointUL4.xRot = age2;
            this.taclejointDRB1.xRot = age;
            this.taclejointDRB2.xRot = age;
            this.taclejointDRB3.xRot = age;
            this.taclejointDRB4.xRot = age;
            this.taclejointDRF1.xRot = age1;
            this.taclejointDRF2.xRot = age1;
            this.taclejointDRF3.xRot = age1;
            this.taclejointDRF4.xRot = age1;
            this.taclejointUR1.xRot = age2;
            this.taclejointUR2.xRot = age2;
            this.taclejointUR3.xRot = age2;
            this.taclejointUR4.xRot = age2;
        } else if (i == 1) {
            if (!parasite.getStillAni()) {
                GS = 1.0f;
                GD = 0.7f;
                this.swingY(this.jointFLLX, 0.2f * GS, 0.6f * GD, -1, -1.0f, 0.5f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLLY, 0.2f * GS, 0.7f * GD, 1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLL1, 0.2f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLL2, 0.2f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.2f * GS, 0.6f * GD, 1, -1.0f, -0.5f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRLY, 0.2f * GS, 0.7f * GD, 1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRL1, 0.2f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRL2, 0.2f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBL1, 0.2f * GS, 0.4f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBL2, 0.2f * GS, 0.4f * GD, 1, -1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBL3, 0.2f * GS, 0.4f * GD, 1, -1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBL4, 0.2f * GS, 0.6f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.mainbody, 0.2f * GS, 0.4f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.2f * GS, 1, limbSwing, limbSwingAmount, 0.2f);
            }
            age = -0.3f + 0.2f * Mth.sin((float)(ageInTicks * 0.1f + 2.0f)) * 0.3f;
            age1 = -0.3f + 0.2f * Mth.sin((float)(ageInTicks * 0.1f + 4.0f)) * 0.3f;
            age2 = -0.3f + 0.2f * Mth.sin((float)(ageInTicks * 0.1f + 2.0f)) * 0.5f;
            this.taclejointDLB1.xRot = age;
            this.taclejointDLB2.xRot = age;
            this.taclejointDLB3.xRot = age;
            this.taclejointDLB4.xRot = age;
            this.taclejointDLF1.xRot = age1;
            this.taclejointDLF2.xRot = age1;
            this.taclejointDLF3.xRot = age1;
            this.taclejointDLF4.xRot = age1;
            this.taclejointUL1.xRot = age2;
            this.taclejointUL2.xRot = age2;
            this.taclejointUL3.xRot = age2;
            this.taclejointUL4.xRot = age2;
            this.taclejointDRB1.xRot = age;
            this.taclejointDRB2.xRot = age;
            this.taclejointDRB3.xRot = age;
            this.taclejointDRB4.xRot = age;
            this.taclejointDRF1.xRot = age1;
            this.taclejointDRF2.xRot = age1;
            this.taclejointDRF3.xRot = age1;
            this.taclejointDRF4.xRot = age1;
            this.taclejointUR1.xRot = age2;
            this.taclejointUR2.xRot = age2;
            this.taclejointUR3.xRot = age2;
            this.taclejointUR4.xRot = age2;
        }
        if (i == 2) {
            if (!parasite.getStillAni()) {
                GS = 1.0f;
                GD = 0.7f;
                this.swingY(this.jointFLLX, 0.2f * GS, 0.6f * GD, -1, -1.0f, 0.5f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLLY, 0.2f * GS, 0.7f * GD, 1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLL1, 0.2f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFLL2, 0.2f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingY(this.jointFRLX, 0.2f * GS, 0.6f * GD, 1, -1.0f, -0.5f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRLY, 0.2f * GS, 0.7f * GD, 1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRL1, 0.2f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointFRL2, 0.2f * GS, 0.2f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBL1, 0.2f * GS, 0.4f * GD, 1, 1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBL2, 0.2f * GS, 0.4f * GD, 1, -1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBL3, 0.2f * GS, 0.4f * GD, 1, -1.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointBL4, 0.2f * GS, 0.6f * GD, 1, 0.0f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.mainbody, 0.2f * GS, 0.4f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.2f * GS, 1, limbSwing, limbSwingAmount, 0.2f);
            }
            age = -0.3f + 0.2f * Mth.sin((float)(ageInTicks * 0.1f + 2.0f)) * 0.3f;
            age1 = -0.3f + 0.2f * Mth.sin((float)(ageInTicks * 0.1f + 4.0f)) * 0.3f;
            age2 = -0.3f + 0.2f * Mth.sin((float)(ageInTicks * 0.1f + 2.0f)) * 0.5f;
            this.taclejointDLB1.xRot = age;
            this.taclejointDLB2.xRot = age;
            this.taclejointDLB3.xRot = age;
            this.taclejointDLB4.xRot = age;
            this.taclejointDLF1.xRot = age1;
            this.taclejointDLF2.xRot = age1;
            this.taclejointDLF3.xRot = age1;
            this.taclejointDLF4.xRot = age1;
            this.taclejointUL1.xRot = age2;
            this.taclejointUL2.xRot = age2;
            this.taclejointUL3.xRot = age2;
            this.taclejointUL4.xRot = age2;
            this.taclejointDRB1.xRot = age;
            this.taclejointDRB2.xRot = age;
            this.taclejointDRB3.xRot = age;
            this.taclejointDRB4.xRot = age;
            this.taclejointDRF1.xRot = age1;
            this.taclejointDRF2.xRot = age1;
            this.taclejointDRF3.xRot = age1;
            this.taclejointDRF4.xRot = age1;
            this.taclejointUR1.xRot = age2;
            this.taclejointUR2.xRot = age2;
            this.taclejointUR3.xRot = age2;
            this.taclejointUR4.xRot = age2;
        } else if (i == 25) {
            float f2 = Mth.cos((float)(ageInTicks * 2.6f)) * 0.01f;
            float f1 = Mth.cos((float)(ageInTicks * 2.27f)) * 0.02f;
            this.mainbody.x = f2;
            this.mainbody.z = f1;
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
