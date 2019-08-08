package com.example.designpatterndemo.design_patterns.structural_pattern.bridge_pattern;

/**
 * Hammer.
 */
public class Hammer implements Weapon {
    private Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("The Hammer is wielded.");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("The Hammer is swing.");
        enchantment.apply();
    }

    @Override
    public void unWield() {
        System.out.println("The Hammer is unWielded.");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
