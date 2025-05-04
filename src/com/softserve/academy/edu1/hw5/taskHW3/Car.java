package softserve.academy.edu1.hw5.taskHW3;

import java.util.Scanner;

public class Car implements Comparable<Car> {
    protected String type;
    protected int yearOfProduction;
    protected double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return type + " - " + yearOfProduction + " - " + engineCapacity;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(getYearOfProduction(), otherCar.getYearOfProduction());
    }

}
