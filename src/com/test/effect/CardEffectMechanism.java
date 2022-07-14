package com.test.effect;

import com.test.GameState;
import com.test.card.Card;
import com.test.card.EquipmentCard;
import com.test.card.EventCard;
import com.test.card.SkillCard;

public class CardEffectMechanism {
    private final EventCardEffect eventCardEffect = new EventCardEffect();
    private final EquipmentCardEffect equipmentCardEffect = new EquipmentCardEffect();
    private final SkillCardEffect skillCardEffect = new SkillCardEffect();

    public void applyCardEffect(Card card, GameState gameState) {
        if (card instanceof EventCard) {
            EventCard eventCard = (EventCard) card;
            eventCardEffect.applyCard(eventCard, gameState);
        } else if (card instanceof EquipmentCard) {
            EquipmentCard equipmentCard = (EquipmentCard) card;
            equipmentCardEffect.applyCard(equipmentCard, gameState);
        } else if (card instanceof SkillCard) {
            SkillCard skillCard = (SkillCard) card;
            skillCardEffect.applyCard(skillCard, gameState);
        }

        throw new IllegalArgumentException("Unknown card: " + card.getClass().getSimpleName());
    }
}
