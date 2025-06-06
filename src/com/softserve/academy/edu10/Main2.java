package com.softserve.academy.edu10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        //Creating a list
        List<Student2> students = new ArrayList<>();

        //Students' data
        students.add(new Student2("Bob","1",1, List.of(4, 3, 5)));
        students.add(new Student2("Jason", "1", 1, List.of(2, 2, 2)));
        students.add(new Student2("John", "2", 2, List.of(1, 2, 3)));
        students.add(new Student2("Mark", "2", 2, List.of(5, 4, 3)));

        System.out.println("Before analyzing: ");
        for (Student2 student : students) {
            System.out.println(student.getName() + "'s average grade is " + student.getAverageGrade() + ", course " + student.getCourse());
        }

        //Removing students with the grade lower than 3.0
analyzeStudents(students);

        System.out.println("After analyzing:");
        for (Student2 student : students) {
            System.out.println(student.getName() + "'s average grade is " + student.getAverageGrade() + ", course " + student.getCourse());
        }

        System.out.println();
        printStudents(students, 2);
        printStudents(students, 3);
    }

    public static void analyzeStudents(List<Student2> students) {
        Iterator<Student2> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student2 student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove(); //Remove students
            } else {
                student.promote(); //Promote students
            }
        }
    }

    public static void printStudents(List<Student2> students, int course) {
        System.out.println("Students that are in course " + course + ":");
        for (Student2 student : students) {
            if (student.getCourse() == course) {

                System.out.println(student.getName());
            }
        }
    }
}