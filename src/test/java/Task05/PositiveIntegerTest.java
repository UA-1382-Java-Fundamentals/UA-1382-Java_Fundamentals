package Task05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveIntegerTest {

    PositiveInteger myNumb = new PositiveInteger();

    @Test
    void isPrimeNumber() {

    assertTrue(myNumb.isPrimeNumber(17));

    assertFalse(myNumb.isPrimeNumber(10));

    }

}