package org.bukkit.chat;

// TODO Javadoc
public abstract class Tooltip {

    protected enum Type {
        SHOW_ACHIEVEMENT,
        SHOW_ENTITY,
        SHOW_ITEM,
        SHOW_TEXT,
    }

    protected final Type type;

    protected Tooltip(Type type) {
        this.type = type;
    }
}
