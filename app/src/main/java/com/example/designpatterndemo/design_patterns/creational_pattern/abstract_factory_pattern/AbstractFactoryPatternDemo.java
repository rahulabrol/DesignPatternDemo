package com.example.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProvider.getFactory("SHAPE");
        Shape shape;
        if (shapeFactory != null) {
            shape = shapeFactory.getShape("CIRCLE");
            if (shape != null) {
                shape.draw();
            }
        }

        AbstractFactory colorFactory = FactoryProvider.getFactory("COLOR");
        Color color;
        if (colorFactory != null) {
            color = colorFactory.getColor("BLUE");
            if (color != null) {
                color.fill();
            }
        }
    }
}
