package com.softserve.academy.edu1.Hw5.Hw4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testFirstLarger() {
        NumbersGame numGame = new NumbersGame();
        assertEquals("Your number is higher than random number" ,numGame.cheking(20,23)) ;
    }

    @Test
    public void testSecondLower() {
        NumbersGame numGame = new NumbersGame();
        assertEquals("Your number is lower than random number" ,  numGame.cheking(20,19));
    }
    @Test
    public void testThirdEqual() {
        NumbersGame numGame = new NumbersGame();
        assertEquals("Great, you found it" ,  numGame.cheking(20,20));
    }

}
