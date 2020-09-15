package me.kei.three.inventory.craft.minecraft;

import me.kei.three.inventory.craft.minecraft.item.Item;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class ItemTask extends BukkitRunnable {
    ThreeSizeInventoryCraft plugin;
    public ItemTask(ThreeSizeInventoryCraft threeSizeInventoryCraft) {
        this.plugin = threeSizeInventoryCraft;
    }

    @Override
    public void run() {
        for(Player p : Bukkit.getOnlinePlayers()){
            if(p.getGameMode() != GameMode.CREATIVE) {
                for(int i : plugin.getConfig().getIntegerList("slot")){
                    p.getInventory().setItem(i, Item.lockItem);
                }
            }
        }
    }
}
