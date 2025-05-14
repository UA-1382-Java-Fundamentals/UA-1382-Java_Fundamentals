package com.softserve.academy.edu1.Collection_Part_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan Petrenko", 1));
        students.add(new Student("Olha Shevchenko", 2));
        students.add(new Student("Maksym Bondar", 3));
        students.add(new Student("Natalia Kravets", 1));
        students.add(new Student("Yurii Melnyk", 2));

        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Sorted by name:");
        students.forEach(System.out::println);

        students.sort(Comparator.comparingInt(Student::getCourse));
        System.out.println("\nSorted by course:");
        students.forEach(System.out::println);

        Student.printStudents(students, 2);
    }
}