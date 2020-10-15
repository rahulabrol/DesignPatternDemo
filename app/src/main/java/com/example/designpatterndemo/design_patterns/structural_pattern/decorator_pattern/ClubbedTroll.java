package com.example.designpatterndemo.design_patterns.structural_pattern.decorator_pattern;

/**
 * Decorator that adds a club for the troll
 */
public class ClubbedTroll implements Troll {

    private final Troll decorated;

    public ClubbedTroll(Troll decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        System.out.println("The troll swings at you with club!");
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 20;
    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle();
    }
}
