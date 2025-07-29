package com.softserve.academy.homework11.Task3;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student implements Comparable<Student> {
    private String name;
    private Integer course;

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students, Integer course){
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getCourse().equals(course)){
                System.out.println(student);
            }
        }
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
