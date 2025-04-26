package com.softserve.academy.edu1.Arrays_and_Loops.Homework_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(7, Calculator.sum(3, 4));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-9, Calculator.sum(-4, -5));
    }

    @Test
    void testMixedNumbers() {
        assertEquals(1, Calculator.sum(-2, 3));
    }

    @Test
    void testZero() {
        assertEquals(5, Calculator.sum(0, 5));
        assertEquals(0, Calculator.sum(0, 0));
    }

    @Test
    void testLargeNumbers() {
        assertEquals(2_000_000_000, Calculator.sum(1_000_000_000, 1_000_000_000));
    }
}