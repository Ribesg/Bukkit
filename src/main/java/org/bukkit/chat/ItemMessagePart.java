package org.bukkit.chat;

import org.bukkit.inventory.ItemStack;

/**
 * Represents a part of a {@link RichMessage} that shows an {@link ItemStack} as
 * tooltip when the player hover the text of this {@link RichMessagePart}.
 * <p>
 * Note that the tooltip is fixed to the {@link ItemStack} and cannot be altered
 * independently.
 */
public class ItemMessagePart extends RichMessagePart {

    private final ItemStack item;

    /**
     * Builds an ItemMessagePart with an {@link ItemStack} and the ItemStack's
     * name for text.
     * 
     * @param item the {@link ItemStack} that should be displayed
     */
    public ItemMessagePart(ItemStack item) {
        this(item, (String) null);
    }

    /**
     * Builds an ItemMessagePart with an {@link ItemStack} and the provided
     * text.
     * <p>
     * Note that the text can contain {@link org.bukkit.ChatColor} codes.
     * 
     * @param item the {@link ItemStack} that should be displayed
     * @param customText the text of this {@link RichMessagePart}
     */
    public ItemMessagePart(ItemStack item, String customText) {
        super(Type.ITEM, customText);
        this.item = item;
    }

    /**
     * Builds an ItemMessagePart with an {@link ItemStack}, the provided text
     * and a {@link ClickAction}.
     * <p>
     * Note that the text can contain {@link org.bukkit.ChatColor} codes.
     * 
     * @param item the {@link ItemStack} that should be displayed
     * @param customText the text of this {@link RichMessagePart}
     * @param clickAction the action executed when the player click on this
     *        {@link RichMessagePart}
     */
    public ItemMessagePart(ItemStack item, String customText, ClickAction clickAction) {
        super(Type.ITEM, customText, clickAction);
        this.item = item;
    }

    /**
     * Builds an ItemMessagePart with an {@link ItemStack} and the provided
     * localized text.
     * 
     * @param item the {@link ItemStack} that should be displayed
     * @param customText the localized text of this {@link RichMessagePart}
     */
    public ItemMessagePart(ItemStack item, LocalizedString customText) {
        super(Type.ITEM, customText);
        this.item = item;
    }

    /**
     * Builds an ItemMessagePart with an {@link ItemStack}, the provided
     * localized text and a {@link ClickAction}.
     * 
     * @param item the {@link ItemStack} that should be displayed
     * @param customText the localized text of this {@link RichMessagePart}
     * @param clickAction the action executed when the player click on this
     *        {@link RichMessagePart}
     */
    public ItemMessagePart(ItemStack item, LocalizedString customText, ClickAction clickAction) {
        super(Type.ITEM, customText, clickAction);
        this.item = item;
    }

    /**
     * Gets the item for this ItemStackPart.
     * <p>
     * Note that editing the item will directly affect this RichMessagePart, but
     * it will not affect any message already send to the client.
     * 
     * @return the item for this ItemStackPart
     */
    public ItemStack getItem() {
        return item;
    }
}
