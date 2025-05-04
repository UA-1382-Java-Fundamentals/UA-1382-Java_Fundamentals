package softserve.academy.edu1.hw5.taskHW4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int boundary = 10;
        Random rand = new Random();
        int guessNumber = rand.nextInt(boundary);

        int userGuess;
        while (true) {
            try {
                userGuess = Guess.inputUserGuess("Guess what the generated number (boundary is " + boundary + "): ");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (userGuess != guessNumber) {
            System.out.println(Guess.guessCheck(userGuess, guessNumber));
            while (true) {
                try {
                    userGuess = Guess.inputUserGuess("Type your next guess: ");
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println(Guess.guessCheck(userGuess, guessNumber));
    }
}