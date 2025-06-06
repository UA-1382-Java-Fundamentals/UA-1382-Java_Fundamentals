package com.softserve.academy.edu4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer ");
       int number1 = sc.nextInt();

        System.out.print("Enter the second integer ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third integer ");
        int number3 = sc.nextInt();

        int max = number1;
        int min = number1;

        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }

        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }

        System.out.println("The highest number is: " + max);
        System.out.println("The lowest number is: " + min);

        sc.close();
    }
}
