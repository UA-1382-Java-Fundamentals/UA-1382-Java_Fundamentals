package com.softserve.academy.edu1.Hw7.Hw2.FlyingVehiclePack;

import com.softserve.academy.edu1.Hw7.Hw2.FlyingVehicle;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter flying");
    }
    @Override
    public void land(){
        System.out.println("Helicopter landing");
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getWeight() {
        return weight;
    }
}
