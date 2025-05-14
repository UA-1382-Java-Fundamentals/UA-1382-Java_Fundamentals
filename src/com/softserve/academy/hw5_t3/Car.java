package com.softserve.academy.hw5_t3;

public class Car {
    private final String type;
    private final int yearOfProduction;
    private final int engineCapacity;
    private int modelYear;

    public Car(String type, int yearOfProduction, int engineCapacity, int modelYear) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.modelYear = modelYear;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
}
