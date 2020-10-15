package com.example.designpatterndemo.design_patterns.structural_pattern.bridge_pattern;

public class Sword implements Weapon {
    private final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("The sword is wielded");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("The sword is swing");
        enchantment.apply();
    }

    @Override
    public void unWield() {
        System.out.println("The sword is unwielded");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
