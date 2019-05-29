package com.example.designpatterndemo.creational_pattern.factory_pattern

import com.example.designpatterndemo.creational_pattern.abstract_factory_pattern.Shape

class Square : Shape {
    override fun draw() {
        System.out.println("Inside draw method: Class Square")
    }
}