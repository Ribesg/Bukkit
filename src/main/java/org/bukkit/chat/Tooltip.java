package org.bukkit.chat;

public abstract class Tooltip {

    protected enum Type {
        SHOW_TEXT,
        SHOW_ACHIEVEMENT,
        SHOW_ITEM,
    }

    protected final Type type;

    protected Tooltip(Type type) {
        this.type = type;
    }
}
