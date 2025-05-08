package com.softserve.academy.homework5.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;

        do {
            System.out.println("Enter number");
            int firsNumber = scanner.nextInt();
            System.out.println("Enter number");
            int secondsNumber = scanner.nextInt();
            int sum = firsNumber + secondsNumber;
            System.out.println("Resul is " + sum);

            scanner.nextLine();
            System.out.println(" Want to perform the operation again? (yes/no)");
            String answer = scanner.nextLine();
            if(!answer.equalsIgnoreCase("yes")){
                isTrue = false;
            }
        } while (isTrue);
    }
}
