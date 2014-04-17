package org.bukkit.chat;

/**
 * Represents a part of a RichMessage
 */
public class RichMessagePart {

    private String text;
    private ClickAction clickAction;
    private Tooltip tooltip;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
