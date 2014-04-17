package org.bukkit.chat;

import org.bukkit.inventory.ItemStack;

// TODO Javadoc
public class ItemTooltip extends Tooltip {

    private final ItemStack item;

    public ItemTooltip(ItemStack item) {
        super(Type.SHOW_ITEM);
        this.item = item;
    }

    public ItemStack getItemStack() {
        return this.item;
    }
}
