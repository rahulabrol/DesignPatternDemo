package com.example.designpatterndemo.design_patterns.structural_pattern.decorator_pattern;

/**
 * Also known as WRAPPER
 * <p>
 * Intent
 * <p>
 * Attach additional responsibilities to an object dynamically.Decorator provide you a flexible alternative
 * to subclassing for extending functionality.
 * <p>
 * Real World Example
 * <p>
 * There is an angry troll living in the nearby hills.Usually it goes bare-handed(With one's hands but without
 * tools, weapons, or other implements) but sometimes it has a weapon.To arm the troll it's not necessary to create
 * a new troll but to decorate it dynamically with a suitable weapon.
 * <p>
 * In plain words
 * <p>
 * Decorator pattern lets you dynamically change the behaviour of an object at the run time by wrapping
 * them in an object of a decorator class.
 * <p>
 * Wikipedia says
 * <p>
 * In object-oriented programing,the decorator pattern is a design pattern that allows behaviour to be added to an
 * individual object,either statically or dynamically without affecting the behaviour of other objects from the same
 * class. The decorator pattern is often useful for adhering to the single responsibility principle as it allows
 * functionality to be divided between classes with unique area of concern.
 * <p>
 * The Decorator pattern is a more flexible alternative to subclassing. The Decorator class
 * implements the same interface as the target and uses aggregation to "decorate" calls to the
 * target. Using the Decorator pattern it is possible to change the behavior of the class during
 * runtime.
 * <p>
 * In this example we show how the simple {@link SimpleTroll} first attacks and then flees the battle.
 * Then we decorate the {@link SimpleTroll} with a {@link ClubbedTroll} and perform the attack again. You
 * can see how the behavior changes after the decoration.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.print("Simple attack power {}.\n" + troll.getAttackPower());
        System.out.println();

        //change the behaviour of a simple troll by adding a decorator
        Troll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.print("Clubbed troll power {}.\n" + clubbedTroll.getAttackPower());
        System.out.println();
    }
}
