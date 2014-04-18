package org.bukkit.chat;

// TODO Javadoc
public abstract class ClickAction {

    public enum Type {
        OPEN_URL,
        CHAT,
        SUGGEST_CHAT,
    }

    protected final Type type;

    protected ClickAction(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
