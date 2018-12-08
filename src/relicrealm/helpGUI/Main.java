package relicrealm.helpGUI;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable(){
        this.getCommand("helpGUI").setExecutor(new helpCommand());
        getServer().getPluginManager().registerEvents(new helpListener(),this);
    }
    @Override
    public void onDisable(){

    }
}
