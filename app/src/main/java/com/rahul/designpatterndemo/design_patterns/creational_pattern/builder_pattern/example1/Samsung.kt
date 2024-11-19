package com.rahul.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example1

class Samsung : Company() {
    override fun price(): Int {
        return 30
    }

    override fun pack(): String {
        return "Samsung CD"
    }
}