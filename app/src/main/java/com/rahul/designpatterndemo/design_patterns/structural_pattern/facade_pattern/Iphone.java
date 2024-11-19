package com.rahul.designpatterndemo.design_patterns.structural_pattern.facade_pattern;

public class Iphone implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Iphone 6");
    }

    @Override
    public void price() {
        System.out.println("60000");
    }
}
