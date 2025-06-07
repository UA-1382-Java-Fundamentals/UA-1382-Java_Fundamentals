package com.softserve.academy.edu1.Hw8.hw2;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[10];
        int lastEnterNumber = 1;

        for (int i = 0; i < 10; i++) {
            try {
                numbers[i] = ReadNumber.readNumber(lastEnterNumber, 100);
                lastEnterNumber = numbers[i];
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                i--;//бо цикл зарахував цю спробу а числа в нас ще досі по факту нема в масиві
            }
        }

        System.out.println("You entered valid numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
