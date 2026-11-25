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

public class ModelFerPig extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "ferpig"), "main");
    private final ModelPart mainbody;
    private final ModelPart body;
    private final ModelPart body_1;
    private final ModelPart body_2;
    private final ModelPart JD;
    private final ModelPart JD_1;
    private final ModelPart joint;
    private final ModelPart jointFLL;
    private final ModelPart leg;
    private final ModelPart jointFLL1;
    private final ModelPart leg_1;
    private final ModelPart jointFRL;
    private final ModelPart leg_2;
    private final ModelPart jointFRL1;
    private final ModelPart leg_3;
    private final ModelPart jd;
    private final ModelPart neck;
    private final ModelPart jointdont;
    private final ModelPart jointM;
    private final ModelPart mouthTR;
    private final ModelPart jointH;
    private final ModelPart head;
    private final ModelPart head_1;
    private final ModelPart mouthg;
    private final ModelPart teeth;
    private final ModelPart teeth_1;
    private final ModelPart teeth_2;
    private final ModelPart teeth_3;
    private final ModelPart teeth_4;
    private final ModelPart teeth_5;
    private final ModelPart teeth_6;
    private final ModelPart teeth_7;
    private final ModelPart teeth_8;
    private final ModelPart teeth_9;
    private final ModelPart mouth;
    private final ModelPart teeth_10;
    private final ModelPart teeth_11;
    private final ModelPart teeth_12;
    private final ModelPart teeth_13;
    private final ModelPart teeth_14;
    private final ModelPart teeth_15;
    private final ModelPart teeth_16;
    private final ModelPart teeth_17;
    private final ModelPart teeth_18;
    private final ModelPart jointRR1;
    private final ModelPart jointRL1;
    private final ModelPart jointRM1;
    private final ModelPart dec;
    private final ModelPart joinRR2;
    private final ModelPart JD_2;
    private final ModelPart dec_1;
    private final ModelPart jointRR3;
    private final ModelPart JD_3;
    private final ModelPart dec_2;
    private final ModelPart jointRR4;
    private final ModelPart dec_3;
    private final ModelPart dec_4;
    private final ModelPart joinRL2;
    private final ModelPart JD_4;
    private final ModelPart dec_5;
    private final ModelPart jointRL3;
    private final ModelPart JD_5;
    private final ModelPart dec_6;
    private final ModelPart jointRL4;
    private final ModelPart dec_7;
    private final ModelPart dec_8;
    private final ModelPart joinRM2;
    private final ModelPart JD_6;
    private final ModelPart dec_9;
    private final ModelPart jointRM3;
    private final ModelPart JD_7;
    private final ModelPart dec_10;
    private final ModelPart jointRM4;
    private final ModelPart dec_11;
    private final ModelPart JD_8;
    private final ModelPart JD_9;
    private final ModelPart jointBLL;
    private final ModelPart leg_4;
    private final ModelPart jointBLL1;
    private final ModelPart leg_5;
    private final ModelPart jointBRL;
    private final ModelPart leg_6;
    private final ModelPart jointBRL1;
    private final ModelPart leg_7;

    public ModelFerPig(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.body = root.getChild("mainbody").getChild("body");
        this.body_1 = root.getChild("mainbody").getChild("body").getChild("body_1");
        this.body_2 = root.getChild("mainbody").getChild("body").getChild("body_2");
        this.JD = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("JD");
        this.JD_1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("JD_1");
        this.joint = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint");
        this.jointFLL = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("JD").getChild("jointFLL");
        this.leg = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("JD").getChild("jointFLL").getChild("leg");
        this.jointFLL1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("JD").getChild("jointFLL").getChild("leg").getChild("jointFLL1");
        this.leg_1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("JD").getChild("jointFLL").getChild("leg").getChild("jointFLL1").getChild("leg_1");
        this.jointFRL = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("JD_1").getChild("jointFRL");
        this.leg_2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("JD_1").getChild("jointFRL").getChild("leg_2");
        this.jointFRL1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("JD_1").getChild("jointFRL").getChild("leg_2").getChild("jointFRL1");
        this.leg_3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("JD_1").getChild("jointFRL").getChild("leg_2").getChild("jointFRL1").getChild("leg_3");
        this.jd = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd");
        this.neck = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck");
        this.jointdont = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont");
        this.jointM = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointM");
        this.mouthTR = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR");
        this.jointH = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH");
        this.head = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head");
        this.head_1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("head_1");
        this.mouthg = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthg");
        this.teeth = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth");
        this.teeth_1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_1");
        this.teeth_2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_2");
        this.teeth_3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_3");
        this.teeth_4 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_4");
        this.teeth_5 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_5");
        this.teeth_6 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_6");
        this.teeth_7 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_7");
        this.teeth_8 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_8");
        this.teeth_9 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointdont").getChild("jointH").getChild("head").getChild("teeth_9");
        this.mouth = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointM").getChild("mouth");
        this.teeth_10 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointM").getChild("mouth").getChild("teeth_10");
        this.teeth_11 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointM").getChild("mouth").getChild("teeth_11");
        this.teeth_12 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointM").getChild("mouth").getChild("teeth_12");
        this.teeth_13 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointM").getChild("mouth").getChild("teeth_13");
        this.teeth_14 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointM").getChild("mouth").getChild("teeth_14");
        this.teeth_15 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointM").getChild("mouth").getChild("teeth_15");
        this.teeth_16 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointM").getChild("mouth").getChild("teeth_16");
        this.teeth_17 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointM").getChild("mouth").getChild("teeth_17");
        this.teeth_18 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("jointM").getChild("mouth").getChild("teeth_18");
        this.jointRR1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRR1");
        this.jointRL1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRL1");
        this.jointRM1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRM1");
        this.dec = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRR1").getChild("dec");
        this.joinRR2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2");
        this.JD_2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD_2");
        this.dec_1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD_2").getChild("dec_1");
        this.jointRR3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD_2").getChild("dec_1").getChild("jointRR3");
        this.JD_3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD_2").getChild("dec_1").getChild("jointRR3").getChild("JD_3");
        this.dec_2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD_2").getChild("dec_1").getChild("jointRR3").getChild("JD_3").getChild("dec_2");
        this.jointRR4 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD_2").getChild("dec_1").getChild("jointRR3").getChild("JD_3").getChild("dec_2").getChild("jointRR4");
        this.dec_3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRR1").getChild("dec").getChild("joinRR2").getChild("JD_2").getChild("dec_1").getChild("jointRR3").getChild("JD_3").getChild("dec_2").getChild("jointRR4").getChild("dec_3");
        this.dec_4 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRL1").getChild("dec_4");
        this.joinRL2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2");
        this.JD_4 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_4");
        this.dec_5 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_4").getChild("dec_5");
        this.jointRL3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_4").getChild("dec_5").getChild("jointRL3");
        this.JD_5 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_4").getChild("dec_5").getChild("jointRL3").getChild("JD_5");
        this.dec_6 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_4").getChild("dec_5").getChild("jointRL3").getChild("JD_5").getChild("dec_6");
        this.jointRL4 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_4").getChild("dec_5").getChild("jointRL3").getChild("JD_5").getChild("dec_6").getChild("jointRL4");
        this.dec_7 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRL1").getChild("dec_4").getChild("joinRL2").getChild("JD_4").getChild("dec_5").getChild("jointRL3").getChild("JD_5").getChild("dec_6").getChild("jointRL4").getChild("dec_7");
        this.dec_8 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRM1").getChild("dec_8");
        this.joinRM2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2");
        this.JD_6 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_6");
        this.dec_9 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_6").getChild("dec_9");
        this.jointRM3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_6").getChild("dec_9").getChild("jointRM3");
        this.JD_7 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_6").getChild("dec_9").getChild("jointRM3").getChild("JD_7");
        this.dec_10 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_6").getChild("dec_9").getChild("jointRM3").getChild("JD_7").getChild("dec_10");
        this.jointRM4 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_6").getChild("dec_9").getChild("jointRM3").getChild("JD_7").getChild("dec_10").getChild("jointRM4");
        this.dec_11 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("joint").getChild("jd").getChild("neck").getChild("mouthTR").getChild("jointRM1").getChild("dec_8").getChild("joinRM2").getChild("JD_6").getChild("dec_9").getChild("jointRM3").getChild("JD_7").getChild("dec_10").getChild("jointRM4").getChild("dec_11");
        this.JD_8 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("JD_8");
        this.JD_9 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("JD_9");
        this.jointBLL = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("JD_8").getChild("jointBLL");
        this.leg_4 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("JD_8").getChild("jointBLL").getChild("leg_4");
        this.jointBLL1 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("JD_8").getChild("jointBLL").getChild("leg_4").getChild("jointBLL1");
        this.leg_5 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("JD_8").getChild("jointBLL").getChild("leg_4").getChild("jointBLL1").getChild("leg_5");
        this.jointBRL = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("JD_9").getChild("jointBRL");
        this.leg_6 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("JD_9").getChild("jointBRL").getChild("leg_6");
        this.jointBRL1 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("JD_9").getChild("jointBRL").getChild("leg_6").getChild("jointBRL1");
        this.leg_7 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("JD_9").getChild("jointBRL").getChild("leg_6").getChild("jointBRL1").getChild("leg_7");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 19.0f, 0.5f));
        PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, 0.0f, 0.0f, 8, 7, 6), PartPose.offset(0.0f, -8.0f, -1.0f));
        PartDefinition body_2 = body.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(68, 0).addBox(-4.5f, 0.0f, -5.8f, 9, 5, 8), PartPose.offsetAndRotation(0.0f, 1.8f, 5.0f, 1.6406095f, 0.0f, 0.0f));
        PartDefinition JD_9 = body_2.addOrReplaceChild("JD_9", CubeListBuilder.create().texOffs(34, 22).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(-3.2f, 2.5f, -4.4f, -1.6406095f, 0.0f, 0.0f));
        PartDefinition jointBRL = JD_9.addOrReplaceChild("jointBRL", CubeListBuilder.create().texOffs(53, 23).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_6 = jointBRL.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(28, 26).addBox(-2.0f, -2.5f, -2.0f, 4, 7, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.69115037f, 0.0f, 0.0f));
        PartDefinition jointBRL1 = leg_6.addOrReplaceChild("jointBRL1", CubeListBuilder.create().texOffs(102, 23).addBox(-0.5f, 0.0f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.0f, 0.0f));
        PartDefinition leg_7 = jointBRL1.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(44, 27).addBox(-1.5f, -1.0f, -1.5f, 3, 5, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.75398225f, 0.08726646f, 0.0f));
        PartDefinition JD_8 = body_2.addOrReplaceChild("JD_8", CubeListBuilder.create().texOffs(53, 21).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(3.2f, 2.5f, -4.4f, -1.6406095f, 0.0f, 0.0f));
        PartDefinition jointBLL = JD_8.addOrReplaceChild("jointBLL", CubeListBuilder.create().texOffs(40, 22).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_4 = jointBLL.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0f, -2.5f, -2.0f, 4, 7, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.69115037f, 0.013962634f, 0.0f));
        PartDefinition jointBLL1 = leg_4.addOrReplaceChild("jointBLL1", CubeListBuilder.create().texOffs(46, 22).addBox(-0.5f, 0.0f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.0f, 0.0f));
        PartDefinition leg_5 = jointBLL1.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(16, 24).addBox(-1.5f, -1.0f, -1.5f, 3, 5, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.75398225f, -0.08726646f, 0.0f));
        PartDefinition body_1 = body.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(28, 0).addBox(-5.0f, 0.0f, -4.0f, 11, 7, 9), PartPose.offsetAndRotation(0.0f, 2.5f, -4.8f, 1.3264502f, 0.0f, 0.0f));
        PartDefinition JD_1 = body_1.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(26, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(-3.5f, 1.5f, -4.3f, -1.3264502f, 0.0f, 0.0f));
        PartDefinition jointFRL = JD_1.addOrReplaceChild("jointFRL", CubeListBuilder.create().texOffs(103, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_2 = jointFRL.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(106, 0).addBox(-2.0f, -1.0f, -2.0f, 4, 3, 4), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition jointFRL1 = leg_2.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(118, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.0f, 0.0f));
        PartDefinition leg_3 = jointFRL1.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(102, 7).addBox(-1.5f, -1.0f, -1.5f, 3, 4, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.08726646f, 0.0f));
        PartDefinition JD = body_1.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(22, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offsetAndRotation(3.5f, 1.5f, -4.3f, -1.3264502f, 0.0f, 0.0f));
        PartDefinition jointFLL = JD.addOrReplaceChild("jointFLL", CubeListBuilder.create().texOffs(59, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg = jointFLL.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(59, 0).addBox(-2.0f, -1.0f, -2.0f, 4, 3, 4), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition jointFLL1 = leg.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5f, 0.0f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.0f, 0.0f));
        PartDefinition leg_1 = jointFLL1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(94, 0).addBox(-1.5f, -1.0f, -1.5f, 3, 4, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.08726646f, 0.0f));
        PartDefinition joint = body_1.addOrReplaceChild("joint", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.3f, 4.6f));
        PartDefinition jd = joint.addOrReplaceChild("jd", CubeListBuilder.create().texOffs(122, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.43982297f, 0.0f, 0.0f));
        PartDefinition neck = jd.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 13).addBox(-2.5f, -1.5f, -2.0f, 5, 6, 5), PartPose.offsetAndRotation(-1.0f, -2.7f, -0.1f, -0.25132743f, -1.2566371f, 0.0f));
        PartDefinition jointdont = neck.addOrReplaceChild("jointdont", CubeListBuilder.create().texOffs(33, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -0.3f, 2.6f));
        PartDefinition jointH = jointdont.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition head = jointH.addOrReplaceChild("head", CubeListBuilder.create().texOffs(60, 13).addBox(-4.0f, -4.0f, -8.0f, 8, 7, 8), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.2479842f, 0.06283186f, -0.25132743f));
        PartDefinition teeth = head.addOrReplaceChild("teeth", CubeListBuilder.create().texOffs(22, 2).addBox(-0.5f, 0.2f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-3.3f, 2.8f, -5.7f, 0.0f, 0.0f, 0.31415927f));
        PartDefinition teeth_1 = head.addOrReplaceChild("teeth_1", CubeListBuilder.create().texOffs(26, 2).addBox(-0.5f, 0.2f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(3.4f, 2.8f, -6.7f, 0.0f, 0.0f, -0.12566371f));
        PartDefinition teeth_5 = head.addOrReplaceChild("teeth_5", CubeListBuilder.create().texOffs(123, 6).addBox(-0.5f, 0.2f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-3.0f, 2.8f, -7.4f, -0.18849556f, 0.0f, 0.18849556f));
        PartDefinition teeth_2 = head.addOrReplaceChild("teeth_2", CubeListBuilder.create().texOffs(30, 2).addBox(-0.5f, 0.2f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-3.3f, 2.8f, -4.4f, 0.0f, 0.0f, 0.12566371f));
        PartDefinition teeth_3 = head.addOrReplaceChild("teeth_3", CubeListBuilder.create().texOffs(122, 2).addBox(-0.5f, 0.2f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-3.3f, 2.8f, -3.1f, 0.0f, 0.0f, 0.25132743f));
        PartDefinition teeth_9 = head.addOrReplaceChild("teeth_9", CubeListBuilder.create().texOffs(101, 14).addBox(-0.5f, 0.2f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(2.2f, 2.8f, -7.4f, -0.18849556f, 0.0f, -0.12566371f));
        PartDefinition teeth_8 = head.addOrReplaceChild("teeth_8", CubeListBuilder.create().texOffs(97, 13).addBox(-0.5f, 0.2f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.9f, 2.8f, -7.4f, -0.31415927f, 0.0f, 0.0f));
        PartDefinition mouthg = head.addOrReplaceChild("mouthg", CubeListBuilder.create().texOffs(84, 13).addBox(-2.0f, -1.5f, -2.5f, 4, 3, 5), PartPose.offsetAndRotation(0.4f, 2.7f, -0.6f, 0.43633232f, 0.0f, 0.0f));
        PartDefinition teeth_6 = head.addOrReplaceChild("teeth_6", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5f, 0.2f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-1.7f, 2.8f, -7.4f, -0.31415927f, 0.0f, 0.06283186f));
        PartDefinition teeth_7 = head.addOrReplaceChild("teeth_7", CubeListBuilder.create().texOffs(84, 13).addBox(-0.5f, 0.2f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-0.4f, 2.8f, -7.4f, -0.12566371f, 0.0f, 0.0f));
        PartDefinition teeth_4 = head.addOrReplaceChild("teeth_4", CubeListBuilder.create().texOffs(33, 5).addBox(-0.5f, 0.2f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-3.3f, 2.8f, -6.9f, 0.0f, 0.0f, 0.18849556f));
        PartDefinition head_1 = head.addOrReplaceChild("head_1", CubeListBuilder.create().texOffs(15, 13).addBox(-2.0f, 0.0f, 0.0f, 4, 3, 2), PartPose.offsetAndRotation(0.0f, 0.2f, -10.0f, 0.18849556f, 0.0f, 0.0f));
        PartDefinition mouthTR = neck.addOrReplaceChild("mouthTR", CubeListBuilder.create().texOffs(114, 7).addBox(-1.5f, 1.0f, -1.0f, 3, 4, 3), PartPose.offsetAndRotation(0.0f, 1.0f, 1.3f, -2.5132742f, 0.12566371f, -0.12566371f));
        PartDefinition jointRL1 = mouthTR.addOrReplaceChild("jointRL1", CubeListBuilder.create().texOffs(71, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.6f, 3.0f, 1.0f));
        PartDefinition dec_4 = jointRL1.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(34, 20).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.9792033f, -2.380629f, -0.81681406f));
        PartDefinition joinRL2 = dec_4.addOrReplaceChild("joinRL2", CubeListBuilder.create().texOffs(62, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_4 = joinRL2.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(20, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2863812f));
        PartDefinition dec_5 = JD_4.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(39, 20).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.47822022f, -0.21642083f, 0.0f));
        PartDefinition jointRL3 = dec_5.addOrReplaceChild("jointRL3", CubeListBuilder.create().texOffs(119, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_5 = jointRL3.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(123, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_6 = JD_5.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(46, 21).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.134464f, -0.4537856f, 0.0f));
        PartDefinition jointRL4 = dec_6.addOrReplaceChild("jointRL4", CubeListBuilder.create().texOffs(64, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_7 = jointRL4.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(92, 21).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.6981317f, 0.0f));
        PartDefinition jointRM1 = mouthTR.addOrReplaceChild("jointRM1", CubeListBuilder.create().texOffs(118, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.6f, 1.2f));
        PartDefinition dec_8 = jointRM1.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(96, 23).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 2.0525072f, 0.12217305f, 0.0f));
        PartDefinition joinRM2 = dec_8.addOrReplaceChild("joinRM2", CubeListBuilder.create().texOffs(20, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_6 = joinRM2.addOrReplaceChild("JD_6", CubeListBuilder.create().texOffs(27, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0420353f));
        PartDefinition dec_9 = JD_6.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(53, 23).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, -0.77143556f, 0.0f));
        PartDefinition jointRM3 = dec_9.addOrReplaceChild("jointRM3", CubeListBuilder.create().texOffs(34, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_7 = jointRM3.addOrReplaceChild("JD_7", CubeListBuilder.create().texOffs(40, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
        PartDefinition dec_10 = JD_7.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(101, 23).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.43633232f, 1.4241886f, 0.0f));
        PartDefinition jointRM4 = dec_10.addOrReplaceChild("jointRM4", CubeListBuilder.create().texOffs(46, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_11 = jointRM4.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(113, 23).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7225663f, -1.1903145f, -0.25132743f));
        PartDefinition jointRR1 = mouthTR.addOrReplaceChild("jointRR1", CubeListBuilder.create().texOffs(59, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-1.1f, 3.0f, 1.0f));
        PartDefinition dec = jointRR1.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(51, 16).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.6527531f, 1.2566371f, 0.0f));
        PartDefinition joinRR2 = dec.addOrReplaceChild("joinRR2", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_2 = joinRR2.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(28, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2863812f));
        PartDefinition dec_1 = JD_2.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(20, 18).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.6457718f, 0.0f));
        PartDefinition jointRR3 = dec_1.addOrReplaceChild("jointRR3", CubeListBuilder.create().texOffs(59, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_3 = jointRR3.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(63, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_2 = JD_3.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(27, 20).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.0681415f, -0.07679449f, 0.43982297f));
        PartDefinition jointRR4 = dec_2.addOrReplaceChild("jointRR4", CubeListBuilder.create().texOffs(111, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_3 = jointRR4.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(57, 16).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.25132743f, 0.8656833f, 0.0f));
        PartDefinition jointM = neck.addOrReplaceChild("jointM", CubeListBuilder.create().texOffs(106, 1).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, -0.5f, -1.8f));
        PartDefinition mouth = jointM.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(99, 15).addBox(-3.5f, 0.0f, -5.3f, 7, 2, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.35604715f, 0.0f, -0.18849556f));
        PartDefinition teeth_10 = mouth.addOrReplaceChild("teeth_10", CubeListBuilder.create().texOffs(119, 14).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-2.9f, -0.3f, -4.5f, 0.23038346f, 0.0f, 0.0f));
        PartDefinition teeth_13 = mouth.addOrReplaceChild("teeth_13", CubeListBuilder.create().texOffs(31, 16).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(1.5f, -0.3f, -4.5f, 0.6073746f, 0.0f, 0.0f));
        PartDefinition teeth_14 = mouth.addOrReplaceChild("teeth_14", CubeListBuilder.create().texOffs(35, 16).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(2.9f, -0.3f, -4.5f, 0.35604715f, 0.0f, 0.0f));
        PartDefinition teeth_18 = mouth.addOrReplaceChild("teeth_18", CubeListBuilder.create().texOffs(51, 16).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(2.9f, -0.2f, -1.2f, 0.0f, (float)Math.PI, 0.35604715f));
        PartDefinition teeth_17 = mouth.addOrReplaceChild("teeth_17", CubeListBuilder.create().texOffs(47, 16).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(2.9f, -0.2f, -2.6f, 0.0f, (float)Math.PI, 0.6073746f));
        PartDefinition teeth_16 = mouth.addOrReplaceChild("teeth_16", CubeListBuilder.create().texOffs(43, 16).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, -0.3f, -4.5f, 0.2932153f, 0.0f, 0.0f));
        PartDefinition teeth_11 = mouth.addOrReplaceChild("teeth_11", CubeListBuilder.create().texOffs(123, 14).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-1.5f, -0.3f, -4.5f, 0.41887903f, 0.0f, 0.0f));
        PartDefinition teeth_12 = mouth.addOrReplaceChild("teeth_12", CubeListBuilder.create().texOffs(27, 16).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-2.9f, -0.2f, -4.1f, 0.0f, 0.0f, -0.23038346f));
        PartDefinition teeth_15 = mouth.addOrReplaceChild("teeth_15", CubeListBuilder.create().texOffs(39, 16).addBox(-0.5f, -2.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(2.9f, -0.2f, -4.1f, 0.0f, (float)Math.PI, 0.35604715f));
        return LayerDefinition.create(mesh, 128, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        float f22;
        float GD;
        float GS;
        EntityParasiteBase parasite = (EntityParasiteBase)entity;
        this.jointFLL.xRot = 0.0f;
        this.jointFRL.xRot = 0.0f;
        this.jointBLL.xRot = 0.0f;
        this.jointBRL.xRot = 0.0f;
        this.mainbody.y = 0.0f;
        this.mainbody.xRot = 0.0f;
        this.mainbody.zRot = 0.0f;
        this.jointM.xRot = 0.0f;
        this.jointH.xRot = headPitch * 0.016f;
        this.jointH.yRot = netHeadYaw * 0.016f;
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
            this.jointM.xRot = f22 = Mth.cos((float)(ageInTicks * 0.2f)) * 0.1f;
        } else if (i != 1 && i == 2) {
            if (!parasite.getStillAni()) {
                GS = 1.4f;
                GD = 0.2f;
                this.swingX(this.jointFLL, 0.3f * GS, 5.0f * GD, -1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL, 0.3f * GS, 5.0f * GD, -1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL, 0.3f * GS, 5.5f * GD, 1, -0.5f, 0.4f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL, 0.3f * GS, 5.5f * GD, 1, 0.5f, 0.4f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.3f * GS, -1, limbSwing, limbSwingAmount, 0.08f);
                this.swingX(this.mainbody, 0.3f * GS, 0.8f * GD, -1, 0.8f, 0.0f, limbSwing, limbSwingAmount);
            }
            this.jointM.xRot = f22 = Mth.cos((float)(ageInTicks * 0.5f)) * 0.2f;
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
