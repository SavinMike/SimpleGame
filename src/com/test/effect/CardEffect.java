package com.test.effect;

import com.test.GameState;
import com.test.card.Card;
import com.test.model.Entity;

public interface CardEffect<C extends Card> {

    void applyCard(C card, GameState gameState);
}
