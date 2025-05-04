package softserve.academy.edu1.hw5.taskHW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    static final CarService SERVICE = new CarService();

    public static void main(String[] args) {
        Car[] cars = {
                new Car("Sedan", 2013, 1.4),
                new Car("Coupe", 2011, 1.8),
                new Car("Crossover", 2021, 2.2),
                new Car("Hatchback", 2011, 2.6)
        };

        List<Car> carsList = new ArrayList<>(Arrays.asList(cars));

        int yearOfProduction;
        while (true) {
            try {
                yearOfProduction = SERVICE.inputYearOfProduction(cars);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("=======================================");

        List<Car> carsSelected;
        try {
            carsSelected = SERVICE.getCarByYear(cars, yearOfProduction);
            System.out.println("Here are the cars produced in " + yearOfProduction);
            for (Car car : carsSelected) {
                System.out.println(car.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=======================================");
        System.out.println("Initial unsorted array follows:");
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        System.out.println("=======================================");
        System.out.println("Array that was sorted by year of production (asc) follows:");
        Collections.sort(carsList);
        for (Car car : carsList) {
            System.out.println(car.toString());
        }
        System.out.println("=======================================");
        SCANNER.close();
    }
}
