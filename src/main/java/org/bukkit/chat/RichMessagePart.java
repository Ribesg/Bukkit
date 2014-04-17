package org.bukkit.chat;

/**
 * Represents a part of a RichMessage
 */
public class RichMessagePart {

    private String text;
    private ClickAction clickAction;
    private HoverAction hoverAction;

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
     * @param hoverAction the hoverAction executed when the player hover on
     *                    this RichMessage
     */
    public RichMessagePart(String text, ClickAction clickAction, HoverAction hoverAction) {
        this.text = text;
        this.clickAction = clickAction;
        this.hoverAction = hoverAction;
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

    public HoverAction getHoverAction() {
        return hoverAction;
    }

    public void setHoverAction(HoverAction hoverAction) {
        this.hoverAction = hoverAction;
    }
}
