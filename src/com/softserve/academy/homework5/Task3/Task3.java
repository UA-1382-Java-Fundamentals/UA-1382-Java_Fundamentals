package softserve.academy.homework5.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Car car1 = new Car("Audi",2012, 3.0);
        Car car2 = new Car("Mercedes", 2007,1.5);
        Car car3 = new Car("BMW", 2010, 2.0);
        Car car4 = new Car("VolksWagen", 2015, 2.0);
        Car [] cars = new Car[]{car1, car2, car3, car4};

        int year = inputYear();
        outputCars(cars, year);

        carsPrint(cars);
        carsSort(cars);
        carsPrint(cars);
        System.out.println("Cars sorted by year of production:");

    }

    public static int inputYear(){
        System.out.println("Enter yer of production");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void outputCars(Car[]cars,int year){
        for (Car car: cars){
            if(car.getYearOfProduction() == year){
                System.out.println(car);
            }
        }
    }

    public static void carsSort(Car[]cars){
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getYearOfProduction() < cars[j + 1].getYearOfProduction()) {
                    var tmp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = tmp;
                }
            }
        }
    }

    public static void carsPrint(Car[]cars){
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
