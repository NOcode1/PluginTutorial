package me.oppy.myfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable() {
		getLogger().info("My first plugin has been enabled.");
	}
	public void onDisable() {
		getLogger().info("My first plugin has been disabled.");
	}
}
