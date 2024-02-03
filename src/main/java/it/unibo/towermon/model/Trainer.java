package it.unibo.towermon.model;

import java.util.Set;

public interface Trainer {

    String getName();

    Set<Monster> getMonsters();

    int getMonstersAlive();

    int getMana();

}
