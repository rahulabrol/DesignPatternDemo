package com.example.designpatterndemo.creational_pattern.factory_pattern;

import com.example.designpatterndemo.creational_pattern.abstract_factory_pattern.Shape;

public class FactoryDemo {

    public static void main(String[] args) {
        com.example.designpatterndemo.creational_pattern.abstract_factory_pattern.Shape shape = FactoryProvider.getShape("CIRCLE");
        shape.draw();
        com.example.designpatterndemo.creational_pattern.abstract_factory_pattern.Shape shape2 = FactoryProvider.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = FactoryProvider.getShape("SQUARE");
        shape3.draw();
    }
}
