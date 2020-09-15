package me.kei.three.inventory.craft.minecraft.listeners;

import me.kei.three.inventory.craft.minecraft.ThreeSizeInventoryCraft;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

public class ItemSwapL implements Listener {
    public ItemSwapL(ThreeSizeInventoryCraft threeSizeInventoryCraft) {
    }

    @EventHandler
    public void on(PlayerSwapHandItemsEvent e){
        if(e.getPlayer().getGameMode() != GameMode.CREATIVE) e.setCancelled(true);
    }
}
