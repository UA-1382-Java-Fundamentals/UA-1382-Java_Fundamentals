package com.softserve.academy.edu4;

import java.util.Scanner;

public class FacultyMain5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter faculty name");
        String facultyName = sc.nextLine();

        System.out.println("Enter number of students");
        int numOfStudents = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter current season");
        String seasonInput = sc.nextLine().toUpperCase();

        try {
            Faculty5.Season season = Faculty5.Season.valueOf(seasonInput);
            Faculty faculty = new Faculty(facultyName, numOfStudents, season);
            System.out.println("Faculty details:");
            faculty.displayDetails();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid season entered.");
        }
        sc.close();
    }
}
