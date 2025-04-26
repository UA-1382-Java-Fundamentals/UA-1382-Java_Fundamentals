package com.softserve.academy.edu1.Arrays_and_Loops.Homework_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void testCarConstructorAndGetters() {
        Car car = new Car("Sedan", 2020, 3.0);

        assertEquals("Sedan", car.getType());
        assertEquals(2020, car.getYearOfProduction());
        assertEquals(3.0, car.getEngineCapacity());
    }

    @Test
    void testDifferentCar() {
        Car car = new Car("Coupe", 2001, 1.0);

        assertEquals("Coupe", car.getType());
        assertEquals(2001, car.getYearOfProduction());
        assertEquals(1.0, car.getEngineCapacity());
    }
}