package com.softserve.academy.hw4_t5;

public class Faculty {
    private final String name;
    private final int numberOfStudents;
    private final Season season;

    public Faculty(String name, int numberOfStudents, Season season) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    public void printInfo() {
        System.out.println("Faculty name: " + name);
        System.out.println("Number of students: " + numberOfStudents);
        System.out.println("Season: " + season.getName());
        System.out.println("Academic period: " + season.getAcademicPeriod());
    }
}
