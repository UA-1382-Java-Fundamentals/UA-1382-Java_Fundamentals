package com.softserve.academy.edu1.homework5;

//Write a Java program that asks the user to enter a positive integer and determines whether it is a prime number.
//If the number is prime, output a message “Is a prime number”.
//Otherwise, output a message “Is not prime number”.


import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        isPrime(number);
    }
    public static void isPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
                return;
            }
        }
        System.out.println(number + " is a prime number.");
    }
}
