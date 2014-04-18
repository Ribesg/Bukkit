package org.bukkit.chat;

/**
 * Represents a part of a RichMessage.
 */
public interface RichMessagePart {

    /**
     * Types of RichMessagePart
     */
    public enum Type {

        /**
         * Show an Achievement as a tooltip
         */
        ACHIEVEMENT,

        /**
         * Show an ItemStack as a tooltip
         */
        ITEM,

        /**
         * Customizable text-based RichMessagePart
         */
        CUSTOM,
    }

    /**
     * Gets this RichMessagePart's type.
     *
     * @return this RichMessagePart's type
     */
    public Type getType();
}
