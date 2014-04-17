package org.bukkit.chat;

// TODO Javadoc
public abstract class HoverAction {

    public enum Type {
        SHOW_ACHIEVEMENT,
        SHOW_ITEM,
        SHOW_TEXT,
    }

    protected final Type type;

    protected HoverAction(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
