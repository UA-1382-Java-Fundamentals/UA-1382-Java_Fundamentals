package com.softserve.academy.edu1.homework5;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean repeat = true;

        do{
            System.out.println("Enter first number: ");
            int num = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();

            int sum = num + num2;
            System.out.println("The sum is: " + sum);

            System.out.println("Do you want to continue? (Y/N): ");
            if (sc.next().equalsIgnoreCase("N")){
                repeat = false;
            }
        }while (repeat);
    }
}
