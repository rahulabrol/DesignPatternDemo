package com.example.designpatterndemo.design_patterns.structural_pattern.bridge_pattern;

/**
 * Also known as:--> Handle/Body
 * <p>
 * Decouple an abstraction from its implementation so that the two can vary independently.
 * <p>
 * Real world example
 * <p>
 * Consider you have a weapon with different enhancements and you are supposed to allow
 * mixing different weapons with different enhancements.What would you do? Create multiple
 * copies of each of the weapons for each of the enhancements or would you just create separate
 * enhancement and set it for the weapon as needed? Bridge pattern allows you to do second.
 * <p>
 * In Plan Word
 * <p>
 * Bridge pattern is about to preferring composition over inheritance.Implementation details are pushed
 * from a hierarchy to another object with separate hierarchy.
 * <p>
 * <p>
 * Composition over inheritance. The Bridge pattern can also be thought of as two layers of abstraction.
 * With Bridge, you can decouple an abstraction from its implementation so that the two can vary independently.
 * <p>
 * In Bridge pattern both abstraction ({@link Weapon}) and implementation (
 * {@link Enchantment}) have their own class hierarchies. The interface of the implementations
 * can be changed without affecting the clients.
 * <p>
 * In this example we have two class hierarchies. One of weapons and another one of enchantments. We can easily
 * combine any weapon with any enchantment using composition instead of creating deep class hierarchy.
 * </p>
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Sword sword = new Sword(new SoulEatingEnchantment());
        sword.wield();
        sword.swing();
        sword.unWield();

        Hammer hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unWield();
    }
}
