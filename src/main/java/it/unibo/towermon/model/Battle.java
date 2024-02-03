package it.unibo.towermon.model;

import java.util.List;

public interface Battle {

    List<Monster> getMonsters();

    void doMove(int move);

}
