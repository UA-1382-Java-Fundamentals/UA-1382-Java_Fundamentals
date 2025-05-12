package com.softserve.academy.edu1.Collections_Part_1.Homework_2;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> grades;

    public Student(String name, String group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void increaseCourse() {
        course++;
    }

    public double getAverageGrade() {
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return name + " (" + group + "), course: " + course + ", avg grade: " + String.format("%.2f", getAverageGrade());
    }
}