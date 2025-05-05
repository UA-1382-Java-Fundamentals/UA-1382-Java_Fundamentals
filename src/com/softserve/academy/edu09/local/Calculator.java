package com.softserve.academy.edu09.local;

/**
 * Calculator class demonstrates the use of local inner classes in Java.
 * A local inner class is defined within a block, typically a method.
 */
public class Calculator {

    /**
     * Calculates and prints the square of a number using a local inner class.
     * This method demonstrates how a local inner class can access variables from the enclosing method.
     * 
     * @param number The number to calculate the square of
     */
    public void calculateSquare(int number) {
        // Local inner class definition
        // This class is only visible within the calculateSquare method
        class Square {
            /**
             * Calculates the square of the number passed to the enclosing method.
             * Demonstrates how local classes can access method parameters.
             * 
             * @return The square of the number
             */
            int getSquare() {
                // Access the 'number' parameter from the enclosing method
                return number * number;
            }
        }

        Square square = new Square();

        System.out.println("Square of " + number + " is " + square.getSquare());
    }
}
