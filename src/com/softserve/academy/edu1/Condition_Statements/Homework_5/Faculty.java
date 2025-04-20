package com.softserve.academy.edu1.Condition_Statements.Homework_5;

public class Faculty {
    private String name;
    private int numberOfStudents;
    private Season season;

    public Faculty(String name, int numberOfStudents, Season season) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }
    public void printInfo() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Season: " + season.getEnglishName());
        System.out.println("Academic Period: " + season.getAcademicPeriod());
    }
}
