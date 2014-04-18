package org.bukkit.chat;

/**
 * Represents a customizable part of a RichMessage
 */
public class CustomMessagePart extends RichMessagePart {

    private String[] tooltipLines;

    /**
     * Builds a CustomMessagePart from a text.
     * <p>
     * Note that the text can contain {@link org.bukkit.ChatColor} codes.
     *
     * @param text the text of this RichMessage
     */
    public CustomMessagePart(String text) {
        this(text, null);
    }

    /**
     * Builds a CustomMessagePart from a text and a tooltip.
     * <p>
     * Note that the text can contain {@link org.bukkit.ChatColor} codes.
     *
     * @param text         the text of this RichMessage
     * @param tooltipLines the text lines shown when the player hover on
     *                     this RichMessage
     */
    public CustomMessagePart(String text, String... tooltipLines) {
        super(Type.CUSTOM, text);
        this.tooltipLines = tooltipLines;
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
        super(Type.CUSTOM, text, clickAction);
        this.tooltipLines = tooltipLines;
    }

    /**
     * Builds a CustomMessagePart from a localized String.
     *
     * @param localizedText the localized text of this RichMessage
     */
    public CustomMessagePart(LocalizedString localizedText) {
        this(localizedText, null);
    }

    /**
     * Builds a CustomMessagePart from a localized String and a tooltip.
     *
     * @param localizedText the localized text of this RichMessage
     * @param tooltipLines  the text lines shown when the player hover on
     *                      this RichMessage
     */
    public CustomMessagePart(LocalizedString localizedText, String... tooltipLines) {
        super(Type.CUSTOM, localizedText);
        this.tooltipLines = tooltipLines;
    }

    /**
     * Builds any CustomMessagePart.
     *
     * @param localizedText the localized text of this RichMessage
     * @param clickAction   the action executed when the player click on
     *                      this RichMessage
     * @param tooltipLines  the text lines shown when the player hover on
     *                      this RichMessage
     */
    public CustomMessagePart(LocalizedString localizedText, ClickAction clickAction, String... tooltipLines) {
        super(Type.CUSTOM, localizedText, clickAction);
        this.tooltipLines = tooltipLines;
    }

    /**
     * Gets this CustomMessagePart's tooltip.
     *
     * @return this CustomMessagePart's tooltip
     */
    public String[] getTooltipLines() {
        return tooltipLines;
    }

    /**
     * Sets this CustomMessagePart's tooltip.
     *
     * @param tooltipLines this CustomMessagePart's new tooltip
     */
    public void setTooltipLines(String[] tooltipLines) {
        this.tooltipLines = tooltipLines;
    }
}
