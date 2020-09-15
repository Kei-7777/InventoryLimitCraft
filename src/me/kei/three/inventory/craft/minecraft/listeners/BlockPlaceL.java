package me.kei.three.inventory.craft.minecraft.listeners;

import me.kei.three.inventory.craft.minecraft.ThreeSizeInventoryCraft;
import me.kei.three.inventory.craft.minecraft.item.Item;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlaceL implements Listener {
    public BlockPlaceL(ThreeSizeInventoryCraft threeSizeInventoryCraft) {
    }

    @EventHandler
    public void on(BlockPlaceEvent e){
        if(e.getPlayer().getGameMode() != GameMode.CREATIVE && e.getItemInHand().isSimilar(Item.lockItem)) e.setCancelled(true);
    }
}
