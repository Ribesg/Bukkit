package org.bukkit.chat;

import org.bukkit.ChatColor;

/**
 * Represents an "extra" for a RichMessage
 */
public class RichMessagePart extends RichMessage {

    private final RichMessage parent;

    public RichMessagePart(RichMessage parent) {
        this.parent = parent;
    }

    public RichMessagePart(RichMessage parent, String text) {
        super(text);
        this.parent = parent;
    }

    public RichMessagePart(RichMessage parent, ClickHook actionOnClick, Tooltip tooltip, String text, ChatColor... modifiers) {
        super(actionOnClick, tooltip, text, modifiers);
        this.parent = parent;
    }

    public RichMessage getParent() {
        return parent;
    }
}
