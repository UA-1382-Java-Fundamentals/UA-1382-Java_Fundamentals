package com.softserve.academy.edu1.Collections_Part_1.Homework_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ivan", "1b", 1, Arrays.asList(3.0, 4.0, 5.0)));
        students.add(new Student("Nazar", "2b", 3, Arrays.asList(4.1, 3.0, 1.0)));
        students.add(new Student("Stas", "5a", 5, Arrays.asList(4.1, 3.1, 0.0)));
        students.add(new Student("Vova", "3b", 2, Arrays.asList(2.1, 3.5, 1.0)));

        System.out.println("Before filtering:");
        students.forEach(System.out::println);

        filterStudents(students);

        System.out.println("After filtering and promoting:");
        students.forEach(System.out::println);

        System.out.println("Students on course 4:");
        printStudentsByCourse(students, 4);
    }

    public static void filterStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getAverageGrade() < 3.0) {
                iterator.remove();
            } else {
                s.increaseCourse();
            }
        }
    }

    public static void printStudentsByCourse(List<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s);
            }
        }
    }
}