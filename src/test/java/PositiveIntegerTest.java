import Task05.PositiveInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveIntegerTest {

    PositiveInteger myNumb = new PositiveInteger();

    @Test
    void isPrimeNumber() {

    assertTrue(myNumb.isPrimeNumber(1));

    assertFalse(myNumb.isPrimeNumber(10));

    }

}