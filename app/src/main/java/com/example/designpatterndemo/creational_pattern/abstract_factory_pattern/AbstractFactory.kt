package com.example.designpatterndemo.creational_pattern.abstract_factory_pattern

abstract class AbstractFactory {
    abstract fun getShape(shapeType: String?): Shape?
    abstract fun getColor(colorType: String?): Color?
}