package com.example.designpatterndemo.design_patterns.creational_pattern.builder_pattern.Example1

class Sony : Company() {
    override fun price(): Int {
        return 20
    }

    override fun pack(): String {
        return "Sony CD"
    }
}