package relicrealm.helpGUI;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class helpCommand implements CommandExecutor {
    private helpGUI helpgui = new helpGUI();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
    if(sender instanceof Player){
        Player player = (Player)sender;
        player.openInventory(helpgui.getInventory());
    }
    return true;
    }
}
