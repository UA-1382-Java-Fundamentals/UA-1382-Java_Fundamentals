package com.softserve.academy.edu1.Hw7.Hw2.GroundVehiclePack;

import com.softserve.academy.edu1.Hw7.Hw2.GroundVehicle;
import com.softserve.academy.edu1.Hw7.Hw2.Vehicle;

public class Motorcycle extends GroundVehicle {
private int maxSpeed;

    public Motorcycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle drive");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {}
}
