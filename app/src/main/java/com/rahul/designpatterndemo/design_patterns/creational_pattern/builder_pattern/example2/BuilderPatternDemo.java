package com.rahul.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example2;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .setName("rahul")
                .setRollNo("10")
                .setCourse("M.C.A")
                .setSemester("2nd")
                .setAge("28")
                .build();

    }
}
