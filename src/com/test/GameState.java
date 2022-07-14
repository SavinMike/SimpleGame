package com.test;

import com.test.model.Monster;
import com.test.model.Player;

import java.util.List;

public class GameState {
    private final List<Player> players;
    private final List<Monster> monsters;
    private final Player activePlayer;

    public GameState(List<Player> players, List<Monster> monsters, Player activePlayer) {
        this.players = players;
        this.monsters = monsters;
        this.activePlayer = activePlayer;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public Player getActivePlayer() {
        return activePlayer;
    }
}
