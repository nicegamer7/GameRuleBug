package xyz.ng7.gamerulebug;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.ng7.gamerulebug.commands.Step1;
import xyz.ng7.gamerulebug.commands.Step2;
import xyz.ng7.gamerulebug.commands.Step3;
import xyz.ng7.gamerulebug.commands.Step4;

public class GameRuleBug extends JavaPlugin {
    @Override
    public void onEnable() {
        super.onEnable();
        this.getCommand("step1").setExecutor(new Step1());
        this.getCommand("step2").setExecutor(new Step2());
        this.getCommand("step3").setExecutor(new Step3());
        this.getCommand("step4").setExecutor(new Step4());
    }
}
