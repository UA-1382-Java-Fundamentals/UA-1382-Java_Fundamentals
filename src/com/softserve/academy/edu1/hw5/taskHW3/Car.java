package softserve.academy.edu1.hw5.taskHW3;

import java.util.*;

class CarService {
    static final Scanner SCANNER = new Scanner(System.in);

    public int getMaxYear (Car[] cars) {
        int maxYear = Integer.MIN_VALUE;
        for (Car car : cars) {
            maxYear = Math.max(car.yearOfProduction, maxYear);
        }
        return maxYear;
    }

    public int getMinYear (Car[] cars) {
        int minYear = Integer.MAX_VALUE;
        for (Car car : cars) {
            minYear = Math.min(car.yearOfProduction, minYear);
        }
        return minYear;
    }

    public List<Car> getCarByYear (Car[] cars, int year) {
        List<Car> carsSelected = new ArrayList<>();
        for (Car car : cars) {
            if (car.yearOfProduction == year) {
                carsSelected.add(car);
            }
        }
        return carsSelected;
    }

    public int inputYearOfProduction(Car[] cars) {
        System.out.print("Enter the year of production: ");
        int yearOfProduction = SCANNER.nextInt();
        while (yearOfProduction > getMaxYear(cars) || yearOfProduction < getMinYear(cars)) {
            System.out.print("Invalid year of production. Try again: ");
            yearOfProduction = SCANNER.nextInt();
            SCANNER.nextLine();
        }
        return yearOfProduction;
    }
}

public class Car implements Comparable<Car> {
    static final Scanner SCANNER = new Scanner(System.in);
    static final CarService SERVICE = new CarService();

    protected String type;
    protected int yearOfProduction;
    protected double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public static void main(String[] args) {
        int count = 4;
        Car[] cars = new Car[count];
        List<Car> carsList = new ArrayList<>();
        cars[0] = new Car("Sedan", 2013, 1.4);
        cars[1] = new Car("Coupe", 2011, 1.8);
        cars[2] = new Car("Crossover", 2021, 2.2);
        cars[3] = new Car("Hatchback", 2011, 2.6);
        carsList.addAll(Arrays.asList(cars));

        int yearOfProduction = SERVICE.inputYearOfProduction(cars);
        System.out.println("=======================================");
        List<Car> carsSelected = SERVICE.getCarByYear(cars, yearOfProduction);
        if (!carsSelected.isEmpty()) {
            System.out.println("Here are the cars produced in " + yearOfProduction);
            for (Car car : carsSelected) {
                System.out.println(car.toString());
            }
        }
        else {
            System.out.println("No cars available for year " + yearOfProduction);
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

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }



    @Override
    public String toString() {
        return type + " - " + yearOfProduction + " - " + engineCapacity;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(getYearOfProduction(), otherCar.getYearOfProduction());
    }

}
