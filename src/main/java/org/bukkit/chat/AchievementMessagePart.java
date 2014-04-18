package org.bukkit.chat;

import org.bukkit.Achievement;

/**
 * Represents an achievement message as specified by minecraft.
 * <p>
 * Note that the tooltip is fixed to the {@link Achievement} and cannot be
 * altered.
 */
public class AchievementMessagePart extends RichMessagePart {

    private final Achievement achievement;

    /**
     * Creates a new AchievementMessagePart with the given {@link Achievement}.
     * <p>
     * The representation of the text message defaults to minecraft's
     * "achievement got" design.
     * 
     * @param achievement
     *            the {@link Achievement} that should be displayed
     */
    public AchievementMessagePart(Achievement achievement) {
        this(achievement, (String) null);
    }

    /**
     * Creates a new AchievementMessagePart with the given {@link Achievement}.
     * <p>
     * Note that the text can contain {@link org.bukkit.ChatColor} codes.
     * 
     * @param achievement
     *            the {@link Achievement} that should be displayed
     * @param customText
     *            the text of this {@link RichMessagePart}
     */
    public AchievementMessagePart(Achievement achievement, String customText) {
        super(Type.ACHIEVEMENT, customText);
        this.achievement = achievement;
    }

    /**
     * Creates a new AchievementMessagePart with the given {@link Achievement}
     * and the given {@link ClickAction}.
     * <p>
     * Note that the text can contain {@link org.bukkit.ChatColor} codes.
     * 
     * @param achievement
     *            the {@link Achievement} that should be displayed
     * @param customText
     *            the text of this {@link RichMessagePart}
     * @param clickAction
     *            the action executed when the player click on this
     *            {@link RichMessagePart}
     */
    public AchievementMessagePart(Achievement achievement, String customText,
            ClickAction clickAction) {
        super(Type.ACHIEVEMENT, customText, clickAction);
        this.achievement = achievement;
    }

    /**
     * Creates a new AchievementMessagePart with the given {@link Achievement}.
     * 
     * @param achievement
     *            the {@link Achievement} that should be displayed
     * @param customText
     *            the localized text of this {@link RichMessagePart}
     */
    public AchievementMessagePart(Achievement achievement,
            LocalizedString customText) {
        super(Type.ACHIEVEMENT, customText);
        this.achievement = achievement;
    }

    /**
     * Creates a new AchievementMessagePart with the given {@link Achievement}.
     * 
     * @param achievement
     *            the {@link Achievement} that should be displayed
     * @param customText
     *            the localized text of this {@link RichMessagePart}
     * @param clickAction
     *            the action executed when the player click on this
     *            {@link RichMessagePart}
     */
    public AchievementMessagePart(Achievement achievement,
            LocalizedString customText, ClickAction clickAction) {
        super(Type.ACHIEVEMENT, customText, clickAction);
        this.achievement = achievement;
    }

    /**
     * Gets the {@link Achievement} connected to this {@link RichMessagePart}.
     * The {@link Achievement}'s tooltip will be shown when the player hover on
     * the text of this {@link RichMessagePart}.
     * 
     * @return the {@link Achievement} connected to this RichMessagePart .
     */
    public Achievement getAchievement() {
        return achievement;
    }
}
