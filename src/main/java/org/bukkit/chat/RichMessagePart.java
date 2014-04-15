package org.bukkit.chat;

import org.bukkit.ChatColor;

/**
 * Represents a part of a {@link org.bukkit.chat.RichMessage}.
 */
// TODO Add translation stuff
public class RichMessagePart {

    private String text;
    private ChatColor color;
    private boolean bold;
    private boolean italic;
    private boolean magic;
    private boolean strikedThrough;
    private boolean underlined;
    private ClickHook actionOnClick;
    private Tooltip tooltip;

    /**
     * Builds a text-only RichMessagePart.
     *
     * @param text the text of this RichMessagePart
     */
    public RichMessagePart(String text) {
        this(null, null, text);
    }

    /**
     * Builds any RichMessagePart.
     * <p/>
     * For format modifiers, note that only the last color provided is taken
     * into account and that {@link ChatColor#RESET} is not supported.
     *
     * @param actionOnClick the action executed when the player click on
     *                      this RichMessagePart
     * @param tooltip       the tooltip shown when the player hover on
     *                      this RichMessagePart
     * @param text          the text of this RichMessagePart
     * @param modifiers     format modifiers for this RichMessagePart
     */
    public RichMessagePart(ClickHook actionOnClick, Tooltip tooltip, String text, ChatColor... modifiers) {
        this.text = text;
        this.actionOnClick = actionOnClick;
        this.tooltip = tooltip;
        for (ChatColor modifier : modifiers) {
            switch (modifier) {
                case MAGIC:
                    this.magic = true;
                    break;
                case BOLD:
                    this.bold = true;
                    break;
                case STRIKETHROUGH:
                    this.strikedThrough = true;
                    break;
                case UNDERLINE:
                    this.underlined = true;
                    break;
                case ITALIC:
                    this.italic = true;
                    break;
                case RESET:
                    throw new IllegalArgumentException("RichMessages do not handle resetting formatting");
                default: // Color
                    this.color = modifier;
                    break;
            }
        }
    }

    /**
     * Checks if this RichMessagePart can be represented as a simple String
     * or if it needs to be converted into a Json element.
     *
     * @return true if this RichMessagePart can be represented as a simple
     * String, false otherwise
     */
    public boolean isSimpleText() {
        return color == null && !bold && !underlined && !italic && !strikedThrough &&
                !magic && actionOnClick == null && tooltip == null;
    }

    // TODO Simple Javadoc below this

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public boolean isUnderlined() {
        return underlined;
    }

    public void setUnderlined(boolean underlined) {
        this.underlined = underlined;
    }

    public boolean isItalic() {
        return italic;
    }

    public void setItalic(boolean italic) {
        this.italic = italic;
    }

    public boolean isStrikedThrough() {
        return strikedThrough;
    }

    public void setStrikedThrough(boolean strikedThrough) {
        this.strikedThrough = strikedThrough;
    }

    public boolean isMagic() {
        return magic;
    }

    public void setMagic(boolean magic) {
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
        this.color = color;
    }

}
