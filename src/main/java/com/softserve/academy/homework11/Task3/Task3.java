package com.softserve.academy.homework11.Task3;

import java.util.ArrayList;
import java.util.List;

import static com.softserve.academy.homework11.Task3.Student.*;

public class Task3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 12));
        students.add(new Student("Kate", 13));
        students.add(new Student("Alex", 11));
        students.add(new Student("Vladimir", 10));
        students.add(new Student("Ivan", 14));

        printStudents(students, 10);
        students.sort(compareByCourse());
        System.out.println(students);

        students.sort(compareByName());
        System.out.println(students);
    }
}
