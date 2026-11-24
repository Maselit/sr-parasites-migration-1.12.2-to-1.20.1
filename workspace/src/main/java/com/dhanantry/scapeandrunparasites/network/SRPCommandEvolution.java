package com.dhanantry.scapeandrunparasites.network;

import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;

/**
 * STUB migrado (Fase C): esqueleto. getNeededPoints migrado (usado por SRPSaveData).
 * La logica de comandos (execute) se migrara con Brigadier en lotes.
 */
public class SRPCommandEvolution {
    public static int getNeededPoints(byte in) {
        switch (in) {
            case 1: return SRPConfigSystems.phaseKillsOne;
            case 2: return SRPConfigSystems.phaseKillsTwo;
            case 3: return SRPConfigSystems.phaseKillsThree;
            case 4: return SRPConfigSystems.phaseKillsFour;
            case 5: return SRPConfigSystems.phaseKillsFive;
            case 6: return SRPConfigSystems.phaseKillsSix;
            case 7: return SRPConfigSystems.phaseKillsSeven;
            case 8: return SRPConfigSystems.phaseKillsEight;
            case 9: return SRPConfigSystems.phaseKillsNine;
            case 10: return SRPConfigSystems.phaseKillsTen;
        }
        return 0;
    }
}
