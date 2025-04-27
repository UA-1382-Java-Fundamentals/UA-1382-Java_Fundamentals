package com.softserve.academy.edu1.OOP_Part_1.Homework_1;

public class Kiwi extends NonFlyingBird {

    public Kiwi() {
        super("Brown feathers", true);
    }

    @Override
    public void fly() {
        System.out.println("The kiwi cannot fly and prefers walking at night!");
    }
}