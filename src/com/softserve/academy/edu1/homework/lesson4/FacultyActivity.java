package com.softserve.academy.edu1.homework.lesson4;

import java.util.Scanner;

public class FacultyActivity {
    enum Season {
        WINTER("Winter", "Winter Exam Session"),
        SPRING("Spring", "Second Semester"),
        SUMMER("Summer", "Summer Break"),
        AUTUMN("Autumn", "First Semester");

        private final String name;
        private final String academicPeriod;

        Season(String name, String academicPeriod) {
            this.name = name;
            this.academicPeriod = academicPeriod;
        }

        public String getName() {
            return name;
        }

        public String getAcademicPeriod() {
            return academicPeriod;
        }
    }

    static class Faculty {
        String name;
        int numberOfStudents;
        Season season;

        Faculty(String name, int numberOfStudents, Season season) {
            this.name = name;
            this.numberOfStudents = numberOfStudents;
            this.season = season;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter faculty name: ");
        String facultyName = scanner.nextLine();
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        System.out.print("Enter season (WINTER, SPRING, SUMMER, AUTUMN): ");
        String seasonInput = scanner.next().toUpperCase();

        Season season = Season.valueOf(seasonInput);
        Faculty faculty = new Faculty(facultyName, numberOfStudents, season);

        System.out.println("Faculty Name: " + faculty.name);
        System.out.println("Number of Students: " + faculty.numberOfStudents);
        System.out.println("Season: " + faculty.season.getName());
        System.out.println("Academic Period: " + faculty.season.getAcademicPeriod());
    }
}
