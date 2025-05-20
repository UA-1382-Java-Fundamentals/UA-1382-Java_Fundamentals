package com.softserve.academy.hw8_t1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoNumbers {
    List<Double> numbers = new ArrayList<>();

    public void inputNumbers() {
        final int numberCount = 2;
        String currentNumber;

        Scanner sc = new Scanner(System.in);

        System.out.println("You will be asked to input two numbers (if a number is not integer, use a point separator)");

        while (numbers.size() < numberCount) {
            try {
                System.out.println("Input a number");
                currentNumber = sc.nextLine();
                numbers.add(Double.parseDouble(currentNumber));
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            } catch (Exception e) {
                System.out.println("Unknown error");
            }
        }

        sc.close();
    }

    public double div() {
        if (numbers.get(1) == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numbers.get(0) / numbers.get(1);
    }
}