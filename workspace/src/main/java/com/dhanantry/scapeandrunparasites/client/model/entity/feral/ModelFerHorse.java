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

public class ModelFerHorse extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "ferhorse"), "main");
    private final ModelPart mainbody;
    private final ModelPart bodym;
    private final ModelPart body;
    private final ModelPart dec;
    private final ModelPart JD;
    private final ModelPart bodym_1;
    private final ModelPart JD_1;
    private final ModelPart JD_2;
    private final ModelPart dec_1;
    private final ModelPart jointH;
    private final ModelPart bodyn;
    private final ModelPart body_1;
    private final ModelPart body_2;
    private final ModelPart body_3;
    private final ModelPart bodyh;
    private final ModelPart body_4;
    private final ModelPart body_5;
    private final ModelPart body_6;
    private final ModelPart dec_2;
    private final ModelPart dec_3;
    private final ModelPart dec_4;
    private final ModelPart dec_5;
    private final ModelPart dec_6;
    private final ModelPart dec_7;
    private final ModelPart dec_8;
    private final ModelPart dec_9;
    private final ModelPart dec_10;
    private final ModelPart mouthTR;
    private final ModelPart bodymu;
    private final ModelPart body_7;
    private final ModelPart dec_11;
    private final ModelPart dec_12;
    private final ModelPart dec_13;
    private final ModelPart dec_14;
    private final ModelPart dec_15;
    private final ModelPart dec_16;
    private final ModelPart jointRR1;
    private final ModelPart jointRL1;
    private final ModelPart jointRM1;
    private final ModelPart dec_17;
    private final ModelPart joinRR2;
    private final ModelPart JD_3;
    private final ModelPart dec_18;
    private final ModelPart jointRR3;
    private final ModelPart JD_4;
    private final ModelPart dec_19;
    private final ModelPart jointRR4;
    private final ModelPart dec_20;
    private final ModelPart dec_21;
    private final ModelPart joinRL2;
    private final ModelPart JD_5;
    private final ModelPart dec_22;
    private final ModelPart jointRL3;
    private final ModelPart JD_6;
    private final ModelPart dec_23;
    private final ModelPart jointRL4;
    private final ModelPart dec_24;
    private final ModelPart dec_25;
    private final ModelPart joinRM2;
    private final ModelPart JD_7;
    private final ModelPart dec_26;
    private final ModelPart jointRM3;
    private final ModelPart JD_8;
    private final ModelPart dec_27;
    private final ModelPart jointRM4;
    private final ModelPart dec_28;
    private final ModelPart bodyb;
    private final ModelPart JD_9;
    private final ModelPart JD_10;
    private final ModelPart jointBLL;
    private final ModelPart body_8;
    private final ModelPart jointBLL1;
    private final ModelPart body_9;
    private final ModelPart body_10;
    private final ModelPart jointBRL;
    private final ModelPart body_11;
    private final ModelPart jointBRL1;
    private final ModelPart body_12;
    private final ModelPart body_13;
    private final ModelPart jointFLL;
    private final ModelPart body_14;
    private final ModelPart jointFLL1;
    private final ModelPart body_15;
    private final ModelPart body_16;
    private final ModelPart jointFRL;
    private final ModelPart body_17;
    private final ModelPart jointFRL1;
    private final ModelPart body_18;
    private final ModelPart body_19;

    public ModelFerHorse(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.bodym = root.getChild("mainbody").getChild("bodym");
        this.body = root.getChild("mainbody").getChild("body");
        this.dec = root.getChild("mainbody").getChild("dec");
        this.JD = root.getChild("mainbody").getChild("bodym").getChild("JD");
        this.bodym_1 = root.getChild("mainbody").getChild("bodym").getChild("bodym_1");
        this.JD_1 = root.getChild("mainbody").getChild("bodym").getChild("JD_1");
        this.JD_2 = root.getChild("mainbody").getChild("bodym").getChild("JD_2");
        this.dec_1 = root.getChild("mainbody").getChild("bodym").getChild("dec_1");
        this.jointH = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH");
        this.bodyn = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn");
        this.body_1 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("body_1");
        this.body_2 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("body_2");
        this.body_3 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("body_3");
        this.bodyh = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("bodyh");
        this.body_4 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("body_4");
        this.body_5 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("body_5");
        this.body_6 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("body_6");
        this.dec_2 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("dec_2");
        this.dec_3 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("dec_3");
        this.dec_4 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("dec_4");
        this.dec_5 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("dec_5");
        this.dec_6 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("dec_6");
        this.dec_7 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("dec_7");
        this.dec_8 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("dec_8");
        this.dec_9 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("dec_9");
        this.dec_10 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("dec_10");
        this.mouthTR = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR");
        this.bodymu = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("bodyh").getChild("bodymu");
        this.body_7 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("bodyh").getChild("body_7");
        this.dec_11 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("bodyh").getChild("bodymu").getChild("dec_11");
        this.dec_12 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("bodyh").getChild("bodymu").getChild("dec_12");
        this.dec_13 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("bodyh").getChild("bodymu").getChild("dec_13");
        this.dec_14 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("bodyh").getChild("bodymu").getChild("dec_14");
        this.dec_15 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("bodyh").getChild("bodymu").getChild("dec_15");
        this.dec_16 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("bodyh").getChild("bodymu").getChild("dec_16");
        this.jointRR1 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRR1");
        this.jointRL1 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRL1");
        this.jointRM1 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRM1");
        this.dec_17 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRR1").getChild("dec_17");
        this.joinRR2 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRR1").getChild("dec_17").getChild("joinRR2");
        this.JD_3 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRR1").getChild("dec_17").getChild("joinRR2").getChild("JD_3");
        this.dec_18 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRR1").getChild("dec_17").getChild("joinRR2").getChild("JD_3").getChild("dec_18");
        this.jointRR3 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRR1").getChild("dec_17").getChild("joinRR2").getChild("JD_3").getChild("dec_18").getChild("jointRR3");
        this.JD_4 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRR1").getChild("dec_17").getChild("joinRR2").getChild("JD_3").getChild("dec_18").getChild("jointRR3").getChild("JD_4");
        this.dec_19 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRR1").getChild("dec_17").getChild("joinRR2").getChild("JD_3").getChild("dec_18").getChild("jointRR3").getChild("JD_4").getChild("dec_19");
        this.jointRR4 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRR1").getChild("dec_17").getChild("joinRR2").getChild("JD_3").getChild("dec_18").getChild("jointRR3").getChild("JD_4").getChild("dec_19").getChild("jointRR4");
        this.dec_20 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRR1").getChild("dec_17").getChild("joinRR2").getChild("JD_3").getChild("dec_18").getChild("jointRR3").getChild("JD_4").getChild("dec_19").getChild("jointRR4").getChild("dec_20");
        this.dec_21 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRL1").getChild("dec_21");
        this.joinRL2 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRL1").getChild("dec_21").getChild("joinRL2");
        this.JD_5 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRL1").getChild("dec_21").getChild("joinRL2").getChild("JD_5");
        this.dec_22 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRL1").getChild("dec_21").getChild("joinRL2").getChild("JD_5").getChild("dec_22");
        this.jointRL3 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRL1").getChild("dec_21").getChild("joinRL2").getChild("JD_5").getChild("dec_22").getChild("jointRL3");
        this.JD_6 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRL1").getChild("dec_21").getChild("joinRL2").getChild("JD_5").getChild("dec_22").getChild("jointRL3").getChild("JD_6");
        this.dec_23 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRL1").getChild("dec_21").getChild("joinRL2").getChild("JD_5").getChild("dec_22").getChild("jointRL3").getChild("JD_6").getChild("dec_23");
        this.jointRL4 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRL1").getChild("dec_21").getChild("joinRL2").getChild("JD_5").getChild("dec_22").getChild("jointRL3").getChild("JD_6").getChild("dec_23").getChild("jointRL4");
        this.dec_24 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRL1").getChild("dec_21").getChild("joinRL2").getChild("JD_5").getChild("dec_22").getChild("jointRL3").getChild("JD_6").getChild("dec_23").getChild("jointRL4").getChild("dec_24");
        this.dec_25 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRM1").getChild("dec_25");
        this.joinRM2 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRM1").getChild("dec_25").getChild("joinRM2");
        this.JD_7 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRM1").getChild("dec_25").getChild("joinRM2").getChild("JD_7");
        this.dec_26 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRM1").getChild("dec_25").getChild("joinRM2").getChild("JD_7").getChild("dec_26");
        this.jointRM3 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRM1").getChild("dec_25").getChild("joinRM2").getChild("JD_7").getChild("dec_26").getChild("jointRM3");
        this.JD_8 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRM1").getChild("dec_25").getChild("joinRM2").getChild("JD_7").getChild("dec_26").getChild("jointRM3").getChild("JD_8");
        this.dec_27 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRM1").getChild("dec_25").getChild("joinRM2").getChild("JD_7").getChild("dec_26").getChild("jointRM3").getChild("JD_8").getChild("dec_27");
        this.jointRM4 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRM1").getChild("dec_25").getChild("joinRM2").getChild("JD_7").getChild("dec_26").getChild("jointRM3").getChild("JD_8").getChild("dec_27").getChild("jointRM4");
        this.dec_28 = root.getChild("mainbody").getChild("bodym").getChild("JD").getChild("jointH").getChild("bodyn").getChild("mouthTR").getChild("jointRM1").getChild("dec_25").getChild("joinRM2").getChild("JD_7").getChild("dec_26").getChild("jointRM3").getChild("JD_8").getChild("dec_27").getChild("jointRM4").getChild("dec_28");
        this.bodyb = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb");
        this.JD_9 = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb").getChild("JD_9");
        this.JD_10 = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb").getChild("JD_10");
        this.jointBLL = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb").getChild("JD_9").getChild("jointBLL");
        this.body_8 = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb").getChild("JD_9").getChild("jointBLL").getChild("body_8");
        this.jointBLL1 = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb").getChild("JD_9").getChild("jointBLL").getChild("body_8").getChild("jointBLL1");
        this.body_9 = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb").getChild("JD_9").getChild("jointBLL").getChild("body_8").getChild("jointBLL1").getChild("body_9");
        this.body_10 = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb").getChild("JD_9").getChild("jointBLL").getChild("body_8").getChild("jointBLL1").getChild("body_9").getChild("body_10");
        this.jointBRL = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb").getChild("JD_10").getChild("jointBRL");
        this.body_11 = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb").getChild("JD_10").getChild("jointBRL").getChild("body_11");
        this.jointBRL1 = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb").getChild("JD_10").getChild("jointBRL").getChild("body_11").getChild("jointBRL1");
        this.body_12 = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb").getChild("JD_10").getChild("jointBRL").getChild("body_11").getChild("jointBRL1").getChild("body_12");
        this.body_13 = root.getChild("mainbody").getChild("bodym").getChild("bodym_1").getChild("bodyb").getChild("JD_10").getChild("jointBRL").getChild("body_11").getChild("jointBRL1").getChild("body_12").getChild("body_13");
        this.jointFLL = root.getChild("mainbody").getChild("bodym").getChild("JD_1").getChild("jointFLL");
        this.body_14 = root.getChild("mainbody").getChild("bodym").getChild("JD_1").getChild("jointFLL").getChild("body_14");
        this.jointFLL1 = root.getChild("mainbody").getChild("bodym").getChild("JD_1").getChild("jointFLL").getChild("body_14").getChild("jointFLL1");
        this.body_15 = root.getChild("mainbody").getChild("bodym").getChild("JD_1").getChild("jointFLL").getChild("body_14").getChild("jointFLL1").getChild("body_15");
        this.body_16 = root.getChild("mainbody").getChild("bodym").getChild("JD_1").getChild("jointFLL").getChild("body_14").getChild("jointFLL1").getChild("body_15").getChild("body_16");
        this.jointFRL = root.getChild("mainbody").getChild("bodym").getChild("JD_2").getChild("jointFRL");
        this.body_17 = root.getChild("mainbody").getChild("bodym").getChild("JD_2").getChild("jointFRL").getChild("body_17");
        this.jointFRL1 = root.getChild("mainbody").getChild("bodym").getChild("JD_2").getChild("jointFRL").getChild("body_17").getChild("jointFRL1");
        this.body_18 = root.getChild("mainbody").getChild("bodym").getChild("JD_2").getChild("jointFRL").getChild("body_17").getChild("jointFRL1").getChild("body_18");
        this.body_19 = root.getChild("mainbody").getChild("bodym").getChild("JD_2").getChild("jointFRL").getChild("body_17").getChild("jointFRL1").getChild("body_18").getChild("body_19");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, -2.7f, 0.0f));
        PartDefinition bodym = mainbody.addOrReplaceChild("bodym", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5f, -9.0f, -20.0f, 11, 12, 11), PartPose.offsetAndRotation(0.0f, 16.0f, 8.0f, -0.2268928f, 0.0f, 0.0f));
        PartDefinition JD = bodym.addOrReplaceChild("JD", CubeListBuilder.create().texOffs(6, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, -7.0f, -19.0f, 0.27925268f, 0.0f, 0.0f));
        PartDefinition jointH = JD.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition bodyn = jointH.addOrReplaceChild("bodyn", CubeListBuilder.create().texOffs(80, 0).addBox(-2.0f, -9.8f, 0.0f, 4, 14, 4), PartPose.offsetAndRotation(0.0f, -2.0f, -1.0f, 0.14660765f, 0.0f, 0.0f));
        PartDefinition body_1 = bodyn.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(74, 0).addBox(0.45f, -12.0f, 4.0f, 2, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, -1.0f, -0.20943952f, 0.15707964f, 0.0f));
        PartDefinition dec_4 = bodyn.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 4), PartPose.offsetAndRotation(-3.3f, -1.0f, -0.7f, -3.119776f, 0.50265485f, 0.0f));
        PartDefinition dec_2 = bodyn.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(106, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(-3.6f, -4.4f, -1.0f, 2.7646015f, 0.50265485f, 0.0f));
        PartDefinition dec_8 = bodyn.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(88, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 4), PartPose.offsetAndRotation(4.4f, -1.1f, -2.1f, -3.0049334f, -0.69115037f, 0.12566371f));
        PartDefinition body_4 = bodyn.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(110, 0).addBox(-1.2f, -8.0f, -2.0f, 3, 3, 4), PartPose.offsetAndRotation(-2.0f, 3.0f, 0.7f, 0.0f, 0.87964594f, 0.0f));
        PartDefinition dec_10 = bodyn.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(120, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 2), PartPose.offsetAndRotation(4.0f, 2.6f, -1.8f, -2.8274333f, -0.18849556f, 0.12566371f));
        PartDefinition dec_7 = bodyn.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(33, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 4), PartPose.offsetAndRotation(4.4f, -2.5f, -1.7f, 2.8902652f, -0.37699112f, 0.12566371f));
        PartDefinition dec_5 = bodyn.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(46, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(-3.3f, 0.5f, -0.7f, -2.8447123f, 0.37699112f, 0.0f));
        PartDefinition body_2 = bodyn.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(92, 0).addBox(-2.45f, -12.0f, 4.0f, 2, 3, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.10471976f, 0.0f, -0.12217305f));
        PartDefinition dec_6 = bodyn.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(70, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(4.7f, -4.2f, -1.7f, 2.7017696f, -0.9424778f, 0.12566371f));
        PartDefinition body_3 = bodyn.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(96, 0).addBox(-1.5f, -5.0f, -2.0f, 3, 5, 4), PartPose.offsetAndRotation(3.0f, -0.2f, -0.1f, -0.06283186f, -0.81681406f, 0.18849556f));
        PartDefinition body_6 = bodyn.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(76, 18).addBox(-1.5f, -5.0f, -2.0f, 2, 4, 4), PartPose.offsetAndRotation(-0.6f, 2.6f, 0.2f, 0.0f, 1.0681415f, -0.12566371f));
        PartDefinition mouthTR = bodyn.addOrReplaceChild("mouthTR", CubeListBuilder.create().texOffs(40, 20).addBox(-1.0f, 3.0f, -1.0f, 2, 2, 4), PartPose.offsetAndRotation(0.3f, -4.6f, 4.0f, -1.5498524f, -0.06283186f, 0.06283186f));
        PartDefinition jointRM1 = mouthTR.addOrReplaceChild("jointRM1", CubeListBuilder.create().texOffs(6, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 4.6f, 2.5f));
        PartDefinition dec_25 = jointRM1.addOrReplaceChild("dec_25", CubeListBuilder.create().texOffs(24, 23).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 2.3038347f, -0.0034906585f, 0.37699112f));
        PartDefinition joinRM2 = dec_25.addOrReplaceChild("joinRM2", CubeListBuilder.create().texOffs(46, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_7 = joinRM2.addOrReplaceChild("JD_7", CubeListBuilder.create().texOffs(50, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0420353f));
        PartDefinition dec_26 = JD_7.addOrReplaceChild("dec_26", CubeListBuilder.create().texOffs(29, 23).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, 0.61086524f, 0.0f));
        PartDefinition jointRM3 = dec_26.addOrReplaceChild("jointRM3", CubeListBuilder.create().texOffs(70, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_8 = jointRM3.addOrReplaceChild("JD_8", CubeListBuilder.create().texOffs(74, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.87266463f, 0.0f, 0.0f));
        PartDefinition dec_27 = JD_8.addOrReplaceChild("dec_27", CubeListBuilder.create().texOffs(83, 23).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.12217305f, -0.20943952f, 0.0f));
        PartDefinition jointRM4 = dec_27.addOrReplaceChild("jointRM4", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_28 = jointRM4.addOrReplaceChild("dec_28", CubeListBuilder.create().texOffs(90, 23).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7853982f, 0.82030475f, 0.0f));
        PartDefinition jointRR1 = mouthTR.addOrReplaceChild("jointRR1", CubeListBuilder.create().texOffs(70, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.9f, 4.5f, 0.9f));
        PartDefinition dec_17 = jointRR1.addOrReplaceChild("dec_17", CubeListBuilder.create().texOffs(106, 21).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.90408057f, 1.2566371f, -0.25132743f));
        PartDefinition joinRR2 = dec_17.addOrReplaceChild("joinRR2", CubeListBuilder.create().texOffs(45, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_3 = joinRR2.addOrReplaceChild("JD_3", CubeListBuilder.create().texOffs(75, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2863812f));
        PartDefinition dec_18 = JD_3.addOrReplaceChild("dec_18", CubeListBuilder.create().texOffs(69, 21).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.6736971f, -0.43982297f));
        PartDefinition jointRR3 = dec_18.addOrReplaceChild("jointRR3", CubeListBuilder.create().texOffs(33, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_4 = jointRR3.addOrReplaceChild("JD_4", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_19 = JD_4.addOrReplaceChild("dec_19", CubeListBuilder.create().texOffs(111, 21).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.12566371f, -0.6422812f, 0.0f));
        PartDefinition jointRR4 = dec_19.addOrReplaceChild("jointRR4", CubeListBuilder.create().texOffs(6, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_20 = jointRR4.addOrReplaceChild("dec_20", CubeListBuilder.create().texOffs(118, 21).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.80285144f, 0.0f));
        PartDefinition jointRL1 = mouthTR.addOrReplaceChild("jointRL1", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.6f, 4.7f, 1.1f));
        PartDefinition dec_21 = jointRL1.addOrReplaceChild("dec_21", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5f, -0.5f, -3.5f, 1, 1, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.1623893f, -0.87266463f, -0.12566371f));
        PartDefinition joinRL2 = dec_21.addOrReplaceChild("joinRL2", CubeListBuilder.create().texOffs(33, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -3.5f));
        PartDefinition JD_5 = joinRL2.addOrReplaceChild("JD_5", CubeListBuilder.create().texOffs(39, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.2863812f));
        PartDefinition dec_22 = JD_5.addOrReplaceChild("dec_22", CubeListBuilder.create().texOffs(5, 23).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.54105204f, -0.5934119f, 0.0f));
        PartDefinition jointRL3 = dec_22.addOrReplaceChild("jointRL3", CubeListBuilder.create().texOffs(43, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition JD_6 = jointRL3.addOrReplaceChild("JD_6", CubeListBuilder.create().texOffs(110, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition dec_23 = JD_6.addOrReplaceChild("dec_23", CubeListBuilder.create().texOffs(17, 23).addBox(-0.5f, -0.5f, -5.0f, 1, 1, 5), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.134464f, -0.4537856f, 0.0f));
        PartDefinition jointRL4 = dec_23.addOrReplaceChild("jointRL4", CubeListBuilder.create().texOffs(114, 7).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition dec_24 = jointRL4.addOrReplaceChild("dec_24", CubeListBuilder.create().texOffs(12, 23).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.6981317f, 0.0f));
        PartDefinition dec_9 = bodyn.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(84, 18).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(4.0f, 0.9f, -1.8f, -3.015929f, -0.75398225f, 0.12566371f));
        PartDefinition body_5 = bodyn.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(115, 7).addBox(-1.5f, -5.0f, -2.0f, 2, 5, 4), PartPose.offsetAndRotation(2.9f, 4.6f, 0.1f, -0.06283186f, -0.69115037f, 0.06283186f));
        PartDefinition bodyh = bodyn.addOrReplaceChild("bodyh", CubeListBuilder.create().texOffs(96, 9).addBox(-3.0f, -10.0f, -1.5f, 6, 5, 7), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.06283186f));
        PartDefinition bodymu = bodyh.addOrReplaceChild("bodymu", CubeListBuilder.create().texOffs(45, 20).addBox(-2.5f, -10.0f, -7.5f, 5, 3, 7), PartPose.offsetAndRotation(-1.5f, -1.98f, -4.98f, -0.8063421f, 0.12566371f, 0.0f));
        PartDefinition dec_15 = bodymu.addOrReplaceChild("dec_15", CubeListBuilder.create().texOffs(102, 21).addBox(-0.5f, -0.7f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(2.0f, -6.6f, -5.3f, -0.18849556f, -0.18849556f, -0.4886922f));
        PartDefinition dec_16 = bodymu.addOrReplaceChild("dec_16", CubeListBuilder.create().texOffs(80, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 3, 1), PartPose.offsetAndRotation(-2.0f, -6.6f, -4.4f, 0.0f, 0.0f, 0.17453292f));
        PartDefinition dec_12 = bodymu.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(96, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 5, 1), PartPose.offsetAndRotation(-0.6f, -6.5f, -7.0f, -0.9250245f, 0.06283186f, 0.06283186f));
        PartDefinition dec_14 = bodymu.addOrReplaceChild("dec_14", CubeListBuilder.create().texOffs(98, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(-1.8f, -6.5f, -7.0f, -0.4223697f, 0.0f, 0.12566371f));
        PartDefinition dec_11 = bodymu.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(123, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(0.6f, -6.5f, -7.0f, -0.48520154f, -0.06283186f, -0.12566371f));
        PartDefinition dec_13 = bodymu.addOrReplaceChild("dec_13", CubeListBuilder.create().texOffs(122, 16).addBox(-0.5f, -0.5f, -0.5f, 1, 4, 1), PartPose.offsetAndRotation(1.8f, -6.5f, -7.0f, -0.4223697f, -0.25132743f, -0.25132743f));
        PartDefinition body_7 = bodyh.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(62, 20).addBox(-2.0f, -2.9f, 0.0f, 4, 3, 2), PartPose.offsetAndRotation(0.0f, -6.0f, -2.0f, 0.33161256f, 0.0f, 0.0f));
        PartDefinition dec_3 = bodyn.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(39, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 4), PartPose.offsetAndRotation(-3.6f, -2.8f, -1.0f, 2.953097f, 0.69115037f, 0.0f));
        PartDefinition JD_1 = bodym.addOrReplaceChild("JD_1", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(5.0f, -0.2f, -17.0f, 0.2268928f, 0.0f, 0.0f));
        PartDefinition jointFLL = JD_1.addOrReplaceChild("jointFLL", CubeListBuilder.create().texOffs(112, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_14 = jointFLL.addOrReplaceChild("body_14", CubeListBuilder.create().texOffs(36, 36).addBox(-2.9f, -1.0f, -2.1f, 4, 8, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.31415927f, 0.0f, 0.0f));
        PartDefinition jointFLL1 = body_14.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(123, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 7.0f, 0.0f));
        PartDefinition body_15 = jointFLL1.addOrReplaceChild("body_15", CubeListBuilder.create().texOffs(52, 39).addBox(-1.4f, -0.5f, -1.6f, 2, 6, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, 0.0f, 0.0f));
        PartDefinition body_16 = body_15.addOrReplaceChild("body_16", CubeListBuilder.create().texOffs(62, 42).addBox(-2.4f, 5.1f, -2.1f, 4, 3, 4), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition dec_1 = bodym.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(-0.9f, -2.6f, -20.7f, 1.7493435f, -0.25132743f, 0.12566371f));
        PartDefinition JD_2 = bodym.addOrReplaceChild("JD_2", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-4.2f, -0.2f, -17.0f, 0.2268928f, 0.0f, 0.0f));
        PartDefinition jointFRL = JD_2.addOrReplaceChild("jointFRL", CubeListBuilder.create().texOffs(48, 22).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_17 = jointFRL.addOrReplaceChild("body_17", CubeListBuilder.create().texOffs(0, 43).addBox(-1.9f, -1.0f, -2.1f, 4, 8, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.31415927f, 0.0f, 0.0f));
        PartDefinition jointFRL1 = body_17.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 7.0f, 0.0f));
        PartDefinition body_18 = jointFRL1.addOrReplaceChild("body_18", CubeListBuilder.create().texOffs(80, 41).addBox(-1.4f, -0.5f, -1.6f, 2, 6, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, 0.0f, 0.0f));
        PartDefinition body_19 = body_18.addOrReplaceChild("body_19", CubeListBuilder.create().texOffs(16, 44).addBox(-2.4f, 5.1f, -2.1f, 4, 3, 4), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition bodym_1 = bodym.addOrReplaceChild("bodym_1", CubeListBuilder.create().texOffs(44, 0).addBox(-4.0f, -5.0f, 0.0f, 8, 10, 10), PartPose.offsetAndRotation(0.0f, -2.0f, -11.0f, 0.29670596f, 0.0f, 0.0f));
        PartDefinition bodyb = bodym_1.addOrReplaceChild("bodyb", CubeListBuilder.create().texOffs(89, 27).addBox(-5.5f, -5.0f, 0.0f, 11, 11, 6), PartPose.offsetAndRotation(0.0f, -1.0f, 9.0f, -0.10471976f, 0.0f, 0.0f));
        PartDefinition JD_10 = bodyb.addOrReplaceChild("JD_10", CubeListBuilder.create().texOffs(115, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-3.9f, 1.8f, 4.6f, (float)Math.PI / 90, 0.0f, 0.0f));
        PartDefinition jointBRL = JD_10.addOrReplaceChild("jointBRL", CubeListBuilder.create().texOffs(76, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_11 = jointBRL.addOrReplaceChild("body_11", CubeListBuilder.create().texOffs(16, 29).addBox(-1.9f, -2.0f, -3.5f, 4, 9, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.31415927f, 0.0f, 0.0f));
        PartDefinition jointBRL1 = body_11.addOrReplaceChild("jointBRL1", CubeListBuilder.create().texOffs(106, 21).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.5f, 7.0f, 0.0f));
        PartDefinition body_12 = jointBRL1.addOrReplaceChild("body_12", CubeListBuilder.create().texOffs(48, 30).addBox(-1.4f, -0.5f, -1.6f, 2, 6, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, 0.0f, 0.0f));
        PartDefinition body_13 = body_12.addOrReplaceChild("body_13", CubeListBuilder.create().texOffs(0, 36).addBox(-2.4f, 5.1f, -2.1f, 4, 3, 4), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition JD_9 = bodyb.addOrReplaceChild("JD_9", CubeListBuilder.create().texOffs(4, 9).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(3.7f, 1.8f, 4.6f, (float)Math.PI / 90, 0.0f, 0.0f));
        PartDefinition jointBLL = JD_9.addOrReplaceChild("jointBLL", CubeListBuilder.create().texOffs(99, 14).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body_8 = jointBLL.addOrReplaceChild("body_8", CubeListBuilder.create().texOffs(63, 27).addBox(-1.9f, -2.0f, -3.5f, 4, 9, 6), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.31415927f, 0.0f, 0.0f));
        PartDefinition jointBLL1 = body_8.addOrReplaceChild("jointBLL1", CubeListBuilder.create().texOffs(48, 20).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.5f, 7.0f, 0.0f));
        PartDefinition body_9 = jointBLL1.addOrReplaceChild("body_9", CubeListBuilder.create().texOffs(38, 27).addBox(-1.4f, -0.5f, -1.6f, 2, 6, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.31415927f, 0.0f, 0.0f));
        PartDefinition body_10 = body_9.addOrReplaceChild("body_10", CubeListBuilder.create().texOffs(0, 29).addBox(-2.4f, 5.1f, -2.1f, 4, 3, 4), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(33, 0).addBox(-1.5f, -5.0f, -2.0f, 3, 3, 2), PartPose.offsetAndRotation(-3.1f, 13.4f, -9.7f, 0.12566371f, 0.0f, 0.31415927f));
        PartDefinition dec = mainbody.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(1, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 3), PartPose.offsetAndRotation(-2.3f, 8.4f, -11.5f, 1.4351842f, 0.18849556f, 0.12566371f));
        return LayerDefinition.create(mesh, 128, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

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
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                GS = 2.2f;
                GD = 1.6f;
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
                    GS = 1.7f;
                    GD = 0.3f;
                    this.swingX(this.jointFLL, 0.3f * GS, 3.0f * GD, -1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
                    this.swingX(this.jointFRL, 0.3f * GS, 3.0f * GD, -1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
                    this.swingX(this.jointBLL, 0.3f * GS, 3.5f * GD, 1, -0.5f, 0.4f, limbSwing, limbSwingAmount);
                    this.swingX(this.jointBRL, 0.3f * GS, 3.5f * GD, 1, 0.5f, 0.4f, limbSwing, limbSwingAmount);
                    this.moveY(this.mainbody, 0.3f * GS, -1, limbSwing, limbSwingAmount, 0.08f);
                    this.swingX(this.mainbody, 0.3f * GS, 0.8f * GD, -1, 0.8f, 0.0f, limbSwing, limbSwingAmount);
                }
            } else if (i == 3 && !parasite.getStillAni()) {
                GS = 2.7f;
                GD = 0.3f;
                this.swingX(this.jointFLL, 0.3f * GS, 3.0f * GD, -1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL, 0.3f * GS, 3.0f * GD, -1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL, 0.3f * GS, 3.5f * GD, 1, -0.5f, 0.4f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL, 0.3f * GS, 3.5f * GD, 1, 0.5f, 0.4f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.3f * GS, -1, limbSwing, limbSwingAmount, 0.08f);
                this.swingX(this.mainbody, 0.3f * GS, 0.8f * GD, -1, 0.8f, 0.0f, limbSwing, limbSwingAmount);
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
