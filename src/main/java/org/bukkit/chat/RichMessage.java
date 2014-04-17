package org.bukkit.chat;

import org.apache.commons.lang.Validate;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents a RichMessage.
 * <p>
 * Basically whatever can be sent using the Vanilla /tellraw command
 */
// TODO Add translation stuff
// TODO Add score stuff
// TODO Add shortcuts for non-custom RichMessageParts
public class RichMessage implements Iterable<RichMessagePart> {

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
     * Provided arguments are passed to the CustomMessagePart constructor
     * to create the first RichMessagePart.
     *
     * @param text        the text of this RichMessage
     * @param clickAction the action executed when the player click on
     *                    this RichMessage
     * @param hoverAction the hoverAction executed when the player hover on
     *                    this RichMessage
     */
    public RichMessage(String text, ClickAction clickAction, HoverAction hoverAction) {
        this(new CustomMessagePart(text, clickAction, hoverAction));
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
        this.parts.add(new CustomMessagePart(text));
        return this;
    }

    public RichMessage append(String text, ClickAction clickAction) {
        this.parts.add(new CustomMessagePart(text, clickAction, null));
        return this;
    }

    public RichMessage append(String text, HoverAction hoverAction) {
        this.parts.add(new CustomMessagePart(text, null, hoverAction));
        return this;
    }

    public RichMessage append(String text, ClickAction clickAction, HoverAction hoverAction) {
        this.parts.add(new CustomMessagePart(text, clickAction, hoverAction));
        return this;
    }

    public RichMessage insert(int index, RichMessagePart part) {
        Validate.notNull(part, "A rich message part can't be null");
        this.parts.add(index, part);
        return this;
    }

    public RichMessage insert(int index, String text) {
        this.parts.add(index, new CustomMessagePart(text));
        return this;
    }

    public RichMessage insert(int index, String text, ClickAction clickAction) {
        this.parts.add(index, new CustomMessagePart(text, clickAction, null));
        return this;
    }

    public RichMessage insert(int index, String text, HoverAction hoverAction) {
        this.parts.add(index, new CustomMessagePart(text, null, hoverAction));
        return this;
    }

    public RichMessage insert(int index, String text, ClickAction clickAction, HoverAction hoverAction) {
        this.parts.add(index, new CustomMessagePart(text, clickAction, hoverAction));
        return this;
    }

    @Override
    public Iterator<RichMessagePart> iterator() {
        return this.parts.iterator();
    }
}
