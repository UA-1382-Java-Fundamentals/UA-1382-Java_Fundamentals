package com.softserve.academy.homework4.Task5;

public class Faculty {
    String name;
    int numberOfStudents;
    Season season;

    public Faculty(String name, int numberOfStudents, Season season) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    public void printDetails() {
        System.out.println("Faculty: " + name);
        System.out.println("Number of students: " + numberOfStudents);
        System.out.println("Season: " + season.getEnglishName());
        System.out.println("Academic Period: " + season.getAcademicPeriod());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
