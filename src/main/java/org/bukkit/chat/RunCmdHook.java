package org.bukkit.chat;

// TODO Find a better name for this
public class RunCmdHook extends ClickHook {

    private final String text;

    public RunCmdHook(String text) {
        super(Type.RUN_COMMAND);
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
