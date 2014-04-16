package org.bukkit.chat;

public abstract class ClickAction {

    protected enum Type {
        OPEN_URL,
        RUN_COMMAND,
        SUGGEST_COMMAND,
    }

    protected final Type type;

    protected ClickAction(Type type) {
        this.type = type;
    }
}
