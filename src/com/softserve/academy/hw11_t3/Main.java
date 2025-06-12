/*
Create a class named Student that stores information about the student's name and
course.
    • The class should include properties to access these fields, a constructor with
    parameters, and a method called printStudents that takes a List of students and an
    Integer representing the course number as arguments.
    • This method should print the names of the students from the list who are enrolled in
    the specified course to the console using an iterator.
    • Additionally, add methods to compare students by name and by course.
    • In the main() method, create a List named "students" and add five different Student
    objects to it. Then, display the list of students sorted by name and sorted by course.
 */

package com.softserve.academy.hw11_t3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int course = 3;
        List<Student> students = new ArrayList<>();
        students.add(0, new Student("Lucie", 1));
        students.add(1, new Student("Angie", 5));
        students.add(2, new Student("Luca", 3));
        students.add(3, new Student("Lucie", 4));
        students.add(4, new Student("Mike", 3));

        System.out.println("The list of students with a course " + course + ":");
        Student.printStudents(students, course);

        System.out.println("\nThe list of students sorted by name:");
        Student.sortByName(students);
        Student.printAllStudents(students);

        System.out.println("\nThe list of students sorted by course:");
        Student.sortByCourse(students);
        Student.printAllStudents(students);
    }
}
