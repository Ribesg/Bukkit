package org.bukkit.chat;

/**
 * Represents a customizable part of a RichMessage
 */
public class CustomMessagePart implements RichMessagePart {

    private String text;
    private ClickAction clickAction;
    private String[] tooltipLines;

    /**
     * Builds a text-only CustomMessagePart.
     * <p>
     * Note that the text can contain {@link org.bukkit.ChatColor} codes.
     *
     * @param text the text of this RichMessage
     */
    public CustomMessagePart(String text) {
        this(text, null);
    }

    /**
     * Builds any CustomMessagePart.
     * <p>
     * Note that the text can contain {@link org.bukkit.ChatColor} codes.
     *
     * @param text         the text of this RichMessage
     * @param clickAction  the action executed when the player click on
     *                     this RichMessage
     * @param tooltipLines the text lines shown when the player hover on
     *                     this RichMessage
     */
    public CustomMessagePart(String text, ClickAction clickAction, String... tooltipLines) {
        this.text = text;
        this.clickAction = clickAction;
        this.tooltipLines = tooltipLines;
    }

    @Override
    public Type getType() {
        return Type.CUSTOM;
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

    public String[] getTooltipLines() {
        return tooltipLines;
    }

    public void setTooltipLines(String[] tooltipLines) {
        this.tooltipLines = tooltipLines;
    }
}
