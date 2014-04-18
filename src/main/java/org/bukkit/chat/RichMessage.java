package org.bukkit.chat;

import org.apache.commons.lang.Validate;
import org.bukkit.Achievement;
import org.bukkit.inventory.ItemStack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents a RichMessage.
 * <p/>
 * Basically whatever can be sent using the Vanilla /tellraw command
 */
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
     * Gets the parts of this RichMessage.
     *
     * @return the parts of this RichMessage
     */
    public List<RichMessagePart> getParts() {
        return this.parts;
    }

    // TODO Javadoc all the thingz

    public RichMessage append(RichMessagePart part) {
        Validate.notNull(part, "A rich message part can't be null");
        this.parts.add(part);
        return this;
    }

    public RichMessage append(String text, String... tooltipLines) {
        if (tooltipLines.length > 0) {
            // TODO
        } else {
            this.append(new CustomMessagePart(text));
        }
        return this;
    }

    public RichMessage append(String text, ClickAction clickAction, String... tooltipLines) {
        if (tooltipLines.length > 0) {
            // TODO
        } else {
            this.append(new CustomMessagePart(text));
        }
        return this;
    }

    public RichMessage append(ItemStack item) {
        // TODO
        return this;
    }

    public RichMessage append(ItemStack item, String customText) {
        // TODO
        return this;
    }

    public RichMessage append(ItemStack item, String customText, ClickAction clickAction) {
        // TODO
        return this;
    }

    public RichMessage append(Achievement achievement) {
        // TODO
        return this;
    }

    public RichMessage append(Achievement achievement, String customText) {
        // TODO
        return this;
    }

    public RichMessage append(Achievement achievement, String customText, ClickAction clickAction) {
        // TODO
        return this;
    }

    // TODO Score
    // TODO Translatable

    @Override
    public Iterator<RichMessagePart> iterator() {
        return this.parts.iterator();
    }
}
