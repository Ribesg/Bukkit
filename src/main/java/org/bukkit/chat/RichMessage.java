package org.bukkit.chat;

import org.apache.commons.lang.Validate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Represents a RichMessage.
 * <p>
 * Basically whatever can be sent using the Vanilla /tellraw command
 */
public class RichMessage {

    private List<RichMessagePart> parts;

    public RichMessage() {
        this.parts = new ArrayList<RichMessagePart>();
    }

    public RichMessage(RichMessagePart part) {
        Validate.notNull(part, "A rich message part can't be null");
        this.parts = new ArrayList<RichMessagePart>();
        this.parts.add(part);
    }

    public RichMessage(Collection<RichMessagePart> parts) {
        Validate.notNull(parts, "A collection of rich message parts can't be null");
        this.parts = new ArrayList<RichMessagePart>(parts);
    }

    public RichMessage append(String text) {
        Validate.notNull(text, "You can't append a null String to a RichMessage");
        this.parts.add(new RichMessagePart(text));
        return this;
    }

    public RichMessage append(RichMessagePart part) {
        Validate.notNull(part, "A rich message part can't be null");
        this.parts.add(part);
        return this;
    }

    public RichMessage insert(int index, String text) {
        Validate.notNull(text, "You can't insert a null String into a RichMessage");
        this.parts.add(index, new RichMessagePart(text));
        return this;
    }

    public RichMessage insert(int index, RichMessagePart part) {
        Validate.notNull(part, "A rich message part can't be null");
        this.parts.add(index, part);
        return this;
    }
}
