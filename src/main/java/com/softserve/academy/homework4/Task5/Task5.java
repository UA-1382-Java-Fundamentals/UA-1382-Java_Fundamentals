package com.softserve.academy.homework4.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter the name of the faculty: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the current Season (WINTER, SPRING, SUMMER or AUTUMN");
        String seasonInput = scanner.nextLine();

        Season season = Season.getSeason(seasonInput);

        if (season != null) {
            Faculty faculty = new Faculty(name, numberOfStudents , season);
            faculty.printDetails();
        } else {
            System.out.println("Invalid season entered.");
        }
    }
}
