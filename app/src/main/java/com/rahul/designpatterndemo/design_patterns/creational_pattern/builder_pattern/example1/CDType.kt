package com.rahul.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example1

class CDType {
    private val items = ArrayList<Packing>()

    fun addItem(packs: Packing) {
        items.add(packs)
    }

    fun getCost() {
        for (packs in items) {
            packs.price()
        }
    }

    fun showItems() {
        for (packing in items) {
            print("CD name : " + packing.pack())
            println(", Price : " + packing.price())
        }
    }
}