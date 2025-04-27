package com.softserve.academy.edu1.OOP_Part_1.Homework_1;

public class Penguin extends NonFlyingBird {

    public Penguin() {
        super("Black and white feathers", true);
    }

    @Override
    public void fly() {
        System.out.println("The penguin cannot fly, but it swims skillfully!");
    }
}