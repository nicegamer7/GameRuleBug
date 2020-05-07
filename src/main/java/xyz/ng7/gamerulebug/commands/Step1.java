package xyz.ng7.gamerulebug.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Step1 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            World world = Bukkit.getWorld("world");
            world.setGameRule(GameRule.DO_IMMEDIATE_RESPAWN, true);
            return true;
        }

        return false;
    }
}
