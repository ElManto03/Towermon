package it.unibo.towermon.model;

import java.util.Set;

public interface Trainer {

    String getName();

    Set<Monster> getMonsters();

    boolean isDefeated();

    int getMana();

    void useMana(int manaCost);

    void recoverMana();

}
