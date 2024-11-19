package com.rahul.designpatterndemo.design_patterns.creational_pattern.factory_pattern

import com.rahul.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.Shape

class Circle : Shape {

    override fun draw() {
        System.out.println("Inside draw method: Class Circle")
    }
}