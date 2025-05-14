package com.softserve.academy.edu1.Collection_Part_2;

import java.util.*;

class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int courseNumber) {
        System.out.println("Students from course " + courseNumber + ":");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getCourse() == courseNumber) {
                System.out.println(s.getName());
            }
        }
    }

    @Override
    public String toString() {
        return name + " (Course " + course + ")";
    }
}
