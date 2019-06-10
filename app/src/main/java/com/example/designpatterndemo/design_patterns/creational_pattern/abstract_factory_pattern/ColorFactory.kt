package com.example.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern

class ColorFactory : AbstractFactory() {

    override fun getColor(colorType: String?): Color? {
        if (colorType == null) {
            return null
        }

        if (colorType.equals("RED", ignoreCase = true)) {
            return Red()
        } else if (colorType.equals("BLUE", ignoreCase = true)) {
            return Blue()
        } else if (colorType.equals("GREEN", ignoreCase = true)) {
            return Green()
        }
        return null
    }

    override fun getShape(shapeType: String?): Shape? {
        return null
    }
}