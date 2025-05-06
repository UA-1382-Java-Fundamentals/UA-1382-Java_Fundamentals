package softserve.academy.edu5.taskHW1;

import org.junit.jupiter.api.Test;
import softserve.academy.edu5.taskHW1.IntegersFive;

import static org.junit.jupiter.api.Assertions.*;

class IntegersFiveTest {
    @Test
    public void testSecondPositiveIndex() {
        int[] arr = {1, 2, 3, 4, 5};
        int expected = 1;
        int actual = IntegersFive.getSecondPositiveIndex(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testMinNumberInstance() {
        int[] arr = {4, 2, 1, 4, 5};
        int[] expected = {1, 2};
        int[] actual = IntegersFive.getMinNumberInstance(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEvenProduct() {
        int[] arr = {1, 2, 3, 4, 5};
        int expected = 8;
        int actual = IntegersFive.getEvenProduct(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testNoEvenProduct() {
        int[] arr = {1, 3, 5, 7, 9};
        int expected = 0;
        int actual = IntegersFive.getEvenProduct(arr);
        assertEquals(expected, actual);
    }

}