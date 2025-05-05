package com.softserve.academy.edu09.student;

public class Student {

    private String name;
    private int age;

    /**
     * Constructor for creating a Student object.
     *
     * @param name The name of the student
     * @param age  The age of the student
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
