package com.softserve.academy.edu5;

import java.util.*;

public class CarMain3 {
    public static void main(String[] args) {
        //Car3 objects with data about them
        Car3 car1 = new Car3("Sedan",2012,2.0);
                Car3 car2 = new Car3("SUV",2020,2.6);
    Car3 car3 = new Car3("Hatchback", 2009,1.4);
                Car3 car4 = new Car3("Coupe", 2024,3.0);

                //Storing objects in a list
        List<Car3> cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the model year");
        int inputYear = sc.nextInt();

        //Displaying cars that are from certain year
        System.out.println("Cars from year: " + inputYear);
        boolean found = false;
        for (Car3 car : cars) {
            if (car.year == inputYear) {
                System.out.println(car);
                found = true;
            }
        }
        //In case no cars found for that year
        if (!found) {
            System.out.println("No cars detected for that year");
        }
        cars.sort(Comparator.comparingInt(c -> c.year));//Sorting cars by year of production

        System.out.println("Cars that are sorted by year of production: ");
        for (Car3 car : cars) {
            System.out.println(car);
        }
        sc.close();
    }
}