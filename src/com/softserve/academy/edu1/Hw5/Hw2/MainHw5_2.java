package com.softserve.academy.edu1.Hw5.Hw2;

import java.util.Scanner;

public class MainHw5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Hi");
            System.out.println("Write first number");
            double num1 = sc.nextDouble();
            System.out.println("Write second number");
            double num2 = sc.nextDouble();
            sc.nextLine();
            double result = sum(num1, num2);
            System.out.println(result);
            System.out.println("Do you want to continue? (y/n)");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                check = false;
            }
        } while (check);

    }
    public static double sum(double num1, double num2){
        return num1 + num2;
    }
}
