package com.softserve.academy.homework6.Task2;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    void report() {
        Developer developer = new Developer("Oksana", 26, 22000,"Trainee");
        String expected = "Name: Oksana, Age: 26, Position: Trainee, Salary: ₴ 22000,00";
        assertEquals(expected,developer.report());
    }

    @Test
    void testDeveloperIsInstanceOfEmployee(){
        Developer developer = new Developer("Anna", 28, 35000, "Junior Developer");
        assertTrue(developer instanceof Employee);
    }
}