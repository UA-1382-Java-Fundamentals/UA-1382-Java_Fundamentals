package com.softserve.academy.edu1.Hw5.Hw3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void TestCar(){
        Car car = new Car("B", 2005, 920);
        Car car2 = new Car("B", 2025, 420);
        Car car3 = new Car("D", 2024, 490);

        Sorting list = new Sorting(car, car2, car3);
        list.sortByYear();

        assertEquals(car, list.getList().get(0));
        assertEquals(car3, list.getList().get(1));
        assertEquals(car2, list.getList().get(2));
    }
}

