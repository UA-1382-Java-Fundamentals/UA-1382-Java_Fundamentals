package com.softserve.academy.edu1.Arrays_and_Loops.Homework_4;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Вгадайте число: ");
            guess = scanner.nextInt();
            System.out.println(GameLogic.checkGuess(guess, randomNumber));
        }
        while (guess != randomNumber);

        System.out.println("Програма завершена.");
        scanner.close();
    }
}