package com.softserve.academy.edu1.Hw7.Hw2;

public abstract class FlyingVehicle extends Passengers implements Vehicle {

    protected FlyingVehicle() {}
    protected abstract void fly();
    protected abstract void land();
}
