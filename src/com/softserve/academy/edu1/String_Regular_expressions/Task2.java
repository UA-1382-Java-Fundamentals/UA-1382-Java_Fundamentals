package com.softserve.academy.edu1.String_Regular_expressions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String cleaned = input.replaceAll("\\s+", " ");
        System.out.println(cleaned);
    }
}