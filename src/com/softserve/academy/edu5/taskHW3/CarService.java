package softserve.academy.edu5.taskHW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        if (carsSelected.isEmpty()) {
            throw new IllegalArgumentException("No cars for year " + year + "!");
        }
        return carsSelected;
    }

    public int inputYearOfProduction(Car[] cars) {
        System.out.print("Enter the year of production: ");
        int yearMin = getMinYear(cars);
        int yearMax = getMaxYear(cars);
        int yearOfProduction;
        while (true) {
            try {
                yearOfProduction = Integer.parseInt(SCANNER.nextLine());
                if (yearOfProduction > yearMax || yearOfProduction < yearMin) {
                    throw new IllegalArgumentException(String.format(
                            "Invalid year of production! Enter the year between %d and %d",
                            yearMin,
                            yearMax)
                    );
                }
                break;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Input a valid integer!");
            }
        }
        return yearOfProduction;
    }
}
