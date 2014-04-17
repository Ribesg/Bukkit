package org.bukkit.chat;

import org.bukkit.inventory.ItemStack;

// TODO Javadoc
public class ItemHoverAction extends HoverAction {

    private final ItemStack item;

    public ItemHoverAction(ItemStack item) {
        super(Type.SHOW_ITEM);
        this.item = item;
    }

    public ItemStack getItemStack() {
        return this.item;
    }
}
