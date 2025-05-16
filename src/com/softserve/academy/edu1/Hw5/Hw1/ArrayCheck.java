package com.softserve.academy.edu1.Hw5.Hw1;

public class ArrayCheck {
    public int findSecondPositivePosition(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
                if (count == 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int[] findMinAndPosition(int[] arr) {
        int min = arr[0];
        int pos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                pos = i;
            }
        }
        return new int[]{min, pos};
    }

    public int productOfEvenNonZero(int[] arr) {
        int product = 1;
        boolean found = false;
        for (int value : arr) {
            if (value != 0 && value % 2 == 0) {
                product *= value;
                found = true;
            }
        }
        return found ? product : 0;
    }
}

