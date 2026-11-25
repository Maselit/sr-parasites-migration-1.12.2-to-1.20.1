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

public class ModelButhol extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "buthol"), "main");
    private final ModelPart mainbody;
    private final ModelPart tree3;
    private final ModelPart tree2;
    private final ModelPart tree1;
    private final ModelPart top;
    private final ModelPart tree3_1;
    private final ModelPart tree3_2;
    private final ModelPart poptree3;
    private final ModelPart body3;
    private final ModelPart pop3;
    private final ModelPart pop3_1;
    private final ModelPart pop3_2;
    private final ModelPart pop3_3;
    private final ModelPart pop4_3;
    private final ModelPart pop31;
    private final ModelPart tree2_1;
    private final ModelPart tree2_2;
    private final ModelPart poptree2;
    private final ModelPart body2;
    private final ModelPart pop2;
    private final ModelPart pop2_1;
    private final ModelPart pop2_2;
    private final ModelPart pop2_3;
    private final ModelPart pop2_4;
    private final ModelPart pop21;
    private final ModelPart tree1_1;
    private final ModelPart tree1_2;
    private final ModelPart poptree1;
    private final ModelPart body1;
    private final ModelPart pop1;
    private final ModelPart pop1_1;
    private final ModelPart pop1_2;
    private final ModelPart pop1_3;
    private final ModelPart pop1_4;
    private final ModelPart pop11;
    private final ModelPart top_1;
    private final ModelPart top_2;
    private final ModelPart wing1;
    private final ModelPart wing2;
    private final ModelPart wing3;
    private final ModelPart wing1_1;
    private final ModelPart wing2_2;
    private final ModelPart wing3_3;

    public ModelButhol(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.tree3 = root.getChild("mainbody").getChild("tree3");
        this.tree2 = root.getChild("mainbody").getChild("tree2");
        this.tree1 = root.getChild("mainbody").getChild("tree1");
        this.top = root.getChild("mainbody").getChild("top");
        this.tree3_1 = root.getChild("mainbody").getChild("tree3").getChild("tree3_1");
        this.tree3_2 = root.getChild("mainbody").getChild("tree3").getChild("tree3_1").getChild("tree3_2");
        this.poptree3 = root.getChild("mainbody").getChild("tree3").getChild("tree3_1").getChild("tree3_2").getChild("poptree3");
        this.body3 = root.getChild("mainbody").getChild("tree3").getChild("tree3_1").getChild("tree3_2").getChild("poptree3").getChild("body3");
        this.pop3 = root.getChild("mainbody").getChild("tree3").getChild("tree3_1").getChild("tree3_2").getChild("poptree3").getChild("body3").getChild("pop3");
        this.pop3_1 = root.getChild("mainbody").getChild("tree3").getChild("tree3_1").getChild("tree3_2").getChild("poptree3").getChild("body3").getChild("pop3_1");
        this.pop3_2 = root.getChild("mainbody").getChild("tree3").getChild("tree3_1").getChild("tree3_2").getChild("poptree3").getChild("body3").getChild("pop3_2");
        this.pop3_3 = root.getChild("mainbody").getChild("tree3").getChild("tree3_1").getChild("tree3_2").getChild("poptree3").getChild("body3").getChild("pop3_3");
        this.pop4_3 = root.getChild("mainbody").getChild("tree3").getChild("tree3_1").getChild("tree3_2").getChild("poptree3").getChild("body3").getChild("pop4_3");
        this.pop31 = root.getChild("mainbody").getChild("tree3").getChild("tree3_1").getChild("tree3_2").getChild("poptree3").getChild("body3").getChild("pop3").getChild("pop31");
        this.tree2_1 = root.getChild("mainbody").getChild("tree2").getChild("tree2_1");
        this.tree2_2 = root.getChild("mainbody").getChild("tree2").getChild("tree2_1").getChild("tree2_2");
        this.poptree2 = root.getChild("mainbody").getChild("tree2").getChild("tree2_1").getChild("tree2_2").getChild("poptree2");
        this.body2 = root.getChild("mainbody").getChild("tree2").getChild("tree2_1").getChild("tree2_2").getChild("poptree2").getChild("body2");
        this.pop2 = root.getChild("mainbody").getChild("tree2").getChild("tree2_1").getChild("tree2_2").getChild("poptree2").getChild("body2").getChild("pop2");
        this.pop2_1 = root.getChild("mainbody").getChild("tree2").getChild("tree2_1").getChild("tree2_2").getChild("poptree2").getChild("body2").getChild("pop2_1");
        this.pop2_2 = root.getChild("mainbody").getChild("tree2").getChild("tree2_1").getChild("tree2_2").getChild("poptree2").getChild("body2").getChild("pop2_2");
        this.pop2_3 = root.getChild("mainbody").getChild("tree2").getChild("tree2_1").getChild("tree2_2").getChild("poptree2").getChild("body2").getChild("pop2_3");
        this.pop2_4 = root.getChild("mainbody").getChild("tree2").getChild("tree2_1").getChild("tree2_2").getChild("poptree2").getChild("body2").getChild("pop2_4");
        this.pop21 = root.getChild("mainbody").getChild("tree2").getChild("tree2_1").getChild("tree2_2").getChild("poptree2").getChild("body2").getChild("pop2").getChild("pop21");
        this.tree1_1 = root.getChild("mainbody").getChild("tree1").getChild("tree1_1");
        this.tree1_2 = root.getChild("mainbody").getChild("tree1").getChild("tree1_1").getChild("tree1_2");
        this.poptree1 = root.getChild("mainbody").getChild("tree1").getChild("tree1_1").getChild("tree1_2").getChild("poptree1");
        this.body1 = root.getChild("mainbody").getChild("tree1").getChild("tree1_1").getChild("tree1_2").getChild("poptree1").getChild("body1");
        this.pop1 = root.getChild("mainbody").getChild("tree1").getChild("tree1_1").getChild("tree1_2").getChild("poptree1").getChild("body1").getChild("pop1");
        this.pop1_1 = root.getChild("mainbody").getChild("tree1").getChild("tree1_1").getChild("tree1_2").getChild("poptree1").getChild("body1").getChild("pop1_1");
        this.pop1_2 = root.getChild("mainbody").getChild("tree1").getChild("tree1_1").getChild("tree1_2").getChild("poptree1").getChild("body1").getChild("pop1_2");
        this.pop1_3 = root.getChild("mainbody").getChild("tree1").getChild("tree1_1").getChild("tree1_2").getChild("poptree1").getChild("body1").getChild("pop1_3");
        this.pop1_4 = root.getChild("mainbody").getChild("tree1").getChild("tree1_1").getChild("tree1_2").getChild("poptree1").getChild("body1").getChild("pop1_4");
        this.pop11 = root.getChild("mainbody").getChild("tree1").getChild("tree1_1").getChild("tree1_2").getChild("poptree1").getChild("body1").getChild("pop1").getChild("pop11");
        this.top_1 = root.getChild("mainbody").getChild("top").getChild("top_1");
        this.top_2 = root.getChild("mainbody").getChild("top").getChild("top_1").getChild("top_2");
        this.wing1 = root.getChild("mainbody").getChild("top").getChild("top_1").getChild("wing1");
        this.wing2 = root.getChild("mainbody").getChild("top").getChild("top_1").getChild("wing2");
        this.wing3 = root.getChild("mainbody").getChild("top").getChild("top_1").getChild("wing3");
        this.wing1_1 = root.getChild("mainbody").getChild("top").getChild("top_1").getChild("wing1").getChild("wing1_1");
        this.wing2_2 = root.getChild("mainbody").getChild("top").getChild("top_1").getChild("wing2").getChild("wing2_2");
        this.wing3_3 = root.getChild("mainbody").getChild("top").getChild("top_1").getChild("wing3").getChild("wing3_3");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, 0.0f, -4.0f, 8, 4, 8), PartPose.offset(0.0f, -3.3f, 0.0f));
        PartDefinition tree3 = mainbody.addOrReplaceChild("tree3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0f, 0.0f, -1.0f, 2, 4, 2), PartPose.offsetAndRotation(1.8f, 2.7f, 2.7f, 0.7285004f, 0.0f, 0.0f));
        PartDefinition tree3_1 = tree3.addOrReplaceChild("tree3_1", CubeListBuilder.create().texOffs(62, 0).addBox(-1.5f, 0.0f, -1.5f, 3, 4, 3), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, -0.18203785f, 0.0f, 0.0f));
        PartDefinition tree3_2 = tree3_1.addOrReplaceChild("tree3_2", CubeListBuilder.create().texOffs(74, 0).addBox(-2.0f, 0.0f, -2.0f, 4, 4, 4), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, -0.27314404f, 0.0f, 0.0f));
        PartDefinition poptree3 = tree3_2.addOrReplaceChild("poptree3", CubeListBuilder.create().texOffs(90, 0).addBox(-3.0f, 0.0f, -3.5f, 6, 18, 7), PartPose.offsetAndRotation(0.0f, 2.4f, 0.0f, 0.13665928f, 2.9140017f, 0.0f));
        PartDefinition body3 = poptree3.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 12).addBox(-4.5f, 0.0f, -5.0f, 9, 14, 10), PartPose.offset(0.0f, 1.9f, 0.0f));
        PartDefinition pop4_3 = body3.addOrReplaceChild("pop4_3", CubeListBuilder.create().texOffs(70, 16).addBox(-2.5f, -2.5f, -2.2f, 6, 3, 2), PartPose.offsetAndRotation(6.1f, 10.0f, 0.5f, 0.0f, 1.5707964f, 0.0f));
        PartDefinition pop3 = body3.addOrReplaceChild("pop3", CubeListBuilder.create().texOffs(109, 0).addBox(-2.5f, -2.5f, -2.5f, 5, 5, 2), PartPose.offsetAndRotation(-0.8f, 11.4f, 4.1f, (float)Math.PI, 0.0f, 0.4098033f));
        PartDefinition pop31 = pop3.addOrReplaceChild("pop31", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5f, -1.5f, -1.1f, 3, 3, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -2.6f, 0.0f, 0.0f, -1.0927507f));
        PartDefinition pop3_1 = body3.addOrReplaceChild("pop3_1", CubeListBuilder.create().texOffs(116, 7).addBox(-2.5f, -2.5f, -2.2f, 3, 5, 2), PartPose.offsetAndRotation(-2.9f, 6.3f, 0.3f, 0.0f, 1.5707964f, 0.0f));
        PartDefinition pop3_3 = body3.addOrReplaceChild("pop3_3", CubeListBuilder.create().texOffs(80, 11).addBox(-2.5f, -2.5f, -2.2f, 3, 3, 2), PartPose.offsetAndRotation(2.6f, 9.9f, -3.9f, 0.0f, 0.0f, -2.003289f));
        PartDefinition pop3_2 = body3.addOrReplaceChild("pop3_2", CubeListBuilder.create().texOffs(72, 8).addBox(-2.5f, -2.5f, -2.2f, 3, 3, 2), PartPose.offsetAndRotation(-0.1f, 5.8f, -4.5f, 0.0f, 0.0f, -0.7285004f));
        PartDefinition top = mainbody.addOrReplaceChild("top", CubeListBuilder.create().texOffs(32, 0).addBox(-5.0f, 0.0f, -5.0f, 10, 8, 10), PartPose.offset(0.0f, -6.0f, 0.0f));
        PartDefinition top_1 = top.addOrReplaceChild("top_1", CubeListBuilder.create().texOffs(90, 49).addBox(-1.5f, 0.0f, -1.5f, 3, 7, 3), PartPose.offset(0.0f, -6.0f, 0.0f));
        PartDefinition top_2 = top_1.addOrReplaceChild("top_2", CubeListBuilder.create().texOffs(102, 49).addBox(-2.0f, 0.0f, -2.0f, 4, 2, 4), PartPose.offset(0.0f, -1.5f, 0.0f));
        PartDefinition wing3 = top_1.addOrReplaceChild("wing3", CubeListBuilder.create().texOffs(38, 69).addBox(0.0f, 0.0f, -4.5f, 10, 1, 9), PartPose.offsetAndRotation(0.1f, 3.0f, -1.3f, 0.0f, 2.3561945f, 0.0f));
        PartDefinition wing3_3 = wing3.addOrReplaceChild("wing3_3", CubeListBuilder.create().texOffs(38, 79).addBox(0.0f, 0.0f, -4.5f, 10, 1, 9), PartPose.offsetAndRotation(10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.40142572f));
        PartDefinition wing1 = top_1.addOrReplaceChild("wing1", CubeListBuilder.create().texOffs(64, 59).addBox(0.0f, 0.0f, -4.5f, 10, 1, 9), PartPose.offset(1.2f, 3.0f, 1.1f));
        PartDefinition wing1_1 = wing1.addOrReplaceChild("wing1_1", CubeListBuilder.create().texOffs(76, 69).addBox(0.0f, 0.0f, -4.5f, 10, 1, 9), PartPose.offsetAndRotation(10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.40142572f));
        PartDefinition wing2 = top_1.addOrReplaceChild("wing2", CubeListBuilder.create().texOffs(0, 69).addBox(0.0f, 0.0f, -4.5f, 10, 1, 9), PartPose.offsetAndRotation(-1.1f, 3.0f, 1.1f, 0.0f, -2.3568926f, 0.045553092f));
        PartDefinition wing2_2 = wing2.addOrReplaceChild("wing2_2", CubeListBuilder.create().texOffs(0, 79).addBox(0.0f, 0.0f, -4.5f, 10, 1, 9), PartPose.offsetAndRotation(10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.40142572f));
        PartDefinition tree2 = mainbody.addOrReplaceChild("tree2", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0f, 0.0f, -1.0f, 2, 4, 2), PartPose.offsetAndRotation(-2.7f, 2.7f, -1.4f, 0.7285004f, -1.8668041f, 0.0f));
        PartDefinition tree2_1 = tree2.addOrReplaceChild("tree2_1", CubeListBuilder.create().texOffs(38, 18).addBox(-1.5f, 0.0f, -1.5f, 3, 4, 3), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, -0.18203785f, 0.0f, 0.0f));
        PartDefinition tree2_2 = tree2_1.addOrReplaceChild("tree2_2", CubeListBuilder.create().texOffs(50, 18).addBox(-2.0f, 0.0f, -2.0f, 4, 4, 4), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, -0.27314404f, 0.0f, 0.0f));
        PartDefinition poptree2 = tree2_2.addOrReplaceChild("poptree2", CubeListBuilder.create().texOffs(59, 21).addBox(-3.0f, 0.0f, -3.5f, 6, 18, 7), PartPose.offsetAndRotation(0.0f, 2.4f, 0.0f, -0.17453292f, 1.0927507f, 0.0f));
        PartDefinition body2 = poptree2.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(85, 25).addBox(-4.5f, 0.0f, -5.0f, 9, 14, 10), PartPose.offset(0.0f, 1.9f, 0.0f));
        PartDefinition pop2_4 = body2.addOrReplaceChild("pop2_4", CubeListBuilder.create().texOffs(0, 36).addBox(-2.5f, -2.5f, -2.2f, 6, 5, 2), PartPose.offsetAndRotation(6.1f, 6.8f, 0.5f, 0.0f, 1.5707964f, 0.0f));
        PartDefinition pop2_3 = body2.addOrReplaceChild("pop2_3", CubeListBuilder.create().texOffs(0, 17).addBox(-2.5f, -2.5f, -2.2f, 3, 3, 2), PartPose.offsetAndRotation(0.5f, 8.6f, -3.7f, 0.0f, 0.0f, -2.5041983f));
        PartDefinition pop2_2 = body2.addOrReplaceChild("pop2_2", CubeListBuilder.create().texOffs(116, 14).addBox(-2.5f, -2.5f, -2.2f, 3, 3, 2), PartPose.offsetAndRotation(-0.1f, 5.8f, -4.5f, 0.0f, 0.0f, -0.27314404f));
        PartDefinition pop2 = body2.addOrReplaceChild("pop2", CubeListBuilder.create().texOffs(38, 25).addBox(-2.5f, -2.5f, -2.5f, 5, 5, 2), PartPose.offsetAndRotation(-0.8f, 9.0f, 4.1f, (float)Math.PI, 0.0f, -0.13665928f));
        PartDefinition pop21 = pop2.addOrReplaceChild("pop21", CubeListBuilder.create().texOffs(116, 19).addBox(-1.5f, -1.5f, -1.1f, 3, 3, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -2.6f, 0.0f, 0.0f, -0.091106184f));
        PartDefinition pop2_1 = body2.addOrReplaceChild("pop2_1", CubeListBuilder.create().texOffs(38, 32).addBox(-2.5f, -2.5f, -2.2f, 4, 11, 2), PartPose.offsetAndRotation(-2.9f, 6.1f, -1.3f, 0.0f, 1.5707964f, 0.0f));
        PartDefinition tree1 = mainbody.addOrReplaceChild("tree1", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0f, -1.0f, -1.0f, 2, 5, 2), PartPose.offsetAndRotation(3.2f, 2.7f, -2.5f, 0.7285004f, 2.1399481f, 0.0f));
        PartDefinition tree1_1 = tree1.addOrReplaceChild("tree1_1", CubeListBuilder.create().texOffs(78, 21).addBox(-1.5f, 0.0f, -1.5f, 3, 4, 3), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, -0.18203785f, 0.0f, 0.0f));
        PartDefinition tree1_2 = tree1_1.addOrReplaceChild("tree1_2", CubeListBuilder.create().texOffs(16, 36).addBox(-2.0f, 0.0f, -2.0f, 4, 4, 4), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, -0.27314404f, 0.0f, 0.0f));
        PartDefinition poptree1 = tree1_2.addOrReplaceChild("poptree1", CubeListBuilder.create().texOffs(0, 44).addBox(-3.0f, 0.0f, -3.5f, 6, 18, 7), PartPose.offsetAndRotation(0.0f, 2.4f, 0.0f, 0.0f, 1.5934856f, 0.0f));
        PartDefinition body1 = poptree1.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(26, 45).addBox(-4.5f, 0.0f, -5.0f, 9, 14, 10), PartPose.offset(0.0f, 1.9f, 0.0f));
        PartDefinition pop1 = body1.addOrReplaceChild("pop1", CubeListBuilder.create().texOffs(113, 25).addBox(-2.5f, -2.5f, -2.5f, 5, 5, 2), PartPose.offsetAndRotation(-0.8f, 6.2f, 4.1f, (float)Math.PI, 0.0f, -0.8651597f));
        PartDefinition pop11 = pop1.addOrReplaceChild("pop11", CubeListBuilder.create().texOffs(80, 49).addBox(-1.5f, -1.5f, -1.1f, 3, 3, 2), PartPose.offsetAndRotation(0.0f, 0.0f, -2.6f, 0.0f, 0.0f, -1.0927507f));
        PartDefinition pop1_2 = body1.addOrReplaceChild("pop1_2", CubeListBuilder.create().texOffs(85, 28).addBox(-2.5f, -2.5f, -2.2f, 3, 3, 2), PartPose.offsetAndRotation(-0.1f, 9.5f, -4.5f, 0.0f, 0.0f, 0.68294734f));
        PartDefinition pop1_1 = body1.addOrReplaceChild("pop1_1", CubeListBuilder.create().texOffs(19, 44).addBox(-2.5f, -2.5f, -2.2f, 5, 5, 2), PartPose.offsetAndRotation(-2.9f, 12.5f, 0.3f, 0.0f, 1.5707964f, 0.0f));
        PartDefinition pop1_4 = body1.addOrReplaceChild("pop1_4", CubeListBuilder.create().texOffs(64, 46).addBox(-2.5f, -2.5f, -2.2f, 6, 9, 2), PartPose.offsetAndRotation(6.1f, 6.8f, 0.5f, 0.0f, 1.5707964f, 0.0f));
        PartDefinition pop1_3 = body1.addOrReplaceChild("pop1_3", CubeListBuilder.create().texOffs(54, 46).addBox(-2.5f, -2.5f, -2.2f, 3, 3, 2), PartPose.offsetAndRotation(2.6f, 11.5f, -3.9f, 0.0f, 0.0f, -1.548107f));
        return LayerDefinition.create(mesh, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        float f1;
        this.wing1.zRot = f1 = 0.6f * Mth.sin((float)(ageInTicks * 0.3f + 2.0f));
        this.wing2.zRot = -1.0f * f1;
        this.wing3.zRot = -1.0f * f1;
        this.tree1.y = 0.2f * Mth.sin((float)(ageInTicks * 0.3f + 2.0f)) / 4.0f;
        this.tree2.y = 0.2f * Mth.sin((float)(ageInTicks * 0.3f + 4.0f)) / 4.0f;
        this.tree3.y = 0.2f * Mth.sin((float)(ageInTicks * 0.3f + 6.0f)) / 4.0f;
        this.body1.y = 0.2f * Mth.sin((float)(ageInTicks * 0.3f + 6.0f)) / 4.0f;
        this.body2.y = 0.2f * Mth.sin((float)(ageInTicks * 0.3f + 4.0f)) / 4.0f;
        this.body3.y = 0.2f * Mth.sin((float)(ageInTicks * 0.3f + 2.0f)) / 4.0f;
    
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
