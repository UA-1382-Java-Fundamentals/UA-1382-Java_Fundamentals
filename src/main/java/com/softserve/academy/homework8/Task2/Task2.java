package com.softserve.academy.homework8.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(readNumber(1, 200) + " passed in range");
    }

    public static int readNumber(int start, int end){
        System.out.printf("Enter value from %d to %d %n",start,end);
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= start && number <= end){
                    return  number;
                } else {
                    System.out.println("Number is out of range!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong value");
            }
        }

    }
}
