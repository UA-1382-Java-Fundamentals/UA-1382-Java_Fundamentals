package com.softserve.academy.edu1.homework.lesson3;

public class FindSmallestNumber {

    public static int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 32;
        int num3 = 54;

        System.out.println("Input the first number: " + num1);
        System.out.println("Input the second number: " + num2);
        System.out.println("Input the third number: " + num3);

        int minNumber = findMin(num1, num2, num3);

        System.out.println("The smallest number is " + minNumber);
    }
}
