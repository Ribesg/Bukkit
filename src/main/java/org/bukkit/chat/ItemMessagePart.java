package org.bukkit.chat;

import org.bukkit.inventory.ItemStack;

/**
 * Represents a part of a RichMessagePart that shows an ItemStack.
 */
public class ItemMessagePart extends RichMessagePart {

    private final ItemStack item;

    /**
     * Builds an ItemMessagePart with an ItemStack and
     * the ItemStack's name for text.
     *
     * @param item an ItemStack
     */
    public ItemMessagePart(ItemStack item) {
        this(item, (String) null);
    }

    /**
     * Builds an ItemMessagePart with an ItemStack and the provided text.
     *
     * @param item an ItemStack
     */
    public ItemMessagePart(ItemStack item, String customText) {
        super(Type.ITEM, customText);
        this.item = item;
    }

    /**
     * Builds an ItemMessagePart with an ItemStack, the provided text and
     * a ClickAction.
     *
     * @param item an ItemStack
     */
    public ItemMessagePart(ItemStack item, String customText, ClickAction clickAction) {
        super(Type.ITEM, customText, clickAction);
        this.item = item;
    }

    /**
     * Builds an ItemMessagePart with an ItemStack and the provided localized
     * text.
     *
     * @param item an ItemStack
     */
    public ItemMessagePart(ItemStack item, LocalizedString customText) {
        super(Type.ITEM, customText);
        this.item = item;
    }

    /**
     * Builds an ItemMessagePart with an ItemStack, the provided localized
     * text and a ClickAction.
     *
     * @param item an ItemStack
     */
    public ItemMessagePart(ItemStack item, LocalizedString customText, ClickAction clickAction) {
        super(Type.ITEM, customText, clickAction);
        this.item = item;
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
