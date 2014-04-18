package org.bukkit.chat;

// TODO Javadoc
public class SuggestChatAction extends ClickAction {

    private final String text;

    public SuggestChatAction(String text) {
        super(Type.SUGGEST_CHAT);
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
