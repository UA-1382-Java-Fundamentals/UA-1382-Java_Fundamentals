package homework4.Faculty;

//5*. Design a program that models academic activity at a university faculty depending on the season. You need to create a class named Faculty
//        with the fields: name (the name of the faculty), numberOfStudents (an integer), and season (an instance of an enum called Season).
//
//Define an enum Season with the values: WINTER, SPRING, SUMMER, and AUTUMN.
//Each enum constant should store two values: the English name of the season (e.g., "Winter") and the academic period it represents.
//The academic periods should be defined as follows:
//
//WINTER → "Winter Exam Session"
//SPRING → "Second Semester"
//SUMMER → "Summer Break"
//AUTUMN → "First Semester“
//
//In the main() method, prompt the user to input the faculty name, the number of students, and the current season (e.g., by typing SPRING).
//Then create an instance of the Faculty class and display its details: the faculty name, the number of students, the season’s English name, and the corresponding academic period.
//This task helps practice working with enums, constructors, user input using Scanner, and basic object-oriented design.

enum Season {
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

public class Faculty {
    private String name;
    private int numberOfStudents;
    private Season season;

    public Faculty(String name, int numberOfStudents, Season season) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.season = season;
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

    @Override
    public String toString() {
        return "Faculty " +
                "name is: '" + name + '\'' + "\n" +
                "NumberOfStudents: " + numberOfStudents + "\n" +
                "Season: " + season + "\n" +
                "Season academic period: '" + season.getAcademicPeriod() + '\'' +
                '}';
    }
}

