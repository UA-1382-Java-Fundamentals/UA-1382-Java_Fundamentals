package softserve.academy.edu1.hw5.taskHW4;

import java.util.Random;
import java.util.Scanner;

public class RandomGuessGame {
    public static void main(String[] args) {
        int boundary = 10;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int guessNumber = rand.nextInt(boundary);
        System.out.print("Guess what the generated number (boundary is " + boundary + "): ");
        int userGuess = sc.nextInt();
        do {
        if (userGuess > guessNumber) {
            System.out.println("Your guess is too high! Try again");
        } else {
            System.out.println("Your guess is too low! Try again");
        }
        System.out.print("Type your next guess: ");
        userGuess = sc.nextInt();
        sc.nextLine();
        } while (guessNumber != userGuess);
        System.out.println("You guessed correctly!");
    }
}
