package com.example.designpatterndemo.design_patterns.creational_pattern.factory_pattern;

import com.example.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.Shape;

public class FactoryDemo {

    public static void main(String[] args) {
        Shape shape = FactoryProvider.getShape("CIRCLE");
        shape.draw();
        Shape shape2 = FactoryProvider.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = FactoryProvider.getShape("SQUARE");
        shape3.draw();
        // null case
        Shape shape4 = FactoryProvider.getShape("TRIANGLE");
        if (shape4 != null)
            shape4.draw();
    }
}
