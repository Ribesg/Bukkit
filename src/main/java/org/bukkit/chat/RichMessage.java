package org.bukkit.chat;

import org.apache.commons.lang.Validate;
import org.bukkit.Achievement;
import org.bukkit.inventory.ItemStack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents a RichMessage.
 * <p>
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
        return this.append(new CustomMessagePart(text, tooltipLines));
    }

    public RichMessage append(LocalizedString text, String... tooltipLines) {
        return this.append(new CustomMessagePart(text, tooltipLines));
    }

    public RichMessage append(String text, ClickAction clickAction, String... tooltipLines) {
        return this.append(new CustomMessagePart(text, clickAction, tooltipLines));
    }

    public RichMessage append(LocalizedString text, ClickAction clickAction, String... tooltipLines) {
        return this.append(new CustomMessagePart(text, clickAction, tooltipLines));
    }

    public RichMessage append(ItemStack item) {
        return this.append(new ItemMessagePart(item));
    }

    public RichMessage append(ItemStack item, String customText) {
        return this.append(new ItemMessagePart(item, customText));
    }

    public RichMessage append(ItemStack item, LocalizedString customText) {
        return this.append(new ItemMessagePart(item, customText));
    }

    public RichMessage append(ItemStack item, String customText, ClickAction clickAction) {
        return this.append(new ItemMessagePart(item, customText, clickAction));
    }

    public RichMessage append(ItemStack item, LocalizedString customText, ClickAction clickAction) {
        return this.append(new ItemMessagePart(item, customText, clickAction));
    }

    public RichMessage append(Achievement achievement) {
        return this.append(new AchievementMessagePart(achievement));
    }

    public RichMessage append(Achievement achievement, String customText) {
        return this.append(new AchievementMessagePart(achievement, customText));
    }

    public RichMessage append(Achievement achievement, LocalizedString customText) {
        return this.append(new AchievementMessagePart(achievement, customText));
    }

    public RichMessage append(Achievement achievement, String customText, ClickAction clickAction) {
        return this.append(new AchievementMessagePart(achievement, customText, clickAction));
    }

    public RichMessage append(Achievement achievement, LocalizedString customText, ClickAction clickAction) {
        return this.append(new AchievementMessagePart(achievement, customText, clickAction));
    }

    @Override
    public Iterator<RichMessagePart> iterator() {
        return this.parts.iterator();
    }
}
