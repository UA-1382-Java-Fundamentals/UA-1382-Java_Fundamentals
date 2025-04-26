package com.softserve.academy.edu1.Arrays_and_Loops.Homework_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthTest {

    @Test
    void testJanuary() {
        assertEquals(31, Month.getDaysInMonth(1), "Січень повинен мати 31 день");
    }

    @Test
    void testFebruary() {
        assertEquals(28, Month.getDaysInMonth(2), "Лютий має мати 28 днів");
    }

    @Test
    void testApril() {
        assertEquals(30, Month.getDaysInMonth(4), "Квітень має мати 30 днів");
    }

    @Test
    void testDecember() {
        assertEquals(31, Month.getDaysInMonth(12), "Грудень має мати 31 день");
    }

    @Test
    void testInvalidMonthZero() {
        assertEquals(-1, Month.getDaysInMonth(0), "Місяць 0 є недопустимим");
    }

    @Test
    void testInvalidMonthThirteen() {
        assertEquals(-1, Month.getDaysInMonth(13), "Місяць 13 є недопустимим");
    }

    @Test
    void testNegativeMonth() {
        assertEquals(-1, Month.getDaysInMonth(-5), "Негативний номер місяця є недопустимим");
    }
}