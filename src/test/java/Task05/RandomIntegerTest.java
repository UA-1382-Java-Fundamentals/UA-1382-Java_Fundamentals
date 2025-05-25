package Task05;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class RandomIntegerTest {

    int[] test = {-1,1,0,2,4};

    RandomInteger rand = new RandomInteger();
    RandomInteger testArray = new RandomInteger(test);

    @Test
    void maxValue() {
        assertEquals(4,RandomInteger.maxValue(testArray));
    }

    @Test
    void sumPositive() {
        assertEquals(7,RandomInteger.sumPositive(testArray));
    }

    @Test
    void countOfNegative() {
        assertEquals(1,RandomInteger.countOfNegative(testArray));
    }

    @Test
    void countOfPositive() {
        assertEquals(3,RandomInteger.countOfPositive(testArray));
    }
}