package com.softserve.academy.homework6.practicalTask2;

public class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Truck " +getModel() + " runs at max speed " + getMaxSpeed());
    }

    @Override
    void stop() {
        System.out.println("Truck " + getModel() + " stops.");
    }

    @Override
    public String toString() {
        return  super.toString();
    }
}
