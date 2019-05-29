package com.example.designpatterndemo.creational_pattern.abstract_factory_pattern

class ShapeFactory : AbstractFactory() {

    override fun getShape(shapeType: String?): Shape? {
        if (shapeType == null) {
            return null
        }

        if (shapeType.equals("RECTANGLE", ignoreCase = true)) {
            return Rectangle()
        } else if (shapeType.equals("CIRCLE", ignoreCase = true)) {
            return Circle()
        } else if (shapeType.equals("SQUARE", ignoreCase = true)) {
            return Square()
        }
        return null
    }

    override fun getColor(colorType: String?): Color? {
        return null
    }
}