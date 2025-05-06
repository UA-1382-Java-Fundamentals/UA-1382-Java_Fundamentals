package softserve.academy.edu5.taskHW2;

import org.junit.jupiter.api.Test;
import softserve.academy.edu5.taskHW2.TwoNumbersWhile;

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