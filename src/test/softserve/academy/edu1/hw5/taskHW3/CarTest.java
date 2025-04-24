package softserve.academy.edu1.hw5.taskHW3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CarTest {

    public static Car[] fillArray() {
        int count = 4;
        Car[] cars = new Car[count];
        cars[0] = new Car("Sedan", 2013, 1.4);
        cars[1] = new Car("Coupe", 2011, 1.8);
        cars[2] = new Car("Crossover", 2021, 2.2);
        cars[3] = new Car("Hatchback", 2011, 2.6);
        return cars;
    }

    @Test
    void testMaxYear() {
        Car cars[] = fillArray();
        int expected = 2021;
        int actual = Car.getMaxYear(cars);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMinYear() {
        Car cars[] = fillArray();
        int expected = 2011;
        int actual = Car.getMinYear(cars);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCarByYear() {
        Car cars[] = fillArray();
        List<Car> carsExpected = Arrays.asList(cars[0]);
        List<Car> carsActual = Car.getCarByYear(cars, 2013);
        Assertions.assertArrayEquals(carsExpected.toArray(), carsActual.toArray());
    }

}