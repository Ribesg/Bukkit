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

    protected final List<RichMessagePart> extra;

    protected String text;
    protected ChatColor color;
    protected Boolean bold;
    protected Boolean italic;
    protected Boolean magic;
    protected Boolean strikedThrough;
    protected Boolean underlined;
    protected ClickAction clickAction;
    protected Tooltip tooltip;

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
        this.extra = new LinkedList<RichMessagePart>();
    }

    public RichMessage append(String text) {
        Validate.notNull(text, "You can't append a null String to a RichMessage");
        this.extra.add(new RichMessagePart(this, text));
        return this;
    }

    public RichMessage append(RichMessagePart part) {
        Validate.notNull(part, "A rich message part can't be null");
        Validate.isTrue(this == part.getParent(), "Attempt to add a RichMEssagePart with incorrect parent");
        this.extra.add(part);
        return this;
    }

    public RichMessage insert(int index, String text) {
        Validate.notNull(text, "You can't insert a null String into a RichMessage");
        this.extra.add(index, new RichMessagePart(this, text));
        return this;
    }

    public RichMessage insert(int index, RichMessagePart part) {
        Validate.notNull(part, "A rich message part can't be null");
        Validate.isTrue(this == part.getParent(), "Attempt to add a RichMEssagePart with incorrect parent");
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

    public List<RichMessagePart> getExtra() {
        return extra;
    }
}
