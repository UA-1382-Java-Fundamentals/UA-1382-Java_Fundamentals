package com.softserve.academy.hw4_t5;

public enum Season {
    WINTER("Winter", "Winter Exam Session"),
    SPRING("Spring", "Second Semester"),
    SUMMER("Summer", "Summer Break"),
    AUTUMN("Autumn", "First Semester");

    private final String name;
    private final String academicPeriod;

    Season(String name, String academicPeriod) {
        this.name = name;
        this.academicPeriod = academicPeriod;
    }

    public String getName() {
        return name;
    }

    public String getAcademicPeriod() {
        return academicPeriod;
    }
}
