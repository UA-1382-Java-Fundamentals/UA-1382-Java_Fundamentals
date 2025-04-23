package softserve.academy.edu1.hw5.taskHW4;

import java.util.Random;
import java.util.Scanner;

public class RandomGuessGame {
    private static String guessCheck(int userGuess, int guessNumber) {
        if (userGuess > guessNumber) {
            return "Your guess is too high! Try again";
        } else {
            return "Your guess is too low! Try again";
        }
    }

    private static int getUserGuess(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        int userGuess = sc.nextInt();
        sc.nextLine();
        return userGuess;
    }

    public static void main(String[] args) {
        int boundary = 10;
        Random rand = new Random();
        int guessNumber = rand.nextInt(boundary);

        int userGuess = getUserGuess("Guess what the generated number (boundary is " + boundary + "): ");
        do {
            System.out.println(guessCheck(userGuess, guessNumber));
            userGuess = getUserGuess("Type your next guess: ");
        } while (guessNumber != userGuess);
        System.out.println("You guessed correctly!");
    }
}
