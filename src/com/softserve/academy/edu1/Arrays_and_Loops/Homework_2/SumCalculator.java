package com.softserve.academy.edu1.Arrays_and_Loops.Homework_2;

import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continueOperation;

        do {
            System.out.print("Введіть перше число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введіть друге число: ");
            int num2 = scanner.nextInt();

            int result = Calculator.sum(num1, num2);
            System.out.println("Сума: " + result);

            System.out.println("Чи бажаєте виконати операцію ще раз? (1 - так, 2 - ні): ");
            continueOperation = scanner.nextInt();

        } while (continueOperation == 1);

        System.out.println("Програма завершена.");
        scanner.close();
    }
}