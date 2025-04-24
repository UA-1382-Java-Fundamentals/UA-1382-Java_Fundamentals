package softserve.academy.edu1.hw5.taskHW4;

import java.util.Random;
import java.util.Scanner;

public class RandomGuessGame {
    static final Scanner SCANNER = new Scanner(System.in);

    public static String guessCheck(int userGuess, int guessNumber) {
        if (userGuess > guessNumber) {
            return "Your guess is too high! Try again";
        } else if (userGuess < guessNumber) {
            return "Your guess is too low! Try again";
        } else {
            return "Your guess is correct!";
        }
    }

    public static int inputUserGuess(String prompt) {
        System.out.print(prompt);
        int userGuess = SCANNER.nextInt();
        SCANNER.nextLine();
        return userGuess;
    }

    public static void main(String[] args) {
        int boundary = 10;
        Random rand = new Random();
        int guessNumber = rand.nextInt(boundary);
        int userGuess = inputUserGuess("Guess what the generated number (boundary is " + boundary + "): ");

        while (userGuess != guessNumber) {
            System.out.println(guessCheck(userGuess, guessNumber));
            userGuess = inputUserGuess("Type your next guess: ");
        }

        System.out.println(guessCheck(userGuess, guessNumber));
        SCANNER.close();
    }
}
