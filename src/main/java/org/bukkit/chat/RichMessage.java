package org.bukkit.chat;

import org.apache.commons.lang.Validate;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents a RichMessage.
 * <p>
 * Basically whatever can be sent using the Vanilla /tellraw command
 */
// TODO Add translation stuff
// TODO Add score stuff
public class RichMessage {

    protected final List<RichMessagePart> parts = new LinkedList<RichMessagePart>();

    /**
     * Builds an empty RichMessage.
     */
    public RichMessage() {
    }

    /**
     * Builds a RichMessage with one part.
     *
     * @param firstPart the first part of this RichMessage
     */
    public RichMessage(RichMessagePart firstPart) {
        this.parts.add(firstPart);
    }

    /**
     * Builds a RichMessage with one part.
     * <p>
     * Provided arguments are passed to the RichMessagePart constructor
     * to create the first RichMessagePart.
     *
     * @param text        the text of this RichMessage
     * @param clickAction the action executed when the player click on
     *                    this RichMessage
     * @param tooltip     the tooltip shown when the player hover on
     *                    this RichMessage
     */
    public RichMessage(String text, ClickAction clickAction, Tooltip tooltip) {
        this(new RichMessagePart(text, clickAction, tooltip));
    }

    /**
     * Gets the parts of this RichMessage.
     *
     * @return the parts of this RichMessage
     */
    public List<RichMessagePart> getParts() {
        return this.parts;
    }

    // TODO Simple Javadoc below this

    public RichMessage append(RichMessagePart part) {
        Validate.notNull(part, "A rich message part can't be null");
        this.parts.add(part);
        return this;
    }

    public RichMessage append(String text) {
        this.parts.add(new RichMessagePart(text));
        return this;
    }

    public RichMessage append(String text, ClickAction clickAction) {
        this.parts.add(new RichMessagePart(text, clickAction, null));
        return this;
    }

    public RichMessage append(String text, Tooltip tooltip) {
        this.parts.add(new RichMessagePart(text, null, tooltip));
        return this;
    }

    public RichMessage append(String text, ClickAction clickAction, Tooltip tooltip) {
        this.parts.add(new RichMessagePart(text, clickAction, tooltip));
        return this;
    }

    public RichMessage insert(int index, RichMessagePart part) {
        Validate.notNull(part, "A rich message part can't be null");
        this.parts.add(index, part);
        return this;
    }

    public RichMessage insert(int index, String text) {
        this.parts.add(index, new RichMessagePart(text));
        return this;
    }

    public RichMessage insert(int index, String text, ClickAction clickAction) {
        this.parts.add(index, new RichMessagePart(text, clickAction, null));
        return this;
    }

    public RichMessage insert(int index, String text, Tooltip tooltip) {
        this.parts.add(index, new RichMessagePart(text, null, tooltip));
        return this;
    }

    public RichMessage insert(int index, String text, ClickAction clickAction, Tooltip tooltip) {
        this.parts.add(index, new RichMessagePart(text, clickAction, tooltip));
        return this;
    }
}
