package com.softserve.academy.edu12;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence with multiple spaces between words");
        String input = sc.nextLine();

        String cleaned = input.replaceAll("\\s+", " ");

        System.out.println("Fixed sentence: " + cleaned);

        sc.close();
    }
}