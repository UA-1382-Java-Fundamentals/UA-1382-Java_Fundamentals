package com.softserve.academy.edu1.Hw7.Hw2.GroundVehiclePack;

import com.softserve.academy.edu1.Hw7.Hw2.GroundVehicle;

public class Car extends GroundVehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Car driving");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
