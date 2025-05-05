package softserve.academy.edu1.hw8.taskHW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void testCheckSecondOperand() {
        double exceptionOperand = 0;
        ArithmeticException thrown =
                Assertions.assertThrows(ArithmeticException.class,() -> {
                    Main.checkSecondOperand(exceptionOperand);
                });
    }

    @Test
    void testDiv() {
        double d1 = 4;
        double d2 = 2;
        double expected = 2;
        Assertions.assertEquals(expected, Main.div(d1, d2));
    }
}