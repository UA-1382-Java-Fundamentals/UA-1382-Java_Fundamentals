package com.softserve.academy.homework5.Task4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Random random = new Random();
        int number = random.nextInt(100);
        boolean isFalse = true;
        Scanner scanner = new Scanner(System.in);

        while (isFalse){
            System.out.println("Enter the number");
            int yourNumber = scanner.nextInt();
            String result = compareNumbers(yourNumber, number);
            System.out.println(result);
            if(yourNumber == number){
                isFalse = false;
            }
        }
    }

    public static String compareNumbers(int guess, int number){
        if(guess > number){
            return "Too high, try again.";
        } else if (guess < number) {
            return "Too low, try again.";
        }else {
            return "You win. It's correct number";
        }
    }
}
