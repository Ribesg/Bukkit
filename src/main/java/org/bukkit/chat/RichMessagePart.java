package org.bukkit.chat;

import org.bukkit.ChatColor;

/**
 * Represents a part of a RichMessage
 */
public class RichMessagePart {

    private String text;
    private ChatColor color;
    private Boolean bold;
    private Boolean italic;
    private Boolean magic;
    private Boolean strikedThrough;
    private Boolean underlined;
    private ClickAction clickAction;
    private Tooltip tooltip;

    /**
     * Builds an empty RichMessagePart.
     */
    public RichMessagePart() {
        this(null, null, null);
    }

    /**
     * Builds a text-only RichMessage.
     * <p>
     * Note that the text can contain {@link org.bukkit.ChatColor} codes.
     *
     * @param text the text of this RichMessage
     */
    public RichMessagePart(String text) {
        this(text, null, null);
    }

    /**
     * Builds any RichMessagePart.
     * <p>
     * Note that the text can contain {@link org.bukkit.ChatColor} codes.
     *
     * @param text        the text of this RichMessage
     * @param clickAction the action executed when the player click on
     *                    this RichMessage
     * @param tooltip     the tooltip shown when the player hover on
     *                    this RichMessage
     */
    public RichMessagePart(String text, ClickAction clickAction, Tooltip tooltip) {
        this.text = text;
        this.clickAction = clickAction;
        this.tooltip = tooltip;
    }

    // TODO Simple Javadoc below this

    public Boolean isBold() {
        return bold;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public Boolean isUnderlined() {
        return underlined;
    }

    public void setUnderlined(Boolean underlined) {
        this.underlined = underlined;
    }

    public Boolean isItalic() {
        return italic;
    }

    public void setItalic(Boolean italic) {
        this.italic = italic;
    }

    public Boolean isStrikedThrough() {
        return strikedThrough;
    }

    public void setStrikedThrough(Boolean strikedThrough) {
        this.strikedThrough = strikedThrough;
    }

    public Boolean isMagic() {
        return magic;
    }

    public void setMagic(Boolean magic) {
        this.magic = magic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ChatColor getColor() {
        return color;
    }

    public void setColor(ChatColor color) {
        if (color == null || color.ordinal() <= ChatColor.WHITE.ordinal()) {
            this.color = color;
        } else {
            throw new IllegalArgumentException(color + " isn't supported here");
        }
    }

    public ClickAction getClickAction() {
        return clickAction;
    }

    public void setClickAction(ClickAction clickAction) {
        this.clickAction = clickAction;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }
}
