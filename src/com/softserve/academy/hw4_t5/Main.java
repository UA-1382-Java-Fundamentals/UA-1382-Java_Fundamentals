/*
Design a program that models academic activity at a university faculty depending on the season. You need to
create a class named Faculty with the fields: name (the name of the faculty), numberOfStudents (an integer), and
season (an instance of an enum called Season).

Define an enum Season with the values: WINTER, SPRING, SUMMER, and AUTUMN. Each enum constant should store
two values: the English name of the season (e.g., "Winter") and the academic period it represents. The academic
periods should be defined as follows:
• WINTER → "Winter Exam Session"
• SPRING → "Second Semester"
• SUMMER → "Summer Break"
• AUTUMN → "First Semester“

In the main() method, prompt the user to input the faculty name, the number of students, and the current season
(e.g., by typing SPRING).
Then create an instance of the Faculty class and display its details: the faculty name, the
number of students, the season’s English name, and the corresponding academic period.
 */

package com.softserve.academy.hw4_t5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter faculty name: ");
        String name = scanner.nextLine();

        System.out.println("Enter season (WINTER, SPRING, SUMMER, AUTUMN): ");
        String input = scanner.nextLine();
        Season season = Season.valueOf(input);

        System.out.println("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        Faculty faculty = new Faculty(name, numberOfStudents, season);
        faculty.printInfo();
    }
}
