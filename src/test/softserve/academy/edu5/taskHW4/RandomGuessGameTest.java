package softserve.academy.edu5.taskHW4;

import org.junit.jupiter.api.Test;
import softserve.academy.edu5.taskHW4.Guess;

import static org.junit.jupiter.api.Assertions.*;

class RandomGuessGameTest {

    @Test
    void testCheckHigh() {
        int userGuess = 10;
        int guessNumber = 1;
        String expected = "Your guess is too high! Try again";
        String actual = Guess.guessCheck(userGuess, guessNumber);
        assertEquals(expected, actual);
    }

    @Test
    void testCheckLow() {
        int userGuess = 1;
        int guessNumber = 10;
        String expected = "Your guess is too low! Try again";
        String actual = Guess.guessCheck(userGuess, guessNumber);
        assertEquals(expected, actual);
    }

    @Test
    void testCheckCorrect() {
        int userGuess = 10;
        int guessNumber = 10;
        String expected = "Your guess is correct!";
        String actual = Guess.guessCheck(userGuess, guessNumber);
        assertEquals(expected, actual);
    }
}