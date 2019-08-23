package com.example.designpatterndemo.design_patterns.structural_pattern.flyweight_pattern;

public class HolyWaterPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You feel blessed. (Potion={})");
    }
}
