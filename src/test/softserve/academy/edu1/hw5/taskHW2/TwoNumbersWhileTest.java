package softserve.academy.edu1.hw5.taskHW2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoNumbersWhileTest {

    @Test
    void testSum() {
        int[] numbers = {2, 6};
        int expected = 8;
        int actual = TwoNumbersWhile.getSum(numbers);
        assertEquals(expected, actual);
    }
}