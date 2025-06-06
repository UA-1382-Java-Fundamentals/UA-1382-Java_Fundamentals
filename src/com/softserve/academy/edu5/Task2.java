package com.softserve.academy.edu5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repeat;

        do {
            //Read first and second numbers
            System.out.println("Enter the first number");
            double num1 = sc.nextDouble();

            System.out.println("Enter the second number");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;//Calculating and displaying sum
            System.out.println("The sum of two given numbers is: " + sum);

            //Asking user if he wants to repeat the process
            System.out.println("Would you like to repeat the process?");
            sc.nextLine();
            repeat = sc.nextLine().trim().toLowerCase();//Reading user's answer

        } while (repeat.equals("yes") || repeat.equals('+'));//Repeat if input is "yes" or "+"
        System.out.println("Code is terminated.");

            sc.close();
        }
    }