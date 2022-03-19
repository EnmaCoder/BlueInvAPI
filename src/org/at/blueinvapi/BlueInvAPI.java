package org.at.blueinvapi;

import java.util.List;

import org.at.blueinvapi.listener.InventoryListener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class BlueInvAPI extends JavaPlugin {
	
	public static Plugin plugin;
	
	@Override
	public void onEnable(){
		plugin = this;
		plugin.getServer().getPluginManager().registerEvents(new InventoryListener(), plugin);
		System.out.println(ChatColor.BLUE + "------------------------------");
		System.out.println(ChatColor.YELLOW + "Name: BlueInvAPI");
		System.out.println(ChatColor.YELLOW + "Developers: EnmaCoder," + ChatColor.RED + "BlueNatural [Author]");
		System.out.println(ChatColor.YELLOW + "Version:" + getDescription().getVersion());
		System.out.println(ChatColor.YELLOW + "Supported Versions: 1.12, 1.14");
		System.out.println(ChatColor.YELLOW + "Website: " + getDescription().getWebsite());
		System.out.println(ChatColor.YELLOW + "[System] All information can be found in GitHub you can go that to find the help !");
		System.out.println(ChatColor.BLUE + "------------------------------");

	
	}



}
