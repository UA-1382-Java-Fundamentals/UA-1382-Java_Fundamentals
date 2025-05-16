package com.softserve.academy.edu1.Hw5.Hw1;

public class ArrayProc {
    public int processArray(int[] array) {
        boolean allPositive = true;
        for (int i = 0; i < 5; i++) {
            if (array[i] <= 0) {
                allPositive = false;
                break;
            }
        }

        if (allPositive) {
            System.out.print("Sum: ");
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            System.out.print("Product: ");
            int product = 1;
            for (int i = 5; i < 10; i++) {
                product *= array[i];
            }
            return product;
        }
    }
}
