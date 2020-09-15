package me.kei.three.inventory.craft.minecraft.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Collections;

public class Item {

    public static ItemStack lockItem;

    public static void init(){
        lockItem = new ItemStack(Material.RED_STAINED_GLASS_PANE, 1);
        ItemMeta meta = lockItem.getItemMeta();
        meta.setDisplayName(ChatColor.RESET + "" + ChatColor.RED + "このインベントリスロットは使用できません。");
        lockItem.setItemMeta(meta);
    }

}
