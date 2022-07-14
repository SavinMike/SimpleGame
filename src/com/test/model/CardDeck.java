package com.test.model;

import com.test.card.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardDeck {
    private final Random random = new Random();
    private final List<Card> cards = new ArrayList<>();

    public List<Card> getNewCards(int size) {
        List<Card> nextCards = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            nextCards.add(getNextRandomCard());
        }

        return nextCards;
    }

    private Card getNextRandomCard() {
        int index = random.nextInt(cards.size());
        return cards.remove(index);
    }
}
