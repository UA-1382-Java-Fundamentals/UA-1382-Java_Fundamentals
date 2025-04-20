package com.softserve.academy.edu1.Introduction_To_OOP.Homework_2;

import java.util.Scanner;

public class SmallestNumberApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();

        int smallest = NumberUtils.findSmallest(num1, num2, num3);

        System.out.printf("The smallest number is %d\n", smallest);

        scanner.close();
    }
}