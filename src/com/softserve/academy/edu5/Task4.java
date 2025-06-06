package com.softserve.academy.edu5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Create objects for generating random numbers and reading user input
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        //Generate a random number across the full int range
        int targetNumber = random.nextInt();

        //Create a list to store all user's guesses
        ArrayList<Integer> guesses = new ArrayList<>();

        System.out.println("Guess the number");

        //Repeat until user guesses the number
        while (true) {
            int guess = sc.nextInt();
            guesses.add(guess);

            if (guess < targetNumber) {
                System.out.println("Too low, try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("You guessed the number");
                break;//Exit the loop
            }
        }

        System.out.println("Your guesses: " + guesses);

        sc.close();
    }
}