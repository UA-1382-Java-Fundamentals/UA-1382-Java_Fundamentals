package com.softserve.academy.hw4_t5;

import java.util.Scanner;

public class Faculty {
    private String name;
    private int numberOfStudents;
    private Season season;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Faculty() {

    }

    public static Faculty getFacultyFromConsole() {
        Faculty faculty = new Faculty();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter faculty name: ");
        faculty.setName(scanner.nextLine());

        System.out.println("Enter season (WINTER, SPRING, SUMMER, AUTUMN): ");
        String input = scanner.nextLine();
        faculty.setSeason(Season.valueOf(input));

        System.out.println("Enter number of students: ");
        faculty.setNumberOfStudents(scanner.nextInt());

        return faculty;
    }

    public void printInfo(String text, String value) {
        System.out.println(text + value);
    }
}
