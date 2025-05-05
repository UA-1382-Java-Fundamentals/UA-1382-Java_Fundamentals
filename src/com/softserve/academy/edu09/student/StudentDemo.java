package com.softserve.academy.edu09.student;

import java.util.Arrays;
import java.util.Comparator;

public class StudentDemo {

    public static void main(String[] args) {
        // Create an array of Student objects with different names and ages
        Student[] students = {new Student("Alice", 22),
                new Student("Bob", 20),
                new Student("Charlie", 23),
                new Student("David", 21),
                new Student("Charlie", 22)};

        // Print the unsorted array of students
        System.out.println("Unsorted students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort the array using an anonymous implementation of Comparator
        // This demonstrates how to use anonymous classes to implement interfaces
        Arrays.sort(students, new Comparator<Student>() {
            /**
             * Compares two Student objects for order.
             * First compares by name, and if names are equal, compares by age.
             * 
             * @param s1 The first Student to compare
             * @param s2 The second Student to compare
             * @return A negative integer, zero, or a positive integer as the first argument
             *         is less than, equal to, or greater than the second
             */
            @Override
            public int compare(Student s1, Student s2) {
                // Compare by name first
                int nameComparison = s1.getName().compareTo(s2.getName());
                if (nameComparison != 0) {
                    return nameComparison;
                }
                // If names are the same, compare by age
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });

        System.out.println("Sorted students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
