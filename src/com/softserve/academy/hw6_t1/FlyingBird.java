package com.softserve.academy.hw6_t1;

public class FlyingBird extends Bird {
    public FlyingBird(String type, boolean feathers, boolean layEggs) {
        super(type, feathers, layEggs);
    }

    void fly() {
        System.out.println("This bird flies");
    }
}
