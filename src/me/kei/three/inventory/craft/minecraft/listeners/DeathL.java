package me.kei.three.inventory.craft.minecraft.listeners;

import me.kei.three.inventory.craft.minecraft.ThreeSizeInventoryCraft;
import me.kei.three.inventory.craft.minecraft.item.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class DeathL implements Listener {

    ThreeSizeInventoryCraft plugin;

    public DeathL(ThreeSizeInventoryCraft threeSizeInventoryCraft) {
        this.plugin = threeSizeInventoryCraft;
    }

    @EventHandler
    public void on(PlayerDeathEvent e){
        if(!e.getKeepInventory()){ // keep inventory is false
            e.getDrops().removeIf(i -> i.isSimilar(Item.lockItem));
        }
    }

}
