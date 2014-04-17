package org.bukkit.chat;

import org.bukkit.Achievement;

// TODO Javadoc
public class AchievementMessagePart implements RichMessagePart {

    private final Achievement achievement;

    public AchievementMessagePart(Achievement achievement) {
        this.achievement = achievement;
    }

    @Override
    public Type getType() {
        return Type.ACHIEVEMENT;
    }

    public Achievement getAchievement() {
        return achievement;
    }
}
