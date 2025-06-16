package com.softserve.academy.edu1.Hw10.hw2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student olehVlas = new Student("Oleh","IT-22",2);
        Student victor= new Student("Victor","IT-22",3);
        Student pasovka= new Student("Pasovka","IT-22",4);
        olehVlas.fill();
        victor.fill();
        pasovka.fill();
        students.add(olehVlas);
        students.add(victor);
        students.add(pasovka);

        System.out.println("Before processing:");
        printAllStudents(students);

        nextCourseChecking(students);

        System.out.println("\nAfter processing:");
        printAllStudents(students);

    }
    public static void nextCourseChecking(List<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            double average = student.grades.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0);

            if (average < 3.0) {
                System.out.println(student.name + " is removed (avg = " + average + ")");
                iterator.remove();
            } else {
                student.course++;
                System.out.println(student.name + " promoted to course " + student.course + " (avg = " + average + ")");
            }
        }
    }
    public static void printStudents(List<Student> students, int course) {
        for (Student s : students) {
            if (s.course == course) {
                System.out.println(s.name);
            }
        }
    }

    public static void printAllStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println(s.name + " | Group: " + s.group + " | Course: " + s.course + " | Grades: " + s.grades);
        }
    }
}
