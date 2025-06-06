package com.softserve.academy.edu11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Student3> student3s = new ArrayList<>();

        student3s.add(new Student3("Jason", 2));
        student3s.add(new Student3("Nick", 3));
        student3s.add(new Student3("Bob", 2));
        student3s.add(new Student3("John", 1));
        student3s.add(new Student3("Gordon", 3));

        Student3.printStudents(student3s, 1);

        Collections.sort(student3s, Student3.compareByName());
        System.out.println("Students that are sorted by name:");
        for (Student3 s : student3s) {
            System.out.println(s.getName() + " - Course " + s.getCourse());
        }
        Collections.sort(student3s, Student3.compareByCourseThenName());
        System.out.println("Students that are sorted by course:");
        for (Student3 s : student3s) {
            System.out.println(s.getName() + " - Course " + s.getCourse());
        }
    }
}