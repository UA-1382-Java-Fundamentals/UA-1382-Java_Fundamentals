package com.softserve.academy.homework7.practicalTask2;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void print();
}
