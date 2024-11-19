package com.rahul.designpatterndemo.design_patterns.structural_pattern.flyweight_pattern;

public class InvisibilityPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You become invisible. (Potion={})");
    }
}
