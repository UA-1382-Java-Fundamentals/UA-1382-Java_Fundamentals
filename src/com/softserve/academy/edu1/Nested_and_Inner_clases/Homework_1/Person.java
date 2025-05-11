package com.softserve.academy.edu1.Nested_and_Inner_clases.Homework_1;

public abstract class Person {
    private final FullName fullName;
    private final int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() +
                ", Last name: " + fullName.getLastName() +
                ", Age: " + age;
    }

    public abstract String activity();

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

}
