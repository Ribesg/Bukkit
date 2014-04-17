package org.bukkit.chat;

// TODO Javadoc
public class TextHoverAction extends HoverAction {

    private final String text;

    public TextHoverAction(String text) {
        super(Type.SHOW_TEXT);
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
