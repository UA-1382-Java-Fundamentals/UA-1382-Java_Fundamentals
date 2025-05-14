/*
Create class called Car with fields: type, year of production and engine capacity.
• Create and initialize in main() method four instances of class Car.
• Output result for cars:
o certain model year (enter year in the console);
o sorted cars by the field “year of production ”.
 */

package com.softserve.academy.hw5_t3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("Honda", 1999, 2000, 0),
            new Car("Chevrolet", 2001, 1500, 0),
            new Car("Ford", 1995, 1300, 0),
            new Car("FIAT", 2023, 2500, 0)
        };

        Scanner sc = new Scanner(System.in);

        for (Car c : cars) {
            System.out.println("Input a model year for: " + c.getType() + "; Year of production: " + c.getYearOfProduction() + "; Engine capacity: " + c.getEngineCapacity());
            c.setModelYear(sc.nextInt());
        }

        for (Car c : cars) {
            System.out.println("Car type: " + c.getType() + "; Year of production: " + c.getYearOfProduction() + "; Engine capacity: " + c.getEngineCapacity() + "; Model year: " + c.getModelYear());
        }
    }
}
