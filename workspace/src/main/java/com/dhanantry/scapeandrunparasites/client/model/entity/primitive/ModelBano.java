package com.dhanantry.scapeandrunparasites.client.model.entity.primitive;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import com.dhanantry.scapeandrunparasites.entity.monster.primitive.EntityBano;

public class ModelBano extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "bano"), "main");
    private final ModelPart RBjoint_1;
    private final ModelPart Rbackleg_joint;
    private final ModelPart LBjoint_2;
    private final ModelPart Rmiddlearm_joint;
    private final ModelPart RMjoint_1;
    private final ModelPart LFjoint_2;
    private final ModelPart LMjoint_2;
    private final ModelPart mainbody;
    private final ModelPart Lfrontarm_joint;
    private final ModelPart Lmiddlearm_joint;
    private final ModelPart RFjoint_2;
    private final ModelPart Rbackarm_joint;
    private final ModelPart LMjoint_1;
    private final ModelPart Rfrontarm_joint;
    private final ModelPart LFjoint_1;
    private final ModelPart Rfrontleg_joint;
    private final ModelPart RBjoint_2;
    private final ModelPart Lbackarm_joint;
    private final ModelPart RMjoint_2;
    private final ModelPart Lfrontleg_joint;
    private final ModelPart Lbackleg_joint;
    private final ModelPart RFjoint_1;
    private final ModelPart LBjoint_1;
    private final float mainbodyBaseX;
    private final float mainbodyBaseY;
    private final float mainbodyBaseZ;

    public ModelBano(ModelPart root) {
        this.RBjoint_1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("Rbackarm_joint").getChild("Rbackarm_1").getChild("RBjoint_1");
        this.Rbackleg_joint = root.getChild("mainbody").getChild("Rbackleg_joint");
        this.LBjoint_2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("Lbackarm_joint").getChild("Lbackarm_1").getChild("LBjoint_1").getChild("Lbackarm_2").getChild("LBjoint_2");
        this.Rmiddlearm_joint = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("Rmiddlearm_joint");
        this.RMjoint_1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("Rmiddlearm_joint").getChild("Rmiddlearm_1").getChild("RMjoint_1");
        this.LFjoint_2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("Lfrontarm_joint").getChild("Lfrontarm_1").getChild("LFjoint_1").getChild("Lfrontarm_2").getChild("LFjoint_2");
        this.LMjoint_2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("Lmiddlearm_joint").getChild("Lmiddlearm_1").getChild("LMjoint_1").getChild("Lmiddlearm_2").getChild("LMjoint_2");
        this.mainbody = root.getChild("mainbody");
        this.Lfrontarm_joint = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("Lfrontarm_joint");
        this.Lmiddlearm_joint = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("Lmiddlearm_joint");
        this.RFjoint_2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("Rfrontarm_joint").getChild("Rfrontarm_1").getChild("RFjoint_1").getChild("Rfrontarm_2").getChild("RFjoint_2");
        this.Rbackarm_joint = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("Rbackarm_joint");
        this.LMjoint_1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("Lmiddlearm_joint").getChild("Lmiddlearm_1").getChild("LMjoint_1");
        this.Rfrontarm_joint = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("Rfrontarm_joint");
        this.LFjoint_1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("Lfrontarm_joint").getChild("Lfrontarm_1").getChild("LFjoint_1");
        this.Rfrontleg_joint = root.getChild("mainbody").getChild("Rfrontleg_joint");
        this.RBjoint_2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("Rbackarm_joint").getChild("Rbackarm_1").getChild("RBjoint_1").getChild("Rbackarm_2").getChild("RBjoint_2");
        this.Lbackarm_joint = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("Lbackarm_joint");
        this.RMjoint_2 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("body5").getChild("body6").getChild("body7").getChild("Rmiddlearm_joint").getChild("Rmiddlearm_1").getChild("RMjoint_1").getChild("Rmiddlearm_2").getChild("RMjoint_2");
        this.Lfrontleg_joint = root.getChild("mainbody").getChild("Lfrontleg_joint");
        this.Lbackleg_joint = root.getChild("mainbody").getChild("Lbackleg_joint");
        this.RFjoint_1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("Rfrontarm_joint").getChild("Rfrontarm_1").getChild("RFjoint_1");
        this.LBjoint_1 = root.getChild("mainbody").getChild("body1").getChild("body2").getChild("body3").getChild("body4").getChild("Lbackarm_joint").getChild("Lbackarm_1").getChild("LBjoint_1");
        this.mainbodyBaseX = 0.0f;
        this.mainbodyBaseY = 10.0f;
        this.mainbodyBaseZ = 0.0f;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, 0.0f, -4.5f, 8, 5, 9), PartPose.offset(0.0f, 10.0f, 0.0f));
                PartDefinition Lfrontleg_joint = mainbody.addOrReplaceChild("Lfrontleg_joint", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 3.6f, -3.4f));
                PartDefinition Lfrontleg_1 = Lfrontleg_joint.addOrReplaceChild("Lfrontleg_1", CubeListBuilder.create().texOffs(65, 0).addBox(0.0f, -1.0f, -1.0f, 8, 2, 2), PartPose.offsetAndRotation(-1.0f, 0.3f, 1.2f, -0.15707964f, 0.6806784f, -0.2268928f));
                PartDefinition Lfrontleg_2 = Lfrontleg_1.addOrReplaceChild("Lfrontleg_2", CubeListBuilder.create().texOffs(85, 0).addBox(0.0f, -1.5f, -1.5f, 8, 3, 3), PartPose.offsetAndRotation(7.0f, -0.4f, 0.0f, 0.0f, 0.0f, 1.3613569f));
                PartDefinition Lfrontleg_3 = Lfrontleg_2.addOrReplaceChild("Lfrontleg_3", CubeListBuilder.create().texOffs(31, 0).addBox(0.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(7.5f, -0.4f, 0.0f, 0.0f, 0.0f, 0.38397244f));
                PartDefinition Lbackleg_joint = mainbody.addOrReplaceChild("Lbackleg_joint", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.0f, 3.6f, 3.4f));
                PartDefinition Lbackleg_1 = Lbackleg_joint.addOrReplaceChild("Lbackleg_1", CubeListBuilder.create().texOffs(107, 0).addBox(0.0f, -1.0f, -1.0f, 6, 2, 2), PartPose.offsetAndRotation(-1.0f, 0.3f, -1.0f, 0.12217305f, -0.5934119f, -0.2268928f));
                PartDefinition Lbackleg_2 = Lbackleg_1.addOrReplaceChild("Lbackleg_2", CubeListBuilder.create().texOffs(65, 4).addBox(0.0f, -1.5f, -1.5f, 8, 3, 3), PartPose.offsetAndRotation(5.0f, -0.4f, 0.0f, 0.0f, 0.0f, 1.3613569f));
                PartDefinition Lfrontleg_3_1 = Lbackleg_2.addOrReplaceChild("Lfrontleg_3_1", CubeListBuilder.create().texOffs(25, 4).addBox(0.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(7.2f, -0.4f, 0.0f, 0.0f, 0.0f, 0.38397244f));
                PartDefinition Rfrontleg_joint = mainbody.addOrReplaceChild("Rfrontleg_joint", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.0f, 3.6f, -3.4f));
                PartDefinition Rfrontleg_1 = Rfrontleg_joint.addOrReplaceChild("Rfrontleg_1", CubeListBuilder.create().texOffs(105, 4).addBox(0.0f, -1.0f, -1.0f, 8, 2, 2), PartPose.offsetAndRotation(1.0f, 0.3f, 1.2f, 0.15707964f, 2.4260077f, 0.2268928f));
                PartDefinition Rfrontleg_2 = Rfrontleg_1.addOrReplaceChild("Rfrontleg_2", CubeListBuilder.create().texOffs(84, 7).addBox(0.0f, -1.5f, -1.5f, 8, 3, 3), PartPose.offsetAndRotation(7.0f, -0.4f, 0.0f, 0.0f, 0.0f, 1.3613569f));
                PartDefinition Rfrontleg_3 = Rfrontleg_2.addOrReplaceChild("Rfrontleg_3", CubeListBuilder.create().texOffs(106, 8).addBox(0.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(7.5f, -0.4f, 0.0f, 0.0f, 0.0f, 0.38397244f));
                PartDefinition Rbackleg_joint = mainbody.addOrReplaceChild("Rbackleg_joint", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-4.0f, 3.6f, 3.4f));
                PartDefinition Rbackleg_1 = Rbackleg_joint.addOrReplaceChild("Rbackleg_1", CubeListBuilder.create().texOffs(104, 12).addBox(0.0f, -1.0f, -1.0f, 6, 2, 2), PartPose.offsetAndRotation(1.0f, 0.3f, -1.0f, -0.12217305f, -2.5481808f, 0.2268928f));
                PartDefinition Rbackleg_2 = Rbackleg_1.addOrReplaceChild("Rbackleg_2", CubeListBuilder.create().texOffs(31, 13).addBox(0.0f, -1.5f, -1.5f, 8, 3, 3), PartPose.offsetAndRotation(5.0f, -0.4f, 0.0f, 0.0f, 0.0f, 1.3613569f));
                PartDefinition Rfrontleg_3_1 = Rbackleg_2.addOrReplaceChild("Rfrontleg_3_1", CubeListBuilder.create().texOffs(53, 13).addBox(0.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(7.2f, -0.4f, 0.0f, 0.0f, 0.0f, 0.38397244f));
                PartDefinition body1 = mainbody.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(34, 0).addBox(-5.0f, -1.0f, -5.5f, 10, 2, 11), PartPose.offset(0.0f, 0.7f, 0.0f));
                PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(54, 13).addBox(-6.0f, -1.0f, -6.5f, 12, 3, 13), PartPose.offsetAndRotation(0.0f, -2.2f, 0.1f, -0.05235988f, 0.0f, 0.0f));
                PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 19).addBox(-7.0f, -1.0f, -7.5f, 14, 5, 15), PartPose.offsetAndRotation(0.0f, -4.2f, 0.1f, -0.05235988f, 0.0f, 0.0f));
                PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(41, 29).addBox(-8.0f, -1.0f, -8.5f, 16, 7, 17), PartPose.offsetAndRotation(0.0f, -6.2f, 0.5f, -0.05235988f, 0.0f, 0.0f));
                PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(0, 53).addBox(-7.0f, -1.0f, -7.5f, 14, 6, 15), PartPose.offsetAndRotation(0.0f, -5.4f, -0.3f, 0.06981317f, 0.0f, 0.0f));
                PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(58, 53).addBox(-6.0f, -1.0f, -6.5f, 12, 6, 13), PartPose.offsetAndRotation(0.0f, -5.4f, -0.3f, 0.06981317f, 0.0f, 0.0f));
                PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create().texOffs(43, 72).addBox(-7.0f, -1.0f, -7.5f, 14, 6, 15), PartPose.offsetAndRotation(0.0f, -5.4f, -0.3f, 0.06981317f, 0.0f, 0.0f));
                PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create().texOffs(0, 80).addBox(-6.0f, -1.0f, -6.5f, 12, 4, 13), PartPose.offsetAndRotation(0.0f, -3.4f, -0.3f, 0.06981317f, 0.0f, 0.0f));
                PartDefinition body9 = body8.addOrReplaceChild("body9", CubeListBuilder.create().texOffs(39, 93).addBox(-5.0f, -1.0f, -5.5f, 10, 2, 11), PartPose.offsetAndRotation(0.0f, -1.4f, -0.3f, 0.06981317f, 0.0f, 0.0f));
                PartDefinition Lmiddlearm_joint = body7.addOrReplaceChild("Lmiddlearm_joint", CubeListBuilder.create().texOffs(4, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(6.5f, 0.5f, 0.0f));
                PartDefinition Lmiddlearm_1 = Lmiddlearm_joint.addOrReplaceChild("Lmiddlearm_1", CubeListBuilder.create().texOffs(91, 16).addBox(0.0f, -1.5f, -1.5f, 10, 3, 3), PartPose.offsetAndRotation(-1.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.7330383f));
                PartDefinition LMjoint_1 = Lmiddlearm_1.addOrReplaceChild("LMjoint_1", CubeListBuilder.create().texOffs(123, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.7f, 0.0f, 0.0f));
                PartDefinition Lmiddlearm_2 = LMjoint_1.addOrReplaceChild("Lmiddlearm_2", CubeListBuilder.create().texOffs(0, 14).addBox(0.0f, -1.0f, -1.0f, 4, 2, 2), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -1.0471976f));
                PartDefinition LMjoint_2 = Lmiddlearm_2.addOrReplaceChild("LMjoint_2", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.7f, 0.0f, 0.0f));
                PartDefinition Lmiddlearm_3 = LMjoint_2.addOrReplaceChild("Lmiddlearm_3", CubeListBuilder.create().texOffs(43, 19).addBox(0.0f, -1.0f, -1.0f, 10, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9075712f));
                PartDefinition Rmiddlearm_joint = body7.addOrReplaceChild("Rmiddlearm_joint", CubeListBuilder.create().texOffs(25, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-6.5f, 0.5f, 0.0f));
                PartDefinition Rmiddlearm_1 = Rmiddlearm_joint.addOrReplaceChild("Rmiddlearm_1", CubeListBuilder.create().texOffs(101, 26).addBox(0.0f, -1.5f, -1.5f, 10, 3, 3), PartPose.offsetAndRotation(1.0f, 0.3f, 0.0f, 0.0f, 0.0f, 2.4783676f));
                PartDefinition RMjoint_1 = Rmiddlearm_1.addOrReplaceChild("RMjoint_1", CubeListBuilder.create().texOffs(4, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(9.7f, 0.0f, 0.0f));
                PartDefinition Rmiddlearm_2 = RMjoint_1.addOrReplaceChild("Rmiddlearm_2", CubeListBuilder.create().texOffs(12, 14).addBox(0.0f, -1.0f, -1.0f, 4, 2, 2), PartPose.offsetAndRotation(0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0471976f));
                PartDefinition RMjoint_2 = Rmiddlearm_2.addOrReplaceChild("RMjoint_2", CubeListBuilder.create().texOffs(37, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(3.7f, 0.0f, 0.0f));
                PartDefinition Rmiddlearm_3 = RMjoint_2.addOrReplaceChild("Rmiddlearm_3", CubeListBuilder.create().texOffs(91, 22).addBox(0.0f, -1.0f, -1.0f, 10, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9075712f));
                PartDefinition Lfrontarm_joint = body4.addOrReplaceChild("Lfrontarm_joint", CubeListBuilder.create().texOffs(83, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.5f, 3.6f, -6.0f));
                PartDefinition Lfrontarm_1 = Lfrontarm_joint.addOrReplaceChild("Lfrontarm_1", CubeListBuilder.create().texOffs(90, 32).addBox(0.0f, -1.5f, -1.5f, 8, 3, 3), PartPose.offsetAndRotation(-1.0f, 0.3f, 1.2f, 0.05235988f, 0.6806784f, -0.2268928f));
                PartDefinition LFjoint_1 = Lfrontarm_1.addOrReplaceChild("LFjoint_1", CubeListBuilder.create().texOffs(41, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.7f, 0.0f, 0.0f));
                PartDefinition Lfrontarm_2 = LFjoint_1.addOrReplaceChild("Lfrontarm_2", CubeListBuilder.create().texOffs(90, 38).addBox(0.0f, -1.0f, -1.0f, 12, 2, 2), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -0.89011794f));
                PartDefinition LFjoint_2 = Lfrontarm_2.addOrReplaceChild("LFjoint_2", CubeListBuilder.create().texOffs(123, 4).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(11.7f, 0.0f, 0.0f));
                PartDefinition Lfrontarm_3 = LFjoint_2.addOrReplaceChild("Lfrontarm_3", CubeListBuilder.create().texOffs(0, 18).addBox(0.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9075712f));
                PartDefinition Lbackarm_joint = body4.addOrReplaceChild("Lbackarm_joint", CubeListBuilder.create().texOffs(104, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.5f, 3.6f, 6.6f));
                PartDefinition Lbackarm_1 = Lbackarm_joint.addOrReplaceChild("Lbackarm_1", CubeListBuilder.create().texOffs(0, 39).addBox(0.0f, -1.5f, -1.5f, 8, 3, 3), PartPose.offsetAndRotation(-1.0f, 0.3f, -1.4f, 0.10471976f, -0.5934119f, -0.2268928f));
                PartDefinition LBjoint_1 = Lbackarm_1.addOrReplaceChild("LBjoint_1", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.7f, 0.0f, 0.0f));
                PartDefinition Lbackarm_2 = LBjoint_1.addOrReplaceChild("Lbackarm_2", CubeListBuilder.create().texOffs(22, 39).addBox(0.0f, -1.0f, -1.0f, 12, 2, 2), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -0.89011794f));
                PartDefinition LBjoint_2 = Lbackarm_2.addOrReplaceChild("LBjoint_2", CubeListBuilder.create().texOffs(4, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(11.7f, 0.0f, 0.0f));
                PartDefinition Lbackarm_3 = LBjoint_2.addOrReplaceChild("Lbackarm_3", CubeListBuilder.create().texOffs(0, 22).addBox(0.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9075712f));
                PartDefinition Rfrontarm_joint = body4.addOrReplaceChild("Rfrontarm_joint", CubeListBuilder.create().texOffs(121, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-7.5f, 3.6f, -6.0f));
                PartDefinition Rfrontarm_1 = Rfrontarm_joint.addOrReplaceChild("Rfrontarm_1", CubeListBuilder.create().texOffs(19, 43).addBox(0.0f, -1.5f, -1.5f, 8, 3, 3), PartPose.offsetAndRotation(1.0f, 0.3f, 1.2f, -0.05235988f, 2.4260077f, 0.2268928f));
                PartDefinition RFjoint_1 = Rfrontarm_1.addOrReplaceChild("RFjoint_1", CubeListBuilder.create().texOffs(39, 6).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.7f, 0.0f, 0.0f));
                PartDefinition Rfrontarm_2 = RFjoint_1.addOrReplaceChild("Rfrontarm_2", CubeListBuilder.create().texOffs(90, 42).addBox(0.0f, -1.0f, -1.0f, 12, 2, 2), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -0.89011794f));
                PartDefinition RFjoint_2 = Rfrontarm_2.addOrReplaceChild("RFjoint_2", CubeListBuilder.create().texOffs(34, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(11.7f, 0.0f, 0.0f));
                PartDefinition Rfrontarm_3 = RFjoint_2.addOrReplaceChild("Rfrontarm_3", CubeListBuilder.create().texOffs(0, 26).addBox(0.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9075712f));
                PartDefinition Rbackarm_joint = body4.addOrReplaceChild("Rbackarm_joint", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(-7.5f, 3.6f, 6.6f));
                PartDefinition Rbackarm_1 = Rbackarm_joint.addOrReplaceChild("Rbackarm_1", CubeListBuilder.create().texOffs(0, 46).addBox(0.0f, -1.5f, -1.5f, 8, 3, 3), PartPose.offsetAndRotation(1.0f, 0.3f, -1.4f, -0.10471976f, -2.5481808f, 0.2268928f));
                PartDefinition RBjoint_1 = Rbackarm_1.addOrReplaceChild("RBjoint_1", CubeListBuilder.create().texOffs(38, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(7.7f, 0.0f, 0.0f));
                PartDefinition Rbackarm_2 = RBjoint_1.addOrReplaceChild("Rbackarm_2", CubeListBuilder.create().texOffs(43, 53).addBox(0.0f, -1.0f, -1.0f, 12, 2, 2), PartPose.offsetAndRotation(0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -0.89011794f));
                PartDefinition RBjoint_2 = Rbackarm_2.addOrReplaceChild("RBjoint_2", CubeListBuilder.create().texOffs(103, 8).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(11.7f, 0.0f, 0.0f));
                PartDefinition Rbackarm_3 = RBjoint_2.addOrReplaceChild("Rbackarm_3", CubeListBuilder.create().texOffs(43, 29).addBox(0.0f, -1.0f, -1.0f, 5, 2, 2), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9075712f));
        return LayerDefinition.create(mesh, 128, 110);
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
        float base = (modelRenderer == this.mainbody) ? this.mainbodyBaseY : 0.0f;
        modelRenderer.y = base + (float)invert * Mth.cos(f * speed) * f1 * distance;
    }

    private void underground(com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase parasite, float ageInTicks, ModelPart mainbody) {
    }


    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        EntityBano parasite = (EntityBano)entity;
        this.Rmiddlearm_joint.zRot = 0.0f;
        this.RMjoint_1.zRot = 0.0f;
        this.RMjoint_2.zRot = 0.0f;
        this.Rfrontarm_joint.zRot = 0.0f;
        this.RFjoint_1.zRot = 0.0f;
        this.RFjoint_2.zRot = 0.0f;
        this.Rbackarm_joint.zRot = 0.0f;
        this.RBjoint_1.zRot = 0.0f;
        this.RBjoint_2.zRot = 0.0f;
        byte i = parasite.getParasiteStatus();
        if (i == 0) {
            float f1 = Mth.cos((float)(limbSwing * 0.8f + (float)Math.PI)) * 1.0f * limbSwingAmount;
            float f2 = Mth.cos((float)(limbSwing * 0.8f)) * 1.0f * limbSwingAmount;
            float ff1 = 0.6f * Mth.sin((float)(ageInTicks * 0.371688f + 0.2857143f));
            float ff2 = 0.7f * Mth.sin((float)(ageInTicks * 0.341999f + 0.3809524f));
            float ff3 = 0.8f * Mth.sin((float)(ageInTicks * 0.39818f + 0.33333334f));
            this.Rfrontleg_joint.xRot = f1;
            this.Rbackleg_joint.xRot = f2;
            this.Lfrontleg_joint.xRot = f2;
            this.Lbackleg_joint.xRot = f1;
            this.Lmiddlearm_joint.zRot = 0.5f * ff1 / 8.0f;
            this.LMjoint_1.zRot = ff1 / 8.0f;
            this.LMjoint_2.zRot = ff1 / 8.0f;
            this.Lfrontarm_joint.zRot = 0.5f * ff2 / 8.0f;
            this.LFjoint_1.zRot = ff2 / 8.0f;
            this.LFjoint_2.zRot = ff2 / 8.0f;
            this.Lbackarm_joint.zRot = 0.5f * ff3 / 8.0f;
            this.LBjoint_1.zRot = ff3 / 8.0f;
            this.LBjoint_2.zRot = ff3 / 8.0f;
            this.Rmiddlearm_joint.zRot = -0.5f * ff1 / 8.0f;
            this.RMjoint_1.zRot = -1.0f * ff1 / 8.0f;
            this.RMjoint_2.zRot = -1.0f * ff1 / 8.0f;
            this.Rfrontarm_joint.zRot = -0.5f * ff2 / 8.0f;
            this.RFjoint_1.zRot = ff2 / 8.0f;
            this.RFjoint_2.zRot = -1.0f * ff2 / 8.0f;
            this.Rbackarm_joint.zRot = -0.5f * ff3 / 8.0f;
            this.RBjoint_1.zRot = ff3 / 8.0f;
            this.RBjoint_2.zRot = -1.0f * ff3 / 8.0f;
            this.mainbody.y = this.mainbodyBaseY + (Mth.cos((float)(limbSwing * 1.5f)) * 0.3f * limbSwingAmount * 0.55f);
        } else if (i == 1 || i == 2 || i == 15) {
            // empty if block
        }
        this.underground(parasite, ageInTicks, this.mainbody);
    }


    @Override
    public void renderToBuffer(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}