package com.softserve.academy.edu1.practice.lesson4;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("Enter three numbers:");
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            if (num % 2 != 0) {
                count++;
            }
        }

        System.out.println("Odd numbers count: " + count);
    }
}
