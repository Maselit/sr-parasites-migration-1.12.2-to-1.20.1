/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.command.CommandException
 *  net.minecraft.command.ICommand
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.world.World
 */
package com.dhanantry.scapeandrunparasites.network;

import com.dhanantry.scapeandrunparasites.entity.ai.misc.EntityParasiteBase;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfig;
import com.dhanantry.scapeandrunparasites.util.config.SRPConfigSystems;
import com.dhanantry.scapeandrunparasites.world.SRPSaveData;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class SRPCommandEvolution
implements ICommand {
    private final List aliases = new ArrayList();

    public SRPCommandEvolution() {
        this.aliases.add("srpevolution");
    }

    public int compareTo(ICommand arg0) {
        return 0;
    }

    public String getName() {
        return "srpevolution";
    }

    public String getUsage(ICommandSender sender) {
        return "srpevolution <text>";
    }

    public List<String> getAliases() {
        return this.aliases;
    }

    public void execute(MinecraftServer server, ICommandSender sender, String[] argString) throws CommandException {
        World world = sender.getEntityWorld();
        if (!world.isRemote) {
            if (!SRPConfigSystems.useEvolution) {
                sender.sendMessage((ITextComponent)new TextComponentString("Evolution phases is not active"));
                return;
            }
            if (argString.length == 0) {
                sender.sendMessage((ITextComponent)new TextComponentString("Invalid argument"));
                return;
            }
            if (argString[0].equals("toggle_evolutionloss")) {
                SRPSaveData data = SRPSaveData.get(world);
                boolean current = !data.getCanLoss(world.provider.getDimension());
                data.setLoss(current, world.provider.getDimension());
                sender.sendMessage((ITextComponent)new TextComponentString("Current srpevolutionloss is now " + current));
                return;
            }
            if (argString[0].equals("toggle_evolutiongaining")) {
                SRPSaveData data = SRPSaveData.get(world);
                boolean current = !data.getCanGain(world.provider.getDimension());
                data.setGaining(current, world.provider.getDimension());
                sender.sendMessage((ITextComponent)new TextComponentString("Current srpevolutiongaining is now " + current));
                return;
            }
            if (argString[0].equals("getphase")) {
                List serverList = world.loadedEntityList;
                int count = 0;
                for (int x = 0; x < serverList.size(); ++x) {
                    if (!(serverList.get(x) instanceof EntityParasiteBase)) continue;
                    ++count;
                }
                SRPSaveData data = SRPSaveData.get(world);
                int players = world.playerEntities.size();
                int id = world.provider.getDimension();
                sender.sendMessage((ITextComponent)new TextComponentString(" ======> \n -> Current Dimension: " + world.provider.getDimension() + " \n -> Current Evolution Phase: " + data.getEvolutionPhase(id) + " \n -> Total points: " + data.getTotalKills(id) + " \n -> Points required for the next phase: " + SRPCommandEvolution.getNeededPoints((byte)(data.getEvolutionPhase(id) + 1)) + " \n -> Progress: " + (double)data.getTotalKills(id) / (double)SRPCommandEvolution.getNeededPoints((byte)(data.getEvolutionPhase(id) + 1)) * 100.0 + "%  \n -> Phase cooldown: " + data.getCooldown(world, id) + " second(s) remaining \n -> srpevolutiongaining: " + data.getCanGain(id) + " (can gain points) \n -> srpevolutionloss: " + data.getCanLoss(id) + " (cannot lose points) \n -> Current Parasite Mob Cap: " + (SRPConfig.worldMobCap + (players *= SRPConfig.worldMobCapPlusPlayer)) + " \n -> Number of current parasites: " + count));
                return;
            }
            if (argString[0].equals("evolutionlock_reset")) {
                SRPSaveData data = SRPSaveData.get(world);
                data.resetLock();
                sender.sendMessage((ITextComponent)new TextComponentString("The list has been reset"));
                return;
            }
            if (argString[0].equals("evolutionlock_getlist")) {
                SRPSaveData data = SRPSaveData.get(world);
                ArrayList<Integer> nodesX = data.getLockedList();
                String out = "Current list: ";
                for (int i = 0; i < nodesX.size(); ++i) {
                    out = out + "" + nodesX.get(i) + " ";
                }
                sender.sendMessage((ITextComponent)new TextComponentString(out));
                return;
            }
            if (argString[0].equals("addpoints")) {
                try {
                    String nani = argString[1];
                    int nodesX = Integer.parseInt(nani);
                }
                catch (NumberFormatException nfe) {
                    sender.sendMessage((ITextComponent)new TextComponentString("Invalid arg"));
                    return;
                }
                SRPSaveData data = SRPSaveData.get(world);
                int id = world.provider.getDimension();
                if (data.getEvolutionPhase(id) == -2) {
                    sender.sendMessage((ITextComponent)new TextComponentString("Current phase -2, cannot add points"));
                    return;
                }
                if (!data.getCanGain(id)) {
                    sender.sendMessage((ITextComponent)new TextComponentString("Current dimension cannot gain points"));
                    return;
                }
                String nani = argString[1];
                int option = Integer.parseInt(nani);
                if (data.getCanLoss(id) && option < 0) {
                    sender.sendMessage((ITextComponent)new TextComponentString("Current dimension cannot lose points"));
                    return;
                }
                if (data.getCooldown(world, id) != 0) {
                    sender.sendMessage((ITextComponent)new TextComponentString("Current phase is in cooldown, cannot add/remove points"));
                    return;
                }
                data.setTotalKills(world.provider.getDimension(), option, true, world, true);
                String po = Math.abs(option) > 1 ? " points" : " point";
                sender.sendMessage((ITextComponent)new TextComponentString("Added " + option + po));
                return;
            }
            if (argString[0].equals("setcooldown")) {
                String nani;
                try {
                    nani = argString[1];
                    int id = Integer.parseInt(nani);
                }
                catch (NumberFormatException nfe) {
                    sender.sendMessage((ITextComponent)new TextComponentString("Invalid arg"));
                    return;
                }
                nani = argString[1];
                int option = Integer.parseInt(nani);
                if (option < 0) {
                    sender.sendMessage((ITextComponent)new TextComponentString("Cooldown value must be positive or 0"));
                    return;
                }
                SRPSaveData data = SRPSaveData.get(world);
                sender.sendMessage((ITextComponent)new TextComponentString("The cooldown was set to " + option + " second(s)"));
                data.setCooldown(option, world, world.provider.getDimension());
                return;
            }
            if (argString[0].equals("setphase")) {
                int option;
                String nani;
                try {
                    nani = argString[1];
                    option = Integer.parseInt(nani);
                }
                catch (NumberFormatException nfe) {
                    sender.sendMessage((ITextComponent)new TextComponentString("Invalid arg"));
                    return;
                }
                nani = argString[1];
                option = Integer.parseInt(nani);
                SRPSaveData data = SRPSaveData.get(world);
                if (option >= 11) {
                    sender.sendMessage((ITextComponent)new TextComponentString("Invalid argument: phase too high"));
                    return;
                }
                if (option <= -3) {
                    sender.sendMessage((ITextComponent)new TextComponentString("Invalid argument: phase too low"));
                    return;
                }
                if (option == -1) {
                    data.setEvolutionPhase(world.provider.getDimension(), (byte)option, true, world, true);
                    data.setTotalKills(world.provider.getDimension(), 100 * option, false, world, true);
                } else if (option == -2) {
                    data.setTotalKills(world.provider.getDimension(), 100 * option, false, world, true);
                    data.setEvolutionPhase(world.provider.getDimension(), (byte)option, true, world, true);
                } else {
                    data.setEvolutionPhase(world.provider.getDimension(), (byte)option, true, world, true);
                }
                sender.sendMessage((ITextComponent)new TextComponentString("Changed Evolution Phase for Parasites to " + argString[1]));
                return;
            }
            sender.sendMessage((ITextComponent)new TextComponentString("Invalid command"));
        }
    }

    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return sender.canUseCommand(2, this.getName());
    }

    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos targetPos) {
        for (int i = 0; i < args.length; ++i) {
        }
        ArrayList<String> atm = new ArrayList<String>();
        atm.add("evolutionlock_reset");
        atm.add("evolutionlock_getlist");
        atm.add("toggle_evolutiongaining");
        atm.add("toggle_evolutionloss");
        atm.add("addpoints");
        atm.add("setcooldown");
        atm.add("getphase");
        atm.add("setphase");
        return atm;
    }

    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    public static int getNeededPoints(byte in) {
        switch (in) {
            case 1: {
                return SRPConfigSystems.phaseKillsOne;
            }
            case 2: {
                return SRPConfigSystems.phaseKillsTwo;
            }
            case 3: {
                return SRPConfigSystems.phaseKillsThree;
            }
            case 4: {
                return SRPConfigSystems.phaseKillsFour;
            }
            case 5: {
                return SRPConfigSystems.phaseKillsFive;
            }
            case 6: {
                return SRPConfigSystems.phaseKillsSix;
            }
            case 7: {
                return SRPConfigSystems.phaseKillsSeven;
            }
            case 8: {
                return SRPConfigSystems.phaseKillsEight;
            }
            case 9: {
                return SRPConfigSystems.phaseKillsNine;
            }
            case 10: {
                return SRPConfigSystems.phaseKillsTen;
            }
        }
        return 0;
    }
}

