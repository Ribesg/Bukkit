package org.bukkit.chat;

import org.bukkit.inventory.ItemStack;

// TODO Javadoc
public class ItemMessagePart implements RichMessagePart {

    private final ItemStack item;

    public ItemMessagePart(ItemStack item) {
        this.item = item;
    }

    @Override
    public Type getType() {
        return Type.ITEM;
    }

    public ItemStack getItem() {
        return item;
    }
}
