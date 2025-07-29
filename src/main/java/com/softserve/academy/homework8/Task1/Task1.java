package com.softserve.academy.homework8.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double firstDouble = readNumber();
        double secondDouble = readNumber();

        System.out.println(div(firstDouble,secondDouble));
    }
    public static double div(double a, double b){
        return a / b;
    }

    public static double readNumber(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the number");
                double value =  Double.parseDouble(scanner.nextLine());
                if(value <= 0){
                    System.out.println("Number must be greater than 0. Try again.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
