package com.softserve.academy.edu1.Condition_Statements.Homework_5;

import java.util.Scanner;

public class FacultyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter faculty name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter season (WINTER, SPRING, SUMMER, AUTUMN): ");
        String seasonInput = scanner.nextLine().toUpperCase();

        Season season = Season.valueOf(seasonInput);

        Faculty faculty = new Faculty(name, numberOfStudents, season);
        System.out.println("\nFaculty Information ");
        faculty.printInfo();

        scanner.close();
    }
}
