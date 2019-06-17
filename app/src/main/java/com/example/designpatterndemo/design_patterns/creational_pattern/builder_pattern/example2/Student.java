package com.example.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example2;

/*
  While Considering the builder pattern you need to look weather the object is having

  Complex constructor.
  Multiple constructor having combinations of multiple parameter with nested objects

  Large number of parameters.
  having large number of field parameter is also the key point to consider.

  Immutability.
  You can force the immutability to the object once you are done with creation of object.
 */
public class Student {

    private String name;
    private String rollNo;
    private String course;
    private String age;
    private String semester;


    private Student(Builder builder) {
        this.name = builder.name;
        this.rollNo = builder.rollNo;
        this.course = builder.course;
        this.age = builder.age;
        this.semester = builder.semester;
        System.out.println("name: " + name + " rollno: " + rollNo + " course: " +
                course + " semester: " + semester + " age: " + age);
    }

    static class Builder {
        private String name;
        private String rollNo;
        private String course;
        private String age;
        private String semester;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRollNo(String rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public Builder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Builder setSemester(String semester) {
            this.semester = semester;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
