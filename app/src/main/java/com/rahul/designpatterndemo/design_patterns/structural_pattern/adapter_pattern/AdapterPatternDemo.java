package com.rahul.designpatterndemo.design_patterns.structural_pattern.adapter_pattern;

/**
 * Convert the interface of a class into another interface the clients
 * expect. Adapter lets classes work together that couldn't otherwise
 * because of incompatible interfaces.
 * <p>
 * Real world example
 * <p>
 * Consider that you have some pictures in your memory card and you need
 * to transfer them to your computer. In order to transfer them you need
 * some kind of adapter that is compatible with your computer ports so that
 * you can attach memory card to your computer. In this case card reader is
 * an adapter. Another example would be the famous power adapter; a three
 * legged plug can't be connected to a two pronged outlet, it needs to use a
 * power adapter that makes it compatible with the two pronged outlet. Yet another
 * example would be a translator translating words spoken by one person to another.
 * <p>
 * In plain words
 * <p>
 * Adapter pattern lets you wrap an otherwise incompatible object in an adapter
 * to make it compatible with another class.
 * <p>
 * Wikipedia says
 * <p>
 * In software engineering, the adapter pattern is a software design pattern that
 * allows the interface of an existing class to be used as another interface. It is
 * often used to make existing classes work with others without modifying their source code.
 * <p>
 * Applicability
 * <p>
 * Use the Adapter pattern when
 * <p>
 * 1. You want to use an existing class, and its interface does not match the one you need
 * 2. You want to create a reusable class that cooperates with unrelated or unforeseen classes, that is,
 * classes that don't necessarily have compatible interfaces
 * 3. You need to use several existing subclasses, but it's impractical to adapt their interface by subclassing
 * every one. An object adapter can adapt the interface of its parent class.
 * 4. Most of the applications using third party libraries use adapters as a middle layer between
 * the application and the 3rd party library to decouple the application from the library. If another
 * library has to be used only an adapter for the new library is required without having to change
 * the application code.
 * <p>
 * <p>
 * An adapter helps two incompatible interfaces to work together. This is the real world definition
 * for an adapter. Interfaces may be incompatible but the inner functionality should suit the need.
 * The Adapter design pattern allows otherwise incompatible classes to work together by converting
 * the interface of one class into an interface expected by the clients.
 *
 * <p>
 * There are two variations of the Adapter pattern: The class adapter implements the adaptee's
 * interface whereas the object adapter uses composition to contain the adaptee in the adapter
 * object. This example uses the object adapter approach.
 *
 * <p>
 * The Adapter ({@link FishingBoatAdapter}) converts the interface of the adaptee class (
 * {@link FishingBoat}) into a suitable one expected by the client ( {@link RowingBoat} ).
 *
 * <p>
 * The story of this implementation is this. <br>
 * Pirates are coming! we need a {@link RowingBoat} to flee! We have a {@link FishingBoat} and our
 * captain. We have no time to make up a new ship! we need to reuse this {@link FishingBoat}. The
 * captain needs a rowing boat which he can operate. The spec is in {@link RowingBoat}. We will
 * use the Adapter pattern to reuse {@link FishingBoat}.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        // The captain can only operate rowing boats but with adapter he is able to use fishing boats as well
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
