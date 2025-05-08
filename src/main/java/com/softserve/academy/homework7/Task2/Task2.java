package com.softserve.academy.homework7.Task2;

public class Task2 {
    public static void main(String[] args) {
        Liner liner = new Liner(1500,10);
        Boat boat = new Boat(15,2);
        Plane plane = new Plane(120,3000);
        Helicopter helicopter = new Helicopter(5,2000,1500);
        Bus bus = new Bus(60,"A4");
        Motorcycle motorcycle = new Motorcycle(1,300);
        Car car = new Car(4, "Mercedes");

        Passengers[] passengers = {liner,boat,plane,helicopter,bus,motorcycle,car};
        doSomething(passengers);
    }

    public static void doSomething(Passengers[]passengers){
        for(Passengers passenger : passengers){
            if(passenger instanceof WaterVehicle){
                ((WaterVehicle) passenger).isSailing();
            } else if (passenger instanceof FlyingVehicle) {
                ((FlyingVehicle) passenger).fly();
                ((FlyingVehicle) passenger).land();
            } else if (passenger instanceof GroundVehicle){
                ((GroundVehicle) passenger).drive();
            } else {
                System.out.println("Wrong Vehicle");
            }
        }
    }
}
