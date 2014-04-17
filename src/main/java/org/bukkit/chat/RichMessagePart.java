package org.bukkit.chat;

// TODO Javadoc
public interface RichMessagePart {

    public enum Type {
        ACHIEVEMENT,
        ITEM,
        CUSTOM,
    }

    public Type getType();
}
