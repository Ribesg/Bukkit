package org.bukkit.chat;

import org.bukkit.entity.LivingEntity;

public class EntityTooltip extends Tooltip {

    private final LivingEntity entity;

    public EntityTooltip(LivingEntity entity) {
        super(Type.SHOW_ENTITY);
        this.entity = entity;
    }

    public LivingEntity getEntity() {
        return this.entity;
    }
}
