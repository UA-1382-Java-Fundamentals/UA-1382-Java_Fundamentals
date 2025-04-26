package com.softserve.academy.edu1.Arrays_and_Loops.Homework_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameLogicTest {

    @Test
    void testGuessTooHigh() {
        assertEquals("Занадто багато, спробуйте ще раз.", GameLogic.checkGuess(80, 50));
    }

    @Test
    void testGuessTooLow() {
        assertEquals("Занадто мало, спробуйте ще раз.", GameLogic.checkGuess(30, 50));
    }

    @Test
    void testGuessCorrect() {
        assertEquals("Вітаємо! Ви вгадали число.", GameLogic.checkGuess(50, 50));
    }
}