package com.softserve.academy.edu4;

public class Faculty5 {
    enum Season {
        WINTER("Winter", "Winter Exam Session"),
        SPRING("Spring", "Second Semester"),
        SUMMER("Summer", "Summer Break"),
        AUTUMN("Autumn", "First Semester");

                private final String englishName;
        private final String academicPeriod;

        Season(String englishName, String academicPeriod) {
            this.englishName = englishName;
            this.academicPeriod = academicPeriod;
        }
    public String getEnglishName() {
        return englishName;
    }
    public String getAcademicPeriod() {
        return academicPeriod;
    }
}
}
class Faculty {
    private String name;
    private int numOfStudents;
    private Faculty5.Season season;

    public Faculty(String name, int numOfStudents, Faculty5.Season season) {
        this.name = name;
        this.numOfStudents = numOfStudents;
        this.season = season;
    }
    public void displayDetails() {
        System.out.println("Faculty name: " + name);
        System.out.println("Number of students: " + numOfStudents);
        System.out.println("Season: " + season.getEnglishName());
        System.out.println("Academic period: " + season.getAcademicPeriod());
    }
}