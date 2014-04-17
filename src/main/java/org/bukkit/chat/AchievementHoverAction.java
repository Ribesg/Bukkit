package org.bukkit.chat;

import org.bukkit.Achievement;

// TODO Javadoc
public class AchievementHoverAction extends HoverAction {

    private final Achievement achievement;

    public AchievementHoverAction(Achievement achievement) {
        super(HoverAction.Type.SHOW_ACHIEVEMENT);
        this.achievement = achievement;
    }

    public Achievement getAchievement() {
        return this.achievement;
    }
}
