package com.softserve.academy.edu5;

class Car3 {
    //Fields to keep data
    String type;
    int year;
    double engineCapacity;

    //Constructor for Car3
    Car3(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }
    //Method for returning string
    @Override
    public String toString() {
        return "Car: type " + type + ", year " + year + ", engine capacity " + engineCapacity;
    }
}