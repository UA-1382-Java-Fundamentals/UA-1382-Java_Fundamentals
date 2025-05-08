package com.softserve.academy.homework6.Task1;

public class FlyingBird extends Bird{
    public FlyingBird( String type) {
        super( true, true, true,type);
    }

    @Override
    public void fly() {
        System.out.println(type + " can fly");
    }
}
