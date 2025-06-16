package com.softserve.academy.edu1.Hw11.hw3;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> student = new LinkedList<Student>();
        student.add(new Student("Oleh", 2));
        student.add(new Student("Pavlo", 3));
        student.add(new Student("Oatap", 2));
        student.add(new Student("Ivan", 4));
        student.add(new Student("Anna", 1));
        student.add(new Student("Tonya", 2));
        student.add(new Student("Sanya", 3));

        Student.printStudents(student, 2);

        System.out.println("Before Compare Course");
        for (Student s : student) {
            System.out.println(s.toString());
        }
        System.out.println("=".repeat(25));
        student.sort(Student.comparatorCourse);

        System.out.println("After Compare Course");
        for (Student s : student) {
            System.out.println(s.toString());
        }
        System.out.println("=".repeat(25));

        System.out.println("=".repeat(35));

        System.out.println("Before Compare Name");
        for (Student s : student) {
            System.out.println(s.toString());
        }
        System.out.println("=".repeat(25));
        student.sort(Student.comparatorName);

        System.out.println("After Compare Name");
        for (Student s : student) {
            System.out.println(s.toString());
        }
        System.out.println("=".repeat(25));

    }}
