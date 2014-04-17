package org.bukkit.chat;

import org.bukkit.Achievement;

// TODO Javadoc
public class AchievementMessagePart implements RichMessagePart {

    private final Achievement achievement;
    private final boolean mode; // TODO Understand what this is

    public AchievementMessagePart(Achievement achievement, boolean mode) {
        this.achievement = achievement;
        this.mode = mode;
    }

    @Override
    public Type getType() {
        return Type.ACHIEVEMENT;
    }

    public Achievement getAchievement() {
        return achievement;
    }

    public boolean getMode() {
        return mode;
    }
}
