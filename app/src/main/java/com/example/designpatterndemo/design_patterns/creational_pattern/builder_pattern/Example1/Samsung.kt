package com.example.designpatterndemo.design_patterns.creational_pattern.builder_pattern.Example1

class Samsung : Company() {
    override fun price(): Int {
        return 30
    }

    override fun pack(): String {
        return "Samsung CD"
    }
}