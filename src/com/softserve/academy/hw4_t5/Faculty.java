package com.softserve.academy.hw4_t5;

import java.util.Scanner;

public class Faculty {
    private String name;
    private int numberOfStudents;
    private String facultyName;
    private String facultySemester;

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

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultySemester() {
        return facultySemester;
    }

    public void setFacultySemester(String facultySemester) {
        this.facultySemester = facultySemester;
    }

    public enum Season {
        WINTER("Winter Exam Session"),
        SPRING("Second Semester"),
        SUMMER("Summer Break"),
        AUTUMN("First Semester");

        private final String semester;

        Season(String semester) {
            this.semester = semester;
        }

        public String getSemester() {
            return semester;
        }
    }

    Faculty() {

    }

    public String input(String name) {
        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    void output(String text, String value) {
        System.out.println(text + value);
    }

    void output(String text, int value) {
        System.out.println(text + value);
    }

    public static Faculty getInfo() {
        Faculty faculty = new Faculty();

        faculty.setName(faculty.input("Enter name"));
        faculty.setNumberOfStudents(Integer.parseInt(faculty.input("Enter number of students")));
        faculty.setFacultyName(faculty.input("Enter season"));
        Season.valueOf(faculty.facultyName);

        faculty.output("Name: ", faculty.getName());
        faculty.output("Number of students: ", faculty.getNumberOfStudents());
        faculty.output("Season: ", faculty.getFacultyName());

        return faculty;
    }



}
