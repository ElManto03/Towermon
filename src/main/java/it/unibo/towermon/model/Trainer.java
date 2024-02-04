package it.unibo.towermon.model;

import java.util.Set;

/**
 * Interface that represents a generic trainer, both the player and any opponent.
 */
public interface Trainer {

    /**
     * @return the name of the trainer.
     */
    String getName();

    /**
     * @return the set of monsters in the trainer party.
     */
    Set<Monster> getMonsters();

    /**
     * Checks if the {@link Trainer} have any {@link Monster} still alive.
     * @return {@code true} if all {@link Monster}s of the {@link Trainer} are fainted,
     * {@code false} otherwise.
     */
    boolean isDefeated();

    /**
     * @return the amount of mana in the current turn
     */
    int getMana();

    /**
     * Consume mana equal to the {@link Move} cost.
     * @param manaCost the cost in mana of the selected {@link Move}
     */
    void useMana(int manaCost);

    /**
     * At the end of the turn, add {@value MANA_RECOVER}
     * up to {@value MANA_MAX} to the current mana.
     */
    void recoverMana();

}
