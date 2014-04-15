package org.bukkit.chat;

// TODO Add subclasses
// TODO find better API names for those internals Enums, closer to their behaviours
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
