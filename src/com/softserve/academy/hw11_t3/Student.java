package com.softserve.academy.hw11_t3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private final String name;
    private final int course;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Course: " + course;
    }

    // prints students with a defined course. Name of method is according to the task
    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            Student student = it.next();
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public static void sortByName (List<Student> students) {
        students.sort(new Comparator<>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
    }

    public static void sortByCourse (List<Student> students) {
        students.sort(new Comparator<>() {
            @Override
            public int compare(Student s1, Student s2) {
                int comparison = Integer.compare(s1.getCourse(), s2.getCourse());
                if (comparison == 0) {
                    return s1.getName().compareTo(s2.getName());
                } else {
                    return comparison;
                }
            }
        });
    }

    public static void printAllStudents(List<Student> students) {
        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
