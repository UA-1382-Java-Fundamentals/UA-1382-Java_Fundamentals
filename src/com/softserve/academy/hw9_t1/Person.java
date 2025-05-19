package com.softserve.academy.hw9_t1;

public abstract class Person {
    protected FullName fullName;
    protected int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public abstract String info();

    public abstract String activity();
}
