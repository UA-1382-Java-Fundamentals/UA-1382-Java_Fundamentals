package com.softserve.academy.homework4.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Input three integer numbers");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        int max = (numberOne > numberTwo) ? ((numberOne > numberThree) ? numberOne : numberThree) : ((numberTwo > numberThree) ? numberTwo : numberThree);
        int min = (numberOne < numberTwo) ? ((numberOne < numberThree) ? numberOne : numberThree) : ((numberTwo < numberThree) ? numberTwo : numberThree);

        System.out.println(max + " - max value");
        System.out.println(min + " - min value");
    }
}
