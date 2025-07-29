package com.softserve.academy.homework5.practicalTask2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(isPrime(number)){
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not prime number");
        }

    }

    public static boolean isPrime(int num){
        if (num <= 1 ){
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
