package it.unibo.towermon.model;

import java.util.Collections;
import java.util.Set;

public abstract class AbstractTrainer implements Trainer {

    private static final int MAX_MANA = 4;

    private String name;
    private Set<Monster> monsters;
    private int mana;


    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public boolean isDefeated() {
        return this.monsters.stream().allMatch(m -> m.isFainted());
    }

    @Override
    public void recoverMana() {
        this.mana += 2;
        if (this.mana > MAX_MANA) {
            this.mana = MAX_MANA;
        }
    }

    @Override
    public void useMana(final int manaCost) {
        if (this.mana >= manaCost) {
            this.mana -= manaCost;
        } else {
            throw new IllegalStateException();
        }
    }
  
    @Override
    public Set<Monster> getMonsters() {
        return Collections.unmodifiableSet(monsters);
    }

    @Override
    public String getName() {
        return name;
    }

    

}
