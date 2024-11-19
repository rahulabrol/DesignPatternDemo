package com.rahul.designpatterndemo.design_patterns.structural_pattern.bridge_pattern;

/**
 * Weapon
 */
public interface Weapon {

    void wield();

    void swing();

    void unWield();

    Enchantment getEnchantment();
}
