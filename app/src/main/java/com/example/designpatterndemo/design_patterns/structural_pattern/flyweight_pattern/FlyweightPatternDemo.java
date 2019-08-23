package com.example.designpatterndemo.design_patterns.structural_pattern.flyweight_pattern;

/**
 * INTENT
 * <p>
 * Use sharing to support large numbers of fine-grained objects efficiently.
 * <p>
 * Real world example
 * <p>
 * Alchemist's shop has shelves full of magic potions. Many of the potions are
 * the same so there is no need to create new object for each of them. Instead one
 * object instance can represent multiple shelf items so memory footprint remains small.
 * <p>
 * In plain words
 * <p>
 * It is used to minimize memory usage or computational expenses by sharing as much as possible
 * with similar objects.
 * <p>
 * Wikipedia says
 * <p>
 * In computer programing, flyweight is a software design pattern.A flyweight is an object that
 * minimize memory use by sharing as much as data with other similar objects.It is the way to use
 * object in large number when a simple repeated representation would use an unacceptable amount
 * of memory.
 */
public class FlyweightPatternDemo {
    public static void main(String[] args) {
        AlchemistShop alchemistShop = new AlchemistShop();
        alchemistShop.enumerate();
    }
}
