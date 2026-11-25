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
import com.dhanantry.scapeandrunparasites.entity.monster.feral.EntityFerCow;
import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;

public class ModelFerCow extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "fercow"), "main");
    private final ModelPart mainbody;
    private final ModelPart body;
    private final ModelPart body_1;
    private final ModelPart JD;
    private final ModelPart neck;
    private final ModelPart JD_1;
    private final ModelPart dec;
    private final ModelPart body_2;
    private final ModelPart jd;
    private final ModelPart jd_1;
    private final ModelPart jointRM1;
    private final ModelPart jointRL1;
    private final ModelPart jointRR1;
    private final ModelPart body_3;
    private final ModelPart JD_2;
    private final ModelPart JD_3;
    private final ModelPart body_4;
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
    private final ModelPart jointN;
    private final ModelPart dec_1;
    private final ModelPart jointdont;
    private final ModelPart jointH;
    private final ModelPart head;
    private final ModelPart ear;
    private final ModelPart ear_1;
    private final ModelPart mouthg;
    private final ModelPart dc;
    private final ModelPart ttt;
    private final ModelPart ttt_1;
    private final ModelPart ttt_2;
    private final ModelPart ttt_3;
    private final ModelPart ttt_4;
    private final ModelPart ttt_5;
    private final ModelPart jointFRL;
    private final ModelPart leg_9;
    private final ModelPart jointFRL1;
    private final ModelPart leg_10;
    private final ModelPart leg_11;
    private final ModelPart ttt_6;
    private final ModelPart ttt_7;
    private final ModelPart joint;
    private final ModelPart dec_2;
    private final ModelPart ttt_8;
    private final ModelPart ttt_9;
    private final ModelPart ttt_10;
    private final ModelPart ttt_11;
    private final ModelPart joint_1;
    private final ModelPart dec_3;
    private final ModelPart ttt_12;
    private final ModelPart ttt_13;
    private final ModelPart ttt_14;
    private final ModelPart ttt_15;
    private final ModelPart dec_4;
    private final ModelPart joinRM2;
    private final ModelPart JD_4;
    private final ModelPart dec_5;
    private final ModelPart jointRM3;
    private final ModelPart JD_5;
    private final ModelPart dec_6;
    private final ModelPart jointRM4;
    private final ModelPart dec_7;
    private final ModelPart dec_8;
    private final ModelPart joinRL2;
    private final ModelPart JD_6;
    private final ModelPart dec_9;
    private final ModelPart jointRL3;
    private final ModelPart JD_7;
    private final ModelPart dec_10;
    private final ModelPart jointRL4;
    private final ModelPart dec_11;
    private final ModelPart dec_12;
    private final ModelPart joinRR2;
    private final ModelPart JD_8;
    private final ModelPart dec_13;
    private final ModelPart jointRR3;
    private final ModelPart JD_9;
    private final ModelPart dec_14;
    private final ModelPart jointRR4;
    private final ModelPart dec_15;

    public ModelFerCow(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.body = root.getChild("mainbody").getChild("body");
        this.body_1 = root.getChild("mainbody").getChild("body").getChild("body_1");
        this.JD = root.getChild("mainbody").getChild("body").getChild("JD");
        this.neck = root.getChild("mainbody").getChild("body").getChild("neck");
        this.JD_1 = root.getChild("mainbody").getChild("body").getChild("JD_1");
        this.dec = root.getChild("mainbody").getChild("body").getChild("dec");
        this.body_2 = root.getChild("mainbody").getChild("body").getChild("body_2");
        this.jd = root.getChild("mainbody").getChild("body").getChild("jd");
        this.jd_1 = root.getChild("mainbody").getChild("body").getChild("jd_1");
        this.jointRM1 = root.getChild("mainbody").getChild("body").getChild("jointRM1");
        this.jointRL1 = root.getChild("mainbody").getChild("body").getChild("jointRL1");
        this.jointRR1 = root.getChild("mainbody").getChild("body").getChild("jointRR1");
        this.body_3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3");
        this.JD_2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("JD_2");
        this.JD_3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("JD_3");
        this.body_4 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("body_4");
        this.jointBLL = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("JD_2").getChild("jointBLL");
        this.leg = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("JD_2").getChild("jointBLL").getChild("leg");
        this.jointBLL1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("JD_2").getChild("jointBLL").getChild("leg").getChild("jointBLL1");
        this.leg_1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("JD_2").getChild("jointBLL").getChild("leg").getChild("jointBLL1").getChild("leg_1");
        this.leg_2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("JD_2").getChild("jointBLL").getChild("leg").getChild("jointBLL1").getChild("leg_1").getChild("leg_2");
        this.jointBRL = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("JD_3").getChild("jointBRL");
        this.leg_3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("JD_3").getChild("jointBRL").getChild("leg_3");
        this.jointBRL1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("JD_3").getChild("jointBRL").getChild("leg_3").getChild("jointBRL1");
        this.leg_4 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("JD_3").getChild("jointBRL").getChild("leg_3").getChild("jointBRL1").getChild("leg_4");
        this.leg_5 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("body_3").getChild("JD_3").getChild("jointBRL").getChild("leg_3").getChild("jointBRL1").getChild("leg_4").getChild("leg_5");
        this.jointFLL = root.getChild("mainbody").getChild("body").getChild("JD").getChild("jointFLL");
        this.leg_6 = root.getChild("mainbody").getChild("body").getChild("JD").getChild("jointFLL").getChild("leg_6");
        this.jointFLL1 = root.getChild("mainbody").getChild("body").getChild("JD").getChild("jointFLL").getChild("leg_6").getChild("jointFLL1");
        this.leg_7 = root.getChild("mainbody").getChild("body").getChild("JD").getChild("jointFLL").getChild("leg_6").getChild("jointFLL1").getChild("leg_7");
        this.leg_8 = root.getChild("mainbody").getChild("body").getChild("JD").getChild("jointFLL").getChild("leg_6").getChild("jointFLL1").getChild("leg_7").getChild("leg_8");
        this.jointN = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN");
        this.dec_1 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1");
        this.jointdont = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont");
        this.jointH = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont").getChild("jointH");
        this.head = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont").getChild("jointH").getChild("head");
        this.ear = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont").getChild("jointH").getChild("head").getChild("ear");
        this.ear_1 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont").getChild("jointH").getChild("head").getChild("ear_1");
        this.mouthg = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont").getChild("jointH").getChild("head").getChild("mouthg");
        this.dc = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont").getChild("jointH").getChild("head").getChild("dc");
        this.ttt = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont").getChild("jointH").getChild("head").getChild("ttt");
        this.ttt_1 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont").getChild("jointH").getChild("head").getChild("ttt_1");
        this.ttt_2 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont").getChild("jointH").getChild("head").getChild("ttt_2");
        this.ttt_3 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont").getChild("jointH").getChild("head").getChild("ttt_3");
        this.ttt_4 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont").getChild("jointH").getChild("head").getChild("ttt_4");
        this.ttt_5 = root.getChild("mainbody").getChild("body").getChild("neck").getChild("jointN").getChild("dec_1").getChild("jointdont").getChild("jointH").getChild("head").getChild("ttt_5");
        this.jointFRL = root.getChild("mainbody").getChild("body").getChild("JD_1").getChild("jointFRL");
        this.leg_9 = root.getChild("mainbody").getChild("body").getChild("JD_1").getChild("jointFRL").getChild("leg_9");
        this.jointFRL1 = root.getChild("mainbody").getChild("body").getChild("JD_1").getChild("jointFRL").getChild("leg_9").getChild("jointFRL1");
        this.leg_10 = root.getChild("mainbody").getChild("body").getChild("JD_1").getChild("jointFRL").getChild("leg_9").getChild("jointFRL1").getChild("leg_10");
        this.leg_11 = root.getChild("mainbody").getChild("body").getChild("JD_1").getChild("jointFRL").getChild("leg_9").getChild("jointFRL1").getChild("leg_10").getChild("leg_11");
        this.ttt_6 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("ttt_6");
        this.ttt_7 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("ttt_7");
        this.joint = root.getChild("mainbody").getChild("body").getChild("jd").getChild("joint");
        this.dec_2 = root.getChild("mainbody").getChild("body").getChild("jd").getChild("joint").getChild("dec_2");
        this.ttt_8 = root.getChild("mainbody").getChild("body").getChild("jd").getChild("joint").getChild("dec_2").getChild("ttt_8");
        this.ttt_9 = root.getChild("mainbody").getChild("body").getChild("jd").getChild("joint").getChild("dec_2").getChild("ttt_9");
        this.ttt_10 = root.getChild("mainbody").getChild("body").getChild("jd").getChild("joint").getChild("dec_2").getChild("ttt_10");
        this.ttt_11 = root.getChild("mainbody").getChild("body").getChild("jd").getChild("joint").getChild("dec_2").getChild("ttt_11");
        this.joint_1 = root.getChild("mainbody").getChild("body").getChild("jd_1").getChild("joint_1");
        this.dec_3 = root.getChild("mainbody").getChild("body").getChild("jd_1").getChild("joint_1").getChild("dec_3");
        this.ttt_12 = root.getChild("mainbody").getChild("body").getChild("jd_1").getChild("joint_1").getChild("dec_3").getChild("ttt_12");
        this.ttt_13 = root.getChild("mainbody").getChild("body").getChild("jd_1").getChild("joint_1").getChild("dec_3").getChild("ttt_13");
        this.ttt_14 = root.getChild("mainbody").getChild("body").getChild("jd_1").getChild("joint_1").getChild("dec_3").getChild("ttt_14");
        this.ttt_15 = root.getChild("mainbody").getChild("body").getChild("jd_1").getChild("joint_1").getChild("dec_3").getChild("ttt_15");
        this.dec_4 = root.getChild("mainbody").getChild("body").getChild("jointRM1").getChild("dec_4");
        this.joinRM2 = root.getChild("mainbody").getChild("body").getChild("jointRM1").getChild("dec_4").getChild("joinRM2");
        this.JD_4 = root.getChild("mainbody").getChild("body").getChild("jointRM1").getChild("dec_4").getChild("joinRM2").getChild("JD_4");
        this.dec_5 = root.getChild("mainbody").getChild("body").getChild("jointRM1").getChild("dec_4").getChild("joinRM2").getChild("JD_4").getChild("dec_5");
        this.jointRM3 = root.getChild("mainbody").getChild("body").getChild("jointRM1").getChild("dec_4").getChild("joinRM2").getChild("JD_4").getChild("dec_5").getChild("jointRM3");
        this.JD_5 = root.getChild("mainbody").getChild("body").getChild("jointRM1").getChild("dec_4").getChild("joinRM2").getChild("JD_4").getChild("dec_5").getChild("jointRM3").getChild("JD_5");
        this.dec_6 = root.getChild("mainbody").getChild("body").getChild("jointRM1").getChild("dec_4").getChild("joinRM2").getChild("JD_4").getChild("dec_5").getChild("jointRM3").getChild("JD_5").getChild("dec_6");
        this.jointRM4 = root.getChild("mainbody").getChild("body").getChild("jointRM1").getChild("dec_4").getChild("joinRM2").getChild("JD_4").getChild("dec_5").getChild("jointRM3").getChild("JD_5").getChild("dec_6").getChild("jointRM4");
        this.dec_7 = root.getChild("mainbody").getChild("body").getChild("jointRM1").getChild("dec_4").getChild("joinRM2").getChild("JD_4").getChild("dec_5").getChild("jointRM3").getChild("JD_5").getChild("dec_6").getChild("jointRM4").getChild("dec_7");
        this.dec_8 = root.getChild("mainbody").getChild("body").getChild("jointRL1").getChild("dec_8");
        this.joinRL2 = root.getChild("mainbody").getChild("body").getChild("jointRL1").getChild("dec_8").getChild("joinRL2");
        this.JD_6 = root.getChild("mainbody").getChild("body").getChild("jointRL1").getChild("dec_8").getChild("joinRL2").getChild("JD_6");
        this.dec_9 = root.getChild("mainbody").getChild("body").getChild("jointRL1").getChild("dec_8").getChild("joinRL2").getChild("JD_6").getChild("dec_9");
        this.jointRL3 = root.getChild("mainbody").getChild("body").getChild("jointRL1").getChild("dec_8").getChild("joinRL2").getChild("JD_6").getChild("dec_9").getChild("jointRL3");
        this.JD_7 = root.getChild("mainbody").getChild("body").getChild("jointRL1").getChild("dec_8").getChild("joinRL2").getChild("JD_6").getChild("dec_9").getChild("jointRL3").getChild("JD_7");
        this.dec_10 = root.getChild("mainbody").getChild("body").getChild("jointRL1").getChild("dec_8").getChild("joinRL2").getChild("JD_6").getChild("dec_9").getChild("jointRL3").getChild("JD_7").getChild("dec_10");
        this.jointRL4 = root.getChild("mainbody").getChild("body").getChild("jointRL1").getChild("dec_8").getChild("joinRL2").getChild("JD_6").getChild("dec_9").getChild("jointRL3").getChild("JD_7").getChild("dec_10").getChild("jointRL4");
        this.dec_11 = root.getChild("mainbody").getChild("body").getChild("jointRL1").getChild("dec_8").getChild("joinRL2").getChild("JD_6").getChild("dec_9").getChild("jointRL3").getChild("JD_7").getChild("dec_10").getChild("jointRL4").getChild("dec_11");
        this.dec_12 = root.getChild("mainbody").getChild("body").getChild("jointRR1").getChild("dec_12");
        this.joinRR2 = root.getChild("mainbody").getChild("body").getChild("jointRR1").getChild("dec_12").getChild("joinRR2");
        this.JD_8 = root.getChild("mainbody").getChild("body").getChild("jointRR1").getChild("dec_12").getChild("joinRR2").getChild("JD_8");
        this.dec_13 = root.getChild("mainbody").getChild("body").getChild("jointRR1").getChild("dec_12").getChild("joinRR2").getChild("JD_8").getChild("dec_13");
        this.jointRR3 = root.getChild("mainbody").getChild("body").getChild("jointRR1").getChild("dec_12").getChild("joinRR2").getChild("JD_8").getChild("dec_13").getChild("jointRR3");
        this.JD_9 = root.getChild("mainbody").getChild("body").getChild("jointRR1").getChild("dec_12").getChild("joinRR2").getChild("JD_8").getChild("dec_13").getChild("jointRR3").getChild("JD_9");
        this.dec_14 = root.getChild("mainbody").getChild("body").getChild("jointRR1").getChild("dec_12").getChild("joinRR2").getChild("JD_8").getChild("dec_13").getChild("jointRR3").getChild("JD_9").getChild("dec_14");
        this.jointRR4 = root.getChild("mainbody").getChild("body").getChild("jointRR1").getChild("dec_12").getChild("joinRR2").getChild("JD_8").getChild("dec_13").getChild("jointRR3").getChild("JD_9").getChild("dec_14").getChild("jointRR4");
        this.dec_15 = root.getChild("mainbody").getChild("body").getChild("jointRR1").getChild("dec_12").getChild("joinRR2").getChild("JD_8").getChild("dec_13").getChild("jointRR3").getChild("JD_9").getChild("dec_14").getChild("jointRR4").getChild("dec_15");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 12.1f, 2.0f));
        PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0f, -1.0f, 1.0f, 12, 10, 7), PartPose.offsetAndRotation(0.0f, -10.0f, -8.0f, -0.29670596f, 0.0f, 0.0f));
        PartDefinition JD_1 = body.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-4.2f, 8.7f, 4.7f, 0.29670596f, 0.0f, 0.0f));
        PartDefinition jointFRL = JD_1.addOrReplaceChild("jointFRL", CubeListBuilder.create().texOffs(114, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_9 = jointFRL.addOrReplaceChild("leg_9", CubeListBuilder.create().texOffs(107, 28).addBox(-2.0f, -1.0f, -2.0f, 4, 6, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.33161256f, 0.0f, 0.0f));
        PartDefinition jointFRL1 = leg_9.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(31, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition leg_10 = jointFRL1.addOrReplaceChild("leg_10", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5f, -0.7f, -1.5f, 3, 7, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, 0.08726646f, 0.0f));
        PartDefinition leg_11 = leg_10.addOrReplaceChild("leg_11", CubeListBuilder.create().texOffs(29, 30).addBox(-2.0f, -1.0f, -2.0f, 4, 2, 4), PartPose.offset(0.0f, 6.3f, 0.0f));
        PartDefinition jointRM1 = body.addOrReplaceChild("jointRM1", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 3.1f, 1.2f));
        PartDefinition dec_4 = jointRM1.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(75, 28).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.33161256f, -0.20943952f, 0.0f));
        PartDefinition joinRM2 = dec_4.addOrReplaceChild("joinRM2", CubeListBuilder.create().texOffs(89, 13).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_4 = joinRM2.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(24, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0420353f));
        PartDefinition dec_5 = JD_4.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(40, 31).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.37699112f, -0.24783675f, 0.0f));
        PartDefinition jointRM3 = dec_5.addOrReplaceChild("jointRM3", CubeListBuilder.create().texOffs(28, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_5 = jointRM3.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(32, 17).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
        PartDefinition dec_6 = JD_5.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(94, 33).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.19198622f, 0.0f));
        PartDefinition jointRM4 = dec_6.addOrReplaceChild("jointRM4", CubeListBuilder.create().texOffs(24, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_7 = jointRM4.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(79, 22).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.80285144f, 0.0f));
        PartDefinition JD = body.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(4.2f, 8.7f, 4.7f, 0.29670596f, 0.0f, 0.0f));
        PartDefinition jointFLL = JD.addOrReplaceChild("jointFLL", CubeListBuilder.create().texOffs(35, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_6 = jointFLL.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(83, 22).addBox(-2.0f, -1.0f, -2.0f, 4, 6, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.33161256f, 0.0f, 0.0f));
        PartDefinition jointFLL1 = leg_6.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(39, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition leg_7 = jointFLL1.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(99, 22).addBox(-1.5f, -0.7f, -1.5f, 3, 7, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, -0.08726646f, 0.0f));
        PartDefinition leg_8 = leg_7.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0f, -1.0f, -2.0f, 4, 2, 4), PartPose.offset(0.0f, 6.3f, 0.0f));
        PartDefinition jd_1 = body.addOrReplaceChild("jd_1", CubeListBuilder.create().texOffs(43, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.0f, 7.5f, 1.0f));
        PartDefinition joint_1 = jd_1.addOrReplaceChild("joint_1", CubeListBuilder.create().texOffs(93, 10).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition dec_3 = joint_1.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(8, 36).addBox(-2.0f, -1.0f, -3.0f, 5, 2, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.54105204f, 0.0f, 0.40142572f));
        PartDefinition ttt_15 = dec_3.addOrReplaceChild("ttt_15", CubeListBuilder.create().texOffs(16, 17).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-1.5f, -1.5f, -0.5f, 0.0f, 0.0f, -0.41887903f));
        PartDefinition ttt_12 = dec_3.addOrReplaceChild("ttt_12", CubeListBuilder.create().texOffs(117, 16).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.5f, -1.5f, -2.0f, 0.17453292f, 0.0f, -0.15707964f));
        PartDefinition ttt_13 = dec_3.addOrReplaceChild("ttt_13", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5f, -2.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(2.0f, -1.5f, -2.0f, 0.17453292f, 0.0f, (float)(-Math.PI) / 180));
        PartDefinition ttt_14 = dec_3.addOrReplaceChild("ttt_14", CubeListBuilder.create().texOffs(12, 17).addBox(-0.5f, -2.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-1.0f, -1.5f, -2.0f, 0.10471976f, 0.0f, -0.2443461f));
        PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(76, 0).addBox(-3.5f, -2.2f, -0.1f, 7, 5, 5), PartPose.offsetAndRotation(2.0f, -3.0f, 1.0f, -0.9424778f, -0.13962634f, 0.08726646f));
        PartDefinition jointN = neck.addOrReplaceChild("jointN", CubeListBuilder.create().texOffs(43, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition dec_1 = jointN.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(13, 28).addBox(-2.5f, -0.1f, -1.1f, 5, 5, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -2.0420353f, 0.0f, 0.0f));
        PartDefinition jointdont = dec_1.addOrReplaceChild("jointdont", CubeListBuilder.create().texOffs(95, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 3.6f, 0.4f, 0.9250245f, 0.0f, 0.0f));
        PartDefinition jointH = jointdont.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(99, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition head = jointH.addOrReplaceChild("head", CubeListBuilder.create().texOffs(53, 28).addBox(-4.0f, -4.0f, -6.0f, 8, 5, 6), PartPose.offsetAndRotation(0.0f, -0.2f, -0.4f, 1.2915436f, 0.0f, 0.0f));
        PartDefinition mouthg = head.addOrReplaceChild("mouthg", CubeListBuilder.create().texOffs(116, 6).addBox(-1.5f, -0.1f, -0.1f, 3, 4, 2), PartPose.offsetAndRotation(0.0f, 0.1f, -3.2f, 0.4537856f, 0.0f, 0.0f));
        PartDefinition ttt_3 = head.addOrReplaceChild("ttt_3", CubeListBuilder.create().texOffs(42, 4).addBox(-0.5f, -1.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(-1.9f, 1.6f, -4.9f, 0.43633232f, 0.0f, 0.12217305f));
        PartDefinition ttt_5 = head.addOrReplaceChild("ttt_5", CubeListBuilder.create().texOffs(112, 7).addBox(-0.5f, -1.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(3.3f, 1.7f, -3.1f, 0.31415927f, -0.40142572f, -0.31415927f));
        PartDefinition ttt_1 = head.addOrReplaceChild("ttt_1", CubeListBuilder.create().texOffs(38, 4).addBox(-0.5f, -1.0f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(1.5f, 1.7f, -4.9f, 0.17453292f, 0.0f, 0.08726646f));
        PartDefinition ear = head.addOrReplaceChild("ear", CubeListBuilder.create().texOffs(118, 2).addBox(4.0f, -5.0f, -4.0f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, -0.2f, -0.1f, 0.08726646f, 0.0f, -0.05235988f));
        PartDefinition ttt_4 = head.addOrReplaceChild("ttt_4", CubeListBuilder.create().texOffs(3, 3).addBox(-0.5f, -1.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-3.4f, 1.4f, -4.9f, 0.38397244f, 0.0f, 0.19198622f));
        PartDefinition ttt_2 = head.addOrReplaceChild("ttt_2", CubeListBuilder.create().texOffs(123, 16).addBox(-0.5f, -1.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(-0.3f, 1.6f, -4.9f, -0.05235988f, 0.0f, 0.0f));
        PartDefinition ttt = head.addOrReplaceChild("ttt", CubeListBuilder.create().texOffs(71, 16).addBox(-0.5f, -1.0f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(2.9f, 1.8f, -5.1f, 0.19198622f, -0.2268928f, -0.10471976f));
        PartDefinition ear_1 = head.addOrReplaceChild("ear_1", CubeListBuilder.create().texOffs(122, 2).addBox(-5.0f, -5.0f, -4.0f, 1, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.08726646f, 0.0f, 0.06981317f));
        PartDefinition dc = head.addOrReplaceChild("dc", CubeListBuilder.create().texOffs(117, 12).addBox(-1.5f, -1.3f, -1.0f, 3, 2, 2), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, 0.43633232f, 0.0f, 0.0f));
        PartDefinition body_2 = body.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(100, 0).addBox(-2.0f, 0.0f, -2.0f, 5, 3, 4), PartPose.offsetAndRotation(-3.3f, -1.0f, 2.3f, -0.82030475f, 0.0f, -0.38397244f));
        PartDefinition ttt_6 = body_2.addOrReplaceChild("ttt_6", CubeListBuilder.create().texOffs(67, 5).addBox(-0.5f, -1.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-1.3f, 3.4f, -0.8f, 0.27925268f, 0.0f, 0.4537856f));
        PartDefinition ttt_7 = body_2.addOrReplaceChild("ttt_7", CubeListBuilder.create().texOffs(71, 5).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(0.5f, 3.5f, -1.2f, 0.27925268f, 0.0f, 0.29670596f));
        PartDefinition jointRR1 = body.addOrReplaceChild("jointRR1", CubeListBuilder.create().texOffs(99, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.1f, 4.0f, 1.2f));
        PartDefinition dec_12 = jointRR1.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(45, 37).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, (float)(-Math.PI) / 180, 0.29670596f, 0.0f));
        PartDefinition joinRR2 = dec_12.addOrReplaceChild("joinRR2", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_8 = joinRR2.addOrReplaceChild("JD_8", CubeListBuilder.create().texOffs(12, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2863812f));
        PartDefinition dec_13 = JD_8.addOrReplaceChild("dec_13", CubeListBuilder.create().texOffs(76, 38).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.6457718f, 0.0f));
        PartDefinition jointRR3 = dec_13.addOrReplaceChild("jointRR3", CubeListBuilder.create().texOffs(28, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_9 = jointRR3.addOrReplaceChild("JD_9", CubeListBuilder.create().texOffs(98, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_14 = JD_9.addOrReplaceChild("dec_14", CubeListBuilder.create().texOffs(101, 38).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.13962634f, 0.0f));
        PartDefinition jointRR4 = dec_14.addOrReplaceChild("jointRR4", CubeListBuilder.create().texOffs(95, 24).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_15 = jointRR4.addOrReplaceChild("dec_15", CubeListBuilder.create().texOffs(47, 30).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.80285144f, 0.0f));
        PartDefinition jointRL1 = body.addOrReplaceChild("jointRL1", CubeListBuilder.create().texOffs(95, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.1f, 4.0f, 1.2f));
        PartDefinition dec_8 = jointRL1.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(26, 36).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.2443461f, -0.83775806f, 0.0f));
        PartDefinition joinRL2 = dec_8.addOrReplaceChild("joinRL2", CubeListBuilder.create().texOffs(28, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_6 = joinRL2.addOrReplaceChild("JD_6", CubeListBuilder.create().texOffs(32, 19).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2863812f));
        PartDefinition dec_9 = JD_6.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(31, 36).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.5061455f, 0.0f));
        PartDefinition jointRL3 = dec_9.addOrReplaceChild("jointRL3", CubeListBuilder.create().texOffs(28, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_7 = jointRL3.addOrReplaceChild("JD_7", CubeListBuilder.create().texOffs(95, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_10 = JD_7.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(38, 37).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.4537856f, 0.0f));
        PartDefinition jointRL4 = dec_10.addOrReplaceChild("jointRL4", CubeListBuilder.create().texOffs(108, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_11 = jointRL4.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(119, 28).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.80285144f, 0.0f));
        PartDefinition jd = body.addOrReplaceChild("jd", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 7.5f, 1.0f));
        PartDefinition joint = jd.addOrReplaceChild("joint", CubeListBuilder.create().texOffs(34, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition dec_2 = joint.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(81, 32).addBox(-3.0f, -1.0f, -3.0f, 5, 2, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.54105204f, 0.0f, -0.40142572f));
        PartDefinition ttt_8 = dec_2.addOrReplaceChild("ttt_8", CubeListBuilder.create().texOffs(76, 10).addBox(-0.5f, -2.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(1.5f, -1.5f, -2.0f, 0.19198622f, 0.0f, 0.31415927f));
        PartDefinition ttt_11 = dec_2.addOrReplaceChild("ttt_11", CubeListBuilder.create().texOffs(58, 16).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(1.0f, -1.5f, -0.5f, 0.0f, 0.0f, 0.2443461f));
        PartDefinition ttt_9 = dec_2.addOrReplaceChild("ttt_9", CubeListBuilder.create().texOffs(89, 10).addBox(-0.5f, -1.0f, -0.5f, 1, 2, 1), PartPose.offsetAndRotation(-2.0f, -1.5f, -2.0f, 0.0f, 0.0f, 0.20943952f));
        PartDefinition ttt_10 = dec_2.addOrReplaceChild("ttt_10", CubeListBuilder.create().texOffs(54, 16).addBox(-0.5f, -2.0f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-0.2f, -1.5f, -2.0f, 0.19198622f, 0.0f, 0.17453292f));
        PartDefinition body_1 = body.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(38, 0).addBox(-4.7f, 0.2f, -1.0f, 10, 7, 9), PartPose.offsetAndRotation(0.0f, 0.2f, 6.4f, 0.38397244f, 0.0f, 0.0f));
        PartDefinition body_3 = body_1.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(95, 7).addBox(-5.5f, -1.5f, -1.0f, 6, 10, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 8.0f, -0.08726646f, 0.0f, 0.0f));
        PartDefinition JD_3 = body_3.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(118, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.1f, 8.4f, 1.0f));
        PartDefinition jointBRL = JD_3.addOrReplaceChild("jointBRL", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg_3 = jointBRL.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(16, 17).addBox(-1.0f, -1.0f, -2.0f, 2, 7, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.33161256f, 0.0f, 0.0f));
        PartDefinition jointBRL1 = leg_3.addOrReplaceChild("jointBRL1", CubeListBuilder.create().texOffs(31, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition leg_4 = jointBRL1.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(114, 19).addBox(-1.5f, 0.0f, -1.5f, 3, 6, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, 0.08726646f, 0.0f));
        PartDefinition leg_5 = leg_4.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(67, 22).addBox(-2.0f, -1.0f, -2.0f, 4, 2, 4), PartPose.offset(0.0f, 6.3f, 0.0f));
        PartDefinition body_4 = body_3.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(33, 16).addBox(0.0f, -4.0f, 0.0f, 8, 9, 5), PartPose.offsetAndRotation(-1.0f, 4.2f, -0.2f, 0.0f, 0.0f, -0.15707964f));
        PartDefinition JD_2 = body_3.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(114, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.1f, 8.4f, 1.0f));
        PartDefinition jointBLL = JD_2.addOrReplaceChild("jointBLL", CubeListBuilder.create().texOffs(122, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition leg = jointBLL.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(76, 10).addBox(-2.0f, -1.0f, -3.0f, 4, 7, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.33161256f, 0.0f, 0.0f));
        PartDefinition jointBLL1 = leg.addOrReplaceChild("jointBLL1", CubeListBuilder.create().texOffs(3, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 5.0f, 0.0f));
        PartDefinition leg_1 = jointBLL1.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(59, 16).addBox(-1.5f, 0.0f, -1.5f, 3, 6, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, -0.08726646f, 0.0f));
        PartDefinition leg_2 = leg_1.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(0, 17).addBox(-2.0f, -1.0f, -2.0f, 4, 2, 4), PartPose.offset(0.0f, 6.3f, 0.0f));
        PartDefinition dec = body.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(67, 0).addBox(-1.0f, -1.0f, -1.0f, 4, 3, 2), PartPose.offsetAndRotation(-1.0f, 5.7f, 1.2f, 0.7330383f, 0.0f, (float)Math.PI / 90));
        return LayerDefinition.create(mesh, 128, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        float GD;
        float GS;
        EntityFerCow parasite = (EntityFerCow)entity;
        this.jointFLL.xRot = 0.0f;
        this.jointFRL.xRot = 0.0f;
        this.jointBLL.xRot = 0.0f;
        this.jointBRL.xRot = 0.0f;
        this.mainbody.x = 0.0f;
        this.mainbody.y = 0.0f;
        this.mainbody.z = 0.0f;
        this.mainbody.xRot = 0.0f;
        this.mainbody.zRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                GS = 2.1f;
                GD = 2.0f;
                this.swingX(this.jointFLL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.05f);
                this.mainbody.xRot = 0.0f;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (!parasite.getStillAni()) {
                    GS = 1.6f;
                    GD = 0.3f;
                    this.swingX(this.jointFLL, 0.3f * GS, 3.0f * GD, -1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
                    this.swingX(this.jointFRL, 0.3f * GS, 3.0f * GD, -1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
                    this.swingX(this.jointBLL, 0.3f * GS, 3.5f * GD, 1, -0.5f, 0.4f, limbSwing, limbSwingAmount);
                    this.swingX(this.jointBRL, 0.3f * GS, 3.5f * GD, 1, 0.5f, 0.4f, limbSwing, limbSwingAmount);
                    this.moveY(this.mainbody, 0.3f * GS, -1, limbSwing, limbSwingAmount, 0.08f);
                    this.swingX(this.mainbody, 0.3f * GS, 0.8f * GD, -1, 0.8f, 0.0f, limbSwing, limbSwingAmount);
                }
            } else if (i == 3) {
                if (!parasite.getStillAni()) {
                    GS = 2.6f;
                    GD = 0.3f;
                    this.swingX(this.jointFLL, 0.3f * GS, 3.0f * GD, -1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
                    this.swingX(this.jointFRL, 0.3f * GS, 3.0f * GD, -1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
                    this.swingX(this.jointBLL, 0.3f * GS, 3.5f * GD, 1, -0.5f, 0.4f, limbSwing, limbSwingAmount);
                    this.swingX(this.jointBRL, 0.3f * GS, 3.5f * GD, 1, 0.5f, 0.4f, limbSwing, limbSwingAmount);
                    this.moveY(this.mainbody, 0.3f * GS, -1, limbSwing, limbSwingAmount, 0.08f);
                    this.swingX(this.mainbody, 0.3f * GS, 0.8f * GD, -1, 0.8f, 0.0f, limbSwing, limbSwingAmount);
                } else {
                    float f2 = Mth.cos((float)(ageInTicks * 2.6f)) * 0.015f;
                    float f1 = Mth.cos((float)(ageInTicks * 2.27f)) * 0.02f;
                    this.mainbody.x = f2;
                    this.mainbody.z = f1;
                }
            }
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
        this.joint.xRot = f4;
        this.joint.zRot = f3;
        f3 = Mth.cos((float)(ageInTicks * 0.17f)) * 0.2065f;
        f4 = Mth.cos((float)(ageInTicks * 0.2216f)) * 0.3021f;
        this.joint_1.xRot = -f3;
        this.joint_1.zRot = f4;
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
