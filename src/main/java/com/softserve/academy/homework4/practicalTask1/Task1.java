package com.softserve.academy.homework4.practicalTask1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers ");
        int number[] = new int[3];
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            number[i] = scanner.nextInt();
        }
        int odd = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                odd++;
            }
        }

        System.out.println("There are " + odd + " odd numbers");
    }
}
