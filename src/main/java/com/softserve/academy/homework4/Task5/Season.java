package com.softserve.academy.homework4.Task5;

public enum Season {
    WINTER("Winter", "Winter Exam Session"),
    SPRING("Spring", "Second Semester"),
    SUMMER("Summer", "Summer Break"),
    AUTUMN("Autumn", "First Semester");

    private final String englishName;
    public final String academicPeriod;

    Season(String englishName, String academicPeriod) {
        this.englishName = englishName;
        this.academicPeriod = academicPeriod;
    }

    public static Season getSeason(String input) {
        for (Season s : Season.values()) {
            if (s.name().equalsIgnoreCase(input)) {
                return s;
            }
        }
        return null;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getAcademicPeriod() {
        return academicPeriod;
    }
}
