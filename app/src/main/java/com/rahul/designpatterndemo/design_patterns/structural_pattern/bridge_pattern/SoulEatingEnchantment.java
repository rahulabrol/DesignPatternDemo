package com.rahul.designpatterndemo.design_patterns.structural_pattern.bridge_pattern;

public class SoulEatingEnchantment implements Enchantment {

    @Override
    public void onActivate() {
        System.out.println("The item spreads bloodlust.");
    }

    @Override
    public void apply() {
        System.out.println("The item eats the soul of the enemies.");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Bloodlust slowly disappears.");
    }
}
