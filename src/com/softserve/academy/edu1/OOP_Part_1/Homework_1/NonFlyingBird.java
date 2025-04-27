package com.softserve.academy.edu1.OOP_Part_1.Homework_1;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I cannot fly, but I can walk or swim!");
    }
}
