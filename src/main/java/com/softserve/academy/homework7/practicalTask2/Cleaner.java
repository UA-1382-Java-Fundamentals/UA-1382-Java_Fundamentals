package com.softserve.academy.homework7.practicalTask2;

public class Cleaner extends Staff{
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println("Type of person " + TYPE_PERSON + ", name:" + getName());
    }

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    public double salary() {
        return 9000;
    }
}
