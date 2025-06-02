package com.softserve.academy.edu13;

public class LambdaFinalDemo {
    public static void main(String[] args) {
        int bonus = 10;
        Calculator calculator = (d, c) -> d + c + bonus;// Using final or effectively final variable
        System.out.println("Result: " + calculator.calculate(5, 3));
      //  bonus = 20;// error

    }
}
interface Calculator {
    int calculate(int a, int b);
}
