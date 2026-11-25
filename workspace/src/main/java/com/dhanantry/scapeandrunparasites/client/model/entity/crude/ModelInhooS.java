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
import com.dhanantry.scapeandrunparasites.entity.monster.crude.EntityInhooS;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelInhooS extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "inhoos"), "main");
    private final ModelPart mainbody;
    private final ModelPart bodym;
    private final ModelPart jointLAX;
    private final ModelPart jointRAX;
    private final ModelPart jointT;
    private final ModelPart jointN;
    private final ModelPart body;
    private final ModelPart jointFLLX;
    private final ModelPart jointFRLX;
    private final ModelPart body_1;
    private final ModelPart jointBLLX;
    private final ModelPart jointBRLX;
    private final ModelPart JD;
    private final ModelPart jointBLLY;
    private final ModelPart leg;
    private final ModelPart jointBLL1;
    private final ModelPart leg_1;
    private final ModelPart JD_1;
    private final ModelPart jointBRLY;
    private final ModelPart leg_2;
    private final ModelPart jointBRL1;
    private final ModelPart leg_3;
    private final ModelPart body_2;
    private final ModelPart body_3;
    private final ModelPart dec;
    private final ModelPart dec_1;
    private final ModelPart dec_2;
    private final ModelPart dec_3;
    private final ModelPart dec_4;
    private final ModelPart dec_5;
    private final ModelPart dec_6;
    private final ModelPart dec_7;
    private final ModelPart jointH;
    private final ModelPart dec_8;
    private final ModelPart dec_9;
    private final ModelPart dec_10;
    private final ModelPart dec_11;
    private final ModelPart bodyH;
    private final ModelPart jointUM;
    private final ModelPart jointDM;
    private final ModelPart body_4;
    private final ModelPart dec_12;
    private final ModelPart dec_13;
    private final ModelPart dec_14;
    private final ModelPart dec_15;
    private final ModelPart body_5;
    private final ModelPart dec_16;
    private final ModelPart dec_17;
    private final ModelPart dec_18;
    private final ModelPart dec_19;
    private final ModelPart JD_2;
    private final ModelPart jointFLLY;
    private final ModelPart leg_4;
    private final ModelPart jointFLL1;
    private final ModelPart leg_5;
    private final ModelPart JD_3;
    private final ModelPart jointFRLY;
    private final ModelPart leg_6;
    private final ModelPart jointFRL1;
    private final ModelPart leg_7;
    private final ModelPart JD_4;
    private final ModelPart jointLAY;
    private final ModelPart leg_8;
    private final ModelPart jointLA1;
    private final ModelPart leg_9;
    private final ModelPart leg_10;
    private final ModelPart jointLAC2;
    private final ModelPart jointLAC1;
    private final ModelPart body_6;
    private final ModelPart body_7;
    private final ModelPart body_8;
    private final ModelPart body_9;
    private final ModelPart JD_5;
    private final ModelPart jointRAY;
    private final ModelPart leg_11;
    private final ModelPart jointRA1;
    private final ModelPart leg_12;
    private final ModelPart leg_13;
    private final ModelPart jointRAC2;
    private final ModelPart jointRAC1;
    private final ModelPart body_10;
    private final ModelPart body_11;
    private final ModelPart body_12;
    private final ModelPart body_13;

    public ModelInhooS(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.bodym = root.getChild("mainbody").getChild("bodym");
        this.jointLAX = root.getChild("mainbody").getChild("jointLAX");
        this.jointRAX = root.getChild("mainbody").getChild("jointRAX");
        this.jointT = root.getChild("mainbody").getChild("bodym").getChild("jointT");
        this.jointN = root.getChild("mainbody").getChild("bodym").getChild("jointN");
        this.body = root.getChild("mainbody").getChild("bodym").getChild("body");
        this.jointFLLX = root.getChild("mainbody").getChild("bodym").getChild("jointFLLX");
        this.jointFRLX = root.getChild("mainbody").getChild("bodym").getChild("jointFRLX");
        this.body_1 = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1");
        this.jointBLLX = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1").getChild("jointBLLX");
        this.jointBRLX = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1").getChild("jointBRLX");
        this.JD = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1").getChild("jointBLLX").getChild("JD");
        this.jointBLLY = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1").getChild("jointBLLX").getChild("JD").getChild("jointBLLY");
        this.leg = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1").getChild("jointBLLX").getChild("JD").getChild("jointBLLY").getChild("leg");
        this.jointBLL1 = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1").getChild("jointBLLX").getChild("JD").getChild("jointBLLY").getChild("leg").getChild("jointBLL1");
        this.leg_1 = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1").getChild("jointBLLX").getChild("JD").getChild("jointBLLY").getChild("leg").getChild("jointBLL1").getChild("leg_1");
        this.JD_1 = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1").getChild("jointBRLX").getChild("JD_1");
        this.jointBRLY = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1").getChild("jointBRLX").getChild("JD_1").getChild("jointBRLY");
        this.leg_2 = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1").getChild("jointBRLX").getChild("JD_1").getChild("jointBRLY").getChild("leg_2");
        this.jointBRL1 = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1").getChild("jointBRLX").getChild("JD_1").getChild("jointBRLY").getChild("leg_2").getChild("jointBRL1");
        this.leg_3 = root.getChild("mainbody").getChild("bodym").getChild("jointT").getChild("body_1").getChild("jointBRLX").getChild("JD_1").getChild("jointBRLY").getChild("leg_2").getChild("jointBRL1").getChild("leg_3");
        this.body_2 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2");
        this.body_3 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3");
        this.dec = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("dec");
        this.dec_1 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("dec_1");
        this.dec_2 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("dec_2");
        this.dec_3 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("dec_3");
        this.dec_4 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("dec_4");
        this.dec_5 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("dec_5");
        this.dec_6 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("dec_6");
        this.dec_7 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("dec_7");
        this.jointH = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH");
        this.dec_8 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("dec_8");
        this.dec_9 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("dec_9");
        this.dec_10 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("dec_10");
        this.dec_11 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("dec_11");
        this.bodyH = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH");
        this.jointUM = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH").getChild("jointUM");
        this.jointDM = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH").getChild("jointDM");
        this.body_4 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH").getChild("jointUM").getChild("body_4");
        this.dec_12 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH").getChild("jointUM").getChild("body_4").getChild("dec_12");
        this.dec_13 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH").getChild("jointUM").getChild("body_4").getChild("dec_13");
        this.dec_14 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH").getChild("jointUM").getChild("body_4").getChild("dec_14");
        this.dec_15 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH").getChild("jointUM").getChild("body_4").getChild("dec_15");
        this.body_5 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH").getChild("jointDM").getChild("body_5");
        this.dec_16 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH").getChild("jointDM").getChild("body_5").getChild("dec_16");
        this.dec_17 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH").getChild("jointDM").getChild("body_5").getChild("dec_17");
        this.dec_18 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH").getChild("jointDM").getChild("body_5").getChild("dec_18");
        this.dec_19 = root.getChild("mainbody").getChild("bodym").getChild("jointN").getChild("body_2").getChild("body_3").getChild("jointH").getChild("bodyH").getChild("jointDM").getChild("body_5").getChild("dec_19");
        this.JD_2 = root.getChild("mainbody").getChild("bodym").getChild("jointFLLX").getChild("JD_2");
        this.jointFLLY = root.getChild("mainbody").getChild("bodym").getChild("jointFLLX").getChild("JD_2").getChild("jointFLLY");
        this.leg_4 = root.getChild("mainbody").getChild("bodym").getChild("jointFLLX").getChild("JD_2").getChild("jointFLLY").getChild("leg_4");
        this.jointFLL1 = root.getChild("mainbody").getChild("bodym").getChild("jointFLLX").getChild("JD_2").getChild("jointFLLY").getChild("leg_4").getChild("jointFLL1");
        this.leg_5 = root.getChild("mainbody").getChild("bodym").getChild("jointFLLX").getChild("JD_2").getChild("jointFLLY").getChild("leg_4").getChild("jointFLL1").getChild("leg_5");
        this.JD_3 = root.getChild("mainbody").getChild("bodym").getChild("jointFRLX").getChild("JD_3");
        this.jointFRLY = root.getChild("mainbody").getChild("bodym").getChild("jointFRLX").getChild("JD_3").getChild("jointFRLY");
        this.leg_6 = root.getChild("mainbody").getChild("bodym").getChild("jointFRLX").getChild("JD_3").getChild("jointFRLY").getChild("leg_6");
        this.jointFRL1 = root.getChild("mainbody").getChild("bodym").getChild("jointFRLX").getChild("JD_3").getChild("jointFRLY").getChild("leg_6").getChild("jointFRL1");
        this.leg_7 = root.getChild("mainbody").getChild("bodym").getChild("jointFRLX").getChild("JD_3").getChild("jointFRLY").getChild("leg_6").getChild("jointFRL1").getChild("leg_7");
        this.JD_4 = root.getChild("mainbody").getChild("jointLAX").getChild("JD_4");
        this.jointLAY = root.getChild("mainbody").getChild("jointLAX").getChild("JD_4").getChild("jointLAY");
        this.leg_8 = root.getChild("mainbody").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("leg_8");
        this.jointLA1 = root.getChild("mainbody").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("leg_8").getChild("jointLA1");
        this.leg_9 = root.getChild("mainbody").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("leg_8").getChild("jointLA1").getChild("leg_9");
        this.leg_10 = root.getChild("mainbody").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("leg_8").getChild("jointLA1").getChild("leg_9").getChild("leg_10");
        this.jointLAC2 = root.getChild("mainbody").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("leg_8").getChild("jointLA1").getChild("leg_9").getChild("leg_10").getChild("jointLAC2");
        this.jointLAC1 = root.getChild("mainbody").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("leg_8").getChild("jointLA1").getChild("leg_9").getChild("leg_10").getChild("jointLAC1");
        this.body_6 = root.getChild("mainbody").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("leg_8").getChild("jointLA1").getChild("leg_9").getChild("leg_10").getChild("jointLAC2").getChild("body_6");
        this.body_7 = root.getChild("mainbody").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("leg_8").getChild("jointLA1").getChild("leg_9").getChild("leg_10").getChild("jointLAC2").getChild("body_6").getChild("body_7");
        this.body_8 = root.getChild("mainbody").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("leg_8").getChild("jointLA1").getChild("leg_9").getChild("leg_10").getChild("jointLAC1").getChild("body_8");
        this.body_9 = root.getChild("mainbody").getChild("jointLAX").getChild("JD_4").getChild("jointLAY").getChild("leg_8").getChild("jointLA1").getChild("leg_9").getChild("leg_10").getChild("jointLAC1").getChild("body_8").getChild("body_9");
        this.JD_5 = root.getChild("mainbody").getChild("jointRAX").getChild("JD_5");
        this.jointRAY = root.getChild("mainbody").getChild("jointRAX").getChild("JD_5").getChild("jointRAY");
        this.leg_11 = root.getChild("mainbody").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("leg_11");
        this.jointRA1 = root.getChild("mainbody").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("leg_11").getChild("jointRA1");
        this.leg_12 = root.getChild("mainbody").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("leg_11").getChild("jointRA1").getChild("leg_12");
        this.leg_13 = root.getChild("mainbody").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("leg_11").getChild("jointRA1").getChild("leg_12").getChild("leg_13");
        this.jointRAC2 = root.getChild("mainbody").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("leg_11").getChild("jointRA1").getChild("leg_12").getChild("leg_13").getChild("jointRAC2");
        this.jointRAC1 = root.getChild("mainbody").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("leg_11").getChild("jointRA1").getChild("leg_12").getChild("leg_13").getChild("jointRAC1");
        this.body_10 = root.getChild("mainbody").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("leg_11").getChild("jointRA1").getChild("leg_12").getChild("leg_13").getChild("jointRAC2").getChild("body_10");
        this.body_11 = root.getChild("mainbody").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("leg_11").getChild("jointRA1").getChild("leg_12").getChild("leg_13").getChild("jointRAC2").getChild("body_10").getChild("body_11");
        this.body_12 = root.getChild("mainbody").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("leg_11").getChild("jointRA1").getChild("leg_12").getChild("leg_13").getChild("jointRAC1").getChild("body_12");
        this.body_13 = root.getChild("mainbody").getChild("jointRAX").getChild("JD_5").getChild("jointRAY").getChild("leg_11").getChild("jointRA1").getChild("leg_12").getChild("leg_13").getChild("jointRAC1").getChild("body_12").getChild("body_13");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 23.0f, -2.2f));
        PartDefinition jointRAX = mainbody.addOrReplaceChild("jointRAX", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.0f, -2.0f, -2.0f));
        PartDefinition JD_5 = jointRAX.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(59, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.4712389f, 0.0f));
        PartDefinition jointRAY = JD_5.addOrReplaceChild("jointRAY", CubeListBuilder.create().texOffs(13, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_11 = jointRAY.addOrReplaceChild("leg_11", CubeListBuilder.create().texOffs(34, 25).addBox(-5.0f, -1.0f, -0.5f, 5, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.2391838f));
        PartDefinition jointRA1 = leg_11.addOrReplaceChild("jointRA1", CubeListBuilder.create().texOffs(46, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-5.2f, 0.2f, 0.0f));
        PartDefinition leg_12 = jointRA1.addOrReplaceChild("leg_12", CubeListBuilder.create().texOffs(49, 26).addBox(-4.5f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7853982f));
        PartDefinition leg_13 = leg_12.addOrReplaceChild("leg_13", CubeListBuilder.create().texOffs(15, 28).addBox(-5.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(-4.7f, 0.0f, 0.0f, (float)Math.PI, 0.0f, -1.3613569f));
        PartDefinition jointRAC1 = leg_13.addOrReplaceChild("jointRAC1", CubeListBuilder.create().texOffs(20, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.4f, 0.7f, -0.5f));
        PartDefinition body_12 = jointRAC1.addOrReplaceChild("body_12", CubeListBuilder.create().texOffs(34, 28).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 1.5707964f, 0.0f, 0.27925268f));
        PartDefinition body_13 = body_12.addOrReplaceChild("body_13", CubeListBuilder.create().texOffs(39, 28).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 2), PartPose.offsetAndRotation(-0.6f, 0.0f, -2.4f, 0.0f, -2.3561945f, 0.0f));
        PartDefinition jointRAC2 = leg_13.addOrReplaceChild("jointRAC2", CubeListBuilder.create().texOffs(16, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.8f, 0.7f, -0.5f));
        PartDefinition body_10 = jointRAC2.addOrReplaceChild("body_10", CubeListBuilder.create().texOffs(29, 26).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 1.5707964f, 0.0f, 0.62831855f));
        PartDefinition body_11 = body_10.addOrReplaceChild("body_11", CubeListBuilder.create().texOffs(44, 27).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 2), PartPose.offsetAndRotation(-0.6f, 0.0f, -2.0f, 0.0f, -2.0943952f, 0.0f));
        PartDefinition jointLAX = mainbody.addOrReplaceChild("jointLAX", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, -2.0f, -2.0f));
        PartDefinition JD_4 = jointLAX.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(50, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -2.6703537f, 0.0f));
        PartDefinition jointLAY = JD_4.addOrReplaceChild("jointLAY", CubeListBuilder.create().texOffs(57, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_8 = jointLAY.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(16, 23).addBox(-5.0f, -1.0f, -0.5f, 5, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.2391838f));
        PartDefinition jointLA1 = leg_8.addOrReplaceChild("jointLA1", CubeListBuilder.create().texOffs(31, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-5.2f, 0.2f, 0.0f));
        PartDefinition leg_9 = jointLA1.addOrReplaceChild("leg_9", CubeListBuilder.create().texOffs(34, 23).addBox(-4.5f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7853982f));
        PartDefinition leg_10 = leg_9.addOrReplaceChild("leg_10", CubeListBuilder.create().texOffs(46, 23).addBox(-5.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(-4.7f, 0.0f, 0.0f, (float)Math.PI, 0.0f, -1.3613569f));
        PartDefinition jointLAC1 = leg_10.addOrReplaceChild("jointLAC1", CubeListBuilder.create().texOffs(31, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.4f, 0.7f, -0.5f));
        PartDefinition body_8 = jointLAC1.addOrReplaceChild("body_8", CubeListBuilder.create().texOffs(8, 25).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 1.5707964f, 0.0f, 0.27925268f));
        PartDefinition body_9 = body_8.addOrReplaceChild("body_9", CubeListBuilder.create().texOffs(26, 25).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 2), PartPose.offsetAndRotation(-0.6f, 0.0f, -2.4f, 0.0f, -2.3561945f, 0.0f));
        PartDefinition jointLAC2 = leg_10.addOrReplaceChild("jointLAC2", CubeListBuilder.create().texOffs(28, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.8f, 0.7f, -0.5f));
        PartDefinition body_6 = jointLAC2.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.3f, 0.0f, 1.5707964f, 0.0f, 0.62831855f));
        PartDefinition body_7 = body_6.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(5, 25).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 2), PartPose.offsetAndRotation(-0.6f, 0.0f, -2.0f, 0.0f, -2.0943952f, 0.0f));
        PartDefinition bodym = mainbody.addOrReplaceChild("bodym", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -2.0f, -4.0f, 8, 4, 8), PartPose.offsetAndRotation(0.0f, -0.5f, 0.0f, (float)Math.PI, 0.0f, 0.0f));
        PartDefinition jointFLLX = bodym.addOrReplaceChild("jointFLLX", CubeListBuilder.create().texOffs(47, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.4f, 1.8f, -2.7f));
        PartDefinition JD_2 = jointFLLX.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(55, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, (float)Math.PI, -2.7052603f, 0.0f));
        PartDefinition jointFLLY = JD_2.addOrReplaceChild("jointFLLY", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_4 = jointFLLY.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(0, 21).addBox(-7.0f, -0.5f, -0.5f, 7, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9599311f));
        PartDefinition jointFLL1 = leg_4.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(4, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-7.0f, 0.0f, 0.0f));
        PartDefinition leg_5 = jointFLL1.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(16, 21).addBox(-7.0f, -0.5f, -0.5f, 7, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.8849556f));
        PartDefinition jointN = bodym.addOrReplaceChild("jointN", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.0f, -1.0f));
        PartDefinition body_2 = jointN.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(52, 10).addBox(-1.0f, -1.0f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.2617994f, 0.0f, 0.0f));
        PartDefinition dec_4 = body_2.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.0f, 0.7f, -1.1170107f, 0.0f, 0.0f));
        PartDefinition dec = body_2.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(28, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.1170107f));
        PartDefinition dec_7 = body_2.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(28, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.0f, -0.7f, 1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_5 = body_2.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(4, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 3.0f, 0.7f, -1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_1 = body_2.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(52, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(1.0f, 3.0f, 0.0f, 0.0f, 0.0f, -1.1170107f));
        PartDefinition dec_2 = body_2.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(56, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-1.0f, 3.0f, 0.0f, 0.0f, 0.0f, 1.1170107f));
        PartDefinition body_3 = body_2.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0f, -0.1f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(0.0f, 3.7f, 0.0f, 0.36651915f, 0.0f, 0.0f));
        PartDefinition dec_9 = body_3.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-1.0f, 1.4f, 0.0f, 0.0f, 0.0f, 1.1170107f));
        PartDefinition dec_11 = body_3.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(58, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.4f, -0.7f, 1.1170107f, 0.0f, 0.0f));
        PartDefinition jointH = body_3.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(52, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition bodyH = jointH.addOrReplaceChild("bodyH", CubeListBuilder.create().texOffs(12, 13).addBox(-2.0f, -2.0f, -2.0f, 4, 4, 4), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition jointDM = bodyH.addOrReplaceChild("jointDM", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -1.0f, 2.0f));
        PartDefinition body_5 = jointDM.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(39, 17).addBox(-2.5f, -0.5f, 0.0f, 5, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, -0.4f, 0.19198622f, 0.0f, 0.0f));
        PartDefinition dec_19 = body_5.addOrReplaceChild("dec_19", CubeListBuilder.create().texOffs(52, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.7f, 1.0f, 3.2f));
        PartDefinition dec_16 = body_5.addOrReplaceChild("dec_16", CubeListBuilder.create().texOffs(59, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-2.3f, 1.0f, 3.1f, 0.0f, -0.55850536f, 0.0f));
        PartDefinition dec_18 = body_5.addOrReplaceChild("dec_18", CubeListBuilder.create().texOffs(12, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.7f, 1.0f, 3.2f));
        PartDefinition dec_17 = body_5.addOrReplaceChild("dec_17", CubeListBuilder.create().texOffs(8, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(2.3f, 1.0f, 3.1f, 0.0f, 0.55850536f, 0.0f));
        PartDefinition jointUM = bodyH.addOrReplaceChild("jointUM", CubeListBuilder.create().texOffs(24, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 1.0f, 2.0f));
        PartDefinition body_4 = jointUM.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(28, 17).addBox(-2.5f, -0.5f, 0.0f, 5, 1, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -0.4f, 0.31415927f, 0.0f, (float)Math.PI));
        PartDefinition dec_13 = body_4.addOrReplaceChild("dec_13", CubeListBuilder.create().texOffs(46, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(2.2f, 1.0f, 1.9f, 0.0f, 0.55850536f, 0.0f));
        PartDefinition dec_15 = body_4.addOrReplaceChild("dec_15", CubeListBuilder.create().texOffs(8, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.7f, 1.0f, 2.0f));
        PartDefinition dec_12 = body_4.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(42, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-2.2f, 1.0f, 1.9f, 0.0f, -0.55850536f, 0.0f));
        PartDefinition dec_14 = body_4.addOrReplaceChild("dec_14", CubeListBuilder.create().texOffs(47, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.7f, 1.0f, 2.0f));
        PartDefinition dec_8 = body_3.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(8, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(1.0f, 1.4f, 0.0f, 0.0f, 0.0f, -1.1170107f));
        PartDefinition dec_10 = body_3.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(56, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 1.4f, 0.7f, -1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_6 = body_2.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(24, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 3.0f, -0.7f, 1.1170107f, 0.0f, 0.0f));
        PartDefinition dec_3 = body_2.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(59, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.1170107f));
        PartDefinition jointFRLX = bodym.addOrReplaceChild("jointFRLX", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.4f, 1.8f, -2.7f));
        PartDefinition JD_3 = jointFRLX.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(58, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, (float)Math.PI, -0.43633232f, 0.0f));
        PartDefinition jointFRLY = JD_3.addOrReplaceChild("jointFRLY", CubeListBuilder.create().texOffs(31, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_6 = jointFRLY.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(34, 21).addBox(-7.0f, -0.5f, -0.5f, 7, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9599311f));
        PartDefinition jointFRL1 = leg_6.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(54, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-7.0f, 0.0f, 0.0f));
        PartDefinition leg_7 = jointFRL1.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(0, 23).addBox(-7.0f, -0.5f, -0.5f, 7, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.8849556f));
        PartDefinition body = bodym.addOrReplaceChild("body", CubeListBuilder.create().texOffs(32, 0).addBox(-2.5f, -2.5f, -2.5f, 5, 4, 5), PartPose.offsetAndRotation(0.0f, 2.5f, -0.3f, -0.34906584f, 0.0f, 0.0f));
        PartDefinition jointT = bodym.addOrReplaceChild("jointT", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -0.4f, -4.0f));
        PartDefinition body_1 = jointT.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(27, 9).addBox(-2.5f, -0.5f, -0.5f, 5, 3, 5), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, (float)(-Math.PI), 0.0f, 0.0f));
        PartDefinition jointBLLX = body_1.addOrReplaceChild("jointBLLX", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.4f, -0.2f, 1.8f));
        PartDefinition JD = jointBLLX.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 2.268928f, 0.0f));
        PartDefinition jointBLLY = JD.addOrReplaceChild("jointBLLY", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg = jointBLLY.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(24, 2).addBox(-5.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9599311f));
        PartDefinition jointBLL1 = leg.addOrReplaceChild("jointBLL1", CubeListBuilder.create().texOffs(47, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-5.0f, 0.0f, 0.0f));
        PartDefinition leg_1 = jointBLL1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(51, 2).addBox(-5.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.8849556f));
        PartDefinition jointBRLX = body_1.addOrReplaceChild("jointBRLX", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.4f, -0.2f, 1.8f));
        PartDefinition JD_1 = jointBRLX.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.87266463f, 0.0f));
        PartDefinition jointBRLY = JD_1.addOrReplaceChild("jointBRLY", CubeListBuilder.create().texOffs(4, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_2 = jointBRLY.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(51, 8).addBox(-5.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9599311f));
        PartDefinition jointBRL1 = leg_2.addOrReplaceChild("jointBRL1", CubeListBuilder.create().texOffs(24, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-5.0f, 0.0f, 0.0f));
        PartDefinition leg_3 = jointBRL1.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(42, 10).addBox(-5.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.8849556f));
        return LayerDefinition.create(mesh, 64, 35);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityInhooS parasite = (EntityInhooS)entity;
        this.jointBLLX.xRot = 0.0f;
        this.jointBLLY.yRot = 0.0f;
        this.jointBLL1.zRot = 0.0f;
        this.jointBRLX.xRot = 0.0f;
        this.jointBRLY.yRot = 0.0f;
        this.jointBRL1.zRot = 0.0f;
        this.jointFLLX.xRot = 0.0f;
        this.jointFLLY.yRot = 0.0f;
        this.jointFLL1.zRot = 0.0f;
        this.jointFRLX.xRot = 0.0f;
        this.jointFRLY.yRot = 0.0f;
        this.jointFRL1.zRot = 0.0f;
        this.jointLAX.zRot = 0.0f;
        this.jointLA1.zRot = 0.0f;
        this.jointRAX.zRot = 0.0f;
        this.jointRA1.zRot = 0.0f;
        this.jointN.xRot = 0.0f;
        this.jointH.xRot = 0.0f;
        this.jointH.yRot = 0.0f;
        this.jointDM.xRot = 0.0f;
        this.jointUM.xRot = 0.0f;
        limbSwing = parasite.tickCount;
        limbSwingAmount = 0.5f;
        byte i = parasite.getParasiteStatus();
        i = 0;
        if (i == 0) {
            float f1 = Mth.sin((float)(ageInTicks * 0.08f)) * 0.05f;
            float f2 = Mth.sin((float)(ageInTicks * 0.13f)) * 0.1f;
            float f3 = Mth.sin((float)(ageInTicks * 0.2f)) * 0.1f;
            float f4 = Mth.sin((float)(ageInTicks * 0.05f)) * 0.2f;
            float f5 = Mth.sin((float)(ageInTicks * 0.2f)) * 0.2f;
            float f6 = Mth.sin((float)(ageInTicks * 0.05f)) * 0.3f;
            float f7 = Mth.sin((float)(ageInTicks * 0.21f)) * 0.18f;
            float f8 = Mth.sin((float)(ageInTicks * 0.04f)) * 0.32f;
            this.jointBLLX.xRot = f3;
            this.jointBLLY.yRot = f4;
            this.jointBLL1.zRot = f3;
            this.jointBRLX.xRot = -1.0f * f4;
            this.jointBRLY.yRot = -1.0f * f3;
            this.jointBRL1.zRot = -1.0f * f4;
            this.jointFLLX.xRot = f7;
            this.jointFLLY.yRot = f8;
            this.jointFLL1.zRot = f7;
            this.jointFRLX.xRot = -1.0f * f8;
            this.jointFRLY.yRot = -1.0f * f7;
            this.jointFRL1.zRot = -1.0f * f8;
            this.jointLAX.zRot = f5;
            this.jointLA1.zRot = f6;
            this.jointRAX.zRot = -1.0f * f6;
            this.jointRA1.zRot = -1.0f * f5;
            this.jointN.xRot = f1;
            this.jointH.xRot = f3;
            this.jointH.yRot = f2;
            this.jointDM.xRot = f7;
            this.jointUM.xRot = f8;
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

