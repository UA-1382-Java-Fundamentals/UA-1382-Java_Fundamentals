package softserve.academy.edu5.taskHW1;

import org.junit.jupiter.api.Test;
import softserve.academy.edu5.taskHW1.IntegersTen;

import static org.junit.jupiter.api.Assertions.*;

class IntegersTenTest {

    @Test
    void testSumFirstPositive() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 15;
        int actual = IntegersTen.getSumFirstPositive(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testProductOfLast() {
        int[] arr = {-1, 2, 3, 4, -5, 5, 4, 3, 2, 1};
        int expected = 120;
        int actual = IntegersTen.getProductOfLast(arr);
        assertEquals(expected, actual);
    }
}