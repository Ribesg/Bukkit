package org.bukkit.chat;

/**
 * Represents a part of a RichMessage.
 */
public abstract class RichMessagePart {

    /**
     * Types of RichMessagePart
     */
    public enum Type {

        /**
         * Show an Achievement as a tooltip
         */
        ACHIEVEMENT,

        /**
         * Show an ItemStack as a tooltip
         */
        ITEM,

        /**
         * Customizable text-based RichMessagePart
         */
        CUSTOM,
    }

    private final Type type;
    private String text;
    private LocalizedString localizedtext;
    private ClickAction clickAction;

    /**
     * Builds a RichMessagePart with a simple text.
     *
     * @param type the type of this RichMessagePart
     * @param text the text of this RichMessagePart
     */
    protected RichMessagePart(Type type, String text) {
        this.type = type;
        this.text = text;
        this.localizedtext = null;
        this.clickAction = null;
    }

    /**
     * Builds a RichMessagePart with a localized text.
     *
     * @param type          the type of this RichMessagePart
     * @param localizedText the localized text of this RichMessagePart
     */
    protected RichMessagePart(Type type, LocalizedString localizedText) {
        this.type = type;
        this.text = null;
        this.localizedtext = localizedText;
        this.clickAction = null;
    }

    /**
     * Builds a RichMessagePart with a simple text and a click action.
     *
     * @param type        the type of this RichMessagePart
     * @param text        the text of this RichMessagePart
     * @param clickAction the clickAction of this RichMessagePart
     */
    protected RichMessagePart(Type type, String text, ClickAction clickAction) {
        this.type = type;
        this.text = text;
        this.localizedtext = null;
        this.clickAction = clickAction;
    }

    /**
     * Builds a RichMessagePart with a localized text and a click action.
     *
     * @param type          the type of this RichMessagePart
     * @param localizedText the localized text of this RichMessagePart
     * @param clickAction   the clickAction of this RichMessagePart
     */
    protected RichMessagePart(Type type, LocalizedString localizedText, ClickAction clickAction) {
        this.type = type;
        this.text = null;
        this.localizedtext = localizedText;
        this.clickAction = clickAction;
    }

    /**
     * Gets this RichMessagePart's type.
     *
     * @return this RichMessagePart's type
     */
    public Type getType() {
        return this.type;
    }

    /**
     * Gets this RichMessagePart's text.
     *
     * @return this RichMessagePart's text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets this RichMessagePart's text.
     *
     * @param text this RichMessagePart's new text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Gets this RichMessagePart's localized text.
     * <p>
     * Note that this will only be used if this RichMessagePart's text
     * is null.
     *
     * @return this RichMessagePart's localized text
     */
    public LocalizedString getLocalizedtext() {
        return localizedtext;
    }

    /**
     * Sets this RichMessagePart's localized text.
     * <p>
     * Note that this will only be used if this RichMessagePart's text
     * is null.
     *
     * @param localizedtext this RichMessagePart's localized text
     */
    public void setLocalizedtext(LocalizedString localizedtext) {
        this.localizedtext = localizedtext;
    }

    /**
     * Gets this RichMessagePart's click action.
     *
     * @return this RichMessagePart's click action
     */
    public ClickAction getClickAction() {
        return clickAction;
    }

    /**
     * Sets this RichMessagePart's click action.
     *
     * @param clickAction this RichMessagePart's new click action
     */
    public void setClickAction(ClickAction clickAction) {
        this.clickAction = clickAction;
    }
}
