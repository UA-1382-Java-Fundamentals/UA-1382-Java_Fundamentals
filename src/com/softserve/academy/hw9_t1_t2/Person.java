package com.softserve.academy.hw9_t1_t2;

public abstract class Person {
    protected FullName fullName;
    protected int age;
    protected String subtype;

    public String getSubtype() {
        return subtype;
    }

    public Person(FullName fullName, int age, String subtype) {
        this.fullName = fullName;
        this.age = age;
        this.subtype = subtype;
    }

    public abstract String info();

    public abstract String activity(String subtype);
}
