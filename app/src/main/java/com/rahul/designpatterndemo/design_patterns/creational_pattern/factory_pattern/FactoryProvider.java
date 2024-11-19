package com.rahul.designpatterndemo.design_patterns.creational_pattern.factory_pattern;

import com.rahul.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.Circle;
import com.rahul.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.Rectangle;
import com.rahul.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.Shape;
import com.rahul.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.Square;

public class FactoryProvider {

    public static Shape getShape(String type) {
        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
