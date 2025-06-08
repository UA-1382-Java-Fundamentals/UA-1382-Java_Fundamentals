package com.softserve.academy.edu1.homework5.t;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNum = rand.nextInt(100);
        boolean guessed = false;

        System.out.println("Let's play a game. Guess the number between 1 and 100.");

        do {
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == randomNum) {
                System.out.println("Correct! You Win!");
                guessed = true;
            }
            else if (guess > randomNum) {
                System.out.println("Too high, try again");
            }
            else {
                System.out.println("Too low, try again.");
            }
        }while(!guessed);
    }
}
