package com.rahul.designpatterndemo.design_patterns.structural_pattern.facade_pattern;

public class Samsung implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println(" Samsung galaxy tab 3 ");
    }

    @Override
    public void price() {
        System.out.println("Rs 45000.00");
    }
}