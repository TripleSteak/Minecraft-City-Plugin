package me.triplesteak.utilities;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerUtilities extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	@EventHandler
	public void onEvent(BlockFadeEvent event) {
		if (event.getBlock().getType() == Material.SNOW)
			event.setCancelled(true);
	}
	
	@EventHandler
	public void onEvent(EntityExplodeEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void onEvent(LeavesDecayEvent event) {
		event.setCancelled(true);
	}
}
