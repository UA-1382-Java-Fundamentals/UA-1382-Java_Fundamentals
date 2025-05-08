package com.softserve.academy.homework7.practicalTask2;

public class Student extends Person{
    public static final String TYPE_PERSON = "Teacher";

    public Student(String name) {
        super(name);
        System.out.println("Type of person " + TYPE_PERSON + ", name: " + getName());
    }

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
