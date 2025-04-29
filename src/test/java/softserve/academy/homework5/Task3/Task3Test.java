package softserve.academy.homework5.Task3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task3Test {
Car[] cars = {
        new Car("Audi", 2012, 3.0),
        new Car("BMW", 2010, 2.0),
        new Car("Mercedes", 2015, 1.5)
};


    @Test
    void carsSort() {
        Task3.carsSort(cars);
        assertEquals(2015, cars[0].getYearOfProduction());
        assertEquals(2012, cars[1].getYearOfProduction());
        assertEquals(2010, cars[2].getYearOfProduction());
    }
}