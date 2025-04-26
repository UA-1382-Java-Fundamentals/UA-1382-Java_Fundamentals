package com.softserve.academy.edu1.Arrays_and_Loops.Homework_4;

public class GameLogic {

    public static String checkGuess(int guess, int randomNumber) {
        if (guess > randomNumber) {
            return "Занадто багато, спробуйте ще раз.";
        } else if (guess < randomNumber) {
            return "Занадто мало, спробуйте ще раз.";
        } else {
            return "Вітаємо! Ви вгадали число.";
        }
    }
}