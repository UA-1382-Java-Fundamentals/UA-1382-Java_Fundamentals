package com.softserve.academy.edu1.Hw12.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence with multiple spaces:");
        String input = scanner.nextLine();

        String normalized = input.replaceAll("\\s{2,}+", " ");//зміна 2+ пробала на 1 пробіл

        System.out.println("Normalized sentence:");
        System.out.println(normalized);
    }
}
