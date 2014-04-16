package org.bukkit.chat;

// TODO Find a better name for this
public class SuggestCmdHook extends ClickHook {

    private final String text;

    public SuggestCmdHook(String text) {
        super(Type.SUGGEST_COMMAND);
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
