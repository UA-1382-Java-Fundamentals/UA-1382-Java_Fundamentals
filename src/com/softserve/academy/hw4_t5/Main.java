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

public class Main {
    public static void main(String[] args) {
        Faculty[] faculties = {
                Faculty.getFacultyFromConsole(),
                Faculty.getFacultyFromConsole()
        };

        for (Faculty faculty : faculties) {
            faculty.printInfo("Faculty name: ", faculty.getName());
            faculty.printInfo("Number of students: ", String.valueOf(faculty.getNumberOfStudents()));
            faculty.printInfo("Season: ", String.valueOf(faculty.getSeason()));
            faculty.printInfo("Academic period: ", String.valueOf(faculty.getSeason().getAcademicPeriod()));
        }
    }
}
