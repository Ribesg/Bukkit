package org.bukkit.chat;

public class TextTooltip extends Tooltip {

    private final String text;

    public TextTooltip(String text) {
        super(Type.SHOW_TEXT);
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
