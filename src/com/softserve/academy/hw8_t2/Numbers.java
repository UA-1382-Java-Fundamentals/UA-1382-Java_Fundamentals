package com.softserve.academy.hw8_t2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    // // Inputs 10 integers from the user between "start" and "end" integers with validation
    public void readNumbers() {
        int start = 1;
        int end = 100;
        List<Integer> numbers = new ArrayList<>();
        final int numberCount = 10;
        int currentNumber;
        int tempNumber = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("You will be asked to input 10 integer numbers from " + start + " to " + end + ", every next number should be bigger than previous");

        while (numbers.size() < numberCount) {
            try {
                System.out.println("Input an integer number");
                currentNumber = Integer.parseInt(String.valueOf(sc.nextLine()));

                // check if a number is between start and end
                if (currentNumber < 1 | currentNumber > 100) {
                    System.out.println("! Number is not between " + start + " and " + end + " !");

                // check if a number is bigger than previous
                } else if (currentNumber <= tempNumber) {
                    System.out.println("! Current number should be bigger than previous !");

                // valid input
                } else {
                    // save a current number which will become a previous number in the next iteration
                    tempNumber = currentNumber;
                    numbers.add(currentNumber);
                }

            // catch input exceptions
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            } catch (Exception e) {
                System.out.println("Unknown error");
            }
        }

        sc.close();
    }
}