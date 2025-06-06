package com.softserve.academy.edu11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student3 {

    private String name;
    private int course;

    public Student3(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
    public static void printStudents(List<Student3> students, int courseNumber) {
        Iterator<Student3> iterator = students.iterator();
        System.out.println("Students in course: " + courseNumber);
        while (iterator.hasNext()) {
            Student3 s = iterator.next();
            if (s.getCourse() == courseNumber) {
                System.out.println(s.getName());
            }
        }
    }
    public static Comparator<Student3> compareByName() {
        return Comparator.comparing(Student3::getName);
    }
 public static Comparator<Student3> compareByCourseThenName() {
        return Comparator.comparingInt(Student3::getCourse)
                .thenComparing((Student3::getName));
 }
}