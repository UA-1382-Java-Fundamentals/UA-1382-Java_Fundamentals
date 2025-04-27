package com.softserve.academy.edu1.OOP_Part_1.Homework_1;

public class Eagle extends FlyingBird {

    public Eagle() {
        super("Dark brown feathers", true);
    }

    @Override
    public void fly() {
        System.out.println("The eagle soars majestically through the sky!");
    }
}