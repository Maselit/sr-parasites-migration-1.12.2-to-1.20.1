package com.dhanantry.scapeandrunparasites.client.model.entity.deterrent.nexus;

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

public class ModelLeemSII extends EntityModel<Entity> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("srparasites", "leemsii"), "main");
    private final ModelPart mainbody;
    private final ModelPart b;
    private final ModelPart b_1;
    private final ModelPart b_2;
    private final ModelPart joint;
    private final ModelPart b_3;
    private final ModelPart joint_1;
    private final ModelPart b_4;
    private final ModelPart joint_2;
    private final ModelPart b_5;
    private final ModelPart b_6;
    private final ModelPart b_7;
    private final ModelPart b_8;
    private final ModelPart b_9;
    private final ModelPart b_10;
    private final ModelPart b_11;
    private final ModelPart b_12;
    private final ModelPart b_13;
    private final ModelPart b_14;
    private final ModelPart jd;
    private final ModelPart jd_1;
    private final ModelPart jd_2;
    private final ModelPart jd_3;
    private final ModelPart jd_4;
    private final ModelPart jd_5;
    private final ModelPart jd_6;
    private final ModelPart taclejoint;
    private final ModelPart d;
    private final ModelPart tentacle;
    private final ModelPart taclejoint_1;
    private final ModelPart tentacle_1;
    private final ModelPart taclejoint_2;
    private final ModelPart tentacle_2;
    private final ModelPart taclejoint_3;
    private final ModelPart tentacle_3;
    private final ModelPart taclejoint_4;
    private final ModelPart d_1;
    private final ModelPart tentacle_4;
    private final ModelPart taclejoint_5;
    private final ModelPart tentacle_5;
    private final ModelPart taclejoint_6;
    private final ModelPart tentacle_6;
    private final ModelPart taclejoint_7;
    private final ModelPart tentacle_7;
    private final ModelPart taclejoint_8;
    private final ModelPart d_2;
    private final ModelPart tentacle_8;
    private final ModelPart taclejoint_9;
    private final ModelPart tentacle_9;
    private final ModelPart taclejoint_10;
    private final ModelPart tentacle_10;
    private final ModelPart taclejoint_11;
    private final ModelPart tentacle_11;
    private final ModelPart taclejoint_12;
    private final ModelPart d_3;
    private final ModelPart tentacle_12;
    private final ModelPart taclejoint_13;
    private final ModelPart tentacle_13;
    private final ModelPart taclejoint_14;
    private final ModelPart tentacle_14;
    private final ModelPart taclejoint_15;
    private final ModelPart tentacle_15;
    private final ModelPart dec;
    private final ModelPart jointD;
    private final ModelPart dec_1;
    private final ModelPart jointD_1;
    private final ModelPart dec_2;
    private final ModelPart jointD_2;
    private final ModelPart dec_3;
    private final ModelPart jointD_3;
    private final ModelPart dec_4;
    private final ModelPart dec_5;
    private final ModelPart jointD_4;
    private final ModelPart dec_6;
    private final ModelPart jointD_5;
    private final ModelPart dec_7;
    private final ModelPart jointD_6;
    private final ModelPart dec_8;
    private final ModelPart jointD_7;
    private final ModelPart dec_9;
    private final ModelPart dec_10;
    private final ModelPart jointD_8;
    private final ModelPart dec_11;
    private final ModelPart jointD_9;
    private final ModelPart dec_12;
    private final ModelPart jointD_10;
    private final ModelPart dec_13;
    private final ModelPart jointD_11;
    private final ModelPart dec_14;

    public ModelLeemSII(ModelPart root) {
        this.mainbody = root.getChild("mainbody");
        this.b = root.getChild("b");
        this.b_1 = root.getChild("mainbody").getChild("b_1");
        this.b_2 = root.getChild("mainbody").getChild("b_2");
        this.joint = root.getChild("mainbody").getChild("b_1").getChild("joint");
        this.b_3 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3");
        this.joint_1 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1");
        this.b_4 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4");
        this.joint_2 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2");
        this.b_5 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("b_5");
        this.b_6 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("b_6");
        this.b_7 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("b_7");
        this.b_8 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("b_8");
        this.b_9 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("b_9");
        this.b_10 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("b_10");
        this.b_11 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("b_11");
        this.b_12 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("b_12");
        this.b_13 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("b_13");
        this.b_14 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("b_14");
        this.jd = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd");
        this.jd_1 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_1");
        this.jd_2 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_2");
        this.jd_3 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_3");
        this.jd_4 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_4");
        this.jd_5 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_5");
        this.jd_6 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_6");
        this.taclejoint = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd").getChild("taclejoint");
        this.d = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd").getChild("d");
        this.tentacle = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd").getChild("taclejoint").getChild("tentacle");
        this.taclejoint_1 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd").getChild("taclejoint").getChild("tentacle").getChild("taclejoint_1");
        this.tentacle_1 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd").getChild("taclejoint").getChild("tentacle").getChild("taclejoint_1").getChild("tentacle_1");
        this.taclejoint_2 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd").getChild("taclejoint").getChild("tentacle").getChild("taclejoint_1").getChild("tentacle_1").getChild("taclejoint_2");
        this.tentacle_2 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd").getChild("taclejoint").getChild("tentacle").getChild("taclejoint_1").getChild("tentacle_1").getChild("taclejoint_2").getChild("tentacle_2");
        this.taclejoint_3 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd").getChild("taclejoint").getChild("tentacle").getChild("taclejoint_1").getChild("tentacle_1").getChild("taclejoint_2").getChild("tentacle_2").getChild("taclejoint_3");
        this.tentacle_3 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd").getChild("taclejoint").getChild("tentacle").getChild("taclejoint_1").getChild("tentacle_1").getChild("taclejoint_2").getChild("tentacle_2").getChild("taclejoint_3").getChild("tentacle_3");
        this.taclejoint_4 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_1").getChild("taclejoint_4");
        this.d_1 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_1").getChild("d_1");
        this.tentacle_4 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_1").getChild("taclejoint_4").getChild("tentacle_4");
        this.taclejoint_5 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_1").getChild("taclejoint_4").getChild("tentacle_4").getChild("taclejoint_5");
        this.tentacle_5 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_1").getChild("taclejoint_4").getChild("tentacle_4").getChild("taclejoint_5").getChild("tentacle_5");
        this.taclejoint_6 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_1").getChild("taclejoint_4").getChild("tentacle_4").getChild("taclejoint_5").getChild("tentacle_5").getChild("taclejoint_6");
        this.tentacle_6 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_1").getChild("taclejoint_4").getChild("tentacle_4").getChild("taclejoint_5").getChild("tentacle_5").getChild("taclejoint_6").getChild("tentacle_6");
        this.taclejoint_7 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_1").getChild("taclejoint_4").getChild("tentacle_4").getChild("taclejoint_5").getChild("tentacle_5").getChild("taclejoint_6").getChild("tentacle_6").getChild("taclejoint_7");
        this.tentacle_7 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_1").getChild("taclejoint_4").getChild("tentacle_4").getChild("taclejoint_5").getChild("tentacle_5").getChild("taclejoint_6").getChild("tentacle_6").getChild("taclejoint_7").getChild("tentacle_7");
        this.taclejoint_8 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_2").getChild("taclejoint_8");
        this.d_2 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_2").getChild("d_2");
        this.tentacle_8 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_2").getChild("taclejoint_8").getChild("tentacle_8");
        this.taclejoint_9 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_2").getChild("taclejoint_8").getChild("tentacle_8").getChild("taclejoint_9");
        this.tentacle_9 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_2").getChild("taclejoint_8").getChild("tentacle_8").getChild("taclejoint_9").getChild("tentacle_9");
        this.taclejoint_10 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_2").getChild("taclejoint_8").getChild("tentacle_8").getChild("taclejoint_9").getChild("tentacle_9").getChild("taclejoint_10");
        this.tentacle_10 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_2").getChild("taclejoint_8").getChild("tentacle_8").getChild("taclejoint_9").getChild("tentacle_9").getChild("taclejoint_10").getChild("tentacle_10");
        this.taclejoint_11 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_2").getChild("taclejoint_8").getChild("tentacle_8").getChild("taclejoint_9").getChild("tentacle_9").getChild("taclejoint_10").getChild("tentacle_10").getChild("taclejoint_11");
        this.tentacle_11 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_2").getChild("taclejoint_8").getChild("tentacle_8").getChild("taclejoint_9").getChild("tentacle_9").getChild("taclejoint_10").getChild("tentacle_10").getChild("taclejoint_11").getChild("tentacle_11");
        this.taclejoint_12 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_3").getChild("taclejoint_12");
        this.d_3 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_3").getChild("d_3");
        this.tentacle_12 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_3").getChild("taclejoint_12").getChild("tentacle_12");
        this.taclejoint_13 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_3").getChild("taclejoint_12").getChild("tentacle_12").getChild("taclejoint_13");
        this.tentacle_13 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_3").getChild("taclejoint_12").getChild("tentacle_12").getChild("taclejoint_13").getChild("tentacle_13");
        this.taclejoint_14 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_3").getChild("taclejoint_12").getChild("tentacle_12").getChild("taclejoint_13").getChild("tentacle_13").getChild("taclejoint_14");
        this.tentacle_14 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_3").getChild("taclejoint_12").getChild("tentacle_12").getChild("taclejoint_13").getChild("tentacle_13").getChild("taclejoint_14").getChild("tentacle_14");
        this.taclejoint_15 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_3").getChild("taclejoint_12").getChild("tentacle_12").getChild("taclejoint_13").getChild("tentacle_13").getChild("taclejoint_14").getChild("tentacle_14").getChild("taclejoint_15");
        this.tentacle_15 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_3").getChild("taclejoint_12").getChild("tentacle_12").getChild("taclejoint_13").getChild("tentacle_13").getChild("taclejoint_14").getChild("tentacle_14").getChild("taclejoint_15").getChild("tentacle_15");
        this.dec = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_4").getChild("dec");
        this.jointD = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_4").getChild("dec").getChild("jointD");
        this.dec_1 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_4").getChild("dec").getChild("jointD").getChild("dec_1");
        this.jointD_1 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_4").getChild("dec").getChild("jointD").getChild("dec_1").getChild("jointD_1");
        this.dec_2 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_4").getChild("dec").getChild("jointD").getChild("dec_1").getChild("jointD_1").getChild("dec_2");
        this.jointD_2 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_4").getChild("dec").getChild("jointD").getChild("dec_1").getChild("jointD_1").getChild("dec_2").getChild("jointD_2");
        this.dec_3 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_4").getChild("dec").getChild("jointD").getChild("dec_1").getChild("jointD_1").getChild("dec_2").getChild("jointD_2").getChild("dec_3");
        this.jointD_3 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_4").getChild("dec").getChild("jointD").getChild("dec_1").getChild("jointD_1").getChild("dec_2").getChild("jointD_2").getChild("dec_3").getChild("jointD_3");
        this.dec_4 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_4").getChild("dec").getChild("jointD").getChild("dec_1").getChild("jointD_1").getChild("dec_2").getChild("jointD_2").getChild("dec_3").getChild("jointD_3").getChild("dec_4");
        this.dec_5 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_5").getChild("dec_5");
        this.jointD_4 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_5").getChild("dec_5").getChild("jointD_4");
        this.dec_6 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_5").getChild("dec_5").getChild("jointD_4").getChild("dec_6");
        this.jointD_5 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_5").getChild("dec_5").getChild("jointD_4").getChild("dec_6").getChild("jointD_5");
        this.dec_7 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_5").getChild("dec_5").getChild("jointD_4").getChild("dec_6").getChild("jointD_5").getChild("dec_7");
        this.jointD_6 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_5").getChild("dec_5").getChild("jointD_4").getChild("dec_6").getChild("jointD_5").getChild("dec_7").getChild("jointD_6");
        this.dec_8 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_5").getChild("dec_5").getChild("jointD_4").getChild("dec_6").getChild("jointD_5").getChild("dec_7").getChild("jointD_6").getChild("dec_8");
        this.jointD_7 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_5").getChild("dec_5").getChild("jointD_4").getChild("dec_6").getChild("jointD_5").getChild("dec_7").getChild("jointD_6").getChild("dec_8").getChild("jointD_7");
        this.dec_9 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_5").getChild("dec_5").getChild("jointD_4").getChild("dec_6").getChild("jointD_5").getChild("dec_7").getChild("jointD_6").getChild("dec_8").getChild("jointD_7").getChild("dec_9");
        this.dec_10 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_6").getChild("dec_10");
        this.jointD_8 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_6").getChild("dec_10").getChild("jointD_8");
        this.dec_11 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_6").getChild("dec_10").getChild("jointD_8").getChild("dec_11");
        this.jointD_9 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_6").getChild("dec_10").getChild("jointD_8").getChild("dec_11").getChild("jointD_9");
        this.dec_12 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_6").getChild("dec_10").getChild("jointD_8").getChild("dec_11").getChild("jointD_9").getChild("dec_12");
        this.jointD_10 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_6").getChild("dec_10").getChild("jointD_8").getChild("dec_11").getChild("jointD_9").getChild("dec_12").getChild("jointD_10");
        this.dec_13 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_6").getChild("dec_10").getChild("jointD_8").getChild("dec_11").getChild("jointD_9").getChild("dec_12").getChild("jointD_10").getChild("dec_13");
        this.jointD_11 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_6").getChild("dec_10").getChild("jointD_8").getChild("dec_11").getChild("jointD_9").getChild("dec_12").getChild("jointD_10").getChild("dec_13").getChild("jointD_11");
        this.dec_14 = root.getChild("mainbody").getChild("b_1").getChild("joint").getChild("b_3").getChild("joint_1").getChild("b_4").getChild("joint_2").getChild("jd_6").getChild("dec_10").getChild("jointD_8").getChild("dec_11").getChild("jointD_9").getChild("dec_12").getChild("jointD_10").getChild("dec_13").getChild("jointD_11").getChild("dec_14");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        PartDefinition mainbody = root.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 8.0f, 0.0f));
        PartDefinition b_1 = mainbody.addOrReplaceChild("b_1", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0f, -4.0f, -3.5f, 13, 11, 10), PartPose.offsetAndRotation(0.0f, 11.0f, -1.0f, 0.12566371f, 0.0f, 0.0f));
        PartDefinition joint = b_1.addOrReplaceChild("joint", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(1.0f, -4.0f, 0.5f));
        PartDefinition b_3 = joint.addOrReplaceChild("b_3", CubeListBuilder.create().texOffs(104, 0).addBox(-3.0f, -12.5f, -5.0f, 8, 28, 7), PartPose.offsetAndRotation(-1.0f, -7.5f, 3.0f, -0.25132743f, 0.0f, 0.0f));
        PartDefinition joint_1 = b_3.addOrReplaceChild("joint_1", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, -12.0f, -0.1f));
        PartDefinition b_4 = joint_1.addOrReplaceChild("b_4", CubeListBuilder.create().texOffs(134, 0).addBox(-1.0f, -25.2f, -2.6f, 5, 30, 4), PartPose.offsetAndRotation(-1.0f, -2.5f, -1.0f, 0.12566371f, 0.0f, 0.0f));
        PartDefinition joint_2 = b_4.addOrReplaceChild("joint_2", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(2.0f, -26.0f, -1.0f));
        PartDefinition jd_1 = joint_2.addOrReplaceChild("jd_1", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(19.0f, -16.0f, 6.0f, -1.5707964f, -0.6143559f, 0.0f));
        PartDefinition d_1 = jd_1.addOrReplaceChild("d_1", CubeListBuilder.create().texOffs(227, 0).addBox(-2.5f, -2.0f, -5.5f, 6, 4, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, 0.82030475f, 0.0f));
        PartDefinition taclejoint_4 = jd_1.addOrReplaceChild("taclejoint_4", CubeListBuilder.create().texOffs(152, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tentacle_4 = taclejoint_4.addOrReplaceChild("tentacle_4", CubeListBuilder.create().texOffs(113, 73).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 20), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.38397244f, 0.0f));
        PartDefinition taclejoint_5 = tentacle_4.addOrReplaceChild("taclejoint_5", CubeListBuilder.create().texOffs(156, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 17.0f));
        PartDefinition tentacle_5 = taclejoint_5.addOrReplaceChild("tentacle_5", CubeListBuilder.create().texOffs(0, 82).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 18), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition taclejoint_6 = tentacle_5.addOrReplaceChild("taclejoint_6", CubeListBuilder.create().texOffs(185, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 15.0f));
        PartDefinition tentacle_6 = taclejoint_6.addOrReplaceChild("tentacle_6", CubeListBuilder.create().texOffs(20, 82).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 22), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition taclejoint_7 = tentacle_6.addOrReplaceChild("taclejoint_7", CubeListBuilder.create().texOffs(201, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 20.0f));
        PartDefinition tentacle_7 = taclejoint_7.addOrReplaceChild("tentacle_7", CubeListBuilder.create().texOffs(39, 85).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 29), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition b_9 = joint_2.addOrReplaceChild("b_9", CubeListBuilder.create().texOffs(0, 22).addBox(-3.0f, -3.0f, -9.0f, 16, 14, 15), PartPose.offset(6.9f, -16.0f, 0.0f));
        PartDefinition b_10 = joint_2.addOrReplaceChild("b_10", CubeListBuilder.create().texOffs(79, 36).addBox(-3.0f, -4.0f, -11.0f, 10, 17, 20), PartPose.offset(-4.1f, -18.0f, -15.0f));
        PartDefinition jd_4 = joint_2.addOrReplaceChild("jd_4", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-17.7f, -8.7f, -6.8f, (float)(-Math.PI), 0.0f, -1.9860102f));
        PartDefinition dec = jd_4.addOrReplaceChild("dec", CubeListBuilder.create().texOffs(18, 2).addBox(-1.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5777776f));
        PartDefinition jointD = dec.addOrReplaceChild("jointD", CubeListBuilder.create().texOffs(60, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_1 = jointD.addOrReplaceChild("dec_1", CubeListBuilder.create().texOffs(64, 2).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.89011794f));
        PartDefinition jointD_1 = dec_1.addOrReplaceChild("jointD_1", CubeListBuilder.create().texOffs(96, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_2 = jointD_1.addOrReplaceChild("dec_2", CubeListBuilder.create().texOffs(18, 4).addBox(0.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.57595867f));
        PartDefinition jointD_2 = dec_2.addOrReplaceChild("jointD_2", CubeListBuilder.create().texOffs(100, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(5.5f, 0.0f, 0.0f));
        PartDefinition dec_3 = jointD_2.addOrReplaceChild("dec_3", CubeListBuilder.create().texOffs(148, 2).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.62831855f));
        PartDefinition jointD_3 = dec_3.addOrReplaceChild("jointD_3", CubeListBuilder.create().texOffs(104, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_4 = jointD_3.addOrReplaceChild("dec_4", CubeListBuilder.create().texOffs(227, 10).addBox(0.0f, -0.5f, -0.5f, 10, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.09424778f));
        PartDefinition jd = joint_2.addOrReplaceChild("jd", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(3.0f, -2.0f, -19.0f, -1.5707964f, 1.144936f, 0.0f));
        PartDefinition d = jd.addOrReplaceChild("d", CubeListBuilder.create().texOffs(185, 0).addBox(-2.5f, -2.0f, -5.5f, 5, 4, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, 0.82030475f, 0.0f));
        PartDefinition taclejoint = jd.addOrReplaceChild("taclejoint", CubeListBuilder.create().texOffs(104, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tentacle = taclejoint.addOrReplaceChild("tentacle", CubeListBuilder.create().texOffs(49, 37).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 17), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.38397244f, 0.0f));
        PartDefinition taclejoint_1 = tentacle.addOrReplaceChild("taclejoint_1", CubeListBuilder.create().texOffs(127, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 14.0f));
        PartDefinition tentacle_1 = taclejoint_1.addOrReplaceChild("tentacle_1", CubeListBuilder.create().texOffs(53, 67).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 15), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition taclejoint_2 = tentacle_1.addOrReplaceChild("taclejoint_2", CubeListBuilder.create().texOffs(131, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 12.0f));
        PartDefinition tentacle_2 = taclejoint_2.addOrReplaceChild("tentacle_2", CubeListBuilder.create().texOffs(71, 73).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 18), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition taclejoint_3 = tentacle_2.addOrReplaceChild("taclejoint_3", CubeListBuilder.create().texOffs(148, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 15.0f));
        PartDefinition tentacle_3 = taclejoint_3.addOrReplaceChild("tentacle_3", CubeListBuilder.create().texOffs(85, 73).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 26), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition b_14 = joint_2.addOrReplaceChild("b_14", CubeListBuilder.create().texOffs(205, 72).addBox(-3.0f, -4.0f, -6.0f, 10, 16, 13), PartPose.offset(1.9f, -14.0f, -13.0f));
        PartDefinition jd_5 = joint_2.addOrReplaceChild("jd_5", CubeListBuilder.create().texOffs(96, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-13.7f, -12.7f, -9.8f, (float)(-Math.PI), 0.0f, -2.1116738f));
        PartDefinition dec_5 = jd_5.addOrReplaceChild("dec_5", CubeListBuilder.create().texOffs(60, 4).addBox(-1.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.12566371f, -1.69646f, 1.1379547f));
        PartDefinition jointD_4 = dec_5.addOrReplaceChild("jointD_4", CubeListBuilder.create().texOffs(127, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_6 = jointD_4.addOrReplaceChild("dec_6", CubeListBuilder.create().texOffs(96, 4).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.89011794f));
        PartDefinition jointD_5 = dec_6.addOrReplaceChild("jointD_5", CubeListBuilder.create().texOffs(131, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_7 = jointD_5.addOrReplaceChild("dec_7", CubeListBuilder.create().texOffs(60, 6).addBox(0.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.57595867f));
        PartDefinition jointD_6 = dec_7.addOrReplaceChild("jointD_6", CubeListBuilder.create().texOffs(185, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(5.5f, 0.0f, 0.0f));
        PartDefinition dec_8 = jointD_6.addOrReplaceChild("dec_8", CubeListBuilder.create().texOffs(196, 10).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25132743f));
        PartDefinition jointD_7 = dec_8.addOrReplaceChild("jointD_7", CubeListBuilder.create().texOffs(201, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_9 = jointD_7.addOrReplaceChild("dec_9", CubeListBuilder.create().texOffs(47, 21).addBox(0.0f, -0.5f, -0.5f, 9, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4712389f));
        PartDefinition b_7 = joint_2.addOrReplaceChild("b_7", CubeListBuilder.create().texOffs(59, 17).addBox(-3.0f, -3.0f, -3.0f, 9, 9, 11), PartPose.offset(-2.0f, -5.0f, 4.0f));
        PartDefinition b_5 = joint_2.addOrReplaceChild("b_5", CubeListBuilder.create().texOffs(152, 0).addBox(-5.0f, -3.0f, -3.0f, 11, 7, 11), PartPose.offset(-4.0f, -3.0f, -5.0f));
        PartDefinition b_11 = joint_2.addOrReplaceChild("b_11", CubeListBuilder.create().texOffs(191, 39).addBox(-3.0f, -3.0f, -3.0f, 14, 16, 17), PartPose.offset(2.9f, -14.0f, 3.0f));
        PartDefinition b_8 = joint_2.addOrReplaceChild("b_8", CubeListBuilder.create().texOffs(128, 18).addBox(-6.0f, -3.0f, -9.0f, 16, 14, 24), PartPose.offset(-8.1f, -16.0f, 8.0f));
        PartDefinition b_13 = joint_2.addOrReplaceChild("b_13", CubeListBuilder.create().texOffs(139, 57).addBox(-6.0f, -3.0f, -9.0f, 18, 18, 15), PartPose.offset(-12.1f, -18.0f, -1.0f));
        PartDefinition b_6 = joint_2.addOrReplaceChild("b_6", CubeListBuilder.create().texOffs(196, 0).addBox(-3.0f, -3.0f, -8.0f, 9, 11, 13), PartPose.offset(3.1f, -4.0f, 1.0f));
        PartDefinition jd_6 = joint_2.addOrReplaceChild("jd_6", CubeListBuilder.create().texOffs(100, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(19.6f, -13.7f, -6.8f, 0.0f, 0.0f, -0.8550368f));
        PartDefinition dec_10 = jd_6.addOrReplaceChild("dec_10", CubeListBuilder.create().texOffs(240, 12).addBox(-1.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5777776f));
        PartDefinition jointD_8 = dec_10.addOrReplaceChild("jointD_8", CubeListBuilder.create().texOffs(205, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_11 = jointD_8.addOrReplaceChild("dec_11", CubeListBuilder.create().texOffs(240, 14).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.89011794f));
        PartDefinition jointD_9 = dec_11.addOrReplaceChild("jointD_9", CubeListBuilder.create().texOffs(227, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_12 = jointD_9.addOrReplaceChild("dec_12", CubeListBuilder.create().texOffs(240, 16).addBox(0.0f, -0.5f, -0.5f, 6, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2617994f));
        PartDefinition jointD_10 = dec_12.addOrReplaceChild("jointD_10", CubeListBuilder.create().texOffs(245, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(5.5f, 0.0f, 0.0f));
        PartDefinition dec_13 = jointD_10.addOrReplaceChild("dec_13", CubeListBuilder.create().texOffs(88, 17).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.62831855f));
        PartDefinition jointD_11 = dec_13.addOrReplaceChild("jointD_11", CubeListBuilder.create().texOffs(249, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(4.5f, 0.0f, 0.0f));
        PartDefinition dec_14 = jointD_11.addOrReplaceChild("dec_14", CubeListBuilder.create().texOffs(47, 23).addBox(0.0f, -0.5f, -0.5f, 9, 1, 1), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4712389f));
        PartDefinition b_12 = joint_2.addOrReplaceChild("b_12", CubeListBuilder.create().texOffs(0, 51).addBox(-8.0f, -5.0f, -7.6f, 15, 12, 19), PartPose.offset(0.1f, -24.0f, 0.0f));
        PartDefinition jd_3 = joint_2.addOrReplaceChild("jd_3", CubeListBuilder.create().texOffs(68, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-7.0f, -2.0f, 5.0f, -1.5707964f, -2.5621433f, 0.0f));
        PartDefinition taclejoint_12 = jd_3.addOrReplaceChild("taclejoint_12", CubeListBuilder.create().texOffs(107, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tentacle_12 = taclejoint_12.addOrReplaceChild("tentacle_12", CubeListBuilder.create().texOffs(101, 100).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 16), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.25830874f, 0.0f));
        PartDefinition taclejoint_13 = tentacle_12.addOrReplaceChild("taclejoint_13", CubeListBuilder.create().texOffs(134, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 13.0f));
        PartDefinition tentacle_13 = taclejoint_13.addOrReplaceChild("tentacle_13", CubeListBuilder.create().texOffs(205, 101).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 15), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition taclejoint_14 = tentacle_13.addOrReplaceChild("taclejoint_14", CubeListBuilder.create().texOffs(159, 1).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 12.0f));
        PartDefinition tentacle_14 = taclejoint_14.addOrReplaceChild("tentacle_14", CubeListBuilder.create().texOffs(0, 106).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 17), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition taclejoint_15 = tentacle_14.addOrReplaceChild("taclejoint_15", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 14.0f));
        PartDefinition tentacle_15 = taclejoint_15.addOrReplaceChild("tentacle_15", CubeListBuilder.create().texOffs(155, 110).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 25), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition d_3 = jd_3.addOrReplaceChild("d_3", CubeListBuilder.create().texOffs(184, 24).addBox(-2.5f, -2.0f, -5.5f, 5, 4, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, 0.82030475f, 0.0f));
        PartDefinition jd_2 = joint_2.addOrReplaceChild("jd_2", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offsetAndRotation(-2.0f, -2.0f, 14.0f, -1.5707964f, -1.8081611f, 0.0f));
        PartDefinition d_2 = jd_2.addOrReplaceChild("d_2", CubeListBuilder.create().texOffs(0, 12).addBox(-2.5f, -2.0f, -5.5f, 5, 4, 6), PartPose.offsetAndRotation(1.0f, 0.0f, 1.0f, 0.0f, 0.82030475f, 0.0f));
        PartDefinition taclejoint_8 = jd_2.addOrReplaceChild("taclejoint_8", CubeListBuilder.create().texOffs(205, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tentacle_8 = taclejoint_8.addOrReplaceChild("tentacle_8", CubeListBuilder.create().texOffs(138, 90).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 19), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.50963616f, 0.0f));
        PartDefinition taclejoint_9 = tentacle_8.addOrReplaceChild("taclejoint_9", CubeListBuilder.create().texOffs(227, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 16.0f));
        PartDefinition tentacle_9 = taclejoint_9.addOrReplaceChild("tentacle_9", CubeListBuilder.create().texOffs(161, 90).addBox(-1.5f, -1.5f, -1.0f, 3, 3, 15), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition taclejoint_10 = tentacle_9.addOrReplaceChild("taclejoint_10", CubeListBuilder.create().texOffs(245, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 12.0f));
        PartDefinition tentacle_10 = taclejoint_10.addOrReplaceChild("tentacle_10", CubeListBuilder.create().texOffs(180, 90).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 18), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition taclejoint_11 = tentacle_10.addOrReplaceChild("taclejoint_11", CubeListBuilder.create().texOffs(249, 0).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1), PartPose.offset(0.0f, 0.0f, 15.0f));
        PartDefinition tentacle_11 = taclejoint_11.addOrReplaceChild("tentacle_11", CubeListBuilder.create().texOffs(72, 100).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 27), PartPose.offset(0.0f, 0.0f, 1.0f));
        PartDefinition b_2 = mainbody.addOrReplaceChild("b_2", CubeListBuilder.create().texOffs(70, 0).addBox(-2.0f, -2.0f, -1.0f, 9, 9, 8), PartPose.offsetAndRotation(-4.7f, 10.5f, -8.0f, -0.18849556f, 0.0f, -0.06283186f));
        PartDefinition b = root.addOrReplaceChild("b", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0f, -3.0f, -3.0f, 6, 6, 6), PartPose.offset(0.0f, -11.0f, 0.0f));
        return LayerDefinition.create(mesh, 256, 256);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    
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
