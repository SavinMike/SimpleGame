package com.test;

import com.test.card.Card;
import com.test.effect.CardEffectMechanism;
import com.test.model.Monster;
import com.test.model.Player;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final CardEffectMechanism cardEffectFactory = new CardEffectMechanism();

    void nextPlayerStage(Card card, GameState gameState) {
        cardEffectFactory.applyCardEffect(card, gameState);
    }
}
