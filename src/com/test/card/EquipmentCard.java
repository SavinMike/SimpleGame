package com.test.card;

import com.test.model.Entity;

public class EquipmentCard implements Card {

    private final Entity entity;

    public EquipmentCard(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }
}
