package com.softserve.academy.edu1.Hw7.Hw2.MAIN;

import com.softserve.academy.edu1.Hw7.Hw2.GroundVehiclePack.Car;
import com.softserve.academy.edu1.Hw7.Hw2.FlyingVehiclePack.Helicopter;
import com.softserve.academy.edu1.Hw7.Hw2.FlyingVehiclePack.Plane;
import com.softserve.academy.edu1.Hw7.Hw2.GroundVehiclePack.Bus;
import com.softserve.academy.edu1.Hw7.Hw2.GroundVehiclePack.Motorcycle;
import com.softserve.academy.edu1.Hw7.Hw2.WaterVehiclePack.Boat;
import com.softserve.academy.edu1.Hw7.Hw2.WaterVehiclePack.Liner;

public class Main {
    public static void main(String[] args) {
        // Водний транспорт
        Liner liner = new Liner(2);
        liner.setPassengers(32);//всюди рахую на 1 пасажира менше, адже Водій не пасажир)
        System.out.println("Liner floors: " + liner.getFloor()+ " passengers " + liner.getPassengers());
        liner.isSailing();

        Boat boat = new Boat(200);
        boat.setPassengers(2);
        System.out.println("Boat volume: " + boat.getVolume()+ " passengers " + boat.getPassengers());
        boat.isSailing();

        // Повітряний транспорт
        Plane plane = new Plane(12356);
        plane.setPassengers(23);
        System.out.println("Plane max distance: " + plane.getMaxDistance()+ " passengers " + plane.getPassengers());
        plane.fly();
        plane.land();

        Helicopter helicopter = new Helicopter(5,40);
        helicopter.setPassengers(11);
        System.out.println("Helicopter max weight: " + helicopter.getMaxHeight() + " and weight: " + helicopter.getWeight()+ " passengers " + helicopter.getPassengers());
        helicopter.fly();
        helicopter.land();

        // Наземний транспорт
        Bus bus = new Bus("Metro- Lviv");
        bus.setPassengers(15);
        System.out.println("Bus route: " + bus.getRoute()+ " passengers " + bus.getPassengers());
        bus.drive();

        Motorcycle motorcycle = new Motorcycle(180);
        motorcycle.setPassengers(1);
        System.out.println("Motorcycle max speed: " + motorcycle.getMaxSpeed()+ " passengers " + motorcycle.getPassengers());
        motorcycle.drive();

        Car car = new Car("Toyota Camry");
        car.setPassengers(3);
        System.out.println("Car model: " + car.getModel()+ " and passengers: " + car.getPassengers());
        car.drive();
    }
}
