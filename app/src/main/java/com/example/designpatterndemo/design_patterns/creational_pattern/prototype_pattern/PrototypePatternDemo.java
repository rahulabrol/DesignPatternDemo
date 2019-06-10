package com.example.designpatterndemo.design_patterns.creational_pattern.prototype_pattern;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        Student student = new Student("Rahul", 1090, "Science", "12th");
        student.showRecord();
        System.out.println("\n");

        Student student2 = (Student) student.getClone();
        student2.showRecord();
        System.out.println("\n");

        System.out.println("hash code for student: " + student.hashCode());
        System.out.println("hash code for student: " + student2.hashCode());


    }
}