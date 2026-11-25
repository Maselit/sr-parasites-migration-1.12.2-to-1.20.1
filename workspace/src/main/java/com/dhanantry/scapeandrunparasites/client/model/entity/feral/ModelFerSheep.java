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
import com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerSheep;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelFerSheep extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "fersheep"), "main");
    private final ModelPart mainbody;
    private final ModelPart body;
    private final ModelPart body_1;
    private final ModelPart JD;
    private final ModelPart neck;
    private final ModelPart JD_1;
    private final ModelPart dec;
    private final ModelPart body_2;
    private final ModelPart JD_2;
    private final ModelPart JD_3;
    private final ModelPart jointBLL;
    private final ModelPart leg;
    private final ModelPart jointBLL1;
    private final ModelPart leg_1;
    private final ModelPart leg_2;
    private final ModelPart jointBRL;
    private final ModelPart leg_3;
    private final ModelPart jointBRL1;
    private final ModelPart leg_4;
    private final ModelPart leg_5;
    private final ModelPart jointFLL;
    private final ModelPart leg_6;
    private final ModelPart jointFLL1;
    private final ModelPart leg_7;
    private final ModelPart leg_8;
    private final ModelPart leg_9;
    private final ModelPart jointdont;
    private final ModelPart jointH;
    private final ModelPart head;
    private final ModelPart mouthTR;
    private final ModelPart mouthg;
    private final ModelPart teeth;
    private final ModelPart teeth_1;
    private final ModelPart teeth_2;
    private final ModelPart teeth_3;
    private final ModelPart teeth_4;
    private final ModelPart teeth_5;
    private final ModelPart jointRM1;
    private final ModelPart teeth_6;
    private final ModelPart teeth_7;
    private final ModelPart teeth_8;
    private final ModelPart jointRR1;
    private final ModelPart jointRL1;
    private final ModelPart dec_1;
    private final ModelPart joinRR2;
    private final ModelPart JD_4;
    private final ModelPart dec_2;
    private final ModelPart jointRR3;
    private final ModelPart JD_5;
    private final ModelPart dec_3;
    private final ModelPart jointRR4;
    private final ModelPart dec_4;
    private final ModelPart dec_5;
    private final ModelPart joinRL2;
    private final ModelPart JD_6;
    private final ModelPart dec_6;
    private final ModelPart jointRL3;
    private final ModelPart JD_7;
    private final ModelPart dec_7;
    private final ModelPart jointRL4;
    private final ModelPart dec_8;
    private final ModelPart dec_9;
    private final ModelPart joinRM2;
    private final ModelPart JD_8;
    private final ModelPart dec_10;
    private final ModelPart jointRM3;
    private final ModelPart JD_9;
    private final ModelPart dec_11;
    private final ModelPart jointRM4;
    private final ModelPart dec_12;
    private final ModelPart jointFRL;
    private final ModelPart leg_10;
    private final ModelPart jointFRL1;
    private final ModelPart leg_11;
    private final ModelPart leg_12;
    private final ModelPart jointM;
    private final ModelPart mouth;
    private final ModelPart teeth_9;
    private final ModelPart teeth_10;
    private final ModelPart teeth_11;
    private final ModelPart teeth_12;
    private final ModelPart teeth_13;
    private final ModelPart teeth_14;

    public ModelFerSheep(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.body = root.getChild("mainbody").getChild("body");
        this.body_1 = root.getChild("mainbody").getChild("body").getChild("body_1");
        this.JD = root.getChild("mainbody").getChild("body").getChild("JD");
        this.neck = root.getChild("mainbody").getChild("body").getChild("neck");
        this.JD_1 = root.getChild("mainbody").getChild("body").getChild("JD_1");
        this.dec = root.getChild("mainbody").getChild("body").getChild("dec");
        this.body_2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2");
        this.JD_2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("JD_2");
        this.JD_3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("JD_3");
        this.jointBLL = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("JD_2").getChild("jointBLL");
        this.leg = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("JD_2").getChild("jointBLL").getChild("leg");
        this.jointBLL1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("JD_2").getChild("jointBLL").getChild("leg").getChild("jointBLL1");
        this.leg_1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("JD_2").getChild("jointBLL").getChild("leg").getChild("jointBLL1").getChild("leg_1");
        this.leg_2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("JD_2").getChild("jointBLL").getChild("leg").getChild("jointBLL1").getChild("leg_1").getChild("leg_2");
        this.jointBRL = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("JD_3").getChild("jointBRL");
        this.leg_3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("JD_3").getChild("jointBRL").getChild("leg_3");
        this.jointBRL1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("JD_3").getChild("jointBRL").getChild("leg_3").getChild("jointBRL1");
        this.leg_4 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("JD_3").getChild("jointBRL").getChild("leg_3").getChild("jointBRL1").getChild("leg_4");
        this.leg_5 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_2").getChild("JD_3").getChild("jointBRL").getChild("leg_3").getChild("jointBRL1").getChild("leg_4").getChild("leg_5");
        this.jointFLL = root.getChild("mainbody").getChild("body").getChild("JD").getChild("jointFLL");
        this.leg_6 = root.getChild("mainbody").getChild("body").getChild("JD").getChild("jointFLL").getChild("leg_6");
        this.jointFLL1 = root.getChild("mainbody").getChild("body").getChild("JD").getChild("jointFLL").getChild("leg_6").getChild("jointFLL1");
        this.leg_7 = root.getChild("mainbody").getChild("body").getChild("JD").getChild("jointFLL").getChild("leg_6").getChild("jointFLL1").getChild("leg_7");
        this.leg_8 = root.getChild("mainbody").getChild("body").getChild("JD").getChild("jointFLL").getChild("leg_6").getChild("jointFLL1").getChild("leg_7").getChild("leg_8");
        this.leg_9 = root.getChild("mainbody").getChild("body").getChild("JD").getChild("jointFLL").getChild("leg_6").getChild("jointFLL1").getChild("leg_7").getChild("leg_9");
        this.jointdont = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont");
        this.jointH = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH");
        this.head = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head");
        this.mouthTR = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR");
        this.mouthg = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthg");
        this.teeth = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth");
        this.teeth_1 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_1");
        this.teeth_2 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_2");
        this.teeth_3 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_3");
        this.teeth_4 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_4");
        this.teeth_5 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_5");
        this.jointRM1 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("jointRM1");
        this.teeth_6 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_6");
        this.teeth_7 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_7");
        this.teeth_8 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_8");
        this.jointRR1 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRR1");
        this.jointRL1 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRL1");
        this.dec_1 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRR1").getChild("dec_1");
        this.joinRR2 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRR1").getChild("dec_1").getChild("joinRR2");
        this.JD_4 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRR1").getChild("dec_1").getChild("joinRR2").getChild("JD_4");
        this.dec_2 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRR1").getChild("dec_1").getChild("joinRR2").getChild("JD_4").getChild("dec_2");
        this.jointRR3 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRR1").getChild("dec_1").getChild("joinRR2").getChild("JD_4").getChild("dec_2").getChild("jointRR3");
        this.JD_5 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRR1").getChild("dec_1").getChild("joinRR2").getChild("JD_4").getChild("dec_2").getChild("jointRR3").getChild("JD_5");
        this.dec_3 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRR1").getChild("dec_1").getChild("joinRR2").getChild("JD_4").getChild("dec_2").getChild("jointRR3").getChild("JD_5").getChild("dec_3");
        this.jointRR4 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRR1").getChild("dec_1").getChild("joinRR2").getChild("JD_4").getChild("dec_2").getChild("jointRR3").getChild("JD_5").getChild("dec_3").getChild("jointRR4");
        this.dec_4 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRR1").getChild("dec_1").getChild("joinRR2").getChild("JD_4").getChild("dec_2").getChild("jointRR3").getChild("JD_5").getChild("dec_3").getChild("jointRR4").getChild("dec_4");
        this.dec_5 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRL1").getChild("dec_5");
        this.joinRL2 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRL1").getChild("dec_5").getChild("joinRL2");
        this.JD_6 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRL1").getChild("dec_5").getChild("joinRL2").getChild("JD_6");
        this.dec_6 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRL1").getChild("dec_5").getChild("joinRL2").getChild("JD_6").getChild("dec_6");
        this.jointRL3 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRL1").getChild("dec_5").getChild("joinRL2").getChild("JD_6").getChild("dec_6").getChild("jointRL3");
        this.JD_7 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRL1").getChild("dec_5").getChild("joinRL2").getChild("JD_6").getChild("dec_6").getChild("jointRL3").getChild("JD_7");
        this.dec_7 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRL1").getChild("dec_5").getChild("joinRL2").getChild("JD_6").getChild("dec_6").getChild("jointRL3").getChild("JD_7").getChild("dec_7");
        this.jointRL4 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRL1").getChild("dec_5").getChild("joinRL2").getChild("JD_6").getChild("dec_6").getChild("jointRL3").getChild("JD_7").getChild("dec_7").getChild("jointRL4");
        this.dec_8 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthTR").getChild("jointRL1").getChild("dec_5").getChild("joinRL2").getChild("JD_6").getChild("dec_6").getChild("jointRL3").getChild("JD_7").getChild("dec_7").getChild("jointRL4").getChild("dec_8");
        this.dec_9 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("jointRM1").getChild("dec_9");
        this.joinRM2 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("jointRM1").getChild("dec_9").getChild("joinRM2");
        this.JD_8 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("jointRM1").getChild("dec_9").getChild("joinRM2").getChild("JD_8");
        this.dec_10 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("jointRM1").getChild("dec_9").getChild("joinRM2").getChild("JD_8").getChild("dec_10");
        this.jointRM3 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("jointRM1").getChild("dec_9").getChild("joinRM2").getChild("JD_8").getChild("dec_10").getChild("jointRM3");
        this.JD_9 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("jointRM1").getChild("dec_9").getChild("joinRM2").getChild("JD_8").getChild("dec_10").getChild("jointRM3").getChild("JD_9");
        this.dec_11 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("jointRM1").getChild("dec_9").getChild("joinRM2").getChild("JD_8").getChild("dec_10").getChild("jointRM3").getChild("JD_9").getChild("dec_11");
        this.jointRM4 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("jointRM1").getChild("dec_9").getChild("joinRM2").getChild("JD_8").getChild("dec_10").getChild("jointRM3").getChild("JD_9").getChild("dec_11").getChild("jointRM4");
        this.dec_12 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("jointRM1").getChild("dec_9").getChild("joinRM2").getChild("JD_8").getChild("dec_10").getChild("jointRM3").getChild("JD_9").getChild("dec_11").getChild("jointRM4").getChild("dec_12");
        this.jointFRL = root.getChild("mainbody").getChild("body").getChild("JD_1").getChild("jointFRL");
        this.leg_10 = root.getChild("mainbody").getChild("body").getChild("JD_1").getChild("jointFRL").getChild("leg_10");
        this.jointFRL1 = root.getChild("mainbody").getChild("body").getChild("JD_1").getChild("jointFRL").getChild("leg_10").getChild("jointFRL1");
        this.leg_11 = root.getChild("mainbody").getChild("body").getChild("JD_1").getChild("jointFRL").getChild("leg_10").getChild("jointFRL1").getChild("leg_11");
        this.leg_12 = root.getChild("mainbody").getChild("body").getChild("JD_1").getChild("jointFRL").getChild("leg_10").getChild("jointFRL1").getChild("leg_11").getChild("leg_12");
        this.jointM = root.getChild("mainbody").getChild("body").getChild("dec").getChild("jointM");
        this.mouth = root.getChild("mainbody").getChild("body").getChild("dec").getChild("jointM").getChild("mouth");
        this.teeth_9 = root.getChild("mainbody").getChild("body").getChild("dec").getChild("jointM").getChild("mouth").getChild("teeth_9");
        this.teeth_10 = root.getChild("mainbody").getChild("body").getChild("dec").getChild("jointM").getChild("mouth").getChild("teeth_10");
        this.teeth_11 = root.getChild("mainbody").getChild("body").getChild("dec").getChild("jointM").getChild("mouth").getChild("teeth_11");
        this.teeth_12 = root.getChild("mainbody").getChild("body").getChild("dec").getChild("jointM").getChild("mouth").getChild("teeth_12");
        this.teeth_13 = root.getChild("mainbody").getChild("body").getChild("dec").getChild("jointM").getChild("mouth").getChild("teeth_13");
        this.teeth_14 = root.getChild("mainbody").getChild("body").getChild("dec").getChild("jointM").getChild("mouth").getChild("teeth_14");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 14.9f, 1.5f));
        PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, -1.0f, 1.0f, 4, 7, 8), PartPose.offsetAndRotation(0.0f, -10.0f, -8.0f, -0.29670596f, 0.0f, 0.0f));
        PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(16, 0).addBox(-3.0f, -0.7f, -4.0f, 3, 3, 3), PartPose.offset(0.0f, -3.2f, 5.2f));
        PartDefinition jointdont = neck.addOrReplaceChild("jointdont", CubeListBuilder.create().texOffs(107, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, -4.5f, 0.29670596f, 0.0f, 0.0f));
        PartDefinition jointH = jointdont.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(111, 0).addBox(1.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(-1.0f, 0.0f, 0.0f));
        PartDefinition head = jointH.addOrReplaceChild("head", CubeListBuilder.create().texOffs(59, 22).addBox(-3.0f, -4.0f, -6.0f, 6, 4, 8), PartPose.offsetAndRotation(0.0f, 1.7f, -2.0f, -0.41887903f, 0.0f, 0.0f));
        PartDefinition teeth_3 = head.addOrReplaceChild("teeth_3", CubeListBuilder.create().texOffs(28, 2).addBox(-0.5f, -1.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-1.6f, 1.2f, -6.2f, -0.12217305f, 0.0f, 0.0f));
        PartDefinition mouthTR = head.addOrReplaceChild("mouthTR", CubeListBuilder.create().texOffs(109, 18).addBox(-2.5f, -1.0f, -2.0f, 5, 6, 4), PartPose.offsetAndRotation(0.0f, 0.0f, -0.3f, 0.36651915f, 0.0f, 0.0f));
        PartDefinition jointRR1 = mouthTR.addOrReplaceChild("jointRR1", CubeListBuilder.create().texOffs(89, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.1f, 3.0f, -1.0f));
        PartDefinition dec_1 = jointRR1.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(24, 5).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.36651915f, 0.9424778f, 0.0f));
        PartDefinition joinRR2 = dec_1.addOrReplaceChild("joinRR2", CubeListBuilder.create().texOffs(111, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_4 = joinRR2.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(123, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2863812f));
        PartDefinition dec_2 = JD_4.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(44, 20).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.6457718f, 0.0f));
        PartDefinition jointRR3 = dec_2.addOrReplaceChild("jointRR3", CubeListBuilder.create().texOffs(31, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_5 = jointRR3.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(55, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_3 = JD_5.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(86, 21).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.13962634f, 0.0f));
        PartDefinition jointRR4 = dec_3.addOrReplaceChild("jointRR4", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_4 = jointRR4.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(47, 6).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.80285144f, 0.0f));
        PartDefinition jointRL1 = mouthTR.addOrReplaceChild("jointRL1", CubeListBuilder.create().texOffs(107, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.6f, 3.0f, -1.0f));
        PartDefinition dec_5 = jointRL1.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(79, 24).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.15707964f, -0.83775806f, 0.0f));
        PartDefinition joinRL2 = dec_5.addOrReplaceChild("joinRL2", CubeListBuilder.create().texOffs(58, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_6 = joinRL2.addOrReplaceChild("JD_6", CubeListBuilder.create().texOffs(84, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2863812f));
        PartDefinition dec_6 = JD_6.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(7, 24).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.5061455f, 0.0f));
        PartDefinition jointRL3 = dec_6.addOrReplaceChild("jointRL3", CubeListBuilder.create().texOffs(123, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_7 = jointRL3.addOrReplaceChild("JD_7", CubeListBuilder.create().texOffs(3, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_7 = JD_7.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(14, 26).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.4537856f, 0.0f));
        PartDefinition jointRL4 = dec_7.addOrReplaceChild("jointRL4", CubeListBuilder.create().texOffs(16, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_8 = jointRL4.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(12, 15).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.80285144f, 0.0f));
        PartDefinition jointRM1 = head.addOrReplaceChild("jointRM1", CubeListBuilder.create().texOffs(55, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.6f, -0.8f));
        PartDefinition dec_9 = jointRM1.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(52, 25).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.23736478f, 0.12217305f, 0.0f));
        PartDefinition joinRM2 = dec_9.addOrReplaceChild("joinRM2", CubeListBuilder.create().texOffs(20, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_8 = joinRM2.addOrReplaceChild("JD_8", CubeListBuilder.create().texOffs(24, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0420353f));
        PartDefinition dec_10 = JD_8.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(39, 26).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.38048178f, 0.0f));
        PartDefinition jointRM3 = dec_10.addOrReplaceChild("jointRM3", CubeListBuilder.create().texOffs(30, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_9 = jointRM3.addOrReplaceChild("JD_9", CubeListBuilder.create().texOffs(52, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
        PartDefinition dec_11 = JD_9.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(93, 26).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.19198622f, 0.0f));
        PartDefinition jointRM4 = dec_11.addOrReplaceChild("jointRM4", CubeListBuilder.create().texOffs(120, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_12 = jointRM4.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(40, 17).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.80285144f, 0.0f));
        PartDefinition teeth_4 = head.addOrReplaceChild("teeth_4", CubeListBuilder.create().texOffs(47, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(2.5f, 0.4f, -3.4f, 0.0f, (float)Math.PI, -0.10471976f));
        PartDefinition teeth_6 = head.addOrReplaceChild("teeth_6", CubeListBuilder.create().texOffs(59, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-2.5f, 0.5f, -5.0f, 0.0f, (float)Math.PI, 0.17453292f));
        PartDefinition teeth_1 = head.addOrReplaceChild("teeth_1", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -1.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 1.2f, -6.2f, -0.17453292f, 0.0f, 0.0f));
        PartDefinition teeth_7 = head.addOrReplaceChild("teeth_7", CubeListBuilder.create().texOffs(81, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-2.6f, 0.5f, -3.4f, 0.0f, (float)Math.PI, 0.34906584f));
        PartDefinition teeth_2 = head.addOrReplaceChild("teeth_2", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -1.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(1.6f, 1.2f, -6.3f, -0.15707964f, 0.0f, 0.0f));
        PartDefinition teeth_8 = head.addOrReplaceChild("teeth_8", CubeListBuilder.create().texOffs(85, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-2.5f, 0.5f, -2.0f, 0.0f, (float)Math.PI, 0.20943952f));
        PartDefinition teeth = head.addOrReplaceChild("teeth", CubeListBuilder.create().texOffs(120, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(2.5f, 0.4f, -5.0f, 0.0f, (float)Math.PI, -0.17453292f));
        PartDefinition mouthg = head.addOrReplaceChild("mouthg", CubeListBuilder.create().texOffs(0, 21).addBox(-1.5f, -3.3f, -0.2f, 3, 5, 3), PartPose.offsetAndRotation(0.0f, 2.0f, -2.8f, 0.61086524f, 0.0f, 0.0f));
        PartDefinition teeth_5 = head.addOrReplaceChild("teeth_5", CubeListBuilder.create().texOffs(51, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(2.5f, 0.5f, -1.8f, 0.0f, (float)Math.PI, -0.19198622f));
        PartDefinition dec = body.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(58, 0).addBox(-1.0f, -3.0f, -1.0f, 8, 9, 7), PartPose.offsetAndRotation(-5.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.13962634f));
        PartDefinition jointM = dec.addOrReplaceChild("jointM", CubeListBuilder.create().texOffs(54, 9).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(3.0f, 5.6f, -1.1f));
        PartDefinition mouth = jointM.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(38, 32).addBox(-2.5f, 0.0f, -3.3f, 5, 2, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.9424778f, 0.0f, 0.0f));
        PartDefinition teeth_10 = mouth.addOrReplaceChild("teeth_10", CubeListBuilder.create().texOffs(103, 14).addBox(-0.5f, -1.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-1.9f, -0.4f, -2.2f, 0.0f, 0.0f, -0.10471976f));
        PartDefinition teeth_12 = mouth.addOrReplaceChild("teeth_12", CubeListBuilder.create().texOffs(64, 16).addBox(-0.5f, -1.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(2.0f, -0.5f, -2.2f, 0.0f, (float)Math.PI, 0.10471976f));
        PartDefinition teeth_13 = mouth.addOrReplaceChild("teeth_13", CubeListBuilder.create().texOffs(79, 16).addBox(-0.5f, -1.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.0f, 0.0f, -3.6f, 0.10471976f, 0.0f, 0.0f));
        PartDefinition teeth_14 = mouth.addOrReplaceChild("teeth_14", CubeListBuilder.create().texOffs(28, 17).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(1.9f, -0.4f, -0.6f, 0.0f, (float)Math.PI, 0.10471976f));
        PartDefinition teeth_11 = mouth.addOrReplaceChild("teeth_11", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5f, -1.5f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(1.5f, 0.0f, -3.6f, 0.10471976f, 0.0f, 0.0f));
        PartDefinition teeth_9 = mouth.addOrReplaceChild("teeth_9", CubeListBuilder.create().texOffs(100, 11).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-1.5f, 0.0f, -3.6f, 0.10471976f, 0.0f, 0.0f));
        PartDefinition JD_1 = body.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-3.2f, 5.7f, 4.7f, 0.29670596f, 0.0f, 0.0f));
        PartDefinition jointFRL = JD_1.addOrReplaceChild("jointFRL", CubeListBuilder.create().texOffs(123, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_10 = jointFRL.addOrReplaceChild("leg_10", CubeListBuilder.create().texOffs(22, 28).addBox(-2.0f, -1.0f, -2.0f, 4, 6, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.33161256f, 0.0f, 0.0f));
        PartDefinition jointFRL1 = leg_10.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(120, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition leg_11 = jointFRL1.addOrReplaceChild("leg_11", CubeListBuilder.create().texOffs(105, 28).addBox(-1.5f, -0.5f, -1.5f, 3, 6, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, 0.08726646f, 0.0f));
        PartDefinition leg_12 = leg_11.addOrReplaceChild("leg_12", CubeListBuilder.create().texOffs(0, 30).addBox(-2.0f, -1.0f, -2.0f, 4, 2, 4), PartPose.offset(0.0f, 6.3f, 0.0f));
        PartDefinition body_1 = body.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(24, 0).addBox(-3.1f, 0.0f, -3.0f, 6, 6, 11), PartPose.offsetAndRotation(0.0f, 0.7f, 6.4f, 0.4712389f, 0.0f, 0.0f));
        PartDefinition body_2 = body_1.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(88, 0).addBox(-3.5f, -0.5f, -1.5f, 7, 6, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 8.0f, -0.17453292f, 0.0f, 0.0f));
        PartDefinition JD_3 = body_2.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(47, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-3.0f, 5.7f, 1.1f, 0.0f, (float)Math.PI / 90, 0.0f));
        PartDefinition jointBRL = JD_3.addOrReplaceChild("jointBRL", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_3 = jointBRL.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(16, 15).addBox(-1.0f, -1.0f, -2.0f, 2, 7, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.33161256f, 0.0f, 0.0f));
        PartDefinition jointBRL1 = leg_3.addOrReplaceChild("jointBRL1", CubeListBuilder.create().texOffs(81, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition leg_4 = jointBRL1.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(55, 16).addBox(-1.5f, 0.0f, -1.5f, 3, 6, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.34906584f, (float)Math.PI / 180, 0.0f));
        PartDefinition leg_5 = leg_4.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(67, 16).addBox(-2.0f, -1.0f, -2.0f, 4, 2, 4), PartPose.offset(0.0f, 6.3f, 0.0f));
        PartDefinition JD_2 = body_2.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(3.0f, 5.7f, 1.1f, 0.0f, (float)(-Math.PI) / 90, 0.0f));
        PartDefinition jointBLL = JD_2.addOrReplaceChild("jointBLL", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg = jointBLL.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(107, 6).addBox(-2.0f, -1.0f, -3.0f, 4, 7, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.33161256f, 0.0f, 0.0f));
        PartDefinition jointBLL1 = leg.addOrReplaceChild("jointBLL1", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition leg_1 = jointBLL1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(88, 11).addBox(-1.5f, 0.0f, -1.5f, 3, 6, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.34906584f, (float)(-Math.PI) / 180, 0.0f));
        PartDefinition leg_2 = leg_1.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0f, -1.0f, -2.0f, 4, 2, 4), PartPose.offset(0.0f, 6.3f, 0.0f));
        PartDefinition JD = body.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(3.2f, 5.7f, 4.7f, 0.29670596f, 0.0f, 0.0f));
        PartDefinition jointFLL = JD.addOrReplaceChild("jointFLL", CubeListBuilder.create().texOffs(85, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_6 = jointFLL.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(28, 17).addBox(-2.0f, -1.0f, -2.0f, 4, 6, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.33161256f, 0.0f, 0.0f));
        PartDefinition jointFLL1 = leg_6.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition leg_7 = jointFLL1.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(97, 17).addBox(-1.5f, -0.5f, -1.5f, 3, 6, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, -0.08726646f, 0.0f));
        PartDefinition leg_9 = leg_7.addOrReplaceChild("leg_9", CubeListBuilder.create().texOffs(79, 18).addBox(-1.0f, -1.0f, -2.0f, 2, 2, 4), PartPose.offsetAndRotation(1.3f, 6.3f, 0.0f, 0.0f, -0.08726646f, 0.0f));
        PartDefinition leg_8 = leg_7.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(112, 0).addBox(-1.0f, -1.0f, -2.0f, 2, 2, 4), PartPose.offsetAndRotation(-1.2f, 6.3f, 0.0f, 0.0f, 0.10471976f, 0.0f));
        return LayerDefinition.create(mesh, 128, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        float GD;
        float GS;
        EntityFerSheep parasite = (EntityFerSheep)entity;
        this.jointFLL.xRot = 0.0f;
        this.jointFRL.xRot = 0.0f;
        this.jointBLL.xRot = 0.0f;
        this.jointBRL.xRot = 0.0f;
        this.mainbody.y = 0.0f;
        this.mainbody.xRot = 0.0f;
        this.mainbody.zRot = 0.0f;
        this.jointM.xRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                GS = 2.0f;
                GD = 2.0f;
                this.swingX(this.jointFLL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.05f);
                this.mainbody.xRot = 0.0f;
            }
            GS = Mth.cos((float)(ageInTicks * 0.0998f)) * 0.0215f;
        } else if (i != 1 && i == 2) {
            float f22;
            if (!parasite.getStillAni()) {
                GS = 1.3f;
                GD = 0.25f;
                this.swingX(this.jointFLL, 0.3f * GS, 3.0f * GD, -1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL, 0.3f * GS, 3.0f * GD, -1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL, 0.3f * GS, 3.5f * GD, 1, -0.5f, 0.4f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL, 0.3f * GS, 3.5f * GD, 1, 0.5f, 0.4f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.3f * GS, -1, limbSwing, limbSwingAmount, 0.08f);
                this.swingX(this.mainbody, 0.3f * GS, 0.4f * GD, -1, 0.8f, 0.0f, limbSwing, limbSwingAmount);
            }
            this.jointM.xRot = f22 = Mth.cos((float)(ageInTicks * 0.5f)) * 0.2f;
            GD = Mth.cos((float)(ageInTicks * 0.0998f)) * 0.0215f;
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
