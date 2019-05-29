package com.example.designpatterndemo.creational_pattern.abstract_factory_pattern;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory=FactoryProvider.getFactory("SHAPE");
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();

        AbstractFactory  colorFactory=FactoryProvider.getFactory("COLOR");
        Color color = colorFactory.getColor("BLUE");
        color.fill();
    }
}
