package com.example.designpatterndemo.design_patterns.creational_pattern.prototype_pattern;

/**
 * Prototype Pattern says that cloning of an existing object instead of
 * creating new one and can also be customized as per the requirement.
 * <p>
 * This pattern should be followed, if the cost of creating a
 * new object is expensive and resource intensive.
 * <p>
 * The main advantages of prototype pattern are as follows:
 * <p>
 * It reduces the need of sub-classing.
 * It hides complexities of creating objects.
 * The clients can get new objects without knowing which type of object it will be.
 * It lets you add or remove objects at runtime.
 * <p>
 * Usage:-
 * <p>
 * When the classes are instantiated at runtime.
 * When the cost of creating an object is expensive or complicated.
 * When you want to keep the number of classes in an application minimum.
 * When the client application needs to be unaware of object creation and representation.
 */
public class Student implements Prototype {

    private String name;
    private int rollNo;
    private String className;
    private String course;

    public Student(Student student) {
        this.name = student.name;
        this.rollNo = student.rollNo;
        this.className = student.className;
        this.course = student.course;
    }

    private Student() {
        System.out.println("   Student Records   ");
        System.out.println("---------------------------------------------");
        System.out.println("RollNo" + "\t" + "Name" + "\t" + "Class" + "\t\t" + "Course");
    }

    Student(String name, int rollNo, String className, String course) {
        this();
        this.name = name;
        this.rollNo = rollNo;
        this.className = className;
        this.course = course;
    }

    void showRecord() {

        System.out.println(rollNo + "\t" + name + "\t" + className + "\t\t" + course);
    }

    @Override
    public Prototype getClone() {
        return new Student(this);
    }
}
