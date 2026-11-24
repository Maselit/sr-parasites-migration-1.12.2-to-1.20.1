package com.dhanantry.scapeandrunparasites.client.particle;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public enum SRPEnumParticle {
    FOG("fog", 0, false),
    SPORE("spore", 1, false),
    GCLOUD("gcloud", 2, false),
    GSPLASH("gsplash", 3, false),
    RHAPPY("rhappy", 4, false),
    BIOMASS("biomass", 5, false),
    EEN("een", 6, false);

    private final String particleName;
    private final int particleID;
    private final boolean shouldIgnoreRange;
    private final int argumentCount;
    private static final Map<Integer, SRPEnumParticle> PARTICLES = new HashMap<>();
    private static final Map<String, SRPEnumParticle> BY_NAME = new HashMap<>();

    SRPEnumParticle(String particleNameIn, int particleIDIn, boolean shouldIgnoreRangeIn) {
        this(particleNameIn, particleIDIn, shouldIgnoreRangeIn, 0);
    }

    SRPEnumParticle(String particleNameIn, int particleIDIn, boolean shouldIgnoreRangeIn, int argumentCountIn) {
        this.particleName = particleNameIn;
        this.particleID = particleIDIn;
        this.shouldIgnoreRange = shouldIgnoreRangeIn;
        this.argumentCount = argumentCountIn;
    }

    public static Set<String> getParticleNames() { return BY_NAME.keySet(); }
    public String getParticleName() { return particleName; }
    public int getParticleID() { return particleID; }
    public int getArgumentCount() { return argumentCount; }
    public boolean getShouldIgnoreRange() { return shouldIgnoreRange; }

    public static SRPEnumParticle getParticleFromId(int particleId) { return PARTICLES.get(particleId); }
    public static SRPEnumParticle getByName(String nameIn) { return BY_NAME.get(nameIn); }

    static {
        for (SRPEnumParticle e : SRPEnumParticle.values()) {
            PARTICLES.put(e.getParticleID(), e);
            BY_NAME.put(e.getParticleName(), e);
        }
    }
}
