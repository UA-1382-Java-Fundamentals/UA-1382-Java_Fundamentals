package softserve.academy.edu5.taskHW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import softserve.academy.edu5.taskHW1.DaysInMonth;

import static org.junit.jupiter.api.Assertions.fail;

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
    void testValidIndex() {
        int monthIndex = 6;
        try {DaysInMonth.checkValidIndex(monthIndex);}
        catch (IllegalArgumentException e) {
            fail ("Valid month " + monthIndex + " should not throw exception");
        }
    }

    @Test
    void testIsIndexInvalid() {
        int monthIndex = 15;
        IllegalArgumentException thrown =
                Assertions.assertThrows(IllegalArgumentException.class,() -> {DaysInMonth.checkValidIndex(monthIndex);});

    }
}