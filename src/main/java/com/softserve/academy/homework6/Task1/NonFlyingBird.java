package com.softserve.academy.homework6.Task1;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(String type) {
        super(true, true,false, type);
    }

    @Override
    public void fly() {
        System.out.println(type + " cannot fly");
    }
}
