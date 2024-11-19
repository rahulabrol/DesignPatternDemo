package com.rahul.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern;

import com.rahul.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.AbstractFactory;
import com.rahul.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.Color;
import com.rahul.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.FactoryProvider;
import com.rahul.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.Shape;

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
