package com.example.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern

class FactoryProvider {
    companion object {
        @JvmStatic
        fun getFactory(factoryType: String?): AbstractFactory? {
            if (factoryType == null) {
                return null
            }
            if (factoryType.equals("SHAPE", ignoreCase = true)) {
                return ShapeFactory()
            } else if (factoryType.equals("COLOR", ignoreCase = true)) {
                return ColorFactory()
            }
            return null
        }
    }
}