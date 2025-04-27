package com.softserve.academy.edu1.OOP_Part_1.Homework_1;

public class Swallow extends FlyingBird {

    public Swallow() {
        super("Blue and white feathers", true);
    }

    @Override
    public void fly() {
        System.out.println("The swallow flits quickly through the air!");
    }
}