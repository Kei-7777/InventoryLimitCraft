package me.kei.three.inventory.craft.minecraft.listeners;

import me.kei.three.inventory.craft.minecraft.ThreeSizeInventoryCraft;
import me.kei.three.inventory.craft.minecraft.item.Item;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickL implements Listener {
    public InventoryClickL(ThreeSizeInventoryCraft threeSizeInventoryCraft) {
    }

    @EventHandler
    public void on(InventoryClickEvent e){
        if(e.getWhoClicked().getGameMode() == GameMode.CREATIVE) return;
        if(e.getClickedInventory() == null) return;
        try {
            if(e.getSlot() == 40) e.setCancelled(true);
            if (e.getCurrentItem().isSimilar(Item.lockItem)) {
                e.setCancelled(true);
            }
        } catch (NullPointerException exp){
            return;
        }
    }
}
