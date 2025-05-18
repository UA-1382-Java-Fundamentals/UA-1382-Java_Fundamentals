package com.softserve.academy.hw8_t1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoNumbers {
    private final double[] numbers = new double[2];
    private double division;
    private boolean exit;

    public void inputNumbers() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println("Input a number (if not integer, use a point separator)");
                numbers[i] = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Not a number");
                exit = true;
            } catch (Exception e) {
                System.out.println("Unknown error");
            }

            if (exit) {
                break;
            }
        }
        sc.close();
    }

    public void div() throws ArithmeticException  {
        if (Double.isInfinite(numbers[0] / numbers[1])) {
            throw new ArithmeticException();
        } else {
            division = numbers[0] / numbers[1];
        }
    }

    public void printResults() {
        if (exit) {
            return;
        } else {
            try {
                div();
                System.out.println(division);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            } catch (Exception e) {
                System.out.println("Unknown error");
            }
        }
    }
}
