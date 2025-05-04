package softserve.academy.edu1.hw5.taskHW4;

import java.util.Scanner;

public class Guess {
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
        try {
            return Integer.parseInt(SCANNER.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Enter a valid number!");
        }
    }


}
