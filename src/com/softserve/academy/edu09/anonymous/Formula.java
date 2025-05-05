package com.softserve.academy.edu09.anonymous;
//Interface Formula with a method to calculate the square root of a number
public interface Formula {
    /**
     * Calculates the square of a number.
     *
     * @param a the number to be squared
     * @return the square of the number
     */

    double calculate(int a);

    /**
     * Calculates the square root of a number.
     *
     * @param a the number to be square rooted
     * @return the square root of the number
     */
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
