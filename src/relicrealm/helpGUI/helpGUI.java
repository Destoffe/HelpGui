package relicrealm.helpGUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class helpGUI {

    private Inventory inventory = Bukkit.createInventory(null,9, ChatColor.GOLD + "HelpGUI");

    public helpGUI() {
        //Faction item
        ItemStack faction = new ItemStack(Material.GOLDEN_SWORD);
        ItemMeta factionMeta = faction.getItemMeta();
        factionMeta.setDisplayName(ChatColor.GOLD + "Faction");
        factionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List lore = new ArrayList<>();
        lore.add(ChatColor.GOLD +"/f for general commands");
        factionMeta.setLore(lore);
        faction.setItemMeta(factionMeta);
        lore.clear();

        //McMMO item
        ItemStack mcMMO = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta mcMMOMeta = mcMMO.getItemMeta();
        mcMMOMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        mcMMOMeta.setDisplayName(ChatColor.YELLOW + "mcMMO");
        lore.add(ChatColor.YELLOW +"/mcmmo for general commands");
        mcMMOMeta.setLore(lore);
        mcMMO.setItemMeta(mcMMOMeta);
        lore.clear();

        //Warp item
        ItemStack warp = new ItemStack(Material.ENDER_EYE);
        ItemMeta warpMeta = warp.getItemMeta();
        warpMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        warpMeta.setDisplayName(ChatColor.BLUE + "Warp");
        lore.add(ChatColor.BLUE +"/warp too see all warps");
        warpMeta.setLore(lore);
        warp.setItemMeta(warpMeta);
        lore.clear();

        //Bountis item
        ItemStack bounties = new ItemStack(Material.PLAYER_HEAD);
        ItemMeta bountiesMeta = bounties.getItemMeta();
        warpMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        warpMeta.setDisplayName(ChatColor.RED + "Bounties");
        lore.add(ChatColor.RED +"/bounties to set bounties!");
        bountiesMeta.setLore(lore);
        bounties.setItemMeta(bountiesMeta);
        lore.clear();

        //Shop item
        ItemStack shop = new ItemStack(Material.APPLE);
        ItemMeta shopMeta = shop.getItemMeta();
        shopMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        shopMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Shop");
        lore.add(ChatColor.LIGHT_PURPLE +"Type /warp shop to go to the market!");
        shopMeta.setLore(lore);
        shop.setItemMeta(shopMeta);
        lore.clear();


        inventory.setItem(0,faction);
        inventory.setItem(1,mcMMO);
        inventory.setItem(2,warp);
        inventory.setItem(3,bounties);
    }


    public Inventory getInventory() {
        return inventory;
    }
}
