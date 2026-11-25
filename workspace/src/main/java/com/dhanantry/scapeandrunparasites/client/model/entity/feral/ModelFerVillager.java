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

public class ModelFerVillager extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "fervillager"), "main");
    private final ModelPart mainbody;
    private final ModelPart body;
    private final ModelPart hip;
    private final ModelPart jointLA;
    private final ModelPart jointRA;
    private final ModelPart body_1;
    private final ModelPart body_2;
    private final ModelPart b;
    private final ModelPart body_3;
    private final ModelPart body_4;
    private final ModelPart body_5;
    private final ModelPart body_6;
    private final ModelPart body_7;
    private final ModelPart neck;
    private final ModelPart mouthTR;
    private final ModelPart jointM;
    private final ModelPart jointH;
    private final ModelPart head;
    private final ModelPart teeth;
    private final ModelPart teeth_1;
    private final ModelPart teeth_2;
    private final ModelPart teeth_3;
    private final ModelPart teeth_4;
    private final ModelPart teeth_5;
    private final ModelPart nose;
    private final ModelPart mouth;
    private final ModelPart jointRR1;
    private final ModelPart jointRL1;
    private final ModelPart jointRM1;
    private final ModelPart dec;
    private final ModelPart joinRR2;
    private final ModelPart JD;
    private final ModelPart dec_1;
    private final ModelPart jointRR3;
    private final ModelPart JD_1;
    private final ModelPart dec_2;
    private final ModelPart jointRR4;
    private final ModelPart dec_3;
    private final ModelPart dec_4;
    private final ModelPart joinRL2;
    private final ModelPart JD_2;
    private final ModelPart dec_5;
    private final ModelPart jointRL3;
    private final ModelPart JD_3;
    private final ModelPart dec_6;
    private final ModelPart jointRL4;
    private final ModelPart dec_7;
    private final ModelPart dec_8;
    private final ModelPart joinRM2;
    private final ModelPart JD_4;
    private final ModelPart dec_9;
    private final ModelPart jointRM3;
    private final ModelPart JD_5;
    private final ModelPart dec_10;
    private final ModelPart jointRM4;
    private final ModelPart dec_11;
    private final ModelPart mouth_1;
    private final ModelPart teeth_6;
    private final ModelPart teeth_7;
    private final ModelPart teeth_8;
    private final ModelPart teeth_9;
    private final ModelPart teeth_10;
    private final ModelPart teeth_11;
    private final ModelPart teeth_12;
    private final ModelPart jointLL;
    private final ModelPart jointRL;
    private final ModelPart jointdont;
    private final ModelPart leg;
    private final ModelPart jointLL1;
    private final ModelPart leg_1;
    private final ModelPart jointdont_1;
    private final ModelPart leg_2;
    private final ModelPart jointRL1_1;
    private final ModelPart leg_3;
    private final ModelPart jointdont_2;
    private final ModelPart arm;
    private final ModelPart jointLA1;
    private final ModelPart dec_12;
    private final ModelPart arm_1;
    private final ModelPart jointLAC2;
    private final ModelPart jointLAC1;
    private final ModelPart jointLAC1_1;
    private final ModelPart claw;
    private final ModelPart claw_1;
    private final ModelPart claw_2;
    private final ModelPart claw_3;
    private final ModelPart claw_4;
    private final ModelPart claw_5;
    private final ModelPart jointdont_3;
    private final ModelPart arm_2;
    private final ModelPart jointRA1;
    private final ModelPart dec_13;
    private final ModelPart arm_3;
    private final ModelPart jointRAC2;
    private final ModelPart jointRAC1;
    private final ModelPart jointRAC1_1;
    private final ModelPart claw_6;
    private final ModelPart claw_7;
    private final ModelPart claw_8;
    private final ModelPart claw_9;
    private final ModelPart claw_10;
    private final ModelPart claw_11;

    public ModelFerVillager(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.body = root.getChild("mainbody").getChild("body");
        this.hip = root.getChild("mainbody").getChild("hip");
        this.jointLA = root.getChild("mainbody").getChild("jointLA");
        this.jointRA = root.getChild("mainbody").getChild("jointRA");
        this.body_1 = root.getChild("mainbody").getChild("body_1");
        this.body_2 = root.getChild("mainbody").getChild("body_2");
        this.b = root.getChild("mainbody").getChild("b");
        this.body_3 = root.getChild("mainbody").getChild("body_3");
        this.body_4 = root.getChild("mainbody").getChild("body_4");
        this.body_5 = root.getChild("mainbody").getChild("body_5");
        this.body_6 = root.getChild("mainbody").getChild("body_6");
        this.body_7 = root.getChild("mainbody").getChild("body_7");
        this.neck = root.getChild("mainbody").getChild("body").getChild("neck");
        this.mouthTR = root.getChild("mainbody").getChild("body").getChild("mouthTR");
        this.jointM = root.getChild("mainbody").getChild("body").getChild("jointM");
        this.jointH = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointH");
        this.head = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointH").getChild("head");
        this.teeth = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointH").getChild("head").getChild("teeth");
        this.teeth_1 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointH").getChild("head").getChild("teeth_1");
        this.teeth_2 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointH").getChild("head").getChild("teeth_2");
        this.teeth_3 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointH").getChild("head").getChild("teeth_3");
        this.teeth_4 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointH").getChild("head").getChild("teeth_4");
        this.teeth_5 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointH").getChild("head").getChild("teeth_5");
        this.nose = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointH").getChild("head").getChild("nose");
        this.mouth = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointH").getChild("head").getChild("mouth");
        this.jointRR1 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRR1");
        this.jointRL1 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRL1");
        this.jointRM1 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRM1");
        this.dec = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRR1").getChild("dec");
        this.joinRR2 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2");
        this.JD = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD");
        this.dec_1 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD").getChild("dec_1");
        this.jointRR3 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD").getChild("dec_1").getChild("jointRR3");
        this.JD_1 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD").getChild("dec_1").getChild("jointRR3").getChild("JD_1");
        this.dec_2 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD").getChild("dec_1").getChild("jointRR3").getChild("JD_1").getChild("dec_2");
        this.jointRR4 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD").getChild("dec_1").getChild("jointRR3").getChild("JD_1").getChild("dec_2").getChild("jointRR4");
        this.dec_3 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD").getChild("dec_1").getChild("jointRR3").getChild("JD_1").getChild("dec_2").getChild("jointRR4").getChild("dec_3");
        this.dec_4 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRL1").getChild("dec_4");
        this.joinRL2 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2");
        this.JD_2 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_2");
        this.dec_5 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_2").getChild("dec_5");
        this.jointRL3 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_2").getChild("dec_5").getChild("jointRL3");
        this.JD_3 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_2").getChild("dec_5").getChild("jointRL3").getChild("JD_3");
        this.dec_6 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_2").getChild("dec_5").getChild("jointRL3").getChild("JD_3").getChild("dec_6");
        this.jointRL4 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_2").getChild("dec_5").getChild("jointRL3").getChild("JD_3").getChild("dec_6").getChild("jointRL4");
        this.dec_7 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_2").getChild("dec_5").getChild("jointRL3").getChild("JD_3").getChild("dec_6").getChild("jointRL4").getChild("dec_7");
        this.dec_8 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRM1").getChild("dec_8");
        this.joinRM2 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2");
        this.JD_4 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_4");
        this.dec_9 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_4").getChild("dec_9");
        this.jointRM3 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_4").getChild("dec_9").getChild("jointRM3");
        this.JD_5 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_4").getChild("dec_9").getChild("jointRM3").getChild("JD_5");
        this.dec_10 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_4").getChild("dec_9").getChild("jointRM3").getChild("JD_5").getChild("dec_10");
        this.jointRM4 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_4").getChild("dec_9").getChild("jointRM3").getChild("JD_5").getChild("dec_10").getChild("jointRM4");
        this.dec_11 = root.getChild("mainbody").getChild("body").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_4").getChild("dec_9").getChild("jointRM3").getChild("JD_5").getChild("dec_10").getChild("jointRM4").getChild("dec_11");
        this.mouth_1 = root.getChild("mainbody").getChild("body").getChild("jointM").getChild("mouth_1");
        this.teeth_6 = root.getChild("mainbody").getChild("body").getChild("jointM").getChild("mouth_1").getChild("teeth_6");
        this.teeth_7 = root.getChild("mainbody").getChild("body").getChild("jointM").getChild("mouth_1").getChild("teeth_7");
        this.teeth_8 = root.getChild("mainbody").getChild("body").getChild("jointM").getChild("mouth_1").getChild("teeth_8");
        this.teeth_9 = root.getChild("mainbody").getChild("body").getChild("jointM").getChild("mouth_1").getChild("teeth_9");
        this.teeth_10 = root.getChild("mainbody").getChild("body").getChild("jointM").getChild("mouth_1").getChild("teeth_10");
        this.teeth_11 = root.getChild("mainbody").getChild("body").getChild("jointM").getChild("mouth_1").getChild("teeth_11");
        this.teeth_12 = root.getChild("mainbody").getChild("body").getChild("jointM").getChild("mouth_1").getChild("teeth_12");
        this.jointLL = root.getChild("mainbody").getChild("hip").getChild("jointLL");
        this.jointRL = root.getChild("mainbody").getChild("hip").getChild("jointRL");
        this.jointdont = root.getChild("mainbody").getChild("hip").getChild("jointLL").getChild("jointdont");
        this.leg = root.getChild("mainbody").getChild("hip").getChild("jointLL").getChild("jointdont").getChild("leg");
        this.jointLL1 = root.getChild("mainbody").getChild("hip").getChild("jointLL").getChild("jointdont").getChild("leg").getChild("jointLL1");
        this.leg_1 = root.getChild("mainbody").getChild("hip").getChild("jointLL").getChild("jointdont").getChild("leg").getChild("jointLL1").getChild("leg_1");
        this.jointdont_1 = root.getChild("mainbody").getChild("hip").getChild("jointRL").getChild("jointdont_1");
        this.leg_2 = root.getChild("mainbody").getChild("hip").getChild("jointRL").getChild("jointdont_1").getChild("leg_2");
        this.jointRL1_1 = root.getChild("mainbody").getChild("hip").getChild("jointRL").getChild("jointdont_1").getChild("leg_2").getChild("jointRL1_1");
        this.leg_3 = root.getChild("mainbody").getChild("hip").getChild("jointRL").getChild("jointdont_1").getChild("leg_2").getChild("jointRL1_1").getChild("leg_3");
        this.jointdont_2 = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2");
        this.arm = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm");
        this.jointLA1 = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA1");
        this.dec_12 = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("dec_12");
        this.arm_1 = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA1").getChild("arm_1");
        this.jointLAC2 = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA1").getChild("arm_1").getChild("jointLAC2");
        this.jointLAC1 = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA1").getChild("arm_1").getChild("jointLAC1");
        this.jointLAC1_1 = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA1").getChild("arm_1").getChild("jointLAC1_1");
        this.claw = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA1").getChild("arm_1").getChild("jointLAC2").getChild("claw");
        this.claw_1 = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA1").getChild("arm_1").getChild("jointLAC2").getChild("claw").getChild("claw_1");
        this.claw_2 = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA1").getChild("arm_1").getChild("jointLAC1").getChild("claw_2");
        this.claw_3 = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA1").getChild("arm_1").getChild("jointLAC1").getChild("claw_2").getChild("claw_3");
        this.claw_4 = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA1").getChild("arm_1").getChild("jointLAC1_1").getChild("claw_4");
        this.claw_5 = root.getChild("mainbody").getChild("jointLA").getChild("jointdont_2").getChild("arm").getChild("jointLA1").getChild("arm_1").getChild("jointLAC1_1").getChild("claw_4").getChild("claw_5");
        this.jointdont_3 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3");
        this.arm_2 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2");
        this.jointRA1 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2").getChild("jointRA1");
        this.dec_13 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2").getChild("dec_13");
        this.arm_3 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2").getChild("jointRA1").getChild("arm_3");
        this.jointRAC2 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2").getChild("jointRA1").getChild("arm_3").getChild("jointRAC2");
        this.jointRAC1 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2").getChild("jointRA1").getChild("arm_3").getChild("jointRAC1");
        this.jointRAC1_1 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2").getChild("jointRA1").getChild("arm_3").getChild("jointRAC1_1");
        this.claw_6 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2").getChild("jointRA1").getChild("arm_3").getChild("jointRAC2").getChild("claw_6");
        this.claw_7 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2").getChild("jointRA1").getChild("arm_3").getChild("jointRAC2").getChild("claw_6").getChild("claw_7");
        this.claw_8 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2").getChild("jointRA1").getChild("arm_3").getChild("jointRAC1").getChild("claw_8");
        this.claw_9 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2").getChild("jointRA1").getChild("arm_3").getChild("jointRAC1").getChild("claw_8").getChild("claw_9");
        this.claw_10 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2").getChild("jointRA1").getChild("arm_3").getChild("jointRAC1_1").getChild("claw_10");
        this.claw_11 = root.getChild("mainbody").getChild("jointRA").getChild("jointdont_3").getChild("arm_2").getChild("jointRA1").getChild("arm_3").getChild("jointRAC1_1").getChild("claw_10").getChild("claw_11");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 23.3f, 0.2f));
        PartDefinition body_2 = mainbody.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(78, 0).addBox(-7.0f, -4.5f, -6.0f, 8, 7, 10), PartPose.offsetAndRotation(0.2f, -17.1f, 1.8f, 0.13962634f, 0.18849556f, 0.0f));
        PartDefinition body_3 = mainbody.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(104, 0).addBox(-7.0f, -4.5f, -6.0f, 4, 7, 3), PartPose.offsetAndRotation(5.0f, -19.2f, 0.6f, -0.23736478f, 0.0f, 0.0f));
        PartDefinition body_6 = mainbody.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(0, 15).addBox(-7.5f, -4.5f, -6.0f, 6, 5, 5), PartPose.offsetAndRotation(9.0f, -13.1f, 6.0f, -0.04886922f, 0.18849556f, 0.0f));
        PartDefinition b = mainbody.addOrReplaceChild("b", CubeListBuilder.create().texOffs(70, 0).addBox(-2.0f, -3.1f, -2.4f, 5, 4, 4), PartPose.offsetAndRotation(2.0f, -24.9f, 0.5f, 0.26529005f, 0.0f, 0.0f));
        PartDefinition body_7 = mainbody.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(70, 17).addBox(-6.5f, -4.5f, -8.3f, 8, 4, 6), PartPose.offsetAndRotation(0.9f, -21.4f, 6.5f, 0.013962634f, 0.18849556f, -0.12566371f));
        PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.4f, -1.0f, -3.0f, 8, 7, 8), PartPose.offsetAndRotation(2.7f, -24.0f, 0.0f, -0.12915437f, 0.0f, 0.108210415f));
        PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(109, 12).addBox(-2.0f, 0.5f, -4.0f, 4, 5, 5), PartPose.offsetAndRotation(1.9f, -1.0f, 8.0f, -0.9145525f, 0.013962634f, 0.28972465f));
        PartDefinition jointH = neck.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition head = jointH.addOrReplaceChild("head", CubeListBuilder.create().texOffs(46, 21).addBox(-4.0f, -6.0f, -4.0f, 8, 8, 8), PartPose.offsetAndRotation(0.0f, -3.2f, -3.0f, -0.39793506f, -0.18849556f, 0.0f));
        PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(17, 24).addBox(-3.0f, -1.0f, -4.0f, 6, 4, 5), PartPose.offsetAndRotation(0.0f, 1.0f, 4.5f, 0.31415927f, 0.12566371f, 0.0f));
        PartDefinition teeth_5 = head.addOrReplaceChild("teeth_5", CubeListBuilder.create().texOffs(118, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-4.2f, 3.0f, -1.8f, 0.0f, 0.0f, 0.10471976f));
        PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(112, 22).addBox(-1.0f, -3.0f, -6.0f, 2, 4, 2), PartPose.offsetAndRotation(0.0f, 4.0f, 0.4f, -0.12566371f, 0.0f, 0.0f));
        PartDefinition teeth_3 = head.addOrReplaceChild("teeth_3", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-4.2f, 2.0f, -3.3f, 0.0f, 0.0f, 0.10471976f));
        PartDefinition teeth = head.addOrReplaceChild("teeth", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(3.0f, 2.0f, -4.3f, -0.10471976f, 0.0f, 0.0f));
        PartDefinition teeth_1 = head.addOrReplaceChild("teeth_1", CubeListBuilder.create().texOffs(118, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-3.0f, 2.0f, -4.3f, -0.10471976f, 0.0f, 0.0f));
        PartDefinition teeth_2 = head.addOrReplaceChild("teeth_2", CubeListBuilder.create().texOffs(122, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(4.2f, 2.0f, -3.3f, 0.0f, 0.0f, -0.10471976f));
        PartDefinition teeth_4 = head.addOrReplaceChild("teeth_4", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(4.2f, 2.0f, -1.8f, 0.0f, 0.0f, -0.10471976f));
        PartDefinition jointM = body.addOrReplaceChild("jointM", CubeListBuilder.create().texOffs(43, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(-0.5f, -3.1f, -2.4f));
        PartDefinition mouth_1 = jointM.addOrReplaceChild("mouth_1", CubeListBuilder.create().texOffs(91, 32).addBox(-3.5f, 0.0f, -4.3f, 7, 2, 6), PartPose.offsetAndRotation(0.0f, -0.8f, 0.0f, -0.4537856f, 0.0f, 0.12566371f));
        PartDefinition teeth_12 = mouth_1.addOrReplaceChild("teeth_12", CubeListBuilder.create().texOffs(122, 22).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, -4.6f, 0.2932153f, 0.0f, 0.0f));
        PartDefinition teeth_11 = mouth_1.addOrReplaceChild("teeth_11", CubeListBuilder.create().texOffs(22, 19).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(3.9f, 0.0f, -3.2f, 0.0f, (float)Math.PI, 0.48171088f));
        PartDefinition teeth_9 = mouth_1.addOrReplaceChild("teeth_9", CubeListBuilder.create().texOffs(92, 17).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(1.6f, 0.0f, -4.6f, 0.7330383f, 0.0f, 0.0f));
        PartDefinition teeth_8 = mouth_1.addOrReplaceChild("teeth_8", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-3.9f, 0.0f, -3.2f, 0.0f, 0.0f, -0.2932153f));
        PartDefinition teeth_10 = mouth_1.addOrReplaceChild("teeth_10", CubeListBuilder.create().texOffs(98, 17).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(2.9f, 0.0f, -4.6f, 0.35604715f, 0.0f, 0.25132743f));
        PartDefinition teeth_6 = mouth_1.addOrReplaceChild("teeth_6", CubeListBuilder.create().texOffs(122, 13).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-2.9f, 0.0f, -4.6f, 0.2932153f, 0.0f, -0.18849556f));
        PartDefinition teeth_7 = mouth_1.addOrReplaceChild("teeth_7", CubeListBuilder.create().texOffs(48, 14).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-1.6f, 0.0f, -4.6f, 0.41887903f, 0.06283186f, -0.06283186f));
        PartDefinition mouthTR = body.addOrReplaceChild("mouthTR", CubeListBuilder.create().texOffs(98, 18).addBox(-1.5f, 1.0f, -1.0f, 3, 4, 4), PartPose.offsetAndRotation(0.0f, 0.4f, 4.5f, -2.8693213f, 0.0f, 0.0f));
        PartDefinition jointRR1 = mouthTR.addOrReplaceChild("jointRR1", CubeListBuilder.create().texOffs(24, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.1f, 3.0f, 1.0f));
        PartDefinition dec = jointRR1.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(92, 17).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.715585f, 1.2566371f, 0.0f));
        PartDefinition joinRR2 = dec.addOrReplaceChild("joinRR2", CubeListBuilder.create().texOffs(122, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD = joinRR2.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2863812f));
        PartDefinition dec_1 = JD.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(115, 23).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.6457718f, 0.0f));
        PartDefinition jointRR3 = dec_1.addOrReplaceChild("jointRR3", CubeListBuilder.create().texOffs(4, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_1 = jointRR3.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(122, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_2 = JD_1.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.13962634f, 0.0f));
        PartDefinition jointRR4 = dec_2.addOrReplaceChild("jointRR4", CubeListBuilder.create().texOffs(32, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_3 = jointRR4.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(115, 8).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.80285144f, 0.0f));
        PartDefinition jointRL1 = mouthTR.addOrReplaceChild("jointRL1", CubeListBuilder.create().texOffs(43, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.6f, 3.0f, 1.0f));
        PartDefinition dec_4 = jointRL1.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(34, 24).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.2252212f, -1.1239921f, -0.81681406f));
        PartDefinition joinRL2 = dec_4.addOrReplaceChild("joinRL2", CubeListBuilder.create().texOffs(36, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_2 = joinRL2.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(78, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2863812f));
        PartDefinition dec_5 = JD_2.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(93, 26).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.54105204f, -0.5934119f, 0.0f));
        PartDefinition jointRL3 = dec_5.addOrReplaceChild("jointRL3", CubeListBuilder.create().texOffs(82, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_3 = jointRL3.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(120, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_6 = JD_3.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(105, 26).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.134464f, -0.4537856f, 0.0f));
        PartDefinition jointRL4 = dec_6.addOrReplaceChild("jointRL4", CubeListBuilder.create().texOffs(123, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_7 = jointRL4.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(17, 15).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.6981317f, 0.0f));
        PartDefinition jointRM1 = mouthTR.addOrReplaceChild("jointRM1", CubeListBuilder.create().texOffs(70, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.6f, 1.2f));
        PartDefinition dec_8 = jointRM1.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(44, 24).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 2.3666666f, 0.12217305f, 0.0f));
        PartDefinition joinRM2 = dec_8.addOrReplaceChild("joinRM2", CubeListBuilder.create().texOffs(32, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_4 = joinRM2.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(36, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0420353f));
        PartDefinition dec_9 = JD_4.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(78, 27).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, 0.61086524f, 0.0f));
        PartDefinition jointRM3 = dec_9.addOrReplaceChild("jointRM3", CubeListBuilder.create().texOffs(122, 11).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_5 = jointRM3.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(48, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
        PartDefinition dec_10 = JD_5.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(7, 28).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.12217305f, -0.20943952f, 0.0f));
        PartDefinition jointRM4 = dec_10.addOrReplaceChild("jointRM4", CubeListBuilder.create().texOffs(52, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_11 = jointRM4.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(85, 28).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 0.82030475f, 0.0f));
        PartDefinition hip = mainbody.addOrReplaceChild("hip", CubeListBuilder.create().texOffs(24, 0).addBox(-3.5f, -1.0f, -2.5f, 7, 3, 5), PartPose.offset(0.0f, -11.5f, 1.5f));
        PartDefinition jointLL = hip.addOrReplaceChild("jointLL", CubeListBuilder.create().texOffs(73, 12).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.0f, -0.6f, -0.4f));
        PartDefinition jointdont = jointLL.addOrReplaceChild("jointdont", CubeListBuilder.create().texOffs(26, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.18151425f, 0.0f));
        PartDefinition leg = jointdont.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(114, 29).addBox(-1.5f, -1.0f, -1.5f, 3, 6, 3), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.2617994f, 0.0f, 0.0f));
        PartDefinition jointLL1 = leg.addOrReplaceChild("jointLL1", CubeListBuilder.create().texOffs(70, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.0f, 0.0f));
        PartDefinition leg_1 = jointLL1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(15, 33).addBox(-2.0f, -1.2f, -2.0f, 4, 7, 4), PartPose.offsetAndRotation(0.0f, 1.4f, 0.3f, 0.2617994f, 0.0f, 0.0f));
        PartDefinition jointRL = hip.addOrReplaceChild("jointRL", CubeListBuilder.create().texOffs(22, 15).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-3.0f, -0.6f, -0.4f));
        PartDefinition jointdont_1 = jointRL.addOrReplaceChild("jointdont_1", CubeListBuilder.create().texOffs(34, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.18151425f, 0.0f));
        PartDefinition leg_2 = jointdont_1.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(31, 33).addBox(-1.5f, -1.0f, -1.5f, 3, 6, 3), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.2617994f, 0.0f, 0.0f));
        PartDefinition jointRL1_1 = leg_2.addOrReplaceChild("jointRL1_1", CubeListBuilder.create().texOffs(40, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.0f, 0.0f));
        PartDefinition leg_3 = jointRL1_1.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(74, 34).addBox(-2.0f, -1.2f, -2.0f, 4, 7, 4), PartPose.offsetAndRotation(0.0f, 1.4f, 0.3f, 0.2617994f, 0.0f, 0.0f));
        PartDefinition body_5 = mainbody.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(54, 12).addBox(-4.5f, -4.5f, -6.0f, 8, 6, 3), PartPose.offsetAndRotation(-3.0f, -21.4f, 2.6f, -0.11170107f, 0.18849556f, 0.0f));
        PartDefinition body_4 = mainbody.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(26, 12).addBox(-7.5f, -4.5f, -6.0f, 8, 6, 6), PartPose.offsetAndRotation(6.0f, -15.1f, 2.5f, 0.13962634f, -0.18849556f, 0.0f));
        PartDefinition body_1 = mainbody.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(40, 0).addBox(-5.5f, -3.0f, -4.3f, 11, 4, 8), PartPose.offsetAndRotation(0.0f, -13.0f, 1.7f, (float)(-Math.PI) / 180, 0.0f, 0.0f));
        PartDefinition jointRA = mainbody.addOrReplaceChild("jointRA", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-6.7f, -24.0f, 2.7f));
        PartDefinition jointdont_3 = jointRA.addOrReplaceChild("jointdont_3", CubeListBuilder.create().texOffs(34, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.43633232f, 2.8379054f, 0.0f));
        PartDefinition arm_2 = jointdont_3.addOrReplaceChild("arm_2", CubeListBuilder.create().texOffs(29, 42).addBox(-1.0f, -1.0f, -1.0f, 10, 2, 2), PartPose.offsetAndRotation(3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9948377f));
        PartDefinition dec_13 = arm_2.addOrReplaceChild("dec_13", CubeListBuilder.create().texOffs(105, 41).addBox(-4.5f, -3.5f, -2.5f, 6, 8, 5), PartPose.offsetAndRotation(-1.5f, 0.2f, 0.3f, 0.31415927f, 0.2443461f, -0.7819075f));
        PartDefinition jointRA1 = arm_2.addOrReplaceChild("jointRA1", CubeListBuilder.create().texOffs(50, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(8.0f, 0.0f, 0.0f));
        PartDefinition arm_3 = jointRA1.addOrReplaceChild("arm_3", CubeListBuilder.create().texOffs(0, 44).addBox(0.0f, -1.5f, -1.5f, 9, 3, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.17453292f, 0.40142572f));
        PartDefinition jointRAC1 = arm_3.addOrReplaceChild("jointRAC1", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.9f, -0.4f, 1.2f));
        PartDefinition claw_8 = jointRAC1.addOrReplaceChild("claw_8", CubeListBuilder.create().texOffs(70, 27).addBox(0.0f, -0.5f, -0.5f, 3, 1, 1), PartPose.offsetAndRotation(0.3f, -0.2f, 0.1f, 1.3264502f, -0.9948377f, 0.0f));
        PartDefinition claw_9 = claw_8.addOrReplaceChild("claw_9", CubeListBuilder.create().texOffs(122, 38).addBox(-0.5f, 0.0f, -0.5f, 1, 7, 1), PartPose.offsetAndRotation(2.6f, 0.2f, 0.0f, 0.0f, 0.0f, -2.4958208f));
        PartDefinition jointRAC1_1 = arm_3.addOrReplaceChild("jointRAC1_1", CubeListBuilder.create().texOffs(7, 27).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.9f, -0.4f, -1.5f));
        PartDefinition claw_10 = jointRAC1_1.addOrReplaceChild("claw_10", CubeListBuilder.create().texOffs(100, 28).addBox(0.0f, -0.5f, -0.5f, 3, 1, 1), PartPose.offsetAndRotation(0.3f, -0.2f, 0.1f, 1.3264502f, 0.70162237f, 0.0f));
        PartDefinition claw_11 = claw_10.addOrReplaceChild("claw_11", CubeListBuilder.create().texOffs(53, 41).addBox(-0.5f, 0.0f, -0.5f, 1, 9, 1), PartPose.offsetAndRotation(2.6f, -0.1f, 0.0f, 0.0f, 0.0f, -0.7993608f));
        PartDefinition jointRAC2 = arm_3.addOrReplaceChild("jointRAC2", CubeListBuilder.create().texOffs(122, 26).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.9f, -1.2f, -0.6f));
        PartDefinition claw_6 = jointRAC2.addOrReplaceChild("claw_6", CubeListBuilder.create().texOffs(78, 27).addBox(-0.5f, 0.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-0.2f, -0.4f, -0.5f, 2.3675392f, 1.6929693f, 0.0f));
        PartDefinition claw_7 = claw_6.addOrReplaceChild("claw_7", CubeListBuilder.create().texOffs(8, 34).addBox(-0.5f, 0.0f, -0.5f, 1, 9, 1), PartPose.offsetAndRotation(0.0f, 2.8f, 0.1f, -0.6457718f, 0.0f, 0.0f));
        PartDefinition jointLA = mainbody.addOrReplaceChild("jointLA", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.4f, -21.0f, 2.0f));
        PartDefinition jointdont_2 = jointLA.addOrReplaceChild("jointdont_2", CubeListBuilder.create().texOffs(44, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.46774822f, 0.3211406f, 0.0f));
        PartDefinition arm = jointdont_2.addOrReplaceChild("arm", CubeListBuilder.create().texOffs(43, 37).addBox(-1.0f, -1.0f, -1.0f, 7, 2, 2), PartPose.offsetAndRotation(2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.134464f));
        PartDefinition jointLA1 = arm.addOrReplaceChild("jointLA1", CubeListBuilder.create().texOffs(50, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(5.0f, 0.0f, 0.0f));
        PartDefinition arm_1 = jointLA1.addOrReplaceChild("arm_1", CubeListBuilder.create().texOffs(90, 40).addBox(0.0f, -1.5f, -1.5f, 7, 3, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.17453292f, 0.40142572f));
        PartDefinition jointLAC1 = arm_1.addOrReplaceChild("jointLAC1", CubeListBuilder.create().texOffs(7, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.9f, -0.4f, -1.2f));
        PartDefinition claw_2 = jointLAC1.addOrReplaceChild("claw_2", CubeListBuilder.create().texOffs(40, 26).addBox(0.0f, -0.5f, -0.5f, 3, 1, 1), PartPose.offsetAndRotation(0.2f, -0.2f, -0.1f, 1.8151424f, 0.5550147f, 0.0f));
        PartDefinition claw_3 = claw_2.addOrReplaceChild("claw_3", CubeListBuilder.create().texOffs(40, 29).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(2.6f, -0.2f, 0.0f, 0.0f, 0.0f, -0.6457718f));
        PartDefinition jointLAC1_1 = arm_1.addOrReplaceChild("jointLAC1_1", CubeListBuilder.create().texOffs(11, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.9f, -0.4f, 1.5f));
        PartDefinition claw_4 = jointLAC1_1.addOrReplaceChild("claw_4", CubeListBuilder.create().texOffs(100, 26).addBox(0.0f, -0.5f, -0.5f, 3, 1, 1), PartPose.offsetAndRotation(0.2f, -0.2f, -0.1f, 1.8151424f, -1.2042772f, 0.0f));
        PartDefinition claw_5 = claw_4.addOrReplaceChild("claw_5", CubeListBuilder.create().texOffs(4, 33).addBox(-0.5f, 0.0f, -0.5f, 1, 7, 1), PartPose.offsetAndRotation(2.6f, 0.2f, 0.0f, 0.0f, 0.0f, -2.576106f));
        PartDefinition jointLAC2 = arm_1.addOrReplaceChild("jointLAC2", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.2f, -1.2f, 0.7f));
        PartDefinition claw = jointLAC2.addOrReplaceChild("claw", CubeListBuilder.create().texOffs(15, 25).addBox(-0.5f, 0.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-0.5f, -0.4f, 0.5f, 2.3675392f, 1.4486233f, 0.0f));
        PartDefinition claw_1 = claw.addOrReplaceChild("claw_1", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5f, 0.0f, -0.5f, 1, 9, 1), PartPose.offsetAndRotation(0.0f, 2.8f, 0.1f, -0.6457718f, 0.0f, 0.0f));
        PartDefinition dec_12 = arm.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(57, 37).addBox(-2.0f, -1.5f, -2.0f, 4, 5, 4), PartPose.offsetAndRotation(-1.5f, 0.2f, -0.3f, -0.43982297f, -0.2443461f, -0.5934119f));
        return LayerDefinition.create(mesh, 128, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        float f2;
        float f1;
        float f6;
        float f5;
        float GD;
        float GS;
        EntityParasiteBase parasite = (EntityParasiteBase)entity;
        this.jointLL.xRot = 0.0f;
        this.jointRL.xRot = 0.0f;
        this.jointLL1.xRot = 0.0f;
        this.jointRL1.xRot = 0.0f;
        this.mainbody.y = 0.0f;
        this.mainbody.zRot = 0.0f;
        this.mainbody.xRot = 0.0f;
        this.mainbody.z = 0.0f;
        this.jointLA.xRot = 0.0f;
        this.jointLA.yRot = 0.0f;
        this.jointRA.xRot = 0.0f;
        this.jointRA.yRot = 0.0f;
        this.jointLA1.yRot = 0.0f;
        this.jointRA1.yRot = 0.0f;
        this.jointRA.zRot = 0.0f;
        this.jointLA.zRot = 0.0f;
        this.jointLAC1.zRot = 0.0f;
        this.jointLAC2.zRot = 0.0f;
        this.jointRAC1.zRot = 0.0f;
        this.jointRAC2.zRot = 0.0f;
        this.jointM.xRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                GS = 2.1f;
                GD = 1.0f;
                this.swingX(this.jointLL, 0.3f * GS, 1.0f * GD, 1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL, 0.3f * GS, 1.0f * GD, -1, 1.0f, 0.2f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.05f);
                this.swingX(this.jointLA, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointRA, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
            } else {
                f5 = Mth.cos((float)(ageInTicks * 0.1411f)) * 0.352f;
                f6 = Mth.cos((float)(ageInTicks * 0.21721f)) * 0.1505f;
                this.jointLA.xRot = -1.0f * f5;
                this.jointRA.xRot = f5;
                this.jointLA.zRot = -1.0f * f6;
                this.jointRA.zRot = f6;
            }
            f1 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.1f;
            this.jointM.xRot = f2 = Mth.cos((float)(ageInTicks * 0.19599f)) * 0.1112f;
            this.jointLAC1.zRot = f1;
            this.jointLAC2.zRot = -1.0f * f1;
            this.jointRAC1.zRot = f1;
            this.jointRAC2.zRot = -1.0f * f1;
        } else if (i != 1 && i == 2) {
            if (!parasite.getStillAni()) {
                GS = 0.9f;
                GD = 0.5f;
                this.swingX(this.jointLL, 0.4f * GS, 2.1f * GD, 1, 1.0f, 0.1f, limbSwing, limbSwingAmount);
                this.swingX(this.jointLL1, 0.4f * GS, 1.0f * GD, 1, 0.0f, 0.1f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL, 0.4f * GS, 2.1f * GD, -1, 1.0f, 0.1f, limbSwing, limbSwingAmount);
                this.swingX(this.jointRL1, 0.4f * GS, 1.0f * GD, -1, 0.0f, 0.1f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.8f * GS, 1, limbSwing, limbSwingAmount, 0.08f);
                this.swingZ(this.jointLAC1, 0.6f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLAC2, 0.6f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRAC1, 0.5f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRAC2, 0.5f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingY(this.jointLA, 0.8f * GS, 1.5f * GD, 1, 1.0f, -0.8f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointLA, 0.4f * GS, 1.0f * GD, 1, 1.0f, 0.4f, limbSwing, limbSwingAmount);
                this.swingY(this.jointLA1, 0.4f * GS, 1.0f * GD, 1, 0.0f, 0.2f, limbSwing, limbSwingAmount);
                this.jointLA.xRot += -1.7f;
                this.swingY(this.jointRA, 0.8f * GS, 1.5f * GD, 1, 1.0f, 0.8f, limbSwing, limbSwingAmount);
                this.swingZ(this.jointRA, 0.8f * GS, 1.5f * GD, 1, 1.0f, 0.4f, limbSwing, limbSwingAmount);
                this.swingY(this.jointRA1, 0.4f * GS, 1.0f * GD, 1, 0.0f, -0.2f, limbSwing, limbSwingAmount);
                this.jointRA.xRot += -1.7f;
                this.jointRA.zRot = 0.0f;
                this.swingZ(this.mainbody, 0.4f * GS, 0.1f * GD, 1, limbSwing, limbSwingAmount);
            } else {
                f5 = Mth.cos((float)(ageInTicks * 0.1411f)) * 0.352f;
                f6 = Mth.cos((float)(ageInTicks * 0.21721f)) * 0.1505f;
                this.jointLA.xRot = -1.0f * f5;
                this.jointRA.xRot = f5;
                this.jointLA.zRot = -1.0f * f6;
                this.jointRA.zRot = f6;
            }
            f1 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.1f;
            f2 = Mth.cos((float)(ageInTicks * 0.5f)) * 0.2f;
            this.jointM.xRot = 0.2f + f2;
            this.jointLAC1.zRot = f1;
            this.jointLAC2.zRot = -1.0f * f1;
            this.jointRAC1.zRot = f1;
            this.jointRAC2.zRot = -1.0f * f1;
        }
        float f4 = Mth.cos((float)(ageInTicks * 0.18f)) * 0.2065f;
        float f3 = Mth.cos((float)(ageInTicks * 0.17f)) * 0.2065f;
        this.jointH.xRot = f4;
        this.jointH.zRot = f3;
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
        this.jointM.xRot = f4;
        this.jointM.zRot = f3;
        this.underground(parasite, ageInTicks, this.mainbody);
        this.jointRA.zRot += 0.3f;
        this.jointLA.zRot += -0.3f;
    
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
