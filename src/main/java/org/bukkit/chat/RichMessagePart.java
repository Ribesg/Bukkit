package org.bukkit.chat;

import org.apache.commons.lang.Validate;
import org.bukkit.ChatColor;

// TODO Add translation stuff
public class RichMessagePart extends RichMessage {

    private RichMessageClickEvent clickEvent;
    private RichMessageHoverEvent hoverEvent;
    private ChatColor             color;
    private String                text;
    private boolean               bold;
    private boolean               underlined;
    private boolean               italic;
    private boolean               strikedThrough;
    private boolean               obfuscated;

    public RichMessagePart(String text) {
        this(null, null, null, text, false, false, false, false, false);
    }

    public RichMessagePart(RichMessageClickEvent clickEvent, RichMessageHoverEvent hoverEvent, ChatColor color, String text, boolean bold, boolean underlined, boolean italic, boolean strikedThrough, boolean obfuscated) {
        Validate.notNull(text, "Rich message text cann't be null");
        this.color = color;
        this.text = text;
        this.bold = bold;
        this.underlined = underlined;
        this.italic = italic;
        this.strikedThrough = strikedThrough;
        this.obfuscated = obfuscated;
        this.clickEvent = clickEvent;
        this.hoverEvent = hoverEvent;
    }

    /**
     * Used to know if the building needs a json advanced stuff or if a simple String is enough.
     */
    public boolean containsOnlyText() {
        return color == null && !bold && !underlined && !italic && !strikedThrough && !obfuscated && clickEvent == null && hoverEvent == null;
    }

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

    public boolean isObfuscated() {
        return obfuscated;
    }

    public void setObfuscated(boolean obfuscated) {
        this.obfuscated = obfuscated;
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
