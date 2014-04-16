package org.bukkit.chat;

import org.apache.commons.lang.Validate;
import org.bukkit.ChatColor;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents a RichMessage.
 * <p>
 * Basically whatever can be sent using the Vanilla /tellraw command
 */
// TODO Add translation stuff
// TODO Add score stuff
public class RichMessage {

    private final List<RichMessage> extra;

    private String text;
    private ChatColor color;
    private boolean bold;
    private boolean italic;
    private boolean magic;
    private boolean strikedThrough;
    private boolean underlined;
    private ClickAction clickAction;
    private Tooltip tooltip;

    /**
     * Builds an empty RichMessage.
     */
    public RichMessage() {
        this(null, null, null);
    }

    /**
     * Builds a text-only RichMessage.
     *
     * @param text the text of this RichMessage
     */
    public RichMessage(String text) {
        this(null, null, text);
    }

    /**
     * Builds any RichMessage.
     * <p>
     * For format modifiers, note that only the last color provided is taken
     * into account and that {@link ChatColor#RESET} is not supported.
     *
     * @param clickAction the action executed when the player click on
     *                    this RichMessage
     * @param tooltip     the tooltip shown when the player hover on
     *                    this RichMessage
     * @param text        the text of this RichMessage
     * @param modifiers   format modifiers for this RichMessage
     */
    public RichMessage(ClickAction clickAction, Tooltip tooltip, String text, ChatColor... modifiers) {
        this.text = text;
        this.clickAction = clickAction;
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
        this.extra = new LinkedList<RichMessage>();
    }

    public RichMessage append(String text) {
        Validate.notNull(text, "You can't append a null String to a RichMessage");
        this.extra.add(new RichMessage(text));
        return this;
    }

    public RichMessage append(RichMessage part) {
        Validate.notNull(part, "A rich message part can't be null");
        this.extra.add(part);
        return this;
    }

    public RichMessage insert(int index, String text) {
        Validate.notNull(text, "You can't insert a null String into a RichMessage");
        this.extra.add(index, new RichMessage(text));
        return this;
    }

    public RichMessage insert(int index, RichMessage part) {
        Validate.notNull(part, "A rich message part can't be null");
        this.extra.add(index, part);
        return this;
    }

    /**
     * Checks if this RichMessage can be represented as a simple String
     * or if it needs to be converted into a Json element.
     *
     * @return true if this RichMessage can be represented as a simple
     * String, false otherwise
     */
    public boolean isSimpleText() {
        return color == null && !bold && !underlined && !italic && !strikedThrough &&
                !magic && clickAction == null && tooltip == null;
    }

    public boolean isValid() {
        return !(text == null /* TODO && score is null && translate is null */);
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
        if (color == null || color.ordinal() <= ChatColor.WHITE.ordinal()) {
            this.color = color;
        } else {
            throw new IllegalArgumentException(color + " isn't supported here");
        }
    }

}
