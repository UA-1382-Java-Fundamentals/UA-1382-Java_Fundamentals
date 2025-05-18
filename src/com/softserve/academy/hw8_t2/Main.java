/*
Create a method readNumber(int start, int end), that read from console
integer number and return it, if it is in the range [start...end]. If an invalid
number or non-number text is read, the method should throw an exception.

 Using this method write a method main(), that must enter 10 numbers:
a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 */

package com.softserve.academy.hw8_t2;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InputMismatchException, IndexOutOfBoundsException, ArithmeticException {
        Numbers numbers = new Numbers();

        try {
            numbers.readNumber(1, 100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Number is not between 1 and 100");
        } catch (InputMismatchException e) {
            System.out.println("Not integer number");
        } catch (ArithmeticException e) {
            System.out.println("Current number should be bigger than previous");
        } catch (Exception e) {
            System.out.println("Unknown error");
        }
    }
}
