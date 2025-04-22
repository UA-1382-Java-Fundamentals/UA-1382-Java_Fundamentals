package com.softserve.academy.edu03.homework.smallestNumber;

public class Main {
    public static void main(String[] args) {
        Number n1 = new Number();

        n1.inputA();
        n1.inputB();
        n1.inputC();

        System.out.println("The smallest number is " + n1.smallestNumber());

    }

}
