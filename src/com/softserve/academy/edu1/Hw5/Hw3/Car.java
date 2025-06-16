package com.softserve.academy.edu1.Hw5.Hw3;

public class Car {
    private String type;
    private int yearOfProduction;
    private int engineCapacity;

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.engineCapacity = engineCapacity;
        this.yearOfProduction = yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return type + " " + yearOfProduction + " " + engineCapacity;
    }
}
