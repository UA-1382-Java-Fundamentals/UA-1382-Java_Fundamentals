package com.softserve.academy.edu7;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Volkswagen");
        car.setPassengers(3);
        car.drive();
        System.out.println("Car model: " + car.getModel());
        System.out.println("Passengers: " + car.getPassengers());

        Plane plane = new Plane();
        plane.setMaxDistance(10000);
        plane.fly();
        plane.land();
    }
}
