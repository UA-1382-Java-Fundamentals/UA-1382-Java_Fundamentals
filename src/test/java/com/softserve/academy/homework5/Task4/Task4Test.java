package com.softserve.academy.homework5.Task4;


import com.softserve.academy.homework5.Task4.Task4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Task4Test {

    @Test
    void testCompareNumbers_TooHigh() {
        String result = Task4.compareNumbers(80, 50);
        assertEquals("Too high, try again.", result);
    }

    @Test
    void testCompareNumbers_TooLow() {
        String result = Task4.compareNumbers(20, 50);
        assertEquals("Too low, try again.", result);
    }

    @Test
    void testCompareNumbers_Correct() {
        String result = Task4.compareNumbers(50, 50);
        assertEquals("You win. It's correct number", result);
    }
}