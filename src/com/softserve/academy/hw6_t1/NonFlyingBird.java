package com.softserve.academy.hw6_t1;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String type, boolean feathers, boolean layEggs) {
        super(type, feathers, layEggs);
    }

    void fly() {
        System.out.println("This bird doesn't fly");
    }
}
