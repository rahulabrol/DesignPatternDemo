package com.rahul.designpatterndemo.design_patterns.creational_pattern.prototype_pattern;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        Student student = new Student("Rahul", 1090, "Science", "12th");
        student.showRecord();
        System.out.println("\n");

        Student student2 = (Student) student.getClone();
//        student2.setName("Rohit");
//        student2.setRollNo(1091);
        student2.showRecord();
        System.out.println("\n");

        System.out.println("hash code for student1: " + student.hashCode());
        System.out.println("hash code for student2: " + student2.hashCode());


    }
}