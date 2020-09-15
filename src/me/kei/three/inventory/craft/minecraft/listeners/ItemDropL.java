package me.kei.three.inventory.craft.minecraft.listeners;

import me.kei.three.inventory.craft.minecraft.ThreeSizeInventoryCraft;
import me.kei.three.inventory.craft.minecraft.item.Item;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class ItemDropL implements Listener {
    public ItemDropL(ThreeSizeInventoryCraft threeSizeInventoryCraft) {
    }

    @EventHandler
    public void on(PlayerDropItemEvent e){
        if(e.getPlayer().getGameMode() == GameMode.CREATIVE) return;
        if(e.getItemDrop().getItemStack().isSimilar(Item.lockItem)) e.setCancelled(true);
    }
}
