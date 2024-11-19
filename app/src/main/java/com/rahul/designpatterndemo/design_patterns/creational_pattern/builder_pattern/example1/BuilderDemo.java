package com.rahul.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example1;

import com.rahul.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example1.CDType;

public class BuilderDemo {
    public static void main(String[] args) {
        CDBuilder cdBuilder = new CDBuilder();

        CDType cdType1 = cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2 = cdBuilder.buildSamsungCD();
        cdType2.showItems();

    }
}
