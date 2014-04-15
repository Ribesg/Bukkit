package org.bukkit.chat;

import org.bukkit.Achievement;

public class AchievementTooltip extends Tooltip {

    private final Achievement achievement;

    public AchievementTooltip(Achievement achievement) {
        super(Tooltip.Type.SHOW_ACHIEVEMENT);
        this.achievement = achievement;
    }

    public Achievement getAchievement() {
        return this.achievement;
    }
}
