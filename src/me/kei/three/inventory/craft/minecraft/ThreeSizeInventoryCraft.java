package me.kei.three.inventory.craft.minecraft;

import me.kei.three.inventory.craft.minecraft.item.Item;
import me.kei.three.inventory.craft.minecraft.listeners.*;
import org.bukkit.plugin.java.JavaPlugin;

public class ThreeSizeInventoryCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        Item.init();

        this.getServer().getPluginManager().registerEvents(new DeathL(this), this);
        this.getServer().getPluginManager().registerEvents(new InventoryClickL(this), this);
        this.getServer().getPluginManager().registerEvents(new ItemDropL(this), this);
        this.getServer().getPluginManager().registerEvents(new ItemSwapL(this), this);
        this.getServer().getPluginManager().registerEvents(new BlockPlaceL(this), this);

        new ItemTask(this).runTaskTimer(this, 1, 1);
    }
}
