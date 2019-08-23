package com.example.designpatterndemo.design_patterns.structural_pattern.flyweight_pattern;

public class StrengthPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You feel strong. (Potion={})");
    }
}
