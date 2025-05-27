package com.softserve.academy.hw10_t2;

import java.util.List;

public class Student {
    private final String name;
    private final int group;
    private int course;
    private final List<Integer> grades;

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, int group, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                ", Group: " + group +
                ", Course: " + course +
                ", Grades: " + grades;
    }


}