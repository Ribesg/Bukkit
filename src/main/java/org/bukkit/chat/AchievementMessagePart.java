package org.bukkit.chat;

import org.bukkit.Achievement;

// TODO Javadoc
public class AchievementMessagePart extends RichMessagePart {

    private final Achievement achievement;

    public AchievementMessagePart(Achievement achievement) {
        this(achievement, (String) null);
    }

    public AchievementMessagePart(Achievement achievement, String customText) {
        super(Type.ACHIEVEMENT, customText);
        this.achievement = achievement;
    }

    public AchievementMessagePart(Achievement achievement, String customText, ClickAction clickAction) {
        super(Type.ACHIEVEMENT, customText, clickAction);
        this.achievement = achievement;
    }

    public AchievementMessagePart(Achievement achievement, LocalizedString customText) {
        super(Type.ACHIEVEMENT, customText);
        this.achievement = achievement;
    }

    public AchievementMessagePart(Achievement achievement, LocalizedString customText, ClickAction clickAction) {
        super(Type.ACHIEVEMENT, customText, clickAction);
        this.achievement = achievement;
    }

    public Achievement getAchievement() {
        return achievement;
    }
}
