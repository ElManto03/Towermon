package it.unibo.towermon.model;

import java.util.Collections;
import java.util.Set;

/**
 * Implementation of {@link Trainer},
 * with elements in common both for {@link Player} and {@link Trainer}.
 */
public abstract class AbstractTrainer implements Trainer {

    private static final int MAX_MANA = 4;
    private static final int MANA_RECOVER = 2;

    private String name;
    private Set<Monster> monsters;
    private int mana;


    @Override
    public final int getMana() {
        return mana;
    }

    @Override
    public final boolean isDefeated() {
        return this.monsters.stream().allMatch(m -> m.isFainted());
    }

    @Override
    public final void recoverMana() {
        this.mana += MANA_RECOVER;
        if (this.mana > MAX_MANA) {
            this.mana = MAX_MANA;
        }
    }

    @Override
    public final void useMana(final int manaCost) {
        if (this.mana >= manaCost) {
            this.mana -= manaCost;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public final Set<Monster> getMonsters() {
        return Collections.unmodifiableSet(monsters);
    }

    @Override
    public final String getName() {
        return name;
    } 

}
