package com.softserve.academy.edu9;

public abstract class Person {
    private FullName fullName;
    private int age;

    // Constructor
    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Getter for fullName
    public FullName getFullName() {
        return fullName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Info method
    public String info() {
        return "First name: " + fullName.getFirstName() +
                ", Last name: " + fullName.getLastName() +
                ", Age: " + age;
    }

    // Abstract method
    public abstract String activity();
}