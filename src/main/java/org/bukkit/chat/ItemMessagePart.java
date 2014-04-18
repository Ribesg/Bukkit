package org.bukkit.chat;

import org.bukkit.inventory.ItemStack;

/**
 * Represents a part of a RichMessage that shows an ItemStack.
 */
public class ItemMessagePart implements RichMessagePart {

    private final String text;
    private final ItemStack item;

    /**
     * Builds an ItemMessagePart with an ItemStack and
     * the ItemStack's name for text.
     *
     * @param item an ItemStack
     */
    public ItemMessagePart(ItemStack item) {
        this(null, item);
    }

    /**
     * Builds an ItemMessagePart with an ItemStack and
     * the the provided text.
     *
     * @param item an ItemStack
     */
    public ItemMessagePart(String text, ItemStack item) {
        this.text = text;
        this.item = item;
    }

    @Override
    public Type getType() {
        return Type.ITEM;
    }

    /**
     * Gets the text for this ItemStackPart.
     *
     * @return the text for this ItemStackPart
     */
    public String getText() {
        return text;
    }

    /**
     * Gets the item for this ItemStackPart.
     *
     * @return the item for this ItemStackPart
     */
    public ItemStack getItem() {
        return item;
    }
}
