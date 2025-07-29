package com.softserve.academy.homework6.practicalTask2;

public class Task2{
    public static void main(String[] args) {
        Car [] cars = {
                new Truck("MAN", 120,2024),
                new Truck("MAN", 80 , 2019),
                new Sedan("BMW", 180,2019),
        };
        for (var car: cars){
            System.out.println(car);
            car.run();
        }
        for(var car : cars){
            car.stop();
        }
    }
}
