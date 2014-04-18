package org.bukkit.chat;

/**
 * The click action represents an action triggered client side by clicking the
 * particular part in the {@link RichMessage}. The type of action triggered by
 * this is specified by {@link Type}.
 * <p>
 * <b>Note:</b> Instead of extending this class you should use the ready to use
 * click action classes provided by Bukkit. Any feature that is not (yet)
 * covered by these classes cannot be used client side.
 */
public abstract class ClickAction {

    /**
     * The supported types of click actions.
     */
    public enum Type {
        /**
         * Open an URL on click.
         */
        OPEN_URL,
        /**
         * Run/Send a command/chat message on click.
         */
        CHAT,
        /**
         * Type a command/chat message to the chat input on click, but does not
         * send it to the server..
         */
        SUGGEST_CHAT,
    }

    protected final Type type;

    protected ClickAction(Type type) {
        this.type = type;
    }

    /**
     * Gets this {@link ClickAction}'s {@link Type}.
     * 
     * @return this ClickAction type
     */
    public Type getType() {
        return type;
    }
}
