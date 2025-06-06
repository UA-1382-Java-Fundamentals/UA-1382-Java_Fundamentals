package com.softserve.academy.edu8;

import java.util.Scanner;

public class Task1 {
    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = Double.parseDouble(sc.nextLine());

            System.out.print("Enter second number: ");
            double num2 = Double.parseDouble(sc.nextLine());

            double result = div(num1, num2);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Incorrect input. Please enter two valid numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
            sc.close();
        }
    }

