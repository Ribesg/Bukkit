package org.bukkit.chat;

// TODO Javadoc
public abstract class Tooltip {

    public enum Type {
        SHOW_ACHIEVEMENT,
        SHOW_ITEM,
        SHOW_TEXT,
    }

    protected final Type type;

    protected Tooltip(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
