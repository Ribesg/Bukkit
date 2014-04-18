package org.bukkit.chat;

/**
 * The chat action will send the specified chat message or command to the
 * server, when clicked client side.
 */
public class ChatAction extends ClickAction {

    private final String text;

    /**
     * Builds a new ChatAction, which will send the given text to the server,
     * when clicked client side.
     * 
     * @param text The text that should be send to the server.
     */
    public ChatAction(String text) {
        super(Type.CHAT);
        this.text = text;
    }

    /**
     * Gets the text that is send to the server, when clicked client side.
     * 
     * @return the text send to the server
     */
    public String getText() {
        return text;
    }
}
