package com.example.designpatterndemo.design_patterns.creational_pattern.factory_pattern

import com.example.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.Shape

class Square : Shape {
    override fun draw() {
        println("Inside draw method: Class Square")
    }
}