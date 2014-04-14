package org.bukkit.chat;

import org.apache.commons.lang.Validate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RichMessageBuilder {

    private List<RichMessagePart> parts = new ArrayList<RichMessagePart>();

    public RichMessageBuilder() {
    }

    public RichMessageBuilder(RichMessagePart part) {
        Validate.notNull(part, "A rich message part can't be null");
        if (part != null) {
            parts.add(part);
        }
    }

    public RichMessageBuilder(Collection<? extends RichMessagePart> parts) {
        Validate.notNull(parts, "A collection of rich message parts can't be null");
        if (parts != null) {
            this.parts.addAll(parts);
        }
    }

    public RichMessageBuilder append(String text) {
        Validate.notNull(text, "You can't append a null String to a RichMessage");
        parts.add(new RichMessagePart(text));
        return this;
    }

    public RichMessageBuilder append(RichMessagePart part) {
        Validate.notNull(part, "A rich message part can't be null");
        parts.add(part);
        return this;
    }

    public RichMessageBuilder insert(int index, String text) {
        Validate.notNull(text, "You can't insert a null String into a RichMessage");
        parts.add(index, new RichMessagePart(text));
        return this;
    }

    public RichMessageBuilder insert(int index, RichMessagePart part) {
        Validate.notNull(part, "A rich message part can't be null");
        parts.add(index, part);
        return this;
    }

    public RichMessage build() {
        // TODO Actually build the RichMessage
        return new RichMessage();
    }

}
