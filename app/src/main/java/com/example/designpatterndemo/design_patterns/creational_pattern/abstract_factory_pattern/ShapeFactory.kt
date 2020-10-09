package com.example.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern

class ShapeFactory : AbstractFactory() {

    override fun getShape(shapeType: String?): Shape? {
        if (shapeType == null) {
            return null
        }

        return when {
            shapeType.equals("RECTANGLE", ignoreCase = true) -> {
                Rectangle()
            }
            shapeType.equals("CIRCLE", ignoreCase = true) -> {
                Circle()
            }
            shapeType.equals("SQUARE", ignoreCase = true) -> {
                Square()
            }
            else -> null
        }
    }

    override fun getColor(colorType: String?): Color? {
        return null
    }
}