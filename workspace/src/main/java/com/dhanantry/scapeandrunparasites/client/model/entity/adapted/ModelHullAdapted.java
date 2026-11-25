package com.dhanantry.scapeandrunparasites.client.model.entity.adapted;

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

public class ModelHullAdapted extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "hulladapted"), "main");
    private final ModelPart mainbody;
    private final ModelPart jointFLL;
    private final ModelPart jointBLL;
    private final ModelPart jointFRL;
    private final ModelPart jointBRL;
    private final ModelPart body;
    private final ModelPart leg;
    private final ModelPart leg_1;
    private final ModelPart jointFLL1;
    private final ModelPart feet;
    private final ModelPart feet_1;
    private final ModelPart feet_2;
    private final ModelPart leg_2;
    private final ModelPart jointBLL1;
    private final ModelPart leg_3;
    private final ModelPart leg_4;
    private final ModelPart feet_3;
    private final ModelPart leg_5;
    private final ModelPart leg_6;
    private final ModelPart jointFRL1;
    private final ModelPart feet_4;
    private final ModelPart feet_5;
    private final ModelPart feet_6;
    private final ModelPart leg_7;
    private final ModelPart jointBRL1;
    private final ModelPart leg_8;
    private final ModelPart leg_9;
    private final ModelPart feet_7;
    private final ModelPart bodyf;
    private final ModelPart bodyb;
    private final ModelPart body_1;
    private final ModelPart body_2;
    private final ModelPart dec;
    private final ModelPart neck;
    private final ModelPart jointdont;
    private final ModelPart jointH;
    private final ModelPart jointdont_1;
    private final ModelPart skull;
    private final ModelPart mouthg;
    private final ModelPart skull_1;
    private final ModelPart jointM;
    private final ModelPart mouth;
    private final ModelPart teeth;
    private final ModelPart teeth_1;
    private final ModelPart teeth_2;
    private final ModelPart teeth_3;
    private final ModelPart teeth_4;
    private final ModelPart body_3;
    private final ModelPart dec_1;
    private final ModelPart body_4;
    private final ModelPart dec_2;
    private final ModelPart body_5;
    private final ModelPart dec_3;
    private final ModelPart body_6;
    private final ModelPart dec_4;
    private final ModelPart body_7;
    private final ModelPart taclejointL1;
    private final ModelPart tentacle;
    private final ModelPart taclejointL2;
    private final ModelPart dec_5;
    private final ModelPart tentacle_1;
    private final ModelPart taclejointL3;
    private final ModelPart tentacle_2;
    private final ModelPart taclejointL4;
    private final ModelPart tentacle_3;
    private final ModelPart taclejointR1;
    private final ModelPart tentacle_4;
    private final ModelPart taclejointR2;
    private final ModelPart dec_6;
    private final ModelPart tentacle_5;
    private final ModelPart taclejointR3;
    private final ModelPart tentacle_6;
    private final ModelPart taclejointR4;
    private final ModelPart tentacle_7;

    public ModelHullAdapted(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.jointFLL = root.getChild("mainbody").getChild("jointFLL");
        this.jointBLL = root.getChild("mainbody").getChild("jointBLL");
        this.jointFRL = root.getChild("mainbody").getChild("jointFRL");
        this.jointBRL = root.getChild("mainbody").getChild("jointBRL");
        this.body = root.getChild("mainbody").getChild("body");
        this.leg = root.getChild("mainbody").getChild("jointFLL").getChild("leg");
        this.leg_1 = root.getChild("mainbody").getChild("jointFLL").getChild("leg").getChild("leg_1");
        this.jointFLL1 = root.getChild("mainbody").getChild("jointFLL").getChild("leg").getChild("leg_1").getChild("jointFLL1");
        this.feet = root.getChild("mainbody").getChild("jointFLL").getChild("leg").getChild("leg_1").getChild("jointFLL1").getChild("feet");
        this.feet_1 = root.getChild("mainbody").getChild("jointFLL").getChild("leg").getChild("leg_1").getChild("jointFLL1").getChild("feet").getChild("feet_1");
        this.feet_2 = root.getChild("mainbody").getChild("jointFLL").getChild("leg").getChild("leg_1").getChild("jointFLL1").getChild("feet").getChild("feet_1").getChild("feet_2");
        this.leg_2 = root.getChild("mainbody").getChild("jointBLL").getChild("leg_2");
        this.jointBLL1 = root.getChild("mainbody").getChild("jointBLL").getChild("leg_2").getChild("jointBLL1");
        this.leg_3 = root.getChild("mainbody").getChild("jointBLL").getChild("leg_2").getChild("jointBLL1").getChild("leg_3");
        this.leg_4 = root.getChild("mainbody").getChild("jointBLL").getChild("leg_2").getChild("jointBLL1").getChild("leg_3").getChild("leg_4");
        this.feet_3 = root.getChild("mainbody").getChild("jointBLL").getChild("leg_2").getChild("jointBLL1").getChild("leg_3").getChild("leg_4").getChild("feet_3");
        this.leg_5 = root.getChild("mainbody").getChild("jointFRL").getChild("leg_5");
        this.leg_6 = root.getChild("mainbody").getChild("jointFRL").getChild("leg_5").getChild("leg_6");
        this.jointFRL1 = root.getChild("mainbody").getChild("jointFRL").getChild("leg_5").getChild("leg_6").getChild("jointFRL1");
        this.feet_4 = root.getChild("mainbody").getChild("jointFRL").getChild("leg_5").getChild("leg_6").getChild("jointFRL1").getChild("feet_4");
        this.feet_5 = root.getChild("mainbody").getChild("jointFRL").getChild("leg_5").getChild("leg_6").getChild("jointFRL1").getChild("feet_4").getChild("feet_5");
        this.feet_6 = root.getChild("mainbody").getChild("jointFRL").getChild("leg_5").getChild("leg_6").getChild("jointFRL1").getChild("feet_4").getChild("feet_5").getChild("feet_6");
        this.leg_7 = root.getChild("mainbody").getChild("jointBRL").getChild("leg_7");
        this.jointBRL1 = root.getChild("mainbody").getChild("jointBRL").getChild("leg_7").getChild("jointBRL1");
        this.leg_8 = root.getChild("mainbody").getChild("jointBRL").getChild("leg_7").getChild("jointBRL1").getChild("leg_8");
        this.leg_9 = root.getChild("mainbody").getChild("jointBRL").getChild("leg_7").getChild("jointBRL1").getChild("leg_8").getChild("leg_9");
        this.feet_7 = root.getChild("mainbody").getChild("jointBRL").getChild("leg_7").getChild("jointBRL1").getChild("leg_8").getChild("leg_9").getChild("feet_7");
        this.bodyf = root.getChild("mainbody").getChild("body").getChild("bodyf");
        this.bodyb = root.getChild("mainbody").getChild("body").getChild("bodyb");
        this.body_1 = root.getChild("mainbody").getChild("body").getChild("body_1");
        this.body_2 = root.getChild("mainbody").getChild("body").getChild("body_2");
        this.dec = root.getChild("mainbody").getChild("body").getChild("dec");
        this.neck = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck");
        this.jointdont = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont");
        this.jointH = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont").getChild("jointH");
        this.jointdont_1 = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont").getChild("jointH").getChild("jointdont_1");
        this.skull = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont").getChild("jointH").getChild("jointdont_1").getChild("skull");
        this.mouthg = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont").getChild("jointH").getChild("jointdont_1").getChild("skull").getChild("mouthg");
        this.skull_1 = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont").getChild("jointH").getChild("jointdont_1").getChild("skull").getChild("skull_1");
        this.jointM = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont").getChild("jointH").getChild("jointdont_1").getChild("skull").getChild("mouthg").getChild("jointM");
        this.mouth = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont").getChild("jointH").getChild("jointdont_1").getChild("skull").getChild("mouthg").getChild("jointM").getChild("mouth");
        this.teeth = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont").getChild("jointH").getChild("jointdont_1").getChild("skull").getChild("mouthg").getChild("jointM").getChild("mouth").getChild("teeth");
        this.teeth_1 = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont").getChild("jointH").getChild("jointdont_1").getChild("skull").getChild("mouthg").getChild("jointM").getChild("mouth").getChild("teeth_1");
        this.teeth_2 = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont").getChild("jointH").getChild("jointdont_1").getChild("skull").getChild("mouthg").getChild("jointM").getChild("mouth").getChild("teeth_2");
        this.teeth_3 = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont").getChild("jointH").getChild("jointdont_1").getChild("skull").getChild("mouthg").getChild("jointM").getChild("mouth").getChild("teeth").getChild("teeth_3");
        this.teeth_4 = root.getChild("mainbody").getChild("body").getChild("bodyf").getChild("neck").getChild("jointdont").getChild("jointH").getChild("jointdont_1").getChild("skull").getChild("mouthg").getChild("jointM").getChild("mouth").getChild("teeth_1").getChild("teeth_4");
        this.body_3 = root.getChild("mainbody").getChild("body").getChild("bodyb").getChild("body_3");
        this.dec_1 = root.getChild("mainbody").getChild("body").getChild("bodyb").getChild("dec_1");
        this.body_4 = root.getChild("mainbody").getChild("body").getChild("bodyb").getChild("body_3").getChild("body_4");
        this.dec_2 = root.getChild("mainbody").getChild("body").getChild("bodyb").getChild("body_3").getChild("dec_2");
        this.body_5 = root.getChild("mainbody").getChild("body").getChild("bodyb").getChild("body_3").getChild("body_4").getChild("body_5");
        this.dec_3 = root.getChild("mainbody").getChild("body").getChild("bodyb").getChild("body_3").getChild("body_4").getChild("dec_3");
        this.body_6 = root.getChild("mainbody").getChild("body").getChild("bodyb").getChild("body_3").getChild("body_4").getChild("body_5").getChild("body_6");
        this.dec_4 = root.getChild("mainbody").getChild("body").getChild("bodyb").getChild("body_3").getChild("body_4").getChild("body_5").getChild("dec_4");
        this.body_7 = root.getChild("mainbody").getChild("body").getChild("bodyb").getChild("body_3").getChild("body_4").getChild("body_5").getChild("body_6").getChild("body_7");
        this.taclejointL1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("taclejointL1");
        this.tentacle = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("taclejointL1").getChild("tentacle");
        this.taclejointL2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("taclejointL1").getChild("tentacle").getChild("taclejointL2");
        this.dec_5 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("taclejointL1").getChild("tentacle").getChild("dec_5");
        this.tentacle_1 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("taclejointL1").getChild("tentacle").getChild("taclejointL2").getChild("tentacle_1");
        this.taclejointL3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("taclejointL1").getChild("tentacle").getChild("taclejointL2").getChild("tentacle_1").getChild("taclejointL3");
        this.tentacle_2 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("taclejointL1").getChild("tentacle").getChild("taclejointL2").getChild("tentacle_1").getChild("taclejointL3").getChild("tentacle_2");
        this.taclejointL4 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("taclejointL1").getChild("tentacle").getChild("taclejointL2").getChild("tentacle_1").getChild("taclejointL3").getChild("tentacle_2").getChild("taclejointL4");
        this.tentacle_3 = root.getChild("mainbody").getChild("body").getChild("body_1").getChild("taclejointL1").getChild("tentacle").getChild("taclejointL2").getChild("tentacle_1").getChild("taclejointL3").getChild("tentacle_2").getChild("taclejointL4").getChild("tentacle_3");
        this.taclejointR1 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("taclejointR1");
        this.tentacle_4 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("taclejointR1").getChild("tentacle_4");
        this.taclejointR2 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("taclejointR1").getChild("tentacle_4").getChild("taclejointR2");
        this.dec_6 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("taclejointR1").getChild("tentacle_4").getChild("dec_6");
        this.tentacle_5 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("taclejointR1").getChild("tentacle_4").getChild("taclejointR2").getChild("tentacle_5");
        this.taclejointR3 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("taclejointR1").getChild("tentacle_4").getChild("taclejointR2").getChild("tentacle_5").getChild("taclejointR3");
        this.tentacle_6 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("taclejointR1").getChild("tentacle_4").getChild("taclejointR2").getChild("tentacle_5").getChild("taclejointR3").getChild("tentacle_6");
        this.taclejointR4 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("taclejointR1").getChild("tentacle_4").getChild("taclejointR2").getChild("tentacle_5").getChild("taclejointR3").getChild("tentacle_6").getChild("taclejointR4");
        this.tentacle_7 = root.getChild("mainbody").getChild("body").getChild("body_2").getChild("taclejointR1").getChild("tentacle_4").getChild("taclejointR2").getChild("tentacle_5").getChild("taclejointR3").getChild("tentacle_6").getChild("taclejointR4").getChild("tentacle_7");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -5.0f, -5.0f));
        PartDefinition jointBLL = mainbody.addOrReplaceChild("jointBLL", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.9f, 4.5f, 18.0f));
        PartDefinition leg_2 = jointBLL.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(93, 8).addBox(-2.5f, 0.0f, -2.5f, 4, 13, 5), PartPose.offsetAndRotation(1.3f, -2.0f, 1.1f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition jointBLL1 = leg_2.addOrReplaceChild("jointBLL1", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.1f, 12.0f, 2.1f));
        PartDefinition leg_3 = jointBLL1.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(0, 2).addBox(-1.5f, -1.0f, -1.5f, 3, 8, 3), PartPose.offsetAndRotation(-0.5f, 0.0f, 0.0f, 1.1170107f, 0.0f, 0.0f));
        PartDefinition leg_4 = leg_3.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(117, 0).addBox(-1.0f, -1.0f, -1.5f, 2, 10, 3), PartPose.offsetAndRotation(0.1f, 5.2f, -1.1f, -1.0995574f, 0.0f, 0.0f));
        PartDefinition feet_3 = leg_4.addOrReplaceChild("feet_3", CubeListBuilder.create().texOffs(57, 10).addBox(-2.0f, 0.0f, -1.0f, 4, 5, 3), PartPose.offsetAndRotation(0.1f, 8.6f, 1.0f, -1.0995574f, 0.0f, 0.0f));
        PartDefinition jointFLL = mainbody.addOrReplaceChild("jointFLL", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.5f, 5.0f, 0.0f));
        PartDefinition leg = jointFLL.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(57, 0).addBox(-1.5f, 0.0f, -2.0f, 3, 6, 4), PartPose.offsetAndRotation(0.0f, -2.5f, 0.5f, -0.38397244f, -0.17453292f, 0.0f));
        PartDefinition leg_1 = leg.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(71, 0).addBox(-1.0f, 0.0f, -1.5f, 2, 10, 3), PartPose.offsetAndRotation(0.1f, 5.3f, -0.2f, -0.36651915f, 0.0f, 0.0f));
        PartDefinition jointFLL1 = leg_1.addOrReplaceChild("jointFLL1", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.1f, 9.8f, 0.0f));
        PartDefinition feet = jointFLL1.addOrReplaceChild("feet", CubeListBuilder.create().texOffs(81, 0).addBox(-1.5f, 0.0f, -1.5f, 3, 12, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.4660766f, 0.0f, 0.0f));
        PartDefinition feet_1 = feet.addOrReplaceChild("feet_1", CubeListBuilder.create().texOffs(93, 0).addBox(-1.0f, 0.0f, -1.5f, 2, 5, 3), PartPose.offsetAndRotation(0.1f, 11.5f, 1.0f, -1.2740904f, 0.0f, 0.0f));
        PartDefinition feet_2 = feet_1.addOrReplaceChild("feet_2", CubeListBuilder.create().texOffs(103, 0).addBox(-2.0f, 0.0f, -1.5f, 4, 5, 3), PartPose.offsetAndRotation(0.1f, 5.3f, 1.0f, -1.012291f, 0.0f, 0.0f));
        PartDefinition jointFRL = mainbody.addOrReplaceChild("jointFRL", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-7.5f, 5.0f, 0.0f));
        PartDefinition leg_5 = jointFRL.addOrReplaceChild("leg_5", CubeListBuilder.create().texOffs(71, 13).addBox(-1.5f, 0.0f, -2.0f, 3, 6, 4), PartPose.offsetAndRotation(0.0f, -2.5f, 0.5f, -0.38397244f, 0.17453292f, 0.0f));
        PartDefinition leg_6 = leg_5.addOrReplaceChild("leg_6", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0f, 0.0f, -1.5f, 2, 10, 3), PartPose.offsetAndRotation(-0.1f, 5.3f, -0.2f, -0.36651915f, 0.0f, 0.0f));
        PartDefinition jointFRL1 = leg_6.addOrReplaceChild("jointFRL1", CubeListBuilder.create().texOffs(67, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-0.1f, 9.8f, 0.0f));
        PartDefinition feet_4 = jointFRL1.addOrReplaceChild("feet_4", CubeListBuilder.create().texOffs(111, 13).addBox(-1.5f, 0.0f, -1.5f, 3, 12, 3), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 1.4660766f, 0.0f, 0.0f));
        PartDefinition feet_5 = feet_4.addOrReplaceChild("feet_5", CubeListBuilder.create().texOffs(57, 18).addBox(-1.0f, 0.0f, -1.5f, 2, 5, 3), PartPose.offsetAndRotation(-0.1f, 11.5f, 1.0f, -1.2740904f, 0.0f, 0.0f));
        PartDefinition feet_6 = feet_5.addOrReplaceChild("feet_6", CubeListBuilder.create().texOffs(64, 23).addBox(-2.0f, 0.0f, -1.5f, 4, 5, 3), PartPose.offsetAndRotation(-0.1f, 5.3f, 1.0f, -1.012291f, 0.0f, 0.0f));
        PartDefinition body = mainbody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(13, 0).addBox(-7.5f, -0.5f, -3.5f, 15, 19, 7), PartPose.offsetAndRotation(0.0f, -10.0f, 0.4f, -0.13962634f, 0.0f, 0.0f));
        PartDefinition bodyf = body.addOrReplaceChild("bodyf", CubeListBuilder.create().texOffs(31, 29).addBox(-6.5f, -1.5f, -3.0f, 13, 16, 5), PartPose.offsetAndRotation(0.0f, 3.6f, -5.0f, 0.20943952f, 0.0f, 0.0f));
        PartDefinition neck = bodyf.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(33, 56).addBox(-6.0f, -1.0f, -9.0f, 12, 4, 13), PartPose.offsetAndRotation(0.0f, 5.0f, -5.0f, 1.6231562f, 0.0f, 0.0f));
        PartDefinition jointdont = neck.addOrReplaceChild("jointdont", CubeListBuilder.create().texOffs(90, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, -0.5f, -6.3f, (float)(-Math.PI) / 90, 0.0f, 0.0f));
        PartDefinition jointH = jointdont.addOrReplaceChild("jointH", CubeListBuilder.create().texOffs(100, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition jointdont_1 = jointH.addOrReplaceChild("jointdont_1", CubeListBuilder.create().texOffs(114, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.5707964f, 0.0f, 0.0f));
        PartDefinition skull = jointdont_1.addOrReplaceChild("skull", CubeListBuilder.create().texOffs(96, 51).addBox(-4.5f, -1.5f, -2.5f, 9, 7, 5), PartPose.offset(0.0f, -4.0f, -2.9f));
        PartDefinition skull_1 = skull.addOrReplaceChild("skull_1", CubeListBuilder.create().texOffs(70, 56).addBox(-3.5f, -1.0f, -2.5f, 7, 2, 5), PartPose.offset(0.0f, 6.5f, 0.0f));
        PartDefinition mouthg = skull.addOrReplaceChild("mouthg", CubeListBuilder.create().texOffs(101, 45).addBox(-3.0f, -1.5f, -1.5f, 6, 3, 3), PartPose.offsetAndRotation(0.0f, 8.0f, 3.0f, 0.36651915f, 0.0f, 0.0f));
        PartDefinition jointM = mouthg.addOrReplaceChild("jointM", CubeListBuilder.create().texOffs(57, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.5f, 0.0f));
        PartDefinition mouth = jointM.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(0, 58).addBox(-3.5f, -1.0f, -5.0f, 7, 3, 6), PartPose.offsetAndRotation(0.0f, 0.5f, -0.5f, 0.2443461f, 0.0f, 0.0f));
        PartDefinition teeth_2 = mouth.addOrReplaceChild("teeth_2", CubeListBuilder.create().texOffs(15, 2).addBox(-0.5f, 0.0f, 0.0f, 1, 2, 1), PartPose.offset(0.0f, -2.5f, -4.9f));
        PartDefinition teeth = mouth.addOrReplaceChild("teeth", CubeListBuilder.create().texOffs(9, 2).addBox(-1.0f, 0.0f, 0.0f, 2, 2, 1), PartPose.offsetAndRotation(2.4f, -2.5f, -4.7f, 0.0f, -0.20943952f, 0.0f));
        PartDefinition teeth_3 = teeth.addOrReplaceChild("teeth_3", CubeListBuilder.create().texOffs(70, 1).addBox(-0.5f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, -1.0f, 0.0f));
        PartDefinition teeth_1 = mouth.addOrReplaceChild("teeth_1", CubeListBuilder.create().texOffs(50, 2).addBox(-1.0f, 0.0f, 0.0f, 2, 2, 1), PartPose.offsetAndRotation(-2.4f, -2.5f, -4.7f, 0.0f, 0.20943952f, 0.0f));
        PartDefinition teeth_4 = teeth_1.addOrReplaceChild("teeth_4", CubeListBuilder.create().texOffs(67, 2).addBox(-0.5f, 0.0f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, -1.0f, 0.0f));
        PartDefinition dec = body.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(14, 50).addBox(-5.0f, 0.0f, 1.0f, 10, 2, 6), PartPose.offset(0.0f, 18.5f, -3.5f));
        PartDefinition body_1 = body.addOrReplaceChild("body_1", CubeListBuilder.create().texOffs(101, 28).addBox(-2.0f, -5.5f, 0.0f, 4, 11, 6), PartPose.offsetAndRotation(7.0f, 6.0f, -3.0f, 0.0f, 0.0f, 0.27925268f));
        PartDefinition taclejointL1 = body_1.addOrReplaceChild("taclejointL1", CubeListBuilder.create().texOffs(12, 5).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, -1.0f, 3.0f));
        PartDefinition tentacle = taclejointL1.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(78, 75).addBox(-2.0f, -2.0f, -2.0f, 9, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, (float)Math.PI, -0.5235988f, 0.57595867f));
        PartDefinition taclejointL2 = tentacle.addOrReplaceChild("taclejointL2", CubeListBuilder.create().texOffs(106, 8).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 1), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition tentacle_1 = taclejointL2.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(8, 78).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 2.0420353f, 0.0f));
        PartDefinition taclejointL3 = tentacle_1.addOrReplaceChild("taclejointL3", CubeListBuilder.create().texOffs(16, 5).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tentacle_2 = taclejointL3.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(95, 80).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.6457718f, 0.0f));
        PartDefinition taclejointL4 = tentacle_2.addOrReplaceChild("taclejointL4", CubeListBuilder.create().texOffs(50, 5).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tentacle_3 = taclejointL4.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(23, 83).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.2443461f, 0.0f));
        PartDefinition dec_5 = tentacle.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(0, 78).addBox(-2.5f, -2.5f, -1.0f, 5, 5, 4), PartPose.offset(-0.3f, 0.0f, 1.0f));
        PartDefinition body_2 = body.addOrReplaceChild("body_2", CubeListBuilder.create().texOffs(0, 39).addBox(-2.0f, -5.5f, 0.0f, 4, 11, 6), PartPose.offsetAndRotation(-7.0f, 6.0f, -3.0f, 0.0f, 0.0f, -0.27925268f));
        PartDefinition taclejointR1 = body_2.addOrReplaceChild("taclejointR1", CubeListBuilder.create().texOffs(93, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-2.0f, -1.0f, 3.0f));
        PartDefinition tentacle_4 = taclejointR1.addOrReplaceChild("tentacle_4", CubeListBuilder.create().texOffs(47, 89).addBox(-2.0f, -2.0f, -2.0f, 9, 4, 4), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, (float)Math.PI, -2.6179938f, -0.57595867f));
        PartDefinition dec_6 = tentacle_4.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(108, 80).addBox(-2.5f, -2.5f, -1.0f, 5, 5, 4), PartPose.offset(-0.3f, 0.0f, -3.0f));
        PartDefinition taclejointR2 = tentacle_4.addOrReplaceChild("taclejointR2", CubeListBuilder.create().texOffs(111, 10).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 1), PartPose.offset(6.0f, 0.0f, 0.0f));
        PartDefinition tentacle_5 = taclejointR2.addOrReplaceChild("tentacle_5", CubeListBuilder.create().texOffs(73, 83).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 10), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.0995574f, 0.0f));
        PartDefinition taclejointR3 = tentacle_5.addOrReplaceChild("taclejointR3", CubeListBuilder.create().texOffs(112, 8).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tentacle_6 = taclejointR3.addOrReplaceChild("tentacle_6", CubeListBuilder.create().texOffs(0, 91).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 9), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, -0.6457718f, 0.0f));
        PartDefinition taclejointR4 = tentacle_6.addOrReplaceChild("taclejointR4", CubeListBuilder.create().texOffs(93, 10).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 7.0f));
        PartDefinition tentacle_7 = taclejointR4.addOrReplaceChild("tentacle_7", CubeListBuilder.create().texOffs(88, 91).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 11), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 0.2443461f, 0.0f));
        PartDefinition bodyb = body.addOrReplaceChild("bodyb", CubeListBuilder.create().texOffs(67, 39).addBox(-7.0f, -7.0f, -1.0f, 14, 14, 3), PartPose.offsetAndRotation(0.0f, 11.4f, 3.5f, -0.12217305f, 0.0f, 0.0f));
        PartDefinition body_3 = bodyb.addOrReplaceChild("body_3", CubeListBuilder.create().texOffs(83, 63).addBox(-5.0f, -4.0f, 0.0f, 10, 8, 4), PartPose.offsetAndRotation(0.0f, 2.9f, 1.6f, 0.08726646f, 0.0f, 0.0f));
        PartDefinition body_4 = body_3.addOrReplaceChild("body_4", CubeListBuilder.create().texOffs(0, 67).addBox(-4.0f, -3.5f, 0.0f, 8, 7, 4), PartPose.offsetAndRotation(0.0f, 0.4f, 3.4f, 0.12217305f, 0.0f, 0.0f));
        PartDefinition dec_3 = body_4.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(14, 39).addBox(-1.5f, 0.0f, -1.0f, 3, 2, 4), PartPose.offset(0.0f, 3.4f, 1.0f));
        PartDefinition body_5 = body_4.addOrReplaceChild("body_5", CubeListBuilder.create().texOffs(24, 73).addBox(-3.5f, -1.5f, 0.0f, 7, 6, 4), PartPose.offsetAndRotation(0.0f, -1.1f, 3.4f, (float)Math.PI / 90, 0.0f, 0.0f));
        PartDefinition dec_4 = body_5.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(67, 31).addBox(-0.5f, 0.0f, -1.0f, 1, 2, 5), PartPose.offset(0.0f, 4.4f, 1.0f));
        PartDefinition body_6 = body_5.addOrReplaceChild("body_6", CubeListBuilder.create().texOffs(46, 73).addBox(-4.5f, -1.6f, 0.0f, 9, 9, 7), PartPose.offsetAndRotation(0.0f, -0.8f, 3.4f, 0.13962634f, 0.0f, 0.0f));
        PartDefinition body_7 = body_6.addOrReplaceChild("body_7", CubeListBuilder.create().texOffs(107, 71).addBox(-3.0f, 0.0f, 0.0f, 6, 5, 4), PartPose.offsetAndRotation(0.0f, -0.3f, 4.9f, 0.2617994f, 0.0f, 0.0f));
        PartDefinition dec_2 = body_3.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(20, 58).addBox(-2.5f, 0.0f, -1.0f, 5, 2, 4), PartPose.offset(0.0f, 3.9f, 1.0f));
        PartDefinition dec_1 = bodyb.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(40, 50).addBox(-4.0f, 0.0f, -1.0f, 8, 2, 2), PartPose.offset(0.0f, 6.9f, 1.0f));
        PartDefinition jointBRL = mainbody.addOrReplaceChild("jointBRL", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.9f, 4.5f, 18.0f));
        PartDefinition leg_7 = jointBRL.addOrReplaceChild("leg_7", CubeListBuilder.create().texOffs(80, 21).addBox(-1.5f, 0.0f, -2.5f, 4, 13, 5), PartPose.offsetAndRotation(-1.3f, -2.0f, 1.1f, -0.4886922f, 0.0f, 0.0f));
        PartDefinition jointBRL1 = leg_7.addOrReplaceChild("jointBRL1", CubeListBuilder.create().texOffs(78, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.1f, 12.0f, 2.1f));
        PartDefinition leg_8 = jointBRL1.addOrReplaceChild("leg_8", CubeListBuilder.create().texOffs(0, 26).addBox(-1.5f, -1.0f, -1.5f, 3, 8, 3), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 1.1170107f, 0.0f, 0.0f));
        PartDefinition leg_9 = leg_8.addOrReplaceChild("leg_9", CubeListBuilder.create().texOffs(12, 26).addBox(-1.0f, -1.0f, -1.5f, 2, 10, 3), PartPose.offsetAndRotation(-0.1f, 5.2f, -1.1f, -1.0995574f, 0.0f, 0.0f));
        PartDefinition feet_7 = leg_9.addOrReplaceChild("feet_7", CubeListBuilder.create().texOffs(22, 26).addBox(-2.0f, 0.0f, -1.0f, 4, 5, 3), PartPose.offsetAndRotation(-0.1f, 8.6f, 1.0f, -1.0995574f, 0.0f, 0.0f));
        return LayerDefinition.create(mesh, 128, 110);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        EntityParasiteBase parasite = (EntityParasiteBase)entity;
        this.jointFLL.xRot = 0.0f;
        this.jointFRL.xRot = 0.0f;
        this.jointBLL.xRot = 0.0f;
        this.jointBRL.xRot = 0.0f;
        this.mainbody.y = 0.0f;
        this.mainbody.xRot = 0.0f;
        this.taclejointL1.zRot = 0.0f;
        this.taclejointL2.yRot = 0.0f;
        this.taclejointR1.zRot = 0.0f;
        this.taclejointR2.yRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            if (!parasite.getStillAni()) {
                float GS = 1.1f;
                float GD = 0.5f;
                this.swingX(this.jointFLL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.04f);
                this.mainbody.xRot = 0.0f;
            }
            float f2 = Mth.cos((float)(ageInTicks * 0.1f)) * 0.1f;
            this.taclejointL1.zRot = -1.0f * f2;
            this.taclejointL2.yRot = -1.0f * f2;
            this.taclejointR1.zRot = f2;
            this.taclejointR2.yRot = f2;
            this.jointM.xRot = f2 = Mth.cos((float)(ageInTicks * 0.199f)) * 0.111f;
        } else if (i == 1) {
            if (!parasite.getStillAni()) {
                float GS = 1.1f;
                float GD = 0.5f;
                this.swingX(this.jointFLL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL, 0.3f * GS, 1.0f * GD, -1, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL, 0.3f * GS, 1.0f * GD, 1, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.6f * GS, 1, limbSwing, limbSwingAmount, 0.04f);
                this.mainbody.xRot = 0.0f;
            }
            float f2 = Mth.cos((float)(ageInTicks * 0.25f)) * 0.27f;
            this.taclejointL1.zRot = -1.0f * f2;
            this.taclejointL2.yRot = -1.0f * f2;
            this.taclejointR1.zRot = f2;
            this.taclejointR2.yRot = f2;
            f2 = Mth.cos((float)(ageInTicks * 0.219f)) * 0.111f;
            this.jointM.xRot = 0.5f + f2;
        } else if (i == 2) {
            if (!parasite.getStillAni()) {
                float GS = 1.2f;
                float GD = 0.5f;
                this.swingX(this.jointFLL, 0.3f * GS, 1.3f * GD, -1, 0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointFRL, 0.3f * GS, 1.3f * GD, -1, -0.5f, 0.0f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBLL, 0.3f * GS, 1.6f * GD, 1, -0.5f, 0.6f, limbSwing, limbSwingAmount);
                this.swingX(this.jointBRL, 0.3f * GS, 1.6f * GD, 1, 0.5f, 0.6f, limbSwing, limbSwingAmount);
                this.moveY(this.mainbody, 0.3f * GS, -1, limbSwing, limbSwingAmount, 0.04f);
                this.swingX(this.mainbody, 0.3f * GS, 0.4f * GD, -1, 0.8f, 0.0f, limbSwing, limbSwingAmount);
            }
            float f2 = Mth.cos((float)(ageInTicks * 0.25f)) * 0.27f;
            this.taclejointL1.zRot = -1.0f * f2;
            this.taclejointL2.yRot = -1.0f * f2;
            this.taclejointR1.zRot = f2;
            this.taclejointR2.yRot = f2;
            f2 = Mth.cos((float)(ageInTicks * 0.219f)) * 0.111f;
            this.jointM.xRot = 0.5f + f2;
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
