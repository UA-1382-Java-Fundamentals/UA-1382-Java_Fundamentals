package softserve.academy.edu5.taskHW3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softserve.academy.edu5.taskHW3.Car;
import softserve.academy.edu5.taskHW3.CarService;

import java.util.Arrays;
import java.util.List;

class CarTest {

    Car[] cars = new Car[4];
    CarService service;

    @BeforeEach
    public void fillCars() {
        cars[0] = new Car("Sedan", 2013, 1.4);
        cars[1] = new Car("Coupe", 2011, 1.8);
        cars[2] = new Car("Crossover", 2021, 2.2);
        cars[3] = new Car("Hatchback", 2011, 2.6);
        service = new CarService();
    }

    @Test
    void testMaxYear() {
        int expected = 2021;
        int actual = service.getMaxYear(cars);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMinYear() {
        int expected = 2011;
        int actual = service.getMinYear(cars);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCarByYear() {
        List<Car> carsExpected = Arrays.asList(cars[0]);
        List<Car> carsActual = service.getCarByYear(cars, 2013);
        Assertions.assertArrayEquals(carsExpected.toArray(), carsActual.toArray());
    }

}