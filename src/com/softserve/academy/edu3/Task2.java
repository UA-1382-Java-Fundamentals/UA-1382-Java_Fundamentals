package com.softserve.academy.edu3;

import java.util.Scanner;

public class Task2 {

    //Method to find, return smallest number
    public int findSmallest(int a, int b, int c) {
        int smallest = a;
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Getting three numbers
        System.out.println("Input the first number: ");
        int first = sc.nextInt();

        System.out.println("Input the second number: ");
        int second = sc.nextInt();

        System.out.println("Input the third number: ");
        int third = sc.nextInt();

        //Object for the method
        Task2 find = new Task2();
        int smallest = find.findSmallest(first, second, third);//Call method
        System.out.println("The smallest number is " + smallest);

        sc.close();
    }
}

