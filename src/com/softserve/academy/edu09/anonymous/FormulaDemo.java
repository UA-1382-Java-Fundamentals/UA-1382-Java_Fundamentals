package com.softserve.academy.edu09.anonymous;


public class FormulaDemo {

    public static void main(String[] args) {
        // Using an anonymous class to implement the Formula interface.
        // This creates a one-time implementation of the Formula interface without creating a separate class file
        Formula formula = new Formula() {
            // Implementing the calculate method required by the Formula interface
            @Override
            public double calculate(int a) {
                // Using the default sqrt method from the Formula interface
                return sqrt(a * 5);
            }
        };

        double result = formula.calculate(20);
        System.out.println("The result is: " + result);
    }
}
