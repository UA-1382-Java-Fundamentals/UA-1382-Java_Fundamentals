package softserve.academy.edu6.taskPractical2;

import java.util.Random;

abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfProduction;
    protected String type;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public void run() {
        System.out.println(model + " goes wroom! It rushes from zero to " + maxSpeed +" km/h!");
    }

    public void stop() {
        System.out.println("Brakes go skreeek! " + model + " stops from " + maxSpeed + " to zero!");
    }
}

class Truck extends Car {
    protected int maxLoad;

    public Truck(String model, int maxSpeed, int yearOfProduction, int maxLoad) {
        super(model, maxSpeed, yearOfProduction);
        this.maxLoad = maxLoad;
        this.type = "Truck";
    }

    @Override
    public String toString() {
        return type + " " + model + " - " + maxSpeed + " km/h - " + yearOfProduction + " - " + maxLoad + " kg max";
    }
}

class Sedan extends Car {
    protected int trunkVolume;

    public Sedan(String model, int maxSpeed, int yearOfProduction, int trunkVolume) {
        super(model, maxSpeed, yearOfProduction);
        this.trunkVolume = trunkVolume;
        this.type = "Sedan";
    }

    @Override
    public String toString() {
        return type + " " + model + " - " + maxSpeed + " km/h - " + yearOfProduction + " - " + trunkVolume + " l";
    }
}

public class CarByTypes {
    public static void main(String[] args) {
        Random rand = new Random();

        Car[] cars = {
                new Sedan("Toyota Corolla", 220, 2020, 370),
                new Sedan("Mazda 3", 200, 2019, 350),
                new Sedan("Honda Accord", 240, 2023, 300),
                new Truck("Ford F-150", 180, 2023, 2300),
                new Truck("GMC Sierra 1500", 200, 2018, 2000),
                new Truck("Toyota Tacoma", 210, 2019, 2700),
        };

        System.out.println("===================================");
        System.out.println("Cars :");
        System.out.println("-----------------------------------");
        for (Car car : cars) {
            System.out.println(car.toString());
            if (rand.nextBoolean()) {car.run();}
            else {car.stop();}
            System.out.println("-----------------------------------");
        }
    }
}
