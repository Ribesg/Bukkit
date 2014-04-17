package org.bukkit.chat;

// TODO Javadoc
public class ChatAction extends ClickAction {

    private final String text;

    public ChatAction(String text) {
        super(Type.RUN_COMMAND);
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
