package com.softserve.academy.homework7.Task2;

public abstract class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}
