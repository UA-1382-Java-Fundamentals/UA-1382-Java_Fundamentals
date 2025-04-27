package com.softserve.academy.edu1.OOP_Part_1.Homework_1;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am flying high in the sky!");
    }
}
