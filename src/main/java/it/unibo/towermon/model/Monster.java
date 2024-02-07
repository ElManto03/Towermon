package it.unibo.towermon.model;

public interface Monster {

    /**
     * dice se è vivo
     * @return true if the monster is alive (he have more than 0 HP)
     * false otherwise
     */
    boolean isFainted();     

    String getName();

    int getactualHP();

    int getMaxHP();

    int getAttack();

    int getDefense();
}
