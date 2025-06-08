package softserve.academy.edu8.taskHW2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import softserve.academy.edu8.taskHW2.Main;
import softserve.academy.edu8.taskHW2.NumberTooBigException;
import softserve.academy.edu8.taskHW2.NumberTooSmallException;

class MainTest {

    int start = 5;
    int end = 10;
    int tooSmall = 1;
    int expected = 7;
    int tooBig = 15;

    @Test
    void testReadNumberTooSmall() {
        NumberTooSmallException thrown =
                Assertions.assertThrows(NumberTooSmallException.class,() -> {
                    Main.readNumber(tooSmall, start, end);
                });
    }

    @Test
    void testReadNumberTooBig() {
        NumberTooBigException thrown =
                Assertions.assertThrows(NumberTooBigException.class,() -> {
                    Main.readNumber(tooBig, start, end);
                });
    }

    @Test
    void testReadNumberValid() throws NumberTooBigException, NumberTooSmallException {
        int actual = Main.readNumber(expected, start, end);
        Assertions.assertEquals(expected, actual);
    }
}