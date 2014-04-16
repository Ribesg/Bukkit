package org.bukkit.chat;

// TODO Find a better name for this
public abstract class ClickHook {

    protected enum Type {
        OPEN_URL,
        RUN_COMMAND,
        SUGGEST_COMMAND,
    }

    protected final Type type;

    protected ClickHook(Type type) {
        this.type = type;
    }
}
