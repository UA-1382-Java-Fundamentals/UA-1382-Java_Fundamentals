package softserve.academy.edu1.hw5.taskHW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DaysInMonthTest {
    @Test
    void testFillMonthsArray() {
        String[] monthsExpected = {"JANUARY",
        "FEBRUARY",
        "MARCH",
        "APRIL",
        "MAY",
        "JUNE",
        "JULY",
        "AUGUST",
        "SEPTEMBER",
        "OCTOBER",
        "NOVEMBER",
        "DECEMBER"};
        String[] monthsActual = DaysInMonth.fillMonthsArray();
        Assertions.assertArrayEquals(monthsExpected, monthsActual);
    }

    @Test
    void testIsIndexValid() {
        int monthIndex = 1;
        DaysInMonth.isIndexValid(monthIndex);
    }

    @Test
    void testIsIndexInvalid() {
        int monthIndex = 15;
        IllegalArgumentException thrown =
                Assertions.assertThrows(IllegalArgumentException.class,() -> {DaysInMonth.isIndexValid(monthIndex);});

    }
}