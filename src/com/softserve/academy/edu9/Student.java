package com.softserve.academy.edu9;

public class Student extends Person {
    public Student(FullName fullName, int age) {
        super(fullName, age);
    }
    @Override
    public String activity() {
        return "Studying at school.";
    }
}