package com.rahul.designpatterndemo.design_patterns.structural_pattern.flyweight_pattern;

public class PoisonPotion implements Potion{
    @Override
    public void drink() {
        System.out.println("Urgh! This is poisonous. (Potion={})");
    }
}
