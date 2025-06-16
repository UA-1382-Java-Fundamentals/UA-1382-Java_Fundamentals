package com.softserve.academy.edu1.Hw11.hw3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students, int numCourse) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Students of course " + numCourse + ":\n");
        while (iterator.hasNext()) {
            Student cor = iterator.next();
            if(cor.getCourse() == numCourse) {
                System.out.println(cor.getName() + " " + cor.getCourse());
            }
        }
    }
    public static Comparator<Student> comparatorName= new Comparator<Student>() {
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    };
    public static Comparator<Student> comparatorCourse= new Comparator<Student>() {
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getCourse(),s2.getCourse());
        }
    };

    @Override
    public String toString() {
        return "Student: name=" + name + ", course=" + course ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
}
