package com.softserve.academy.edu1.Arrays_and_Loops.Homework_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Sedan", 2020, 3.0);
        Car car2 = new Car("Suv", 2025, 3.0);
        Car car3 = new Car("Coupe", 2001, 1.0);
        Car car4 = new Car("Universal", 2011, 5.0);

        Car[] cars = {car1, car2, car3, car4};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рік виробництва для пошуку: ");
        int year = scanner.nextInt();

        System.out.println("\nАвтомобілі року " + year + ":");
        boolean found = false;
        for (Car car : cars) {
            if (car.getYearOfProduction() == year) {
                System.out.println(car.getType() + ", " + car.getYearOfProduction() + ", " + car.getEngineCapacity() + "L");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Автомобілів цього року немає.");
        }

        System.out.println("\nАвтомобілі відсортовані за роком виробництва:");
        Arrays.sort(cars, Comparator.comparingInt(c -> c.getYearOfProduction()));

        for (Car car : cars) {
            System.out.println(car.getType() + ", " + car.getYearOfProduction() + ", " + car.getEngineCapacity() + "L");
        }
    }
}